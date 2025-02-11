# Trophy Java SDK

The Trophy Java SDK provides convenient access to the Trophy API from applications written in Java.

Trophy provides APIs and tools for adding gamification to your application, keeping users engaged 
through rewards, achievements, streaks, and personalized communication.

## Installation

### Gradle

Add the following dependency to your `build.gradle` file:

```groovy
implementation 'so.trophy:trophy-java:1.0.0'
```

### Maven

Add the following dependency to your `pom.xml` file:

```xml
<dependency>
  <groupId>so.trophy</groupId>
  <artifactId>trophy-java</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Usage

The package needs to be configured with your account's API key which is available in the Trophy
dashboard.

```java
import so.trophy.*;
import so.trophy.resources.metrics.requests.MetricsEventRequest;
import so.trophy.types.EventRequestUser;
import so.trophy.types.EventResponse;

public class Main {
  public static void main(String[] args) {
    // Create a new trophy client
    TrophyApiClient client = TrophyApiClient.builder()
      .apiKey("YOUR_API_KEY")
      .build();

    // Create a new event request
    MetricsEventRequest request = MetricsEventRequest.builder()
      .user(
        EventRequestUser.builder()
          .id("USER_ID")
          .email("jk.rowling@harrypotter.com")
          .build()
      )
      .value(750)
      .build();

    // Send the event request and log the created event ID
    EventResponse response = client.metrics().event("words-written", request);
    System.out.println(response.getEventId());
  }
}

```

## Documentation

See the [Trophy API Docs](https://trophy.docs.buildwithfern.com/overview/introduction) for more
information on the accessible endpoints.

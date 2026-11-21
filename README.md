# Trophy Java SDK

The Trophy Java SDK provides convenient access to the Trophy API from applications written in Java.

Trophy is the 1:1 customer engagement platform for consumer web and mobile apps. AI lifecycle
marketing agents write and send personalized email and push to every user, alongside in-app
experiences like milestones, streaks, points, and leaderboards. This library gives your app access
to the Trophy API, so you can send the user events that power both.

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

See the [Trophy API Docs](https://docs.trophy.so) for more
information on the accessible endpoints.

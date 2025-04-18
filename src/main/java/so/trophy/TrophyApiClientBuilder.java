package so.trophy;

/**
 * This file was auto-generated by Fern from our API Definition.
 */

import so.trophy.core.ClientOptions;
import so.trophy.core.Environment;
import java.lang.String;

public final class TrophyApiClientBuilder {
  private ClientOptions.Builder clientOptionsBuilder = ClientOptions.builder();

  private String apiKey = null;

  private Environment environment = Environment.DEFAULT;

  /**
   * Sets apiKey
   */
  public TrophyApiClientBuilder apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  public TrophyApiClientBuilder environment(Environment environment) {
    this.environment = environment;
    return this;
  }

  public TrophyApiClientBuilder url(String url) {
    this.environment = Environment.custom(url);
    return this;
  }

  /**
   * Sets the timeout (in seconds) for the client
   */
  public TrophyApiClientBuilder timeout(int timeout) {
    this.clientOptionsBuilder.timeout(timeout);
    return this;
  }

  public TrophyApiClient build() {
    if (apiKey == null) {
      throw new RuntimeException("Please provide apiKey");
    }
    this.clientOptionsBuilder.addHeader("X-API-KEY", this.apiKey);
    clientOptionsBuilder.environment(this.environment);
    return new TrophyApiClient(clientOptionsBuilder.build());
  }
}

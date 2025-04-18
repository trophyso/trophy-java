package so.trophy.types;

/**
 * This file was auto-generated by Fern from our API Definition.
 */


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import so.trophy.core.ObjectMappers;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(
    builder = UpsertedUser.Builder.class
)
public final class UpsertedUser implements IUpsertedUser, IUpdatedUser {
  private final String id;

  private final Optional<String> email;

  private final Optional<String> name;

  private final Optional<String> tz;

  private final Optional<Boolean> subscribeToEmails;

  private final Map<String, Object> additionalProperties;

  private UpsertedUser(String id, Optional<String> email, Optional<String> name,
      Optional<String> tz, Optional<Boolean> subscribeToEmails,
      Map<String, Object> additionalProperties) {
    this.id = id;
    this.email = email;
    this.name = name;
    this.tz = tz;
    this.subscribeToEmails = subscribeToEmails;
    this.additionalProperties = additionalProperties;
  }

  /**
   * @return The ID of the user in your database. Must be a string.
   */
  @JsonProperty("id")
  @java.lang.Override
  public String getId() {
    return id;
  }

  /**
   * @return The user's email address. Required if subscribeToEmails is true.
   */
  @JsonProperty("email")
  @java.lang.Override
  public Optional<String> getEmail() {
    return email;
  }

  /**
   * @return The name to refer to the user by in emails.
   */
  @JsonProperty("name")
  @java.lang.Override
  public Optional<String> getName() {
    return name;
  }

  /**
   * @return The user's timezone (used for email scheduling).
   */
  @JsonProperty("tz")
  @java.lang.Override
  public Optional<String> getTz() {
    return tz;
  }

  /**
   * @return Whether the user should receive Trophy-powered emails. Cannot be false if an email is provided.
   */
  @JsonProperty("subscribeToEmails")
  @java.lang.Override
  public Optional<Boolean> getSubscribeToEmails() {
    return subscribeToEmails;
  }

  @java.lang.Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof UpsertedUser && equalTo((UpsertedUser) other);
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  private boolean equalTo(UpsertedUser other) {
    return id.equals(other.id) && email.equals(other.email) && name.equals(other.name) && tz.equals(other.tz) && subscribeToEmails.equals(other.subscribeToEmails);
  }

  @java.lang.Override
  public int hashCode() {
    return Objects.hash(this.id, this.email, this.name, this.tz, this.subscribeToEmails);
  }

  @java.lang.Override
  public String toString() {
    return ObjectMappers.stringify(this);
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    _FinalStage id(@NotNull String id);

    Builder from(UpsertedUser other);
  }

  public interface _FinalStage {
    UpsertedUser build();

    _FinalStage email(Optional<String> email);

    _FinalStage email(String email);

    _FinalStage name(Optional<String> name);

    _FinalStage name(String name);

    _FinalStage tz(Optional<String> tz);

    _FinalStage tz(String tz);

    _FinalStage subscribeToEmails(Optional<Boolean> subscribeToEmails);

    _FinalStage subscribeToEmails(Boolean subscribeToEmails);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, _FinalStage {
    private String id;

    private Optional<Boolean> subscribeToEmails = Optional.empty();

    private Optional<String> tz = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> email = Optional.empty();

    @JsonAnySetter
    private Map<String, Object> additionalProperties = new HashMap<>();

    private Builder() {
    }

    @java.lang.Override
    public Builder from(UpsertedUser other) {
      id(other.getId());
      email(other.getEmail());
      name(other.getName());
      tz(other.getTz());
      subscribeToEmails(other.getSubscribeToEmails());
      return this;
    }

    /**
     * <p>The ID of the user in your database. Must be a string.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    @JsonSetter("id")
    public _FinalStage id(@NotNull String id) {
      this.id = Objects.requireNonNull(id, "id must not be null");
      return this;
    }

    /**
     * <p>Whether the user should receive Trophy-powered emails. Cannot be false if an email is provided.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    public _FinalStage subscribeToEmails(Boolean subscribeToEmails) {
      this.subscribeToEmails = Optional.ofNullable(subscribeToEmails);
      return this;
    }

    @java.lang.Override
    @JsonSetter(
        value = "subscribeToEmails",
        nulls = Nulls.SKIP
    )
    public _FinalStage subscribeToEmails(Optional<Boolean> subscribeToEmails) {
      this.subscribeToEmails = subscribeToEmails;
      return this;
    }

    /**
     * <p>The user's timezone (used for email scheduling).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    public _FinalStage tz(String tz) {
      this.tz = Optional.ofNullable(tz);
      return this;
    }

    @java.lang.Override
    @JsonSetter(
        value = "tz",
        nulls = Nulls.SKIP
    )
    public _FinalStage tz(Optional<String> tz) {
      this.tz = tz;
      return this;
    }

    /**
     * <p>The name to refer to the user by in emails.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    public _FinalStage name(String name) {
      this.name = Optional.ofNullable(name);
      return this;
    }

    @java.lang.Override
    @JsonSetter(
        value = "name",
        nulls = Nulls.SKIP
    )
    public _FinalStage name(Optional<String> name) {
      this.name = name;
      return this;
    }

    /**
     * <p>The user's email address. Required if subscribeToEmails is true.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    public _FinalStage email(String email) {
      this.email = Optional.ofNullable(email);
      return this;
    }

    @java.lang.Override
    @JsonSetter(
        value = "email",
        nulls = Nulls.SKIP
    )
    public _FinalStage email(Optional<String> email) {
      this.email = email;
      return this;
    }

    @java.lang.Override
    public UpsertedUser build() {
      return new UpsertedUser(id, email, name, tz, subscribeToEmails, additionalProperties);
    }
  }
}

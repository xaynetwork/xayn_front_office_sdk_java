/*
 * Front Office API
 * # Front Office The front office is typically used within front-end apps, for example a website or a mobile application. With this SDK, you can handle interactions with documents and request a list of personalized documents.  ## User Each method requires a `user_id`. From our perspective, a `user_id` is simply required to group interactions together. We don't need to know who that user is, so it is preferred to create this `user_id` in a privacy-preserving way. For example, create a hash method which transforms your user into an ID hash.  ## Document A document here is represented by its `id` and optional `properties`. In order to display a document in an interface, it's preferred to use `properties`, which is an arbitrary collection of values. For example, it could contain an image url, a full article url, the publication date, the author or much more. The properties that were added when the document was submitted to us, are just mirrored here.  ## Auth The API requires an authenticationToken when used. Please see further down in this README.md file, or refer to the test included in this SDK's codebase, on how to set this token correctly. \\
 *
 * The version of the OpenAPI document: 1.0.0-rc10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xayn.frontoffice.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.xayn.frontoffice.models.InputDocument;
import com.xayn.frontoffice.models.SemanticSearchRequestPersonalize;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.xayn.frontoffice.JSON;

/**
 * SemanticSearchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-07T13:31:17.563189Z[Etc/UTC]")
public class SemanticSearchRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private InputDocument document;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count = 10;

  public static final String SERIALIZED_NAME_PUBLISHED_AFTER = "published_after";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_AFTER)
  private OffsetDateTime publishedAfter;

  public static final String SERIALIZED_NAME_MIN_SIMILARITY = "min_similarity";
  @SerializedName(SERIALIZED_NAME_MIN_SIMILARITY)
  private Float minSimilarity = 0f;

  public static final String SERIALIZED_NAME_PERSONALIZE = "personalize";
  @SerializedName(SERIALIZED_NAME_PERSONALIZE)
  private SemanticSearchRequestPersonalize personalize;

  public SemanticSearchRequest() {
  }

  public SemanticSearchRequest document(InputDocument document) {
    
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @javax.annotation.Nonnull

  public InputDocument getDocument() {
    return document;
  }


  public void setDocument(InputDocument document) {
    this.document = document;
  }


  public SemanticSearchRequest count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * minimum: 1
   * maximum: 100
   * @return count
  **/
  @javax.annotation.Nullable

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public SemanticSearchRequest publishedAfter(OffsetDateTime publishedAfter) {
    
    this.publishedAfter = publishedAfter;
    return this;
  }

   /**
   * A RFC3339 compatible date-time  - can be in the future - will be converted to and then stored as UTC - sub-second resolution is not guaranteed. - while &#x60;properties.publication_date&#x60; is in the future the document will not be   returned for personalized documents, once it is no longer in the future it will   automatically be considered for personalization from then on 
   * @return publishedAfter
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getPublishedAfter() {
    return publishedAfter;
  }


  public void setPublishedAfter(OffsetDateTime publishedAfter) {
    this.publishedAfter = publishedAfter;
  }


  public SemanticSearchRequest minSimilarity(Float minSimilarity) {
    
    this.minSimilarity = minSimilarity;
    return this;
  }

   /**
   * Minimal similarity of a document to consider it as search candidate.
   * minimum: 0
   * maximum: 1
   * @return minSimilarity
  **/
  @javax.annotation.Nullable

  public Float getMinSimilarity() {
    return minSimilarity;
  }


  public void setMinSimilarity(Float minSimilarity) {
    this.minSimilarity = minSimilarity;
  }


  public SemanticSearchRequest personalize(SemanticSearchRequestPersonalize personalize) {
    
    this.personalize = personalize;
    return this;
  }

   /**
   * Get personalize
   * @return personalize
  **/
  @javax.annotation.Nullable

  public SemanticSearchRequestPersonalize getPersonalize() {
    return personalize;
  }


  public void setPersonalize(SemanticSearchRequestPersonalize personalize) {
    this.personalize = personalize;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SemanticSearchRequest instance itself
   */
  public SemanticSearchRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SemanticSearchRequest semanticSearchRequest = (SemanticSearchRequest) o;
    return Objects.equals(this.document, semanticSearchRequest.document) &&
        Objects.equals(this.count, semanticSearchRequest.count) &&
        Objects.equals(this.publishedAfter, semanticSearchRequest.publishedAfter) &&
        Objects.equals(this.minSimilarity, semanticSearchRequest.minSimilarity) &&
        Objects.equals(this.personalize, semanticSearchRequest.personalize)&&
        Objects.equals(this.additionalProperties, semanticSearchRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, count, publishedAfter, minSimilarity, personalize, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SemanticSearchRequest {\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    publishedAfter: ").append(toIndentedString(publishedAfter)).append("\n");
    sb.append("    minSimilarity: ").append(toIndentedString(minSimilarity)).append("\n");
    sb.append("    personalize: ").append(toIndentedString(personalize)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("document");
    openapiFields.add("count");
    openapiFields.add("published_after");
    openapiFields.add("min_similarity");
    openapiFields.add("personalize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("document");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SemanticSearchRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SemanticSearchRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SemanticSearchRequest is not found in the empty JSON string", SemanticSearchRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SemanticSearchRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `document`
      InputDocument.validateJsonObject(jsonObj.getAsJsonObject("document"));
      // validate the optional field `personalize`
      if (jsonObj.get("personalize") != null && !jsonObj.get("personalize").isJsonNull()) {
        SemanticSearchRequestPersonalize.validateJsonObject(jsonObj.getAsJsonObject("personalize"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SemanticSearchRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SemanticSearchRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SemanticSearchRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SemanticSearchRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SemanticSearchRequest>() {
           @Override
           public void write(JsonWriter out, SemanticSearchRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SemanticSearchRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SemanticSearchRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SemanticSearchRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SemanticSearchRequest
  * @throws IOException if the JSON string is invalid with respect to SemanticSearchRequest
  */
  public static SemanticSearchRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SemanticSearchRequest.class);
  }

 /**
  * Convert an instance of SemanticSearchRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


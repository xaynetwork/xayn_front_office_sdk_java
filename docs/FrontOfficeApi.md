# FrontOfficeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**documentInteraction**](FrontOfficeApi.md#documentInteraction) | **PATCH** /users/{user_id}/interactions | Add interaction between a user and a document |
| [**getPersonalizedDocuments**](FrontOfficeApi.md#getPersonalizedDocuments) | **GET** /users/{user_id}/personalized_documents | Get personalized documents for the user |


<a name="documentInteraction"></a>
# **documentInteraction**
> documentInteraction(userId, userInteractionRequest)

Add interaction between a user and a document

The interaction is used to provide personalized documents to the user.

### Example
```java
// Import classes:
import com.xayn.frontoffice.ApiClient;
import com.xayn.frontoffice.ApiException;
import com.xayn.frontoffice.Configuration;
import com.xayn.frontoffice.auth.*;
import com.xayn.frontoffice.models.*;
import com.xayn.frontoffice.FrontOfficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FrontOfficeApi apiInstance = new FrontOfficeApi(defaultClient);
    String userId = "userId_example"; // String | Id of the user
    UserInteractionRequest userInteractionRequest = new UserInteractionRequest(); // UserInteractionRequest | 
    try {
      apiInstance.documentInteraction(userId, userInteractionRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling FrontOfficeApi#documentInteraction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| Id of the user | |
| **userInteractionRequest** | [**UserInteractionRequest**](UserInteractionRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation |  -  |
| **400** | invalid request. User or document id is invalid |  -  |

<a name="getPersonalizedDocuments"></a>
# **getPersonalizedDocuments**
> PersonalizedDocumentsResponse getPersonalizedDocuments(userId, count)

Get personalized documents for the user

Returns a list of documents personalized for the given &#x60;user_id&#x60;. Each document contains the id, the score and the properties that are attached to the document. The score is a value between 0 and 1 where a higher value means that the document matches the preferences of the user better.

### Example
```java
// Import classes:
import com.xayn.frontoffice.ApiClient;
import com.xayn.frontoffice.ApiException;
import com.xayn.frontoffice.Configuration;
import com.xayn.frontoffice.auth.*;
import com.xayn.frontoffice.models.*;
import com.xayn.frontoffice.FrontOfficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FrontOfficeApi apiInstance = new FrontOfficeApi(defaultClient);
    String userId = "userId_example"; // String | Id of the user
    Integer count = 10; // Integer | Maximum number of personalized documents to return
    try {
      PersonalizedDocumentsResponse result = apiInstance.getPersonalizedDocuments(userId, count);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FrontOfficeApi#getPersonalizedDocuments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| Id of the user | |
| **count** | **Integer**| Maximum number of personalized documents to return | [optional] [default to 10] |

### Return type

[**PersonalizedDocumentsResponse**](PersonalizedDocumentsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | invalid user id. |  -  |
| **404** | user not found. |  -  |
| **422** | impossible to create a personalized list for the user. |  -  |


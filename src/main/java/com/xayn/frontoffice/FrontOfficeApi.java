/*
 * Front Office API
 * # Front Office The front office is typically used within front-end apps, for example a website or a mobile application. With this SDK, you can handle interactions with documents and request a list of personalized documents.  ## User Each method requires a `user_id`. From our perspective, a `user_id` is simply required to group interactions together. We don't need to know who that user is, so it is preferred to create this `user_id` in a privacy-preserving way. For example, create a hash method which transforms your user into an ID hash.  ## Document A document here is represented by its `id` and optional `properties`. In order to display a document in an interface, it's preferred to use `properties`, which is an arbitrary collection of values. For example, it could contain an image url, a full article url, the publication date, the author or much more. The properties that were added when the document was submitted to us, are just mirrored here.  ## Auth The API requires an authenticationToken when used. Please see further down in this README.md file, or refer to the test included in this SDK's codebase, on how to set this token correctly. \\
 *
 * The version of the OpenAPI document: 1.0.0-rc6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xayn.frontoffice;

import com.xayn.frontoffice.ApiCallback;
import com.xayn.frontoffice.ApiClient;
import com.xayn.frontoffice.ApiException;
import com.xayn.frontoffice.ApiResponse;
import com.xayn.frontoffice.Configuration;
import com.xayn.frontoffice.Pair;
import com.xayn.frontoffice.ProgressRequestBody;
import com.xayn.frontoffice.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.xayn.frontoffice.models.GenericError;
import com.xayn.frontoffice.models.PersonalizedDocumentsError;
import com.xayn.frontoffice.models.PersonalizedDocumentsResponse;
import com.xayn.frontoffice.models.UserInteractionError;
import com.xayn.frontoffice.models.UserInteractionRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class FrontOfficeApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FrontOfficeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FrontOfficeApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getPersonalizedDocuments
     * @param userId Id of the user (required)
     * @param count Maximum number of personalized documents to return (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request is invalid. Please check the path parameters, queries, and the request body. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> impossible to create a personalized list for the user. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPersonalizedDocumentsCall(String userId, Integer count, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_id}/personalized_documents"
            .replace("{" + "user_id" + "}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPersonalizedDocumentsValidateBeforeCall(String userId, Integer count, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getPersonalizedDocuments(Async)");
        }

        return getPersonalizedDocumentsCall(userId, count, _callback);

    }

    /**
     * Gets personalized documents for the user.
     * Returns a list of documents personalized for the given &#x60;user_id&#x60;. Each document contains the id, the score and the properties that are attached to the document. The score is a value between 0 and 1 where a higher value means that the document matches the preferences of the user better. Note that you can request personalized documents for a specific &#x60;user_id&#x60;, only after that same &#x60;user_id&#x60; has made at least one interaction via our system.
     * @param userId Id of the user (required)
     * @param count Maximum number of personalized documents to return (optional, default to 10)
     * @return PersonalizedDocumentsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request is invalid. Please check the path parameters, queries, and the request body. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> impossible to create a personalized list for the user. </td><td>  -  </td></tr>
     </table>
     */
    public PersonalizedDocumentsResponse getPersonalizedDocuments(String userId, Integer count) throws ApiException {
        ApiResponse<PersonalizedDocumentsResponse> localVarResp = getPersonalizedDocumentsWithHttpInfo(userId, count);
        return localVarResp.getData();
    }

    /**
     * Gets personalized documents for the user.
     * Returns a list of documents personalized for the given &#x60;user_id&#x60;. Each document contains the id, the score and the properties that are attached to the document. The score is a value between 0 and 1 where a higher value means that the document matches the preferences of the user better. Note that you can request personalized documents for a specific &#x60;user_id&#x60;, only after that same &#x60;user_id&#x60; has made at least one interaction via our system.
     * @param userId Id of the user (required)
     * @param count Maximum number of personalized documents to return (optional, default to 10)
     * @return ApiResponse&lt;PersonalizedDocumentsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request is invalid. Please check the path parameters, queries, and the request body. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> impossible to create a personalized list for the user. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PersonalizedDocumentsResponse> getPersonalizedDocumentsWithHttpInfo(String userId, Integer count) throws ApiException {
        okhttp3.Call localVarCall = getPersonalizedDocumentsValidateBeforeCall(userId, count, null);
        Type localVarReturnType = new TypeToken<PersonalizedDocumentsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Gets personalized documents for the user. (asynchronously)
     * Returns a list of documents personalized for the given &#x60;user_id&#x60;. Each document contains the id, the score and the properties that are attached to the document. The score is a value between 0 and 1 where a higher value means that the document matches the preferences of the user better. Note that you can request personalized documents for a specific &#x60;user_id&#x60;, only after that same &#x60;user_id&#x60; has made at least one interaction via our system.
     * @param userId Id of the user (required)
     * @param count Maximum number of personalized documents to return (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request is invalid. Please check the path parameters, queries, and the request body. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> impossible to create a personalized list for the user. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPersonalizedDocumentsAsync(String userId, Integer count, final ApiCallback<PersonalizedDocumentsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPersonalizedDocumentsValidateBeforeCall(userId, count, _callback);
        Type localVarReturnType = new TypeToken<PersonalizedDocumentsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateUserInteractions
     * @param userId Id of the user (required)
     * @param userInteractionRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> invalid request. User or document id is invalid </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateUserInteractionsCall(String userId, UserInteractionRequest userInteractionRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = userInteractionRequest;

        // create path and map variables
        String localVarPath = "/users/{user_id}/interactions"
            .replace("{" + "user_id" + "}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateUserInteractionsValidateBeforeCall(String userId, UserInteractionRequest userInteractionRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling updateUserInteractions(Async)");
        }

        // verify the required parameter 'userInteractionRequest' is set
        if (userInteractionRequest == null) {
            throw new ApiException("Missing the required parameter 'userInteractionRequest' when calling updateUserInteractions(Async)");
        }

        return updateUserInteractionsCall(userId, userInteractionRequest, _callback);

    }

    /**
     * Adds an interaction between the user and the document.
     * Use this method to register an interaction between a user and a document. Currently, we only support a &#x60;Positive&#x60; interaction, which is equivalent to a user who \&quot;likes\&quot; a certain document. For web sites, consider triggering this method whenever a certain document url loads, preferably after the user spent some time on the page, in order to prevent false positives. For apps, consider implementing a \&quot;like\&quot; button, where the on click then triggers this method.
     * @param userId Id of the user (required)
     * @param userInteractionRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> invalid request. User or document id is invalid </td><td>  -  </td></tr>
     </table>
     */
    public void updateUserInteractions(String userId, UserInteractionRequest userInteractionRequest) throws ApiException {
        updateUserInteractionsWithHttpInfo(userId, userInteractionRequest);
    }

    /**
     * Adds an interaction between the user and the document.
     * Use this method to register an interaction between a user and a document. Currently, we only support a &#x60;Positive&#x60; interaction, which is equivalent to a user who \&quot;likes\&quot; a certain document. For web sites, consider triggering this method whenever a certain document url loads, preferably after the user spent some time on the page, in order to prevent false positives. For apps, consider implementing a \&quot;like\&quot; button, where the on click then triggers this method.
     * @param userId Id of the user (required)
     * @param userInteractionRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> invalid request. User or document id is invalid </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateUserInteractionsWithHttpInfo(String userId, UserInteractionRequest userInteractionRequest) throws ApiException {
        okhttp3.Call localVarCall = updateUserInteractionsValidateBeforeCall(userId, userInteractionRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Adds an interaction between the user and the document. (asynchronously)
     * Use this method to register an interaction between a user and a document. Currently, we only support a &#x60;Positive&#x60; interaction, which is equivalent to a user who \&quot;likes\&quot; a certain document. For web sites, consider triggering this method whenever a certain document url loads, preferably after the user spent some time on the page, in order to prevent false positives. For apps, consider implementing a \&quot;like\&quot; button, where the on click then triggers this method.
     * @param userId Id of the user (required)
     * @param userInteractionRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> invalid request. User or document id is invalid </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateUserInteractionsAsync(String userId, UserInteractionRequest userInteractionRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateUserInteractionsValidateBeforeCall(userId, userInteractionRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102;

import com.aliyun.tea.*;
import com.aliyun.qweneduaisuite20261102.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "QwenEduAiSuite";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("qweneduaisuite", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation activates the Qwen learning AI suite capability for the current Alibaba Cloud account.</li>
     * <li>You must call this operation first. You can call business API operations such as problem solving and grading only after <code>ACTIVE</code> is returned.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>Both Alibaba Cloud accounts and RAM users can call this operation.</li>
     * <li>When a RAM user calls this operation, ensure that the RAM user has the required RAM permissions. The service is activated for the Alibaba Cloud account to which the RAM user belongs.</li>
     * <li>This operation is idempotent based on the Alibaba Cloud account ID. Repeated calls do not result in multiple activations.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates the learning capability for the current Alibaba Cloud account and supports querying the activation status.</p>
     * 
     * @param request ActivateQwenEduApiRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActivateQwenEduApiResponse
     */
    public ActivateQwenEduApiResponse activateQwenEduApiWithOptions(ActivateQwenEduApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateQwenEduApi"),
            new TeaPair("version", "2026-11-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/service/activate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateQwenEduApiResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation activates the Qwen learning AI suite capability for the current Alibaba Cloud account.</li>
     * <li>You must call this operation first. You can call business API operations such as problem solving and grading only after <code>ACTIVE</code> is returned.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>Both Alibaba Cloud accounts and RAM users can call this operation.</li>
     * <li>When a RAM user calls this operation, ensure that the RAM user has the required RAM permissions. The service is activated for the Alibaba Cloud account to which the RAM user belongs.</li>
     * <li>This operation is idempotent based on the Alibaba Cloud account ID. Repeated calls do not result in multiple activations.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates the learning capability for the current Alibaba Cloud account and supports querying the activation status.</p>
     * 
     * @param request ActivateQwenEduApiRequest
     * @return ActivateQwenEduApiResponse
     */
    public ActivateQwenEduApiResponse activateQwenEduApi(ActivateQwenEduApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.activateQwenEduApiWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation submits a homework image to the server for question segmentation, recognition, and grading.</li>
     * <li>You can submit the image by using <code>imageBase64</code> or <code>imageUrl</code>. <code>imageBase64</code> takes precedence.</li>
     * <li>The optional <code>dewarp</code> parameter specifies whether to correct the image distortion. Default value: <code>true</code>.</li>
     * <li>Provide <code>requestId</code> to facilitate troubleshooting and reconciliation.</li>
     * <li>Image size limit: The Base64-encoded image size cannot exceed 15 MB.</li>
     * <li>All requests and responses use the JSON format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a single-page homework image and asynchronously retrieves the grading results.</p>
     * 
     * @param request CreateEduHomeworkCorrectSubmitRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEduHomeworkCorrectSubmitResponse
     */
    public CreateEduHomeworkCorrectSubmitResponse createEduHomeworkCorrectSubmitWithOptions(CreateEduHomeworkCorrectSubmitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dewarp)) {
            body.put("dewarp", request.dewarp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageBase64)) {
            body.put("imageBase64", request.imageBase64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("imageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEduHomeworkCorrectSubmit"),
            new TeaPair("version", "2026-11-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/homework/correct/submit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEduHomeworkCorrectSubmitResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation submits a homework image to the server for question segmentation, recognition, and grading.</li>
     * <li>You can submit the image by using <code>imageBase64</code> or <code>imageUrl</code>. <code>imageBase64</code> takes precedence.</li>
     * <li>The optional <code>dewarp</code> parameter specifies whether to correct the image distortion. Default value: <code>true</code>.</li>
     * <li>Provide <code>requestId</code> to facilitate troubleshooting and reconciliation.</li>
     * <li>Image size limit: The Base64-encoded image size cannot exceed 15 MB.</li>
     * <li>All requests and responses use the JSON format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a single-page homework image and asynchronously retrieves the grading results.</p>
     * 
     * @param request CreateEduHomeworkCorrectSubmitRequest
     * @return CreateEduHomeworkCorrectSubmitResponse
     */
    public CreateEduHomeworkCorrectSubmitResponse createEduHomeworkCorrectSubmit(CreateEduHomeworkCorrectSubmitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEduHomeworkCorrectSubmitWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API supports obtaining question resolution results by providing the URL or Base64 encoding of a question image.</li>
     * <li>Supports processing a single image. The image format must be JPG, JPEG, or PNG.</li>
     * <li>The image must be clear and complete. Avoid tilted, obscured, or irrelevant content.</li>
     * <li>Each request can process only one image. Multi-image or plain text requests are not supported.</li>
     * <li>The recommended image size is up to 1 MB, with a maximum of 10 MB. The image width and height must not exceed 8,000 pixels, and the total pixel count must not exceed 2.6 million.</li>
     * <li>You must use the HTTPS protocol to call the API and provide image URLs.</li>
     * <li>The user_id parameter must be an anonymized identifier. Do not pass direct identity information such as names or phone numbers.</li>
     * <li>The API uses the HTTP POST method combined with Server-Sent Events (SSE) streaming response. The client must read the response event by event, rather than waiting for the connection to close to read the entire response.</li>
     * <li>A successful response returns the question resolution process through a series of message events and ends with a complete event. If an error occurs, an error event is returned.</li>
     * <li>For retryable errors such as TOO_MANY_ACTIVE_STREAMS, use an exponential backoff strategy to retry the request.</li>
     * <li>Set a reasonable timeout period of at least 3 minutes on the client, and ensure that the proxy layer does not cache SSE responses.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Provides question resolution services by using image URLs or Base64 encoding.</p>
     * 
     * @param tmpReq CreateEduProblemSolveRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEduProblemSolveResponse
     */
    public CreateEduProblemSolveResponse createEduProblemSolveWithOptions(CreateEduProblemSolveRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEduProblemSolveShrinkRequest request = new CreateEduProblemSolveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.query)) {
            request.queryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.query, "query", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queryShrink)) {
            body.put("query", request.queryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEduProblemSolve"),
            new TeaPair("version", "2026-11-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/problem/solve/stream"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEduProblemSolveResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API supports obtaining question resolution results by providing the URL or Base64 encoding of a question image.</li>
     * <li>Supports processing a single image. The image format must be JPG, JPEG, or PNG.</li>
     * <li>The image must be clear and complete. Avoid tilted, obscured, or irrelevant content.</li>
     * <li>Each request can process only one image. Multi-image or plain text requests are not supported.</li>
     * <li>The recommended image size is up to 1 MB, with a maximum of 10 MB. The image width and height must not exceed 8,000 pixels, and the total pixel count must not exceed 2.6 million.</li>
     * <li>You must use the HTTPS protocol to call the API and provide image URLs.</li>
     * <li>The user_id parameter must be an anonymized identifier. Do not pass direct identity information such as names or phone numbers.</li>
     * <li>The API uses the HTTP POST method combined with Server-Sent Events (SSE) streaming response. The client must read the response event by event, rather than waiting for the connection to close to read the entire response.</li>
     * <li>A successful response returns the question resolution process through a series of message events and ends with a complete event. If an error occurs, an error event is returned.</li>
     * <li>For retryable errors such as TOO_MANY_ACTIVE_STREAMS, use an exponential backoff strategy to retry the request.</li>
     * <li>Set a reasonable timeout period of at least 3 minutes on the client, and ensure that the proxy layer does not cache SSE responses.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Provides question resolution services by using image URLs or Base64 encoding.</p>
     * 
     * @param request CreateEduProblemSolveRequest
     * @return CreateEduProblemSolveResponse
     */
    public CreateEduProblemSolveResponse createEduProblemSolve(CreateEduProblemSolveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEduProblemSolveWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries the status and detailed results of single-page homework grading by using the <code>taskId</code> returned when the task is submitted.</li>
     * <li>The caller should poll this operation at an interval of 1 to 2 seconds until the task status changes to <code>finished</code> or <code>failed</code>.</li>
     * <li>When the task status is <code>finished</code>, the response contains complete grading information, including question recognition, grading conclusions, dewarped images, and rendered images.</li>
     * <li>If the task fails (the status is <code>failed</code>), check the <code>message</code> field in the response or the specific fault information in <code>data</code>.</li>
     * <li>All requests and responses are in JSON format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the progress and final results of homework grading based on the task ID.</p>
     * 
     * @param request GetEduHomeworkCorrectionResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEduHomeworkCorrectionResultResponse
     */
    public GetEduHomeworkCorrectionResultResponse getEduHomeworkCorrectionResultWithOptions(GetEduHomeworkCorrectionResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEduHomeworkCorrectionResult"),
            new TeaPair("version", "2026-11-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/homework/correct/result"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEduHomeworkCorrectionResultResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries the status and detailed results of single-page homework grading by using the <code>taskId</code> returned when the task is submitted.</li>
     * <li>The caller should poll this operation at an interval of 1 to 2 seconds until the task status changes to <code>finished</code> or <code>failed</code>.</li>
     * <li>When the task status is <code>finished</code>, the response contains complete grading information, including question recognition, grading conclusions, dewarped images, and rendered images.</li>
     * <li>If the task fails (the status is <code>failed</code>), check the <code>message</code> field in the response or the specific fault information in <code>data</code>.</li>
     * <li>All requests and responses are in JSON format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the progress and final results of homework grading based on the task ID.</p>
     * 
     * @param request GetEduHomeworkCorrectionResultRequest
     * @return GetEduHomeworkCorrectionResultResponse
     */
    public GetEduHomeworkCorrectionResultResponse getEduHomeworkCorrectionResult(GetEduHomeworkCorrectionResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEduHomeworkCorrectionResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation queries whether a specified Alibaba Cloud account or RAM user has successfully activated the Qwen learning AI suite. Before calling any business API operations, you must use this operation to confirm that the service status is <code>ACTIVE</code>. If the service is not activated, perform the corresponding operations based on the returned status information, such as waiting for a period of time and retrying.</p>
     * <h3>Precautions</h3>
     * <ul>
     * <li>This operation supports calls from Alibaba Cloud accounts and RAM users.</li>
     * <li>When a RAM user calls this operation, make sure that the RAM user has the required RAM permissions. The service is activated for the Alibaba Cloud account to which the RAM user belongs.</li>
     * <li>This operation is idempotent based on the Alibaba Cloud account ID. Repeated calls do not result in multiple activations.</li>
     * <li>If the status is <code>ACTIVATING</code>, retry the query after the time interval recommended by the returned <code>retry_after_seconds</code> field.</li>
     * <li>If a failure occurs (<code>FAILED</code>), refer to the specific error code, take corresponding measures, and then try again.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries whether the current account has activated Qwen education-related services.</p>
     * 
     * @param request GetQwenEduApiActivationStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQwenEduApiActivationStatusResponse
     */
    public GetQwenEduApiActivationStatusResponse getQwenEduApiActivationStatusWithOptions(GetQwenEduApiActivationStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQwenEduApiActivationStatus"),
            new TeaPair("version", "2026-11-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/service/activation/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQwenEduApiActivationStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation queries whether a specified Alibaba Cloud account or RAM user has successfully activated the Qwen learning AI suite. Before calling any business API operations, you must use this operation to confirm that the service status is <code>ACTIVE</code>. If the service is not activated, perform the corresponding operations based on the returned status information, such as waiting for a period of time and retrying.</p>
     * <h3>Precautions</h3>
     * <ul>
     * <li>This operation supports calls from Alibaba Cloud accounts and RAM users.</li>
     * <li>When a RAM user calls this operation, make sure that the RAM user has the required RAM permissions. The service is activated for the Alibaba Cloud account to which the RAM user belongs.</li>
     * <li>This operation is idempotent based on the Alibaba Cloud account ID. Repeated calls do not result in multiple activations.</li>
     * <li>If the status is <code>ACTIVATING</code>, retry the query after the time interval recommended by the returned <code>retry_after_seconds</code> field.</li>
     * <li>If a failure occurs (<code>FAILED</code>), refer to the specific error code, take corresponding measures, and then try again.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries whether the current account has activated Qwen education-related services.</p>
     * 
     * @param request GetQwenEduApiActivationStatusRequest
     * @return GetQwenEduApiActivationStatusResponse
     */
    public GetQwenEduApiActivationStatusResponse getQwenEduApiActivationStatus(GetQwenEduApiActivationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQwenEduApiActivationStatusWithOptions(request, headers, runtime);
    }
}

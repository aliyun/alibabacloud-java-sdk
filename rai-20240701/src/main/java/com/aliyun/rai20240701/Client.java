// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701;

import com.aliyun.tea.*;
import com.aliyun.rai20240701.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("rai", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>summary</b> : 
     * <p>BatchContentAsyncDetect</p>
     * 
     * @param request BatchContentAsyncDetectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchContentAsyncDetectResponse
     */
    public BatchContentAsyncDetectResponse batchContentAsyncDetectWithOptions(BatchContentAsyncDetectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            query.put("SceneName", request.sceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameterList)) {
            body.put("serviceParameterList", request.serviceParameterList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchContentAsyncDetect"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new BatchContentAsyncDetectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new BatchContentAsyncDetectResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>BatchContentAsyncDetect</p>
     * 
     * @param request BatchContentAsyncDetectRequest
     * @return BatchContentAsyncDetectResponse
     */
    public BatchContentAsyncDetectResponse batchContentAsyncDetect(BatchContentAsyncDetectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchContentAsyncDetectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>BatchContentSyncDetect</p>
     * 
     * @param request BatchContentSyncDetectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchContentSyncDetectResponse
     */
    public BatchContentSyncDetectResponse batchContentSyncDetectWithOptions(BatchContentSyncDetectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            query.put("SceneName", request.sceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameterList)) {
            body.put("serviceParameterList", request.serviceParameterList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchContentSyncDetect"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new BatchContentSyncDetectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new BatchContentSyncDetectResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>BatchContentSyncDetect</p>
     * 
     * @param request BatchContentSyncDetectRequest
     * @return BatchContentSyncDetectResponse
     */
    public BatchContentSyncDetectResponse batchContentSyncDetect(BatchContentSyncDetectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchContentSyncDetectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检查用户是否开通RAI服务</p>
     * 
     * @param request CheckAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckAccountResponse
     */
    public CheckAccountResponse checkAccountWithOptions(CheckAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckAccount"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CheckAccountResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CheckAccountResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>检查用户是否开通RAI服务</p>
     * 
     * @param request CheckAccountRequest
     * @return CheckAccountResponse
     */
    public CheckAccountResponse checkAccount(CheckAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ContentAsyncDetect</p>
     * 
     * @param request ContentAsyncDetectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ContentAsyncDetectResponse
     */
    public ContentAsyncDetectResponse contentAsyncDetectWithOptions(ContentAsyncDetectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            query.put("SceneName", request.sceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameter)) {
            body.put("serviceParameter", request.serviceParameter);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ContentAsyncDetect"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ContentAsyncDetectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ContentAsyncDetectResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>ContentAsyncDetect</p>
     * 
     * @param request ContentAsyncDetectRequest
     * @return ContentAsyncDetectResponse
     */
    public ContentAsyncDetectResponse contentAsyncDetect(ContentAsyncDetectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.contentAsyncDetectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ContentSyncDetect</p>
     * 
     * @param request ContentSyncDetectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ContentSyncDetectResponse
     */
    public ContentSyncDetectResponse contentSyncDetectWithOptions(ContentSyncDetectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            query.put("SceneName", request.sceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameter)) {
            body.put("serviceParameter", request.serviceParameter);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ContentSyncDetect"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ContentSyncDetectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ContentSyncDetectResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>ContentSyncDetect</p>
     * 
     * @param request ContentSyncDetectRequest
     * @return ContentSyncDetectResponse
     */
    public ContentSyncDetectResponse contentSyncDetect(ContentSyncDetectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.contentSyncDetectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetContentDetectResult</p>
     * 
     * @param request GetContentDetectResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContentDetectResultResponse
     */
    public GetContentDetectResultResponse getContentDetectResultWithOptions(GetContentDetectResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContentDetectResult"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetContentDetectResultResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetContentDetectResultResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>GetContentDetectResult</p>
     * 
     * @param request GetContentDetectResultRequest
     * @return GetContentDetectResultResponse
     */
    public GetContentDetectResultResponse getContentDetectResult(GetContentDetectResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getContentDetectResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetModelInputContentDetectResult</p>
     * 
     * @param request GetModelInputContentDetectResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModelInputContentDetectResultResponse
     */
    public GetModelInputContentDetectResultResponse getModelInputContentDetectResultWithOptions(GetModelInputContentDetectResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModelInputContentDetectResult"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelInputContentDetectResultResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetModelInputContentDetectResultResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>GetModelInputContentDetectResult</p>
     * 
     * @param request GetModelInputContentDetectResultRequest
     * @return GetModelInputContentDetectResultResponse
     */
    public GetModelInputContentDetectResultResponse getModelInputContentDetectResult(GetModelInputContentDetectResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getModelInputContentDetectResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetModelOutputContentDetectResult</p>
     * 
     * @param request GetModelOutputContentDetectResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModelOutputContentDetectResultResponse
     */
    public GetModelOutputContentDetectResultResponse getModelOutputContentDetectResultWithOptions(GetModelOutputContentDetectResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModelOutputContentDetectResult"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelOutputContentDetectResultResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetModelOutputContentDetectResultResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>GetModelOutputContentDetectResult</p>
     * 
     * @param request GetModelOutputContentDetectResultRequest
     * @return GetModelOutputContentDetectResultResponse
     */
    public GetModelOutputContentDetectResultResponse getModelOutputContentDetectResult(GetModelOutputContentDetectResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getModelOutputContentDetectResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListSensitiveWord</p>
     * 
     * @param request ListSensitiveWordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSensitiveWordResponse
     */
    public ListSensitiveWordResponse listSensitiveWordWithOptions(ListSensitiveWordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSensitiveWord"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListSensitiveWordResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListSensitiveWordResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>ListSensitiveWord</p>
     * 
     * @param request ListSensitiveWordRequest
     * @return ListSensitiveWordResponse
     */
    public ListSensitiveWordResponse listSensitiveWord(ListSensitiveWordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSensitiveWordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModelInputContentAsyncDetect</p>
     * 
     * @param tmpReq ModelInputContentAsyncDetectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelInputContentAsyncDetectResponse
     */
    public ModelInputContentAsyncDetectResponse modelInputContentAsyncDetectWithOptions(ModelInputContentAsyncDetectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModelInputContentAsyncDetectShrinkRequest request = new ModelInputContentAsyncDetectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bodyData)) {
            request.bodyDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bodyData, "BodyData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyIdentifier)) {
            query.put("PolicyIdentifier", request.policyIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            query.put("SceneName", request.sceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyDataShrink)) {
            body.put("BodyData", request.bodyDataShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelInputContentAsyncDetect"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModelInputContentAsyncDetectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModelInputContentAsyncDetectResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>ModelInputContentAsyncDetect</p>
     * 
     * @param request ModelInputContentAsyncDetectRequest
     * @return ModelInputContentAsyncDetectResponse
     */
    public ModelInputContentAsyncDetectResponse modelInputContentAsyncDetect(ModelInputContentAsyncDetectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modelInputContentAsyncDetectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModelInputContentSyncDetect</p>
     * 
     * @param tmpReq ModelInputContentSyncDetectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelInputContentSyncDetectResponse
     */
    public ModelInputContentSyncDetectResponse modelInputContentSyncDetectWithOptions(ModelInputContentSyncDetectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModelInputContentSyncDetectShrinkRequest request = new ModelInputContentSyncDetectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bodyData)) {
            request.bodyDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bodyData, "BodyData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyIdentifier)) {
            query.put("PolicyIdentifier", request.policyIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            query.put("SceneName", request.sceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyDataShrink)) {
            body.put("BodyData", request.bodyDataShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelInputContentSyncDetect"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModelInputContentSyncDetectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModelInputContentSyncDetectResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>ModelInputContentSyncDetect</p>
     * 
     * @param request ModelInputContentSyncDetectRequest
     * @return ModelInputContentSyncDetectResponse
     */
    public ModelInputContentSyncDetectResponse modelInputContentSyncDetect(ModelInputContentSyncDetectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modelInputContentSyncDetectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModelOutputContentAsyncDetect</p>
     * 
     * @param tmpReq ModelOutputContentAsyncDetectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelOutputContentAsyncDetectResponse
     */
    public ModelOutputContentAsyncDetectResponse modelOutputContentAsyncDetectWithOptions(ModelOutputContentAsyncDetectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModelOutputContentAsyncDetectShrinkRequest request = new ModelOutputContentAsyncDetectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bodyData)) {
            request.bodyDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bodyData, "BodyData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyIdentifier)) {
            query.put("PolicyIdentifier", request.policyIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            query.put("SceneName", request.sceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyDataShrink)) {
            body.put("BodyData", request.bodyDataShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelOutputContentAsyncDetect"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModelOutputContentAsyncDetectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModelOutputContentAsyncDetectResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>ModelOutputContentAsyncDetect</p>
     * 
     * @param request ModelOutputContentAsyncDetectRequest
     * @return ModelOutputContentAsyncDetectResponse
     */
    public ModelOutputContentAsyncDetectResponse modelOutputContentAsyncDetect(ModelOutputContentAsyncDetectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modelOutputContentAsyncDetectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModelOutputContentSyncDetect</p>
     * 
     * @param tmpReq ModelOutputContentSyncDetectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelOutputContentSyncDetectResponse
     */
    public ModelOutputContentSyncDetectResponse modelOutputContentSyncDetectWithOptions(ModelOutputContentSyncDetectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModelOutputContentSyncDetectShrinkRequest request = new ModelOutputContentSyncDetectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bodyData)) {
            request.bodyDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bodyData, "BodyData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyIdentifier)) {
            query.put("PolicyIdentifier", request.policyIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            query.put("SceneName", request.sceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyDataShrink)) {
            body.put("BodyData", request.bodyDataShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelOutputContentSyncDetect"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModelOutputContentSyncDetectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModelOutputContentSyncDetectResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>ModelOutputContentSyncDetect</p>
     * 
     * @param request ModelOutputContentSyncDetectRequest
     * @return ModelOutputContentSyncDetectResponse
     */
    public ModelOutputContentSyncDetectResponse modelOutputContentSyncDetect(ModelOutputContentSyncDetectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modelOutputContentSyncDetectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>注册RAI账号</p>
     * 
     * @param request RegisterAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterAccountResponse
     */
    public RegisterAccountResponse registerAccountWithOptions(RegisterAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memo)) {
            query.put("Memo", request.memo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterAccount"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterAccountResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RegisterAccountResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>注册RAI账号</p>
     * 
     * @param request RegisterAccountRequest
     * @return RegisterAccountResponse
     */
    public RegisterAccountResponse registerAccount(RegisterAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>SyncSensitiveWord</p>
     * 
     * @param tmpReq SyncSensitiveWordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncSensitiveWordResponse
     */
    public SyncSensitiveWordResponse syncSensitiveWordWithOptions(SyncSensitiveWordRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SyncSensitiveWordShrinkRequest request = new SyncSensitiveWordShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bodyData)) {
            request.bodyDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bodyData, "BodyData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commit)) {
            query.put("Commit", request.commit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyDataShrink)) {
            body.put("BodyData", request.bodyDataShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncSensitiveWord"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SyncSensitiveWordResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SyncSensitiveWordResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>SyncSensitiveWord</p>
     * 
     * @param request SyncSensitiveWordRequest
     * @return SyncSensitiveWordResponse
     */
    public SyncSensitiveWordResponse syncSensitiveWord(SyncSensitiveWordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncSensitiveWordWithOptions(request, runtime);
    }
}

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchContentAsyncDetectResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchContentSyncDetectResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckAccountResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ContentAsyncDetectResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ContentSyncDetectResponse());
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
     * <p>CreateModelInstance</p>
     * 
     * @param request CreateModelInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelInstanceResponse
     */
    public CreateModelInstanceResponse createModelInstanceWithOptions(CreateModelInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.easServiceId)) {
            query.put("EasServiceId", request.easServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.easServiceName)) {
            query.put("EasServiceName", request.easServiceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCallName)) {
            query.put("ModelCallName", request.modelCallName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCategoryId)) {
            query.put("ModelCategoryId", request.modelCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelToken)) {
            query.put("ModelToken", request.modelToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelUrl)) {
            query.put("ModelUrl", request.modelUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVpcUrl)) {
            query.put("ModelVpcUrl", request.modelVpcUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModelInstance"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateModelInstance</p>
     * 
     * @param request CreateModelInstanceRequest
     * @return CreateModelInstanceResponse
     */
    public CreateModelInstanceResponse createModelInstance(CreateModelInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createModelInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreatePolicy</p>
     * 
     * @param tmpReq CreatePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicyWithOptions(CreatePolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePolicyShrinkRequest request = new CreatePolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.harmfulCategoryConfigInfoList)) {
            request.harmfulCategoryConfigInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.harmfulCategoryConfigInfoList, "HarmfulCategoryConfigInfoList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.promptAttackInfo)) {
            request.promptAttackInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.promptAttackInfo, "PromptAttackInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.promptAttackInfoList)) {
            request.promptAttackInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.promptAttackInfoList, "PromptAttackInfoList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.regularExpressList)) {
            request.regularExpressListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.regularExpressList, "RegularExpressList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sensitiveConfigList)) {
            request.sensitiveConfigListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sensitiveConfigList, "SensitiveConfigList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sensitiveTopicList)) {
            request.sensitiveTopicListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sensitiveTopicList, "SensitiveTopicList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sensitiveWordList)) {
            request.sensitiveWordListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sensitiveWordList, "SensitiveWordList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.topicConfigInfoList)) {
            request.topicConfigInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.topicConfigInfoList, "TopicConfigInfoList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.wordGroupInfoList)) {
            request.wordGroupInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.wordGroupInfoList, "WordGroupInfoList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentSafeModelInstanceId)) {
            query.put("ContentSafeModelInstanceId", request.contentSafeModelInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSensitiveInputCheck)) {
            query.put("EnableSensitiveInputCheck", request.enableSensitiveInputCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSensitiveOutputCheck)) {
            query.put("EnableSensitiveOutputCheck", request.enableSensitiveOutputCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmfulCategoryConfigInfoListShrink)) {
            query.put("HarmfulCategoryConfigInfoList", request.harmfulCategoryConfigInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputSafeAnswer)) {
            query.put("InputSafeAnswer", request.inputSafeAnswer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputSafeAnswerSwitch)) {
            query.put("InputSafeAnswerSwitch", request.inputSafeAnswerSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSidecarPolicy)) {
            query.put("IsSidecarPolicy", request.isSidecarPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputSafeAnswer)) {
            query.put("OutputSafeAnswer", request.outputSafeAnswer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputSafeAnswerSwitch)) {
            query.put("OutputSafeAnswerSwitch", request.outputSafeAnswerSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptAttackInfoShrink)) {
            query.put("PromptAttackInfo", request.promptAttackInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptAttackInfoListShrink)) {
            query.put("PromptAttackInfoList", request.promptAttackInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptAttackModelInstanceId)) {
            query.put("PromptAttackModelInstanceId", request.promptAttackModelInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regularExpressListShrink)) {
            query.put("RegularExpressList", request.regularExpressListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneType)) {
            query.put("SceneType", request.sceneType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveConfigListShrink)) {
            query.put("SensitiveConfigList", request.sensitiveConfigListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveTopicListShrink)) {
            query.put("SensitiveTopicList", request.sensitiveTopicListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveTopicModelInstanceId)) {
            query.put("SensitiveTopicModelInstanceId", request.sensitiveTopicModelInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveWordListShrink)) {
            query.put("SensitiveWordList", request.sensitiveWordListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicConfigInfoListShrink)) {
            query.put("TopicConfigInfoList", request.topicConfigInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wordGroupInfoListShrink)) {
            query.put("WordGroupInfoList", request.wordGroupInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePolicy"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreatePolicy</p>
     * 
     * @param request CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateTopic</p>
     * 
     * @param tmpReq CreateTopicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTopicResponse
     */
    public CreateTopicResponse createTopicWithOptions(CreateTopicRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTopicShrinkRequest request = new CreateTopicShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bodyData)) {
            request.bodyDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bodyData, "BodyData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicDefinition)) {
            query.put("TopicDefinition", request.topicDefinition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicName)) {
            query.put("TopicName", request.topicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
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
            new TeaPair("action", "CreateTopic"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTopicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateTopic</p>
     * 
     * @param request CreateTopicRequest
     * @return CreateTopicResponse
     */
    public CreateTopicResponse createTopic(CreateTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTopicWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateWordGroup</p>
     * 
     * @param tmpReq CreateWordGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWordGroupResponse
     */
    public CreateWordGroupResponse createWordGroupWithOptions(CreateWordGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWordGroupShrinkRequest request = new CreateWordGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bodyData)) {
            request.bodyDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bodyData, "BodyData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commit)) {
            query.put("Commit", request.commit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
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
            new TeaPair("action", "CreateWordGroup"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWordGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateWordGroup</p>
     * 
     * @param request CreateWordGroupRequest
     * @return CreateWordGroupResponse
     */
    public CreateWordGroupResponse createWordGroup(CreateWordGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWordGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteModelInstance</p>
     * 
     * @param tmpReq DeleteModelInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelInstanceResponse
     */
    public DeleteModelInstanceResponse deleteModelInstanceWithOptions(DeleteModelInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteModelInstanceShrinkRequest request = new DeleteModelInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.modelInstanceIdList)) {
            request.modelInstanceIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.modelInstanceIdList, "ModelInstanceIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelInstanceIdListShrink)) {
            query.put("ModelInstanceIdList", request.modelInstanceIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModelInstance"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteModelInstance</p>
     * 
     * @param request DeleteModelInstanceRequest
     * @return DeleteModelInstanceResponse
     */
    public DeleteModelInstanceResponse deleteModelInstance(DeleteModelInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteModelInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeletePolicy</p>
     * 
     * @param tmpReq DeletePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicyWithOptions(DeletePolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeletePolicyShrinkRequest request = new DeletePolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.policyIdList)) {
            request.policyIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.policyIdList, "PolicyIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyIdListShrink)) {
            query.put("PolicyIdList", request.policyIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicy"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeletePolicy</p>
     * 
     * @param request DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteTopic</p>
     * 
     * @param tmpReq DeleteTopicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTopicResponse
     */
    public DeleteTopicResponse deleteTopicWithOptions(DeleteTopicRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteTopicShrinkRequest request = new DeleteTopicShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.topicIdList)) {
            request.topicIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.topicIdList, "TopicIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicIdListShrink)) {
            query.put("TopicIdList", request.topicIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTopic"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTopicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteTopic</p>
     * 
     * @param request DeleteTopicRequest
     * @return DeleteTopicResponse
     */
    public DeleteTopicResponse deleteTopic(DeleteTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTopicWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteWordGroup</p>
     * 
     * @param tmpReq DeleteWordGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWordGroupResponse
     */
    public DeleteWordGroupResponse deleteWordGroupWithOptions(DeleteWordGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteWordGroupShrinkRequest request = new DeleteWordGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIdList)) {
            request.groupIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIdList, "GroupIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupIdListShrink)) {
            query.put("GroupIdList", request.groupIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWordGroup"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWordGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteWordGroup</p>
     * 
     * @param request DeleteWordGroupRequest
     * @return DeleteWordGroupResponse
     */
    public DeleteWordGroupResponse deleteWordGroup(DeleteWordGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWordGroupWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContentDetectResultResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelInputContentDetectResultResponse());
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
     * <p>GetModelInstanceInfo</p>
     * 
     * @param request GetModelInstanceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModelInstanceInfoResponse
     */
    public GetModelInstanceInfoResponse getModelInstanceInfoWithOptions(GetModelInstanceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelInstanceId)) {
            query.put("ModelInstanceId", request.modelInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneType)) {
            query.put("SceneType", request.sceneType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModelInstanceInfo"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelInstanceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetModelInstanceInfo</p>
     * 
     * @param request GetModelInstanceInfoRequest
     * @return GetModelInstanceInfoResponse
     */
    public GetModelInstanceInfoResponse getModelInstanceInfo(GetModelInstanceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getModelInstanceInfoWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelOutputContentDetectResultResponse());
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
     * <p>GetPolicyDefaultOptions</p>
     * 
     * @param request GetPolicyDefaultOptionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPolicyDefaultOptionsResponse
     */
    public GetPolicyDefaultOptionsResponse getPolicyDefaultOptionsWithOptions(GetPolicyDefaultOptionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPolicyDefaultOptions"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPolicyDefaultOptionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetPolicyDefaultOptions</p>
     * 
     * @param request GetPolicyDefaultOptionsRequest
     * @return GetPolicyDefaultOptionsResponse
     */
    public GetPolicyDefaultOptionsResponse getPolicyDefaultOptions(GetPolicyDefaultOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPolicyDefaultOptionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetPolicyInfo</p>
     * 
     * @param request GetPolicyInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPolicyInfoResponse
     */
    public GetPolicyInfoResponse getPolicyInfoWithOptions(GetPolicyInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPolicyInfo"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPolicyInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetPolicyInfo</p>
     * 
     * @param request GetPolicyInfoRequest
     * @return GetPolicyInfoResponse
     */
    public GetPolicyInfoResponse getPolicyInfo(GetPolicyInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPolicyInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetTopic</p>
     * 
     * @param request GetTopicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTopicResponse
     */
    public GetTopicResponse getTopicWithOptions(GetTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicId)) {
            query.put("TopicId", request.topicId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTopic"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTopicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetTopic</p>
     * 
     * @param request GetTopicRequest
     * @return GetTopicResponse
     */
    public GetTopicResponse getTopic(GetTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTopicWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetWordGroup</p>
     * 
     * @param request GetWordGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWordGroupResponse
     */
    public GetWordGroupResponse getWordGroupWithOptions(GetWordGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWordGroup"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWordGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetWordGroup</p>
     * 
     * @param request GetWordGroupRequest
     * @return GetWordGroupResponse
     */
    public GetWordGroupResponse getWordGroup(GetWordGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWordGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListModelCategory</p>
     * 
     * @param request ListModelCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelCategoryResponse
     */
    public ListModelCategoryResponse listModelCategoryWithOptions(ListModelCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentSafeImageSupported)) {
            query.put("ContentSafeImageSupported", request.contentSafeImageSupported);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentSafeTextSupported)) {
            query.put("ContentSafeTextSupported", request.contentSafeTextSupported);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCategoryName)) {
            query.put("ModelCategoryName", request.modelCategoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelSource)) {
            query.put("ModelSource", request.modelSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptAttackTextSupported)) {
            query.put("PromptAttackTextSupported", request.promptAttackTextSupported);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveTopicTextSupported)) {
            query.put("SensitiveTopicTextSupported", request.sensitiveTopicTextSupported);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelCategory"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListModelCategory</p>
     * 
     * @param request ListModelCategoryRequest
     * @return ListModelCategoryResponse
     */
    public ListModelCategoryResponse listModelCategory(ListModelCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listModelCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListModelInstance</p>
     * 
     * @param request ListModelInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelInstanceResponse
     */
    public ListModelInstanceResponse listModelInstanceWithOptions(ListModelInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.easServiceName)) {
            query.put("EasServiceName", request.easServiceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSidecarPolicy)) {
            query.put("IsSidecarPolicy", request.isSidecarPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSupportContentSafe)) {
            query.put("IsSupportContentSafe", request.isSupportContentSafe);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSupportPromptAttack)) {
            query.put("IsSupportPromptAttack", request.isSupportPromptAttack);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSupportSensitiveTopic)) {
            query.put("IsSupportSensitiveTopic", request.isSupportSensitiveTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelSource)) {
            query.put("ModelSource", request.modelSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelInstance"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListModelInstance</p>
     * 
     * @param request ListModelInstanceRequest
     * @return ListModelInstanceResponse
     */
    public ListModelInstanceResponse listModelInstance(ListModelInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listModelInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListPolicy</p>
     * 
     * @param request ListPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPolicyResponse
     */
    public ListPolicyResponse listPolicyWithOptions(ListPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isSidecarPolicy)) {
            query.put("IsSidecarPolicy", request.isSidecarPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyIdentifier)) {
            query.put("PolicyIdentifier", request.policyIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneType)) {
            query.put("SceneType", request.sceneType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicy"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListPolicy</p>
     * 
     * @param request ListPolicyRequest
     * @return ListPolicyResponse
     */
    public ListPolicyResponse listPolicy(ListPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListTopic</p>
     * 
     * @param request ListTopicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTopicResponse
     */
    public ListTopicResponse listTopicWithOptions(ListTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicName)) {
            query.put("TopicName", request.topicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTopic"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTopicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListTopic</p>
     * 
     * @param request ListTopicRequest
     * @return ListTopicResponse
     */
    public ListTopicResponse listTopic(ListTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTopicWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListWordGroup</p>
     * 
     * @param request ListWordGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWordGroupResponse
     */
    public ListWordGroupResponse listWordGroupWithOptions(ListWordGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWordGroup"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWordGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListWordGroup</p>
     * 
     * @param request ListWordGroupRequest
     * @return ListWordGroupResponse
     */
    public ListWordGroupResponse listWordGroup(ListWordGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWordGroupWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelInputContentAsyncDetectResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelInputContentSyncDetectResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelOutputContentAsyncDetectResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelOutputContentSyncDetectResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterAccountResponse());
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
     * <p>UpdateModelInstance</p>
     * 
     * @param request UpdateModelInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModelInstanceResponse
     */
    public UpdateModelInstanceResponse updateModelInstanceWithOptions(UpdateModelInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.easServiceId)) {
            query.put("EasServiceId", request.easServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.easServiceName)) {
            query.put("EasServiceName", request.easServiceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCallName)) {
            query.put("ModelCallName", request.modelCallName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCategoryId)) {
            query.put("ModelCategoryId", request.modelCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelInstanceId)) {
            query.put("ModelInstanceId", request.modelInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelToken)) {
            query.put("ModelToken", request.modelToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelUrl)) {
            query.put("ModelUrl", request.modelUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVpcUrl)) {
            query.put("ModelVpcUrl", request.modelVpcUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModelInstance"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>UpdateModelInstance</p>
     * 
     * @param request UpdateModelInstanceRequest
     * @return UpdateModelInstanceResponse
     */
    public UpdateModelInstanceResponse updateModelInstance(UpdateModelInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateModelInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>UpdatePolicy</p>
     * 
     * @param tmpReq UpdatePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicyWithOptions(UpdatePolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdatePolicyShrinkRequest request = new UpdatePolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.harmfulCategoryConfigInfoList)) {
            request.harmfulCategoryConfigInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.harmfulCategoryConfigInfoList, "HarmfulCategoryConfigInfoList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.promptAttackInfo)) {
            request.promptAttackInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.promptAttackInfo, "PromptAttackInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.promptAttackInfoList)) {
            request.promptAttackInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.promptAttackInfoList, "PromptAttackInfoList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.regularExpressList)) {
            request.regularExpressListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.regularExpressList, "RegularExpressList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sensitiveConfigList)) {
            request.sensitiveConfigListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sensitiveConfigList, "SensitiveConfigList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sensitiveTopicList)) {
            request.sensitiveTopicListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sensitiveTopicList, "SensitiveTopicList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sensitiveWordList)) {
            request.sensitiveWordListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sensitiveWordList, "SensitiveWordList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.topicConfigInfoList)) {
            request.topicConfigInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.topicConfigInfoList, "TopicConfigInfoList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.wordGroupInfoList)) {
            request.wordGroupInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.wordGroupInfoList, "WordGroupInfoList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentSafeModelInstanceId)) {
            query.put("ContentSafeModelInstanceId", request.contentSafeModelInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSensitiveInputCheck)) {
            query.put("EnableSensitiveInputCheck", request.enableSensitiveInputCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSensitiveOutputCheck)) {
            query.put("EnableSensitiveOutputCheck", request.enableSensitiveOutputCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmfulCategoryConfigInfoListShrink)) {
            query.put("HarmfulCategoryConfigInfoList", request.harmfulCategoryConfigInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputSafeAnswer)) {
            query.put("InputSafeAnswer", request.inputSafeAnswer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputSafeAnswerSwitch)) {
            query.put("InputSafeAnswerSwitch", request.inputSafeAnswerSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSidecarPolicy)) {
            query.put("IsSidecarPolicy", request.isSidecarPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputSafeAnswer)) {
            query.put("OutputSafeAnswer", request.outputSafeAnswer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputSafeAnswerSwitch)) {
            query.put("OutputSafeAnswerSwitch", request.outputSafeAnswerSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptAttackInfoShrink)) {
            query.put("PromptAttackInfo", request.promptAttackInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptAttackInfoListShrink)) {
            query.put("PromptAttackInfoList", request.promptAttackInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptAttackModelInstanceId)) {
            query.put("PromptAttackModelInstanceId", request.promptAttackModelInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regularExpressListShrink)) {
            query.put("RegularExpressList", request.regularExpressListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneType)) {
            query.put("SceneType", request.sceneType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveConfigListShrink)) {
            query.put("SensitiveConfigList", request.sensitiveConfigListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveTopicListShrink)) {
            query.put("SensitiveTopicList", request.sensitiveTopicListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveTopicModelInstanceId)) {
            query.put("SensitiveTopicModelInstanceId", request.sensitiveTopicModelInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveWordListShrink)) {
            query.put("SensitiveWordList", request.sensitiveWordListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicConfigInfoListShrink)) {
            query.put("TopicConfigInfoList", request.topicConfigInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wordGroupInfoListShrink)) {
            query.put("WordGroupInfoList", request.wordGroupInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePolicy"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>UpdatePolicy</p>
     * 
     * @param request UpdatePolicyRequest
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>UpdateTopic</p>
     * 
     * @param tmpReq UpdateTopicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTopicResponse
     */
    public UpdateTopicResponse updateTopicWithOptions(UpdateTopicRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTopicShrinkRequest request = new UpdateTopicShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bodyData)) {
            request.bodyDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bodyData, "BodyData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicDefinition)) {
            query.put("TopicDefinition", request.topicDefinition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicId)) {
            query.put("TopicId", request.topicId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicName)) {
            query.put("TopicName", request.topicName);
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
            new TeaPair("action", "UpdateTopic"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTopicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>UpdateTopic</p>
     * 
     * @param request UpdateTopicRequest
     * @return UpdateTopicResponse
     */
    public UpdateTopicResponse updateTopic(UpdateTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTopicWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>UpdateWordGroup</p>
     * 
     * @param tmpReq UpdateWordGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWordGroupResponse
     */
    public UpdateWordGroupResponse updateWordGroupWithOptions(UpdateWordGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateWordGroupShrinkRequest request = new UpdateWordGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bodyData)) {
            request.bodyDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bodyData, "BodyData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commit)) {
            query.put("Commit", request.commit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wordInfoListModified)) {
            query.put("WordInfoListModified", request.wordInfoListModified);
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
            new TeaPair("action", "UpdateWordGroup"),
            new TeaPair("version", "2024-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWordGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>UpdateWordGroup</p>
     * 
     * @param request UpdateWordGroupRequest
     * @return UpdateWordGroupResponse
     */
    public UpdateWordGroupResponse updateWordGroup(UpdateWordGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWordGroupWithOptions(request, runtime);
    }
}

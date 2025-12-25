// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115;

import com.aliyun.tea.*;
import com.aliyun.qualitycheck20190115.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("qualitycheck", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request AddBusinessCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddBusinessCategoryResponse
     */
    public AddBusinessCategoryResponse addBusinessCategoryWithOptions(AddBusinessCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddBusinessCategory"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddBusinessCategoryResponse());
    }

    /**
     * @param request AddBusinessCategoryRequest
     * @return AddBusinessCategoryResponse
     */
    public AddBusinessCategoryResponse addBusinessCategory(AddBusinessCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBusinessCategoryWithOptions(request, runtime);
    }

    /**
     * @param request AddRuleCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRuleCategoryResponse
     */
    public AddRuleCategoryResponse addRuleCategoryWithOptions(AddRuleCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRuleCategory"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRuleCategoryResponse());
    }

    /**
     * @param request AddRuleCategoryRequest
     * @return AddRuleCategoryResponse
     */
    public AddRuleCategoryResponse addRuleCategory(AddRuleCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRuleCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>V4创建规则</p>
     * 
     * @param request AddRuleV4Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRuleV4Response
     */
    public AddRuleV4Response addRuleV4WithOptions(AddRuleV4Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isCopy)) {
            body.put("IsCopy", request.isCopy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStrForRule)) {
            body.put("JsonStrForRule", request.jsonStrForRule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRuleV4"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRuleV4Response());
    }

    /**
     * <b>summary</b> : 
     * <p>V4创建规则</p>
     * 
     * @param request AddRuleV4Request
     * @return AddRuleV4Response
     */
    public AddRuleV4Response addRuleV4(AddRuleV4Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRuleV4WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>申领实时语音所需token</p>
     * 
     * @param request ApplyWsTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyWsTokenResponse
     */
    public ApplyWsTokenResponse applyWsTokenWithOptions(ApplyWsTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyWsToken"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyWsTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>申领实时语音所需token</p>
     * 
     * @param request ApplyWsTokenRequest
     * @return ApplyWsTokenResponse
     */
    public ApplyWsTokenResponse applyWsToken(ApplyWsTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyWsTokenWithOptions(request, runtime);
    }

    /**
     * @param request AssignReviewerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssignReviewerResponse
     */
    public AssignReviewerResponse assignReviewerWithOptions(AssignReviewerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignReviewer"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssignReviewerResponse());
    }

    /**
     * @param request AssignReviewerRequest
     * @return AssignReviewerResponse
     */
    public AssignReviewerResponse assignReviewer(AssignReviewerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assignReviewerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>会话组批量分配</p>
     * 
     * @deprecated OpenAPI AssignReviewerBySessionGroup is deprecated
     * 
     * @param request AssignReviewerBySessionGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssignReviewerBySessionGroupResponse
     */
    @Deprecated
    // Deprecated
    public AssignReviewerBySessionGroupResponse assignReviewerBySessionGroupWithOptions(AssignReviewerBySessionGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("jsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignReviewerBySessionGroup"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssignReviewerBySessionGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>会话组批量分配</p>
     * 
     * @deprecated OpenAPI AssignReviewerBySessionGroup is deprecated
     * 
     * @param request AssignReviewerBySessionGroupRequest
     * @return AssignReviewerBySessionGroupResponse
     */
    @Deprecated
    // Deprecated
    public AssignReviewerBySessionGroupResponse assignReviewerBySessionGroup(AssignReviewerBySessionGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assignReviewerBySessionGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量复核</p>
     * 
     * @param request BatchSubmitReviewInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchSubmitReviewInfoResponse
     */
    public BatchSubmitReviewInfoResponse batchSubmitReviewInfoWithOptions(BatchSubmitReviewInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("jsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSubmitReviewInfo"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSubmitReviewInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量复核</p>
     * 
     * @param request BatchSubmitReviewInfoRequest
     * @return BatchSubmitReviewInfoResponse
     */
    public BatchSubmitReviewInfoResponse batchSubmitReviewInfo(BatchSubmitReviewInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSubmitReviewInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建热词模型</p>
     * 
     * @param request CreateAsrVocabRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAsrVocabResponse
     */
    public CreateAsrVocabResponse createAsrVocabWithOptions(CreateAsrVocabRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAsrVocab"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAsrVocabResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建热词模型</p>
     * 
     * @param request CreateAsrVocabRequest
     * @return CreateAsrVocabResponse
     */
    public CreateAsrVocabResponse createAsrVocab(CreateAsrVocabRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAsrVocabWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建质检方案中的质检维度</p>
     * 
     * @param request CreateCheckTypeToSchemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCheckTypeToSchemeResponse
     */
    public CreateCheckTypeToSchemeResponse createCheckTypeToSchemeWithOptions(CreateCheckTypeToSchemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("jsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCheckTypeToScheme"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCheckTypeToSchemeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建质检方案中的质检维度</p>
     * 
     * @param request CreateCheckTypeToSchemeRequest
     * @return CreateCheckTypeToSchemeResponse
     */
    public CreateCheckTypeToSchemeResponse createCheckTypeToScheme(CreateCheckTypeToSchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCheckTypeToSchemeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建标签挖掘任务</p>
     * 
     * @param request CreateMiningTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMiningTaskResponse
     */
    public CreateMiningTaskResponse createMiningTaskWithOptions(CreateMiningTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            body.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            body.put("Param", request.param);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMiningTask"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMiningTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建标签挖掘任务</p>
     * 
     * @param request CreateMiningTaskRequest
     * @return CreateMiningTaskResponse
     */
    public CreateMiningTaskResponse createMiningTask(CreateMiningTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMiningTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增质检方案</p>
     * 
     * @param request CreateQualityCheckSchemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQualityCheckSchemeResponse
     */
    public CreateQualityCheckSchemeResponse createQualityCheckSchemeWithOptions(CreateQualityCheckSchemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("jsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQualityCheckScheme"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQualityCheckSchemeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增质检方案</p>
     * 
     * @param request CreateQualityCheckSchemeRequest
     * @return CreateQualityCheckSchemeResponse
     */
    public CreateQualityCheckSchemeResponse createQualityCheckScheme(CreateQualityCheckSchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityCheckSchemeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建质检任务</p>
     * 
     * @param request CreateSchemeTaskConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSchemeTaskConfigResponse
     */
    public CreateSchemeTaskConfigResponse createSchemeTaskConfigWithOptions(CreateSchemeTaskConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("jsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSchemeTaskConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSchemeTaskConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建质检任务</p>
     * 
     * @param request CreateSchemeTaskConfigRequest
     * @return CreateSchemeTaskConfigResponse
     */
    public CreateSchemeTaskConfigResponse createSchemeTaskConfig(CreateSchemeTaskConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSchemeTaskConfigWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI CreateSkillGroupConfig is deprecated
     * 
     * @param request CreateSkillGroupConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSkillGroupConfigResponse
     */
    @Deprecated
    // Deprecated
    public CreateSkillGroupConfigResponse createSkillGroupConfigWithOptions(CreateSkillGroupConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSkillGroupConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSkillGroupConfigResponse());
    }

    /**
     * @deprecated OpenAPI CreateSkillGroupConfig is deprecated
     * 
     * @param request CreateSkillGroupConfigRequest
     * @return CreateSkillGroupConfigResponse
     */
    @Deprecated
    // Deprecated
    public CreateSkillGroupConfigResponse createSkillGroupConfig(CreateSkillGroupConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSkillGroupConfigWithOptions(request, runtime);
    }

    /**
     * @param request CreateTaskAssignRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTaskAssignRuleResponse
     */
    public CreateTaskAssignRuleResponse createTaskAssignRuleWithOptions(CreateTaskAssignRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTaskAssignRule"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskAssignRuleResponse());
    }

    /**
     * @param request CreateTaskAssignRuleRequest
     * @return CreateTaskAssignRuleResponse
     */
    public CreateTaskAssignRuleResponse createTaskAssignRule(CreateTaskAssignRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTaskAssignRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建用户</p>
     * 
     * @param request CreateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserResponse
     */
    public CreateUserResponse createUserWithOptions(CreateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            body.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            body.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建用户</p>
     * 
     * @param request CreateUserRequest
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    /**
     * @param request CreateWarningConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWarningConfigResponse
     */
    public CreateWarningConfigResponse createWarningConfigWithOptions(CreateWarningConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWarningConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWarningConfigResponse());
    }

    /**
     * @param request CreateWarningConfigRequest
     * @return CreateWarningConfigResponse
     */
    public CreateWarningConfigResponse createWarningConfig(CreateWarningConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWarningConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预警策略-新增</p>
     * 
     * @param request CreateWarningStrategyConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWarningStrategyConfigResponse
     */
    public CreateWarningStrategyConfigResponse createWarningStrategyConfigWithOptions(CreateWarningStrategyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWarningStrategyConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWarningStrategyConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预警策略-新增</p>
     * 
     * @param request CreateWarningStrategyConfigRequest
     * @return CreateWarningStrategyConfigResponse
     */
    public CreateWarningStrategyConfigResponse createWarningStrategyConfig(CreateWarningStrategyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWarningStrategyConfigWithOptions(request, runtime);
    }

    /**
     * @param request DelRuleCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DelRuleCategoryResponse
     */
    public DelRuleCategoryResponse delRuleCategoryWithOptions(DelRuleCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DelRuleCategory"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DelRuleCategoryResponse());
    }

    /**
     * @param request DelRuleCategoryRequest
     * @return DelRuleCategoryResponse
     */
    public DelRuleCategoryResponse delRuleCategory(DelRuleCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.delRuleCategoryWithOptions(request, runtime);
    }

    /**
     * @param request DeleteAsrVocabRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAsrVocabResponse
     */
    public DeleteAsrVocabResponse deleteAsrVocabWithOptions(DeleteAsrVocabRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAsrVocab"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAsrVocabResponse());
    }

    /**
     * @param request DeleteAsrVocabRequest
     * @return DeleteAsrVocabResponse
     */
    public DeleteAsrVocabResponse deleteAsrVocab(DeleteAsrVocabRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAsrVocabWithOptions(request, runtime);
    }

    /**
     * @param request DeleteBusinessCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBusinessCategoryResponse
     */
    public DeleteBusinessCategoryResponse deleteBusinessCategoryWithOptions(DeleteBusinessCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBusinessCategory"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBusinessCategoryResponse());
    }

    /**
     * @param request DeleteBusinessCategoryRequest
     * @return DeleteBusinessCategoryResponse
     */
    public DeleteBusinessCategoryResponse deleteBusinessCategory(DeleteBusinessCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBusinessCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除质检唯独</p>
     * 
     * @param request DeleteCheckTypeToSchemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCheckTypeToSchemeResponse
     */
    public DeleteCheckTypeToSchemeResponse deleteCheckTypeToSchemeWithOptions(DeleteCheckTypeToSchemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCheckTypeToScheme"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCheckTypeToSchemeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除质检唯独</p>
     * 
     * @param request DeleteCheckTypeToSchemeRequest
     * @return DeleteCheckTypeToSchemeResponse
     */
    public DeleteCheckTypeToSchemeResponse deleteCheckTypeToScheme(DeleteCheckTypeToSchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCheckTypeToSchemeWithOptions(request, runtime);
    }

    /**
     * @param request DeleteCustomizationConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomizationConfigResponse
     */
    public DeleteCustomizationConfigResponse deleteCustomizationConfigWithOptions(DeleteCustomizationConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomizationConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomizationConfigResponse());
    }

    /**
     * @param request DeleteCustomizationConfigRequest
     * @return DeleteCustomizationConfigResponse
     */
    public DeleteCustomizationConfigResponse deleteCustomizationConfig(DeleteCustomizationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomizationConfigWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI DeleteDataSet is deprecated
     * 
     * @param request DeleteDataSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSetResponse
     */
    @Deprecated
    // Deprecated
    public DeleteDataSetResponse deleteDataSetWithOptions(DeleteDataSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSet"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSetResponse());
    }

    /**
     * @deprecated OpenAPI DeleteDataSet is deprecated
     * 
     * @param request DeleteDataSetRequest
     * @return DeleteDataSetResponse
     */
    @Deprecated
    // Deprecated
    public DeleteDataSetResponse deleteDataSet(DeleteDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSetWithOptions(request, runtime);
    }

    /**
     * @param request DeletePrecisionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrecisionTaskResponse
     */
    public DeletePrecisionTaskResponse deletePrecisionTaskWithOptions(DeletePrecisionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrecisionTask"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrecisionTaskResponse());
    }

    /**
     * @param request DeletePrecisionTaskRequest
     * @return DeletePrecisionTaskResponse
     */
    public DeletePrecisionTaskResponse deletePrecisionTask(DeletePrecisionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrecisionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除质检方案</p>
     * 
     * @param request DeleteQualityCheckSchemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQualityCheckSchemeResponse
     */
    public DeleteQualityCheckSchemeResponse deleteQualityCheckSchemeWithOptions(DeleteQualityCheckSchemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("jsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQualityCheckScheme"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQualityCheckSchemeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除质检方案</p>
     * 
     * @param request DeleteQualityCheckSchemeRequest
     * @return DeleteQualityCheckSchemeResponse
     */
    public DeleteQualityCheckSchemeResponse deleteQualityCheckScheme(DeleteQualityCheckSchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityCheckSchemeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除规则</p>
     * 
     * @deprecated OpenAPI DeleteRule is deprecated, please use Qualitycheck::2019-01-15::DeleteRuleV4 instead.
     * 
     * @param request DeleteRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRuleResponse
     */
    @Deprecated
    // Deprecated
    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceDelete)) {
            body.put("ForceDelete", request.forceDelete);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSchemeData)) {
            body.put("IsSchemeData", request.isSchemeData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRule"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除规则</p>
     * 
     * @deprecated OpenAPI DeleteRule is deprecated, please use Qualitycheck::2019-01-15::DeleteRuleV4 instead.
     * 
     * @param request DeleteRuleRequest
     * @return DeleteRuleResponse
     */
    @Deprecated
    // Deprecated
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>V4删除规则</p>
     * 
     * @param request DeleteRuleV4Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRuleV4Response
     */
    public DeleteRuleV4Response deleteRuleV4WithOptions(DeleteRuleV4Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceDelete)) {
            body.put("ForceDelete", request.forceDelete);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRuleV4"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRuleV4Response());
    }

    /**
     * <b>summary</b> : 
     * <p>V4删除规则</p>
     * 
     * @param request DeleteRuleV4Request
     * @return DeleteRuleV4Response
     */
    public DeleteRuleV4Response deleteRuleV4(DeleteRuleV4Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRuleV4WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除质检任务</p>
     * 
     * @param request DeleteSchemeTaskConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSchemeTaskConfigResponse
     */
    public DeleteSchemeTaskConfigResponse deleteSchemeTaskConfigWithOptions(DeleteSchemeTaskConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("jsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSchemeTaskConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSchemeTaskConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除质检任务</p>
     * 
     * @param request DeleteSchemeTaskConfigRequest
     * @return DeleteSchemeTaskConfigResponse
     */
    public DeleteSchemeTaskConfigResponse deleteSchemeTaskConfig(DeleteSchemeTaskConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSchemeTaskConfigWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI DeleteSkillGroupConfig is deprecated
     * 
     * @param request DeleteSkillGroupConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSkillGroupConfigResponse
     */
    @Deprecated
    // Deprecated
    public DeleteSkillGroupConfigResponse deleteSkillGroupConfigWithOptions(DeleteSkillGroupConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSkillGroupConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSkillGroupConfigResponse());
    }

    /**
     * @deprecated OpenAPI DeleteSkillGroupConfig is deprecated
     * 
     * @param request DeleteSkillGroupConfigRequest
     * @return DeleteSkillGroupConfigResponse
     */
    @Deprecated
    // Deprecated
    public DeleteSkillGroupConfigResponse deleteSkillGroupConfig(DeleteSkillGroupConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSkillGroupConfigWithOptions(request, runtime);
    }

    /**
     * @param request DeleteTaskAssignRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTaskAssignRuleResponse
     */
    public DeleteTaskAssignRuleResponse deleteTaskAssignRuleWithOptions(DeleteTaskAssignRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTaskAssignRule"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTaskAssignRuleResponse());
    }

    /**
     * @param request DeleteTaskAssignRuleRequest
     * @return DeleteTaskAssignRuleResponse
     */
    public DeleteTaskAssignRuleResponse deleteTaskAssignRule(DeleteTaskAssignRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTaskAssignRuleWithOptions(request, runtime);
    }

    /**
     * @param request DeleteWarningConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWarningConfigResponse
     */
    public DeleteWarningConfigResponse deleteWarningConfigWithOptions(DeleteWarningConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWarningConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWarningConfigResponse());
    }

    /**
     * @param request DeleteWarningConfigRequest
     * @return DeleteWarningConfigResponse
     */
    public DeleteWarningConfigResponse deleteWarningConfig(DeleteWarningConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWarningConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预警策略-删除</p>
     * 
     * @param request DeleteWarningStrategyConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWarningStrategyConfigResponse
     */
    public DeleteWarningStrategyConfigResponse deleteWarningStrategyConfigWithOptions(DeleteWarningStrategyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWarningStrategyConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWarningStrategyConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预警策略-删除</p>
     * 
     * @param request DeleteWarningStrategyConfigRequest
     * @return DeleteWarningStrategyConfigResponse
     */
    public DeleteWarningStrategyConfigResponse deleteWarningStrategyConfig(DeleteWarningStrategyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWarningStrategyConfigWithOptions(request, runtime);
    }

    /**
     * @param request GetAsrVocabRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAsrVocabResponse
     */
    public GetAsrVocabResponse getAsrVocabWithOptions(GetAsrVocabRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAsrVocab"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAsrVocabResponse());
    }

    /**
     * @param request GetAsrVocabRequest
     * @return GetAsrVocabResponse
     */
    public GetAsrVocabResponse getAsrVocab(GetAsrVocabRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsrVocabWithOptions(request, runtime);
    }

    /**
     * @param request GetBusinessCategoryListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBusinessCategoryListResponse
     */
    public GetBusinessCategoryListResponse getBusinessCategoryListWithOptions(GetBusinessCategoryListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBusinessCategoryList"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBusinessCategoryListResponse());
    }

    /**
     * @param request GetBusinessCategoryListRequest
     * @return GetBusinessCategoryListResponse
     */
    public GetBusinessCategoryListResponse getBusinessCategoryList(GetBusinessCategoryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBusinessCategoryListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取语音模型列表</p>
     * 
     * @param request GetCustomizationConfigListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomizationConfigListResponse
     */
    public GetCustomizationConfigListResponse getCustomizationConfigListWithOptions(GetCustomizationConfigListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomizationConfigList"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomizationConfigListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取语音模型列表</p>
     * 
     * @param request GetCustomizationConfigListRequest
     * @return GetCustomizationConfigListResponse
     */
    public GetCustomizationConfigListResponse getCustomizationConfigList(GetCustomizationConfigListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomizationConfigListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取标签挖掘任务结果</p>
     * 
     * @param request GetMiningTaskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMiningTaskResultResponse
     */
    public GetMiningTaskResultResponse getMiningTaskResultWithOptions(GetMiningTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMiningTaskResult"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMiningTaskResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取标签挖掘任务结果</p>
     * 
     * @param request GetMiningTaskResultRequest
     * @return GetMiningTaskResultResponse
     */
    public GetMiningTaskResultResponse getMiningTaskResult(GetMiningTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMiningTaskResultWithOptions(request, runtime);
    }

    /**
     * @param request GetNextResultToVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNextResultToVerifyResponse
     */
    public GetNextResultToVerifyResponse getNextResultToVerifyWithOptions(GetNextResultToVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNextResultToVerify"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNextResultToVerifyResponse());
    }

    /**
     * @param request GetNextResultToVerifyRequest
     * @return GetNextResultToVerifyResponse
     */
    public GetNextResultToVerifyResponse getNextResultToVerify(GetNextResultToVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNextResultToVerifyWithOptions(request, runtime);
    }

    /**
     * @param request GetPrecisionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPrecisionTaskResponse
     */
    public GetPrecisionTaskResponse getPrecisionTaskWithOptions(GetPrecisionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrecisionTask"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPrecisionTaskResponse());
    }

    /**
     * @param request GetPrecisionTaskRequest
     * @return GetPrecisionTaskResponse
     */
    public GetPrecisionTaskResponse getPrecisionTask(GetPrecisionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPrecisionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取质检方案</p>
     * 
     * @param request GetQualityCheckSchemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityCheckSchemeResponse
     */
    public GetQualityCheckSchemeResponse getQualityCheckSchemeWithOptions(GetQualityCheckSchemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("jsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityCheckScheme"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityCheckSchemeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取质检方案</p>
     * 
     * @param request GetQualityCheckSchemeRequest
     * @return GetQualityCheckSchemeResponse
     */
    public GetQualityCheckSchemeResponse getQualityCheckScheme(GetQualityCheckSchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityCheckSchemeWithOptions(request, runtime);
    }

    /**
     * @param request GetResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResultResponse
     */
    public GetResultResponse getResultWithOptions(GetResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResult"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResultResponse());
    }

    /**
     * @param request GetResultRequest
     * @return GetResultResponse
     */
    public GetResultResponse getResult(GetResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取质检结果详情用于复核</p>
     * 
     * @param request GetResultToReviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResultToReviewResponse
     */
    public GetResultToReviewResponse getResultToReviewWithOptions(GetResultToReviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResultToReview"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResultToReviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取质检结果详情用于复核</p>
     * 
     * @param request GetResultToReviewRequest
     * @return GetResultToReviewResponse
     */
    public GetResultToReviewResponse getResultToReview(GetResultToReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResultToReviewWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI GetRule is deprecated, please use Qualitycheck::2019-01-15::GetRuleV4 instead.
     * 
     * @param request GetRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRuleResponse
     */
    @Deprecated
    // Deprecated
    public GetRuleResponse getRuleWithOptions(GetRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRule"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRuleResponse());
    }

    /**
     * @deprecated OpenAPI GetRule is deprecated, please use Qualitycheck::2019-01-15::GetRuleV4 instead.
     * 
     * @param request GetRuleRequest
     * @return GetRuleResponse
     */
    @Deprecated
    // Deprecated
    public GetRuleResponse getRule(GetRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取规则</p>
     * 
     * @deprecated OpenAPI GetRuleById is deprecated, please use Qualitycheck::2019-01-15::GetRuleV4 instead.
     * 
     * @param request GetRuleByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRuleByIdResponse
     */
    @Deprecated
    // Deprecated
    public GetRuleByIdResponse getRuleByIdWithOptions(GetRuleByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRuleById"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRuleByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取规则</p>
     * 
     * @deprecated OpenAPI GetRuleById is deprecated, please use Qualitycheck::2019-01-15::GetRuleV4 instead.
     * 
     * @param request GetRuleByIdRequest
     * @return GetRuleByIdResponse
     */
    @Deprecated
    // Deprecated
    public GetRuleByIdResponse getRuleById(GetRuleByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRuleByIdWithOptions(request, runtime);
    }

    /**
     * @param request GetRuleCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRuleCategoryResponse
     */
    public GetRuleCategoryResponse getRuleCategoryWithOptions(GetRuleCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRuleCategory"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRuleCategoryResponse());
    }

    /**
     * @param request GetRuleCategoryRequest
     * @return GetRuleCategoryResponse
     */
    public GetRuleCategoryResponse getRuleCategory(GetRuleCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRuleCategoryWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI GetRuleDetail is deprecated, please use Qualitycheck::2019-01-15::GetRuleV4 instead.
     * 
     * @param request GetRuleDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRuleDetailResponse
     */
    @Deprecated
    // Deprecated
    public GetRuleDetailResponse getRuleDetailWithOptions(GetRuleDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRuleDetail"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRuleDetailResponse());
    }

    /**
     * @deprecated OpenAPI GetRuleDetail is deprecated, please use Qualitycheck::2019-01-15::GetRuleV4 instead.
     * 
     * @param request GetRuleDetailRequest
     * @return GetRuleDetailResponse
     */
    @Deprecated
    // Deprecated
    public GetRuleDetailResponse getRuleDetail(GetRuleDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRuleDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>V4获取规则</p>
     * 
     * @param request GetRuleV4Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRuleV4Response
     */
    public GetRuleV4Response getRuleV4WithOptions(GetRuleV4Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRuleV4"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRuleV4Response());
    }

    /**
     * <b>summary</b> : 
     * <p>V4获取规则</p>
     * 
     * @param request GetRuleV4Request
     * @return GetRuleV4Response
     */
    public GetRuleV4Response getRuleV4(GetRuleV4Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRuleV4WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得规则列表</p>
     * 
     * @param request GetRulesCountListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRulesCountListResponse
     */
    public GetRulesCountListResponse getRulesCountListWithOptions(GetRulesCountListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessName)) {
            body.put("BusinessName", request.businessName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessRange)) {
            body.put("BusinessRange", request.businessRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryName)) {
            body.put("CategoryName", request.categoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countTotal)) {
            body.put("CountTotal", request.countTotal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createEmpid)) {
            body.put("CreateEmpid", request.createEmpid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createUserId)) {
            body.put("CreateUserId", request.createUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastUpdateEmpid)) {
            body.put("LastUpdateEmpid", request.lastUpdateEmpid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireInfos)) {
            body.put("RequireInfos", request.requireInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rid)) {
            body.put("Rid", request.rid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleIdOrRuleName)) {
            body.put("RuleIdOrRuleName", request.ruleIdOrRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleScoreSingleType)) {
            body.put("RuleScoreSingleType", request.ruleScoreSingleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            body.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemeId)) {
            body.put("SchemeId", request.schemeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeName)) {
            body.put("TypeName", request.typeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateEndTime)) {
            body.put("UpdateEndTime", request.updateEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStartTime)) {
            body.put("UpdateStartTime", request.updateStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateUserId)) {
            body.put("UpdateUserId", request.updateUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRulesCountList"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRulesCountListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获得规则列表</p>
     * 
     * @param request GetRulesCountListRequest
     * @return GetRulesCountListResponse
     */
    public GetRulesCountListResponse getRulesCountList(GetRulesCountListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRulesCountListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取质检任务配置详情</p>
     * 
     * @param request GetSchemeTaskConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSchemeTaskConfigResponse
     */
    public GetSchemeTaskConfigResponse getSchemeTaskConfigWithOptions(GetSchemeTaskConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSchemeTaskConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSchemeTaskConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取质检任务配置详情</p>
     * 
     * @param request GetSchemeTaskConfigRequest
     * @return GetSchemeTaskConfigResponse
     */
    public GetSchemeTaskConfigResponse getSchemeTaskConfig(GetSchemeTaskConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSchemeTaskConfigWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI GetScoreInfo is deprecated
     * 
     * @param request GetScoreInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScoreInfoResponse
     */
    @Deprecated
    // Deprecated
    public GetScoreInfoResponse getScoreInfoWithOptions(GetScoreInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScoreInfo"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScoreInfoResponse());
    }

    /**
     * @deprecated OpenAPI GetScoreInfo is deprecated
     * 
     * @param request GetScoreInfoRequest
     * @return GetScoreInfoResponse
     */
    @Deprecated
    // Deprecated
    public GetScoreInfoResponse getScoreInfo(GetScoreInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScoreInfoWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI GetSkillGroupConfig is deprecated
     * 
     * @param request GetSkillGroupConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillGroupConfigResponse
     */
    @Deprecated
    // Deprecated
    public GetSkillGroupConfigResponse getSkillGroupConfigWithOptions(GetSkillGroupConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillGroupConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillGroupConfigResponse());
    }

    /**
     * @deprecated OpenAPI GetSkillGroupConfig is deprecated
     * 
     * @param request GetSkillGroupConfigRequest
     * @return GetSkillGroupConfigResponse
     */
    @Deprecated
    // Deprecated
    public GetSkillGroupConfigResponse getSkillGroupConfig(GetSkillGroupConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillGroupConfigWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI GetSyncResult is deprecated, please use Qualitycheck::2019-01-15::GetResult instead.
     * 
     * @param request GetSyncResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSyncResultResponse
     */
    @Deprecated
    // Deprecated
    public GetSyncResultResponse getSyncResultWithOptions(GetSyncResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSyncResult"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSyncResultResponse());
    }

    /**
     * @deprecated OpenAPI GetSyncResult is deprecated, please use Qualitycheck::2019-01-15::GetResult instead.
     * 
     * @param request GetSyncResultRequest
     * @return GetSyncResultResponse
     */
    @Deprecated
    // Deprecated
    public GetSyncResultResponse getSyncResult(GetSyncResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSyncResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预警策略-详情</p>
     * 
     * @param request GetWarningStrategyConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWarningStrategyConfigResponse
     */
    public GetWarningStrategyConfigResponse getWarningStrategyConfigWithOptions(GetWarningStrategyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWarningStrategyConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWarningStrategyConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预警策略-详情</p>
     * 
     * @param request GetWarningStrategyConfigRequest
     * @return GetWarningStrategyConfigResponse
     */
    public GetWarningStrategyConfigResponse getWarningStrategyConfig(GetWarningStrategyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWarningStrategyConfigWithOptions(request, runtime);
    }

    /**
     * @param request HandleComplaintRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return HandleComplaintResponse
     */
    public HandleComplaintResponse handleComplaintWithOptions(HandleComplaintRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HandleComplaint"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HandleComplaintResponse());
    }

    /**
     * @param request HandleComplaintRequest
     * @return HandleComplaintResponse
     */
    public HandleComplaintResponse handleComplaint(HandleComplaintRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.handleComplaintWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI InvalidRule is deprecated, please use Qualitycheck::2019-01-15::DeleteRuleV4 instead.
     * 
     * @param request InvalidRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvalidRuleResponse
     */
    @Deprecated
    // Deprecated
    public InvalidRuleResponse invalidRuleWithOptions(InvalidRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvalidRule"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvalidRuleResponse());
    }

    /**
     * @deprecated OpenAPI InvalidRule is deprecated, please use Qualitycheck::2019-01-15::DeleteRuleV4 instead.
     * 
     * @param request InvalidRuleRequest
     * @return InvalidRuleResponse
     */
    @Deprecated
    // Deprecated
    public InvalidRuleResponse invalidRule(InvalidRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.invalidRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取热词模型列表</p>
     * 
     * @param request ListAsrVocabRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAsrVocabResponse
     */
    public ListAsrVocabResponse listAsrVocabWithOptions(ListAsrVocabRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAsrVocab"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAsrVocabResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取热词模型列表</p>
     * 
     * @param request ListAsrVocabRequest
     * @return ListAsrVocabResponse
     */
    public ListAsrVocabResponse listAsrVocab(ListAsrVocabRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAsrVocabWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集列表</p>
     * 
     * @deprecated OpenAPI ListDataSet is deprecated
     * 
     * @param request ListDataSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSetResponse
     */
    @Deprecated
    // Deprecated
    public ListDataSetResponse listDataSetWithOptions(ListDataSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSet"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集列表</p>
     * 
     * @deprecated OpenAPI ListDataSet is deprecated
     * 
     * @param request ListDataSetRequest
     * @return ListDataSetResponse
     */
    @Deprecated
    // Deprecated
    public ListDataSetResponse listDataSet(ListDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSetWithOptions(request, runtime);
    }

    /**
     * @param request ListPrecisionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrecisionTaskResponse
     */
    public ListPrecisionTaskResponse listPrecisionTaskWithOptions(ListPrecisionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrecisionTask"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrecisionTaskResponse());
    }

    /**
     * @param request ListPrecisionTaskRequest
     * @return ListPrecisionTaskResponse
     */
    public ListPrecisionTaskResponse listPrecisionTask(ListPrecisionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrecisionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>质检方案列表</p>
     * 
     * @param request ListQualityCheckSchemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQualityCheckSchemeResponse
     */
    public ListQualityCheckSchemeResponse listQualityCheckSchemeWithOptions(ListQualityCheckSchemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQualityCheckScheme"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQualityCheckSchemeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>质检方案列表</p>
     * 
     * @param request ListQualityCheckSchemeRequest
     * @return ListQualityCheckSchemeResponse
     */
    public ListQualityCheckSchemeResponse listQualityCheckScheme(ListQualityCheckSchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityCheckSchemeWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI ListRules is deprecated, please use Qualitycheck::2019-01-15::ListRulesV4 instead.
     * 
     * @param request ListRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRulesResponse
     */
    @Deprecated
    // Deprecated
    public ListRulesResponse listRulesWithOptions(ListRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRules"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRulesResponse());
    }

    /**
     * @deprecated OpenAPI ListRules is deprecated, please use Qualitycheck::2019-01-15::ListRulesV4 instead.
     * 
     * @param request ListRulesRequest
     * @return ListRulesResponse
     */
    @Deprecated
    // Deprecated
    public ListRulesResponse listRules(ListRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>V4获得规则列表</p>
     * 
     * @param request ListRulesV4Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRulesV4Response
     */
    public ListRulesV4Response listRulesV4WithOptions(ListRulesV4Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessName)) {
            body.put("BusinessName", request.businessName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessRange)) {
            body.put("BusinessRange", request.businessRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryName)) {
            body.put("CategoryName", request.categoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countTotal)) {
            body.put("CountTotal", request.countTotal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createEmpid)) {
            body.put("CreateEmpid", request.createEmpid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createUserId)) {
            body.put("CreateUserId", request.createUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastUpdateEmpid)) {
            body.put("LastUpdateEmpid", request.lastUpdateEmpid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireInfos)) {
            body.put("RequireInfos", request.requireInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rid)) {
            body.put("Rid", request.rid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleIdOrRuleName)) {
            body.put("RuleIdOrRuleName", request.ruleIdOrRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleScoreSingleType)) {
            body.put("RuleScoreSingleType", request.ruleScoreSingleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            body.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemeId)) {
            body.put("SchemeId", request.schemeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeName)) {
            body.put("TypeName", request.typeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateEndTime)) {
            body.put("UpdateEndTime", request.updateEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStartTime)) {
            body.put("UpdateStartTime", request.updateStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateUserId)) {
            body.put("UpdateUserId", request.updateUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRulesV4"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRulesV4Response());
    }

    /**
     * <b>summary</b> : 
     * <p>V4获得规则列表</p>
     * 
     * @param request ListRulesV4Request
     * @return ListRulesV4Response
     */
    public ListRulesV4Response listRulesV4(ListRulesV4Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRulesV4WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取质检任务列表</p>
     * 
     * @param request ListSchemeTaskConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSchemeTaskConfigResponse
     */
    public ListSchemeTaskConfigResponse listSchemeTaskConfigWithOptions(ListSchemeTaskConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("jsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSchemeTaskConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSchemeTaskConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取质检任务列表</p>
     * 
     * @param request ListSchemeTaskConfigRequest
     * @return ListSchemeTaskConfigResponse
     */
    public ListSchemeTaskConfigResponse listSchemeTaskConfig(ListSchemeTaskConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSchemeTaskConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取会话组列表</p>
     * 
     * @deprecated OpenAPI ListSessionGroup is deprecated
     * 
     * @param request ListSessionGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSessionGroupResponse
     */
    @Deprecated
    // Deprecated
    public ListSessionGroupResponse listSessionGroupWithOptions(ListSessionGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("jsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSessionGroup"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSessionGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取会话组列表</p>
     * 
     * @deprecated OpenAPI ListSessionGroup is deprecated
     * 
     * @param request ListSessionGroupRequest
     * @return ListSessionGroupResponse
     */
    @Deprecated
    // Deprecated
    public ListSessionGroupResponse listSessionGroup(ListSessionGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSessionGroupWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI ListSkillGroupConfig is deprecated
     * 
     * @param request ListSkillGroupConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillGroupConfigResponse
     */
    @Deprecated
    // Deprecated
    public ListSkillGroupConfigResponse listSkillGroupConfigWithOptions(ListSkillGroupConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkillGroupConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillGroupConfigResponse());
    }

    /**
     * @deprecated OpenAPI ListSkillGroupConfig is deprecated
     * 
     * @param request ListSkillGroupConfigRequest
     * @return ListSkillGroupConfigResponse
     */
    @Deprecated
    // Deprecated
    public ListSkillGroupConfigResponse listSkillGroupConfig(ListSkillGroupConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillGroupConfigWithOptions(request, runtime);
    }

    /**
     * @param request ListTaskAssignRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskAssignRulesResponse
     */
    public ListTaskAssignRulesResponse listTaskAssignRulesWithOptions(ListTaskAssignRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskAssignRules"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskAssignRulesResponse());
    }

    /**
     * @param request ListTaskAssignRulesRequest
     * @return ListTaskAssignRulesResponse
     */
    public ListTaskAssignRulesResponse listTaskAssignRules(ListTaskAssignRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskAssignRulesWithOptions(request, runtime);
    }

    /**
     * @param request ListUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    /**
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    /**
     * @param request ListWarningConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWarningConfigResponse
     */
    public ListWarningConfigResponse listWarningConfigWithOptions(ListWarningConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWarningConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWarningConfigResponse());
    }

    /**
     * @param request ListWarningConfigRequest
     * @return ListWarningConfigResponse
     */
    public ListWarningConfigResponse listWarningConfig(ListWarningConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWarningConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预警策略-列表</p>
     * 
     * @param request ListWarningStrategyConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWarningStrategyConfigResponse
     */
    public ListWarningStrategyConfigResponse listWarningStrategyConfigWithOptions(ListWarningStrategyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWarningStrategyConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWarningStrategyConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预警策略-列表</p>
     * 
     * @param request ListWarningStrategyConfigRequest
     * @return ListWarningStrategyConfigResponse
     */
    public ListWarningStrategyConfigResponse listWarningStrategyConfig(ListWarningStrategyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWarningStrategyConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量回收</p>
     * 
     * @param request RevertAssignedSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevertAssignedSessionResponse
     */
    public RevertAssignedSessionResponse revertAssignedSessionWithOptions(RevertAssignedSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("jsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevertAssignedSession"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevertAssignedSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量回收</p>
     * 
     * @param request RevertAssignedSessionRequest
     * @return RevertAssignedSessionResponse
     */
    public RevertAssignedSessionResponse revertAssignedSession(RevertAssignedSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revertAssignedSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>会话组批量回收</p>
     * 
     * @deprecated OpenAPI RevertAssignedSessionGroup is deprecated
     * 
     * @param request RevertAssignedSessionGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevertAssignedSessionGroupResponse
     */
    @Deprecated
    // Deprecated
    public RevertAssignedSessionGroupResponse revertAssignedSessionGroupWithOptions(RevertAssignedSessionGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("jsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevertAssignedSessionGroup"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevertAssignedSessionGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>会话组批量回收</p>
     * 
     * @deprecated OpenAPI RevertAssignedSessionGroup is deprecated
     * 
     * @param request RevertAssignedSessionGroupRequest
     * @return RevertAssignedSessionGroupResponse
     */
    @Deprecated
    // Deprecated
    public RevertAssignedSessionGroupResponse revertAssignedSessionGroup(RevertAssignedSessionGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revertAssignedSessionGroupWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI SaveConfigDataSet is deprecated
     * 
     * @param request SaveConfigDataSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveConfigDataSetResponse
     */
    @Deprecated
    // Deprecated
    public SaveConfigDataSetResponse saveConfigDataSetWithOptions(SaveConfigDataSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveConfigDataSet"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveConfigDataSetResponse());
    }

    /**
     * @deprecated OpenAPI SaveConfigDataSet is deprecated
     * 
     * @param request SaveConfigDataSetRequest
     * @return SaveConfigDataSetResponse
     */
    @Deprecated
    // Deprecated
    public SaveConfigDataSetResponse saveConfigDataSet(SaveConfigDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveConfigDataSetWithOptions(request, runtime);
    }

    /**
     * @param request SubmitComplaintRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitComplaintResponse
     */
    public SubmitComplaintResponse submitComplaintWithOptions(SubmitComplaintRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitComplaint"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitComplaintResponse());
    }

    /**
     * @param request SubmitComplaintRequest
     * @return SubmitComplaintResponse
     */
    public SubmitComplaintResponse submitComplaint(SubmitComplaintRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitComplaintWithOptions(request, runtime);
    }

    /**
     * @param request SubmitPrecisionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitPrecisionTaskResponse
     */
    public SubmitPrecisionTaskResponse submitPrecisionTaskWithOptions(SubmitPrecisionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitPrecisionTask"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitPrecisionTaskResponse());
    }

    /**
     * @param request SubmitPrecisionTaskRequest
     * @return SubmitPrecisionTaskResponse
     */
    public SubmitPrecisionTaskResponse submitPrecisionTask(SubmitPrecisionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitPrecisionTaskWithOptions(request, runtime);
    }

    /**
     * @param request SubmitQualityCheckTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitQualityCheckTaskResponse
     */
    public SubmitQualityCheckTaskResponse submitQualityCheckTaskWithOptions(SubmitQualityCheckTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitQualityCheckTask"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitQualityCheckTaskResponse());
    }

    /**
     * @param request SubmitQualityCheckTaskRequest
     * @return SubmitQualityCheckTaskResponse
     */
    public SubmitQualityCheckTaskResponse submitQualityCheckTask(SubmitQualityCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitQualityCheckTaskWithOptions(request, runtime);
    }

    /**
     * @param request SubmitReviewInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitReviewInfoResponse
     */
    public SubmitReviewInfoResponse submitReviewInfoWithOptions(SubmitReviewInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitReviewInfo"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitReviewInfoResponse());
    }

    /**
     * @param request SubmitReviewInfoRequest
     * @return SubmitReviewInfoResponse
     */
    public SubmitReviewInfoResponse submitReviewInfo(SubmitReviewInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitReviewInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交复核结果v4</p>
     * 
     * @param request SubmitReviewInfoV4Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitReviewInfoV4Response
     */
    public SubmitReviewInfoV4Response submitReviewInfoV4WithOptions(SubmitReviewInfoV4Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            body.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            body.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitReviewInfoV4"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitReviewInfoV4Response());
    }

    /**
     * <b>summary</b> : 
     * <p>提交复核结果v4</p>
     * 
     * @param request SubmitReviewInfoV4Request
     * @return SubmitReviewInfoV4Response
     */
    public SubmitReviewInfoV4Response submitReviewInfoV4(SubmitReviewInfoV4Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitReviewInfoV4WithOptions(request, runtime);
    }

    /**
     * @param request SyncQualityCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncQualityCheckResponse
     */
    public SyncQualityCheckResponse syncQualityCheckWithOptions(SyncQualityCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncQualityCheck"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncQualityCheckResponse());
    }

    /**
     * @param request SyncQualityCheckRequest
     * @return SyncQualityCheckResponse
     */
    public SyncQualityCheckResponse syncQualityCheck(SyncQualityCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncQualityCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>测试规则</p>
     * 
     * @param request TestRuleV4Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return TestRuleV4Response
     */
    public TestRuleV4Response testRuleV4WithOptions(TestRuleV4Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isSchemeData)) {
            body.put("IsSchemeData", request.isSchemeData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testJson)) {
            body.put("TestJson", request.testJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestRuleV4"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestRuleV4Response());
    }

    /**
     * <b>summary</b> : 
     * <p>测试规则</p>
     * 
     * @param request TestRuleV4Request
     * @return TestRuleV4Response
     */
    public TestRuleV4Response testRuleV4(TestRuleV4Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testRuleV4WithOptions(request, runtime);
    }

    /**
     * @param request UpdateAsrVocabRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAsrVocabResponse
     */
    public UpdateAsrVocabResponse updateAsrVocabWithOptions(UpdateAsrVocabRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAsrVocab"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAsrVocabResponse());
    }

    /**
     * @param request UpdateAsrVocabRequest
     * @return UpdateAsrVocabResponse
     */
    public UpdateAsrVocabResponse updateAsrVocab(UpdateAsrVocabRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAsrVocabWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新质检方案中的质检维度</p>
     * 
     * @param request UpdateCheckTypeToSchemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCheckTypeToSchemeResponse
     */
    public UpdateCheckTypeToSchemeResponse updateCheckTypeToSchemeWithOptions(UpdateCheckTypeToSchemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("jsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCheckTypeToScheme"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCheckTypeToSchemeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新质检方案中的质检维度</p>
     * 
     * @param request UpdateCheckTypeToSchemeRequest
     * @return UpdateCheckTypeToSchemeResponse
     */
    public UpdateCheckTypeToSchemeResponse updateCheckTypeToScheme(UpdateCheckTypeToSchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCheckTypeToSchemeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新会话随录数据</p>
     * 
     * @param request UpdateQualityCheckDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQualityCheckDataResponse
     */
    public UpdateQualityCheckDataResponse updateQualityCheckDataWithOptions(UpdateQualityCheckDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQualityCheckData"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQualityCheckDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新会话随录数据</p>
     * 
     * @param request UpdateQualityCheckDataRequest
     * @return UpdateQualityCheckDataResponse
     */
    public UpdateQualityCheckDataResponse updateQualityCheckData(UpdateQualityCheckDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQualityCheckDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新质检方案</p>
     * 
     * @param request UpdateQualityCheckSchemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQualityCheckSchemeResponse
     */
    public UpdateQualityCheckSchemeResponse updateQualityCheckSchemeWithOptions(UpdateQualityCheckSchemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("jsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQualityCheckScheme"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQualityCheckSchemeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新质检方案</p>
     * 
     * @param request UpdateQualityCheckSchemeRequest
     * @return UpdateQualityCheckSchemeResponse
     */
    public UpdateQualityCheckSchemeResponse updateQualityCheckScheme(UpdateQualityCheckSchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQualityCheckSchemeWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI UpdateRule is deprecated, please use Qualitycheck::2019-01-15::UpdateRuleV4 instead.
     * 
     * @param request UpdateRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRuleResponse
     */
    @Deprecated
    // Deprecated
    public UpdateRuleResponse updateRuleWithOptions(UpdateRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRule"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRuleResponse());
    }

    /**
     * @deprecated OpenAPI UpdateRule is deprecated, please use Qualitycheck::2019-01-15::UpdateRuleV4 instead.
     * 
     * @param request UpdateRuleRequest
     * @return UpdateRuleResponse
     */
    @Deprecated
    // Deprecated
    public UpdateRuleResponse updateRule(UpdateRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新规则</p>
     * 
     * @deprecated OpenAPI UpdateRuleById is deprecated, please use Qualitycheck::2019-01-15::UpdateRuleV4 instead.
     * 
     * @param request UpdateRuleByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRuleByIdResponse
     */
    @Deprecated
    // Deprecated
    public UpdateRuleByIdResponse updateRuleByIdWithOptions(UpdateRuleByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isCopy)) {
            body.put("IsCopy", request.isCopy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStrForRule)) {
            body.put("JsonStrForRule", request.jsonStrForRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnRelatedSchemes)) {
            body.put("ReturnRelatedSchemes", request.returnRelatedSchemes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRuleById"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRuleByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新规则</p>
     * 
     * @deprecated OpenAPI UpdateRuleById is deprecated, please use Qualitycheck::2019-01-15::UpdateRuleV4 instead.
     * 
     * @param request UpdateRuleByIdRequest
     * @return UpdateRuleByIdResponse
     */
    @Deprecated
    // Deprecated
    public UpdateRuleByIdResponse updateRuleById(UpdateRuleByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRuleByIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新质检方案的规则</p>
     * 
     * @param request UpdateRuleToSchemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRuleToSchemeResponse
     */
    public UpdateRuleToSchemeResponse updateRuleToSchemeWithOptions(UpdateRuleToSchemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("jsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRuleToScheme"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRuleToSchemeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新质检方案的规则</p>
     * 
     * @param request UpdateRuleToSchemeRequest
     * @return UpdateRuleToSchemeResponse
     */
    public UpdateRuleToSchemeResponse updateRuleToScheme(UpdateRuleToSchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRuleToSchemeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>V4更新规则</p>
     * 
     * @param request UpdateRuleV4Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRuleV4Response
     */
    public UpdateRuleV4Response updateRuleV4WithOptions(UpdateRuleV4Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jsonStrForRule)) {
            body.put("JsonStrForRule", request.jsonStrForRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRuleV4"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRuleV4Response());
    }

    /**
     * <b>summary</b> : 
     * <p>V4更新规则</p>
     * 
     * @param request UpdateRuleV4Request
     * @return UpdateRuleV4Response
     */
    public UpdateRuleV4Response updateRuleV4(UpdateRuleV4Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRuleV4WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新质检任务</p>
     * 
     * @param request UpdateSchemeTaskConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSchemeTaskConfigResponse
     */
    public UpdateSchemeTaskConfigResponse updateSchemeTaskConfigWithOptions(UpdateSchemeTaskConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("jsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSchemeTaskConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSchemeTaskConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新质检任务</p>
     * 
     * @param request UpdateSchemeTaskConfigRequest
     * @return UpdateSchemeTaskConfigResponse
     */
    public UpdateSchemeTaskConfigResponse updateSchemeTaskConfig(UpdateSchemeTaskConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSchemeTaskConfigWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI UpdateSkillGroupConfig is deprecated
     * 
     * @param request UpdateSkillGroupConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSkillGroupConfigResponse
     */
    @Deprecated
    // Deprecated
    public UpdateSkillGroupConfigResponse updateSkillGroupConfigWithOptions(UpdateSkillGroupConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSkillGroupConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSkillGroupConfigResponse());
    }

    /**
     * @deprecated OpenAPI UpdateSkillGroupConfig is deprecated
     * 
     * @param request UpdateSkillGroupConfigRequest
     * @return UpdateSkillGroupConfigResponse
     */
    @Deprecated
    // Deprecated
    public UpdateSkillGroupConfigResponse updateSkillGroupConfig(UpdateSkillGroupConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSkillGroupConfigWithOptions(request, runtime);
    }

    /**
     * @param request UpdateSyncQualityCheckDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSyncQualityCheckDataResponse
     */
    public UpdateSyncQualityCheckDataResponse updateSyncQualityCheckDataWithOptions(UpdateSyncQualityCheckDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSyncQualityCheckData"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSyncQualityCheckDataResponse());
    }

    /**
     * @param request UpdateSyncQualityCheckDataRequest
     * @return UpdateSyncQualityCheckDataResponse
     */
    public UpdateSyncQualityCheckDataResponse updateSyncQualityCheckData(UpdateSyncQualityCheckDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSyncQualityCheckDataWithOptions(request, runtime);
    }

    /**
     * @param request UpdateTaskAssignRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskAssignRuleResponse
     */
    public UpdateTaskAssignRuleResponse updateTaskAssignRuleWithOptions(UpdateTaskAssignRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskAssignRule"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskAssignRuleResponse());
    }

    /**
     * @param request UpdateTaskAssignRuleRequest
     * @return UpdateTaskAssignRuleResponse
     */
    public UpdateTaskAssignRuleResponse updateTaskAssignRule(UpdateTaskAssignRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskAssignRuleWithOptions(request, runtime);
    }

    /**
     * @param request UpdateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserResponse());
    }

    /**
     * @param request UpdateUserRequest
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }

    /**
     * @param request UpdateWarningConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWarningConfigResponse
     */
    public UpdateWarningConfigResponse updateWarningConfigWithOptions(UpdateWarningConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWarningConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWarningConfigResponse());
    }

    /**
     * @param request UpdateWarningConfigRequest
     * @return UpdateWarningConfigResponse
     */
    public UpdateWarningConfigResponse updateWarningConfig(UpdateWarningConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWarningConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预警策略-更新</p>
     * 
     * @param request UpdateWarningStrategyConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWarningStrategyConfigResponse
     */
    public UpdateWarningStrategyConfigResponse updateWarningStrategyConfigWithOptions(UpdateWarningStrategyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWarningStrategyConfig"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWarningStrategyConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预警策略-更新</p>
     * 
     * @param request UpdateWarningStrategyConfigRequest
     * @return UpdateWarningStrategyConfigResponse
     */
    public UpdateWarningStrategyConfigResponse updateWarningStrategyConfig(UpdateWarningStrategyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWarningStrategyConfigWithOptions(request, runtime);
    }

    /**
     * @param request UploadAudioDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadAudioDataResponse
     */
    public UploadAudioDataResponse uploadAudioDataWithOptions(UploadAudioDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadAudioData"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadAudioDataResponse());
    }

    /**
     * @param request UploadAudioDataRequest
     * @return UploadAudioDataResponse
     */
    public UploadAudioDataResponse uploadAudioData(UploadAudioDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadAudioDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推荐使用UploadDataV4接口,支持更长的JsonStr,但仅支持POST方法.</p>
     * 
     * @deprecated OpenAPI UploadData is deprecated, please use Qualitycheck::2019-01-15::UploadDataV4 instead.
     * 
     * @param request UploadDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadDataResponse
     */
    @Deprecated
    // Deprecated
    public UploadDataResponse uploadDataWithOptions(UploadDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadData"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>推荐使用UploadDataV4接口,支持更长的JsonStr,但仅支持POST方法.</p>
     * 
     * @deprecated OpenAPI UploadData is deprecated, please use Qualitycheck::2019-01-15::UploadDataV4 instead.
     * 
     * @param request UploadDataRequest
     * @return UploadDataResponse
     */
    @Deprecated
    // Deprecated
    public UploadDataResponse uploadData(UploadDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>http_hsf</p>
     * 
     * @param request UploadDataSyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadDataSyncResponse
     */
    public UploadDataSyncResponse uploadDataSyncWithOptions(UploadDataSyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadDataSync"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadDataSyncResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>http_hsf</p>
     * 
     * @param request UploadDataSyncRequest
     * @return UploadDataSyncResponse
     */
    public UploadDataSyncResponse uploadDataSync(UploadDataSyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadDataSyncWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>http_hsf</p>
     * 
     * @param request UploadDataSyncForLLMRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadDataSyncForLLMResponse
     */
    public UploadDataSyncForLLMResponse uploadDataSyncForLLMWithOptions(UploadDataSyncForLLMRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadDataSyncForLLM"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadDataSyncForLLMResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>http_hsf</p>
     * 
     * @param request UploadDataSyncForLLMRequest
     * @return UploadDataSyncForLLMResponse
     */
    public UploadDataSyncForLLMResponse uploadDataSyncForLLM(UploadDataSyncForLLMRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadDataSyncForLLMWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>UploadDataV4</p>
     * 
     * @param request UploadDataV4Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadDataV4Response
     */
    public UploadDataV4Response uploadDataV4WithOptions(UploadDataV4Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            body.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            body.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadDataV4"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadDataV4Response());
    }

    /**
     * <b>summary</b> : 
     * <p>UploadDataV4</p>
     * 
     * @param request UploadDataV4Request
     * @return UploadDataV4Response
     */
    public UploadDataV4Response uploadDataV4(UploadDataV4Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadDataV4WithOptions(request, runtime);
    }

    /**
     * @param request UploadRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadRuleResponse
     */
    public UploadRuleResponse uploadRuleWithOptions(UploadRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadRule"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadRuleResponse());
    }

    /**
     * @param request UploadRuleRequest
     * @return UploadRuleResponse
     */
    public UploadRuleResponse uploadRule(UploadRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadRuleWithOptions(request, runtime);
    }

    /**
     * @param request VerifyFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyFileResponse
     */
    public VerifyFileResponse verifyFileWithOptions(VerifyFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyFile"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyFileResponse());
    }

    /**
     * @param request VerifyFileRequest
     * @return VerifyFileResponse
     */
    public VerifyFileResponse verifyFile(VerifyFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyFileWithOptions(request, runtime);
    }

    /**
     * @param request VerifySentenceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifySentenceResponse
     */
    public VerifySentenceResponse verifySentenceWithOptions(VerifySentenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            query.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            query.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifySentence"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifySentenceResponse());
    }

    /**
     * @param request VerifySentenceRequest
     * @return VerifySentenceResponse
     */
    public VerifySentenceResponse verifySentence(VerifySentenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifySentenceWithOptions(request, runtime);
    }
}

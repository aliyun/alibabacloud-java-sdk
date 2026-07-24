// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115;

import com.aliyun.tea.*;
import com.aliyun.qualitycheck20190115.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "qualitycheck.cn-hangzhou.aliyuncs.com")
        );
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
     * <b>summary</b> : 
     * <p>Adds a business category.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Adds a business category.</p>
     * 
     * @param request AddBusinessCategoryRequest
     * @return AddBusinessCategoryResponse
     */
    public AddBusinessCategoryResponse addBusinessCategory(AddBusinessCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBusinessCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add a rule category.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Add a rule category.</p>
     * 
     * @param request AddRuleCategoryRequest
     * @return AddRuleCategoryResponse
     */
    public AddRuleCategoryResponse addRuleCategory(AddRuleCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRuleCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation creates a rule on the Quality Inspection Rule Configuration page. For Apsara Stack, the URL is ip:port/api/client/UpdateRuleById.json.</p>
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
     * <p>This operation creates a rule on the Quality Inspection Rule Configuration page. For Apsara Stack, the URL is ip:port/api/client/UpdateRuleById.json.</p>
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
     * <p>Performs tag categorization.</p>
     * 
     * @param request AnalyzeLabelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AnalyzeLabelResponse
     */
    public AnalyzeLabelResponse analyzeLabelWithOptions(AnalyzeLabelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "AnalyzeLabel"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AnalyzeLabelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs tag categorization.</p>
     * 
     * @param request AnalyzeLabelRequest
     * @return AnalyzeLabelResponse
     */
    public AnalyzeLabelResponse analyzeLabel(AnalyzeLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.analyzeLabelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Apply for the token required for real-time speech processing.</p>
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
     * <p>Apply for the token required for real-time speech processing.</p>
     * 
     * @param request ApplyWsTokenRequest
     * @return ApplyWsTokenResponse
     */
    public ApplyWsTokenResponse applyWsToken(ApplyWsTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyWsTokenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can manually assign files that have completed quality inspection to reviewers. Assignments can be made one file at a time or in batches:
     * Single-file assignment: Assign a specific file to a specified reviewer.
     * Batch assignment: Assign multiple filtered files to one or more reviewers. You can specify how many files each reviewer receives, or let the system distribute the files evenly among reviewers.</p>
     * 
     * <b>summary</b> : 
     * <p>Manually assign quality reviewers.</p>
     * 
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
     * <b>description</b> :
     * <p>You can manually assign files that have completed quality inspection to reviewers. Assignments can be made one file at a time or in batches:
     * Single-file assignment: Assign a specific file to a specified reviewer.
     * Batch assignment: Assign multiple filtered files to one or more reviewers. You can specify how many files each reviewer receives, or let the system distribute the files evenly among reviewers.</p>
     * 
     * <b>summary</b> : 
     * <p>Manually assign quality reviewers.</p>
     * 
     * @param request AssignReviewerRequest
     * @return AssignReviewerResponse
     */
    public AssignReviewerResponse assignReviewer(AssignReviewerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assignReviewerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Frontend location: Quality Check Plan Management &gt; Task Results &gt; Session Groups &gt; Batch Assign. Apsara Stack URL: ip:port/api/job/AssignReviewerBySessionGroup.json.</p>
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
     * <p>Frontend location: Quality Check Plan Management &gt; Task Results &gt; Session Groups &gt; Batch Assign. Apsara Stack URL: ip:port/api/job/AssignReviewerBySessionGroup.json.</p>
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
     * <p>This operation implements the Batch Review feature, which is available in the frontend under Task Management &gt; Task Result.
     * For private cloud deployments, use the URL: ip:port/api/qcsBatchSubmitReviewInfo.json.
     * You can use this operation to perform a batch review on all filtered data.
     * Note: This operation updates a large volume of data. The changes may take some time to appear.</p>
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
     * <p>This operation implements the Batch Review feature, which is available in the frontend under Task Management &gt; Task Result.
     * For private cloud deployments, use the URL: ip:port/api/qcsBatchSubmitReviewInfo.json.
     * You can use this operation to perform a batch review on all filtered data.
     * Note: This operation updates a large volume of data. The changes may take some time to appear.</p>
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
     * <p>Creates an agent.</p>
     * 
     * @param request CreateAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentResponse
     */
    public CreateAgentResponse createAgentWithOptions(CreateAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CreateAgent"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an agent.</p>
     * 
     * @param request CreateAgentRequest
     * @return CreateAgentResponse
     */
    public CreateAgentResponse createAgent(CreateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an Agent batch task for conversation analysis. The application call supports HTTP calls to complete the customer response.</p>
     * 
     * @param request CreateAgentTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentTaskResponse
     */
    public CreateAgentTaskResponse createAgentTaskWithOptions(CreateAgentTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CreateAgentTask"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an Agent batch task for conversation analysis. The application call supports HTTP calls to complete the customer response.</p>
     * 
     * @param request CreateAgentTaskRequest
     * @return CreateAgentTaskResponse
     */
    public CreateAgentTaskResponse createAgentTask(CreateAgentTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAgentTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Hotwords help improve recognition accuracy for specific terms, such as names, place names, or technical terms. <a href="https://help.aliyun.com/document_detail/213249.html">Learn more</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Uploads a set of speech hotwords to the server and obtains the hotword ID in the response.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Hotwords help improve recognition accuracy for specific terms, such as names, place names, or technical terms. <a href="https://help.aliyun.com/document_detail/213249.html">Learn more</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Uploads a set of speech hotwords to the server and obtains the hotword ID in the response.</p>
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
     * <p>UI path: Quality Check Plan Management &gt; Add or Edit Quality Check Dimension &gt; Add Quality Check Dimension. Apsara Stack API endpoint: ip:port/api/qcs/CreateCheckTypeToScheme.json.</p>
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
     * <p>UI path: Quality Check Plan Management &gt; Add or Edit Quality Check Dimension &gt; Add Quality Check Dimension. Apsara Stack API endpoint: ip:port/api/qcs/CreateCheckTypeToScheme.json.</p>
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
     * <p>Creates a label mining task.</p>
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
     * <p>Creates a label mining task.</p>
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
     * <p>You can access this operation from the Quality Check Plan Management page in the console. The Apsara Stack endpoint is ip:port/api/qcs/CreateQualityCheckScheme.json.</p>
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
     * <p>You can access this operation from the Quality Check Plan Management page in the console. The Apsara Stack endpoint is ip:port/api/qcs/CreateQualityCheckScheme.json.</p>
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
     * <p>Corresponding frontend feature location: Plan Management &gt; Create Quality Inspection Job. Apsara Stack URL: ip:port/api/task/CreateSchemeTaskConfig.json.</p>
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
     * <p>Corresponding frontend feature location: Plan Management &gt; Create Quality Inspection Job. Apsara Stack URL: ip:port/api/task/CreateSchemeTaskConfig.json.</p>
     * 
     * @param request CreateSchemeTaskConfigRequest
     * @return CreateSchemeTaskConfigResponse
     */
    public CreateSchemeTaskConfigResponse createSchemeTaskConfig(CreateSchemeTaskConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSchemeTaskConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a configuration.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Create a configuration.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Creates a label node.</p>
     * 
     * @param request CreateTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTagResponse
     */
    public CreateTagResponse createTagWithOptions(CreateTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CreateTag"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a label node.</p>
     * 
     * @param request CreateTagRequest
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an automatic allocation rule for quality review tasks.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Creates an automatic allocation rule for quality review tasks.</p>
     * 
     * @param request CreateTaskAssignRuleRequest
     * @return CreateTaskAssignRuleResponse
     */
    public CreateTaskAssignRuleResponse createTaskAssignRule(CreateTaskAssignRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTaskAssignRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Alibaba Cloud uses Resource Access Management (RAM) for unified account management. Before you create a user in Smart Conversation Analysis, first create the user in <a href="https://ram.console.aliyun.com">RAM</a>. Then, obtain the user’s UID, username, and display name. Finally, add the RAM user to Smart Conversation Analysis to grant them access to the Smart Conversation Analysis service.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a user</p>
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
     * <b>description</b> :
     * <p>Alibaba Cloud uses Resource Access Management (RAM) for unified account management. Before you create a user in Smart Conversation Analysis, first create the user in <a href="https://ram.console.aliyun.com">RAM</a>. Then, obtain the user’s UID, username, and display name. Finally, add the RAM user to Smart Conversation Analysis to grant them access to the Smart Conversation Analysis service.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a user</p>
     * 
     * @param request CreateUserRequest
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a warning configuration.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Create a warning configuration.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a rule category.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a rule category.</p>
     * 
     * @param request DelRuleCategoryRequest
     * @return DelRuleCategoryResponse
     */
    public DelRuleCategoryResponse delRuleCategory(DelRuleCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.delRuleCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an agent.</p>
     * 
     * @param request DeleteAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgentWithOptions(DeleteAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteAgent"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an agent.</p>
     * 
     * @param request DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgent(DeleteAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a hotword group.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a hotword group.</p>
     * 
     * @param request DeleteAsrVocabRequest
     * @return DeleteAsrVocabResponse
     */
    public DeleteAsrVocabResponse deleteAsrVocab(DeleteAsrVocabRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAsrVocabWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a business category.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a business category.</p>
     * 
     * @param request DeleteBusinessCategoryRequest
     * @return DeleteBusinessCategoryResponse
     */
    public DeleteBusinessCategoryResponse deleteBusinessCategory(DeleteBusinessCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBusinessCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a dimension from a quality inspection scheme.</p>
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
     * <p>Deletes a dimension from a quality inspection scheme.</p>
     * 
     * @param request DeleteCheckTypeToSchemeRequest
     * @return DeleteCheckTypeToSchemeResponse
     */
    public DeleteCheckTypeToSchemeResponse deleteCheckTypeToScheme(DeleteCheckTypeToSchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCheckTypeToSchemeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a language model.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a language model.</p>
     * 
     * @param request DeleteCustomizationConfigRequest
     * @return DeleteCustomizationConfigResponse
     */
    public DeleteCustomizationConfigResponse deleteCustomizationConfig(DeleteCustomizationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomizationConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a dataset.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a dataset.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Delete a speech recognition quality check task.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Delete a speech recognition quality check task.</p>
     * 
     * @param request DeletePrecisionTaskRequest
     * @return DeletePrecisionTaskResponse
     */
    public DeletePrecisionTaskResponse deletePrecisionTask(DeletePrecisionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrecisionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can delete a quality check plan from the Quality Check Plan Management page by clicking the Delete button on the right side of the plan. The Apsara Stack API endpoint is ip:port/api/qcs/DeleteQualityCheckScheme.json.</p>
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
     * <p>You can delete a quality check plan from the Quality Check Plan Management page by clicking the Delete button on the right side of the plan. The Apsara Stack API endpoint is ip:port/api/qcs/DeleteQualityCheckScheme.json.</p>
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
     * <p>This operation deletes a quality check rule. You can access it from the Quality Check Rule Configuration page in the Apsara Stack console. The API endpoint is ip:port/api/client/DeleteRule.json.</p>
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
     * <p>This operation deletes a quality check rule. You can access it from the Quality Check Rule Configuration page in the Apsara Stack console. The API endpoint is ip:port/api/client/DeleteRule.json.</p>
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
     * <p>Frontend feature location: Quality Inspection Rule Configuration — Delete. Apsara Stack URL: ip:port/api/client/DeleteRule.json.</p>
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
     * <p>Frontend feature location: Quality Inspection Rule Configuration — Delete. Apsara Stack URL: ip:port/api/client/DeleteRule.json.</p>
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
     * <p>This feature is not available on the frontend. The Apsara Stack API endpoint is ip:port/api/task/DeleteSchemeTaskConfig.json.</p>
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
     * <p>This feature is not available on the frontend. The Apsara Stack API endpoint is ip:port/api/task/DeleteSchemeTaskConfig.json.</p>
     * 
     * @param request DeleteSchemeTaskConfigRequest
     * @return DeleteSchemeTaskConfigResponse
     */
    public DeleteSchemeTaskConfigResponse deleteSchemeTaskConfig(DeleteSchemeTaskConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSchemeTaskConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a configuration.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Delete a configuration.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a label node.</p>
     * 
     * @param request DeleteTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTagWithOptions(DeleteTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteTag"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a label node.</p>
     * 
     * @param request DeleteTagRequest
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an automatic allocation rule for review tasks.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes an automatic allocation rule for review tasks.</p>
     * 
     * @param request DeleteTaskAssignRuleRequest
     * @return DeleteTaskAssignRuleResponse
     */
    public DeleteTaskAssignRuleResponse deleteTaskAssignRule(DeleteTaskAssignRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTaskAssignRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a warning configuration.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a warning configuration.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Runs an agent.</p>
     * 
     * @param request ExecuteAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteAgentResponse
     */
    public ExecuteAgentResponse executeAgentWithOptions(ExecuteAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseMeAgentId)) {
            body.put("BaseMeAgentId", request.baseMeAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            body.put("JsonStr", request.jsonStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("Stream", request.stream);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteAgent"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Runs an agent.</p>
     * 
     * @param request ExecuteAgentRequest
     * @return ExecuteAgentResponse
     */
    public ExecuteAgentResponse executeAgent(ExecuteAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates labels.</p>
     * 
     * @param request GenerateLabelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateLabelResponse
     */
    public GenerateLabelResponse generateLabelWithOptions(GenerateLabelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GenerateLabel"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateLabelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generates labels.</p>
     * 
     * @param request GenerateLabelRequest
     * @return GenerateLabelResponse
     */
    public GenerateLabelResponse generateLabel(GenerateLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateLabelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an agent.</p>
     * 
     * @param request GetAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgentWithOptions(GetAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetAgent"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an agent.</p>
     * 
     * @param request GetAgentRequest
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgent(GetAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the task result of an agent node.</p>
     * 
     * @param request GetAgentTaskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentTaskResultResponse
     */
    public GetAgentTaskResultResponse getAgentTaskResultWithOptions(GetAgentTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetAgentTaskResult"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentTaskResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the task result of an agent node.</p>
     * 
     * @param request GetAgentTaskResultRequest
     * @return GetAgentTaskResultResponse
     */
    public GetAgentTaskResultResponse getAgentTaskResult(GetAgentTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentTaskResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves details for a specified hotword group.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves details for a specified hotword group.</p>
     * 
     * @param request GetAsrVocabRequest
     * @return GetAsrVocabResponse
     */
    public GetAsrVocabResponse getAsrVocab(GetAsrVocabRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsrVocabWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the list of applicable businesses.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Obtain the list of applicable businesses.</p>
     * 
     * @param request GetBusinessCategoryListRequest
     * @return GetBusinessCategoryListResponse
     */
    public GetBusinessCategoryListResponse getBusinessCategoryList(GetBusinessCategoryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBusinessCategoryListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of language models.</p>
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
     * <p>Retrieves a list of language models.</p>
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
     * <p>Queries the results of tag categorization analysis.</p>
     * 
     * @param request GetLabelAnalysisResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLabelAnalysisResultResponse
     */
    public GetLabelAnalysisResultResponse getLabelAnalysisResultWithOptions(GetLabelAnalysisResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetLabelAnalysisResult"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLabelAnalysisResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the results of tag categorization analysis.</p>
     * 
     * @param request GetLabelAnalysisResultRequest
     * @return GetLabelAnalysisResultResponse
     */
    public GetLabelAnalysisResultResponse getLabelAnalysisResult(GetLabelAnalysisResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLabelAnalysisResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the result of a label generation task.</p>
     * 
     * @param request GetLabelGeneratedResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLabelGeneratedResultResponse
     */
    public GetLabelGeneratedResultResponse getLabelGeneratedResultWithOptions(GetLabelGeneratedResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetLabelGeneratedResult"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLabelGeneratedResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the result of a label generation task.</p>
     * 
     * @param request GetLabelGeneratedResultRequest
     * @return GetLabelGeneratedResultResponse
     */
    public GetLabelGeneratedResultResponse getLabelGeneratedResult(GetLabelGeneratedResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLabelGeneratedResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the result of a tag mining task.</p>
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
     * <p>Retrieve the result of a tag mining task.</p>
     * 
     * @param request GetMiningTaskResultRequest
     * @return GetMiningTaskResultResponse
     */
    public GetMiningTaskResultResponse getMiningTaskResult(GetMiningTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMiningTaskResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the next file details for manual verification.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieve the next file details for manual verification.</p>
     * 
     * @param request GetNextResultToVerifyRequest
     * @return GetNextResultToVerifyResponse
     */
    public GetNextResultToVerifyResponse getNextResultToVerify(GetNextResultToVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNextResultToVerifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a (speech recognition) detection task.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves the details of a (speech recognition) detection task.</p>
     * 
     * @param request GetPrecisionTaskRequest
     * @return GetPrecisionTaskResponse
     */
    public GetPrecisionTaskResponse getPrecisionTask(GetPrecisionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPrecisionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation implements the query feature in quality check plan management on the frontend. The Apsara Stack URL is ip:port/api/qcs/GetQualityCheckScheme.json.</p>
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
     * <p>This operation implements the query feature in quality check plan management on the frontend. The Apsara Stack URL is ip:port/api/qcs/GetQualityCheckScheme.json.</p>
     * 
     * @param request GetQualityCheckSchemeRequest
     * @return GetQualityCheckSchemeResponse
     */
    public GetQualityCheckSchemeResponse getQualityCheckScheme(GetQualityCheckSchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityCheckSchemeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query data uploaded using <a href="https://help.aliyun.com/document_detail/139399.html">UploadAudioData</a> or <a href="https://help.aliyun.com/document_detail/111394.html">UploadData</a>. You can also query data from dataset-based quality inspection tasks created with <a href="https://help.aliyun.com/document_detail/158890.html">SubmitQualityCheckTask</a>. You can search by task ID (taskId) or by time range.</p>
     * 
     * <b>summary</b> : 
     * <p>Query quality inspection results. Some fields require the requiredFields parameter to be explicitly specified in the request. Set the service endpoint (Region) to Hangzhou (cn-hangzhou).</p>
     * 
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
     * <b>description</b> :
     * <p>You can query data uploaded using <a href="https://help.aliyun.com/document_detail/139399.html">UploadAudioData</a> or <a href="https://help.aliyun.com/document_detail/111394.html">UploadData</a>. You can also query data from dataset-based quality inspection tasks created with <a href="https://help.aliyun.com/document_detail/158890.html">SubmitQualityCheckTask</a>. You can search by task ID (taskId) or by time range.</p>
     * 
     * <b>summary</b> : 
     * <p>Query quality inspection results. Some fields require the requiredFields parameter to be explicitly specified in the request. Set the service endpoint (Region) to Hangzhou (cn-hangzhou).</p>
     * 
     * @param request GetResultRequest
     * @return GetResultResponse
     */
    public GetResultResponse getResult(GetResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the quality inspection results for a specified file. The response includes the transcript, audio URL, and details of detected rule hits. You can use this information to review the file by listening to the audio, reading the transcript, and locating where rules were triggered.</p>
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
     * <p>Retrieves the quality inspection results for a specified file. The response includes the transcript, audio URL, and details of detected rule hits. You can use this information to review the file by listening to the audio, reading the transcript, and locating where rules were triggered.</p>
     * 
     * @param request GetResultToReviewRequest
     * @return GetResultToReviewResponse
     */
    public GetResultToReviewResponse getResultToReview(GetResultToReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResultToReviewWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation returns basic rule information such as the <strong>id</strong> and <strong>name</strong>. You can use this information with <a href="https://help.aliyun.com/document_detail/142310.html">GetRuleDetails</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves basic information about rules.</p>
     * 
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
     * <b>description</b> :
     * <blockquote>
     * <p>This operation returns basic rule information such as the <strong>id</strong> and <strong>name</strong>. You can use this information with <a href="https://help.aliyun.com/document_detail/142310.html">GetRuleDetails</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves basic information about rules.</p>
     * 
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
     * <p>Retrieves the details of a specific quality inspection rule. It corresponds to the <strong>Edit</strong> action on the <strong>Quality Inspection Rule Configuration</strong> page. The URL for this operation in a private cloud is <code>ip:port/api/client/GetRuleById.json</code>.</p>
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
     * <p>Retrieves the details of a specific quality inspection rule. It corresponds to the <strong>Edit</strong> action on the <strong>Quality Inspection Rule Configuration</strong> page. The URL for this operation in a private cloud is <code>ip:port/api/client/GetRuleById.json</code>.</p>
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
     * <b>summary</b> : 
     * <p>Retrieves a list of rule types.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves a list of rule types.</p>
     * 
     * @param request GetRuleCategoryRequest
     * @return GetRuleCategoryResponse
     */
    public GetRuleCategoryResponse getRuleCategory(GetRuleCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRuleCategoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is used in conjunction with <a href="https://help.aliyun.com/document_detail/142333.html">Get basic rule information</a>. First, call the GetRule operation to obtain the rule ID. Then, use the rule ID as a parameter to call the <strong>GetRuleDetail</strong> operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the detailed information of a rule.</p>
     * 
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
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is used in conjunction with <a href="https://help.aliyun.com/document_detail/142333.html">Get basic rule information</a>. First, call the GetRule operation to obtain the rule ID. Then, use the rule ID as a parameter to call the <strong>GetRuleDetail</strong> operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the detailed information of a rule.</p>
     * 
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
     * <p>This API is located in the frontend at Quality Check Rule Configuration &gt; Query. The Apsara Stack URL is ip:port/api/client/GetRuleById.json.</p>
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
     * <p>This API is located in the frontend at Quality Check Rule Configuration &gt; Query. The Apsara Stack URL is ip:port/api/client/GetRuleById.json.</p>
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
     * <p>Corresponds to the frontend feature location: Quality Inspection Rule Configuration &gt; List. Apsara Stack URL: ip:port/api/rule/GetRulesCountList.json.</p>
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
     * <p>Corresponds to the frontend feature location: Quality Inspection Rule Configuration &gt; List. Apsara Stack URL: ip:port/api/rule/GetRulesCountList.json.</p>
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
     * <p>Obtain the configuration details of a quality inspection task.</p>
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
     * <p>Obtain the configuration details of a quality inspection task.</p>
     * 
     * @param request GetSchemeTaskConfigRequest
     * @return GetSchemeTaskConfigResponse
     */
    public GetSchemeTaskConfigResponse getSchemeTaskConfig(GetSchemeTaskConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSchemeTaskConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about all scoring items.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves information about all scoring items.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves the configuration that is specified by its ID.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves the configuration that is specified by its ID.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can obtain the real-time quality inspection result of the hotline.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can obtain the real-time quality inspection result of the hotline.</p>
     * 
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
     * <p>Queries the details of a label node.</p>
     * 
     * @param request GetTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTagResponse
     */
    public GetTagResponse getTagWithOptions(GetTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetTag"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a label node.</p>
     * 
     * @param request GetTagRequest
     * @return GetTagResponse
     */
    public GetTagResponse getTag(GetTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTagWithOptions(request, runtime);
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
     * <b>description</b> :
     * <p>Only quality checkers or administrators can call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Handles a complaint.</p>
     * 
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
     * <b>description</b> :
     * <p>Only quality checkers or administrators can call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Handles a complaint.</p>
     * 
     * @param request HandleComplaintRequest
     * @return HandleComplaintResponse
     */
    public HandleComplaintResponse handleComplaint(HandleComplaintRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.handleComplaintWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete rules.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Delete rules.</p>
     * 
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
     * <p>Retrieves a list of vocabulary groups without their specific content.</p>
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
     * <p>Retrieves a list of vocabulary groups without their specific content.</p>
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
     * <p>This feature is located in the Dataset management section of the frontend. The Apsara Stack URL is ip:port/api/dataset/ListDataSet.json.</p>
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
     * <p>This feature is located in the Dataset management section of the frontend. The Apsara Stack URL is ip:port/api/dataset/ListDataSet.json.</p>
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
     * <b>summary</b> : 
     * <p>Retrieve the list of speech recognition precision tasks. Set the service endpoint to Hangzhou (cn-hangzhou).</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieve the list of speech recognition precision tasks. Set the service endpoint to Hangzhou (cn-hangzhou).</p>
     * 
     * @param request ListPrecisionTaskRequest
     * @return ListPrecisionTaskResponse
     */
    public ListPrecisionTaskResponse listPrecisionTask(ListPrecisionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrecisionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of quality check schemes.</p>
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
     * <p>Retrieves a list of quality check schemes.</p>
     * 
     * @param request ListQualityCheckSchemeRequest
     * @return ListQualityCheckSchemeResponse
     */
    public ListQualityCheckSchemeResponse listQualityCheckScheme(ListQualityCheckSchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityCheckSchemeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists rules.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Lists rules.</p>
     * 
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
     * <p>Frontend location: Quality inspection rule configuration — List. Apsara Stack URL: ip:port/api/rule/GetRulesCountList.json.</p>
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
     * <p>Frontend location: Quality inspection rule configuration — List. Apsara Stack URL: ip:port/api/rule/GetRulesCountList.json.</p>
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
     * <p>This operation is used for the Task Management feature on the frontend. The Apsara Stack URL is ip:port/api/task/ListSchemeTaskInfo.json.</p>
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
     * <p>This operation is used for the Task Management feature on the frontend. The Apsara Stack URL is ip:port/api/task/ListSchemeTaskInfo.json.</p>
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
     * <p>This API corresponds to the frontend location: Task Management &gt; View Results &gt; Task Result &gt; Session Group Results tab. The Apsara Stack URL is: ip:port/api/session/group/ListSessionGroup.json. It aggregates multi-turn sessions by their session group ID for unified management. You must pass the <code>sessionGroupId</code> field. For more information, see the UploadData and UploadAudioData API documentation.</p>
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
     * <p>This API corresponds to the frontend location: Task Management &gt; View Results &gt; Task Result &gt; Session Group Results tab. The Apsara Stack URL is: ip:port/api/session/group/ListSessionGroup.json. It aggregates multi-turn sessions by their session group ID for unified management. You must pass the <code>sessionGroupId</code> field. For more information, see the UploadData and UploadAudioData API documentation.</p>
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
     * <b>summary</b> : 
     * <p>You can call ListSkillGroupConfig to obtain the configuration list.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can call ListSkillGroupConfig to obtain the configuration list.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the list of label nodes.</p>
     * 
     * @param request ListTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResponse
     */
    public ListTagResponse listTagWithOptions(ListTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListTag"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of label nodes.</p>
     * 
     * @param request ListTagRequest
     * @return ListTagResponse
     */
    public ListTagResponse listTag(ListTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists automatic allocation rules for review tasks.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Lists automatic allocation rules for review tasks.</p>
     * 
     * @param request ListTaskAssignRulesRequest
     * @return ListTaskAssignRulesResponse
     */
    public ListTaskAssignRulesResponse listTaskAssignRules(ListTaskAssignRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskAssignRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of users. Set the service endpoint to China (Hangzhou) (cn-hangzhou).</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves a list of users. Set the service endpoint to China (Hangzhou) (cn-hangzhou).</p>
     * 
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists warning configurations.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Lists warning configurations.</p>
     * 
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
     * <p>Frontend location: Task Management &gt; Task Results &gt; Batch Revoke. Apsara Stack URL: ip:port/api/job/RevertAssignedSession.json.</p>
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
     * <p>Frontend location: Task Management &gt; Task Results &gt; Batch Revoke. Apsara Stack URL: ip:port/api/job/RevertAssignedSession.json.</p>
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
     * <p>You can use this feature in the frontend console under Plan Management &gt; Task Result &gt; Session Group &gt; Batch Revoke. The Apsara Stack URL for this operation is <code>ip:port/api/job/RevertAssignedSessionGroup.json</code>.</p>
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
     * <p>You can use this feature in the frontend console under Plan Management &gt; Task Result &gt; Session Group &gt; Batch Revoke. The Apsara Stack URL for this operation is <code>ip:port/api/job/RevertAssignedSessionGroup.json</code>.</p>
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
     * <b>summary</b> : 
     * <p>This operation calls a large model using the message protocol to generate a response. You can make calls using standard HTTP for a complete response or use Server-Sent Events (SSE) for a streaming response.</p>
     * 
     * @param tmpReq RunCompletionMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunCompletionMessageResponse
     */
    public RunCompletionMessageResponse runCompletionMessageWithOptions(RunCompletionMessageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunCompletionMessageShrinkRequest request = new RunCompletionMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.messages)) {
            request.messagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.messages, "Messages", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messagesShrink)) {
            body.put("Messages", request.messagesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCode)) {
            body.put("ModelCode", request.modelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("Stream", request.stream);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunCompletionMessage"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunCompletionMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This operation calls a large model using the message protocol to generate a response. You can make calls using standard HTTP for a complete response or use Server-Sent Events (SSE) for a streaming response.</p>
     * 
     * @param request RunCompletionMessageRequest
     * @return RunCompletionMessageResponse
     */
    public RunCompletionMessageResponse runCompletionMessage(RunCompletionMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runCompletionMessageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Saves the speaker role configuration for a dataset.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Saves the speaker role configuration for a dataset.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Submits a complaint.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Submits a complaint.</p>
     * 
     * @param request SubmitComplaintRequest
     * @return SubmitComplaintResponse
     */
    public SubmitComplaintResponse submitComplaint(SubmitComplaintRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitComplaintWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a speech recognition evaluation task. The service endpoint is China East 1 (Hangzhou) (cn-hangzhou).</p>
     * 
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
     * <b>summary</b> : 
     * <p>Creates a speech recognition evaluation task. The service endpoint is China East 1 (Hangzhou) (cn-hangzhou).</p>
     * 
     * @param request SubmitPrecisionTaskRequest
     * @return SubmitPrecisionTaskResponse
     */
    public SubmitPrecisionTaskResponse submitPrecisionTask(SubmitPrecisionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitPrecisionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a new dataset quality check task.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Create a new dataset quality check task.</p>
     * 
     * @param request SubmitQualityCheckTaskRequest
     * @return SubmitQualityCheckTaskResponse
     */
    public SubmitQualityCheckTaskResponse submitQualityCheckTask(SubmitQualityCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitQualityCheckTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can manually review files after quality inspection. After completing the review, call this API to save the review results. This involves manually reviewing rules identified by the system as hits to determine if they are true hits or false positives. Refer to the file review feature on the console page. For more information, see <a href="https://help.aliyun.com/document_detail/139653.html#h2-u6587u4EF6u590Du68385">File Review</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Save review results. This is only supported by the legacy Smart Conversation Analysis.</p>
     * 
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
     * <b>description</b> :
     * <p>You can manually review files after quality inspection. After completing the review, call this API to save the review results. This involves manually reviewing rules identified by the system as hits to determine if they are true hits or false positives. Refer to the file review feature on the console page. For more information, see <a href="https://help.aliyun.com/document_detail/139653.html#h2-u6587u4EF6u590Du68385">File Review</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Save review results. This is only supported by the legacy Smart Conversation Analysis.</p>
     * 
     * @param request SubmitReviewInfoRequest
     * @return SubmitReviewInfoResponse
     */
    public SubmitReviewInfoResponse submitReviewInfo(SubmitReviewInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitReviewInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Review quality inspection results</p>
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
     * <p>Review quality inspection results</p>
     * 
     * @param request SubmitReviewInfoV4Request
     * @return SubmitReviewInfoV4Response
     */
    public SubmitReviewInfoV4Response submitReviewInfoV4(SubmitReviewInfoV4Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitReviewInfoV4WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Real-time hotline quality inspection transcribes spoken dialogue into text during a call. It sends the text to the Smart Conversation Analysis system for real-time quality inspection to detect potential issues or risks. You can display the dialogue text and inspection results in real time on the customer service representative\&quot;s workbench (a third-party system). This differs from offline quality inspection, which uses UploadAudioData for inspection or dataset inspection. For details, see the developer guide. Offline quality inspection occurs after the call ends and the recording file is generated.
     * <strong>Usage Flow</strong>
     * You can implement real-time transcription of audio streams to text during calls, or use Alibaba Cloud Call Center (CC) directly. CC integrates deeply with Smart Conversation Analysis, enabling real-time quality inspection during calls without API integration.
     * If you implement audio-to-text conversion yourself, invoke the SyncQualityCheck API for real-time quality inspection after a speaker finishes a sentence and generates dialogue text. This returns the inspection result for that sentence synchronously.
     * You should include skill group information when uploading data. Then, you can use the Call Center Quality Inspection - Configuration Management feature to configure different quality inspection rules for calls from different skill groups.
     * After the call ends, you can store the recording file on a storage server accessible over the public network. You can invoke the recording information maintenance API: UpdateSyncQualityCheckData. You can submit the recording name, recording file URL, and other details to the Smart Conversation Analysis service. This lets quality inspectors play back the recording during review.
     * After the call ends, you can view the quality inspection results in Call Center Quality Inspection - Result Display - Real-time Quality Inspection Results. You can also invoke the real-time quality inspection result query API: GetSyncResult to retrieve the results. You can use Score Dashboard - Real-time Dashboard to view data charts for customer service representatives, skill groups, and scoring items.
     * <strong>Full-Text Quality Inspection</strong>
     * Quality inspection rules include dozens of operators. Some operators require dialogue context (multi-turn conversations between customer service representatives and customers) for analysis. However, real-time quality inspection occurs during a call and typically uses text from only one sentence spoken by a single speaker. Some operators are not suitable for real-time quality inspection. Therefore, quality inspection rules are divided into real-time quality inspection rules and full-text quality inspection rules:
     * <strong>Real-time quality inspection rules</strong>: Rules used for real-time quality inspection. They support a limited number of operator types. They do not support specifying the detection range for operators.
     * <strong>Full-text quality inspection rules</strong>: Rules used for offline quality inspection. They support all operator types. They support custom detection ranges for operators.
     * For calls that underwent real-time quality inspection, you can apply full-text quality inspection rules to the complete dialogue text after the call ends. To enable full-text quality inspection after real-time inspection, see the full-text quality inspection description in Call Center Quality Inspection - Configuration Management.</p>
     * 
     * <b>summary</b> : 
     * <p>Perform real-time quality inspection for hotlines.</p>
     * 
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
     * <b>description</b> :
     * <p>Real-time hotline quality inspection transcribes spoken dialogue into text during a call. It sends the text to the Smart Conversation Analysis system for real-time quality inspection to detect potential issues or risks. You can display the dialogue text and inspection results in real time on the customer service representative\&quot;s workbench (a third-party system). This differs from offline quality inspection, which uses UploadAudioData for inspection or dataset inspection. For details, see the developer guide. Offline quality inspection occurs after the call ends and the recording file is generated.
     * <strong>Usage Flow</strong>
     * You can implement real-time transcription of audio streams to text during calls, or use Alibaba Cloud Call Center (CC) directly. CC integrates deeply with Smart Conversation Analysis, enabling real-time quality inspection during calls without API integration.
     * If you implement audio-to-text conversion yourself, invoke the SyncQualityCheck API for real-time quality inspection after a speaker finishes a sentence and generates dialogue text. This returns the inspection result for that sentence synchronously.
     * You should include skill group information when uploading data. Then, you can use the Call Center Quality Inspection - Configuration Management feature to configure different quality inspection rules for calls from different skill groups.
     * After the call ends, you can store the recording file on a storage server accessible over the public network. You can invoke the recording information maintenance API: UpdateSyncQualityCheckData. You can submit the recording name, recording file URL, and other details to the Smart Conversation Analysis service. This lets quality inspectors play back the recording during review.
     * After the call ends, you can view the quality inspection results in Call Center Quality Inspection - Result Display - Real-time Quality Inspection Results. You can also invoke the real-time quality inspection result query API: GetSyncResult to retrieve the results. You can use Score Dashboard - Real-time Dashboard to view data charts for customer service representatives, skill groups, and scoring items.
     * <strong>Full-Text Quality Inspection</strong>
     * Quality inspection rules include dozens of operators. Some operators require dialogue context (multi-turn conversations between customer service representatives and customers) for analysis. However, real-time quality inspection occurs during a call and typically uses text from only one sentence spoken by a single speaker. Some operators are not suitable for real-time quality inspection. Therefore, quality inspection rules are divided into real-time quality inspection rules and full-text quality inspection rules:
     * <strong>Real-time quality inspection rules</strong>: Rules used for real-time quality inspection. They support a limited number of operator types. They do not support specifying the detection range for operators.
     * <strong>Full-text quality inspection rules</strong>: Rules used for offline quality inspection. They support all operator types. They support custom detection ranges for operators.
     * For calls that underwent real-time quality inspection, you can apply full-text quality inspection rules to the complete dialogue text after the call ends. To enable full-text quality inspection after real-time inspection, see the full-text quality inspection description in Call Center Quality Inspection - Configuration Management.</p>
     * 
     * <b>summary</b> : 
     * <p>Perform real-time quality inspection for hotlines.</p>
     * 
     * @param request SyncQualityCheckRequest
     * @return SyncQualityCheckResponse
     */
    public SyncQualityCheckResponse syncQualityCheck(SyncQualityCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncQualityCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Frontend location: Quality Check Rule Configuration &gt; Test. Apsara Stack URL: http://<ip>:<port>/api/client/TestRule.json.</p>
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
     * <p>Frontend location: Quality Check Rule Configuration &gt; Test. Apsara Stack URL: http://<ip>:<port>/api/client/TestRule.json.</p>
     * 
     * @param request TestRuleV4Request
     * @return TestRuleV4Response
     */
    public TestRuleV4Response testRuleV4(TestRuleV4Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testRuleV4WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an agent.</p>
     * 
     * @param request UpdateAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgentResponse
     */
    public UpdateAgentResponse updateAgentWithOptions(UpdateAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "UpdateAgent"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an agent.</p>
     * 
     * @param request UpdateAgentRequest
     * @return UpdateAgentResponse
     */
    public UpdateAgentResponse updateAgent(UpdateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the hotword vocabulary.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Updates the hotword vocabulary.</p>
     * 
     * @param request UpdateAsrVocabRequest
     * @return UpdateAsrVocabResponse
     */
    public UpdateAsrVocabResponse updateAsrVocab(UpdateAsrVocabRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAsrVocabWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can access this operation from the frontend by navigating to Plan Management &gt; Create Quality Inspection Task or Edit &gt; Edit icon next to the quality inspection dimension name. The Apsara Stack endpoint is ip:port/api/qcs/UpdateCheckTypeToScheme.json.</p>
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
     * <p>You can access this operation from the frontend by navigating to Plan Management &gt; Create Quality Inspection Task or Edit &gt; Edit icon next to the quality inspection dimension name. The Apsara Stack endpoint is ip:port/api/qcs/UpdateCheckTypeToScheme.json.</p>
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
     * <p>Update session recording data (third-party business fields) to facilitate statistics and queries across more business dimensions.</p>
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
     * <p>Update session recording data (third-party business fields) to facilitate statistics and queries across more business dimensions.</p>
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
     * <p>Updates a quality check scheme.</p>
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
     * <p>Updates a quality check scheme.</p>
     * 
     * @param request UpdateQualityCheckSchemeRequest
     * @return UpdateQualityCheckSchemeResponse
     */
    public UpdateQualityCheckSchemeResponse updateQualityCheckScheme(UpdateQualityCheckSchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQualityCheckSchemeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Update an existing rule. You can modify its conditions and operators as needed. The rule ID (rid) remains unchanged, but condition IDs and operator IDs may change.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Update rule information.</p>
     * 
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
     * <b>description</b> :
     * <blockquote>
     * <p>Update an existing rule. You can modify its conditions and operators as needed. The rule ID (rid) remains unchanged, but condition IDs and operator IDs may change.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Update rule information.</p>
     * 
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
     * <p>This API maps to the frontend function location: Quality Inspection Rule Configuration - Create &amp; Update. The Apsara Stack URL is: ip:port/api/client/UpdateRuleById.json.</p>
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
     * <p>This API maps to the frontend function location: Quality Inspection Rule Configuration - Create &amp; Update. The Apsara Stack URL is: ip:port/api/client/UpdateRuleById.json.</p>
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
     * <p>Frontend location: Quality Check Plan Management &gt; Create or edit a quality check task &gt; Associate quality check rules. Apsara Stack URL: ip:port/api/qcs/UpdateRuleToScheme.json.</p>
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
     * <p>Frontend location: Quality Check Plan Management &gt; Create or edit a quality check task &gt; Associate quality check rules. Apsara Stack URL: ip:port/api/qcs/UpdateRuleToScheme.json.</p>
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
     * <p>Corresponding frontend feature location: Rule Configuration - Update. Apsara Stack URL: ip:port/api/client/UpdateRuleById.json.</p>
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
     * <p>Corresponding frontend feature location: Rule Configuration - Update. Apsara Stack URL: ip:port/api/client/UpdateRuleById.json.</p>
     * 
     * @param request UpdateRuleV4Request
     * @return UpdateRuleV4Response
     */
    public UpdateRuleV4Response updateRuleV4(UpdateRuleV4Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRuleV4WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates quality inspection task information.</p>
     * 
     * <b>summary</b> : 
     * <p>Frontend path: Task Management &gt; Edit any data on the right. Apsara Stack URL: ip:port/api/task/UpdateSchemeTaskConfig.json.</p>
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
     * <b>description</b> :
     * <p>Updates quality inspection task information.</p>
     * 
     * <b>summary</b> : 
     * <p>Frontend path: Task Management &gt; Edit any data on the right. Apsara Stack URL: ip:port/api/task/UpdateSchemeTaskConfig.json.</p>
     * 
     * @param request UpdateSchemeTaskConfigRequest
     * @return UpdateSchemeTaskConfigResponse
     */
    public UpdateSchemeTaskConfigResponse updateSchemeTaskConfig(UpdateSchemeTaskConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSchemeTaskConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call UpdateSkillGroupConfig to update a configuration.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can call UpdateSkillGroupConfig to update a configuration.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Maintain the recording information after real-time quality inspection is completed, which is used to play back the recording during review. After the recording information is maintained, the task status will change to Succeeded.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Maintain the recording information after real-time quality inspection is completed, which is used to play back the recording during review. After the recording information is maintained, the task status will change to Succeeded.</p>
     * 
     * @param request UpdateSyncQualityCheckDataRequest
     * @return UpdateSyncQualityCheckDataResponse
     */
    public UpdateSyncQualityCheckDataResponse updateSyncQualityCheckData(UpdateSyncQualityCheckDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSyncQualityCheckDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a label node.</p>
     * 
     * @param request UpdateTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTagResponse
     */
    public UpdateTagResponse updateTagWithOptions(UpdateTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "UpdateTag"),
            new TeaPair("version", "2019-01-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a label node.</p>
     * 
     * @param request UpdateTagRequest
     * @return UpdateTagResponse
     */
    public UpdateTagResponse updateTag(UpdateTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update the automatic allocation rule for quality review tasks.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Update the automatic allocation rule for quality review tasks.</p>
     * 
     * @param request UpdateTaskAssignRuleRequest
     * @return UpdateTaskAssignRuleResponse
     */
    public UpdateTaskAssignRuleResponse updateTaskAssignRule(UpdateTaskAssignRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskAssignRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you update users, you can modify only their roles. You cannot modify other account information because all Alibaba Cloud products use a unified account management system. Smart Conversation Analysis uses these accounts. To modify account information, go to <a href="https://ram.console.aliyun.com/">Resource Access Management (RAM)</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Update users by modifying their roles in batches.</p>
     * 
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
     * <b>description</b> :
     * <p>When you update users, you can modify only their roles. You cannot modify other account information because all Alibaba Cloud products use a unified account management system. Smart Conversation Analysis uses these accounts. To modify account information, go to <a href="https://ram.console.aliyun.com/">Resource Access Management (RAM)</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Update users by modifying their roles in batches.</p>
     * 
     * @param request UpdateUserRequest
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the warning configuration.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Updates the warning configuration.</p>
     * 
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
     * <b>description</b> :
     * <h3>Process description</h3>
     * <p>Call the API to upload audio quality inspection =&gt; Convert the recording file to text =&gt; Separate roles in the text based on the specified channel splitting method (distinguish between agent and customer) =&gt; Analyze using quality inspection rules =&gt; Quality inspection complete.</p>
     * <h3>Task execution efficiency</h3>
     * <p>The speed of task execution depends on the speed of converting the recording file to text. Ideally, a 5-minute recording file can be transcribed within 2 minutes. However, when the transcription service has many queued tasks, there will be a queuing wait time. Generally, transcription completes within 6 hours, except for bulk uploads of large-scale data (more than 500 hours of recordings uploaded within 30 minutes). After transcription is complete, quality inspection analysis takes only milliseconds.</p>
     * <h3>Recording file URL requirements</h3>
     * <ul>
     * <li>Supports single-channel/dual-channel WAV and MP3 format recording files. The file size must be less than 512 MB.</li>
     * <li>The URL must be an HTTP-accessible URL address. Local file submission is not supported. The recording file access permissions must be set to public.</li>
     * <li>The URL can only use domain names, not IP addresses. The URL cannot contain spaces. Avoid using Chinese characters.</li>
     * <li>After converting the recording to text, the system deletes the downloaded recording file and does not retain a copy.</li>
     * <li>If your recording URL has an access expiration period (for example, the recording is stored in Alibaba Cloud OSS and you specified an expiration period when generating the recording URL through OSS), set the expiration period to at least 12 hours, or 24 hours if possible. This is because file transcription takes time and occasional queuing may occur. If the queuing time is long, the recording is downloaded only when transcription begins. This prevents the recording URL from expiring before the download.</li>
     * <li>After quality inspection analysis is complete, the recording is still played using the URL you provided when reviewing files in the console. Ensure that the URL remains active long-term. Otherwise, the recording cannot be played.</li>
     * </ul>
     * <h3>Role separation description</h3>
     * <p>After the recording is converted to text, the system automatically separates the text into two conversation roles. However, the system cannot determine which role is the agent and which is the customer. You need to perform role separation based on certain rules. The accuracy of role separation is critical because the rules used for quality inspection analysis often have role detection restrictions (a rule only checks the agent or the customer). If role separation is incorrect, the accuracy of quality inspection results is significantly affected.
     * Recording files are typically divided into two types: single-channel (mono) and dual-channel (stereo):</p>
     * <ul>
     * <li>Single-channel recording: The voices of both the agent and customer are stored on one channel. After the recording file is converted to text, the system uses a built-in algorithm to distinguish between two roles. By setting a list of keywords that the agent is likely to say, the system analyzes the transcribed text sentence by sentence from top to bottom. When a sentence matches a keyword, the role of that sentence is determined to be the agent, and the other role is the customer. For details, see recognizeRoleDataSetId and serviceChannelKeywords in the request parameters. Due to the unpredictability of conversation content (for example, cross-talk between two roles or both people speaking simultaneously), role separation for single-channel recordings cannot be guaranteed to be 100% accurate. Save recording files as dual-channel recordings whenever possible.</li>
     * <li>Dual-channel recording: The voices of the agent and customer are stored on two separate channels. Even if the conversation overlaps, the recording-to-text conversion can accurately distinguish between the two. Specify the agent and customer by using the serviceChannel and clientChannel request parameters.</li>
     * </ul>
     * <h3>Retrieve quality inspection analysis results</h3>
     * <p>Because recording file recognition is not real-time, you need to asynchronously retrieve quality inspection analysis results. The following three methods are available:</p>
     * <ul>
     * <li>Message notification: For details, see <a href="https://help.aliyun.com/document_detail/213237.html">MSMQ</a>. After receiving a message, invoke the GetResult operation to retrieve detailed results. (Recommended)</li>
     * <li>Callback: Specify a callbackUrl in the request parameters. The system initiates a callback after the task is complete. After receiving the callback, invoke the GetResult operation to retrieve detailed results.</li>
     * <li>Polling: The operation returns a task ID (taskId). Use the taskId to poll the <code>getResult</code> operation to asynchronously retrieve results. Check whether the <code>status</code> in the response parameters indicates completion. Do not set the polling interval too short. Analysis normally completes within a few minutes. Set the polling interval to 30 seconds or more. (Not recommended)</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads offline voice quality inspection data (recording session files). This operation is applicable to hotline agent scenarios. Scenario 1: Natively integrates with Alibaba Cloud Call Center (CCC), requiring no development. You can enable one-click push of call data to SCA. Scenario 2: Integrates with your own call center system. Each time the call center generates a recording, it pushes the recording to SCA for analysis.</p>
     * 
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
     * <b>description</b> :
     * <h3>Process description</h3>
     * <p>Call the API to upload audio quality inspection =&gt; Convert the recording file to text =&gt; Separate roles in the text based on the specified channel splitting method (distinguish between agent and customer) =&gt; Analyze using quality inspection rules =&gt; Quality inspection complete.</p>
     * <h3>Task execution efficiency</h3>
     * <p>The speed of task execution depends on the speed of converting the recording file to text. Ideally, a 5-minute recording file can be transcribed within 2 minutes. However, when the transcription service has many queued tasks, there will be a queuing wait time. Generally, transcription completes within 6 hours, except for bulk uploads of large-scale data (more than 500 hours of recordings uploaded within 30 minutes). After transcription is complete, quality inspection analysis takes only milliseconds.</p>
     * <h3>Recording file URL requirements</h3>
     * <ul>
     * <li>Supports single-channel/dual-channel WAV and MP3 format recording files. The file size must be less than 512 MB.</li>
     * <li>The URL must be an HTTP-accessible URL address. Local file submission is not supported. The recording file access permissions must be set to public.</li>
     * <li>The URL can only use domain names, not IP addresses. The URL cannot contain spaces. Avoid using Chinese characters.</li>
     * <li>After converting the recording to text, the system deletes the downloaded recording file and does not retain a copy.</li>
     * <li>If your recording URL has an access expiration period (for example, the recording is stored in Alibaba Cloud OSS and you specified an expiration period when generating the recording URL through OSS), set the expiration period to at least 12 hours, or 24 hours if possible. This is because file transcription takes time and occasional queuing may occur. If the queuing time is long, the recording is downloaded only when transcription begins. This prevents the recording URL from expiring before the download.</li>
     * <li>After quality inspection analysis is complete, the recording is still played using the URL you provided when reviewing files in the console. Ensure that the URL remains active long-term. Otherwise, the recording cannot be played.</li>
     * </ul>
     * <h3>Role separation description</h3>
     * <p>After the recording is converted to text, the system automatically separates the text into two conversation roles. However, the system cannot determine which role is the agent and which is the customer. You need to perform role separation based on certain rules. The accuracy of role separation is critical because the rules used for quality inspection analysis often have role detection restrictions (a rule only checks the agent or the customer). If role separation is incorrect, the accuracy of quality inspection results is significantly affected.
     * Recording files are typically divided into two types: single-channel (mono) and dual-channel (stereo):</p>
     * <ul>
     * <li>Single-channel recording: The voices of both the agent and customer are stored on one channel. After the recording file is converted to text, the system uses a built-in algorithm to distinguish between two roles. By setting a list of keywords that the agent is likely to say, the system analyzes the transcribed text sentence by sentence from top to bottom. When a sentence matches a keyword, the role of that sentence is determined to be the agent, and the other role is the customer. For details, see recognizeRoleDataSetId and serviceChannelKeywords in the request parameters. Due to the unpredictability of conversation content (for example, cross-talk between two roles or both people speaking simultaneously), role separation for single-channel recordings cannot be guaranteed to be 100% accurate. Save recording files as dual-channel recordings whenever possible.</li>
     * <li>Dual-channel recording: The voices of the agent and customer are stored on two separate channels. Even if the conversation overlaps, the recording-to-text conversion can accurately distinguish between the two. Specify the agent and customer by using the serviceChannel and clientChannel request parameters.</li>
     * </ul>
     * <h3>Retrieve quality inspection analysis results</h3>
     * <p>Because recording file recognition is not real-time, you need to asynchronously retrieve quality inspection analysis results. The following three methods are available:</p>
     * <ul>
     * <li>Message notification: For details, see <a href="https://help.aliyun.com/document_detail/213237.html">MSMQ</a>. After receiving a message, invoke the GetResult operation to retrieve detailed results. (Recommended)</li>
     * <li>Callback: Specify a callbackUrl in the request parameters. The system initiates a callback after the task is complete. After receiving the callback, invoke the GetResult operation to retrieve detailed results.</li>
     * <li>Polling: The operation returns a task ID (taskId). Use the taskId to poll the <code>getResult</code> operation to asynchronously retrieve results. Check whether the <code>status</code> in the response parameters indicates completion. Do not set the polling interval too short. Analysis normally completes within a few minutes. Set the polling interval to 30 seconds or more. (Not recommended)</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads offline voice quality inspection data (recording session files). This operation is applicable to hotline agent scenarios. Scenario 1: Natively integrates with Alibaba Cloud Call Center (CCC), requiring no development. You can enable one-click push of call data to SCA. Scenario 2: Integrates with your own call center system. Each time the call center generates a recording, it pushes the recording to SCA for analysis.</p>
     * 
     * @param request UploadAudioDataRequest
     * @return UploadAudioDataResponse
     */
    public UploadAudioDataResponse uploadAudioData(UploadAudioDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadAudioDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call UploadData.json to upload text-based quality inspection data. Text typically originates from online customer service interactions or tickets. The API returns a task ID. You can retrieve results in one of three ways:</p>
     * <ul>
     * <li>Message notification: For details, see <a href="https://help.aliyun.com/document_detail/213237.html">message queues</a>. After you receive a message, call the GetResult API to retrieve detailed results. (Recommended)</li>
     * <li>Callback: Specify a callback URL in your request parameters. After the task completes, the system sends a callback to that URL. Then call the GetResult API to retrieve detailed results.</li>
     * <li>Polling: Use the returned task ID to poll the GetResult API asynchronously. Check whether the status field in the response indicates completion. (Not recommended)</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upload offline plain text quality inspection data (plain text sessions). This applies to online agent scenarios. Use the UploadDataV4 API. Differences between UploadDataV4 and UploadData include the following: UploadDataV4 supports only POST requests, and it supports longer JsonStr values.</p>
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
     * <b>description</b> :
     * <p>You can call UploadData.json to upload text-based quality inspection data. Text typically originates from online customer service interactions or tickets. The API returns a task ID. You can retrieve results in one of three ways:</p>
     * <ul>
     * <li>Message notification: For details, see <a href="https://help.aliyun.com/document_detail/213237.html">message queues</a>. After you receive a message, call the GetResult API to retrieve detailed results. (Recommended)</li>
     * <li>Callback: Specify a callback URL in your request parameters. After the task completes, the system sends a callback to that URL. Then call the GetResult API to retrieve detailed results.</li>
     * <li>Polling: Use the returned task ID to poll the GetResult API asynchronously. Check whether the status field in the response indicates completion. (Not recommended)</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upload offline plain text quality inspection data (plain text sessions). This applies to online agent scenarios. Use the UploadDataV4 API. Differences between UploadDataV4 and UploadData include the following: UploadDataV4 supports only POST requests, and it supports longer JsonStr values.</p>
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
     * <b>description</b> :
     * <p>Pushes text data in a specific format to SCA for real-time quality inspection analysis based on user-specified rules, and synchronously returns the analysis results. Compared with uploaded text quality inspection, which typically uploads the complete conversation text after a conversation ends, real-time text quality inspection allows you to push text to SCA for analysis after one role finishes one or more sentences, providing higher real-time performance. Notes:</p>
     * <ul>
     * <li>If the pushed text is a single sentence from one role, some operators in the rules become ineffective due to the lack of conversation context, such as context repetition check, interruption check, and call silence check.</li>
     * <li>Real-time quality inspection synchronously returns analysis results. SCA does not save call records, so you cannot query quality inspection results through APIs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs real-time text-based quality inspection.</p>
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
     * <b>description</b> :
     * <p>Pushes text data in a specific format to SCA for real-time quality inspection analysis based on user-specified rules, and synchronously returns the analysis results. Compared with uploaded text quality inspection, which typically uploads the complete conversation text after a conversation ends, real-time text quality inspection allows you to push text to SCA for analysis after one role finishes one or more sentences, providing higher real-time performance. Notes:</p>
     * <ul>
     * <li>If the pushed text is a single sentence from one role, some operators in the rules become ineffective due to the lack of conversation context, such as context repetition check, interruption check, and call silence check.</li>
     * <li>Real-time quality inspection synchronously returns analysis results. SCA does not save call records, so you cannot query quality inspection results through APIs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs real-time text-based quality inspection.</p>
     * 
     * @param request UploadDataSyncRequest
     * @return UploadDataSyncResponse
     */
    public UploadDataSyncResponse uploadDataSync(UploadDataSyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadDataSyncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Pushes text data in a specific format to Smart Conversation Analysis (SCA) for real-time quality inspection based on user-specified rules, and synchronously returns the analysis results. Compared with uploaded text quality inspection, which typically uploads the complete conversation text after a conversation ends, real-time text quality inspection allows you to push text to SCA for analysis after one role finishes one or more sentences, providing higher real-time performance. Special notes:
     * If the pushed text is a single sentence from one role, some operators in the rules may not work due to the lack of conversation context, such as context repetition check, interruption check, and call silence check.
     * Real-time quality inspection synchronously returns analysis results. SCA does not save call records, so you cannot query quality inspection results through APIs.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs real-time text quality inspection using a large language model.</p>
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

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jsonStr)) {
            body.put("JsonStr", request.jsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
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
     * <b>description</b> :
     * <p>Pushes text data in a specific format to Smart Conversation Analysis (SCA) for real-time quality inspection based on user-specified rules, and synchronously returns the analysis results. Compared with uploaded text quality inspection, which typically uploads the complete conversation text after a conversation ends, real-time text quality inspection allows you to push text to SCA for analysis after one role finishes one or more sentences, providing higher real-time performance. Special notes:
     * If the pushed text is a single sentence from one role, some operators in the rules may not work due to the lack of conversation context, such as context repetition check, interruption check, and call silence check.
     * Real-time quality inspection synchronously returns analysis results. SCA does not save call records, so you cannot query quality inspection results through APIs.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs real-time text quality inspection using a large language model.</p>
     * 
     * @param request UploadDataSyncForLLMRequest
     * @return UploadDataSyncForLLMResponse
     */
    public UploadDataSyncForLLMResponse uploadDataSyncForLLM(UploadDataSyncForLLMRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadDataSyncForLLMWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls UploadData.json to upload text quality inspection data. The text typically comes from online customer service or tickets. The operation returns a taskId. You can obtain results in three ways:</p>
     * <ul>
     * <li>Message notification: For details, see <a href="https://help.aliyun.com/document_detail/213237.html">Message channel</a>. After receiving a message, call the GetResult operation to obtain detailed results. (Recommended)</li>
     * <li>Callback: Specify a callbackUrl in the request parameters. The system initiates a callback after the task is completed. After receiving the callback, call the GetResult operation to obtain detailed results.</li>
     * <li>Polling: Use the task ID returned by this operation to poll the GetResult operation asynchronously. Check whether the status in the response indicates completion. (Not recommended)</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads offline text quality inspection data (plain text conversations) applicable to online agent scenarios. We recommend using the UploadDataV4 operation. Differences between UploadDataV4 and UploadData: 1. V4 supports only POST requests. 2. V4 supports longer JsonStr values.</p>
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
     * <b>description</b> :
     * <p>Calls UploadData.json to upload text quality inspection data. The text typically comes from online customer service or tickets. The operation returns a taskId. You can obtain results in three ways:</p>
     * <ul>
     * <li>Message notification: For details, see <a href="https://help.aliyun.com/document_detail/213237.html">Message channel</a>. After receiving a message, call the GetResult operation to obtain detailed results. (Recommended)</li>
     * <li>Callback: Specify a callbackUrl in the request parameters. The system initiates a callback after the task is completed. After receiving the callback, call the GetResult operation to obtain detailed results.</li>
     * <li>Polling: Use the task ID returned by this operation to poll the GetResult operation asynchronously. Check whether the status in the response indicates completion. (Not recommended)</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads offline text quality inspection data (plain text conversations) applicable to online agent scenarios. We recommend using the UploadDataV4 operation. Differences between UploadDataV4 and UploadData: 1. V4 supports only POST requests. 2. V4 supports longer JsonStr values.</p>
     * 
     * @param request UploadDataV4Request
     * @return UploadDataV4Response
     */
    public UploadDataV4Response uploadDataV4(UploadDataV4Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadDataV4WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/213225.html">Rule configuration</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a rule. You can use this operation to provide your own rule editing interface.</p>
     * 
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
     * <b>description</b> :
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/213225.html">Rule configuration</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a rule. You can use this operation to provide your own rule editing interface.</p>
     * 
     * @param request UploadRuleRequest
     * @return UploadRuleResponse
     */
    public UploadRuleResponse uploadRule(UploadRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Saves the verification result of a single file.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Saves the verification result of a single file.</p>
     * 
     * @param request VerifyFileRequest
     * @return VerifyFileResponse
     */
    public VerifyFileResponse verifyFile(VerifyFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Save the verification result for a single sentence.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Save the verification result for a single sentence.</p>
     * 
     * @param request VerifySentenceRequest
     * @return VerifySentenceResponse
     */
    public VerifySentenceResponse verifySentence(VerifySentenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifySentenceWithOptions(request, runtime);
    }
}

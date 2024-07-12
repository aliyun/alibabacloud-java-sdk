// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601;

import com.aliyun.tea.*;
import com.aliyun.oosops20190601.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("oosops", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request AuditPublicTemplateRegistrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuditPublicTemplateRegistrationResponse
     */
    public AuditPublicTemplateRegistrationResponse auditPublicTemplateRegistrationWithOptions(AuditPublicTemplateRegistrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditAction)) {
            query.put("AuditAction", request.auditAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrationId)) {
            query.put("RegistrationId", request.registrationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuditPublicTemplateRegistration"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuditPublicTemplateRegistrationResponse());
    }

    /**
     * @param request AuditPublicTemplateRegistrationRequest
     * @return AuditPublicTemplateRegistrationResponse
     */
    public AuditPublicTemplateRegistrationResponse auditPublicTemplateRegistration(AuditPublicTemplateRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.auditPublicTemplateRegistrationWithOptions(request, runtime);
    }

    /**
     * @param request CreateActionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateActionResponse
     */
    public CreateActionResponse createActionWithOptions(CreateActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionName)) {
            query.put("ActionName", request.actionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            query.put("ActionType", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popularity)) {
            query.put("Popularity", request.popularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAction"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateActionResponse());
    }

    /**
     * @param request CreateActionRequest
     * @return CreateActionResponse
     */
    public CreateActionResponse createAction(CreateActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createActionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个公共参数。</p>
     * 
     * @param request CreatePublicParameterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePublicParameterResponse
     */
    public CreatePublicParameterResponse createPublicParameterWithOptions(CreatePublicParameterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.constraints)) {
            query.put("Constraints", request.constraints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterType)) {
            query.put("ParameterType", request.parameterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePublicParameter"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePublicParameterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个公共参数。</p>
     * 
     * @param request CreatePublicParameterRequest
     * @return CreatePublicParameterResponse
     */
    public CreatePublicParameterResponse createPublicParameter(CreatePublicParameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPublicParameterWithOptions(request, runtime);
    }

    /**
     * @param request CreatePublicPatchBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePublicPatchBaselineResponse
     */
    public CreatePublicPatchBaselineResponse createPublicPatchBaselineWithOptions(CreatePublicPatchBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalRules)) {
            query.put("ApprovalRules", request.approvalRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationSystem)) {
            query.put("OperationSystem", request.operationSystem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePublicPatchBaseline"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePublicPatchBaselineResponse());
    }

    /**
     * @param request CreatePublicPatchBaselineRequest
     * @return CreatePublicPatchBaselineResponse
     */
    public CreatePublicPatchBaselineResponse createPublicPatchBaseline(CreatePublicPatchBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPublicPatchBaselineWithOptions(request, runtime);
    }

    /**
     * @param request CreatePublicTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePublicTemplateResponse
     */
    public CreatePublicTemplateResponse createPublicTemplateWithOptions(CreatePublicTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isExample)) {
            query.put("IsExample", request.isExample);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popularity)) {
            query.put("Popularity", request.popularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publisher)) {
            query.put("Publisher", request.publisher);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePublicTemplate"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePublicTemplateResponse());
    }

    /**
     * @param request CreatePublicTemplateRequest
     * @return CreatePublicTemplateResponse
     */
    public CreatePublicTemplateResponse createPublicTemplate(CreatePublicTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPublicTemplateWithOptions(request, runtime);
    }

    /**
     * @param request DeleteFailureMsgRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFailureMsgResponse
     */
    public DeleteFailureMsgResponse deleteFailureMsgWithOptions(DeleteFailureMsgRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            query.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestFingerprint)) {
            query.put("RequestFingerprint", request.requestFingerprint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFailureMsg"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFailureMsgResponse());
    }

    /**
     * @param request DeleteFailureMsgRequest
     * @return DeleteFailureMsgResponse
     */
    public DeleteFailureMsgResponse deleteFailureMsg(DeleteFailureMsgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFailureMsgWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除公共参数。</p>
     * 
     * @param request DeletePublicParameterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePublicParameterResponse
     */
    public DeletePublicParameterResponse deletePublicParameterWithOptions(DeletePublicParameterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePublicParameter"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePublicParameterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除公共参数。</p>
     * 
     * @param request DeletePublicParameterRequest
     * @return DeletePublicParameterResponse
     */
    public DeletePublicParameterResponse deletePublicParameter(DeletePublicParameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePublicParameterWithOptions(request, runtime);
    }

    /**
     * @param request DeletePublicPatchBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePublicPatchBaselineResponse
     */
    public DeletePublicPatchBaselineResponse deletePublicPatchBaselineWithOptions(DeletePublicPatchBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePublicPatchBaseline"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePublicPatchBaselineResponse());
    }

    /**
     * @param request DeletePublicPatchBaselineRequest
     * @return DeletePublicPatchBaselineResponse
     */
    public DeletePublicPatchBaselineResponse deletePublicPatchBaseline(DeletePublicPatchBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePublicPatchBaselineWithOptions(request, runtime);
    }

    /**
     * @param request DeletePublicTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePublicTemplateResponse
     */
    public DeletePublicTemplateResponse deletePublicTemplateWithOptions(DeletePublicTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePublicTemplate"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePublicTemplateResponse());
    }

    /**
     * @param request DeletePublicTemplateRequest
     * @return DeletePublicTemplateResponse
     */
    public DeletePublicTemplateResponse deletePublicTemplate(DeletePublicTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePublicTemplateWithOptions(request, runtime);
    }

    /**
     * @param request DoCheckResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DoCheckResourceResponse
     */
    public DoCheckResourceResponse doCheckResourceWithOptions(DoCheckResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtWakeup)) {
            query.put("gmtWakeup", request.gmtWakeup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hid)) {
            query.put("hid", request.hid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interrupt)) {
            query.put("interrupt", request.interrupt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoker)) {
            query.put("invoker", request.invoker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            query.put("prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.success)) {
            query.put("success", request.success);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskExtraData)) {
            query.put("taskExtraData", request.taskExtraData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIdentifier)) {
            query.put("taskIdentifier", request.taskIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DoCheckResource"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DoCheckResourceResponse());
    }

    /**
     * @param request DoCheckResourceRequest
     * @return DoCheckResourceResponse
     */
    public DoCheckResourceResponse doCheckResource(DoCheckResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.doCheckResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取action的详细信息</p>
     * 
     * @param request GetActionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetActionResponse
     */
    public GetActionResponse getActionWithOptions(GetActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionName)) {
            query.put("ActionName", request.actionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAction"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetActionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取action的详细信息</p>
     * 
     * @param request GetActionRequest
     * @return GetActionResponse
     */
    public GetActionResponse getAction(GetActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getActionWithOptions(request, runtime);
    }

    /**
     * @param request GetFlowControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFlowControlResponse
     */
    public GetFlowControlResponse getFlowControlWithOptions(GetFlowControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.api)) {
            query.put("Api", request.api);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFlowControl"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFlowControlResponse());
    }

    /**
     * @param request GetFlowControlRequest
     * @return GetFlowControlResponse
     */
    public GetFlowControlResponse getFlowControl(GetFlowControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFlowControlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个公共参数，包括参数值。</p>
     * 
     * @param request GetPublicParameterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPublicParameterResponse
     */
    public GetPublicParameterResponse getPublicParameterWithOptions(GetPublicParameterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterVersion)) {
            query.put("ParameterVersion", request.parameterVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPublicParameter"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPublicParameterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个公共参数，包括参数值。</p>
     * 
     * @param request GetPublicParameterRequest
     * @return GetPublicParameterResponse
     */
    public GetPublicParameterResponse getPublicParameter(GetPublicParameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPublicParameterWithOptions(request, runtime);
    }

    /**
     * @param request GetPublicPatchBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPublicPatchBaselineResponse
     */
    public GetPublicPatchBaselineResponse getPublicPatchBaselineWithOptions(GetPublicPatchBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPublicPatchBaseline"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPublicPatchBaselineResponse());
    }

    /**
     * @param request GetPublicPatchBaselineRequest
     * @return GetPublicPatchBaselineResponse
     */
    public GetPublicPatchBaselineResponse getPublicPatchBaseline(GetPublicPatchBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPublicPatchBaselineWithOptions(request, runtime);
    }

    /**
     * @param request GetPublicTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPublicTemplateResponse
     */
    public GetPublicTemplateResponse getPublicTemplateWithOptions(GetPublicTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPublicTemplate"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPublicTemplateResponse());
    }

    /**
     * @param request GetPublicTemplateRequest
     * @return GetPublicTemplateResponse
     */
    public GetPublicTemplateResponse getPublicTemplate(GetPublicTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPublicTemplateWithOptions(request, runtime);
    }

    /**
     * @param request GetQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQuotaResponse
     */
    public GetQuotaResponse getQuotaWithOptions(GetQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.quotaName)) {
            query.put("QuotaName", request.quotaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQuota"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaResponse());
    }

    /**
     * @param request GetQuotaRequest
     * @return GetQuotaResponse
     */
    public GetQuotaResponse getQuota(GetQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQuotaWithOptions(request, runtime);
    }

    /**
     * @param request GetUserExecutionTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserExecutionTemplateResponse
     */
    public GetUserExecutionTemplateResponse getUserExecutionTemplateWithOptions(GetUserExecutionTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserExecutionTemplate"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserExecutionTemplateResponse());
    }

    /**
     * @param request GetUserExecutionTemplateRequest
     * @return GetUserExecutionTemplateResponse
     */
    public GetUserExecutionTemplateResponse getUserExecutionTemplate(GetUserExecutionTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserExecutionTemplateWithOptions(request, runtime);
    }

    /**
     * @param request GetUserTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserTemplateResponse
     */
    public GetUserTemplateResponse getUserTemplateWithOptions(GetUserTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserTemplate"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserTemplateResponse());
    }

    /**
     * @param request GetUserTemplateRequest
     * @return GetUserTemplateResponse
     */
    public GetUserTemplateResponse getUserTemplate(GetUserTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserTemplateWithOptions(request, runtime);
    }

    /**
     * @param request ListActionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListActionsResponse
     */
    public ListActionsResponse listActionsWithOptions(ListActionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OOSActionName)) {
            query.put("OOSActionName", request.OOSActionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListActions"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListActionsResponse());
    }

    /**
     * @param request ListActionsRequest
     * @return ListActionsResponse
     */
    public ListActionsResponse listActions(ListActionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listActionsWithOptions(request, runtime);
    }

    /**
     * @param request ListDefaultQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDefaultQuotaResponse
     */
    public ListDefaultQuotaResponse listDefaultQuotaWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDefaultQuota"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDefaultQuotaResponse());
    }

    /**
     * @return ListDefaultQuotaResponse
     */
    public ListDefaultQuotaResponse listDefaultQuota() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDefaultQuotaWithOptions(runtime);
    }

    /**
     * @param request ListFailureMsgsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFailureMsgsResponse
     */
    public ListFailureMsgsResponse listFailureMsgsWithOptions(ListFailureMsgsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestFingerprint)) {
            query.put("RequestFingerprint", request.requestFingerprint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFailureMsgs"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFailureMsgsResponse());
    }

    /**
     * @param request ListFailureMsgsRequest
     * @return ListFailureMsgsResponse
     */
    public ListFailureMsgsResponse listFailureMsgs(ListFailureMsgsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFailureMsgsWithOptions(request, runtime);
    }

    /**
     * @param request ListOOSLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOOSLogsResponse
     */
    public ListOOSLogsResponse listOOSLogsWithOptions(ListOOSLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestFingerprint)) {
            query.put("RequestFingerprint", request.requestFingerprint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOOSLogs"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOOSLogsResponse());
    }

    /**
     * @param request ListOOSLogsRequest
     * @return ListOOSLogsResponse
     */
    public ListOOSLogsResponse listOOSLogs(ListOOSLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOOSLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询公共参数。支持多种查询</p>
     * 
     * @param request ListPublicParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublicParametersResponse
     */
    public ListPublicParametersResponse listPublicParametersWithOptions(ListPublicParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterType)) {
            query.put("ParameterType", request.parameterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recursive)) {
            query.put("Recursive", request.recursive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            query.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublicParameters"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublicParametersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询公共参数。支持多种查询</p>
     * 
     * @param request ListPublicParametersRequest
     * @return ListPublicParametersResponse
     */
    public ListPublicParametersResponse listPublicParameters(ListPublicParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPublicParametersWithOptions(request, runtime);
    }

    /**
     * @param request ListPublicPatchBaselinesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublicPatchBaselinesResponse
     */
    public ListPublicPatchBaselinesResponse listPublicPatchBaselinesWithOptions(ListPublicPatchBaselinesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationSystem)) {
            query.put("OperationSystem", request.operationSystem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareType)) {
            query.put("ShareType", request.shareType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublicPatchBaselines"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublicPatchBaselinesResponse());
    }

    /**
     * @param request ListPublicPatchBaselinesRequest
     * @return ListPublicPatchBaselinesResponse
     */
    public ListPublicPatchBaselinesResponse listPublicPatchBaselines(ListPublicPatchBaselinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPublicPatchBaselinesWithOptions(request, runtime);
    }

    /**
     * @param request ListPublicTemplateRegistrationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublicTemplateRegistrationsResponse
     */
    public ListPublicTemplateRegistrationsResponse listPublicTemplateRegistrationsWithOptions(ListPublicTemplateRegistrationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrationId)) {
            query.put("RegistrationId", request.registrationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublicTemplateRegistrations"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublicTemplateRegistrationsResponse());
    }

    /**
     * @param request ListPublicTemplateRegistrationsRequest
     * @return ListPublicTemplateRegistrationsResponse
     */
    public ListPublicTemplateRegistrationsResponse listPublicTemplateRegistrations(ListPublicTemplateRegistrationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPublicTemplateRegistrationsWithOptions(request, runtime);
    }

    /**
     * @param request ListPublicTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublicTemplatesResponse
     */
    public ListPublicTemplatesResponse listPublicTemplatesWithOptions(ListPublicTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createdBy)) {
            query.put("CreatedBy", request.createdBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdDateAfter)) {
            query.put("CreatedDateAfter", request.createdDateAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdDateBefore)) {
            query.put("CreatedDateBefore", request.createdDateBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isExample)) {
            query.put("IsExample", request.isExample);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popularity)) {
            query.put("Popularity", request.popularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareType)) {
            query.put("ShareType", request.shareType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            query.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateFormat)) {
            query.put("TemplateFormat", request.templateFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublicTemplates"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublicTemplatesResponse());
    }

    /**
     * @param request ListPublicTemplatesRequest
     * @return ListPublicTemplatesResponse
     */
    public ListPublicTemplatesResponse listPublicTemplates(ListPublicTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPublicTemplatesWithOptions(request, runtime);
    }

    /**
     * @param request ListUserExecutionLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserExecutionLogsResponse
     */
    public ListUserExecutionLogsResponse listUserExecutionLogsWithOptions(ListUserExecutionLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logType)) {
            query.put("LogType", request.logType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskExecutionId)) {
            query.put("TaskExecutionId", request.taskExecutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserExecutionLogs"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserExecutionLogsResponse());
    }

    /**
     * @param request ListUserExecutionLogsRequest
     * @return ListUserExecutionLogsResponse
     */
    public ListUserExecutionLogsResponse listUserExecutionLogs(ListUserExecutionLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserExecutionLogsWithOptions(request, runtime);
    }

    /**
     * @param request ListUserExecutionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserExecutionsResponse
     */
    public ListUserExecutionsResponse listUserExecutionsWithOptions(ListUserExecutionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDateAfter)) {
            query.put("EndDateAfter", request.endDateAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDateBefore)) {
            query.put("EndDateBefore", request.endDateBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executedBy)) {
            query.put("ExecutedBy", request.executedBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeChildExecution)) {
            query.put("IncludeChildExecution", request.includeChildExecution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentExecutionId)) {
            query.put("ParentExecutionId", request.parentExecutionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            query.put("RamRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            query.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDateAfter)) {
            query.put("StartDateAfter", request.startDateAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDateBefore)) {
            query.put("StartDateBefore", request.startDateBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserExecutions"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserExecutionsResponse());
    }

    /**
     * @param request ListUserExecutionsRequest
     * @return ListUserExecutionsResponse
     */
    public ListUserExecutionsResponse listUserExecutions(ListUserExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserExecutionsWithOptions(request, runtime);
    }

    /**
     * @param request ListUserInstancePatchStatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserInstancePatchStatesResponse
     */
    public ListUserInstancePatchStatesResponse listUserInstancePatchStatesWithOptions(ListUserInstancePatchStatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserInstancePatchStates"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserInstancePatchStatesResponse());
    }

    /**
     * @param request ListUserInstancePatchStatesRequest
     * @return ListUserInstancePatchStatesResponse
     */
    public ListUserInstancePatchStatesResponse listUserInstancePatchStates(ListUserInstancePatchStatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserInstancePatchStatesWithOptions(request, runtime);
    }

    /**
     * @param request ListUserInstancePatchesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserInstancePatchesResponse
     */
    public ListUserInstancePatchesResponse listUserInstancePatchesWithOptions(ListUserInstancePatchesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserInstancePatches"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserInstancePatchesResponse());
    }

    /**
     * @param request ListUserInstancePatchesRequest
     * @return ListUserInstancePatchesResponse
     */
    public ListUserInstancePatchesResponse listUserInstancePatches(ListUserInstancePatchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserInstancePatchesWithOptions(request, runtime);
    }

    /**
     * @param request ListUserInventoryEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserInventoryEntriesResponse
     */
    public ListUserInventoryEntriesResponse listUserInventoryEntriesWithOptions(ListUserInventoryEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeName)) {
            query.put("TypeName", request.typeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserInventoryEntries"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserInventoryEntriesResponse());
    }

    /**
     * @param request ListUserInventoryEntriesRequest
     * @return ListUserInventoryEntriesResponse
     */
    public ListUserInventoryEntriesResponse listUserInventoryEntries(ListUserInventoryEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserInventoryEntriesWithOptions(request, runtime);
    }

    /**
     * @param request ListUserTaskExecutionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserTaskExecutionsResponse
     */
    public ListUserTaskExecutionsResponse listUserTaskExecutionsWithOptions(ListUserTaskExecutionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDateAfter)) {
            query.put("EndDateAfter", request.endDateAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDateBefore)) {
            query.put("EndDateBefore", request.endDateBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeChildTaskExecution)) {
            query.put("IncludeChildTaskExecution", request.includeChildTaskExecution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentTaskExecutionId)) {
            query.put("ParentTaskExecutionId", request.parentTaskExecutionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            query.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDateAfter)) {
            query.put("StartDateAfter", request.startDateAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDateBefore)) {
            query.put("StartDateBefore", request.startDateBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskAction)) {
            query.put("TaskAction", request.taskAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskExecutionId)) {
            query.put("TaskExecutionId", request.taskExecutionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserTaskExecutions"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserTaskExecutionsResponse());
    }

    /**
     * @param request ListUserTaskExecutionsRequest
     * @return ListUserTaskExecutionsResponse
     */
    public ListUserTaskExecutionsResponse listUserTaskExecutions(ListUserTaskExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserTaskExecutionsWithOptions(request, runtime);
    }

    /**
     * @param request ListUserTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserTemplatesResponse
     */
    public ListUserTemplatesResponse listUserTemplatesWithOptions(ListUserTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdBy)) {
            query.put("CreatedBy", request.createdBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdDateAfter)) {
            query.put("CreatedDateAfter", request.createdDateAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdDateBefore)) {
            query.put("CreatedDateBefore", request.createdDateBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popularity)) {
            query.put("Popularity", request.popularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareType)) {
            query.put("ShareType", request.shareType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            query.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateFormat)) {
            query.put("TemplateFormat", request.templateFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserTemplates"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserTemplatesResponse());
    }

    /**
     * @param request ListUserTemplatesRequest
     * @return ListUserTemplatesResponse
     */
    public ListUserTemplatesResponse listUserTemplates(ListUserTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserTemplatesWithOptions(request, runtime);
    }

    /**
     * @param request ResetTimerTriggerExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetTimerTriggerExecutionResponse
     */
    public ResetTimerTriggerExecutionResponse resetTimerTriggerExecutionWithOptions(ResetTimerTriggerExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetTimerTriggerExecution"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetTimerTriggerExecutionResponse());
    }

    /**
     * @param request ResetTimerTriggerExecutionRequest
     * @return ResetTimerTriggerExecutionResponse
     */
    public ResetTimerTriggerExecutionResponse resetTimerTriggerExecution(ResetTimerTriggerExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetTimerTriggerExecutionWithOptions(request, runtime);
    }

    /**
     * @param request ResetUserExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetUserExecutionResponse
     */
    public ResetUserExecutionResponse resetUserExecutionWithOptions(ResetUserExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetUserExecution"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetUserExecutionResponse());
    }

    /**
     * @param request ResetUserExecutionRequest
     * @return ResetUserExecutionResponse
     */
    public ResetUserExecutionResponse resetUserExecution(ResetUserExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetUserExecutionWithOptions(request, runtime);
    }

    /**
     * @param request SetFlowControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetFlowControlResponse
     */
    public SetFlowControlResponse setFlowControlWithOptions(SetFlowControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.api)) {
            query.put("Api", request.api);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetFlowControl"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetFlowControlResponse());
    }

    /**
     * @param request SetFlowControlRequest
     * @return SetFlowControlResponse
     */
    public SetFlowControlResponse setFlowControl(SetFlowControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setFlowControlWithOptions(request, runtime);
    }

    /**
     * @param request SetQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetQuotaResponse
     */
    public SetQuotaResponse setQuotaWithOptions(SetQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.quotaName)) {
            query.put("QuotaName", request.quotaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetQuota"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetQuotaResponse());
    }

    /**
     * @param request SetQuotaRequest
     * @return SetQuotaResponse
     */
    public SetQuotaResponse setQuota(SetQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setQuotaWithOptions(request, runtime);
    }

    /**
     * @param request TerminateUserExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TerminateUserExecutionResponse
     */
    public TerminateUserExecutionResponse terminateUserExecutionWithOptions(TerminateUserExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TerminateUserExecution"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TerminateUserExecutionResponse());
    }

    /**
     * @param request TerminateUserExecutionRequest
     * @return TerminateUserExecutionResponse
     */
    public TerminateUserExecutionResponse terminateUserExecution(TerminateUserExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.terminateUserExecutionWithOptions(request, runtime);
    }

    /**
     * @param request UpdateActionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateActionResponse
     */
    public UpdateActionResponse updateActionWithOptions(UpdateActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionName)) {
            query.put("ActionName", request.actionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            query.put("ActionType", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popularity)) {
            query.put("Popularity", request.popularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAction"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateActionResponse());
    }

    /**
     * @param request UpdateActionRequest
     * @return UpdateActionResponse
     */
    public UpdateActionResponse updateAction(UpdateActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateActionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新一个已存在的公共参数。</p>
     * 
     * @param request UpdatePublicParameterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePublicParameterResponse
     */
    public UpdatePublicParameterResponse updatePublicParameterWithOptions(UpdatePublicParameterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePublicParameter"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePublicParameterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新一个已存在的公共参数。</p>
     * 
     * @param request UpdatePublicParameterRequest
     * @return UpdatePublicParameterResponse
     */
    public UpdatePublicParameterResponse updatePublicParameter(UpdatePublicParameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePublicParameterWithOptions(request, runtime);
    }

    /**
     * @param request UpdatePublicPatchBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePublicPatchBaselineResponse
     */
    public UpdatePublicPatchBaselineResponse updatePublicPatchBaselineWithOptions(UpdatePublicPatchBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalRules)) {
            query.put("ApprovalRules", request.approvalRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePublicPatchBaseline"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePublicPatchBaselineResponse());
    }

    /**
     * @param request UpdatePublicPatchBaselineRequest
     * @return UpdatePublicPatchBaselineResponse
     */
    public UpdatePublicPatchBaselineResponse updatePublicPatchBaseline(UpdatePublicPatchBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePublicPatchBaselineWithOptions(request, runtime);
    }

    /**
     * @param request UpdatePublicTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePublicTemplateResponse
     */
    public UpdatePublicTemplateResponse updatePublicTemplateWithOptions(UpdatePublicTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popularity)) {
            query.put("Popularity", request.popularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publisher)) {
            query.put("Publisher", request.publisher);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePublicTemplate"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePublicTemplateResponse());
    }

    /**
     * @param request UpdatePublicTemplateRequest
     * @return UpdatePublicTemplateResponse
     */
    public UpdatePublicTemplateResponse updatePublicTemplate(UpdatePublicTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePublicTemplateWithOptions(request, runtime);
    }

    /**
     * @param request ValidatePublicTemplateContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidatePublicTemplateContentResponse
     */
    public ValidatePublicTemplateContentResponse validatePublicTemplateContentWithOptions(ValidatePublicTemplateContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidatePublicTemplateContent"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidatePublicTemplateContentResponse());
    }

    /**
     * @param request ValidatePublicTemplateContentRequest
     * @return ValidatePublicTemplateContentResponse
     */
    public ValidatePublicTemplateContentResponse validatePublicTemplateContent(ValidatePublicTemplateContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validatePublicTemplateContentWithOptions(request, runtime);
    }
}

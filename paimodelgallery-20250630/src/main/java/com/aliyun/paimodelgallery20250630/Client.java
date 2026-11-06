// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630;

import com.aliyun.tea.*;
import com.aliyun.paimodelgallery20250630.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "PAIModelGallery";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("paimodelgallery", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建任务计划。</p>
     * 
     * @param request CreateJobPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobPlanResponse
     */
    public CreateJobPlanResponse createJobPlanWithOptions(CreateJobPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobPlanName)) {
            body.put("JobPlanName", request.jobPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobPlanSteps)) {
            body.put("JobPlanSteps", request.jobPlanSteps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobPlanType)) {
            body.put("JobPlanType", request.jobPlanType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJobPlan"),
            new TeaPair("version", "2025-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobplans"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务计划。</p>
     * 
     * @param request CreateJobPlanRequest
     * @return CreateJobPlanResponse
     */
    public CreateJobPlanResponse createJobPlan(CreateJobPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJobPlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除任务计划。</p>
     * 
     * @param request DeleteJobPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteJobPlanResponse
     */
    public DeleteJobPlanResponse deleteJobPlanWithOptions(String JobPlanId, DeleteJobPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteJobPlan"),
            new TeaPair("version", "2025-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobplans/" + com.aliyun.openapiutil.Client.getEncodeParam(JobPlanId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteJobPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除任务计划。</p>
     * 
     * @param request DeleteJobPlanRequest
     * @return DeleteJobPlanResponse
     */
    public DeleteJobPlanResponse deleteJobPlan(String JobPlanId, DeleteJobPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteJobPlanWithOptions(JobPlanId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询蒸馏模板详情。</p>
     * 
     * @param request GetDistillationTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDistillationTemplateResponse
     */
    public GetDistillationTemplateResponse getDistillationTemplateWithOptions(String TemplateId, GetDistillationTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDistillationTemplate"),
            new TeaPair("version", "2025-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/distillationtemplates/" + com.aliyun.openapiutil.Client.getEncodeParam(TemplateId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDistillationTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询蒸馏模板详情。</p>
     * 
     * @param request GetDistillationTemplateRequest
     * @return GetDistillationTemplateResponse
     */
    public GetDistillationTemplateResponse getDistillationTemplate(String TemplateId, GetDistillationTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDistillationTemplateWithOptions(TemplateId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务计划。</p>
     * 
     * @param request GetJobPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobPlanResponse
     */
    public GetJobPlanResponse getJobPlanWithOptions(String JobPlanId, GetJobPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobPlan"),
            new TeaPair("version", "2025-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobplans/" + com.aliyun.openapiutil.Client.getEncodeParam(JobPlanId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务计划。</p>
     * 
     * @param request GetJobPlanRequest
     * @return GetJobPlanResponse
     */
    public GetJobPlanResponse getJobPlan(String JobPlanId, GetJobPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobPlanWithOptions(JobPlanId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询蒸馏模板列表。</p>
     * 
     * @param request ListDistillationTemplatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDistillationTemplatesResponse
     */
    public ListDistillationTemplatesResponse listDistillationTemplatesWithOptions(ListDistillationTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateKind)) {
            query.put("TemplateKind", request.templateKind);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDistillationTemplates"),
            new TeaPair("version", "2025-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/distillationtemplates"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDistillationTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询蒸馏模板列表。</p>
     * 
     * @param request ListDistillationTemplatesRequest
     * @return ListDistillationTemplatesResponse
     */
    public ListDistillationTemplatesResponse listDistillationTemplates(ListDistillationTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDistillationTemplatesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务计划列表。</p>
     * 
     * @param tmpReq ListJobPlansRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobPlansResponse
     */
    public ListJobPlansResponse listJobPlansWithOptions(ListJobPlansRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListJobPlansShrinkRequest request = new ListJobPlansShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hasTemplate)) {
            query.put("HasTemplate", request.hasTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobPlanName)) {
            query.put("JobPlanName", request.jobPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobPlanType)) {
            query.put("JobPlanType", request.jobPlanType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobPlans"),
            new TeaPair("version", "2025-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobplans"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobPlansResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务计划列表。</p>
     * 
     * @param request ListJobPlansRequest
     * @return ListJobPlansResponse
     */
    public ListJobPlansResponse listJobPlans(ListJobPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobPlansWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取ModelGallery模型列表</p>
     * 
     * @param tmpReq ListModelGalleryModelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelGalleryModelsResponse
     */
    public ListModelGalleryModelsResponse listModelGalleryModelsWithOptions(ListModelGalleryModelsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListModelGalleryModelsShrinkRequest request = new ListModelGalleryModelsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.conditions)) {
            request.conditionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.conditions, "Conditions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collections)) {
            query.put("Collections", request.collections);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compressible)) {
            query.put("Compressible", request.compressible);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditionsShrink)) {
            query.put("Conditions", request.conditionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deepThink)) {
            query.put("DeepThink", request.deepThink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.demonstrable)) {
            query.put("Demonstrable", request.demonstrable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployable)) {
            query.put("Deployable", request.deployable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distillable)) {
            query.put("Distillable", request.distillable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluable)) {
            query.put("Evaluable", request.evaluable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionCall)) {
            query.put("FunctionCall", request.functionCall);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            query.put("ModelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelSeries)) {
            query.put("ModelSeries", request.modelSeries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            query.put("ModelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("Origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportedCompressionResource)) {
            query.put("SupportedCompressionResource", request.supportedCompressionResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportedDistillationResource)) {
            query.put("SupportedDistillationResource", request.supportedDistillationResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportedEvaluationResource)) {
            query.put("SupportedEvaluationResource", request.supportedEvaluationResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportedInferenceResource)) {
            query.put("SupportedInferenceResource", request.supportedInferenceResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportedTrainingResource)) {
            query.put("SupportedTrainingResource", request.supportedTrainingResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.task)) {
            query.put("Task", request.task);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainable)) {
            query.put("Trainable", request.trainable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelGalleryModels"),
            new TeaPair("version", "2025-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelgallery/models"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelGalleryModelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取ModelGallery模型列表</p>
     * 
     * @param request ListModelGalleryModelsRequest
     * @return ListModelGalleryModelsResponse
     */
    public ListModelGalleryModelsResponse listModelGalleryModels(ListModelGalleryModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModelGalleryModelsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新任务计划。</p>
     * 
     * @param request UpdateJobPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateJobPlanResponse
     */
    public UpdateJobPlanResponse updateJobPlanWithOptions(String JobPlanId, UpdateJobPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobPlanCurrentStep)) {
            body.put("JobPlanCurrentStep", request.jobPlanCurrentStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateJobPlan"),
            new TeaPair("version", "2025-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobplans/" + com.aliyun.openapiutil.Client.getEncodeParam(JobPlanId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateJobPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新任务计划。</p>
     * 
     * @param request UpdateJobPlanRequest
     * @return UpdateJobPlanResponse
     */
    public UpdateJobPlanResponse updateJobPlan(String JobPlanId, UpdateJobPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateJobPlanWithOptions(JobPlanId, request, headers, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630;

import com.aliyun.tea.*;
import com.aliyun.paimodelgallery20250630.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation creates a new node plan. You can specify the workspace ID, node plan type, name, and steps.</li>
     * <li>If you use a scenario-specific distillation template, provide the <code>TemplateId</code> parameter and make sure that <code>JobPlanSteps</code> contains distillation configurations that match the template.</li>
     * <li>The <code>Tag</code> parameter follows the Alibaba Cloud label system specification and is used to add additional identity information to the node plan.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a new job plan that supports task types such as distillation.</p>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation creates a new node plan. You can specify the workspace ID, node plan type, name, and steps.</li>
     * <li>If you use a scenario-specific distillation template, provide the <code>TemplateId</code> parameter and make sure that <code>JobPlanSteps</code> contains distillation configurations that match the template.</li>
     * <li>The <code>Tag</code> parameter follows the Alibaba Cloud label system specification and is used to add additional identity information to the node plan.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a new job plan that supports task types such as distillation.</p>
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
     * <b>description</b> :
     * <h2>Operation description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified task plan by task plan ID.</p>
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
     * <b>description</b> :
     * <h2>Operation description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified task plan by task plan ID.</p>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation queries the full details of a specific distillation template to facilitate rendering the creation form.</li>
     * <li>The template ID is a required parameter, obtained from the <code>ListDistillationTemplates</code> operation.</li>
     * <li>The <code>DefaultConfig</code> field provides the complete EasyDistill configuration YAML (with comments). All paths in the YAML are relative paths, and callers do not need to perform absolute path conversion or string replacement.</li>
     * <li>All translatable fields are automatically parsed into the corresponding language version based on the <code>x-acs-accept-language</code> request header.</li>
     * <li>If the <code>TrainingOptions</code> field is missing, the template supports only the first stage of processing. Attempts to use such a template to create a task that includes the second stage will fail.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified distillation template, including preset configurations and default YAML.</p>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation queries the full details of a specific distillation template to facilitate rendering the creation form.</li>
     * <li>The template ID is a required parameter, obtained from the <code>ListDistillationTemplates</code> operation.</li>
     * <li>The <code>DefaultConfig</code> field provides the complete EasyDistill configuration YAML (with comments). All paths in the YAML are relative paths, and callers do not need to perform absolute path conversion or string replacement.</li>
     * <li>All translatable fields are automatically parsed into the corresponding language version based on the <code>x-acs-accept-language</code> request header.</li>
     * <li>If the <code>TrainingOptions</code> field is missing, the template supports only the first stage of processing. Attempts to use such a template to create a task that includes the second stage will fail.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified distillation template, including preset configurations and default YAML.</p>
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
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This API operation retrieves the details of a job plan based on the specified job plan ID (<code>JobPlanId</code>), including but not limited to the name, type, and current step status of the job plan. Make sure the <code>JobPlanId</code> provided in the request is valid and belongs to your workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified job plan by job plan ID.</p>
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
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This API operation retrieves the details of a job plan based on the specified job plan ID (<code>JobPlanId</code>), including but not limited to the name, type, and current step status of the job plan. Make sure the <code>JobPlanId</code> provided in the request is valid and belongs to your workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified job plan by job plan ID.</p>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation supports filtered queries by using the TemplateId, Category, and Keyword parameters.</li>
     * <li>Pagination is controlled by the PageNumber and PageSize parameters, consistent with other paginated operations of the same service.</li>
     * <li>Templates are public resources that do not belong to any workspace. Therefore, you do not need to specify WorkspaceId.</li>
     * <li>All translatable fields such as TemplateName and Description are automatically parsed into the corresponding language version based on the x-acs-accept-language request header.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves summary information of distillation templates for rendering the template card list.</p>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation supports filtered queries by using the TemplateId, Category, and Keyword parameters.</li>
     * <li>Pagination is controlled by the PageNumber and PageSize parameters, consistent with other paginated operations of the same service.</li>
     * <li>Templates are public resources that do not belong to any workspace. Therefore, you do not need to specify WorkspaceId.</li>
     * <li>All translatable fields such as TemplateName and Description are automatically parsed into the corresponding language version based on the x-acs-accept-language request header.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves summary information of distillation templates for rendering the template card list.</p>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><code>WorkspaceId</code> is a required parameter that specifies the workspace to which the job plans belong.</li>
     * <li>The <code>Tag</code> parameter must be encoded by using <code>EncodeURI</code> before being passed.</li>
     * <li>If both <code>TemplateId</code> and <code>HasTemplate</code> are specified, the value of <code>TemplateId</code> takes precedence for filtering.</li>
     * <li><code>JobPlanName</code> supports exact match. Enclose the specific name in quotation marks.</li>
     * <li>By default, results are sorted in descending order by creation time (<code>GmtCreateTime</code>). Set the <code>Order</code> parameter to <code>ASC</code> to change the sort order.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of job plans in a specified workspace.</p>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><code>WorkspaceId</code> is a required parameter that specifies the workspace to which the job plans belong.</li>
     * <li>The <code>Tag</code> parameter must be encoded by using <code>EncodeURI</code> before being passed.</li>
     * <li>If both <code>TemplateId</code> and <code>HasTemplate</code> are specified, the value of <code>TemplateId</code> takes precedence for filtering.</li>
     * <li><code>JobPlanName</code> supports exact match. Enclose the specific name in quotation marks.</li>
     * <li>By default, results are sorted in descending order by creation time (<code>GmtCreateTime</code>). Set the <code>Order</code> parameter to <code>ASC</code> to change the sort order.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of job plans in a specified workspace.</p>
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
     * <p>Retrieves the list of models from ModelGallery (deprecated, use the 2026-06-03 version instead).</p>
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
     * <p>Retrieves the list of models from ModelGallery (deprecated, use the 2026-06-03 version instead).</p>
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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>You can use this API operation to update the current execution step (<code>JobPlanCurrentStep</code>) and related tags (<code>Tag</code>) of a specific task plan identified by <code>JobPlanId</code>. If the request contains tag information, tags are updated or added based on the provided key-value pairs.</p>
     * <ul>
     * <li><strong>JobPlanId</strong> is a path parameter. You must provide a valid task plan ID.</li>
     * <li><strong>JobPlanCurrentStep</strong> is an optional parameter that specifies the new current step of the task.</li>
     * <li><strong>Tag</strong> is an optional parameter that specifies a list of key-value pairs used to label the task plan. Each tag consists of a <code>Key</code> and a <code>Value</code>.
     * Note: Ensure that the <code>JobPlanId</code> you provide exists and that you have the permissions to modify it.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the current step and tag information of a specified task plan.</p>
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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>You can use this API operation to update the current execution step (<code>JobPlanCurrentStep</code>) and related tags (<code>Tag</code>) of a specific task plan identified by <code>JobPlanId</code>. If the request contains tag information, tags are updated or added based on the provided key-value pairs.</p>
     * <ul>
     * <li><strong>JobPlanId</strong> is a path parameter. You must provide a valid task plan ID.</li>
     * <li><strong>JobPlanCurrentStep</strong> is an optional parameter that specifies the new current step of the task.</li>
     * <li><strong>Tag</strong> is an optional parameter that specifies a list of key-value pairs used to label the task plan. Each tag consists of a <code>Key</code> and a <code>Value</code>.
     * Note: Ensure that the <code>JobPlanId</code> you provide exists and that you have the permissions to modify it.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the current step and tag information of a specified task plan.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616;

import com.aliyun.tea.*;
import com.aliyun.openitag20220616.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shenzhen", "openitag.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shanghai", "openitag.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "openitag.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-beijing", "openitag.cn-beijing.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("openitag", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Assign personnel to the worker nodes (annotation, quality inspection, and validation) of an annotation job.</p>
     * 
     * @param request AddWorkNodeWorkforceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddWorkNodeWorkforceResponse
     */
    public AddWorkNodeWorkforceResponse addWorkNodeWorkforceWithOptions(String TenantId, String TaskId, String WorkNodeId, AddWorkNodeWorkforceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddWorkNodeWorkforce"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + "/worknodes/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkNodeId) + "/workforce"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddWorkNodeWorkforceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Assign personnel to the worker nodes (annotation, quality inspection, and validation) of an annotation job.</p>
     * 
     * @param request AddWorkNodeWorkforceRequest
     * @return AddWorkNodeWorkforceResponse
     */
    public AddWorkNodeWorkforceResponse addWorkNodeWorkforce(String TenantId, String TaskId, String WorkNodeId, AddWorkNodeWorkforceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addWorkNodeWorkforceWithOptions(TenantId, TaskId, WorkNodeId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Append data to a job.</p>
     * 
     * @param request AppendAllDataToTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AppendAllDataToTaskResponse
     */
    public AppendAllDataToTaskResponse appendAllDataToTaskWithOptions(String TenantId, String TaskId, AppendAllDataToTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppendAllDataToTask"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + "/appendAllDataToTask"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppendAllDataToTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Append data to a job.</p>
     * 
     * @param request AppendAllDataToTaskRequest
     * @return AppendAllDataToTaskResponse
     */
    public AppendAllDataToTaskResponse appendAllDataToTask(String TenantId, String TaskId, AppendAllDataToTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.appendAllDataToTaskWithOptions(TenantId, TaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create an annotation job for the current tenant.</p>
     * 
     * @param request CreateTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTaskWithOptions(String TenantId, CreateTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTask"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create an annotation job for the current tenant.</p>
     * 
     * @param request CreateTaskRequest
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(String TenantId, CreateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTaskWithOptions(TenantId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can add a new template for the current tenant and customize the annotation template based on your business requirements.</p>
     * 
     * @param request CreateTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplateWithOptions(String TenantId, CreateTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplate"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/templates"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can add a new template for the current tenant and customize the annotation template based on your business requirements.</p>
     * 
     * @param request CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(String TenantId, CreateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTemplateWithOptions(TenantId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add a member to the tenant.</p>
     * 
     * @param request CreateUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserResponse
     */
    public CreateUserResponse createUserWithOptions(String TenantId, CreateUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            body.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/users"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add a member to the tenant.</p>
     * 
     * @param request CreateUserRequest
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(String TenantId, CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserWithOptions(TenantId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a job under the current tenant.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTaskWithOptions(String TenantId, String TaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTask"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a job under the current tenant.</p>
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(String TenantId, String TaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTaskWithOptions(TenantId, TaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the template under the current tenant.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplateWithOptions(String TenantId, String TemplateId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplate"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(TemplateId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the template under the current tenant.</p>
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(String TenantId, String TemplateId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTemplateWithOptions(TenantId, TemplateId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a member within a tenant.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUserWithOptions(String TenantId, String UserId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(UserId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a member within a tenant.</p>
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(String TenantId, String UserId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUserWithOptions(TenantId, UserId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Export the result data of an annotation job.</p>
     * 
     * @param request ExportAnnotationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportAnnotationsResponse
     */
    public ExportAnnotationsResponse exportAnnotationsWithOptions(String TenantId, String TaskId, ExportAnnotationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ossPath)) {
            query.put("OssPath", request.ossPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerDataset)) {
            query.put("RegisterDataset", request.registerDataset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportAnnotations"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + "/annotations/export"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportAnnotationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Export the result data of an annotation job.</p>
     * 
     * @param request ExportAnnotationsRequest
     * @return ExportAnnotationsResponse
     */
    public ExportAnnotationsResponse exportAnnotations(String TenantId, String TaskId, ExportAnnotationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportAnnotationsWithOptions(TenantId, TaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the information of a single annotation export result.</p>
     * 
     * @param request GetJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobResponse
     */
    public GetJobResponse getJobWithOptions(String TenantId, String JobId, GetJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJob"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(JobId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the information of a single annotation export result.</p>
     * 
     * @param request GetJobRequest
     * @return GetJobResponse
     */
    public GetJobResponse getJob(String TenantId, String JobId, GetJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobWithOptions(TenantId, JobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the information of a single subtask package.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSubtaskResponse
     */
    public GetSubtaskResponse getSubtaskWithOptions(String TenantId, String TaskID, String SubtaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubtask"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskID) + "/subtasks/" + com.aliyun.openapiutil.Client.getEncodeParam(SubtaskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubtaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the information of a single subtask package.</p>
     * @return GetSubtaskResponse
     */
    public GetSubtaskResponse getSubtask(String TenantId, String TaskID, String SubtaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSubtaskWithOptions(TenantId, TaskID, SubtaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query a single annotated data item in a subtask package.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSubtaskItemResponse
     */
    public GetSubtaskItemResponse getSubtaskItemWithOptions(String TenantId, String TaskId, String SubtaskId, String ItemId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubtaskItem"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + "/subtasks/" + com.aliyun.openapiutil.Client.getEncodeParam(SubtaskId) + "/items/" + com.aliyun.openapiutil.Client.getEncodeParam(ItemId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubtaskItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query a single annotated data item in a subtask package.</p>
     * @return GetSubtaskItemResponse
     */
    public GetSubtaskItemResponse getSubtaskItem(String TenantId, String TaskId, String SubtaskId, String ItemId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSubtaskItemWithOptions(TenantId, TaskId, SubtaskId, ItemId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the information of a single annotation job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskResponse
     */
    public GetTaskResponse getTaskWithOptions(String TenantId, String TaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the information of a single annotation job.</p>
     * @return GetTaskResponse
     */
    public GetTaskResponse getTask(String TenantId, String TaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskWithOptions(TenantId, TaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the current statistics information of a job.</p>
     * 
     * @param request GetTaskStatisticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskStatisticsResponse
     */
    public GetTaskStatisticsResponse getTaskStatisticsWithOptions(String TenantId, String TaskId, GetTaskStatisticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.statType)) {
            query.put("StatType", request.statType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskStatistics"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + "/statistics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the current statistics information of a job.</p>
     * 
     * @param request GetTaskStatisticsRequest
     * @return GetTaskStatisticsResponse
     */
    public GetTaskStatisticsResponse getTaskStatistics(String TenantId, String TaskId, GetTaskStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskStatisticsWithOptions(TenantId, TaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the current status of a job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskStatusResponse
     */
    public GetTaskStatusResponse getTaskStatusWithOptions(String TenantId, String TaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskStatus"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + "/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the current status of a job.</p>
     * @return GetTaskStatusResponse
     */
    public GetTaskStatusResponse getTaskStatus(String TenantId, String TaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskStatusWithOptions(TenantId, TaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the current template information of a job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskTemplateResponse
     */
    public GetTaskTemplateResponse getTaskTemplateWithOptions(String TenantId, String TaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskTemplate"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + "/template"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the current template information of a job.</p>
     * @return GetTaskTemplateResponse
     */
    public GetTaskTemplateResponse getTaskTemplate(String TenantId, String TaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskTemplateWithOptions(TenantId, TaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query job template questions.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskTemplateQuestionsResponse
     */
    public GetTaskTemplateQuestionsResponse getTaskTemplateQuestionsWithOptions(String TenantId, String TaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskTemplateQuestions"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + "/template/questions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskTemplateQuestionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query job template questions.</p>
     * @return GetTaskTemplateQuestionsResponse
     */
    public GetTaskTemplateQuestionsResponse getTaskTemplateQuestions(String TenantId, String TaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskTemplateQuestionsWithOptions(TenantId, TaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the data display information in the job template.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskTemplateViewsResponse
     */
    public GetTaskTemplateViewsResponse getTaskTemplateViewsWithOptions(String TenantId, String TaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskTemplateViews"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + "/template/views"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskTemplateViewsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the data display information in the job template.</p>
     * @return GetTaskTemplateViewsResponse
     */
    public GetTaskTemplateViewsResponse getTaskTemplateViews(String TenantId, String TaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskTemplateViewsWithOptions(TenantId, TaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the personnel configuration information of each node in a job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskWorkforceResponse
     */
    public GetTaskWorkforceResponse getTaskWorkforceWithOptions(String TenantId, String TaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskWorkforce"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + "/workforce"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskWorkforceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the personnel configuration information of each node in a job.</p>
     * @return GetTaskWorkforceResponse
     */
    public GetTaskWorkforceResponse getTaskWorkforce(String TenantId, String TaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskWorkforceWithOptions(TenantId, TaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query statistics of each member in a job.</p>
     * 
     * @param request GetTaskWorkforceStatisticRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskWorkforceStatisticResponse
     */
    public GetTaskWorkforceStatisticResponse getTaskWorkforceStatisticWithOptions(String TenantId, String TaskId, GetTaskWorkforceStatisticRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statType)) {
            query.put("StatType", request.statType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskWorkforceStatistic"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + "/workforce/statistic"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskWorkforceStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query statistics of each member in a job.</p>
     * 
     * @param request GetTaskWorkforceStatisticRequest
     * @return GetTaskWorkforceStatisticResponse
     */
    public GetTaskWorkforceStatisticResponse getTaskWorkforceStatistic(String TenantId, String TaskId, GetTaskWorkforceStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskWorkforceStatisticWithOptions(TenantId, TaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query template information under a tenant.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplateWithOptions(String TenantId, String TemplateId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplate"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(TemplateId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query template information under a tenant.</p>
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplate(String TenantId, String TemplateId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTemplateWithOptions(TenantId, TemplateId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query question information such as Radio and Multiple Choice in a template.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateQuestionsResponse
     */
    public GetTemplateQuestionsResponse getTemplateQuestionsWithOptions(String TenantId, String TemplateId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplateQuestions"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(TemplateId) + "/questions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateQuestionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query question information such as Radio and Multiple Choice in a template.</p>
     * @return GetTemplateQuestionsResponse
     */
    public GetTemplateQuestionsResponse getTemplateQuestions(String TenantId, String TemplateId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTemplateQuestionsWithOptions(TenantId, TemplateId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the display information such as images, text, and audio in the template.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateViewResponse
     */
    public GetTemplateViewResponse getTemplateViewWithOptions(String TenantId, String TemplateId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplateView"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(TemplateId) + "/views"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the display information such as images, text, and audio in the template.</p>
     * @return GetTemplateViewResponse
     */
    public GetTemplateViewResponse getTemplateView(String TenantId, String TemplateId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTemplateViewWithOptions(TenantId, TemplateId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query information about the iTAG tenant.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTenantResponse
     */
    public GetTenantResponse getTenantWithOptions(String TenantId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTenant"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTenantResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query information about the iTAG tenant.</p>
     * @return GetTenantResponse
     */
    public GetTenantResponse getTenant(String TenantId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTenantWithOptions(TenantId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the details of a single member in a tenant.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(String TenantId, String UserId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(UserId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the details of a single member in a tenant.</p>
     * @return GetUserResponse
     */
    public GetUserResponse getUser(String TenantId, String UserId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserWithOptions(TenantId, UserId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Displays a list of all exported annotation results.</p>
     * 
     * @param request ListJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobsWithOptions(String TenantId, ListJobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobs"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/jobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Displays a list of all exported annotation results.</p>
     * 
     * @param request ListJobsRequest
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(String TenantId, ListJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobsWithOptions(TenantId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Display the annotation data of a single subtask package.</p>
     * 
     * @param request ListSubtaskItemsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubtaskItemsResponse
     */
    public ListSubtaskItemsResponse listSubtaskItemsWithOptions(String TenantId, String TaskID, String SubtaskId, ListSubtaskItemsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubtaskItems"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskID) + "/subtasks/" + com.aliyun.openapiutil.Client.getEncodeParam(SubtaskId) + "/items"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubtaskItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Display the annotation data of a single subtask package.</p>
     * 
     * @param request ListSubtaskItemsRequest
     * @return ListSubtaskItemsResponse
     */
    public ListSubtaskItemsResponse listSubtaskItems(String TenantId, String TaskID, String SubtaskId, ListSubtaskItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSubtaskItemsWithOptions(TenantId, TaskID, SubtaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Displays the list of subtask packages.</p>
     * 
     * @param request ListSubtasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubtasksResponse
     */
    public ListSubtasksResponse listSubtasksWithOptions(String TenantId, String TaskID, ListSubtasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubtasks"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskID) + "/subtasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubtasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Displays the list of subtask packages.</p>
     * 
     * @param request ListSubtasksRequest
     * @return ListSubtasksResponse
     */
    public ListSubtasksResponse listSubtasks(String TenantId, String TaskID, ListSubtasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSubtasksWithOptions(TenantId, TaskID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Displays the list of annotation jobs for the current tenant.</p>
     * 
     * @param request ListTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasksWithOptions(String TenantId, ListTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasks"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Displays the list of annotation jobs for the current tenant.</p>
     * 
     * @param request ListTasksRequest
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(String TenantId, ListTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTasksWithOptions(TenantId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Display the template list of the current tenant.</p>
     * 
     * @param tmpReq ListTemplatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplatesWithOptions(String TenantId, ListTemplatesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTemplatesShrinkRequest request = new ListTemplatesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.types)) {
            request.typesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.types, "Types", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typesShrink)) {
            query.put("Types", request.typesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplates"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/templates"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Display the template list of the current tenant.</p>
     * 
     * @param request ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(String TenantId, ListTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTemplatesWithOptions(TenantId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query iTAG tenants under an Alibaba Cloud account.</p>
     * 
     * @param request ListTenantsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTenantsResponse
     */
    public ListTenantsResponse listTenantsWithOptions(ListTenantsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTenants"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTenantsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query iTAG tenants under an Alibaba Cloud account.</p>
     * 
     * @param request ListTenantsRequest
     * @return ListTenantsResponse
     */
    public ListTenantsResponse listTenants(ListTenantsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTenantsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Displays all annotate members under the current tenant.</p>
     * 
     * @param request ListUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(String TenantId, ListUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/users"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Displays all annotate members under the current tenant.</p>
     * 
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(String TenantId, ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUsersWithOptions(TenantId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Node Personnel</p>
     * 
     * @param request RemoveWorkNodeWorkforceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveWorkNodeWorkforceResponse
     */
    public RemoveWorkNodeWorkforceResponse removeWorkNodeWorkforceWithOptions(String TenantId, String TaskId, String WorkNodeId, RemoveWorkNodeWorkforceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveWorkNodeWorkforce"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + "/worknodes/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkNodeId) + "/workforce"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveWorkNodeWorkforceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Node Personnel</p>
     * 
     * @param request RemoveWorkNodeWorkforceRequest
     * @return RemoveWorkNodeWorkforceResponse
     */
    public RemoveWorkNodeWorkforceResponse removeWorkNodeWorkforce(String TenantId, String TaskId, String WorkNodeId, RemoveWorkNodeWorkforceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeWorkNodeWorkforceWithOptions(TenantId, TaskId, WorkNodeId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify a job under the current tenant.</p>
     * 
     * @param request UpdateTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskResponse
     */
    public UpdateTaskResponse updateTaskWithOptions(String TenantId, String TaskId, UpdateTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTask"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify a job under the current tenant.</p>
     * 
     * @param request UpdateTaskRequest
     * @return UpdateTaskResponse
     */
    public UpdateTaskResponse updateTask(String TenantId, String TaskId, UpdateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTaskWithOptions(TenantId, TaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update job members.</p>
     * 
     * @param request UpdateTaskWorkforceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskWorkforceResponse
     */
    public UpdateTaskWorkforceResponse updateTaskWorkforceWithOptions(String TenantId, String TaskId, UpdateTaskWorkforceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workforce)) {
            body.put("Workforce", request.workforce);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskWorkforce"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + "/workforce"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskWorkforceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update job members.</p>
     * 
     * @param request UpdateTaskWorkforceRequest
     * @return UpdateTaskWorkforceResponse
     */
    public UpdateTaskWorkforceResponse updateTaskWorkforce(String TenantId, String TaskId, UpdateTaskWorkforceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTaskWorkforceWithOptions(TenantId, TaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the template under the current tenant.</p>
     * 
     * @param request UpdateTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplateWithOptions(String TenantId, String TemplateId, UpdateTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTemplate"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(TemplateId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the template under the current tenant.</p>
     * 
     * @param request UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplate(String TenantId, String TemplateId, UpdateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTemplateWithOptions(TenantId, TemplateId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the information of an iTAG tenant.</p>
     * 
     * @param request UpdateTenantRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTenantResponse
     */
    public UpdateTenantResponse updateTenantWithOptions(String TenantId, UpdateTenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantName)) {
            body.put("TenantName", request.tenantName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTenant"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTenantResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the information of an iTAG tenant.</p>
     * 
     * @param request UpdateTenantRequest
     * @return UpdateTenantResponse
     */
    public UpdateTenantResponse updateTenant(String TenantId, UpdateTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTenantWithOptions(TenantId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update member information within a tenant.</p>
     * 
     * @param request UpdateUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUserWithOptions(String TenantId, String UserId, UpdateUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(TenantId) + "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(UserId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update member information within a tenant.</p>
     * 
     * @param request UpdateUserRequest
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(String TenantId, String UserId, UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUserWithOptions(TenantId, UserId, request, headers, runtime);
    }
}

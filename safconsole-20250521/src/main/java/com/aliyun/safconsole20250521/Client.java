// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521;

import com.aliyun.tea.*;
import com.aliyun.safconsole20250521.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("safconsole", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used for customers to create a modeling project for the first time.</li>
     * <li><code>projectName</code> is a required field, with a maximum length of 50 characters.</li>
     * <li><code>remark</code> and <code>instanceSpec</code> are optional, where <code>remark</code> has a maximum length of 200 characters.</li>
     * <li>The available values for <code>instanceSpec</code> include <code>SECURE_ENV_LITE</code> and <code>SECURE_ENV_PRO</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Apply for Bastion Host Account</p>
     * 
     * @param request ApplyBastionAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyBastionAccountResponse
     */
    public ApplyBastionAccountResponse applyBastionAccountWithOptions(ApplyBastionAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyBastionAccount"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyBastionAccountResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used for customers to create a modeling project for the first time.</li>
     * <li><code>projectName</code> is a required field, with a maximum length of 50 characters.</li>
     * <li><code>remark</code> and <code>instanceSpec</code> are optional, where <code>remark</code> has a maximum length of 200 characters.</li>
     * <li>The available values for <code>instanceSpec</code> include <code>SECURE_ENV_LITE</code> and <code>SECURE_ENV_PRO</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Apply for Bastion Host Account</p>
     * 
     * @param request ApplyBastionAccountRequest
     * @return ApplyBastionAccountResponse
     */
    public ApplyBastionAccountResponse applyBastionAccount(ApplyBastionAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyBastionAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associate Retrospective Task</p>
     * 
     * @param request AssociatePocTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociatePocTaskResponse
     */
    public AssociatePocTaskResponse associatePocTaskWithOptions(AssociatePocTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociatePocTask"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociatePocTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associate Retrospective Task</p>
     * 
     * @param request AssociatePocTaskRequest
     * @return AssociatePocTaskResponse
     */
    public AssociatePocTaskResponse associatePocTask(AssociatePocTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associatePocTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Complete project and release resources.</p>
     * 
     * @param request CompleteModelingProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompleteModelingProjectResponse
     */
    public CompleteModelingProjectResponse completeModelingProjectWithOptions(CompleteModelingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteModelingProject"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompleteModelingProjectResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Complete project and release resources.</p>
     * 
     * @param request CompleteModelingProjectRequest
     * @return CompleteModelingProjectResponse
     */
    public CompleteModelingProjectResponse completeModelingProject(CompleteModelingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.completeModelingProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create basic model information</p>
     * 
     * @param request CreateCustomerModuleBasicInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomerModuleBasicInfoResponse
     */
    public CreateCustomerModuleBasicInfoResponse createCustomerModuleBasicInfoWithOptions(CreateCustomerModuleBasicInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleName)) {
            query.put("CustomerModuleName", request.customerModuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleType)) {
            query.put("ModuleType", request.moduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storePath)) {
            query.put("StorePath", request.storePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomerModuleBasicInfo"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomerModuleBasicInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create basic model information</p>
     * 
     * @param request CreateCustomerModuleBasicInfoRequest
     * @return CreateCustomerModuleBasicInfoResponse
     */
    public CreateCustomerModuleBasicInfoResponse createCustomerModuleBasicInfo(CreateCustomerModuleBasicInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomerModuleBasicInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each option including a label (label) and value (value).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Save Model Feature Configuration</p>
     * 
     * @param request CreateCustomerModuleMetaInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomerModuleMetaInfoResponse
     */
    public CreateCustomerModuleMetaInfoResponse createCustomerModuleMetaInfoWithOptions(CreateCustomerModuleMetaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureString)) {
            query.put("FeatureString", request.featureString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureTemplate)) {
            query.put("FeatureTemplate", request.featureTemplate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomerModuleMetaInfo"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomerModuleMetaInfoResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each option including a label (label) and value (value).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Save Model Feature Configuration</p>
     * 
     * @param request CreateCustomerModuleMetaInfoRequest
     * @return CreateCustomerModuleMetaInfoResponse
     */
    public CreateCustomerModuleMetaInfoResponse createCustomerModuleMetaInfo(CreateCustomerModuleMetaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomerModuleMetaInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Model Output Information</p>
     * 
     * @param request CreateCustomerModuleOutputInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomerModuleOutputInfoResponse
     */
    public CreateCustomerModuleOutputInfoResponse createCustomerModuleOutputInfoWithOptions(CreateCustomerModuleOutputInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.finalScoreFormat)) {
            query.put("FinalScoreFormat", request.finalScoreFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processExpression)) {
            query.put("ProcessExpression", request.processExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testFileUrl)) {
            query.put("TestFileUrl", request.testFileUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomerModuleOutputInfo"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomerModuleOutputInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Model Output Information</p>
     * 
     * @param request CreateCustomerModuleOutputInfoRequest
     * @return CreateCustomerModuleOutputInfoResponse
     */
    public CreateCustomerModuleOutputInfoResponse createCustomerModuleOutputInfo(CreateCustomerModuleOutputInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomerModuleOutputInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used for customers to create a modeling project for the first time.</li>
     * <li><code>projectName</code> is a required field, with a maximum length of 50 characters.</li>
     * <li><code>remark</code> and <code>instanceSpec</code> are optional, where <code>remark</code> has a maximum length of 200 characters.</li>
     * <li>The available values for <code>instanceSpec</code> include <code>SECURE_ENV_LITE</code> and <code>SECURE_ENV_PRO</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initialize a modeling project.</p>
     * 
     * @param request CreateModelingProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelingProjectResponse
     */
    public CreateModelingProjectResponse createModelingProjectWithOptions(CreateModelingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceSpec)) {
            query.put("InstanceSpec", request.instanceSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModelingProject"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelingProjectResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used for customers to create a modeling project for the first time.</li>
     * <li><code>projectName</code> is a required field, with a maximum length of 50 characters.</li>
     * <li><code>remark</code> and <code>instanceSpec</code> are optional, where <code>remark</code> has a maximum length of 200 characters.</li>
     * <li>The available values for <code>instanceSpec</code> include <code>SECURE_ENV_LITE</code> and <code>SECURE_ENV_PRO</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initialize a modeling project.</p>
     * 
     * @param request CreateModelingProjectRequest
     * @return CreateModelingProjectResponse
     */
    public CreateModelingProjectResponse createModelingProject(CreateModelingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createModelingProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: Deletion is irreversible, please use with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the specified customer model based on the provided customer model ID.</p>
     * 
     * @param request DeleteModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelResponse
     */
    public DeleteModelResponse deleteModelWithOptions(DeleteModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModel"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: Deletion is irreversible, please use with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the specified customer model based on the provided customer model ID.</p>
     * 
     * @param request DeleteModelRequest
     * @return DeleteModelResponse
     */
    public DeleteModelResponse deleteModel(DeleteModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteModelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deploy Model File</p>
     * 
     * @param request DeployModelFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployModelFileResponse
     */
    public DeployModelFileResponse deployModelFileWithOptions(DeployModelFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployModelFile"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployModelFileResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deploy Model File</p>
     * 
     * @param request DeployModelFileRequest
     * @return DeployModelFileResponse
     */
    public DeployModelFileResponse deployModelFile(DeployModelFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployModelFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>By providing the <code>customerModuleId</code> parameter, you can query the current status of a specified customer model. The status values may include but are not limited to &quot;EDIT&quot;, &quot;ONLINE&quot;, etc.</p>
     * 
     * <b>summary</b> : 
     * <p>Query basic model information based on the customer model ID</p>
     * 
     * @param request DescribeCustomerModuleBasicInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomerModuleBasicInfoResponse
     */
    public DescribeCustomerModuleBasicInfoResponse describeCustomerModuleBasicInfoWithOptions(DescribeCustomerModuleBasicInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomerModuleBasicInfo"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomerModuleBasicInfoResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>By providing the <code>customerModuleId</code> parameter, you can query the current status of a specified customer model. The status values may include but are not limited to &quot;EDIT&quot;, &quot;ONLINE&quot;, etc.</p>
     * 
     * <b>summary</b> : 
     * <p>Query basic model information based on the customer model ID</p>
     * 
     * @param request DescribeCustomerModuleBasicInfoRequest
     * @return DescribeCustomerModuleBasicInfoResponse
     */
    public DescribeCustomerModuleBasicInfoResponse describeCustomerModuleBasicInfo(DescribeCustomerModuleBasicInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomerModuleBasicInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>By providing the <code>customerModuleId</code> parameter, you can query the current status of a specified customer model. The status values may include, but are not limited to, &quot;EDIT&quot;, &quot;ONLINE&quot;, etc.</p>
     * 
     * <b>summary</b> : 
     * <p>Query model feature information based on the customer model ID</p>
     * 
     * @param request DescribeCustomerModuleMetaInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomerModuleMetaInfoResponse
     */
    public DescribeCustomerModuleMetaInfoResponse describeCustomerModuleMetaInfoWithOptions(DescribeCustomerModuleMetaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomerModuleMetaInfo"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomerModuleMetaInfoResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>By providing the <code>customerModuleId</code> parameter, you can query the current status of a specified customer model. The status values may include, but are not limited to, &quot;EDIT&quot;, &quot;ONLINE&quot;, etc.</p>
     * 
     * <b>summary</b> : 
     * <p>Query model feature information based on the customer model ID</p>
     * 
     * @param request DescribeCustomerModuleMetaInfoRequest
     * @return DescribeCustomerModuleMetaInfoResponse
     */
    public DescribeCustomerModuleMetaInfoResponse describeCustomerModuleMetaInfo(DescribeCustomerModuleMetaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomerModuleMetaInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>By providing the <code>customerModuleId</code> parameter, you can query the current status of a specified customer model. The status values may include but are not limited to &quot;EDIT&quot;, &quot;ONLINE&quot;, etc.</p>
     * 
     * <b>summary</b> : 
     * <p>Query model output information based on the customer model ID</p>
     * 
     * @param request DescribeCustomerModuleOutputInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomerModuleOutputInfoResponse
     */
    public DescribeCustomerModuleOutputInfoResponse describeCustomerModuleOutputInfoWithOptions(DescribeCustomerModuleOutputInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomerModuleOutputInfo"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomerModuleOutputInfoResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>By providing the <code>customerModuleId</code> parameter, you can query the current status of a specified customer model. The status values may include but are not limited to &quot;EDIT&quot;, &quot;ONLINE&quot;, etc.</p>
     * 
     * <b>summary</b> : 
     * <p>Query model output information based on the customer model ID</p>
     * 
     * @param request DescribeCustomerModuleOutputInfoRequest
     * @return DescribeCustomerModuleOutputInfoResponse
     */
    public DescribeCustomerModuleOutputInfoResponse describeCustomerModuleOutputInfo(DescribeCustomerModuleOutputInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomerModuleOutputInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Return specific feature options based on the feature template</p>
     * 
     * @param request DescribeFeatureOptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFeatureOptionResponse
     */
    public DescribeFeatureOptionResponse describeFeatureOptionWithOptions(DescribeFeatureOptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureTemplate)) {
            query.put("FeatureTemplate", request.featureTemplate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFeatureOption"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFeatureOptionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Return specific feature options based on the feature template</p>
     * 
     * @param request DescribeFeatureOptionRequest
     * @return DescribeFeatureOptionResponse
     */
    public DescribeFeatureOptionResponse describeFeatureOption(DescribeFeatureOptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFeatureOptionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which consists of a label (label) and a value (value).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Get the list of available feature templates for model configuration.</p>
     * 
     * @param request DescribeFeatureTemplateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFeatureTemplateListResponse
     */
    public DescribeFeatureTemplateListResponse describeFeatureTemplateListWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFeatureTemplateList"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFeatureTemplateListResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which consists of a label (label) and a value (value).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Get the list of available feature templates for model configuration.</p>
     * @return DescribeFeatureTemplateListResponse
     */
    public DescribeFeatureTemplateListResponse describeFeatureTemplateList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFeatureTemplateListWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Get File Download Link</p>
     * 
     * @param request DescribeFileDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFileDownloadUrlResponse
     */
    public DescribeFileDownloadUrlResponse describeFileDownloadUrlWithOptions(DescribeFileDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFileDownloadUrl"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFileDownloadUrlResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Get File Download Link</p>
     * 
     * @param request DescribeFileDownloadUrlRequest
     * @return DescribeFileDownloadUrlResponse
     */
    public DescribeFileDownloadUrlResponse describeFileDownloadUrl(DescribeFileDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFileDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each including a label (label) and value (value).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Render the feature configuration of the model</p>
     * 
     * @param request DescribeModelFeatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeModelFeatureResponse
     */
    public DescribeModelFeatureResponse describeModelFeatureWithOptions(DescribeModelFeatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureTemplate)) {
            query.put("FeatureTemplate", request.featureTemplate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeModelFeature"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeModelFeatureResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each including a label (label) and value (value).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Render the feature configuration of the model</p>
     * 
     * @param request DescribeModelFeatureRequest
     * @return DescribeModelFeatureResponse
     */
    public DescribeModelFeatureResponse describeModelFeature(DescribeModelFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeModelFeatureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain OSS Authentication Data for Upload</p>
     * 
     * @param request DescribeModelOssTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeModelOssTokenResponse
     */
    public DescribeModelOssTokenResponse describeModelOssTokenWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeModelOssToken"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeModelOssTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain OSS Authentication Data for Upload</p>
     * @return DescribeModelOssTokenResponse
     */
    public DescribeModelOssTokenResponse describeModelOssToken() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeModelOssTokenWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Get detailed project data</p>
     * 
     * @param request DescribeModelingProjectDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeModelingProjectDetailResponse
     */
    public DescribeModelingProjectDetailResponse describeModelingProjectDetailWithOptions(DescribeModelingProjectDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeModelingProjectDetail"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeModelingProjectDetailResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Get detailed project data</p>
     * 
     * @param request DescribeModelingProjectDetailRequest
     * @return DescribeModelingProjectDetailResponse
     */
    public DescribeModelingProjectDetailResponse describeModelingProjectDetail(DescribeModelingProjectDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeModelingProjectDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于获取指定租户下的所有建模项目的概览信息。</li>
     * <li>支持通过<code>pageSize</code>和<code>currentPage</code>参数进行分页查询，默认每页显示10条记录。</li>
     * <li>可选地，使用<code>status</code>参数来过滤特定状态（如<code>active</code>, <code>released</code>等）的项目。</li>
     * <li>返回结果中包含每个项目的ID、名称、环境状态、建模状态、开始时间及结束时间（如果有的话），以及创建该项目的登录账号。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Paginated query for the list of modeling projects under the current user.</p>
     * 
     * @param request DescribeModelingProjectListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeModelingProjectListResponse
     */
    public DescribeModelingProjectListResponse describeModelingProjectListWithOptions(DescribeModelingProjectListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeModelingProjectList"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeModelingProjectListResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于获取指定租户下的所有建模项目的概览信息。</li>
     * <li>支持通过<code>pageSize</code>和<code>currentPage</code>参数进行分页查询，默认每页显示10条记录。</li>
     * <li>可选地，使用<code>status</code>参数来过滤特定状态（如<code>active</code>, <code>released</code>等）的项目。</li>
     * <li>返回结果中包含每个项目的ID、名称、环境状态、建模状态、开始时间及结束时间（如果有的话），以及创建该项目的登录账号。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Paginated query for the list of modeling projects under the current user.</p>
     * 
     * @param request DescribeModelingProjectListRequest
     * @return DescribeModelingProjectListResponse
     */
    public DescribeModelingProjectListResponse describeModelingProjectList(DescribeModelingProjectListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeModelingProjectListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This interface is used to check whether a specific model service exists by providing the <code>customerModuleId</code>. If it exists, it returns <code>true</code>; otherwise, it returns <code>false</code>.</p>
     * <h3>Notes</h3>
     * <ul>
     * <li><code>customerModuleId</code> is a required parameter and must be of string type.</li>
     * <li>This API is mainly used for front-end page display or logical judgment to confirm whether the service corresponding to the user\&quot;s selected model has been created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query Whether the Service Corresponding to a Specific Model Exists Based on Customer Model ID</p>
     * 
     * @param request DescribeModuleServiceExistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeModuleServiceExistResponse
     */
    public DescribeModuleServiceExistResponse describeModuleServiceExistWithOptions(DescribeModuleServiceExistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeModuleServiceExist"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeModuleServiceExistResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This interface is used to check whether a specific model service exists by providing the <code>customerModuleId</code>. If it exists, it returns <code>true</code>; otherwise, it returns <code>false</code>.</p>
     * <h3>Notes</h3>
     * <ul>
     * <li><code>customerModuleId</code> is a required parameter and must be of string type.</li>
     * <li>This API is mainly used for front-end page display or logical judgment to confirm whether the service corresponding to the user\&quot;s selected model has been created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query Whether the Service Corresponding to a Specific Model Exists Based on Customer Model ID</p>
     * 
     * @param request DescribeModuleServiceExistRequest
     * @return DescribeModuleServiceExistResponse
     */
    public DescribeModuleServiceExistResponse describeModuleServiceExist(DescribeModuleServiceExistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeModuleServiceExistWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>By providing the <code>customerModuleId</code> parameter, you can query the current status of a specified customer model. The status values may include, but are not limited to, &quot;EDIT&quot;, &quot;ONLINE&quot;, etc.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the current status of a model based on the customer model ID</p>
     * 
     * @param request DescribeModuleStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeModuleStatusResponse
     */
    public DescribeModuleStatusResponse describeModuleStatusWithOptions(DescribeModuleStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeModuleStatus"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeModuleStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>By providing the <code>customerModuleId</code> parameter, you can query the current status of a specified customer model. The status values may include, but are not limited to, &quot;EDIT&quot;, &quot;ONLINE&quot;, etc.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the current status of a model based on the customer model ID</p>
     * 
     * @param request DescribeModuleStatusRequest
     * @return DescribeModuleStatusResponse
     */
    public DescribeModuleStatusResponse describeModuleStatus(DescribeModuleStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeModuleStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query POC task list.</p>
     * 
     * @param request DescribePocTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePocTaskListResponse
     */
    public DescribePocTaskListResponse describePocTaskListWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePocTaskList"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePocTaskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query POC task list.</p>
     * @return DescribePocTaskListResponse
     */
    public DescribePocTaskListResponse describePocTaskList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePocTaskListWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Model Hosting Orders</p>
     * 
     * @param request DescribeSafRmmpOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSafRmmpOrderResponse
     */
    public DescribeSafRmmpOrderResponse describeSafRmmpOrderWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSafRmmpOrder"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSafRmmpOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Model Hosting Orders</p>
     * @return DescribeSafRmmpOrderResponse
     */
    public DescribeSafRmmpOrderResponse describeSafRmmpOrder() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSafRmmpOrderWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Scene and Service</p>
     * 
     * @param request DescribeServiceAndSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceAndSceneResponse
     */
    public DescribeServiceAndSceneResponse describeServiceAndSceneWithOptions(DescribeServiceAndSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceAndScene"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceAndSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Scene and Service</p>
     * 
     * @param request DescribeServiceAndSceneRequest
     * @return DescribeServiceAndSceneResponse
     */
    public DescribeServiceAndSceneResponse describeServiceAndScene(DescribeServiceAndSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceAndSceneWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to query all model information under a specific user and supports pagination through page parameters. Fuzzy search can be performed using the <code>name</code> parameter.</p>
     * <ul>
     * <li><code>regId</code>: Region identifier, required.</li>
     * <li><code>pageSize</code>: Number of items per page, required.</li>
     * <li><code>currentPage</code>: Current page number, starting from 1, required.</li>
     * <li><code>userId</code>: User ID, required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Get all model information for a specified user, supporting pagination</p>
     * 
     * @param request DescribeUserModelListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserModelListResponse
     */
    public DescribeUserModelListResponse describeUserModelListWithOptions(DescribeUserModelListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserModelList"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserModelListResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to query all model information under a specific user and supports pagination through page parameters. Fuzzy search can be performed using the <code>name</code> parameter.</p>
     * <ul>
     * <li><code>regId</code>: Region identifier, required.</li>
     * <li><code>pageSize</code>: Number of items per page, required.</li>
     * <li><code>currentPage</code>: Current page number, starting from 1, required.</li>
     * <li><code>userId</code>: User ID, required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Get all model information for a specified user, supporting pagination</p>
     * 
     * @param request DescribeUserModelListRequest
     * @return DescribeUserModelListResponse
     */
    public DescribeUserModelListResponse describeUserModelList(DescribeUserModelListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserModelListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: The deletion operation is irreversible, please use with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Iterate Model</p>
     * 
     * @param request DuplicateModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DuplicateModelResponse
     */
    public DuplicateModelResponse duplicateModelWithOptions(DuplicateModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DuplicateModel"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DuplicateModelResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: The deletion operation is irreversible, please use with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Iterate Model</p>
     * 
     * @param request DuplicateModelRequest
     * @return DuplicateModelResponse
     */
    public DuplicateModelResponse duplicateModel(DuplicateModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.duplicateModelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Edit Model</p>
     * 
     * @param request EditModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditModelResponse
     */
    public EditModelResponse editModelWithOptions(EditModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditModel"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Edit Model</p>
     * 
     * @param request EditModelRequest
     * @return EditModelResponse
     */
    public EditModelResponse editModel(EditModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editModelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>View Bastion Host Initial Password</p>
     * 
     * @param request GetBastionHostCertificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBastionHostCertificationResponse
     */
    public GetBastionHostCertificationResponse getBastionHostCertificationWithOptions(GetBastionHostCertificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBastionHostCertification"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBastionHostCertificationResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>View Bastion Host Initial Password</p>
     * 
     * @param request GetBastionHostCertificationRequest
     * @return GetBastionHostCertificationResponse
     */
    public GetBastionHostCertificationResponse getBastionHostCertification(GetBastionHostCertificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBastionHostCertificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: The deletion operation is irreversible, please use with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Iterate Model</p>
     * 
     * @param request IterateModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return IterateModelResponse
     */
    public IterateModelResponse iterateModelWithOptions(IterateModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IterateModel"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IterateModelResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: The deletion operation is irreversible, please use with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Iterate Model</p>
     * 
     * @param request IterateModelRequest
     * @return IterateModelResponse
     */
    public IterateModelResponse iterateModel(IterateModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.iterateModelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Offline Model</p>
     * 
     * @param request OfflineModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineModelResponse
     */
    public OfflineModelResponse offlineModelWithOptions(OfflineModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineModel"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Offline Model</p>
     * 
     * @param request OfflineModelRequest
     * @return OfflineModelResponse
     */
    public OfflineModelResponse offlineModel(OfflineModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.offlineModelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: Deletion is irreversible, please use with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Online Model</p>
     * 
     * @param request OnlineModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnlineModelResponse
     */
    public OnlineModelResponse onlineModelWithOptions(OnlineModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnlineModel"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnlineModelResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: Deletion is irreversible, please use with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Online Model</p>
     * 
     * @param request OnlineModelRequest
     * @return OnlineModelResponse
     */
    public OnlineModelResponse onlineModel(OnlineModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onlineModelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Parse Expression Parameters</p>
     * 
     * @param request ParseExpressionParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ParseExpressionParametersResponse
     */
    public ParseExpressionParametersResponse parseExpressionParametersWithOptions(ParseExpressionParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            query.put("Expression", request.expression);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ParseExpressionParameters"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ParseExpressionParametersResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Parse Expression Parameters</p>
     * 
     * @param request ParseExpressionParametersRequest
     * @return ParseExpressionParametersResponse
     */
    public ParseExpressionParametersResponse parseExpressionParameters(ParseExpressionParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.parseExpressionParametersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Pre-release Model</p>
     * 
     * @param request PrepublishModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PrepublishModelResponse
     */
    public PrepublishModelResponse prepublishModelWithOptions(PrepublishModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PrepublishModel"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PrepublishModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Pre-release Model</p>
     * 
     * @param request PrepublishModelRequest
     * @return PrepublishModelResponse
     */
    public PrepublishModelResponse prepublishModel(PrepublishModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.prepublishModelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Request to Sync Model Files</p>
     * 
     * @param request RequestModelFileSyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RequestModelFileSyncResponse
     */
    public RequestModelFileSyncResponse requestModelFileSyncWithOptions(RequestModelFileSyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RequestModelFileSync"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RequestModelFileSyncResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Request to Sync Model Files</p>
     * 
     * @param request RequestModelFileSyncRequest
     * @return RequestModelFileSyncResponse
     */
    public RequestModelFileSyncResponse requestModelFileSync(RequestModelFileSyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.requestModelFileSyncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: The deletion operation is irreversible, please use with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Roll back the specified customer model based on the provided customer model ID.</p>
     * 
     * @param request RollbackModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackModelResponse
     */
    public RollbackModelResponse rollbackModelWithOptions(RollbackModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackModel"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackModelResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: The deletion operation is irreversible, please use with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Roll back the specified customer model based on the provided customer model ID.</p>
     * 
     * @param request RollbackModelRequest
     * @return RollbackModelResponse
     */
    public RollbackModelResponse rollbackModel(RollbackModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackModelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pre-release Model Testing</p>
     * 
     * @param request TestModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TestModelResponse
     */
    public TestModelResponse testModelWithOptions(TestModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestModel"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestModelResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pre-release Model Testing</p>
     * 
     * @param request TestModelRequest
     * @return TestModelResponse
     */
    public TestModelResponse testModel(TestModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testModelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pre-release Test Model</p>
     * 
     * @param request TestPreModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TestPreModelResponse
     */
    public TestPreModelResponse testPreModelWithOptions(TestPreModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestPreModel"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestPreModelResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pre-release Test Model</p>
     * 
     * @param request TestPreModelRequest
     * @return TestPreModelResponse
     */
    public TestPreModelResponse testPreModel(TestPreModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testPreModelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Test Expression</p>
     * 
     * @param request TestProcessExpressionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TestProcessExpressionResponse
     */
    public TestProcessExpressionResponse testProcessExpressionWithOptions(TestProcessExpressionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            query.put("Expression", request.expression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestProcessExpression"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestProcessExpressionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Test Expression</p>
     * 
     * @param request TestProcessExpressionRequest
     * @return TestProcessExpressionResponse
     */
    public TestProcessExpressionResponse testProcessExpression(TestProcessExpressionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testProcessExpressionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update basic model information</p>
     * 
     * @param request UpdateModuleBasicInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModuleBasicInfoResponse
     */
    public UpdateModuleBasicInfoResponse updateModuleBasicInfoWithOptions(UpdateModuleBasicInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleName)) {
            query.put("CustomerModuleName", request.customerModuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleType)) {
            query.put("ModuleType", request.moduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storePath)) {
            query.put("StorePath", request.storePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModuleBasicInfo"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModuleBasicInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update basic model information</p>
     * 
     * @param request UpdateModuleBasicInfoRequest
     * @return UpdateModuleBasicInfoResponse
     */
    public UpdateModuleBasicInfoResponse updateModuleBasicInfo(UpdateModuleBasicInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateModuleBasicInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Validate model file</p>
     * 
     * @param request ValidateModelFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateModelFileResponse
     */
    public ValidateModelFileResponse validateModelFileWithOptions(ValidateModelFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateModelFile"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateModelFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Validate model file</p>
     * 
     * @param request ValidateModelFileRequest
     * @return ValidateModelFileResponse
     */
    public ValidateModelFileResponse validateModelFile(ValidateModelFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateModelFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Validate Test File</p>
     * 
     * @param request ValidateTestFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateTestFileResponse
     */
    public ValidateTestFileResponse validateTestFileWithOptions(ValidateTestFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerModuleId)) {
            query.put("CustomerModuleId", request.customerModuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateTestFile"),
            new TeaPair("version", "2025-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateTestFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Validate Test File</p>
     * 
     * @param request ValidateTestFileRequest
     * @return ValidateTestFileResponse
     */
    public ValidateTestFileResponse validateTestFile(ValidateTestFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateTestFileWithOptions(request, runtime);
    }
}

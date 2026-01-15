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
     * <h2>请求说明</h2>
     * <p>通过提供<code>customerModuleId</code>参数，可以查询指定客户模型的当前状态。状态值可能包括但不限于&quot;EDIT&quot;、&quot;ONLINE&quot;等。</p>
     * 
     * <b>summary</b> : 
     * <p>根据客户模型ID查询模型特征信息</p>
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
     * <h2>请求说明</h2>
     * <p>通过提供<code>customerModuleId</code>参数，可以查询指定客户模型的当前状态。状态值可能包括但不限于&quot;EDIT&quot;、&quot;ONLINE&quot;等。</p>
     * 
     * <b>summary</b> : 
     * <p>根据客户模型ID查询模型特征信息</p>
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
     * <h2>请求说明</h2>
     * <p>通过提供<code>customerModuleId</code>参数，可以查询指定客户模型的当前状态。状态值可能包括但不限于&quot;EDIT&quot;、&quot;ONLINE&quot;等。</p>
     * 
     * <b>summary</b> : 
     * <p>根据客户模型ID查询模型出参信息</p>
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
     * <h2>请求说明</h2>
     * <p>通过提供<code>customerModuleId</code>参数，可以查询指定客户模型的当前状态。状态值可能包括但不限于&quot;EDIT&quot;、&quot;ONLINE&quot;等。</p>
     * 
     * <b>summary</b> : 
     * <p>根据客户模型ID查询模型出参信息</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>根据特征模板返回特征模板具体特征选项</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>根据特征模板返回特征模板具体特征选项</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>获取可用的特征模板列表，用于模型配置。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>获取可用的特征模板列表，用于模型配置。</p>
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
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>渲染模型的特征配置</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>渲染模型的特征配置</p>
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
     * <p>获取上传oss鉴权数据</p>
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
     * <p>获取上传oss鉴权数据</p>
     * @return DescribeModelOssTokenResponse
     */
    public DescribeModelOssTokenResponse describeModelOssToken() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeModelOssTokenWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该接口用于通过提供的<code>customerModuleId</code>来检查特定的模型服务是否已经存在。如果存在，则返回<code>true</code>；反之则返回<code>false</code>。</p>
     * <h3>注意事项</h3>
     * <ul>
     * <li><code>customerModuleId</code>是必须提供的参数，且为字符串类型。</li>
     * <li>此API主要用于前端页面展示或逻辑判断时使用，以确认用户所选模型是否有对应的服务被创建。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>根据客户模型ID查询指定模型对应服务是否存在</p>
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
     * <h2>请求说明</h2>
     * <p>该接口用于通过提供的<code>customerModuleId</code>来检查特定的模型服务是否已经存在。如果存在，则返回<code>true</code>；反之则返回<code>false</code>。</p>
     * <h3>注意事项</h3>
     * <ul>
     * <li><code>customerModuleId</code>是必须提供的参数，且为字符串类型。</li>
     * <li>此API主要用于前端页面展示或逻辑判断时使用，以确认用户所选模型是否有对应的服务被创建。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>根据客户模型ID查询指定模型对应服务是否存在</p>
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
     * <h2>请求说明</h2>
     * <p>通过提供<code>customerModuleId</code>参数，可以查询指定客户模型的当前状态。状态值可能包括但不限于&quot;EDIT&quot;、&quot;ONLINE&quot;等。</p>
     * 
     * <b>summary</b> : 
     * <p>根据客户模型ID查询模型当前状态</p>
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
     * <h2>请求说明</h2>
     * <p>通过提供<code>customerModuleId</code>参数，可以查询指定客户模型的当前状态。状态值可能包括但不限于&quot;EDIT&quot;、&quot;ONLINE&quot;等。</p>
     * 
     * <b>summary</b> : 
     * <p>根据客户模型ID查询模型当前状态</p>
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
     * <p>查询模型托管订单</p>
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
     * <p>查询模型托管订单</p>
     * @return DescribeSafRmmpOrderResponse
     */
    public DescribeSafRmmpOrderResponse describeSafRmmpOrder() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSafRmmpOrderWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询场景和服务</p>
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
     * <p>查询场景和服务</p>
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
     * <h2>请求说明</h2>
     * <p>该 API 用于查询特定用户下的所有模型信息，并支持通过分页参数进行分页查询。可以通过 <code>name</code> 参数进行模糊搜索。</p>
     * <ul>
     * <li><code>regId</code>: 地域标识，必填。</li>
     * <li><code>pageSize</code>: 每页显示的条目数，必填。</li>
     * <li><code>currentPage</code>: 当前页码，从1开始计数，必填。</li>
     * <li><code>userId</code>: 用户ID，必填。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>获取指定用户下的所有模型信息，支持分页查询</p>
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
     * <h2>请求说明</h2>
     * <p>该 API 用于查询特定用户下的所有模型信息，并支持通过分页参数进行分页查询。可以通过 <code>name</code> 参数进行模糊搜索。</p>
     * <ul>
     * <li><code>regId</code>: 地域标识，必填。</li>
     * <li><code>pageSize</code>: 每页显示的条目数，必填。</li>
     * <li><code>currentPage</code>: 当前页码，从1开始计数，必填。</li>
     * <li><code>userId</code>: 用户ID，必填。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>获取指定用户下的所有模型信息，支持分页查询</p>
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
     * <h2>请求说明</h2>
     * <p>本API用于从系统中删除指定的客户模型。调用时必须提供<code>customerModuleId</code>参数，该参数标识了要删除的具体模型。</p>
     * <ul>
     * <li><strong>注意</strong>：删除操作不可逆，请谨慎使用。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>迭代模型</p>
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
     * <h2>请求说明</h2>
     * <p>本API用于从系统中删除指定的客户模型。调用时必须提供<code>customerModuleId</code>参数，该参数标识了要删除的具体模型。</p>
     * <ul>
     * <li><strong>注意</strong>：删除操作不可逆，请谨慎使用。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>迭代模型</p>
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
     * <p>编辑模型</p>
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
     * <p>编辑模型</p>
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
     * <p>本API用于从系统中删除指定的客户模型。调用时必须提供<code>customerModuleId</code>参数，该参数标识了要删除的具体模型。</p>
     * <ul>
     * <li><strong>注意</strong>：删除操作不可逆，请谨慎使用。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>迭代模型</p>
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
     * <h2>请求说明</h2>
     * <p>本API用于从系统中删除指定的客户模型。调用时必须提供<code>customerModuleId</code>参数，该参数标识了要删除的具体模型。</p>
     * <ul>
     * <li><strong>注意</strong>：删除操作不可逆，请谨慎使用。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>迭代模型</p>
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
     * <p>下线模型</p>
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
     * <p>下线模型</p>
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
     * <h2>请求说明</h2>
     * <p>本API用于从系统中删除指定的客户模型。调用时必须提供<code>customerModuleId</code>参数，该参数标识了要删除的具体模型。</p>
     * <ul>
     * <li><strong>注意</strong>：删除操作不可逆，请谨慎使用。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>上线模型</p>
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
     * <h2>请求说明</h2>
     * <p>本API用于从系统中删除指定的客户模型。调用时必须提供<code>customerModuleId</code>参数，该参数标识了要删除的具体模型。</p>
     * <ul>
     * <li><strong>注意</strong>：删除操作不可逆，请谨慎使用。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>上线模型</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>解析表达式参数</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>解析表达式参数</p>
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
     * <p>预发布模型</p>
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
     * <p>预发布模型</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>预发布测试模型</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>预发布测试模型</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>预发布测试模型</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>预发布测试模型</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>测试表达式</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>测试表达式</p>
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

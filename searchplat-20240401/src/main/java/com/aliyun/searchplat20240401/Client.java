// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401;

import com.aliyun.tea.*;
import com.aliyun.searchplat20240401.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("eu-central-1", "searchplat.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-shanghai", "searchplat.cn-shanghai.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("searchplat", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Stops a service.</p>
     * 
     * @param request CeaseFunctionInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CeaseFunctionInstanceResponse
     */
    public CeaseFunctionInstanceResponse ceaseFunctionInstanceWithOptions(String workspaceName, String functionName, String instanceName, CeaseFunctionInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CeaseFunctionInstance"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceName) + "/actions/cease"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CeaseFunctionInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a service.</p>
     * 
     * @param request CeaseFunctionInstanceRequest
     * @return CeaseFunctionInstanceResponse
     */
    public CeaseFunctionInstanceResponse ceaseFunctionInstance(String workspaceName, String functionName, String instanceName, CeaseFunctionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.ceaseFunctionInstanceWithOptions(workspaceName, functionName, instanceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an asynchronous task.</p>
     * 
     * @param request CreateAsyncTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAsyncTaskResponse
     */
    public CreateAsyncTaskResponse createAsyncTaskWithOptions(String workspaceName, CreateAsyncTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            body.put("dataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("serviceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            body.put("serviceType", request.serviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAsyncTask"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/async-tasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAsyncTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an asynchronous task.</p>
     * 
     * @param request CreateAsyncTaskRequest
     * @return CreateAsyncTaskResponse
     */
    public CreateAsyncTaskResponse createAsyncTask(String workspaceName, CreateAsyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAsyncTaskWithOptions(workspaceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a knowledge base-related configuration.</p>
     * 
     * @param request CreateCapabilityRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCapabilityResponse
     */
    public CreateCapabilityResponse createCapabilityWithOptions(String workspaceName, String itemCategory, CreateCapabilityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemDesc)) {
            body.put("itemDesc", request.itemDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemName)) {
            body.put("itemName", request.itemName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemValue)) {
            body.put("itemValue", request.itemValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCapability"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/capabilities/" + com.aliyun.openapiutil.Client.getEncodeParam(itemCategory) + "/items"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCapabilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a knowledge base-related configuration.</p>
     * 
     * @param request CreateCapabilityRequest
     * @return CreateCapabilityResponse
     */
    public CreateCapabilityResponse createCapability(String workspaceName, String itemCategory, CreateCapabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCapabilityWithOptions(workspaceName, itemCategory, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation allows you to create a configuration for a specific workspace.</li>
     * <li>The <code>configType</code> parameter specifies the type of configuration to create. Valid values: <code>prompt</code> and <code>lark</code>.</li>
     * <li>When <code>dryRun</code> is set to <code>true</code>, the API operation only validates the request without actually performing the creation.</li>
     * <li>The <code>configData</code> field varies depending on the value of <code>configType</code>. Refer to the examples for the specific structure to construct the request body.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a configuration item in a specified workspace. The prompt and lark types are supported.</p>
     * 
     * @param request CreateConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConfigResponse
     */
    public CreateConfigResponse createConfigWithOptions(String workspaceName, String configType, CreateConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configData)) {
            body.put("configData", request.configData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConfig"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configType) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation allows you to create a configuration for a specific workspace.</li>
     * <li>The <code>configType</code> parameter specifies the type of configuration to create. Valid values: <code>prompt</code> and <code>lark</code>.</li>
     * <li>When <code>dryRun</code> is set to <code>true</code>, the API operation only validates the request without actually performing the creation.</li>
     * <li>The <code>configData</code> field varies depending on the value of <code>configType</code>. Refer to the examples for the specific structure to construct the request body.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a configuration item in a specified workspace. The prompt and lark types are supported.</p>
     * 
     * @param request CreateConfigRequest
     * @return CreateConfigResponse
     */
    public CreateConfigResponse createConfig(String workspaceName, String configType, CreateConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConfigWithOptions(workspaceName, configType, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates access credentials.</p>
     * 
     * @param request CreateCredentialsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCredentialsResponse
     */
    public CreateCredentialsResponse createCredentialsWithOptions(String workspaceName, CreateCredentialsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCredentials"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/credentials"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCredentialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates access credentials.</p>
     * 
     * @param request CreateCredentialsRequest
     * @return CreateCredentialsResponse
     */
    public CreateCredentialsResponse createCredentials(String workspaceName, CreateCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCredentialsWithOptions(workspaceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates experience data.</p>
     * 
     * @param request CreateExperienceDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExperienceDataResponse
     */
    public CreateExperienceDataResponse createExperienceDataWithOptions(String workspaceName, CreateExperienceDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            body.put("contentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSize)) {
            body.put("dataSize", request.dataSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            body.put("dataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataValue)) {
            body.put("dataValue", request.dataValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            body.put("serviceType", request.serviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExperienceData"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/experience-data"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExperienceDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates experience data.</p>
     * 
     * @param request CreateExperienceDataRequest
     * @return CreateExperienceDataResponse
     */
    public CreateExperienceDataResponse createExperienceData(String workspaceName, CreateExperienceDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExperienceDataWithOptions(workspaceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service configuration.</p>
     * 
     * @param request CreateFunctionInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFunctionInstanceResponse
     */
    public CreateFunctionInstanceResponse createFunctionInstanceWithOptions(String workspaceName, String functionName, CreateFunctionInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createParameters)) {
            body.put("createParameters", request.createParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionType)) {
            body.put("functionType", request.functionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("instanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            body.put("modelType", request.modelType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFunctionInstance"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFunctionInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service configuration.</p>
     * 
     * @param request CreateFunctionInstanceRequest
     * @return CreateFunctionInstanceResponse
     */
    public CreateFunctionInstanceResponse createFunctionInstance(String workspaceName, String functionName, CreateFunctionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFunctionInstanceWithOptions(workspaceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service configuration task.</p>
     * 
     * @param request CreateFunctionTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFunctionTaskResponse
     */
    public CreateFunctionTaskResponse createFunctionTaskWithOptions(String workspaceName, String functionName, String instanceName, CreateFunctionTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFunctionTask"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceName) + "/tasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFunctionTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service configuration task.</p>
     * 
     * @param request CreateFunctionTaskRequest
     * @return CreateFunctionTaskResponse
     */
    public CreateFunctionTaskResponse createFunctionTask(String workspaceName, String functionName, String instanceName, CreateFunctionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFunctionTaskWithOptions(workspaceName, functionName, instanceName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Creates an offline processing task for video retrieval. You can configure the data source, processing parameters, and output destination.</p>
     * 
     * @param request CreateOfflineTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOfflineTaskResponse
     */
    public CreateOfflineTaskResponse createOfflineTaskWithOptions(String workspaceName, String type, CreateOfflineTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.draft)) {
            query.put("draft", request.draft);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.meta)) {
            body.put("meta", request.meta);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processors)) {
            body.put("processors", request.processors);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sink)) {
            body.put("sink", request.sink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOfflineTask"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/offline-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(type) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOfflineTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Creates an offline processing task for video retrieval. You can configure the data source, processing parameters, and output destination.</p>
     * 
     * @param request CreateOfflineTaskRequest
     * @return CreateOfflineTaskResponse
     */
    public CreateOfflineTaskResponse createOfflineTask(String workspaceName, String type, CreateOfflineTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOfflineTaskWithOptions(workspaceName, type, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an evaluation task for the RAG edition.</p>
     * 
     * @param request CreateRagEvaluatorTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRagEvaluatorTaskResponse
     */
    public CreateRagEvaluatorTaskResponse createRagEvaluatorTaskWithOptions(String workspaceName, CreateRagEvaluatorTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("app_name", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceConfig)) {
            body.put("data_source_config", request.dataSourceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emails)) {
            body.put("emails", request.emails);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluateConfig)) {
            body.put("evaluate_config", request.evaluateConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasDataSource)) {
            body.put("has_data_source", request.hasDataSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            body.put("metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("task_name", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRagEvaluatorTask"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/rag-evaluator/v1/api/task"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRagEvaluatorTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an evaluation task for the RAG edition.</p>
     * 
     * @param request CreateRagEvaluatorTaskRequest
     * @return CreateRagEvaluatorTaskResponse
     */
    public CreateRagEvaluatorTaskResponse createRagEvaluatorTask(String workspaceName, CreateRagEvaluatorTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRagEvaluatorTaskWithOptions(workspaceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Workspace</p>
     * 
     * @param request CreateWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspaceWithOptions(CreateWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("chargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            body.put("engineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quota)) {
            body.put("quota", request.quota);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkspace"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Workspace</p>
     * 
     * @param request CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkspaceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation allows you to delete a specific configuration item by specifying the workspace name, configuration category, and configuration name. Before calling this operation, ensure that you have sufficient permissions (such as the <code>DeleteCapability</code> action in a RAM policy). After a configuration item is deleted, all related data and services may be affected.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specific configuration item from a specified workspace.</p>
     * 
     * @param request DeleteCapabilityRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCapabilityResponse
     */
    public DeleteCapabilityResponse deleteCapabilityWithOptions(String workspaceName, String itemCategory, String itemName, DeleteCapabilityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCapability"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/capabilities/" + com.aliyun.openapiutil.Client.getEncodeParam(itemCategory) + "/items/" + com.aliyun.openapiutil.Client.getEncodeParam(itemName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCapabilityResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation allows you to delete a specific configuration item by specifying the workspace name, configuration category, and configuration name. Before calling this operation, ensure that you have sufficient permissions (such as the <code>DeleteCapability</code> action in a RAM policy). After a configuration item is deleted, all related data and services may be affected.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specific configuration item from a specified workspace.</p>
     * 
     * @param request DeleteCapabilityRequest
     * @return DeleteCapabilityResponse
     */
    public DeleteCapabilityResponse deleteCapability(String workspaceName, String itemCategory, String itemName, DeleteCapabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCapabilityWithOptions(workspaceName, itemCategory, itemName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specific type of configuration from a specified workspace.</p>
     * 
     * @param request DeleteConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConfigResponse
     */
    public DeleteConfigResponse deleteConfigWithOptions(String workspaceName, String configType, String id, DeleteConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConfig"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configType) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specific type of configuration from a specified workspace.</p>
     * 
     * @param request DeleteConfigRequest
     * @return DeleteConfigResponse
     */
    public DeleteConfigResponse deleteConfig(String workspaceName, String configType, String id, DeleteConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConfigWithOptions(workspaceName, configType, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an access credential.</p>
     * 
     * @param request DeleteCredentialsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCredentialsResponse
     */
    public DeleteCredentialsResponse deleteCredentialsWithOptions(String token, String workspaceName, DeleteCredentialsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCredentials"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/credentials/" + com.aliyun.openapiutil.Client.getEncodeParam(token) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCredentialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an access credential.</p>
     * 
     * @param request DeleteCredentialsRequest
     * @return DeleteCredentialsResponse
     */
    public DeleteCredentialsResponse deleteCredentials(String token, String workspaceName, DeleteCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCredentialsWithOptions(token, workspaceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete experience data</p>
     * 
     * @param request DeleteExperienceDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExperienceDataResponse
     */
    public DeleteExperienceDataResponse deleteExperienceDataWithOptions(String id, String workspaceName, DeleteExperienceDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExperienceData"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/experience-data/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExperienceDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete experience data</p>
     * 
     * @param request DeleteExperienceDataRequest
     * @return DeleteExperienceDataResponse
     */
    public DeleteExperienceDataResponse deleteExperienceData(String id, String workspaceName, DeleteExperienceDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExperienceDataWithOptions(id, workspaceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a service configuration.</p>
     * 
     * @param request DeleteFunctionInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFunctionInstanceResponse
     */
    public DeleteFunctionInstanceResponse deleteFunctionInstanceWithOptions(String workspaceName, String functionName, String instanceName, DeleteFunctionInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFunctionInstance"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFunctionInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a service configuration.</p>
     * 
     * @param request DeleteFunctionInstanceRequest
     * @return DeleteFunctionInstanceResponse
     */
    public DeleteFunctionInstanceResponse deleteFunctionInstance(String workspaceName, String functionName, String instanceName, DeleteFunctionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFunctionInstanceWithOptions(workspaceName, functionName, instanceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a batch task.</p>
     * 
     * @param request DeleteOfflineTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOfflineTaskResponse
     */
    public DeleteOfflineTaskResponse deleteOfflineTaskWithOptions(String workspaceName, String type, String taskName, DeleteOfflineTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOfflineTask"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/offline-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(type) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(taskName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOfflineTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a batch task.</p>
     * 
     * @param request DeleteOfflineTaskRequest
     * @return DeleteOfflineTaskResponse
     */
    public DeleteOfflineTaskResponse deleteOfflineTask(String workspaceName, String type, String taskName, DeleteOfflineTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteOfflineTaskWithOptions(workspaceName, type, taskName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a RAG evaluation task.</p>
     * 
     * @param request DeleteRagEvaluatorTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRagEvaluatorTaskResponse
     */
    public DeleteRagEvaluatorTaskResponse deleteRagEvaluatorTaskWithOptions(String workspaceName, String taskId, DeleteRagEvaluatorTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRagEvaluatorTask"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/rag-evaluator/v1/api/task/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRagEvaluatorTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a RAG evaluation task.</p>
     * 
     * @param request DeleteRagEvaluatorTaskRequest
     * @return DeleteRagEvaluatorTaskResponse
     */
    public DeleteRagEvaluatorTaskResponse deleteRagEvaluatorTask(String workspaceName, String taskId, DeleteRagEvaluatorTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRagEvaluatorTaskWithOptions(workspaceName, taskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a workspace.</p>
     * 
     * @param request DeleteWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspaceWithOptions(String workspaceName, DeleteWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkspace"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a workspace.</p>
     * 
     * @param request DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspace(String workspaceName, DeleteWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWorkspaceWithOptions(workspaceName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to retrieve specific configuration information based on the provided workspace name, configuration category, and configuration name. Please ensure the parameters in the request path are accurate, especially the three required fields: <code>workspaceName</code>, <code>itemCategory</code>, and <code>itemName</code>. Additionally, please note that <code>itemCategory</code> currently only supports the <code>ai_search_agent</code> category.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the details of a configuration item of a specific category within a specified workspace.</p>
     * 
     * @param request DescribeCapabilityRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCapabilityResponse
     */
    public DescribeCapabilityResponse describeCapabilityWithOptions(String workspaceName, String itemCategory, String itemName, DescribeCapabilityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCapability"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/capabilities/" + com.aliyun.openapiutil.Client.getEncodeParam(itemCategory) + "/items/" + com.aliyun.openapiutil.Client.getEncodeParam(itemName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCapabilityResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to retrieve specific configuration information based on the provided workspace name, configuration category, and configuration name. Please ensure the parameters in the request path are accurate, especially the three required fields: <code>workspaceName</code>, <code>itemCategory</code>, and <code>itemName</code>. Additionally, please note that <code>itemCategory</code> currently only supports the <code>ai_search_agent</code> category.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the details of a configuration item of a specific category within a specified workspace.</p>
     * 
     * @param request DescribeCapabilityRequest
     * @return DescribeCapabilityResponse
     */
    public DescribeCapabilityResponse describeCapability(String workspaceName, String itemCategory, String itemName, DescribeCapabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeCapabilityWithOptions(workspaceName, itemCategory, itemName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeRegions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/regions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeRegions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an asynchronous task.</p>
     * 
     * @param request GetAsyncTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAsyncTaskResponse
     */
    public GetAsyncTaskResponse getAsyncTaskWithOptions(String workspaceName, String id, GetAsyncTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAsyncTask"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/async-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAsyncTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an asynchronous task.</p>
     * 
     * @param request GetAsyncTaskRequest
     * @return GetAsyncTaskResponse
     */
    public GetAsyncTaskResponse getAsyncTask(String workspaceName, String id, GetAsyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAsyncTaskWithOptions(workspaceName, id, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries a specific type of configuration from a specified workspace.</p>
     * 
     * @param request GetConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConfigResponse
     */
    public GetConfigResponse getConfigWithOptions(String workspaceName, String configType, String id, GetConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConfig"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configType) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries a specific type of configuration from a specified workspace.</p>
     * 
     * @param request GetConfigRequest
     * @return GetConfigResponse
     */
    public GetConfigResponse getConfig(String workspaceName, String configType, String id, GetConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConfigWithOptions(workspaceName, configType, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an access credential.</p>
     * 
     * @param request GetCredentialsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCredentialsResponse
     */
    public GetCredentialsResponse getCredentialsWithOptions(String token, String workspaceName, GetCredentialsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCredentials"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/credentials/" + com.aliyun.openapiutil.Client.getEncodeParam(token) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCredentialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an access credential.</p>
     * 
     * @param request GetCredentialsRequest
     * @return GetCredentialsResponse
     */
    public GetCredentialsResponse getCredentials(String token, String workspaceName, GetCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCredentialsWithOptions(token, workspaceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of experience data.</p>
     * 
     * @param request GetExperienceDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExperienceDataResponse
     */
    public GetExperienceDataResponse getExperienceDataWithOptions(String workspaceName, String id, GetExperienceDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperienceData"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/experience-data/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperienceDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of experience data.</p>
     * 
     * @param request GetExperienceDataRequest
     * @return GetExperienceDataResponse
     */
    public GetExperienceDataResponse getExperienceData(String workspaceName, String id, GetExperienceDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperienceDataWithOptions(workspaceName, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specific feature instance in a specified workspace.</p>
     * 
     * @param request GetFunctionInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFunctionInstanceResponse
     */
    public GetFunctionInstanceResponse getFunctionInstanceWithOptions(String workspaceName, String functionName, String instanceName, GetFunctionInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            query.put("output", request.output);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunctionInstance"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specific feature instance in a specified workspace.</p>
     * 
     * @param request GetFunctionInstanceRequest
     * @return GetFunctionInstanceResponse
     */
    public GetFunctionInstanceResponse getFunctionInstance(String workspaceName, String functionName, String instanceName, GetFunctionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionInstanceWithOptions(workspaceName, functionName, instanceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about an offline node.</p>
     * 
     * @param request GetOfflineTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOfflineTaskResponse
     */
    public GetOfflineTaskResponse getOfflineTaskWithOptions(String workspaceName, String type, String taskName, GetOfflineTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOfflineTask"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/offline-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(type) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(taskName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOfflineTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about an offline node.</p>
     * 
     * @param request GetOfflineTaskRequest
     * @return GetOfflineTaskResponse
     */
    public GetOfflineTaskResponse getOfflineTask(String workspaceName, String type, String taskName, GetOfflineTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOfflineTaskWithOptions(workspaceName, type, taskName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation allows you to retrieve offline task logs information by specifying the workspace name, node type, and node name.</li>
     * <li>Provide a valid <code>regionId</code> as one of the query parameters to specify the area for the request.</li>
     * <li>The returned information includes but is not limited to network configurations (private ES and public ES) and their enabling status, domain names, and IP whitelist groups.</li>
     * <li>Note: Ensure that you have sufficient permissions (such as the <code>GetLog</code> action in the RAM policy) to invoke this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of offline task logs in a specified workspace.</p>
     * 
     * @param request GetOfflineTaskLogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOfflineTaskLogResponse
     */
    public GetOfflineTaskLogResponse getOfflineTaskLogWithOptions(String workspaceName, String type, String taskName, GetOfflineTaskLogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOfflineTaskLog"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/offline-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(type) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(taskName) + "/log"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOfflineTaskLogResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation allows you to retrieve offline task logs information by specifying the workspace name, node type, and node name.</li>
     * <li>Provide a valid <code>regionId</code> as one of the query parameters to specify the area for the request.</li>
     * <li>The returned information includes but is not limited to network configurations (private ES and public ES) and their enabling status, domain names, and IP whitelist groups.</li>
     * <li>Note: Ensure that you have sufficient permissions (such as the <code>GetLog</code> action in the RAM policy) to invoke this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of offline task logs in a specified workspace.</p>
     * 
     * @param request GetOfflineTaskLogRequest
     * @return GetOfflineTaskLogResponse
     */
    public GetOfflineTaskLogResponse getOfflineTaskLog(String workspaceName, String type, String taskName, GetOfflineTaskLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOfflineTaskLogWithOptions(workspaceName, type, taskName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a RAG evaluation task.</p>
     * 
     * @param request GetRagEvaluatorTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRagEvaluatorTaskResponse
     */
    public GetRagEvaluatorTaskResponse getRagEvaluatorTaskWithOptions(String workspaceName, String taskId, GetRagEvaluatorTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRagEvaluatorTask"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/rag-evaluator/v1/api/task/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRagEvaluatorTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a RAG evaluation task.</p>
     * 
     * @param request GetRagEvaluatorTaskRequest
     * @return GetRagEvaluatorTaskResponse
     */
    public GetRagEvaluatorTaskResponse getRagEvaluatorTask(String workspaceName, String taskId, GetRagEvaluatorTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRagEvaluatorTaskWithOptions(workspaceName, taskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves data table field information.</p>
     * 
     * @param request GetTableColumnsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableColumnsResponse
     */
    public GetTableColumnsResponse getTableColumnsWithOptions(String workspaceName, String dataSourceType, GetTableColumnsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableColumns"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/data-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(dataSourceType) + "/columns"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableColumnsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves data table field information.</p>
     * 
     * @param request GetTableColumnsRequest
     * @return GetTableColumnsResponse
     */
    public GetTableColumnsResponse getTableColumns(String workspaceName, String dataSourceType, GetTableColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableColumnsWithOptions(workspaceName, dataSourceType, request, headers, runtime);
    }

    /**
     * @param request GetTableFieldsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableFieldsResponse
     */
    public GetTableFieldsResponse getTableFieldsWithOptions(String workspaceName, String dataSourceType, GetTableFieldsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rawType)) {
            query.put("rawType", request.rawType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableFields"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/data-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(dataSourceType) + "/fields"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableFieldsResponse());
    }

    /**
     * @param request GetTableFieldsRequest
     * @return GetTableFieldsResponse
     */
    public GetTableFieldsResponse getTableFields(String workspaceName, String dataSourceType, GetTableFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableFieldsWithOptions(workspaceName, dataSourceType, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves data tables.</p>
     * 
     * @param request GetTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTablesResponse
     */
    public GetTablesResponse getTablesWithOptions(String workspaceName, String dataSourceType, GetTablesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTables"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/data-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(dataSourceType) + "/tables"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves data tables.</p>
     * 
     * @param request GetTablesRequest
     * @return GetTablesResponse
     */
    public GetTablesResponse getTables(String workspaceName, String dataSourceType, GetTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTablesWithOptions(workspaceName, dataSourceType, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a workspace.</p>
     * 
     * @param request GetWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkspaceResponse
     */
    public GetWorkspaceResponse getWorkspaceWithOptions(String workspaceName, GetWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspace"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a workspace.</p>
     * 
     * @param request GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    public GetWorkspaceResponse getWorkspace(String workspaceName, GetWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceWithOptions(workspaceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of asynchronous tasks.</p>
     * 
     * @param request ListAsyncTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAsyncTasksResponse
     */
    public ListAsyncTasksResponse listAsyncTasksWithOptions(String workspaceName, ListAsyncTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("dataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("serviceType", request.serviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAsyncTasks"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/async-tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAsyncTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of asynchronous tasks.</p>
     * 
     * @param request ListAsyncTasksRequest
     * @return ListAsyncTasksResponse
     */
    public ListAsyncTasksResponse listAsyncTasks(String workspaceName, ListAsyncTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAsyncTasksWithOptions(workspaceName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can use this API operation to retrieve the list of configuration items based on the specified workspace name and configuration category. Paged query is supported. Use the <code>pageNumber</code> and <code>pageSize</code> parameters to control the number of results and the page number. The <code>nextToken</code> and <code>maxResults</code> parameters are also provided for paged query when handling large amounts of data.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of configuration items of a specific category in a specified workspace.</p>
     * 
     * @param request ListCapabilitiesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCapabilitiesResponse
     */
    public ListCapabilitiesResponse listCapabilitiesWithOptions(String workspaceName, String itemCategory, ListCapabilitiesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCapabilities"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/capabilities/" + com.aliyun.openapiutil.Client.getEncodeParam(itemCategory) + "/items"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCapabilitiesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can use this API operation to retrieve the list of configuration items based on the specified workspace name and configuration category. Paged query is supported. Use the <code>pageNumber</code> and <code>pageSize</code> parameters to control the number of results and the page number. The <code>nextToken</code> and <code>maxResults</code> parameters are also provided for paged query when handling large amounts of data.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of configuration items of a specific category in a specified workspace.</p>
     * 
     * @param request ListCapabilitiesRequest
     * @return ListCapabilitiesResponse
     */
    public ListCapabilitiesResponse listCapabilities(String workspaceName, String itemCategory, ListCapabilitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCapabilitiesWithOptions(workspaceName, itemCategory, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of configurations of a specific type in a specified workspace.</p>
     * 
     * @param request ListConfigsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConfigsResponse
     */
    public ListConfigsResponse listConfigsWithOptions(String workspaceName, String configType, ListConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigs"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configType) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of configurations of a specific type in a specified workspace.</p>
     * 
     * @param request ListConfigsRequest
     * @return ListConfigsResponse
     */
    public ListConfigsResponse listConfigs(String workspaceName, String configType, ListConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConfigsWithOptions(workspaceName, configType, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of access credentials.</p>
     * 
     * @param request ListCredentialsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCredentialsResponse
     */
    public ListCredentialsResponse listCredentialsWithOptions(String workspaceName, ListCredentialsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCredentials"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/credentials"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCredentialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of access credentials.</p>
     * 
     * @param request ListCredentialsRequest
     * @return ListCredentialsResponse
     */
    public ListCredentialsResponse listCredentials(String workspaceName, ListCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCredentialsWithOptions(workspaceName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation queries all experience data of a user in a specific workspace. The results are sorted by creation time in descending order by default.</li>
     * <li>Pagination is not supported. However, you can filter data by using the serviceType and dataType parameters.</li>
     * <li>workspaceName is a path parameter and must be specified to indicate the workspace to query.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves all experience data in a specified workspace, with support for filtering by service type and data type.</p>
     * 
     * @param request ListExperienceDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExperienceDataResponse
     */
    public ListExperienceDataResponse listExperienceDataWithOptions(String workspaceName, ListExperienceDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("dataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("serviceType", request.serviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExperienceData"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/experience-data"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExperienceDataResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation queries all experience data of a user in a specific workspace. The results are sorted by creation time in descending order by default.</li>
     * <li>Pagination is not supported. However, you can filter data by using the serviceType and dataType parameters.</li>
     * <li>workspaceName is a path parameter and must be specified to indicate the workspace to query.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves all experience data in a specified workspace, with support for filtering by service type and data type.</p>
     * 
     * @param request ListExperienceDataRequest
     * @return ListExperienceDataResponse
     */
    public ListExperienceDataResponse listExperienceData(String workspaceName, ListExperienceDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExperienceDataWithOptions(workspaceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of service configurations.</p>
     * 
     * @param request ListFunctionInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFunctionInstancesResponse
     */
    public ListFunctionInstancesResponse listFunctionInstancesWithOptions(String workspaceName, String functionName, ListFunctionInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionType)) {
            query.put("functionType", request.functionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            query.put("modelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            query.put("output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFunctionInstances"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of service configurations.</p>
     * 
     * @param request ListFunctionInstancesRequest
     * @return ListFunctionInstancesResponse
     */
    public ListFunctionInstancesResponse listFunctionInstances(String workspaceName, String functionName, ListFunctionInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionInstancesWithOptions(workspaceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the restriction items of a feature.</p>
     * 
     * @param request ListFunctionRestrictionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFunctionRestrictionsResponse
     */
    public ListFunctionRestrictionsResponse listFunctionRestrictionsWithOptions(String workspaceName, String functionName, String restrictionName, ListFunctionRestrictionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            query.put("modelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFunctionRestrictions"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/restrictions/" + com.aliyun.openapiutil.Client.getEncodeParam(restrictionName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionRestrictionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the restriction items of a feature.</p>
     * 
     * @param request ListFunctionRestrictionsRequest
     * @return ListFunctionRestrictionsResponse
     */
    public ListFunctionRestrictionsResponse listFunctionRestrictions(String workspaceName, String functionName, String restrictionName, ListFunctionRestrictionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionRestrictionsWithOptions(workspaceName, functionName, restrictionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Offline Task Information List</p>
     * 
     * @param tmpReq ListOfflineTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOfflineTaskResponse
     */
    public ListOfflineTaskResponse listOfflineTaskWithOptions(String workspaceName, String type, ListOfflineTaskRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListOfflineTaskShrinkRequest request = new ListOfflineTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labels)) {
            request.labelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labels, "labels", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskStatus)) {
            request.taskStatusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskStatus, "taskStatus", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelsShrink)) {
            query.put("labels", request.labelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("taskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatusShrink)) {
            query.put("taskStatus", request.taskStatusShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOfflineTask"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/offline-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(type) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOfflineTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Offline Task Information List</p>
     * 
     * @param request ListOfflineTaskRequest
     * @return ListOfflineTaskResponse
     */
    public ListOfflineTaskResponse listOfflineTask(String workspaceName, String type, ListOfflineTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOfflineTaskWithOptions(workspaceName, type, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation retrieves error logs for a specific workspace, node type, and node name.</li>
     * <li>The <code>startTime</code> and <code>endTime</code> parameters allow you to define a custom query time range. If not provided, data from the past hour is queried by default.</li>
     * <li>The paging parameters <code>pageNum</code> and <code>pageSize</code> help control the number of returned results and page navigation. They represent the requested page number and the number of log entries per page, with default values of 1 and 10 respectively.</li>
     * <li>Note: Ensure that you have obtained the required RAM permissions (Action: ListErrorLogs) before you invoke this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the error log list of batch tasks in a specified workspace.</p>
     * 
     * @param request ListOfflineTaskErrorLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOfflineTaskErrorLogsResponse
     */
    public ListOfflineTaskErrorLogsResponse listOfflineTaskErrorLogsWithOptions(String workspaceName, String type, String taskName, ListOfflineTaskErrorLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOfflineTaskErrorLogs"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/offline-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(type) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(taskName) + "/error-logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOfflineTaskErrorLogsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation retrieves error logs for a specific workspace, node type, and node name.</li>
     * <li>The <code>startTime</code> and <code>endTime</code> parameters allow you to define a custom query time range. If not provided, data from the past hour is queried by default.</li>
     * <li>The paging parameters <code>pageNum</code> and <code>pageSize</code> help control the number of returned results and page navigation. They represent the requested page number and the number of log entries per page, with default values of 1 and 10 respectively.</li>
     * <li>Note: Ensure that you have obtained the required RAM permissions (Action: ListErrorLogs) before you invoke this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the error log list of batch tasks in a specified workspace.</p>
     * 
     * @param request ListOfflineTaskErrorLogsRequest
     * @return ListOfflineTaskErrorLogsResponse
     */
    public ListOfflineTaskErrorLogsResponse listOfflineTaskErrorLogs(String workspaceName, String type, String taskName, ListOfflineTaskErrorLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOfflineTaskErrorLogsWithOptions(workspaceName, type, taskName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of RAG evaluation tasks.</p>
     * 
     * @param request ListRagEvaluatorTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRagEvaluatorTasksResponse
     */
    public ListRagEvaluatorTasksResponse listRagEvaluatorTasksWithOptions(String workspaceName, ListRagEvaluatorTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRagEvaluatorTasks"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/rag-evaluator/v1/api/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRagEvaluatorTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of RAG evaluation tasks.</p>
     * 
     * @param request ListRagEvaluatorTasksRequest
     * @return ListRagEvaluatorTasksResponse
     */
    public ListRagEvaluatorTasksResponse listRagEvaluatorTasks(String workspaceName, ListRagEvaluatorTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRagEvaluatorTasksWithOptions(workspaceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of services.</p>
     * 
     * @param request ListServicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServicesResponse
     */
    public ListServicesResponse listServicesWithOptions(String workspaceName, ListServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            query.put("modelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("serviceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("serviceType", request.serviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServices"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/services"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of services.</p>
     * 
     * @param request ListServicesRequest
     * @return ListServicesResponse
     */
    public ListServicesResponse listServices(String workspaceName, ListServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServicesWithOptions(workspaceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of workspaces.</p>
     * 
     * @param request ListWorkspacesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspacesWithOptions(ListWorkspacesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("sortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkspaces"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspacesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of workspaces.</p>
     * 
     * @param request ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkspacesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a batch task.</p>
     * 
     * @param request ModifyOfflineTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyOfflineTaskResponse
     */
    public ModifyOfflineTaskResponse modifyOfflineTaskWithOptions(String workspaceName, String type, String taskName, ModifyOfflineTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.meta)) {
            body.put("meta", request.meta);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processors)) {
            body.put("processors", request.processors);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sink)) {
            body.put("sink", request.sink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyOfflineTask"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/offline-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(type) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(taskName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyOfflineTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a batch task.</p>
     * 
     * @param request ModifyOfflineTaskRequest
     * @return ModifyOfflineTaskResponse
     */
    public ModifyOfflineTaskResponse modifyOfflineTask(String workspaceName, String type, String taskName, ModifyOfflineTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyOfflineTaskWithOptions(workspaceName, type, taskName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API allows you to adjust network-related configurations for a specific type of batch node within a specified workspace.</li>
     * <li>Use this operation to control public or private network access permissions for the ES service and set the corresponding IP whitelists.</li>
     * <li>When you need to change any network settings (such as enabling or shutting down public network access or updating IP whitelists), ensure that the <code>network</code> object contains the correct parameters.</li>
     * <li>Note: Executing this operation may affect currently running nodes. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the network configuration for batch task log scenarios, including enabling or disabling public and private network access and setting IP whitelists.</p>
     * 
     * @param request ModifyOfflineTaskLogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyOfflineTaskLogResponse
     */
    public ModifyOfflineTaskLogResponse modifyOfflineTaskLogWithOptions(String workspaceName, String type, String taskName, ModifyOfflineTaskLogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            body.put("network", request.network);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyOfflineTaskLog"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/offline-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(type) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(taskName) + "/log"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyOfflineTaskLogResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API allows you to adjust network-related configurations for a specific type of batch node within a specified workspace.</li>
     * <li>Use this operation to control public or private network access permissions for the ES service and set the corresponding IP whitelists.</li>
     * <li>When you need to change any network settings (such as enabling or shutting down public network access or updating IP whitelists), ensure that the <code>network</code> object contains the correct parameters.</li>
     * <li>Note: Executing this operation may affect currently running nodes. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the network configuration for batch task log scenarios, including enabling or disabling public and private network access and setting IP whitelists.</p>
     * 
     * @param request ModifyOfflineTaskLogRequest
     * @return ModifyOfflineTaskLogResponse
     */
    public ModifyOfflineTaskLogResponse modifyOfflineTaskLog(String workspaceName, String type, String taskName, ModifyOfflineTaskLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyOfflineTaskLogWithOptions(workspaceName, type, taskName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts the service.</p>
     * 
     * @param request ResumeFunctionInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeFunctionInstanceResponse
     */
    public ResumeFunctionInstanceResponse resumeFunctionInstanceWithOptions(String workspaceName, String functionName, String instanceName, ResumeFunctionInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeFunctionInstance"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceName) + "/actions/resume"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeFunctionInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts the service.</p>
     * 
     * @param request ResumeFunctionInstanceRequest
     * @return ResumeFunctionInstanceResponse
     */
    public ResumeFunctionInstanceResponse resumeFunctionInstance(String workspaceName, String functionName, String instanceName, ResumeFunctionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeFunctionInstanceWithOptions(workspaceName, functionName, instanceName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Starts a batch task.</p>
     * 
     * @param request StartOfflineTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartOfflineTaskResponse
     */
    public StartOfflineTaskResponse startOfflineTaskWithOptions(String workspaceName, String type, String taskName, StartOfflineTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parallelism)) {
            body.put("parallelism", request.parallelism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timestamp)) {
            body.put("timestamp", request.timestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartOfflineTask"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/offline-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(type) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(taskName) + "/actions/start"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartOfflineTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Starts a batch task.</p>
     * 
     * @param request StartOfflineTaskRequest
     * @return StartOfflineTaskResponse
     */
    public StartOfflineTaskResponse startOfflineTask(String workspaceName, String type, String taskName, StartOfflineTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startOfflineTaskWithOptions(workspaceName, type, taskName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a batch task.</p>
     * 
     * @param request StopOfflineTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopOfflineTaskResponse
     */
    public StopOfflineTaskResponse stopOfflineTaskWithOptions(String workspaceName, String type, String taskName, StopOfflineTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parallelism)) {
            body.put("parallelism", request.parallelism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timestamp)) {
            body.put("timestamp", request.timestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopOfflineTask"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/offline-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(type) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(taskName) + "/actions/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopOfflineTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a batch task.</p>
     * 
     * @param request StopOfflineTaskRequest
     * @return StopOfflineTaskResponse
     */
    public StopOfflineTaskResponse stopOfflineTask(String workspaceName, String type, String taskName, StopOfflineTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopOfflineTaskWithOptions(workspaceName, type, taskName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API operation allows you to update a specific configuration item (<code>itemName</code>) under a category (<code>itemCategory</code>) in a specified workspace (<code>workspaceName</code>). By setting the <code>dryRun</code> parameter, you can preview changes without actually applying them. The request body can contain a new configuration description (<code>itemDesc</code>) and configuration content (<code>itemValue</code>). The structure of <code>itemValue</code> must conform to the requirements of the target configuration item.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a specific configuration item in a specified workspace.</p>
     * 
     * @param request UpdateCapabilityRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCapabilityResponse
     */
    public UpdateCapabilityResponse updateCapabilityWithOptions(String workspaceName, String itemCategory, String itemName, UpdateCapabilityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemDesc)) {
            body.put("itemDesc", request.itemDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemValue)) {
            body.put("itemValue", request.itemValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCapability"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/capabilities/" + com.aliyun.openapiutil.Client.getEncodeParam(itemCategory) + "/items/" + com.aliyun.openapiutil.Client.getEncodeParam(itemName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCapabilityResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API operation allows you to update a specific configuration item (<code>itemName</code>) under a category (<code>itemCategory</code>) in a specified workspace (<code>workspaceName</code>). By setting the <code>dryRun</code> parameter, you can preview changes without actually applying them. The request body can contain a new configuration description (<code>itemDesc</code>) and configuration content (<code>itemValue</code>). The structure of <code>itemValue</code> must conform to the requirements of the target configuration item.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a specific configuration item in a specified workspace.</p>
     * 
     * @param request UpdateCapabilityRequest
     * @return UpdateCapabilityResponse
     */
    public UpdateCapabilityResponse updateCapability(String workspaceName, String itemCategory, String itemName, UpdateCapabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCapabilityWithOptions(workspaceName, itemCategory, itemName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a specific type in a specified workspace.</p>
     * 
     * @param request UpdateConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConfigResponse
     */
    public UpdateConfigResponse updateConfigWithOptions(String workspaceName, String configType, UpdateConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configData)) {
            body.put("configData", request.configData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConfig"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configType) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a specific type in a specified workspace.</p>
     * 
     * @param request UpdateConfigRequest
     * @return UpdateConfigResponse
     */
    public UpdateConfigResponse updateConfig(String workspaceName, String configType, UpdateConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConfigWithOptions(workspaceName, configType, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an access credential.</p>
     * 
     * @param request UpdateCredentialsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCredentialsResponse
     */
    public UpdateCredentialsResponse updateCredentialsWithOptions(String token, String workspaceName, UpdateCredentialsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("enabled", request.enabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCredentials"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/credentials/" + com.aliyun.openapiutil.Client.getEncodeParam(token) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCredentialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an access credential.</p>
     * 
     * @param request UpdateCredentialsRequest
     * @return UpdateCredentialsResponse
     */
    public UpdateCredentialsResponse updateCredentials(String token, String workspaceName, UpdateCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCredentialsWithOptions(token, workspaceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the service configuration.</p>
     * 
     * @param request UpdateFunctionInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFunctionInstanceResponse
     */
    public UpdateFunctionInstanceResponse updateFunctionInstanceWithOptions(String workspaceName, String functionName, String instanceName, UpdateFunctionInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createParameters)) {
            body.put("createParameters", request.createParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFunctionInstance"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFunctionInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the service configuration.</p>
     * 
     * @param request UpdateFunctionInstanceRequest
     * @return UpdateFunctionInstanceResponse
     */
    public UpdateFunctionInstanceResponse updateFunctionInstance(String workspaceName, String functionName, String instanceName, UpdateFunctionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFunctionInstanceWithOptions(workspaceName, functionName, instanceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a workspace.</p>
     * 
     * @param request UpdateWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspaceWithOptions(String workspaceName, UpdateWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkspace"),
            new TeaPair("version", "2024-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/platform/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a workspace.</p>
     * 
     * @param request UpdateWorkspaceRequest
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspace(String workspaceName, UpdateWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkspaceWithOptions(workspaceName, request, headers, runtime);
    }
}

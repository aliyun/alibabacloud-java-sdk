// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225;

import com.aliyun.tea.*;
import com.aliyun.opensearch20171225.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("opensearch", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Binds a custom analyzer to an Elasticsearch instance.</p>
     * 
     * @param request BindESUserAnalyzerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindESUserAnalyzerResponse
     */
    public BindESUserAnalyzerResponse bindESUserAnalyzerWithOptions(String appGroupIdentity, String esInstanceId, BindESUserAnalyzerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindESUserAnalyzer"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/es/" + com.aliyun.openapiutil.Client.getEncodeParam(esInstanceId) + "/actions/bind-analyzer"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindESUserAnalyzerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a custom analyzer to an Elasticsearch instance.</p>
     * 
     * @param request BindESUserAnalyzerRequest
     * @return BindESUserAnalyzerResponse
     */
    public BindESUserAnalyzerResponse bindESUserAnalyzer(String appGroupIdentity, String esInstanceId, BindESUserAnalyzerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindESUserAnalyzerWithOptions(appGroupIdentity, esInstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Binds an Elasticsearch instance.</p>
     * 
     * @param request BindEsInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindEsInstanceResponse
     */
    public BindEsInstanceResponse bindEsInstanceWithOptions(String appGroupIdentity, BindEsInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindEsInstance"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/actions/bind-es-instance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindEsInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Binds an Elasticsearch instance.</p>
     * 
     * @param request BindEsInstanceRequest
     * @return BindEsInstanceResponse
     */
    public BindEsInstanceResponse bindEsInstance(String appGroupIdentity, BindEsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindEsInstanceWithOptions(appGroupIdentity, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Compiles a sort script.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompileSortScriptResponse
     */
    public CompileSortScriptResponse compileSortScriptWithOptions(String appGroupIdentity, String scriptName, String appVersionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompileSortScript"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appVersionId) + "/sort-scripts/" + com.aliyun.openapiutil.Client.getEncodeParam(scriptName) + "/actions/compiling"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompileSortScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Compiles a sort script.</p>
     * @return CompileSortScriptResponse
     */
    public CompileSortScriptResponse compileSortScript(String appGroupIdentity, String scriptName, String appVersionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.compileSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an experiment.</p>
     * 
     * @param request CreateABTestExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateABTestExperimentResponse
     */
    public CreateABTestExperimentResponse createABTestExperimentWithOptions(String appGroupIdentity, String sceneId, String groupId, CreateABTestExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateABTestExperiment"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/experiments"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateABTestExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an experiment.</p>
     * 
     * @param request CreateABTestExperimentRequest
     * @return CreateABTestExperimentResponse
     */
    public CreateABTestExperimentResponse createABTestExperiment(String appGroupIdentity, String sceneId, String groupId, CreateABTestExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createABTestExperimentWithOptions(appGroupIdentity, sceneId, groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a test group.</p>
     * 
     * @param request CreateABTestGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateABTestGroupResponse
     */
    public CreateABTestGroupResponse createABTestGroupWithOptions(String appGroupIdentity, String sceneId, CreateABTestGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateABTestGroup"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/groups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateABTestGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a test group.</p>
     * 
     * @param request CreateABTestGroupRequest
     * @return CreateABTestGroupResponse
     */
    public CreateABTestGroupResponse createABTestGroup(String appGroupIdentity, String sceneId, CreateABTestGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createABTestGroupWithOptions(appGroupIdentity, sceneId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an scenario.</p>
     * 
     * @param request CreateABTestSceneRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateABTestSceneResponse
     */
    public CreateABTestSceneResponse createABTestSceneWithOptions(String appGroupIdentity, CreateABTestSceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateABTestScene"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scenes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateABTestSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an scenario.</p>
     * 
     * @param request CreateABTestSceneRequest
     * @return CreateABTestSceneResponse
     */
    public CreateABTestSceneResponse createABTestScene(String appGroupIdentity, CreateABTestSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createABTestSceneWithOptions(appGroupIdentity, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  When you create a standard application, a new version of the application is created if the specified application name already exists.</p>
     * <ul>
     * <li>When you create a version of an existing application, you must specify the autoSwitch and realtimeShared parameters.</li>
     * <li>When you create a version of an existing application, the value of the quota parameter is the same as that of the quota parameter in the previous version of the application.</li>
     * <li>When you create a version of an existing application, the modification of the value of the quota parameter does not take effect.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a version for an OpenSearch application.</p>
     * 
     * @param request CreateAppRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppResponse
     */
    public CreateAppResponse createAppWithOptions(String appGroupIdentity, CreateAppRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoSwitch)) {
            body.put("autoSwitch", request.autoSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            body.put("cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configItems)) {
            body.put("configItems", request.configItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSources)) {
            body.put("dataSources", request.dataSources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fetchFields)) {
            body.put("fetchFields", request.fetchFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstRanks)) {
            body.put("firstRanks", request.firstRanks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interpretations)) {
            body.put("interpretations", request.interpretations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            body.put("networkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompts)) {
            body.put("prompts", request.prompts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryProcessors)) {
            body.put("queryProcessors", request.queryProcessors);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realtimeShared)) {
            body.put("realtimeShared", request.realtimeShared);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            body.put("schema", request.schema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemas)) {
            body.put("schemas", request.schemas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondRanks)) {
            body.put("secondRanks", request.secondRanks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.summaries)) {
            body.put("summaries", request.summaries);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApp"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppResponse());
    }

    /**
     * <b>description</b> :
     * <p>  When you create a standard application, a new version of the application is created if the specified application name already exists.</p>
     * <ul>
     * <li>When you create a version of an existing application, you must specify the autoSwitch and realtimeShared parameters.</li>
     * <li>When you create a version of an existing application, the value of the quota parameter is the same as that of the quota parameter in the previous version of the application.</li>
     * <li>When you create a version of an existing application, the modification of the value of the quota parameter does not take effect.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a version for an OpenSearch application.</p>
     * 
     * @param request CreateAppRequest
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(String appGroupIdentity, CreateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppWithOptions(appGroupIdentity, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an OpenSearch application.</p>
     * 
     * @param request CreateAppGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppGroupResponse
     */
    public CreateAppGroupResponse createAppGroupWithOptions(CreateAppGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("chargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quota)) {
            body.put("quota", request.quota);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppGroup"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an OpenSearch application.</p>
     * 
     * @param request CreateAppGroupRequest
     * @return CreateAppGroupResponse
     */
    public CreateAppGroupResponse createAppGroup(CreateAppGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppGroupWithOptions(request, headers, runtime);
    }

    /**
     * @param request CreateAppGroupCredentialsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppGroupCredentialsResponse
     */
    public CreateAppGroupCredentialsResponse createAppGroupCredentialsWithOptions(String appGroupIdentity, CreateAppGroupCredentialsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CreateAppGroupCredentials"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/credentials"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppGroupCredentialsResponse());
    }

    /**
     * @param request CreateAppGroupCredentialsRequest
     * @return CreateAppGroupCredentialsResponse
     */
    public CreateAppGroupCredentialsResponse createAppGroupCredentials(String appGroupIdentity, CreateAppGroupCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppGroupCredentialsWithOptions(appGroupIdentity, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a rough sort expression for a version of an OpenSearch application. If you set dryRun to true, this operation checks the specified rough sort expression. By default, the value of dryRun is false if you do not set this parameter.</p>
     * 
     * @param request CreateFirstRankRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFirstRankResponse
     */
    public CreateFirstRankResponse createFirstRankWithOptions(String appGroupIdentity, String appId, CreateFirstRankRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFirstRank"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/first-ranks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFirstRankResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a rough sort expression for a version of an OpenSearch application. If you set dryRun to true, this operation checks the specified rough sort expression. By default, the value of dryRun is false if you do not set this parameter.</p>
     * 
     * @param request CreateFirstRankRequest
     * @return CreateFirstRankResponse
     */
    public CreateFirstRankResponse createFirstRank(String appGroupIdentity, String appId, CreateFirstRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFirstRankWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/421377.html">GetFunctionCurrentVersion</a> operation to query the latest version of a feature. The response of the operation includes the createParameters parameter that is used to create an algorithm instance, the usageParameters parameter, and the requirements for setting these parameters.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an algorithm instance of a feature.</p>
     * 
     * @param request CreateFunctionInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFunctionInstanceResponse
     */
    public CreateFunctionInstanceResponse createFunctionInstanceWithOptions(String appGroupIdentity, String functionName, CreateFunctionInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createParameters)) {
            body.put("createParameters", request.createParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cron)) {
            body.put("cron", request.cron);
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

        if (!com.aliyun.teautil.Common.isUnset(request.usageParameters)) {
            body.put("usageParameters", request.usageParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFunctionInstance"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFunctionInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/421377.html">GetFunctionCurrentVersion</a> operation to query the latest version of a feature. The response of the operation includes the createParameters parameter that is used to create an algorithm instance, the usageParameters parameter, and the requirements for setting these parameters.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an algorithm instance of a feature.</p>
     * 
     * @param request CreateFunctionInstanceRequest
     * @return CreateFunctionInstanceResponse
     */
    public CreateFunctionInstanceResponse createFunctionInstance(String appGroupIdentity, String functionName, CreateFunctionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFunctionInstanceWithOptions(appGroupIdentity, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an algorithm resource for a specific feature.</p>
     * 
     * @param request CreateFunctionResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFunctionResourceResponse
     */
    public CreateFunctionResourceResponse createFunctionResourceWithOptions(String appGroupIdentity, String functionName, CreateFunctionResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            body.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFunctionResource"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/resources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFunctionResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an algorithm resource for a specific feature.</p>
     * 
     * @param request CreateFunctionResourceRequest
     * @return CreateFunctionResourceResponse
     */
    public CreateFunctionResourceResponse createFunctionResource(String appGroupIdentity, String functionName, CreateFunctionResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFunctionResourceWithOptions(appGroupIdentity, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a training task for an algorithm instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFunctionTaskResponse
     */
    public CreateFunctionTaskResponse createFunctionTaskWithOptions(String appGroupIdentity, String functionName, String instanceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFunctionTask"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceName) + "/tasks"),
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
     * <p>Starts a training task for an algorithm instance.</p>
     * @return CreateFunctionTaskResponse
     */
    public CreateFunctionTaskResponse createFunctionTask(String appGroupIdentity, String functionName, String instanceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFunctionTaskWithOptions(appGroupIdentity, functionName, instanceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create an intervention dictionary.</p>
     * 
     * @param request CreateInterventionDictionaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInterventionDictionaryResponse
     */
    public CreateInterventionDictionaryResponse createInterventionDictionaryWithOptions(CreateInterventionDictionaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analyzerType)) {
            body.put("analyzerType", request.analyzerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInterventionDictionary"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/intervention-dictionaries"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInterventionDictionaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create an intervention dictionary.</p>
     * 
     * @param request CreateInterventionDictionaryRequest
     * @return CreateInterventionDictionaryResponse
     */
    public CreateInterventionDictionaryResponse createInterventionDictionary(CreateInterventionDictionaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInterventionDictionaryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a query analysis rule. If you set dryRun to true, this operation checks the specified query analysis rule. By default, the value of dryRun is false if you do not set this parameter.</p>
     * 
     * @param request CreateQueryProcessorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQueryProcessorResponse
     */
    public CreateQueryProcessorResponse createQueryProcessorWithOptions(String appGroupIdentity, String appId, CreateQueryProcessorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQueryProcessor"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/query-processors"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQueryProcessorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a query analysis rule. If you set dryRun to true, this operation checks the specified query analysis rule. By default, the value of dryRun is false if you do not set this parameter.</p>
     * 
     * @param request CreateQueryProcessorRequest
     * @return CreateQueryProcessorResponse
     */
    public CreateQueryProcessorResponse createQueryProcessor(String appGroupIdentity, String appId, CreateQueryProcessorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createQueryProcessorWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a scheduled task for an OpenSearch application.</p>
     * 
     * @param request CreateScheduledTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScheduledTaskResponse
     */
    public CreateScheduledTaskResponse createScheduledTaskWithOptions(String appGroupIdentity, CreateScheduledTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScheduledTask"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scheduled-tasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScheduledTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a scheduled task for an OpenSearch application.</p>
     * 
     * @param request CreateScheduledTaskRequest
     * @return CreateScheduledTaskResponse
     */
    public CreateScheduledTaskResponse createScheduledTask(String appGroupIdentity, CreateScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createScheduledTaskWithOptions(appGroupIdentity, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a query policy.</p>
     * 
     * @param request CreateSearchStrategyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSearchStrategyResponse
     */
    public CreateSearchStrategyResponse createSearchStrategyWithOptions(String appGroupIdentity, String appId, CreateSearchStrategyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSearchStrategy"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/search-strategies"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSearchStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a query policy.</p>
     * 
     * @param request CreateSearchStrategyRequest
     * @return CreateSearchStrategyResponse
     */
    public CreateSearchStrategyResponse createSearchStrategy(String appGroupIdentity, String appId, CreateSearchStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSearchStrategyWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a fine sort expression for a version of an OpenSearch application. If you set dryRun to true, this operation checks the specified fine sort expression. The default value of dryRun is false if you do not set this parameter.</p>
     * 
     * @param request CreateSecondRankRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSecondRankResponse
     */
    public CreateSecondRankResponse createSecondRankWithOptions(String appGroupIdentity, String appId, CreateSecondRankRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSecondRank"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/second-ranks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecondRankResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a fine sort expression for a version of an OpenSearch application. If you set dryRun to true, this operation checks the specified fine sort expression. The default value of dryRun is false if you do not set this parameter.</p>
     * 
     * @param request CreateSecondRankRequest
     * @return CreateSecondRankResponse
     */
    public CreateSecondRankResponse createSecondRank(String appGroupIdentity, String appId, CreateSecondRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSecondRankWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a sort script.</p>
     * 
     * @param request CreateSortScriptRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSortScriptResponse
     */
    public CreateSortScriptResponse createSortScriptWithOptions(String appGroupIdentity, String appVersionId, CreateSortScriptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptName)) {
            body.put("scriptName", request.scriptName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSortScript"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appVersionId) + "/sort-scripts"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSortScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a sort script.</p>
     * 
     * @param request CreateSortScriptRequest
     * @return CreateSortScriptResponse
     */
    public CreateSortScriptResponse createSortScript(String appGroupIdentity, String appVersionId, CreateSortScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSortScriptWithOptions(appGroupIdentity, appVersionId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a custom analyzer.</p>
     * 
     * @param request CreateUserAnalyzerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserAnalyzerResponse
     */
    public CreateUserAnalyzerResponse createUserAnalyzerWithOptions(CreateUserAnalyzerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.business)) {
            body.put("business", request.business);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessAppGroupId)) {
            body.put("businessAppGroupId", request.businessAppGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            body.put("businessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserAnalyzer"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/user-analyzers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserAnalyzerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a custom analyzer.</p>
     * 
     * @param request CreateUserAnalyzerRequest
     * @return CreateUserAnalyzerResponse
     */
    public CreateUserAnalyzerResponse createUserAnalyzer(CreateUserAnalyzerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserAnalyzerWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a test.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteABTestExperimentResponse
     */
    public DeleteABTestExperimentResponse deleteABTestExperimentWithOptions(String appGroupIdentity, String sceneId, String groupId, String experimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteABTestExperiment"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(experimentId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteABTestExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a test.</p>
     * @return DeleteABTestExperimentResponse
     */
    public DeleteABTestExperimentResponse deleteABTestExperiment(String appGroupIdentity, String sceneId, String groupId, String experimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteABTestExperimentWithOptions(appGroupIdentity, sceneId, groupId, experimentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除实验组</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteABTestGroupResponse
     */
    public DeleteABTestGroupResponse deleteABTestGroupWithOptions(String appGroupIdentity, String sceneId, String groupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteABTestGroup"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteABTestGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除实验组</p>
     * @return DeleteABTestGroupResponse
     */
    public DeleteABTestGroupResponse deleteABTestGroup(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteABTestGroupWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an A/B test scenario.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteABTestSceneResponse
     */
    public DeleteABTestSceneResponse deleteABTestSceneWithOptions(String appGroupIdentity, String sceneId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteABTestScene"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteABTestSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an A/B test scenario.</p>
     * @return DeleteABTestSceneResponse
     */
    public DeleteABTestSceneResponse deleteABTestScene(String appGroupIdentity, String sceneId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteABTestSceneWithOptions(appGroupIdentity, sceneId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an algorithm instance. Before you delete an instance, make sure that it is not in use to prevent service interruptions.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFunctionInstanceResponse
     */
    public DeleteFunctionInstanceResponse deleteFunctionInstanceWithOptions(String appGroupIdentity, String functionName, String instanceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFunctionInstance"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceName) + ""),
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
     * <p>Deletes an algorithm instance. Before you delete an instance, make sure that it is not in use to prevent service interruptions.</p>
     * @return DeleteFunctionInstanceResponse
     */
    public DeleteFunctionInstanceResponse deleteFunctionInstance(String appGroupIdentity, String functionName, String instanceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFunctionInstanceWithOptions(appGroupIdentity, functionName, instanceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an algorithm resource.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFunctionResourceResponse
     */
    public DeleteFunctionResourceResponse deleteFunctionResourceWithOptions(String appGroupIdentity, String functionName, String resourceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFunctionResource"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(resourceName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFunctionResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an algorithm resource.</p>
     * @return DeleteFunctionResourceResponse
     */
    public DeleteFunctionResourceResponse deleteFunctionResource(String appGroupIdentity, String functionName, String resourceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFunctionResourceWithOptions(appGroupIdentity, functionName, resourceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a training task. The training task in progress cannot be deleted.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFunctionTaskResponse
     */
    public DeleteFunctionTaskResponse deleteFunctionTaskWithOptions(String appGroupIdentity, String functionName, String instanceName, String generation, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFunctionTask"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceName) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(generation) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFunctionTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a training task. The training task in progress cannot be deleted.</p>
     * @return DeleteFunctionTaskResponse
     */
    public DeleteFunctionTaskResponse deleteFunctionTask(String appGroupIdentity, String functionName, String instanceName, String generation) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFunctionTaskWithOptions(appGroupIdentity, functionName, instanceName, generation, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除排序脚本</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSortScriptResponse
     */
    public DeleteSortScriptResponse deleteSortScriptWithOptions(String appGroupIdentity, String scriptName, String appVersionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSortScript"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appVersionId) + "/sort-scripts/" + com.aliyun.openapiutil.Client.getEncodeParam(scriptName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSortScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除排序脚本</p>
     * @return DeleteSortScriptResponse
     */
    public DeleteSortScriptResponse deleteSortScript(String appGroupIdentity, String scriptName, String appVersionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a script file.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSortScriptFileResponse
     */
    public DeleteSortScriptFileResponse deleteSortScriptFileWithOptions(String appGroupIdentity, String appVersionId, String scriptName, String fileName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSortScriptFile"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appVersionId) + "/sort-scripts/" + com.aliyun.openapiutil.Client.getEncodeParam(scriptName) + "/files/src/" + com.aliyun.openapiutil.Client.getEncodeParam(fileName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSortScriptFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a script file.</p>
     * @return DeleteSortScriptFileResponse
     */
    public DeleteSortScriptFileResponse deleteSortScriptFile(String appGroupIdentity, String appVersionId, String scriptName, String fileName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSortScriptFileWithOptions(appGroupIdentity, appVersionId, scriptName, fileName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeABTestExperimentResponse
     */
    public DescribeABTestExperimentResponse describeABTestExperimentWithOptions(String appGroupIdentity, String sceneId, String groupId, String experimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeABTestExperiment"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(experimentId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeABTestExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验详情</p>
     * @return DescribeABTestExperimentResponse
     */
    public DescribeABTestExperimentResponse describeABTestExperiment(String appGroupIdentity, String sceneId, String groupId, String experimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeABTestExperimentWithOptions(appGroupIdentity, sceneId, groupId, experimentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a test group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeABTestGroupResponse
     */
    public DescribeABTestGroupResponse describeABTestGroupWithOptions(String appGroupIdentity, String sceneId, String groupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeABTestGroup"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeABTestGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a test group.</p>
     * @return DescribeABTestGroupResponse
     */
    public DescribeABTestGroupResponse describeABTestGroup(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeABTestGroupWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an A/B test scenario.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeABTestSceneResponse
     */
    public DescribeABTestSceneResponse describeABTestSceneWithOptions(String appGroupIdentity, String sceneId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeABTestScene"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeABTestSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an A/B test scenario.</p>
     * @return DescribeABTestSceneResponse
     */
    public DescribeABTestSceneResponse describeABTestScene(String appGroupIdentity, String sceneId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeABTestSceneWithOptions(appGroupIdentity, sceneId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a version of an OpenSearch application.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppResponse
     */
    public DescribeAppResponse describeAppWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApp"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a version of an OpenSearch application.</p>
     * @return DescribeAppResponse
     */
    public DescribeAppResponse describeApp(String appGroupIdentity, String appId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an OpenSearch application.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppGroupResponse
     */
    public DescribeAppGroupResponse describeAppGroupWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppGroup"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an OpenSearch application.</p>
     * @return DescribeAppGroupResponse
     */
    public DescribeAppGroupResponse describeAppGroup(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppGroupWithOptions(appGroupIdentity, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics about a version of an OpenSearch application.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppStatisticsResponse
     */
    public DescribeAppStatisticsResponse describeAppStatisticsWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppStatistics"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/statistics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics about a version of an OpenSearch application.</p>
     * @return DescribeAppStatisticsResponse
     */
    public DescribeAppStatisticsResponse describeAppStatistics(String appGroupIdentity, String appId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppStatisticsWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  When you create a standard application, a new version of the application is created if the specified application name already exists.</p>
     * <ul>
     * <li>When you create a version of an existing application, you must specify the autoSwitch and realtimeShared parameters.</li>
     * <li>When you create a version of an existing application, the value of the quota parameter is the same as that of the quota parameter in the previous version of the application.</li>
     * <li>When you create a version of an existing application, the modification of the value of the quota parameter does not take effect.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the version list of an OpenSearch application.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppsResponse
     */
    public DescribeAppsResponse describeAppsWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApps"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  When you create a standard application, a new version of the application is created if the specified application name already exists.</p>
     * <ul>
     * <li>When you create a version of an existing application, you must specify the autoSwitch and realtimeShared parameters.</li>
     * <li>When you create a version of an existing application, the value of the quota parameter is the same as that of the quota parameter in the previous version of the application.</li>
     * <li>When you create a version of an existing application, the modification of the value of the quota parameter does not take effect.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the version list of an OpenSearch application.</p>
     * @return DescribeAppsResponse
     */
    public DescribeAppsResponse describeApps(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppsWithOptions(appGroupIdentity, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a data collection task of an application.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataCollctionResponse
     */
    public DescribeDataCollctionResponse describeDataCollctionWithOptions(String appGroupIdentity, String dataCollectionIdentity, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataCollction"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/data-collections/" + com.aliyun.openapiutil.Client.getEncodeParam(dataCollectionIdentity) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataCollctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a data collection task of an application.</p>
     * @return DescribeDataCollctionResponse
     */
    public DescribeDataCollctionResponse describeDataCollction(String appGroupIdentity, String dataCollectionIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDataCollctionWithOptions(appGroupIdentity, dataCollectionIdentity, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a rough sort expression that is configured for an OpenSearch application version.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFirstRankResponse
     */
    public DescribeFirstRankResponse describeFirstRankWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFirstRank"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/first-ranks/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFirstRankResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a rough sort expression that is configured for an OpenSearch application version.</p>
     * @return DescribeFirstRankResponse
     */
    public DescribeFirstRankResponse describeFirstRank(String appGroupIdentity, String appId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeFirstRankWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an intervention dictionary.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInterventionDictionaryResponse
     */
    public DescribeInterventionDictionaryResponse describeInterventionDictionaryWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInterventionDictionary"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/intervention-dictionaries/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInterventionDictionaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an intervention dictionary.</p>
     * @return DescribeInterventionDictionaryResponse
     */
    public DescribeInterventionDictionaryResponse describeInterventionDictionary(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInterventionDictionaryWithOptions(name, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQueryProcessorResponse
     */
    public DescribeQueryProcessorResponse describeQueryProcessorWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQueryProcessor"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/query-processors/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQueryProcessorResponse());
    }

    /**
     * @return DescribeQueryProcessorResponse
     */
    public DescribeQueryProcessorResponse describeQueryProcessor(String appGroupIdentity, String appId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQueryProcessorWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the endpoints of all regions that support OpenSearch.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/regions"),
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
     * <p>Queries the endpoints of all regions that support OpenSearch.</p>
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看应用定时任务详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScheduledTaskResponse
     */
    public DescribeScheduledTaskResponse describeScheduledTaskWithOptions(String appGroupIdentity, String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScheduledTask"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scheduled-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScheduledTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看应用定时任务详情</p>
     * @return DescribeScheduledTaskResponse
     */
    public DescribeScheduledTaskResponse describeScheduledTask(String appGroupIdentity, String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeScheduledTaskWithOptions(appGroupIdentity, taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a fine sort expression that is configured for a version of an OpenSearch application.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecondRankResponse
     */
    public DescribeSecondRankResponse describeSecondRankWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecondRank"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/second-ranks/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecondRankResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a fine sort expression that is configured for a version of an OpenSearch application.</p>
     * @return DescribeSecondRankResponse
     */
    public DescribeSecondRankResponse describeSecondRank(String appGroupIdentity, String appId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSecondRankWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取优化大师慢查询开通状态</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlowQueryStatusResponse
     */
    public DescribeSlowQueryStatusResponse describeSlowQueryStatusWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlowQueryStatus"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/optimizers/slow-query"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlowQueryStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取优化大师慢查询开通状态</p>
     * @return DescribeSlowQueryStatusResponse
     */
    public DescribeSlowQueryStatusResponse describeSlowQueryStatus(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSlowQueryStatusWithOptions(appGroupIdentity, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取自定义分析器详情</p>
     * 
     * @param request DescribeUserAnalyzerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserAnalyzerResponse
     */
    public DescribeUserAnalyzerResponse describeUserAnalyzerWithOptions(String name, DescribeUserAnalyzerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.with)) {
            query.put("with", request.with);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserAnalyzer"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/user-analyzers/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserAnalyzerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取自定义分析器详情</p>
     * 
     * @param request DescribeUserAnalyzerRequest
     * @return DescribeUserAnalyzerResponse
     */
    public DescribeUserAnalyzerResponse describeUserAnalyzer(String name, DescribeUserAnalyzerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUserAnalyzerWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>禁用优化大师慢查询服务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableSlowQueryResponse
     */
    public DisableSlowQueryResponse disableSlowQueryWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSlowQuery"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/optimizers/slow-query/actions/disable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSlowQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>禁用优化大师慢查询服务</p>
     * @return DisableSlowQueryResponse
     */
    public DisableSlowQueryResponse disableSlowQuery(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableSlowQueryWithOptions(appGroupIdentity, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables slow query optimization of Optimization Master.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableSlowQueryResponse
     */
    public EnableSlowQueryResponse enableSlowQueryWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSlowQuery"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/optimizers/slow-query/actions/enable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSlowQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables slow query optimization of Optimization Master.</p>
     * @return EnableSlowQueryResponse
     */
    public EnableSlowQueryResponse enableSlowQuery(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSlowQueryWithOptions(appGroupIdentity, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a wide table that is generated after a JOIN operation is performed on multiple tables.</p>
     * 
     * @param request GenerateMergedTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateMergedTableResponse
     */
    public GenerateMergedTableResponse generateMergedTableWithOptions(GenerateMergedTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            query.put("spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateMergedTable"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/assist/schema/actions/merge"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateMergedTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a wide table that is generated after a JOIN operation is performed on multiple tables.</p>
     * 
     * @param request GenerateMergedTableRequest
     * @return GenerateMergedTableResponse
     */
    public GenerateMergedTableResponse generateMergedTable(GenerateMergedTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateMergedTableWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the type of an industry.</p>
     * 
     * @param request GetDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDomainResponse
     */
    public GetDomainResponse getDomainWithOptions(String domainName, GetDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appGroupIdentity)) {
            query.put("appGroupIdentity", request.appGroupIdentity);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomain"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/domains/" + com.aliyun.openapiutil.Client.getEncodeParam(domainName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the type of an industry.</p>
     * 
     * @param request GetDomainRequest
     * @return GetDomainResponse
     */
    public GetDomainResponse getDomain(String domainName, GetDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDomainWithOptions(domainName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the version information about the current feature when you create an instance.</p>
     * 
     * @param request GetFunctionCurrentVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFunctionCurrentVersionResponse
     */
    public GetFunctionCurrentVersionResponse getFunctionCurrentVersionWithOptions(String functionName, GetFunctionCurrentVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionType)) {
            query.put("functionType", request.functionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            query.put("modelType", request.modelType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunctionCurrentVersion"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/current-version"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionCurrentVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the version information about the current feature when you create an instance.</p>
     * 
     * @param request GetFunctionCurrentVersionRequest
     * @return GetFunctionCurrentVersionResponse
     */
    public GetFunctionCurrentVersionResponse getFunctionCurrentVersion(String functionName, GetFunctionCurrentVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionCurrentVersionWithOptions(functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the algorithm instance that an application uses by default.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFunctionDefaultInstanceResponse
     */
    public GetFunctionDefaultInstanceResponse getFunctionDefaultInstanceWithOptions(String appGroupIdentity, String functionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunctionDefaultInstance"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/default-instance"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionDefaultInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the algorithm instance that an application uses by default.</p>
     * @return GetFunctionDefaultInstanceResponse
     */
    public GetFunctionDefaultInstanceResponse getFunctionDefaultInstance(String appGroupIdentity, String functionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionDefaultInstanceWithOptions(appGroupIdentity, functionName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an algorithm instance by instance name.</p>
     * 
     * @param request GetFunctionInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFunctionInstanceResponse
     */
    public GetFunctionInstanceResponse getFunctionInstanceWithOptions(String appGroupIdentity, String functionName, String instanceName, GetFunctionInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceName) + ""),
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
     * <p>Queries the details of an algorithm instance by instance name.</p>
     * 
     * @param request GetFunctionInstanceRequest
     * @return GetFunctionInstanceResponse
     */
    public GetFunctionInstanceResponse getFunctionInstance(String appGroupIdentity, String functionName, String instanceName, GetFunctionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionInstanceWithOptions(appGroupIdentity, functionName, instanceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an algorithm resource.</p>
     * 
     * @param request GetFunctionResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFunctionResourceResponse
     */
    public GetFunctionResourceResponse getFunctionResourceWithOptions(String appGroupIdentity, String functionName, String resourceName, GetFunctionResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetFunctionResource"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(resourceName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an algorithm resource.</p>
     * 
     * @param request GetFunctionResourceRequest
     * @return GetFunctionResourceResponse
     */
    public GetFunctionResourceResponse getFunctionResource(String appGroupIdentity, String functionName, String resourceName, GetFunctionResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionResourceWithOptions(appGroupIdentity, functionName, resourceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a training task.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFunctionTaskResponse
     */
    public GetFunctionTaskResponse getFunctionTaskWithOptions(String appGroupIdentity, String functionName, String instanceName, String generation, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunctionTask"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceName) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(generation) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a training task.</p>
     * @return GetFunctionTaskResponse
     */
    public GetFunctionTaskResponse getFunctionTask(String appGroupIdentity, String functionName, String instanceName, String generation) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionTaskWithOptions(appGroupIdentity, functionName, instanceName, generation, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries version information by version ID.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFunctionVersionResponse
     */
    public GetFunctionVersionResponse getFunctionVersionWithOptions(String functionName, String versionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunctionVersion"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(versionId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries version information by version ID.</p>
     * @return GetFunctionVersionResponse
     */
    public GetFunctionVersionResponse getFunctionVersion(String functionName, String versionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionVersionWithOptions(functionName, versionId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScriptFileNamesResponse
     */
    public GetScriptFileNamesResponse getScriptFileNamesWithOptions(String appGroupIdentity, String appVersionId, String scriptName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScriptFileNames"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appVersionId) + "/sort-scripts/" + com.aliyun.openapiutil.Client.getEncodeParam(scriptName) + "/file-names"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScriptFileNamesResponse());
    }

    /**
     * @return GetScriptFileNamesResponse
     */
    public GetScriptFileNamesResponse getScriptFileNames(String appGroupIdentity, String appVersionId, String scriptName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getScriptFileNamesWithOptions(appGroupIdentity, appVersionId, scriptName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a query policy.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSearchStrategyResponse
     */
    public GetSearchStrategyResponse getSearchStrategyWithOptions(String appGroupIdentity, String appId, String strategyName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSearchStrategy"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/search-strategies/" + com.aliyun.openapiutil.Client.getEncodeParam(strategyName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSearchStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a query policy.</p>
     * @return GetSearchStrategyResponse
     */
    public GetSearchStrategyResponse getSearchStrategy(String appGroupIdentity, String appId, String strategyName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSearchStrategyWithOptions(appGroupIdentity, appId, strategyName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a sort script.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSortScriptResponse
     */
    public GetSortScriptResponse getSortScriptWithOptions(String appGroupIdentity, String scriptName, String appVersionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSortScript"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appVersionId) + "/sort-scripts/" + com.aliyun.openapiutil.Client.getEncodeParam(scriptName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSortScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a sort script.</p>
     * @return GetSortScriptResponse
     */
    public GetSortScriptResponse getSortScript(String appGroupIdentity, String scriptName, String appVersionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the content of a sort script.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSortScriptFileResponse
     */
    public GetSortScriptFileResponse getSortScriptFileWithOptions(String appGroupIdentity, String scriptName, String appVersionId, String fileName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSortScriptFile"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appVersionId) + "/sort-scripts/" + com.aliyun.openapiutil.Client.getEncodeParam(scriptName) + "/files/src/" + com.aliyun.openapiutil.Client.getEncodeParam(fileName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSortScriptFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the content of a sort script.</p>
     * @return GetSortScriptFileResponse
     */
    public GetSortScriptFileResponse getSortScriptFile(String appGroupIdentity, String scriptName, String appVersionId, String fileName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSortScriptFileWithOptions(appGroupIdentity, scriptName, appVersionId, fileName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of experiments.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListABTestExperimentsResponse
     */
    public ListABTestExperimentsResponse listABTestExperimentsWithOptions(String appGroupIdentity, String sceneId, String groupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListABTestExperiments"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/experiments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListABTestExperimentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of experiments.</p>
     * @return ListABTestExperimentsResponse
     */
    public ListABTestExperimentsResponse listABTestExperiments(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestExperimentsWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whitelists.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListABTestFixedFlowDividersResponse
     */
    public ListABTestFixedFlowDividersResponse listABTestFixedFlowDividersWithOptions(String appGroupIdentity, String sceneId, String groupId, String experimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListABTestFixedFlowDividers"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(experimentId) + "/fixed-flow-dividers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListABTestFixedFlowDividersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whitelists.</p>
     * @return ListABTestFixedFlowDividersResponse
     */
    public ListABTestFixedFlowDividersResponse listABTestFixedFlowDividers(String appGroupIdentity, String sceneId, String groupId, String experimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestFixedFlowDividersWithOptions(appGroupIdentity, sceneId, groupId, experimentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验组清单</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListABTestGroupsResponse
     */
    public ListABTestGroupsResponse listABTestGroupsWithOptions(String appGroupIdentity, String sceneId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListABTestGroups"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/groups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListABTestGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验组清单</p>
     * @return ListABTestGroupsResponse
     */
    public ListABTestGroupsResponse listABTestGroups(String appGroupIdentity, String sceneId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestGroupsWithOptions(appGroupIdentity, sceneId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries test scenarios.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListABTestScenesResponse
     */
    public ListABTestScenesResponse listABTestScenesWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListABTestScenes"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scenes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListABTestScenesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries test scenarios.</p>
     * @return ListABTestScenesResponse
     */
    public ListABTestScenesResponse listABTestScenes(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestScenesWithOptions(appGroupIdentity, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation allows you to query applications by application name, instance ID, and application type.</p>
     * <ul>
     * <li>This operation allows you to sort the applications based on their creation time.</li>
     * <li>This operation supports the parameters for paging.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of OpenSearch applications.</p>
     * 
     * @param tmpReq ListAppGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppGroupsResponse
     */
    public ListAppGroupsResponse listAppGroupsWithOptions(ListAppGroupsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAppGroupsShrinkRequest request = new ListAppGroupsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppGroups"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppGroupsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation allows you to query applications by application name, instance ID, and application type.</p>
     * <ul>
     * <li>This operation allows you to sort the applications based on their creation time.</li>
     * <li>This operation supports the parameters for paging.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of OpenSearch applications.</p>
     * 
     * @param request ListAppGroupsRequest
     * @return ListAppGroupsResponse
     */
    public ListAppGroupsResponse listAppGroups(ListAppGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data collection tasks of an OpenSearch application.</p>
     * 
     * @param request ListDataCollectionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataCollectionsResponse
     */
    public ListDataCollectionsResponse listDataCollectionsWithOptions(String appGroupIdentity, ListDataCollectionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListDataCollections"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/data-collections"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataCollectionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data collection tasks of an OpenSearch application.</p>
     * 
     * @param request ListDataCollectionsRequest
     * @return ListDataCollectionsResponse
     */
    public ListDataCollectionsResponse listDataCollections(String appGroupIdentity, ListDataCollectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataCollectionsWithOptions(appGroupIdentity, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all fields in a table of a data source. This operation is for internal use only.</p>
     * 
     * @param request ListDataSourceTableFieldsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourceTableFieldsResponse
     */
    public ListDataSourceTableFieldsResponse listDataSourceTableFieldsWithOptions(String dataSourceType, ListDataSourceTableFieldsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rawType)) {
            query.put("rawType", request.rawType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSourceTableFields"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/assist/data-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(dataSourceType) + "/fields"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceTableFieldsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all fields in a table of a data source. This operation is for internal use only.</p>
     * 
     * @param request ListDataSourceTableFieldsRequest
     * @return ListDataSourceTableFieldsResponse
     */
    public ListDataSourceTableFieldsResponse listDataSourceTableFields(String dataSourceType, ListDataSourceTableFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourceTableFieldsWithOptions(dataSourceType, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains all data from a specified data source.</p>
     * 
     * @param request ListDataSourceTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourceTablesResponse
     */
    public ListDataSourceTablesResponse listDataSourceTablesWithOptions(String dataSourceType, ListDataSourceTablesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("params", request.params);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSourceTables"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/assist/data-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(dataSourceType) + "/tables"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains all data from a specified data source.</p>
     * 
     * @param request ListDataSourceTablesRequest
     * @return ListDataSourceTablesResponse
     */
    public ListDataSourceTablesResponse listDataSourceTables(String dataSourceType, ListDataSourceTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourceTablesWithOptions(dataSourceType, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the rough sort expressions that are configured for a version of an OpenSearch application.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFirstRanksResponse
     */
    public ListFirstRanksResponse listFirstRanksWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFirstRanks"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/first-ranks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFirstRanksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the rough sort expressions that are configured for a version of an OpenSearch application.</p>
     * @return ListFirstRanksResponse
     */
    public ListFirstRanksResponse listFirstRanks(String appGroupIdentity, String appId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFirstRanksWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all algorithm instances of a user, which meet specified conditions.</p>
     * 
     * @param request ListFunctionInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFunctionInstancesResponse
     */
    public ListFunctionInstancesResponse listFunctionInstancesWithOptions(String appGroupIdentity, String functionName, ListFunctionInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances"),
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
     * <p>Queries all algorithm instances of a user, which meet specified conditions.</p>
     * 
     * @param request ListFunctionInstancesRequest
     * @return ListFunctionInstancesResponse
     */
    public ListFunctionInstancesResponse listFunctionInstances(String appGroupIdentity, String functionName, ListFunctionInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionInstancesWithOptions(appGroupIdentity, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries algorithm resources.</p>
     * 
     * @param request ListFunctionResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFunctionResourcesResponse
     */
    public ListFunctionResourcesResponse listFunctionResourcesWithOptions(String appGroupIdentity, String functionName, ListFunctionResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            query.put("output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFunctionResources"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/resources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries algorithm resources.</p>
     * 
     * @param request ListFunctionResourcesRequest
     * @return ListFunctionResourcesResponse
     */
    public ListFunctionResourcesResponse listFunctionResources(String appGroupIdentity, String functionName, ListFunctionResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionResourcesWithOptions(appGroupIdentity, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the training tasks. The returned results are sorted by start time in descending order.</p>
     * 
     * @param request ListFunctionTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFunctionTasksResponse
     */
    public ListFunctionTasksResponse listFunctionTasksWithOptions(String appGroupIdentity, String functionName, String instanceName, ListFunctionTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFunctionTasks"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceName) + "/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the training tasks. The returned results are sorted by start time in descending order.</p>
     * 
     * @param request ListFunctionTasksRequest
     * @return ListFunctionTasksResponse
     */
    public ListFunctionTasksResponse listFunctionTasks(String appGroupIdentity, String functionName, String instanceName, ListFunctionTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionTasksWithOptions(appGroupIdentity, functionName, instanceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户的干预词典列表</p>
     * 
     * @param request ListInterventionDictionariesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInterventionDictionariesResponse
     */
    public ListInterventionDictionariesResponse listInterventionDictionariesWithOptions(ListInterventionDictionariesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            query.put("types", request.types);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInterventionDictionaries"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/intervention-dictionaries"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInterventionDictionariesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户的干预词典列表</p>
     * 
     * @param request ListInterventionDictionariesRequest
     * @return ListInterventionDictionariesResponse
     */
    public ListInterventionDictionariesResponse listInterventionDictionaries(ListInterventionDictionariesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInterventionDictionariesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the intervention entries in an intervention dictionary.</p>
     * 
     * @param request ListInterventionDictionaryEntriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInterventionDictionaryEntriesResponse
     */
    public ListInterventionDictionaryEntriesResponse listInterventionDictionaryEntriesWithOptions(String name, ListInterventionDictionaryEntriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.word)) {
            query.put("word", request.word);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInterventionDictionaryEntries"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/intervention-dictionaries/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/entries"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInterventionDictionaryEntriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the intervention entries in an intervention dictionary.</p>
     * 
     * @param request ListInterventionDictionaryEntriesRequest
     * @return ListInterventionDictionaryEntriesResponse
     */
    public ListInterventionDictionaryEntriesResponse listInterventionDictionaryEntries(String name, ListInterventionDictionaryEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInterventionDictionaryEntriesWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实体识别结果</p>
     * 
     * @param request ListInterventionDictionaryNerResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInterventionDictionaryNerResultsResponse
     */
    public ListInterventionDictionaryNerResultsResponse listInterventionDictionaryNerResultsWithOptions(String name, ListInterventionDictionaryNerResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInterventionDictionaryNerResults"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/intervention-dictionaries/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/ner-results"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInterventionDictionaryNerResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实体识别结果</p>
     * 
     * @param request ListInterventionDictionaryNerResultsRequest
     * @return ListInterventionDictionaryNerResultsResponse
     */
    public ListInterventionDictionaryNerResultsResponse listInterventionDictionaryNerResults(String name, ListInterventionDictionaryNerResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInterventionDictionaryNerResultsWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resources that are associated with an intervention dictionary. If the intervention dictionary is referenced by query analysis rules, this operation returns all applications that use the intervention dictionary and the information about the query analysis rules.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInterventionDictionaryRelatedEntitiesResponse
     */
    public ListInterventionDictionaryRelatedEntitiesResponse listInterventionDictionaryRelatedEntitiesWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInterventionDictionaryRelatedEntities"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/intervention-dictionaries/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/related"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInterventionDictionaryRelatedEntitiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resources that are associated with an intervention dictionary. If the intervention dictionary is referenced by query analysis rules, this operation returns all applications that use the intervention dictionary and the information about the query analysis rules.</p>
     * @return ListInterventionDictionaryRelatedEntitiesResponse
     */
    public ListInterventionDictionaryRelatedEntitiesResponse listInterventionDictionaryRelatedEntities(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInterventionDictionaryRelatedEntitiesWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看当前的处理流</p>
     * 
     * @param request ListProceedingsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProceedingsResponse
     */
    public ListProceedingsResponse listProceedingsWithOptions(String appGroupIdentity, ListProceedingsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterFinished)) {
            query.put("filterFinished", request.filterFinished);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProceedings"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/proceedings"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProceedingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看当前的处理流</p>
     * 
     * @param request ListProceedingsRequest
     * @return ListProceedingsResponse
     */
    public ListProceedingsResponse listProceedings(String appGroupIdentity, ListProceedingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProceedingsWithOptions(appGroupIdentity, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the results of a query analysis test. This API operation is available only to existing applications of OpenSearch Open Source Compatible Edition.</p>
     * 
     * @param request ListQueryProcessorAnalyzerResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQueryProcessorAnalyzerResultsResponse
     */
    public ListQueryProcessorAnalyzerResultsResponse listQueryProcessorAnalyzerResultsWithOptions(String appGroupIdentity, String appId, String name, ListQueryProcessorAnalyzerResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQueryProcessorAnalyzerResults"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/query-processors/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/analyze"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQueryProcessorAnalyzerResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the results of a query analysis test. This API operation is available only to existing applications of OpenSearch Open Source Compatible Edition.</p>
     * 
     * @param request ListQueryProcessorAnalyzerResultsRequest
     * @return ListQueryProcessorAnalyzerResultsResponse
     */
    public ListQueryProcessorAnalyzerResultsResponse listQueryProcessorAnalyzerResults(String appGroupIdentity, String appId, String name, ListQueryProcessorAnalyzerResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQueryProcessorAnalyzerResultsWithOptions(appGroupIdentity, appId, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the recommended priority settings of entity types for named entity recognition (NER).</p>
     * 
     * @param request ListQueryProcessorNersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQueryProcessorNersResponse
     */
    public ListQueryProcessorNersResponse listQueryProcessorNersWithOptions(ListQueryProcessorNersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("domain", request.domain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQueryProcessorNers"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/query-processor/ner/default-priorities"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQueryProcessorNersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the recommended priority settings of entity types for named entity recognition (NER).</p>
     * 
     * @param request ListQueryProcessorNersRequest
     * @return ListQueryProcessorNersResponse
     */
    public ListQueryProcessorNersResponse listQueryProcessorNers(ListQueryProcessorNersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQueryProcessorNersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of query analysis rules that are configured for a version of an OpenSearch application.</p>
     * 
     * @param request ListQueryProcessorsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQueryProcessorsResponse
     */
    public ListQueryProcessorsResponse listQueryProcessorsWithOptions(String appGroupIdentity, String appId, ListQueryProcessorsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isActive)) {
            query.put("isActive", request.isActive);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQueryProcessors"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/query-processors"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQueryProcessorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of query analysis rules that are configured for a version of an OpenSearch application.</p>
     * 
     * @param request ListQueryProcessorsRequest
     * @return ListQueryProcessorsResponse
     */
    public ListQueryProcessorsResponse listQueryProcessors(String appGroupIdentity, String appId, ListQueryProcessorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQueryProcessorsWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries tickets that are submitted to apply for quotas for an OpenSearch application.</p>
     * 
     * @param request ListQuotaReviewTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQuotaReviewTasksResponse
     */
    public ListQuotaReviewTasksResponse listQuotaReviewTasksWithOptions(String appGroupIdentity, ListQuotaReviewTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListQuotaReviewTasks"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/quota-review-tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotaReviewTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries tickets that are submitted to apply for quotas for an OpenSearch application.</p>
     * 
     * @param request ListQuotaReviewTasksRequest
     * @return ListQuotaReviewTasksResponse
     */
    public ListQuotaReviewTasksResponse listQuotaReviewTasks(String appGroupIdentity, ListQuotaReviewTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQuotaReviewTasksWithOptions(appGroupIdentity, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of scheduled tasks of an OpenSearch application.</p>
     * 
     * @param request ListScheduledTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScheduledTasksResponse
     */
    public ListScheduledTasksResponse listScheduledTasksWithOptions(String appGroupIdentity, ListScheduledTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScheduledTasks"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scheduled-tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScheduledTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of scheduled tasks of an OpenSearch application.</p>
     * 
     * @param request ListScheduledTasksRequest
     * @return ListScheduledTasksResponse
     */
    public ListScheduledTasksResponse listScheduledTasks(String appGroupIdentity, ListScheduledTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listScheduledTasksWithOptions(appGroupIdentity, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of query policies.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSearchStrategiesResponse
     */
    public ListSearchStrategiesResponse listSearchStrategiesWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSearchStrategies"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/search-strategies"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSearchStrategiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of query policies.</p>
     * @return ListSearchStrategiesResponse
     */
    public ListSearchStrategiesResponse listSearchStrategies(String appGroupIdentity, String appId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSearchStrategiesWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the fine sort expressions that are configured for a version of an OpenSearch application.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSecondRanksResponse
     */
    public ListSecondRanksResponse listSecondRanksWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSecondRanks"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/second-ranks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecondRanksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the fine sort expressions that are configured for a version of an OpenSearch application.</p>
     * @return ListSecondRanksResponse
     */
    public ListSecondRanksResponse listSecondRanks(String appGroupIdentity, String appId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSecondRanksWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the suggestions that are provided by Optimization Master for slow queries.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSlowQueryCategoriesResponse
     */
    public ListSlowQueryCategoriesResponse listSlowQueryCategoriesWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSlowQueryCategories"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/optimizers/slow-query/categories"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSlowQueryCategoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the suggestions that are provided by Optimization Master for slow queries.</p>
     * @return ListSlowQueryCategoriesResponse
     */
    public ListSlowQueryCategoriesResponse listSlowQueryCategories(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSlowQueryCategoriesWithOptions(appGroupIdentity, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出优化大师慢查询Query清单</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSlowQueryQueriesResponse
     */
    public ListSlowQueryQueriesResponse listSlowQueryQueriesWithOptions(String appGroupIdentity, String categoryIndex, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSlowQueryQueries"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/optimizers/slow-query/categories/" + com.aliyun.openapiutil.Client.getEncodeParam(categoryIndex) + "/queries"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSlowQueryQueriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出优化大师慢查询Query清单</p>
     * @return ListSlowQueryQueriesResponse
     */
    public ListSlowQueryQueriesResponse listSlowQueryQueries(String appGroupIdentity, String categoryIndex) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSlowQueryQueriesWithOptions(appGroupIdentity, categoryIndex, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of sort expressions that are configured for a version of an OpenSearch application.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSortExpressionsResponse
     */
    public ListSortExpressionsResponse listSortExpressionsWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSortExpressions"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/sort-expressions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSortExpressionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of sort expressions that are configured for a version of an OpenSearch application.</p>
     * @return ListSortExpressionsResponse
     */
    public ListSortExpressionsResponse listSortExpressions(String appGroupIdentity, String appId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSortExpressionsWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all sort scripts of an application version.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSortScriptsResponse
     */
    public ListSortScriptsResponse listSortScriptsWithOptions(String appGroupIdentity, String appVersionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSortScripts"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appVersionId) + "/sort-scripts"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSortScriptsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all sort scripts of an application version.</p>
     * @return ListSortScriptsResponse
     */
    public ListSortScriptsResponse listSortScripts(String appGroupIdentity, String appVersionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSortScriptsWithOptions(appGroupIdentity, appVersionId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries log statistics, such as application error logs, hotword rankings, and slow query logs.</p>
     * 
     * @param request ListStatisticLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStatisticLogsResponse
     */
    public ListStatisticLogsResponse listStatisticLogsWithOptions(String appGroupIdentity, String moduleName, ListStatisticLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columns)) {
            query.put("columns", request.columns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distinct)) {
            query.put("distinct", request.distinct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("sortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopTime)) {
            query.put("stopTime", request.stopTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStatisticLogs"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/statistic-logs/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStatisticLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries log statistics, such as application error logs, hotword rankings, and slow query logs.</p>
     * 
     * @param request ListStatisticLogsRequest
     * @return ListStatisticLogsResponse
     */
    public ListStatisticLogsResponse listStatisticLogs(String appGroupIdentity, String moduleName, ListStatisticLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStatisticLogsWithOptions(appGroupIdentity, moduleName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries statistical reports, such as application reports, drop-down suggestion reports, hotword shading reports, A/B test reports, and data quality reports.</p>
     * 
     * @param request ListStatisticReportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStatisticReportResponse
     */
    public ListStatisticReportResponse listStatisticReportWithOptions(String appGroupIdentity, String moduleName, ListStatisticReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columns)) {
            query.put("columns", request.columns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStatisticReport"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/statistic-report/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStatisticReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries statistical reports, such as application reports, drop-down suggestion reports, hotword shading reports, A/B test reports, and data quality reports.</p>
     * 
     * @param request ListStatisticReportRequest
     * @return ListStatisticReportResponse
     */
    public ListStatisticReportResponse listStatisticReport(String appGroupIdentity, String moduleName, ListStatisticReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStatisticReportWithOptions(appGroupIdentity, moduleName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries tagged resources.</p>
     * 
     * @param tmpReq ListTagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTagResourcesShrinkRequest request = new ListTagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceId)) {
            request.resourceIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceId, "resourceId", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdShrink)) {
            query.put("resourceId", request.resourceIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/resource-tags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries tagged resources.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the entries of a custom analyzer.</p>
     * 
     * @param request ListUserAnalyzerEntriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserAnalyzerEntriesResponse
     */
    public ListUserAnalyzerEntriesResponse listUserAnalyzerEntriesWithOptions(String name, ListUserAnalyzerEntriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.word)) {
            query.put("word", request.word);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserAnalyzerEntries"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/user-analyzers/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/entries"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserAnalyzerEntriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the entries of a custom analyzer.</p>
     * 
     * @param request ListUserAnalyzerEntriesRequest
     * @return ListUserAnalyzerEntriesResponse
     */
    public ListUserAnalyzerEntriesResponse listUserAnalyzerEntries(String name, ListUserAnalyzerEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserAnalyzerEntriesWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the custom analyzers that belong to the current account.</p>
     * 
     * @param request ListUserAnalyzersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserAnalyzersResponse
     */
    public ListUserAnalyzersResponse listUserAnalyzersWithOptions(ListUserAnalyzersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListUserAnalyzers"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/user-analyzers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserAnalyzersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the custom analyzers that belong to the current account.</p>
     * 
     * @param request ListUserAnalyzersRequest
     * @return ListUserAnalyzersResponse
     */
    public ListUserAnalyzersResponse listUserAnalyzers(ListUserAnalyzersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserAnalyzersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the properties of an OpenSearch application or sets the online version of an OpenSearch application.</p>
     * 
     * @param request ModifyAppGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppGroupResponse
     */
    public ModifyAppGroupResponse modifyAppGroupWithOptions(String appGroupIdentity, ModifyAppGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentVersion)) {
            body.put("currentVersion", request.currentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppGroup"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the properties of an OpenSearch application or sets the online version of an OpenSearch application.</p>
     * 
     * @param request ModifyAppGroupRequest
     * @return ModifyAppGroupResponse
     */
    public ModifyAppGroupResponse modifyAppGroup(String appGroupIdentity, ModifyAppGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyAppGroupWithOptions(appGroupIdentity, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the quotas of an OpenSearch application.</p>
     * 
     * @param request ModifyAppGroupQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppGroupQuotaResponse
     */
    public ModifyAppGroupQuotaResponse modifyAppGroupQuotaWithOptions(String appGroupIdentity, ModifyAppGroupQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppGroupQuota"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/quota"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppGroupQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the quotas of an OpenSearch application.</p>
     * 
     * @param request ModifyAppGroupQuotaRequest
     * @return ModifyAppGroupQuotaResponse
     */
    public ModifyAppGroupQuotaResponse modifyAppGroupQuota(String appGroupIdentity, ModifyAppGroupQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyAppGroupQuotaWithOptions(appGroupIdentity, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a rough sort expression for an OpenSearch application. If you set dryRun to true, this operation checks the rough sort expression after the expression is modified. If you do not specify this parameter, false is used by default.</p>
     * 
     * @param request ModifyFirstRankRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFirstRankResponse
     */
    public ModifyFirstRankResponse modifyFirstRankWithOptions(String appGroupIdentity, String appId, String name, ModifyFirstRankRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFirstRank"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/first-ranks/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFirstRankResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a rough sort expression for an OpenSearch application. If you set dryRun to true, this operation checks the rough sort expression after the expression is modified. If you do not specify this parameter, false is used by default.</p>
     * 
     * @param request ModifyFirstRankRequest
     * @return ModifyFirstRankResponse
     */
    public ModifyFirstRankResponse modifyFirstRank(String appGroupIdentity, String appId, String name, ModifyFirstRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyFirstRankWithOptions(appGroupIdentity, appId, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a query analysis rule for a specific application version. If you set dryRun to true, this operation checks the specified query analysis rule. By default, the value of dryRun is false if you do not specify this parameter.</p>
     * 
     * @param request ModifyQueryProcessorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyQueryProcessorResponse
     */
    public ModifyQueryProcessorResponse modifyQueryProcessorWithOptions(String appGroupIdentity, String appId, String name, ModifyQueryProcessorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyQueryProcessor"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/query-processors/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyQueryProcessorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a query analysis rule for a specific application version. If you set dryRun to true, this operation checks the specified query analysis rule. By default, the value of dryRun is false if you do not specify this parameter.</p>
     * 
     * @param request ModifyQueryProcessorRequest
     * @return ModifyQueryProcessorResponse
     */
    public ModifyQueryProcessorResponse modifyQueryProcessor(String appGroupIdentity, String appId, String name, ModifyQueryProcessorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyQueryProcessorWithOptions(appGroupIdentity, appId, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a scheduled task.</p>
     * 
     * @param request ModifyScheduledTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyScheduledTaskResponse
     */
    public ModifyScheduledTaskResponse modifyScheduledTaskWithOptions(String appGroupIdentity, String taskId, ModifyScheduledTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyScheduledTask"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scheduled-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyScheduledTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a scheduled task.</p>
     * 
     * @param request ModifyScheduledTaskRequest
     * @return ModifyScheduledTaskResponse
     */
    public ModifyScheduledTaskResponse modifyScheduledTask(String appGroupIdentity, String taskId, ModifyScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyScheduledTaskWithOptions(appGroupIdentity, taskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a fine sort expression that is configured for a specific OpenSearch application version. If you set dryRun to true, the specified fine sort expression is checked after the expression is modified. By default, the value of dryRun is false if you do not specify this parameter.</p>
     * 
     * @param request ModifySecondRankRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySecondRankResponse
     */
    public ModifySecondRankResponse modifySecondRankWithOptions(String appGroupIdentity, String appId, String name, ModifySecondRankRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySecondRank"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/second-ranks/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySecondRankResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a fine sort expression that is configured for a specific OpenSearch application version. If you set dryRun to true, the specified fine sort expression is checked after the expression is modified. By default, the value of dryRun is false if you do not specify this parameter.</p>
     * 
     * @param request ModifySecondRankRequest
     * @return ModifySecondRankResponse
     */
    public ModifySecondRankResponse modifySecondRank(String appGroupIdentity, String appId, String name, ModifySecondRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifySecondRankWithOptions(appGroupIdentity, appId, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Accepts the changes in intervention entries.</p>
     * 
     * @param request PushInterventionDictionaryEntriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushInterventionDictionaryEntriesResponse
     */
    public PushInterventionDictionaryEntriesResponse pushInterventionDictionaryEntriesWithOptions(String name, PushInterventionDictionaryEntriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushInterventionDictionaryEntries"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/intervention-dictionaries/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/entries/actions/bulk"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushInterventionDictionaryEntriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Accepts the changes in intervention entries.</p>
     * 
     * @param request PushInterventionDictionaryEntriesRequest
     * @return PushInterventionDictionaryEntriesResponse
     */
    public PushInterventionDictionaryEntriesResponse pushInterventionDictionaryEntries(String name, PushInterventionDictionaryEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushInterventionDictionaryEntriesWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Accepts the changes in the entries of a custom analyzer.</p>
     * 
     * @param request PushUserAnalyzerEntriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushUserAnalyzerEntriesResponse
     */
    public PushUserAnalyzerEntriesResponse pushUserAnalyzerEntriesWithOptions(String name, PushUserAnalyzerEntriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entries)) {
            body.put("entries", request.entries);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushUserAnalyzerEntries"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/user-analyzers/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/entries/actions/bulk"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushUserAnalyzerEntriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Accepts the changes in the entries of a custom analyzer.</p>
     * 
     * @param request PushUserAnalyzerEntriesRequest
     * @return PushUserAnalyzerEntriesResponse
     */
    public PushUserAnalyzerEntriesResponse pushUserAnalyzerEntries(String name, PushUserAnalyzerEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushUserAnalyzerEntriesWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布排序脚本</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseSortScriptResponse
     */
    public ReleaseSortScriptResponse releaseSortScriptWithOptions(String appGroupIdentity, String scriptName, String appVersionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseSortScript"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appVersionId) + "/sort-scripts/" + com.aliyun.openapiutil.Client.getEncodeParam(scriptName) + "/actions/release"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseSortScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布排序脚本</p>
     * @return ReleaseSortScriptResponse
     */
    public ReleaseSortScriptResponse releaseSortScript(String appGroupIdentity, String scriptName, String appVersionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a version of an OpenSearch application.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveAppResponse
     */
    public RemoveAppResponse removeAppWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveApp"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a version of an OpenSearch application.</p>
     * @return RemoveAppResponse
     */
    public RemoveAppResponse removeApp(String appGroupIdentity, String appId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeAppWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can delete only pay-as-you-go applications. You cannot delete subscription applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an OpenSearch application.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveAppGroupResponse
     */
    public RemoveAppGroupResponse removeAppGroupWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveAppGroup"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAppGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can delete only pay-as-you-go applications. You cannot delete subscription applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an OpenSearch application.</p>
     * @return RemoveAppGroupResponse
     */
    public RemoveAppGroupResponse removeAppGroup(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeAppGroupWithOptions(appGroupIdentity, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables data collection.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveDataCollectionResponse
     */
    public RemoveDataCollectionResponse removeDataCollectionWithOptions(String appGroupIdentity, String dataCollectionIdentity, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveDataCollection"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/data-collections/" + com.aliyun.openapiutil.Client.getEncodeParam(dataCollectionIdentity) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDataCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables data collection.</p>
     * @return RemoveDataCollectionResponse
     */
    public RemoveDataCollectionResponse removeDataCollection(String appGroupIdentity, String dataCollectionIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeDataCollectionWithOptions(appGroupIdentity, dataCollectionIdentity, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a rough sort expression for a version of an OpenSearch application.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveFirstRankResponse
     */
    public RemoveFirstRankResponse removeFirstRankWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveFirstRank"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/first-ranks/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveFirstRankResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a rough sort expression for a version of an OpenSearch application.</p>
     * @return RemoveFirstRankResponse
     */
    public RemoveFirstRankResponse removeFirstRank(String appGroupIdentity, String appId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeFirstRankWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an intervention dictionary.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveInterventionDictionaryResponse
     */
    public RemoveInterventionDictionaryResponse removeInterventionDictionaryWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveInterventionDictionary"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/intervention-dictionaries/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveInterventionDictionaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an intervention dictionary.</p>
     * @return RemoveInterventionDictionaryResponse
     */
    public RemoveInterventionDictionaryResponse removeInterventionDictionary(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeInterventionDictionaryWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a query analysis rule for an OpenSearch application version.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveQueryProcessorResponse
     */
    public RemoveQueryProcessorResponse removeQueryProcessorWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveQueryProcessor"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/query-processors/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveQueryProcessorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a query analysis rule for an OpenSearch application version.</p>
     * @return RemoveQueryProcessorResponse
     */
    public RemoveQueryProcessorResponse removeQueryProcessor(String appGroupIdentity, String appId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeQueryProcessorWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a scheduled task of an OpenSearch application.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveScheduledTaskResponse
     */
    public RemoveScheduledTaskResponse removeScheduledTaskWithOptions(String appGroupIdentity, String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveScheduledTask"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scheduled-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveScheduledTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a scheduled task of an OpenSearch application.</p>
     * @return RemoveScheduledTaskResponse
     */
    public RemoveScheduledTaskResponse removeScheduledTask(String appGroupIdentity, String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeScheduledTaskWithOptions(appGroupIdentity, taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a query policy.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveSearchStrategyResponse
     */
    public RemoveSearchStrategyResponse removeSearchStrategyWithOptions(String appGroupIdentity, String appId, String strategyName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveSearchStrategy"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/search-strategies/" + com.aliyun.openapiutil.Client.getEncodeParam(strategyName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveSearchStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a query policy.</p>
     * @return RemoveSearchStrategyResponse
     */
    public RemoveSearchStrategyResponse removeSearchStrategy(String appGroupIdentity, String appId, String strategyName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeSearchStrategyWithOptions(appGroupIdentity, appId, strategyName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a fine sort expression from a version of an OpenSearch application.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveSecondRankResponse
     */
    public RemoveSecondRankResponse removeSecondRankWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveSecondRank"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/second-ranks/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveSecondRankResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a fine sort expression from a version of an OpenSearch application.</p>
     * @return RemoveSecondRankResponse
     */
    public RemoveSecondRankResponse removeSecondRank(String appGroupIdentity, String appId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeSecondRankWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom analyzer.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUserAnalyzerResponse
     */
    public RemoveUserAnalyzerResponse removeUserAnalyzerWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUserAnalyzer"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/user-analyzers/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUserAnalyzerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom analyzer.</p>
     * @return RemoveUserAnalyzerResponse
     */
    public RemoveUserAnalyzerResponse removeUserAnalyzer(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeUserAnalyzerWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renews an application. This operation is not available now. You must renew an application in the OpenSearch console.</p>
     * 
     * @param request RenewAppGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewAppGroupResponse
     */
    public RenewAppGroupResponse renewAppGroupWithOptions(String appGroupIdentity, RenewAppGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewAppGroup"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/actions/renew"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewAppGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renews an application. This operation is not available now. You must renew an application in the OpenSearch console.</p>
     * 
     * @param request RenewAppGroupRequest
     * @return RenewAppGroupResponse
     */
    public RenewAppGroupResponse renewAppGroup(String appGroupIdentity, RenewAppGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renewAppGroupWithOptions(appGroupIdentity, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Converts a service-based application to an instance-based application.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReplaceAppGroupCommodityCodeResponse
     */
    public ReplaceAppGroupCommodityCodeResponse replaceAppGroupCommodityCodeWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceAppGroupCommodityCode"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/actions/to-instance-typed"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceAppGroupCommodityCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Converts a service-based application to an instance-based application.</p>
     * @return ReplaceAppGroupCommodityCodeResponse
     */
    public ReplaceAppGroupCommodityCodeResponse replaceAppGroupCommodityCode(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceAppGroupCommodityCodeWithOptions(appGroupIdentity, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads a sort script.</p>
     * 
     * @param request SaveSortScriptFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSortScriptFileResponse
     */
    public SaveSortScriptFileResponse saveSortScriptFileWithOptions(String appGroupIdentity, String scriptName, String appVersionId, String fileName, SaveSortScriptFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSortScriptFile"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appVersionId) + "/sort-scripts/" + com.aliyun.openapiutil.Client.getEncodeParam(scriptName) + "/files/src/" + com.aliyun.openapiutil.Client.getEncodeParam(fileName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSortScriptFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads a sort script.</p>
     * 
     * @param request SaveSortScriptFileRequest
     * @return SaveSortScriptFileResponse
     */
    public SaveSortScriptFileResponse saveSortScriptFile(String appGroupIdentity, String scriptName, String appVersionId, String fileName, SaveSortScriptFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveSortScriptFileWithOptions(appGroupIdentity, scriptName, appVersionId, fileName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>立即进行慢查询分析</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartSlowQueryAnalyzerResponse
     */
    public StartSlowQueryAnalyzerResponse startSlowQueryAnalyzerWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSlowQueryAnalyzer"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/optimizers/slow-query/actions/run"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSlowQueryAnalyzerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>立即进行慢查询分析</p>
     * @return StartSlowQueryAnalyzerResponse
     */
    public StartSlowQueryAnalyzerResponse startSlowQueryAnalyzer(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startSlowQueryAnalyzerWithOptions(appGroupIdentity, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to resources.</p>
     * 
     * @param request TagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/resource-tags"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to resources.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to unbind a custom analyzer from an Elasticsearch instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Unbinds a custom analyzer from an Elasticsearch instance.</p>
     * 
     * @param request UnbindESUserAnalyzerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindESUserAnalyzerResponse
     */
    public UnbindESUserAnalyzerResponse unbindESUserAnalyzerWithOptions(String appGroupIdentity, String esInstanceId, UnbindESUserAnalyzerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindESUserAnalyzer"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/es/" + com.aliyun.openapiutil.Client.getEncodeParam(esInstanceId) + "/actions/unbind-analyzer"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindESUserAnalyzerResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to unbind a custom analyzer from an Elasticsearch instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Unbinds a custom analyzer from an Elasticsearch instance.</p>
     * 
     * @param request UnbindESUserAnalyzerRequest
     * @return UnbindESUserAnalyzerResponse
     */
    public UnbindESUserAnalyzerResponse unbindESUserAnalyzer(String appGroupIdentity, String esInstanceId, UnbindESUserAnalyzerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindESUserAnalyzerWithOptions(appGroupIdentity, esInstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds an Elasticsearch instance from an OpenSearch application.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindEsInstanceResponse
     */
    public UnbindEsInstanceResponse unbindEsInstanceWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindEsInstance"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/actions/unbind-es-instance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindEsInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds an Elasticsearch instance from an OpenSearch application.</p>
     * @return UnbindEsInstanceResponse
     */
    public UnbindEsInstanceResponse unbindEsInstance(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindEsInstanceWithOptions(appGroupIdentity, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Remove tags from resources.</p>
     * 
     * @param tmpReq UntagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UntagResourcesShrinkRequest request = new UntagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceId)) {
            request.resourceIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceId, "resourceId", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagKey)) {
            request.tagKeyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagKey, "tagKey", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("all", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdShrink)) {
            query.put("resourceId", request.resourceIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyShrink)) {
            query.put("tagKey", request.tagKeyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/resource-tags"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Remove tags from resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the parameters of an A/B test.</p>
     * 
     * @param request UpdateABTestExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateABTestExperimentResponse
     */
    public UpdateABTestExperimentResponse updateABTestExperimentWithOptions(String appGroupIdentity, String sceneId, String groupId, String experimentId, UpdateABTestExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateABTestExperiment"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(experimentId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateABTestExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the parameters of an A/B test.</p>
     * 
     * @param request UpdateABTestExperimentRequest
     * @return UpdateABTestExperimentResponse
     */
    public UpdateABTestExperimentResponse updateABTestExperiment(String appGroupIdentity, String sceneId, String groupId, String experimentId, UpdateABTestExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABTestExperimentWithOptions(appGroupIdentity, sceneId, groupId, experimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies whitelists.</p>
     * 
     * @param request UpdateABTestFixedFlowDividersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateABTestFixedFlowDividersResponse
     */
    public UpdateABTestFixedFlowDividersResponse updateABTestFixedFlowDividersWithOptions(String appGroupIdentity, String sceneId, String groupId, String experimentId, UpdateABTestFixedFlowDividersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateABTestFixedFlowDividers"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(experimentId) + "/fixed-flow-dividers"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateABTestFixedFlowDividersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies whitelists.</p>
     * 
     * @param request UpdateABTestFixedFlowDividersRequest
     * @return UpdateABTestFixedFlowDividersResponse
     */
    public UpdateABTestFixedFlowDividersResponse updateABTestFixedFlowDividers(String appGroupIdentity, String sceneId, String groupId, String experimentId, UpdateABTestFixedFlowDividersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABTestFixedFlowDividersWithOptions(appGroupIdentity, sceneId, groupId, experimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a test group.</p>
     * 
     * @param request UpdateABTestGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateABTestGroupResponse
     */
    public UpdateABTestGroupResponse updateABTestGroupWithOptions(String appGroupIdentity, String sceneId, String groupId, UpdateABTestGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateABTestGroup"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateABTestGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a test group.</p>
     * 
     * @param request UpdateABTestGroupRequest
     * @return UpdateABTestGroupResponse
     */
    public UpdateABTestGroupResponse updateABTestGroup(String appGroupIdentity, String sceneId, String groupId, UpdateABTestGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABTestGroupWithOptions(appGroupIdentity, sceneId, groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an A/B test scenario.</p>
     * 
     * @param request UpdateABTestSceneRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateABTestSceneResponse
     */
    public UpdateABTestSceneResponse updateABTestSceneWithOptions(String appGroupIdentity, String sceneId, UpdateABTestSceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateABTestScene"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateABTestSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an A/B test scenario.</p>
     * 
     * @param request UpdateABTestSceneRequest
     * @return UpdateABTestSceneResponse
     */
    public UpdateABTestSceneResponse updateABTestScene(String appGroupIdentity, String sceneId, UpdateABTestSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABTestSceneWithOptions(appGroupIdentity, sceneId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates fetch fields. A dry run is supported.</p>
     * 
     * @param request UpdateFetchFieldsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFetchFieldsResponse
     */
    public UpdateFetchFieldsResponse updateFetchFieldsWithOptions(String appGroupIdentity, String appId, UpdateFetchFieldsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFetchFields"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/fetch-fields"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFetchFieldsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates fetch fields. A dry run is supported.</p>
     * 
     * @param request UpdateFetchFieldsRequest
     * @return UpdateFetchFieldsResponse
     */
    public UpdateFetchFieldsResponse updateFetchFields(String appGroupIdentity, String appId, UpdateFetchFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFetchFieldsWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the default algorithm instance used by the specified application. The new algorithm instance automatically overwrites the most recently set default instance. If no instance is set, the default instance is canceled.</p>
     * 
     * @param request UpdateFunctionDefaultInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFunctionDefaultInstanceResponse
     */
    public UpdateFunctionDefaultInstanceResponse updateFunctionDefaultInstanceWithOptions(String appGroupIdentity, String functionName, UpdateFunctionDefaultInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("instanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFunctionDefaultInstance"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/default-instance"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFunctionDefaultInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the default algorithm instance used by the specified application. The new algorithm instance automatically overwrites the most recently set default instance. If no instance is set, the default instance is canceled.</p>
     * 
     * @param request UpdateFunctionDefaultInstanceRequest
     * @return UpdateFunctionDefaultInstanceResponse
     */
    public UpdateFunctionDefaultInstanceResponse updateFunctionDefaultInstance(String appGroupIdentity, String functionName, UpdateFunctionDefaultInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFunctionDefaultInstanceWithOptions(appGroupIdentity, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an algorithm instance.</p>
     * 
     * @param request UpdateFunctionInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFunctionInstanceResponse
     */
    public UpdateFunctionInstanceResponse updateFunctionInstanceWithOptions(String appGroupIdentity, String functionName, String instanceName, UpdateFunctionInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createParameters)) {
            body.put("createParameters", request.createParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cron)) {
            body.put("cron", request.cron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usageParameters)) {
            body.put("usageParameters", request.usageParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFunctionInstance"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceName) + ""),
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
     * <p>Updates an algorithm instance.</p>
     * 
     * @param request UpdateFunctionInstanceRequest
     * @return UpdateFunctionInstanceResponse
     */
    public UpdateFunctionInstanceResponse updateFunctionInstance(String appGroupIdentity, String functionName, String instanceName, UpdateFunctionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFunctionInstanceWithOptions(appGroupIdentity, functionName, instanceName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to update the information about resources by resource name. You can modify only the values of data and description.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an algorithm resource.</p>
     * 
     * @param request UpdateFunctionResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFunctionResourceResponse
     */
    public UpdateFunctionResourceResponse updateFunctionResourceWithOptions(String appGroupIdentity, String functionName, String resourceName, UpdateFunctionResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFunctionResource"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(resourceName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFunctionResourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to update the information about resources by resource name. You can modify only the values of data and description.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an algorithm resource.</p>
     * 
     * @param request UpdateFunctionResourceRequest
     * @return UpdateFunctionResourceResponse
     */
    public UpdateFunctionResourceResponse updateFunctionResource(String appGroupIdentity, String functionName, String resourceName, UpdateFunctionResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFunctionResourceWithOptions(appGroupIdentity, functionName, resourceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a query policy.</p>
     * 
     * @param request UpdateSearchStrategyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSearchStrategyResponse
     */
    public UpdateSearchStrategyResponse updateSearchStrategyWithOptions(String appGroupIdentity, String appId, String strategyName, UpdateSearchStrategyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSearchStrategy"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/search-strategies/" + com.aliyun.openapiutil.Client.getEncodeParam(strategyName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSearchStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a query policy.</p>
     * 
     * @param request UpdateSearchStrategyRequest
     * @return UpdateSearchStrategyResponse
     */
    public UpdateSearchStrategyResponse updateSearchStrategy(String appGroupIdentity, String appId, String strategyName, UpdateSearchStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSearchStrategyWithOptions(appGroupIdentity, appId, strategyName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the description of a sort script.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description of a sort script.</p>
     * 
     * @param request UpdateSortScriptRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSortScriptResponse
     */
    public UpdateSortScriptResponse updateSortScriptWithOptions(String appGroupIdentity, String appVersionId, String scriptName, UpdateSortScriptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSortScript"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appVersionId) + "/sort-scripts/" + com.aliyun.openapiutil.Client.getEncodeParam(scriptName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSortScriptResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the description of a sort script.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description of a sort script.</p>
     * 
     * @param request UpdateSortScriptRequest
     * @return UpdateSortScriptResponse
     */
    public UpdateSortScriptResponse updateSortScript(String appGroupIdentity, String appVersionId, String scriptName, UpdateSortScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSortScriptWithOptions(appGroupIdentity, appVersionId, scriptName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates summaries. A dry run is supported.</p>
     * 
     * @param request UpdateSummariesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSummariesResponse
     */
    public UpdateSummariesResponse updateSummariesWithOptions(String appGroupIdentity, String appId, UpdateSummariesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSummaries"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/summaries"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSummariesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates summaries. A dry run is supported.</p>
     * 
     * @param request UpdateSummariesRequest
     * @return UpdateSummariesResponse
     */
    public UpdateSummariesResponse updateSummaries(String appGroupIdentity, String appId, UpdateSummariesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSummariesWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies data sources.</p>
     * 
     * @param request ValidateDataSourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateDataSourcesResponse
     */
    public ValidateDataSourcesResponse validateDataSourcesWithOptions(ValidateDataSourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateDataSources"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/assist/data-sources/validations"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateDataSourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies data sources.</p>
     * 
     * @param request ValidateDataSourcesRequest
     * @return ValidateDataSourcesResponse
     */
    public ValidateDataSourcesResponse validateDataSources(ValidateDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateDataSourcesWithOptions(request, headers, runtime);
    }
}

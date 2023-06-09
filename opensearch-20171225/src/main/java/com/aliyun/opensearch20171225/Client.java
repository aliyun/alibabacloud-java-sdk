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

    public BindESUserAnalyzerResponse bindESUserAnalyzer(String appGroupIdentity, String esInstanceId, BindESUserAnalyzerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindESUserAnalyzerWithOptions(appGroupIdentity, esInstanceId, request, headers, runtime);
    }

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

    public BindEsInstanceResponse bindEsInstance(String appGroupIdentity, BindEsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindEsInstanceWithOptions(appGroupIdentity, request, headers, runtime);
    }

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

    public CompileSortScriptResponse compileSortScript(String appGroupIdentity, String scriptName, String appVersionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.compileSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, headers, runtime);
    }

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

    public CreateABTestExperimentResponse createABTestExperiment(String appGroupIdentity, String sceneId, String groupId, CreateABTestExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createABTestExperimentWithOptions(appGroupIdentity, sceneId, groupId, request, headers, runtime);
    }

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

    public CreateABTestGroupResponse createABTestGroup(String appGroupIdentity, String sceneId, CreateABTestGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createABTestGroupWithOptions(appGroupIdentity, sceneId, request, headers, runtime);
    }

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

    public CreateABTestSceneResponse createABTestScene(String appGroupIdentity, CreateABTestSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createABTestSceneWithOptions(appGroupIdentity, request, headers, runtime);
    }

    /**
      * *   When you create a standard application, a new version of the application is created if the specified application name already exists.
      * *   When you create a version of an existing application, you must set the autoSwitch and realtimeShared parameters.
      * *   When you create a version of an existing application, the value of the quota parameter is the same as that of the quota parameter in the previous version of the application.
      * *   When you create a version of an existing application, the modification of the quota parameter does not take effect.
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
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
      * *   When you create a standard application, a new version of the application is created if the specified application name already exists.
      * *   When you create a version of an existing application, you must set the autoSwitch and realtimeShared parameters.
      * *   When you create a version of an existing application, the value of the quota parameter is the same as that of the quota parameter in the previous version of the application.
      * *   When you create a version of an existing application, the modification of the quota parameter does not take effect.
      *
      * @param request CreateAppRequest
      * @return CreateAppResponse
     */
    public CreateAppResponse createApp(String appGroupIdentity, CreateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public CreateAppGroupResponse createAppGroupWithOptions(CreateAppGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
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

    public CreateAppGroupResponse createAppGroup(CreateAppGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppGroupWithOptions(request, headers, runtime);
    }

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

    public CreateFirstRankResponse createFirstRank(String appGroupIdentity, String appId, CreateFirstRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFirstRankWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    /**
      * You can call the [GetFunctionCurrentVersion](~~421377~~) operation to query the latest version of the current feature. The response of the operation includes the createParameters parameter that is used to create an algorithm instance, the usageParameters parameter, and the requirements for setting these parameters.
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
      * You can call the [GetFunctionCurrentVersion](~~421377~~) operation to query the latest version of the current feature. The response of the operation includes the createParameters parameter that is used to create an algorithm instance, the usageParameters parameter, and the requirements for setting these parameters.
      *
      * @param request CreateFunctionInstanceRequest
      * @return CreateFunctionInstanceResponse
     */
    public CreateFunctionInstanceResponse createFunctionInstance(String appGroupIdentity, String functionName, CreateFunctionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFunctionInstanceWithOptions(appGroupIdentity, functionName, request, headers, runtime);
    }

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

    public CreateFunctionTaskResponse createFunctionTask(String appGroupIdentity, String functionName, String instanceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFunctionTaskWithOptions(appGroupIdentity, functionName, instanceName, headers, runtime);
    }

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

    public CreateInterventionDictionaryResponse createInterventionDictionary(CreateInterventionDictionaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInterventionDictionaryWithOptions(request, headers, runtime);
    }

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

    public CreateQueryProcessorResponse createQueryProcessor(String appGroupIdentity, String appId, CreateQueryProcessorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createQueryProcessorWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    /**
      * ****
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
      * ****
      *
      * @param request CreateScheduledTaskRequest
      * @return CreateScheduledTaskResponse
     */
    public CreateScheduledTaskResponse createScheduledTask(String appGroupIdentity, CreateScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createScheduledTaskWithOptions(appGroupIdentity, request, headers, runtime);
    }

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

    public CreateSearchStrategyResponse createSearchStrategy(String appGroupIdentity, String appId, CreateSearchStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSearchStrategyWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

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

    public CreateSecondRankResponse createSecondRank(String appGroupIdentity, String appId, CreateSecondRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSecondRankWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    public CreateSortScriptResponse createSortScriptWithOptions(String appGroupIdentity, String appVersionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
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

    public CreateSortScriptResponse createSortScript(String appGroupIdentity, String appVersionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSortScriptWithOptions(appGroupIdentity, appVersionId, headers, runtime);
    }

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

    public CreateUserAnalyzerResponse createUserAnalyzer(CreateUserAnalyzerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserAnalyzerWithOptions(request, headers, runtime);
    }

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

    public DeleteABTestExperimentResponse deleteABTestExperiment(String appGroupIdentity, String sceneId, String groupId, String experimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteABTestExperimentWithOptions(appGroupIdentity, sceneId, groupId, experimentId, headers, runtime);
    }

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

    public DeleteABTestGroupResponse deleteABTestGroup(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteABTestGroupWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

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

    public DeleteABTestSceneResponse deleteABTestScene(String appGroupIdentity, String sceneId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteABTestSceneWithOptions(appGroupIdentity, sceneId, headers, runtime);
    }

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

    public DeleteFunctionInstanceResponse deleteFunctionInstance(String appGroupIdentity, String functionName, String instanceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFunctionInstanceWithOptions(appGroupIdentity, functionName, instanceName, headers, runtime);
    }

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

    public DeleteFunctionTaskResponse deleteFunctionTask(String appGroupIdentity, String functionName, String instanceName, String generation) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFunctionTaskWithOptions(appGroupIdentity, functionName, instanceName, generation, headers, runtime);
    }

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

    public DeleteSortScriptResponse deleteSortScript(String appGroupIdentity, String scriptName, String appVersionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, headers, runtime);
    }

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

    public DeleteSortScriptFileResponse deleteSortScriptFile(String appGroupIdentity, String appVersionId, String scriptName, String fileName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSortScriptFileWithOptions(appGroupIdentity, appVersionId, scriptName, fileName, headers, runtime);
    }

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

    public DescribeABTestExperimentResponse describeABTestExperiment(String appGroupIdentity, String sceneId, String groupId, String experimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeABTestExperimentWithOptions(appGroupIdentity, sceneId, groupId, experimentId, headers, runtime);
    }

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

    public DescribeABTestGroupResponse describeABTestGroup(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeABTestGroupWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

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

    public DescribeABTestSceneResponse describeABTestScene(String appGroupIdentity, String sceneId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeABTestSceneWithOptions(appGroupIdentity, sceneId, headers, runtime);
    }

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

    public DescribeAppResponse describeApp(String appGroupIdentity, String appId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppWithOptions(appGroupIdentity, appId, headers, runtime);
    }

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

    public DescribeAppGroupResponse describeAppGroup(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppGroupWithOptions(appGroupIdentity, headers, runtime);
    }

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

    public DescribeAppStatisticsResponse describeAppStatistics(String appGroupIdentity, String appId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppStatisticsWithOptions(appGroupIdentity, appId, headers, runtime);
    }

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

    public DescribeAppsResponse describeApps(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppsWithOptions(appGroupIdentity, headers, runtime);
    }

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

    public DescribeDataCollctionResponse describeDataCollction(String appGroupIdentity, String dataCollectionIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDataCollctionWithOptions(appGroupIdentity, dataCollectionIdentity, headers, runtime);
    }

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

    public DescribeFirstRankResponse describeFirstRank(String appGroupIdentity, String appId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeFirstRankWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

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

    public DescribeInterventionDictionaryResponse describeInterventionDictionary(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInterventionDictionaryWithOptions(name, headers, runtime);
    }

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

    public DescribeQueryProcessorResponse describeQueryProcessor(String appGroupIdentity, String appId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQueryProcessorWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    public DescribeRegionResponse describeRegionWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegion"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/region"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionResponse());
    }

    public DescribeRegionResponse describeRegion() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionWithOptions(headers, runtime);
    }

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

    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(headers, runtime);
    }

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

    public DescribeScheduledTaskResponse describeScheduledTask(String appGroupIdentity, String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeScheduledTaskWithOptions(appGroupIdentity, taskId, headers, runtime);
    }

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

    public DescribeSecondRankResponse describeSecondRank(String appGroupIdentity, String appId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSecondRankWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

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

    public DescribeSlowQueryStatusResponse describeSlowQueryStatus(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSlowQueryStatusWithOptions(appGroupIdentity, headers, runtime);
    }

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

    public DescribeUserAnalyzerResponse describeUserAnalyzer(String name, DescribeUserAnalyzerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUserAnalyzerWithOptions(name, request, headers, runtime);
    }

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

    public DisableSlowQueryResponse disableSlowQuery(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableSlowQueryWithOptions(appGroupIdentity, headers, runtime);
    }

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

    public EnableSlowQueryResponse enableSlowQuery(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSlowQueryWithOptions(appGroupIdentity, headers, runtime);
    }

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

    public GenerateMergedTableResponse generateMergedTable(GenerateMergedTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateMergedTableWithOptions(request, headers, runtime);
    }

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

    public GetDomainResponse getDomain(String domainName, GetDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDomainWithOptions(domainName, request, headers, runtime);
    }

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

    public GetFunctionCurrentVersionResponse getFunctionCurrentVersion(String functionName, GetFunctionCurrentVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionCurrentVersionWithOptions(functionName, request, headers, runtime);
    }

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

    public GetFunctionDefaultInstanceResponse getFunctionDefaultInstance(String appGroupIdentity, String functionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionDefaultInstanceWithOptions(appGroupIdentity, functionName, headers, runtime);
    }

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

    public GetFunctionInstanceResponse getFunctionInstance(String appGroupIdentity, String functionName, String instanceName, GetFunctionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionInstanceWithOptions(appGroupIdentity, functionName, instanceName, request, headers, runtime);
    }

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

    public GetFunctionTaskResponse getFunctionTask(String appGroupIdentity, String functionName, String instanceName, String generation) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionTaskWithOptions(appGroupIdentity, functionName, instanceName, generation, headers, runtime);
    }

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

    public GetFunctionVersionResponse getFunctionVersion(String functionName, String versionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionVersionWithOptions(functionName, versionId, headers, runtime);
    }

    public GetModelReportResponse getModelReportWithOptions(String appGroupIdentity, String modelName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModelReport"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/algorithm/models/" + com.aliyun.openapiutil.Client.getEncodeParam(modelName) + "/report"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelReportResponse());
    }

    public GetModelReportResponse getModelReport(String appGroupIdentity, String modelName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelReportWithOptions(appGroupIdentity, modelName, headers, runtime);
    }

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

    public GetScriptFileNamesResponse getScriptFileNames(String appGroupIdentity, String appVersionId, String scriptName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getScriptFileNamesWithOptions(appGroupIdentity, appVersionId, scriptName, headers, runtime);
    }

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

    public GetSearchStrategyResponse getSearchStrategy(String appGroupIdentity, String appId, String strategyName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSearchStrategyWithOptions(appGroupIdentity, appId, strategyName, headers, runtime);
    }

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

    public GetSortScriptResponse getSortScript(String appGroupIdentity, String scriptName, String appVersionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, headers, runtime);
    }

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

    public GetSortScriptFileResponse getSortScriptFile(String appGroupIdentity, String scriptName, String appVersionId, String fileName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSortScriptFileWithOptions(appGroupIdentity, scriptName, appVersionId, fileName, headers, runtime);
    }

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

    public ListABTestExperimentsResponse listABTestExperiments(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestExperimentsWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

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

    public ListABTestFixedFlowDividersResponse listABTestFixedFlowDividers(String appGroupIdentity, String sceneId, String groupId, String experimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestFixedFlowDividersWithOptions(appGroupIdentity, sceneId, groupId, experimentId, headers, runtime);
    }

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

    public ListABTestGroupsResponse listABTestGroups(String appGroupIdentity, String sceneId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestGroupsWithOptions(appGroupIdentity, sceneId, headers, runtime);
    }

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

    public ListABTestScenesResponse listABTestScenes(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestScenesWithOptions(appGroupIdentity, headers, runtime);
    }

    /**
      * *   This operation allows you to query applications by application name, instance ID, and application type.
      * *   This operation can sort the applications based on their creation time.
      * *   This operation supports the parameters for paging.
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
      * *   This operation allows you to query applications by application name, instance ID, and application type.
      * *   This operation can sort the applications based on their creation time.
      * *   This operation supports the parameters for paging.
      *
      * @param request ListAppGroupsRequest
      * @return ListAppGroupsResponse
     */
    public ListAppGroupsResponse listAppGroups(ListAppGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppGroupsWithOptions(request, headers, runtime);
    }

    public ListAppsResponse listAppsWithOptions(ListAppsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApps"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/apps"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppsResponse());
    }

    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppsWithOptions(request, headers, runtime);
    }

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

    public ListDataCollectionsResponse listDataCollections(String appGroupIdentity, ListDataCollectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataCollectionsWithOptions(appGroupIdentity, request, headers, runtime);
    }

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

    public ListDataSourceTableFieldsResponse listDataSourceTableFields(String dataSourceType, ListDataSourceTableFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourceTableFieldsWithOptions(dataSourceType, request, headers, runtime);
    }

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

    public ListDataSourceTablesResponse listDataSourceTables(String dataSourceType, ListDataSourceTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourceTablesWithOptions(dataSourceType, request, headers, runtime);
    }

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

    public ListFirstRanksResponse listFirstRanks(String appGroupIdentity, String appId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFirstRanksWithOptions(appGroupIdentity, appId, headers, runtime);
    }

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

    public ListFunctionInstancesResponse listFunctionInstances(String appGroupIdentity, String functionName, ListFunctionInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionInstancesWithOptions(appGroupIdentity, functionName, request, headers, runtime);
    }

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

    public ListFunctionTasksResponse listFunctionTasks(String appGroupIdentity, String functionName, String instanceName, ListFunctionTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionTasksWithOptions(appGroupIdentity, functionName, instanceName, request, headers, runtime);
    }

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

    public ListInterventionDictionariesResponse listInterventionDictionaries(ListInterventionDictionariesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInterventionDictionariesWithOptions(request, headers, runtime);
    }

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

    public ListInterventionDictionaryEntriesResponse listInterventionDictionaryEntries(String name, ListInterventionDictionaryEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInterventionDictionaryEntriesWithOptions(name, request, headers, runtime);
    }

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

    public ListInterventionDictionaryNerResultsResponse listInterventionDictionaryNerResults(String name, ListInterventionDictionaryNerResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInterventionDictionaryNerResultsWithOptions(name, request, headers, runtime);
    }

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

    public ListInterventionDictionaryRelatedEntitiesResponse listInterventionDictionaryRelatedEntities(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInterventionDictionaryRelatedEntitiesWithOptions(name, headers, runtime);
    }

    public ListModelsResponse listModelsWithOptions(String appGroupIdentity, ListModelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListModels"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/algorithm/models"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelsResponse());
    }

    public ListModelsResponse listModels(String appGroupIdentity, ListModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModelsWithOptions(appGroupIdentity, request, headers, runtime);
    }

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

    public ListProceedingsResponse listProceedings(String appGroupIdentity, ListProceedingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProceedingsWithOptions(appGroupIdentity, request, headers, runtime);
    }

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

    public ListQueryProcessorAnalyzerResultsResponse listQueryProcessorAnalyzerResults(String appGroupIdentity, String appId, String name, ListQueryProcessorAnalyzerResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQueryProcessorAnalyzerResultsWithOptions(appGroupIdentity, appId, name, request, headers, runtime);
    }

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

    public ListQueryProcessorNersResponse listQueryProcessorNers(ListQueryProcessorNersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQueryProcessorNersWithOptions(request, headers, runtime);
    }

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

    public ListQueryProcessorsResponse listQueryProcessors(String appGroupIdentity, String appId, ListQueryProcessorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQueryProcessorsWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

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

    public ListQuotaReviewTasksResponse listQuotaReviewTasks(String appGroupIdentity, ListQuotaReviewTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQuotaReviewTasksWithOptions(appGroupIdentity, request, headers, runtime);
    }

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

    public ListScheduledTasksResponse listScheduledTasks(String appGroupIdentity, ListScheduledTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listScheduledTasksWithOptions(appGroupIdentity, request, headers, runtime);
    }

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

    public ListSearchStrategiesResponse listSearchStrategies(String appGroupIdentity, String appId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSearchStrategiesWithOptions(appGroupIdentity, appId, headers, runtime);
    }

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

    public ListSecondRanksResponse listSecondRanks(String appGroupIdentity, String appId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSecondRanksWithOptions(appGroupIdentity, appId, headers, runtime);
    }

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

    public ListSlowQueryCategoriesResponse listSlowQueryCategories(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSlowQueryCategoriesWithOptions(appGroupIdentity, headers, runtime);
    }

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

    public ListSlowQueryQueriesResponse listSlowQueryQueries(String appGroupIdentity, String categoryIndex) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSlowQueryQueriesWithOptions(appGroupIdentity, categoryIndex, headers, runtime);
    }

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

    public ListSortExpressionsResponse listSortExpressions(String appGroupIdentity, String appId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSortExpressionsWithOptions(appGroupIdentity, appId, headers, runtime);
    }

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

    public ListSortScriptsResponse listSortScripts(String appGroupIdentity, String appVersionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSortScriptsWithOptions(appGroupIdentity, appVersionId, headers, runtime);
    }

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

    public ListStatisticLogsResponse listStatisticLogs(String appGroupIdentity, String moduleName, ListStatisticLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStatisticLogsWithOptions(appGroupIdentity, moduleName, request, headers, runtime);
    }

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

    public ListStatisticReportResponse listStatisticReport(String appGroupIdentity, String moduleName, ListStatisticReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStatisticReportWithOptions(appGroupIdentity, moduleName, request, headers, runtime);
    }

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

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagResourcesWithOptions(request, headers, runtime);
    }

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

    public ListUserAnalyzerEntriesResponse listUserAnalyzerEntries(String name, ListUserAnalyzerEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserAnalyzerEntriesWithOptions(name, request, headers, runtime);
    }

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

    public ListUserAnalyzersResponse listUserAnalyzers(ListUserAnalyzersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserAnalyzersWithOptions(request, headers, runtime);
    }

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

    public ModifyAppGroupResponse modifyAppGroup(String appGroupIdentity, ModifyAppGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyAppGroupWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public ModifyAppGroupQuotaResponse modifyAppGroupQuotaWithOptions(String appGroupIdentity, ModifyAppGroupQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

    public ModifyAppGroupQuotaResponse modifyAppGroupQuota(String appGroupIdentity, ModifyAppGroupQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyAppGroupQuotaWithOptions(appGroupIdentity, request, headers, runtime);
    }

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

    public ModifyFirstRankResponse modifyFirstRank(String appGroupIdentity, String appId, String name, ModifyFirstRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyFirstRankWithOptions(appGroupIdentity, appId, name, request, headers, runtime);
    }

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

    public ModifyQueryProcessorResponse modifyQueryProcessor(String appGroupIdentity, String appId, String name, ModifyQueryProcessorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyQueryProcessorWithOptions(appGroupIdentity, appId, name, request, headers, runtime);
    }

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

    public ModifyScheduledTaskResponse modifyScheduledTask(String appGroupIdentity, String taskId, ModifyScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyScheduledTaskWithOptions(appGroupIdentity, taskId, request, headers, runtime);
    }

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

    public ModifySecondRankResponse modifySecondRank(String appGroupIdentity, String appId, String name, ModifySecondRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifySecondRankWithOptions(appGroupIdentity, appId, name, request, headers, runtime);
    }

    public PreviewModelResponse previewModelWithOptions(String appGroupIdentity, String modelName, PreviewModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "PreviewModel"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/algorithm/models/" + com.aliyun.openapiutil.Client.getEncodeParam(modelName) + "/actions/preview"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreviewModelResponse());
    }

    public PreviewModelResponse previewModel(String appGroupIdentity, String modelName, PreviewModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewModelWithOptions(appGroupIdentity, modelName, request, headers, runtime);
    }

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

    public PushInterventionDictionaryEntriesResponse pushInterventionDictionaryEntries(String name, PushInterventionDictionaryEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushInterventionDictionaryEntriesWithOptions(name, request, headers, runtime);
    }

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

    public PushUserAnalyzerEntriesResponse pushUserAnalyzerEntries(String name, PushUserAnalyzerEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushUserAnalyzerEntriesWithOptions(name, request, headers, runtime);
    }

    public RankPreviewQueryResponse rankPreviewQueryWithOptions(String appGroupIdentity, String modelName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RankPreviewQuery"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity) + "/algorithm/models/" + com.aliyun.openapiutil.Client.getEncodeParam(modelName) + "/actions/query-rank"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RankPreviewQueryResponse());
    }

    public RankPreviewQueryResponse rankPreviewQuery(String appGroupIdentity, String modelName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rankPreviewQueryWithOptions(appGroupIdentity, modelName, headers, runtime);
    }

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

    public ReleaseSortScriptResponse releaseSortScript(String appGroupIdentity, String scriptName, String appVersionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, headers, runtime);
    }

    /**
      * > If an application has two versions, you can delete only the offline version.
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
      * > If an application has two versions, you can delete only the offline version.
      *
      * @return RemoveAppResponse
     */
    public RemoveAppResponse removeApp(String appGroupIdentity, String appId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeAppWithOptions(appGroupIdentity, appId, headers, runtime);
    }

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

    public RemoveAppGroupResponse removeAppGroup(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeAppGroupWithOptions(appGroupIdentity, headers, runtime);
    }

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

    public RemoveDataCollectionResponse removeDataCollection(String appGroupIdentity, String dataCollectionIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeDataCollectionWithOptions(appGroupIdentity, dataCollectionIdentity, headers, runtime);
    }

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

    public RemoveFirstRankResponse removeFirstRank(String appGroupIdentity, String appId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeFirstRankWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

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

    public RemoveInterventionDictionaryResponse removeInterventionDictionary(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeInterventionDictionaryWithOptions(name, headers, runtime);
    }

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

    public RemoveQueryProcessorResponse removeQueryProcessor(String appGroupIdentity, String appId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeQueryProcessorWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

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

    public RemoveScheduledTaskResponse removeScheduledTask(String appGroupIdentity, String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeScheduledTaskWithOptions(appGroupIdentity, taskId, headers, runtime);
    }

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

    public RemoveSearchStrategyResponse removeSearchStrategy(String appGroupIdentity, String appId, String strategyName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeSearchStrategyWithOptions(appGroupIdentity, appId, strategyName, headers, runtime);
    }

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

    public RemoveSecondRankResponse removeSecondRank(String appGroupIdentity, String appId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeSecondRankWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

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

    public RemoveUserAnalyzerResponse removeUserAnalyzer(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeUserAnalyzerWithOptions(name, headers, runtime);
    }

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

    public RenewAppGroupResponse renewAppGroup(String appGroupIdentity, RenewAppGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renewAppGroupWithOptions(appGroupIdentity, request, headers, runtime);
    }

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

    public ReplaceAppGroupCommodityCodeResponse replaceAppGroupCommodityCode(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceAppGroupCommodityCodeWithOptions(appGroupIdentity, headers, runtime);
    }

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

    public SaveSortScriptFileResponse saveSortScriptFile(String appGroupIdentity, String scriptName, String appVersionId, String fileName, SaveSortScriptFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveSortScriptFileWithOptions(appGroupIdentity, scriptName, appVersionId, fileName, request, headers, runtime);
    }

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

    public StartSlowQueryAnalyzerResponse startSlowQueryAnalyzer(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startSlowQueryAnalyzerWithOptions(appGroupIdentity, headers, runtime);
    }

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

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourcesWithOptions(request, headers, runtime);
    }

    /**
      * The ID of the request.
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
      * The ID of the request.
      *
      * @param request UnbindESUserAnalyzerRequest
      * @return UnbindESUserAnalyzerResponse
     */
    public UnbindESUserAnalyzerResponse unbindESUserAnalyzer(String appGroupIdentity, String esInstanceId, UnbindESUserAnalyzerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindESUserAnalyzerWithOptions(appGroupIdentity, esInstanceId, request, headers, runtime);
    }

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

    public UnbindEsInstanceResponse unbindEsInstance(String appGroupIdentity) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindEsInstanceWithOptions(appGroupIdentity, headers, runtime);
    }

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

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourcesWithOptions(request, headers, runtime);
    }

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

    public UpdateABTestExperimentResponse updateABTestExperiment(String appGroupIdentity, String sceneId, String groupId, String experimentId, UpdateABTestExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABTestExperimentWithOptions(appGroupIdentity, sceneId, groupId, experimentId, request, headers, runtime);
    }

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

    public UpdateABTestFixedFlowDividersResponse updateABTestFixedFlowDividers(String appGroupIdentity, String sceneId, String groupId, String experimentId, UpdateABTestFixedFlowDividersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABTestFixedFlowDividersWithOptions(appGroupIdentity, sceneId, groupId, experimentId, request, headers, runtime);
    }

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

    public UpdateABTestGroupResponse updateABTestGroup(String appGroupIdentity, String sceneId, String groupId, UpdateABTestGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABTestGroupWithOptions(appGroupIdentity, sceneId, groupId, request, headers, runtime);
    }

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

    public UpdateABTestSceneResponse updateABTestScene(String appGroupIdentity, String sceneId, UpdateABTestSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABTestSceneWithOptions(appGroupIdentity, sceneId, request, headers, runtime);
    }

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

    public UpdateFetchFieldsResponse updateFetchFields(String appGroupIdentity, String appId, UpdateFetchFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFetchFieldsWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

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

    public UpdateFunctionDefaultInstanceResponse updateFunctionDefaultInstance(String appGroupIdentity, String functionName, UpdateFunctionDefaultInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFunctionDefaultInstanceWithOptions(appGroupIdentity, functionName, request, headers, runtime);
    }

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

    public UpdateFunctionInstanceResponse updateFunctionInstance(String appGroupIdentity, String functionName, String instanceName, UpdateFunctionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFunctionInstanceWithOptions(appGroupIdentity, functionName, instanceName, request, headers, runtime);
    }

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

    public UpdateSearchStrategyResponse updateSearchStrategy(String appGroupIdentity, String appId, String strategyName, UpdateSearchStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSearchStrategyWithOptions(appGroupIdentity, appId, strategyName, request, headers, runtime);
    }

    /**
      * You can call this operation to modify the description of a sort script.
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateSortScriptResponse
     */
    public UpdateSortScriptResponse updateSortScriptWithOptions(String appGroupIdentity, String appVersionId, String scriptName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
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
      * You can call this operation to modify the description of a sort script.
      *
      * @return UpdateSortScriptResponse
     */
    public UpdateSortScriptResponse updateSortScript(String appGroupIdentity, String appVersionId, String scriptName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSortScriptWithOptions(appGroupIdentity, appVersionId, scriptName, headers, runtime);
    }

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

    public UpdateSummariesResponse updateSummaries(String appGroupIdentity, String appId, UpdateSummariesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSummariesWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

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

    public ValidateDataSourcesResponse validateDataSources(ValidateDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateDataSourcesWithOptions(request, headers, runtime);
    }
}

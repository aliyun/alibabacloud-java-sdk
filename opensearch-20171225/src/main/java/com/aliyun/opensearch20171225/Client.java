// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225;

import com.aliyun.tea.*;
import com.aliyun.opensearch20171225.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
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

    public BindESUserAnalyzerResponse bindESUserAnalyzer(String appGroupIdentity, String esInstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindESUserAnalyzerWithOptions(appGroupIdentity, esInstanceId, headers, runtime);
    }

    public BindESUserAnalyzerResponse bindESUserAnalyzerWithOptions(String appGroupIdentity, String esInstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        esInstanceId = com.aliyun.openapiutil.Client.getEncodeParam(esInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindESUserAnalyzer"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/es/" + esInstanceId + "/actions/bind-analyzer"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindESUserAnalyzerResponse());
    }

    public BindEsInstanceResponse bindEsInstance(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindEsInstanceWithOptions(appGroupIdentity, headers, runtime);
    }

    public BindEsInstanceResponse bindEsInstanceWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindEsInstance"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/actions/bind-es-instance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindEsInstanceResponse());
    }

    public CompileSortScriptResponse compileSortScript(String appGroupIdentity, String scriptName, String appVersionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.compileSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, headers, runtime);
    }

    public CompileSortScriptResponse compileSortScriptWithOptions(String appGroupIdentity, String scriptName, String appVersionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        scriptName = com.aliyun.openapiutil.Client.getEncodeParam(scriptName);
        appVersionId = com.aliyun.openapiutil.Client.getEncodeParam(appVersionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompileSortScript"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts/" + scriptName + "/actions/compiling"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompileSortScriptResponse());
    }

    public CreateABTestExperimentResponse createABTestExperiment(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createABTestExperimentWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

    public CreateABTestExperimentResponse createABTestExperimentWithOptions(String appGroupIdentity, String sceneId, String groupId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        sceneId = com.aliyun.openapiutil.Client.getEncodeParam(sceneId);
        groupId = com.aliyun.openapiutil.Client.getEncodeParam(groupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateABTestExperiment"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/" + sceneId + "/groups/" + groupId + "/experiments"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateABTestExperimentResponse());
    }

    public CreateABTestGroupResponse createABTestGroup(String appGroupIdentity, String sceneId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createABTestGroupWithOptions(appGroupIdentity, sceneId, headers, runtime);
    }

    public CreateABTestGroupResponse createABTestGroupWithOptions(String appGroupIdentity, String sceneId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        sceneId = com.aliyun.openapiutil.Client.getEncodeParam(sceneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateABTestGroup"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/" + sceneId + "/groups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateABTestGroupResponse());
    }

    public CreateABTestSceneResponse createABTestScene(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createABTestSceneWithOptions(appGroupIdentity, headers, runtime);
    }

    public CreateABTestSceneResponse createABTestSceneWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateABTestScene"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateABTestSceneResponse());
    }

    public CreateAppResponse createApp(String appGroupIdentity, CreateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public CreateAppResponse createAppWithOptions(String appGroupIdentity, CreateAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApp"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppResponse());
    }

    public CreateAppGroupResponse createAppGroup() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppGroupWithOptions(headers, runtime);
    }

    public CreateAppGroupResponse createAppGroupWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateDataCollectionResponse createDataCollection(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataCollectionWithOptions(appGroupIdentity, headers, runtime);
    }

    public CreateDataCollectionResponse createDataCollectionWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataCollection"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/data-collections"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataCollectionResponse());
    }

    public CreateFirstRankResponse createFirstRank(String appGroupIdentity, String appId, CreateFirstRankRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFirstRankWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    public CreateFirstRankResponse createFirstRankWithOptions(String appGroupIdentity, String appId, CreateFirstRankRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFirstRank"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/first-ranks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFirstRankResponse());
    }

    public CreateFunctionInstanceResponse createFunctionInstance(String appGroupIdentity, String functionName, CreateFunctionInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFunctionInstanceWithOptions(appGroupIdentity, functionName, request, headers, runtime);
    }

    public CreateFunctionInstanceResponse createFunctionInstanceWithOptions(String appGroupIdentity, String functionName, CreateFunctionInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFunctionInstance"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/functions/" + functionName + "/instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFunctionInstanceResponse());
    }

    public CreateFunctionTaskResponse createFunctionTask(String appGroupIdentity, String functionName, String instanceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFunctionTaskWithOptions(appGroupIdentity, functionName, instanceName, headers, runtime);
    }

    public CreateFunctionTaskResponse createFunctionTaskWithOptions(String appGroupIdentity, String functionName, String instanceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        instanceName = com.aliyun.openapiutil.Client.getEncodeParam(instanceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFunctionTask"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/functions/" + functionName + "/instances/" + instanceName + "/tasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFunctionTaskResponse());
    }

    public CreateInterventionDictionaryResponse createInterventionDictionary() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInterventionDictionaryWithOptions(headers, runtime);
    }

    public CreateInterventionDictionaryResponse createInterventionDictionaryWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateModelResponse createModel(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModelWithOptions(appGroupIdentity, headers, runtime);
    }

    public CreateModelResponse createModelWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModel"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelResponse());
    }

    public CreateQueryProcessorResponse createQueryProcessor(String appGroupIdentity, String appId, CreateQueryProcessorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createQueryProcessorWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    public CreateQueryProcessorResponse createQueryProcessorWithOptions(String appGroupIdentity, String appId, CreateQueryProcessorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQueryProcessor"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/query-processors"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQueryProcessorResponse());
    }

    public CreateScheduledTaskResponse createScheduledTask(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createScheduledTaskWithOptions(appGroupIdentity, headers, runtime);
    }

    public CreateScheduledTaskResponse createScheduledTaskWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScheduledTask"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scheduled-tasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScheduledTaskResponse());
    }

    public CreateSearchStrategyResponse createSearchStrategy(String appGroupIdentity, String appId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSearchStrategyWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    public CreateSearchStrategyResponse createSearchStrategyWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSearchStrategy"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/search-strategies"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSearchStrategyResponse());
    }

    public CreateSecondRankResponse createSecondRank(String appGroupIdentity, String appId, CreateSecondRankRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSecondRankWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    public CreateSecondRankResponse createSecondRankWithOptions(String appGroupIdentity, String appId, CreateSecondRankRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSecondRank"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/second-ranks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecondRankResponse());
    }

    public CreateSortScriptResponse createSortScript(String appGroupIdentity, String appVersionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSortScriptWithOptions(appGroupIdentity, appVersionId, headers, runtime);
    }

    public CreateSortScriptResponse createSortScriptWithOptions(String appGroupIdentity, String appVersionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appVersionId = com.aliyun.openapiutil.Client.getEncodeParam(appVersionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSortScript"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSortScriptResponse());
    }

    public CreateUserAnalyzerResponse createUserAnalyzer() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserAnalyzerWithOptions(headers, runtime);
    }

    public CreateUserAnalyzerResponse createUserAnalyzerWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteABTestExperimentResponse deleteABTestExperiment(String appGroupIdentity, String sceneId, String groupId, String experimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteABTestExperimentWithOptions(appGroupIdentity, sceneId, groupId, experimentId, headers, runtime);
    }

    public DeleteABTestExperimentResponse deleteABTestExperimentWithOptions(String appGroupIdentity, String sceneId, String groupId, String experimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        sceneId = com.aliyun.openapiutil.Client.getEncodeParam(sceneId);
        groupId = com.aliyun.openapiutil.Client.getEncodeParam(groupId);
        experimentId = com.aliyun.openapiutil.Client.getEncodeParam(experimentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteABTestExperiment"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/" + sceneId + "/groups/" + groupId + "/experiments/" + experimentId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteABTestExperimentResponse());
    }

    public DeleteABTestGroupResponse deleteABTestGroup(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteABTestGroupWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

    public DeleteABTestGroupResponse deleteABTestGroupWithOptions(String appGroupIdentity, String sceneId, String groupId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        sceneId = com.aliyun.openapiutil.Client.getEncodeParam(sceneId);
        groupId = com.aliyun.openapiutil.Client.getEncodeParam(groupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteABTestGroup"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/" + sceneId + "/groups/" + groupId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteABTestGroupResponse());
    }

    public DeleteABTestSceneResponse deleteABTestScene(String appGroupIdentity, String sceneId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteABTestSceneWithOptions(appGroupIdentity, sceneId, headers, runtime);
    }

    public DeleteABTestSceneResponse deleteABTestSceneWithOptions(String appGroupIdentity, String sceneId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        sceneId = com.aliyun.openapiutil.Client.getEncodeParam(sceneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteABTestScene"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/" + sceneId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteABTestSceneResponse());
    }

    public DeleteFunctionInstanceResponse deleteFunctionInstance(String appGroupIdentity, String functionName, String instanceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFunctionInstanceWithOptions(appGroupIdentity, functionName, instanceName, headers, runtime);
    }

    public DeleteFunctionInstanceResponse deleteFunctionInstanceWithOptions(String appGroupIdentity, String functionName, String instanceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        instanceName = com.aliyun.openapiutil.Client.getEncodeParam(instanceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFunctionInstance"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/functions/" + functionName + "/instances/" + instanceName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFunctionInstanceResponse());
    }

    public DeleteModelResponse deleteModel(String appGroupIdentity, String modelName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelWithOptions(appGroupIdentity, modelName, headers, runtime);
    }

    public DeleteModelResponse deleteModelWithOptions(String appGroupIdentity, String modelName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        modelName = com.aliyun.openapiutil.Client.getEncodeParam(modelName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModel"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models/" + modelName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelResponse());
    }

    public DeleteSortScriptResponse deleteSortScript(String appGroupIdentity, String scriptName, String appVersionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, headers, runtime);
    }

    public DeleteSortScriptResponse deleteSortScriptWithOptions(String appGroupIdentity, String scriptName, String appVersionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        scriptName = com.aliyun.openapiutil.Client.getEncodeParam(scriptName);
        appVersionId = com.aliyun.openapiutil.Client.getEncodeParam(appVersionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSortScript"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts/" + scriptName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSortScriptResponse());
    }

    public DeleteSortScriptFileResponse deleteSortScriptFile(String appGroupIdentity, String appVersionId, String scriptName, String fileName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSortScriptFileWithOptions(appGroupIdentity, appVersionId, scriptName, fileName, headers, runtime);
    }

    public DeleteSortScriptFileResponse deleteSortScriptFileWithOptions(String appGroupIdentity, String appVersionId, String scriptName, String fileName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appVersionId = com.aliyun.openapiutil.Client.getEncodeParam(appVersionId);
        scriptName = com.aliyun.openapiutil.Client.getEncodeParam(scriptName);
        fileName = com.aliyun.openapiutil.Client.getEncodeParam(fileName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSortScriptFile"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts/" + scriptName + "/files/src/" + fileName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSortScriptFileResponse());
    }

    public DescribeABTestExperimentResponse describeABTestExperiment(String appGroupIdentity, String sceneId, String groupId, String experimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeABTestExperimentWithOptions(appGroupIdentity, sceneId, groupId, experimentId, headers, runtime);
    }

    public DescribeABTestExperimentResponse describeABTestExperimentWithOptions(String appGroupIdentity, String sceneId, String groupId, String experimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        sceneId = com.aliyun.openapiutil.Client.getEncodeParam(sceneId);
        groupId = com.aliyun.openapiutil.Client.getEncodeParam(groupId);
        experimentId = com.aliyun.openapiutil.Client.getEncodeParam(experimentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeABTestExperiment"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/" + sceneId + "/groups/" + groupId + "/experiments/" + experimentId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeABTestExperimentResponse());
    }

    public DescribeABTestGroupResponse describeABTestGroup(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeABTestGroupWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

    public DescribeABTestGroupResponse describeABTestGroupWithOptions(String appGroupIdentity, String sceneId, String groupId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        sceneId = com.aliyun.openapiutil.Client.getEncodeParam(sceneId);
        groupId = com.aliyun.openapiutil.Client.getEncodeParam(groupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeABTestGroup"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/" + sceneId + "/groups/" + groupId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeABTestGroupResponse());
    }

    public DescribeABTestSceneResponse describeABTestScene(String appGroupIdentity, String sceneId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeABTestSceneWithOptions(appGroupIdentity, sceneId, headers, runtime);
    }

    public DescribeABTestSceneResponse describeABTestSceneWithOptions(String appGroupIdentity, String sceneId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        sceneId = com.aliyun.openapiutil.Client.getEncodeParam(sceneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeABTestScene"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/" + sceneId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeABTestSceneResponse());
    }

    public DescribeAppResponse describeApp(String appGroupIdentity, String appId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    public DescribeAppResponse describeAppWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApp"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppResponse());
    }

    public DescribeAppGroupResponse describeAppGroup(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppGroupWithOptions(appGroupIdentity, headers, runtime);
    }

    public DescribeAppGroupResponse describeAppGroupWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppGroup"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppGroupResponse());
    }

    public DescribeAppGroupDataReportResponse describeAppGroupDataReport(String appGroupIdentity, DescribeAppGroupDataReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppGroupDataReportWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public DescribeAppGroupDataReportResponse describeAppGroupDataReportWithOptions(String appGroupIdentity, DescribeAppGroupDataReportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppGroupDataReport"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/data-report"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppGroupDataReportResponse());
    }

    public DescribeAppGroupStatisticsResponse describeAppGroupStatistics(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppGroupStatisticsWithOptions(appGroupIdentity, headers, runtime);
    }

    public DescribeAppGroupStatisticsResponse describeAppGroupStatisticsWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppGroupStatistics"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/statistics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppGroupStatisticsResponse());
    }

    public DescribeAppStatisticsResponse describeAppStatistics(String appGroupIdentity, String appId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppStatisticsWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    public DescribeAppStatisticsResponse describeAppStatisticsWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppStatistics"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/statistics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppStatisticsResponse());
    }

    public DescribeAppsResponse describeApps(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppsWithOptions(appGroupIdentity, headers, runtime);
    }

    public DescribeAppsResponse describeAppsWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApps"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppsResponse());
    }

    public DescribeDataCollctionResponse describeDataCollction(String appGroupIdentity, String dataCollectionIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDataCollctionWithOptions(appGroupIdentity, dataCollectionIdentity, headers, runtime);
    }

    public DescribeDataCollctionResponse describeDataCollctionWithOptions(String appGroupIdentity, String dataCollectionIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        dataCollectionIdentity = com.aliyun.openapiutil.Client.getEncodeParam(dataCollectionIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataCollction"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/data-collections/" + dataCollectionIdentity + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataCollctionResponse());
    }

    public DescribeFirstRankResponse describeFirstRank(String appGroupIdentity, String appId, String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeFirstRankWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    public DescribeFirstRankResponse describeFirstRankWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFirstRank"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/first-ranks/" + name + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFirstRankResponse());
    }

    public DescribeInterventionDictionaryResponse describeInterventionDictionary(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInterventionDictionaryWithOptions(name, headers, runtime);
    }

    public DescribeInterventionDictionaryResponse describeInterventionDictionaryWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInterventionDictionary"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/intervention-dictionaries/" + name + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInterventionDictionaryResponse());
    }

    public DescribeModelResponse describeModel(String appGroupIdentity, String modelName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeModelWithOptions(appGroupIdentity, modelName, headers, runtime);
    }

    public DescribeModelResponse describeModelWithOptions(String appGroupIdentity, String modelName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        modelName = com.aliyun.openapiutil.Client.getEncodeParam(modelName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeModel"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models/" + modelName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeModelResponse());
    }

    public DescribeQueryProcessorResponse describeQueryProcessor(String appGroupIdentity, String appId, String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQueryProcessorWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    public DescribeQueryProcessorResponse describeQueryProcessorWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQueryProcessor"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/query-processors/" + name + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQueryProcessorResponse());
    }

    public DescribeRegionResponse describeRegion() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionWithOptions(headers, runtime);
    }

    public DescribeRegionResponse describeRegionWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeRegionsResponse describeRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(headers, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeScheduledTaskResponse describeScheduledTask(String appGroupIdentity, String taskId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeScheduledTaskWithOptions(appGroupIdentity, taskId, headers, runtime);
    }

    public DescribeScheduledTaskResponse describeScheduledTaskWithOptions(String appGroupIdentity, String taskId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScheduledTask"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scheduled-tasks/" + taskId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScheduledTaskResponse());
    }

    public DescribeSecondRankResponse describeSecondRank(String appGroupIdentity, String appId, String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSecondRankWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    public DescribeSecondRankResponse describeSecondRankWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecondRank"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/second-ranks/" + name + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecondRankResponse());
    }

    public DescribeSlowQueryStatusResponse describeSlowQueryStatus(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSlowQueryStatusWithOptions(appGroupIdentity, headers, runtime);
    }

    public DescribeSlowQueryStatusResponse describeSlowQueryStatusWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlowQueryStatus"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/optimizers/slow-query"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlowQueryStatusResponse());
    }

    public DescribeUserAnalyzerResponse describeUserAnalyzer(String name, DescribeUserAnalyzerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUserAnalyzerWithOptions(name, request, headers, runtime);
    }

    public DescribeUserAnalyzerResponse describeUserAnalyzerWithOptions(String name, DescribeUserAnalyzerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.with)) {
            query.put("with", request.with);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserAnalyzer"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/user-analyzers/" + name + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserAnalyzerResponse());
    }

    public DisableSlowQueryResponse disableSlowQuery(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableSlowQueryWithOptions(appGroupIdentity, headers, runtime);
    }

    public DisableSlowQueryResponse disableSlowQueryWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSlowQuery"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/optimizers/slow-query/actions/disable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSlowQueryResponse());
    }

    public EnableSlowQueryResponse enableSlowQuery(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSlowQueryWithOptions(appGroupIdentity, headers, runtime);
    }

    public EnableSlowQueryResponse enableSlowQueryWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSlowQuery"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/optimizers/slow-query/actions/enable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSlowQueryResponse());
    }

    public GenerateMergedTableResponse generateMergedTable(GenerateMergedTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateMergedTableWithOptions(request, headers, runtime);
    }

    public GenerateMergedTableResponse generateMergedTableWithOptions(GenerateMergedTableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            query.put("spec", request.spec);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetDomainResponse getDomain(String domainName, GetDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDomainWithOptions(domainName, request, headers, runtime);
    }

    public GetDomainResponse getDomainWithOptions(String domainName, GetDomainRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        domainName = com.aliyun.openapiutil.Client.getEncodeParam(domainName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appGroupIdentity)) {
            query.put("appGroupIdentity", request.appGroupIdentity);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomain"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/domains/" + domainName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDomainResponse());
    }

    public GetFunctionCurrentVersionResponse getFunctionCurrentVersion(String functionName, GetFunctionCurrentVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionCurrentVersionWithOptions(functionName, request, headers, runtime);
    }

    public GetFunctionCurrentVersionResponse getFunctionCurrentVersionWithOptions(String functionName, GetFunctionCurrentVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunctionCurrentVersion"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/functions/" + functionName + "/current-version"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionCurrentVersionResponse());
    }

    public GetFunctionDefaultInstanceResponse getFunctionDefaultInstance(String appGroupIdentity, String functionName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionDefaultInstanceWithOptions(appGroupIdentity, functionName, headers, runtime);
    }

    public GetFunctionDefaultInstanceResponse getFunctionDefaultInstanceWithOptions(String appGroupIdentity, String functionName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunctionDefaultInstance"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/functions/" + functionName + "/default-instance"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionDefaultInstanceResponse());
    }

    public GetFunctionInstanceResponse getFunctionInstance(String appGroupIdentity, String functionName, String instanceName, GetFunctionInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionInstanceWithOptions(appGroupIdentity, functionName, instanceName, request, headers, runtime);
    }

    public GetFunctionInstanceResponse getFunctionInstanceWithOptions(String appGroupIdentity, String functionName, String instanceName, GetFunctionInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        instanceName = com.aliyun.openapiutil.Client.getEncodeParam(instanceName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            query.put("output", request.output);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunctionInstance"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/functions/" + functionName + "/instances/" + instanceName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionInstanceResponse());
    }

    public GetFunctionVersionResponse getFunctionVersion(String functionName, String versionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionVersionWithOptions(functionName, versionId, headers, runtime);
    }

    public GetFunctionVersionResponse getFunctionVersionWithOptions(String functionName, String versionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        versionId = com.aliyun.openapiutil.Client.getEncodeParam(versionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunctionVersion"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/functions/" + functionName + "/versions/" + versionId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionVersionResponse());
    }

    public GetModelProgressResponse getModelProgress(String appGroupIdentity, String modelName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelProgressWithOptions(appGroupIdentity, modelName, headers, runtime);
    }

    public GetModelProgressResponse getModelProgressWithOptions(String appGroupIdentity, String modelName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        modelName = com.aliyun.openapiutil.Client.getEncodeParam(modelName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModelProgress"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models/" + modelName + "/progress"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelProgressResponse());
    }

    public GetModelReportResponse getModelReport(String appGroupIdentity, String modelName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelReportWithOptions(appGroupIdentity, modelName, headers, runtime);
    }

    public GetModelReportResponse getModelReportWithOptions(String appGroupIdentity, String modelName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        modelName = com.aliyun.openapiutil.Client.getEncodeParam(modelName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModelReport"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models/" + modelName + "/report"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelReportResponse());
    }

    public GetScriptFileNamesResponse getScriptFileNames(String appGroupIdentity, String appVersionId, String scriptName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getScriptFileNamesWithOptions(appGroupIdentity, appVersionId, scriptName, headers, runtime);
    }

    public GetScriptFileNamesResponse getScriptFileNamesWithOptions(String appGroupIdentity, String appVersionId, String scriptName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appVersionId = com.aliyun.openapiutil.Client.getEncodeParam(appVersionId);
        scriptName = com.aliyun.openapiutil.Client.getEncodeParam(scriptName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScriptFileNames"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts/" + scriptName + "/file-names"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScriptFileNamesResponse());
    }

    public GetSearchStrategyResponse getSearchStrategy(String appGroupIdentity, String appId, String strategyName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSearchStrategyWithOptions(appGroupIdentity, appId, strategyName, headers, runtime);
    }

    public GetSearchStrategyResponse getSearchStrategyWithOptions(String appGroupIdentity, String appId, String strategyName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        strategyName = com.aliyun.openapiutil.Client.getEncodeParam(strategyName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSearchStrategy"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/search-strategies/" + strategyName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSearchStrategyResponse());
    }

    public GetSortScriptResponse getSortScript(String appGroupIdentity, String scriptName, String appVersionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, headers, runtime);
    }

    public GetSortScriptResponse getSortScriptWithOptions(String appGroupIdentity, String scriptName, String appVersionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        scriptName = com.aliyun.openapiutil.Client.getEncodeParam(scriptName);
        appVersionId = com.aliyun.openapiutil.Client.getEncodeParam(appVersionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSortScript"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts/" + scriptName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSortScriptResponse());
    }

    public GetSortScriptFileResponse getSortScriptFile(String appGroupIdentity, String scriptName, String appVersionId, String fileName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSortScriptFileWithOptions(appGroupIdentity, scriptName, appVersionId, fileName, headers, runtime);
    }

    public GetSortScriptFileResponse getSortScriptFileWithOptions(String appGroupIdentity, String scriptName, String appVersionId, String fileName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        scriptName = com.aliyun.openapiutil.Client.getEncodeParam(scriptName);
        appVersionId = com.aliyun.openapiutil.Client.getEncodeParam(appVersionId);
        fileName = com.aliyun.openapiutil.Client.getEncodeParam(fileName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSortScriptFile"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts/" + scriptName + "/files/src/" + fileName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSortScriptFileResponse());
    }

    public GetValidationErrorResponse getValidationError(String appGroupIdentity, GetValidationErrorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getValidationErrorWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public GetValidationErrorResponse getValidationErrorWithOptions(String appGroupIdentity, GetValidationErrorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.errorCode)) {
            query.put("errorCode", request.errorCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetValidationError"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/data/validation-error"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetValidationErrorResponse());
    }

    public GetValidationReportResponse getValidationReport(String appGroupIdentity, GetValidationReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getValidationReportWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public GetValidationReportResponse getValidationReportWithOptions(String appGroupIdentity, GetValidationReportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetValidationReport"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/data/validation-report"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetValidationReportResponse());
    }

    public ListABTestExperimentsResponse listABTestExperiments(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestExperimentsWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

    public ListABTestExperimentsResponse listABTestExperimentsWithOptions(String appGroupIdentity, String sceneId, String groupId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        sceneId = com.aliyun.openapiutil.Client.getEncodeParam(sceneId);
        groupId = com.aliyun.openapiutil.Client.getEncodeParam(groupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListABTestExperiments"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/" + sceneId + "/groups/" + groupId + "/experiments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListABTestExperimentsResponse());
    }

    public ListABTestFixedFlowDividersResponse listABTestFixedFlowDividers(String appGroupIdentity, String sceneId, String groupId, String experimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestFixedFlowDividersWithOptions(appGroupIdentity, sceneId, groupId, experimentId, headers, runtime);
    }

    public ListABTestFixedFlowDividersResponse listABTestFixedFlowDividersWithOptions(String appGroupIdentity, String sceneId, String groupId, String experimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        sceneId = com.aliyun.openapiutil.Client.getEncodeParam(sceneId);
        groupId = com.aliyun.openapiutil.Client.getEncodeParam(groupId);
        experimentId = com.aliyun.openapiutil.Client.getEncodeParam(experimentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListABTestFixedFlowDividers"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/" + sceneId + "/groups/" + groupId + "/experiments/" + experimentId + "/fixed-flow-dividers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListABTestFixedFlowDividersResponse());
    }

    public ListABTestGroupsResponse listABTestGroups(String appGroupIdentity, String sceneId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestGroupsWithOptions(appGroupIdentity, sceneId, headers, runtime);
    }

    public ListABTestGroupsResponse listABTestGroupsWithOptions(String appGroupIdentity, String sceneId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        sceneId = com.aliyun.openapiutil.Client.getEncodeParam(sceneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListABTestGroups"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/" + sceneId + "/groups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListABTestGroupsResponse());
    }

    public ListABTestMetricsResponse listABTestMetrics(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestMetricsWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

    public ListABTestMetricsResponse listABTestMetricsWithOptions(String appGroupIdentity, String sceneId, String groupId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        sceneId = com.aliyun.openapiutil.Client.getEncodeParam(sceneId);
        groupId = com.aliyun.openapiutil.Client.getEncodeParam(groupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListABTestMetrics"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/" + sceneId + "/groups/" + groupId + "/metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListABTestMetricsResponse());
    }

    public ListABTestScenesResponse listABTestScenes(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestScenesWithOptions(appGroupIdentity, headers, runtime);
    }

    public ListABTestScenesResponse listABTestScenesWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListABTestScenes"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListABTestScenesResponse());
    }

    public ListAppGroupErrorsResponse listAppGroupErrors(String appGroupIdentity, ListAppGroupErrorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppGroupErrorsWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public ListAppGroupErrorsResponse listAppGroupErrorsWithOptions(String appGroupIdentity, ListAppGroupErrorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("appId", request.appId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.stopTime)) {
            query.put("stopTime", request.stopTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppGroupErrors"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/errors"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppGroupErrorsResponse());
    }

    public ListAppGroupMetricsResponse listAppGroupMetrics(String appGroupIdentity, ListAppGroupMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppGroupMetricsWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public ListAppGroupMetricsResponse listAppGroupMetricsWithOptions(String appGroupIdentity, ListAppGroupMetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexes)) {
            query.put("indexes", request.indexes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("metricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppGroupMetrics"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppGroupMetricsResponse());
    }

    public ListAppGroupsResponse listAppGroups(ListAppGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppGroupsWithOptions(request, headers, runtime);
    }

    public ListAppGroupsResponse listAppGroupsWithOptions(ListAppGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppsWithOptions(request, headers, runtime);
    }

    public ListAppsResponse listAppsWithOptions(ListAppsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListDataCollectionsResponse listDataCollections(String appGroupIdentity, ListDataCollectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataCollectionsWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public ListDataCollectionsResponse listDataCollectionsWithOptions(String appGroupIdentity, ListDataCollectionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataCollections"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/data-collections"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataCollectionsResponse());
    }

    public ListDataSourceTableFieldsResponse listDataSourceTableFields(String dataSourceType, ListDataSourceTableFieldsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourceTableFieldsWithOptions(dataSourceType, request, headers, runtime);
    }

    public ListDataSourceTableFieldsResponse listDataSourceTableFieldsWithOptions(String dataSourceType, ListDataSourceTableFieldsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        dataSourceType = com.aliyun.openapiutil.Client.getEncodeParam(dataSourceType);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSourceTableFields"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/assist/data-sources/" + dataSourceType + "/fields"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceTableFieldsResponse());
    }

    public ListDataSourceTablesResponse listDataSourceTables(String dataSourceType, ListDataSourceTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourceTablesWithOptions(dataSourceType, request, headers, runtime);
    }

    public ListDataSourceTablesResponse listDataSourceTablesWithOptions(String dataSourceType, ListDataSourceTablesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        dataSourceType = com.aliyun.openapiutil.Client.getEncodeParam(dataSourceType);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSourceTables"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/assist/data-sources/" + dataSourceType + "/tables"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceTablesResponse());
    }

    public ListDeployedAlgorithmModelsResponse listDeployedAlgorithmModels(String appGroupIdentity, ListDeployedAlgorithmModelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeployedAlgorithmModelsWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public ListDeployedAlgorithmModelsResponse listDeployedAlgorithmModelsWithOptions(String appGroupIdentity, ListDeployedAlgorithmModelsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmType)) {
            query.put("algorithmType", request.algorithmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inServiceOnly)) {
            query.put("inServiceOnly", request.inServiceOnly);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeployedAlgorithmModels"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/deployed-algorithm-models"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeployedAlgorithmModelsResponse());
    }

    public ListFirstRanksResponse listFirstRanks(String appGroupIdentity, String appId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFirstRanksWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    public ListFirstRanksResponse listFirstRanksWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFirstRanks"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/first-ranks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFirstRanksResponse());
    }

    public ListFunctionInstancesResponse listFunctionInstances(String appGroupIdentity, String functionName, ListFunctionInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionInstancesWithOptions(appGroupIdentity, functionName, request, headers, runtime);
    }

    public ListFunctionInstancesResponse listFunctionInstancesWithOptions(String appGroupIdentity, String functionName, ListFunctionInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFunctionInstances"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/functions/" + functionName + "/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionInstancesResponse());
    }

    public ListFunctionTasksResponse listFunctionTasks(String appGroupIdentity, String functionName, String instanceName, ListFunctionTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionTasksWithOptions(appGroupIdentity, functionName, instanceName, request, headers, runtime);
    }

    public ListFunctionTasksResponse listFunctionTasksWithOptions(String appGroupIdentity, String functionName, String instanceName, ListFunctionTasksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        instanceName = com.aliyun.openapiutil.Client.getEncodeParam(instanceName);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFunctionTasks"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/functions/" + functionName + "/instances/" + instanceName + "/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionTasksResponse());
    }

    public ListInterventionDictionariesResponse listInterventionDictionaries(ListInterventionDictionariesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInterventionDictionariesWithOptions(request, headers, runtime);
    }

    public ListInterventionDictionariesResponse listInterventionDictionariesWithOptions(ListInterventionDictionariesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListInterventionDictionaryEntriesResponse listInterventionDictionaryEntries(String name, ListInterventionDictionaryEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInterventionDictionaryEntriesWithOptions(name, request, headers, runtime);
    }

    public ListInterventionDictionaryEntriesResponse listInterventionDictionaryEntriesWithOptions(String name, ListInterventionDictionaryEntriesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInterventionDictionaryEntries"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/intervention-dictionaries/" + name + "/entries"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInterventionDictionaryEntriesResponse());
    }

    public ListInterventionDictionaryNerResultsResponse listInterventionDictionaryNerResults(String name, ListInterventionDictionaryNerResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInterventionDictionaryNerResultsWithOptions(name, request, headers, runtime);
    }

    public ListInterventionDictionaryNerResultsResponse listInterventionDictionaryNerResultsWithOptions(String name, ListInterventionDictionaryNerResultsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInterventionDictionaryNerResults"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/intervention-dictionaries/" + name + "/ner-results"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInterventionDictionaryNerResultsResponse());
    }

    public ListInterventionDictionaryRelatedEntitiesResponse listInterventionDictionaryRelatedEntities(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInterventionDictionaryRelatedEntitiesWithOptions(name, headers, runtime);
    }

    public ListInterventionDictionaryRelatedEntitiesResponse listInterventionDictionaryRelatedEntitiesWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInterventionDictionaryRelatedEntities"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/intervention-dictionaries/" + name + "/related"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInterventionDictionaryRelatedEntitiesResponse());
    }

    public ListModelsResponse listModels(String appGroupIdentity, ListModelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModelsWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public ListModelsResponse listModelsWithOptions(String appGroupIdentity, ListModelsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModels"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelsResponse());
    }

    public ListProceedingsResponse listProceedings(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProceedingsWithOptions(appGroupIdentity, headers, runtime);
    }

    public ListProceedingsResponse listProceedingsWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProceedings"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/proceedings"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProceedingsResponse());
    }

    public ListQueryProcessorAnalyzerResultsResponse listQueryProcessorAnalyzerResults(String appGroupIdentity, String appId, String name, ListQueryProcessorAnalyzerResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQueryProcessorAnalyzerResultsWithOptions(appGroupIdentity, appId, name, request, headers, runtime);
    }

    public ListQueryProcessorAnalyzerResultsResponse listQueryProcessorAnalyzerResultsWithOptions(String appGroupIdentity, String appId, String name, ListQueryProcessorAnalyzerResultsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("text", request.text);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQueryProcessorAnalyzerResults"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/query-processors/" + name + "/analyze"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQueryProcessorAnalyzerResultsResponse());
    }

    public ListQueryProcessorNersResponse listQueryProcessorNers(ListQueryProcessorNersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQueryProcessorNersWithOptions(request, headers, runtime);
    }

    public ListQueryProcessorNersResponse listQueryProcessorNersWithOptions(ListQueryProcessorNersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("domain", request.domain);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListQueryProcessorsResponse listQueryProcessors(String appGroupIdentity, String appId, ListQueryProcessorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQueryProcessorsWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    public ListQueryProcessorsResponse listQueryProcessorsWithOptions(String appGroupIdentity, String appId, ListQueryProcessorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isActive)) {
            query.put("isActive", request.isActive);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQueryProcessors"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/query-processors"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQueryProcessorsResponse());
    }

    public ListQuotaReviewTasksResponse listQuotaReviewTasks(String appGroupIdentity, ListQuotaReviewTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQuotaReviewTasksWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public ListQuotaReviewTasksResponse listQuotaReviewTasksWithOptions(String appGroupIdentity, ListQuotaReviewTasksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuotaReviewTasks"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/quota-review-tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotaReviewTasksResponse());
    }

    public ListRamRolesResponse listRamRoles() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRamRolesWithOptions(headers, runtime);
    }

    public ListRamRolesResponse listRamRolesWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRamRoles"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/assist/ram/roles"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRamRolesResponse());
    }

    public ListScheduledTasksResponse listScheduledTasks(String appGroupIdentity, ListScheduledTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listScheduledTasksWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public ListScheduledTasksResponse listScheduledTasksWithOptions(String appGroupIdentity, ListScheduledTasksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScheduledTasks"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scheduled-tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScheduledTasksResponse());
    }

    public ListSearchStrategiesResponse listSearchStrategies(String appGroupIdentity, String appId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSearchStrategiesWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    public ListSearchStrategiesResponse listSearchStrategiesWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSearchStrategies"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/search-strategies"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSearchStrategiesResponse());
    }

    public ListSecondRanksResponse listSecondRanks(String appGroupIdentity, String appId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSecondRanksWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    public ListSecondRanksResponse listSecondRanksWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSecondRanks"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/second-ranks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecondRanksResponse());
    }

    public ListSlowQueryCategoriesResponse listSlowQueryCategories(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSlowQueryCategoriesWithOptions(appGroupIdentity, headers, runtime);
    }

    public ListSlowQueryCategoriesResponse listSlowQueryCategoriesWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSlowQueryCategories"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/optimizers/slow-query/categories"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSlowQueryCategoriesResponse());
    }

    public ListSlowQueryQueriesResponse listSlowQueryQueries(String appGroupIdentity, String categoryIndex) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSlowQueryQueriesWithOptions(appGroupIdentity, categoryIndex, headers, runtime);
    }

    public ListSlowQueryQueriesResponse listSlowQueryQueriesWithOptions(String appGroupIdentity, String categoryIndex, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        categoryIndex = com.aliyun.openapiutil.Client.getEncodeParam(categoryIndex);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSlowQueryQueries"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/optimizers/slow-query/categories/" + categoryIndex + "/queries"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSlowQueryQueriesResponse());
    }

    public ListSortExpressionsResponse listSortExpressions(String appGroupIdentity, String appId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSortExpressionsWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    public ListSortExpressionsResponse listSortExpressionsWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSortExpressions"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/sort-expressions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSortExpressionsResponse());
    }

    public ListSortScriptsResponse listSortScripts(String appGroupIdentity, String appVersionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSortScriptsWithOptions(appGroupIdentity, appVersionId, headers, runtime);
    }

    public ListSortScriptsResponse listSortScriptsWithOptions(String appGroupIdentity, String appVersionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appVersionId = com.aliyun.openapiutil.Client.getEncodeParam(appVersionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSortScripts"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSortScriptsResponse());
    }

    public ListStatisticLogsResponse listStatisticLogs(String appGroupIdentity, String moduleName, ListStatisticLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStatisticLogsWithOptions(appGroupIdentity, moduleName, request, headers, runtime);
    }

    public ListStatisticLogsResponse listStatisticLogsWithOptions(String appGroupIdentity, String moduleName, ListStatisticLogsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        moduleName = com.aliyun.openapiutil.Client.getEncodeParam(moduleName);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStatisticLogs"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/statistic-logs/" + moduleName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStatisticLogsResponse());
    }

    public ListStatisticReportResponse listStatisticReport(String appGroupIdentity, String moduleName, ListStatisticReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStatisticReportWithOptions(appGroupIdentity, moduleName, request, headers, runtime);
    }

    public ListStatisticReportResponse listStatisticReportWithOptions(String appGroupIdentity, String moduleName, ListStatisticReportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        moduleName = com.aliyun.openapiutil.Client.getEncodeParam(moduleName);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStatisticReport"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/statistic-report/" + moduleName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStatisticReportResponse());
    }

    public ListUserAnalyzerEntriesResponse listUserAnalyzerEntries(String name, ListUserAnalyzerEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserAnalyzerEntriesWithOptions(name, request, headers, runtime);
    }

    public ListUserAnalyzerEntriesResponse listUserAnalyzerEntriesWithOptions(String name, ListUserAnalyzerEntriesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserAnalyzerEntries"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/user-analyzers/" + name + "/entries"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserAnalyzerEntriesResponse());
    }

    public ListUserAnalyzersResponse listUserAnalyzers(ListUserAnalyzersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserAnalyzersWithOptions(request, headers, runtime);
    }

    public ListUserAnalyzersResponse listUserAnalyzersWithOptions(ListUserAnalyzersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ModifyAppGroupResponse modifyAppGroup(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyAppGroupWithOptions(appGroupIdentity, headers, runtime);
    }

    public ModifyAppGroupResponse modifyAppGroupWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppGroup"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppGroupResponse());
    }

    public ModifyAppGroupQuotaResponse modifyAppGroupQuota(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyAppGroupQuotaWithOptions(appGroupIdentity, headers, runtime);
    }

    public ModifyAppGroupQuotaResponse modifyAppGroupQuotaWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppGroupQuota"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/quota"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppGroupQuotaResponse());
    }

    public ModifyFirstRankResponse modifyFirstRank(String appGroupIdentity, String appId, String name, ModifyFirstRankRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyFirstRankWithOptions(appGroupIdentity, appId, name, request, headers, runtime);
    }

    public ModifyFirstRankResponse modifyFirstRankWithOptions(String appGroupIdentity, String appId, String name, ModifyFirstRankRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFirstRank"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/first-ranks/" + name + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFirstRankResponse());
    }

    public ModifyModelResponse modifyModel(String appGroupIdentity, String modelName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyModelWithOptions(appGroupIdentity, modelName, headers, runtime);
    }

    public ModifyModelResponse modifyModelWithOptions(String appGroupIdentity, String modelName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        modelName = com.aliyun.openapiutil.Client.getEncodeParam(modelName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyModel"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models/" + modelName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyModelResponse());
    }

    public ModifyQueryProcessorResponse modifyQueryProcessor(String appGroupIdentity, String appId, String name, ModifyQueryProcessorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyQueryProcessorWithOptions(appGroupIdentity, appId, name, request, headers, runtime);
    }

    public ModifyQueryProcessorResponse modifyQueryProcessorWithOptions(String appGroupIdentity, String appId, String name, ModifyQueryProcessorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyQueryProcessor"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/query-processors/" + name + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyQueryProcessorResponse());
    }

    public ModifyScheduledTaskResponse modifyScheduledTask(String appGroupIdentity, String taskId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyScheduledTaskWithOptions(appGroupIdentity, taskId, headers, runtime);
    }

    public ModifyScheduledTaskResponse modifyScheduledTaskWithOptions(String appGroupIdentity, String taskId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyScheduledTask"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scheduled-tasks/" + taskId + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyScheduledTaskResponse());
    }

    public ModifySecondRankResponse modifySecondRank(String appGroupIdentity, String appId, String name, ModifySecondRankRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifySecondRankWithOptions(appGroupIdentity, appId, name, request, headers, runtime);
    }

    public ModifySecondRankResponse modifySecondRankWithOptions(String appGroupIdentity, String appId, String name, ModifySecondRankRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySecondRank"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/second-ranks/" + name + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySecondRankResponse());
    }

    public PreviewModelResponse previewModel(String appGroupIdentity, String modelName, PreviewModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewModelWithOptions(appGroupIdentity, modelName, request, headers, runtime);
    }

    public PreviewModelResponse previewModelWithOptions(String appGroupIdentity, String modelName, PreviewModelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        modelName = com.aliyun.openapiutil.Client.getEncodeParam(modelName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviewModel"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models/" + modelName + "/actions/preview"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreviewModelResponse());
    }

    public PushInterventionDictionaryEntriesResponse pushInterventionDictionaryEntries(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushInterventionDictionaryEntriesWithOptions(name, headers, runtime);
    }

    public PushInterventionDictionaryEntriesResponse pushInterventionDictionaryEntriesWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushInterventionDictionaryEntries"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/intervention-dictionaries/" + name + "/entries/actions/bulk"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushInterventionDictionaryEntriesResponse());
    }

    public PushUserAnalyzerEntriesResponse pushUserAnalyzerEntries(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushUserAnalyzerEntriesWithOptions(name, headers, runtime);
    }

    public PushUserAnalyzerEntriesResponse pushUserAnalyzerEntriesWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushUserAnalyzerEntries"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/user-analyzers/" + name + "/entries/actions/bulk"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushUserAnalyzerEntriesResponse());
    }

    public RankPreviewQueryResponse rankPreviewQuery(String appGroupIdentity, String modelName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rankPreviewQueryWithOptions(appGroupIdentity, modelName, headers, runtime);
    }

    public RankPreviewQueryResponse rankPreviewQueryWithOptions(String appGroupIdentity, String modelName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        modelName = com.aliyun.openapiutil.Client.getEncodeParam(modelName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RankPreviewQuery"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models/" + modelName + "/actions/query-rank"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RankPreviewQueryResponse());
    }

    public ReleaseSortScriptResponse releaseSortScript(String appGroupIdentity, String scriptName, String appVersionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, headers, runtime);
    }

    public ReleaseSortScriptResponse releaseSortScriptWithOptions(String appGroupIdentity, String scriptName, String appVersionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        scriptName = com.aliyun.openapiutil.Client.getEncodeParam(scriptName);
        appVersionId = com.aliyun.openapiutil.Client.getEncodeParam(appVersionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseSortScript"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts/" + scriptName + "/actions/release"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseSortScriptResponse());
    }

    public RemoveAppResponse removeApp(String appGroupIdentity, String appId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeAppWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    public RemoveAppResponse removeAppWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveApp"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAppResponse());
    }

    public RemoveAppGroupResponse removeAppGroup(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeAppGroupWithOptions(appGroupIdentity, headers, runtime);
    }

    public RemoveAppGroupResponse removeAppGroupWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveAppGroup"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAppGroupResponse());
    }

    public RemoveDataCollectionResponse removeDataCollection(String appGroupIdentity, String dataCollectionIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeDataCollectionWithOptions(appGroupIdentity, dataCollectionIdentity, headers, runtime);
    }

    public RemoveDataCollectionResponse removeDataCollectionWithOptions(String appGroupIdentity, String dataCollectionIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        dataCollectionIdentity = com.aliyun.openapiutil.Client.getEncodeParam(dataCollectionIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveDataCollection"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/data-collections/" + dataCollectionIdentity + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDataCollectionResponse());
    }

    public RemoveFirstRankResponse removeFirstRank(String appGroupIdentity, String appId, String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeFirstRankWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    public RemoveFirstRankResponse removeFirstRankWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveFirstRank"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/first-ranks/" + name + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveFirstRankResponse());
    }

    public RemoveInterventionDictionaryResponse removeInterventionDictionary(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeInterventionDictionaryWithOptions(name, headers, runtime);
    }

    public RemoveInterventionDictionaryResponse removeInterventionDictionaryWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveInterventionDictionary"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/intervention-dictionaries/" + name + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveInterventionDictionaryResponse());
    }

    public RemoveQueryProcessorResponse removeQueryProcessor(String appGroupIdentity, String appId, String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeQueryProcessorWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    public RemoveQueryProcessorResponse removeQueryProcessorWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveQueryProcessor"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/query-processors/" + name + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveQueryProcessorResponse());
    }

    public RemoveScheduledTaskResponse removeScheduledTask(String appGroupIdentity, String taskId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeScheduledTaskWithOptions(appGroupIdentity, taskId, headers, runtime);
    }

    public RemoveScheduledTaskResponse removeScheduledTaskWithOptions(String appGroupIdentity, String taskId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveScheduledTask"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scheduled-tasks/" + taskId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveScheduledTaskResponse());
    }

    public RemoveSearchStrategyResponse removeSearchStrategy(String appGroupIdentity, String appId, String strategyName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeSearchStrategyWithOptions(appGroupIdentity, appId, strategyName, headers, runtime);
    }

    public RemoveSearchStrategyResponse removeSearchStrategyWithOptions(String appGroupIdentity, String appId, String strategyName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        strategyName = com.aliyun.openapiutil.Client.getEncodeParam(strategyName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveSearchStrategy"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/search-strategies/" + strategyName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveSearchStrategyResponse());
    }

    public RemoveSecondRankResponse removeSecondRank(String appGroupIdentity, String appId, String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeSecondRankWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    public RemoveSecondRankResponse removeSecondRankWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveSecondRank"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/second-ranks/" + name + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveSecondRankResponse());
    }

    public RemoveUserAnalyzerResponse removeUserAnalyzer(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeUserAnalyzerWithOptions(name, headers, runtime);
    }

    public RemoveUserAnalyzerResponse removeUserAnalyzerWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUserAnalyzer"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/user-analyzers/" + name + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUserAnalyzerResponse());
    }

    public RenewAppGroupResponse renewAppGroup(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renewAppGroupWithOptions(appGroupIdentity, headers, runtime);
    }

    public RenewAppGroupResponse renewAppGroupWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewAppGroup"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/actions/renew"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewAppGroupResponse());
    }

    public ReplaceAppGroupCommodityCodeResponse replaceAppGroupCommodityCode(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceAppGroupCommodityCodeWithOptions(appGroupIdentity, headers, runtime);
    }

    public ReplaceAppGroupCommodityCodeResponse replaceAppGroupCommodityCodeWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceAppGroupCommodityCode"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/actions/to-instance-typed"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceAppGroupCommodityCodeResponse());
    }

    public SaveSortScriptFileResponse saveSortScriptFile(String appGroupIdentity, String scriptName, String appVersionId, String fileName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveSortScriptFileWithOptions(appGroupIdentity, scriptName, appVersionId, fileName, headers, runtime);
    }

    public SaveSortScriptFileResponse saveSortScriptFileWithOptions(String appGroupIdentity, String scriptName, String appVersionId, String fileName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        scriptName = com.aliyun.openapiutil.Client.getEncodeParam(scriptName);
        appVersionId = com.aliyun.openapiutil.Client.getEncodeParam(appVersionId);
        fileName = com.aliyun.openapiutil.Client.getEncodeParam(fileName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSortScriptFile"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts/" + scriptName + "/files/src/" + fileName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSortScriptFileResponse());
    }

    public StartSlowQueryAnalyzerResponse startSlowQueryAnalyzer(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startSlowQueryAnalyzerWithOptions(appGroupIdentity, headers, runtime);
    }

    public StartSlowQueryAnalyzerResponse startSlowQueryAnalyzerWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSlowQueryAnalyzer"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/optimizers/slow-query/actions/run"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSlowQueryAnalyzerResponse());
    }

    public TrainModelResponse trainModel(String appGroupIdentity, String modelName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.trainModelWithOptions(appGroupIdentity, modelName, headers, runtime);
    }

    public TrainModelResponse trainModelWithOptions(String appGroupIdentity, String modelName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        modelName = com.aliyun.openapiutil.Client.getEncodeParam(modelName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainModel"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models/" + modelName + "/actions/train"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainModelResponse());
    }

    public UnbindESUserAnalyzerResponse unbindESUserAnalyzer(String appGroupIdentity, String esInstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindESUserAnalyzerWithOptions(appGroupIdentity, esInstanceId, headers, runtime);
    }

    public UnbindESUserAnalyzerResponse unbindESUserAnalyzerWithOptions(String appGroupIdentity, String esInstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        esInstanceId = com.aliyun.openapiutil.Client.getEncodeParam(esInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindESUserAnalyzer"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/es/" + esInstanceId + "/actions/unbind-analyzer"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindESUserAnalyzerResponse());
    }

    public UnbindEsInstanceResponse unbindEsInstance(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindEsInstanceWithOptions(appGroupIdentity, headers, runtime);
    }

    public UnbindEsInstanceResponse unbindEsInstanceWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindEsInstance"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/actions/unbind-es-instance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindEsInstanceResponse());
    }

    public UpdateABTestExperimentResponse updateABTestExperiment(String appGroupIdentity, String sceneId, String groupId, String experimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABTestExperimentWithOptions(appGroupIdentity, sceneId, groupId, experimentId, headers, runtime);
    }

    public UpdateABTestExperimentResponse updateABTestExperimentWithOptions(String appGroupIdentity, String sceneId, String groupId, String experimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        sceneId = com.aliyun.openapiutil.Client.getEncodeParam(sceneId);
        groupId = com.aliyun.openapiutil.Client.getEncodeParam(groupId);
        experimentId = com.aliyun.openapiutil.Client.getEncodeParam(experimentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateABTestExperiment"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/" + sceneId + "/groups/" + groupId + "/experiments/" + experimentId + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateABTestExperimentResponse());
    }

    public UpdateABTestFixedFlowDividersResponse updateABTestFixedFlowDividers(String appGroupIdentity, String sceneId, String groupId, String experimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABTestFixedFlowDividersWithOptions(appGroupIdentity, sceneId, groupId, experimentId, headers, runtime);
    }

    public UpdateABTestFixedFlowDividersResponse updateABTestFixedFlowDividersWithOptions(String appGroupIdentity, String sceneId, String groupId, String experimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        sceneId = com.aliyun.openapiutil.Client.getEncodeParam(sceneId);
        groupId = com.aliyun.openapiutil.Client.getEncodeParam(groupId);
        experimentId = com.aliyun.openapiutil.Client.getEncodeParam(experimentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateABTestFixedFlowDividers"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/" + sceneId + "/groups/" + groupId + "/experiments/" + experimentId + "/fixed-flow-dividers"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateABTestFixedFlowDividersResponse());
    }

    public UpdateABTestGroupResponse updateABTestGroup(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABTestGroupWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

    public UpdateABTestGroupResponse updateABTestGroupWithOptions(String appGroupIdentity, String sceneId, String groupId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        sceneId = com.aliyun.openapiutil.Client.getEncodeParam(sceneId);
        groupId = com.aliyun.openapiutil.Client.getEncodeParam(groupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateABTestGroup"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/" + sceneId + "/groups/" + groupId + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateABTestGroupResponse());
    }

    public UpdateABTestSceneResponse updateABTestScene(String appGroupIdentity, String sceneId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABTestSceneWithOptions(appGroupIdentity, sceneId, headers, runtime);
    }

    public UpdateABTestSceneResponse updateABTestSceneWithOptions(String appGroupIdentity, String sceneId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        sceneId = com.aliyun.openapiutil.Client.getEncodeParam(sceneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateABTestScene"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/" + sceneId + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateABTestSceneResponse());
    }

    public UpdateFetchFieldsResponse updateFetchFields(String appGroupIdentity, String appId, UpdateFetchFieldsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFetchFieldsWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    public UpdateFetchFieldsResponse updateFetchFieldsWithOptions(String appGroupIdentity, String appId, UpdateFetchFieldsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFetchFields"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/fetch-fields"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFetchFieldsResponse());
    }

    public UpdateFunctionDefaultInstanceResponse updateFunctionDefaultInstance(String appGroupIdentity, String functionName, UpdateFunctionDefaultInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFunctionDefaultInstanceWithOptions(appGroupIdentity, functionName, request, headers, runtime);
    }

    public UpdateFunctionDefaultInstanceResponse updateFunctionDefaultInstanceWithOptions(String appGroupIdentity, String functionName, UpdateFunctionDefaultInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("instanceName", request.instanceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFunctionDefaultInstance"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/functions/" + functionName + "/default-instance"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFunctionDefaultInstanceResponse());
    }

    public UpdateFunctionInstanceResponse updateFunctionInstance(String appGroupIdentity, String functionName, String instanceName, UpdateFunctionInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFunctionInstanceWithOptions(appGroupIdentity, functionName, instanceName, request, headers, runtime);
    }

    public UpdateFunctionInstanceResponse updateFunctionInstanceWithOptions(String appGroupIdentity, String functionName, String instanceName, UpdateFunctionInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        instanceName = com.aliyun.openapiutil.Client.getEncodeParam(instanceName);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFunctionInstance"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/functions/" + functionName + "/instances/" + instanceName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFunctionInstanceResponse());
    }

    public UpdateSearchStrategyResponse updateSearchStrategy(String appGroupIdentity, String appId, String strategyName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSearchStrategyWithOptions(appGroupIdentity, appId, strategyName, headers, runtime);
    }

    public UpdateSearchStrategyResponse updateSearchStrategyWithOptions(String appGroupIdentity, String appId, String strategyName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        strategyName = com.aliyun.openapiutil.Client.getEncodeParam(strategyName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSearchStrategy"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/search-strategies/" + strategyName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSearchStrategyResponse());
    }

    public UpdateSortScriptResponse updateSortScript(String appGroupIdentity, String appVersionId, String scriptName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSortScriptWithOptions(appGroupIdentity, appVersionId, scriptName, headers, runtime);
    }

    public UpdateSortScriptResponse updateSortScriptWithOptions(String appGroupIdentity, String appVersionId, String scriptName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appVersionId = com.aliyun.openapiutil.Client.getEncodeParam(appVersionId);
        scriptName = com.aliyun.openapiutil.Client.getEncodeParam(scriptName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSortScript"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts/" + scriptName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSortScriptResponse());
    }

    public UpdateSummariesResponse updateSummaries(String appGroupIdentity, String appId, UpdateSummariesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSummariesWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    public UpdateSummariesResponse updateSummariesWithOptions(String appGroupIdentity, String appId, UpdateSummariesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        appGroupIdentity = com.aliyun.openapiutil.Client.getEncodeParam(appGroupIdentity);
        appId = com.aliyun.openapiutil.Client.getEncodeParam(appId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSummaries"),
            new TeaPair("version", "2017-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "/summaries"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSummariesResponse());
    }

    public ValidateDataSourcesResponse validateDataSources() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateDataSourcesWithOptions(headers, runtime);
    }

    public ValidateDataSourcesResponse validateDataSourcesWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
}

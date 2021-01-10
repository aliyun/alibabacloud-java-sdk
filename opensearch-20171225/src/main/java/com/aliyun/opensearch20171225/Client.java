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

    public CompileSortScriptResponse compileSortScript(String appGroupIdentity, String scriptName, String appVersionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.compileSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, headers, runtime);
    }

    public CompileSortScriptResponse compileSortScriptWithOptions(String appGroupIdentity, String scriptName, String appVersionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CompileSortScript", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appVersionId}/sort-scripts/{scriptName}/actions/compiling", "json", req, runtime), new CompileSortScriptResponse());
    }

    public CreateABTestExperimentResponse createABTestExperiment(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createABTestExperimentWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

    public CreateABTestExperimentResponse createABTestExperimentWithOptions(String appGroupIdentity, String sceneId, String groupId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateABTestExperiment", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/{sceneId}/groups/{groupId}/experiments", "json", req, runtime), new CreateABTestExperimentResponse());
    }

    public CreateABTestGroupResponse createABTestGroup(String appGroupIdentity, String sceneId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createABTestGroupWithOptions(appGroupIdentity, sceneId, headers, runtime);
    }

    public CreateABTestGroupResponse createABTestGroupWithOptions(String appGroupIdentity, String sceneId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateABTestGroup", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/{sceneId}/groups", "json", req, runtime), new CreateABTestGroupResponse());
    }

    public CreateABTestSceneResponse createABTestScene(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createABTestSceneWithOptions(appGroupIdentity, headers, runtime);
    }

    public CreateABTestSceneResponse createABTestSceneWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateABTestScene", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes", "json", req, runtime), new CreateABTestSceneResponse());
    }

    public CreateAppResponse createApp(String appGroupIdentity, CreateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public CreateAppResponse createAppWithOptions(String appGroupIdentity, CreateAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateApp", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps", "json", req, runtime), new CreateAppResponse());
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
        return TeaModel.toModel(this.doROARequest("CreateAppGroup", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups", "json", req, runtime), new CreateAppGroupResponse());
    }

    public CreateDataCollectionResponse createDataCollection(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataCollectionWithOptions(appGroupIdentity, headers, runtime);
    }

    public CreateDataCollectionResponse createDataCollectionWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateDataCollection", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/data-collections", "json", req, runtime), new CreateDataCollectionResponse());
    }

    public CreateFirstRankResponse createFirstRank(String appGroupIdentity, String appId, CreateFirstRankRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFirstRankWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    public CreateFirstRankResponse createFirstRankWithOptions(String appGroupIdentity, String appId, CreateFirstRankRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateFirstRank", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/first-ranks", "json", req, runtime), new CreateFirstRankResponse());
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
        return TeaModel.toModel(this.doROARequest("CreateInterventionDictionary", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/intervention-dictionaries", "json", req, runtime), new CreateInterventionDictionaryResponse());
    }

    public CreateModelResponse createModel(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModelWithOptions(appGroupIdentity, headers, runtime);
    }

    public CreateModelResponse createModelWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateModel", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models", "json", req, runtime), new CreateModelResponse());
    }

    public CreateQueryProcessorResponse createQueryProcessor(String appGroupIdentity, String appId, CreateQueryProcessorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createQueryProcessorWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    public CreateQueryProcessorResponse createQueryProcessorWithOptions(String appGroupIdentity, String appId, CreateQueryProcessorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateQueryProcessor", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/query-processors", "json", req, runtime), new CreateQueryProcessorResponse());
    }

    public CreateScheduledTaskResponse createScheduledTask(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createScheduledTaskWithOptions(appGroupIdentity, headers, runtime);
    }

    public CreateScheduledTaskResponse createScheduledTaskWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateScheduledTask", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scheduled-tasks", "json", req, runtime), new CreateScheduledTaskResponse());
    }

    public CreateSecondRankResponse createSecondRank(String appGroupIdentity, String appId, CreateSecondRankRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSecondRankWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    public CreateSecondRankResponse createSecondRankWithOptions(String appGroupIdentity, String appId, CreateSecondRankRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateSecondRank", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/second-ranks", "json", req, runtime), new CreateSecondRankResponse());
    }

    public CreateSortScriptResponse createSortScript(String appGroupIdentity, String appVersionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSortScriptWithOptions(appGroupIdentity, appVersionId, headers, runtime);
    }

    public CreateSortScriptResponse createSortScriptWithOptions(String appGroupIdentity, String appVersionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateSortScript", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appVersionId}/sort-scripts", "json", req, runtime), new CreateSortScriptResponse());
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
        return TeaModel.toModel(this.doROARequest("CreateUserAnalyzer", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/user-analyzers", "json", req, runtime), new CreateUserAnalyzerResponse());
    }

    public DeleteABTestExperimentResponse deleteABTestExperiment(String appGroupIdentity, String sceneId, String groupId, String experimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteABTestExperimentWithOptions(appGroupIdentity, sceneId, groupId, experimentId, headers, runtime);
    }

    public DeleteABTestExperimentResponse deleteABTestExperimentWithOptions(String appGroupIdentity, String sceneId, String groupId, String experimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteABTestExperiment", "2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/{sceneId}/groups/{groupId}/experiments/{experimentId}", "json", req, runtime), new DeleteABTestExperimentResponse());
    }

    public DeleteABTestGroupResponse deleteABTestGroup(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteABTestGroupWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

    public DeleteABTestGroupResponse deleteABTestGroupWithOptions(String appGroupIdentity, String sceneId, String groupId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteABTestGroup", "2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/{sceneId}/groups/{groupId}", "json", req, runtime), new DeleteABTestGroupResponse());
    }

    public DeleteABTestSceneResponse deleteABTestScene(String appGroupIdentity, String sceneId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteABTestSceneWithOptions(appGroupIdentity, sceneId, headers, runtime);
    }

    public DeleteABTestSceneResponse deleteABTestSceneWithOptions(String appGroupIdentity, String sceneId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteABTestScene", "2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/{sceneId}", "json", req, runtime), new DeleteABTestSceneResponse());
    }

    public DeleteModelResponse deleteModel(String appGroupIdentity, String modelName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelWithOptions(appGroupIdentity, modelName, headers, runtime);
    }

    public DeleteModelResponse deleteModelWithOptions(String appGroupIdentity, String modelName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteModel", "2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models/{modelName}", "json", req, runtime), new DeleteModelResponse());
    }

    public DeleteSortScriptResponse deleteSortScript(String appGroupIdentity, String scriptName, String appVersionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, headers, runtime);
    }

    public DeleteSortScriptResponse deleteSortScriptWithOptions(String appGroupIdentity, String scriptName, String appVersionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteSortScript", "2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appVersionId}/sort-scripts/{scriptName}", "json", req, runtime), new DeleteSortScriptResponse());
    }

    public DeleteSortScriptFileResponse deleteSortScriptFile(String appGroupIdentity, String appVersionId, String scriptName, String fileName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSortScriptFileWithOptions(appGroupIdentity, appVersionId, scriptName, fileName, headers, runtime);
    }

    public DeleteSortScriptFileResponse deleteSortScriptFileWithOptions(String appGroupIdentity, String appVersionId, String scriptName, String fileName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteSortScriptFile", "2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appVersionId}/sort-scripts/{scriptName}/files/src/{fileName}", "json", req, runtime), new DeleteSortScriptFileResponse());
    }

    public DescribeABTestExperimentResponse describeABTestExperiment(String appGroupIdentity, String sceneId, String groupId, String experimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeABTestExperimentWithOptions(appGroupIdentity, sceneId, groupId, experimentId, headers, runtime);
    }

    public DescribeABTestExperimentResponse describeABTestExperimentWithOptions(String appGroupIdentity, String sceneId, String groupId, String experimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeABTestExperiment", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/{sceneId}/groups/{groupId}/experiments/{experimentId}", "json", req, runtime), new DescribeABTestExperimentResponse());
    }

    public DescribeABTestGroupResponse describeABTestGroup(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeABTestGroupWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

    public DescribeABTestGroupResponse describeABTestGroupWithOptions(String appGroupIdentity, String sceneId, String groupId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeABTestGroup", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/{sceneId}/groups/{groupId}", "json", req, runtime), new DescribeABTestGroupResponse());
    }

    public DescribeABTestSceneResponse describeABTestScene(String appGroupIdentity, String sceneId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeABTestSceneWithOptions(appGroupIdentity, sceneId, headers, runtime);
    }

    public DescribeABTestSceneResponse describeABTestSceneWithOptions(String appGroupIdentity, String sceneId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeABTestScene", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/{sceneId}", "json", req, runtime), new DescribeABTestSceneResponse());
    }

    public DescribeAppResponse describeApp(String appGroupIdentity, String appId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    public DescribeAppResponse describeAppWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeApp", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}", "json", req, runtime), new DescribeAppResponse());
    }

    public DescribeAppGroupResponse describeAppGroup(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppGroupWithOptions(appGroupIdentity, headers, runtime);
    }

    public DescribeAppGroupResponse describeAppGroupWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeAppGroup", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "", "json", req, runtime), new DescribeAppGroupResponse());
    }

    public DescribeAppGroupDataReportResponse describeAppGroupDataReport(String appGroupIdentity, DescribeAppGroupDataReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppGroupDataReportWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public DescribeAppGroupDataReportResponse describeAppGroupDataReportWithOptions(String appGroupIdentity, DescribeAppGroupDataReportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeAppGroupDataReport", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/data-report", "json", req, runtime), new DescribeAppGroupDataReportResponse());
    }

    public DescribeAppsResponse describeApps(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppsWithOptions(appGroupIdentity, headers, runtime);
    }

    public DescribeAppsResponse describeAppsWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeApps", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps", "json", req, runtime), new DescribeAppsResponse());
    }

    public DescribeAppStatisticsResponse describeAppStatistics(String appGroupIdentity, String appId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppStatisticsWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    public DescribeAppStatisticsResponse describeAppStatisticsWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeAppStatistics", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/statistics", "json", req, runtime), new DescribeAppStatisticsResponse());
    }

    public DescribeDataCollctionResponse describeDataCollction(String appGroupIdentity, String dataCollectionIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDataCollctionWithOptions(appGroupIdentity, dataCollectionIdentity, headers, runtime);
    }

    public DescribeDataCollctionResponse describeDataCollctionWithOptions(String appGroupIdentity, String dataCollectionIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeDataCollction", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/data-collections/{dataCollectionIdentity}", "json", req, runtime), new DescribeDataCollctionResponse());
    }

    public DescribeFirstRankResponse describeFirstRank(String appGroupIdentity, String appId, String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeFirstRankWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    public DescribeFirstRankResponse describeFirstRankWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeFirstRank", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/first-ranks/{name}", "json", req, runtime), new DescribeFirstRankResponse());
    }

    public DescribeInterventionDictionaryResponse describeInterventionDictionary(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInterventionDictionaryWithOptions(name, headers, runtime);
    }

    public DescribeInterventionDictionaryResponse describeInterventionDictionaryWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeInterventionDictionary", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/intervention-dictionaries/" + name + "", "json", req, runtime), new DescribeInterventionDictionaryResponse());
    }

    public DescribeModelResponse describeModel(String appGroupIdentity, String modelName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeModelWithOptions(appGroupIdentity, modelName, headers, runtime);
    }

    public DescribeModelResponse describeModelWithOptions(String appGroupIdentity, String modelName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeModel", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models/{modelName}", "json", req, runtime), new DescribeModelResponse());
    }

    public DescribeQueryProcessorResponse describeQueryProcessor(String appGroupIdentity, String appId, String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQueryProcessorWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    public DescribeQueryProcessorResponse describeQueryProcessorWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeQueryProcessor", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/query-processors/{name}", "json", req, runtime), new DescribeQueryProcessorResponse());
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
        return TeaModel.toModel(this.doROARequest("DescribeRegion", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/region", "json", req, runtime), new DescribeRegionResponse());
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
        return TeaModel.toModel(this.doROARequest("DescribeRegions", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/regions", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeScheduledTaskResponse describeScheduledTask(String appGroupIdentity, String taskId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeScheduledTaskWithOptions(appGroupIdentity, taskId, headers, runtime);
    }

    public DescribeScheduledTaskResponse describeScheduledTaskWithOptions(String appGroupIdentity, String taskId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeScheduledTask", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scheduled-tasks/{taskId}", "json", req, runtime), new DescribeScheduledTaskResponse());
    }

    public DescribeSecondRankResponse describeSecondRank(String appGroupIdentity, String appId, String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSecondRankWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    public DescribeSecondRankResponse describeSecondRankWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeSecondRank", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/second-ranks/{name}", "json", req, runtime), new DescribeSecondRankResponse());
    }

    public DescribeSlowQueryStatusResponse describeSlowQueryStatus(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSlowQueryStatusWithOptions(appGroupIdentity, headers, runtime);
    }

    public DescribeSlowQueryStatusResponse describeSlowQueryStatusWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeSlowQueryStatus", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/optimizers/slow-query", "json", req, runtime), new DescribeSlowQueryStatusResponse());
    }

    public DescribeUserAnalyzerResponse describeUserAnalyzer(String name, DescribeUserAnalyzerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUserAnalyzerWithOptions(name, request, headers, runtime);
    }

    public DescribeUserAnalyzerResponse describeUserAnalyzerWithOptions(String name, DescribeUserAnalyzerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.with)) {
            query.put("with", request.with);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeUserAnalyzer", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/user-analyzers/" + name + "", "json", req, runtime), new DescribeUserAnalyzerResponse());
    }

    public DisableSlowQueryResponse disableSlowQuery(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableSlowQueryWithOptions(appGroupIdentity, headers, runtime);
    }

    public DisableSlowQueryResponse disableSlowQueryWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DisableSlowQuery", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/optimizers/slow-query/actions/disable", "json", req, runtime), new DisableSlowQueryResponse());
    }

    public EnableSlowQueryResponse enableSlowQuery(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSlowQueryWithOptions(appGroupIdentity, headers, runtime);
    }

    public EnableSlowQueryResponse enableSlowQueryWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("EnableSlowQuery", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/optimizers/slow-query/actions/enable", "json", req, runtime), new EnableSlowQueryResponse());
    }

    public GetModelProgressResponse getModelProgress(String appGroupIdentity, String modelName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelProgressWithOptions(appGroupIdentity, modelName, headers, runtime);
    }

    public GetModelProgressResponse getModelProgressWithOptions(String appGroupIdentity, String modelName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetModelProgress", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models/{modelName}/progress", "json", req, runtime), new GetModelProgressResponse());
    }

    public GetModelReportResponse getModelReport(String appGroupIdentity, String modelName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelReportWithOptions(appGroupIdentity, modelName, headers, runtime);
    }

    public GetModelReportResponse getModelReportWithOptions(String appGroupIdentity, String modelName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetModelReport", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models/{modelName}/report", "json", req, runtime), new GetModelReportResponse());
    }

    public GetScriptFileNamesResponse getScriptFileNames(String appGroupIdentity, String appVersionId, String scriptName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getScriptFileNamesWithOptions(appGroupIdentity, appVersionId, scriptName, headers, runtime);
    }

    public GetScriptFileNamesResponse getScriptFileNamesWithOptions(String appGroupIdentity, String appVersionId, String scriptName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetScriptFileNames", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appVersionId}/sort-scripts/{scriptName}/file-names", "json", req, runtime), new GetScriptFileNamesResponse());
    }

    public GetSortScriptResponse getSortScript(String appGroupIdentity, String scriptName, String appVersionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, headers, runtime);
    }

    public GetSortScriptResponse getSortScriptWithOptions(String appGroupIdentity, String scriptName, String appVersionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetSortScript", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appVersionId}/sort-scripts/{scriptName}", "json", req, runtime), new GetSortScriptResponse());
    }

    public GetSortScriptFileResponse getSortScriptFile(String appGroupIdentity, String scriptName, String appVersionId, String fileName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSortScriptFileWithOptions(appGroupIdentity, scriptName, appVersionId, fileName, headers, runtime);
    }

    public GetSortScriptFileResponse getSortScriptFileWithOptions(String appGroupIdentity, String scriptName, String appVersionId, String fileName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetSortScriptFile", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appVersionId}/sort-scripts/{scriptName}/files/src/{fileName}", "json", req, runtime), new GetSortScriptFileResponse());
    }

    public GetValidationErrorResponse getValidationError(String appGroupIdentity, GetValidationErrorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getValidationErrorWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public GetValidationErrorResponse getValidationErrorWithOptions(String appGroupIdentity, GetValidationErrorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.errorCode)) {
            query.put("errorCode", request.errorCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetValidationError", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/data/validation-error", "json", req, runtime), new GetValidationErrorResponse());
    }

    public GetValidationReportResponse getValidationReport(String appGroupIdentity, GetValidationReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getValidationReportWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public GetValidationReportResponse getValidationReportWithOptions(String appGroupIdentity, GetValidationReportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetValidationReport", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/data/validation-report", "json", req, runtime), new GetValidationReportResponse());
    }

    public ListABTestExperimentsResponse listABTestExperiments(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestExperimentsWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

    public ListABTestExperimentsResponse listABTestExperimentsWithOptions(String appGroupIdentity, String sceneId, String groupId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListABTestExperiments", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/{sceneId}/groups/{groupId}/experiments", "json", req, runtime), new ListABTestExperimentsResponse());
    }

    public ListABTestFixedFlowDividersResponse listABTestFixedFlowDividers(String appGroupIdentity, String sceneId, String groupId, String experimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestFixedFlowDividersWithOptions(appGroupIdentity, sceneId, groupId, experimentId, headers, runtime);
    }

    public ListABTestFixedFlowDividersResponse listABTestFixedFlowDividersWithOptions(String appGroupIdentity, String sceneId, String groupId, String experimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListABTestFixedFlowDividers", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/{sceneId}/groups/{groupId}/experiments/{experimentId}/fixed-flow-dividers", "json", req, runtime), new ListABTestFixedFlowDividersResponse());
    }

    public ListABTestGroupsResponse listABTestGroups(String appGroupIdentity, String sceneId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestGroupsWithOptions(appGroupIdentity, sceneId, headers, runtime);
    }

    public ListABTestGroupsResponse listABTestGroupsWithOptions(String appGroupIdentity, String sceneId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListABTestGroups", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/{sceneId}/groups", "json", req, runtime), new ListABTestGroupsResponse());
    }

    public ListABTestMetricsResponse listABTestMetrics(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestMetricsWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

    public ListABTestMetricsResponse listABTestMetricsWithOptions(String appGroupIdentity, String sceneId, String groupId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListABTestMetrics", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/{sceneId}/groups/{groupId}/metrics", "json", req, runtime), new ListABTestMetricsResponse());
    }

    public ListABTestScenesResponse listABTestScenes(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABTestScenesWithOptions(appGroupIdentity, headers, runtime);
    }

    public ListABTestScenesResponse listABTestScenesWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListABTestScenes", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes", "json", req, runtime), new ListABTestScenesResponse());
    }

    public ListAppGroupErrorsResponse listAppGroupErrors(String appGroupIdentity, ListAppGroupErrorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppGroupErrorsWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public ListAppGroupErrorsResponse listAppGroupErrorsWithOptions(String appGroupIdentity, ListAppGroupErrorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopTime)) {
            query.put("stopTime", request.stopTime);
        }

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
        return TeaModel.toModel(this.doROARequest("ListAppGroupErrors", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/errors", "json", req, runtime), new ListAppGroupErrorsResponse());
    }

    public ListAppGroupMetricsResponse listAppGroupMetrics(String appGroupIdentity, ListAppGroupMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppGroupMetricsWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public ListAppGroupMetricsResponse listAppGroupMetricsWithOptions(String appGroupIdentity, ListAppGroupMetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("metricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexes)) {
            query.put("indexes", request.indexes);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListAppGroupMetrics", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/metrics", "json", req, runtime), new ListAppGroupMetricsResponse());
    }

    public ListAppGroupsResponse listAppGroups(ListAppGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppGroupsWithOptions(request, headers, runtime);
    }

    public ListAppGroupsResponse listAppGroupsWithOptions(ListAppGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("sortBy", request.sortBy);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListAppGroups", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups", "json", req, runtime), new ListAppGroupsResponse());
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
        return TeaModel.toModel(this.doROARequest("ListApps", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/apps", "none", req, runtime), new ListAppsResponse());
    }

    public ListDataCollectionsResponse listDataCollections(String appGroupIdentity, ListDataCollectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataCollectionsWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public ListDataCollectionsResponse listDataCollectionsWithOptions(String appGroupIdentity, ListDataCollectionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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
        return TeaModel.toModel(this.doROARequest("ListDataCollections", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/data-collections", "json", req, runtime), new ListDataCollectionsResponse());
    }

    public ListDeployedAlgorithmModelsResponse listDeployedAlgorithmModels(String appGroupIdentity, ListDeployedAlgorithmModelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeployedAlgorithmModelsWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public ListDeployedAlgorithmModelsResponse listDeployedAlgorithmModelsWithOptions(String appGroupIdentity, ListDeployedAlgorithmModelsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inServiceOnly)) {
            query.put("inServiceOnly", request.inServiceOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithmType)) {
            query.put("algorithmType", request.algorithmType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListDeployedAlgorithmModels", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/deployed-algorithm-models", "json", req, runtime), new ListDeployedAlgorithmModelsResponse());
    }

    public ListFirstRanksResponse listFirstRanks(String appGroupIdentity, String appId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFirstRanksWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    public ListFirstRanksResponse listFirstRanksWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListFirstRanks", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/first-ranks", "json", req, runtime), new ListFirstRanksResponse());
    }

    public ListInterventionDictionariesResponse listInterventionDictionaries(ListInterventionDictionariesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInterventionDictionariesWithOptions(request, headers, runtime);
    }

    public ListInterventionDictionariesResponse listInterventionDictionariesWithOptions(ListInterventionDictionariesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            query.put("types", request.types);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListInterventionDictionaries", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/intervention-dictionaries", "json", req, runtime), new ListInterventionDictionariesResponse());
    }

    public ListInterventionDictionaryEntriesResponse listInterventionDictionaryEntries(String name, ListInterventionDictionaryEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInterventionDictionaryEntriesWithOptions(name, request, headers, runtime);
    }

    public ListInterventionDictionaryEntriesResponse listInterventionDictionaryEntriesWithOptions(String name, ListInterventionDictionaryEntriesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.word)) {
            query.put("word", request.word);
        }

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
        return TeaModel.toModel(this.doROARequest("ListInterventionDictionaryEntries", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/intervention-dictionaries/" + name + "/entries", "json", req, runtime), new ListInterventionDictionaryEntriesResponse());
    }

    public ListInterventionDictionaryNerResultsResponse listInterventionDictionaryNerResults(String name, ListInterventionDictionaryNerResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInterventionDictionaryNerResultsWithOptions(name, request, headers, runtime);
    }

    public ListInterventionDictionaryNerResultsResponse listInterventionDictionaryNerResultsWithOptions(String name, ListInterventionDictionaryNerResultsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListInterventionDictionaryNerResults", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/intervention-dictionaries/" + name + "/ner-results", "json", req, runtime), new ListInterventionDictionaryNerResultsResponse());
    }

    public ListInterventionDictionaryRelatedEntitiesResponse listInterventionDictionaryRelatedEntities(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInterventionDictionaryRelatedEntitiesWithOptions(name, headers, runtime);
    }

    public ListInterventionDictionaryRelatedEntitiesResponse listInterventionDictionaryRelatedEntitiesWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListInterventionDictionaryRelatedEntities", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/intervention-dictionaries/" + name + "/related", "json", req, runtime), new ListInterventionDictionaryRelatedEntitiesResponse());
    }

    public ListModelsResponse listModels(String appGroupIdentity, ListModelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModelsWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public ListModelsResponse listModelsWithOptions(String appGroupIdentity, ListModelsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListModels", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models", "json", req, runtime), new ListModelsResponse());
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
        return TeaModel.toModel(this.doROARequest("ListQueryProcessorNers", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/query-processor/ner/default-priorities", "json", req, runtime), new ListQueryProcessorNersResponse());
    }

    public ListQueryProcessorsResponse listQueryProcessors(String appGroupIdentity, String appId, ListQueryProcessorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQueryProcessorsWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    public ListQueryProcessorsResponse listQueryProcessorsWithOptions(String appGroupIdentity, String appId, ListQueryProcessorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isActive)) {
            query.put("isActive", request.isActive);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListQueryProcessors", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/query-processors", "json", req, runtime), new ListQueryProcessorsResponse());
    }

    public ListScheduledTasksResponse listScheduledTasks(String appGroupIdentity, ListScheduledTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listScheduledTasksWithOptions(appGroupIdentity, request, headers, runtime);
    }

    public ListScheduledTasksResponse listScheduledTasksWithOptions(String appGroupIdentity, ListScheduledTasksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

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
        return TeaModel.toModel(this.doROARequest("ListScheduledTasks", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scheduled-tasks", "json", req, runtime), new ListScheduledTasksResponse());
    }

    public ListSecondRanksResponse listSecondRanks(String appGroupIdentity, String appId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSecondRanksWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    public ListSecondRanksResponse listSecondRanksWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListSecondRanks", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/second-ranks", "json", req, runtime), new ListSecondRanksResponse());
    }

    public ListSlowQueryCategoriesResponse listSlowQueryCategories(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSlowQueryCategoriesWithOptions(appGroupIdentity, headers, runtime);
    }

    public ListSlowQueryCategoriesResponse listSlowQueryCategoriesWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListSlowQueryCategories", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/optimizers/slow-query/categories", "json", req, runtime), new ListSlowQueryCategoriesResponse());
    }

    public ListSlowQueryQueriesResponse listSlowQueryQueries(String appGroupIdentity, String categoryIndex) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSlowQueryQueriesWithOptions(appGroupIdentity, categoryIndex, headers, runtime);
    }

    public ListSlowQueryQueriesResponse listSlowQueryQueriesWithOptions(String appGroupIdentity, String categoryIndex, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListSlowQueryQueries", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/optimizers/slow-query/categories/{categoryIndex}/queries", "json", req, runtime), new ListSlowQueryQueriesResponse());
    }

    public ListSortExpressionsResponse listSortExpressions(String appGroupIdentity, String appId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSortExpressionsWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    public ListSortExpressionsResponse listSortExpressionsWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListSortExpressions", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/sort-expressions", "json", req, runtime), new ListSortExpressionsResponse());
    }

    public ListSortScriptsResponse listSortScripts(String appGroupIdentity, String appVersionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSortScriptsWithOptions(appGroupIdentity, appVersionId, headers, runtime);
    }

    public ListSortScriptsResponse listSortScriptsWithOptions(String appGroupIdentity, String appVersionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListSortScripts", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appVersionId}/sort-scripts", "json", req, runtime), new ListSortScriptsResponse());
    }

    public ListStatisticLogsResponse listStatisticLogs(String appGroupIdentity, String moduleName, ListStatisticLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStatisticLogsWithOptions(appGroupIdentity, moduleName, request, headers, runtime);
    }

    public ListStatisticLogsResponse listStatisticLogsWithOptions(String appGroupIdentity, String moduleName, ListStatisticLogsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopTime)) {
            query.put("stopTime", request.stopTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.distinct)) {
            query.put("distinct", request.distinct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columns)) {
            query.put("columns", request.columns);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListStatisticLogs", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/statistic-logs/{moduleName}", "json", req, runtime), new ListStatisticLogsResponse());
    }

    public ListStatisticReportResponse listStatisticReport(String appGroupIdentity, String moduleName, ListStatisticReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStatisticReportWithOptions(appGroupIdentity, moduleName, request, headers, runtime);
    }

    public ListStatisticReportResponse listStatisticReportWithOptions(String appGroupIdentity, String moduleName, ListStatisticReportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.columns)) {
            query.put("columns", request.columns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListStatisticReport", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/statistic-report/{moduleName}", "json", req, runtime), new ListStatisticReportResponse());
    }

    public ListUserAnalyzerEntriesResponse listUserAnalyzerEntries(String name, ListUserAnalyzerEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserAnalyzerEntriesWithOptions(name, request, headers, runtime);
    }

    public ListUserAnalyzerEntriesResponse listUserAnalyzerEntriesWithOptions(String name, ListUserAnalyzerEntriesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.word)) {
            query.put("word", request.word);
        }

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
        return TeaModel.toModel(this.doROARequest("ListUserAnalyzerEntries", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/user-analyzers/" + name + "/entries", "json", req, runtime), new ListUserAnalyzerEntriesResponse());
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
        return TeaModel.toModel(this.doROARequest("ListUserAnalyzers", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/user-analyzers", "json", req, runtime), new ListUserAnalyzersResponse());
    }

    public ModifyAppGroupResponse modifyAppGroup(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyAppGroupWithOptions(appGroupIdentity, headers, runtime);
    }

    public ModifyAppGroupResponse modifyAppGroupWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ModifyAppGroup", "2017-12-25", "HTTPS", "PUT", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "", "json", req, runtime), new ModifyAppGroupResponse());
    }

    public ModifyAppGroupQuotaResponse modifyAppGroupQuota(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyAppGroupQuotaWithOptions(appGroupIdentity, headers, runtime);
    }

    public ModifyAppGroupQuotaResponse modifyAppGroupQuotaWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ModifyAppGroupQuota", "2017-12-25", "HTTPS", "PUT", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/quota", "json", req, runtime), new ModifyAppGroupQuotaResponse());
    }

    public ModifyFirstRankResponse modifyFirstRank(String appGroupIdentity, String appId, String name, ModifyFirstRankRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyFirstRankWithOptions(appGroupIdentity, appId, name, request, headers, runtime);
    }

    public ModifyFirstRankResponse modifyFirstRankWithOptions(String appGroupIdentity, String appId, String name, ModifyFirstRankRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ModifyFirstRank", "2017-12-25", "HTTPS", "PUT", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/first-ranks/{name}", "json", req, runtime), new ModifyFirstRankResponse());
    }

    public ModifyModelResponse modifyModel(String appGroupIdentity, String modelName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyModelWithOptions(appGroupIdentity, modelName, headers, runtime);
    }

    public ModifyModelResponse modifyModelWithOptions(String appGroupIdentity, String modelName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ModifyModel", "2017-12-25", "HTTPS", "PUT", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models/{modelName}", "json", req, runtime), new ModifyModelResponse());
    }

    public ModifyQueryProcessorResponse modifyQueryProcessor(String appGroupIdentity, String appId, String name, ModifyQueryProcessorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyQueryProcessorWithOptions(appGroupIdentity, appId, name, request, headers, runtime);
    }

    public ModifyQueryProcessorResponse modifyQueryProcessorWithOptions(String appGroupIdentity, String appId, String name, ModifyQueryProcessorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ModifyQueryProcessor", "2017-12-25", "HTTPS", "PUT", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/query-processors/{name}", "json", req, runtime), new ModifyQueryProcessorResponse());
    }

    public ModifyScheduledTaskResponse modifyScheduledTask(String appGroupIdentity, String taskId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyScheduledTaskWithOptions(appGroupIdentity, taskId, headers, runtime);
    }

    public ModifyScheduledTaskResponse modifyScheduledTaskWithOptions(String appGroupIdentity, String taskId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ModifyScheduledTask", "2017-12-25", "HTTPS", "PUT", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scheduled-tasks/{taskId}", "json", req, runtime), new ModifyScheduledTaskResponse());
    }

    public ModifySecondRankResponse modifySecondRank(String appGroupIdentity, String appId, String name, ModifySecondRankRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifySecondRankWithOptions(appGroupIdentity, appId, name, request, headers, runtime);
    }

    public ModifySecondRankResponse modifySecondRankWithOptions(String appGroupIdentity, String appId, String name, ModifySecondRankRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ModifySecondRank", "2017-12-25", "HTTPS", "PUT", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/second-ranks/{name}", "json", req, runtime), new ModifySecondRankResponse());
    }

    public PreviewModelResponse previewModel(String appGroupIdentity, String modelName, PreviewModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewModelWithOptions(appGroupIdentity, modelName, request, headers, runtime);
    }

    public PreviewModelResponse previewModelWithOptions(String appGroupIdentity, String modelName, PreviewModelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("PreviewModel", "2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models/{modelName}/actions/preview", "json", req, runtime), new PreviewModelResponse());
    }

    public PushInterventionDictionaryEntriesResponse pushInterventionDictionaryEntries(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushInterventionDictionaryEntriesWithOptions(name, headers, runtime);
    }

    public PushInterventionDictionaryEntriesResponse pushInterventionDictionaryEntriesWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("PushInterventionDictionaryEntries", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/intervention-dictionaries/" + name + "/entries/actions/bulk", "json", req, runtime), new PushInterventionDictionaryEntriesResponse());
    }

    public PushUserAnalyzerEntriesResponse pushUserAnalyzerEntries(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushUserAnalyzerEntriesWithOptions(name, headers, runtime);
    }

    public PushUserAnalyzerEntriesResponse pushUserAnalyzerEntriesWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("PushUserAnalyzerEntries", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/user-analyzers/" + name + "/entries/actions/bulk", "json", req, runtime), new PushUserAnalyzerEntriesResponse());
    }

    public RankPreviewQueryResponse rankPreviewQuery(String appGroupIdentity, String modelName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rankPreviewQueryWithOptions(appGroupIdentity, modelName, headers, runtime);
    }

    public RankPreviewQueryResponse rankPreviewQueryWithOptions(String appGroupIdentity, String modelName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("RankPreviewQuery", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models/{modelName}/actions/query-rank", "json", req, runtime), new RankPreviewQueryResponse());
    }

    public ReleaseSortScriptResponse releaseSortScript(String appGroupIdentity, String scriptName, String appVersionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, headers, runtime);
    }

    public ReleaseSortScriptResponse releaseSortScriptWithOptions(String appGroupIdentity, String scriptName, String appVersionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ReleaseSortScript", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appVersionId}/sort-scripts/{scriptName}/actions/release", "json", req, runtime), new ReleaseSortScriptResponse());
    }

    public RemoveAppResponse removeApp(String appGroupIdentity, String appId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeAppWithOptions(appGroupIdentity, appId, headers, runtime);
    }

    public RemoveAppResponse removeAppWithOptions(String appGroupIdentity, String appId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("RemoveApp", "2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}", "json", req, runtime), new RemoveAppResponse());
    }

    public RemoveAppGroupResponse removeAppGroup(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeAppGroupWithOptions(appGroupIdentity, headers, runtime);
    }

    public RemoveAppGroupResponse removeAppGroupWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("RemoveAppGroup", "2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "", "json", req, runtime), new RemoveAppGroupResponse());
    }

    public RemoveDataCollectionResponse removeDataCollection(String appGroupIdentity, String dataCollectionIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeDataCollectionWithOptions(appGroupIdentity, dataCollectionIdentity, headers, runtime);
    }

    public RemoveDataCollectionResponse removeDataCollectionWithOptions(String appGroupIdentity, String dataCollectionIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("RemoveDataCollection", "2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/data-collections/{dataCollectionIdentity}", "json", req, runtime), new RemoveDataCollectionResponse());
    }

    public RemoveFirstRankResponse removeFirstRank(String appGroupIdentity, String appId, String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeFirstRankWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    public RemoveFirstRankResponse removeFirstRankWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("RemoveFirstRank", "2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/first-ranks/{name}", "json", req, runtime), new RemoveFirstRankResponse());
    }

    public RemoveInterventionDictionaryResponse removeInterventionDictionary(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeInterventionDictionaryWithOptions(name, headers, runtime);
    }

    public RemoveInterventionDictionaryResponse removeInterventionDictionaryWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("RemoveInterventionDictionary", "2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/intervention-dictionaries/" + name + "", "json", req, runtime), new RemoveInterventionDictionaryResponse());
    }

    public RemoveQueryProcessorResponse removeQueryProcessor(String appGroupIdentity, String appId, String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeQueryProcessorWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    public RemoveQueryProcessorResponse removeQueryProcessorWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("RemoveQueryProcessor", "2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/query-processors/{name}", "json", req, runtime), new RemoveQueryProcessorResponse());
    }

    public RemoveScheduledTaskResponse removeScheduledTask(String appGroupIdentity, String taskId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeScheduledTaskWithOptions(appGroupIdentity, taskId, headers, runtime);
    }

    public RemoveScheduledTaskResponse removeScheduledTaskWithOptions(String appGroupIdentity, String taskId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("RemoveScheduledTask", "2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scheduled-tasks/{taskId}", "json", req, runtime), new RemoveScheduledTaskResponse());
    }

    public RemoveSecondRankResponse removeSecondRank(String appGroupIdentity, String appId, String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeSecondRankWithOptions(appGroupIdentity, appId, name, headers, runtime);
    }

    public RemoveSecondRankResponse removeSecondRankWithOptions(String appGroupIdentity, String appId, String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("RemoveSecondRank", "2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/second-ranks/{name}", "json", req, runtime), new RemoveSecondRankResponse());
    }

    public RemoveUserAnalyzerResponse removeUserAnalyzer(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeUserAnalyzerWithOptions(name, headers, runtime);
    }

    public RemoveUserAnalyzerResponse removeUserAnalyzerWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("RemoveUserAnalyzer", "2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/user-analyzers/" + name + "", "json", req, runtime), new RemoveUserAnalyzerResponse());
    }

    public RenewAppGroupResponse renewAppGroup(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renewAppGroupWithOptions(appGroupIdentity, headers, runtime);
    }

    public RenewAppGroupResponse renewAppGroupWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("RenewAppGroup", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/actions/renew", "json", req, runtime), new RenewAppGroupResponse());
    }

    public ReplaceAppGroupCommodityCodeResponse replaceAppGroupCommodityCode(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceAppGroupCommodityCodeWithOptions(appGroupIdentity, headers, runtime);
    }

    public ReplaceAppGroupCommodityCodeResponse replaceAppGroupCommodityCodeWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ReplaceAppGroupCommodityCode", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/actions/to-instance-typed", "json", req, runtime), new ReplaceAppGroupCommodityCodeResponse());
    }

    public SaveSortScriptFileResponse saveSortScriptFile(String appGroupIdentity, String scriptName, String appVersionId, String fileName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveSortScriptFileWithOptions(appGroupIdentity, scriptName, appVersionId, fileName, headers, runtime);
    }

    public SaveSortScriptFileResponse saveSortScriptFileWithOptions(String appGroupIdentity, String scriptName, String appVersionId, String fileName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("SaveSortScriptFile", "2017-12-25", "HTTPS", "PUT", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appVersionId}/sort-scripts/{scriptName}/files/src/{fileName}", "json", req, runtime), new SaveSortScriptFileResponse());
    }

    public StartSlowQueryAnalyzerResponse startSlowQueryAnalyzer(String appGroupIdentity) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startSlowQueryAnalyzerWithOptions(appGroupIdentity, headers, runtime);
    }

    public StartSlowQueryAnalyzerResponse startSlowQueryAnalyzerWithOptions(String appGroupIdentity, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("StartSlowQueryAnalyzer", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/optimizers/slow-query/actions/run", "json", req, runtime), new StartSlowQueryAnalyzerResponse());
    }

    public TrainModelResponse trainModel(String appGroupIdentity, String modelName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.trainModelWithOptions(appGroupIdentity, modelName, headers, runtime);
    }

    public TrainModelResponse trainModelWithOptions(String appGroupIdentity, String modelName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("TrainModel", "2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/algorithm/models/{modelName}/actions/train", "json", req, runtime), new TrainModelResponse());
    }

    public UpdateABTestExperimentResponse updateABTestExperiment(String appGroupIdentity, String sceneId, String groupId, String experimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABTestExperimentWithOptions(appGroupIdentity, sceneId, groupId, experimentId, headers, runtime);
    }

    public UpdateABTestExperimentResponse updateABTestExperimentWithOptions(String appGroupIdentity, String sceneId, String groupId, String experimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("UpdateABTestExperiment", "2017-12-25", "HTTPS", "PUT", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/{sceneId}/groups/{groupId}/experiments/{experimentId}", "json", req, runtime), new UpdateABTestExperimentResponse());
    }

    public UpdateABTestFixedFlowDividersResponse updateABTestFixedFlowDividers(String appGroupIdentity, String sceneId, String groupId, String experimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABTestFixedFlowDividersWithOptions(appGroupIdentity, sceneId, groupId, experimentId, headers, runtime);
    }

    public UpdateABTestFixedFlowDividersResponse updateABTestFixedFlowDividersWithOptions(String appGroupIdentity, String sceneId, String groupId, String experimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("UpdateABTestFixedFlowDividers", "2017-12-25", "HTTPS", "PUT", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/{sceneId}/groups/{groupId}/experiments/{experimentId}/fixed-flow-dividers", "json", req, runtime), new UpdateABTestFixedFlowDividersResponse());
    }

    public UpdateABTestGroupResponse updateABTestGroup(String appGroupIdentity, String sceneId, String groupId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABTestGroupWithOptions(appGroupIdentity, sceneId, groupId, headers, runtime);
    }

    public UpdateABTestGroupResponse updateABTestGroupWithOptions(String appGroupIdentity, String sceneId, String groupId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("UpdateABTestGroup", "2017-12-25", "HTTPS", "PUT", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/{sceneId}/groups/{groupId}", "json", req, runtime), new UpdateABTestGroupResponse());
    }

    public UpdateABTestSceneResponse updateABTestScene(String appGroupIdentity, String sceneId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABTestSceneWithOptions(appGroupIdentity, sceneId, headers, runtime);
    }

    public UpdateABTestSceneResponse updateABTestSceneWithOptions(String appGroupIdentity, String sceneId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("UpdateABTestScene", "2017-12-25", "HTTPS", "PUT", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/scenes/{sceneId}", "json", req, runtime), new UpdateABTestSceneResponse());
    }

    public UpdateFetchFieldsResponse updateFetchFields(String appGroupIdentity, String appId, UpdateFetchFieldsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFetchFieldsWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    public UpdateFetchFieldsResponse updateFetchFieldsWithOptions(String appGroupIdentity, String appId, UpdateFetchFieldsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateFetchFields", "2017-12-25", "HTTPS", "PUT", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/fetch-fields", "json", req, runtime), new UpdateFetchFieldsResponse());
    }

    public UpdateSummariesResponse updateSummaries(String appGroupIdentity, String appId, UpdateSummariesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSummariesWithOptions(appGroupIdentity, appId, request, headers, runtime);
    }

    public UpdateSummariesResponse updateSummariesWithOptions(String appGroupIdentity, String appId, UpdateSummariesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateSummaries", "2017-12-25", "HTTPS", "PUT", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/{appId}/summaries", "json", req, runtime), new UpdateSummariesResponse());
    }
}

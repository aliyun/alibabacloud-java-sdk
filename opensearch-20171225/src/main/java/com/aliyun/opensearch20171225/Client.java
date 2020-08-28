// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225;

import com.aliyun.tea.*;
import com.aliyun.opensearch20171225.models.*;

public class Client extends com.aliyun.tearoa.Client {
    public Client(com.aliyun.tearoa.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpointHost = this.getEndpoint("opensearch", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpointHost);
    }


    public CreateModelResponse createModelWithOptions(String appGroupIdentity, CreateModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/simple-models", null, request.headers, null, runtime), new CreateModelResponse());
    }

    public CreateModelResponse createModel(String appGroupIdentity, CreateModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createModelWithOptions(appGroupIdentity, request, runtime);
    }

    public GetModelProgressResponse getModelProgressWithOptions(String appGroupIdentity, String modelId, GetModelProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/simple-models/" + modelId + "/progress", null, request.headers, null, runtime), new GetModelProgressResponse());
    }

    public GetModelProgressResponse getModelProgress(String appGroupIdentity, String modelId, GetModelProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getModelProgressWithOptions(appGroupIdentity, modelId, request, runtime);
    }

    public DescribeAppResponse describeAppWithOptions(String appGroupIdentity, String appId, DescribeAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "", null, request.headers, null, runtime), new DescribeAppResponse());
    }

    public DescribeAppResponse describeApp(String appGroupIdentity, String appId, DescribeAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppWithOptions(appGroupIdentity, appId, request, runtime);
    }

    public DescribeAppGroupResponse describeAppGroupWithOptions(String appGroupIdentity, DescribeAppGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "", null, request.headers, null, runtime), new DescribeAppGroupResponse());
    }

    public DescribeAppGroupResponse describeAppGroup(String appGroupIdentity, DescribeAppGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppGroupWithOptions(appGroupIdentity, request, runtime);
    }

    public CreateAppGroupResponse createAppGroupWithOptions(CreateAppGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups", null, request.headers, null, runtime), new CreateAppGroupResponse());
    }

    public CreateAppGroupResponse createAppGroup(CreateAppGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppGroupWithOptions(request, runtime);
    }

    public RemoveAppResponse removeAppWithOptions(String appGroupIdentity, String appId, RemoveAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appId + "", null, request.headers, null, runtime), new RemoveAppResponse());
    }

    public RemoveAppResponse removeApp(String appGroupIdentity, String appId, RemoveAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeAppWithOptions(appGroupIdentity, appId, request, runtime);
    }

    public CreateAppResponse createAppWithOptions(String appGroupIdentity, CreateAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new CreateAppResponse());
    }

    public CreateAppResponse createApp(String appGroupIdentity, CreateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppWithOptions(appGroupIdentity, request, runtime);
    }

    public ModifyAppGroupResponse modifyAppGroupWithOptions(String appGroupIdentity, ModifyAppGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "PUT", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "", null, request.headers, null, runtime), new ModifyAppGroupResponse());
    }

    public ModifyAppGroupResponse modifyAppGroup(String appGroupIdentity, ModifyAppGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppGroupWithOptions(appGroupIdentity, request, runtime);
    }

    public ModifyAppGroupQuotaResponse modifyAppGroupQuotaWithOptions(String appGroupIdentity, ModifyAppGroupQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "PUT", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/quota", null, request.headers, null, runtime), new ModifyAppGroupQuotaResponse());
    }

    public ModifyAppGroupQuotaResponse modifyAppGroupQuota(String appGroupIdentity, ModifyAppGroupQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppGroupQuotaWithOptions(appGroupIdentity, request, runtime);
    }

    public ListAppGroupsResponse listAppGroupsWithOptions(ListAppGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new ListAppGroupsResponse());
    }

    public ListAppGroupsResponse listAppGroups(ListAppGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppGroupsWithOptions(request, runtime);
    }

    public DescribeAppsResponse describeAppsWithOptions(String appGroupIdentity, DescribeAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps", null, request.headers, null, runtime), new DescribeAppsResponse());
    }

    public DescribeAppsResponse describeApps(String appGroupIdentity, DescribeAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppsWithOptions(appGroupIdentity, request, runtime);
    }

    public RemoveAppGroupResponse removeAppGroupWithOptions(String appGroupIdentity, RemoveAppGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "", null, request.headers, null, runtime), new RemoveAppGroupResponse());
    }

    public RemoveAppGroupResponse removeAppGroup(String appGroupIdentity, RemoveAppGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeAppGroupWithOptions(appGroupIdentity, request, runtime);
    }

    public ListSortScriptsResponse listSortScriptsWithOptions(String appGroupIdentity, String appVersionId, ListSortScriptsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts", null, request.headers, null, runtime), new ListSortScriptsResponse());
    }

    public ListSortScriptsResponse listSortScripts(String appGroupIdentity, String appVersionId, ListSortScriptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSortScriptsWithOptions(appGroupIdentity, appVersionId, request, runtime);
    }

    public GetSortScriptResponse getSortScriptWithOptions(String appGroupIdentity, String scriptName, String appVersionId, GetSortScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts/" + scriptName + "", null, request.headers, null, runtime), new GetSortScriptResponse());
    }

    public GetSortScriptResponse getSortScript(String appGroupIdentity, String scriptName, String appVersionId, GetSortScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, request, runtime);
    }

    public GetSortScriptFileResponse getSortScriptFileWithOptions(String appGroupIdentity, String scriptName, String appVersionId, GetSortScriptFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts/" + scriptName + "/files/src/UserScorer.cava", null, request.headers, null, runtime), new GetSortScriptFileResponse());
    }

    public GetSortScriptFileResponse getSortScriptFile(String appGroupIdentity, String scriptName, String appVersionId, GetSortScriptFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSortScriptFileWithOptions(appGroupIdentity, scriptName, appVersionId, request, runtime);
    }

    public CompileSortScriptResponse compileSortScriptWithOptions(String appGroupIdentity, String scriptName, String appVersionId, CompileSortScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts/" + scriptName + "/actions/compiling", null, request.headers, null, runtime), new CompileSortScriptResponse());
    }

    public CompileSortScriptResponse compileSortScript(String appGroupIdentity, String scriptName, String appVersionId, CompileSortScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.compileSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, request, runtime);
    }

    public DeleteSortScriptResponse deleteSortScriptWithOptions(String appGroupIdentity, String scriptName, String appVersionId, DeleteSortScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "DELETE", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts/" + scriptName + "", null, request.headers, null, runtime), new DeleteSortScriptResponse());
    }

    public DeleteSortScriptResponse deleteSortScript(String appGroupIdentity, String scriptName, String appVersionId, DeleteSortScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, request, runtime);
    }

    public CreateSortScriptResponse createSortScriptWithOptions(String appGroupIdentity, String appVersionId, CreateSortScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts", null, request.headers, null, runtime), new CreateSortScriptResponse());
    }

    public CreateSortScriptResponse createSortScript(String appGroupIdentity, String appVersionId, CreateSortScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSortScriptWithOptions(appGroupIdentity, appVersionId, request, runtime);
    }

    public SaveSortScriptFileResponse saveSortScriptFileWithOptions(String appGroupIdentity, String scriptName, String appVersionId, SaveSortScriptFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "PUT", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts/" + scriptName + "/files/src/UserScorer.cava", null, request.headers, null, runtime), new SaveSortScriptFileResponse());
    }

    public SaveSortScriptFileResponse saveSortScriptFile(String appGroupIdentity, String scriptName, String appVersionId, SaveSortScriptFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSortScriptFileWithOptions(appGroupIdentity, scriptName, appVersionId, request, runtime);
    }

    public ReleaseSortScriptResponse releaseSortScriptWithOptions(String appGroupIdentity, String scriptName, String appVersionId, ReleaseSortScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "POST", "AK", "/v4/openapi/app-groups/" + appGroupIdentity + "/apps/" + appVersionId + "/sort-scripts/" + scriptName + "/actions/release", null, request.headers, null, runtime), new ReleaseSortScriptResponse());
    }

    public ReleaseSortScriptResponse releaseSortScript(String appGroupIdentity, String scriptName, String appVersionId, ReleaseSortScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseSortScriptWithOptions(appGroupIdentity, scriptName, appVersionId, request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/regions", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public ListAppsResponse listAppsWithOptions(ListAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2017-12-25", "HTTPS", "GET", "AK", "/v4/openapi/apps", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new ListAppsResponse());
    }

    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppsWithOptions(request, runtime);
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
}

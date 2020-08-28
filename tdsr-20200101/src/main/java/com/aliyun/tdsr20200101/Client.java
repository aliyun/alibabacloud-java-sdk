// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101;

import com.aliyun.tea.*;
import com.aliyun.tdsr20200101.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "lyj.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("tdsr", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public ListMainScenesResponse listMainScenesWithOptions(ListMainScenesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListMainScenes", "HTTPS", "POST", "2020-01-01", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new ListMainScenesResponse());
    }

    public ListMainScenesResponse listMainScenes(ListMainScenesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMainScenesWithOptions(request, runtime);
    }

    public SaveHotspotTagResponse saveHotspotTagWithOptions(SaveHotspotTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SaveHotspotTag", "HTTPS", "POST", "2020-01-01", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new SaveHotspotTagResponse());
    }

    public SaveHotspotTagResponse saveHotspotTag(SaveHotspotTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveHotspotTagWithOptions(request, runtime);
    }

    public GetSceneListResponse getSceneListWithOptions(GetSceneListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSceneList", "HTTPS", "POST", "2020-01-01", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new GetSceneListResponse());
    }

    public GetSceneListResponse getSceneList(GetSceneListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSceneListWithOptions(request, runtime);
    }

    public SaveFileResponse saveFileWithOptions(SaveFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SaveFile", "HTTPS", "POST", "2020-01-01", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new SaveFileResponse());
    }

    public SaveFileResponse saveFile(SaveFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveFileWithOptions(request, runtime);
    }

    public DeleteFileResponse deleteFileWithOptions(DeleteFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteFile", "HTTPS", "POST", "2020-01-01", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DeleteFileResponse());
    }

    public DeleteFileResponse deleteFile(DeleteFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFileWithOptions(request, runtime);
    }

    public GetHotspotTagResponse getHotspotTagWithOptions(GetHotspotTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetHotspotTag", "HTTPS", "POST", "2020-01-01", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new GetHotspotTagResponse());
    }

    public GetHotspotTagResponse getHotspotTag(GetHotspotTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotspotTagWithOptions(request, runtime);
    }

    public GetPolicyResponse getPolicyWithOptions(GetPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPolicy", "HTTPS", "POST", "2020-01-01", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new GetPolicyResponse());
    }

    public GetPolicyResponse getPolicy(GetPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPolicyWithOptions(request, runtime);
    }

    public PublishHotspotResponse publishHotspotWithOptions(PublishHotspotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PublishHotspot", "HTTPS", "POST", "2020-01-01", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new PublishHotspotResponse());
    }

    public PublishHotspotResponse publishHotspot(PublishHotspotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishHotspotWithOptions(request, runtime);
    }

    public GetWindowConfigResponse getWindowConfigWithOptions(GetWindowConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetWindowConfig", "HTTPS", "POST", "2020-01-01", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new GetWindowConfigResponse());
    }

    public GetWindowConfigResponse getWindowConfig(GetWindowConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWindowConfigWithOptions(request, runtime);
    }

    public GetSceneDataResponse getSceneDataWithOptions(GetSceneDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSceneData", "HTTPS", "POST", "2020-01-01", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new GetSceneDataResponse());
    }

    public GetSceneDataResponse getSceneData(GetSceneDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSceneDataWithOptions(request, runtime);
    }

    public CheckPermissionResponse checkPermissionWithOptions(CheckPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckPermission", "HTTPS", "POST", "2020-01-01", "AK", null, TeaModel.buildMap(request), runtime), new CheckPermissionResponse());
    }

    public CheckPermissionResponse checkPermission(CheckPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkPermissionWithOptions(request, runtime);
    }

    public CheckResourceResponse checkResourceWithOptions(CheckResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckResource", "HTTPS", "POST", "2020-01-01", "AK", null, TeaModel.buildMap(request), runtime), new CheckResourceResponse());
    }

    public CheckResourceResponse checkResource(CheckResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkResourceWithOptions(request, runtime);
    }

    public CreateSceneResponse createSceneWithOptions(CreateSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateScene", "HTTPS", "POST", "2020-01-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateSceneResponse());
    }

    public CreateSceneResponse createScene(CreateSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSceneWithOptions(request, runtime);
    }

    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateProject", "HTTPS", "POST", "2020-01-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateProjectResponse());
    }

    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteProject", "HTTPS", "POST", "2020-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteProjectResponse());
    }

    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    public ListScenesResponse listScenesWithOptions(ListScenesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListScenes", "HTTPS", "POST", "2020-01-01", "AK", null, TeaModel.buildMap(request), runtime), new ListScenesResponse());
    }

    public ListScenesResponse listScenes(ListScenesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScenesWithOptions(request, runtime);
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

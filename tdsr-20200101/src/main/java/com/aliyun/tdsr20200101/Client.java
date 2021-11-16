// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101;

import com.aliyun.tea.*;
import com.aliyun.tdsr20200101.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "lyj.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("tdsr", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddMosaicsResponse addMosaicsWithOptions(AddMosaicsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddMosaics", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddMosaicsResponse());
    }

    public AddMosaicsResponse addMosaics(AddMosaicsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addMosaicsWithOptions(request, runtime);
    }

    public AddProjectResponse addProjectWithOptions(AddProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddProject", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddProjectResponse());
    }

    public AddProjectResponse addProject(AddProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addProjectWithOptions(request, runtime);
    }

    public AddRelativePositionResponse addRelativePositionWithOptions(AddRelativePositionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddRelativePosition", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddRelativePositionResponse());
    }

    public AddRelativePositionResponse addRelativePosition(AddRelativePositionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addRelativePositionWithOptions(request, runtime);
    }

    public AddSceneResponse addSceneWithOptions(AddSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddScene", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddSceneResponse());
    }

    public AddSceneResponse addScene(AddSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSceneWithOptions(request, runtime);
    }

    public AddSubSceneResponse addSubSceneWithOptions(AddSubSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddSubScene", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddSubSceneResponse());
    }

    public AddSubSceneResponse addSubScene(AddSubSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSubSceneWithOptions(request, runtime);
    }

    public CheckResourceResponse checkResourceWithOptions(CheckResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckResource", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CheckResourceResponse());
    }

    public CheckResourceResponse checkResource(CheckResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkResourceWithOptions(request, runtime);
    }

    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateProject", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateProjectResponse());
    }

    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    public CreateSceneResponse createSceneWithOptions(CreateSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateScene", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSceneResponse());
    }

    public CreateSceneResponse createScene(CreateSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSceneWithOptions(request, runtime);
    }

    public DeleteFileResponse deleteFileWithOptions(DeleteFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFile", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFileResponse());
    }

    public DeleteFileResponse deleteFile(DeleteFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFileWithOptions(request, runtime);
    }

    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteProject", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteProjectResponse());
    }

    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    public DetailProjectResponse detailProjectWithOptions(DetailProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetailProject", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DetailProjectResponse());
    }

    public DetailProjectResponse detailProject(DetailProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detailProjectWithOptions(request, runtime);
    }

    public DetailSceneResponse detailSceneWithOptions(DetailSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetailScene", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DetailSceneResponse());
    }

    public DetailSceneResponse detailScene(DetailSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detailSceneWithOptions(request, runtime);
    }

    public DetailSubSceneResponse detailSubSceneWithOptions(DetailSubSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetailSubScene", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DetailSubSceneResponse());
    }

    public DetailSubSceneResponse detailSubScene(DetailSubSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detailSubSceneWithOptions(request, runtime);
    }

    public DropProjectResponse dropProjectWithOptions(DropProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DropProject", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DropProjectResponse());
    }

    public DropProjectResponse dropProject(DropProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dropProjectWithOptions(request, runtime);
    }

    public DropSceneResponse dropSceneWithOptions(DropSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DropScene", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DropSceneResponse());
    }

    public DropSceneResponse dropScene(DropSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dropSceneWithOptions(request, runtime);
    }

    public DropSubSceneResponse dropSubSceneWithOptions(DropSubSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DropSubScene", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DropSubSceneResponse());
    }

    public DropSubSceneResponse dropSubScene(DropSubSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dropSubSceneWithOptions(request, runtime);
    }

    public GetConnDataResponse getConnDataWithOptions(GetConnDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConnData", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetConnDataResponse());
    }

    public GetConnDataResponse getConnData(GetConnDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConnDataWithOptions(request, runtime);
    }

    public GetHotspotConfigResponse getHotspotConfigWithOptions(GetHotspotConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHotspotConfig", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetHotspotConfigResponse());
    }

    public GetHotspotConfigResponse getHotspotConfig(GetHotspotConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotspotConfigWithOptions(request, runtime);
    }

    public GetHotspotSceneDataResponse getHotspotSceneDataWithOptions(GetHotspotSceneDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHotspotSceneData", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetHotspotSceneDataResponse());
    }

    public GetHotspotSceneDataResponse getHotspotSceneData(GetHotspotSceneDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotspotSceneDataWithOptions(request, runtime);
    }

    public GetHotspotTagResponse getHotspotTagWithOptions(GetHotspotTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHotspotTag", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetHotspotTagResponse());
    }

    public GetHotspotTagResponse getHotspotTag(GetHotspotTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotspotTagWithOptions(request, runtime);
    }

    public GetLayoutDataResponse getLayoutDataWithOptions(GetLayoutDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLayoutData", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetLayoutDataResponse());
    }

    public GetLayoutDataResponse getLayoutData(GetLayoutDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLayoutDataWithOptions(request, runtime);
    }

    public GetOriginLayoutDataResponse getOriginLayoutDataWithOptions(GetOriginLayoutDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOriginLayoutData", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetOriginLayoutDataResponse());
    }

    public GetOriginLayoutDataResponse getOriginLayoutData(GetOriginLayoutDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOriginLayoutDataWithOptions(request, runtime);
    }

    public GetOssPolicyResponse getOssPolicyWithOptions(GetOssPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOssPolicy", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetOssPolicyResponse());
    }

    public GetOssPolicyResponse getOssPolicy(GetOssPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOssPolicyWithOptions(request, runtime);
    }

    public GetPolicyResponse getPolicyWithOptions(GetPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPolicy", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetPolicyResponse());
    }

    public GetPolicyResponse getPolicy(GetPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPolicyWithOptions(request, runtime);
    }

    public GetRectifyImageResponse getRectifyImageWithOptions(GetRectifyImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRectifyImage", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetRectifyImageResponse());
    }

    public GetRectifyImageResponse getRectifyImage(GetRectifyImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRectifyImageWithOptions(request, runtime);
    }

    public GetSceneBuildTaskStatusResponse getSceneBuildTaskStatusWithOptions(GetSceneBuildTaskStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSceneBuildTaskStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetSceneBuildTaskStatusResponse());
    }

    public GetSceneBuildTaskStatusResponse getSceneBuildTaskStatus(GetSceneBuildTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSceneBuildTaskStatusWithOptions(request, runtime);
    }

    public GetScenePreviewInfoResponse getScenePreviewInfoWithOptions(GetScenePreviewInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetScenePreviewInfo", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetScenePreviewInfoResponse());
    }

    public GetScenePreviewInfoResponse getScenePreviewInfo(GetScenePreviewInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getScenePreviewInfoWithOptions(request, runtime);
    }

    public GetSingleConnDataResponse getSingleConnDataWithOptions(GetSingleConnDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSingleConnData", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetSingleConnDataResponse());
    }

    public GetSingleConnDataResponse getSingleConnData(GetSingleConnDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSingleConnDataWithOptions(request, runtime);
    }

    public GetSubSceneTaskStatusResponse getSubSceneTaskStatusWithOptions(GetSubSceneTaskStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSubSceneTaskStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetSubSceneTaskStatusResponse());
    }

    public GetSubSceneTaskStatusResponse getSubSceneTaskStatus(GetSubSceneTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSubSceneTaskStatusWithOptions(request, runtime);
    }

    public GetTaskStatusResponse getTaskStatusWithOptions(GetTaskStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTaskStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetTaskStatusResponse());
    }

    public GetTaskStatusResponse getTaskStatus(GetTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaskStatusWithOptions(request, runtime);
    }

    public GetWindowConfigResponse getWindowConfigWithOptions(GetWindowConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetWindowConfig", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetWindowConfigResponse());
    }

    public GetWindowConfigResponse getWindowConfig(GetWindowConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWindowConfigWithOptions(request, runtime);
    }

    public LabelBuildResponse labelBuildWithOptions(LabelBuildRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LabelBuild", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new LabelBuildResponse());
    }

    public LabelBuildResponse labelBuild(LabelBuildRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.labelBuildWithOptions(request, runtime);
    }

    public LinkImageResponse linkImageWithOptions(LinkImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LinkImage", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new LinkImageResponse());
    }

    public LinkImageResponse linkImage(LinkImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.linkImageWithOptions(request, runtime);
    }

    public ListProjectResponse listProjectWithOptions(ListProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListProject", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListProjectResponse());
    }

    public ListProjectResponse listProject(ListProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProjectWithOptions(request, runtime);
    }

    public ListSceneResponse listSceneWithOptions(ListSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListScene", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListSceneResponse());
    }

    public ListSceneResponse listScene(ListSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSceneWithOptions(request, runtime);
    }

    public ListScenesResponse listScenesWithOptions(ListScenesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListScenes", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListScenesResponse());
    }

    public ListScenesResponse listScenes(ListScenesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listScenesWithOptions(request, runtime);
    }

    public ListSubSceneResponse listSubSceneWithOptions(ListSubSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSubScene", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListSubSceneResponse());
    }

    public ListSubSceneResponse listSubScene(ListSubSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSubSceneWithOptions(request, runtime);
    }

    public OptimizeRightAngleResponse optimizeRightAngleWithOptions(OptimizeRightAngleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OptimizeRightAngle", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new OptimizeRightAngleResponse());
    }

    public OptimizeRightAngleResponse optimizeRightAngle(OptimizeRightAngleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.optimizeRightAngleWithOptions(request, runtime);
    }

    public PredImageResponse predImageWithOptions(PredImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PredImage", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PredImageResponse());
    }

    public PredImageResponse predImage(PredImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.predImageWithOptions(request, runtime);
    }

    public PredictionWallLineResponse predictionWallLineWithOptions(PredictionWallLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PredictionWallLine", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PredictionWallLineResponse());
    }

    public PredictionWallLineResponse predictionWallLine(PredictionWallLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.predictionWallLineWithOptions(request, runtime);
    }

    public PublishHotspotResponse publishHotspotWithOptions(PublishHotspotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishHotspot", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PublishHotspotResponse());
    }

    public PublishHotspotResponse publishHotspot(PublishHotspotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishHotspotWithOptions(request, runtime);
    }

    public PublishSceneResponse publishSceneWithOptions(PublishSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishScene", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PublishSceneResponse());
    }

    public PublishSceneResponse publishScene(PublishSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishSceneWithOptions(request, runtime);
    }

    public PublishStatusResponse publishStatusWithOptions(PublishStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PublishStatusResponse());
    }

    public PublishStatusResponse publishStatus(PublishStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishStatusWithOptions(request, runtime);
    }

    public RecoveryOriginImageResponse recoveryOriginImageWithOptions(RecoveryOriginImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RecoveryOriginImage", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new RecoveryOriginImageResponse());
    }

    public RecoveryOriginImageResponse recoveryOriginImage(RecoveryOriginImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recoveryOriginImageWithOptions(request, runtime);
    }

    public RectVerticalResponse rectVerticalWithOptions(RectVerticalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RectVertical", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new RectVerticalResponse());
    }

    public RectVerticalResponse rectVertical(RectVerticalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rectVerticalWithOptions(request, runtime);
    }

    public RectifyImageResponse rectifyImageWithOptions(RectifyImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RectifyImage", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new RectifyImageResponse());
    }

    public RectifyImageResponse rectifyImage(RectifyImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rectifyImageWithOptions(request, runtime);
    }

    public RollbackSubSceneResponse rollbackSubSceneWithOptions(RollbackSubSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RollbackSubScene", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new RollbackSubSceneResponse());
    }

    public RollbackSubSceneResponse rollbackSubScene(RollbackSubSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rollbackSubSceneWithOptions(request, runtime);
    }

    public SaveHotspotConfigResponse saveHotspotConfigWithOptions(SaveHotspotConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveHotspotConfig", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new SaveHotspotConfigResponse());
    }

    public SaveHotspotConfigResponse saveHotspotConfig(SaveHotspotConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveHotspotConfigWithOptions(request, runtime);
    }

    public SaveHotspotTagResponse saveHotspotTagWithOptions(SaveHotspotTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveHotspotTag", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new SaveHotspotTagResponse());
    }

    public SaveHotspotTagResponse saveHotspotTag(SaveHotspotTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveHotspotTagWithOptions(request, runtime);
    }

    public ScenePublishResponse scenePublishWithOptions(ScenePublishRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ScenePublish", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ScenePublishResponse());
    }

    public ScenePublishResponse scenePublish(ScenePublishRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scenePublishWithOptions(request, runtime);
    }

    public TempPreviewResponse tempPreviewWithOptions(TempPreviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TempPreview", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new TempPreviewResponse());
    }

    public TempPreviewResponse tempPreview(TempPreviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tempPreviewWithOptions(request, runtime);
    }

    public TempPreviewStatusResponse tempPreviewStatusWithOptions(TempPreviewStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TempPreviewStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new TempPreviewStatusResponse());
    }

    public TempPreviewStatusResponse tempPreviewStatus(TempPreviewStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tempPreviewStatusWithOptions(request, runtime);
    }

    public UpdateConnDataResponse updateConnDataWithOptions(UpdateConnDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateConnData", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateConnDataResponse());
    }

    public UpdateConnDataResponse updateConnData(UpdateConnDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConnDataWithOptions(request, runtime);
    }

    public UpdateLayoutDataResponse updateLayoutDataWithOptions(UpdateLayoutDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLayoutData", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLayoutDataResponse());
    }

    public UpdateLayoutDataResponse updateLayoutData(UpdateLayoutDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLayoutDataWithOptions(request, runtime);
    }

    public UpdateProjectResponse updateProjectWithOptions(UpdateProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateProject", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateProjectResponse());
    }

    public UpdateProjectResponse updateProject(UpdateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProjectWithOptions(request, runtime);
    }

    public UpdateSceneResponse updateSceneWithOptions(UpdateSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateScene", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSceneResponse());
    }

    public UpdateSceneResponse updateScene(UpdateSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSceneWithOptions(request, runtime);
    }

    public UpdateSubSceneResponse updateSubSceneWithOptions(UpdateSubSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSubScene", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSubSceneResponse());
    }

    public UpdateSubSceneResponse updateSubScene(UpdateSubSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSubSceneWithOptions(request, runtime);
    }
}

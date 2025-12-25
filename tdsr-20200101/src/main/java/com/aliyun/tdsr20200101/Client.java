// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101;

import com.aliyun.tea.*;
import com.aliyun.tdsr20200101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * <b>summary</b> : 
     * <p>保存模型文件</p>
     * 
     * @param request AddHotspotFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddHotspotFileResponse
     */
    public AddHotspotFileResponse addHotspotFileWithOptions(AddHotspotFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddHotspotFile"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddHotspotFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存模型文件</p>
     * 
     * @param request AddHotspotFileRequest
     * @return AddHotspotFileResponse
     */
    public AddHotspotFileResponse addHotspotFile(AddHotspotFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addHotspotFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>打马赛克</p>
     * 
     * @param request AddMosaicsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMosaicsResponse
     */
    public AddMosaicsResponse addMosaicsWithOptions(AddMosaicsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.markPosition)) {
            query.put("MarkPosition", request.markPosition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSceneId)) {
            query.put("SubSceneId", request.subSceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMosaics"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMosaicsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>打马赛克</p>
     * 
     * @param request AddMosaicsRequest
     * @return AddMosaicsResponse
     */
    public AddMosaicsResponse addMosaics(AddMosaicsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMosaicsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加项目</p>
     * 
     * @param request AddProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddProjectResponse
     */
    public AddProjectResponse addProjectWithOptions(AddProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            query.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddProject"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加项目</p>
     * 
     * @param request AddProjectRequest
     * @return AddProjectResponse
     */
    public AddProjectResponse addProject(AddProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加相对位置</p>
     * 
     * @deprecated OpenAPI AddRelativePosition is deprecated
     * 
     * @param request AddRelativePositionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRelativePositionResponse
     */
    @Deprecated
    // Deprecated
    public AddRelativePositionResponse addRelativePositionWithOptions(AddRelativePositionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.relativePosition)) {
            query.put("RelativePosition", request.relativePosition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRelativePosition"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRelativePositionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加相对位置</p>
     * 
     * @deprecated OpenAPI AddRelativePosition is deprecated
     * 
     * @param request AddRelativePositionRequest
     * @return AddRelativePositionResponse
     */
    @Deprecated
    // Deprecated
    public AddRelativePositionResponse addRelativePosition(AddRelativePositionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRelativePositionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>移动端添加rooms.json</p>
     * 
     * @param request AddRoomPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRoomPlanResponse
     */
    public AddRoomPlanResponse addRoomPlanWithOptions(AddRoomPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRoomPlan"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRoomPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>移动端添加rooms.json</p>
     * 
     * @param request AddRoomPlanRequest
     * @return AddRoomPlanResponse
     */
    public AddRoomPlanResponse addRoomPlan(AddRoomPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRoomPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加主场景</p>
     * 
     * @param request AddSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSceneResponse
     */
    public AddSceneResponse addSceneWithOptions(AddSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerUid)) {
            query.put("CustomerUid", request.customerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddScene"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加主场景</p>
     * 
     * @param request AddSceneRequest
     * @return AddSceneResponse
     */
    public AddSceneResponse addScene(AddSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建子场景</p>
     * 
     * @param request AddSubSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSubSceneResponse
     */
    public AddSubSceneResponse addSubSceneWithOptions(AddSubSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadType)) {
            query.put("UploadType", request.uploadType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSubScene"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSubSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建子场景</p>
     * 
     * @param request AddSubSceneRequest
     * @return AddSubSceneResponse
     */
    public AddSubSceneResponse addSubScene(AddSubSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSubSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检查指定uid用户属性</p>
     * 
     * @param request CheckUserPropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckUserPropertyResponse
     */
    public CheckUserPropertyResponse checkUserPropertyWithOptions(CheckUserPropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckUserProperty"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckUserPropertyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>检查指定uid用户属性</p>
     * 
     * @param request CheckUserPropertyRequest
     * @return CheckUserPropertyResponse
     */
    public CheckUserPropertyResponse checkUserProperty(CheckUserPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkUserPropertyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>复制主场景</p>
     * 
     * @param request CopySceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopySceneResponse
     */
    public CopySceneResponse copySceneWithOptions(CopySceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            query.put("SceneName", request.sceneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyScene"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopySceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>复制主场景</p>
     * 
     * @param request CopySceneRequest
     * @return CopySceneResponse
     */
    public CopySceneResponse copyScene(CopySceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copySceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取OSS授权</p>
     * 
     * @param request CreateUploadPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUploadPolicyResponse
     */
    public CreateUploadPolicyResponse createUploadPolicyWithOptions(CreateUploadPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.option)) {
            query.put("Option", request.option);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUploadPolicy"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUploadPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取OSS授权</p>
     * 
     * @param request CreateUploadPolicyRequest
     * @return CreateUploadPolicyResponse
     */
    public CreateUploadPolicyResponse createUploadPolicy(CreateUploadPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目详情</p>
     * 
     * @param request DetailProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetailProjectResponse
     */
    public DetailProjectResponse detailProjectWithOptions(DetailProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetailProject"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetailProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目详情</p>
     * 
     * @param request DetailProjectRequest
     * @return DetailProjectResponse
     */
    public DetailProjectResponse detailProject(DetailProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detailProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>主场景详细</p>
     * 
     * @param request DetailSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetailSceneResponse
     */
    public DetailSceneResponse detailSceneWithOptions(DetailSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetailScene"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetailSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>主场景详细</p>
     * 
     * @param request DetailSceneRequest
     * @return DetailSceneResponse
     */
    public DetailSceneResponse detailScene(DetailSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detailSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询子场景详情</p>
     * 
     * @param request DetailSubSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetailSubSceneResponse
     */
    public DetailSubSceneResponse detailSubSceneWithOptions(DetailSubSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetailSubScene"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetailSubSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询子场景详情</p>
     * 
     * @param request DetailSubSceneRequest
     * @return DetailSubSceneResponse
     */
    public DetailSubSceneResponse detailSubScene(DetailSubSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detailSubSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除项目</p>
     * 
     * @param request DropProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DropProjectResponse
     */
    public DropProjectResponse dropProjectWithOptions(DropProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DropProject"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DropProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除项目</p>
     * 
     * @param request DropProjectRequest
     * @return DropProjectResponse
     */
    public DropProjectResponse dropProject(DropProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dropProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除主场景</p>
     * 
     * @param request DropSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DropSceneResponse
     */
    public DropSceneResponse dropSceneWithOptions(DropSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DropScene"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DropSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除主场景</p>
     * 
     * @param request DropSceneRequest
     * @return DropSceneResponse
     */
    public DropSceneResponse dropScene(DropSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dropSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除子场景</p>
     * 
     * @param request DropSubSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DropSubSceneResponse
     */
    public DropSubSceneResponse dropSubSceneWithOptions(DropSubSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DropSubScene"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DropSubSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除子场景</p>
     * 
     * @param request DropSubSceneRequest
     * @return DropSubSceneResponse
     */
    public DropSubSceneResponse dropSubScene(DropSubSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dropSubSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询关联数据</p>
     * 
     * @param request GetConnDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConnDataResponse
     */
    public GetConnDataResponse getConnDataWithOptions(GetConnDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConnData"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConnDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询关联数据</p>
     * 
     * @param request GetConnDataRequest
     * @return GetConnDataResponse
     */
    public GetConnDataResponse getConnData(GetConnDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConnDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>复制场景任务状态查询</p>
     * 
     * @param request GetCopySceneTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCopySceneTaskStatusResponse
     */
    public GetCopySceneTaskStatusResponse getCopySceneTaskStatusWithOptions(GetCopySceneTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCopySceneTaskStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCopySceneTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>复制场景任务状态查询</p>
     * 
     * @param request GetCopySceneTaskStatusRequest
     * @return GetCopySceneTaskStatusResponse
     */
    public GetCopySceneTaskStatusResponse getCopySceneTaskStatus(GetCopySceneTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCopySceneTaskStatusWithOptions(request, runtime);
    }

    /**
     * @param request GetHotspotConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotspotConfigResponse
     */
    public GetHotspotConfigResponse getHotspotConfigWithOptions(GetHotspotConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewToken)) {
            query.put("PreviewToken", request.previewToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotspotConfig"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotspotConfigResponse());
    }

    /**
     * @param request GetHotspotConfigRequest
     * @return GetHotspotConfigResponse
     */
    public GetHotspotConfigResponse getHotspotConfig(GetHotspotConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotspotConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询后处理场景信息</p>
     * 
     * @param request GetHotspotSceneDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotspotSceneDataResponse
     */
    public GetHotspotSceneDataResponse getHotspotSceneDataWithOptions(GetHotspotSceneDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewToken)) {
            query.put("PreviewToken", request.previewToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotspotSceneData"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotspotSceneDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询后处理场景信息</p>
     * 
     * @param request GetHotspotSceneDataRequest
     * @return GetHotspotSceneDataResponse
     */
    public GetHotspotSceneDataResponse getHotspotSceneData(GetHotspotSceneDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotspotSceneDataWithOptions(request, runtime);
    }

    /**
     * @param request GetHotspotTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotspotTagResponse
     */
    public GetHotspotTagResponse getHotspotTagWithOptions(GetHotspotTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewToken)) {
            query.put("PreviewToken", request.previewToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSceneUuid)) {
            query.put("SubSceneUuid", request.subSceneUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotspotTag"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotspotTagResponse());
    }

    /**
     * @param request GetHotspotTagRequest
     * @return GetHotspotTagResponse
     */
    public GetHotspotTagResponse getHotspotTag(GetHotspotTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotspotTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取标注数据</p>
     * 
     * @param request GetLayoutDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLayoutDataResponse
     */
    public GetLayoutDataResponse getLayoutDataWithOptions(GetLayoutDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subSceneId)) {
            query.put("SubSceneId", request.subSceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLayoutData"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLayoutDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取标注数据</p>
     * 
     * @param request GetLayoutDataRequest
     * @return GetLayoutDataResponse
     */
    public GetLayoutDataResponse getLayoutData(GetLayoutDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLayoutDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取算法自动标注数据</p>
     * 
     * @param request GetOriginLayoutDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOriginLayoutDataResponse
     */
    public GetOriginLayoutDataResponse getOriginLayoutDataWithOptions(GetOriginLayoutDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subSceneId)) {
            query.put("SubSceneId", request.subSceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOriginLayoutData"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOriginLayoutDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取算法自动标注数据</p>
     * 
     * @param request GetOriginLayoutDataRequest
     * @return GetOriginLayoutDataResponse
     */
    public GetOriginLayoutDataResponse getOriginLayoutData(GetOriginLayoutDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOriginLayoutDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取OSS授权</p>
     * 
     * @param request GetOssPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOssPolicyResponse
     */
    public GetOssPolicyResponse getOssPolicyWithOptions(GetOssPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subSceneId)) {
            query.put("SubSceneId", request.subSceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssPolicy"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取OSS授权</p>
     * 
     * @param request GetOssPolicyRequest
     * @return GetOssPolicyResponse
     */
    public GetOssPolicyResponse getOssPolicy(GetOssPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOssPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>打包场景任务状态查询</p>
     * 
     * @param request GetPackSceneTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPackSceneTaskStatusResponse
     */
    public GetPackSceneTaskStatusResponse getPackSceneTaskStatusWithOptions(GetPackSceneTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPackSceneTaskStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPackSceneTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>打包场景任务状态查询</p>
     * 
     * @param request GetPackSceneTaskStatusRequest
     * @return GetPackSceneTaskStatusResponse
     */
    public GetPackSceneTaskStatusResponse getPackSceneTaskStatus(GetPackSceneTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPackSceneTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询矫正后图片</p>
     * 
     * @param request GetRectifyImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRectifyImageResponse
     */
    public GetRectifyImageResponse getRectifyImageWithOptions(GetRectifyImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subSceneId)) {
            query.put("SubSceneId", request.subSceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRectifyImage"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRectifyImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询矫正后图片</p>
     * 
     * @param request GetRectifyImageRequest
     * @return GetRectifyImageResponse
     */
    public GetRectifyImageResponse getRectifyImage(GetRectifyImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRectifyImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看场景下重建任务</p>
     * 
     * @param request GetSceneBuildTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSceneBuildTaskStatusResponse
     */
    public GetSceneBuildTaskStatusResponse getSceneBuildTaskStatusWithOptions(GetSceneBuildTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSceneBuildTaskStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSceneBuildTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看场景下重建任务</p>
     * 
     * @param request GetSceneBuildTaskStatusRequest
     * @return GetSceneBuildTaskStatusResponse
     */
    public GetSceneBuildTaskStatusResponse getSceneBuildTaskStatus(GetSceneBuildTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSceneBuildTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景的打包地址</p>
     * 
     * @param request GetScenePackUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScenePackUrlResponse
     */
    public GetScenePackUrlResponse getScenePackUrlWithOptions(GetScenePackUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScenePackUrl"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScenePackUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景的打包地址</p>
     * 
     * @param request GetScenePackUrlRequest
     * @return GetScenePackUrlResponse
     */
    public GetScenePackUrlResponse getScenePackUrl(GetScenePackUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScenePackUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询模型数据</p>
     * 
     * @param request GetScenePreviewDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScenePreviewDataResponse
     */
    public GetScenePreviewDataResponse getScenePreviewDataWithOptions(GetScenePreviewDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewToken)) {
            query.put("PreviewToken", request.previewToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showTag)) {
            query.put("ShowTag", request.showTag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScenePreviewData"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScenePreviewDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询模型数据</p>
     * 
     * @param request GetScenePreviewDataRequest
     * @return GetScenePreviewDataResponse
     */
    public GetScenePreviewDataResponse getScenePreviewData(GetScenePreviewDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScenePreviewDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询模型预览信息</p>
     * 
     * @param request GetScenePreviewInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScenePreviewInfoResponse
     */
    public GetScenePreviewInfoResponse getScenePreviewInfoWithOptions(GetScenePreviewInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelToken)) {
            query.put("ModelToken", request.modelToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScenePreviewInfo"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScenePreviewInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询模型预览信息</p>
     * 
     * @param request GetScenePreviewInfoRequest
     * @return GetScenePreviewInfoResponse
     */
    public GetScenePreviewInfoResponse getScenePreviewInfo(GetScenePreviewInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScenePreviewInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取模型预览数据</p>
     * 
     * @param request GetScenePreviewResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScenePreviewResourceResponse
     */
    public GetScenePreviewResourceResponse getScenePreviewResourceWithOptions(GetScenePreviewResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.draft)) {
            query.put("Draft", request.draft);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewToken)) {
            query.put("PreviewToken", request.previewToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScenePreviewResource"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScenePreviewResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取模型预览数据</p>
     * 
     * @param request GetScenePreviewResourceRequest
     * @return GetScenePreviewResourceResponse
     */
    public GetScenePreviewResourceResponse getScenePreviewResource(GetScenePreviewResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScenePreviewResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单场景关联数据</p>
     * 
     * @param request GetSingleConnDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSingleConnDataResponse
     */
    public GetSingleConnDataResponse getSingleConnDataWithOptions(GetSingleConnDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subSceneId)) {
            query.put("SubSceneId", request.subSceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSingleConnData"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSingleConnDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单场景关联数据</p>
     * 
     * @param request GetSingleConnDataRequest
     * @return GetSingleConnDataResponse
     */
    public GetSingleConnDataResponse getSingleConnData(GetSingleConnDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSingleConnDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>打包58数据状态检查</p>
     * 
     * @param request GetSourcePackStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSourcePackStatusResponse
     */
    public GetSourcePackStatusResponse getSourcePackStatusWithOptions(GetSourcePackStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSourcePackStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSourcePackStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>打包58数据状态检查</p>
     * 
     * @param request GetSourcePackStatusRequest
     * @return GetSourcePackStatusResponse
     */
    public GetSourcePackStatusResponse getSourcePackStatus(GetSourcePackStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSourcePackStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看子场景下预处理及切图任务</p>
     * 
     * @param request GetSubSceneTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSubSceneTaskStatusResponse
     */
    public GetSubSceneTaskStatusResponse getSubSceneTaskStatusWithOptions(GetSubSceneTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subSceneId)) {
            query.put("SubSceneId", request.subSceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubSceneTaskStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubSceneTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看子场景下预处理及切图任务</p>
     * 
     * @param request GetSubSceneTaskStatusRequest
     * @return GetSubSceneTaskStatusResponse
     */
    public GetSubSceneTaskStatusResponse getSubSceneTaskStatus(GetSubSceneTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSubSceneTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看任务状态</p>
     * 
     * @param request GetTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskStatusResponse
     */
    public GetTaskStatusResponse getTaskStatusWithOptions(GetTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看任务状态</p>
     * 
     * @param request GetTaskStatusRequest
     * @return GetTaskStatusResponse
     */
    public GetTaskStatusResponse getTaskStatus(GetTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskStatusWithOptions(request, runtime);
    }

    /**
     * @param request GetWindowConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWindowConfigResponse
     */
    public GetWindowConfigResponse getWindowConfigWithOptions(GetWindowConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.previewToken)) {
            query.put("PreviewToken", request.previewToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWindowConfig"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWindowConfigResponse());
    }

    /**
     * @param request GetWindowConfigRequest
     * @return GetWindowConfigResponse
     */
    public GetWindowConfigResponse getWindowConfig(GetWindowConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWindowConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重建</p>
     * 
     * @param request LabelBuildRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LabelBuildResponse
     */
    public LabelBuildResponse labelBuildWithOptions(LabelBuildRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelStyle)) {
            query.put("ModelStyle", request.modelStyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optimizeWallWidth)) {
            query.put("OptimizeWallWidth", request.optimizeWallWidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planStyle)) {
            query.put("PlanStyle", request.planStyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wallHeight)) {
            query.put("WallHeight", request.wallHeight);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LabelBuild"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LabelBuildResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重建</p>
     * 
     * @param request LabelBuildRequest
     * @return LabelBuildResponse
     */
    public LabelBuildResponse labelBuild(LabelBuildRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.labelBuildWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关联图片</p>
     * 
     * @param request LinkImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LinkImageResponse
     */
    public LinkImageResponse linkImageWithOptions(LinkImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cameraHeight)) {
            query.put("CameraHeight", request.cameraHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSceneId)) {
            query.put("SubSceneId", request.subSceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LinkImage"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LinkImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>关联图片</p>
     * 
     * @param request LinkImageRequest
     * @return LinkImageResponse
     */
    public LinkImageResponse linkImage(LinkImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.linkImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询项目列表</p>
     * 
     * @param request ListProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectResponse
     */
    public ListProjectResponse listProjectWithOptions(ListProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProject"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询项目列表</p>
     * 
     * @param request ListProjectRequest
     * @return ListProjectResponse
     */
    public ListProjectResponse listProject(ListProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询主场景列表</p>
     * 
     * @param request ListSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSceneResponse
     */
    public ListSceneResponse listSceneWithOptions(ListSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScene"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询主场景列表</p>
     * 
     * @param request ListSceneRequest
     * @return ListSceneResponse
     */
    public ListSceneResponse listScene(ListSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询子场景列表</p>
     * 
     * @param request ListSubSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubSceneResponse
     */
    public ListSubSceneResponse listSubSceneWithOptions(ListSubSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showLayoutData)) {
            query.put("ShowLayoutData", request.showLayoutData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            query.put("SortField", request.sortField);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubScene"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询子场景列表</p>
     * 
     * @param request ListSubSceneRequest
     * @return ListSubSceneResponse
     */
    public ListSubSceneResponse listSubScene(ListSubSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSubSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>直角优化</p>
     * 
     * @param request OptimizeRightAngleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OptimizeRightAngleResponse
     */
    public OptimizeRightAngleResponse optimizeRightAngleWithOptions(OptimizeRightAngleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subSceneId)) {
            query.put("SubSceneId", request.subSceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OptimizeRightAngle"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OptimizeRightAngleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>直角优化</p>
     * 
     * @param request OptimizeRightAngleRequest
     * @return OptimizeRightAngleResponse
     */
    public OptimizeRightAngleResponse optimizeRightAngle(OptimizeRightAngleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.optimizeRightAngleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>打包场景</p>
     * 
     * @param request PackSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PackSceneResponse
     */
    public PackSceneResponse packSceneWithOptions(PackSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PackScene"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PackSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>打包场景</p>
     * 
     * @param request PackSceneRequest
     * @return PackSceneResponse
     */
    public PackSceneResponse packScene(PackSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.packSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>打包场景</p>
     * 
     * @param request PackSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PackSourceResponse
     */
    public PackSourceResponse packSourceWithOptions(PackSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PackSource"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PackSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>打包场景</p>
     * 
     * @param request PackSourceRequest
     * @return PackSourceResponse
     */
    public PackSourceResponse packSource(PackSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.packSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预处理</p>
     * 
     * @param request PredImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PredImageResponse
     */
    public PredImageResponse predImageWithOptions(PredImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.correctVertical)) {
            query.put("CorrectVertical", request.correctVertical);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countDetectDoor)) {
            query.put("CountDetectDoor", request.countDetectDoor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectDoor)) {
            query.put("DetectDoor", request.detectDoor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSceneId)) {
            query.put("SubSceneId", request.subSceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PredImage"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PredImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预处理</p>
     * 
     * @param request PredImageRequest
     * @return PredImageResponse
     */
    public PredImageResponse predImage(PredImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.predImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>墙线预测</p>
     * 
     * @param request PredictionWallLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PredictionWallLineResponse
     */
    public PredictionWallLineResponse predictionWallLineWithOptions(PredictionWallLineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cameraHeight)) {
            query.put("CameraHeight", request.cameraHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PredictionWallLine"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PredictionWallLineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>墙线预测</p>
     * 
     * @param request PredictionWallLineRequest
     * @return PredictionWallLineResponse
     */
    public PredictionWallLineResponse predictionWallLine(PredictionWallLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.predictionWallLineWithOptions(request, runtime);
    }

    /**
     * @param request PublishHotspotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishHotspotResponse
     */
    public PublishHotspotResponse publishHotspotWithOptions(PublishHotspotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramTag)) {
            query.put("ParamTag", request.paramTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSceneUuid)) {
            query.put("SubSceneUuid", request.subSceneUuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishHotspot"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishHotspotResponse());
    }

    /**
     * @param request PublishHotspotRequest
     * @return PublishHotspotResponse
     */
    public PublishHotspotResponse publishHotspot(PublishHotspotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishHotspotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存扩展配置</p>
     * 
     * @param request PublishHotspotConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishHotspotConfigResponse
     */
    public PublishHotspotConfigResponse publishHotspotConfigWithOptions(PublishHotspotConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishHotspotConfig"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishHotspotConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存扩展配置</p>
     * 
     * @param request PublishHotspotConfigRequest
     * @return PublishHotspotConfigResponse
     */
    public PublishHotspotConfigResponse publishHotspotConfig(PublishHotspotConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishHotspotConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布</p>
     * 
     * @param request PublishSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishSceneResponse
     */
    public PublishSceneResponse publishSceneWithOptions(PublishSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishScene"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布</p>
     * 
     * @param request PublishSceneRequest
     * @return PublishSceneResponse
     */
    public PublishSceneResponse publishScene(PublishSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布</p>
     * 
     * @param request PublishStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishStatusResponse
     */
    public PublishStatusResponse publishStatusWithOptions(PublishStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布</p>
     * 
     * @param request PublishStatusRequest
     * @return PublishStatusResponse
     */
    public PublishStatusResponse publishStatus(PublishStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>恢复原图</p>
     * 
     * @param request RecoveryOriginImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecoveryOriginImageResponse
     */
    public RecoveryOriginImageResponse recoveryOriginImageWithOptions(RecoveryOriginImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subSceneId)) {
            query.put("SubSceneId", request.subSceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecoveryOriginImage"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecoveryOriginImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>恢复原图</p>
     * 
     * @param request RecoveryOriginImageRequest
     * @return RecoveryOriginImageResponse
     */
    public RecoveryOriginImageResponse recoveryOriginImage(RecoveryOriginImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recoveryOriginImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>手动矫正</p>
     * 
     * @param request RectVerticalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RectVerticalResponse
     */
    public RectVerticalResponse rectVerticalWithOptions(RectVerticalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.countDetectDoor)) {
            query.put("CountDetectDoor", request.countDetectDoor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectDoor)) {
            query.put("DetectDoor", request.detectDoor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSceneId)) {
            query.put("SubSceneId", request.subSceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verticalRect)) {
            query.put("VerticalRect", request.verticalRect);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RectVertical"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RectVerticalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>手动矫正</p>
     * 
     * @param request RectVerticalRequest
     * @return RectVerticalResponse
     */
    public RectVerticalResponse rectVertical(RectVerticalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rectVerticalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片矫正</p>
     * 
     * @param request RectifyImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RectifyImageResponse
     */
    public RectifyImageResponse rectifyImageWithOptions(RectifyImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cameraHeight)) {
            query.put("CameraHeight", request.cameraHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RectifyImage"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RectifyImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片矫正</p>
     * 
     * @param request RectifyImageRequest
     * @return RectifyImageResponse
     */
    public RectifyImageResponse rectifyImage(RectifyImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rectifyImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>恢复子场景</p>
     * 
     * @param request RollbackSubSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackSubSceneResponse
     */
    public RollbackSubSceneResponse rollbackSubSceneWithOptions(RollbackSubSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackSubScene"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackSubSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>恢复子场景</p>
     * 
     * @param request RollbackSubSceneRequest
     * @return RollbackSubSceneResponse
     */
    public RollbackSubSceneResponse rollbackSubScene(RollbackSubSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackSubSceneWithOptions(request, runtime);
    }

    /**
     * @param request SaveHotspotConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveHotspotConfigResponse
     */
    public SaveHotspotConfigResponse saveHotspotConfigWithOptions(SaveHotspotConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramTag)) {
            query.put("ParamTag", request.paramTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewToken)) {
            query.put("PreviewToken", request.previewToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveHotspotConfig"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveHotspotConfigResponse());
    }

    /**
     * @param request SaveHotspotConfigRequest
     * @return SaveHotspotConfigResponse
     */
    public SaveHotspotConfigResponse saveHotspotConfig(SaveHotspotConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveHotspotConfigWithOptions(request, runtime);
    }

    /**
     * @param request SaveHotspotTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveHotspotTagResponse
     */
    public SaveHotspotTagResponse saveHotspotTagWithOptions(SaveHotspotTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramTag)) {
            query.put("ParamTag", request.paramTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSceneUuid)) {
            query.put("SubSceneUuid", request.subSceneUuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveHotspotTag"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveHotspotTagResponse());
    }

    /**
     * @param request SaveHotspotTagRequest
     * @return SaveHotspotTagResponse
     */
    public SaveHotspotTagResponse saveHotspotTag(SaveHotspotTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveHotspotTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存热点</p>
     * 
     * @param request SaveHotspotTagListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveHotspotTagListResponse
     */
    public SaveHotspotTagListResponse saveHotspotTagListWithOptions(SaveHotspotTagListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotspotListJson)) {
            query.put("HotspotListJson", request.hotspotListJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveHotspotTagList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveHotspotTagListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存热点</p>
     * 
     * @param request SaveHotspotTagListRequest
     * @return SaveHotspotTagListResponse
     */
    public SaveHotspotTagListResponse saveHotspotTagList(SaveHotspotTagListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveHotspotTagListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存小地图数据</p>
     * 
     * @param request SaveMinimapRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveMinimapResponse
     */
    public SaveMinimapResponse saveMinimapWithOptions(SaveMinimapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveMinimap"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveMinimapResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存小地图数据</p>
     * 
     * @param request SaveMinimapRequest
     * @return SaveMinimapResponse
     */
    public SaveMinimapResponse saveMinimap(SaveMinimapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveMinimapWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存模型文件</p>
     * 
     * @param request SaveModelConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveModelConfigResponse
     */
    public SaveModelConfigResponse saveModelConfigWithOptions(SaveModelConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveModelConfig"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveModelConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存模型文件</p>
     * 
     * @param request SaveModelConfigRequest
     * @return SaveModelConfigResponse
     */
    public SaveModelConfigResponse saveModelConfig(SaveModelConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveModelConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布</p>
     * 
     * @param request ScenePublishRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScenePublishResponse
     */
    public ScenePublishResponse scenePublishWithOptions(ScenePublishRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScenePublish"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScenePublishResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布</p>
     * 
     * @param request ScenePublishRequest
     * @return ScenePublishResponse
     */
    public ScenePublishResponse scenePublish(ScenePublishRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scenePublishWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预览</p>
     * 
     * @param request TempPreviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TempPreviewResponse
     */
    public TempPreviewResponse tempPreviewWithOptions(TempPreviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TempPreview"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TempPreviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预览</p>
     * 
     * @param request TempPreviewRequest
     * @return TempPreviewResponse
     */
    public TempPreviewResponse tempPreview(TempPreviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tempPreviewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询预览任务处理状态</p>
     * 
     * @param request TempPreviewStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TempPreviewStatusResponse
     */
    public TempPreviewStatusResponse tempPreviewStatusWithOptions(TempPreviewStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TempPreviewStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TempPreviewStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询预览任务处理状态</p>
     * 
     * @param request TempPreviewStatusRequest
     * @return TempPreviewStatusResponse
     */
    public TempPreviewStatusResponse tempPreviewStatus(TempPreviewStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tempPreviewStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新关联数据</p>
     * 
     * @param request UpdateConnDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConnDataResponse
     */
    public UpdateConnDataResponse updateConnDataWithOptions(UpdateConnDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connData)) {
            query.put("ConnData", request.connData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConnData"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConnDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新关联数据</p>
     * 
     * @param request UpdateConnDataRequest
     * @return UpdateConnDataResponse
     */
    public UpdateConnDataResponse updateConnData(UpdateConnDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConnDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新标注数据</p>
     * 
     * @param request UpdateLayoutDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLayoutDataResponse
     */
    public UpdateLayoutDataResponse updateLayoutDataWithOptions(UpdateLayoutDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.layoutData)) {
            query.put("LayoutData", request.layoutData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSceneId)) {
            query.put("SubSceneId", request.subSceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLayoutData"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLayoutDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新标注数据</p>
     * 
     * @param request UpdateLayoutDataRequest
     * @return UpdateLayoutDataResponse
     */
    public UpdateLayoutDataResponse updateLayoutData(UpdateLayoutDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLayoutDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变更项目信息</p>
     * 
     * @param request UpdateProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProjectWithOptions(UpdateProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            query.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProject"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变更项目信息</p>
     * 
     * @param request UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新主场景</p>
     * 
     * @param request UpdateSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSceneResponse
     */
    public UpdateSceneResponse updateSceneWithOptions(UpdateSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateScene"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新主场景</p>
     * 
     * @param request UpdateSceneRequest
     * @return UpdateSceneResponse
     */
    public UpdateSceneResponse updateScene(UpdateSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新子场景</p>
     * 
     * @param tmpReq UpdateSubSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSubSceneResponse
     */
    public UpdateSubSceneResponse updateSubSceneWithOptions(UpdateSubSceneRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSubSceneShrinkRequest request = new UpdateSubSceneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.viewPoint)) {
            request.viewPointShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.viewPoint, "ViewPoint", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewPointShrink)) {
            query.put("ViewPoint", request.viewPointShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSubScene"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSubSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新子场景</p>
     * 
     * @param request UpdateSubSceneRequest
     * @return UpdateSubSceneResponse
     */
    public UpdateSubSceneResponse updateSubScene(UpdateSubSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSubSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新子场景顺序</p>
     * 
     * @param tmpReq UpdateSubSceneSeqRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSubSceneSeqResponse
     */
    public UpdateSubSceneSeqResponse updateSubSceneSeqWithOptions(UpdateSubSceneSeqRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSubSceneSeqShrinkRequest request = new UpdateSubSceneSeqShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sortSubSceneIds)) {
            request.sortSubSceneIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sortSubSceneIds, "SortSubSceneIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortSubSceneIdsShrink)) {
            query.put("SortSubSceneIds", request.sortSubSceneIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSubSceneSeq"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSubSceneSeqResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新子场景顺序</p>
     * 
     * @param request UpdateSubSceneSeqRequest
     * @return UpdateSubSceneSeqResponse
     */
    public UpdateSubSceneSeqResponse updateSubSceneSeq(UpdateSubSceneSeqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSubSceneSeqWithOptions(request, runtime);
    }
}

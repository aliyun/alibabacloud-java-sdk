// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809;

import com.aliyun.tea.*;
import com.aliyun.virtual_human20210809.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("virtual-human", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public FinishResponse finishWithOptions(FinishRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualHumanCode)) {
            query.put("VirtualHumanCode", request.virtualHumanCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Finish"),
            new TeaPair("version", "2021-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FinishResponse());
    }

    public FinishResponse finish(FinishRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.finishWithOptions(request, runtime);
    }

    public GetVirtualHumanStatusResponse getVirtualHumanStatusWithOptions(GetVirtualHumanStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVirtualHumanStatus"),
            new TeaPair("version", "2021-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVirtualHumanStatusResponse());
    }

    public GetVirtualHumanStatusResponse getVirtualHumanStatus(GetVirtualHumanStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVirtualHumanStatusWithOptions(request, runtime);
    }

    public GetVirtualHumanStatusesResponse getVirtualHumanStatusesWithOptions(GetVirtualHumanStatusesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groups)) {
            body.put("Groups", request.groups);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVirtualHumanStatuses"),
            new TeaPair("version", "2021-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVirtualHumanStatusesResponse());
    }

    public GetVirtualHumanStatusesResponse getVirtualHumanStatuses(GetVirtualHumanStatusesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVirtualHumanStatusesWithOptions(request, runtime);
    }

    public StartResponse startWithOptions(StartRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartShrinkRequest request = new StartShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extendParams)) {
            request.extendParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extendParams, "ExtendParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extendParamsShrink)) {
            query.put("ExtendParams", request.extendParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushStreamUrl)) {
            query.put("PushStreamUrl", request.pushStreamUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            query.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoType)) {
            query.put("VideoType", request.videoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualHumanCode)) {
            query.put("VirtualHumanCode", request.virtualHumanCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Start"),
            new TeaPair("version", "2021-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartResponse());
    }

    public StartResponse start(StartRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startWithOptions(request, runtime);
    }

    public SwitchOffVirtualHumanResponse switchOffVirtualHumanWithOptions(SwitchOffVirtualHumanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchOffVirtualHuman"),
            new TeaPair("version", "2021-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchOffVirtualHumanResponse());
    }

    public SwitchOffVirtualHumanResponse switchOffVirtualHuman(SwitchOffVirtualHumanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchOffVirtualHumanWithOptions(request, runtime);
    }

    public SwitchOffVirtualHumansResponse switchOffVirtualHumansWithOptions(SwitchOffVirtualHumansRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groups)) {
            body.put("Groups", request.groups);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchOffVirtualHumans"),
            new TeaPair("version", "2021-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchOffVirtualHumansResponse());
    }

    public SwitchOffVirtualHumansResponse switchOffVirtualHumans(SwitchOffVirtualHumansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchOffVirtualHumansWithOptions(request, runtime);
    }

    public SwitchOnVirtualHumanResponse switchOnVirtualHumanWithOptions(SwitchOnVirtualHumanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatarConfig)) {
            body.put("AvatarConfig", request.avatarConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.avatarId)) {
            body.put("AvatarId", request.avatarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchOnVirtualHuman"),
            new TeaPair("version", "2021-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchOnVirtualHumanResponse());
    }

    public SwitchOnVirtualHumanResponse switchOnVirtualHuman(SwitchOnVirtualHumanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchOnVirtualHumanWithOptions(request, runtime);
    }

    public SwitchOnVirtualHumansResponse switchOnVirtualHumansWithOptions(SwitchOnVirtualHumansRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groups)) {
            body.put("Groups", request.groups);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchOnVirtualHumans"),
            new TeaPair("version", "2021-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchOnVirtualHumansResponse());
    }

    public SwitchOnVirtualHumansResponse switchOnVirtualHumans(SwitchOnVirtualHumansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchOnVirtualHumansWithOptions(request, runtime);
    }

    public TextToVideoResponse textToVideoWithOptions(TextToVideoRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TextToVideoShrinkRequest request = new TextToVideoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extendParams)) {
            request.extendParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extendParams, "ExtendParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginAction)) {
            query.put("BeginAction", request.beginAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginText)) {
            query.put("BeginText", request.beginText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandType)) {
            query.put("CommandType", request.commandType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endAction)) {
            query.put("EndAction", request.endAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endText)) {
            query.put("EndText", request.endText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendParamsShrink)) {
            query.put("ExtendParams", request.extendParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneType)) {
            query.put("SceneType", request.sceneType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechText)) {
            query.put("SpeechText", request.speechText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualHumanCode)) {
            query.put("VirtualHumanCode", request.virtualHumanCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TextToVideo"),
            new TeaPair("version", "2021-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TextToVideoResponse());
    }

    public TextToVideoResponse textToVideo(TextToVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.textToVideoWithOptions(request, runtime);
    }
}

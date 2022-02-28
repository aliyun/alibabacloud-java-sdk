// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224;

import com.aliyun.tea.*;
import com.aliyun.retailbot20210224.models.*;
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
        this._endpoint = this.getEndpoint("retailbot", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddSolutionResponse addSolutionWithOptions(AddSolutionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddSolutionShrinkRequest request = new AddSolutionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.solution))) {
            request.solutionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.solution), "Solution", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("KnowledgeId", request.knowledgeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorName)) {
            body.put("OperatorName", request.operatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionShrink)) {
            body.put("Solution", request.solutionShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSolution"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSolutionResponse());
    }

    public AddSolutionResponse addSolution(AddSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSolutionWithOptions(request, runtime);
    }

    public AdminTestSeviceResponse adminTestSeviceWithOptions(AdminTestSeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.aliyunAccountDTO))) {
            bodyFlat.put("AliyunAccountDTO", request.aliyunAccountDTO);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AdminTestSevice"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AdminTestSeviceResponse());
    }

    public AdminTestSeviceResponse adminTestSevice(AdminTestSeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.adminTestSeviceWithOptions(request, runtime);
    }

    public CanRefundResponse canRefundWithOptions(CanRefundRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CanRefund"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CanRefundResponse());
    }

    public CanRefundResponse canRefund(CanRefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.canRefundWithOptions(request, runtime);
    }

    public CompleteCommodityResponse completeCommodityWithOptions(CompleteCommodityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("data", request.data);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteCommodity"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompleteCommodityResponse());
    }

    public CompleteCommodityResponse completeCommodity(CompleteCommodityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.completeCommodityWithOptions(request, runtime);
    }

    public CreateRobotResponse createRobotWithOptions(CreateRobotRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRobotShrinkRequest request = new CreateRobotShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.operator))) {
            request.operatorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.operator), "Operator", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.robotDTO))) {
            request.robotDTOShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.robotDTO), "RobotDTO", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatorShrink)) {
            body.put("Operator", request.operatorShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotDTOShrink)) {
            body.put("RobotDTO", request.robotDTOShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRobot"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRobotResponse());
    }

    public CreateRobotResponse createRobot(CreateRobotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRobotWithOptions(request, runtime);
    }

    public CreateTaskResponse createTaskWithOptions(CreateTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTaskShrinkRequest request = new CreateTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.digTaskInfoParam))) {
            request.digTaskInfoParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.digTaskInfoParam), "DigTaskInfoParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.digTaskInfoParamShrink)) {
            body.put("DigTaskInfoParam", request.digTaskInfoParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTask"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskResponse());
    }

    public CreateTaskResponse createTask(CreateTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTaskWithOptions(request, runtime);
    }

    public CreateUserAccessTokenResponse createUserAccessTokenWithOptions(CreateUserAccessTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUid)) {
            body.put("AliyunUid", request.aliyunUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            body.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceKey)) {
            body.put("SourceKey", request.sourceKey);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.userDto))) {
            bodyFlat.put("UserDto", request.userDto);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserAccessToken"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserAccessTokenResponse());
    }

    public CreateUserAccessTokenResponse createUserAccessToken(CreateUserAccessTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserAccessTokenWithOptions(request, runtime);
    }

    public DeleteRobotResponse deleteRobotWithOptions(DeleteRobotRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteRobotShrinkRequest request = new DeleteRobotShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.operator))) {
            request.operatorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.operator), "Operator", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memo)) {
            body.put("Memo", request.memo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorShrink)) {
            body.put("Operator", request.operatorShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRobot"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRobotResponse());
    }

    public DeleteRobotResponse deleteRobot(DeleteRobotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRobotWithOptions(request, runtime);
    }

    public DeleteSolutionResponse deleteSolutionWithOptions(DeleteSolutionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteSolutionShrinkRequest request = new DeleteSolutionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.solutionIds)) {
            request.solutionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.solutionIds, "SolutionIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("KnowledgeId", request.knowledgeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorName)) {
            body.put("OperatorName", request.operatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionIdsShrink)) {
            body.put("SolutionIds", request.solutionIdsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSolution"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSolutionResponse());
    }

    public DeleteSolutionResponse deleteSolution(DeleteSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSolutionWithOptions(request, runtime);
    }

    public DeleteTaskResponse deleteTaskWithOptions(DeleteTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteTaskShrinkRequest request = new DeleteTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.digDeleteParam))) {
            request.digDeleteParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.digDeleteParam), "DigDeleteParam", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.digDeleteParamShrink)) {
            body.put("DigDeleteParam", request.digDeleteParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTask"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTaskResponse());
    }

    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTaskWithOptions(request, runtime);
    }

    public DisableSceneResponse disableSceneWithOptions(DisableSceneRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DisableSceneShrinkRequest request = new DisableSceneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.knowledgeIds)) {
            request.knowledgeIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.knowledgeIds, "KnowledgeIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeIdsShrink)) {
            body.put("KnowledgeIds", request.knowledgeIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorName)) {
            body.put("OperatorName", request.operatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableScene"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSceneResponse());
    }

    public DisableSceneResponse disableScene(DisableSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableSceneWithOptions(request, runtime);
    }

    public EnableSceneResponse enableSceneWithOptions(EnableSceneRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EnableSceneShrinkRequest request = new EnableSceneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.knowledgeIds)) {
            request.knowledgeIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.knowledgeIds, "KnowledgeIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeIdsShrink)) {
            body.put("KnowledgeIds", request.knowledgeIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorName)) {
            body.put("OperatorName", request.operatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableScene"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSceneResponse());
    }

    public EnableSceneResponse enableScene(EnableSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableSceneWithOptions(request, runtime);
    }

    public GetKnowledgeResponse getKnowledgeWithOptions(GetKnowledgeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("KnowledgeId", request.knowledgeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorName)) {
            body.put("OperatorName", request.operatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKnowledge"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKnowledgeResponse());
    }

    public GetKnowledgeResponse getKnowledge(GetKnowledgeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getKnowledgeWithOptions(request, runtime);
    }

    public GetPackageVersionResponse getPackageVersionWithOptions(GetPackageVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorName)) {
            body.put("OperatorName", request.operatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageCode)) {
            body.put("PackageCode", request.packageCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPackageVersion"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPackageVersionResponse());
    }

    public GetPackageVersionResponse getPackageVersion(GetPackageVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPackageVersionWithOptions(request, runtime);
    }

    public GetSolutionResponse getSolutionWithOptions(GetSolutionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("KnowledgeId", request.knowledgeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorName)) {
            body.put("OperatorName", request.operatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionId)) {
            body.put("SolutionId", request.solutionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSolution"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSolutionResponse());
    }

    public GetSolutionResponse getSolution(GetSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSolutionWithOptions(request, runtime);
    }

    public InstallPackageResponse installPackageWithOptions(InstallPackageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InstallPackageShrinkRequest request = new InstallPackageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.operator))) {
            request.operatorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.operator), "Operator", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.packages)) {
            request.packagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.packages, "Packages", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatorShrink)) {
            body.put("Operator", request.operatorShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packagesShrink)) {
            body.put("Packages", request.packagesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallPackage"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallPackageResponse());
    }

    public InstallPackageResponse installPackage(InstallPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.installPackageWithOptions(request, runtime);
    }

    public ListCategoriesResponse listCategoriesWithOptions(ListCategoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorName)) {
            body.put("OperatorName", request.operatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCategories"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCategoriesResponse());
    }

    public ListCategoriesResponse listCategories(ListCategoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCategoriesWithOptions(request, runtime);
    }

    public ListIndustryPackagesResponse listIndustryPackagesWithOptions(ListIndustryPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorName)) {
            body.put("OperatorName", request.operatorName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIndustryPackages"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIndustryPackagesResponse());
    }

    public ListIndustryPackagesResponse listIndustryPackages(ListIndustryPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIndustryPackagesWithOptions(request, runtime);
    }

    public ListPackageKnowledgesResponse listPackageKnowledgesWithOptions(ListPackageKnowledgesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorName)) {
            body.put("OperatorName", request.operatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageCode)) {
            body.put("PackageCode", request.packageCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageVersion)) {
            body.put("PackageVersion", request.packageVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPackageKnowledges"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPackageKnowledgesResponse());
    }

    public ListPackageKnowledgesResponse listPackageKnowledges(ListPackageKnowledgesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPackageKnowledgesWithOptions(request, runtime);
    }

    public ListPackageVersionsResponse listPackageVersionsWithOptions(ListPackageVersionsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPackageVersionsShrinkRequest request = new ListPackageVersionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.packageCodes)) {
            request.packageCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.packageCodes, "PackageCodes", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorName)) {
            body.put("OperatorName", request.operatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageCodesShrink)) {
            body.put("PackageCodes", request.packageCodesShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPackageVersions"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPackageVersionsResponse());
    }

    public ListPackageVersionsResponse listPackageVersions(ListPackageVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPackageVersionsWithOptions(request, runtime);
    }

    public ListSubscribedPackageKnowledgesResponse listSubscribedPackageKnowledgesWithOptions(ListSubscribedPackageKnowledgesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorName)) {
            body.put("OperatorName", request.operatorName);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.packageCodes)) {
            bodyFlat.put("PackageCodes", request.packageCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubscribedPackageKnowledges"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubscribedPackageKnowledgesResponse());
    }

    public ListSubscribedPackageKnowledgesResponse listSubscribedPackageKnowledges(ListSubscribedPackageKnowledgesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSubscribedPackageKnowledgesWithOptions(request, runtime);
    }

    public ListSubscriptionByPackageResponse listSubscriptionByPackageWithOptions(ListSubscriptionByPackageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSubscriptionByPackageShrinkRequest request = new ListSubscriptionByPackageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.packageDTO))) {
            request.packageDTOShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.packageDTO), "PackageDTO", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.pageData))) {
            request.pageDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.pageData), "PageData", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.packageDTOShrink)) {
            body.put("PackageDTO", request.packageDTOShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageDataShrink)) {
            body.put("PageData", request.pageDataShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubscriptionByPackage"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubscriptionByPackageResponse());
    }

    public ListSubscriptionByPackageResponse listSubscriptionByPackage(ListSubscriptionByPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSubscriptionByPackageWithOptions(request, runtime);
    }

    public ListSubscriptionByRobotResponse listSubscriptionByRobotWithOptions(ListSubscriptionByRobotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubscriptionByRobot"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubscriptionByRobotResponse());
    }

    public ListSubscriptionByRobotResponse listSubscriptionByRobot(ListSubscriptionByRobotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSubscriptionByRobotWithOptions(request, runtime);
    }

    public ListSyncMessagesResponse listSyncMessagesWithOptions(ListSyncMessagesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSyncMessagesShrinkRequest request = new ListSyncMessagesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.messageDTOList)) {
            request.messageDTOListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.messageDTOList, "MessageDTOList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messageDTOListShrink)) {
            body.put("MessageDTOList", request.messageDTOListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSyncMessages"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSyncMessagesResponse());
    }

    public ListSyncMessagesResponse listSyncMessages(ListSyncMessagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSyncMessagesWithOptions(request, runtime);
    }

    public ListSyncRobotMessagesResponse listSyncRobotMessagesWithOptions(ListSyncRobotMessagesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSyncRobotMessagesShrinkRequest request = new ListSyncRobotMessagesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.robotMessageDTOList)) {
            request.robotMessageDTOListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.robotMessageDTOList, "RobotMessageDTOList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.robotMessageDTOListShrink)) {
            body.put("RobotMessageDTOList", request.robotMessageDTOListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSyncRobotMessages"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSyncRobotMessagesResponse());
    }

    public ListSyncRobotMessagesResponse listSyncRobotMessages(ListSyncRobotMessagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSyncRobotMessagesWithOptions(request, runtime);
    }

    public OlineIsvTestResponse olineIsvTestWithOptions(OlineIsvTestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.aliyunAccountDTO))) {
            bodyFlat.put("AliyunAccountDTO", request.aliyunAccountDTO);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OlineIsvTest"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OlineIsvTestResponse());
    }

    public OlineIsvTestResponse olineIsvTest(OlineIsvTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.olineIsvTestWithOptions(request, runtime);
    }

    public PayOrderCallbackResponse payOrderCallbackWithOptions(PayOrderCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("data", request.data);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PayOrderCallback"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PayOrderCallbackResponse());
    }

    public PayOrderCallbackResponse payOrderCallback(PayOrderCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.payOrderCallbackWithOptions(request, runtime);
    }

    public ProcessMessageResponse processMessageWithOptions(ProcessMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("data", request.data);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProcessMessage"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProcessMessageResponse());
    }

    public ProcessMessageResponse processMessage(ProcessMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.processMessageWithOptions(request, runtime);
    }

    public QueryByTaskIdResponse queryByTaskIdWithOptions(QueryByTaskIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryByTaskId"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryByTaskIdResponse());
    }

    public QueryByTaskIdResponse queryByTaskId(QueryByTaskIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryByTaskIdWithOptions(request, runtime);
    }

    public QueryModuleSwitchStatusResponse queryModuleSwitchStatusWithOptions(QueryModuleSwitchStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchType)) {
            body.put("SwitchType", request.switchType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryModuleSwitchStatus"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryModuleSwitchStatusResponse());
    }

    public QueryModuleSwitchStatusResponse queryModuleSwitchStatus(QueryModuleSwitchStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryModuleSwitchStatusWithOptions(request, runtime);
    }

    public QueryTaskListResponse queryTaskListWithOptions(QueryTaskListRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryTaskListShrinkRequest request = new QueryTaskListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.digTaskPageQuery))) {
            request.digTaskPageQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.digTaskPageQuery), "DigTaskPageQuery", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.pageData))) {
            request.pageDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.pageData), "PageData", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.digTaskPageQueryShrink)) {
            body.put("DigTaskPageQuery", request.digTaskPageQueryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageDataShrink)) {
            body.put("PageData", request.pageDataShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTaskList"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTaskListResponse());
    }

    public QueryTaskListResponse queryTaskList(QueryTaskListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskListWithOptions(request, runtime);
    }

    public RecognizeMessageResponse recognizeMessageWithOptions(RecognizeMessageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RecognizeMessageShrinkRequest request = new RecognizeMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.clientInfo))) {
            request.clientInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.clientInfo), "ClientInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extraContent)) {
            request.extraContentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extraContent, "ExtraContent", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.items)) {
            request.itemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.items, "Items", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orders)) {
            request.ordersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orders, "Orders", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.packages)) {
            request.packagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.packages, "Packages", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("ChatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfoShrink)) {
            body.put("ClientInfo", request.clientInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            body.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraContentShrink)) {
            body.put("ExtraContent", request.extraContentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.focusItemId)) {
            body.put("FocusItemId", request.focusItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.focusOrderId)) {
            body.put("FocusOrderId", request.focusOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemsShrink)) {
            body.put("Items", request.itemsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ordersShrink)) {
            body.put("Orders", request.ordersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packagesShrink)) {
            body.put("Packages", request.packagesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.round)) {
            body.put("Round", request.round);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerId)) {
            body.put("SellerId", request.sellerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerNick)) {
            body.put("SellerNick", request.sellerNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMode)) {
            body.put("ServiceMode", request.serviceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.staffId)) {
            body.put("StaffId", request.staffId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.staffNick)) {
            body.put("StaffNick", request.staffNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stressTesting)) {
            body.put("StressTesting", request.stressTesting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNick)) {
            body.put("UserNick", request.userNick);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeMessage"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeMessageResponse());
    }

    public RecognizeMessageResponse recognizeMessage(RecognizeMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeMessageWithOptions(request, runtime);
    }

    public RecognizeMessageForTestResponse recognizeMessageForTestWithOptions(RecognizeMessageForTestRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RecognizeMessageForTestShrinkRequest request = new RecognizeMessageForTestShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.clientInfo))) {
            request.clientInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.clientInfo), "ClientInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extraContent)) {
            request.extraContentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extraContent, "ExtraContent", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.items)) {
            request.itemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.items, "Items", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orders)) {
            request.ordersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orders, "Orders", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("ChatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfoShrink)) {
            body.put("ClientInfo", request.clientInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            body.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraContentShrink)) {
            body.put("ExtraContent", request.extraContentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.focusItemId)) {
            body.put("FocusItemId", request.focusItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.focusOrderId)) {
            body.put("FocusOrderId", request.focusOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreSceneSwitch)) {
            body.put("IgnoreSceneSwitch", request.ignoreSceneSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemsShrink)) {
            body.put("Items", request.itemsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ordersShrink)) {
            body.put("Orders", request.ordersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.round)) {
            body.put("Round", request.round);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerId)) {
            body.put("SellerId", request.sellerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerNick)) {
            body.put("SellerNick", request.sellerNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMode)) {
            body.put("ServiceMode", request.serviceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.staffId)) {
            body.put("StaffId", request.staffId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.staffNick)) {
            body.put("StaffNick", request.staffNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNick)) {
            body.put("UserNick", request.userNick);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeMessageForTest"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeMessageForTestResponse());
    }

    public RecognizeMessageForTestResponse recognizeMessageForTest(RecognizeMessageForTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeMessageForTestWithOptions(request, runtime);
    }

    public RefundResponse refundWithOptions(RefundRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("data", request.data);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Refund"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefundResponse());
    }

    public RefundResponse refund(RefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refundWithOptions(request, runtime);
    }

    public ReleaseServiceTestResponse releaseServiceTestWithOptions(ReleaseServiceTestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.aliyunAccountDTO))) {
            bodyFlat.put("AliyunAccountDTO", request.aliyunAccountDTO);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseServiceTest"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseServiceTestResponse());
    }

    public ReleaseServiceTestResponse releaseServiceTest(ReleaseServiceTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseServiceTestWithOptions(request, runtime);
    }

    public SaveModuleSwitchResponse saveModuleSwitchWithOptions(SaveModuleSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchType)) {
            body.put("SwitchType", request.switchType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveModuleSwitch"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveModuleSwitchResponse());
    }

    public SaveModuleSwitchResponse saveModuleSwitch(SaveModuleSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveModuleSwitchWithOptions(request, runtime);
    }

    public SyncMessageResponse syncMessageWithOptions(SyncMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("ChatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            body.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            body.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            body.put("MessageId", request.messageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerId)) {
            body.put("SellerId", request.sellerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerNick)) {
            body.put("SellerNick", request.sellerNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendTime)) {
            body.put("SendTime", request.sendTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.staffId)) {
            body.put("StaffId", request.staffId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.staffNick)) {
            body.put("StaffNick", request.staffNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNick)) {
            body.put("UserNick", request.userNick);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncMessage"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncMessageResponse());
    }

    public SyncMessageResponse syncMessage(SyncMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncMessageWithOptions(request, runtime);
    }

    public SyncRobotMessageResponse syncRobotMessageWithOptions(SyncRobotMessageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SyncRobotMessageShrinkRequest request = new SyncRobotMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.solutions)) {
            request.solutionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.solutions, "Solutions", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.answer)) {
            body.put("Answer", request.answer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.answerId)) {
            body.put("AnswerId", request.answerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.answerType)) {
            body.put("AnswerType", request.answerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("ChatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneKey)) {
            body.put("SceneKey", request.sceneKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionsShrink)) {
            body.put("Solutions", request.solutionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useDxm)) {
            body.put("UseDxm", request.useDxm);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncRobotMessage"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncRobotMessageResponse());
    }

    public SyncRobotMessageResponse syncRobotMessage(SyncRobotMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncRobotMessageWithOptions(request, runtime);
    }

    public UninstallPackageResponse uninstallPackageWithOptions(UninstallPackageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UninstallPackageShrinkRequest request = new UninstallPackageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.operator))) {
            request.operatorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.operator), "Operator", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.packages)) {
            request.packagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.packages, "Packages", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatorShrink)) {
            body.put("Operator", request.operatorShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packagesShrink)) {
            body.put("Packages", request.packagesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallPackage"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallPackageResponse());
    }

    public UninstallPackageResponse uninstallPackage(UninstallPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uninstallPackageWithOptions(request, runtime);
    }

    public UpdateRobotResponse updateRobotWithOptions(UpdateRobotRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateRobotShrinkRequest request = new UpdateRobotShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.operator))) {
            request.operatorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.operator), "Operator", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.robotDTO))) {
            request.robotDTOShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.robotDTO), "RobotDTO", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatorShrink)) {
            body.put("Operator", request.operatorShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotDTOShrink)) {
            body.put("RobotDTO", request.robotDTOShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRobot"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRobotResponse());
    }

    public UpdateRobotResponse updateRobot(UpdateRobotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRobotWithOptions(request, runtime);
    }

    public UpdateSolutionResponse updateSolutionWithOptions(UpdateSolutionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSolutionShrinkRequest request = new UpdateSolutionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.solution))) {
            request.solutionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.solution), "Solution", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("KnowledgeId", request.knowledgeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorName)) {
            body.put("OperatorName", request.operatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionShrink)) {
            body.put("Solution", request.solutionShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSolution"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSolutionResponse());
    }

    public UpdateSolutionResponse updateSolution(UpdateSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSolutionWithOptions(request, runtime);
    }

    public UpgradeIsvConfigResponse upgradeIsvConfigWithOptions(UpgradeIsvConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.aliyunAccountDTO))) {
            bodyFlat.put("AliyunAccountDTO", request.aliyunAccountDTO);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeIsvConfig"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeIsvConfigResponse());
    }

    public UpgradeIsvConfigResponse upgradeIsvConfig(UpgradeIsvConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeIsvConfigWithOptions(request, runtime);
    }

    public UpgradePackageResponse upgradePackageWithOptions(UpgradePackageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpgradePackageShrinkRequest request = new UpgradePackageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.operator))) {
            request.operatorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.operator), "Operator", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.packageDTO))) {
            request.packageDTOShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.packageDTO), "PackageDTO", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.robotCodes)) {
            request.robotCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.robotCodes, "RobotCodes", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatorShrink)) {
            body.put("Operator", request.operatorShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageDTOShrink)) {
            body.put("PackageDTO", request.packageDTOShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCodesShrink)) {
            body.put("RobotCodes", request.robotCodesShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradePackage"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradePackageResponse());
    }

    public UpgradePackageResponse upgradePackage(UpgradePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradePackageWithOptions(request, runtime);
    }

    public UploadKnowledgeResultResponse uploadKnowledgeResultWithOptions(UploadKnowledgeResultRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UploadKnowledgeResultShrinkRequest request = new UploadKnowledgeResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.digDatas)) {
            request.digDatasShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.digDatas, "DigDatas", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.digDatasShrink)) {
            body.put("DigDatas", request.digDatasShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadKnowledgeResult"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadKnowledgeResultResponse());
    }

    public UploadKnowledgeResultResponse uploadKnowledgeResult(UploadKnowledgeResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadKnowledgeResultWithOptions(request, runtime);
    }

    public UploadLabelDataResponse uploadLabelDataWithOptions(UploadLabelDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("ChatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.correct)) {
            body.put("Correct", request.correct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.correctSceneKey)) {
            body.put("CorrectSceneKey", request.correctSceneKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("RobotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneKey)) {
            body.put("SceneKey", request.sceneKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerId)) {
            body.put("SellerId", request.sellerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerNick)) {
            body.put("SellerNick", request.sellerNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendTime)) {
            body.put("SendTime", request.sendTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.staffId)) {
            body.put("StaffId", request.staffId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.staffNick)) {
            body.put("StaffNick", request.staffNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNick)) {
            body.put("UserNick", request.userNick);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadLabelData"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadLabelDataResponse());
    }

    public UploadLabelDataResponse uploadLabelData(UploadLabelDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadLabelDataWithOptions(request, runtime);
    }

    public VerifyOrderResponse verifyOrderWithOptions(VerifyOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("data", request.data);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyOrder"),
            new TeaPair("version", "2021-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyOrderResponse());
    }

    public VerifyOrderResponse verifyOrder(VerifyOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyOrderWithOptions(request, runtime);
    }
}

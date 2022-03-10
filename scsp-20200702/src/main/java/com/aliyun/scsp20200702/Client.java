// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702;

import com.aliyun.tea.*;
import com.aliyun.scsp20200702.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "scsp-vpc.cn-shanghai.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("scsp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AnswerCallResponse answerCallWithOptions(AnswerCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            body.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            body.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AnswerCall"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AnswerCallResponse());
    }

    public AnswerCallResponse answerCall(AnswerCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.answerCallWithOptions(request, runtime);
    }

    public AnwserAgentMonitorResponse anwserAgentMonitorWithOptions(AnwserAgentMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AnwserAgentMonitor"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AnwserAgentMonitorResponse());
    }

    public AnwserAgentMonitorResponse anwserAgentMonitor(AnwserAgentMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.anwserAgentMonitorWithOptions(request, runtime);
    }

    public AppMessagePushResponse appMessagePushWithOptions(AppMessagePushRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expirationTime)) {
            query.put("ExpirationTime", request.expirationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppMessagePush"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppMessagePushResponse());
    }

    public AppMessagePushResponse appMessagePush(AppMessagePushRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.appMessagePushWithOptions(request, runtime);
    }

    public AssignTicketResponse assignTicketWithOptions(AssignTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptorId)) {
            body.put("AcceptorId", request.acceptorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            body.put("TicketId", request.ticketId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignTicket"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssignTicketResponse());
    }

    public AssignTicketResponse assignTicket(AssignTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.assignTicketWithOptions(request, runtime);
    }

    public ChangeChatAgentStatusResponse changeChatAgentStatusWithOptions(ChangeChatAgentStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            body.put("Method", request.method);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeChatAgentStatus"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeChatAgentStatusResponse());
    }

    public ChangeChatAgentStatusResponse changeChatAgentStatus(ChangeChatAgentStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeChatAgentStatusWithOptions(request, runtime);
    }

    public CloseTicketResponse closeTicketWithOptions(CloseTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionItems)) {
            body.put("ActionItems", request.actionItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            body.put("TicketId", request.ticketId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseTicket"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseTicketResponse());
    }

    public CloseTicketResponse closeTicket(CloseTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeTicketWithOptions(request, runtime);
    }

    public CollectDeploymentArchiveResponse collectDeploymentArchiveWithOptions(CollectDeploymentArchiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CollectDeploymentArchive"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CollectDeploymentArchiveResponse());
    }

    public CollectDeploymentArchiveResponse collectDeploymentArchive(CollectDeploymentArchiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.collectDeploymentArchiveWithOptions(request, runtime);
    }

    public CreateAgentResponse createAgentWithOptions(CreateAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            bodyFlat.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIdList)) {
            bodyFlat.put("SkillGroupIdList", request.skillGroupIdList);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgent"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentResponse());
    }

    public CreateAgentResponse createAgent(CreateAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAgentWithOptions(request, runtime);
    }

    public CreateCustomerResponse createCustomerWithOptions(CreateCustomerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacter)) {
            query.put("Contacter", request.contacter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingding)) {
            query.put("Dingding", request.dingding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("Industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerName)) {
            query.put("ManagerName", request.managerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerId)) {
            query.put("OuterId", request.outerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerIdType)) {
            query.put("OuterIdType", request.outerIdType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.position)) {
            query.put("Position", request.position);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodLineId)) {
            query.put("ProdLineId", request.prodLineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeCode)) {
            query.put("TypeCode", request.typeCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomer"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomerResponse());
    }

    public CreateCustomerResponse createCustomer(CreateCustomerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCustomerWithOptions(request, runtime);
    }

    public CreateDeploymentTaskResponse createDeploymentTaskWithOptions(CreateDeploymentTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDeploymentTaskShrinkRequest request = new CreateDeploymentTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appArchiveIds)) {
            request.appArchiveIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appArchiveIds, "AppArchiveIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeploymentTask"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeploymentTaskResponse());
    }

    public CreateDeploymentTaskResponse createDeploymentTask(CreateDeploymentTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeploymentTaskWithOptions(request, runtime);
    }

    public CreateEntityIvrRouteResponse createEntityIvrRouteWithOptions(CreateEntityIvrRouteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            body.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityBizCode)) {
            body.put("EntityBizCode", request.entityBizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityBizCodeType)) {
            body.put("EntityBizCodeType", request.entityBizCodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityName)) {
            body.put("EntityName", request.entityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityRelationNumber)) {
            body.put("EntityRelationNumber", request.entityRelationNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("ServiceId", request.serviceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEntityIvrRoute"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEntityIvrRouteResponse());
    }

    public CreateEntityIvrRouteResponse createEntityIvrRoute(CreateEntityIvrRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEntityIvrRouteWithOptions(request, runtime);
    }

    public CreateOuterCallCenterDataResponse createOuterCallCenterDataWithOptions(CreateOuterCallCenterDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callType)) {
            body.put("CallType", request.callType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endReason)) {
            body.put("EndReason", request.endReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromPhoneNum)) {
            body.put("FromPhoneNum", request.fromPhoneNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interveneTime)) {
            body.put("InterveneTime", request.interveneTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordUrl)) {
            body.put("RecordUrl", request.recordUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toPhoneNum)) {
            body.put("ToPhoneNum", request.toPhoneNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfo)) {
            body.put("UserInfo", request.userInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOuterCallCenterData"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOuterCallCenterDataResponse());
    }

    public CreateOuterCallCenterDataResponse createOuterCallCenterData(CreateOuterCallCenterDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOuterCallCenterDataWithOptions(request, runtime);
    }

    public CreateRoleResponse createRoleWithOptions(CreateRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionId)) {
            body.put("PermissionId", request.permissionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRole"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoleResponse());
    }

    public CreateRoleResponse createRole(CreateRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRoleWithOptions(request, runtime);
    }

    public CreateSkillGroupResponse createSkillGroupWithOptions(CreateSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            body.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupName)) {
            body.put("SkillGroupName", request.skillGroupName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSkillGroup"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSkillGroupResponse());
    }

    public CreateSkillGroupResponse createSkillGroup(CreateSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSkillGroupWithOptions(request, runtime);
    }

    public CreateSubTicketResponse createSubTicketWithOptions(CreateSubTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizData)) {
            query.put("BizData", request.bizData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            query.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorName)) {
            query.put("CreatorName", request.creatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formData)) {
            query.put("FormData", request.formData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromInfo)) {
            query.put("FromInfo", request.fromInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberName)) {
            query.put("MemberName", request.memberName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCaseId)) {
            query.put("ParentCaseId", request.parentCaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubTicket"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubTicketResponse());
    }

    public CreateSubTicketResponse createSubTicket(CreateSubTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSubTicketWithOptions(request, runtime);
    }

    public CreateThirdSsoAgentResponse createThirdSsoAgentWithOptions(CreateThirdSsoAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleIds)) {
            bodyFlat.put("RoleIds", request.roleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIds)) {
            bodyFlat.put("SkillGroupIds", request.skillGroupIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateThirdSsoAgent"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateThirdSsoAgentResponse());
    }

    public CreateThirdSsoAgentResponse createThirdSsoAgent(CreateThirdSsoAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createThirdSsoAgentWithOptions(request, runtime);
    }

    public CreateTicketResponse createTicketWithOptions(CreateTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.carbonCopy)) {
            body.put("CarbonCopy", request.carbonCopy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorName)) {
            body.put("CreatorName", request.creatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorType)) {
            body.put("CreatorType", request.creatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formData)) {
            body.put("FormData", request.formData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromInfo)) {
            body.put("FromInfo", request.fromInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            body.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberName)) {
            body.put("MemberName", request.memberName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTicket"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTicketResponse());
    }

    public CreateTicketResponse createTicket(CreateTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTicketWithOptions(request, runtime);
    }

    public DeleteAgentResponse deleteAgentWithOptions(DeleteAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgent"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentResponse());
    }

    public DeleteAgentResponse deleteAgent(DeleteAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAgentWithOptions(request, runtime);
    }

    public DeleteEntityRouteResponse deleteEntityRouteWithOptions(DeleteEntityRouteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueId)) {
            body.put("UniqueId", request.uniqueId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEntityRoute"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEntityRouteResponse());
    }

    public DeleteEntityRouteResponse deleteEntityRoute(DeleteEntityRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEntityRouteWithOptions(request, runtime);
    }

    public DisableRoleResponse disableRoleWithOptions(DisableRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            body.put("RoleId", request.roleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableRole"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableRoleResponse());
    }

    public DisableRoleResponse disableRole(DisableRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableRoleWithOptions(request, runtime);
    }

    public EVENTQUERYResponse eVENTQUERYWithOptions(EVENTQUERYRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EVENTQUERY"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EVENTQUERYResponse());
    }

    public EVENTQUERYResponse eVENTQUERY(EVENTQUERYRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.eVENTQUERYWithOptions(request, runtime);
    }

    public EditEntityRouteResponse editEntityRouteWithOptions(EditEntityRouteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            body.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityBizCode)) {
            body.put("EntityBizCode", request.entityBizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityBizCodeType)) {
            body.put("EntityBizCodeType", request.entityBizCodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityName)) {
            body.put("EntityName", request.entityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityRelationNumber)) {
            body.put("EntityRelationNumber", request.entityRelationNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueId)) {
            body.put("UniqueId", request.uniqueId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditEntityRoute"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditEntityRouteResponse());
    }

    public EditEntityRouteResponse editEntityRoute(EditEntityRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editEntityRouteWithOptions(request, runtime);
    }

    public EnableRoleResponse enableRoleWithOptions(EnableRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            body.put("RoleId", request.roleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableRole"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableRoleResponse());
    }

    public EnableRoleResponse enableRole(EnableRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableRoleWithOptions(request, runtime);
    }

    public ExecuteActivityResponse executeActivityWithOptions(ExecuteActivityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityCode)) {
            body.put("ActivityCode", request.activityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activityForm)) {
            body.put("ActivityForm", request.activityForm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            body.put("TicketId", request.ticketId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteActivity"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteActivityResponse());
    }

    public ExecuteActivityResponse executeActivity(ExecuteActivityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeActivityWithOptions(request, runtime);
    }

    public FetchCallResponse fetchCallWithOptions(FetchCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            body.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            body.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.holdConnectionId)) {
            body.put("HoldConnectionId", request.holdConnectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FetchCall"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FetchCallResponse());
    }

    public FetchCallResponse fetchCall(FetchCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fetchCallWithOptions(request, runtime);
    }

    public FinishHotlineServiceResponse finishHotlineServiceWithOptions(FinishHotlineServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FinishHotlineService"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FinishHotlineServiceResponse());
    }

    public FinishHotlineServiceResponse finishHotlineService(FinishHotlineServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.finishHotlineServiceWithOptions(request, runtime);
    }

    public GenerateWebSocketSignResponse generateWebSocketSignWithOptions(GenerateWebSocketSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateWebSocketSign"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateWebSocketSignResponse());
    }

    public GenerateWebSocketSignResponse generateWebSocketSign(GenerateWebSocketSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateWebSocketSignWithOptions(request, runtime);
    }

    public GetAgentResponse getAgentWithOptions(GetAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgent"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentResponse());
    }

    public GetAgentResponse getAgent(GetAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgentWithOptions(request, runtime);
    }

    public GetAgentBasisStatusResponse getAgentBasisStatusWithOptions(GetAgentBasisStatusRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAgentBasisStatusShrinkRequest request = new GetAgentBasisStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentBasisStatus"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentBasisStatusResponse());
    }

    public GetAgentBasisStatusResponse getAgentBasisStatus(GetAgentBasisStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgentBasisStatusWithOptions(request, runtime);
    }

    public GetAgentDetailReportResponse getAgentDetailReportWithOptions(GetAgentDetailReportRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAgentDetailReportShrinkRequest request = new GetAgentDetailReportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentDetailReport"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentDetailReportResponse());
    }

    public GetAgentDetailReportResponse getAgentDetailReport(GetAgentDetailReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgentDetailReportWithOptions(request, runtime);
    }

    public GetAgentServiceStatusResponse getAgentServiceStatusWithOptions(GetAgentServiceStatusRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAgentServiceStatusShrinkRequest request = new GetAgentServiceStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentServiceStatus"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentServiceStatusResponse());
    }

    public GetAgentServiceStatusResponse getAgentServiceStatus(GetAgentServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgentServiceStatusWithOptions(request, runtime);
    }

    public GetAgentStatisticsResponse getAgentStatisticsWithOptions(GetAgentStatisticsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAgentStatisticsShrinkRequest request = new GetAgentStatisticsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentStatistics"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentStatisticsResponse());
    }

    public GetAgentStatisticsResponse getAgentStatistics(GetAgentStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgentStatisticsWithOptions(request, runtime);
    }

    public GetAllDepartmentResponse getAllDepartmentWithOptions(GetAllDepartmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAllDepartment"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAllDepartmentResponse());
    }

    public GetAllDepartmentResponse getAllDepartment(GetAllDepartmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAllDepartmentWithOptions(request, runtime);
    }

    public GetAppArchivesResponse getAppArchivesWithOptions(GetAppArchivesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppArchives"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppArchivesResponse());
    }

    public GetAppArchivesResponse getAppArchives(GetAppArchivesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppArchivesWithOptions(request, runtime);
    }

    public GetAppTasksResponse getAppTasksWithOptions(GetAppTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppTasks"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppTasksResponse());
    }

    public GetAppTasksResponse getAppTasks(GetAppTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppTasksWithOptions(request, runtime);
    }

    public GetAuthInfoResponse getAuthInfoWithOptions(GetAuthInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.foreignId)) {
            query.put("ForeignId", request.foreignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAuthInfo"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAuthInfoResponse());
    }

    public GetAuthInfoResponse getAuthInfo(GetAuthInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAuthInfoWithOptions(request, runtime);
    }

    public GetByForeignIdResponse getByForeignIdWithOptions(GetByForeignIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.foreignId)) {
            query.put("ForeignId", request.foreignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetByForeignId"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetByForeignIdResponse());
    }

    public GetByForeignIdResponse getByForeignId(GetByForeignIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getByForeignIdWithOptions(request, runtime);
    }

    public GetCMSIdByForeignIdResponse getCMSIdByForeignIdWithOptions(GetCMSIdByForeignIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.foreignId)) {
            query.put("ForeignId", request.foreignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nick)) {
            query.put("Nick", request.nick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCMSIdByForeignId"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCMSIdByForeignIdResponse());
    }

    public GetCMSIdByForeignIdResponse getCMSIdByForeignId(GetCMSIdByForeignIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCMSIdByForeignIdWithOptions(request, runtime);
    }

    public GetCallsPerDayResponse getCallsPerDayWithOptions(GetCallsPerDayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCallsPerDay"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCallsPerDayResponse());
    }

    public GetCallsPerDayResponse getCallsPerDay(GetCallsPerDayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCallsPerDayWithOptions(request, runtime);
    }

    public GetDepartmentalLatitudeAgentStatusResponse getDepartmentalLatitudeAgentStatusWithOptions(GetDepartmentalLatitudeAgentStatusRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDepartmentalLatitudeAgentStatusShrinkRequest request = new GetDepartmentalLatitudeAgentStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDepartmentalLatitudeAgentStatus"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDepartmentalLatitudeAgentStatusResponse());
    }

    public GetDepartmentalLatitudeAgentStatusResponse getDepartmentalLatitudeAgentStatus(GetDepartmentalLatitudeAgentStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDepartmentalLatitudeAgentStatusWithOptions(request, runtime);
    }

    public GetDeploymentArchiveResponse getDeploymentArchiveWithOptions(GetDeploymentArchiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeploymentArchive"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeploymentArchiveResponse());
    }

    public GetDeploymentArchiveResponse getDeploymentArchive(GetDeploymentArchiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeploymentArchiveWithOptions(request, runtime);
    }

    public GetEntityRouteResponse getEntityRouteWithOptions(GetEntityRouteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityBizCode)) {
            body.put("EntityBizCode", request.entityBizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityName)) {
            body.put("EntityName", request.entityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityRelationNumber)) {
            body.put("EntityRelationNumber", request.entityRelationNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueId)) {
            body.put("UniqueId", request.uniqueId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEntityRoute"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEntityRouteResponse());
    }

    public GetEntityRouteResponse getEntityRoute(GetEntityRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEntityRouteWithOptions(request, runtime);
    }

    public GetEntityRouteListResponse getEntityRouteListWithOptions(GetEntityRouteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityName)) {
            body.put("EntityName", request.entityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityRelationNumber)) {
            body.put("EntityRelationNumber", request.entityRelationNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEntityRouteList"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEntityRouteListResponse());
    }

    public GetEntityRouteListResponse getEntityRouteList(GetEntityRouteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEntityRouteListWithOptions(request, runtime);
    }

    public GetEntityTagRelationResponse getEntityTagRelationWithOptions(GetEntityTagRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            body.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEntityTagRelation"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEntityTagRelationResponse());
    }

    public GetEntityTagRelationResponse getEntityTagRelation(GetEntityTagRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEntityTagRelationWithOptions(request, runtime);
    }

    public GetForeignIdByCMSIdResponse getForeignIdByCMSIdWithOptions(GetForeignIdByCMSIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetForeignIdByCMSId"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetForeignIdByCMSIdResponse());
    }

    public GetForeignIdByCMSIdResponse getForeignIdByCMSId(GetForeignIdByCMSIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getForeignIdByCMSIdWithOptions(request, runtime);
    }

    public GetGrantedRoleIdsResponse getGrantedRoleIdsWithOptions(GetGrantedRoleIdsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGrantedRoleIds"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGrantedRoleIdsResponse());
    }

    public GetGrantedRoleIdsResponse getGrantedRoleIds(GetGrantedRoleIdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGrantedRoleIdsWithOptions(request, runtime);
    }

    public GetHotlineAgentDetailResponse getHotlineAgentDetailWithOptions(GetHotlineAgentDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineAgentDetail"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineAgentDetailResponse());
    }

    public GetHotlineAgentDetailResponse getHotlineAgentDetail(GetHotlineAgentDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineAgentDetailWithOptions(request, runtime);
    }

    public GetHotlineAgentDetailReportResponse getHotlineAgentDetailReportWithOptions(GetHotlineAgentDetailReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depIds)) {
            query.put("DepIds", request.depIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("GroupIds", request.groupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineAgentDetailReport"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineAgentDetailReportResponse());
    }

    public GetHotlineAgentDetailReportResponse getHotlineAgentDetailReport(GetHotlineAgentDetailReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineAgentDetailReportWithOptions(request, runtime);
    }

    public GetHotlineAgentStatusResponse getHotlineAgentStatusWithOptions(GetHotlineAgentStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineAgentStatus"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineAgentStatusResponse());
    }

    public GetHotlineAgentStatusResponse getHotlineAgentStatus(GetHotlineAgentStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineAgentStatusWithOptions(request, runtime);
    }

    public GetHotlineGroupDetailReportResponse getHotlineGroupDetailReportWithOptions(GetHotlineGroupDetailReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depIds)) {
            query.put("DepIds", request.depIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("GroupIds", request.groupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineGroupDetailReport"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineGroupDetailReportResponse());
    }

    public GetHotlineGroupDetailReportResponse getHotlineGroupDetailReport(GetHotlineGroupDetailReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineGroupDetailReportWithOptions(request, runtime);
    }

    public GetHotlineServiceStatisticsResponse getHotlineServiceStatisticsWithOptions(GetHotlineServiceStatisticsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetHotlineServiceStatisticsShrinkRequest request = new GetHotlineServiceStatisticsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineServiceStatistics"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineServiceStatisticsResponse());
    }

    public GetHotlineServiceStatisticsResponse getHotlineServiceStatistics(GetHotlineServiceStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineServiceStatisticsWithOptions(request, runtime);
    }

    public GetHotlineWaitingNumberResponse getHotlineWaitingNumberWithOptions(GetHotlineWaitingNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineWaitingNumber"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineWaitingNumberResponse());
    }

    public GetHotlineWaitingNumberResponse getHotlineWaitingNumber(GetHotlineWaitingNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineWaitingNumberWithOptions(request, runtime);
    }

    public GetNumLocationResponse getNumLocationWithOptions(GetNumLocationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNumLocation"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNumLocationResponse());
    }

    public GetNumLocationResponse getNumLocation(GetNumLocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNumLocationWithOptions(request, runtime);
    }

    public GetOnlineSeatInformationResponse getOnlineSeatInformationWithOptions(GetOnlineSeatInformationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetOnlineSeatInformationShrinkRequest request = new GetOnlineSeatInformationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOnlineSeatInformation"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOnlineSeatInformationResponse());
    }

    public GetOnlineSeatInformationResponse getOnlineSeatInformation(GetOnlineSeatInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOnlineSeatInformationWithOptions(request, runtime);
    }

    public GetOnlineServiceVolumeResponse getOnlineServiceVolumeWithOptions(GetOnlineServiceVolumeRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetOnlineServiceVolumeShrinkRequest request = new GetOnlineServiceVolumeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOnlineServiceVolume"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOnlineServiceVolumeResponse());
    }

    public GetOnlineServiceVolumeResponse getOnlineServiceVolume(GetOnlineServiceVolumeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOnlineServiceVolumeWithOptions(request, runtime);
    }

    public GetOutbounNumListResponse getOutbounNumListWithOptions(GetOutbounNumListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOutbounNumList"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOutbounNumListResponse());
    }

    public GetOutbounNumListResponse getOutbounNumList(GetOutbounNumListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOutbounNumListWithOptions(request, runtime);
    }

    public GetOuterCallCenterDataListResponse getOuterCallCenterDataListWithOptions(GetOuterCallCenterDataListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromPhoneNum)) {
            body.put("FromPhoneNum", request.fromPhoneNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryEndTime)) {
            body.put("QueryEndTime", request.queryEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryStartTime)) {
            body.put("QueryStartTime", request.queryStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toPhoneNum)) {
            body.put("ToPhoneNum", request.toPhoneNum);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOuterCallCenterDataList"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOuterCallCenterDataListResponse());
    }

    public GetOuterCallCenterDataListResponse getOuterCallCenterDataList(GetOuterCallCenterDataListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOuterCallCenterDataListWithOptions(request, runtime);
    }

    public GetQueueInformationResponse getQueueInformationWithOptions(GetQueueInformationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetQueueInformationShrinkRequest request = new GetQueueInformationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueueInformation"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueueInformationResponse());
    }

    public GetQueueInformationResponse getQueueInformation(GetQueueInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQueueInformationWithOptions(request, runtime);
    }

    public GetSeatInformationResponse getSeatInformationWithOptions(GetSeatInformationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSeatInformationShrinkRequest request = new GetSeatInformationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "depIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSeatInformation"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSeatInformationResponse());
    }

    public GetSeatInformationResponse getSeatInformation(GetSeatInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSeatInformationWithOptions(request, runtime);
    }

    public GetSkillGroupAgentStatusDetailsResponse getSkillGroupAgentStatusDetailsWithOptions(GetSkillGroupAgentStatusDetailsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSkillGroupAgentStatusDetailsShrinkRequest request = new GetSkillGroupAgentStatusDetailsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillGroupAgentStatusDetails"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillGroupAgentStatusDetailsResponse());
    }

    public GetSkillGroupAgentStatusDetailsResponse getSkillGroupAgentStatusDetails(GetSkillGroupAgentStatusDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSkillGroupAgentStatusDetailsWithOptions(request, runtime);
    }

    public GetSkillGroupAndAgentStatusSummaryResponse getSkillGroupAndAgentStatusSummaryWithOptions(GetSkillGroupAndAgentStatusSummaryRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSkillGroupAndAgentStatusSummaryShrinkRequest request = new GetSkillGroupAndAgentStatusSummaryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillGroupAndAgentStatusSummary"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillGroupAndAgentStatusSummaryResponse());
    }

    public GetSkillGroupAndAgentStatusSummaryResponse getSkillGroupAndAgentStatusSummary(GetSkillGroupAndAgentStatusSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSkillGroupAndAgentStatusSummaryWithOptions(request, runtime);
    }

    public GetSkillGroupLatitudeStateResponse getSkillGroupLatitudeStateWithOptions(GetSkillGroupLatitudeStateRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSkillGroupLatitudeStateShrinkRequest request = new GetSkillGroupLatitudeStateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillGroupLatitudeState"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillGroupLatitudeStateResponse());
    }

    public GetSkillGroupLatitudeStateResponse getSkillGroupLatitudeState(GetSkillGroupLatitudeStateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSkillGroupLatitudeStateWithOptions(request, runtime);
    }

    public GetSkillGroupServiceCapabilityResponse getSkillGroupServiceCapabilityWithOptions(GetSkillGroupServiceCapabilityRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSkillGroupServiceCapabilityShrinkRequest request = new GetSkillGroupServiceCapabilityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillGroupServiceCapability"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillGroupServiceCapabilityResponse());
    }

    public GetSkillGroupServiceCapabilityResponse getSkillGroupServiceCapability(GetSkillGroupServiceCapabilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSkillGroupServiceCapabilityWithOptions(request, runtime);
    }

    public GetSkillGroupServiceStatusResponse getSkillGroupServiceStatusWithOptions(GetSkillGroupServiceStatusRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSkillGroupServiceStatusShrinkRequest request = new GetSkillGroupServiceStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillGroupServiceStatus"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillGroupServiceStatusResponse());
    }

    public GetSkillGroupServiceStatusResponse getSkillGroupServiceStatus(GetSkillGroupServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSkillGroupServiceStatusWithOptions(request, runtime);
    }

    public GetSkillGroupStatusTotalResponse getSkillGroupStatusTotalWithOptions(GetSkillGroupStatusTotalRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSkillGroupStatusTotalShrinkRequest request = new GetSkillGroupStatusTotalShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillGroupStatusTotal"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillGroupStatusTotalResponse());
    }

    public GetSkillGroupStatusTotalResponse getSkillGroupStatusTotal(GetSkillGroupStatusTotalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSkillGroupStatusTotalWithOptions(request, runtime);
    }

    public GetTagListResponse getTagListWithOptions(GetTagListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            body.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTagList"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTagListResponse());
    }

    public GetTagListResponse getTagList(GetTagListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTagListWithOptions(request, runtime);
    }

    public GetTicketByCaseIdResponse getTicketByCaseIdWithOptions(GetTicketByCaseIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caseId)) {
            body.put("CaseId", request.caseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTicketByCaseId"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTicketByCaseIdResponse());
    }

    public GetTicketByCaseIdResponse getTicketByCaseId(GetTicketByCaseIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTicketByCaseIdWithOptions(request, runtime);
    }

    public GetTicketTemplateSchemaResponse getTicketTemplateSchemaWithOptions(GetTicketTemplateSchemaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTicketTemplateSchema"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTicketTemplateSchemaResponse());
    }

    public GetTicketTemplateSchemaResponse getTicketTemplateSchema(GetTicketTemplateSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTicketTemplateSchemaWithOptions(request, runtime);
    }

    public GetUserTokenResponse getUserTokenWithOptions(GetUserTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nick)) {
            body.put("Nick", request.nick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserToken"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserTokenResponse());
    }

    public GetUserTokenResponse getUserToken(GetUserTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserTokenWithOptions(request, runtime);
    }

    public GrantRolesResponse grantRolesWithOptions(GrantRolesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            body.put("RoleId", request.roleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantRoles"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantRolesResponse());
    }

    public GrantRolesResponse grantRoles(GrantRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantRolesWithOptions(request, runtime);
    }

    public HangUpAgentMonitorResponse hangUpAgentMonitorWithOptions(HangUpAgentMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HangUpAgentMonitor"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HangUpAgentMonitorResponse());
    }

    public HangUpAgentMonitorResponse hangUpAgentMonitor(HangUpAgentMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.hangUpAgentMonitorWithOptions(request, runtime);
    }

    public HangupCallResponse hangupCallWithOptions(HangupCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            body.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            body.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HangupCall"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HangupCallResponse());
    }

    public HangupCallResponse hangupCall(HangupCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.hangupCallWithOptions(request, runtime);
    }

    public HangupThirdCallResponse hangupThirdCallWithOptions(HangupThirdCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            body.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            body.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HangupThirdCall"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HangupThirdCallResponse());
    }

    public HangupThirdCallResponse hangupThirdCall(HangupThirdCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.hangupThirdCallWithOptions(request, runtime);
    }

    public HoldCallResponse holdCallWithOptions(HoldCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            body.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            body.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HoldCall"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HoldCallResponse());
    }

    public HoldCallResponse holdCall(HoldCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.holdCallWithOptions(request, runtime);
    }

    public JoinThirdCallResponse joinThirdCallWithOptions(JoinThirdCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            body.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            body.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.holdConnectionId)) {
            body.put("HoldConnectionId", request.holdConnectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinThirdCall"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinThirdCallResponse());
    }

    public JoinThirdCallResponse joinThirdCall(JoinThirdCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinThirdCallWithOptions(request, runtime);
    }

    public ListAgentBySkillGroupIdResponse listAgentBySkillGroupIdWithOptions(ListAgentBySkillGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentBySkillGroupId"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentBySkillGroupIdResponse());
    }

    public ListAgentBySkillGroupIdResponse listAgentBySkillGroupId(ListAgentBySkillGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAgentBySkillGroupIdWithOptions(request, runtime);
    }

    public ListAllHotLineSkillGroupsResponse listAllHotLineSkillGroupsWithOptions(ListAllHotLineSkillGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllHotLineSkillGroups"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllHotLineSkillGroupsResponse());
    }

    public ListAllHotLineSkillGroupsResponse listAllHotLineSkillGroups(ListAllHotLineSkillGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAllHotLineSkillGroupsWithOptions(request, runtime);
    }

    public ListHotlineRecordResponse listHotlineRecordWithOptions(ListHotlineRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotlineRecord"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotlineRecordResponse());
    }

    public ListHotlineRecordResponse listHotlineRecord(ListHotlineRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHotlineRecordWithOptions(request, runtime);
    }

    public ListOutboundPhoneNumberResponse listOutboundPhoneNumberWithOptions(ListOutboundPhoneNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOutboundPhoneNumber"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOutboundPhoneNumberResponse());
    }

    public ListOutboundPhoneNumberResponse listOutboundPhoneNumber(ListOutboundPhoneNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOutboundPhoneNumberWithOptions(request, runtime);
    }

    public ListSkillGroupResponse listSkillGroupWithOptions(ListSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkillGroup"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillGroupResponse());
    }

    public ListSkillGroupResponse listSkillGroup(ListSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSkillGroupWithOptions(request, runtime);
    }

    public LogOptimizationResponse logOptimizationWithOptions(LogOptimizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acid)) {
            query.put("Acid", request.acid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNum)) {
            query.put("PhoneNum", request.phoneNum);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LogOptimization"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LogOptimizationResponse());
    }

    public LogOptimizationResponse logOptimization(LogOptimizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.logOptimizationWithOptions(request, runtime);
    }

    public QueryAppResDiffResponse queryAppResDiffWithOptions(QueryAppResDiffRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAppResDiff"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAppResDiffResponse());
    }

    public QueryAppResDiffResponse queryAppResDiff(QueryAppResDiffRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAppResDiffWithOptions(request, runtime);
    }

    public QueryAppResValueResponse queryAppResValueWithOptions(QueryAppResValueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAppResValue"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAppResValueResponse());
    }

    public QueryAppResValueResponse queryAppResValue(QueryAppResValueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAppResValueWithOptions(request, runtime);
    }

    public QueryDeploymentArchiveResponse queryDeploymentArchiveWithOptions(QueryDeploymentArchiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeploymentArchive"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeploymentArchiveResponse());
    }

    public QueryDeploymentArchiveResponse queryDeploymentArchive(QueryDeploymentArchiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeploymentArchiveWithOptions(request, runtime);
    }

    public QueryHotlineDashboardResponse queryHotlineDashboardWithOptions(QueryHotlineDashboardRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryHotlineDashboardShrinkRequest request = new QueryHotlineDashboardShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.departmentIdList)) {
            request.departmentIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.departmentIdList, "DepartmentIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.servicerIdList)) {
            request.servicerIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.servicerIdList, "ServicerIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sortFieldList)) {
            request.sortFieldListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sortFieldList, "SortFieldList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPageNum)) {
            query.put("CurrentPageNum", request.currentPageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentIdListShrink)) {
            query.put("DepartmentIdList", request.departmentIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicerIdListShrink)) {
            query.put("ServicerIdList", request.servicerIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortFieldListShrink)) {
            query.put("SortFieldList", request.sortFieldListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryHotlineDashboard"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHotlineDashboardResponse());
    }

    public QueryHotlineDashboardResponse queryHotlineDashboard(QueryHotlineDashboardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryHotlineDashboardWithOptions(request, runtime);
    }

    public QueryHotlineSessionResponse queryHotlineSessionWithOptions(QueryHotlineSessionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acid)) {
            query.put("Acid", request.acid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callResult)) {
            query.put("CallResult", request.callResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callType)) {
            query.put("CallType", request.callType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberName)) {
            query.put("MemberName", request.memberName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryEndTime)) {
            query.put("QueryEndTime", request.queryEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryStartTime)) {
            query.put("QueryStartTime", request.queryStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicerId)) {
            query.put("ServicerId", request.servicerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicerName)) {
            query.put("ServicerName", request.servicerName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryHotlineSession"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHotlineSessionResponse());
    }

    public QueryHotlineSessionResponse queryHotlineSession(QueryHotlineSessionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryHotlineSessionWithOptions(request, runtime);
    }

    public QueryRelationTicketsResponse queryRelationTicketsWithOptions(QueryRelationTicketsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caseId)) {
            body.put("CaseId", request.caseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caseType)) {
            body.put("CaseType", request.caseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            body.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dealId)) {
            body.put("DealId", request.dealId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endCaseGmtCreate)) {
            body.put("EndCaseGmtCreate", request.endCaseGmtCreate);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            bodyFlat.put("Extra", request.extra);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            body.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srType)) {
            body.put("SrType", request.srType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startCaseGmtCreate)) {
            body.put("StartCaseGmtCreate", request.startCaseGmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            body.put("TaskStatus", request.taskStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.touchId)) {
            body.put("TouchId", request.touchId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRelationTickets"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRelationTicketsResponse());
    }

    public QueryRelationTicketsResponse queryRelationTickets(QueryRelationTicketsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRelationTicketsWithOptions(request, runtime);
    }

    public QueryRingDetailListResponse queryRingDetailListWithOptions(QueryRingDetailListRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryRingDetailListShrinkRequest request = new QueryRingDetailListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fromPhoneNumList)) {
            request.fromPhoneNumListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fromPhoneNumList, "FromPhoneNumList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.toPhoneNumList)) {
            request.toPhoneNumListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.toPhoneNumList, "ToPhoneNumList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callOutStatus)) {
            body.put("CallOutStatus", request.callOutStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            body.put("Extra", request.extra);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromPhoneNumListShrink)) {
            body.put("FromPhoneNumList", request.fromPhoneNumListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toPhoneNumListShrink)) {
            body.put("ToPhoneNumList", request.toPhoneNumListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRingDetailList"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRingDetailListResponse());
    }

    public QueryRingDetailListResponse queryRingDetailList(QueryRingDetailListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRingDetailListWithOptions(request, runtime);
    }

    public QueryServiceConfigResponse queryServiceConfigWithOptions(QueryServiceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryServiceConfig"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryServiceConfigResponse());
    }

    public QueryServiceConfigResponse queryServiceConfig(QueryServiceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryServiceConfigWithOptions(request, runtime);
    }

    public QueryServicerByDepartmentAndMixNameResponse queryServicerByDepartmentAndMixNameWithOptions(QueryServicerByDepartmentAndMixNameRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryServicerByDepartmentAndMixNameShrinkRequest request = new QueryServicerByDepartmentAndMixNameShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.departmentIdList)) {
            request.departmentIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.departmentIdList, "DepartmentIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPageNum)) {
            query.put("CurrentPageNum", request.currentPageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentIdListShrink)) {
            query.put("DepartmentIdList", request.departmentIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryServicerByDepartmentAndMixName"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryServicerByDepartmentAndMixNameResponse());
    }

    public QueryServicerByDepartmentAndMixNameResponse queryServicerByDepartmentAndMixName(QueryServicerByDepartmentAndMixNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryServicerByDepartmentAndMixNameWithOptions(request, runtime);
    }

    public QueryServicerByIdResponse queryServicerByIdWithOptions(QueryServicerByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicerId)) {
            query.put("ServicerId", request.servicerId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryServicerById"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryServicerByIdResponse());
    }

    public QueryServicerByIdResponse queryServicerById(QueryServicerByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryServicerByIdWithOptions(request, runtime);
    }

    public QuerySkillGroupsResponse querySkillGroupsWithOptions(QuerySkillGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySkillGroups"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySkillGroupsResponse());
    }

    public QuerySkillGroupsResponse querySkillGroups(QuerySkillGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySkillGroupsWithOptions(request, runtime);
    }

    public QueryTicketActionsResponse queryTicketActionsWithOptions(QueryTicketActionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionCodeList)) {
            body.put("ActionCodeList", request.actionCodeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            body.put("TicketId", request.ticketId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTicketActions"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTicketActionsResponse());
    }

    public QueryTicketActionsResponse queryTicketActions(QueryTicketActionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTicketActionsWithOptions(request, runtime);
    }

    public QueryTicketCountResponse queryTicketCountWithOptions(QueryTicketCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            query.put("OperatorId", request.operatorId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTicketCount"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTicketCountResponse());
    }

    public QueryTicketCountResponse queryTicketCount(QueryTicketCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTicketCountWithOptions(request, runtime);
    }

    public QueryTicketsResponse queryTicketsWithOptions(QueryTicketsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryTicketsShrinkRequest request = new QueryTicketsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "Extra", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caseId)) {
            body.put("CaseId", request.caseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caseStatus)) {
            body.put("CaseStatus", request.caseStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caseType)) {
            body.put("CaseType", request.caseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            body.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dealId)) {
            body.put("DealId", request.dealId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endCaseGmtCreate)) {
            body.put("EndCaseGmtCreate", request.endCaseGmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraShrink)) {
            body.put("Extra", request.extraShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            body.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCaseId)) {
            body.put("ParentCaseId", request.parentCaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srType)) {
            body.put("SrType", request.srType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startCaseGmtCreate)) {
            body.put("StartCaseGmtCreate", request.startCaseGmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            body.put("TaskStatus", request.taskStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.touchId)) {
            body.put("TouchId", request.touchId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTickets"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTicketsResponse());
    }

    public QueryTicketsResponse queryTickets(QueryTicketsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTicketsWithOptions(request, runtime);
    }

    public RemoveSkillGroupResponse removeSkillGroupWithOptions(RemoveSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            body.put("SkillGroupId", request.skillGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveSkillGroup"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveSkillGroupResponse());
    }

    public RemoveSkillGroupResponse removeSkillGroup(RemoveSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeSkillGroupWithOptions(request, runtime);
    }

    public SearchTicketByIdResponse searchTicketByIdWithOptions(SearchTicketByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchTicketById"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchTicketByIdResponse());
    }

    public SearchTicketByIdResponse searchTicketById(SearchTicketByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchTicketByIdWithOptions(request, runtime);
    }

    public SearchTicketByPhoneResponse searchTicketByPhoneWithOptions(SearchTicketByPhoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchTicketByPhone"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchTicketByPhoneResponse());
    }

    public SearchTicketByPhoneResponse searchTicketByPhone(SearchTicketByPhoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchTicketByPhoneWithOptions(request, runtime);
    }

    public SearchTicketListResponse searchTicketListWithOptions(SearchTicketListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchTicketList"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchTicketListResponse());
    }

    public SearchTicketListResponse searchTicketList(SearchTicketListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchTicketListWithOptions(request, runtime);
    }

    public SendHotlineHeartBeatResponse sendHotlineHeartBeatWithOptions(SendHotlineHeartBeatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendHotlineHeartBeat"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendHotlineHeartBeatResponse());
    }

    public SendHotlineHeartBeatResponse sendHotlineHeartBeat(SendHotlineHeartBeatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendHotlineHeartBeatWithOptions(request, runtime);
    }

    public SendOutboundCommandResponse sendOutboundCommandWithOptions(SendOutboundCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            body.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            body.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerInfo)) {
            body.put("CustomerInfo", request.customerInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendOutboundCommand"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendOutboundCommandResponse());
    }

    public SendOutboundCommandResponse sendOutboundCommand(SendOutboundCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendOutboundCommandWithOptions(request, runtime);
    }

    public StartAgentMonitorResponse startAgentMonitorWithOptions(StartAgentMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAgentMonitor"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartAgentMonitorResponse());
    }

    public StartAgentMonitorResponse startAgentMonitor(StartAgentMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startAgentMonitorWithOptions(request, runtime);
    }

    public StartCallResponse startCallWithOptions(StartCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callee)) {
            body.put("Callee", request.callee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            body.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartCall"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartCallResponse());
    }

    public StartCallResponse startCall(StartCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startCallWithOptions(request, runtime);
    }

    public StartCallV2Response startCallV2WithOptions(StartCallV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callee)) {
            body.put("Callee", request.callee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            body.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonMsg)) {
            body.put("JsonMsg", request.jsonMsg);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartCallV2"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartCallV2Response());
    }

    public StartCallV2Response startCallV2(StartCallV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startCallV2WithOptions(request, runtime);
    }

    public StartChatWorkResponse startChatWorkWithOptions(StartChatWorkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartChatWork"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartChatWorkResponse());
    }

    public StartChatWorkResponse startChatWork(StartChatWorkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startChatWorkWithOptions(request, runtime);
    }

    public StartHotlineServiceResponse startHotlineServiceWithOptions(StartHotlineServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartHotlineService"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartHotlineServiceResponse());
    }

    public StartHotlineServiceResponse startHotlineService(StartHotlineServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startHotlineServiceWithOptions(request, runtime);
    }

    public SuspendHotlineServiceResponse suspendHotlineServiceWithOptions(SuspendHotlineServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendHotlineService"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendHotlineServiceResponse());
    }

    public SuspendHotlineServiceResponse suspendHotlineService(SuspendHotlineServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendHotlineServiceWithOptions(request, runtime);
    }

    public TransferCallToAgentResponse transferCallToAgentWithOptions(TransferCallToAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            body.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            body.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.holdConnectionId)) {
            body.put("HoldConnectionId", request.holdConnectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSingleTransfer)) {
            body.put("IsSingleTransfer", request.isSingleTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetAccountName)) {
            body.put("TargetAccountName", request.targetAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferCallToAgent"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferCallToAgentResponse());
    }

    public TransferCallToAgentResponse transferCallToAgent(TransferCallToAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferCallToAgentWithOptions(request, runtime);
    }

    public TransferCallToPhoneResponse transferCallToPhoneWithOptions(TransferCallToPhoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            body.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callee)) {
            body.put("Callee", request.callee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            body.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            body.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.holdConnectionId)) {
            body.put("HoldConnectionId", request.holdConnectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSingleTransfer)) {
            body.put("IsSingleTransfer", request.isSingleTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calleePhone)) {
            body.put("calleePhone", request.calleePhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerPhone)) {
            body.put("callerPhone", request.callerPhone);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferCallToPhone"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferCallToPhoneResponse());
    }

    public TransferCallToPhoneResponse transferCallToPhone(TransferCallToPhoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferCallToPhoneWithOptions(request, runtime);
    }

    public TransferCallToSkillGroupResponse transferCallToSkillGroupWithOptions(TransferCallToSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            body.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            body.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.holdConnectionId)) {
            body.put("HoldConnectionId", request.holdConnectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSingleTransfer)) {
            body.put("IsSingleTransfer", request.isSingleTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            body.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferCallToSkillGroup"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferCallToSkillGroupResponse());
    }

    public TransferCallToSkillGroupResponse transferCallToSkillGroup(TransferCallToSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferCallToSkillGroupWithOptions(request, runtime);
    }

    public TransferToThirdCallResponse transferToThirdCallWithOptions(TransferToThirdCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            body.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            body.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.holdConnectionId)) {
            body.put("HoldConnectionId", request.holdConnectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferToThirdCall"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferToThirdCallResponse());
    }

    public TransferToThirdCallResponse transferToThirdCall(TransferToThirdCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferToThirdCallWithOptions(request, runtime);
    }

    public UpdateAgentResponse updateAgentWithOptions(UpdateAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            body.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIdList)) {
            body.put("SkillGroupIdList", request.skillGroupIdList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgent"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgentResponse());
    }

    public UpdateAgentResponse updateAgent(UpdateAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAgentWithOptions(request, runtime);
    }

    public UpdateCustomerResponse updateCustomerWithOptions(UpdateCustomerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacter)) {
            query.put("Contacter", request.contacter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingding)) {
            query.put("Dingding", request.dingding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("Industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerName)) {
            query.put("ManagerName", request.managerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerId)) {
            query.put("OuterId", request.outerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerIdType)) {
            query.put("OuterIdType", request.outerIdType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.position)) {
            query.put("Position", request.position);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodLineId)) {
            query.put("ProdLineId", request.prodLineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeCode)) {
            query.put("TypeCode", request.typeCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomer"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomerResponse());
    }

    public UpdateCustomerResponse updateCustomer(UpdateCustomerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCustomerWithOptions(request, runtime);
    }

    public UpdateEntityTagRelationResponse updateEntityTagRelationWithOptions(UpdateEntityTagRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityTagParam)) {
            body.put("EntityTagParam", request.entityTagParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEntityTagRelation"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEntityTagRelationResponse());
    }

    public UpdateEntityTagRelationResponse updateEntityTagRelation(UpdateEntityTagRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEntityTagRelationWithOptions(request, runtime);
    }

    public UpdateRingStatusResponse updateRingStatusWithOptions(UpdateRingStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callOutStatus)) {
            body.put("CallOutStatus", request.callOutStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            body.put("Extra", request.extra);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueBizId)) {
            body.put("UniqueBizId", request.uniqueBizId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRingStatus"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRingStatusResponse());
    }

    public UpdateRingStatusResponse updateRingStatus(UpdateRingStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRingStatusWithOptions(request, runtime);
    }

    public UpdateRoleResponse updateRoleWithOptions(UpdateRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionId)) {
            body.put("PermissionId", request.permissionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            body.put("RoleId", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRole"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRoleResponse());
    }

    public UpdateRoleResponse updateRole(UpdateRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRoleWithOptions(request, runtime);
    }

    public UpdateSkillGroupResponse updateSkillGroupWithOptions(UpdateSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupName)) {
            query.put("SkillGroupName", request.skillGroupName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSkillGroup"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSkillGroupResponse());
    }

    public UpdateSkillGroupResponse updateSkillGroup(UpdateSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSkillGroupWithOptions(request, runtime);
    }

    public UpdateTicketResponse updateTicketWithOptions(UpdateTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formData)) {
            body.put("FormData", request.formData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            body.put("TicketId", request.ticketId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTicket"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTicketResponse());
    }

    public UpdateTicketResponse updateTicket(UpdateTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTicketWithOptions(request, runtime);
    }

    public XspaceNextbotChatResponse xspaceNextbotChatWithOptions(XspaceNextbotChatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            query.put("KnowledgeId", request.knowledgeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.question)) {
            query.put("Question", request.question);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotId)) {
            query.put("RobotId", request.robotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderId)) {
            query.put("SenderId", request.senderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderNick)) {
            query.put("SenderNick", request.senderNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "XspaceNextbotChat"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new XspaceNextbotChatResponse());
    }

    public XspaceNextbotChatResponse xspaceNextbotChat(XspaceNextbotChatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.xspaceNextbotChatWithOptions(request, runtime);
    }

    public XspaceNextbotCreatTenantResponse xspaceNextbotCreatTenantWithOptions(XspaceNextbotCreatTenantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buId)) {
            query.put("BuId", request.buId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buName)) {
            query.put("BuName", request.buName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "XspaceNextbotCreatTenant"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new XspaceNextbotCreatTenantResponse());
    }

    public XspaceNextbotCreatTenantResponse xspaceNextbotCreatTenant(XspaceNextbotCreatTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.xspaceNextbotCreatTenantWithOptions(request, runtime);
    }

    public XspaceNextbotInitTenantResponse xspaceNextbotInitTenantWithOptions(XspaceNextbotInitTenantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kwLibrary)) {
            query.put("KwLibrary", request.kwLibrary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productEndTime)) {
            query.put("ProductEndTime", request.productEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productStartTime)) {
            query.put("ProductStartTime", request.productStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productValidPeriod)) {
            query.put("ProductValidPeriod", request.productValidPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantDesc)) {
            query.put("TenantDesc", request.tenantDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantName)) {
            query.put("TenantName", request.tenantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "XspaceNextbotInitTenant"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new XspaceNextbotInitTenantResponse());
    }

    public XspaceNextbotInitTenantResponse xspaceNextbotInitTenant(XspaceNextbotInitTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.xspaceNextbotInitTenantWithOptions(request, runtime);
    }

    public CreateTicketWithBizDataResponse createTicketWithBizDataWithOptions(CreateTicketWithBizDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizData)) {
            body.put("BizData", request.bizData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.carbonCopy)) {
            body.put("CarbonCopy", request.carbonCopy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorName)) {
            body.put("CreatorName", request.creatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorType)) {
            body.put("CreatorType", request.creatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formData)) {
            body.put("FormData", request.formData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromInfo)) {
            body.put("FromInfo", request.fromInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            body.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberName)) {
            body.put("MemberName", request.memberName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "createTicketWithBizData"),
            new TeaPair("version", "2020-07-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTicketWithBizDataResponse());
    }

    public CreateTicketWithBizDataResponse createTicketWithBizData(CreateTicketWithBizDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTicketWithBizDataWithOptions(request, runtime);
    }
}

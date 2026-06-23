// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209;

import com.aliyun.tea.*;
import com.aliyun.yundun_bastionhost20191209.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-beijing", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "bastionhost.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "bastionhost.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-shanghai", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-heyuan", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-chengdu", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-hongkong", "bastionhost.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "bastionhost.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "bastionhost.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "bastionhost.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "bastionhost.ap-southeast-5.aliyuncs.com"),
            new TeaPair("us-east-1", "bastionhost.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "bastionhost.us-west-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "bastionhost.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "bastionhost.eu-central-1.aliyuncs.com"),
            new TeaPair("me-east-1", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("ap-south-1", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-edge-1", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-fujian", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-wuhan", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-jva", "yundun-bastionhost.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "bastionhost.ap-southeast-6.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "bastionhost.ap-northeast-2.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("yundun-bastionhost", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>description</b> :
     * <p>Approves an O\&amp;M engineer\&quot;s command execution request as a Bastionhost administrator.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>If an O\\\\\\&amp;M engineer attempts to run a command specified in the Command Approval field on the Create Control Policy page, the administrator is notified to review the command in the Bastionhost console. The command can be run only after it is approved by the administrator.</p>
     * 
     * @param request AcceptApproveCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AcceptApproveCommandResponse
     */
    public AcceptApproveCommandResponse acceptApproveCommandWithOptions(AcceptApproveCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandId)) {
            query.put("CommandId", request.commandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AcceptApproveCommand"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AcceptApproveCommandResponse());
    }

    /**
     * <b>description</b> :
     * <p>Approves an O\&amp;M engineer\&quot;s command execution request as a Bastionhost administrator.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>If an O\\\\\\&amp;M engineer attempts to run a command specified in the Command Approval field on the Create Control Policy page, the administrator is notified to review the command in the Bastionhost console. The command can be run only after it is approved by the administrator.</p>
     * 
     * @param request AcceptApproveCommandRequest
     * @return AcceptApproveCommandResponse
     */
    public AcceptApproveCommandResponse acceptApproveCommand(AcceptApproveCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acceptApproveCommandWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Approves an O\&amp;M engineer\&quot;s O\&amp;M application as a Bastionhost administrator.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Approves an O\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&amp;M application.</p>
     * 
     * @param request AcceptOperationTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AcceptOperationTicketResponse
     */
    public AcceptOperationTicketResponse acceptOperationTicketWithOptions(AcceptOperationTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectCount)) {
            query.put("EffectCount", request.effectCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectEndTime)) {
            query.put("EffectEndTime", request.effectEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectStartTime)) {
            query.put("EffectStartTime", request.effectStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationTicketId)) {
            query.put("OperationTicketId", request.operationTicketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AcceptOperationTicket"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AcceptOperationTicketResponse());
    }

    /**
     * <b>description</b> :
     * <p>Approves an O\&amp;M engineer\&quot;s O\&amp;M application as a Bastionhost administrator.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Approves an O\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&amp;M application.</p>
     * 
     * @param request AcceptOperationTicketRequest
     * @return AcceptOperationTicketResponse
     */
    public AcceptOperationTicketResponse acceptOperationTicket(AcceptOperationTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acceptOperationTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds multiple databases to a specified asset group.</p>
     * 
     * @param request AddDatabasesToGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDatabasesToGroupResponse
     */
    public AddDatabasesToGroupResponse addDatabasesToGroupWithOptions(AddDatabasesToGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseIds)) {
            query.put("DatabaseIds", request.databaseIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostGroupId)) {
            query.put("HostGroupId", request.hostGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDatabasesToGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDatabasesToGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds multiple databases to a specified asset group.</p>
     * 
     * @param request AddDatabasesToGroupRequest
     * @return AddDatabasesToGroupResponse
     */
    public AddDatabasesToGroupResponse addDatabasesToGroup(AddDatabasesToGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDatabasesToGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Adds multiple hosts to a host group. By adding multiple hosts to a host group, you can centrally manage these hosts and grant permissions in batch.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more hosts to the specified host group.</p>
     * 
     * @param request AddHostsToGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddHostsToGroupResponse
     */
    public AddHostsToGroupResponse addHostsToGroupWithOptions(AddHostsToGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostGroupId)) {
            query.put("HostGroupId", request.hostGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostIds)) {
            query.put("HostIds", request.hostIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddHostsToGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddHostsToGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Adds multiple hosts to a host group. By adding multiple hosts to a host group, you can centrally manage these hosts and grant permissions in batch.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more hosts to the specified host group.</p>
     * 
     * @param request AddHostsToGroupRequest
     * @return AddHostsToGroupResponse
     */
    public AddHostsToGroupResponse addHostsToGroup(AddHostsToGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addHostsToGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a Resource Directory (RD) member account to a Bastionhost instance so that you can import and manage the cloud assets of the member account through Bastionhost.</p>
     * 
     * @param request AddInstanceRdMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddInstanceRdMemberResponse
     */
    public AddInstanceRdMemberResponse addInstanceRdMemberWithOptions(AddInstanceRdMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddInstanceRdMember"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddInstanceRdMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a Resource Directory (RD) member account to a Bastionhost instance so that you can import and manage the cloud assets of the member account through Bastionhost.</p>
     * 
     * @param request AddInstanceRdMemberRequest
     * @return AddInstanceRdMemberResponse
     */
    public AddInstanceRdMemberResponse addInstanceRdMember(AddInstanceRdMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addInstanceRdMemberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1></h1>
     * <p>Adds one or more users to a user group. After creating a user group with the <a href="https://help.aliyun.com/document_detail/204596.html">CreateUserGroup</a> operation, use this operation to add multiple users at once for centralized permission management.</p>
     * <h1>Limit</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Add one or more users to a user group.</p>
     * 
     * @param request AddUsersToGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUsersToGroupResponse
     */
    public AddUsersToGroupResponse addUsersToGroupWithOptions(AddUsersToGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUsersToGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUsersToGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h1></h1>
     * <p>Adds one or more users to a user group. After creating a user group with the <a href="https://help.aliyun.com/document_detail/204596.html">CreateUserGroup</a> operation, use this operation to add multiple users at once for centralized permission management.</p>
     * <h1>Limit</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Add one or more users to a user group.</p>
     * 
     * @param request AddUsersToGroupRequest
     * @return AddUsersToGroupResponse
     */
    public AddUsersToGroupResponse addUsersToGroup(AddUsersToGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUsersToGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Approves an O&amp;M task request.</p>
     * 
     * @param request AllowOperationTaskApprovalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AllowOperationTaskApprovalResponse
     */
    public AllowOperationTaskApprovalResponse allowOperationTaskApprovalWithOptions(AllowOperationTaskApprovalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approveId)) {
            query.put("ApproveId", request.approveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllowOperationTaskApproval"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllowOperationTaskApprovalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Approves an O&amp;M task request.</p>
     * 
     * @param request AllowOperationTaskApprovalRequest
     * @return AllowOperationTaskApprovalResponse
     */
    public AllowOperationTaskApprovalResponse allowOperationTaskApproval(AllowOperationTaskApprovalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allowOperationTaskApprovalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Authorizes a user to manage databases and database accounts.</p>
     * 
     * @param request AttachDatabaseAccountsToUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachDatabaseAccountsToUserResponse
     */
    public AttachDatabaseAccountsToUserResponse attachDatabaseAccountsToUserWithOptions(AttachDatabaseAccountsToUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databases)) {
            query.put("Databases", request.databases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachDatabaseAccountsToUser"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachDatabaseAccountsToUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Authorizes a user to manage databases and database accounts.</p>
     * 
     * @param request AttachDatabaseAccountsToUserRequest
     * @return AttachDatabaseAccountsToUserResponse
     */
    public AttachDatabaseAccountsToUserResponse attachDatabaseAccountsToUser(AttachDatabaseAccountsToUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachDatabaseAccountsToUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Grants permissions on databases and database accounts to a user group.</p>
     * 
     * @param request AttachDatabaseAccountsToUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachDatabaseAccountsToUserGroupResponse
     */
    public AttachDatabaseAccountsToUserGroupResponse attachDatabaseAccountsToUserGroupWithOptions(AttachDatabaseAccountsToUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databases)) {
            query.put("Databases", request.databases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachDatabaseAccountsToUserGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachDatabaseAccountsToUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Grants permissions on databases and database accounts to a user group.</p>
     * 
     * @param request AttachDatabaseAccountsToUserGroupRequest
     * @return AttachDatabaseAccountsToUserGroupResponse
     */
    public AttachDatabaseAccountsToUserGroupResponse attachDatabaseAccountsToUserGroup(AttachDatabaseAccountsToUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachDatabaseAccountsToUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates host accounts with a shared key.</p>
     * 
     * @param request AttachHostAccountsToHostShareKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachHostAccountsToHostShareKeyResponse
     */
    public AttachHostAccountsToHostShareKeyResponse attachHostAccountsToHostShareKeyWithOptions(AttachHostAccountsToHostShareKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostAccountIds)) {
            query.put("HostAccountIds", request.hostAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostShareKeyId)) {
            query.put("HostShareKeyId", request.hostShareKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachHostAccountsToHostShareKey"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachHostAccountsToHostShareKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates host accounts with a shared key.</p>
     * 
     * @param request AttachHostAccountsToHostShareKeyRequest
     * @return AttachHostAccountsToHostShareKeyResponse
     */
    public AttachHostAccountsToHostShareKeyResponse attachHostAccountsToHostShareKey(AttachHostAccountsToHostShareKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachHostAccountsToHostShareKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>After you add a user to your bastion host, you must authorize the user to manage assets. Only authorized users can log on to the bastion host to perform O\\\\\\\\\\\\&amp;M operations on the assets.</p>
     * 
     * @param request AttachHostAccountsToUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachHostAccountsToUserResponse
     */
    public AttachHostAccountsToUserResponse attachHostAccountsToUserWithOptions(AttachHostAccountsToUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hosts)) {
            query.put("Hosts", request.hosts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachHostAccountsToUser"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachHostAccountsToUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>After you add a user to your bastion host, you must authorize the user to manage assets. Only authorized users can log on to the bastion host to perform O\\\\\\\\\\\\&amp;M operations on the assets.</p>
     * 
     * @param request AttachHostAccountsToUserRequest
     * @return AttachHostAccountsToUserResponse
     */
    public AttachHostAccountsToUserResponse attachHostAccountsToUser(AttachHostAccountsToUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachHostAccountsToUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you authorize a user group to manage specific hosts and host accounts, all the users in the user group have access to the authorized hosts and host accounts.</p>
     * 
     * <b>summary</b> : 
     * <p>Authorizes a user group to manage one or more hosts and host accounts.</p>
     * 
     * @param request AttachHostAccountsToUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachHostAccountsToUserGroupResponse
     */
    public AttachHostAccountsToUserGroupResponse attachHostAccountsToUserGroupWithOptions(AttachHostAccountsToUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hosts)) {
            query.put("Hosts", request.hosts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachHostAccountsToUserGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachHostAccountsToUserGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you authorize a user group to manage specific hosts and host accounts, all the users in the user group have access to the authorized hosts and host accounts.</p>
     * 
     * <b>summary</b> : 
     * <p>Authorizes a user group to manage one or more hosts and host accounts.</p>
     * 
     * @param request AttachHostAccountsToUserGroupRequest
     * @return AttachHostAccountsToUserGroupResponse
     */
    public AttachHostAccountsToUserGroupResponse attachHostAccountsToUserGroup(AttachHostAccountsToUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachHostAccountsToUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Authorizes a user to manage one or more host groups and host accounts.</p>
     * 
     * @param request AttachHostGroupAccountsToUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachHostGroupAccountsToUserResponse
     */
    public AttachHostGroupAccountsToUserResponse attachHostGroupAccountsToUserWithOptions(AttachHostGroupAccountsToUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostGroups)) {
            query.put("HostGroups", request.hostGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachHostGroupAccountsToUser"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachHostGroupAccountsToUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Authorizes a user to manage one or more host groups and host accounts.</p>
     * 
     * @param request AttachHostGroupAccountsToUserRequest
     * @return AttachHostGroupAccountsToUserResponse
     */
    public AttachHostGroupAccountsToUserResponse attachHostGroupAccountsToUser(AttachHostGroupAccountsToUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachHostGroupAccountsToUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Authorizes a user to manage one or more host groups and host accounts.</p>
     * 
     * @param request AttachHostGroupAccountsToUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachHostGroupAccountsToUserGroupResponse
     */
    public AttachHostGroupAccountsToUserGroupResponse attachHostGroupAccountsToUserGroupWithOptions(AttachHostGroupAccountsToUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostGroups)) {
            query.put("HostGroups", request.hostGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachHostGroupAccountsToUserGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachHostGroupAccountsToUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Authorizes a user to manage one or more host groups and host accounts.</p>
     * 
     * @param request AttachHostGroupAccountsToUserGroupRequest
     * @return AttachHostGroupAccountsToUserGroupResponse
     */
    public AttachHostGroupAccountsToUserGroupResponse attachHostGroupAccountsToUserGroup(AttachHostGroupAccountsToUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachHostGroupAccountsToUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the security groups that control inbound and outbound network traffic for a Bastionhost instance.</p>
     * 
     * @param request ConfigInstanceSecurityGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigInstanceSecurityGroupsResponse
     */
    public ConfigInstanceSecurityGroupsResponse configInstanceSecurityGroupsWithOptions(ConfigInstanceSecurityGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizedSecurityGroups)) {
            query.put("AuthorizedSecurityGroups", request.authorizedSecurityGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigInstanceSecurityGroups"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigInstanceSecurityGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the security groups that control inbound and outbound network traffic for a Bastionhost instance.</p>
     * 
     * @param request ConfigInstanceSecurityGroupsRequest
     * @return ConfigInstanceSecurityGroupsResponse
     */
    public ConfigInstanceSecurityGroupsResponse configInstanceSecurityGroups(ConfigInstanceSecurityGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configInstanceSecurityGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation configures a public IP address whitelist for a Bastionhost instance. By default, instances accept traffic from all public IP addresses. To restrict access, add IP addresses to the whitelist. This ensures only traffic from whitelisted IP addresses can reach the instance.
     * Each user is limited to 30 queries per second (QPS) for this operation. The system throttles API calls that exceed this limit. This may affect your services, so plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>After enabling public network access for a Bastionhost instance, you can add IP addresses to a whitelist to control access.</p>
     * 
     * @param request ConfigInstanceWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigInstanceWhiteListResponse
     */
    public ConfigInstanceWhiteListResponse configInstanceWhiteListWithOptions(ConfigInstanceWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteList)) {
            query.put("WhiteList", request.whiteList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteListPolicies)) {
            query.put("WhiteListPolicies", request.whiteListPolicies);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigInstanceWhiteList"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigInstanceWhiteListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation configures a public IP address whitelist for a Bastionhost instance. By default, instances accept traffic from all public IP addresses. To restrict access, add IP addresses to the whitelist. This ensures only traffic from whitelisted IP addresses can reach the instance.
     * Each user is limited to 30 queries per second (QPS) for this operation. The system throttles API calls that exceed this limit. This may affect your services, so plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>After enabling public network access for a Bastionhost instance, you can add IP addresses to a whitelist to control access.</p>
     * 
     * @param request ConfigInstanceWhiteListRequest
     * @return ConfigInstanceWhiteListResponse
     */
    public ConfigInstanceWhiteListResponse configInstanceWhiteList(ConfigInstanceWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configInstanceWhiteListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Imports a database into a Bastionhost instance for centralized O&amp;M management. Supported databases include ApsaraDB RDS, PolarDB, and self-managed MySQL, SQL Server, PostgreSQL, and Oracle databases.</p>
     * 
     * @param request CreateDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabaseWithOptions(CreateDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activeAddressType)) {
            query.put("ActiveAddressType", request.activeAddressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databasePort)) {
            query.put("DatabasePort", request.databasePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databasePrivateAddress)) {
            query.put("DatabasePrivateAddress", request.databasePrivateAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databasePublicAddress)) {
            query.put("DatabasePublicAddress", request.databasePublicAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseType)) {
            query.put("DatabaseType", request.databaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceMemberId)) {
            query.put("InstanceMemberId", request.instanceMemberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainId)) {
            query.put("NetworkDomainId", request.networkDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.polarDBEndpointType)) {
            query.put("PolarDBEndpointType", request.polarDBEndpointType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceId)) {
            query.put("SourceInstanceId", request.sourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceRegionId)) {
            query.put("SourceInstanceRegionId", request.sourceInstanceRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDatabase"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Imports a database into a Bastionhost instance for centralized O&amp;M management. Supported databases include ApsaraDB RDS, PolarDB, and self-managed MySQL, SQL Server, PostgreSQL, and Oracle databases.</p>
     * 
     * @param request CreateDatabaseRequest
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDatabaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>After a database is created, you can create a database account for the database. After the account is created, O\\\\\\&amp;M engineers can use the account to log on to and perform O\\\\\\&amp;M operations on the database.</p>
     * 
     * @param request CreateDatabaseAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatabaseAccountResponse
     */
    public CreateDatabaseAccountResponse createDatabaseAccountWithOptions(CreateDatabaseAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseAccountName)) {
            query.put("DatabaseAccountName", request.databaseAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseId)) {
            query.put("DatabaseId", request.databaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseSchema)) {
            query.put("DatabaseSchema", request.databaseSchema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginAttribute)) {
            query.put("LoginAttribute", request.loginAttribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDatabaseAccount"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatabaseAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>After a database is created, you can create a database account for the database. After the account is created, O\\\\\\&amp;M engineers can use the account to log on to and perform O\\\\\\&amp;M operations on the database.</p>
     * 
     * @param request CreateDatabaseAccountRequest
     * @return CreateDatabaseAccountResponse
     */
    public CreateDatabaseAccountResponse createDatabaseAccount(CreateDatabaseAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDatabaseAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a configuration backup export task. Only one configuration backup export task can run at a time for a Bastionhost instance.</p>
     * 
     * @param request CreateExportConfigJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExportConfigJobResponse
     */
    public CreateExportConfigJobResponse createExportConfigJobWithOptions(CreateExportConfigJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExportConfigJob"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExportConfigJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a configuration backup export task. Only one configuration backup export task can run at a time for a Bastionhost instance.</p>
     * 
     * @param request CreateExportConfigJobRequest
     * @return CreateExportConfigJobResponse
     */
    public CreateExportConfigJobResponse createExportConfigJob(CreateExportConfigJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExportConfigJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a host in a Bastionhost instance. You can import Elastic Compute Service (ECS) instances, on-premises servers, and third-party cloud servers as hosts for centralized O&amp;M management.</p>
     * 
     * @param request CreateHostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHostResponse
     */
    public CreateHostResponse createHostWithOptions(CreateHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activeAddressType)) {
            query.put("ActiveAddressType", request.activeAddressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostPrivateAddress)) {
            query.put("HostPrivateAddress", request.hostPrivateAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostPublicAddress)) {
            query.put("HostPublicAddress", request.hostPublicAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceMemberId)) {
            query.put("InstanceMemberId", request.instanceMemberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceRegionId)) {
            query.put("InstanceRegionId", request.instanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainId)) {
            query.put("NetworkDomainId", request.networkDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSType)) {
            query.put("OSType", request.OSType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceId)) {
            query.put("SourceInstanceId", request.sourceInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHost"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHostResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a host in a Bastionhost instance. You can import Elastic Compute Service (ECS) instances, on-premises servers, and third-party cloud servers as hosts for centralized O&amp;M management.</p>
     * 
     * @param request CreateHostRequest
     * @return CreateHostResponse
     */
    public CreateHostResponse createHost(CreateHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHostWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a host account for a host managed by a Bastionhost instance. After you create the host account, Operations and Maintenance (O&amp;M) engineers can use it to log on to the host through Bastionhost.</p>
     * 
     * @param request CreateHostAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHostAccountResponse
     */
    public CreateHostAccountResponse createHostAccountWithOptions(CreateHostAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostAccountName)) {
            query.put("HostAccountName", request.hostAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostId)) {
            query.put("HostId", request.hostId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostShareKeyId)) {
            query.put("HostShareKeyId", request.hostShareKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passPhrase)) {
            query.put("PassPhrase", request.passPhrase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateKey)) {
            query.put("PrivateKey", request.privateKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privilegeType)) {
            query.put("PrivilegeType", request.privilegeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolName)) {
            query.put("ProtocolName", request.protocolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rotationMode)) {
            query.put("RotationMode", request.rotationMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHostAccount"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHostAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a host account for a host managed by a Bastionhost instance. After you create the host account, Operations and Maintenance (O&amp;M) engineers can use it to log on to the host through Bastionhost.</p>
     * 
     * @param request CreateHostAccountRequest
     * @return CreateHostAccountResponse
     */
    public CreateHostAccountResponse createHostAccount(CreateHostAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHostAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can create asset groups based on your business requirements and add assets of the same type to an asset group. This allows you to classify assets and manage multiple assets at a time.</p>
     * 
     * @param request CreateHostGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHostGroupResponse
     */
    public CreateHostGroupResponse createHostGroupWithOptions(CreateHostGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostGroupName)) {
            query.put("HostGroupName", request.hostGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHostGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHostGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can create asset groups based on your business requirements and add assets of the same type to an asset group. This allows you to classify assets and manage multiple assets at a time.</p>
     * 
     * @param request CreateHostGroupRequest
     * @return CreateHostGroupResponse
     */
    public CreateHostGroupResponse createHostGroup(CreateHostGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHostGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Bastionhost provides the shared key feature. This feature allows you to manage the private key that is used to log on to a host in a bastion host. This way, you can associate the private key with multiple accounts of the host to make host account management more efficient.</p>
     * 
     * @param request CreateHostShareKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHostShareKeyResponse
     */
    public CreateHostShareKeyResponse createHostShareKeyWithOptions(CreateHostShareKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostShareKeyName)) {
            query.put("HostShareKeyName", request.hostShareKeyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passPhrase)) {
            query.put("PassPhrase", request.passPhrase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateKey)) {
            query.put("PrivateKey", request.privateKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHostShareKey"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHostShareKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Bastionhost provides the shared key feature. This feature allows you to manage the private key that is used to log on to a host in a bastion host. This way, you can associate the private key with multiple accounts of the host to make host account management more efficient.</p>
     * 
     * @param request CreateHostShareKeyRequest
     * @return CreateHostShareKeyResponse
     */
    public CreateHostShareKeyResponse createHostShareKey(CreateHostShareKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHostShareKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>If you want to perform O\\\\\\\\\\\\&amp;M operations on assets that reside in different networks or assets that cannot communicate with the virtual private cloud (VPC) of your bastion host in a centralized manner, we recommend that you use the network domain feature of Bastionhost. You can configure a proxy server for these assets, create a network domain for a bastion host, and then connect the network domain to the proxy server. This way, you can perform O\\\\\\\\\\\\&amp;M operations on the assets by using the bastion host.</p>
     * 
     * @param request CreateNetworkDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNetworkDomainResponse
     */
    public CreateNetworkDomainResponse createNetworkDomainWithOptions(CreateNetworkDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainName)) {
            query.put("NetworkDomainName", request.networkDomainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainType)) {
            query.put("NetworkDomainType", request.networkDomainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxies)) {
            query.put("Proxies", request.proxies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetworkDomain"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>If you want to perform O\\\\\\\\\\\\&amp;M operations on assets that reside in different networks or assets that cannot communicate with the virtual private cloud (VPC) of your bastion host in a centralized manner, we recommend that you use the network domain feature of Bastionhost. You can configure a proxy server for these assets, create a network domain for a bastion host, and then connect the network domain to the proxy server. This way, you can perform O\\\\\\\\\\\\&amp;M operations on the assets by using the bastion host.</p>
     * 
     * @param request CreateNetworkDomainRequest
     * @return CreateNetworkDomainResponse
     */
    public CreateNetworkDomainResponse createNetworkDomain(CreateNetworkDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an O&amp;M ticket for a host or database that requires approval before access. If a control policy requires O&amp;M approval, you must create and get a ticket approved before you can perform O&amp;M operations.</p>
     * 
     * @param request CreateOperationTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOperationTicketResponse
     */
    public CreateOperationTicketResponse createOperationTicketWithOptions(CreateOperationTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approveComment)) {
            query.put("ApproveComment", request.approveComment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetAccountName)) {
            query.put("AssetAccountName", request.assetAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetId)) {
            query.put("AssetId", request.assetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectEndTime)) {
            query.put("EffectEndTime", request.effectEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectStartTime)) {
            query.put("EffectStartTime", request.effectStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOneTimeEffect)) {
            query.put("IsOneTimeEffect", request.isOneTimeEffect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolName)) {
            query.put("ProtocolName", request.protocolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOperationTicket"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOperationTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an O&amp;M ticket for a host or database that requires approval before access. If a control policy requires O&amp;M approval, you must create and get a ticket approved before you can perform O&amp;M operations.</p>
     * 
     * @param request CreateOperationTicketRequest
     * @return CreateOperationTicketResponse
     */
    public CreateOperationTicketResponse createOperationTicket(CreateOperationTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOperationTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a command control, command approval, protocol control, or access control policy to manage O\\\\\\\\\\\\&amp;M operations. This effectively prevents users from performing high-risk operations or accidental operations to ensure O\\\\\\\\\\\\&amp;M security.</p>
     * 
     * @param request CreatePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicyWithOptions(CreatePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePolicy"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a command control, command approval, protocol control, or access control policy to manage O\\\\\\\\\\\\&amp;M operations. This effectively prevents users from performing high-risk operations or accidental operations to ensure O\\\\\\\\\\\\&amp;M security.</p>
     * 
     * @param request CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can create authorization rules to authorize multiple users to manage assets. You can also specify a validity period for an authorization rule. This way, you can manage users and assets in a more efficient manner and limit the time periods during which users can access assets.</p>
     * 
     * @param request CreateRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databases)) {
            query.put("Databases", request.databases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveEndTime)) {
            query.put("EffectiveEndTime", request.effectiveEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveStartTime)) {
            query.put("EffectiveStartTime", request.effectiveStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostGroups)) {
            query.put("HostGroups", request.hostGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hosts)) {
            query.put("Hosts", request.hosts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            query.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRule"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can create authorization rules to authorize multiple users to manage assets. You can also specify a validity period for an authorization rule. This way, you can manage users and assets in a more efficient manner and limit the time periods during which users can access assets.</p>
     * 
     * @param request CreateRuleRequest
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Adds local users, Resource Access Management (RAM) users, Active Directory (AD)-authenticated users, or Lightweight Directory Access Protocol (LDAP)-authenticated users to a bastion host. After adding a user, O\&amp;M engineers can log on to the bastion host with that account to perform O\&amp;M operations on authorized hosts.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a user to a bastion host.</p>
     * 
     * @param request CreateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserResponse
     */
    public CreateUserResponse createUserWithOptions(CreateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveEndTime)) {
            query.put("EffectiveEndTime", request.effectiveEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveStartTime)) {
            query.put("EffectiveStartTime", request.effectiveStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageStatus)) {
            query.put("LanguageStatus", request.languageStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileCountryCode)) {
            query.put("MobileCountryCode", request.mobileCountryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needResetPassword)) {
            query.put("NeedResetPassword", request.needResetPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceUserId)) {
            query.put("SourceUserId", request.sourceUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.twoFactorMethods)) {
            query.put("TwoFactorMethods", request.twoFactorMethods);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.twoFactorStatus)) {
            query.put("TwoFactorStatus", request.twoFactorStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Adds local users, Resource Access Management (RAM) users, Active Directory (AD)-authenticated users, or Lightweight Directory Access Protocol (LDAP)-authenticated users to a bastion host. After adding a user, O\&amp;M engineers can log on to the bastion host with that account to perform O\&amp;M operations on authorized hosts.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a user to a bastion host.</p>
     * 
     * @param request CreateUserRequest
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a user group for a bastion host as an administrator. After creating the group, use the <a href="https://help.aliyun.com/document_detail/204600.html">AddUsersToGroup</a> operation to add multiple users at once, enabling centralized user authorization and management.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user group for a bastion host.</p>
     * 
     * @param request CreateUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserGroupResponse
     */
    public CreateUserGroupResponse createUserGroupWithOptions(CreateUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupName)) {
            query.put("UserGroupName", request.userGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a user group for a bastion host as an administrator. After creating the group, use the <a href="https://help.aliyun.com/document_detail/204600.html">AddUsersToGroup</a> operation to add multiple users at once, enabling centralized user authorization and management.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user group for a bastion host.</p>
     * 
     * @param request CreateUserGroupRequest
     * @return CreateUserGroupResponse
     */
    public CreateUserGroupResponse createUserGroup(CreateUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the CreateUserPublicKey operation to create a public key for the specified user of a bastion host.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a public key for a bastion host user and hosts the public key in the bastion host. This way, O\\\\\\\\\\\\\\\\\\\\\\\\&amp;M engineers can use the private key that corresponds to the public key to log on to the bastion host from an O\\\\\\\\\\\\\\\\\\\\\\\\&amp;M client.</p>
     * 
     * @param request CreateUserPublicKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserPublicKeyResponse
     */
    public CreateUserPublicKeyResponse createUserPublicKeyWithOptions(CreateUserPublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKey)) {
            query.put("PublicKey", request.publicKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKeyName)) {
            query.put("PublicKeyName", request.publicKeyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserPublicKey"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserPublicKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the CreateUserPublicKey operation to create a public key for the specified user of a bastion host.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a public key for a bastion host user and hosts the public key in the bastion host. This way, O\\\\\\\\\\\\\\\\\\\\\\\\&amp;M engineers can use the private key that corresponds to the public key to log on to the bastion host from an O\\\\\\\\\\\\\\\\\\\\\\\\&amp;M client.</p>
     * 
     * @param request CreateUserPublicKeyRequest
     * @return CreateUserPublicKeyResponse
     */
    public CreateUserPublicKeyResponse createUserPublicKey(CreateUserPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserPublicKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a database.</p>
     * 
     * @param request DeleteDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabaseWithOptions(DeleteDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseId)) {
            query.put("DatabaseId", request.databaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDatabase"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a database.</p>
     * 
     * @param request DeleteDatabaseRequest
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDatabaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a database account.</p>
     * 
     * @param request DeleteDatabaseAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDatabaseAccountResponse
     */
    public DeleteDatabaseAccountResponse deleteDatabaseAccountWithOptions(DeleteDatabaseAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseAccountId)) {
            query.put("DatabaseAccountId", request.databaseAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDatabaseAccount"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDatabaseAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a database account.</p>
     * 
     * @param request DeleteDatabaseAccountRequest
     * @return DeleteDatabaseAccountResponse
     */
    public DeleteDatabaseAccountResponse deleteDatabaseAccount(DeleteDatabaseAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDatabaseAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a host.</p>
     * 
     * @param request DeleteHostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHostResponse
     */
    public DeleteHostResponse deleteHostWithOptions(DeleteHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostId)) {
            query.put("HostId", request.hostId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHost"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHostResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a host.</p>
     * 
     * @param request DeleteHostRequest
     * @return DeleteHostResponse
     */
    public DeleteHostResponse deleteHost(DeleteHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHostWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This interface is used to delete individual host accounts. If a host account is no longer in use, you can invoke this interface to delete the host account for that host that has been configured on the bastion.</p>
     * <blockquote>
     * <p>After you remove the host account, you must enter the username and password of the host when you log on to the host in Bastionhost.</p>
     * </blockquote>
     * <h2>QPS Limit</h2>
     * <p>The single-user QPS limit of this interface is 10 times/second. If the limit is exceeded, the API call will be stream-limited, which may affect your business, please call reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a host account.</p>
     * 
     * @param request DeleteHostAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHostAccountResponse
     */
    public DeleteHostAccountResponse deleteHostAccountWithOptions(DeleteHostAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostAccountId)) {
            query.put("HostAccountId", request.hostAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHostAccount"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHostAccountResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This interface is used to delete individual host accounts. If a host account is no longer in use, you can invoke this interface to delete the host account for that host that has been configured on the bastion.</p>
     * <blockquote>
     * <p>After you remove the host account, you must enter the username and password of the host when you log on to the host in Bastionhost.</p>
     * </blockquote>
     * <h2>QPS Limit</h2>
     * <p>The single-user QPS limit of this interface is 10 times/second. If the limit is exceeded, the API call will be stream-limited, which may affect your business, please call reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a host account.</p>
     * 
     * @param request DeleteHostAccountRequest
     * @return DeleteHostAccountResponse
     */
    public DeleteHostAccountResponse deleteHostAccount(DeleteHostAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHostAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a single host group. If all hosts in a host group no longer need to be managed through Bastionhost, you can delete the host group using this operation.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a host group.</p>
     * 
     * @param request DeleteHostGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHostGroupResponse
     */
    public DeleteHostGroupResponse deleteHostGroupWithOptions(DeleteHostGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostGroupId)) {
            query.put("HostGroupId", request.hostGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHostGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHostGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a single host group. If all hosts in a host group no longer need to be managed through Bastionhost, you can delete the host group using this operation.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a host group.</p>
     * 
     * @param request DeleteHostGroupRequest
     * @return DeleteHostGroupResponse
     */
    public DeleteHostGroupResponse deleteHostGroup(DeleteHostGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHostGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a shared key.</p>
     * 
     * @param request DeleteHostShareKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHostShareKeyResponse
     */
    public DeleteHostShareKeyResponse deleteHostShareKeyWithOptions(DeleteHostShareKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostShareKeyId)) {
            query.put("HostShareKeyId", request.hostShareKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHostShareKey"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHostShareKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a shared key.</p>
     * 
     * @param request DeleteHostShareKeyRequest
     * @return DeleteHostShareKeyResponse
     */
    public DeleteHostShareKeyResponse deleteHostShareKey(DeleteHostShareKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHostShareKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a network domain.</p>
     * 
     * @param request DeleteNetworkDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNetworkDomainResponse
     */
    public DeleteNetworkDomainResponse deleteNetworkDomainWithOptions(DeleteNetworkDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainId)) {
            query.put("NetworkDomainId", request.networkDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetworkDomain"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a network domain.</p>
     * 
     * @param request DeleteNetworkDomainRequest
     * @return DeleteNetworkDomainResponse
     */
    public DeleteNetworkDomainResponse deleteNetworkDomain(DeleteNetworkDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a control policy.</p>
     * 
     * @param request DeletePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicyWithOptions(DeletePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicy"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a control policy.</p>
     * 
     * @param request DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an authorization rule.</p>
     * 
     * @param request DeleteRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRule"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an authorization rule.</p>
     * 
     * @param request DeleteRuleRequest
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a bastion host user.</p>
     * 
     * @param request DeleteUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a bastion host user.</p>
     * 
     * @param request DeleteUserRequest
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a user group from a bastion host.</p>
     * 
     * @param request DeleteUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserGroupResponse
     */
    public DeleteUserGroupResponse deleteUserGroupWithOptions(DeleteUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a user group from a bastion host.</p>
     * 
     * @param request DeleteUserGroupRequest
     * @return DeleteUserGroupResponse
     */
    public DeleteUserGroupResponse deleteUserGroup(DeleteUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteUserPublicKey operation to delete a public key from the specified user of a bastion host.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a public key from the specified user.</p>
     * 
     * @param request DeleteUserPublicKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserPublicKeyResponse
     */
    public DeleteUserPublicKeyResponse deleteUserPublicKeyWithOptions(DeleteUserPublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKeyId)) {
            query.put("PublicKeyId", request.publicKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserPublicKey"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserPublicKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteUserPublicKey operation to delete a public key from the specified user of a bastion host.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a public key from the specified user.</p>
     * 
     * @param request DeleteUserPublicKeyRequest
     * @return DeleteUserPublicKeyResponse
     */
    public DeleteUserPublicKeyResponse deleteUserPublicKey(DeleteUserPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserPublicKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Returns all instance attributes, such as its instance ID and description.</p>
     * 
     * @param request DescribeInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceAttributeResponse
     */
    public DescribeInstanceAttributeResponse describeInstanceAttributeWithOptions(DescribeInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceAttribute"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Returns all instance attributes, such as its instance ID and description.</p>
     * 
     * @param request DescribeInstanceAttributeRequest
     * @return DescribeInstanceAttributeResponse
     */
    public DescribeInstanceAttributeResponse describeInstanceAttribute(DescribeInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of Bastionhost instances.</p>
     * 
     * @param request DescribeInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceStatus)) {
            query.put("InstanceStatus", request.instanceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstances"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of Bastionhost instances.</p>
     * 
     * @param request DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Alibaba Cloud regions that support Bastionhost instances.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Alibaba Cloud regions that support Bastionhost instances.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes permissions on databases and database accounts from a user.</p>
     * 
     * @param request DetachDatabaseAccountsFromUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachDatabaseAccountsFromUserResponse
     */
    public DetachDatabaseAccountsFromUserResponse detachDatabaseAccountsFromUserWithOptions(DetachDatabaseAccountsFromUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databases)) {
            query.put("Databases", request.databases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachDatabaseAccountsFromUser"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachDatabaseAccountsFromUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes permissions on databases and database accounts from a user.</p>
     * 
     * @param request DetachDatabaseAccountsFromUserRequest
     * @return DetachDatabaseAccountsFromUserResponse
     */
    public DetachDatabaseAccountsFromUserResponse detachDatabaseAccountsFromUser(DetachDatabaseAccountsFromUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachDatabaseAccountsFromUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes permissions on databases and database accounts from a user group.</p>
     * 
     * @param request DetachDatabaseAccountsFromUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachDatabaseAccountsFromUserGroupResponse
     */
    public DetachDatabaseAccountsFromUserGroupResponse detachDatabaseAccountsFromUserGroupWithOptions(DetachDatabaseAccountsFromUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databases)) {
            query.put("Databases", request.databases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachDatabaseAccountsFromUserGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachDatabaseAccountsFromUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes permissions on databases and database accounts from a user group.</p>
     * 
     * @param request DetachDatabaseAccountsFromUserGroupRequest
     * @return DetachDatabaseAccountsFromUserGroupResponse
     */
    public DetachDatabaseAccountsFromUserGroupResponse detachDatabaseAccountsFromUserGroup(DetachDatabaseAccountsFromUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachDatabaseAccountsFromUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociate host accounts from a shared key.</p>
     * 
     * @param request DetachHostAccountsFromHostShareKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachHostAccountsFromHostShareKeyResponse
     */
    public DetachHostAccountsFromHostShareKeyResponse detachHostAccountsFromHostShareKeyWithOptions(DetachHostAccountsFromHostShareKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostAccountIds)) {
            query.put("HostAccountIds", request.hostAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostShareKeyId)) {
            query.put("HostShareKeyId", request.hostShareKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachHostAccountsFromHostShareKey"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachHostAccountsFromHostShareKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociate host accounts from a shared key.</p>
     * 
     * @param request DetachHostAccountsFromHostShareKeyRequest
     * @return DetachHostAccountsFromHostShareKeyResponse
     */
    public DetachHostAccountsFromHostShareKeyResponse detachHostAccountsFromHostShareKey(DetachHostAccountsFromHostShareKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachHostAccountsFromHostShareKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes permissions on hosts and host accounts from a user.</p>
     * 
     * @param request DetachHostAccountsFromUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachHostAccountsFromUserResponse
     */
    public DetachHostAccountsFromUserResponse detachHostAccountsFromUserWithOptions(DetachHostAccountsFromUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hosts)) {
            query.put("Hosts", request.hosts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachHostAccountsFromUser"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachHostAccountsFromUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes permissions on hosts and host accounts from a user.</p>
     * 
     * @param request DetachHostAccountsFromUserRequest
     * @return DetachHostAccountsFromUserResponse
     */
    public DetachHostAccountsFromUserResponse detachHostAccountsFromUser(DetachHostAccountsFromUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachHostAccountsFromUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the permissions on one or more hosts and host accounts from a user group.</p>
     * 
     * @param request DetachHostAccountsFromUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachHostAccountsFromUserGroupResponse
     */
    public DetachHostAccountsFromUserGroupResponse detachHostAccountsFromUserGroupWithOptions(DetachHostAccountsFromUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hosts)) {
            query.put("Hosts", request.hosts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachHostAccountsFromUserGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachHostAccountsFromUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the permissions on one or more hosts and host accounts from a user group.</p>
     * 
     * @param request DetachHostAccountsFromUserGroupRequest
     * @return DetachHostAccountsFromUserGroupResponse
     */
    public DetachHostAccountsFromUserGroupResponse detachHostAccountsFromUserGroup(DetachHostAccountsFromUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachHostAccountsFromUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes host groups and host accounts from the list of host groups and host accounts that a user is authorized to manage.</p>
     * 
     * @param request DetachHostGroupAccountsFromUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachHostGroupAccountsFromUserResponse
     */
    public DetachHostGroupAccountsFromUserResponse detachHostGroupAccountsFromUserWithOptions(DetachHostGroupAccountsFromUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostGroups)) {
            query.put("HostGroups", request.hostGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachHostGroupAccountsFromUser"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachHostGroupAccountsFromUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes host groups and host accounts from the list of host groups and host accounts that a user is authorized to manage.</p>
     * 
     * @param request DetachHostGroupAccountsFromUserRequest
     * @return DetachHostGroupAccountsFromUserResponse
     */
    public DetachHostGroupAccountsFromUserResponse detachHostGroupAccountsFromUser(DetachHostGroupAccountsFromUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachHostGroupAccountsFromUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes permissions on one or more host groups and host accounts from a user group.</p>
     * 
     * @param request DetachHostGroupAccountsFromUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachHostGroupAccountsFromUserGroupResponse
     */
    public DetachHostGroupAccountsFromUserGroupResponse detachHostGroupAccountsFromUserGroupWithOptions(DetachHostGroupAccountsFromUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostGroups)) {
            query.put("HostGroups", request.hostGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachHostGroupAccountsFromUserGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachHostGroupAccountsFromUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes permissions on one or more host groups and host accounts from a user group.</p>
     * 
     * @param request DetachHostGroupAccountsFromUserGroupRequest
     * @return DetachHostGroupAccountsFromUserGroupResponse
     */
    public DetachHostGroupAccountsFromUserGroupResponse detachHostGroupAccountsFromUserGroup(DetachHostGroupAccountsFromUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachHostGroupAccountsFromUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables public network access for a Bastionhost instance.</p>
     * 
     * @param request DisableInstancePublicAccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableInstancePublicAccessResponse
     */
    public DisableInstancePublicAccessResponse disableInstancePublicAccessWithOptions(DisableInstancePublicAccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableInstancePublicAccess"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableInstancePublicAccessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables public network access for a Bastionhost instance.</p>
     * 
     * @param request DisableInstancePublicAccessRequest
     * @return DisableInstancePublicAccessResponse
     */
    public DisableInstancePublicAccessResponse disableInstancePublicAccess(DisableInstancePublicAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableInstancePublicAccessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables an authorization rule.</p>
     * 
     * @param request DisableRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableRuleResponse
     */
    public DisableRuleResponse disableRuleWithOptions(DisableRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableRule"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables an authorization rule.</p>
     * 
     * @param request DisableRuleRequest
     * @return DisableRuleResponse
     */
    public DisableRuleResponse disableRule(DisableRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables public network access for a specified Bastionhost instance.</p>
     * 
     * @param request EnableInstancePublicAccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableInstancePublicAccessResponse
     */
    public EnableInstancePublicAccessResponse enableInstancePublicAccessWithOptions(EnableInstancePublicAccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableInstancePublicAccess"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableInstancePublicAccessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables public network access for a specified Bastionhost instance.</p>
     * 
     * @param request EnableInstancePublicAccessRequest
     * @return EnableInstancePublicAccessResponse
     */
    public EnableInstancePublicAccessResponse enableInstancePublicAccess(EnableInstancePublicAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableInstancePublicAccessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables an authorization rule.</p>
     * 
     * @param request EnableRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableRuleResponse
     */
    public EnableRuleResponse enableRuleWithOptions(EnableRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableRule"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables an authorization rule.</p>
     * 
     * @param request EnableRuleRequest
     * @return EnableRuleResponse
     */
    public EnableRuleResponse enableRule(EnableRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call this operation to request O&amp;M tokens for bastions or databases, which allows you to manage assets.</p>
     * 
     * @param request GenerateAssetOperationTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateAssetOperationTokenResponse
     */
    public GenerateAssetOperationTokenResponse generateAssetOperationTokenWithOptions(GenerateAssetOperationTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetAccountId)) {
            query.put("AssetAccountId", request.assetAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetAccountName)) {
            query.put("AssetAccountName", request.assetAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetAccountPassword)) {
            query.put("AssetAccountPassword", request.assetAccountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetAccountProtocolName)) {
            query.put("AssetAccountProtocolName", request.assetAccountProtocolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetId)) {
            query.put("AssetId", request.assetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetType)) {
            query.put("AssetType", request.assetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseSchema)) {
            query.put("DatabaseSchema", request.databaseSchema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginAttribute)) {
            query.put("LoginAttribute", request.loginAttribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationMode)) {
            query.put("OperationMode", request.operationMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationNote)) {
            query.put("OperationNote", request.operationNote);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ssoClient)) {
            query.put("SsoClient", request.ssoClient);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateAssetOperationToken"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateAssetOperationTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call this operation to request O&amp;M tokens for bastions or databases, which allows you to manage assets.</p>
     * 
     * @param request GenerateAssetOperationTokenRequest
     * @return GenerateAssetOperationTokenResponse
     */
    public GenerateAssetOperationTokenResponse generateAssetOperationToken(GenerateAssetOperationTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateAssetOperationTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified O&amp;M task for an administrator.</p>
     * 
     * @param request GetAutoOpsTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAutoOpsTaskResponse
     */
    public GetAutoOpsTaskResponse getAutoOpsTaskWithOptions(GetAutoOpsTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoOpsTask"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoOpsTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified O&amp;M task for an administrator.</p>
     * 
     * @param request GetAutoOpsTaskRequest
     * @return GetAutoOpsTaskResponse
     */
    public GetAutoOpsTaskResponse getAutoOpsTask(GetAutoOpsTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoOpsTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about a database.</p>
     * 
     * @param request GetDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatabaseResponse
     */
    public GetDatabaseResponse getDatabaseWithOptions(GetDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseId)) {
            query.put("DatabaseId", request.databaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatabase"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about a database.</p>
     * 
     * @param request GetDatabaseRequest
     * @return GetDatabaseResponse
     */
    public GetDatabaseResponse getDatabase(GetDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDatabaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about a database account.</p>
     * 
     * @param request GetDatabaseAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatabaseAccountResponse
     */
    public GetDatabaseAccountResponse getDatabaseAccountWithOptions(GetDatabaseAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseAccountId)) {
            query.put("DatabaseAccountId", request.databaseAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatabaseAccount"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatabaseAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about a database account.</p>
     * 
     * @param request GetDatabaseAccountRequest
     * @return GetDatabaseAccountResponse
     */
    public GetDatabaseAccountResponse getDatabaseAccount(GetDatabaseAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDatabaseAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a configuration export task for a Bastionhost instance.</p>
     * 
     * @param request GetExportConfigJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExportConfigJobResponse
     */
    public GetExportConfigJobResponse getExportConfigJobWithOptions(GetExportConfigJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExportConfigJob"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExportConfigJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a configuration export task for a Bastionhost instance.</p>
     * 
     * @param request GetExportConfigJobRequest
     * @return GetExportConfigJobResponse
     */
    public GetExportConfigJobResponse getExportConfigJob(GetExportConfigJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExportConfigJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a host, such as the name, source, address, protocol, and service port.</p>
     * 
     * @param request GetHostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHostResponse
     */
    public GetHostResponse getHostWithOptions(GetHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostId)) {
            query.put("HostId", request.hostId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHost"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHostResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a host, such as the name, source, address, protocol, and service port.</p>
     * 
     * @param request GetHostRequest
     * @return GetHostResponse
     */
    public GetHostResponse getHost(GetHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHostWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a host account on a host managed by a Bastionhost instance, such as the protocol type and account name.</p>
     * 
     * @param request GetHostAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHostAccountResponse
     */
    public GetHostAccountResponse getHostAccountWithOptions(GetHostAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostAccountId)) {
            query.put("HostAccountId", request.hostAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHostAccount"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHostAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a host account on a host managed by a Bastionhost instance, such as the protocol type and account name.</p>
     * 
     * @param request GetHostAccountRequest
     * @return GetHostAccountResponse
     */
    public GetHostAccountResponse getHostAccount(GetHostAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHostAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a host group.</p>
     * 
     * @param request GetHostGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHostGroupResponse
     */
    public GetHostGroupResponse getHostGroupWithOptions(GetHostGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostGroupId)) {
            query.put("HostGroupId", request.hostGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHostGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHostGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a host group.</p>
     * 
     * @param request GetHostGroupRequest
     * @return GetHostGroupResponse
     */
    public GetHostGroupResponse getHostGroup(GetHostGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHostGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a shared key.</p>
     * 
     * @param request GetHostShareKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHostShareKeyResponse
     */
    public GetHostShareKeyResponse getHostShareKeyWithOptions(GetHostShareKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostShareKeyId)) {
            query.put("HostShareKeyId", request.hostShareKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHostShareKey"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHostShareKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a shared key.</p>
     * 
     * @param request GetHostShareKeyRequest
     * @return GetHostShareKeyResponse
     */
    public GetHostShareKeyResponse getHostShareKey(GetHostShareKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHostShareKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>Queries the Active Directory (AD) authentication settings of a bastion host. After you configure AD authentication, you can import AD-authenticated users into the bastion host. The imported users can then log on to the bastion host to perform O\&amp;M operations on servers.</p>
     * <h3>Limit</h3>
     * <p>This operation can be called up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered and your business may be affected. Take note of this limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the settings of Active Directory (AD) authentication on a bastion host.</p>
     * 
     * @param request GetInstanceADAuthServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceADAuthServerResponse
     */
    public GetInstanceADAuthServerResponse getInstanceADAuthServerWithOptions(GetInstanceADAuthServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceADAuthServer"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceADAuthServerResponse());
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>Queries the Active Directory (AD) authentication settings of a bastion host. After you configure AD authentication, you can import AD-authenticated users into the bastion host. The imported users can then log on to the bastion host to perform O\&amp;M operations on servers.</p>
     * <h3>Limit</h3>
     * <p>This operation can be called up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered and your business may be affected. Take note of this limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the settings of Active Directory (AD) authentication on a bastion host.</p>
     * 
     * @param request GetInstanceADAuthServerRequest
     * @return GetInstanceADAuthServerResponse
     */
    public GetInstanceADAuthServerResponse getInstanceADAuthServer(GetInstanceADAuthServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceADAuthServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the settings of Lightweight Directory Access Protocol (LDAP) authentication on a bastion host.</p>
     * 
     * @param request GetInstanceLDAPAuthServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceLDAPAuthServerResponse
     */
    public GetInstanceLDAPAuthServerResponse getInstanceLDAPAuthServerWithOptions(GetInstanceLDAPAuthServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceLDAPAuthServer"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceLDAPAuthServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the settings of Lightweight Directory Access Protocol (LDAP) authentication on a bastion host.</p>
     * 
     * @param request GetInstanceLDAPAuthServerRequest
     * @return GetInstanceLDAPAuthServerResponse
     */
    public GetInstanceLDAPAuthServerResponse getInstanceLDAPAuthServer(GetInstanceLDAPAuthServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceLDAPAuthServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the storage usage of a Bastionhost instance.</p>
     * 
     * @param request GetInstanceStoreInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceStoreInfoResponse
     */
    public GetInstanceStoreInfoResponse getInstanceStoreInfoWithOptions(GetInstanceStoreInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceStoreInfo"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceStoreInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the storage usage of a Bastionhost instance.</p>
     * 
     * @param request GetInstanceStoreInfoRequest
     * @return GetInstanceStoreInfoResponse
     */
    public GetInstanceStoreInfoResponse getInstanceStoreInfo(GetInstanceStoreInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceStoreInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the two-factor authentication settings of a bastion host. When two-factor authentication is enabled, Bastionhost sends a verification code to a local user who logs on to the bastion host. The local user must enter a valid username, password, and verification code to log on, which reduces the security risks of account information leaks.</p>
     * <h3>Limit</h3>
     * <p>This operation can be called up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered and your business may be affected. Take note of this limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the settings of two-factor authentication on a bastion host.</p>
     * 
     * @param request GetInstanceTwoFactorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceTwoFactorResponse
     */
    public GetInstanceTwoFactorResponse getInstanceTwoFactorWithOptions(GetInstanceTwoFactorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceTwoFactor"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceTwoFactorResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the two-factor authentication settings of a bastion host. When two-factor authentication is enabled, Bastionhost sends a verification code to a local user who logs on to the bastion host. The local user must enter a valid username, password, and verification code to log on, which reduces the security risks of account information leaks.</p>
     * <h3>Limit</h3>
     * <p>This operation can be called up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered and your business may be affected. Take note of this limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the settings of two-factor authentication on a bastion host.</p>
     * 
     * @param request GetInstanceTwoFactorRequest
     * @return GetInstanceTwoFactorResponse
     */
    public GetInstanceTwoFactorResponse getInstanceTwoFactor(GetInstanceTwoFactorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceTwoFactorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified network domain.</p>
     * 
     * @param request GetNetworkDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNetworkDomainResponse
     */
    public GetNetworkDomainResponse getNetworkDomainWithOptions(GetNetworkDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkProxyState)) {
            query.put("CheckProxyState", request.checkProxyState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainId)) {
            query.put("NetworkDomainId", request.networkDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNetworkDomain"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNetworkDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified network domain.</p>
     * 
     * @param request GetNetworkDomainRequest
     * @return GetNetworkDomainResponse
     */
    public GetNetworkDomainResponse getNetworkDomain(GetNetworkDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNetworkDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the details of a specified control policy.</p>
     * 
     * @param request GetPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPolicyResponse
     */
    public GetPolicyResponse getPolicyWithOptions(GetPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPolicy"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the details of a specified control policy.</p>
     * 
     * @param request GetPolicyRequest
     * @return GetPolicyResponse
     */
    public GetPolicyResponse getPolicy(GetPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the assets to which a control policy applies.</p>
     * 
     * @param request GetPolicyAssetScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPolicyAssetScopeResponse
     */
    public GetPolicyAssetScopeResponse getPolicyAssetScopeWithOptions(GetPolicyAssetScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPolicyAssetScope"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPolicyAssetScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the assets to which a control policy applies.</p>
     * 
     * @param request GetPolicyAssetScopeRequest
     * @return GetPolicyAssetScopeResponse
     */
    public GetPolicyAssetScopeResponse getPolicyAssetScope(GetPolicyAssetScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPolicyAssetScopeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the scope of users to whom a control policy applies.</p>
     * 
     * @param request GetPolicyUserScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPolicyUserScopeResponse
     */
    public GetPolicyUserScopeResponse getPolicyUserScopeWithOptions(GetPolicyUserScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPolicyUserScope"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPolicyUserScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the scope of users to whom a control policy applies.</p>
     * 
     * @param request GetPolicyUserScopeRequest
     * @return GetPolicyUserScopeResponse
     */
    public GetPolicyUserScopeResponse getPolicyUserScope(GetPolicyUserScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPolicyUserScopeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about an authorization rule.</p>
     * 
     * @param request GetRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRuleResponse
     */
    public GetRuleResponse getRuleWithOptions(GetRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRule"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about an authorization rule.</p>
     * 
     * @param request GetRuleRequest
     * @return GetRuleResponse
     */
    public GetRuleResponse getRule(GetRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a user of a bastion host.</p>
     * 
     * @param request GetUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(GetUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a user of a bastion host.</p>
     * 
     * @param request GetUserRequest
     * @return GetUserResponse
     */
    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a user group in a bastion host.</p>
     * 
     * @param request GetUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserGroupResponse
     */
    public GetUserGroupResponse getUserGroupWithOptions(GetUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a user group in a bastion host.</p>
     * 
     * @param request GetUserGroupRequest
     * @return GetUserGroupResponse
     */
    public GetUserGroupResponse getUserGroup(GetUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Imports KMS secrets for a specified host.</p>
     * 
     * @param tmpReq ImportKMSSecretsForHostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportKMSSecretsForHostResponse
     */
    public ImportKMSSecretsForHostResponse importKMSSecretsForHostWithOptions(ImportKMSSecretsForHostRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportKMSSecretsForHostShrinkRequest request = new ImportKMSSecretsForHostShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.secrets)) {
            request.secretsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.secrets, "Secrets", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostId)) {
            query.put("HostId", request.hostId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretsShrink)) {
            query.put("Secrets", request.secretsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportKMSSecretsForHost"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportKMSSecretsForHostResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Imports KMS secrets for a specified host.</p>
     * 
     * @param request ImportKMSSecretsForHostRequest
     * @return ImportKMSSecretsForHostResponse
     */
    public ImportKMSSecretsForHostResponse importKMSSecretsForHost(ImportKMSSecretsForHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importKMSSecretsForHostWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries commands pending review as a Bastionhost administrator.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries commands to be reviewed.</p>
     * 
     * @param request ListApproveCommandsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApproveCommandsResponse
     */
    public ListApproveCommandsResponse listApproveCommandsWithOptions(ListApproveCommandsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApproveCommands"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApproveCommandsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries commands pending review as a Bastionhost administrator.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries commands to be reviewed.</p>
     * 
     * @param request ListApproveCommandsRequest
     * @return ListApproveCommandsResponse
     */
    public ListApproveCommandsResponse listApproveCommands(ListApproveCommandsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApproveCommandsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the database accounts of a database.</p>
     * 
     * @param request ListDatabaseAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatabaseAccountsResponse
     */
    public ListDatabaseAccountsResponse listDatabaseAccountsWithOptions(ListDatabaseAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseAccountName)) {
            query.put("DatabaseAccountName", request.databaseAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseId)) {
            query.put("DatabaseId", request.databaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatabaseAccounts"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatabaseAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the database accounts of a database.</p>
     * 
     * @param request ListDatabaseAccountsRequest
     * @return ListDatabaseAccountsResponse
     */
    public ListDatabaseAccountsResponse listDatabaseAccounts(ListDatabaseAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDatabaseAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the database accounts of a database and whether a user is authorized to manage each database account.</p>
     * 
     * @param request ListDatabaseAccountsForUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatabaseAccountsForUserResponse
     */
    public ListDatabaseAccountsForUserResponse listDatabaseAccountsForUserWithOptions(ListDatabaseAccountsForUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseAccountName)) {
            query.put("DatabaseAccountName", request.databaseAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseId)) {
            query.put("DatabaseId", request.databaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatabaseAccountsForUser"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatabaseAccountsForUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the database accounts of a database and whether a user is authorized to manage each database account.</p>
     * 
     * @param request ListDatabaseAccountsForUserRequest
     * @return ListDatabaseAccountsForUserResponse
     */
    public ListDatabaseAccountsForUserResponse listDatabaseAccountsForUser(ListDatabaseAccountsForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDatabaseAccountsForUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the database accounts of a database and whether a user group is authorized to manage each database account.</p>
     * 
     * @param request ListDatabaseAccountsForUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatabaseAccountsForUserGroupResponse
     */
    public ListDatabaseAccountsForUserGroupResponse listDatabaseAccountsForUserGroupWithOptions(ListDatabaseAccountsForUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseAccountName)) {
            query.put("DatabaseAccountName", request.databaseAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseId)) {
            query.put("DatabaseId", request.databaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatabaseAccountsForUserGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatabaseAccountsForUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the database accounts of a database and whether a user group is authorized to manage each database account.</p>
     * 
     * @param request ListDatabaseAccountsForUserGroupRequest
     * @return ListDatabaseAccountsForUserGroupResponse
     */
    public ListDatabaseAccountsForUserGroupResponse listDatabaseAccountsForUserGroup(ListDatabaseAccountsForUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDatabaseAccountsForUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the databases that are managed by a bastion host.</p>
     * 
     * @param request ListDatabasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabasesWithOptions(ListDatabasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseType)) {
            query.put("DatabaseType", request.databaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostGroupId)) {
            query.put("HostGroupId", request.hostGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainId)) {
            query.put("NetworkDomainId", request.networkDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatabases"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatabasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the databases that are managed by a bastion host.</p>
     * 
     * @param request ListDatabasesRequest
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDatabasesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the databases that a user is authorized to manage.</p>
     * 
     * @param request ListDatabasesForUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatabasesForUserResponse
     */
    public ListDatabasesForUserResponse listDatabasesForUserWithOptions(ListDatabasesForUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseAddress)) {
            query.put("DatabaseAddress", request.databaseAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseType)) {
            query.put("DatabaseType", request.databaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainId)) {
            query.put("NetworkDomainId", request.networkDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatabasesForUser"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatabasesForUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the databases that a user is authorized to manage.</p>
     * 
     * @param request ListDatabasesForUserRequest
     * @return ListDatabasesForUserResponse
     */
    public ListDatabasesForUserResponse listDatabasesForUser(ListDatabasesForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDatabasesForUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the databases that a user group is authorized to manage through a Bastionhost instance.</p>
     * 
     * @param request ListDatabasesForUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatabasesForUserGroupResponse
     */
    public ListDatabasesForUserGroupResponse listDatabasesForUserGroupWithOptions(ListDatabasesForUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseAddress)) {
            query.put("DatabaseAddress", request.databaseAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseType)) {
            query.put("DatabaseType", request.databaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainId)) {
            query.put("NetworkDomainId", request.networkDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatabasesForUserGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatabasesForUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the databases that a user group is authorized to manage through a Bastionhost instance.</p>
     * 
     * @param request ListDatabasesForUserGroupRequest
     * @return ListDatabasesForUserGroupResponse
     */
    public ListDatabasesForUserGroupResponse listDatabasesForUserGroup(ListDatabasesForUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDatabasesForUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the host accounts that are configured for a host in a Bastionhost instance. Host accounts are the credentials used by O&amp;M engineers to log on to the host.</p>
     * 
     * @param request ListHostAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHostAccountsResponse
     */
    public ListHostAccountsResponse listHostAccountsWithOptions(ListHostAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostAccountName)) {
            query.put("HostAccountName", request.hostAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostId)) {
            query.put("HostId", request.hostId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostIds)) {
            query.put("HostIds", request.hostIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolName)) {
            query.put("ProtocolName", request.protocolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHostAccounts"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHostAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the host accounts that are configured for a host in a Bastionhost instance. Host accounts are the credentials used by O&amp;M engineers to log on to the host.</p>
     * 
     * @param request ListHostAccountsRequest
     * @return ListHostAccountsResponse
     */
    public ListHostAccountsResponse listHostAccounts(ListHostAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHostAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the host accounts that are associated with a shared key.</p>
     * 
     * @param request ListHostAccountsForHostShareKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHostAccountsForHostShareKeyResponse
     */
    public ListHostAccountsForHostShareKeyResponse listHostAccountsForHostShareKeyWithOptions(ListHostAccountsForHostShareKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostShareKeyId)) {
            query.put("HostShareKeyId", request.hostShareKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHostAccountsForHostShareKey"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHostAccountsForHostShareKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the host accounts that are associated with a shared key.</p>
     * 
     * @param request ListHostAccountsForHostShareKeyRequest
     * @return ListHostAccountsForHostShareKeyResponse
     */
    public ListHostAccountsForHostShareKeyResponse listHostAccountsForHostShareKey(ListHostAccountsForHostShareKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHostAccountsForHostShareKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the host accounts of a host and whether a user is authorized to manage each host account.</p>
     * 
     * @param request ListHostAccountsForUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHostAccountsForUserResponse
     */
    public ListHostAccountsForUserResponse listHostAccountsForUserWithOptions(ListHostAccountsForUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostAccountName)) {
            query.put("HostAccountName", request.hostAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostId)) {
            query.put("HostId", request.hostId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHostAccountsForUser"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHostAccountsForUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the host accounts of a host and whether a user is authorized to manage each host account.</p>
     * 
     * @param request ListHostAccountsForUserRequest
     * @return ListHostAccountsForUserResponse
     */
    public ListHostAccountsForUserResponse listHostAccountsForUser(ListHostAccountsForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHostAccountsForUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the host accounts of a host and whether a user group is authorized to manage each host account.</p>
     * 
     * @param request ListHostAccountsForUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHostAccountsForUserGroupResponse
     */
    public ListHostAccountsForUserGroupResponse listHostAccountsForUserGroupWithOptions(ListHostAccountsForUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostAccountName)) {
            query.put("HostAccountName", request.hostAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostId)) {
            query.put("HostId", request.hostId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHostAccountsForUserGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHostAccountsForUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the host accounts of a host and whether a user group is authorized to manage each host account.</p>
     * 
     * @param request ListHostAccountsForUserGroupRequest
     * @return ListHostAccountsForUserGroupResponse
     */
    public ListHostAccountsForUserGroupResponse listHostAccountsForUserGroup(ListHostAccountsForUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHostAccountsForUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the names of the host accounts that a specified user is authorized to manage in a specified host group.</p>
     * 
     * @param request ListHostGroupAccountNamesForUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHostGroupAccountNamesForUserResponse
     */
    public ListHostGroupAccountNamesForUserResponse listHostGroupAccountNamesForUserWithOptions(ListHostGroupAccountNamesForUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostGroupId)) {
            query.put("HostGroupId", request.hostGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHostGroupAccountNamesForUser"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHostGroupAccountNamesForUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the names of the host accounts that a specified user is authorized to manage in a specified host group.</p>
     * 
     * @param request ListHostGroupAccountNamesForUserRequest
     * @return ListHostGroupAccountNamesForUserResponse
     */
    public ListHostGroupAccountNamesForUserResponse listHostGroupAccountNamesForUser(ListHostGroupAccountNamesForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHostGroupAccountNamesForUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the names of the host accounts that a user group is authorized to manage in a host group.</p>
     * 
     * @param request ListHostGroupAccountNamesForUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHostGroupAccountNamesForUserGroupResponse
     */
    public ListHostGroupAccountNamesForUserGroupResponse listHostGroupAccountNamesForUserGroupWithOptions(ListHostGroupAccountNamesForUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostGroupId)) {
            query.put("HostGroupId", request.hostGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHostGroupAccountNamesForUserGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHostGroupAccountNamesForUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the names of the host accounts that a user group is authorized to manage in a host group.</p>
     * 
     * @param request ListHostGroupAccountNamesForUserGroupRequest
     * @return ListHostGroupAccountNamesForUserGroupResponse
     */
    public ListHostGroupAccountNamesForUserGroupResponse listHostGroupAccountNamesForUserGroup(ListHostGroupAccountNamesForUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHostGroupAccountNamesForUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of asset groups that are managed by a bastion host.</p>
     * 
     * @param request ListHostGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHostGroupsResponse
     */
    public ListHostGroupsResponse listHostGroupsWithOptions(ListHostGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostGroupName)) {
            query.put("HostGroupName", request.hostGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHostGroups"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHostGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of asset groups that are managed by a bastion host.</p>
     * 
     * @param request ListHostGroupsRequest
     * @return ListHostGroupsResponse
     */
    public ListHostGroupsResponse listHostGroups(ListHostGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHostGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of host groups that a bastion host user is authorized or is not authorized to manage.</p>
     * 
     * @param request ListHostGroupsForUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHostGroupsForUserResponse
     */
    public ListHostGroupsForUserResponse listHostGroupsForUserWithOptions(ListHostGroupsForUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostGroupName)) {
            query.put("HostGroupName", request.hostGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHostGroupsForUser"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHostGroupsForUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of host groups that a bastion host user is authorized or is not authorized to manage.</p>
     * 
     * @param request ListHostGroupsForUserRequest
     * @return ListHostGroupsForUserResponse
     */
    public ListHostGroupsForUserResponse listHostGroupsForUser(ListHostGroupsForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHostGroupsForUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the hosts that a specified user group is authorized or not authorized to manage.</p>
     * 
     * @param request ListHostGroupsForUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHostGroupsForUserGroupResponse
     */
    public ListHostGroupsForUserGroupResponse listHostGroupsForUserGroupWithOptions(ListHostGroupsForUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostGroupName)) {
            query.put("HostGroupName", request.hostGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHostGroupsForUserGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHostGroupsForUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the hosts that a specified user group is authorized or not authorized to manage.</p>
     * 
     * @param request ListHostGroupsForUserGroupRequest
     * @return ListHostGroupsForUserGroupResponse
     */
    public ListHostGroupsForUserGroupResponse listHostGroupsForUserGroup(ListHostGroupsForUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHostGroupsForUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the shared keys that are associated with a host.</p>
     * 
     * @param request ListHostShareKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHostShareKeysResponse
     */
    public ListHostShareKeysResponse listHostShareKeysWithOptions(ListHostShareKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHostShareKeys"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHostShareKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the shared keys that are associated with a host.</p>
     * 
     * @param request ListHostShareKeysRequest
     * @return ListHostShareKeysResponse
     */
    public ListHostShareKeysResponse listHostShareKeys(ListHostShareKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHostShareKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the hosts in a bastion host.</p>
     * 
     * @param request ListHostsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHostsResponse
     */
    public ListHostsResponse listHostsWithOptions(ListHostsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostAddress)) {
            query.put("HostAddress", request.hostAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostGroupId)) {
            query.put("HostGroupId", request.hostGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSType)) {
            query.put("OSType", request.OSType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceId)) {
            query.put("SourceInstanceId", request.sourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceState)) {
            query.put("SourceInstanceState", request.sourceInstanceState);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHosts"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHostsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the hosts in a bastion host.</p>
     * 
     * @param request ListHostsRequest
     * @return ListHostsResponse
     */
    public ListHostsResponse listHosts(ListHostsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHostsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the hosts that a user group is authorized or not authorized to manage.</p>
     * 
     * @param request ListHostsForUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHostsForUserResponse
     */
    public ListHostsForUserResponse listHostsForUserWithOptions(ListHostsForUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostAddress)) {
            query.put("HostAddress", request.hostAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSType)) {
            query.put("OSType", request.OSType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHostsForUser"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHostsForUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the hosts that a user group is authorized or not authorized to manage.</p>
     * 
     * @param request ListHostsForUserRequest
     * @return ListHostsForUserResponse
     */
    public ListHostsForUserResponse listHostsForUser(ListHostsForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHostsForUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the authorized or unauthorized hosts for a bastion host user group.</p>
     * 
     * @param request ListHostsForUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHostsForUserGroupResponse
     */
    public ListHostsForUserGroupResponse listHostsForUserGroupWithOptions(ListHostsForUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostAddress)) {
            query.put("HostAddress", request.hostAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSType)) {
            query.put("OSType", request.OSType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHostsForUserGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHostsForUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the authorized or unauthorized hosts for a bastion host user group.</p>
     * 
     * @param request ListHostsForUserGroupRequest
     * @return ListHostsForUserGroupResponse
     */
    public ListHostsForUserGroupResponse listHostsForUserGroup(ListHostsForUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHostsForUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists all importable KMS secrets for a specified host.</p>
     * 
     * @param request ListImportableKMSSecretsForHostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImportableKMSSecretsForHostResponse
     */
    public ListImportableKMSSecretsForHostResponse listImportableKMSSecretsForHostWithOptions(ListImportableKMSSecretsForHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostId)) {
            query.put("HostId", request.hostId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImportableKMSSecretsForHost"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImportableKMSSecretsForHostResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists all importable KMS secrets for a specified host.</p>
     * 
     * @param request ListImportableKMSSecretsForHostRequest
     * @return ListImportableKMSSecretsForHostResponse
     */
    public ListImportableKMSSecretsForHostResponse listImportableKMSSecretsForHost(ListImportableKMSSecretsForHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listImportableKMSSecretsForHostWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the member accounts in a Resource Directory (RD).</p>
     * 
     * @param request ListInstanceRdMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceRdMembersResponse
     */
    public ListInstanceRdMembersResponse listInstanceRdMembersWithOptions(ListInstanceRdMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceRdMembers"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceRdMembersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the member accounts in a Resource Directory (RD).</p>
     * 
     * @param request ListInstanceRdMembersRequest
     * @return ListInstanceRdMembersResponse
     */
    public ListInstanceRdMembersResponse listInstanceRdMembers(ListInstanceRdMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceRdMembersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the network domains configured in a Bastionhost instance. Network domains define the connectivity between Bastionhost and the hosts or databases that it manages.</p>
     * 
     * @param request ListNetworkDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNetworkDomainsResponse
     */
    public ListNetworkDomainsResponse listNetworkDomainsWithOptions(ListNetworkDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainName)) {
            query.put("NetworkDomainName", request.networkDomainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainType)) {
            query.put("NetworkDomainType", request.networkDomainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNetworkDomains"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNetworkDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the network domains configured in a Bastionhost instance. Network domains define the connectivity between Bastionhost and the hosts or databases that it manages.</p>
     * 
     * @param request ListNetworkDomainsRequest
     * @return ListNetworkDomainsResponse
     */
    public ListNetworkDomainsResponse listNetworkDomains(ListNetworkDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetworkDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of database accounts that the current Resource Access Management (RAM) user is authorized to manage.</p>
     * 
     * @param request ListOperationDatabaseAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOperationDatabaseAccountsResponse
     */
    public ListOperationDatabaseAccountsResponse listOperationDatabaseAccountsWithOptions(ListOperationDatabaseAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseAccountName)) {
            query.put("DatabaseAccountName", request.databaseAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseId)) {
            query.put("DatabaseId", request.databaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOperationDatabaseAccounts"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOperationDatabaseAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of database accounts that the current Resource Access Management (RAM) user is authorized to manage.</p>
     * 
     * @param request ListOperationDatabaseAccountsRequest
     * @return ListOperationDatabaseAccountsResponse
     */
    public ListOperationDatabaseAccountsResponse listOperationDatabaseAccounts(ListOperationDatabaseAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOperationDatabaseAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the databases that the current Resource Access Management (RAM) user is authorized to access.</p>
     * 
     * @param request ListOperationDatabasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOperationDatabasesResponse
     */
    public ListOperationDatabasesResponse listOperationDatabasesWithOptions(ListOperationDatabasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseAddress)) {
            query.put("DatabaseAddress", request.databaseAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseType)) {
            query.put("DatabaseType", request.databaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceId)) {
            query.put("SourceInstanceId", request.sourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceState)) {
            query.put("SourceInstanceState", request.sourceInstanceState);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOperationDatabases"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOperationDatabasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the databases that the current Resource Access Management (RAM) user is authorized to access.</p>
     * 
     * @param request ListOperationDatabasesRequest
     * @return ListOperationDatabasesResponse
     */
    public ListOperationDatabasesResponse listOperationDatabases(ListOperationDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOperationDatabasesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of host accounts that the current Resource Access Management (RAM) user is authorized to manage.</p>
     * 
     * @param request ListOperationHostAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOperationHostAccountsResponse
     */
    public ListOperationHostAccountsResponse listOperationHostAccountsWithOptions(ListOperationHostAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostAccountName)) {
            query.put("HostAccountName", request.hostAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostId)) {
            query.put("HostId", request.hostId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOperationHostAccounts"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOperationHostAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of host accounts that the current Resource Access Management (RAM) user is authorized to manage.</p>
     * 
     * @param request ListOperationHostAccountsRequest
     * @return ListOperationHostAccountsResponse
     */
    public ListOperationHostAccountsResponse listOperationHostAccounts(ListOperationHostAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOperationHostAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the hosts that the current Resource Access Management (RAM) user is authorized to perform O&amp;M operations on through a Bastionhost instance.</p>
     * 
     * @param request ListOperationHostsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOperationHostsResponse
     */
    public ListOperationHostsResponse listOperationHostsWithOptions(ListOperationHostsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostAddress)) {
            query.put("HostAddress", request.hostAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSType)) {
            query.put("OSType", request.OSType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceId)) {
            query.put("SourceInstanceId", request.sourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceState)) {
            query.put("SourceInstanceState", request.sourceInstanceState);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOperationHosts"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOperationHostsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the hosts that the current Resource Access Management (RAM) user is authorized to perform O&amp;M operations on through a Bastionhost instance.</p>
     * 
     * @param request ListOperationHostsRequest
     * @return ListOperationHostsResponse
     */
    public ListOperationHostsResponse listOperationHosts(ListOperationHostsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOperationHostsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the operations and maintenance (O\&amp;M) requests that require administrator approval.
     * The queries per second (QPS) limit for this operation is 10 per user. Exceeding this limit triggers throttling, which can affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the O&amp;M requests that require approval.</p>
     * 
     * @param request ListOperationTicketsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOperationTicketsResponse
     */
    public ListOperationTicketsResponse listOperationTicketsWithOptions(ListOperationTicketsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetAddress)) {
            query.put("AssetAddress", request.assetAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOperationTickets"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOperationTicketsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the operations and maintenance (O\&amp;M) requests that require administrator approval.
     * The queries per second (QPS) limit for this operation is 10 per user. Exceeding this limit triggers throttling, which can affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the O&amp;M requests that require approval.</p>
     * 
     * @param request ListOperationTicketsRequest
     * @return ListOperationTicketsResponse
     */
    public ListOperationTicketsResponse listOperationTickets(ListOperationTicketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOperationTicketsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of control policies.</p>
     * 
     * @param request ListPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPoliciesResponse
     */
    public ListPoliciesResponse listPoliciesWithOptions(ListPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicies"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of control policies.</p>
     * 
     * @param request ListPoliciesRequest
     * @return ListPoliciesResponse
     */
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of authorization rules of a bastion host.</p>
     * 
     * @param request ListRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRulesResponse
     */
    public ListRulesResponse listRulesWithOptions(ListRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleState)) {
            query.put("RuleState", request.ruleState);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRules"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of authorization rules of a bastion host.</p>
     * 
     * @param request ListRulesRequest
     * @return ListRulesResponse
     */
    public ListRulesResponse listRules(ListRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tag keys on resources.</p>
     * 
     * @param request ListTagKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagKeys"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tag keys on resources.</p>
     * 
     * @param request ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the tags that are attached to one or more Bastionhost instances.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the tags that are attached to one or more Bastionhost instances.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves pending automated O&amp;M approval requests.</p>
     * 
     * @param request ListTodoOpsTaskApprovalsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTodoOpsTaskApprovalsResponse
     */
    public ListTodoOpsTaskApprovalsResponse listTodoOpsTaskApprovalsWithOptions(ListTodoOpsTaskApprovalsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            query.put("ScheduleType", request.scheduleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTodoOpsTaskApprovals"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTodoOpsTaskApprovalsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves pending automated O&amp;M approval requests.</p>
     * 
     * @param request ListTodoOpsTaskApprovalsRequest
     * @return ListTodoOpsTaskApprovalsResponse
     */
    public ListTodoOpsTaskApprovalsResponse listTodoOpsTaskApprovals(ListTodoOpsTaskApprovalsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTodoOpsTaskApprovalsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of user groups on a bastion host.</p>
     * 
     * @param request ListUserGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserGroupsResponse
     */
    public ListUserGroupsResponse listUserGroupsWithOptions(ListUserGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupName)) {
            query.put("UserGroupName", request.userGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserGroups"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of user groups on a bastion host.</p>
     * 
     * @param request ListUserGroupsRequest
     * @return ListUserGroupsResponse
     */
    public ListUserGroupsResponse listUserGroups(ListUserGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the SSH public keys that are configured for a Bastionhost user. Users can use these public keys for key-based authentication when logging on to hosts through Bastionhost.</p>
     * 
     * @param request ListUserPublicKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserPublicKeysResponse
     */
    public ListUserPublicKeysResponse listUserPublicKeysWithOptions(ListUserPublicKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserPublicKeys"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserPublicKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the SSH public keys that are configured for a Bastionhost user. Users can use these public keys for key-based authentication when logging on to hosts through Bastionhost.</p>
     * 
     * @param request ListUserPublicKeysRequest
     * @return ListUserPublicKeysResponse
     */
    public ListUserPublicKeysResponse listUserPublicKeys(ListUserPublicKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserPublicKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of users of a bastion host.</p>
     * 
     * @param request ListUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceUserId)) {
            query.put("SourceUserId", request.sourceUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userState)) {
            query.put("UserState", request.userState);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of users of a bastion host.</p>
     * 
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Description</h1>
     * <p>Locks one or more bastion host users to prevent them from performing O\&amp;M operations. If a user does not need to use a bastion host within a specific period of time, lock the user account. Locked users cannot log on to or perform O\&amp;M operations on the hosts on which they have permissions. To unlock users later, use the <a href="https://help.aliyun.com/document_detail/204590.html">UnlockUsers</a> operation.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Locks one or more users of a bastion host.</p>
     * 
     * @param request LockUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LockUsersResponse
     */
    public LockUsersResponse lockUsersWithOptions(LockUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LockUsers"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LockUsersResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Description</h1>
     * <p>Locks one or more bastion host users to prevent them from performing O\&amp;M operations. If a user does not need to use a bastion host within a specific period of time, lock the user account. Locked users cannot log on to or perform O\&amp;M operations on the hosts on which they have permissions. To unlock users later, use the <a href="https://help.aliyun.com/document_detail/204590.html">UnlockUsers</a> operation.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Locks one or more users of a bastion host.</p>
     * 
     * @param request LockUsersRequest
     * @return LockUsersResponse
     */
    public LockUsersResponse lockUsers(LockUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.lockUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic information about a database.</p>
     * 
     * @param request ModifyDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDatabaseResponse
     */
    public ModifyDatabaseResponse modifyDatabaseWithOptions(ModifyDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activeAddressType)) {
            query.put("ActiveAddressType", request.activeAddressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseId)) {
            query.put("DatabaseId", request.databaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databasePort)) {
            query.put("DatabasePort", request.databasePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databasePrivateAddress)) {
            query.put("DatabasePrivateAddress", request.databasePrivateAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databasePublicAddress)) {
            query.put("DatabasePublicAddress", request.databasePublicAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainId)) {
            query.put("NetworkDomainId", request.networkDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceId)) {
            query.put("SourceInstanceId", request.sourceInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDatabase"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic information about a database.</p>
     * 
     * @param request ModifyDatabaseRequest
     * @return ModifyDatabaseResponse
     */
    public ModifyDatabaseResponse modifyDatabase(ModifyDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDatabaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic information about a database account.</p>
     * 
     * @param request ModifyDatabaseAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDatabaseAccountResponse
     */
    public ModifyDatabaseAccountResponse modifyDatabaseAccountWithOptions(ModifyDatabaseAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseAccountId)) {
            query.put("DatabaseAccountId", request.databaseAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseAccountName)) {
            query.put("DatabaseAccountName", request.databaseAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseSchema)) {
            query.put("DatabaseSchema", request.databaseSchema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDatabaseAccount"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDatabaseAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic information about a database account.</p>
     * 
     * @param request ModifyDatabaseAccountRequest
     * @return ModifyDatabaseAccountResponse
     */
    public ModifyDatabaseAccountResponse modifyDatabaseAccount(ModifyDatabaseAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDatabaseAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyHost operation to modify the basic information about a host in a data center, an Elastic Compute Service (ECS) instance, or a host in an ApsaraDB MyBase dedicated cluster.</p>
     * <blockquote>
     * <p>The basic information about ECS instances and hosts in ApsaraDB MyBase dedicated clusters within your Alibaba Cloud account is synchronized to Bastionhost on a regular basis. After you modify the basic information about an ECS instance or a host in an ApsaraDB MyBase dedicated cluster, the modification result may be overwritten by the synchronized information.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies information about a host. The information includes the address, name, and description of the host and the operating system that the host runs.</p>
     * 
     * @param request ModifyHostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHostResponse
     */
    public ModifyHostResponse modifyHostWithOptions(ModifyHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostId)) {
            query.put("HostId", request.hostId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostPrivateAddress)) {
            query.put("HostPrivateAddress", request.hostPrivateAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostPublicAddress)) {
            query.put("HostPublicAddress", request.hostPublicAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainId)) {
            query.put("NetworkDomainId", request.networkDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSType)) {
            query.put("OSType", request.OSType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefKex)) {
            query.put("PrefKex", request.prefKex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHost"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHostResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyHost operation to modify the basic information about a host in a data center, an Elastic Compute Service (ECS) instance, or a host in an ApsaraDB MyBase dedicated cluster.</p>
     * <blockquote>
     * <p>The basic information about ECS instances and hosts in ApsaraDB MyBase dedicated clusters within your Alibaba Cloud account is synchronized to Bastionhost on a regular basis. After you modify the basic information about an ECS instance or a host in an ApsaraDB MyBase dedicated cluster, the modification result may be overwritten by the synchronized information.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies information about a host. The information includes the address, name, and description of the host and the operating system that the host runs.</p>
     * 
     * @param request ModifyHostRequest
     * @return ModifyHostResponse
     */
    public ModifyHostResponse modifyHost(ModifyHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHostWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a host account on a host managed by a Bastionhost instance. You can update the account name, password, or SSH private key used for host logon.</p>
     * 
     * @param request ModifyHostAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHostAccountResponse
     */
    public ModifyHostAccountResponse modifyHostAccountWithOptions(ModifyHostAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostAccountId)) {
            query.put("HostAccountId", request.hostAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostAccountName)) {
            query.put("HostAccountName", request.hostAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostShareKeyId)) {
            query.put("HostShareKeyId", request.hostShareKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passPhrase)) {
            query.put("PassPhrase", request.passPhrase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateKey)) {
            query.put("PrivateKey", request.privateKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privilegeType)) {
            query.put("PrivilegeType", request.privilegeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rotationMode)) {
            query.put("RotationMode", request.rotationMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHostAccount"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHostAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a host account on a host managed by a Bastionhost instance. You can update the account name, password, or SSH private key used for host logon.</p>
     * 
     * @param request ModifyHostAccountRequest
     * @return ModifyHostAccountResponse
     */
    public ModifyHostAccountResponse modifyHostAccount(ModifyHostAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHostAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name or description of the specified host group.</p>
     * 
     * @param request ModifyHostGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHostGroupResponse
     */
    public ModifyHostGroupResponse modifyHostGroupWithOptions(ModifyHostGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostGroupId)) {
            query.put("HostGroupId", request.hostGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostGroupName)) {
            query.put("HostGroupName", request.hostGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHostGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHostGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name or description of the specified host group.</p>
     * 
     * @param request ModifyHostGroupRequest
     * @return ModifyHostGroupResponse
     */
    public ModifyHostGroupResponse modifyHostGroup(ModifyHostGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHostGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a shared key.</p>
     * 
     * @param request ModifyHostShareKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHostShareKeyResponse
     */
    public ModifyHostShareKeyResponse modifyHostShareKeyWithOptions(ModifyHostShareKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostShareKeyId)) {
            query.put("HostShareKeyId", request.hostShareKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostShareKeyName)) {
            query.put("HostShareKeyName", request.hostShareKeyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passPhrase)) {
            query.put("PassPhrase", request.passPhrase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateKey)) {
            query.put("PrivateKey", request.privateKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHostShareKey"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHostShareKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a shared key.</p>
     * 
     * @param request ModifyHostShareKeyRequest
     * @return ModifyHostShareKeyResponse
     */
    public ModifyHostShareKeyResponse modifyHostShareKey(ModifyHostShareKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHostShareKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the endpoint type of one or more hosts for O\\\\\\\\\\\\&amp;M. Public and private IP addresses are supported.</p>
     * 
     * @param request ModifyHostsActiveAddressTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHostsActiveAddressTypeResponse
     */
    public ModifyHostsActiveAddressTypeResponse modifyHostsActiveAddressTypeWithOptions(ModifyHostsActiveAddressTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activeAddressType)) {
            query.put("ActiveAddressType", request.activeAddressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostIds)) {
            query.put("HostIds", request.hostIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHostsActiveAddressType"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHostsActiveAddressTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the endpoint type of one or more hosts for O\\\\\\\\\\\\&amp;M. Public and private IP addresses are supported.</p>
     * 
     * @param request ModifyHostsActiveAddressTypeRequest
     * @return ModifyHostsActiveAddressTypeResponse
     */
    public ModifyHostsActiveAddressTypeResponse modifyHostsActiveAddressType(ModifyHostsActiveAddressTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHostsActiveAddressTypeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Changes the port for the O\&amp;M protocol on one or more hosts. If the standard port for your O\&amp;M protocol is vulnerable to attacks, specify a custom port instead. For example, the standard SSH port is port 22.</p>
     * <blockquote>
     * <p>Ports 0 to 1024 are reserved for Bastionhost. Do not change the port for the O\&amp;M protocol to a reserved port.</p>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the port for the O\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&amp;M protocol on one or more hosts.</p>
     * 
     * @param request ModifyHostsPortRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHostsPortResponse
     */
    public ModifyHostsPortResponse modifyHostsPortWithOptions(ModifyHostsPortRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostIds)) {
            query.put("HostIds", request.hostIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolName)) {
            query.put("ProtocolName", request.protocolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHostsPort"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHostsPortResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Changes the port for the O\&amp;M protocol on one or more hosts. If the standard port for your O\&amp;M protocol is vulnerable to attacks, specify a custom port instead. For example, the standard SSH port is port 22.</p>
     * <blockquote>
     * <p>Ports 0 to 1024 are reserved for Bastionhost. Do not change the port for the O\&amp;M protocol to a reserved port.</p>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the port for the O\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&amp;M protocol on one or more hosts.</p>
     * 
     * @param request ModifyHostsPortRequest
     * @return ModifyHostsPortResponse
     */
    public ModifyHostsPortResponse modifyHostsPort(ModifyHostsPortRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHostsPortWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the settings of the Active Directory (AD) authentication server of a bastion host.</p>
     * 
     * @param request ModifyInstanceADAuthServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceADAuthServerResponse
     */
    public ModifyInstanceADAuthServerResponse modifyInstanceADAuthServerWithOptions(ModifyInstanceADAuthServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baseDN)) {
            query.put("BaseDN", request.baseDN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailMapping)) {
            query.put("EmailMapping", request.emailMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSSL)) {
            query.put("IsSSL", request.isSSL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileMapping)) {
            query.put("MobileMapping", request.mobileMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameMapping)) {
            query.put("NameMapping", request.nameMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.server)) {
            query.put("Server", request.server);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyServer)) {
            query.put("StandbyServer", request.standbyServer);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceADAuthServer"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceADAuthServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the settings of the Active Directory (AD) authentication server of a bastion host.</p>
     * 
     * @param request ModifyInstanceADAuthServerRequest
     * @return ModifyInstanceADAuthServerResponse
     */
    public ModifyInstanceADAuthServerResponse modifyInstanceADAuthServer(ModifyInstanceADAuthServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceADAuthServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the attributes of a specified Bastionhost instance.</p>
     * 
     * @param request ModifyInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceAttributeResponse
     */
    public ModifyInstanceAttributeResponse modifyInstanceAttributeWithOptions(ModifyInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceAttribute"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the attributes of a specified Bastionhost instance.</p>
     * 
     * @param request ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     */
    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the settings of the Lightweight Directory Access Protocol (LDAP) authentication server of a bastion host.</p>
     * 
     * @param request ModifyInstanceLDAPAuthServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceLDAPAuthServerResponse
     */
    public ModifyInstanceLDAPAuthServerResponse modifyInstanceLDAPAuthServerWithOptions(ModifyInstanceLDAPAuthServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baseDN)) {
            query.put("BaseDN", request.baseDN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailMapping)) {
            query.put("EmailMapping", request.emailMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSSL)) {
            query.put("IsSSL", request.isSSL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginNameMapping)) {
            query.put("LoginNameMapping", request.loginNameMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileMapping)) {
            query.put("MobileMapping", request.mobileMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameMapping)) {
            query.put("NameMapping", request.nameMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.server)) {
            query.put("Server", request.server);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyServer)) {
            query.put("StandbyServer", request.standbyServer);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceLDAPAuthServer"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceLDAPAuthServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the settings of the Lightweight Directory Access Protocol (LDAP) authentication server of a bastion host.</p>
     * 
     * @param request ModifyInstanceLDAPAuthServerRequest
     * @return ModifyInstanceLDAPAuthServerResponse
     */
    public ModifyInstanceLDAPAuthServerResponse modifyInstanceLDAPAuthServer(ModifyInstanceLDAPAuthServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceLDAPAuthServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the two-factor authentication settings of a bastion host.</p>
     * 
     * @param request ModifyInstanceTwoFactorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceTwoFactorResponse
     */
    public ModifyInstanceTwoFactorResponse modifyInstanceTwoFactorWithOptions(ModifyInstanceTwoFactorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableTwoFactor)) {
            query.put("EnableTwoFactor", request.enableTwoFactor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipTwoFactorTime)) {
            query.put("SkipTwoFactorTime", request.skipTwoFactorTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.twoFactorMethods)) {
            query.put("TwoFactorMethods", request.twoFactorMethods);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceTwoFactor"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceTwoFactorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the two-factor authentication settings of a bastion host.</p>
     * 
     * @param request ModifyInstanceTwoFactorRequest
     * @return ModifyInstanceTwoFactorResponse
     */
    public ModifyInstanceTwoFactorResponse modifyInstanceTwoFactor(ModifyInstanceTwoFactorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceTwoFactorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic information about a network domain.</p>
     * 
     * @param request ModifyNetworkDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNetworkDomainResponse
     */
    public ModifyNetworkDomainResponse modifyNetworkDomainWithOptions(ModifyNetworkDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainId)) {
            query.put("NetworkDomainId", request.networkDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainName)) {
            query.put("NetworkDomainName", request.networkDomainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainType)) {
            query.put("NetworkDomainType", request.networkDomainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxies)) {
            query.put("Proxies", request.proxies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNetworkDomain"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNetworkDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic information about a network domain.</p>
     * 
     * @param request ModifyNetworkDomainRequest
     * @return ModifyNetworkDomainResponse
     */
    public ModifyNetworkDomainResponse modifyNetworkDomain(ModifyNetworkDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNetworkDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic information about a control policy.</p>
     * 
     * @param request ModifyPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPolicyResponse
     */
    public ModifyPolicyResponse modifyPolicyWithOptions(ModifyPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPolicy"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic information about a control policy.</p>
     * 
     * @param request ModifyPolicyRequest
     * @return ModifyPolicyResponse
     */
    public ModifyPolicyResponse modifyPolicy(ModifyPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic information of an authorization rule.</p>
     * 
     * @param request ModifyRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRuleResponse
     */
    public ModifyRuleResponse modifyRuleWithOptions(ModifyRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databases)) {
            query.put("Databases", request.databases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveEndTime)) {
            query.put("EffectiveEndTime", request.effectiveEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveStartTime)) {
            query.put("EffectiveStartTime", request.effectiveStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostGroups)) {
            query.put("HostGroups", request.hostGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hosts)) {
            query.put("Hosts", request.hosts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            query.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRule"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic information of an authorization rule.</p>
     * 
     * @param request ModifyRuleRequest
     * @return ModifyRuleResponse
     */
    public ModifyRuleResponse modifyRule(ModifyRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about a user of a bastion host.</p>
     * 
     * @param request ModifyUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserResponse
     */
    public ModifyUserResponse modifyUserWithOptions(ModifyUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveEndTime)) {
            query.put("EffectiveEndTime", request.effectiveEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveStartTime)) {
            query.put("EffectiveStartTime", request.effectiveStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageStatus)) {
            query.put("LanguageStatus", request.languageStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileCountryCode)) {
            query.put("MobileCountryCode", request.mobileCountryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needResetPassword)) {
            query.put("NeedResetPassword", request.needResetPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.twoFactorMethods)) {
            query.put("TwoFactorMethods", request.twoFactorMethods);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.twoFactorStatus)) {
            query.put("TwoFactorStatus", request.twoFactorStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUser"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about a user of a bastion host.</p>
     * 
     * @param request ModifyUserRequest
     * @return ModifyUserResponse
     */
    public ModifyUserResponse modifyUser(ModifyUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about a user group.</p>
     * 
     * @param request ModifyUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserGroupResponse
     */
    public ModifyUserGroupResponse modifyUserGroupWithOptions(ModifyUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupName)) {
            query.put("UserGroupName", request.userGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about a user group.</p>
     * 
     * @param request ModifyUserGroupRequest
     * @return ModifyUserGroupResponse
     */
    public ModifyUserGroupResponse modifyUserGroup(ModifyUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the public key of the user.</p>
     * 
     * @param request ModifyUserPublicKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserPublicKeyResponse
     */
    public ModifyUserPublicKeyResponse modifyUserPublicKeyWithOptions(ModifyUserPublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKey)) {
            query.put("PublicKey", request.publicKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKeyId)) {
            query.put("PublicKeyId", request.publicKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKeyName)) {
            query.put("PublicKeyName", request.publicKeyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserPublicKey"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserPublicKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the public key of the user.</p>
     * 
     * @param request ModifyUserPublicKeyRequest
     * @return ModifyUserPublicKeyResponse
     */
    public ModifyUserPublicKeyResponse modifyUserPublicKey(ModifyUserPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserPublicKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds multiple databases to a network domain at a time.</p>
     * 
     * @param request MoveDatabasesToNetworkDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveDatabasesToNetworkDomainResponse
     */
    public MoveDatabasesToNetworkDomainResponse moveDatabasesToNetworkDomainWithOptions(MoveDatabasesToNetworkDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseIds)) {
            query.put("DatabaseIds", request.databaseIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainId)) {
            query.put("NetworkDomainId", request.networkDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveDatabasesToNetworkDomain"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveDatabasesToNetworkDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds multiple databases to a network domain at a time.</p>
     * 
     * @param request MoveDatabasesToNetworkDomainRequest
     * @return MoveDatabasesToNetworkDomainResponse
     */
    public MoveDatabasesToNetworkDomainResponse moveDatabasesToNetworkDomain(MoveDatabasesToNetworkDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveDatabasesToNetworkDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds multiple hosts to a network domain at a time.</p>
     * 
     * @param request MoveHostsToNetworkDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveHostsToNetworkDomainResponse
     */
    public MoveHostsToNetworkDomainResponse moveHostsToNetworkDomainWithOptions(MoveHostsToNetworkDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostIds)) {
            query.put("HostIds", request.hostIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkDomainId)) {
            query.put("NetworkDomainId", request.networkDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveHostsToNetworkDomain"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveHostsToNetworkDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds multiple hosts to a network domain at a time.</p>
     * 
     * @param request MoveHostsToNetworkDomainRequest
     * @return MoveHostsToNetworkDomainResponse
     */
    public MoveHostsToNetworkDomainResponse moveHostsToNetworkDomain(MoveHostsToNetworkDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveHostsToNetworkDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a Bastionhost instance to a specified resource group.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a Bastionhost instance to a specified resource group.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Rejects an O\&amp;M engineer\&quot;s command execution request as a Bastionhost administrator.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>If an O\\\\\\&amp;M engineer attempts to run a command specified in the Command Approval section of the Create Control Policy page, the administrator is notified to review the command in the Bastionhost console. The command can be run only after it is approved by the administrator.</p>
     * 
     * @param request RejectApproveCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RejectApproveCommandResponse
     */
    public RejectApproveCommandResponse rejectApproveCommandWithOptions(RejectApproveCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandId)) {
            query.put("CommandId", request.commandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RejectApproveCommand"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RejectApproveCommandResponse());
    }

    /**
     * <b>description</b> :
     * <p>Rejects an O\&amp;M engineer\&quot;s command execution request as a Bastionhost administrator.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>If an O\\\\\\&amp;M engineer attempts to run a command specified in the Command Approval section of the Create Control Policy page, the administrator is notified to review the command in the Bastionhost console. The command can be run only after it is approved by the administrator.</p>
     * 
     * @param request RejectApproveCommandRequest
     * @return RejectApproveCommandResponse
     */
    public RejectApproveCommandResponse rejectApproveCommand(RejectApproveCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rejectApproveCommandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Rejects an O&amp;M task approval.</p>
     * 
     * @param request RejectOperationTaskApprovalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RejectOperationTaskApprovalResponse
     */
    public RejectOperationTaskApprovalResponse rejectOperationTaskApprovalWithOptions(RejectOperationTaskApprovalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approveId)) {
            query.put("ApproveId", request.approveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RejectOperationTaskApproval"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RejectOperationTaskApprovalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Rejects an O&amp;M task approval.</p>
     * 
     * @param request RejectOperationTaskApprovalRequest
     * @return RejectOperationTaskApprovalResponse
     */
    public RejectOperationTaskApprovalResponse rejectOperationTaskApproval(RejectOperationTaskApprovalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rejectOperationTaskApprovalWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Rejects an O\&amp;M engineer\&quot;s O\&amp;M application as a Bastionhost administrator.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>If a Bastionhost administrator enables O\\\\\\\\\\\\&amp;M Approval on the Create Control Policy page, O\\\\\\\\\\\\&amp;M engineers can log on to assets to perform O\\\\\\\\\\\\&amp;M operations only after the administrator approves their O\\\\\\\\\\\\&amp;M applications.</p>
     * 
     * @param request RejectOperationTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RejectOperationTicketResponse
     */
    public RejectOperationTicketResponse rejectOperationTicketWithOptions(RejectOperationTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationTicketId)) {
            query.put("OperationTicketId", request.operationTicketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RejectOperationTicket"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RejectOperationTicketResponse());
    }

    /**
     * <b>description</b> :
     * <p>Rejects an O\&amp;M engineer\&quot;s O\&amp;M application as a Bastionhost administrator.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>If a Bastionhost administrator enables O\\\\\\\\\\\\&amp;M Approval on the Create Control Policy page, O\\\\\\\\\\\\&amp;M engineers can log on to assets to perform O\\\\\\\\\\\\&amp;M operations only after the administrator approves their O\\\\\\\\\\\\&amp;M applications.</p>
     * 
     * @param request RejectOperationTicketRequest
     * @return RejectOperationTicketResponse
     */
    public RejectOperationTicketResponse rejectOperationTicket(RejectOperationTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rejectOperationTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes multiple databases from an asset group at a time.</p>
     * 
     * @param request RemoveDatabasesFromGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveDatabasesFromGroupResponse
     */
    public RemoveDatabasesFromGroupResponse removeDatabasesFromGroupWithOptions(RemoveDatabasesFromGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseIds)) {
            query.put("DatabaseIds", request.databaseIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostGroupId)) {
            query.put("HostGroupId", request.hostGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveDatabasesFromGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDatabasesFromGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes multiple databases from an asset group at a time.</p>
     * 
     * @param request RemoveDatabasesFromGroupRequest
     * @return RemoveDatabasesFromGroupResponse
     */
    public RemoveDatabasesFromGroupResponse removeDatabasesFromGroup(RemoveDatabasesFromGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDatabasesFromGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Removes multiple hosts from an asset group. If certain hosts no longer need to be managed through an asset group, you can use this operation to remove them.</p>
     * <h1><a href="#qps-"></a>QPS limit</h1>
     * <p>You can call this API operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes multiple hosts from an asset group at a time.</p>
     * 
     * @param request RemoveHostsFromGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveHostsFromGroupResponse
     */
    public RemoveHostsFromGroupResponse removeHostsFromGroupWithOptions(RemoveHostsFromGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostGroupId)) {
            query.put("HostGroupId", request.hostGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostIds)) {
            query.put("HostIds", request.hostIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveHostsFromGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveHostsFromGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Removes multiple hosts from an asset group. If certain hosts no longer need to be managed through an asset group, you can use this operation to remove them.</p>
     * <h1><a href="#qps-"></a>QPS limit</h1>
     * <p>You can call this API operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes multiple hosts from an asset group at a time.</p>
     * 
     * @param request RemoveHostsFromGroupRequest
     * @return RemoveHostsFromGroupResponse
     */
    public RemoveHostsFromGroupResponse removeHostsFromGroup(RemoveHostsFromGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeHostsFromGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before removing a member account, you must purge the ECS, RDS, and PolarDB instance assets that belong to the member account from Bastionhost.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a Resource Directory (RD) member account from a Bastionhost instance. You must remove all assets of the member account from Bastionhost before you call this operation.</p>
     * 
     * @param request RemoveInstanceRdMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveInstanceRdMemberResponse
     */
    public RemoveInstanceRdMemberResponse removeInstanceRdMemberWithOptions(RemoveInstanceRdMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveInstanceRdMember"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveInstanceRdMemberResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before removing a member account, you must purge the ECS, RDS, and PolarDB instance assets that belong to the member account from Bastionhost.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a Resource Directory (RD) member account from a Bastionhost instance. You must remove all assets of the member account from Bastionhost before you call this operation.</p>
     * 
     * @param request RemoveInstanceRdMemberRequest
     * @return RemoveInstanceRdMemberResponse
     */
    public RemoveInstanceRdMemberResponse removeInstanceRdMember(RemoveInstanceRdMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeInstanceRdMemberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Removes one or more users from a user group at once. Use this operation when users transfer to new positions, resign, or switch to another user group.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes one or more users from a user group.</p>
     * 
     * @param request RemoveUsersFromGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUsersFromGroupResponse
     */
    public RemoveUsersFromGroupResponse removeUsersFromGroupWithOptions(RemoveUsersFromGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUsersFromGroup"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUsersFromGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Removes one or more users from a user group at once. Use this operation when users transfer to new positions, resign, or switch to another user group.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes one or more users from a user group.</p>
     * 
     * @param request RemoveUsersFromGroupRequest
     * @return RemoveUsersFromGroupResponse
     */
    public RemoveUsersFromGroupResponse removeUsersFromGroup(RemoveUsersFromGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUsersFromGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renews an O\\\\\\&amp;M token for one hour.</p>
     * 
     * @param request RenewAssetOperationTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewAssetOperationTokenResponse
     */
    public RenewAssetOperationTokenResponse renewAssetOperationTokenWithOptions(RenewAssetOperationTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenId)) {
            query.put("TokenId", request.tokenId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewAssetOperationToken"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewAssetOperationTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renews an O\\\\\\&amp;M token for one hour.</p>
     * 
     * @param request RenewAssetOperationTokenRequest
     * @return RenewAssetOperationTokenResponse
     */
    public RenewAssetOperationTokenResponse renewAssetOperationToken(RenewAssetOperationTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewAssetOperationTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Clears the credential (password or SSH private key) for a specified host account.</p>
     * 
     * @param request ResetHostAccountCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetHostAccountCredentialResponse
     */
    public ResetHostAccountCredentialResponse resetHostAccountCredentialWithOptions(ResetHostAccountCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialType)) {
            query.put("CredentialType", request.credentialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostAccountId)) {
            query.put("HostAccountId", request.hostAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetHostAccountCredential"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetHostAccountCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Clears the credential (password or SSH private key) for a specified host account.</p>
     * 
     * @param request ResetHostAccountCredentialRequest
     * @return ResetHostAccountCredentialResponse
     */
    public ResetHostAccountCredentialResponse resetHostAccountCredential(ResetHostAccountCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetHostAccountCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the logon period limits in a control policy.</p>
     * 
     * @param tmpReq SetPolicyAccessTimeRangeConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPolicyAccessTimeRangeConfigResponse
     */
    public SetPolicyAccessTimeRangeConfigResponse setPolicyAccessTimeRangeConfigWithOptions(SetPolicyAccessTimeRangeConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetPolicyAccessTimeRangeConfigShrinkRequest request = new SetPolicyAccessTimeRangeConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accessTimeRangeConfig)) {
            request.accessTimeRangeConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accessTimeRangeConfig, "AccessTimeRangeConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessTimeRangeConfigShrink)) {
            query.put("AccessTimeRangeConfig", request.accessTimeRangeConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPolicyAccessTimeRangeConfig"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPolicyAccessTimeRangeConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the logon period limits in a control policy.</p>
     * 
     * @param request SetPolicyAccessTimeRangeConfigRequest
     * @return SetPolicyAccessTimeRangeConfigResponse
     */
    public SetPolicyAccessTimeRangeConfigResponse setPolicyAccessTimeRangeConfig(SetPolicyAccessTimeRangeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPolicyAccessTimeRangeConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the O\\&amp;M approval setting in a control policy.</p>
     * 
     * @param tmpReq SetPolicyApprovalConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPolicyApprovalConfigResponse
     */
    public SetPolicyApprovalConfigResponse setPolicyApprovalConfigWithOptions(SetPolicyApprovalConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetPolicyApprovalConfigShrinkRequest request = new SetPolicyApprovalConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.approvalConfig)) {
            request.approvalConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.approvalConfig, "ApprovalConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalConfigShrink)) {
            query.put("ApprovalConfig", request.approvalConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPolicyApprovalConfig"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPolicyApprovalConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the O\\&amp;M approval setting in a control policy.</p>
     * 
     * @param request SetPolicyApprovalConfigRequest
     * @return SetPolicyApprovalConfigResponse
     */
    public SetPolicyApprovalConfigResponse setPolicyApprovalConfig(SetPolicyApprovalConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPolicyApprovalConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Specifies the assets to which a control policy applies.</p>
     * 
     * @param request SetPolicyAssetScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPolicyAssetScopeResponse
     */
    public SetPolicyAssetScopeResponse setPolicyAssetScopeWithOptions(SetPolicyAssetScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databases)) {
            query.put("Databases", request.databases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostGroups)) {
            query.put("HostGroups", request.hostGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hosts)) {
            query.put("Hosts", request.hosts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeType)) {
            query.put("ScopeType", request.scopeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPolicyAssetScope"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPolicyAssetScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Specifies the assets to which a control policy applies.</p>
     * 
     * @param request SetPolicyAssetScopeRequest
     * @return SetPolicyAssetScopeResponse
     */
    public SetPolicyAssetScopeResponse setPolicyAssetScope(SetPolicyAssetScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPolicyAssetScopeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Specifies the commands that can or cannot be run by the users or on the assets associated with the policy and the commands that must be reviewed.</p>
     * 
     * @param tmpReq SetPolicyCommandConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPolicyCommandConfigResponse
     */
    public SetPolicyCommandConfigResponse setPolicyCommandConfigWithOptions(SetPolicyCommandConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetPolicyCommandConfigShrinkRequest request = new SetPolicyCommandConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.commandConfig)) {
            request.commandConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.commandConfig, "CommandConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandConfigShrink)) {
            query.put("CommandConfig", request.commandConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPolicyCommandConfig"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPolicyCommandConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Specifies the commands that can or cannot be run by the users or on the assets associated with the policy and the commands that must be reviewed.</p>
     * 
     * @param request SetPolicyCommandConfigRequest
     * @return SetPolicyCommandConfigResponse
     */
    public SetPolicyCommandConfigResponse setPolicyCommandConfig(SetPolicyCommandConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPolicyCommandConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Specifies whether a source IP address can access the assets to which a control policy applies.</p>
     * 
     * @param tmpReq SetPolicyIPAclConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPolicyIPAclConfigResponse
     */
    public SetPolicyIPAclConfigResponse setPolicyIPAclConfigWithOptions(SetPolicyIPAclConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetPolicyIPAclConfigShrinkRequest request = new SetPolicyIPAclConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.IPAclConfig)) {
            request.IPAclConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.IPAclConfig, "IPAclConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.IPAclConfigShrink)) {
            query.put("IPAclConfig", request.IPAclConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPolicyIPAclConfig"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPolicyIPAclConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Specifies whether a source IP address can access the assets to which a control policy applies.</p>
     * 
     * @param request SetPolicyIPAclConfigRequest
     * @return SetPolicyIPAclConfigResponse
     */
    public SetPolicyIPAclConfigResponse setPolicyIPAclConfig(SetPolicyIPAclConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPolicyIPAclConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the Remote Desktop Protocol (RDP), Secure Shell (SSH), and SSH File Transfer Protocol (SFTP) options for a control policy.</p>
     * 
     * @param tmpReq SetPolicyProtocolConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPolicyProtocolConfigResponse
     */
    public SetPolicyProtocolConfigResponse setPolicyProtocolConfigWithOptions(SetPolicyProtocolConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetPolicyProtocolConfigShrinkRequest request = new SetPolicyProtocolConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocolConfig)) {
            request.protocolConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocolConfig, "ProtocolConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolConfigShrink)) {
            query.put("ProtocolConfig", request.protocolConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPolicyProtocolConfig"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPolicyProtocolConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the Remote Desktop Protocol (RDP), Secure Shell (SSH), and SSH File Transfer Protocol (SFTP) options for a control policy.</p>
     * 
     * @param request SetPolicyProtocolConfigRequest
     * @return SetPolicyProtocolConfigResponse
     */
    public SetPolicyProtocolConfigResponse setPolicyProtocolConfig(SetPolicyProtocolConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPolicyProtocolConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Specifies the users to whom a control policy applies.</p>
     * 
     * @param request SetPolicyUserScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPolicyUserScopeResponse
     */
    public SetPolicyUserScopeResponse setPolicyUserScopeWithOptions(SetPolicyUserScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeType)) {
            query.put("ScopeType", request.scopeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            query.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPolicyUserScope"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPolicyUserScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Specifies the users to whom a control policy applies.</p>
     * 
     * @param request SetPolicyUserScopeRequest
     * @return SetPolicyUserScopeResponse
     */
    public SetPolicyUserScopeResponse setPolicyUserScope(SetPolicyUserScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPolicyUserScopeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a specified Bastionhost instance.</p>
     * 
     * @param request StartInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientSecurityGroupIds)) {
            query.put("ClientSecurityGroupIds", request.clientSecurityGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePortalPrivateAccess)) {
            query.put("EnablePortalPrivateAccess", request.enablePortalPrivateAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupIds)) {
            query.put("SecurityGroupIds", request.securityGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveVswitchId)) {
            query.put("SlaveVswitchId", request.slaveVswitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchId)) {
            query.put("VswitchId", request.vswitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartInstance"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a specified Bastionhost instance.</p>
     * 
     * @param request StartInstanceRequest
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and attaches tags to one or more Bastionhost instances.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and attaches tags to one or more Bastionhost instances.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Unlocks previously locked bastion host users, allowing them to resume O\&amp;M operations. Use this operation after locking users with the <a href="https://help.aliyun.com/document_detail/204591.html">LockUsers</a> operation.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Unlocks one or more users of a bastion host.</p>
     * 
     * @param request UnlockUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnlockUsersResponse
     */
    public UnlockUsersResponse unlockUsersWithOptions(UnlockUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnlockUsers"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnlockUsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Unlocks previously locked bastion host users, allowing them to resume O\&amp;M operations. Use this operation after locking users with the <a href="https://help.aliyun.com/document_detail/204591.html">LockUsers</a> operation.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Unlocks one or more users of a bastion host.</p>
     * 
     * @param request UnlockUsersRequest
     * @return UnlockUsersResponse
     */
    public UnlockUsersResponse unlockUsers(UnlockUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unlockUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from one or more Bastionhost instances. You can remove specific tag key-value pairs or all tags at once.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from one or more Bastionhost instances. You can remove specific tag key-value pairs or all tags at once.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Tests the connectivity to the Active Directory (AD) authentication server configured for a Bastionhost instance. Use this operation to validate your AD settings before you save them.</p>
     * 
     * @param request VerifyInstanceADAuthServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyInstanceADAuthServerResponse
     */
    public VerifyInstanceADAuthServerResponse verifyInstanceADAuthServerWithOptions(VerifyInstanceADAuthServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baseDN)) {
            query.put("BaseDN", request.baseDN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSSL)) {
            query.put("IsSSL", request.isSSL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.server)) {
            query.put("Server", request.server);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyServer)) {
            query.put("StandbyServer", request.standbyServer);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyInstanceADAuthServer"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyInstanceADAuthServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Tests the connectivity to the Active Directory (AD) authentication server configured for a Bastionhost instance. Use this operation to validate your AD settings before you save them.</p>
     * 
     * @param request VerifyInstanceADAuthServerRequest
     * @return VerifyInstanceADAuthServerResponse
     */
    public VerifyInstanceADAuthServerResponse verifyInstanceADAuthServer(VerifyInstanceADAuthServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyInstanceADAuthServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Tests the connectivity to the Lightweight Directory Access Protocol (LDAP) authentication server configured for a Bastionhost instance. Use this operation to validate your LDAP settings before you save them.</p>
     * 
     * @param request VerifyInstanceLDAPAuthServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyInstanceLDAPAuthServerResponse
     */
    public VerifyInstanceLDAPAuthServerResponse verifyInstanceLDAPAuthServerWithOptions(VerifyInstanceLDAPAuthServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baseDN)) {
            query.put("BaseDN", request.baseDN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSSL)) {
            query.put("IsSSL", request.isSSL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.server)) {
            query.put("Server", request.server);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyServer)) {
            query.put("StandbyServer", request.standbyServer);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyInstanceLDAPAuthServer"),
            new TeaPair("version", "2019-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyInstanceLDAPAuthServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Tests the connectivity to the Lightweight Directory Access Protocol (LDAP) authentication server configured for a Bastionhost instance. Use this operation to validate your LDAP settings before you save them.</p>
     * 
     * @param request VerifyInstanceLDAPAuthServerRequest
     * @return VerifyInstanceLDAPAuthServerResponse
     */
    public VerifyInstanceLDAPAuthServerResponse verifyInstanceLDAPAuthServer(VerifyInstanceLDAPAuthServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyInstanceLDAPAuthServerWithOptions(request, runtime);
    }
}

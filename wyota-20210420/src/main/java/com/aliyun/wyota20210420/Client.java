// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420;

import com.aliyun.tea.*;
import com.aliyun.wyota20210420.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("wyota", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>添加终端</p>
     * 
     * @param request AddTerminalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTerminalResponse
     */
    public AddTerminalResponse addTerminalWithOptions(AddTerminalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            body.put("Alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            body.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainBizType)) {
            body.put("MainBizType", request.mainBizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            body.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminalGroupId)) {
            body.put("TerminalGroupId", request.terminalGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTerminal"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTerminalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加终端</p>
     * 
     * @param request AddTerminalRequest
     * @return AddTerminalResponse
     */
    public AddTerminalResponse addTerminal(AddTerminalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTerminalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加终端</p>
     * 
     * @param request AddTerminalsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTerminalsResponse
     */
    public AddTerminalsResponse addTerminalsWithOptions(AddTerminalsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addTerminalParams)) {
            bodyFlat.put("AddTerminalParams", request.addTerminalParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainBizType)) {
            body.put("MainBizType", request.mainBizType);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTerminals"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTerminalsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加终端</p>
     * 
     * @param request AddTerminalsRequest
     * @return AddTerminalsResponse
     */
    public AddTerminalsResponse addTerminals(AddTerminalsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTerminalsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>绑定免账号登录用户</p>
     * 
     * @param request BindAccountLessLoginUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAccountLessLoginUserResponse
     */
    public BindAccountLessLoginUserResponse bindAccountLessLoginUserWithOptions(BindAccountLessLoginUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            body.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAccountLessLoginUser"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAccountLessLoginUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>绑定免账号登录用户</p>
     * 
     * @param request BindAccountLessLoginUserRequest
     * @return BindAccountLessLoginUserResponse
     */
    public BindAccountLessLoginUserResponse bindAccountLessLoginUser(BindAccountLessLoginUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAccountLessLoginUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>绑定免账号登录用户</p>
     * 
     * @param request BindPasswordFreeLoginUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindPasswordFreeLoginUserResponse
     */
    public BindPasswordFreeLoginUserResponse bindPasswordFreeLoginUserWithOptions(BindPasswordFreeLoginUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainBizType)) {
            body.put("MainBizType", request.mainBizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            body.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindPasswordFreeLoginUser"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindPasswordFreeLoginUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>绑定免账号登录用户</p>
     * 
     * @param request BindPasswordFreeLoginUserRequest
     * @return BindPasswordFreeLoginUserResponse
     */
    public BindPasswordFreeLoginUserResponse bindPasswordFreeLoginUser(BindPasswordFreeLoginUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindPasswordFreeLoginUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解除桌面端、移动端纳管</p>
     * 
     * @param request DeleteClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClientsResponse
     */
    public DeleteClientsResponse deleteClientsWithOptions(DeleteClientsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callerAliUid)) {
            query.put("CallerAliUid", request.callerAliUid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inManage)) {
            body.put("InManage", request.inManage);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uuids)) {
            bodyFlat.put("Uuids", request.uuids);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClients"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClientsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解除桌面端、移动端纳管</p>
     * 
     * @param request DeleteClientsRequest
     * @return DeleteClientsResponse
     */
    public DeleteClientsResponse deleteClients(DeleteClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClientsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询桌面端、移动端详细信息</p>
     * 
     * @param request DescribeClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClientsResponse
     */
    public DescribeClientsResponse describeClientsWithOptions(DescribeClientsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callerAliUid)) {
            query.put("CallerAliUid", request.callerAliUid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            body.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customResourceId)) {
            body.put("CustomResourceId", request.customResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customResourceStatus)) {
            body.put("CustomResourceStatus", request.customResourceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inManage)) {
            body.put("InManage", request.inManage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeSubGroups)) {
            body.put("IncludeSubGroups", request.includeSubGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlineStatus)) {
            body.put("OnlineStatus", request.onlineStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyword)) {
            body.put("SearchKeyword", request.searchKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminalGroupId)) {
            body.put("TerminalGroupId", request.terminalGroupId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uuids)) {
            bodyFlat.put("Uuids", request.uuids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withBindUser)) {
            body.put("WithBindUser", request.withBindUser);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClients"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClientsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询桌面端、移动端详细信息</p>
     * 
     * @param request DescribeClientsRequest
     * @return DescribeClientsResponse
     */
    public DescribeClientsResponse describeClients(DescribeClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClientsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取桌面端纳管邀请码</p>
     * 
     * @param request GetOrCreateInvitationCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrCreateInvitationCodeResponse
     */
    public GetOrCreateInvitationCodeResponse getOrCreateInvitationCodeWithOptions(GetOrCreateInvitationCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireDays)) {
            body.put("ExpireDays", request.expireDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireMinutes)) {
            body.put("ExpireMinutes", request.expireMinutes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminalGroupId)) {
            body.put("TerminalGroupId", request.terminalGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrCreateInvitationCode"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrCreateInvitationCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取桌面端纳管邀请码</p>
     * 
     * @param request GetOrCreateInvitationCodeRequest
     * @return GetOrCreateInvitationCodeResponse
     */
    public GetOrCreateInvitationCodeResponse getOrCreateInvitationCode(GetOrCreateInvitationCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOrCreateInvitationCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询终端列表</p>
     * 
     * @param request ListTerminalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTerminalResponse
     */
    public ListTerminalResponse listTerminalWithOptions(ListTerminalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            body.put("Alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildId)) {
            body.put("BuildId", request.buildId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            body.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inManage)) {
            body.put("InManage", request.inManage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv4)) {
            body.put("Ipv4", request.ipv4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationInfo)) {
            body.put("LocationInfo", request.locationInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyword)) {
            body.put("SearchKeyword", request.searchKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            body.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminalGroupId)) {
            body.put("TerminalGroupId", request.terminalGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTerminal"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTerminalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询终端列表</p>
     * 
     * @param request ListTerminalRequest
     * @return ListTerminalResponse
     */
    public ListTerminalResponse listTerminal(ListTerminalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTerminalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>向终端发送运维命令</p>
     * 
     * @param request SendOpsMessageToTerminalsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendOpsMessageToTerminalsResponse
     */
    public SendOpsMessageToTerminalsResponse sendOpsMessageToTerminalsWithOptions(SendOpsMessageToTerminalsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delay)) {
            query.put("Delay", request.delay);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.msg)) {
            body.put("Msg", request.msg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opsAction)) {
            body.put("OpsAction", request.opsAction);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uuids)) {
            bodyFlat.put("Uuids", request.uuids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitForAck)) {
            body.put("WaitForAck", request.waitForAck);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendOpsMessageToTerminals"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendOpsMessageToTerminalsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>向终端发送运维命令</p>
     * 
     * @param request SendOpsMessageToTerminalsRequest
     * @return SendOpsMessageToTerminalsResponse
     */
    public SendOpsMessageToTerminalsResponse sendOpsMessageToTerminals(SendOpsMessageToTerminalsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendOpsMessageToTerminalsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑免账号登录用户</p>
     * 
     * @param request UnbindAccountLessLoginUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindAccountLessLoginUserResponse
     */
    public UnbindAccountLessLoginUserResponse unbindAccountLessLoginUserWithOptions(UnbindAccountLessLoginUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            body.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindAccountLessLoginUser"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindAccountLessLoginUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑免账号登录用户</p>
     * 
     * @param request UnbindAccountLessLoginUserRequest
     * @return UnbindAccountLessLoginUserResponse
     */
    public UnbindAccountLessLoginUserResponse unbindAccountLessLoginUser(UnbindAccountLessLoginUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindAccountLessLoginUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑免密登录用户</p>
     * 
     * @param request UnbindPasswordFreeLoginUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindPasswordFreeLoginUserResponse
     */
    public UnbindPasswordFreeLoginUserResponse unbindPasswordFreeLoginUserWithOptions(UnbindPasswordFreeLoginUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mainBizType)) {
            body.put("MainBizType", request.mainBizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            body.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindPasswordFreeLoginUser"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindPasswordFreeLoginUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑免密登录用户</p>
     * 
     * @param request UnbindPasswordFreeLoginUserRequest
     * @return UnbindPasswordFreeLoginUserResponse
     */
    public UnbindPasswordFreeLoginUserResponse unbindPasswordFreeLoginUser(UnbindPasswordFreeLoginUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindPasswordFreeLoginUserWithOptions(request, runtime);
    }
}

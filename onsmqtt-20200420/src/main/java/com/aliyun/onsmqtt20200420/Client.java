// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420;

import com.aliyun.tea.*;
import com.aliyun.onsmqtt20200420.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("onsmqtt", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>激活CA证书</p>
     * 
     * @param request ActiveCaCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActiveCaCertificateResponse
     */
    public ActiveCaCertificateResponse activeCaCertificateWithOptions(ActiveCaCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mqttInstanceId)) {
            query.put("MqttInstanceId", request.mqttInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sn)) {
            query.put("Sn", request.sn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActiveCaCertificate"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActiveCaCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>激活CA证书</p>
     * 
     * @param request ActiveCaCertificateRequest
     * @return ActiveCaCertificateResponse
     */
    public ActiveCaCertificateResponse activeCaCertificate(ActiveCaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activeCaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>激活设备证书</p>
     * 
     * @param request ActiveDeviceCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActiveDeviceCertificateResponse
     */
    public ActiveDeviceCertificateResponse activeDeviceCertificateWithOptions(ActiveDeviceCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caSn)) {
            query.put("CaSn", request.caSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceSn)) {
            query.put("DeviceSn", request.deviceSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mqttInstanceId)) {
            query.put("MqttInstanceId", request.mqttInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActiveDeviceCertificate"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActiveDeviceCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>激活设备证书</p>
     * 
     * @param request ActiveDeviceCertificateRequest
     * @return ActiveDeviceCertificateResponse
     */
    public ActiveDeviceCertificateResponse activeDeviceCertificate(ActiveDeviceCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activeDeviceCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a device to the connection blacklist to disable connections from the device.</p>
     * 
     * @param request AddCustomAuthConnectBlackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCustomAuthConnectBlackResponse
     */
    public AddCustomAuthConnectBlackResponse addCustomAuthConnectBlackWithOptions(AddCustomAuthConnectBlackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCustomAuthConnectBlack"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCustomAuthConnectBlackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a device to the connection blacklist to disable connections from the device.</p>
     * 
     * @param request AddCustomAuthConnectBlackRequest
     * @return AddCustomAuthConnectBlackResponse
     */
    public AddCustomAuthConnectBlackResponse addCustomAuthConnectBlack(AddCustomAuthConnectBlackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCustomAuthConnectBlackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds the information about identity authentication. The identity can be accurate to a client.</p>
     * 
     * @param request AddCustomAuthIdentityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCustomAuthIdentityResponse
     */
    public AddCustomAuthIdentityResponse addCustomAuthIdentityWithOptions(AddCustomAuthIdentityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            body.put("IdentityType", request.identityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secret)) {
            body.put("Secret", request.secret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signMode)) {
            body.put("SignMode", request.signMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCustomAuthIdentity"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCustomAuthIdentityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds the information about identity authentication. The identity can be accurate to a client.</p>
     * 
     * @param request AddCustomAuthIdentityRequest
     * @return AddCustomAuthIdentityResponse
     */
    public AddCustomAuthIdentityResponse addCustomAuthIdentity(AddCustomAuthIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCustomAuthIdentityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds permissions on topics. You must create a level-1 topic in the ApsaraMQ for MQTT console before you call this operation.</p>
     * 
     * @param request AddCustomAuthPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCustomAuthPermissionResponse
     */
    public AddCustomAuthPermissionResponse addCustomAuthPermissionWithOptions(AddCustomAuthPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.effect)) {
            body.put("Effect", request.effect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identity)) {
            body.put("Identity", request.identity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            body.put("IdentityType", request.identityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permitAction)) {
            body.put("PermitAction", request.permitAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            body.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCustomAuthPermission"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCustomAuthPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds permissions on topics. You must create a level-1 topic in the ApsaraMQ for MQTT console before you call this operation.</p>
     * 
     * @param request AddCustomAuthPermissionRequest
     * @return AddCustomAuthPermissionResponse
     */
    public AddCustomAuthPermissionResponse addCustomAuthPermission(AddCustomAuthPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCustomAuthPermissionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account. If you want to increase the limit, join the DingTalk group 35228338 to contact ApsaraMQ for MQTT technical support.</p>
     * <ul>
     * <li>Each successful call to the <strong>ApplyToken</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Applies for a token from ApsaraMQ for MQTT. If token-based authentication is used for permission authentication on an ApsaraMQ for MQTT broker, a token that is issued by the broker is required for authentication each time a client is connected to the broker.</p>
     * 
     * @param request ApplyTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyTokenResponse
     */
    public ApplyTokenResponse applyTokenWithOptions(ApplyTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actions)) {
            query.put("Actions", request.actions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyToken"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account. If you want to increase the limit, join the DingTalk group 35228338 to contact ApsaraMQ for MQTT technical support.</p>
     * <ul>
     * <li>Each successful call to the <strong>ApplyToken</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Applies for a token from ApsaraMQ for MQTT. If token-based authentication is used for permission authentication on an ApsaraMQ for MQTT broker, a token that is issued by the broker is required for authentication each time a client is connected to the broker.</p>
     * 
     * @param request ApplyTokenRequest
     * @return ApplyTokenResponse
     */
    public ApplyTokenResponse applyToken(ApplyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyTokenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call the <strong>BatchQuerySessionByClientIds</strong> operation up to 100 times per second. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <ul>
     * <li>You can call the <strong>BatchQuerySessionByClientIds</strong> operation to query the status of up to 10 ApsaraMQ for MQTT clients in a single query.</li>
     * <li>Each successful call to the <strong>BatchQuerySessionByClientIds</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of multiple ApsaraMQ for MQTT clients by client ID.</p>
     * 
     * @param request BatchQuerySessionByClientIdsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchQuerySessionByClientIdsResponse
     */
    public BatchQuerySessionByClientIdsResponse batchQuerySessionByClientIdsWithOptions(BatchQuerySessionByClientIdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIdList)) {
            query.put("ClientIdList", request.clientIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchQuerySessionByClientIds"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchQuerySessionByClientIdsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call the <strong>BatchQuerySessionByClientIds</strong> operation up to 100 times per second. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <ul>
     * <li>You can call the <strong>BatchQuerySessionByClientIds</strong> operation to query the status of up to 10 ApsaraMQ for MQTT clients in a single query.</li>
     * <li>Each successful call to the <strong>BatchQuerySessionByClientIds</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of multiple ApsaraMQ for MQTT clients by client ID.</p>
     * 
     * @param request BatchQuerySessionByClientIdsRequest
     * @return BatchQuerySessionByClientIdsResponse
     */
    public BatchQuerySessionByClientIdsResponse batchQuerySessionByClientIds(BatchQuerySessionByClientIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchQuerySessionByClientIdsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关闭设备连接</p>
     * 
     * @param request CloseConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseConnectionResponse
     */
    public CloseConnectionResponse closeConnectionWithOptions(CloseConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseConnection"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseConnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>关闭设备连接</p>
     * 
     * @param request CloseConnectionRequest
     * @return CloseConnectionResponse
     */
    public CloseConnectionResponse closeConnection(CloseConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.closeConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Each successful call to the <strong>CreateGroupId</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a group ID. Before you connect producers and consumers to an ApsaraMQ for MQTT broker to send and receive messages, you must specify a unique ID for each client for identification. A client ID is in the format of \<GroupID>@@@\<DeviceID>. In the preceding format, DeviceID is the custom ID that you specify for the client, and GroupID is the ID of the group that you create on the ApsaraMQ for MQTT broker in advance.</p>
     * 
     * @param request CreateGroupIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGroupIdResponse
     */
    public CreateGroupIdResponse createGroupIdWithOptions(CreateGroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroupId"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGroupIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Each successful call to the <strong>CreateGroupId</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a group ID. Before you connect producers and consumers to an ApsaraMQ for MQTT broker to send and receive messages, you must specify a unique ID for each client for identification. A client ID is in the format of \<GroupID>@@@\<DeviceID>. In the preceding format, DeviceID is the custom ID that you specify for the client, and GroupID is the ID of the group that you create on the ApsaraMQ for MQTT broker in advance.</p>
     * 
     * @param request CreateGroupIdRequest
     * @return CreateGroupIdResponse
     */
    public CreateGroupIdResponse createGroupId(CreateGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGroupIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除CA证书</p>
     * 
     * @param request DeleteCaCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCaCertificateResponse
     */
    public DeleteCaCertificateResponse deleteCaCertificateWithOptions(DeleteCaCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mqttInstanceId)) {
            query.put("MqttInstanceId", request.mqttInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sn)) {
            query.put("Sn", request.sn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCaCertificate"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCaCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除CA证书</p>
     * 
     * @param request DeleteCaCertificateRequest
     * @return DeleteCaCertificateResponse
     */
    public DeleteCaCertificateResponse deleteCaCertificate(DeleteCaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义权限连接黑名单</p>
     * 
     * @param request DeleteCustomAuthConnectBlackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomAuthConnectBlackResponse
     */
    public DeleteCustomAuthConnectBlackResponse deleteCustomAuthConnectBlackWithOptions(DeleteCustomAuthConnectBlackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomAuthConnectBlack"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomAuthConnectBlackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义权限连接黑名单</p>
     * 
     * @param request DeleteCustomAuthConnectBlackRequest
     * @return DeleteCustomAuthConnectBlackResponse
     */
    public DeleteCustomAuthConnectBlackResponse deleteCustomAuthConnectBlack(DeleteCustomAuthConnectBlackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomAuthConnectBlackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an identity for custom authorization.</p>
     * 
     * @param request DeleteCustomAuthIdentityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomAuthIdentityResponse
     */
    public DeleteCustomAuthIdentityResponse deleteCustomAuthIdentityWithOptions(DeleteCustomAuthIdentityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            body.put("IdentityType", request.identityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomAuthIdentity"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomAuthIdentityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an identity for custom authorization.</p>
     * 
     * @param request DeleteCustomAuthIdentityRequest
     * @return DeleteCustomAuthIdentityResponse
     */
    public DeleteCustomAuthIdentityResponse deleteCustomAuthIdentity(DeleteCustomAuthIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomAuthIdentityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes permissions on a topic.</p>
     * 
     * @param request DeleteCustomAuthPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomAuthPermissionResponse
     */
    public DeleteCustomAuthPermissionResponse deleteCustomAuthPermissionWithOptions(DeleteCustomAuthPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identity)) {
            body.put("Identity", request.identity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            body.put("IdentityType", request.identityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            body.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomAuthPermission"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomAuthPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes permissions on a topic.</p>
     * 
     * @param request DeleteCustomAuthPermissionRequest
     * @return DeleteCustomAuthPermissionResponse
     */
    public DeleteCustomAuthPermissionResponse deleteCustomAuthPermission(DeleteCustomAuthPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomAuthPermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除设备证书</p>
     * 
     * @param request DeleteDeviceCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDeviceCertificateResponse
     */
    public DeleteDeviceCertificateResponse deleteDeviceCertificateWithOptions(DeleteDeviceCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caSn)) {
            query.put("CaSn", request.caSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceSn)) {
            query.put("DeviceSn", request.deviceSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mqttInstanceId)) {
            query.put("MqttInstanceId", request.mqttInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeviceCertificate"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除设备证书</p>
     * 
     * @param request DeleteDeviceCertificateRequest
     * @return DeleteDeviceCertificateResponse
     */
    public DeleteDeviceCertificateResponse deleteDeviceCertificate(DeleteDeviceCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeviceCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Each successful call to the <strong>DeleteGroupId</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a group from an ApsaraMQ for MQTT instance.</p>
     * 
     * @param request DeleteGroupIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGroupIdResponse
     */
    public DeleteGroupIdResponse deleteGroupIdWithOptions(DeleteGroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroupId"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGroupIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Each successful call to the <strong>DeleteGroupId</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a group from an ApsaraMQ for MQTT instance.</p>
     * 
     * @param request DeleteGroupIdRequest
     * @return DeleteGroupIdResponse
     */
    public DeleteGroupIdResponse deleteGroupId(DeleteGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGroupIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据SN返回CA证书</p>
     * 
     * @param request GetCaCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCaCertificateResponse
     */
    public GetCaCertificateResponse getCaCertificateWithOptions(GetCaCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCaCertificate"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCaCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据SN返回CA证书</p>
     * 
     * @param request GetCaCertificateRequest
     * @return GetCaCertificateResponse
     */
    public GetCaCertificateResponse getCaCertificate(GetCaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备证书</p>
     * 
     * @param request GetDeviceCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceCertificateResponse
     */
    public GetDeviceCertificateResponse getDeviceCertificateWithOptions(GetDeviceCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceCertificate"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备证书</p>
     * 
     * @param request GetDeviceCertificateRequest
     * @return GetDeviceCertificateResponse
     */
    public GetDeviceCertificateResponse getDeviceCertificate(GetDeviceCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <ul>
     * <li>Each successful call to the <strong>GetDeviceCredential</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the access credential of a device. If unique-certificate-per-device authentication is used as the authentication method on an ApsaraMQ for MQTT broker, an access credential that you apply for in advance is required for authentication when you connect your device to the broker. The connection can be established only after the authentication is passed.</p>
     * 
     * @param request GetDeviceCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceCredentialResponse
     */
    public GetDeviceCredentialResponse getDeviceCredentialWithOptions(GetDeviceCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceCredential"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <ul>
     * <li>Each successful call to the <strong>GetDeviceCredential</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the access credential of a device. If unique-certificate-per-device authentication is used as the authentication method on an ApsaraMQ for MQTT broker, an access credential that you apply for in advance is required for authentication when you connect your device to the broker. The connection can be established only after the authentication is passed.</p>
     * 
     * @param request GetDeviceCredentialRequest
     * @return GetDeviceCredentialResponse
     */
    public GetDeviceCredentialResponse getDeviceCredential(GetDeviceCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取添加CA证书的注册码</p>
     * 
     * @param request GetRegisterCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRegisterCodeResponse
     */
    public GetRegisterCodeResponse getRegisterCodeWithOptions(GetRegisterCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegisterCode"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegisterCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取添加CA证书的注册码</p>
     * 
     * @param request GetRegisterCodeRequest
     * @return GetRegisterCodeResponse
     */
    public GetRegisterCodeResponse getRegisterCode(GetRegisterCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRegisterCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>注销CA证书</p>
     * 
     * @param request InactivateCaCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InactivateCaCertificateResponse
     */
    public InactivateCaCertificateResponse inactivateCaCertificateWithOptions(InactivateCaCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mqttInstanceId)) {
            query.put("MqttInstanceId", request.mqttInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sn)) {
            query.put("Sn", request.sn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InactivateCaCertificate"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InactivateCaCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>注销CA证书</p>
     * 
     * @param request InactivateCaCertificateRequest
     * @return InactivateCaCertificateResponse
     */
    public InactivateCaCertificateResponse inactivateCaCertificate(InactivateCaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.inactivateCaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>注销设备证书</p>
     * 
     * @param request InactivateDeviceCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InactivateDeviceCertificateResponse
     */
    public InactivateDeviceCertificateResponse inactivateDeviceCertificateWithOptions(InactivateDeviceCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caSn)) {
            query.put("CaSn", request.caSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceSn)) {
            query.put("DeviceSn", request.deviceSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mqttInstanceId)) {
            query.put("MqttInstanceId", request.mqttInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InactivateDeviceCertificate"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InactivateDeviceCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>注销设备证书</p>
     * 
     * @param request InactivateDeviceCertificateRequest
     * @return InactivateDeviceCertificateResponse
     */
    public InactivateDeviceCertificateResponse inactivateDeviceCertificate(InactivateDeviceCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.inactivateDeviceCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据实例ID 分页获取CA证书</p>
     * 
     * @param request ListCaCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCaCertificateResponse
     */
    public ListCaCertificateResponse listCaCertificateWithOptions(ListCaCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCaCertificate"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCaCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据实例ID 分页获取CA证书</p>
     * 
     * @param request ListCaCertificateRequest
     * @return ListCaCertificateResponse
     */
    public ListCaCertificateResponse listCaCertificate(ListCaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备证书列表</p>
     * 
     * @param request ListDeviceCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeviceCertificateResponse
     */
    public ListDeviceCertificateResponse listDeviceCertificateWithOptions(ListDeviceCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceCertificate"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备证书列表</p>
     * 
     * @param request ListDeviceCertificateRequest
     * @return ListDeviceCertificateResponse
     */
    public ListDeviceCertificateResponse listDeviceCertificate(ListDeviceCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeviceCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备证书列表</p>
     * 
     * @param request ListDeviceCertificateByCaSnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeviceCertificateByCaSnResponse
     */
    public ListDeviceCertificateByCaSnResponse listDeviceCertificateByCaSnWithOptions(ListDeviceCertificateByCaSnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceCertificateByCaSn"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceCertificateByCaSnResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备证书列表</p>
     * 
     * @param request ListDeviceCertificateByCaSnRequest
     * @return ListDeviceCertificateByCaSnResponse
     */
    public ListDeviceCertificateByCaSnResponse listDeviceCertificateByCaSn(ListDeviceCertificateByCaSnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeviceCertificateByCaSnWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出注册的一机一密的设备ID</p>
     * 
     * @param request ListDeviceCredentialClientIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeviceCredentialClientIdResponse
     */
    public ListDeviceCredentialClientIdResponse listDeviceCredentialClientIdWithOptions(ListDeviceCredentialClientIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceCredentialClientId"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceCredentialClientIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出注册的一机一密的设备ID</p>
     * 
     * @param request ListDeviceCredentialClientIdRequest
     * @return ListDeviceCredentialClientIdResponse
     */
    public ListDeviceCredentialClientIdResponse listDeviceCredentialClientId(ListDeviceCredentialClientIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeviceCredentialClientIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Each successful call to the <strong>ListGroupId</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all groups on an ApsaraMQ for MQTT instance.</p>
     * 
     * @param request ListGroupIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupIdResponse
     */
    public ListGroupIdResponse listGroupIdWithOptions(ListGroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroupId"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Each successful call to the <strong>ListGroupId</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all groups on an ApsaraMQ for MQTT instance.</p>
     * 
     * @param request ListGroupIdRequest
     * @return ListGroupIdResponse
     */
    public ListGroupIdResponse listGroupId(ListGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGroupIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a client ID in a connection blacklist.</p>
     * 
     * @param request QueryCustomAuthConnectBlackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCustomAuthConnectBlackResponse
     */
    public QueryCustomAuthConnectBlackResponse queryCustomAuthConnectBlackWithOptions(QueryCustomAuthConnectBlackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCustomAuthConnectBlack"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCustomAuthConnectBlackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a client ID in a connection blacklist.</p>
     * 
     * @param request QueryCustomAuthConnectBlackRequest
     * @return QueryCustomAuthConnectBlackResponse
     */
    public QueryCustomAuthConnectBlackResponse queryCustomAuthConnectBlack(QueryCustomAuthConnectBlackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCustomAuthConnectBlackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about custom identity authentication.</p>
     * 
     * @param request QueryCustomAuthIdentityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCustomAuthIdentityResponse
     */
    public QueryCustomAuthIdentityResponse queryCustomAuthIdentityWithOptions(QueryCustomAuthIdentityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCustomAuthIdentity"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCustomAuthIdentityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about custom identity authentication.</p>
     * 
     * @param request QueryCustomAuthIdentityRequest
     * @return QueryCustomAuthIdentityResponse
     */
    public QueryCustomAuthIdentityResponse queryCustomAuthIdentity(QueryCustomAuthIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCustomAuthIdentityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the authorization information about a topic.</p>
     * 
     * @param request QueryCustomAuthPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCustomAuthPermissionResponse
     */
    public QueryCustomAuthPermissionResponse queryCustomAuthPermissionWithOptions(QueryCustomAuthPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCustomAuthPermission"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCustomAuthPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the authorization information about a topic.</p>
     * 
     * @param request QueryCustomAuthPermissionRequest
     * @return QueryCustomAuthPermissionResponse
     */
    public QueryCustomAuthPermissionResponse queryCustomAuthPermission(QueryCustomAuthPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCustomAuthPermissionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Each successful call to the <strong>QueryMqttTraceDevice</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the trace of a device that corresponds to an ApsaraMQ for MQTT client by page. When the status of a device is abnormal, you can call this operation to query the connection history of the device. This helps you efficiently troubleshoot issues.</p>
     * 
     * @param request QueryMqttTraceDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMqttTraceDeviceResponse
     */
    public QueryMqttTraceDeviceResponse queryMqttTraceDeviceWithOptions(QueryMqttTraceDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mqttRegionId)) {
            query.put("MqttRegionId", request.mqttRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverse)) {
            query.put("Reverse", request.reverse);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMqttTraceDevice"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMqttTraceDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Each successful call to the <strong>QueryMqttTraceDevice</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the trace of a device that corresponds to an ApsaraMQ for MQTT client by page. When the status of a device is abnormal, you can call this operation to query the connection history of the device. This helps you efficiently troubleshoot issues.</p>
     * 
     * @param request QueryMqttTraceDeviceRequest
     * @return QueryMqttTraceDeviceResponse
     */
    public QueryMqttTraceDeviceResponse queryMqttTraceDevice(QueryMqttTraceDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMqttTraceDeviceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Each successful call to the <strong>QueryMqttTraceMessageOfClient</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries messages on a device within a specific period of time. If a message is not sent or received as expected, you can call this operation to query the messaging status of the message to efficiently troubleshoot issues.</p>
     * 
     * @param request QueryMqttTraceMessageOfClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMqttTraceMessageOfClientResponse
     */
    public QueryMqttTraceMessageOfClientResponse queryMqttTraceMessageOfClientWithOptions(QueryMqttTraceMessageOfClientRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mqttRegionId)) {
            query.put("MqttRegionId", request.mqttRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverse)) {
            query.put("Reverse", request.reverse);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMqttTraceMessageOfClient"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMqttTraceMessageOfClientResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Each successful call to the <strong>QueryMqttTraceMessageOfClient</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries messages on a device within a specific period of time. If a message is not sent or received as expected, you can call this operation to query the messaging status of the message to efficiently troubleshoot issues.</p>
     * 
     * @param request QueryMqttTraceMessageOfClientRequest
     * @return QueryMqttTraceMessageOfClientResponse
     */
    public QueryMqttTraceMessageOfClientResponse queryMqttTraceMessageOfClient(QueryMqttTraceMessageOfClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMqttTraceMessageOfClientWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Each successful call to the <strong>QueryMqttTraceMessagePublish</strong> operation increases the messaging transactions per second (TPS). This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the trace of a message. If a message is not sent or received as expected, you can call this operation to view the message details to troubleshoot the issue. For example, you can query the time when the message is published and the client that publishes the message.</p>
     * 
     * @param request QueryMqttTraceMessagePublishRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMqttTraceMessagePublishResponse
     */
    public QueryMqttTraceMessagePublishResponse queryMqttTraceMessagePublishWithOptions(QueryMqttTraceMessagePublishRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mqttRegionId)) {
            query.put("MqttRegionId", request.mqttRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            query.put("MsgId", request.msgId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMqttTraceMessagePublish"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMqttTraceMessagePublishResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Each successful call to the <strong>QueryMqttTraceMessagePublish</strong> operation increases the messaging transactions per second (TPS). This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the trace of a message. If a message is not sent or received as expected, you can call this operation to view the message details to troubleshoot the issue. For example, you can query the time when the message is published and the client that publishes the message.</p>
     * 
     * @param request QueryMqttTraceMessagePublishRequest
     * @return QueryMqttTraceMessagePublishResponse
     */
    public QueryMqttTraceMessagePublishResponse queryMqttTraceMessagePublish(QueryMqttTraceMessagePublishRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMqttTraceMessagePublishWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Each successful call to the <strong>QueryMqttTraceMessageSubscribe</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the delivery trace of a message. If a message is not sent or received as expected, you can call this operation to view the details about the message. For example, you can query the clients that subscribe to the message and the time when the message is delivered. This operation helps you locate the problem and identify the cause of the problem.</p>
     * 
     * @param request QueryMqttTraceMessageSubscribeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMqttTraceMessageSubscribeResponse
     */
    public QueryMqttTraceMessageSubscribeResponse queryMqttTraceMessageSubscribeWithOptions(QueryMqttTraceMessageSubscribeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mqttRegionId)) {
            query.put("MqttRegionId", request.mqttRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            query.put("MsgId", request.msgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverse)) {
            query.put("Reverse", request.reverse);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMqttTraceMessageSubscribe"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMqttTraceMessageSubscribeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Each successful call to the <strong>QueryMqttTraceMessageSubscribe</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the delivery trace of a message. If a message is not sent or received as expected, you can call this operation to view the details about the message. For example, you can query the clients that subscribe to the message and the time when the message is delivered. This operation helps you locate the problem and identify the cause of the problem.</p>
     * 
     * @param request QueryMqttTraceMessageSubscribeRequest
     * @return QueryMqttTraceMessageSubscribeResponse
     */
    public QueryMqttTraceMessageSubscribeResponse queryMqttTraceMessageSubscribe(QueryMqttTraceMessageSubscribeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMqttTraceMessageSubscribeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 500 times per second.**** For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <ul>
     * <li>Each successful call to the <strong>QuerySessionByClientId</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the running status of an ApsaraMQ for MQTT client. You can troubleshoot issues based on the queried results. You can enter the ID of an ApsaraMQ for MQTT client to check the connection status and IP address of the device.</p>
     * 
     * @param request QuerySessionByClientIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySessionByClientIdResponse
     */
    public QuerySessionByClientIdResponse querySessionByClientIdWithOptions(QuerySessionByClientIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySessionByClientId"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySessionByClientIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 500 times per second.**** For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <ul>
     * <li>Each successful call to the <strong>QuerySessionByClientId</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the running status of an ApsaraMQ for MQTT client. You can troubleshoot issues based on the queried results. You can enter the ID of an ApsaraMQ for MQTT client to check the connection status and IP address of the device.</p>
     * 
     * @param request QuerySessionByClientIdRequest
     * @return QuerySessionByClientIdResponse
     */
    public QuerySessionByClientIdResponse querySessionByClientId(QuerySessionByClientIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySessionByClientIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account. If you want to increase the limit, join the DingTalk group 35228338 to contact ApsaraMQ for MQTT technical support.</p>
     * <ul>
     * <li>Each successful call to the <strong>QueryToken</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a token. If token-based authentication is used for permission authentication on an ApsaraMQ for MQTT broker, a token that is issued by the broker is required for authentication each time a client is connected to the broker. A token is a temporary credential and is valid only within a specific period of time. You can call this operation to query whether a token expires.</p>
     * 
     * @param request QueryTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTokenResponse
     */
    public QueryTokenResponse queryTokenWithOptions(QueryTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryToken"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account. If you want to increase the limit, join the DingTalk group 35228338 to contact ApsaraMQ for MQTT technical support.</p>
     * <ul>
     * <li>Each successful call to the <strong>QueryToken</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a token. If token-based authentication is used for permission authentication on an ApsaraMQ for MQTT broker, a token that is issued by the broker is required for authentication each time a client is connected to the broker. A token is a temporary credential and is valid only within a specific period of time. You can call this operation to query whether a token expires.</p>
     * 
     * @param request QueryTokenRequest
     * @return QueryTokenResponse
     */
    public QueryTokenResponse queryToken(QueryTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTokenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Limits</h2>
     * <p>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <blockquote>
     * <p> Each successful call to the <strong>RefreshDeviceCredential</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the access credential of a device.</p>
     * 
     * @param request RefreshDeviceCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshDeviceCredentialResponse
     */
    public RefreshDeviceCredentialResponse refreshDeviceCredentialWithOptions(RefreshDeviceCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshDeviceCredential"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshDeviceCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Limits</h2>
     * <p>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <blockquote>
     * <p> Each successful call to the <strong>RefreshDeviceCredential</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the access credential of a device.</p>
     * 
     * @param request RefreshDeviceCredentialRequest
     * @return RefreshDeviceCredentialResponse
     */
    public RefreshDeviceCredentialResponse refreshDeviceCredential(RefreshDeviceCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshDeviceCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>注册CA证书</p>
     * 
     * @param request RegisterCaCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterCaCertificateResponse
     */
    public RegisterCaCertificateResponse registerCaCertificateWithOptions(RegisterCaCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caContent)) {
            query.put("CaContent", request.caContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caName)) {
            query.put("CaName", request.caName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mqttInstanceId)) {
            query.put("MqttInstanceId", request.mqttInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verificationContent)) {
            query.put("VerificationContent", request.verificationContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterCaCertificate"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterCaCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>注册CA证书</p>
     * 
     * @param request RegisterCaCertificateRequest
     * @return RegisterCaCertificateResponse
     */
    public RegisterCaCertificateResponse registerCaCertificate(RegisterCaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerCaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <ul>
     * <li>Each successful call to the <strong>RegisterDeviceCredential</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Registers an access credential for a device. In unique-certificate-per-device authentication mode, an application server applies a unique access credential for each device from the corresponding ApsaraMQ for MQTT broker. The access credential of a device consists of the client ID, AccessKey ID, and AccessKey secret of the device. When you connect a device to ApsaraMQ for MQTT, you must configure Username and Password based on the access credential of the device for authentication. You can activate the device and transfer data between the device and ApsaraMQ for MQTT only after the authentication is passed.</p>
     * 
     * @param request RegisterDeviceCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterDeviceCredentialResponse
     */
    public RegisterDeviceCredentialResponse registerDeviceCredentialWithOptions(RegisterDeviceCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterDeviceCredential"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterDeviceCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <ul>
     * <li>Each successful call to the <strong>RegisterDeviceCredential</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Registers an access credential for a device. In unique-certificate-per-device authentication mode, an application server applies a unique access credential for each device from the corresponding ApsaraMQ for MQTT broker. The access credential of a device consists of the client ID, AccessKey ID, and AccessKey secret of the device. When you connect a device to ApsaraMQ for MQTT, you must configure Username and Password based on the access credential of the device for authentication. You can activate the device and transfer data between the device and ApsaraMQ for MQTT only after the authentication is passed.</p>
     * 
     * @param request RegisterDeviceCredentialRequest
     * @return RegisterDeviceCredentialResponse
     */
    public RegisterDeviceCredentialResponse registerDeviceCredential(RegisterDeviceCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerDeviceCredentialWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 5 times per second per account. If you want to increase the limit, join the DingTalk group 35228338 to contact ApsaraMQ for MQTT technical support.</p>
     * <ul>
     * <li>Each successful call to the <strong>RevokeToken</strong> operation increases the messaging transactions per second (TPS). This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Revokes a token.</p>
     * 
     * @param request RevokeTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeTokenResponse
     */
    public RevokeTokenResponse revokeTokenWithOptions(RevokeTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeToken"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 5 times per second per account. If you want to increase the limit, join the DingTalk group 35228338 to contact ApsaraMQ for MQTT technical support.</p>
     * <ul>
     * <li>Each successful call to the <strong>RevokeToken</strong> operation increases the messaging transactions per second (TPS). This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Revokes a token.</p>
     * 
     * @param request RevokeTokenRequest
     * @return RevokeTokenResponse
     */
    public RevokeTokenResponse revokeToken(RevokeTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeTokenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The <strong>SendMessage</strong> operation is called by applications on cloud servers. It is complementary to the operation that is called by ApsaraMQ for MQTT clients to send messages. For information about the differences between the scenarios of sending messages from applications on cloud servers and the scenarios of sending messages from ApsaraMQ for MQTT clients, see <a href="https://help.aliyun.com/document_detail/179160.html">Developer guide</a>.</p>
     * <ul>
     * <li>Before you call the <strong>SendMessage</strong> operation, make sure that the kernel version of your ApsaraMQ for MQTT instance is 3.3.0 or later. You can obtain the information about the kernel version on the <a href="https://mqtt.console.aliyun.com">Instance Details</a> page that corresponds to the instance in the <strong>ApsaraMQ for MQTT console</strong>.</li>
     * <li>Messages that are sent by calling the <strong>SendMessage</strong> operation cannot be forwarded to ApsaraMQ for RocketMQ. If you want to use an ApsaraMQ for MQTT to forward messages to ApsaraMQ for RocketMQ, send the messages by using an SDK. For more information, see <a href="https://help.aliyun.com/document_detail/174527.html">Export data from ApsaraMQ for MQTT to other Alibaba Cloud services</a>. You can call the <strong>SendMessage</strong> operation up to 1,000 times per second. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
     * <li>Each successful call to the <strong>SendMessage</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For information about the billing details, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends a single message from an application on a cloud server to ApsaraMQ for MQTT.</p>
     * 
     * @param request SendMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendMessageResponse
     */
    public SendMessageResponse sendMessageWithOptions(SendMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mqttTopic)) {
            query.put("MqttTopic", request.mqttTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payload)) {
            query.put("Payload", request.payload);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendMessage"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendMessageResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The <strong>SendMessage</strong> operation is called by applications on cloud servers. It is complementary to the operation that is called by ApsaraMQ for MQTT clients to send messages. For information about the differences between the scenarios of sending messages from applications on cloud servers and the scenarios of sending messages from ApsaraMQ for MQTT clients, see <a href="https://help.aliyun.com/document_detail/179160.html">Developer guide</a>.</p>
     * <ul>
     * <li>Before you call the <strong>SendMessage</strong> operation, make sure that the kernel version of your ApsaraMQ for MQTT instance is 3.3.0 or later. You can obtain the information about the kernel version on the <a href="https://mqtt.console.aliyun.com">Instance Details</a> page that corresponds to the instance in the <strong>ApsaraMQ for MQTT console</strong>.</li>
     * <li>Messages that are sent by calling the <strong>SendMessage</strong> operation cannot be forwarded to ApsaraMQ for RocketMQ. If you want to use an ApsaraMQ for MQTT to forward messages to ApsaraMQ for RocketMQ, send the messages by using an SDK. For more information, see <a href="https://help.aliyun.com/document_detail/174527.html">Export data from ApsaraMQ for MQTT to other Alibaba Cloud services</a>. You can call the <strong>SendMessage</strong> operation up to 1,000 times per second. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
     * <li>Each successful call to the <strong>SendMessage</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For information about the billing details, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends a single message from an application on a cloud server to ApsaraMQ for MQTT.</p>
     * 
     * @param request SendMessageRequest
     * @return SendMessageResponse
     */
    public SendMessageResponse sendMessage(SendMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendMessageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <ul>
     * <li>Each successful call to the <strong>UnRegisterDeviceCredential</strong> operation increases the number of transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deregisters the access credential of a device. After the access credential of a device is deregistered, you can no longer use the access credential to authenticate the device on the ApsaraMQ for MQTT broker.</p>
     * 
     * @param request UnRegisterDeviceCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnRegisterDeviceCredentialResponse
     */
    public UnRegisterDeviceCredentialResponse unRegisterDeviceCredentialWithOptions(UnRegisterDeviceCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnRegisterDeviceCredential"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnRegisterDeviceCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <ul>
     * <li>Each successful call to the <strong>UnRegisterDeviceCredential</strong> operation increases the number of transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deregisters the access credential of a device. After the access credential of a device is deregistered, you can no longer use the access credential to authenticate the device on the ApsaraMQ for MQTT broker.</p>
     * 
     * @param request UnRegisterDeviceCredentialRequest
     * @return UnRegisterDeviceCredentialResponse
     */
    public UnRegisterDeviceCredentialResponse unRegisterDeviceCredential(UnRegisterDeviceCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unRegisterDeviceCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about custom identity authentication.</p>
     * 
     * @param request UpdateCustomAuthIdentityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomAuthIdentityResponse
     */
    public UpdateCustomAuthIdentityResponse updateCustomAuthIdentityWithOptions(UpdateCustomAuthIdentityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            body.put("IdentityType", request.identityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secret)) {
            body.put("Secret", request.secret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signMode)) {
            body.put("SignMode", request.signMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomAuthIdentity"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomAuthIdentityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about custom identity authentication.</p>
     * 
     * @param request UpdateCustomAuthIdentityRequest
     * @return UpdateCustomAuthIdentityResponse
     */
    public UpdateCustomAuthIdentityResponse updateCustomAuthIdentity(UpdateCustomAuthIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomAuthIdentityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新自定义权限授权</p>
     * 
     * @param request UpdateCustomAuthPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomAuthPermissionResponse
     */
    public UpdateCustomAuthPermissionResponse updateCustomAuthPermissionWithOptions(UpdateCustomAuthPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.effect)) {
            body.put("Effect", request.effect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identity)) {
            body.put("Identity", request.identity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            body.put("IdentityType", request.identityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permitAction)) {
            body.put("PermitAction", request.permitAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            body.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomAuthPermission"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomAuthPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新自定义权限授权</p>
     * 
     * @param request UpdateCustomAuthPermissionRequest
     * @return UpdateCustomAuthPermissionResponse
     */
    public UpdateCustomAuthPermissionResponse updateCustomAuthPermission(UpdateCustomAuthPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomAuthPermissionWithOptions(request, runtime);
    }
}

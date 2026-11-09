// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420;

import com.aliyun.tea.*;
import com.aliyun.onsmqtt20200420.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "OnsMqtt";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
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
     * <b>description</b> :
     * <ul>
     * <li>Only Platinum&lt;props=&quot;china&quot;&gt; and Professional instances support the ActiveCaCertificate operation.</li>
     * <li>The request frequency limit for a single user is 500 requests per second. For special requirements, contact ApsaraMQ for MQTT technical support. DingTalk group ID: 35228338.</li>
     * <li>The ActiveCaCertificate operation only supports CA certificates that are registered on the ApsaraMQ for MQTT server. You can invoke the <a href="https://help.aliyun.com/document_detail/2604958.html">ListCaCertificate</a> operation to query the registered CA certificates under a specified instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>ApsaraMQ for MQTT supports X.509 certificate authentication, which allows clients to authenticate by using device certificates. A CA certificate is used to issue device certificates for clients and verify the validity of the device certificates. A CA certificate must be active to be used. By default, a CA certificate is active after registration. If a CA certificate is changed to the inactive state, you can invoke this operation to reactivate it.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Only Platinum&lt;props=&quot;china&quot;&gt; and Professional instances support the ActiveCaCertificate operation.</li>
     * <li>The request frequency limit for a single user is 500 requests per second. For special requirements, contact ApsaraMQ for MQTT technical support. DingTalk group ID: 35228338.</li>
     * <li>The ActiveCaCertificate operation only supports CA certificates that are registered on the ApsaraMQ for MQTT server. You can invoke the <a href="https://help.aliyun.com/document_detail/2604958.html">ListCaCertificate</a> operation to query the registered CA certificates under a specified instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>ApsaraMQ for MQTT supports X.509 certificate authentication, which allows clients to authenticate by using device certificates. A CA certificate is used to issue device certificates for clients and verify the validity of the device certificates. A CA certificate must be active to be used. By default, a CA certificate is active after registration. If a CA certificate is changed to the inactive state, you can invoke this operation to reactivate it.</p>
     * 
     * @param request ActiveCaCertificateRequest
     * @return ActiveCaCertificateResponse
     */
    public ActiveCaCertificateResponse activeCaCertificate(ActiveCaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activeCaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Platinum&lt;props=&quot;china&quot;&gt; and Professional edition instances support the ActiveDeviceCertificate operation.</li>
     * <li>The request frequency limit for a single user is 500 calls per second. If you have special requirements, contact the technical support team of MSMQ for MQTT. DingTalk group ID: 35228338.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates a device certificate. A device certificate is a digital certificate issued by a CA root certificate to a client device for security authentication when the client connects to the server. When a client device uses a device certificate for access authentication, the server verifies the device certificate based on the registered CA certificate. If the CA certificate and the device certificate match, the client authentication succeeds, and the system automatically registers the device certificate on the server. By default, a device certificate is in the activated state after it is registered on the server. If a device certificate that you want to use is deactivated, you can call this operation to reactivate it.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Only Platinum&lt;props=&quot;china&quot;&gt; and Professional edition instances support the ActiveDeviceCertificate operation.</li>
     * <li>The request frequency limit for a single user is 500 calls per second. If you have special requirements, contact the technical support team of MSMQ for MQTT. DingTalk group ID: 35228338.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates a device certificate. A device certificate is a digital certificate issued by a CA root certificate to a client device for security authentication when the client connects to the server. When a client device uses a device certificate for access authentication, the server verifies the device certificate based on the registered CA certificate. If the CA certificate and the device certificate match, the client authentication succeeds, and the system automatically registers the device certificate on the server. By default, a device certificate is in the activated state after it is registered on the server. If a device certificate that you want to use is deactivated, you can call this operation to reactivate it.</p>
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
     * <p>Adds a connection blacklist to disable connections from a specific device.</p>
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
     * <p>Adds a connection blacklist to disable connections from a specific device.</p>
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
     * <p>Adds account authentication information, which can be specified at the client level.</p>
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
     * <p>Adds account authentication information, which can be specified at the client level.</p>
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
     * <p>Adds authorization information for a topic resource. A first-level topic must be created in the console in advance.</p>
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
     * <p>Adds authorization information for a topic resource. A first-level topic must be created in the console in advance.</p>
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
     * <ul>
     * <li>The request frequency limit for a single user is 100 calls per second. If you have special requirements, contact the technical support team of ApsaraMQ for MQTT. DingTalk group ID: 35228338.</li>
     * <li>Each time you successfully call the <strong>ApplyToken</strong> API operation, it is counted as one message TPS, which affects your billing. For billing details, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing overview</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>When token-based authentication is used, the ApsaraMQ for MQTT broker issues a token (temporary credential) to the client, and the client must include the token when accessing the ApsaraMQ for MQTT broker to authenticate permissions. This API operation is used to apply for a temporary token from ApsaraMQ for MQTT.</p>
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
     * <ul>
     * <li>The request frequency limit for a single user is 100 calls per second. If you have special requirements, contact the technical support team of ApsaraMQ for MQTT. DingTalk group ID: 35228338.</li>
     * <li>Each time you successfully call the <strong>ApplyToken</strong> API operation, it is counted as one message TPS, which affects your billing. For billing details, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing overview</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>When token-based authentication is used, the ApsaraMQ for MQTT broker issues a token (temporary credential) to the client, and the client must include the token when accessing the ApsaraMQ for MQTT broker to authenticate permissions. This API operation is used to apply for a temporary token from ApsaraMQ for MQTT.</p>
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
     * <ul>
     * <li>The QPS limit for the <strong>BatchQuerySessionByClientIds</strong> operation is 100. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">QPS limits</a>.</li>
     * <li>You can query the online status of up to 10 client IDs each time you call the <strong>BatchQuerySessionByClientIds</strong> operation.</li>
     * <li>Each successful call to the <strong>BatchQuerySessionByClientIds</strong> operation is counted as one message TPS, which affects your billing. For billing details, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing</a>.</li>
     * <li>Considering the performance impact, the <strong>BatchQuerySessionByClientIds</strong> operation uses an internal cache for queries, which may result in data inconsistency. For exact queries, use the <a href="https://help.aliyun.com/document_detail/2603924.html">QuerySessionByClientId</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the online status of clients in batches by client ID.</p>
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
     * <ul>
     * <li>The QPS limit for the <strong>BatchQuerySessionByClientIds</strong> operation is 100. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">QPS limits</a>.</li>
     * <li>You can query the online status of up to 10 client IDs each time you call the <strong>BatchQuerySessionByClientIds</strong> operation.</li>
     * <li>Each successful call to the <strong>BatchQuerySessionByClientIds</strong> operation is counted as one message TPS, which affects your billing. For billing details, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing</a>.</li>
     * <li>Considering the performance impact, the <strong>BatchQuerySessionByClientIds</strong> operation uses an internal cache for queries, which may result in data inconsistency. For exact queries, use the <a href="https://help.aliyun.com/document_detail/2603924.html">QuerySessionByClientId</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the online status of clients in batches by client ID.</p>
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
     * <p>Closes an active connection. However, the device may reconnect depending on the client reconnection mechanism.</p>
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
     * <p>Closes an active connection. However, the device may reconnect depending on the client reconnection mechanism.</p>
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
     * <p>Each successful call to the <strong>CreateGroupId</strong> operation is counted as one message TPS, which affects your billing. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>When message producers and consumers connect to the ApsaraMQ for MQTT server to send and receive messages, they must specify a client ID as the unique identity of a client. A client ID consists of two parts in the <GroupID>@@@<DeviceID> format. The DeviceID is defined by the client, and the GroupID must be created in advance in the ApsaraMQ for MQTT server.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
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
     * <p>Each successful call to the <strong>CreateGroupId</strong> operation is counted as one message TPS, which affects your billing. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>When message producers and consumers connect to the ApsaraMQ for MQTT server to send and receive messages, they must specify a client ID as the unique identity of a client. A client ID consists of two parts in the <GroupID>@@@<DeviceID> format. The DeviceID is defined by the client, and the GroupID must be created in advance in the ApsaraMQ for MQTT server.</p>
     * 
     * @param request CreateGroupIdRequest
     * @return CreateGroupIdResponse
     */
    public CreateGroupIdResponse createGroupId(CreateGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGroupIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Platinum&lt;props=&quot;china&quot;&gt; and Professional instances support the DeleteCaCertificate operation.</li>
     * <li>The request frequency limit for a single user is 500 requests per second. For special requirements, contact ApsaraMQ for MQTT technical support. DingTalk group ID: 35228338.</li>
     * <li>The DeleteCaCertificate operation only supports CA certificates that are already registered with the ApsaraMQ for MQTT server. You can invoke the <a href="https://help.aliyun.com/document_detail/2604958.html">ListCaCertificate</a> operation to query registered CA certificates under a specific instance.</li>
     * <li>When you delete a specified CA certificate, all device certificates issued by this CA certificate and registered with the ApsaraMQ for MQTT server are also automatically deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>ApsaraMQ for MQTT supports X.509 certificate authentication, allowing clients to use device certificates for access authentication. CA certificates are used to issue device certificates for clients and verify the validity of device certificates. Before you use a CA certificate, you must register it with the ApsaraMQ for MQTT server. If you no longer need a CA certificate, you can invoke the DeleteCaCertificate operation to delete it from the server records.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Only Platinum&lt;props=&quot;china&quot;&gt; and Professional instances support the DeleteCaCertificate operation.</li>
     * <li>The request frequency limit for a single user is 500 requests per second. For special requirements, contact ApsaraMQ for MQTT technical support. DingTalk group ID: 35228338.</li>
     * <li>The DeleteCaCertificate operation only supports CA certificates that are already registered with the ApsaraMQ for MQTT server. You can invoke the <a href="https://help.aliyun.com/document_detail/2604958.html">ListCaCertificate</a> operation to query registered CA certificates under a specific instance.</li>
     * <li>When you delete a specified CA certificate, all device certificates issued by this CA certificate and registered with the ApsaraMQ for MQTT server are also automatically deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>ApsaraMQ for MQTT supports X.509 certificate authentication, allowing clients to use device certificates for access authentication. CA certificates are used to issue device certificates for clients and verify the validity of device certificates. Before you use a CA certificate, you must register it with the ApsaraMQ for MQTT server. If you no longer need a CA certificate, you can invoke the DeleteCaCertificate operation to delete it from the server records.</p>
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
     * <p>Deletes a connection blacklist.</p>
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
     * <p>Deletes a connection blacklist.</p>
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
     * <p>Deletes custom authentication.</p>
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
     * <p>Deletes custom authentication.</p>
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
     * <p>Deletes topic authorization.</p>
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
     * <p>Deletes topic authorization.</p>
     * 
     * @param request DeleteCustomAuthPermissionRequest
     * @return DeleteCustomAuthPermissionResponse
     */
    public DeleteCustomAuthPermissionResponse deleteCustomAuthPermission(DeleteCustomAuthPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomAuthPermissionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Platinum&lt;props=&quot;china&quot;&gt; and Professional edition instances support the DeleteDeviceCertificate operation.</li>
     * <li>The request frequency limit for a single user is 500 calls per second. If you have special requirements, contact the technical support team of ApsaraMQ for MQTT. DingTalk group ID: 35228338.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the registration information of a specified device certificate from the server storage. A device certificate is a digital certificate issued by a certification authority (CA) root certificate to a client device. It is used for security authentication when the client connects to the server. After authentication, the server and the client can communicate securely by using the encryption key in the certificate. If the authentication fails, the server rejects the client connection.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Only Platinum&lt;props=&quot;china&quot;&gt; and Professional edition instances support the DeleteDeviceCertificate operation.</li>
     * <li>The request frequency limit for a single user is 500 calls per second. If you have special requirements, contact the technical support team of ApsaraMQ for MQTT. DingTalk group ID: 35228338.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the registration information of a specified device certificate from the server storage. A device certificate is a digital certificate issued by a certification authority (CA) root certificate to a client device. It is used for security authentication when the client connects to the server. After authentication, the server and the client can communicate securely by using the encryption key in the certificate. If the authentication fails, the server rejects the client connection.</p>
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
     * <p>Each successful call to the <strong>DeleteGroupId</strong> operation is counted as one message TPS, which affects your billing. For more information about billing, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a group ID.</p>
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
     * <p>Each successful call to the <strong>DeleteGroupId</strong> operation is counted as one message TPS, which affects your billing. For more information about billing, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a group ID.</p>
     * 
     * @param request DeleteGroupIdRequest
     * @return DeleteGroupIdResponse
     */
    public DeleteGroupIdResponse deleteGroupId(DeleteGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGroupIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Each successful call to the <strong>DeleteTopic</strong> operation counts as one message TPS, which affects your billing. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing overview</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes wildcard subscriptions in batches.</p>
     * 
     * @param request DeleteWildcardByTopicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWildcardByTopicResponse
     */
    public DeleteWildcardByTopicResponse deleteWildcardByTopicWithOptions(DeleteWildcardByTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firstTopic)) {
            query.put("FirstTopic", request.firstTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wildcards)) {
            query.put("Wildcards", request.wildcards);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWildcardByTopic"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWildcardByTopicResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Each successful call to the <strong>DeleteTopic</strong> operation counts as one message TPS, which affects your billing. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing overview</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes wildcard subscriptions in batches.</p>
     * 
     * @param request DeleteWildcardByTopicRequest
     * @return DeleteWildcardByTopicResponse
     */
    public DeleteWildcardByTopicResponse deleteWildcardByTopic(DeleteWildcardByTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWildcardByTopicWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Downgrades the public VIP access of a specific instance for multi-instance disaster recovery. This operation is supported only for Platinum instances and requires you to submit a ticket.</p>
     * 
     * @param request DisasterDowngradeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisasterDowngradeResponse
     */
    public DisasterDowngradeResponse disasterDowngradeWithOptions(DisasterDowngradeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.downgradeInstanceId)) {
            body.put("DowngradeInstanceId", request.downgradeInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisasterDowngrade"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisasterDowngradeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Downgrades the public VIP access of a specific instance for multi-instance disaster recovery. This operation is supported only for Platinum instances and requires you to submit a ticket.</p>
     * 
     * @param request DisasterDowngradeRequest
     * @return DisasterDowngradeResponse
     */
    public DisasterDowngradeResponse disasterDowngrade(DisasterDowngradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disasterDowngradeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restores Internet access for an instance using its virtual IP address (VIP) for graceful recovery in a multi-instance disaster recovery architecture. This operation is available only for Platinum Edition instances. To use this operation, submit a ticket.</p>
     * 
     * @param request DisasterRecoveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisasterRecoveryResponse
     */
    public DisasterRecoveryResponse disasterRecoveryWithOptions(DisasterRecoveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInstanceId)) {
            body.put("RecoveryInstanceId", request.recoveryInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisasterRecovery"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisasterRecoveryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restores Internet access for an instance using its virtual IP address (VIP) for graceful recovery in a multi-instance disaster recovery architecture. This operation is available only for Platinum Edition instances. To use this operation, submit a ticket.</p>
     * 
     * @param request DisasterRecoveryRequest
     * @return DisasterRecoveryResponse
     */
    public DisasterRecoveryResponse disasterRecovery(DisasterRecoveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disasterRecoveryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a certificate authority (CA) certificate, such as the content and status of the certificate. ApsaraMQ for MQTT allows you to use X.509 certificates for authentication. When you connect an ApsaraMQ for MQTT client to an ApsaraMQ for MQTT broker, you can use the device certificate to implement authentication. CA certificates are used to issue device certificates to clients and validate the device certificates.</p>
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
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a certificate authority (CA) certificate, such as the content and status of the certificate. ApsaraMQ for MQTT allows you to use X.509 certificates for authentication. When you connect an ApsaraMQ for MQTT client to an ApsaraMQ for MQTT broker, you can use the device certificate to implement authentication. CA certificates are used to issue device certificates to clients and validate the device certificates.</p>
     * 
     * @param request GetCaCertificateRequest
     * @return GetCaCertificateResponse
     */
    public GetCaCertificateResponse getCaCertificate(GetCaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a device certificate. Device certificates are digital certificates issued to clients by certificate authority (CA) root certificates. When you connect an ApsaraMQ for MQTT client to an ApsaraMQ for MQTT broker, the broker uses the device certificate to authenticate the client. If the client passes the authentication, the client and the broker can communicate with each other based on the encrypted private key in the device certificate. If the client fails the authentication, access requests from the client are denied by the client.</p>
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
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a device certificate. Device certificates are digital certificates issued to clients by certificate authority (CA) root certificates. When you connect an ApsaraMQ for MQTT client to an ApsaraMQ for MQTT broker, the broker uses the device certificate to authenticate the client. If the client passes the authentication, the client and the broker can communicate with each other based on the encrypted private key in the device certificate. If the client fails the authentication, access requests from the client are denied by the client.</p>
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
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
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
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
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
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the registration code of a specific certificate authority (CA) certificate. When you register a CA certificate with an ApsaraMQ for MQTT broker, you must upload the validation certificate of the CA certificate to verify whether you have the private key of the CA certificate. The validation certificate of a CA certificate must be generated by using the registration code of the CA certificate.</p>
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
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the registration code of a specific certificate authority (CA) certificate. When you register a CA certificate with an ApsaraMQ for MQTT broker, you must upload the validation certificate of the CA certificate to verify whether you have the private key of the CA certificate. The validation certificate of a CA certificate must be generated by using the registration code of the CA certificate.</p>
     * 
     * @param request GetRegisterCodeRequest
     * @return GetRegisterCodeResponse
     */
    public GetRegisterCodeResponse getRegisterCode(GetRegisterCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRegisterCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Platinum Edition&lt;props=&quot;china&quot;&gt; and Professional Edition instances support the InactivateCaCertificate operation.</li>
     * <li>The request rate for a single user is limited to 500 per second. If you have special requirements, contact ApsaraMQ for MQTT technical support. The DingTalk group number is 35228338.</li>
     * <li>You can call this operation only for CA certificates that are registered with ApsaraMQ for MQTT. To query the registered CA certificates for an instance, call the <a href="https://help.aliyun.com/document_detail/2604958.html">ListCaCertificate</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>ApsaraMQ for MQTT supports X.509 certificate-based device verification. Clients use device certificates for connection authentication. A Certificate Authority (CA) certificate is used to issue device certificates to clients and to verify the validity of those certificates. If you do not need to use a CA certificate for a period of time, call this operation to unregister it. This changes the status of the CA certificate to inactive. When you need to use the CA certificate again, you can call the ActiveCaCertificate operation to reactivate it.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Only Platinum Edition&lt;props=&quot;china&quot;&gt; and Professional Edition instances support the InactivateCaCertificate operation.</li>
     * <li>The request rate for a single user is limited to 500 per second. If you have special requirements, contact ApsaraMQ for MQTT technical support. The DingTalk group number is 35228338.</li>
     * <li>You can call this operation only for CA certificates that are registered with ApsaraMQ for MQTT. To query the registered CA certificates for an instance, call the <a href="https://help.aliyun.com/document_detail/2604958.html">ListCaCertificate</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>ApsaraMQ for MQTT supports X.509 certificate-based device verification. Clients use device certificates for connection authentication. A Certificate Authority (CA) certificate is used to issue device certificates to clients and to verify the validity of those certificates. If you do not need to use a CA certificate for a period of time, call this operation to unregister it. This changes the status of the CA certificate to inactive. When you need to use the CA certificate again, you can call the ActiveCaCertificate operation to reactivate it.</p>
     * 
     * @param request InactivateCaCertificateRequest
     * @return InactivateCaCertificateResponse
     */
    public InactivateCaCertificateResponse inactivateCaCertificate(InactivateCaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.inactivateCaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Platinum Edition&lt;props=&quot;china&quot;&gt;and Professional Edition instances support the InactivateDeviceCertificate operation.</li>
     * <li>The request frequency for a single user is limited to 500 calls per second. For special requirements, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>A device certificate is a digital certificate that a root Certificate Authority (CA) issues to a client device. The service uses this certificate to authenticate the client during connection. If authentication is successful, the service and the client can communicate securely using the encryption key in the certificate. If authentication fails, the service denies the client\&quot;s connection. Should you need to temporarily disable a device certificate, you can call this operation to inactivate it, setting its status to inactive.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Only Platinum Edition&lt;props=&quot;china&quot;&gt;and Professional Edition instances support the InactivateDeviceCertificate operation.</li>
     * <li>The request frequency for a single user is limited to 500 calls per second. For special requirements, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>A device certificate is a digital certificate that a root Certificate Authority (CA) issues to a client device. The service uses this certificate to authenticate the client during connection. If authentication is successful, the service and the client can communicate securely using the encryption key in the certificate. If authentication fails, the service denies the client\&quot;s connection. Should you need to temporarily disable a device certificate, you can call this operation to inactivate it, setting its status to inactive.</p>
     * 
     * @param request InactivateDeviceCertificateRequest
     * @return InactivateDeviceCertificateResponse
     */
    public InactivateDeviceCertificateResponse inactivateDeviceCertificate(InactivateDeviceCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.inactivateDeviceCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all certificate authority (CA) certificates that are registered with an ApsaraMQ for MQTT instance. ApsaraMQ for MQTT allows you to use X.509 certificates for authentication. When you connect an ApsaraMQ for MQTT client to an ApsaraMQ for MQTT broker, you can use the device certificate to implement authentication. CA certificates are used to issue device certificates to clients and validate the device certificates.</p>
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
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all certificate authority (CA) certificates that are registered with an ApsaraMQ for MQTT instance. ApsaraMQ for MQTT allows you to use X.509 certificates for authentication. When you connect an ApsaraMQ for MQTT client to an ApsaraMQ for MQTT broker, you can use the device certificate to implement authentication. CA certificates are used to issue device certificates to clients and validate the device certificates.</p>
     * 
     * @param request ListCaCertificateRequest
     * @return ListCaCertificateResponse
     */
    public ListCaCertificateResponse listCaCertificate(ListCaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all device certificates that are registered with an ApsaraMQ for MQTT instance. Device certificates are digital certificates issued to clients by certificate authority (CA) root certificates. When you connect an ApsaraMQ for MQTT client to an ApsaraMQ for MQTT broker, the broker uses the device certificate to authenticate the client. If the client passes the authentication, the client and the broker can communicate with each other based on the encrypted private key in the device certificate. If the client fails the authentication, access requests from the client are denied by the client.</p>
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
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all device certificates that are registered with an ApsaraMQ for MQTT instance. Device certificates are digital certificates issued to clients by certificate authority (CA) root certificates. When you connect an ApsaraMQ for MQTT client to an ApsaraMQ for MQTT broker, the broker uses the device certificate to authenticate the client. If the client passes the authentication, the client and the broker can communicate with each other based on the encrypted private key in the device certificate. If the client fails the authentication, access requests from the client are denied by the client.</p>
     * 
     * @param request ListDeviceCertificateRequest
     * @return ListDeviceCertificateResponse
     */
    public ListDeviceCertificateResponse listDeviceCertificate(ListDeviceCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeviceCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all device certificates that are issued by a certificate authority (CA) certificate and registered with ApsaraMQ for MQTT brokers. Device certificates are digital certificates issued to clients by CA root certificates. When you connect an ApsaraMQ for MQTT client to an ApsaraMQ for MQTT broker, the broker uses the device certificate to authenticate the client. If the client passes the authentication, the client and the broker can communicate with each other based on the encrypted private key in the device certificate. If the client fails the authentication, access requests from the client are denied by the client.</p>
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
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all device certificates that are issued by a certificate authority (CA) certificate and registered with ApsaraMQ for MQTT brokers. Device certificates are digital certificates issued to clients by CA root certificates. When you connect an ApsaraMQ for MQTT client to an ApsaraMQ for MQTT broker, the broker uses the device certificate to authenticate the client. If the client passes the authentication, the client and the broker can communicate with each other based on the encrypted private key in the device certificate. If the client fails the authentication, access requests from the client are denied by the client.</p>
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
     * <p>Queries clients that have applied for access credentials in unique-certificate-per-device authentication mode in an ApsaraMQ for MQTT instance.</p>
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
     * <p>Queries clients that have applied for access credentials in unique-certificate-per-device authentication mode in an ApsaraMQ for MQTT instance.</p>
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
     * <p>Each successful call to the <strong>ListGroupId</strong> operation is counted as one message transaction and is billed based on transactions per second (TPS). For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">billing details</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the ListGroupId operation to query all Group IDs in an instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
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
     * <p>Each successful call to the <strong>ListGroupId</strong> operation is counted as one message transaction and is billed based on transactions per second (TPS). For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">billing details</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the ListGroupId operation to query all Group IDs in an instance.</p>
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
     * <p>You can call this operation to query a list of instances.</p>
     * 
     * @param request ListInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query a list of instances.</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the tags that are attached to one or more resources.</p>
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
            new TeaPair("version", "2020-04-20"),
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
     * <p>Lists the tags that are attached to one or more resources.</p>
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
     * <p>Queries custom identity authentication.</p>
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
     * <p>Queries custom identity authentication.</p>
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
     * <ul>
     * <li>Each successful call to the <strong>QueryMqttTraceDevice</strong> operation counts as one message TPS, which affects your billing. For more information about billing, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing</a>.</li>
     * <li>The queries per second (QPS) limit for a single user on this operation is 500. Exceeding this limit will trigger throttling, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">QPS limits</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the device trace of an ApsaraMQ for MQTT client by paging. When a device encounters an exception, you can call this operation to query the connection history of the specified device to help you quickly identify the cause of the exception.</p>
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
     * <ul>
     * <li>Each successful call to the <strong>QueryMqttTraceDevice</strong> operation counts as one message TPS, which affects your billing. For more information about billing, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing</a>.</li>
     * <li>The queries per second (QPS) limit for a single user on this operation is 500. Exceeding this limit will trigger throttling, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">QPS limits</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the device trace of an ApsaraMQ for MQTT client by paging. When a device encounters an exception, you can call this operation to query the connection history of the specified device to help you quickly identify the cause of the exception.</p>
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
     * <ul>
     * <li>Each successful call to the <strong>QueryMqttTraceMessageSubscribe</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
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
     * <ul>
     * <li>Each successful call to the <strong>QueryMqttTraceMessageSubscribe</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
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
     * <ul>
     * <li>You can call this operation up to 500 times per second.\<em>\</em>\<em>\</em> For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
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
     * <ul>
     * <li>You can call this operation up to 500 times per second.\<em>\</em>\<em>\</em> For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
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
     * <blockquote>
     * <p>Each successful call to the <strong>DeleteTopic</strong> operation counts as one message TPS, which affects your billing. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing overview</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries all wildcards and the upper limit under a specific topic.</p>
     * 
     * @param request QueryWildcardByTopicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryWildcardByTopicResponse
     */
    public QueryWildcardByTopicResponse queryWildcardByTopicWithOptions(QueryWildcardByTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryWildcardByTopic"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryWildcardByTopicResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Each successful call to the <strong>DeleteTopic</strong> operation counts as one message TPS, which affects your billing. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing overview</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries all wildcards and the upper limit under a specific topic.</p>
     * 
     * @param request QueryWildcardByTopicRequest
     * @return QueryWildcardByTopicResponse
     */
    public QueryWildcardByTopicResponse queryWildcardByTopic(QueryWildcardByTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryWildcardByTopicWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Limits</h2>
     * <p>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <blockquote>
     * <p>Each successful call to the <strong>RefreshDeviceCredential</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
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
     * <p>Each successful call to the <strong>RefreshDeviceCredential</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</li>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>RegisterCaCertificate</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</li>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>RegisterCaCertificate</p>
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
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
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
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
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
     * <p>  The <strong>SendMessage</strong> operation is called by an application on a cloud server. This operation is complementary to the operation that is called to send a message from an ApsaraMQ for MQTT client. For information about the differences between the scenarios of sending messages from applications on cloud servers and the scenarios of sending messages from ApsaraMQ for MQTT clients, see <a href="https://help.aliyun.com/document_detail/179160.html">Developer guide</a>.</p>
     * <ul>
     * <li>Messages that are sent by calling the <strong>SendMessage</strong> operation cannot be forwarded to ApsaraMQ for RocketMQ. If you want to use an ApsaraMQ for MQTT broker to forward messages to ApsaraMQ for RocketMQ, use <a href="https://help.aliyun.com/document_detail/174527.html">an SDK to send the messages</a>. The <strong>SendMessage</strong> operation supports up to 1,000 queries per second (QPS). For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">QPS limits</a>.</li>
     * <li>Each successful call to the <strong>SendMessage</strong> operation is calculated as a message transaction per second (TPS). This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
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
     * <p>  The <strong>SendMessage</strong> operation is called by an application on a cloud server. This operation is complementary to the operation that is called to send a message from an ApsaraMQ for MQTT client. For information about the differences between the scenarios of sending messages from applications on cloud servers and the scenarios of sending messages from ApsaraMQ for MQTT clients, see <a href="https://help.aliyun.com/document_detail/179160.html">Developer guide</a>.</p>
     * <ul>
     * <li>Messages that are sent by calling the <strong>SendMessage</strong> operation cannot be forwarded to ApsaraMQ for RocketMQ. If you want to use an ApsaraMQ for MQTT broker to forward messages to ApsaraMQ for RocketMQ, use <a href="https://help.aliyun.com/document_detail/174527.html">an SDK to send the messages</a>. The <strong>SendMessage</strong> operation supports up to 1,000 queries per second (QPS). For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">QPS limits</a>.</li>
     * <li>Each successful call to the <strong>SendMessage</strong> operation is calculated as a message transaction per second (TPS). This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
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
     * <b>summary</b> : 
     * <p>Configures a multi-domain certificate.</p>
     * 
     * @param request SetSniConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetSniConfigResponse
     */
    public SetSniConfigResponse setSniConfigWithOptions(SetSniConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultCertificate)) {
            query.put("DefaultCertificate", request.defaultCertificate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mqttInstanceId)) {
            query.put("MqttInstanceId", request.mqttInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sniConfig)) {
            query.put("SniConfig", request.sniConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSniConfig"),
            new TeaPair("version", "2020-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSniConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a multi-domain certificate.</p>
     * 
     * @param request SetSniConfigRequest
     * @return SetSniConfigResponse
     */
    public SetSniConfigResponse setSniConfig(SetSniConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSniConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to resources.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("version", "2020-04-20"),
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
     * <p>Adds tags to resources.</p>
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
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
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
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
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
     * <p>Removes tags from resources.</p>
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
            new TeaPair("version", "2020-04-20"),
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
     * <p>Removes tags from resources.</p>
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
     * <p>Updates custom authentication.</p>
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
     * <p>Updates custom authentication.</p>
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
     * <p>Updates the permissions on a topic.</p>
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
     * <p>Updates the permissions on a topic.</p>
     * 
     * @param request UpdateCustomAuthPermissionRequest
     * @return UpdateCustomAuthPermissionResponse
     */
    public UpdateCustomAuthPermissionResponse updateCustomAuthPermission(UpdateCustomAuthPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomAuthPermissionWithOptions(request, runtime);
    }
}

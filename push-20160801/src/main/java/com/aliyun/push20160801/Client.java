// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801;

import com.aliyun.tea.*;
import com.aliyun.push20160801.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-south-1", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-beijing", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-chengdu", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-edge-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-fujian", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hongkong", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-qingdao", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-wuhan", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "cloudpush.aliyuncs.com"),
            new TeaPair("eu-central-1", "cloudpush.aliyuncs.com"),
            new TeaPair("eu-west-1", "cloudpush.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "cloudpush.aliyuncs.com"),
            new TeaPair("me-east-1", "cloudpush.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "cloudpush.aliyuncs.com"),
            new TeaPair("us-east-1", "cloudpush.aliyuncs.com"),
            new TeaPair("us-west-1", "cloudpush.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("push", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>You can attach up to 10 aliases in a single request. The attachment takes effect immediately.</p>
     * 
     * <b>summary</b> : 
     * <p>Attach an alias to a device.</p>
     * 
     * @param request BindAliasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAliasResponse
     */
    public BindAliasResponse bindAliasWithOptions(BindAliasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            query.put("AliasName", request.aliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAlias"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAliasResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can attach up to 10 aliases in a single request. The attachment takes effect immediately.</p>
     * 
     * <b>summary</b> : 
     * <p>Attach an alias to a device.</p>
     * 
     * @param request BindAliasRequest
     * @return BindAliasResponse
     */
    public BindAliasResponse bindAlias(BindAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAliasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Attaches a device to a phone number.</p>
     * 
     * @param request BindPhoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindPhoneResponse
     */
    public BindPhoneResponse bindPhoneWithOptions(BindPhoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindPhone"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindPhoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Attaches a device to a phone number.</p>
     * 
     * @param request BindPhoneRequest
     * @return BindPhoneResponse
     */
    public BindPhoneResponse bindPhone(BindPhoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindPhoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Binds tags to specified device targets. Tag bindings take effect within 10 minutes.</p>
     * 
     * @param request BindTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindTagResponse
     */
    public BindTagResponse bindTagWithOptions(BindTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientKey)) {
            query.put("ClientKey", request.clientKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyType)) {
            query.put("KeyType", request.keyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindTag"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Binds tags to specified device targets. Tag bindings take effect within 10 minutes.</p>
     * 
     * @param request BindTagRequest
     * @return BindTagResponse
     */
    public BindTagResponse bindTag(BindTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a scheduled push task that has not yet been executed.</p>
     * 
     * @param request CancelPushRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelPushResponse
     */
    public CancelPushResponse cancelPushWithOptions(CancelPushRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("MessageId", request.messageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelPush"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelPushResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a scheduled push task that has not yet been executed.</p>
     * 
     * @param request CancelPushRequest
     * @return CancelPushResponse
     */
    public CancelPushResponse cancelPush(CancelPushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelPushWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If the returned ExpireTime value is later than the current timestamp, the certificate is not necessarily valid. Also verify that the Status is OK.</li>
     * <li>The REVOKED status originates from the Apple Push Notification service (APNs) server. If a certificate has a REVOKED status, at least one push notification to APNs has failed in the corresponding environment.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Checks the expiration time and current status of the iOS certificate for a specified app.</p>
     * 
     * @param request CheckCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckCertificateResponse
     */
    public CheckCertificateResponse checkCertificateWithOptions(CheckCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckCertificate"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If the returned ExpireTime value is later than the current timestamp, the certificate is not necessarily valid. Also verify that the Status is OK.</li>
     * <li>The REVOKED status originates from the Apple Push Notification service (APNs) server. If a certificate has a REVOKED status, at least one push notification to APNs has failed in the corresponding environment.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Checks the expiration time and current status of the iOS certificate for a specified app.</p>
     * 
     * @param request CheckCertificateRequest
     * @return CheckCertificateResponse
     */
    public CheckCertificateResponse checkCertificate(CheckCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Validates the specified (device).</p>
     * 
     * @deprecated OpenAPI CheckDevice is deprecated, please use Push::2016-08-01::CheckDevices instead.
     * 
     * @param request CheckDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDeviceResponse
     */
    @Deprecated
    // Deprecated
    public CheckDeviceResponse checkDeviceWithOptions(CheckDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDevice"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Validates the specified (device).</p>
     * 
     * @deprecated OpenAPI CheckDevice is deprecated, please use Push::2016-08-01::CheckDevices instead.
     * 
     * @param request CheckDeviceRequest
     * @return CheckDeviceResponse
     */
    @Deprecated
    // Deprecated
    public CheckDeviceResponse checkDevice(CheckDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Validate a specified group of devices.</p>
     * 
     * @param request CheckDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDevicesResponse
     */
    public CheckDevicesResponse checkDevicesWithOptions(CheckDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIds)) {
            query.put("DeviceIds", request.deviceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDevices"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Validate a specified group of devices.</p>
     * 
     * @param request CheckDevicesRequest
     * @return CheckDevicesResponse
     */
    public CheckDevicesResponse checkDevices(CheckDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDevicesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you do not call this operation, the continuous push task automatically ends when it reaches its time-to-live (TTL).</p>
     * 
     * <b>summary</b> : 
     * <p>Manually ends a continuous push task.</p>
     * 
     * @param request CompleteContinuouslyPushRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompleteContinuouslyPushResponse
     */
    public CompleteContinuouslyPushResponse completeContinuouslyPushWithOptions(CompleteContinuouslyPushRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("MessageId", request.messageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteContinuouslyPush"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompleteContinuouslyPushResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you do not call this operation, the continuous push task automatically ends when it reaches its time-to-live (TTL).</p>
     * 
     * <b>summary</b> : 
     * <p>Manually ends a continuous push task.</p>
     * 
     * @param request CompleteContinuouslyPushRequest
     * @return CompleteContinuouslyPushResponse
     */
    public CompleteContinuouslyPushResponse completeContinuouslyPush(CompleteContinuouslyPushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.completeContinuouslyPushWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API addresses the limitations of the <a href="https://help.aliyun.com/document_detail/2249916.html">Push Advanced Push API</a>, where push-by-device, push-by-account, and push-by-alias operations each have a maximum target count per single call.</p>
     * <ul>
     * <li>You can use continuous push when your scenario requires sending the same message to many devices. In this case, you can call the continuous push API repeatedly, each time specifying a group of targets for aggregation (the current limit is 1,000 targets per call for device, account, or alias pushes). The total number of pushes for the same MessageId is restricted to 10,000. If you need a higher limit, contact technical support to evaluate your specific scenario.</li>
     * <li>Before using this API, you must first call the Push API with Target set to TBD (To Be Determined) and include your message content. This returns a MessageId from the push system. You can then use this MessageId to repeatedly call the continuous push API, specifying different target groups to deliver the same message.</li>
     * <li>After calling the Push API with Target set to TBD and obtaining a MessageId, the message is stored in the push system for 24 hours by default. You can use this API to push to specified targets at any time before expiration. Pushes are not allowed after expiration or after reaching the total push limit.</li>
     * <li>Each call to this API sends the message immediately. Scheduled pushes are not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Executes a predefined continuous push task.</p>
     * 
     * @param request ContinuouslyPushRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ContinuouslyPushResponse
     */
    public ContinuouslyPushResponse continuouslyPushWithOptions(ContinuouslyPushRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("MessageId", request.messageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetValue)) {
            query.put("TargetValue", request.targetValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ContinuouslyPush"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ContinuouslyPushResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API addresses the limitations of the <a href="https://help.aliyun.com/document_detail/2249916.html">Push Advanced Push API</a>, where push-by-device, push-by-account, and push-by-alias operations each have a maximum target count per single call.</p>
     * <ul>
     * <li>You can use continuous push when your scenario requires sending the same message to many devices. In this case, you can call the continuous push API repeatedly, each time specifying a group of targets for aggregation (the current limit is 1,000 targets per call for device, account, or alias pushes). The total number of pushes for the same MessageId is restricted to 10,000. If you need a higher limit, contact technical support to evaluate your specific scenario.</li>
     * <li>Before using this API, you must first call the Push API with Target set to TBD (To Be Determined) and include your message content. This returns a MessageId from the push system. You can then use this MessageId to repeatedly call the continuous push API, specifying different target groups to deliver the same message.</li>
     * <li>After calling the Push API with Target set to TBD and obtaining a MessageId, the message is stored in the push system for 24 hours by default. You can use this API to push to specified targets at any time before expiration. Pushes are not allowed after expiration or after reaching the total push limit.</li>
     * <li>Each call to this API sends the message immediately. Scheduled pushes are not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Executes a predefined continuous push task.</p>
     * 
     * @param request ContinuouslyPushRequest
     * @return ContinuouslyPushResponse
     */
    public ContinuouslyPushResponse continuouslyPush(ContinuouslyPushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.continuouslyPushWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the list of all applications associated with your Alibaba Cloud account.</p>
     * 
     * @deprecated OpenAPI ListSummaryApps is deprecated, please use Mhub::2017-08-25::ListApps instead.
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSummaryAppsResponse
     */
    @Deprecated
    // Deprecated
    public ListSummaryAppsResponse listSummaryAppsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSummaryApps"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSummaryAppsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the list of all applications associated with your Alibaba Cloud account.</p>
     * 
     * @deprecated OpenAPI ListSummaryApps is deprecated, please use Mhub::2017-08-25::ListApps instead.
     * @return ListSummaryAppsResponse
     */
    @Deprecated
    // Deprecated
    public ListSummaryAppsResponse listSummaryApps() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSummaryAppsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags of an app. A maximum of 100 records are returned.</p>
     * 
     * @param request ListTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagsResponse
     */
    public ListTagsResponse listTagsWithOptions(ListTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTags"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags of an app. A maximum of 100 records are returned.</p>
     * 
     * @param request ListTagsRequest
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before you use this API, make sure that you understand the <a href="https://help.aliyun.com/document_detail/434638.html">billing methods and pricing</a> of EMAS Mobile Push.</em>*
     * Some business scenarios require you to send many different messages to many devices in a short period. This can generate a high number of Queries Per Second (QPS) and cause requests to exceed the QPS limit for a single source IP address, resulting in push failures.
     * This API is designed to solve this issue. You can include up to 100 independent push tasks in a single call. This request aggregation reduces the QPS and improves the stability and success rate of individual pushes. A single account is limited to 500 batch push calls per second.
     * Each independent push task supports pushes to devices, accounts, or aliases. SMS integration is not supported.</p>
     * <blockquote>
     * <p>You must upgrade the SDK to version 3.11.0 or later.</p>
     * </blockquote>
     * <h2>PushTask properties</h2>
     * <ul>
     * <li>The format for PushTask properties is PushTask.N.Property. These properties include the following:<ul>
     * <li>Push target (destination)</li>
     * <li>Push configuration (config)</li>
     * <li>iOS notification task configuration</li>
     * <li>Android notification task configuration</li>
     * <li>Android auxiliary pop-up configuration</li>
     * <li>HarmonyOS notification task configuration</li>
     * <li>Push control</li>
     * </ul>
     * </li>
     * <li>Each PushTask represents an independent push task. A maximum of 100 tasks are supported per call. The push configurations are the same as those for the Push API.</li>
     * <li>The PushTask.N.Target parameter supports only the DEVICE, ACCOUNT, and ALIAS types.</li>
     * <li>PushTask does not support SMS filter interaction.</li>
     * <li>The product of the parent node and child nodes cannot exceed 10,000. If this limit is exceeded, the parameters are considered invalid.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends different messages or notifications to multiple devices in batches.</p>
     * 
     * @param request MassPushRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MassPushResponse
     */
    public MassPushResponse massPushWithOptions(MassPushRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentToken)) {
            query.put("IdempotentToken", request.idempotentToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pushTask)) {
            body.put("PushTask", request.pushTask);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MassPush"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MassPushResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before you use this API, make sure that you understand the <a href="https://help.aliyun.com/document_detail/434638.html">billing methods and pricing</a> of EMAS Mobile Push.</em>*
     * Some business scenarios require you to send many different messages to many devices in a short period. This can generate a high number of Queries Per Second (QPS) and cause requests to exceed the QPS limit for a single source IP address, resulting in push failures.
     * This API is designed to solve this issue. You can include up to 100 independent push tasks in a single call. This request aggregation reduces the QPS and improves the stability and success rate of individual pushes. A single account is limited to 500 batch push calls per second.
     * Each independent push task supports pushes to devices, accounts, or aliases. SMS integration is not supported.</p>
     * <blockquote>
     * <p>You must upgrade the SDK to version 3.11.0 or later.</p>
     * </blockquote>
     * <h2>PushTask properties</h2>
     * <ul>
     * <li>The format for PushTask properties is PushTask.N.Property. These properties include the following:<ul>
     * <li>Push target (destination)</li>
     * <li>Push configuration (config)</li>
     * <li>iOS notification task configuration</li>
     * <li>Android notification task configuration</li>
     * <li>Android auxiliary pop-up configuration</li>
     * <li>HarmonyOS notification task configuration</li>
     * <li>Push control</li>
     * </ul>
     * </li>
     * <li>Each PushTask represents an independent push task. A maximum of 100 tasks are supported per call. The push configurations are the same as those for the Push API.</li>
     * <li>The PushTask.N.Target parameter supports only the DEVICE, ACCOUNT, and ALIAS types.</li>
     * <li>PushTask does not support SMS filter interaction.</li>
     * <li>The product of the parent node and child nodes cannot exceed 10,000. If this limit is exceeded, the parameters are considered invalid.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends different messages or notifications to multiple devices in batches.</p>
     * 
     * @param request MassPushRequest
     * @return MassPushResponse
     */
    public MassPushResponse massPush(MassPushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.massPushWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before using this API, review the <a href="https://help.aliyun.com/document_detail/434638.html">pricing and billing details</a> for EMAS Mobile Push.</p>
     * 
     * <b>summary</b> : 
     * <p>Advanced push API v2.</p>
     * 
     * @param tmpReq MassPushV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return MassPushV2Response
     */
    public MassPushV2Response massPushV2WithOptions(MassPushV2Request tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        MassPushV2ShrinkRequest request = new MassPushV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pushTasks)) {
            request.pushTasksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pushTasks, "PushTasks", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentToken)) {
            query.put("IdempotentToken", request.idempotentToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushTasksShrink)) {
            query.put("PushTasks", request.pushTasksShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MassPushV2"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MassPushV2Response());
    }

    /**
     * <b>description</b> :
     * <p>Before using this API, review the <a href="https://help.aliyun.com/document_detail/434638.html">pricing and billing details</a> for EMAS Mobile Push.</p>
     * 
     * <b>summary</b> : 
     * <p>Advanced push API v2.</p>
     * 
     * @param request MassPushV2Request
     * @return MassPushV2Response
     */
    public MassPushV2Response massPushV2(MassPushV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.massPushV2WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before you use this API, make sure you understand the <a href="https://help.aliyun.com/document_detail/434638.html">billing methods and pricing</a> of EMAS Mobile Push.</em>*
     * This API supports pushes to Android, iOS, and HarmonyOS devices. For each platform, you must provide the corresponding AppKey.</p>
     * 
     * <b>summary</b> : 
     * <p>This advanced push API sends notifications or messages to various devices. It provides a rich set of custom parameters to implement push behaviors for various scenarios.</p>
     * 
     * @param tmpReq PushRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushResponse
     */
    public PushResponse pushWithOptions(PushRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushShrinkRequest request = new PushShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.androidOppoPrivateContentParameters)) {
            request.androidOppoPrivateContentParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.androidOppoPrivateContentParameters, "AndroidOppoPrivateContentParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.androidOppoPrivateTitleParameters)) {
            request.androidOppoPrivateTitleParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.androidOppoPrivateTitleParameters, "AndroidOppoPrivateTitleParameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidActivity)) {
            query.put("AndroidActivity", request.androidActivity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidBadgeAddNum)) {
            query.put("AndroidBadgeAddNum", request.androidBadgeAddNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidBadgeClass)) {
            query.put("AndroidBadgeClass", request.androidBadgeClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidBadgeSetNum)) {
            query.put("AndroidBadgeSetNum", request.androidBadgeSetNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidBigBody)) {
            query.put("AndroidBigBody", request.androidBigBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidBigPictureUrl)) {
            query.put("AndroidBigPictureUrl", request.androidBigPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidBigTitle)) {
            query.put("AndroidBigTitle", request.androidBigTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidExtParameters)) {
            query.put("AndroidExtParameters", request.androidExtParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidHonorTargetUserType)) {
            query.put("AndroidHonorTargetUserType", request.androidHonorTargetUserType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidHuaweiBusinessType)) {
            query.put("AndroidHuaweiBusinessType", request.androidHuaweiBusinessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidHuaweiLiveNotificationPayload)) {
            query.put("AndroidHuaweiLiveNotificationPayload", request.androidHuaweiLiveNotificationPayload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidHuaweiReceiptId)) {
            query.put("AndroidHuaweiReceiptId", request.androidHuaweiReceiptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidHuaweiTargetUserType)) {
            query.put("AndroidHuaweiTargetUserType", request.androidHuaweiTargetUserType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidImageUrl)) {
            query.put("AndroidImageUrl", request.androidImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidInboxBody)) {
            query.put("AndroidInboxBody", request.androidInboxBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidMeizuNoticeMsgType)) {
            query.put("AndroidMeizuNoticeMsgType", request.androidMeizuNoticeMsgType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidMessageHuaweiCategory)) {
            query.put("AndroidMessageHuaweiCategory", request.androidMessageHuaweiCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidMessageHuaweiUrgency)) {
            query.put("AndroidMessageHuaweiUrgency", request.androidMessageHuaweiUrgency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidMessageOppoCategory)) {
            query.put("AndroidMessageOppoCategory", request.androidMessageOppoCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidMessageOppoNotifyLevel)) {
            query.put("AndroidMessageOppoNotifyLevel", request.androidMessageOppoNotifyLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidMessageVivoCategory)) {
            query.put("AndroidMessageVivoCategory", request.androidMessageVivoCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidMusic)) {
            query.put("AndroidMusic", request.androidMusic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidNotificationBarPriority)) {
            query.put("AndroidNotificationBarPriority", request.androidNotificationBarPriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidNotificationBarType)) {
            query.put("AndroidNotificationBarType", request.androidNotificationBarType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidNotificationChannel)) {
            query.put("AndroidNotificationChannel", request.androidNotificationChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidNotificationGroup)) {
            query.put("AndroidNotificationGroup", request.androidNotificationGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidNotificationHonorChannel)) {
            query.put("AndroidNotificationHonorChannel", request.androidNotificationHonorChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidNotificationHuaweiChannel)) {
            query.put("AndroidNotificationHuaweiChannel", request.androidNotificationHuaweiChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidNotificationNotifyId)) {
            query.put("AndroidNotificationNotifyId", request.androidNotificationNotifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidNotificationThreadId)) {
            query.put("AndroidNotificationThreadId", request.androidNotificationThreadId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidNotificationVivoChannel)) {
            query.put("AndroidNotificationVivoChannel", request.androidNotificationVivoChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidNotificationXiaomiChannel)) {
            query.put("AndroidNotificationXiaomiChannel", request.androidNotificationXiaomiChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidNotifyType)) {
            query.put("AndroidNotifyType", request.androidNotifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidOpenType)) {
            query.put("AndroidOpenType", request.androidOpenType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidOpenUrl)) {
            query.put("AndroidOpenUrl", request.androidOpenUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidOppoDeleteIntentData)) {
            query.put("AndroidOppoDeleteIntentData", request.androidOppoDeleteIntentData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidOppoIntelligentIntent)) {
            query.put("AndroidOppoIntelligentIntent", request.androidOppoIntelligentIntent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidOppoIntentEnv)) {
            query.put("AndroidOppoIntentEnv", request.androidOppoIntentEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidOppoPrivateContentParametersShrink)) {
            query.put("AndroidOppoPrivateContentParameters", request.androidOppoPrivateContentParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidOppoPrivateMsgTemplateId)) {
            query.put("AndroidOppoPrivateMsgTemplateId", request.androidOppoPrivateMsgTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidOppoPrivateTitleParametersShrink)) {
            query.put("AndroidOppoPrivateTitleParameters", request.androidOppoPrivateTitleParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidPopupActivity)) {
            query.put("AndroidPopupActivity", request.androidPopupActivity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidPopupBody)) {
            query.put("AndroidPopupBody", request.androidPopupBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidPopupTitle)) {
            query.put("AndroidPopupTitle", request.androidPopupTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidRemind)) {
            query.put("AndroidRemind", request.androidRemind);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidRenderStyle)) {
            query.put("AndroidRenderStyle", request.androidRenderStyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidTargetUserType)) {
            query.put("AndroidTargetUserType", request.androidTargetUserType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidVivoLiveMessage)) {
            query.put("AndroidVivoLiveMessage", request.androidVivoLiveMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidVivoPushMode)) {
            query.put("AndroidVivoPushMode", request.androidVivoPushMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidVivoReceiptId)) {
            query.put("AndroidVivoReceiptId", request.androidVivoReceiptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidXiaoMiActivity)) {
            query.put("AndroidXiaoMiActivity", request.androidXiaoMiActivity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidXiaoMiNotifyBody)) {
            query.put("AndroidXiaoMiNotifyBody", request.androidXiaoMiNotifyBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidXiaoMiNotifyTitle)) {
            query.put("AndroidXiaoMiNotifyTitle", request.androidXiaoMiNotifyTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidXiaomiBigPictureUrl)) {
            query.put("AndroidXiaomiBigPictureUrl", request.androidXiaomiBigPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidXiaomiFocusParam)) {
            query.put("AndroidXiaomiFocusParam", request.androidXiaomiFocusParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidXiaomiFocusPics)) {
            query.put("AndroidXiaomiFocusPics", request.androidXiaomiFocusPics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidXiaomiImageUrl)) {
            query.put("AndroidXiaomiImageUrl", request.androidXiaomiImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidXiaomiTemplateId)) {
            query.put("AndroidXiaomiTemplateId", request.androidXiaomiTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidXiaomiTemplateParams)) {
            query.put("AndroidXiaomiTemplateParams", request.androidXiaomiTemplateParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            query.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            query.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyAction)) {
            query.put("HarmonyAction", request.harmonyAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyActionType)) {
            query.put("HarmonyActionType", request.harmonyActionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyBadgeAddNum)) {
            query.put("HarmonyBadgeAddNum", request.harmonyBadgeAddNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyBadgeSetNum)) {
            query.put("HarmonyBadgeSetNum", request.harmonyBadgeSetNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyCategory)) {
            query.put("HarmonyCategory", request.harmonyCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyExtParameters)) {
            query.put("HarmonyExtParameters", request.harmonyExtParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyExtensionExtraData)) {
            query.put("HarmonyExtensionExtraData", request.harmonyExtensionExtraData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyExtensionPush)) {
            query.put("HarmonyExtensionPush", request.harmonyExtensionPush);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyImageUrl)) {
            query.put("HarmonyImageUrl", request.harmonyImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyInboxContent)) {
            query.put("HarmonyInboxContent", request.harmonyInboxContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyLiveViewPayload)) {
            query.put("HarmonyLiveViewPayload", request.harmonyLiveViewPayload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyNotificationSlotType)) {
            query.put("HarmonyNotificationSlotType", request.harmonyNotificationSlotType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyNotifyId)) {
            query.put("HarmonyNotifyId", request.harmonyNotifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyReceiptId)) {
            query.put("HarmonyReceiptId", request.harmonyReceiptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyRemind)) {
            query.put("HarmonyRemind", request.harmonyRemind);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyRemindBody)) {
            query.put("HarmonyRemindBody", request.harmonyRemindBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyRemindTitle)) {
            query.put("HarmonyRemindTitle", request.harmonyRemindTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyRenderStyle)) {
            query.put("HarmonyRenderStyle", request.harmonyRenderStyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyTestMessage)) {
            query.put("HarmonyTestMessage", request.harmonyTestMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyUri)) {
            query.put("HarmonyUri", request.harmonyUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentToken)) {
            query.put("IdempotentToken", request.idempotentToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobKey)) {
            query.put("JobKey", request.jobKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushTime)) {
            query.put("PushTime", request.pushTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushType)) {
            query.put("PushType", request.pushType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendChannels)) {
            query.put("SendChannels", request.sendChannels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendSpeed)) {
            query.put("SendSpeed", request.sendSpeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsDelaySecs)) {
            query.put("SmsDelaySecs", request.smsDelaySecs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsParams)) {
            query.put("SmsParams", request.smsParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsSendPolicy)) {
            query.put("SmsSendPolicy", request.smsSendPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsSignName)) {
            query.put("SmsSignName", request.smsSignName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsTemplateName)) {
            query.put("SmsTemplateName", request.smsTemplateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeOffline)) {
            query.put("StoreOffline", request.storeOffline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetValue)) {
            query.put("TargetValue", request.targetValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trim)) {
            query.put("Trim", request.trim);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSApnsEnv)) {
            query.put("iOSApnsEnv", request.iOSApnsEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSBadge)) {
            query.put("iOSBadge", request.iOSBadge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSBadgeAutoIncrement)) {
            query.put("iOSBadgeAutoIncrement", request.iOSBadgeAutoIncrement);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSExtParameters)) {
            query.put("iOSExtParameters", request.iOSExtParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSInterruptionLevel)) {
            query.put("iOSInterruptionLevel", request.iOSInterruptionLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSLiveActivityAttributes)) {
            query.put("iOSLiveActivityAttributes", request.iOSLiveActivityAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSLiveActivityAttributesType)) {
            query.put("iOSLiveActivityAttributesType", request.iOSLiveActivityAttributesType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSLiveActivityContentState)) {
            query.put("iOSLiveActivityContentState", request.iOSLiveActivityContentState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSLiveActivityDismissalDate)) {
            query.put("iOSLiveActivityDismissalDate", request.iOSLiveActivityDismissalDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSLiveActivityEvent)) {
            query.put("iOSLiveActivityEvent", request.iOSLiveActivityEvent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSLiveActivityId)) {
            query.put("iOSLiveActivityId", request.iOSLiveActivityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSLiveActivityStaleDate)) {
            query.put("iOSLiveActivityStaleDate", request.iOSLiveActivityStaleDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSMusic)) {
            query.put("iOSMusic", request.iOSMusic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSMutableContent)) {
            query.put("iOSMutableContent", request.iOSMutableContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSNotificationCategory)) {
            query.put("iOSNotificationCategory", request.iOSNotificationCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSNotificationCollapseId)) {
            query.put("iOSNotificationCollapseId", request.iOSNotificationCollapseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSNotificationThreadId)) {
            query.put("iOSNotificationThreadId", request.iOSNotificationThreadId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSRelevanceScore)) {
            query.put("iOSRelevanceScore", request.iOSRelevanceScore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSRemind)) {
            query.put("iOSRemind", request.iOSRemind);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSRemindBody)) {
            query.put("iOSRemindBody", request.iOSRemindBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSSilentNotification)) {
            query.put("iOSSilentNotification", request.iOSSilentNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iOSSubtitle)) {
            query.put("iOSSubtitle", request.iOSSubtitle);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Push"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before you use this API, make sure you understand the <a href="https://help.aliyun.com/document_detail/434638.html">billing methods and pricing</a> of EMAS Mobile Push.</em>*
     * This API supports pushes to Android, iOS, and HarmonyOS devices. For each platform, you must provide the corresponding AppKey.</p>
     * 
     * <b>summary</b> : 
     * <p>This advanced push API sends notifications or messages to various devices. It provides a rich set of custom parameters to implement push behaviors for various scenarios.</p>
     * 
     * @param request PushRequest
     * @return PushResponse
     */
    public PushResponse push(PushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>This operation will be deprecated soon. Use the <a href="https://help.aliyun.com/document_detail/2249916.html">advanced push API</a>, which provides enhanced push capabilities. To achieve the same result, set the <code>DeviceType</code> parameter to <code>ANDROID</code> and the <code>PushType</code> parameter to <code>MESSAGE</code> in the advanced push API.</em>*
     * <strong>Before using this operation, review the <a href="https://help.aliyun.com/document_detail/434638.html">billing methods and pricing</a> for EMAS Mobile Push.</strong>
     * By default, this operation sends messages only to online devices. If a device is offline, set the <code>StoreOffline</code> parameter. The push system then stores the message and delivers it automatically when the device comes online.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a message to an Android device through the Alibaba Cloud Mobile Push proprietary channel. After the app on the device receives the message, it must handle subsequent actions, such as implementing business logic or displaying a local notification.</p>
     * 
     * @param request PushMessageToAndroidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushMessageToAndroidResponse
     */
    public PushMessageToAndroidResponse pushMessageToAndroidWithOptions(PushMessageToAndroidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            query.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobKey)) {
            query.put("JobKey", request.jobKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeOffline)) {
            query.put("StoreOffline", request.storeOffline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetValue)) {
            query.put("TargetValue", request.targetValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushMessageToAndroid"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushMessageToAndroidResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>This operation will be deprecated soon. Use the <a href="https://help.aliyun.com/document_detail/2249916.html">advanced push API</a>, which provides enhanced push capabilities. To achieve the same result, set the <code>DeviceType</code> parameter to <code>ANDROID</code> and the <code>PushType</code> parameter to <code>MESSAGE</code> in the advanced push API.</em>*
     * <strong>Before using this operation, review the <a href="https://help.aliyun.com/document_detail/434638.html">billing methods and pricing</a> for EMAS Mobile Push.</strong>
     * By default, this operation sends messages only to online devices. If a device is offline, set the <code>StoreOffline</code> parameter. The push system then stores the message and delivers it automatically when the device comes online.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a message to an Android device through the Alibaba Cloud Mobile Push proprietary channel. After the app on the device receives the message, it must handle subsequent actions, such as implementing business logic or displaying a local notification.</p>
     * 
     * @param request PushMessageToAndroidRequest
     * @return PushMessageToAndroidResponse
     */
    public PushMessageToAndroidResponse pushMessageToAndroid(PushMessageToAndroidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushMessageToAndroidWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>This API is deprecated. Use the <a href="https://help.aliyun.com/document_detail/2249916.html">advanced push API</a> for more push capabilities. In that API, set the push platform <code>DeviceType</code> to <code>iOS</code> and the push type <code>PushType</code> to <code>MESSAGE</code> to achieve the same effect.</em>*
     * <strong>Before you use this API, review the <a href="https://help.aliyun.com/document_detail/434638.html">billing methods and pricing</a> for EMAS Mobile Push.</strong>
     * By default, this API sends messages only to online devices. If a device is offline, you can set the <code>StoreOffline</code> parameter. The push system then saves the message and automatically delivers it when the device comes back online.</p>
     * 
     * <b>summary</b> : 
     * <p>Pushes messages to iOS devices. These messages are delivered through the proprietary channel of Alibaba Cloud Mobile Push. After the app on a device receives a message, it must handle subsequent actions, such as implementing business behaviors or creating local notifications.</p>
     * 
     * @param request PushMessageToiOSRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushMessageToiOSResponse
     */
    public PushMessageToiOSResponse pushMessageToiOSWithOptions(PushMessageToiOSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            query.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobKey)) {
            query.put("JobKey", request.jobKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeOffline)) {
            query.put("StoreOffline", request.storeOffline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetValue)) {
            query.put("TargetValue", request.targetValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushMessageToiOS"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushMessageToiOSResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>This API is deprecated. Use the <a href="https://help.aliyun.com/document_detail/2249916.html">advanced push API</a> for more push capabilities. In that API, set the push platform <code>DeviceType</code> to <code>iOS</code> and the push type <code>PushType</code> to <code>MESSAGE</code> to achieve the same effect.</em>*
     * <strong>Before you use this API, review the <a href="https://help.aliyun.com/document_detail/434638.html">billing methods and pricing</a> for EMAS Mobile Push.</strong>
     * By default, this API sends messages only to online devices. If a device is offline, you can set the <code>StoreOffline</code> parameter. The push system then saves the message and automatically delivers it when the device comes back online.</p>
     * 
     * <b>summary</b> : 
     * <p>Pushes messages to iOS devices. These messages are delivered through the proprietary channel of Alibaba Cloud Mobile Push. After the app on a device receives a message, it must handle subsequent actions, such as implementing business behaviors or creating local notifications.</p>
     * 
     * @param request PushMessageToiOSRequest
     * @return PushMessageToiOSResponse
     */
    public PushMessageToiOSResponse pushMessageToiOS(PushMessageToiOSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushMessageToiOSWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>This operation is deprecated. Use the <a href="https://help.aliyun.com/document_detail/2249916.html">Advanced Push API</a> instead. In that API, set the <code>DeviceType</code> parameter to <code>ANDROID</code> and the <code>PushType</code> parameter to <code>NOTICE</code>.</em>*
     * <strong>Before using this operation, review the <a href="https://help.aliyun.com/document_detail/434638.html">pricing and billing model</a> for EMAS Mobile Push.</strong></p>
     * 
     * <b>summary</b> : 
     * <p>Sends a notification to Android devices. The notification appears directly in the device’s notification tray and may be delivered through Alibaba Cloud’s proprietary channel or the device manufacturer’s channel, depending on the scenario.</p>
     * 
     * @param request PushNoticeToAndroidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushNoticeToAndroidResponse
     */
    public PushNoticeToAndroidResponse pushNoticeToAndroidWithOptions(PushNoticeToAndroidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            query.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extParameters)) {
            query.put("ExtParameters", request.extParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobKey)) {
            query.put("JobKey", request.jobKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeOffline)) {
            query.put("StoreOffline", request.storeOffline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetValue)) {
            query.put("TargetValue", request.targetValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushNoticeToAndroid"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushNoticeToAndroidResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>This operation is deprecated. Use the <a href="https://help.aliyun.com/document_detail/2249916.html">Advanced Push API</a> instead. In that API, set the <code>DeviceType</code> parameter to <code>ANDROID</code> and the <code>PushType</code> parameter to <code>NOTICE</code>.</em>*
     * <strong>Before using this operation, review the <a href="https://help.aliyun.com/document_detail/434638.html">pricing and billing model</a> for EMAS Mobile Push.</strong></p>
     * 
     * <b>summary</b> : 
     * <p>Sends a notification to Android devices. The notification appears directly in the device’s notification tray and may be delivered through Alibaba Cloud’s proprietary channel or the device manufacturer’s channel, depending on the scenario.</p>
     * 
     * @param request PushNoticeToAndroidRequest
     * @return PushNoticeToAndroidResponse
     */
    public PushNoticeToAndroidResponse pushNoticeToAndroid(PushNoticeToAndroidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushNoticeToAndroidWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>This operation is deprecated. Use the <a href="https://help.aliyun.com/document_detail/2249916.html">Advanced Push API</a> instead. Set the <code>DeviceType</code> parameter to <code>iOS</code> and the <code>PushType</code> parameter to <code>NOTICE</code>.</em>*
     * <strong>Before you use this operation, review the <a href="https://help.aliyun.com/document_detail/434638.html">pricing and billing model</a> for EMAS Mobile Push.</strong></p>
     * 
     * <b>summary</b> : 
     * <p>Send a notification to iOS devices. The notification uses Apple’s APNs channel and appears directly in the device notification center.</p>
     * 
     * @param request PushNoticeToiOSRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushNoticeToiOSResponse
     */
    public PushNoticeToiOSResponse pushNoticeToiOSWithOptions(PushNoticeToiOSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apnsEnv)) {
            query.put("ApnsEnv", request.apnsEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            query.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extParameters)) {
            query.put("ExtParameters", request.extParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobKey)) {
            query.put("JobKey", request.jobKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetValue)) {
            query.put("TargetValue", request.targetValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushNoticeToiOS"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushNoticeToiOSResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>This operation is deprecated. Use the <a href="https://help.aliyun.com/document_detail/2249916.html">Advanced Push API</a> instead. Set the <code>DeviceType</code> parameter to <code>iOS</code> and the <code>PushType</code> parameter to <code>NOTICE</code>.</em>*
     * <strong>Before you use this operation, review the <a href="https://help.aliyun.com/document_detail/434638.html">pricing and billing model</a> for EMAS Mobile Push.</strong></p>
     * 
     * <b>summary</b> : 
     * <p>Send a notification to iOS devices. The notification uses Apple’s APNs channel and appears directly in the device notification center.</p>
     * 
     * @param request PushNoticeToiOSRequest
     * @return PushNoticeToiOSResponse
     */
    public PushNoticeToiOSResponse pushNoticeToiOS(PushNoticeToiOSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushNoticeToiOSWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this API, review the <a href="https://help.aliyun.com/document_detail/434638.html">pricing and billing methods</a> for EMAS Mobile Push.</em>*
     * This API supports Android, iOS, and HarmonyOS. For each platform, pass its assigned AppKey.</p>
     * 
     * <b>summary</b> : 
     * <p>This is the advanced push API v2.</p>
     * 
     * @param tmpReq PushV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushV2Response
     */
    public PushV2Response pushV2WithOptions(PushV2Request tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushV2ShrinkRequest request = new PushV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pushTask)) {
            request.pushTaskShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pushTask, "PushTask", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentToken)) {
            query.put("IdempotentToken", request.idempotentToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushTaskShrink)) {
            query.put("PushTask", request.pushTaskShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushV2"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushV2Response());
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this API, review the <a href="https://help.aliyun.com/document_detail/434638.html">pricing and billing methods</a> for EMAS Mobile Push.</em>*
     * This API supports Android, iOS, and HarmonyOS. For each platform, pass its assigned AppKey.</p>
     * 
     * <b>summary</b> : 
     * <p>This is the advanced push API v2.</p>
     * 
     * @param request PushV2Request
     * @return PushV2Response
     */
    public PushV2Response pushV2(PushV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of aliases attached to a specified device.</p>
     * 
     * @param request QueryAliasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAliasesResponse
     */
    public QueryAliasesResponse queryAliasesWithOptions(QueryAliasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAliases"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAliasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of aliases attached to a specified device.</p>
     * 
     * @param request QueryAliasesRequest
     * @return QueryAliasesResponse
     */
    public QueryAliasesResponse queryAliases(QueryAliasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAliasesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query details of a specified device.</p>
     * 
     * @param request QueryDeviceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDeviceInfoResponse
     */
    public QueryDeviceInfoResponse queryDeviceInfoWithOptions(QueryDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceInfo"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query details of a specified device.</p>
     * 
     * @param request QueryDeviceInfoRequest
     * @return QueryDeviceInfoResponse
     */
    public QueryDeviceInfoResponse queryDeviceInfo(QueryDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Currently, this API supports only daily data. The daily dimension lets you query data for up to 31 days. Days are calculated based on UTC+8.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries device statistics by application dimension.</p>
     * 
     * @param request QueryDeviceStatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDeviceStatResponse
     */
    public QueryDeviceStatResponse queryDeviceStatWithOptions(QueryDeviceStatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            query.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceStat"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceStatResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Currently, this API supports only daily data. The daily dimension lets you query data for up to 31 days. Days are calculated based on UTC+8.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries device statistics by application dimension.</p>
     * 
     * @param request QueryDeviceStatRequest
     * @return QueryDeviceStatResponse
     */
    public QueryDeviceStatResponse queryDeviceStat(QueryDeviceStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceStatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the list of devices associated with an account using the account name.</p>
     * 
     * @param request QueryDevicesByAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDevicesByAccountResponse
     */
    public QueryDevicesByAccountResponse queryDevicesByAccountWithOptions(QueryDevicesByAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDevicesByAccount"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDevicesByAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the list of devices associated with an account using the account name.</p>
     * 
     * @param request QueryDevicesByAccountRequest
     * @return QueryDevicesByAccountResponse
     */
    public QueryDevicesByAccountResponse queryDevicesByAccount(QueryDevicesByAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDevicesByAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of devices by alias.</p>
     * 
     * @param request QueryDevicesByAliasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDevicesByAliasResponse
     */
    public QueryDevicesByAliasResponse queryDevicesByAliasWithOptions(QueryDevicesByAliasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            query.put("Alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDevicesByAlias"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDevicesByAliasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of devices by alias.</p>
     * 
     * @param request QueryDevicesByAliasRequest
     * @return QueryDevicesByAliasResponse
     */
    public QueryDevicesByAliasResponse queryDevicesByAlias(QueryDevicesByAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDevicesByAliasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can query push records with pagination and basic filtering.</p>
     * 
     * @param request QueryPushRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPushRecordsResponse
     */
    public QueryPushRecordsResponse queryPushRecordsWithOptions(QueryPushRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushType)) {
            query.put("PushType", request.pushType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPushRecords"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPushRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can query push records with pagination and basic filtering.</p>
     * 
     * @param request QueryPushRecordsRequest
     * @return QueryPushRecordsResponse
     */
    public QueryPushRecordsResponse queryPushRecords(QueryPushRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPushRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query push statistics for an app.</p>
     * 
     * @param request QueryPushStatByAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPushStatByAppResponse
     */
    public QueryPushStatByAppResponse queryPushStatByAppWithOptions(QueryPushStatByAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("Granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPushStatByApp"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPushStatByAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query push statistics for an app.</p>
     * 
     * @param request QueryPushStatByAppRequest
     * @return QueryPushStatByAppResponse
     */
    public QueryPushStatByAppResponse queryPushStatByApp(QueryPushStatByAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPushStatByAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries push statistics for a message.</p>
     * 
     * @param request QueryPushStatByMsgRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPushStatByMsgResponse
     */
    public QueryPushStatByMsgResponse queryPushStatByMsgWithOptions(QueryPushStatByMsgRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("MessageId", request.messageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPushStatByMsg"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPushStatByMsgResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries push statistics for a message.</p>
     * 
     * @param request QueryPushStatByMsgRequest
     * @return QueryPushStatByMsgResponse
     */
    public QueryPushStatByMsgResponse queryPushStatByMsg(QueryPushStatByMsgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPushStatByMsgWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries tags for a specified object, such as a device, account, or alias.</p>
     * 
     * @param request QueryTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTagsResponse
     */
    public QueryTagsResponse queryTagsWithOptions(QueryTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientKey)) {
            query.put("ClientKey", request.clientKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyType)) {
            query.put("KeyType", request.keyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTags"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries tags for a specified object, such as a device, account, or alias.</p>
     * 
     * @param request QueryTagsRequest
     * @return QueryTagsResponse
     */
    public QueryTagsResponse queryTags(QueryTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTagsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation returns data only at the daily granularity. You can query up to 31 days of data. Deduplicated device counts reset on the first day of each month.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Obtain deduplicated device statistics for an app.</p>
     * 
     * @param request QueryUniqueDeviceStatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUniqueDeviceStatResponse
     */
    public QueryUniqueDeviceStatResponse queryUniqueDeviceStatWithOptions(QueryUniqueDeviceStatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("Granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUniqueDeviceStat"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUniqueDeviceStatResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation returns data only at the daily granularity. You can query up to 31 days of data. Deduplicated device counts reset on the first day of each month.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Obtain deduplicated device statistics for an app.</p>
     * 
     * @param request QueryUniqueDeviceStatRequest
     * @return QueryUniqueDeviceStatResponse
     */
    public QueryUniqueDeviceStatResponse queryUniqueDeviceStat(QueryUniqueDeviceStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUniqueDeviceStatWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deleting a tag takes time. The time required depends on the number of tagged resources. Do not immediately recreate a tag with the same name after you delete it. Wait at least 5 minutes before you recreate a tag in the same app. If you delete multiple tags, wait at least 5 minutes for each deleted tag before you recreate them.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a tag from an app.</p>
     * 
     * @param request RemoveTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveTagResponse
     */
    public RemoveTagResponse removeTagWithOptions(RemoveTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveTag"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTagResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deleting a tag takes time. The time required depends on the number of tagged resources. Do not immediately recreate a tag with the same name after you delete it. Wait at least 5 minutes before you recreate a tag in the same app. If you delete multiple tags, wait at least 5 minutes for each deleted tag before you recreate them.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a tag from an app.</p>
     * 
     * @param request RemoveTagRequest
     * @return RemoveTagResponse
     */
    public RemoveTagResponse removeTag(RemoveTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds an alias. The change takes effect immediately.</p>
     * 
     * @param request UnbindAliasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindAliasResponse
     */
    public UnbindAliasResponse unbindAliasWithOptions(UnbindAliasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            query.put("AliasName", request.aliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unbindAll)) {
            query.put("UnbindAll", request.unbindAll);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindAlias"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindAliasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds an alias. The change takes effect immediately.</p>
     * 
     * @param request UnbindAliasRequest
     * @return UnbindAliasResponse
     */
    public UnbindAliasResponse unbindAlias(UnbindAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindAliasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbind the mobile phone number from a specified device.</p>
     * 
     * @param request UnbindPhoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindPhoneResponse
     */
    public UnbindPhoneResponse unbindPhoneWithOptions(UnbindPhoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindPhone"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindPhoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbind the mobile phone number from a specified device.</p>
     * 
     * @param request UnbindPhoneRequest
     * @return UnbindPhoneResponse
     */
    public UnbindPhoneResponse unbindPhone(UnbindPhoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindPhoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds one or more tags from a specified target.</p>
     * 
     * @param request UnbindTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindTagResponse
     */
    public UnbindTagResponse unbindTagWithOptions(UnbindTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientKey)) {
            query.put("ClientKey", request.clientKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyType)) {
            query.put("KeyType", request.keyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindTag"),
            new TeaPair("version", "2016-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds one or more tags from a specified target.</p>
     * 
     * @param request UnbindTagRequest
     * @return UnbindTagResponse
     */
    public UnbindTagResponse unbindTag(UnbindTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindTagWithOptions(request, runtime);
    }
}

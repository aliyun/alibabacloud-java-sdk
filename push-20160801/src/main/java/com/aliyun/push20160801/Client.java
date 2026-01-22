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
     * <b>summary</b> : 
     * <p>绑定别名</p>
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
     * <b>summary</b> : 
     * <p>绑定别名</p>
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
     * <p>绑定手机号码</p>
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
     * <p>绑定手机号码</p>
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
     * <p>绑定标签</p>
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
     * <p>绑定标签</p>
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
     * <p>取消定时推送任务</p>
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
     * <p>取消定时推送任务</p>
     * 
     * @param request CancelPushRequest
     * @return CancelPushResponse
     */
    public CancelPushResponse cancelPush(CancelPushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelPushWithOptions(request, runtime);
    }

    /**
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
     * @param request CheckCertificateRequest
     * @return CheckCertificateResponse
     */
    public CheckCertificateResponse checkCertificate(CheckCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>【废弃】验证设备有效性</p>
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
     * <p>【废弃】验证设备有效性</p>
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
     * <p>批量检查设备有效性</p>
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
     * <p>批量检查设备有效性</p>
     * 
     * @param request CheckDevicesRequest
     * @return CheckDevicesResponse
     */
    public CheckDevicesResponse checkDevices(CheckDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>完成持续推送任务</p>
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
     * <b>summary</b> : 
     * <p>完成持续推送任务</p>
     * 
     * @param request CompleteContinuouslyPushRequest
     * @return CompleteContinuouslyPushResponse
     */
    public CompleteContinuouslyPushResponse completeContinuouslyPush(CompleteContinuouslyPushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.completeContinuouslyPushWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>持续推送</p>
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
     * <b>summary</b> : 
     * <p>持续推送</p>
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
     * <p>【废弃】查询用户已创建的app列表</p>
     * 
     * @deprecated OpenAPI ListSummaryApps is deprecated, please use Mhub::2017-08-25::ListApps instead.
     * 
     * @param request ListSummaryAppsRequest
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
     * <p>【废弃】查询用户已创建的app列表</p>
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
     * <p>获取标签列表</p>
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
     * <p>获取标签列表</p>
     * 
     * @param request ListTagsRequest
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量推送</p>
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
     * <b>summary</b> : 
     * <p>批量推送</p>
     * 
     * @param request MassPushRequest
     * @return MassPushResponse
     */
    public MassPushResponse massPush(MassPushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.massPushWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新版高级推送接口</p>
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
     * <b>summary</b> : 
     * <p>新版高级推送接口</p>
     * 
     * @param request MassPushV2Request
     * @return MassPushV2Response
     */
    public MassPushV2Response massPushV2(MassPushV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.massPushV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>高级推送接口</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.androidXiaomiImageUrl)) {
            query.put("AndroidXiaomiImageUrl", request.androidXiaomiImageUrl);
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
     * <b>summary</b> : 
     * <p>高级推送接口</p>
     * 
     * @param request PushRequest
     * @return PushResponse
     */
    public PushResponse push(PushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推送消息给Android设备</p>
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
     * <b>summary</b> : 
     * <p>推送消息给Android设备</p>
     * 
     * @param request PushMessageToAndroidRequest
     * @return PushMessageToAndroidResponse
     */
    public PushMessageToAndroidResponse pushMessageToAndroid(PushMessageToAndroidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushMessageToAndroidWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推送消息给iOS设备</p>
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
     * <b>summary</b> : 
     * <p>推送消息给iOS设备</p>
     * 
     * @param request PushMessageToiOSRequest
     * @return PushMessageToiOSResponse
     */
    public PushMessageToiOSResponse pushMessageToiOS(PushMessageToiOSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushMessageToiOSWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推送通知给Android设备</p>
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
     * <b>summary</b> : 
     * <p>推送通知给Android设备</p>
     * 
     * @param request PushNoticeToAndroidRequest
     * @return PushNoticeToAndroidResponse
     */
    public PushNoticeToAndroidResponse pushNoticeToAndroid(PushNoticeToAndroidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushNoticeToAndroidWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推送通知给iOS设备</p>
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
     * <b>summary</b> : 
     * <p>推送通知给iOS设备</p>
     * 
     * @param request PushNoticeToiOSRequest
     * @return PushNoticeToiOSResponse
     */
    public PushNoticeToiOSResponse pushNoticeToiOS(PushNoticeToiOSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushNoticeToiOSWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新版高级推送接口</p>
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
     * <b>summary</b> : 
     * <p>新版高级推送接口</p>
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
     * <p>查询别名</p>
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
     * <p>查询别名</p>
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
     * <p>查询设备详情</p>
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
     * <p>查询设备详情</p>
     * 
     * @param request QueryDeviceInfoRequest
     * @return QueryDeviceInfoResponse
     */
    public QueryDeviceInfoResponse queryDeviceInfo(QueryDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设备新增与留存</p>
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
     * <b>summary</b> : 
     * <p>设备新增与留存</p>
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
     * <p>通过账户查询设备列表</p>
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
     * <p>通过账户查询设备列表</p>
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
     * <p>通过别名查询设备列表</p>
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
     * <p>通过别名查询设备列表</p>
     * 
     * @param request QueryDevicesByAliasRequest
     * @return QueryDevicesByAliasResponse
     */
    public QueryDevicesByAliasResponse queryDevicesByAlias(QueryDevicesByAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDevicesByAliasWithOptions(request, runtime);
    }

    /**
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
     * @param request QueryPushRecordsRequest
     * @return QueryPushRecordsResponse
     */
    public QueryPushRecordsResponse queryPushRecords(QueryPushRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPushRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>App维度推送统计</p>
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
     * <p>App维度推送统计</p>
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
     * <p>任务维度推送统计</p>
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
     * <p>任务维度推送统计</p>
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
     * <p>查询标签列表</p>
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
     * <p>查询标签列表</p>
     * 
     * @param request QueryTagsRequest
     * @return QueryTagsResponse
     */
    public QueryTagsResponse queryTags(QueryTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>去重设备统计</p>
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
     * <b>summary</b> : 
     * <p>去重设备统计</p>
     * 
     * @param request QueryUniqueDeviceStatRequest
     * @return QueryUniqueDeviceStatResponse
     */
    public QueryUniqueDeviceStatResponse queryUniqueDeviceStat(QueryUniqueDeviceStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUniqueDeviceStatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除标签</p>
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
     * <b>summary</b> : 
     * <p>删除标签</p>
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
     * <p>解绑别名</p>
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
     * <p>解绑别名</p>
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
     * <p>解绑手机号码</p>
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
     * <p>解绑手机号码</p>
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
     * <p>绑定标签</p>
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
     * <p>绑定标签</p>
     * 
     * @param request UnbindTagRequest
     * @return UnbindTagResponse
     */
    public UnbindTagResponse unbindTag(UnbindTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindTagWithOptions(request, runtime);
    }
}

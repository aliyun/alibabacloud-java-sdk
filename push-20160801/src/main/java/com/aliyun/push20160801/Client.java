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

    public BindAliasResponse bindAlias(BindAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAliasWithOptions(request, runtime);
    }

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

    public BindPhoneResponse bindPhone(BindPhoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindPhoneWithOptions(request, runtime);
    }

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

    public BindTagResponse bindTag(BindTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindTagWithOptions(request, runtime);
    }

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

    public CancelPushResponse cancelPush(CancelPushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelPushWithOptions(request, runtime);
    }

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

    public CheckCertificateResponse checkCertificate(CheckCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkCertificateWithOptions(request, runtime);
    }

    /**
      * @deprecated
      *
      * @param request CheckDeviceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CheckDeviceResponse
     */
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
      * @deprecated
      *
      * @param request CheckDeviceRequest
      * @return CheckDeviceResponse
     */
    // Deprecated
    public CheckDeviceResponse checkDevice(CheckDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDeviceWithOptions(request, runtime);
    }

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

    public CheckDevicesResponse checkDevices(CheckDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDevicesWithOptions(request, runtime);
    }

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

    public CompleteContinuouslyPushResponse completeContinuouslyPush(CompleteContinuouslyPushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.completeContinuouslyPushWithOptions(request, runtime);
    }

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

    public ContinuouslyPushResponse continuouslyPush(ContinuouslyPushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.continuouslyPushWithOptions(request, runtime);
    }

    /**
      * @deprecated
      *
      * @param request ListSummaryAppsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListSummaryAppsResponse
     */
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
      * @deprecated
      *
      * @return ListSummaryAppsResponse
     */
    // Deprecated
    public ListSummaryAppsResponse listSummaryApps() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSummaryAppsWithOptions(runtime);
    }

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

    public ListTagsResponse listTags(ListTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagsWithOptions(request, runtime);
    }

    public MassPushResponse massPushWithOptions(MassPushRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
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

    public MassPushResponse massPush(MassPushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.massPushWithOptions(request, runtime);
    }

    public PushResponse pushWithOptions(PushRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidActivity)) {
            query.put("AndroidActivity", request.androidActivity);
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

        if (!com.aliyun.teautil.Common.isUnset(request.androidMessageHuaweiCategory)) {
            query.put("AndroidMessageHuaweiCategory", request.androidMessageHuaweiCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidMessageHuaweiUrgency)) {
            query.put("AndroidMessageHuaweiUrgency", request.androidMessageHuaweiUrgency);
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

        if (!com.aliyun.teautil.Common.isUnset(request.androidVivoPushMode)) {
            query.put("AndroidVivoPushMode", request.androidVivoPushMode);
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

    public PushResponse push(PushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushWithOptions(request, runtime);
    }

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

    public PushMessageToAndroidResponse pushMessageToAndroid(PushMessageToAndroidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushMessageToAndroidWithOptions(request, runtime);
    }

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

    public PushMessageToiOSResponse pushMessageToiOS(PushMessageToiOSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushMessageToiOSWithOptions(request, runtime);
    }

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

    public PushNoticeToAndroidResponse pushNoticeToAndroid(PushNoticeToAndroidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushNoticeToAndroidWithOptions(request, runtime);
    }

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

    public PushNoticeToiOSResponse pushNoticeToiOS(PushNoticeToiOSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushNoticeToiOSWithOptions(request, runtime);
    }

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

    public QueryAliasesResponse queryAliases(QueryAliasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAliasesWithOptions(request, runtime);
    }

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

    public QueryDeviceInfoResponse queryDeviceInfo(QueryDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceInfoWithOptions(request, runtime);
    }

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

    public QueryDeviceStatResponse queryDeviceStat(QueryDeviceStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceStatWithOptions(request, runtime);
    }

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

    public QueryDevicesByAccountResponse queryDevicesByAccount(QueryDevicesByAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDevicesByAccountWithOptions(request, runtime);
    }

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

    public QueryDevicesByAliasResponse queryDevicesByAlias(QueryDevicesByAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDevicesByAliasWithOptions(request, runtime);
    }

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

    public QueryPushRecordsResponse queryPushRecords(QueryPushRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPushRecordsWithOptions(request, runtime);
    }

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

    public QueryPushStatByAppResponse queryPushStatByApp(QueryPushStatByAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPushStatByAppWithOptions(request, runtime);
    }

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

    public QueryPushStatByMsgResponse queryPushStatByMsg(QueryPushStatByMsgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPushStatByMsgWithOptions(request, runtime);
    }

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

    public QueryTagsResponse queryTags(QueryTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTagsWithOptions(request, runtime);
    }

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

    public QueryUniqueDeviceStatResponse queryUniqueDeviceStat(QueryUniqueDeviceStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUniqueDeviceStatWithOptions(request, runtime);
    }

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

    public RemoveTagResponse removeTag(RemoveTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTagWithOptions(request, runtime);
    }

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

    public UnbindAliasResponse unbindAlias(UnbindAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindAliasWithOptions(request, runtime);
    }

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

    public UnbindPhoneResponse unbindPhone(UnbindPhoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindPhoneWithOptions(request, runtime);
    }

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

    public UnbindTagResponse unbindTag(UnbindTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindTagWithOptions(request, runtime);
    }
}

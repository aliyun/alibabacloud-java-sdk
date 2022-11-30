// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225;

import com.aliyun.tea.*;
import com.aliyun.umeng_push20220225.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("umeng-push", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public SendByDeviceResponse sendByDevice(SendByDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendByDeviceWithOptions(request, headers, runtime);
    }

    public SendByDeviceResponse sendByDeviceWithOptions(SendByDeviceRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendByDeviceShrinkRequest request = new SendByDeviceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.androidPayload)) {
            request.androidPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.androidPayload, "AndroidPayload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.channelProperties)) {
            request.channelPropertiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.channelProperties, "ChannelProperties", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.iosPayload)) {
            request.iosPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.iosPayload, "IosPayload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.policy)) {
            request.policyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.policy, "Policy", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidPayloadShrink)) {
            body.put("AndroidPayload", request.androidPayloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelPropertiesShrink)) {
            body.put("ChannelProperties", request.channelPropertiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceTokens)) {
            body.put("DeviceTokens", request.deviceTokens);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iosPayloadShrink)) {
            body.put("IosPayload", request.iosPayloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyShrink)) {
            body.put("Policy", request.policyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productionMode)) {
            body.put("ProductionMode", request.productionMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiptType)) {
            body.put("ReceiptType", request.receiptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiptUrl)) {
            body.put("ReceiptUrl", request.receiptUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendByDevice"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/SendByDevice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendByDeviceResponse());
    }
}

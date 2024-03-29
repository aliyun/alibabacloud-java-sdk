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

    public CancelByMsgIdResponse cancelByMsgIdWithOptions(CancelByMsgIdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            body.put("MsgId", request.msgId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelByMsgId"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/CancelByMsgId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelByMsgIdResponse());
    }

    public CancelByMsgIdResponse cancelByMsgId(CancelByMsgIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelByMsgIdWithOptions(request, headers, runtime);
    }

    public QueryMsgStatResponse queryMsgStatWithOptions(QueryMsgStatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            body.put("MsgId", request.msgId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMsgStat"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/QueryMsgStat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMsgStatResponse());
    }

    public QueryMsgStatResponse queryMsgStat(QueryMsgStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMsgStatWithOptions(request, headers, runtime);
    }

    public SendByAliasResponse sendByAliasWithOptions(SendByAliasRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendByAliasShrinkRequest request = new SendByAliasShrinkRequest();
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
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            body.put("Alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliasType)) {
            body.put("AliasType", request.aliasType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidPayloadShrink)) {
            body.put("AndroidPayload", request.androidPayloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelPropertiesShrink)) {
            body.put("ChannelProperties", request.channelPropertiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
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

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyId)) {
            body.put("ThirdPartyId", request.thirdPartyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendByAlias"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/SendByAlias"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendByAliasResponse());
    }

    public SendByAliasResponse sendByAlias(SendByAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendByAliasWithOptions(request, headers, runtime);
    }

    public SendByAliasFileIdResponse sendByAliasFileIdWithOptions(SendByAliasFileIdRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendByAliasFileIdShrinkRequest request = new SendByAliasFileIdShrinkRequest();
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
        if (!com.aliyun.teautil.Common.isUnset(request.aliasType)) {
            body.put("AliasType", request.aliasType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidPayloadShrink)) {
            body.put("AndroidPayload", request.androidPayloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelPropertiesShrink)) {
            body.put("ChannelProperties", request.channelPropertiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
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
            new TeaPair("action", "SendByAliasFileId"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/SendByAliasFileId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendByAliasFileIdResponse());
    }

    public SendByAliasFileIdResponse sendByAliasFileId(SendByAliasFileIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendByAliasFileIdWithOptions(request, headers, runtime);
    }

    public SendByAppResponse sendByAppWithOptions(SendByAppRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendByAppShrinkRequest request = new SendByAppShrinkRequest();
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
            new TeaPair("action", "SendByApp"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/SendByApp"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendByAppResponse());
    }

    public SendByAppResponse sendByApp(SendByAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendByAppWithOptions(request, headers, runtime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyId)) {
            body.put("ThirdPartyId", request.thirdPartyId);
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

    public SendByDeviceResponse sendByDevice(SendByDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendByDeviceWithOptions(request, headers, runtime);
    }

    public SendByDeviceFileIdResponse sendByDeviceFileIdWithOptions(SendByDeviceFileIdRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendByDeviceFileIdShrinkRequest request = new SendByDeviceFileIdShrinkRequest();
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

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
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
            new TeaPair("action", "SendByDeviceFileId"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/SendByDeviceFileId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendByDeviceFileIdResponse());
    }

    public SendByDeviceFileIdResponse sendByDeviceFileId(SendByDeviceFileIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendByDeviceFileIdWithOptions(request, headers, runtime);
    }

    public SendByFilterResponse sendByFilterWithOptions(SendByFilterRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendByFilterShrinkRequest request = new SendByFilterShrinkRequest();
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

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
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
            new TeaPair("action", "SendByFilter"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/SendByFilter"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendByFilterResponse());
    }

    public SendByFilterResponse sendByFilter(SendByFilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendByFilterWithOptions(request, headers, runtime);
    }

    public UploadDeviceResponse uploadDeviceWithOptions(UploadDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceTokens)) {
            body.put("DeviceTokens", request.deviceTokens);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadDevice"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/UploadDevice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadDeviceResponse());
    }

    public UploadDeviceResponse uploadDevice(UploadDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadDeviceWithOptions(request, headers, runtime);
    }
}

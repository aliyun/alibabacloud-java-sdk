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

    /**
     * <b>summary</b> : 
     * <p>根据消息ID取消发送</p>
     * 
     * @param request CancelByMsgIdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelByMsgIdResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>根据消息ID取消发送</p>
     * 
     * @param request CancelByMsgIdRequest
     * @return CancelByMsgIdResponse
     */
    public CancelByMsgIdResponse cancelByMsgId(CancelByMsgIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelByMsgIdWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>消息状态查询</p>
     * 
     * @param request QueryMsgStatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMsgStatResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>消息状态查询</p>
     * 
     * @param request QueryMsgStatRequest
     * @return QueryMsgStatResponse
     */
    public QueryMsgStatResponse queryMsgStat(QueryMsgStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMsgStatWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>指定别名发送</p>
     * 
     * @param tmpReq SendByAliasRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendByAliasResponse
     */
    public SendByAliasResponse sendByAliasWithOptions(SendByAliasRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendByAliasShrinkRequest request = new SendByAliasShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.androidPayload)) {
            request.androidPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.androidPayload, "AndroidPayload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.androidShortPayload)) {
            request.androidShortPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.androidShortPayload, "AndroidShortPayload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.channelProperties)) {
            request.channelPropertiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.channelProperties, "ChannelProperties", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.harmonyPayload)) {
            request.harmonyPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.harmonyPayload, "HarmonyPayload", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.androidShortPayloadShrink)) {
            body.put("AndroidShortPayload", request.androidShortPayloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelPropertiesShrink)) {
            body.put("ChannelProperties", request.channelPropertiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyPayloadShrink)) {
            body.put("HarmonyPayload", request.harmonyPayloadShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.callbackParams)) {
            body.put("callbackParams", request.callbackParams);
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

    /**
     * <b>summary</b> : 
     * <p>指定别名发送</p>
     * 
     * @param request SendByAliasRequest
     * @return SendByAliasResponse
     */
    public SendByAliasResponse sendByAlias(SendByAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendByAliasWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>指定别名文件发送</p>
     * 
     * @param tmpReq SendByAliasFileIdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendByAliasFileIdResponse
     */
    public SendByAliasFileIdResponse sendByAliasFileIdWithOptions(SendByAliasFileIdRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendByAliasFileIdShrinkRequest request = new SendByAliasFileIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.androidPayload)) {
            request.androidPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.androidPayload, "AndroidPayload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.androidShortPayload)) {
            request.androidShortPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.androidShortPayload, "AndroidShortPayload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.channelProperties)) {
            request.channelPropertiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.channelProperties, "ChannelProperties", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.harmonyPayload)) {
            request.harmonyPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.harmonyPayload, "HarmonyPayload", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.androidShortPayloadShrink)) {
            body.put("AndroidShortPayload", request.androidShortPayloadShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyPayloadShrink)) {
            body.put("HarmonyPayload", request.harmonyPayloadShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.callbackParams)) {
            body.put("callbackParams", request.callbackParams);
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

    /**
     * <b>summary</b> : 
     * <p>指定别名文件发送</p>
     * 
     * @param request SendByAliasFileIdRequest
     * @return SendByAliasFileIdResponse
     */
    public SendByAliasFileIdResponse sendByAliasFileId(SendByAliasFileIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendByAliasFileIdWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>广播</p>
     * 
     * @param tmpReq SendByAppRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendByAppResponse
     */
    public SendByAppResponse sendByAppWithOptions(SendByAppRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendByAppShrinkRequest request = new SendByAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.androidPayload)) {
            request.androidPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.androidPayload, "AndroidPayload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.androidShortPayload)) {
            request.androidShortPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.androidShortPayload, "AndroidShortPayload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.channelProperties)) {
            request.channelPropertiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.channelProperties, "ChannelProperties", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.harmonyPayload)) {
            request.harmonyPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.harmonyPayload, "HarmonyPayload", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.androidShortPayloadShrink)) {
            body.put("AndroidShortPayload", request.androidShortPayloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelPropertiesShrink)) {
            body.put("ChannelProperties", request.channelPropertiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyPayloadShrink)) {
            body.put("HarmonyPayload", request.harmonyPayloadShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.callbackParams)) {
            body.put("callbackParams", request.callbackParams);
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

    /**
     * <b>summary</b> : 
     * <p>广播</p>
     * 
     * @param request SendByAppRequest
     * @return SendByAppResponse
     */
    public SendByAppResponse sendByApp(SendByAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendByAppWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>指定设备发送</p>
     * 
     * @param tmpReq SendByDeviceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendByDeviceResponse
     */
    public SendByDeviceResponse sendByDeviceWithOptions(SendByDeviceRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendByDeviceShrinkRequest request = new SendByDeviceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.androidPayload)) {
            request.androidPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.androidPayload, "AndroidPayload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.androidShortPayload)) {
            request.androidShortPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.androidShortPayload, "AndroidShortPayload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.channelProperties)) {
            request.channelPropertiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.channelProperties, "ChannelProperties", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.harmonyPayload)) {
            request.harmonyPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.harmonyPayload, "HarmonyPayload", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.androidShortPayloadShrink)) {
            body.put("AndroidShortPayload", request.androidShortPayloadShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyPayloadShrink)) {
            body.put("HarmonyPayload", request.harmonyPayloadShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.callbackParams)) {
            body.put("callbackParams", request.callbackParams);
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

    /**
     * <b>summary</b> : 
     * <p>指定设备发送</p>
     * 
     * @param request SendByDeviceRequest
     * @return SendByDeviceResponse
     */
    public SendByDeviceResponse sendByDevice(SendByDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendByDeviceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>指定设备文件发送</p>
     * 
     * @param tmpReq SendByDeviceFileIdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendByDeviceFileIdResponse
     */
    public SendByDeviceFileIdResponse sendByDeviceFileIdWithOptions(SendByDeviceFileIdRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendByDeviceFileIdShrinkRequest request = new SendByDeviceFileIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.androidPayload)) {
            request.androidPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.androidPayload, "AndroidPayload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.androidShortPayload)) {
            request.androidShortPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.androidShortPayload, "AndroidShortPayload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.channelProperties)) {
            request.channelPropertiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.channelProperties, "ChannelProperties", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.harmonyPayload)) {
            request.harmonyPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.harmonyPayload, "HarmonyPayload", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.androidShortPayloadShrink)) {
            body.put("AndroidShortPayload", request.androidShortPayloadShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyPayloadShrink)) {
            body.put("HarmonyPayload", request.harmonyPayloadShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.callbackParams)) {
            body.put("callbackParams", request.callbackParams);
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

    /**
     * <b>summary</b> : 
     * <p>指定设备文件发送</p>
     * 
     * @param request SendByDeviceFileIdRequest
     * @return SendByDeviceFileIdResponse
     */
    public SendByDeviceFileIdResponse sendByDeviceFileId(SendByDeviceFileIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendByDeviceFileIdWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据筛选条件发送</p>
     * 
     * @param tmpReq SendByFilterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendByFilterResponse
     */
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.harmonyPayload)) {
            request.harmonyPayloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.harmonyPayload, "HarmonyPayload", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.androidShortPayload)) {
            body.put("AndroidShortPayload", request.androidShortPayload);
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

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyPayloadShrink)) {
            body.put("HarmonyPayload", request.harmonyPayloadShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.callbackParams)) {
            body.put("callbackParams", request.callbackParams);
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

    /**
     * <b>summary</b> : 
     * <p>根据筛选条件发送</p>
     * 
     * @param request SendByFilterRequest
     * @return SendByFilterResponse
     */
    public SendByFilterResponse sendByFilter(SendByFilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendByFilterWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上传设备列表创建设备文件</p>
     * 
     * @param request UploadDeviceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadDeviceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>上传设备列表创建设备文件</p>
     * 
     * @param request UploadDeviceRequest
     * @return UploadDeviceResponse
     */
    public UploadDeviceResponse uploadDevice(UploadDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadDeviceWithOptions(request, headers, runtime);
    }
}

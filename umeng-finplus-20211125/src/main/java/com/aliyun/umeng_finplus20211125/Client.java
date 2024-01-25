// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211125;

import com.aliyun.tea.*;
import com.aliyun.umeng_finplus20211125.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("umeng-finplus", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetMessageStatusResponse getMessageStatusWithOptions(GetMessageStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMessageStatus"),
            new TeaPair("version", "2021-11-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sms/message/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMessageStatusResponse());
    }

    public GetMessageStatusResponse getMessageStatus(GetMessageStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMessageStatusWithOptions(request, headers, runtime);
    }

    public SendBatchMessageResponse sendBatchMessageWithOptions(SendBatchMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchFlag)) {
            body.put("BatchFlag", request.batchFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendInfo)) {
            body.put("ExtendInfo", request.extendInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idType)) {
            body.put("IdType", request.idType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumberJson)) {
            body.put("PhoneNumberJson", request.phoneNumberJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signNameJson)) {
            body.put("SignNameJson", request.signNameJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specificChannel)) {
            body.put("SpecificChannel", request.specificChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            body.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateParamJson)) {
            body.put("TemplateParamJson", request.templateParamJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendBatchMessage"),
            new TeaPair("version", "2021-11-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sms/message/send"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendBatchMessageResponse());
    }

    public SendBatchMessageResponse sendBatchMessage(SendBatchMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendBatchMessageWithOptions(request, headers, runtime);
    }
}

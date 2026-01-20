// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.thirdswaicall20251127;

import com.aliyun.tea.*;
import com.aliyun.thirdswaicall20251127.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("thirdswaicall", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>外呼任务通话列表查询</p>
     * 
     * @param tmpReq ReadOutboundTaskCallListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadOutboundTaskCallListResponse
     */
    public ReadOutboundTaskCallListResponse readOutboundTaskCallListWithOptions(ReadOutboundTaskCallListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReadOutboundTaskCallListShrinkRequest request = new ReadOutboundTaskCallListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.displayStatusList)) {
            request.displayStatusListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.displayStatusList, "DisplayStatusList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labelTags)) {
            request.labelTagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labelTags, "LabelTags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerNameOrPhone)) {
            body.put("CustomerNameOrPhone", request.customerNameOrPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayStatusListShrink)) {
            body.put("DisplayStatusList", request.displayStatusListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelTagsShrink)) {
            body.put("LabelTags", request.labelTagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReadOutboundTaskCallList"),
            new TeaPair("version", "2025-11-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadOutboundTaskCallListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>外呼任务通话列表查询</p>
     * 
     * @param request ReadOutboundTaskCallListRequest
     * @return ReadOutboundTaskCallListResponse
     */
    public ReadOutboundTaskCallListResponse readOutboundTaskCallList(ReadOutboundTaskCallListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readOutboundTaskCallListWithOptions(request, runtime);
    }
}

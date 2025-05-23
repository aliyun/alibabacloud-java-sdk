// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuyingsolutionframework20230810;

import com.aliyun.tea.*;
import com.aliyun.wuyingsolutionframework20230810.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("wuyingsolutionframework", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>发送运维消息</p>
     * 
     * @param request SendOpsMessageToTerminalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendOpsMessageToTerminalResponse
     */
    public SendOpsMessageToTerminalResponse sendOpsMessageToTerminalWithOptions(SendOpsMessageToTerminalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messageBody)) {
            query.put("MessageBody", request.messageBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeRegionId)) {
            query.put("OfficeRegionId", request.officeRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opsAction)) {
            query.put("OpsAction", request.opsAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            query.put("SerialNo", request.serialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitForAck)) {
            query.put("WaitForAck", request.waitForAck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitForMsg)) {
            query.put("WaitForMsg", request.waitForMsg);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendOpsMessageToTerminal"),
            new TeaPair("version", "2023-08-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendOpsMessageToTerminalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发送运维消息</p>
     * 
     * @param request SendOpsMessageToTerminalRequest
     * @return SendOpsMessageToTerminalResponse
     */
    public SendOpsMessageToTerminalResponse sendOpsMessageToTerminal(SendOpsMessageToTerminalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendOpsMessageToTerminalWithOptions(request, runtime);
    }
}

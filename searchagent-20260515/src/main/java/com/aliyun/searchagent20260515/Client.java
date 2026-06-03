// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchagent20260515;

import com.aliyun.tea.*;
import com.aliyun.searchagent20260515.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "SearchAgent";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "";
    }


    /**
     * <b>summary</b> : 
     * <p>search agent acp 接口</p>
     * 
     * @param request ExecuteAcpCommandRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteAcpCommandResponse
     */
    public ExecuteAcpCommandResponse executeAcpCommandWithOptions(String workspaceName, ExecuteAcpCommandRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentName)) {
            body.put("agentName", request.agentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonrpc)) {
            body.put("jsonrpc", request.jsonrpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            body.put("method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteAcpCommand"),
            new TeaPair("version", "2026-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/agent/acp"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ExecuteAcpCommandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>search agent acp 接口</p>
     * 
     * @param request ExecuteAcpCommandRequest
     * @return ExecuteAcpCommandResponse
     */
    public ExecuteAcpCommandResponse executeAcpCommand(String workspaceName, ExecuteAcpCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeAcpCommandWithOptions(workspaceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成 acp stream</p>
     * 
     * @param request GenerateAcpCompletionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateAcpCompletionResponse
     */
    public GenerateAcpCompletionResponse generateAcpCompletionWithOptions(String workspaceName, GenerateAcpCompletionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentName)) {
            body.put("agentName", request.agentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonrpc)) {
            body.put("jsonrpc", request.jsonrpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            body.put("method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateAcpCompletion"),
            new TeaPair("version", "2026-05-15"),
            new TeaPair("protocol", "SSE"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/agent/acp"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GenerateAcpCompletionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成 acp stream</p>
     * 
     * @param request GenerateAcpCompletionRequest
     * @return GenerateAcpCompletionResponse
     */
    public GenerateAcpCompletionResponse generateAcpCompletion(String workspaceName, GenerateAcpCompletionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateAcpCompletionWithOptions(workspaceName, request, headers, runtime);
    }
}

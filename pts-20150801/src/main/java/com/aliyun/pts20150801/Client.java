// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801;

import com.aliyun.tea.*;
import com.aliyun.pts20150801.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("pts", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
      * @deprecated
      *
      * @param request CreateTransactionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateTransactionResponse
     */
    // Deprecated
    public CreateTransactionResponse createTransactionWithOptions(CreateTransactionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionName)) {
            query.put("TransactionName", request.transactionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransaction"),
            new TeaPair("version", "2015-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransactionResponse());
    }

    /**
      * @deprecated
      *
      * @param request CreateTransactionRequest
      * @return CreateTransactionResponse
     */
    // Deprecated
    public CreateTransactionResponse createTransaction(CreateTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTransactionWithOptions(request, runtime);
    }

    /**
      * @deprecated
      *
      * @param request GetKeySecretRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetKeySecretResponse
     */
    // Deprecated
    public GetKeySecretResponse getKeySecretWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKeySecret"),
            new TeaPair("version", "2015-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKeySecretResponse());
    }

    /**
      * @deprecated
      *
      * @return GetKeySecretResponse
     */
    // Deprecated
    public GetKeySecretResponse getKeySecret() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKeySecretWithOptions(runtime);
    }

    /**
      * @deprecated
      *
      * @param request GetScriptRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetScriptResponse
     */
    // Deprecated
    public GetScriptResponse getScriptWithOptions(GetScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tfsname)) {
            query.put("Tfsname", request.tfsname);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScript"),
            new TeaPair("version", "2015-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScriptResponse());
    }

    /**
      * @deprecated
      *
      * @param request GetScriptRequest
      * @return GetScriptResponse
     */
    // Deprecated
    public GetScriptResponse getScript(GetScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScriptWithOptions(request, runtime);
    }

    /**
      * @deprecated
      *
      * @param request GetTasksRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetTasksResponse
     */
    // Deprecated
    public GetTasksResponse getTasksWithOptions(GetTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTasks"),
            new TeaPair("version", "2015-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTasksResponse());
    }

    /**
      * @deprecated
      *
      * @param request GetTasksRequest
      * @return GetTasksResponse
     */
    // Deprecated
    public GetTasksResponse getTasks(GetTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTasksWithOptions(request, runtime);
    }

    /**
      * @deprecated
      *
      * @param request ReportLogSampleRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ReportLogSampleResponse
     */
    // Deprecated
    public ReportLogSampleResponse reportLogSampleWithOptions(ReportLogSampleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logSample)) {
            query.put("LogSample", request.logSample);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wskey)) {
            query.put("Wskey", request.wskey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportLogSample"),
            new TeaPair("version", "2015-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportLogSampleResponse());
    }

    /**
      * @deprecated
      *
      * @param request ReportLogSampleRequest
      * @return ReportLogSampleResponse
     */
    // Deprecated
    public ReportLogSampleResponse reportLogSample(ReportLogSampleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reportLogSampleWithOptions(request, runtime);
    }

    /**
      * @deprecated
      *
      * @param request ReportTestSampleRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ReportTestSampleResponse
     */
    // Deprecated
    public ReportTestSampleResponse reportTestSampleWithOptions(ReportTestSampleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.testSample)) {
            query.put("TestSample", request.testSample);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportTestSample"),
            new TeaPair("version", "2015-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportTestSampleResponse());
    }

    /**
      * @deprecated
      *
      * @param request ReportTestSampleRequest
      * @return ReportTestSampleResponse
     */
    // Deprecated
    public ReportTestSampleResponse reportTestSample(ReportTestSampleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reportTestSampleWithOptions(request, runtime);
    }

    /**
      * @deprecated
      *
      * @param request ReportVuserRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ReportVuserResponse
     */
    // Deprecated
    public ReportVuserResponse reportVuserWithOptions(ReportVuserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreated)) {
            query.put("GmtCreated", request.gmtCreated);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vuser)) {
            query.put("Vuser", request.vuser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wskey)) {
            query.put("Wskey", request.wskey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportVuser"),
            new TeaPair("version", "2015-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportVuserResponse());
    }

    /**
      * @deprecated
      *
      * @param request ReportVuserRequest
      * @return ReportVuserResponse
     */
    // Deprecated
    public ReportVuserResponse reportVuser(ReportVuserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reportVuserWithOptions(request, runtime);
    }

    /**
      * @deprecated
      *
      * @param tmpReq SendWangWangRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SendWangWangResponse
     */
    // Deprecated
    public SendWangWangResponse sendWangWangWithOptions(SendWangWangRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendWangWangShrinkRequest request = new SendWangWangShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.to)) {
            request.toShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.to, "To", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.msg)) {
            query.put("Msg", request.msg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toShrink)) {
            query.put("To", request.toShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendWangWang"),
            new TeaPair("version", "2015-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendWangWangResponse());
    }

    /**
      * @deprecated
      *
      * @param request SendWangWangRequest
      * @return SendWangWangResponse
     */
    // Deprecated
    public SendWangWangResponse sendWangWang(SendWangWangRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendWangWangWithOptions(request, runtime);
    }

    /**
      * @deprecated
      *
      * @param request SetScenarioStatusRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetScenarioStatusResponse
     */
    // Deprecated
    public SetScenarioStatusResponse setScenarioStatusWithOptions(SetScenarioStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeIp)) {
            query.put("NodeIp", request.nodeIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wskey)) {
            query.put("Wskey", request.wskey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetScenarioStatus"),
            new TeaPair("version", "2015-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetScenarioStatusResponse());
    }

    /**
      * @deprecated
      *
      * @param request SetScenarioStatusRequest
      * @return SetScenarioStatusResponse
     */
    // Deprecated
    public SetScenarioStatusResponse setScenarioStatus(SetScenarioStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setScenarioStatusWithOptions(request, runtime);
    }

    /**
      * @deprecated
      *
      * @param request SetTaskStatusRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetTaskStatusResponse
     */
    // Deprecated
    public SetTaskStatusResponse setTaskStatusWithOptions(SetTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wskey)) {
            query.put("Wskey", request.wskey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetTaskStatus"),
            new TeaPair("version", "2015-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetTaskStatusResponse());
    }

    /**
      * @deprecated
      *
      * @param request SetTaskStatusRequest
      * @return SetTaskStatusResponse
     */
    // Deprecated
    public SetTaskStatusResponse setTaskStatus(SetTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setTaskStatusWithOptions(request, runtime);
    }

    /**
      * @deprecated
      *
      * @param request StopTaskRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return StopTaskResponse
     */
    // Deprecated
    public StopTaskResponse stopTaskWithOptions(StopTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.msg)) {
            query.put("Msg", request.msg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopTask"),
            new TeaPair("version", "2015-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopTaskResponse());
    }

    /**
      * @deprecated
      *
      * @param request StopTaskRequest
      * @return StopTaskResponse
     */
    // Deprecated
    public StopTaskResponse stopTask(StopTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopTaskWithOptions(request, runtime);
    }
}

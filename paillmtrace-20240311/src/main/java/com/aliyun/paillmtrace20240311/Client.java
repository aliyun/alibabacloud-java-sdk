// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311;

import com.aliyun.tea.*;
import com.aliyun.paillmtrace20240311.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("paillmtrace", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Creates a trace evaluation task. The system will sample some data from the user\&quot;s trace data based on the task\&quot;s configuration. Then, an LLM is used to evaluate the performance of these traces, and the evaluation results are recorded.</p>
     * 
     * @param tmpReq CreateOnlineEvalTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOnlineEvalTaskResponse
     */
    public CreateOnlineEvalTaskResponse createOnlineEvalTaskWithOptions(CreateOnlineEvalTaskRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateOnlineEvalTaskShrinkRequest request = new CreateOnlineEvalTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            query.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOnlineEvalTask"),
            new TeaPair("version", "2024-03-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/PAILLMTrace/onlineevaltasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOnlineEvalTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a trace evaluation task. The system will sample some data from the user\&quot;s trace data based on the task\&quot;s configuration. Then, an LLM is used to evaluate the performance of these traces, and the evaluation results are recorded.</p>
     * 
     * @param request CreateOnlineEvalTaskRequest
     * @return CreateOnlineEvalTaskResponse
     */
    public CreateOnlineEvalTaskResponse createOnlineEvalTask(CreateOnlineEvalTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOnlineEvalTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service-linked role required for the PaiLLMTrace service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceIdentityRoleResponse
     */
    public CreateServiceIdentityRoleResponse createServiceIdentityRoleWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceIdentityRole"),
            new TeaPair("version", "2024-03-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/PAILLMTrace/ServiceIdentityRole"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceIdentityRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service-linked role required for the PaiLLMTrace service.</p>
     * @return CreateServiceIdentityRoleResponse
     */
    public CreateServiceIdentityRoleResponse createServiceIdentityRole() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceIdentityRoleWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete an online evaluation task</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOnlineEvalTaskResponse
     */
    public DeleteOnlineEvalTaskResponse deleteOnlineEvalTaskWithOptions(String TaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOnlineEvalTask"),
            new TeaPair("version", "2024-03-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/PAILLMTrace/onlineevaltasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOnlineEvalTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete an online evaluation task</p>
     * @return DeleteOnlineEvalTaskResponse
     */
    public DeleteOnlineEvalTaskResponse deleteOnlineEvalTask(String TaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteOnlineEvalTaskWithOptions(TaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Evaluates a specified piece of trace data.</p>
     * 
     * @param request EvaluateTraceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EvaluateTraceResponse
     */
    public EvaluateTraceResponse evaluateTraceWithOptions(String TraceId, EvaluateTraceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationConfig)) {
            body.put("EvaluationConfig", request.evaluationConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationId)) {
            body.put("EvaluationId", request.evaluationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxTime)) {
            body.put("MaxTime", request.maxTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minTime)) {
            body.put("MinTime", request.minTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelConfig)) {
            body.put("ModelConfig", request.modelConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EvaluateTrace"),
            new TeaPair("version", "2024-03-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/PAILLMTrace/eval/trace/" + com.aliyun.openapiutil.Client.getEncodeParam(TraceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EvaluateTraceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Evaluates a specified piece of trace data.</p>
     * 
     * @param request EvaluateTraceRequest
     * @return EvaluateTraceResponse
     */
    public EvaluateTraceResponse evaluateTrace(String TraceId, EvaluateTraceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.evaluateTraceWithOptions(TraceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get the content of prompt templates used for evaluation</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEvaluationTemplatesResponse
     */
    public GetEvaluationTemplatesResponse getEvaluationTemplatesWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEvaluationTemplates"),
            new TeaPair("version", "2024-03-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/PAILLMTrace/eval/templates"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEvaluationTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get the content of prompt templates used for evaluation</p>
     * @return GetEvaluationTemplatesResponse
     */
    public GetEvaluationTemplatesResponse getEvaluationTemplates() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEvaluationTemplatesWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get the details of an online evaluation task</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOnlineEvalTaskResponse
     */
    public GetOnlineEvalTaskResponse getOnlineEvalTaskWithOptions(String TaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOnlineEvalTask"),
            new TeaPair("version", "2024-03-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/PAILLMTrace/onlineevaltasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOnlineEvalTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get the details of an online evaluation task</p>
     * @return GetOnlineEvalTaskResponse
     */
    public GetOnlineEvalTaskResponse getOnlineEvalTask(String TaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOnlineEvalTaskWithOptions(TaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the information related to the service-linked role.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceIdentityRoleResponse
     */
    public GetServiceIdentityRoleResponse getServiceIdentityRoleWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceIdentityRole"),
            new TeaPair("version", "2024-03-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/PAILLMTrace/ServiceIdentityRole"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceIdentityRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the information related to the service-linked role.</p>
     * @return GetServiceIdentityRoleResponse
     */
    public GetServiceIdentityRoleResponse getServiceIdentityRole() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceIdentityRoleWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the token used in the Xtrace service and the endpoint required for uploading trace data.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetXtraceTokenResponse
     */
    public GetXtraceTokenResponse getXtraceTokenWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetXtraceToken"),
            new TeaPair("version", "2024-03-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/PAILLMTrace/XtraceToken"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetXtraceTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the token used in the Xtrace service and the endpoint required for uploading trace data.</p>
     * @return GetXtraceTokenResponse
     */
    public GetXtraceTokenResponse getXtraceToken() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getXtraceTokenWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the list of results for trace evaluation. This API is used together with EvaluateTrace. EvaluateTrace starts the evaluation. ListEvalResults obtains the results.</p>
     * 
     * @param tmpReq ListEvalResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEvalResultsResponse
     */
    public ListEvalResultsResponse listEvalResultsWithOptions(ListEvalResultsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListEvalResultsShrinkRequest request = new ListEvalResultsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.recordIds)) {
            request.recordIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.recordIds, "RecordIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.evaluationId)) {
            query.put("EvaluationId", request.evaluationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordIdsShrink)) {
            query.put("RecordIds", request.recordIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEvalResults"),
            new TeaPair("version", "2024-03-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/PAILLMTrace/eval/results"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEvalResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the list of results for trace evaluation. This API is used together with EvaluateTrace. EvaluateTrace starts the evaluation. ListEvalResults obtains the results.</p>
     * 
     * @param request ListEvalResultsRequest
     * @return ListEvalResultsResponse
     */
    public ListEvalResultsResponse listEvalResults(ListEvalResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEvalResultsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List the results of online evaluation tasks that meet the criteria</p>
     * 
     * @param tmpReq ListOnlineEvalTaskResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOnlineEvalTaskResultsResponse
     */
    public ListOnlineEvalTaskResultsResponse listOnlineEvalTaskResultsWithOptions(ListOnlineEvalTaskResultsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListOnlineEvalTaskResultsShrinkRequest request = new ListOnlineEvalTaskResultsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.traceIds)) {
            request.traceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.traceIds, "TraceIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.evaluationId)) {
            query.put("EvaluationId", request.evaluationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mostRecentResultsOnly)) {
            query.put("MostRecentResultsOnly", request.mostRecentResultsOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceIdsShrink)) {
            query.put("TraceIds", request.traceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOnlineEvalTaskResults"),
            new TeaPair("version", "2024-03-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/PAILLMTrace/onlineevaltaskresults"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOnlineEvalTaskResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List the results of online evaluation tasks that meet the criteria</p>
     * 
     * @param request ListOnlineEvalTaskResultsRequest
     * @return ListOnlineEvalTaskResultsResponse
     */
    public ListOnlineEvalTaskResultsResponse listOnlineEvalTaskResults(ListOnlineEvalTaskResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOnlineEvalTaskResultsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>View online evaluation tasks that meet the criteria</p>
     * 
     * @param request ListOnlineEvalTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOnlineEvalTasksResponse
     */
    public ListOnlineEvalTasksResponse listOnlineEvalTasksWithOptions(ListOnlineEvalTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxTime)) {
            query.put("MaxTime", request.maxTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minTime)) {
            query.put("MinTime", request.minTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOnlineEvalTasks"),
            new TeaPair("version", "2024-03-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/PAILLMTrace/onlineevaltasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOnlineEvalTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>View online evaluation tasks that meet the criteria</p>
     * 
     * @param request ListOnlineEvalTasksRequest
     * @return ListOnlineEvalTasksResponse
     */
    public ListOnlineEvalTasksResponse listOnlineEvalTasks(ListOnlineEvalTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOnlineEvalTasksWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of trace data based on specified criteria.</p>
     * 
     * @param tmpReq ListTracesDatasRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTracesDatasResponse
     */
    public ListTracesDatasResponse listTracesDatasWithOptions(ListTracesDatasRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTracesDatasShrinkRequest request = new ListTracesDatasShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filters)) {
            request.filtersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filters, "Filters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.spanIds)) {
            request.spanIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.spanIds, "SpanIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.traceIds)) {
            request.traceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.traceIds, "TraceIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filtersShrink)) {
            query.put("Filters", request.filtersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasEvents)) {
            query.put("HasEvents", request.hasEvents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasStatusMessage)) {
            query.put("HasStatusMessage", request.hasStatusMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.llmAppName)) {
            query.put("LlmAppName", request.llmAppName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDuration)) {
            query.put("MaxDuration", request.maxDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxTime)) {
            query.put("MaxTime", request.maxTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDuration)) {
            query.put("MinDuration", request.minDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minTime)) {
            query.put("MinTime", request.minTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opentelemetryCompatible)) {
            query.put("OpentelemetryCompatible", request.opentelemetryCompatible);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerSubId)) {
            query.put("OwnerSubId", request.ownerSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spanIdsShrink)) {
            query.put("SpanIds", request.spanIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spanName)) {
            query.put("SpanName", request.spanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceIdsShrink)) {
            query.put("TraceIds", request.traceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceReduceMethod)) {
            query.put("TraceReduceMethod", request.traceReduceMethod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTracesDatas"),
            new TeaPair("version", "2024-03-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/PAILLMTrace/TracesDatas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTracesDatasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of trace data based on specified criteria.</p>
     * 
     * @param request ListTracesDatasRequest
     * @return ListTracesDatasResponse
     */
    public ListTracesDatasResponse listTracesDatas(ListTracesDatasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTracesDatasWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stop the execution of an online evaluation task</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopOnlineEvalTaskResponse
     */
    public StopOnlineEvalTaskResponse stopOnlineEvalTaskWithOptions(String TaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopOnlineEvalTask"),
            new TeaPair("version", "2024-03-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/PAILLMTrace/onlineevaltasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + "/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopOnlineEvalTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stop the execution of an online evaluation task</p>
     * @return StopOnlineEvalTaskResponse
     */
    public StopOnlineEvalTaskResponse stopOnlineEvalTask(String TaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopOnlineEvalTaskWithOptions(TaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the configuration of a trace evaluation task.</p>
     * 
     * @param request UpdateOnlineEvalTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOnlineEvalTaskResponse
     */
    public UpdateOnlineEvalTaskResponse updateOnlineEvalTaskWithOptions(String TaskId, UpdateOnlineEvalTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationConfig)) {
            body.put("EvaluationConfig", request.evaluationConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            body.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelConfig)) {
            body.put("ModelConfig", request.modelConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplingFrequencyMinutes)) {
            body.put("SamplingFrequencyMinutes", request.samplingFrequencyMinutes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplingRatio)) {
            body.put("SamplingRatio", request.samplingRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOnlineEvalTask"),
            new TeaPair("version", "2024-03-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/PAILLMTrace/onlineevaltasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOnlineEvalTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the configuration of a trace evaluation task.</p>
     * 
     * @param request UpdateOnlineEvalTaskRequest
     * @return UpdateOnlineEvalTaskResponse
     */
    public UpdateOnlineEvalTaskResponse updateOnlineEvalTask(String TaskId, UpdateOnlineEvalTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateOnlineEvalTaskWithOptions(TaskId, request, headers, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102;

import com.aliyun.tea.*;
import com.aliyun.qweneduaisuite20261102.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "QwenEduAiSuite";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("qweneduaisuite", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>description</b> :
     * <p>开通千问教育API权限</p>
     * 
     * <b>summary</b> : 
     * <p>开通千问教育API权限</p>
     * 
     * @param request ActivateQwenEduApiRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActivateQwenEduApiResponse
     */
    public ActivateQwenEduApiResponse activateQwenEduApiWithOptions(ActivateQwenEduApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateQwenEduApi"),
            new TeaPair("version", "2026-11-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/service/activate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateQwenEduApiResponse());
    }

    /**
     * <b>description</b> :
     * <p>开通千问教育API权限</p>
     * 
     * <b>summary</b> : 
     * <p>开通千问教育API权限</p>
     * 
     * @param request ActivateQwenEduApiRequest
     * @return ActivateQwenEduApiResponse
     */
    public ActivateQwenEduApiResponse activateQwenEduApi(ActivateQwenEduApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.activateQwenEduApiWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于提交单页作业图片进行批改，支持通过图片URL或Base64编码的图片数据。</li>
     * <li>提交后会立即返回任务ID、矫正图及题目检测结果，但不包含具体的批改结论。</li>
     * <li>需要通过查询接口轮询获取最终的批改结果。</li>
     * <li>支持对图片进行透视矫正，默认开启。</li>
     * <li>图片要求：支持多种格式（JPEG, PNG, GIF等），推荐体积不超过1MB，最大支持15MB（Base64编码后）。</li>
     * <li>每次请求仅处理一张图片，多张图片需分别提交。</li>
     * <li><code>request_id</code>字段建议由调用方生成并传递，以便于问题排查和对账。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>提交单页作业图片，返回任务ID及初步检测结果。</p>
     * 
     * @param request CreateEduHomeworkCorrectSubmitRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEduHomeworkCorrectSubmitResponse
     */
    public CreateEduHomeworkCorrectSubmitResponse createEduHomeworkCorrectSubmitWithOptions(CreateEduHomeworkCorrectSubmitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dewarp)) {
            body.put("dewarp", request.dewarp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageBase64)) {
            body.put("imageBase64", request.imageBase64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("imageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEduHomeworkCorrectSubmit"),
            new TeaPair("version", "2026-11-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/homework/correct/submit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEduHomeworkCorrectSubmitResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于提交单页作业图片进行批改，支持通过图片URL或Base64编码的图片数据。</li>
     * <li>提交后会立即返回任务ID、矫正图及题目检测结果，但不包含具体的批改结论。</li>
     * <li>需要通过查询接口轮询获取最终的批改结果。</li>
     * <li>支持对图片进行透视矫正，默认开启。</li>
     * <li>图片要求：支持多种格式（JPEG, PNG, GIF等），推荐体积不超过1MB，最大支持15MB（Base64编码后）。</li>
     * <li>每次请求仅处理一张图片，多张图片需分别提交。</li>
     * <li><code>request_id</code>字段建议由调用方生成并传递，以便于问题排查和对账。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>提交单页作业图片，返回任务ID及初步检测结果。</p>
     * 
     * @param request CreateEduHomeworkCorrectSubmitRequest
     * @return CreateEduHomeworkCorrectSubmitResponse
     */
    public CreateEduHomeworkCorrectSubmitResponse createEduHomeworkCorrectSubmit(CreateEduHomeworkCorrectSubmitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEduHomeworkCorrectSubmitWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口支持通过单张题目图片的URL或Base64编码进行解题请求。</li>
     * <li>支持处理JPEG、JPG、PNG格式的图片，且图片大小不超过10MB，像素总数不超过260万。</li>
     * <li>请求必须携带<code>request_id</code>字段，用于链路关联和对账；建议使用UUID以保证唯一性。</li>
     * <li><code>Authorization</code>头部需包含有效的<code>appKey</code>，采用<code>Bearer &lt;appKey&gt;</code>格式。</li>
     * <li>接口响应为SSE流式数据，客户端应逐事件读取并解析，不得等待连接关闭后整体读取。</li>
     * <li>成功响应包括<code>message</code>（过程态全量解题快照）和<code>complete</code>（最终完整结果）两种事件类型。</li>
     * <li>错误处理分为建流前与建流后两个阶段，根据错误码及<code>retryable</code>字段决定是否重试。</li>
     * <li>客户端超时设置建议不低于3分钟，并确保代理层不会缓存SSE响应或提前关闭长连接。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>通过图片URL或Base64编码接收题目，返回解题过程和结果。</p>
     * 
     * @param tmpReq CreateEduProblemSolveRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEduProblemSolveResponse
     */
    public CreateEduProblemSolveResponse createEduProblemSolveWithOptions(CreateEduProblemSolveRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEduProblemSolveShrinkRequest request = new CreateEduProblemSolveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.query)) {
            request.queryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.query, "query", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queryShrink)) {
            body.put("query", request.queryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEduProblemSolve"),
            new TeaPair("version", "2026-11-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/problem/solve/stream"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEduProblemSolveResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口支持通过单张题目图片的URL或Base64编码进行解题请求。</li>
     * <li>支持处理JPEG、JPG、PNG格式的图片，且图片大小不超过10MB，像素总数不超过260万。</li>
     * <li>请求必须携带<code>request_id</code>字段，用于链路关联和对账；建议使用UUID以保证唯一性。</li>
     * <li><code>Authorization</code>头部需包含有效的<code>appKey</code>，采用<code>Bearer &lt;appKey&gt;</code>格式。</li>
     * <li>接口响应为SSE流式数据，客户端应逐事件读取并解析，不得等待连接关闭后整体读取。</li>
     * <li>成功响应包括<code>message</code>（过程态全量解题快照）和<code>complete</code>（最终完整结果）两种事件类型。</li>
     * <li>错误处理分为建流前与建流后两个阶段，根据错误码及<code>retryable</code>字段决定是否重试。</li>
     * <li>客户端超时设置建议不低于3分钟，并确保代理层不会缓存SSE响应或提前关闭长连接。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>通过图片URL或Base64编码接收题目，返回解题过程和结果。</p>
     * 
     * @param request CreateEduProblemSolveRequest
     * @return CreateEduProblemSolveResponse
     */
    public CreateEduProblemSolveResponse createEduProblemSolve(CreateEduProblemSolveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEduProblemSolveWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询批改进度、增量结果、终态结果及 Token 用量</p>
     * 
     * @param request GetEduHomeworkCorrectionResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEduHomeworkCorrectionResultResponse
     */
    public GetEduHomeworkCorrectionResultResponse getEduHomeworkCorrectionResultWithOptions(GetEduHomeworkCorrectionResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEduHomeworkCorrectionResult"),
            new TeaPair("version", "2026-11-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/homework/correct/result"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEduHomeworkCorrectionResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询批改进度、增量结果、终态结果及 Token 用量</p>
     * 
     * @param request GetEduHomeworkCorrectionResultRequest
     * @return GetEduHomeworkCorrectionResultResponse
     */
    public GetEduHomeworkCorrectionResultResponse getEduHomeworkCorrectionResult(GetEduHomeworkCorrectionResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEduHomeworkCorrectionResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>千问教育API开通状态查询</p>
     * 
     * @param request GetQwenEduApiActivationStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQwenEduApiActivationStatusResponse
     */
    public GetQwenEduApiActivationStatusResponse getQwenEduApiActivationStatusWithOptions(GetQwenEduApiActivationStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQwenEduApiActivationStatus"),
            new TeaPair("version", "2026-11-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/service/activation/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQwenEduApiActivationStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>千问教育API开通状态查询</p>
     * 
     * @param request GetQwenEduApiActivationStatusRequest
     * @return GetQwenEduApiActivationStatusResponse
     */
    public GetQwenEduApiActivationStatusResponse getQwenEduApiActivationStatus(GetQwenEduApiActivationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQwenEduApiActivationStatusWithOptions(request, headers, runtime);
    }
}

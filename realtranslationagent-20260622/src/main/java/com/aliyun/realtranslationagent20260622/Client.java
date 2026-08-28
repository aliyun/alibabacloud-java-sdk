// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.aliyun.realtranslationagent20260622.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("public", "realtranslationagent.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("realtranslationagent", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }

    public java.util.Map<String, ?> _postOSSObject(String bucketName, java.util.Map<String, ?> data, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeouted", "retry"),
            new TeaPair("key", com.aliyun.teautil.Common.defaultString(runtime.key, _key)),
            new TeaPair("cert", com.aliyun.teautil.Common.defaultString(runtime.cert, _cert)),
            new TeaPair("ca", com.aliyun.teautil.Common.defaultString(runtime.ca, _ca)),
            new TeaPair("readTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.readTimeout, _readTimeout)),
            new TeaPair("connectTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
            new TeaPair("httpProxy", com.aliyun.teautil.Common.defaultString(runtime.httpProxy, _httpProxy)),
            new TeaPair("httpsProxy", com.aliyun.teautil.Common.defaultString(runtime.httpsProxy, _httpsProxy)),
            new TeaPair("noProxy", com.aliyun.teautil.Common.defaultString(runtime.noProxy, _noProxy)),
            new TeaPair("socks5Proxy", com.aliyun.teautil.Common.defaultString(runtime.socks5Proxy, _socks5Proxy)),
            new TeaPair("socks5NetWork", com.aliyun.teautil.Common.defaultString(runtime.socks5NetWork, _socks5NetWork)),
            new TeaPair("maxIdleConns", com.aliyun.teautil.Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
            new TeaPair("retry", TeaConverter.buildMap(
                new TeaPair("retryable", runtime.autoretry),
                new TeaPair("maxAttempts", com.aliyun.teautil.Common.defaultNumber(runtime.maxAttempts, 3))
            )),
            new TeaPair("backoff", TeaConverter.buildMap(
                new TeaPair("policy", com.aliyun.teautil.Common.defaultString(runtime.backoffPolicy, "no")),
                new TeaPair("period", com.aliyun.teautil.Common.defaultNumber(runtime.backoffPeriod, 1))
            )),
            new TeaPair("ignoreSSL", com.aliyun.teaopenapi.Client.defaultAny(runtime.ignoreSSL, false)),
            new TeaPair("tlsMinVersion", _tlsMinVersion)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                java.util.Map<String, Object> form = com.aliyun.teautil.Common.assertAsMap(data);
                String boundary = com.aliyun.fileform.Client.getBoundary();
                String tmp = com.aliyun.teautil.Common.assertAsString(form.get("host"));
                String host = "" + bucketName + "." + tmp + "";
                request_.protocol = "HTTPS";
                request_.method = "POST";
                request_.pathname = "/";
                request_.headers = TeaConverter.buildMap(
                    new TeaPair("host", host),
                    new TeaPair("date", com.aliyun.teautil.Common.getDateUTCString()),
                    new TeaPair("user-agent", com.aliyun.teautil.Common.getUserAgent(""))
                );
                request_.headers.put("content-type", "multipart/form-data; boundary=" + boundary + "");
                request_.body = com.aliyun.fileform.Client.toFileForm(form, boundary);
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);

                java.util.Map<String, Object> respMap = null;
                String bodyStr = com.aliyun.teautil.Common.readAsString(response_.body);
                if (com.aliyun.teautil.Common.is4xx(response_.statusCode) || com.aliyun.teautil.Common.is5xx(response_.statusCode)) {
                    respMap = com.aliyun.teaxml.Client.parseXml(bodyStr, null);
                    java.util.Map<String, Object> err = com.aliyun.teautil.Common.assertAsMap(respMap.get("Error"));
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("code", err.get("Code")),
                        new TeaPair("message", err.get("Message")),
                        new TeaPair("data", TeaConverter.buildMap(
                            new TeaPair("httpCode", response_.statusCode),
                            new TeaPair("requestId", err.get("RequestId")),
                            new TeaPair("hostId", err.get("HostId"))
                        ))
                    ));
                }

                respMap = com.aliyun.teaxml.Client.parseXml(bodyStr, null);
                return TeaConverter.merge(Object.class,
                    respMap
                );
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }
        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    public void addRuntimeOptionsInterceptor(RuntimeOptionsInterceptor interceptor) {
        interceptorChain.addRuntimeOptionsInterceptor(interceptor);
    }

    public void addRequestInterceptor(RequestInterceptor interceptor) {
        interceptorChain.addRequestInterceptor(interceptor);
    }

    public void addResponseInterceptor(ResponseInterceptor interceptor) {
        interceptorChain.addResponseInterceptor(interceptor);
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
     * <p><em>Billing description</em>*
     * After the task is successfully canceled, the Credits frozen for this translation task will be fully refunded to your account.
     * <strong>Before you begin</strong></p>
     * <ul>
     * <li>This operation only supports canceling translation tasks that are in the processing state. Tasks that are completed or failed cannot be canceled.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels a translation task that is currently running.</p>
     * 
     * @param request CancelTranslationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelTranslationTaskResponse
     */
    public CancelTranslationTaskResponse cancelTranslationTaskWithOptions(CancelTranslationTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.APIKey)) {
            query.put("APIKey", request.APIKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelTranslationTask"),
            new TeaPair("version", "2026-06-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelTranslationTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Billing description</em>*
     * After the task is successfully canceled, the Credits frozen for this translation task will be fully refunded to your account.
     * <strong>Before you begin</strong></p>
     * <ul>
     * <li>This operation only supports canceling translation tasks that are in the processing state. Tasks that are completed or failed cannot be canceled.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels a translation task that is currently running.</p>
     * 
     * @param request CancelTranslationTaskRequest
     * @return CancelTranslationTaskResponse
     */
    public CancelTranslationTaskResponse cancelTranslationTask(CancelTranslationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelTranslationTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the download URL of the original file for a translation task.</p>
     * 
     * @param request GetOriginalFileUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOriginalFileUrlResponse
     */
    public GetOriginalFileUrlResponse getOriginalFileUrlWithOptions(GetOriginalFileUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.APIKey)) {
            query.put("APIKey", request.APIKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOriginalFileUrl"),
            new TeaPair("version", "2026-06-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOriginalFileUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the download URL of the original file for a translation task.</p>
     * 
     * @param request GetOriginalFileUrlRequest
     * @return GetOriginalFileUrlResponse
     */
    public GetOriginalFileUrlResponse getOriginalFileUrl(GetOriginalFileUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOriginalFileUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the download URL of the translated file for a translation task.</p>
     * 
     * @param request GetTranslatedFileUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTranslatedFileUrlResponse
     */
    public GetTranslatedFileUrlResponse getTranslatedFileUrlWithOptions(GetTranslatedFileUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.APIKey)) {
            query.put("APIKey", request.APIKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTranslatedFileUrl"),
            new TeaPair("version", "2026-06-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTranslatedFileUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the download URL of the translated file for a translation task.</p>
     * 
     * @param request GetTranslatedFileUrlRequest
     * @return GetTranslatedFileUrlResponse
     */
    public GetTranslatedFileUrlResponse getTranslatedFileUrl(GetTranslatedFileUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTranslatedFileUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a translation task.</p>
     * 
     * @param request GetTranslationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTranslationTaskResponse
     */
    public GetTranslationTaskResponse getTranslationTaskWithOptions(GetTranslationTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.APIKey)) {
            query.put("APIKey", request.APIKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTranslationTask"),
            new TeaPair("version", "2026-06-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTranslationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a translation task.</p>
     * 
     * @param request GetTranslationTaskRequest
     * @return GetTranslationTaskResponse
     */
    public GetTranslationTaskResponse getTranslationTask(GetTranslationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTranslationTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries translation tasks by paging.</p>
     * 
     * @param request ListTranslationTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTranslationTasksResponse
     */
    public ListTranslationTasksResponse listTranslationTasksWithOptions(ListTranslationTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.APIKey)) {
            query.put("APIKey", request.APIKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalFileName)) {
            query.put("OriginalFileName", request.originalFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            query.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            query.put("TargetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTranslationTasks"),
            new TeaPair("version", "2026-06-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTranslationTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries translation tasks by paging.</p>
     * 
     * @param request ListTranslationTasksRequest
     * @return ListTranslationTasksResponse
     */
    public ListTranslationTasksResponse listTranslationTasks(ListTranslationTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTranslationTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Billing description</em>*
     * This operation involves Credits consumption. Before submitting a translation task, ensure that your account has sufficient Credits balance. After calling <code>UploadTranslationFile</code>, you can check the <code>CreditsAvailable</code> field in the response to confirm whether your current balance meets the requirements of this translation task. For detailed billing information, refer to the <code>CreditBreakdown</code> field.
     * <strong>Task submission description</strong></p>
     * <ul>
     * <li>To submit a new translation task, pass in the <code>TaskId</code> returned by the <code>UploadTranslationFile</code> operation.</li>
     * <li>To resubmit a historical task for translation, pass in the task ID of a previously submitted translation task, which is the <code>BaseTaskId</code>.</li>
     * <li>You must pass in either <code>TaskId</code> or <code>BaseTaskId</code>. You cannot pass in both at the same time.
     * <strong>Precautions</strong></li>
     * <li>The <code>Style</code> parameter takes effect only when the translation file is a PPT file. Passing in this parameter for files in other formats has no effect.</li>
     * <li>For new tasks, you can obtain the list of available fonts from the <code>Fonts</code> field in the response of <code>UploadTranslationFile</code>. For retranslation of historical tasks, you can obtain the list of available fonts by calling the <code>GetTranslationTask</code> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a translation task. You can submit a new translation task by passing in a TaskId, or resubmit a historical task for translation by passing in a BaseTaskId. After successful submission, the translation task ID and current task status are returned. You can use the task ID to call subsequent operations to query translation progress and results.</p>
     * 
     * @param tmpReq SubmitTranslationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitTranslationTaskResponse
     */
    public SubmitTranslationTaskResponse submitTranslationTaskWithOptions(SubmitTranslationTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitTranslationTaskShrinkRequest request = new SubmitTranslationTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.config)) {
            request.configShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.config, "Config", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customTerms)) {
            request.customTermsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customTerms, "CustomTerms", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.APIKey)) {
            query.put("APIKey", request.APIKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customTermsShrink)) {
            query.put("CustomTerms", request.customTermsShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseTaskId)) {
            body.put("BaseTaskId", request.baseTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configShrink)) {
            body.put("Config", request.configShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitTranslationTask"),
            new TeaPair("version", "2026-06-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitTranslationTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Billing description</em>*
     * This operation involves Credits consumption. Before submitting a translation task, ensure that your account has sufficient Credits balance. After calling <code>UploadTranslationFile</code>, you can check the <code>CreditsAvailable</code> field in the response to confirm whether your current balance meets the requirements of this translation task. For detailed billing information, refer to the <code>CreditBreakdown</code> field.
     * <strong>Task submission description</strong></p>
     * <ul>
     * <li>To submit a new translation task, pass in the <code>TaskId</code> returned by the <code>UploadTranslationFile</code> operation.</li>
     * <li>To resubmit a historical task for translation, pass in the task ID of a previously submitted translation task, which is the <code>BaseTaskId</code>.</li>
     * <li>You must pass in either <code>TaskId</code> or <code>BaseTaskId</code>. You cannot pass in both at the same time.
     * <strong>Precautions</strong></li>
     * <li>The <code>Style</code> parameter takes effect only when the translation file is a PPT file. Passing in this parameter for files in other formats has no effect.</li>
     * <li>For new tasks, you can obtain the list of available fonts from the <code>Fonts</code> field in the response of <code>UploadTranslationFile</code>. For retranslation of historical tasks, you can obtain the list of available fonts by calling the <code>GetTranslationTask</code> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a translation task. You can submit a new translation task by passing in a TaskId, or resubmit a historical task for translation by passing in a BaseTaskId. After successful submission, the translation task ID and current task status are returned. You can use the task ID to call subsequent operations to query translation progress and results.</p>
     * 
     * @param request SubmitTranslationTaskRequest
     * @return SubmitTranslationTaskResponse
     */
    public SubmitTranslationTaskResponse submitTranslationTask(SubmitTranslationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitTranslationTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation only involves document upload and information estimation. <strong>No fees are incurred.</strong> Credits consumption starts only after you <strong>officially submit the translation</strong> task.
     * <strong>Language detection</strong>
     * The system automatically detects the language type of the uploaded document. Currently, Chinese is supported.
     * <strong>Sensitive information detection</strong>
     * The system performs sensitive information detection on the uploaded document. If sensitive information is detected, the <code>SensitiveDetected</code> field in the response is set to <code>true</code>, and the <code>SensitiveTags</code> field returns the list of matched keywords.</li>
     * <li>You can decide whether to proceed with submitting the translation task based on your actual needs.</li>
     * <li>If the translation quality setting is set to ultimate mode when you submit the task, the system automatically switches the <strong>portions containing sensitive information</strong> to auto mode.
     * <strong>Notes</strong></li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>Make sure the uploaded document format is supported by the system. Otherwise, parsing may fail.</li>
     * <li>The <code>EstimatedCostCredits</code> value in the response is the estimated Credits consumption. The actual consumption is based on the settlement after the translation task is officially submitted.</li>
     * <li>The <code>EstimatedTime</code> value in the response is the estimated translation duration in milliseconds. The actual translation duration may vary depending on document complexity.</li>
     * <li>The <code>Fonts</code> field in the response contains the languages that support font modification and the corresponding font lists. You can select an appropriate font based on the target language.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads a document, parses document-related information, and generates a translation task. After a successful upload, the task ID and document parsing results are returned, including word count, page count, estimated Credits consumption, estimated translation time, detected language type, and font list. The system also performs sensitive information detection on the uploaded document, and you can decide whether to proceed with submitting the translation task based on the detection results.</p>
     * 
     * @param request UploadTranslationFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadTranslationFileResponse
     */
    public UploadTranslationFileResponse uploadTranslationFileWithOptions(UploadTranslationFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.APIKey)) {
            query.put("APIKey", request.APIKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.file)) {
            query.put("File", request.file);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadTranslationFile"),
            new TeaPair("version", "2026-06-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadTranslationFileResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation only involves document upload and information estimation. <strong>No fees are incurred.</strong> Credits consumption starts only after you <strong>officially submit the translation</strong> task.
     * <strong>Language detection</strong>
     * The system automatically detects the language type of the uploaded document. Currently, Chinese is supported.
     * <strong>Sensitive information detection</strong>
     * The system performs sensitive information detection on the uploaded document. If sensitive information is detected, the <code>SensitiveDetected</code> field in the response is set to <code>true</code>, and the <code>SensitiveTags</code> field returns the list of matched keywords.</li>
     * <li>You can decide whether to proceed with submitting the translation task based on your actual needs.</li>
     * <li>If the translation quality setting is set to ultimate mode when you submit the task, the system automatically switches the <strong>portions containing sensitive information</strong> to auto mode.
     * <strong>Notes</strong></li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>Make sure the uploaded document format is supported by the system. Otherwise, parsing may fail.</li>
     * <li>The <code>EstimatedCostCredits</code> value in the response is the estimated Credits consumption. The actual consumption is based on the settlement after the translation task is officially submitted.</li>
     * <li>The <code>EstimatedTime</code> value in the response is the estimated translation duration in milliseconds. The actual translation duration may vary depending on document complexity.</li>
     * <li>The <code>Fonts</code> field in the response contains the languages that support font modification and the corresponding font lists. You can select an appropriate font based on the target language.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads a document, parses document-related information, and generates a translation task. After a successful upload, the task ID and document parsing results are returned, including word count, page count, estimated Credits consumption, estimated translation time, detected language type, and font list. The system also performs sensitive information detection on the uploaded document, and you can decide whether to proceed with submitting the translation task based on the detection results.</p>
     * 
     * @param request UploadTranslationFileRequest
     * @return UploadTranslationFileResponse
     */
    public UploadTranslationFileResponse uploadTranslationFile(UploadTranslationFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadTranslationFileWithOptions(request, runtime);
    }

    public UploadTranslationFileResponse uploadTranslationFileAdvance(UploadTranslationFileAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        com.aliyun.credentials.models.CredentialModel credentialModel = null;
        if (com.aliyun.teautil.Common.isUnset(_credential)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "InvalidCredentials"),
                new TeaPair("message", "Please set up the credentials correctly. If you are setting them through environment variables, please ensure that ALIBABA_CLOUD_ACCESS_KEY_ID and ALIBABA_CLOUD_ACCESS_KEY_SECRET are set correctly. See https://help.aliyun.com/zh/sdk/developer-reference/configure-the-alibaba-cloud-accesskey-environment-variable-on-linux-macos-and-windows-systems for more details.")
            ));
        }

        credentialModel = _credential.getCredential();
        String accessKeyId = credentialModel.accessKeyId;
        String accessKeySecret = credentialModel.accessKeySecret;
        String securityToken = credentialModel.securityToken;
        String credentialType = credentialModel.type;
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.teaopenapi.Client authClient = new com.aliyun.teaopenapi.Client(authConfig);
        java.util.Map<String, String> authRequest = TeaConverter.buildMap(
            new TeaPair("Product", "RealTranslationAgent"),
            new TeaPair("RegionId", _regionId)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest authReq = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(authRequest))
        ));
        com.aliyun.teaopenapi.models.Params authParams = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeFileUpload"),
            new TeaPair("version", "2019-12-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        java.util.Map<String, Object> authResponse = new java.util.HashMap<>();
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        java.util.Map<String, Object> ossHeader = new java.util.HashMap<>();
        java.util.Map<String, Object> tmpBody = new java.util.HashMap<>();
        Boolean useAccelerate = false;
        java.util.Map<String, String> authResponseBody = new java.util.HashMap<>();
        UploadTranslationFileRequest uploadTranslationFileReq = new UploadTranslationFileRequest();
        com.aliyun.openapiutil.Client.convert(request, uploadTranslationFileReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.fileObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            uploadTranslationFileReq.file = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        UploadTranslationFileResponse uploadTranslationFileResp = this.uploadTranslationFileWithOptions(uploadTranslationFileReq, runtime);
        return uploadTranslationFileResp;
    }
}

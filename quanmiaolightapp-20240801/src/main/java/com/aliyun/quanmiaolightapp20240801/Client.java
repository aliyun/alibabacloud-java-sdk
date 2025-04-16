// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801;

import com.aliyun.tea.*;
import com.aliyun.quanmiaolightapp20240801.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("quanmiaolightapp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>取消异步任务</p>
     * 
     * @param request CancelAsyncTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelAsyncTaskResponse
     */
    public CancelAsyncTaskResponse cancelAsyncTaskWithOptions(String workspaceId, CancelAsyncTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelAsyncTask"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/cancelAsyncTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelAsyncTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消异步任务</p>
     * 
     * @param request CancelAsyncTaskRequest
     * @return CancelAsyncTaskResponse
     */
    public CancelAsyncTaskResponse cancelAsyncTask(String workspaceId, CancelAsyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAsyncTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出挖掘任务明细</p>
     * 
     * @param tmpReq ExportAnalysisTagDetailByTaskIdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportAnalysisTagDetailByTaskIdResponse
     */
    public ExportAnalysisTagDetailByTaskIdResponse exportAnalysisTagDetailByTaskIdWithOptions(String workspaceId, ExportAnalysisTagDetailByTaskIdRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExportAnalysisTagDetailByTaskIdShrinkRequest request = new ExportAnalysisTagDetailByTaskIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.categories)) {
            request.categoriesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.categories, "categories", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoriesShrink)) {
            body.put("categories", request.categoriesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportAnalysisTagDetailByTaskId"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/exportAnalysisTagDetailByTaskId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportAnalysisTagDetailByTaskIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导出挖掘任务明细</p>
     * 
     * @param request ExportAnalysisTagDetailByTaskIdRequest
     * @return ExportAnalysisTagDetailByTaskIdResponse
     */
    public ExportAnalysisTagDetailByTaskIdResponse exportAnalysisTagDetailByTaskId(String workspaceId, ExportAnalysisTagDetailByTaskIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportAnalysisTagDetailByTaskIdWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新闻播报-抽取分类获取播报热点</p>
     * 
     * @param request GenerateBroadcastNewsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateBroadcastNewsResponse
     */
    public GenerateBroadcastNewsResponse generateBroadcastNewsWithOptions(String workspaceId, GenerateBroadcastNewsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("prompt", request.prompt);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateBroadcastNews"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/GenerateBroadcastNews"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateBroadcastNewsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新闻播报-抽取分类获取播报热点</p>
     * 
     * @param request GenerateBroadcastNewsRequest
     * @return GenerateBroadcastNewsResponse
     */
    public GenerateBroadcastNewsResponse generateBroadcastNews(String workspaceId, GenerateBroadcastNewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateBroadcastNewsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-标签挖掘-获取示例输出格式</p>
     * 
     * @param tmpReq GenerateOutputFormatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateOutputFormatResponse
     */
    public GenerateOutputFormatResponse generateOutputFormatWithOptions(String workspaceId, GenerateOutputFormatRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GenerateOutputFormatShrinkRequest request = new GenerateOutputFormatShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            body.put("businessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            body.put("extraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDescription)) {
            body.put("taskDescription", request.taskDescription);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateOutputFormat"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/generateOutputFormat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateOutputFormatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-标签挖掘-获取示例输出格式</p>
     * 
     * @param request GenerateOutputFormatRequest
     * @return GenerateOutputFormatResponse
     */
    public GenerateOutputFormatResponse generateOutputFormat(String workspaceId, GenerateOutputFormatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateOutputFormatWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取企业VOC分析任务结果</p>
     * 
     * @param request GetEnterpriseVocAnalysisTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEnterpriseVocAnalysisTaskResponse
     */
    public GetEnterpriseVocAnalysisTaskResponse getEnterpriseVocAnalysisTaskWithOptions(String workspaceId, GetEnterpriseVocAnalysisTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetEnterpriseVocAnalysisTask"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/getEnterpriseVocAnalysisTask"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEnterpriseVocAnalysisTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取企业VOC分析任务结果</p>
     * 
     * @param request GetEnterpriseVocAnalysisTaskRequest
     * @return GetEnterpriseVocAnalysisTaskResponse
     */
    public GetEnterpriseVocAnalysisTaskResponse getEnterpriseVocAnalysisTask(String workspaceId, GetEnterpriseVocAnalysisTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnterpriseVocAnalysisTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取挖掘分析任务结果</p>
     * 
     * @param request GetTagMiningAnalysisTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTagMiningAnalysisTaskResponse
     */
    public GetTagMiningAnalysisTaskResponse getTagMiningAnalysisTaskWithOptions(String workspaceId, GetTagMiningAnalysisTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetTagMiningAnalysisTask"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/getTagMiningAnalysisTask"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTagMiningAnalysisTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取挖掘分析任务结果</p>
     * 
     * @param request GetTagMiningAnalysisTaskRequest
     * @return GetTagMiningAnalysisTaskResponse
     */
    public GetTagMiningAnalysisTaskResponse getTagMiningAnalysisTask(String workspaceId, GetTagMiningAnalysisTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTagMiningAnalysisTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视频理解-获取配置</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoAnalysisConfigResponse
     */
    public GetVideoAnalysisConfigResponse getVideoAnalysisConfigWithOptions(String workspaceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoAnalysisConfig"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/videoAnalysis/getVideoAnalysisConfig"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoAnalysisConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>视频理解-获取配置</p>
     * @return GetVideoAnalysisConfigResponse
     */
    public GetVideoAnalysisConfigResponse getVideoAnalysisConfig(String workspaceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVideoAnalysisConfigWithOptions(workspaceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-获取视频理解异步任务结果</p>
     * 
     * @param request GetVideoAnalysisTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoAnalysisTaskResponse
     */
    public GetVideoAnalysisTaskResponse getVideoAnalysisTaskWithOptions(String workspaceId, GetVideoAnalysisTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetVideoAnalysisTask"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/videoAnalysis/getVideoAnalysisTask"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoAnalysisTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-获取视频理解异步任务结果</p>
     * 
     * @param request GetVideoAnalysisTaskRequest
     * @return GetVideoAnalysisTaskResponse
     */
    public GetVideoAnalysisTaskResponse getVideoAnalysisTask(String workspaceId, GetVideoAnalysisTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVideoAnalysisTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-新闻播报-获取热点话题摘要列表</p>
     * 
     * @param request ListHotTopicSummariesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHotTopicSummariesResponse
     */
    public ListHotTopicSummariesResponse listHotTopicSummariesWithOptions(String workspaceId, ListHotTopicSummariesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotTopic)) {
            body.put("hotTopic", request.hotTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotTopicVersion)) {
            body.put("hotTopicVersion", request.hotTopicVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotTopicSummaries"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/listHotTopicSummaries"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotTopicSummariesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-新闻播报-获取热点话题摘要列表</p>
     * 
     * @param request ListHotTopicSummariesRequest
     * @return ListHotTopicSummariesResponse
     */
    public ListHotTopicSummariesResponse listHotTopicSummaries(String workspaceId, ListHotTopicSummariesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listHotTopicSummariesWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>企业VOC分析</p>
     * 
     * @param tmpReq RunEnterpriseVocAnalysisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunEnterpriseVocAnalysisResponse
     */
    public RunEnterpriseVocAnalysisResponse runEnterpriseVocAnalysisWithOptions(String workspaceId, RunEnterpriseVocAnalysisRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunEnterpriseVocAnalysisShrinkRequest request = new RunEnterpriseVocAnalysisShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterTags)) {
            request.filterTagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterTags, "filterTags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            body.put("extraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterTagsShrink)) {
            body.put("filterTags", request.filterTagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputFormat)) {
            body.put("outputFormat", request.outputFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDescription)) {
            body.put("taskDescription", request.taskDescription);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunEnterpriseVocAnalysis"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/runEnterpriseVocAnalysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunEnterpriseVocAnalysisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>企业VOC分析</p>
     * 
     * @param request RunEnterpriseVocAnalysisRequest
     * @return RunEnterpriseVocAnalysisResponse
     */
    public RunEnterpriseVocAnalysisResponse runEnterpriseVocAnalysis(String workspaceId, RunEnterpriseVocAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runEnterpriseVocAnalysisWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-热点播报-问答</p>
     * 
     * @param tmpReq RunHotTopicChatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunHotTopicChatResponse
     */
    public RunHotTopicChatResponse runHotTopicChatWithOptions(String workspaceId, RunHotTopicChatRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunHotTopicChatShrinkRequest request = new RunHotTopicChatShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.generateOptions)) {
            request.generateOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.generateOptions, "generateOptions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hotTopics)) {
            request.hotTopicsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hotTopics, "hotTopics", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.messages)) {
            request.messagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.messages, "messages", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.stepForBroadcastContentConfig)) {
            request.stepForBroadcastContentConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.stepForBroadcastContentConfig, "stepForBroadcastContentConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateOptionsShrink)) {
            body.put("generateOptions", request.generateOptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotTopicVersion)) {
            body.put("hotTopicVersion", request.hotTopicVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotTopicsShrink)) {
            body.put("hotTopics", request.hotTopicsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCount)) {
            body.put("imageCount", request.imageCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messagesShrink)) {
            body.put("messages", request.messagesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCustomPromptTemplate)) {
            body.put("modelCustomPromptTemplate", request.modelCustomPromptTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalSessionId)) {
            body.put("originalSessionId", request.originalSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stepForBroadcastContentConfigShrink)) {
            body.put("stepForBroadcastContentConfig", request.stepForBroadcastContentConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunHotTopicChat"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/runHotTopicChat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunHotTopicChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-热点播报-问答</p>
     * 
     * @param request RunHotTopicChatRequest
     * @return RunHotTopicChatResponse
     */
    public RunHotTopicChatResponse runHotTopicChat(String workspaceId, RunHotTopicChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runHotTopicChatWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-热点播报-热点摘要生成</p>
     * 
     * @param tmpReq RunHotTopicSummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunHotTopicSummaryResponse
     */
    public RunHotTopicSummaryResponse runHotTopicSummaryWithOptions(String workspaceId, RunHotTopicSummaryRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunHotTopicSummaryShrinkRequest request = new RunHotTopicSummaryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.stepForCustomSummaryStyleConfig)) {
            request.stepForCustomSummaryStyleConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.stepForCustomSummaryStyleConfig, "stepForCustomSummaryStyleConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.topicIds)) {
            request.topicIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.topicIds, "topicIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotTopicVersion)) {
            body.put("hotTopicVersion", request.hotTopicVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stepForCustomSummaryStyleConfigShrink)) {
            body.put("stepForCustomSummaryStyleConfig", request.stepForCustomSummaryStyleConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicIdsShrink)) {
            body.put("topicIds", request.topicIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunHotTopicSummary"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/runHotTopicSummary"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunHotTopicSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-热点播报-热点摘要生成</p>
     * 
     * @param request RunHotTopicSummaryRequest
     * @return RunHotTopicSummaryResponse
     */
    public RunHotTopicSummaryResponse runHotTopicSummary(String workspaceId, RunHotTopicSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runHotTopicSummaryWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>营销信息抽取服务</p>
     * 
     * @param tmpReq RunMarketingInformationExtractRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunMarketingInformationExtractResponse
     */
    public RunMarketingInformationExtractResponse runMarketingInformationExtractWithOptions(String workspaceId, RunMarketingInformationExtractRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunMarketingInformationExtractShrinkRequest request = new RunMarketingInformationExtractShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceMaterials)) {
            request.sourceMaterialsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceMaterials, "sourceMaterials", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customPrompt)) {
            body.put("customPrompt", request.customPrompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extractType)) {
            body.put("extractType", request.extractType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceMaterialsShrink)) {
            body.put("sourceMaterials", request.sourceMaterialsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunMarketingInformationExtract"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/runMarketingInformationExtract"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunMarketingInformationExtractResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>营销信息抽取服务</p>
     * 
     * @param request RunMarketingInformationExtractRequest
     * @return RunMarketingInformationExtractResponse
     */
    public RunMarketingInformationExtractResponse runMarketingInformationExtract(String workspaceId, RunMarketingInformationExtractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runMarketingInformationExtractWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>营销文案写作服务</p>
     * 
     * @param request RunMarketingInformationWritingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunMarketingInformationWritingResponse
     */
    public RunMarketingInformationWritingResponse runMarketingInformationWritingWithOptions(String workspaceId, RunMarketingInformationWritingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customLimitation)) {
            body.put("customLimitation", request.customLimitation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPrompt)) {
            body.put("customPrompt", request.customPrompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputExample)) {
            body.put("inputExample", request.inputExample);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputExample)) {
            body.put("outputExample", request.outputExample);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceMaterial)) {
            body.put("sourceMaterial", request.sourceMaterial);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.writingType)) {
            body.put("writingType", request.writingType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunMarketingInformationWriting"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/runMarketingInformationWriting"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunMarketingInformationWritingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>营销文案写作服务</p>
     * 
     * @param request RunMarketingInformationWritingRequest
     * @return RunMarketingInformationWritingResponse
     */
    public RunMarketingInformationWritingResponse runMarketingInformationWriting(String workspaceId, RunMarketingInformationWritingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runMarketingInformationWritingWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-网络内容审核</p>
     * 
     * @param tmpReq RunNetworkContentAuditRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunNetworkContentAuditResponse
     */
    public RunNetworkContentAuditResponse runNetworkContentAuditWithOptions(String workspaceId, RunNetworkContentAuditRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunNetworkContentAuditShrinkRequest request = new RunNetworkContentAuditShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            body.put("businessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            body.put("extraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputFormat)) {
            body.put("outputFormat", request.outputFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDescription)) {
            body.put("taskDescription", request.taskDescription);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunNetworkContentAudit"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/runNetworkContentAudit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunNetworkContentAuditResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-网络内容审核</p>
     * 
     * @param request RunNetworkContentAuditRequest
     * @return RunNetworkContentAuditResponse
     */
    public RunNetworkContentAuditResponse runNetworkContentAudit(String workspaceId, RunNetworkContentAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runNetworkContentAuditWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>长剧本创作</p>
     * 
     * @param request RunScriptChatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunScriptChatResponse
     */
    public RunScriptChatResponse runScriptChatWithOptions(String workspaceId, RunScriptChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunScriptChat"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/runScriptChat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunScriptChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>长剧本创作</p>
     * 
     * @param request RunScriptChatRequest
     * @return RunScriptChatResponse
     */
    public RunScriptChatResponse runScriptChat(String workspaceId, RunScriptChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runScriptChatWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>剧本续写</p>
     * 
     * @param request RunScriptContinueRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunScriptContinueResponse
     */
    public RunScriptContinueResponse runScriptContinueWithOptions(String workspaceId, RunScriptContinueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scriptSummary)) {
            body.put("scriptSummary", request.scriptSummary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptTypeKeyword)) {
            body.put("scriptTypeKeyword", request.scriptTypeKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userProvidedContent)) {
            body.put("userProvidedContent", request.userProvidedContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunScriptContinue"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/runScriptContinue"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunScriptContinueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>剧本续写</p>
     * 
     * @param request RunScriptContinueRequest
     * @return RunScriptContinueResponse
     */
    public RunScriptContinueResponse runScriptContinue(String workspaceId, RunScriptContinueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runScriptContinueWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>剧本策划</p>
     * 
     * @param request RunScriptPlanningRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunScriptPlanningResponse
     */
    public RunScriptPlanningResponse runScriptPlanningWithOptions(String workspaceId, RunScriptPlanningRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionalNote)) {
            body.put("additionalNote", request.additionalNote);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogueInScene)) {
            body.put("dialogueInScene", request.dialogueInScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plotConflict)) {
            body.put("plotConflict", request.plotConflict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptName)) {
            body.put("scriptName", request.scriptName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptShotCount)) {
            body.put("scriptShotCount", request.scriptShotCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptSummary)) {
            body.put("scriptSummary", request.scriptSummary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptTypeKeyword)) {
            body.put("scriptTypeKeyword", request.scriptTypeKeyword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunScriptPlanning"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/runScriptPlanning"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunScriptPlanningResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>剧本策划</p>
     * 
     * @param request RunScriptPlanningRequest
     * @return RunScriptPlanningResponse
     */
    public RunScriptPlanningResponse runScriptPlanning(String workspaceId, RunScriptPlanningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runScriptPlanningWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>剧本对话内容的整理</p>
     * 
     * @param request RunScriptRefineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunScriptRefineResponse
     */
    public RunScriptRefineResponse runScriptRefineWithOptions(String workspaceId, RunScriptRefineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunScriptRefine"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/runScriptRefine"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunScriptRefineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>剧本对话内容的整理</p>
     * 
     * @param request RunScriptRefineRequest
     * @return RunScriptRefineResponse
     */
    public RunScriptRefineResponse runScriptRefine(String workspaceId, RunScriptRefineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runScriptRefineWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文体学习和写作推理服务</p>
     * 
     * @param tmpReq RunStyleWritingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunStyleWritingResponse
     */
    public RunStyleWritingResponse runStyleWritingWithOptions(String workspaceId, RunStyleWritingRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunStyleWritingShrinkRequest request = new RunStyleWritingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.learningSamples)) {
            request.learningSamplesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.learningSamples, "learningSamples", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.referenceMaterials)) {
            request.referenceMaterialsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.referenceMaterials, "referenceMaterials", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.learningSamplesShrink)) {
            body.put("learningSamples", request.learningSamplesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processStage)) {
            body.put("processStage", request.processStage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referenceMaterialsShrink)) {
            body.put("referenceMaterials", request.referenceMaterialsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.styleFeature)) {
            body.put("styleFeature", request.styleFeature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useSearch)) {
            body.put("useSearch", request.useSearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.writingTheme)) {
            body.put("writingTheme", request.writingTheme);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunStyleWriting"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/runStyleWriting"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunStyleWritingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文体学习和写作推理服务</p>
     * 
     * @param request RunStyleWritingRequest
     * @return RunStyleWritingResponse
     */
    public RunStyleWritingResponse runStyleWriting(String workspaceId, RunStyleWritingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runStyleWritingWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-标签挖掘</p>
     * 
     * @param tmpReq RunTagMiningAnalysisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunTagMiningAnalysisResponse
     */
    public RunTagMiningAnalysisResponse runTagMiningAnalysisWithOptions(String workspaceId, RunTagMiningAnalysisRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunTagMiningAnalysisShrinkRequest request = new RunTagMiningAnalysisShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            body.put("apiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            body.put("businessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            body.put("extraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputFormat)) {
            body.put("outputFormat", request.outputFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDescription)) {
            body.put("taskDescription", request.taskDescription);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunTagMiningAnalysis"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/runTagMiningAnalysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunTagMiningAnalysisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-标签挖掘</p>
     * 
     * @param request RunTagMiningAnalysisRequest
     * @return RunTagMiningAnalysisResponse
     */
    public RunTagMiningAnalysisResponse runTagMiningAnalysis(String workspaceId, RunTagMiningAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runTagMiningAnalysisWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-视频理解</p>
     * 
     * @param tmpReq RunVideoAnalysisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunVideoAnalysisResponse
     */
    public RunVideoAnalysisResponse runVideoAnalysisWithOptions(String workspaceId, RunVideoAnalysisRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunVideoAnalysisShrinkRequest request = new RunVideoAnalysisShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.excludeGenerateOptions)) {
            request.excludeGenerateOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.excludeGenerateOptions, "excludeGenerateOptions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.frameSampleMethod)) {
            request.frameSampleMethodShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.frameSampleMethod, "frameSampleMethod", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.generateOptions)) {
            request.generateOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.generateOptions, "generateOptions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.textProcessTasks)) {
            request.textProcessTasksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.textProcessTasks, "textProcessTasks", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.videoRoles)) {
            request.videoRolesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.videoRoles, "videoRoles", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeGenerateOptionsShrink)) {
            body.put("excludeGenerateOptions", request.excludeGenerateOptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceIdentitySimilarityMinScore)) {
            body.put("faceIdentitySimilarityMinScore", request.faceIdentitySimilarityMinScore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frameSampleMethodShrink)) {
            body.put("frameSampleMethod", request.frameSampleMethodShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateOptionsShrink)) {
            body.put("generateOptions", request.generateOptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCustomPromptTemplate)) {
            body.put("modelCustomPromptTemplate", request.modelCustomPromptTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCustomPromptTemplateId)) {
            body.put("modelCustomPromptTemplateId", request.modelCustomPromptTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalSessionId)) {
            body.put("originalSessionId", request.originalSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotInterval)) {
            body.put("snapshotInterval", request.snapshotInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.splitInterval)) {
            body.put("splitInterval", request.splitInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textProcessTasksShrink)) {
            body.put("textProcessTasks", request.textProcessTasksShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoExtraInfo)) {
            body.put("videoExtraInfo", request.videoExtraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoModelCustomPromptTemplate)) {
            body.put("videoModelCustomPromptTemplate", request.videoModelCustomPromptTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoModelId)) {
            body.put("videoModelId", request.videoModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoRolesShrink)) {
            body.put("videoRoles", request.videoRolesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoShotFaceIdentityCount)) {
            body.put("videoShotFaceIdentityCount", request.videoShotFaceIdentityCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoUrl)) {
            body.put("videoUrl", request.videoUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunVideoAnalysis"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/runVideoAnalysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunVideoAnalysisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-视频理解</p>
     * 
     * @param request RunVideoAnalysisRequest
     * @return RunVideoAnalysisResponse
     */
    public RunVideoAnalysisResponse runVideoAnalysis(String workspaceId, RunVideoAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runVideoAnalysisWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交企业VOC异步任务</p>
     * 
     * @param tmpReq SubmitEnterpriseVocAnalysisTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitEnterpriseVocAnalysisTaskResponse
     */
    public SubmitEnterpriseVocAnalysisTaskResponse submitEnterpriseVocAnalysisTaskWithOptions(String workspaceId, SubmitEnterpriseVocAnalysisTaskRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitEnterpriseVocAnalysisTaskShrinkRequest request = new SubmitEnterpriseVocAnalysisTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contents)) {
            request.contentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contents, "contents", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterTags)) {
            request.filterTagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterTags, "filterTags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentsShrink)) {
            body.put("contents", request.contentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            body.put("extraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileKey)) {
            body.put("fileKey", request.fileKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterTagsShrink)) {
            body.put("filterTags", request.filterTagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputFormat)) {
            body.put("outputFormat", request.outputFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDescription)) {
            body.put("taskDescription", request.taskDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitEnterpriseVocAnalysisTask"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/submitEnterpriseVocAnalysisTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitEnterpriseVocAnalysisTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交企业VOC异步任务</p>
     * 
     * @param request SubmitEnterpriseVocAnalysisTaskRequest
     * @return SubmitEnterpriseVocAnalysisTaskResponse
     */
    public SubmitEnterpriseVocAnalysisTaskResponse submitEnterpriseVocAnalysisTask(String workspaceId, SubmitEnterpriseVocAnalysisTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitEnterpriseVocAnalysisTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-标签挖掘</p>
     * 
     * @param tmpReq SubmitTagMiningAnalysisTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitTagMiningAnalysisTaskResponse
     */
    public SubmitTagMiningAnalysisTaskResponse submitTagMiningAnalysisTaskWithOptions(String workspaceId, SubmitTagMiningAnalysisTaskRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitTagMiningAnalysisTaskShrinkRequest request = new SubmitTagMiningAnalysisTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contents)) {
            request.contentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contents, "contents", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            body.put("apiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            body.put("businessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentsShrink)) {
            body.put("contents", request.contentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            body.put("extraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputFormat)) {
            body.put("outputFormat", request.outputFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDescription)) {
            body.put("taskDescription", request.taskDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitTagMiningAnalysisTask"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/submitTagMiningAnalysisTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitTagMiningAnalysisTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-标签挖掘</p>
     * 
     * @param request SubmitTagMiningAnalysisTaskRequest
     * @return SubmitTagMiningAnalysisTaskResponse
     */
    public SubmitTagMiningAnalysisTaskResponse submitTagMiningAnalysisTask(String workspaceId, SubmitTagMiningAnalysisTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitTagMiningAnalysisTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-提交视频理解任务</p>
     * 
     * @param tmpReq SubmitVideoAnalysisTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitVideoAnalysisTaskResponse
     */
    public SubmitVideoAnalysisTaskResponse submitVideoAnalysisTaskWithOptions(String workspaceId, SubmitVideoAnalysisTaskRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitVideoAnalysisTaskShrinkRequest request = new SubmitVideoAnalysisTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.excludeGenerateOptions)) {
            request.excludeGenerateOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.excludeGenerateOptions, "excludeGenerateOptions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.frameSampleMethod)) {
            request.frameSampleMethodShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.frameSampleMethod, "frameSampleMethod", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.generateOptions)) {
            request.generateOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.generateOptions, "generateOptions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.textProcessTasks)) {
            request.textProcessTasksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.textProcessTasks, "textProcessTasks", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.videoRoles)) {
            request.videoRolesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.videoRoles, "videoRoles", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deduplicationId)) {
            body.put("deduplicationId", request.deduplicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeGenerateOptionsShrink)) {
            body.put("excludeGenerateOptions", request.excludeGenerateOptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceIdentitySimilarityMinScore)) {
            body.put("faceIdentitySimilarityMinScore", request.faceIdentitySimilarityMinScore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frameSampleMethodShrink)) {
            body.put("frameSampleMethod", request.frameSampleMethodShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateOptionsShrink)) {
            body.put("generateOptions", request.generateOptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCustomPromptTemplate)) {
            body.put("modelCustomPromptTemplate", request.modelCustomPromptTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCustomPromptTemplateId)) {
            body.put("modelCustomPromptTemplateId", request.modelCustomPromptTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotInterval)) {
            body.put("snapshotInterval", request.snapshotInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.splitInterval)) {
            body.put("splitInterval", request.splitInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textProcessTasksShrink)) {
            body.put("textProcessTasks", request.textProcessTasksShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoExtraInfo)) {
            body.put("videoExtraInfo", request.videoExtraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoModelCustomPromptTemplate)) {
            body.put("videoModelCustomPromptTemplate", request.videoModelCustomPromptTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoModelId)) {
            body.put("videoModelId", request.videoModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoRolesShrink)) {
            body.put("videoRoles", request.videoRolesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoShotFaceIdentityCount)) {
            body.put("videoShotFaceIdentityCount", request.videoShotFaceIdentityCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoUrl)) {
            body.put("videoUrl", request.videoUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitVideoAnalysisTask"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/videoAnalysis/submitVideoAnalysisTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitVideoAnalysisTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>轻应用-提交视频理解任务</p>
     * 
     * @param request SubmitVideoAnalysisTaskRequest
     * @return SubmitVideoAnalysisTaskResponse
     */
    public SubmitVideoAnalysisTaskResponse submitVideoAnalysisTask(String workspaceId, SubmitVideoAnalysisTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitVideoAnalysisTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视频理解-更新配置</p>
     * 
     * @param request UpdateVideoAnalysisConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVideoAnalysisConfigResponse
     */
    public UpdateVideoAnalysisConfigResponse updateVideoAnalysisConfigWithOptions(String workspaceId, UpdateVideoAnalysisConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asyncConcurrency)) {
            body.put("asyncConcurrency", request.asyncConcurrency);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVideoAnalysisConfig"),
            new TeaPair("version", "2024-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/quanmiao/lightapp/videoAnalysis/updateVideoAnalysisConfig"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVideoAnalysisConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>视频理解-更新配置</p>
     * 
     * @param request UpdateVideoAnalysisConfigRequest
     * @return UpdateVideoAnalysisConfigResponse
     */
    public UpdateVideoAnalysisConfigResponse updateVideoAnalysisConfig(String workspaceId, UpdateVideoAnalysisConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateVideoAnalysisConfigWithOptions(workspaceId, request, headers, runtime);
    }
}

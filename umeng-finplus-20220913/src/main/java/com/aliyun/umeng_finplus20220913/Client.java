// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913;

import com.aliyun.tea.*;
import com.aliyun.umeng_finplus20220913.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
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

    /**
     * <b>summary</b> : 
     * <p>提交数据集任务，校验数据集</p>
     * 
     * @param request BuildStsAKRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BuildStsAKResponse
     */
    public BuildStsAKResponse buildStsAKWithOptions(BuildStsAKRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BuildStsAK"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/buildStsAK"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BuildStsAKResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交数据集任务，校验数据集</p>
     * 
     * @param request BuildStsAKRequest
     * @return BuildStsAKResponse
     */
    public BuildStsAKResponse buildStsAK(BuildStsAKRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.buildStsAKWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交数据集任务，校验数据集</p>
     * 
     * @param request BuildStsAK2Request
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BuildStsAK2Response
     */
    public BuildStsAK2Response buildStsAK2WithOptions(BuildStsAK2Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetId)) {
            body.put("dataSetId", request.dataSetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BuildStsAK2"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/buildStsAK2"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BuildStsAK2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>提交数据集任务，校验数据集</p>
     * 
     * @param request BuildStsAK2Request
     * @return BuildStsAK2Response
     */
    public BuildStsAK2Response buildStsAK2(BuildStsAK2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.buildStsAK2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消批量计算任务</p>
     * 
     * @param request CancelTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelTaskResponse
     */
    public CancelTaskResponse cancelTaskWithOptions(CancelTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelTask"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/cancelTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消批量计算任务</p>
     * 
     * @param request CancelTaskRequest
     * @return CancelTaskResponse
     */
    public CancelTaskResponse cancelTask(CancelTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消批量计算任务</p>
     * 
     * @param request CancelTask2Request
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelTask2Response
     */
    public CancelTask2Response cancelTask2WithOptions(CancelTask2Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bcId)) {
            body.put("bcId", request.bcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("clientId", request.clientId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelTask2"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/cancelTask2"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelTask2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>取消批量计算任务</p>
     * 
     * @param request CancelTask2Request
     * @return CancelTask2Response
     */
    public CancelTask2Response cancelTask2(CancelTask2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelTask2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建批量计算任务</p>
     * 
     * @param request CreateComputeTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateComputeTaskResponse
     */
    public CreateComputeTaskResponse createComputeTaskWithOptions(CreateComputeTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetIds)) {
            body.put("dataSetIds", request.dataSetIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.morseInfoList)) {
            body.put("morseInfoList", request.morseInfoList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            body.put("remarks", request.remarks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComputeTask"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/createComputeTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComputeTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建批量计算任务</p>
     * 
     * @param request CreateComputeTaskRequest
     * @return CreateComputeTaskResponse
     */
    public CreateComputeTaskResponse createComputeTask(CreateComputeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createComputeTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建批量计算任务</p>
     * 
     * @param request CreateComputeTask2Request
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateComputeTask2Response
     */
    public CreateComputeTask2Response createComputeTask2WithOptions(CreateComputeTask2Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetIds)) {
            body.put("dataSetIds", request.dataSetIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.morseInfoList)) {
            body.put("morseInfoList", request.morseInfoList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            body.put("remarks", request.remarks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskSource)) {
            body.put("taskSource", request.taskSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComputeTask2"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/createComputeTask2"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComputeTask2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>创建批量计算任务</p>
     * 
     * @param request CreateComputeTask2Request
     * @return CreateComputeTask2Response
     */
    public CreateComputeTask2Response createComputeTask2(CreateComputeTask2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createComputeTask2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据集</p>
     * 
     * @param request CreateDataSetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataSetResponse
     */
    public CreateDataSetResponse createDataSetWithOptions(CreateDataSetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataSet"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/createDataSet"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据集</p>
     * 
     * @param request CreateDataSetRequest
     * @return CreateDataSetResponse
     */
    public CreateDataSetResponse createDataSet(CreateDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataSetWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据集</p>
     * 
     * @param request CreateDataSet2Request
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataSet2Response
     */
    public CreateDataSet2Response createDataSet2WithOptions(CreateDataSet2Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataSet2"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/createDataSet2"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataSet2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据集</p>
     * 
     * @param request CreateDataSet2Request
     * @return CreateDataSet2Response
     */
    public CreateDataSet2Response createDataSet2(CreateDataSet2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataSet2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建友准达实例任务</p>
     * 
     * @param request CreateInstanceTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceTaskResponse
     */
    public CreateInstanceTaskResponse createInstanceTaskWithOptions(CreateInstanceTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calbackUrl)) {
            body.put("CalbackUrl", request.calbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetIds)) {
            body.put("DatasetIds", request.datasetIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorType)) {
            body.put("MonitorType", request.monitorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputConfig)) {
            body.put("OutputConfig", request.outputConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scoreStrategyConfig)) {
            body.put("ScoreStrategyConfig", request.scoreStrategyConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceTask"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/CreateInstanceTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建友准达实例任务</p>
     * 
     * @param request CreateInstanceTaskRequest
     * @return CreateInstanceTaskResponse
     */
    public CreateInstanceTaskResponse createInstanceTask(CreateInstanceTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>友准达-创建知识库</p>
     * 
     * @param tmpReq CreateKnowLedgeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKnowLedgeResponse
     */
    public CreateKnowLedgeResponse createKnowLedgeWithOptions(CreateKnowLedgeRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateKnowLedgeShrinkRequest request = new CreateKnowLedgeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKnowLedge"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yzd/createKnowLedge"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKnowLedgeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>友准达-创建知识库</p>
     * 
     * @param request CreateKnowLedgeRequest
     * @return CreateKnowLedgeResponse
     */
    public CreateKnowLedgeResponse createKnowLedge(CreateKnowLedgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createKnowLedgeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>加密调用OpenAPI</p>
     * 
     * @param request EncryptInvokeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EncryptInvokeResponse
     */
    public EncryptInvokeResponse encryptInvokeWithOptions(EncryptInvokeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptKey)) {
            body.put("encryptKey", request.encryptKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.methodName)) {
            body.put("methodName", request.methodName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sign)) {
            body.put("sign", request.sign);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EncryptInvoke"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/encryptInvoke"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EncryptInvokeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>加密调用OpenAPI</p>
     * 
     * @param request EncryptInvokeRequest
     * @return EncryptInvokeResponse
     */
    public EncryptInvokeResponse encryptInvoke(EncryptInvokeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.encryptInvokeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取人群集信息</p>
     * 
     * @param tmpReq GetCrowdDatasetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCrowdDatasetResponse
     */
    public GetCrowdDatasetResponse getCrowdDatasetWithOptions(GetCrowdDatasetRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetCrowdDatasetShrinkRequest request = new GetCrowdDatasetShrinkRequest();
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
            new TeaPair("action", "GetCrowdDataset"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yzd/getCrowdDataset"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCrowdDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取人群集信息</p>
     * 
     * @param request GetCrowdDatasetRequest
     * @return GetCrowdDatasetResponse
     */
    public GetCrowdDatasetResponse getCrowdDataset(GetCrowdDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCrowdDatasetWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取知识库数据数据</p>
     * 
     * @param tmpReq GetKnowledgeDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKnowledgeDataResponse
     */
    public GetKnowledgeDataResponse getKnowledgeDataWithOptions(GetKnowledgeDataRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetKnowledgeDataShrinkRequest request = new GetKnowledgeDataShrinkRequest();
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
            new TeaPair("action", "GetKnowledgeData"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yzd/getKnowledgeData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKnowledgeDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取知识库数据数据</p>
     * 
     * @param request GetKnowledgeDataRequest
     * @return GetKnowledgeDataResponse
     */
    public GetKnowledgeDataResponse getKnowledgeData(GetKnowledgeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getKnowledgeDataWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例结果</p>
     * 
     * @param tmpReq GetYzdInstanceTaskResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetYzdInstanceTaskResultResponse
     */
    public GetYzdInstanceTaskResultResponse getYzdInstanceTaskResultWithOptions(GetYzdInstanceTaskResultRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetYzdInstanceTaskResultShrinkRequest request = new GetYzdInstanceTaskResultShrinkRequest();
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
            new TeaPair("action", "GetYzdInstanceTaskResult"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yzd/getYzdInstanceTaskResult"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetYzdInstanceTaskResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例结果</p>
     * 
     * @param request GetYzdInstanceTaskResultRequest
     * @return GetYzdInstanceTaskResultResponse
     */
    public GetYzdInstanceTaskResultResponse getYzdInstanceTaskResult(GetYzdInstanceTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getYzdInstanceTaskResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>友准达知识库获取上传OSS数据文件的TOKEN</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetYzdStsAKResponse
     */
    public GetYzdStsAKResponse getYzdStsAKWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetYzdStsAK"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yzd/getYzdStsAK"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetYzdStsAKResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>友准达知识库获取上传OSS数据文件的TOKEN</p>
     * @return GetYzdStsAKResponse
     */
    public GetYzdStsAKResponse getYzdStsAK() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getYzdStsAKWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个批量任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListComputeTaskResponse
     */
    public ListComputeTaskResponse listComputeTaskWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComputeTask"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/listComputeTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComputeTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个批量任务</p>
     * @return ListComputeTaskResponse
     */
    public ListComputeTaskResponse listComputeTask() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listComputeTaskWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个批量任务</p>
     * 
     * @param request ListComputeTask2Request
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListComputeTask2Response
     */
    public ListComputeTask2Response listComputeTask2WithOptions(ListComputeTask2Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComputeTask2"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/listComputeTask2"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComputeTask2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个批量任务</p>
     * 
     * @param request ListComputeTask2Request
     * @return ListComputeTask2Response
     */
    public ListComputeTask2Response listComputeTask2(ListComputeTask2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listComputeTask2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个数据集</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSetResponse
     */
    public ListDataSetResponse listDataSetWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSet"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/listDataSet"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个数据集</p>
     * @return ListDataSetResponse
     */
    public ListDataSetResponse listDataSet() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSetWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个数据集</p>
     * 
     * @param request ListDataSet2Request
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSet2Response
     */
    public ListDataSet2Response listDataSet2WithOptions(ListDataSet2Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("pageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSet2"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/listDataSet2"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSet2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个数据集</p>
     * 
     * @param request ListDataSet2Request
     * @return ListDataSet2Response
     */
    public ListDataSet2Response listDataSet2(ListDataSet2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSet2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据集</p>
     * 
     * @param request RemoveDataSetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveDataSetResponse
     */
    public RemoveDataSetResponse removeDataSetWithOptions(RemoveDataSetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveDataSet"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/removeDataSet"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDataSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据集</p>
     * 
     * @param request RemoveDataSetRequest
     * @return RemoveDataSetResponse
     */
    public RemoveDataSetResponse removeDataSet(RemoveDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeDataSetWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据集</p>
     * 
     * @param request RemoveDataSet2Request
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveDataSet2Response
     */
    public RemoveDataSet2Response removeDataSet2WithOptions(RemoveDataSet2Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetId)) {
            body.put("dataSetId", request.dataSetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveDataSet2"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/removeDataSet2"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDataSet2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据集</p>
     * 
     * @param request RemoveDataSet2Request
     * @return RemoveDataSet2Response
     */
    public RemoveDataSet2Response removeDataSet2(RemoveDataSet2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeDataSet2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建人群集并绑定数据集</p>
     * 
     * @param tmpReq SaveCrowdDatasetAndBindingDatasetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveCrowdDatasetAndBindingDatasetResponse
     */
    public SaveCrowdDatasetAndBindingDatasetResponse saveCrowdDatasetAndBindingDatasetWithOptions(SaveCrowdDatasetAndBindingDatasetRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveCrowdDatasetAndBindingDatasetShrinkRequest request = new SaveCrowdDatasetAndBindingDatasetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveCrowdDatasetAndBindingDataset"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yzd/saveCrowdDatasetAndBindingDataset"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveCrowdDatasetAndBindingDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建人群集并绑定数据集</p>
     * 
     * @param request SaveCrowdDatasetAndBindingDatasetRequest
     * @return SaveCrowdDatasetAndBindingDatasetResponse
     */
    public SaveCrowdDatasetAndBindingDatasetResponse saveCrowdDatasetAndBindingDataset(SaveCrowdDatasetAndBindingDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveCrowdDatasetAndBindingDatasetWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个批量任务</p>
     * 
     * @param request SelectComputeTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SelectComputeTaskResponse
     */
    public SelectComputeTaskResponse selectComputeTaskWithOptions(SelectComputeTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SelectComputeTask"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/selectComputeTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SelectComputeTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个批量任务</p>
     * 
     * @param request SelectComputeTaskRequest
     * @return SelectComputeTaskResponse
     */
    public SelectComputeTaskResponse selectComputeTask(SelectComputeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.selectComputeTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个批量任务</p>
     * 
     * @param request SelectComputeTask2Request
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SelectComputeTask2Response
     */
    public SelectComputeTask2Response selectComputeTask2WithOptions(SelectComputeTask2Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bcConfirm)) {
            body.put("bcConfirm", request.bcConfirm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bcId)) {
            body.put("bcId", request.bcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("clientId", request.clientId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SelectComputeTask2"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/selectComputeTask2"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SelectComputeTask2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个批量任务</p>
     * 
     * @param request SelectComputeTask2Request
     * @return SelectComputeTask2Response
     */
    public SelectComputeTask2Response selectComputeTask2(SelectComputeTask2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.selectComputeTask2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个数据集</p>
     * 
     * @param request SelectDataSetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SelectDataSetResponse
     */
    public SelectDataSetResponse selectDataSetWithOptions(SelectDataSetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SelectDataSet"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/selectDataSet"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SelectDataSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个数据集</p>
     * 
     * @param request SelectDataSetRequest
     * @return SelectDataSetResponse
     */
    public SelectDataSetResponse selectDataSet(SelectDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.selectDataSetWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个数据集</p>
     * 
     * @param request SelectDataSet2Request
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SelectDataSet2Response
     */
    public SelectDataSet2Response selectDataSet2WithOptions(SelectDataSet2Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetId)) {
            body.put("dataSetId", request.dataSetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SelectDataSet2"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/selectDataSet2"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SelectDataSet2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个数据集</p>
     * 
     * @param request SelectDataSet2Request
     * @return SelectDataSet2Response
     */
    public SelectDataSet2Response selectDataSet2(SelectDataSet2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.selectDataSet2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交数据集任务，校验数据集</p>
     * 
     * @param request SubmitDataSetTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDataSetTaskResponse
     */
    public SubmitDataSetTaskResponse submitDataSetTaskWithOptions(SubmitDataSetTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDataSetTask"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/submitDataSetTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDataSetTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交数据集任务，校验数据集</p>
     * 
     * @param request SubmitDataSetTaskRequest
     * @return SubmitDataSetTaskResponse
     */
    public SubmitDataSetTaskResponse submitDataSetTask(SubmitDataSetTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitDataSetTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交数据集任务，校验数据集</p>
     * 
     * @param request SubmitDataSetTask2Request
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDataSetTask2Response
     */
    public SubmitDataSetTask2Response submitDataSetTask2WithOptions(SubmitDataSetTask2Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetId)) {
            body.put("dataSetId", request.dataSetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDataSetTask2"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bc/submitDataSetTask2"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDataSetTask2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>提交数据集任务，校验数据集</p>
     * 
     * @param request SubmitDataSetTask2Request
     * @return SubmitDataSetTask2Response
     */
    public SubmitDataSetTask2Response submitDataSetTask2(SubmitDataSetTask2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitDataSetTask2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交知识库校验任务</p>
     * 
     * @param tmpReq ValidateKnowLedgeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateKnowLedgeResponse
     */
    public ValidateKnowLedgeResponse validateKnowLedgeWithOptions(ValidateKnowLedgeRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ValidateKnowLedgeShrinkRequest request = new ValidateKnowLedgeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateKnowLedge"),
            new TeaPair("version", "2022-09-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yzd/validateKnowLedge"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateKnowLedgeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交知识库校验任务</p>
     * 
     * @param request ValidateKnowLedgeRequest
     * @return ValidateKnowLedgeResponse
     */
    public ValidateKnowLedgeResponse validateKnowLedge(ValidateKnowLedgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateKnowLedgeWithOptions(request, headers, runtime);
    }
}

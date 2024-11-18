// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203;

import com.aliyun.tea.*;
import com.aliyun.pai_dlc20201203.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "pai-dlc.aliyuncs.com"),
            new TeaPair("ap-south-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "pai-dlc.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "pai-dlc.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-chengdu", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-edge-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-fujian", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-qingdao", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-wuhan", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "pai-dlc.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("eu-west-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "pai-dlc.aliyuncs.com"),
            new TeaPair("me-east-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "pai-dlc.aliyuncs.com"),
            new TeaPair("us-east-1", "pai-dlc.aliyuncs.com"),
            new TeaPair("us-west-1", "pai-dlc.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("pai-dlc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建一个DLC作业</p>
     * 
     * @param request CreateJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobResponse
     */
    public CreateJobResponse createJobWithOptions(CreateJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeSource)) {
            body.put("CodeSource", request.codeSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfig)) {
            body.put("CredentialConfig", request.credentialConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSources)) {
            body.put("DataSources", request.dataSources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debuggerConfigContent)) {
            body.put("DebuggerConfigContent", request.debuggerConfigContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticSpec)) {
            body.put("ElasticSpec", request.elasticSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envs)) {
            body.put("Envs", request.envs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobMaxRunningTimeMinutes)) {
            body.put("JobMaxRunningTimeMinutes", request.jobMaxRunningTimeMinutes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobSpecs)) {
            body.put("JobSpecs", request.jobSpecs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settings)) {
            body.put("Settings", request.settings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.successPolicy)) {
            body.put("SuccessPolicy", request.successPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartyLibDir)) {
            body.put("ThirdpartyLibDir", request.thirdpartyLibDir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartyLibs)) {
            body.put("ThirdpartyLibs", request.thirdpartyLibs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCommand)) {
            body.put("UserCommand", request.userCommand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVpc)) {
            body.put("UserVpc", request.userVpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJob"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个DLC作业</p>
     * 
     * @param request CreateJobRequest
     * @return CreateJobResponse
     */
    public CreateJobResponse createJob(CreateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJobWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个Tensorboard</p>
     * 
     * @param request CreateTensorboardRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTensorboardResponse
     */
    public CreateTensorboardResponse createTensorboardWithOptions(CreateTensorboardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            body.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSources)) {
            body.put("DataSources", request.dataSources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxRunningTimeMinutes)) {
            body.put("MaxRunningTimeMinutes", request.maxRunningTimeMinutes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            body.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaId)) {
            body.put("QuotaId", request.quotaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.summaryPath)) {
            body.put("SummaryPath", request.summaryPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.summaryRelativePath)) {
            body.put("SummaryRelativePath", request.summaryRelativePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tensorboardDataSources)) {
            body.put("TensorboardDataSources", request.tensorboardDataSources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tensorboardSpec)) {
            body.put("TensorboardSpec", request.tensorboardSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uri)) {
            body.put("Uri", request.uri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTensorboard"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tensorboards"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTensorboardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个Tensorboard</p>
     * 
     * @param request CreateTensorboardRequest
     * @return CreateTensorboardResponse
     */
    public CreateTensorboardResponse createTensorboard(CreateTensorboardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTensorboardWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个DLC作业</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJobWithOptions(String JobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteJob"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(JobId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个DLC作业</p>
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJob(String JobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteJobWithOptions(JobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个数据源配置</p>
     * 
     * @param request DeleteTensorboardRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTensorboardResponse
     */
    public DeleteTensorboardResponse deleteTensorboardWithOptions(String TensorboardId, DeleteTensorboardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTensorboard"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tensorboards/" + com.aliyun.openapiutil.Client.getEncodeParam(TensorboardId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTensorboardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个数据源配置</p>
     * 
     * @param request DeleteTensorboardRequest
     * @return DeleteTensorboardResponse
     */
    public DeleteTensorboardResponse deleteTensorboard(String TensorboardId, DeleteTensorboardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTensorboardWithOptions(TensorboardId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个DLC作业详情</p>
     * 
     * @param request GetJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobResponse
     */
    public GetJobResponse getJobWithOptions(String JobId, GetJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.needDetail)) {
            query.put("NeedDetail", request.needDetail);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJob"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(JobId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个DLC作业详情</p>
     * 
     * @param request GetJobRequest
     * @return GetJobResponse
     */
    public GetJobResponse getJob(String JobId, GetJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobWithOptions(JobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取作业的事件</p>
     * 
     * @param request GetJobEventsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobEventsResponse
     */
    public GetJobEventsResponse getJobEventsWithOptions(String JobId, GetJobEventsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxEventsNum)) {
            query.put("MaxEventsNum", request.maxEventsNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobEvents"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(JobId) + "/events"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取作业的事件</p>
     * 
     * @param request GetJobEventsRequest
     * @return GetJobEventsResponse
     */
    public GetJobEventsResponse getJobEvents(String JobId, GetJobEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobEventsWithOptions(JobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个作业的资源监控指标</p>
     * 
     * @param request GetJobMetricsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobMetricsResponse
     */
    public GetJobMetricsResponse getJobMetricsWithOptions(String JobId, GetJobMetricsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStep)) {
            query.put("TimeStep", request.timeStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobMetrics"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(JobId) + "/metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个作业的资源监控指标</p>
     * 
     * @param request GetJobMetricsRequest
     * @return GetJobMetricsResponse
     */
    public GetJobMetricsResponse getJobMetrics(String JobId, GetJobMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobMetricsWithOptions(JobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取DLC作业某次算力健康检测结果</p>
     * 
     * @param request GetJobSanityCheckResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobSanityCheckResultResponse
     */
    public GetJobSanityCheckResultResponse getJobSanityCheckResultWithOptions(String JobId, GetJobSanityCheckResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sanityCheckNumber)) {
            query.put("SanityCheckNumber", request.sanityCheckNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sanityCheckPhase)) {
            query.put("SanityCheckPhase", request.sanityCheckPhase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobSanityCheckResult"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(JobId) + "/sanitycheckresult"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobSanityCheckResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取DLC作业某次算力健康检测结果</p>
     * 
     * @param request GetJobSanityCheckResultRequest
     * @return GetJobSanityCheckResultResponse
     */
    public GetJobSanityCheckResultResponse getJobSanityCheckResult(String JobId, GetJobSanityCheckResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobSanityCheckResultWithOptions(JobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取作业中一个运行实例的系统事件</p>
     * 
     * @param request GetPodEventsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPodEventsResponse
     */
    public GetPodEventsResponse getPodEventsWithOptions(String JobId, String PodId, GetPodEventsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxEventsNum)) {
            query.put("MaxEventsNum", request.maxEventsNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.podUid)) {
            query.put("PodUid", request.podUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPodEvents"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(JobId) + "/pods/" + com.aliyun.openapiutil.Client.getEncodeParam(PodId) + "/events"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPodEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取作业中一个运行实例的系统事件</p>
     * 
     * @param request GetPodEventsRequest
     * @return GetPodEventsResponse
     */
    public GetPodEventsResponse getPodEvents(String JobId, String PodId, GetPodEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPodEventsWithOptions(JobId, PodId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取作业中一个运行实例的日志</p>
     * 
     * @param request GetPodLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPodLogsResponse
     */
    public GetPodLogsResponse getPodLogsWithOptions(String JobId, String PodId, GetPodLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.downloadToFile)) {
            query.put("DownloadToFile", request.downloadToFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxLines)) {
            query.put("MaxLines", request.maxLines);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.podUid)) {
            query.put("PodUid", request.podUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPodLogs"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(JobId) + "/pods/" + com.aliyun.openapiutil.Client.getEncodeParam(PodId) + "/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPodLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取作业中一个运行实例的日志</p>
     * 
     * @param request GetPodLogsRequest
     * @return GetPodLogsResponse
     */
    public GetPodLogsResponse getPodLogs(String JobId, String PodId, GetPodLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPodLogsWithOptions(JobId, PodId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个Tensorboard</p>
     * 
     * @param request GetTensorboardRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTensorboardResponse
     */
    public GetTensorboardResponse getTensorboardWithOptions(String TensorboardId, GetTensorboardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jodId)) {
            query.put("JodId", request.jodId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTensorboard"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tensorboards/" + com.aliyun.openapiutil.Client.getEncodeParam(TensorboardId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTensorboardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个Tensorboard</p>
     * 
     * @param request GetTensorboardRequest
     * @return GetTensorboardResponse
     */
    public GetTensorboardResponse getTensorboard(String TensorboardId, GetTensorboardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTensorboardWithOptions(TensorboardId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get the shared url for tensorboard</p>
     * 
     * @param request GetTensorboardSharedUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTensorboardSharedUrlResponse
     */
    public GetTensorboardSharedUrlResponse getTensorboardSharedUrlWithOptions(String TensorboardId, GetTensorboardSharedUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireTimeSeconds)) {
            query.put("ExpireTimeSeconds", request.expireTimeSeconds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTensorboardSharedUrl"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tensorboards/" + com.aliyun.openapiutil.Client.getEncodeParam(TensorboardId) + "/sharedurl"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTensorboardSharedUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get the shared url for tensorboard</p>
     * 
     * @param request GetTensorboardSharedUrlRequest
     * @return GetTensorboardSharedUrlResponse
     */
    public GetTensorboardSharedUrlResponse getTensorboardSharedUrl(String TensorboardId, GetTensorboardSharedUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTensorboardSharedUrlWithOptions(TensorboardId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户Token</p>
     * 
     * @param request GetTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTokenResponse
     */
    public GetTokenResponse getTokenWithOptions(GetTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetToken"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tokens"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户Token</p>
     * 
     * @param request GetTokenRequest
     * @return GetTokenResponse
     */
    public GetTokenResponse getToken(GetTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get the url for accessing pod&#39;s terminal in k8s</p>
     * 
     * @param request GetWebTerminalRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWebTerminalResponse
     */
    public GetWebTerminalResponse getWebTerminalWithOptions(String JobId, String PodId, GetWebTerminalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isShared)) {
            query.put("IsShared", request.isShared);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.podUid)) {
            query.put("PodUid", request.podUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWebTerminal"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(JobId) + "/pods/" + com.aliyun.openapiutil.Client.getEncodeParam(PodId) + "/webterminal"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWebTerminalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get the url for accessing pod&#39;s terminal in k8s</p>
     * 
     * @param request GetWebTerminalRequest
     * @return GetWebTerminalResponse
     */
    public GetWebTerminalResponse getWebTerminal(String JobId, String PodId, GetWebTerminalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWebTerminalWithOptions(JobId, PodId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListEcsSpecs</p>
     * 
     * @param request ListEcsSpecsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEcsSpecsResponse
     */
    public ListEcsSpecsResponse listEcsSpecsWithOptions(ListEcsSpecsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorType)) {
            query.put("AcceleratorType", request.acceleratorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypes)) {
            query.put("InstanceTypes", request.instanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEcsSpecs"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/ecsspecs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEcsSpecsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListEcsSpecs</p>
     * 
     * @param request ListEcsSpecsRequest
     * @return ListEcsSpecsResponse
     */
    public ListEcsSpecsResponse listEcsSpecs(ListEcsSpecsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEcsSpecsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取某个DLC作业的多次算力健康检测结果</p>
     * 
     * @param request ListJobSanityCheckResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobSanityCheckResultsResponse
     */
    public ListJobSanityCheckResultsResponse listJobSanityCheckResultsWithOptions(String JobId, ListJobSanityCheckResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobSanityCheckResults"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(JobId) + "/sanitycheckresults"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobSanityCheckResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取某个DLC作业的多次算力健康检测结果</p>
     * 
     * @param request ListJobSanityCheckResultsRequest
     * @return ListJobSanityCheckResultsResponse
     */
    public ListJobSanityCheckResultsResponse listJobSanityCheckResults(String JobId, ListJobSanityCheckResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobSanityCheckResultsWithOptions(JobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据过滤条件获取DLC作业列表</p>
     * 
     * @param tmpReq ListJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobsWithOptions(ListJobsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListJobsShrinkRequest request = new ListJobsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            query.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessUserId)) {
            query.put("BusinessUserId", request.businessUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromAllWorkspaces)) {
            query.put("FromAllWorkspaces", request.fromAllWorkspaces);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceQuotaName)) {
            query.put("ResourceQuotaName", request.resourceQuotaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showOwn)) {
            query.put("ShowOwn", request.showOwn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdForFilter)) {
            query.put("UserIdForFilter", request.userIdForFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobs"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据过滤条件获取DLC作业列表</p>
     * 
     * @param request ListJobsRequest
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Tensorboard</p>
     * 
     * @param request ListTensorboardsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTensorboardsResponse
     */
    public ListTensorboardsResponse listTensorboardsWithOptions(ListTensorboardsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            query.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaId)) {
            query.put("QuotaId", request.quotaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showOwn)) {
            query.put("ShowOwn", request.showOwn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tensorboardId)) {
            query.put("TensorboardId", request.tensorboardId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTensorboards"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tensorboards"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTensorboardsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Tensorboard</p>
     * 
     * @param request ListTensorboardsRequest
     * @return ListTensorboardsResponse
     */
    public ListTensorboardsResponse listTensorboards(ListTensorboardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTensorboardsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开始运行tensorboard</p>
     * 
     * @param request StartTensorboardRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartTensorboardResponse
     */
    public StartTensorboardResponse startTensorboardWithOptions(String TensorboardId, StartTensorboardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartTensorboard"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tensorboards/" + com.aliyun.openapiutil.Client.getEncodeParam(TensorboardId) + "/start"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartTensorboardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开始运行tensorboard</p>
     * 
     * @param request StartTensorboardRequest
     * @return StartTensorboardResponse
     */
    public StartTensorboardResponse startTensorboard(String TensorboardId, StartTensorboardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startTensorboardWithOptions(TensorboardId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止一个DLC作业</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopJobResponse
     */
    public StopJobResponse stopJobWithOptions(String JobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopJob"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(JobId) + "/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止一个DLC作业</p>
     * @return StopJobResponse
     */
    public StopJobResponse stopJob(String JobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopJobWithOptions(JobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止运行tensorboard</p>
     * 
     * @param request StopTensorboardRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopTensorboardResponse
     */
    public StopTensorboardResponse stopTensorboardWithOptions(String TensorboardId, StopTensorboardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopTensorboard"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tensorboards/" + com.aliyun.openapiutil.Client.getEncodeParam(TensorboardId) + "/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopTensorboardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止运行tensorboard</p>
     * 
     * @param request StopTensorboardRequest
     * @return StopTensorboardResponse
     */
    public StopTensorboardResponse stopTensorboard(String TensorboardId, StopTensorboardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopTensorboardWithOptions(TensorboardId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新一个Job</p>
     * 
     * @param request UpdateJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateJobResponse
     */
    public UpdateJobResponse updateJobWithOptions(String JobId, UpdateJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateJob"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(JobId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新一个Job</p>
     * 
     * @param request UpdateJobRequest
     * @return UpdateJobResponse
     */
    public UpdateJobResponse updateJob(String JobId, UpdateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateJobWithOptions(JobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新tensorboard</p>
     * 
     * @param request UpdateTensorboardRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTensorboardResponse
     */
    public UpdateTensorboardResponse updateTensorboardWithOptions(String TensorboardId, UpdateTensorboardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            query.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxRunningTimeMinutes)) {
            query.put("MaxRunningTimeMinutes", request.maxRunningTimeMinutes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTensorboard"),
            new TeaPair("version", "2020-12-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tensorboards/" + com.aliyun.openapiutil.Client.getEncodeParam(TensorboardId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTensorboardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新tensorboard</p>
     * 
     * @param request UpdateTensorboardRequest
     * @return UpdateTensorboardResponse
     */
    public UpdateTensorboardResponse updateTensorboard(String TensorboardId, UpdateTensorboardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTensorboardWithOptions(TensorboardId, request, headers, runtime);
    }
}

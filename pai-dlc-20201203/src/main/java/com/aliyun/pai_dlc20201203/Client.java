// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203;

import com.aliyun.tea.*;
import com.aliyun.pai_dlc20201203.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
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

    public BatchGetJobsStatisticsResponse batchGetJobsStatistics(BatchGetJobsStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchGetJobsStatisticsWithOptions(request, headers, runtime);
    }

    public BatchGetJobsStatisticsResponse batchGetJobsStatisticsWithOptions(BatchGetJobsStatisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("WorkspaceIds", request.workspaceIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("BatchGetJobsStatistics", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/batch/statistics/jobs", "json", req, runtime), new BatchGetJobsStatisticsResponse());
    }

    public CreateCodeSourceResponse createCodeSource(CreateCodeSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCodeSourceWithOptions(request, headers, runtime);
    }

    public CreateCodeSourceResponse createCodeSourceWithOptions(CreateCodeSourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeBranch)) {
            body.put("CodeBranch", request.codeBranch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeRepo)) {
            body.put("CodeRepo", request.codeRepo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeRepoAccessToken)) {
            body.put("CodeRepoAccessToken", request.codeRepoAccessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeRepoUserName)) {
            body.put("CodeRepoUserName", request.codeRepoUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountPath)) {
            body.put("MountPath", request.mountPath);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateCodeSource", "2020-12-03", "HTTPS", "POST", "AK", "/api/v1/codesources", "json", req, runtime), new CreateCodeSourceResponse());
    }

    public CreateDataSourceResponse createDataSource(CreateDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataSourceWithOptions(request, headers, runtime);
    }

    public CreateDataSourceResponse createDataSourceWithOptions(CreateDataSourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            body.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            body.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountPath)) {
            body.put("MountPath", request.mountPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateDataSource", "2020-12-03", "HTTPS", "POST", "AK", "/api/v1/datasources", "json", req, runtime), new CreateDataSourceResponse());
    }

    public CreateJobResponse createJob(CreateJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJobWithOptions(request, headers, runtime);
    }

    public CreateJobResponse createJobWithOptions(CreateJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.codeSource))) {
            body.put("CodeSource", request.codeSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSources)) {
            body.put("DataSources", request.dataSources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.elasticSpec))) {
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

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.settings))) {
            body.put("Settings", request.settings);
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

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.userVpc))) {
            body.put("UserVpc", request.userVpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateJob", "2020-12-03", "HTTPS", "POST", "AK", "/api/v1/jobs", "json", req, runtime), new CreateJobResponse());
    }

    public CreateTensorboardResponse createTensorboard(CreateTensorboardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTensorboardWithOptions(request, headers, runtime);
    }

    public CreateTensorboardResponse createTensorboardWithOptions(CreateTensorboardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.summaryPath)) {
            body.put("SummaryPath", request.summaryPath);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateTensorboard", "2020-12-03", "HTTPS", "POST", "AK", "/api/v1/tensorboards", "json", req, runtime), new CreateTensorboardResponse());
    }

    public DeleteCodeSourceResponse deleteCodeSource(String CodeSourceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCodeSourceWithOptions(CodeSourceId, headers, runtime);
    }

    public DeleteCodeSourceResponse deleteCodeSourceWithOptions(String CodeSourceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        CodeSourceId = com.aliyun.openapiutil.Client.getEncodeParam(CodeSourceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteCodeSource", "2020-12-03", "HTTPS", "DELETE", "AK", "/api/v1/codesources/" + CodeSourceId + "", "json", req, runtime), new DeleteCodeSourceResponse());
    }

    public DeleteDataSourceResponse deleteDataSource(String DataSourceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataSourceWithOptions(DataSourceId, headers, runtime);
    }

    public DeleteDataSourceResponse deleteDataSourceWithOptions(String DataSourceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        DataSourceId = com.aliyun.openapiutil.Client.getEncodeParam(DataSourceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteDataSource", "2020-12-03", "HTTPS", "DELETE", "AK", "/api/v1/datasources/" + DataSourceId + "", "json", req, runtime), new DeleteDataSourceResponse());
    }

    public DeleteJobResponse deleteJob(String JobId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteJobWithOptions(JobId, headers, runtime);
    }

    public DeleteJobResponse deleteJobWithOptions(String JobId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        JobId = com.aliyun.openapiutil.Client.getEncodeParam(JobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteJob", "2020-12-03", "HTTPS", "DELETE", "AK", "/api/v1/jobs/" + JobId + "", "json", req, runtime), new DeleteJobResponse());
    }

    public DeleteTensorboardResponse deleteTensorboard(String TensorboardId, DeleteTensorboardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTensorboardWithOptions(TensorboardId, request, headers, runtime);
    }

    public DeleteTensorboardResponse deleteTensorboardWithOptions(String TensorboardId, DeleteTensorboardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        TensorboardId = com.aliyun.openapiutil.Client.getEncodeParam(TensorboardId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteTensorboard", "2020-12-03", "HTTPS", "DELETE", "AK", "/api/v1/tensorboards/" + TensorboardId + "", "json", req, runtime), new DeleteTensorboardResponse());
    }

    public GetAuthorizationResponse getAuthorization() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAuthorizationWithOptions(headers, runtime);
    }

    public GetAuthorizationResponse getAuthorizationWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetAuthorization", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/authorization", "json", req, runtime), new GetAuthorizationResponse());
    }

    public GetCodeSourceResponse getCodeSource(String CodeSourceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCodeSourceWithOptions(CodeSourceId, headers, runtime);
    }

    public GetCodeSourceResponse getCodeSourceWithOptions(String CodeSourceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        CodeSourceId = com.aliyun.openapiutil.Client.getEncodeParam(CodeSourceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetCodeSource", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/codesources/" + CodeSourceId + "", "json", req, runtime), new GetCodeSourceResponse());
    }

    public GetDataSourceResponse getDataSource(String DataSourceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataSourceWithOptions(DataSourceId, headers, runtime);
    }

    public GetDataSourceResponse getDataSourceWithOptions(String DataSourceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        DataSourceId = com.aliyun.openapiutil.Client.getEncodeParam(DataSourceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetDataSource", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/datasources/" + DataSourceId + "", "json", req, runtime), new GetDataSourceResponse());
    }

    public GetJobResponse getJob(String JobId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobWithOptions(JobId, headers, runtime);
    }

    public GetJobResponse getJobWithOptions(String JobId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        JobId = com.aliyun.openapiutil.Client.getEncodeParam(JobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetJob", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/jobs/" + JobId + "", "json", req, runtime), new GetJobResponse());
    }

    public GetJobEventsResponse getJobEvents(String JobId, GetJobEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobEventsWithOptions(JobId, request, headers, runtime);
    }

    public GetJobEventsResponse getJobEventsWithOptions(String JobId, GetJobEventsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        JobId = com.aliyun.openapiutil.Client.getEncodeParam(JobId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetJobEvents", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/jobs/" + JobId + "/events", "json", req, runtime), new GetJobEventsResponse());
    }

    public GetJobMetricsResponse getJobMetrics(String JobId, GetJobMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobMetricsWithOptions(JobId, request, headers, runtime);
    }

    public GetJobMetricsResponse getJobMetricsWithOptions(String JobId, GetJobMetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        JobId = com.aliyun.openapiutil.Client.getEncodeParam(JobId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetJobMetrics", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/jobs/" + JobId + "/metrics", "json", req, runtime), new GetJobMetricsResponse());
    }

    public GetJobsStatisticsResponse getJobsStatistics(GetJobsStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobsStatisticsWithOptions(request, headers, runtime);
    }

    public GetJobsStatisticsResponse getJobsStatisticsWithOptions(GetJobsStatisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetJobsStatistics", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/statistics/jobs", "json", req, runtime), new GetJobsStatisticsResponse());
    }

    public GetPodEventsResponse getPodEvents(String JobId, String PodId, GetPodEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPodEventsWithOptions(JobId, PodId, request, headers, runtime);
    }

    public GetPodEventsResponse getPodEventsWithOptions(String JobId, String PodId, GetPodEventsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        JobId = com.aliyun.openapiutil.Client.getEncodeParam(JobId);
        PodId = com.aliyun.openapiutil.Client.getEncodeParam(PodId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetPodEvents", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/jobs/" + JobId + "/pods/" + PodId + "/events", "json", req, runtime), new GetPodEventsResponse());
    }

    public GetPodLogsResponse getPodLogs(String JobId, String PodId, GetPodLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPodLogsWithOptions(JobId, PodId, request, headers, runtime);
    }

    public GetPodLogsResponse getPodLogsWithOptions(String JobId, String PodId, GetPodLogsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        JobId = com.aliyun.openapiutil.Client.getEncodeParam(JobId);
        PodId = com.aliyun.openapiutil.Client.getEncodeParam(PodId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetPodLogs", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/jobs/" + JobId + "/pods/" + PodId + "/logs", "json", req, runtime), new GetPodLogsResponse());
    }

    public GetSecurityGroupResponse getSecurityGroup(String SecurityGroupId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSecurityGroupWithOptions(SecurityGroupId, headers, runtime);
    }

    public GetSecurityGroupResponse getSecurityGroupWithOptions(String SecurityGroupId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        SecurityGroupId = com.aliyun.openapiutil.Client.getEncodeParam(SecurityGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetSecurityGroup", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/securitygroups/" + SecurityGroupId + "", "json", req, runtime), new GetSecurityGroupResponse());
    }

    public GetSwitchResponse getSwitch(String SwitchId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSwitchWithOptions(SwitchId, headers, runtime);
    }

    public GetSwitchResponse getSwitchWithOptions(String SwitchId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        SwitchId = com.aliyun.openapiutil.Client.getEncodeParam(SwitchId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetSwitch", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/switches/" + SwitchId + "", "json", req, runtime), new GetSwitchResponse());
    }

    public GetTensorboardResponse getTensorboard(String TensorboardId, GetTensorboardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTensorboardWithOptions(TensorboardId, request, headers, runtime);
    }

    public GetTensorboardResponse getTensorboardWithOptions(String TensorboardId, GetTensorboardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        TensorboardId = com.aliyun.openapiutil.Client.getEncodeParam(TensorboardId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jodId)) {
            query.put("JodId", request.jodId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetTensorboard", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/tensorboards/" + TensorboardId + "", "json", req, runtime), new GetTensorboardResponse());
    }

    public GetTokenResponse getToken(GetTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTokenWithOptions(request, headers, runtime);
    }

    public GetTokenResponse getTokenWithOptions(GetTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetToken", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/tokens", "json", req, runtime), new GetTokenResponse());
    }

    public GetUserAuthorizationResponse getUserAuthorization(String UserId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserAuthorizationWithOptions(UserId, headers, runtime);
    }

    public GetUserAuthorizationResponse getUserAuthorizationWithOptions(String UserId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        UserId = com.aliyun.openapiutil.Client.getEncodeParam(UserId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetUserAuthorization", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/users/" + UserId + "/authorization", "json", req, runtime), new GetUserAuthorizationResponse());
    }

    public GetVpcResponse getVpc(String VpcId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVpcWithOptions(VpcId, headers, runtime);
    }

    public GetVpcResponse getVpcWithOptions(String VpcId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        VpcId = com.aliyun.openapiutil.Client.getEncodeParam(VpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetVpc", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/vpcs/" + VpcId + "", "json", req, runtime), new GetVpcResponse());
    }

    public GetWorkspaceResponse getWorkspace(String WorkspaceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceWithOptions(WorkspaceId, headers, runtime);
    }

    public GetWorkspaceResponse getWorkspaceWithOptions(String WorkspaceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        WorkspaceId = com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetWorkspace", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/workspaces/" + WorkspaceId + "", "json", req, runtime), new GetWorkspaceResponse());
    }

    public JobDispatchQueryResponse jobDispatchQuery(JobDispatchQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.jobDispatchQueryWithOptions(request, headers, runtime);
    }

    public JobDispatchQueryResponse jobDispatchQueryWithOptions(JobDispatchQueryRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        JobDispatchQueryShrinkRequest request = new JobDispatchQueryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.properties)) {
            request.propertiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.properties, "Properties", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.settings)) {
            request.settingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.settings, "Settings", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algoName)) {
            query.put("AlgoName", request.algoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertiesShrink)) {
            query.put("Properties", request.propertiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settingsShrink)) {
            query.put("Settings", request.settingsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("JobDispatchQuery", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/jobdispatch", "json", req, runtime), new JobDispatchQueryResponse());
    }

    public JobDispatchSubmitResponse jobDispatchSubmit(JobDispatchSubmitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.jobDispatchSubmitWithOptions(request, headers, runtime);
    }

    public JobDispatchSubmitResponse jobDispatchSubmitWithOptions(JobDispatchSubmitRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algoName)) {
            body.put("AlgoName", request.algoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.properties)) {
            body.put("Properties", request.properties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settings)) {
            body.put("Settings", request.settings);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("JobDispatchSubmit", "2020-12-03", "HTTPS", "POST", "AK", "/api/v1/jobdispatch", "json", req, runtime), new JobDispatchSubmitResponse());
    }

    public ListCodeSourcesResponse listCodeSources(ListCodeSourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCodeSourcesWithOptions(request, headers, runtime);
    }

    public ListCodeSourcesResponse listCodeSourcesWithOptions(ListCodeSourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListCodeSources", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/codesources", "json", req, runtime), new ListCodeSourcesResponse());
    }

    public ListDataSourcesResponse listDataSources(ListDataSourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourcesWithOptions(request, headers, runtime);
    }

    public ListDataSourcesResponse listDataSourcesWithOptions(ListDataSourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListDataSources", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/datasources", "json", req, runtime), new ListDataSourcesResponse());
    }

    public ListEcsSpecsResponse listEcsSpecs(ListEcsSpecsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEcsSpecsWithOptions(request, headers, runtime);
    }

    public ListEcsSpecsResponse listEcsSpecsWithOptions(ListEcsSpecsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListEcsSpecs", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/ecsspecs", "json", req, runtime), new ListEcsSpecsResponse());
    }

    public ListImagesResponse listImages(ListImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listImagesWithOptions(request, headers, runtime);
    }

    public ListImagesResponse listImagesWithOptions(ListImagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorType)) {
            query.put("AcceleratorType", request.acceleratorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.framework)) {
            query.put("Framework", request.framework);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageProviderType)) {
            query.put("ImageProviderType", request.imageProviderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListImages", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/images", "json", req, runtime), new ListImagesResponse());
    }

    public ListJobsResponse listJobs(ListJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobsWithOptions(request, headers, runtime);
    }

    public ListJobsResponse listJobsWithOptions(ListJobsRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListJobsShrinkRequest request = new ListJobsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListJobs", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/jobs", "json", req, runtime), new ListJobsResponse());
    }

    public ListSecurityGroupsResponse listSecurityGroups(ListSecurityGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSecurityGroupsWithOptions(request, headers, runtime);
    }

    public ListSecurityGroupsResponse listSecurityGroupsWithOptions(ListSecurityGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListSecurityGroups", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/securitygroups", "json", req, runtime), new ListSecurityGroupsResponse());
    }

    public ListSwitchesResponse listSwitches(ListSwitchesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSwitchesWithOptions(request, headers, runtime);
    }

    public ListSwitchesResponse listSwitchesWithOptions(ListSwitchesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListSwitches", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/switches", "json", req, runtime), new ListSwitchesResponse());
    }

    public ListTensorboardsResponse listTensorboards(ListTensorboardsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTensorboardsWithOptions(request, headers, runtime);
    }

    public ListTensorboardsResponse listTensorboardsWithOptions(ListTensorboardsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
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

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListTensorboards", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/tensorboards", "json", req, runtime), new ListTensorboardsResponse());
    }

    public ListVpcsResponse listVpcs(ListVpcsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVpcsWithOptions(request, headers, runtime);
    }

    public ListVpcsResponse listVpcsWithOptions(ListVpcsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListVpcs", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/vpcs", "json", req, runtime), new ListVpcsResponse());
    }

    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkspacesWithOptions(request, headers, runtime);
    }

    public ListWorkspacesResponse listWorkspacesWithOptions(ListWorkspacesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.needDetail)) {
            query.put("NeedDetail", request.needDetail);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListWorkspaces", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/workspaces", "json", req, runtime), new ListWorkspacesResponse());
    }

    public StartTensorboardResponse startTensorboard(String TensorboardId, StartTensorboardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startTensorboardWithOptions(TensorboardId, request, headers, runtime);
    }

    public StartTensorboardResponse startTensorboardWithOptions(String TensorboardId, StartTensorboardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        TensorboardId = com.aliyun.openapiutil.Client.getEncodeParam(TensorboardId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("StartTensorboard", "2020-12-03", "HTTPS", "PUT", "AK", "/api/v1/tensorboards/" + TensorboardId + "/start", "json", req, runtime), new StartTensorboardResponse());
    }

    public StopJobResponse stopJob(String JobId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopJobWithOptions(JobId, headers, runtime);
    }

    public StopJobResponse stopJobWithOptions(String JobId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        JobId = com.aliyun.openapiutil.Client.getEncodeParam(JobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("StopJob", "2020-12-03", "HTTPS", "POST", "AK", "/api/v1/jobs/" + JobId + "/stop", "json", req, runtime), new StopJobResponse());
    }

    public StopTensorboardResponse stopTensorboard(String TensorboardId, StopTensorboardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopTensorboardWithOptions(TensorboardId, request, headers, runtime);
    }

    public StopTensorboardResponse stopTensorboardWithOptions(String TensorboardId, StopTensorboardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        TensorboardId = com.aliyun.openapiutil.Client.getEncodeParam(TensorboardId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("StopTensorboard", "2020-12-03", "HTTPS", "PUT", "AK", "/api/v1/tensorboards/" + TensorboardId + "/stop", "json", req, runtime), new StopTensorboardResponse());
    }

    public UpdateTensorboardResponse updateTensorboard(String TensorboardId, UpdateTensorboardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTensorboardWithOptions(TensorboardId, request, headers, runtime);
    }

    public UpdateTensorboardResponse updateTensorboardWithOptions(String TensorboardId, UpdateTensorboardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        TensorboardId = com.aliyun.openapiutil.Client.getEncodeParam(TensorboardId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxRunningTimeMinutes)) {
            query.put("MaxRunningTimeMinutes", request.maxRunningTimeMinutes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateTensorboard", "2020-12-03", "HTTPS", "PUT", "AK", "/api/v1/tensorboards/" + TensorboardId + "", "json", req, runtime), new UpdateTensorboardResponse());
    }
}

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

    public CreateCodeSourceResponse createCodeSource(CreateCodeSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCodeSourceWithOptions(request, headers, runtime);
    }

    public CreateCodeSourceResponse createCodeSourceWithOptions(CreateCodeSourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeRepo)) {
            body.put("CodeRepo", request.codeRepo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeBranch)) {
            body.put("CodeBranch", request.codeBranch);
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

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            body.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountPath)) {
            body.put("MountPath", request.mountPath);
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
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobSpecs)) {
            body.put("JobSpecs", request.jobSpecs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCommand)) {
            body.put("UserCommand", request.userCommand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSources)) {
            body.put("DataSources", request.dataSources);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.codeSource))) {
            body.put("CodeSource", request.codeSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.userVpc))) {
            body.put("UserVpc", request.userVpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartyLibs)) {
            body.put("ThirdpartyLibs", request.thirdpartyLibs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartyLibDir)) {
            body.put("ThirdpartyLibDir", request.thirdpartyLibDir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envs)) {
            body.put("Envs", request.envs);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateJob", "2020-12-03", "HTTPS", "POST", "AK", "/api/v1/jobs", "json", req, runtime), new CreateJobResponse());
    }

    public DeleteCodeSourceResponse deleteCodeSource(String CodeSourceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCodeSourceWithOptions(CodeSourceId, headers, runtime);
    }

    public DeleteCodeSourceResponse deleteCodeSourceWithOptions(String CodeSourceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteDataSource", "2020-12-03", "HTTPS", "DELETE", "AK", "/api/v1/datasources/" + DataSourceId + "", "json", req, runtime), new DeleteDataSourceResponse());
    }

    public DeleteJobResponse deleteJob(String Name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteJobWithOptions(Name, headers, runtime);
    }

    public DeleteJobResponse deleteJobWithOptions(String Name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteJob", "2020-12-03", "HTTPS", "DELETE", "AK", "/api/v1/jobs/" + Name + "", "json", req, runtime), new DeleteJobResponse());
    }

    public GetCodeSourceResponse getCodeSource(String CodeSourceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCodeSourceWithOptions(CodeSourceId, headers, runtime);
    }

    public GetCodeSourceResponse getCodeSourceWithOptions(String CodeSourceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxEventsNum)) {
            query.put("MaxEventsNum", request.maxEventsNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetJobEvents", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/jobs/" + JobId + "/events", "json", req, runtime), new GetJobEventsResponse());
    }

    public GetPodEventsResponse getPodEvents(String JobId, String PodId, GetPodEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPodEventsWithOptions(JobId, PodId, request, headers, runtime);
    }

    public GetPodEventsResponse getPodEventsWithOptions(String JobId, String PodId, GetPodEventsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxEventsNum)) {
            query.put("MaxEventsNum", request.maxEventsNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxLines)) {
            query.put("MaxLines", request.maxLines);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadToFile)) {
            query.put("DownloadToFile", request.downloadToFile);
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
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetSwitch", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/switches/" + SwitchId + "", "json", req, runtime), new GetSwitchResponse());
    }

    public GetTaskEventsResponse getTaskEvents(String JobName, String TaskName, GetTaskEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskEventsWithOptions(JobName, TaskName, request, headers, runtime);
    }

    public GetTaskEventsResponse getTaskEventsWithOptions(String JobName, String TaskName, GetTaskEventsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxEventsNum)) {
            query.put("MaxEventsNum", request.maxEventsNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetTaskEvents", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/jobs/" + JobName + "/tasks/" + TaskName + "/events", "json", req, runtime), new GetTaskEventsResponse());
    }

    public GetTaskLogsResponse getTaskLogs(String JobName, String TaskName, GetTaskLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskLogsWithOptions(JobName, TaskName, request, headers, runtime);
    }

    public GetTaskLogsResponse getTaskLogsWithOptions(String JobName, String TaskName, GetTaskLogsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxLines)) {
            query.put("MaxLines", request.maxLines);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadNeed)) {
            query.put("DownloadNeed", request.downloadNeed);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetTaskLogs", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/jobs/" + JobName + "/tasks/" + TaskName + "/logs", "json", req, runtime), new GetTaskLogsResponse());
    }

    public GetUserAuthorizationResponse getUserAuthorization(String UserId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserAuthorizationWithOptions(UserId, headers, runtime);
    }

    public GetUserAuthorizationResponse getUserAuthorizationWithOptions(String UserId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetVpc", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/vpcs/" + VpcId + "", "json", req, runtime), new GetVpcResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
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

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
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
        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
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
        if (!com.aliyun.teautil.Common.isUnset(request.imageProviderType)) {
            query.put("ImageProviderType", request.imageProviderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorType)) {
            query.put("AcceleratorType", request.acceleratorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.framework)) {
            query.put("Framework", request.framework);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
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

    public ListJobsResponse listJobsWithOptions(ListJobsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
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
        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

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
        return TeaModel.toModel(this.doROARequest("ListSwitches", "2020-12-03", "HTTPS", "GET", "AK", "/api/v1/switches", "json", req, runtime), new ListSwitchesResponse());
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

    public StopJobResponse stopJob(String JobId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopJobWithOptions(JobId, headers, runtime);
    }

    public StopJobResponse stopJobWithOptions(String JobId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("StopJob", "2020-12-03", "HTTPS", "POST", "AK", "/api/v1/jobs/" + JobId + "/stop", "json", req, runtime), new StopJobResponse());
    }
}

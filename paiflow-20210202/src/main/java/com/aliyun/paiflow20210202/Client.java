// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202;

import com.aliyun.tea.*;
import com.aliyun.paiflow20210202.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "pai.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "pai.cn-hangzhou.data.aliyun.com"),
            new TeaPair("cn-shanghai", "pai.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "pai.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-hongkong", "pai.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "pai.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "pai.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "pai.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "pai.ap-southeast-5.aliyuncs.com"),
            new TeaPair("us-west-1", "pai.us-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "pai.us-east-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "pai.eu-central-1.aliyuncs.com"),
            new TeaPair("me-east-1", "pai.me-east-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "pai.ap-south-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("paiflow", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public UpdateRunResponse updateRun(String RunId, UpdateRunRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRunWithOptions(RunId, request, headers, runtime);
    }

    public UpdateRunResponse updateRunWithOptions(String RunId, UpdateRunRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        RunId = com.aliyun.openapiutil.Client.getEncodeParam(RunId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateRun", "2021-02-02", "HTTPS", "PUT", "AK", "/api/v1/runs/" + RunId + "", "json", req, runtime), new UpdateRunResponse());
    }

    public UpdatePipelinePrivilegesResponse updatePipelinePrivileges(String PipelineId, UpdatePipelinePrivilegesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePipelinePrivilegesWithOptions(PipelineId, request, headers, runtime);
    }

    public UpdatePipelinePrivilegesResponse updatePipelinePrivilegesWithOptions(String PipelineId, UpdatePipelinePrivilegesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        PipelineId = com.aliyun.openapiutil.Client.getEncodeParam(PipelineId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdatePipelinePrivileges", "2021-02-02", "HTTPS", "PUT", "AK", "/api/v1/pipelines/" + PipelineId + "/privileges", "json", req, runtime), new UpdatePipelinePrivilegesResponse());
    }

    public GetNodeResponse getNode(String RunId, String NodeId, GetNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNodeWithOptions(RunId, NodeId, request, headers, runtime);
    }

    public GetNodeResponse getNodeWithOptions(String RunId, String NodeId, GetNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        RunId = com.aliyun.openapiutil.Client.getEncodeParam(RunId);
        NodeId = com.aliyun.openapiutil.Client.getEncodeParam(NodeId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.depth)) {
            query.put("Depth", request.depth);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetNode", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/runs/" + RunId + "/nodes/" + NodeId + "", "json", req, runtime), new GetNodeResponse());
    }

    public GetPipelineSchemaResponse getPipelineSchema(String PipelineId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineSchemaWithOptions(PipelineId, headers, runtime);
    }

    public GetPipelineSchemaResponse getPipelineSchemaWithOptions(String PipelineId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        PipelineId = com.aliyun.openapiutil.Client.getEncodeParam(PipelineId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetPipelineSchema", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/pipelines/" + PipelineId + "/schema", "json", req, runtime), new GetPipelineSchemaResponse());
    }

    public CreatePipelineResponse createPipeline(CreatePipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPipelineWithOptions(request, headers, runtime);
    }

    public CreatePipelineResponse createPipelineWithOptions(CreatePipelineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.manifest)) {
            body.put("Manifest", request.manifest);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreatePipeline", "2021-02-02", "HTTPS", "POST", "AK", "/api/v1/pipelines", "json", req, runtime), new CreatePipelineResponse());
    }

    public ListPipelinesResponse listPipelines(ListPipelinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelinesWithOptions(request, headers, runtime);
    }

    public ListPipelinesResponse listPipelinesWithOptions(ListPipelinesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineIdentifier)) {
            query.put("PipelineIdentifier", request.pipelineIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineProvider)) {
            query.put("PipelineProvider", request.pipelineProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineVersion)) {
            query.put("PipelineVersion", request.pipelineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListPipelines", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/pipelines", "json", req, runtime), new ListPipelinesResponse());
    }

    public ListRunsResponse listRuns(ListRunsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRunsWithOptions(request, headers, runtime);
    }

    public ListRunsResponse listRunsWithOptions(ListRunsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            query.put("ExperimentId", request.experimentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runId)) {
            query.put("RunId", request.runId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListRuns", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/runs", "json", req, runtime), new ListRunsResponse());
    }

    public ListRunsStatusResponse listRunsStatus(ListRunsStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRunsStatusWithOptions(request, headers, runtime);
    }

    public ListRunsStatusResponse listRunsStatusWithOptions(ListRunsStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.runs)) {
            body.put("Runs", request.runs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodes)) {
            body.put("Nodes", request.nodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("ListRunsStatus", "2021-02-02", "HTTPS", "PUT", "AK", "/api/v1/runs", "json", req, runtime), new ListRunsStatusResponse());
    }

    public CreatePipelineReleaseResponse createPipelineRelease(String PipelineId, CreatePipelineReleaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPipelineReleaseWithOptions(PipelineId, request, headers, runtime);
    }

    public CreatePipelineReleaseResponse createPipelineReleaseWithOptions(String PipelineId, CreatePipelineReleaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        PipelineId = com.aliyun.openapiutil.Client.getEncodeParam(PipelineId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.targetPipelineProvider)) {
            body.put("TargetPipelineProvider", request.targetPipelineProvider);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreatePipelineRelease", "2021-02-02", "HTTPS", "PUT", "AK", "/api/v1/pipelines/" + PipelineId + "/releases", "json", req, runtime), new CreatePipelineReleaseResponse());
    }

    public ListNodeOutputsResponse listNodeOutputs(String RunId, String NodeId, ListNodeOutputsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNodeOutputsWithOptions(RunId, NodeId, request, headers, runtime);
    }

    public ListNodeOutputsResponse listNodeOutputsWithOptions(String RunId, String NodeId, ListNodeOutputsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        RunId = com.aliyun.openapiutil.Client.getEncodeParam(RunId);
        NodeId = com.aliyun.openapiutil.Client.getEncodeParam(NodeId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.depth)) {
            query.put("Depth", request.depth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListNodeOutputs", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/runs/" + RunId + "/nodes/" + NodeId + "/outputs", "json", req, runtime), new ListNodeOutputsResponse());
    }

    public GetPipelineResponse getPipeline(String PipelineId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineWithOptions(PipelineId, headers, runtime);
    }

    public GetPipelineResponse getPipelineWithOptions(String PipelineId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        PipelineId = com.aliyun.openapiutil.Client.getEncodeParam(PipelineId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetPipeline", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/pipelines/" + PipelineId + "", "json", req, runtime), new GetPipelineResponse());
    }

    public ListPipelinesWithLatestRunInfoResponse listPipelinesWithLatestRunInfo(ListPipelinesWithLatestRunInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelinesWithLatestRunInfoWithOptions(request, headers, runtime);
    }

    public ListPipelinesWithLatestRunInfoResponse listPipelinesWithLatestRunInfoWithOptions(ListPipelinesWithLatestRunInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineIdentifier)) {
            query.put("PipelineIdentifier", request.pipelineIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineProvider)) {
            query.put("PipelineProvider", request.pipelineProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineVersion)) {
            query.put("PipelineVersion", request.pipelineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListPipelinesWithLatestRunInfo", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/lightness/pipelines", "json", req, runtime), new ListPipelinesWithLatestRunInfoResponse());
    }

    public DeleteRunResponse deleteRun(String RunId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRunWithOptions(RunId, headers, runtime);
    }

    public DeleteRunResponse deleteRunWithOptions(String RunId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RunId = com.aliyun.openapiutil.Client.getEncodeParam(RunId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteRun", "2021-02-02", "HTTPS", "DELETE", "AK", "/api/v1/runs/" + RunId + "", "json", req, runtime), new DeleteRunResponse());
    }

    public ListPipelinePrivilegesResponse listPipelinePrivileges(String PipelineId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelinePrivilegesWithOptions(PipelineId, headers, runtime);
    }

    public ListPipelinePrivilegesResponse listPipelinePrivilegesWithOptions(String PipelineId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        PipelineId = com.aliyun.openapiutil.Client.getEncodeParam(PipelineId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListPipelinePrivileges", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/pipelines/" + PipelineId + "/privileges", "json", req, runtime), new ListPipelinePrivilegesResponse());
    }

    public CreateRunResponse createRun(CreateRunRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRunWithOptions(request, headers, runtime);
    }

    public CreateRunResponse createRunWithOptions(CreateRunRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            body.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineManifest)) {
            body.put("PipelineManifest", request.pipelineManifest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arguments)) {
            body.put("Arguments", request.arguments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noConfirmRequired)) {
            body.put("NoConfirmRequired", request.noConfirmRequired);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            body.put("ExperimentId", request.experimentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("Options", request.options);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateRun", "2021-02-02", "HTTPS", "POST", "AK", "/api/v1/runs", "json", req, runtime), new CreateRunResponse());
    }

    public DeletePipelineResponse deletePipeline(String PipelineId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePipelineWithOptions(PipelineId, headers, runtime);
    }

    public DeletePipelineResponse deletePipelineWithOptions(String PipelineId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        PipelineId = com.aliyun.openapiutil.Client.getEncodeParam(PipelineId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeletePipeline", "2021-02-02", "HTTPS", "DELETE", "AK", "/api/v1/pipelines/" + PipelineId + "", "json", req, runtime), new DeletePipelineResponse());
    }

    public GetCallerProviderResponse getCallerProvider() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCallerProviderWithOptions(headers, runtime);
    }

    public GetCallerProviderResponse getCallerProviderWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetCallerProvider", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/provider", "json", req, runtime), new GetCallerProviderResponse());
    }

    public TerminateRunResponse terminateRun(String RunId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.terminateRunWithOptions(RunId, headers, runtime);
    }

    public TerminateRunResponse terminateRunWithOptions(String RunId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RunId = com.aliyun.openapiutil.Client.getEncodeParam(RunId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("TerminateRun", "2021-02-02", "HTTPS", "PUT", "AK", "/api/v1/runs/" + RunId + "/termination", "json", req, runtime), new TerminateRunResponse());
    }

    public GetRunResponse getRun(String RunId, GetRunRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRunWithOptions(RunId, request, headers, runtime);
    }

    public GetRunResponse getRunWithOptions(String RunId, GetRunRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        RunId = com.aliyun.openapiutil.Client.getEncodeParam(RunId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetRun", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/runs/" + RunId + "", "json", req, runtime), new GetRunResponse());
    }

    public GetRunStatisticsResponse getRunStatistics(GetRunStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRunStatisticsWithOptions(request, headers, runtime);
    }

    public GetRunStatisticsResponse getRunStatisticsWithOptions(GetRunStatisticsRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetRunStatisticsShrinkRequest request = new GetRunStatisticsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.status)) {
            request.statusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.status, "Status", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusShrink)) {
            query.put("Status", request.statusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            query.put("ExperimentId", request.experimentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isShowAll)) {
            query.put("IsShowAll", request.isShowAll);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetRunStatistics", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/statistics/runs", "json", req, runtime), new GetRunStatisticsResponse());
    }

    public UpdatePipelineResponse updatePipeline(String PipelineId, UpdatePipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePipelineWithOptions(PipelineId, request, headers, runtime);
    }

    public UpdatePipelineResponse updatePipelineWithOptions(String PipelineId, UpdatePipelineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        PipelineId = com.aliyun.openapiutil.Client.getEncodeParam(PipelineId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.manifest)) {
            body.put("Manifest", request.manifest);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdatePipeline", "2021-02-02", "HTTPS", "PUT", "AK", "/api/v1/pipelines/" + PipelineId + "", "json", req, runtime), new UpdatePipelineResponse());
    }

    public GetRunStatusResponse getRunStatus(String RunId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRunStatusWithOptions(RunId, headers, runtime);
    }

    public GetRunStatusResponse getRunStatusWithOptions(String RunId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RunId = com.aliyun.openapiutil.Client.getEncodeParam(RunId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetRunStatus", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/runs/" + RunId + "/status", "json", req, runtime), new GetRunStatusResponse());
    }

    public ListNodeLogsResponse listNodeLogs(String RunId, String NodeId, ListNodeLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNodeLogsWithOptions(RunId, NodeId, request, headers, runtime);
    }

    public ListNodeLogsResponse listNodeLogsWithOptions(String RunId, String NodeId, ListNodeLogsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        RunId = com.aliyun.openapiutil.Client.getEncodeParam(RunId);
        NodeId = com.aliyun.openapiutil.Client.getEncodeParam(NodeId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("Offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromTimeInSeconds)) {
            query.put("FromTimeInSeconds", request.fromTimeInSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverse)) {
            query.put("Reverse", request.reverse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toTimeInSeconds)) {
            query.put("ToTimeInSeconds", request.toTimeInSeconds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListNodeLogs", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/runs/" + RunId + "/nodes/" + NodeId + "/logs", "json", req, runtime), new ListNodeLogsResponse());
    }

    public StartRunResponse startRun(String RunId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startRunWithOptions(RunId, headers, runtime);
    }

    public StartRunResponse startRunWithOptions(String RunId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        RunId = com.aliyun.openapiutil.Client.getEncodeParam(RunId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("StartRun", "2021-02-02", "HTTPS", "PUT", "AK", "/api/v1/runs/" + RunId + "/start", "json", req, runtime), new StartRunResponse());
    }
}

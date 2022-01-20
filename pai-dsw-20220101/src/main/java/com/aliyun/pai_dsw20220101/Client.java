// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101;

import com.aliyun.tea.*;
import com.aliyun.pai_dsw20220101.models.*;
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
        this._endpoint = this.getEndpoint("pai-dsw", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceWithOptions(request, headers, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasets)) {
            body.put("Datasets", request.datasets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsSpec)) {
            body.put("EcsSpec", request.ecsSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentVariables)) {
            body.put("EnvironmentVariables", request.environmentVariables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    public CreateInstanceShutdownTimerResponse createInstanceShutdownTimer(String InstanceId, CreateInstanceShutdownTimerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceShutdownTimerWithOptions(InstanceId, request, headers, runtime);
    }

    public CreateInstanceShutdownTimerResponse createInstanceShutdownTimerWithOptions(String InstanceId, CreateInstanceShutdownTimerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dueTime)) {
            body.put("DueTime", request.dueTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remainingTimeInMs)) {
            body.put("RemainingTimeInMs", request.remainingTimeInMs);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceShutdownTimer"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + InstanceId + "/shutdowntimer"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceShutdownTimerResponse());
    }

    public CreateInstanceSnapshotResponse createInstanceSnapshot(String InstanceId, CreateInstanceSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceSnapshotWithOptions(InstanceId, request, headers, runtime);
    }

    public CreateInstanceSnapshotResponse createInstanceSnapshotWithOptions(String InstanceId, CreateInstanceSnapshotRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotDescription)) {
            body.put("SnapshotDescription", request.snapshotDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotName)) {
            body.put("SnapshotName", request.snapshotName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceSnapshot"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + InstanceId + "/snapshots"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceSnapshotResponse());
    }

    public DeleteInstanceResponse deleteInstance(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceWithOptions(InstanceId, headers, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + InstanceId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceShutdownTimerResponse deleteInstanceShutdownTimer(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceShutdownTimerWithOptions(InstanceId, headers, runtime);
    }

    public DeleteInstanceShutdownTimerResponse deleteInstanceShutdownTimerWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstanceShutdownTimer"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + InstanceId + "/shutdowntimer"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceShutdownTimerResponse());
    }

    public DeleteInstanceSnapshotResponse deleteInstanceSnapshot(String InstanceId, String SnapshotId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceSnapshotWithOptions(InstanceId, SnapshotId, headers, runtime);
    }

    public DeleteInstanceSnapshotResponse deleteInstanceSnapshotWithOptions(String InstanceId, String SnapshotId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        SnapshotId = com.aliyun.openapiutil.Client.getEncodeParam(SnapshotId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstanceSnapshot"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + InstanceId + "/snapshots/" + SnapshotId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceSnapshotResponse());
    }

    public GetInstanceResponse getInstance(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceWithOptions(InstanceId, headers, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + InstanceId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    public GetInstanceShutdownTimerResponse getInstanceShutdownTimer(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceShutdownTimerWithOptions(InstanceId, headers, runtime);
    }

    public GetInstanceShutdownTimerResponse getInstanceShutdownTimerWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceShutdownTimer"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + InstanceId + "/shutdowntimer"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceShutdownTimerResponse());
    }

    public GetInstanceSnapshotResponse getInstanceSnapshot(String InstanceId, String SnapshotId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceSnapshotWithOptions(InstanceId, SnapshotId, headers, runtime);
    }

    public GetInstanceSnapshotResponse getInstanceSnapshotWithOptions(String InstanceId, String SnapshotId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        SnapshotId = com.aliyun.openapiutil.Client.getEncodeParam(SnapshotId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceSnapshot"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + InstanceId + "/snapshots/" + SnapshotId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceSnapshotResponse());
    }

    public GetUserConfigResponse getUserConfig() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserConfigWithOptions(headers, runtime);
    }

    public GetUserConfigResponse getUserConfigWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserConfig"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/userconfig"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserConfigResponse());
    }

    public ListEcsSpecsResponse listEcsSpecs(ListEcsSpecsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEcsSpecsWithOptions(request, headers, runtime);
    }

    public ListEcsSpecsResponse listEcsSpecsWithOptions(ListEcsSpecsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorType)) {
            query.put("AcceleratorType", request.acceleratorType);
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEcsSpecs"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/ecsspecs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEcsSpecsResponse());
    }

    public ListInstanceSnapshotResponse listInstanceSnapshot(String InstanceId, ListInstanceSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceSnapshotWithOptions(InstanceId, request, headers, runtime);
    }

    public ListInstanceSnapshotResponse listInstanceSnapshotWithOptions(String InstanceId, ListInstanceSnapshotRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceSnapshot"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + InstanceId + "/snapshots"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceSnapshotResponse());
    }

    public ListInstanceStatisticsResponse listInstanceStatistics(ListInstanceStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceStatisticsWithOptions(request, headers, runtime);
    }

    public ListInstanceStatisticsResponse listInstanceStatisticsWithOptions(ListInstanceStatisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("WorkspaceIds", request.workspaceIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceStatistics"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instancestatistics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceStatisticsResponse());
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstancesWithOptions(request, headers, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    public StartInstanceResponse startInstance(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startInstanceWithOptions(InstanceId, headers, runtime);
    }

    public StartInstanceResponse startInstanceWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartInstance"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + InstanceId + "/start"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartInstanceResponse());
    }

    public StopInstanceResponse stopInstance(String InstanceId, StopInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    public StopInstanceResponse stopInstanceWithOptions(String InstanceId, StopInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.saveImage)) {
            query.put("SaveImage", request.saveImage);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInstance"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + InstanceId + "/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstanceResponse());
    }

    public UpdateInstanceResponse updateInstance(String InstanceId, UpdateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateInstanceResponse updateInstanceWithOptions(String InstanceId, UpdateInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + InstanceId + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }
}

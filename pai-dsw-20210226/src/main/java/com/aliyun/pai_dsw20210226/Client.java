// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226;

import com.aliyun.tea.*;
import com.aliyun.pai_dsw20210226.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    public CreateImageResponse createImage(CreateImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createImageWithOptions(request, headers, runtime);
    }

    public CreateImageResponse createImageWithOptions(CreateImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repository)) {
            body.put("Repository", request.repository);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateImage", "2021-02-26", "HTTPS", "POST", "AK", "/api/v1/images", "json", req, runtime), new CreateImageResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceWithOptions(request, headers, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetList)) {
            body.put("DatasetList", request.datasetList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsSpec)) {
            body.put("EcsSpec", request.ecsSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environments)) {
            body.put("Environments", request.environments);
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

        if (!com.aliyun.teautil.Common.isUnset(request.isPublic)) {
            body.put("IsPublic", request.isPublic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nasFileSystemId)) {
            body.put("NasFileSystemId", request.nasFileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
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
        return TeaModel.toModel(this.doROARequest("CreateInstance", "2021-02-26", "HTTPS", "POST", "AK", "/api/v1/instances/", "json", req, runtime), new CreateInstanceResponse());
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
        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTime)) {
            body.put("ScheduleTime", request.scheduleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttlInMillis)) {
            body.put("TtlInMillis", request.ttlInMillis);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateInstanceShutdownTimer", "2021-02-26", "HTTPS", "POST", "AK", "/api/v1/instances/" + InstanceId + "/shutdownTimer", "json", req, runtime), new CreateInstanceShutdownTimerResponse());
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
        if (!com.aliyun.teautil.Common.isUnset(request.instanceSnapshotDescription)) {
            body.put("InstanceSnapshotDescription", request.instanceSnapshotDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceSnapshotName)) {
            body.put("InstanceSnapshotName", request.instanceSnapshotName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceSnapshotRepoUrl)) {
            body.put("InstanceSnapshotRepoUrl", request.instanceSnapshotRepoUrl);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateInstanceSnapshot", "2021-02-26", "HTTPS", "POST", "AK", "/api/v1/instances/" + InstanceId + "/snapshots", "json", req, runtime), new CreateInstanceSnapshotResponse());
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
        return TeaModel.toModel(this.doROARequest("DeleteInstance", "2021-02-26", "HTTPS", "DELETE", "AK", "/api/v1/instances/" + InstanceId + "", "json", req, runtime), new DeleteInstanceResponse());
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
        return TeaModel.toModel(this.doROARequest("DeleteInstanceShutdownTimer", "2021-02-26", "HTTPS", "DELETE", "AK", "/api/v1/instances/" + InstanceId + "/shutdownTimer", "json", req, runtime), new DeleteInstanceShutdownTimerResponse());
    }

    public DeleteInstanceSnapshotResponse deleteInstanceSnapshot(String InstanceId, String InstanceSnapshotId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceSnapshotWithOptions(InstanceId, InstanceSnapshotId, headers, runtime);
    }

    public DeleteInstanceSnapshotResponse deleteInstanceSnapshotWithOptions(String InstanceId, String InstanceSnapshotId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        InstanceSnapshotId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceSnapshotId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteInstanceSnapshot", "2021-02-26", "HTTPS", "DELETE", "AK", "/api/v1/instances/" + InstanceId + "/snapshots/" + InstanceSnapshotId + "", "json", req, runtime), new DeleteInstanceSnapshotResponse());
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
        return TeaModel.toModel(this.doROARequest("GetAuthorization", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/authorization", "json", req, runtime), new GetAuthorizationResponse());
    }

    public GetDashboardStatisticsResponse getDashboardStatistics(GetDashboardStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDashboardStatisticsWithOptions(request, headers, runtime);
    }

    public GetDashboardStatisticsResponse getDashboardStatisticsWithOptions(GetDashboardStatisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetDashboardStatistics", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/statistics/dashboard", "json", req, runtime), new GetDashboardStatisticsResponse());
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
        return TeaModel.toModel(this.doROARequest("GetInstance", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/instances/" + InstanceId + "", "json", req, runtime), new GetInstanceResponse());
    }

    public GetInstanceImageResponse getInstanceImage(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceImageWithOptions(InstanceId, headers, runtime);
    }

    public GetInstanceImageResponse getInstanceImageWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetInstanceImage", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/instances/" + InstanceId + "/image", "json", req, runtime), new GetInstanceImageResponse());
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
        return TeaModel.toModel(this.doROARequest("GetInstanceShutdownTimer", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/instances/" + InstanceId + "/shutdownTimer", "json", req, runtime), new GetInstanceShutdownTimerResponse());
    }

    public GetInstanceSnapshotResponse getInstanceSnapshot(String InstanceId, String InstanceSnapshotId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceSnapshotWithOptions(InstanceId, InstanceSnapshotId, headers, runtime);
    }

    public GetInstanceSnapshotResponse getInstanceSnapshotWithOptions(String InstanceId, String InstanceSnapshotId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        InstanceSnapshotId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceSnapshotId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetInstanceSnapshot", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/instances/" + InstanceId + "/snapshots/" + InstanceSnapshotId + "", "json", req, runtime), new GetInstanceSnapshotResponse());
    }

    public GetInstanceTypeResponse getInstanceType(String InstanceTypeId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceTypeWithOptions(InstanceTypeId, headers, runtime);
    }

    public GetInstanceTypeResponse getInstanceTypeWithOptions(String InstanceTypeId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceTypeId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceTypeId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetInstanceType", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/instanceTypes/" + InstanceTypeId + "", "json", req, runtime), new GetInstanceTypeResponse());
    }

    public GetInstanceUrlResponse getInstanceUrl(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceUrlWithOptions(InstanceId, headers, runtime);
    }

    public GetInstanceUrlResponse getInstanceUrlWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetInstanceUrl", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/instances/" + InstanceId + "/url", "json", req, runtime), new GetInstanceUrlResponse());
    }

    public GetInstancesStatisticsResponse getInstancesStatistics(GetInstancesStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstancesStatisticsWithOptions(request, headers, runtime);
    }

    public GetInstancesStatisticsResponse getInstancesStatisticsWithOptions(GetInstancesStatisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("WorkspaceIds", request.workspaceIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetInstancesStatistics", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/statistics/instances", "json", req, runtime), new GetInstancesStatisticsResponse());
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
        return TeaModel.toModel(this.doROARequest("GetUserConfig", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/users/config", "json", req, runtime), new GetUserConfigResponse());
    }

    public GetUserResourceAuthorizationStatusResponse getUserResourceAuthorizationStatus() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserResourceAuthorizationStatusWithOptions(headers, runtime);
    }

    public GetUserResourceAuthorizationStatusResponse getUserResourceAuthorizationStatusWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetUserResourceAuthorizationStatus", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/users/resourceAuthorizationStatus", "json", req, runtime), new GetUserResourceAuthorizationStatusResponse());
    }

    public GetUserResourceStatusResponse getUserResourceStatus() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserResourceStatusWithOptions(headers, runtime);
    }

    public GetUserResourceStatusResponse getUserResourceStatusWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetUserResourceStatus", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/users/resourceStatus", "json", req, runtime), new GetUserResourceStatusResponse());
    }

    public GetUserSpecialVersionGpuResourceInfoResponse getUserSpecialVersionGpuResourceInfo(GetUserSpecialVersionGpuResourceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserSpecialVersionGpuResourceInfoWithOptions(request, headers, runtime);
    }

    public GetUserSpecialVersionGpuResourceInfoResponse getUserSpecialVersionGpuResourceInfoWithOptions(GetUserSpecialVersionGpuResourceInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetUserSpecialVersionGpuResourceInfo", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/users/specialVersionGpuResourceInfo", "json", req, runtime), new GetUserSpecialVersionGpuResourceInfoResponse());
    }

    public ListConfigsResponse listConfigs() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConfigsWithOptions(headers, runtime);
    }

    public ListConfigsResponse listConfigsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListConfigs", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/configs", "json", req, runtime), new ListConfigsResponse());
    }

    public ListDatasetsResponse listDatasets(ListDatasetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDatasetsWithOptions(request, headers, runtime);
    }

    public ListDatasetsResponse listDatasetsWithOptions(ListDatasetsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListDatasets", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/datasets", "json", req, runtime), new ListDatasetsResponse());
    }

    public ListEcsSpecsResponse listEcsSpecs(ListEcsSpecsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEcsSpecsWithOptions(request, headers, runtime);
    }

    public ListEcsSpecsResponse listEcsSpecsWithOptions(ListEcsSpecsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorTypeEquals)) {
            query.put("AcceleratorTypeEquals", request.acceleratorTypeEquals);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListEcsSpecs", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/ecsSpecs", "json", req, runtime), new ListEcsSpecsResponse());
    }

    public ListImagesResponse listImages(ListImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listImagesWithOptions(request, headers, runtime);
    }

    public ListImagesResponse listImagesWithOptions(ListImagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorTypeEquals)) {
            query.put("AcceleratorTypeEquals", request.acceleratorTypeEquals);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageNameContains)) {
            query.put("ImageNameContains", request.imageNameContains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageTypeEquals)) {
            query.put("ImageTypeEquals", request.imageTypeEquals);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListImages", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/images", "json", req, runtime), new ListImagesResponse());
    }

    public ListInstanceSnapshotsResponse listInstanceSnapshots(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceSnapshotsWithOptions(InstanceId, headers, runtime);
    }

    public ListInstanceSnapshotsResponse listInstanceSnapshotsWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListInstanceSnapshots", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/instances/" + InstanceId + "/snapshots", "json", req, runtime), new ListInstanceSnapshotsResponse());
    }

    public ListInstanceTypesResponse listInstanceTypes(ListInstanceTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceTypesWithOptions(request, headers, runtime);
    }

    public ListInstanceTypesResponse listInstanceTypesWithOptions(ListInstanceTypesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorType)) {
            query.put("AcceleratorType", request.acceleratorType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListInstanceTypes", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/instanceTypes", "json", req, runtime), new ListInstanceTypesResponse());
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstancesWithOptions(request, headers, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inWorkspace)) {
            query.put("InWorkspace", request.inWorkspace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceNameContains)) {
            query.put("InstanceNameContains", request.instanceNameContains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceStatusEquals)) {
            query.put("InstanceStatusEquals", request.instanceStatusEquals);
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

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIdEquals)) {
            query.put("WorkspaceIdEquals", request.workspaceIdEquals);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListInstances", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/instances", "json", req, runtime), new ListInstancesResponse());
    }

    public ListInstancesStatusResponse listInstancesStatus(ListInstancesStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstancesStatusWithOptions(request, headers, runtime);
    }

    public ListInstancesStatusResponse listInstancesStatusWithOptions(ListInstancesStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListInstancesStatus", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/statuses/instances", "json", req, runtime), new ListInstancesStatusResponse());
    }

    public ListNamespacesResponse listNamespaces() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNamespacesWithOptions(headers, runtime);
    }

    public ListNamespacesResponse listNamespacesWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListNamespaces", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/imageRegistry/namespaces", "json", req, runtime), new ListNamespacesResponse());
    }

    public ListNasesResponse listNases() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNasesWithOptions(headers, runtime);
    }

    public ListNasesResponse listNasesWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListNases", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/nases", "json", req, runtime), new ListNasesResponse());
    }

    public ListNetworkSecurityGroupsResponse listNetworkSecurityGroups(String VpcId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNetworkSecurityGroupsWithOptions(VpcId, headers, runtime);
    }

    public ListNetworkSecurityGroupsResponse listNetworkSecurityGroupsWithOptions(String VpcId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        VpcId = com.aliyun.openapiutil.Client.getEncodeParam(VpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListNetworkSecurityGroups", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/network/vpcs/" + VpcId + "/securityGroups", "json", req, runtime), new ListNetworkSecurityGroupsResponse());
    }

    public ListNetworkVSwitchesResponse listNetworkVSwitches(String VpcId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNetworkVSwitchesWithOptions(VpcId, headers, runtime);
    }

    public ListNetworkVSwitchesResponse listNetworkVSwitchesWithOptions(String VpcId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        VpcId = com.aliyun.openapiutil.Client.getEncodeParam(VpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListNetworkVSwitches", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/network/vpcs/" + VpcId + "/vSwitches", "json", req, runtime), new ListNetworkVSwitchesResponse());
    }

    public ListNetworkVpcsResponse listNetworkVpcs() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNetworkVpcsWithOptions(headers, runtime);
    }

    public ListNetworkVpcsResponse listNetworkVpcsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListNetworkVpcs", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/network/vpcs", "json", req, runtime), new ListNetworkVpcsResponse());
    }

    public ListRegionsResponse listRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegionsWithOptions(headers, runtime);
    }

    public ListRegionsResponse listRegionsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListRegions", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/configs/regions", "json", req, runtime), new ListRegionsResponse());
    }

    public ListRepositoriesResponse listRepositories(String Namespace) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoriesWithOptions(Namespace, headers, runtime);
    }

    public ListRepositoriesResponse listRepositoriesWithOptions(String Namespace, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        Namespace = com.aliyun.openapiutil.Client.getEncodeParam(Namespace);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListRepositories", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/imageRegistry/namespaces/" + Namespace + "/repositories", "json", req, runtime), new ListRepositoriesResponse());
    }

    public ListUserClustersResponse listUserClusters() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserClustersWithOptions(headers, runtime);
    }

    public ListUserClustersResponse listUserClustersWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListUserClusters", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/users/clusters", "json", req, runtime), new ListUserClustersResponse());
    }

    public ListUserWorkNodesResponse listUserWorkNodes(ListUserWorkNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserWorkNodesWithOptions(request, headers, runtime);
    }

    public ListUserWorkNodesResponse listUserWorkNodesWithOptions(ListUserWorkNodesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListUserWorkNodes", "2021-02-26", "HTTPS", "GET", "AK", "/api/v1/users/workerNodes", "json", req, runtime), new ListUserWorkNodesResponse());
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
        return TeaModel.toModel(this.doROARequest("StartInstance", "2021-02-26", "HTTPS", "PUT", "AK", "/api/v1/instances/" + InstanceId + "/start", "json", req, runtime), new StartInstanceResponse());
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
        return TeaModel.toModel(this.doROARequest("StopInstance", "2021-02-26", "HTTPS", "PUT", "AK", "/api/v1/instances/" + InstanceId + "/stop", "json", req, runtime), new StopInstanceResponse());
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
        return TeaModel.toModel(this.doROARequest("UpdateInstance", "2021-02-26", "HTTPS", "PUT", "AK", "/api/v1/instances/" + InstanceId + "", "json", req, runtime), new UpdateInstanceResponse());
    }

    public UpdateInstanceSnapshotResponse updateInstanceSnapshot(String InstanceId, String InstanceSnapshotId, UpdateInstanceSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceSnapshotWithOptions(InstanceId, InstanceSnapshotId, request, headers, runtime);
    }

    public UpdateInstanceSnapshotResponse updateInstanceSnapshotWithOptions(String InstanceId, String InstanceSnapshotId, UpdateInstanceSnapshotRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        InstanceSnapshotId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceSnapshotId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceSnapshotName)) {
            body.put("InstanceSnapshotName", request.instanceSnapshotName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateInstanceSnapshot", "2021-02-26", "HTTPS", "PUT", "AK", "/api/v1/instances/" + InstanceId + "/snapshots/" + InstanceSnapshotId + "", "json", req, runtime), new UpdateInstanceSnapshotResponse());
    }
}

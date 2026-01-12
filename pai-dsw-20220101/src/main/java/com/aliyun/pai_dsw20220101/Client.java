// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101;

import com.aliyun.tea.*;
import com.aliyun.pai_dsw20220101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
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

    /**
     * <b>summary</b> : 
     * <p>诊断问题</p>
     * 
     * @param request CreateDiagnosisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDiagnosisResponse
     */
    public CreateDiagnosisResponse createDiagnosisWithOptions(CreateDiagnosisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gmtFailureTime)) {
            body.put("GmtFailureTime", request.gmtFailureTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemCategory)) {
            body.put("ProblemCategory", request.problemCategory);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDiagnosis"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/diagnoses"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDiagnosisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>诊断问题</p>
     * 
     * @param request CreateDiagnosisRequest
     * @return CreateDiagnosisResponse
     */
    public CreateDiagnosisResponse createDiagnosis(CreateDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDiagnosisWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an automatic stop policy for a specific Data Science Workshop (DSW) instance. When the conditions are met, the instance is automatically stopped. You can create only one automatic stop policy for an idle DSW instance. If the specific instance has an automatic stop policy, call DeleteIdleInstanceCuller to delete it first.</p>
     * 
     * @param request CreateIdleInstanceCullerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIdleInstanceCullerResponse
     */
    public CreateIdleInstanceCullerResponse createIdleInstanceCullerWithOptions(String InstanceId, CreateIdleInstanceCullerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpuPercentThreshold)) {
            body.put("CpuPercentThreshold", request.cpuPercentThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuPercentThreshold)) {
            body.put("GpuPercentThreshold", request.gpuPercentThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxIdleTimeInMinutes)) {
            body.put("MaxIdleTimeInMinutes", request.maxIdleTimeInMinutes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIdleInstanceCuller"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/idleinstanceculler"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIdleInstanceCullerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an automatic stop policy for a specific Data Science Workshop (DSW) instance. When the conditions are met, the instance is automatically stopped. You can create only one automatic stop policy for an idle DSW instance. If the specific instance has an automatic stop policy, call DeleteIdleInstanceCuller to delete it first.</p>
     * 
     * @param request CreateIdleInstanceCullerRequest
     * @return CreateIdleInstanceCullerResponse
     */
    public CreateIdleInstanceCullerResponse createIdleInstanceCuller(String InstanceId, CreateIdleInstanceCullerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIdleInstanceCullerWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Data Science Workshop (DSW) instance.</p>
     * 
     * @param request CreateInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.affinity)) {
            body.put("Affinity", request.affinity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assignNodeSpec)) {
            body.put("AssignNodeSpec", request.assignNodeSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudDisks)) {
            body.put("CloudDisks", request.cloudDisks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfig)) {
            body.put("CredentialConfig", request.credentialConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasets)) {
            body.put("Datasets", request.datasets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driver)) {
            body.put("Driver", request.driver);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicMount)) {
            body.put("DynamicMount", request.dynamicMount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsSpec)) {
            body.put("EcsSpec", request.ecsSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentVariables)) {
            body.put("EnvironmentVariables", request.environmentVariables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageAuth)) {
            body.put("ImageAuth", request.imageAuth);
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

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationOptions)) {
            body.put("MigrationOptions", request.migrationOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldType)) {
            body.put("OversoldType", request.oversoldType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestedResource)) {
            body.put("RequestedResource", request.requestedResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotSpec)) {
            body.put("SpotSpec", request.spotSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCommand)) {
            body.put("UserCommand", request.userCommand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVpc)) {
            body.put("UserVpc", request.userVpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceSource)) {
            body.put("WorkspaceSource", request.workspaceSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Creates a Data Science Workshop (DSW) instance.</p>
     * 
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a scheduled stop task for an instance.</p>
     * 
     * @param request CreateInstanceShutdownTimerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceShutdownTimerResponse
     */
    public CreateInstanceShutdownTimerResponse createInstanceShutdownTimerWithOptions(String InstanceId, CreateInstanceShutdownTimerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dueTime)) {
            body.put("DueTime", request.dueTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remainingTimeInMs)) {
            body.put("RemainingTimeInMs", request.remainingTimeInMs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceShutdownTimer"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/shutdowntimer"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceShutdownTimerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a scheduled stop task for an instance.</p>
     * 
     * @param request CreateInstanceShutdownTimerRequest
     * @return CreateInstanceShutdownTimerResponse
     */
    public CreateInstanceShutdownTimerResponse createInstanceShutdownTimer(String InstanceId, CreateInstanceShutdownTimerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceShutdownTimerWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例快照</p>
     * 
     * @param request CreateInstanceSnapshotRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceSnapshotResponse
     */
    public CreateInstanceSnapshotResponse createInstanceSnapshotWithOptions(String InstanceId, CreateInstanceSnapshotRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludePaths)) {
            body.put("ExcludePaths", request.excludePaths);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overwrite)) {
            body.put("Overwrite", request.overwrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotDescription)) {
            body.put("SnapshotDescription", request.snapshotDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotName)) {
            body.put("SnapshotName", request.snapshotName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceSnapshot"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/snapshots"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceSnapshotResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例快照</p>
     * 
     * @param request CreateInstanceSnapshotRequest
     * @return CreateInstanceSnapshotResponse
     */
    public CreateInstanceSnapshotResponse createInstanceSnapshot(String InstanceId, CreateInstanceSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceSnapshotWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个健康检查任务</p>
     * 
     * @param request CreateSanityCheckTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSanityCheckTaskResponse
     */
    public CreateSanityCheckTaskResponse createSanityCheckTaskWithOptions(String CheckType, CreateSanityCheckTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSanityCheckTask"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/sanitychecks/" + com.aliyun.openapiutil.Client.getEncodeParam(CheckType) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSanityCheckTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个健康检查任务</p>
     * 
     * @param request CreateSanityCheckTaskRequest
     * @return CreateSanityCheckTaskResponse
     */
    public CreateSanityCheckTaskResponse createSanityCheckTask(String CheckType, CreateSanityCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSanityCheckTaskWithOptions(CheckType, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the automatic stop policy of an instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIdleInstanceCullerResponse
     */
    public DeleteIdleInstanceCullerResponse deleteIdleInstanceCullerWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIdleInstanceCuller"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/idleinstanceculler"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIdleInstanceCullerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the automatic stop policy of an instance.</p>
     * @return DeleteIdleInstanceCullerResponse
     */
    public DeleteIdleInstanceCullerResponse deleteIdleInstanceCuller(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIdleInstanceCullerWithOptions(InstanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specific instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specific instance.</p>
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceWithOptions(InstanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete tags from a Data Science Workshop (DSW) instance.</p>
     * 
     * @param request DeleteInstanceLabelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceLabelsResponse
     */
    public DeleteInstanceLabelsResponse deleteInstanceLabelsWithOptions(String InstanceId, DeleteInstanceLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelKeys)) {
            query.put("LabelKeys", request.labelKeys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstanceLabels"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/labels"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete tags from a Data Science Workshop (DSW) instance.</p>
     * 
     * @param request DeleteInstanceLabelsRequest
     * @return DeleteInstanceLabelsResponse
     */
    public DeleteInstanceLabelsResponse deleteInstanceLabels(String InstanceId, DeleteInstanceLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceLabelsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a scheduled stop task of an instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceShutdownTimerResponse
     */
    public DeleteInstanceShutdownTimerResponse deleteInstanceShutdownTimerWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstanceShutdownTimer"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/shutdowntimer"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceShutdownTimerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a scheduled stop task of an instance.</p>
     * @return DeleteInstanceShutdownTimerResponse
     */
    public DeleteInstanceShutdownTimerResponse deleteInstanceShutdownTimer(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceShutdownTimerWithOptions(InstanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例快照详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceSnapshotResponse
     */
    public DeleteInstanceSnapshotResponse deleteInstanceSnapshotWithOptions(String InstanceId, String SnapshotId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstanceSnapshot"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/snapshots/" + com.aliyun.openapiutil.Client.getEncodeParam(SnapshotId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceSnapshotResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例快照详情</p>
     * @return DeleteInstanceSnapshotResponse
     */
    public DeleteInstanceSnapshotResponse deleteInstanceSnapshot(String InstanceId, String SnapshotId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceSnapshotWithOptions(InstanceId, SnapshotId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除实例</p>
     * 
     * @param request DeleteInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstancesResponse
     */
    public DeleteInstancesResponse deleteInstancesWithOptions(DeleteInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            body.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstances"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/batch/instances/delete"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除实例</p>
     * 
     * @param request DeleteInstancesRequest
     * @return DeleteInstancesResponse
     */
    public DeleteInstancesResponse deleteInstances(DeleteInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstancesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an auto stop policy for a specific idle instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdleInstanceCullerResponse
     */
    public GetIdleInstanceCullerResponse getIdleInstanceCullerWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIdleInstanceCuller"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/idleinstanceculler"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIdleInstanceCullerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an auto stop policy for a specific idle instance.</p>
     * @return GetIdleInstanceCullerResponse
     */
    public GetIdleInstanceCullerResponse getIdleInstanceCuller(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIdleInstanceCullerWithOptions(InstanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a DSW instance.</p>
     * 
     * @param request GetInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstanceWithOptions(String InstanceId, GetInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            query.put("Fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a DSW instance.</p>
     * 
     * @param request GetInstanceRequest
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(String InstanceId, GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of system events for a Data Science Workshop (DSW) instance.</p>
     * 
     * @param request GetInstanceEventsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceEventsResponse
     */
    public GetInstanceEventsResponse getInstanceEventsWithOptions(String InstanceId, GetInstanceEventsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventLevel)) {
            query.put("EventLevel", request.eventLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxEventsNum)) {
            query.put("MaxEventsNum", request.maxEventsNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceEvents"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/events"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of system events for a Data Science Workshop (DSW) instance.</p>
     * 
     * @param request GetInstanceEventsRequest
     * @return GetInstanceEventsResponse
     */
    public GetInstanceEventsResponse getInstanceEvents(String InstanceId, GetInstanceEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceEventsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resource metrics of an instance.</p>
     * 
     * @param request GetInstanceMetricsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceMetricsResponse
     */
    public GetInstanceMetricsResponse getInstanceMetricsWithOptions(String InstanceId, GetInstanceMetricsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceMetrics"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resource metrics of an instance.</p>
     * 
     * @param request GetInstanceMetricsRequest
     * @return GetInstanceMetricsResponse
     */
    public GetInstanceMetricsResponse getInstanceMetrics(String InstanceId, GetInstanceMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceMetricsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取定时关机任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceShutdownTimerResponse
     */
    public GetInstanceShutdownTimerResponse getInstanceShutdownTimerWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceShutdownTimer"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/shutdowntimer"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceShutdownTimerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取定时关机任务</p>
     * @return GetInstanceShutdownTimerResponse
     */
    public GetInstanceShutdownTimerResponse getInstanceShutdownTimer(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceShutdownTimerWithOptions(InstanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例快照详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceSnapshotResponse
     */
    public GetInstanceSnapshotResponse getInstanceSnapshotWithOptions(String InstanceId, String SnapshotId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceSnapshot"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/snapshots/" + com.aliyun.openapiutil.Client.getEncodeParam(SnapshotId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceSnapshotResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例快照详情</p>
     * @return GetInstanceSnapshotResponse
     */
    public GetInstanceSnapshotResponse getInstanceSnapshot(String InstanceId, String SnapshotId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceSnapshotWithOptions(InstanceId, SnapshotId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Obtains the lifecycle transition information for an instance, including details on the status an instance transitions to at a specific point in time.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the lifecycle of an instance</p>
     * 
     * @param request GetLifecycleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLifecycleResponse
     */
    public GetLifecycleResponse getLifecycleWithOptions(String InstanceId, GetLifecycleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionNumber)) {
            query.put("SessionNumber", request.sessionNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLifecycle"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/lifecycle"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLifecycleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Obtains the lifecycle transition information for an instance, including details on the status an instance transitions to at a specific point in time.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the lifecycle of an instance</p>
     * 
     * @param request GetLifecycleRequest
     * @return GetLifecycleResponse
     */
    public GetLifecycleResponse getLifecycle(String InstanceId, GetLifecycleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLifecycleWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取metrics数据</p>
     * 
     * @param request GetMetricsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetricsResponse
     */
    public GetMetricsResponse getMetricsWithOptions(String InstanceId, GetMetricsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            query.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.length)) {
            query.put("Length", request.length);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetrics"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/cms/metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取metrics数据</p>
     * 
     * @param request GetMetricsRequest
     * @return GetMetricsResponse
     */
    public GetMetricsResponse getMetrics(String InstanceId, GetMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMetricsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @param request GetResourceGroupStatisticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceGroupStatisticsResponse
     */
    public GetResourceGroupStatisticsResponse getResourceGroupStatisticsWithOptions(GetResourceGroupStatisticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("WorkspaceIds", request.workspaceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroupStatistics"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resourcegroupstatistics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupStatisticsResponse());
    }

    /**
     * @param request GetResourceGroupStatisticsRequest
     * @return GetResourceGroupStatisticsResponse
     */
    public GetResourceGroupStatisticsResponse getResourceGroupStatistics(GetResourceGroupStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceGroupStatisticsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询健康检查任务结果</p>
     * 
     * @param request GetSanityCheckTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSanityCheckTaskResponse
     */
    public GetSanityCheckTaskResponse getSanityCheckTaskWithOptions(String CheckType, String TaskId, GetSanityCheckTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSanityCheckTask"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/sanitychecks/" + com.aliyun.openapiutil.Client.getEncodeParam(CheckType) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSanityCheckTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询健康检查任务结果</p>
     * 
     * @param request GetSanityCheckTaskRequest
     * @return GetSanityCheckTaskResponse
     */
    public GetSanityCheckTaskResponse getSanityCheckTask(String CheckType, String TaskId, GetSanityCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSanityCheckTaskWithOptions(CheckType, TaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the temporary authentication information of a DSW instance.</p>
     * 
     * @param request GetTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTokenResponse
     */
    public GetTokenResponse getTokenWithOptions(GetTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audience)) {
            query.put("Audience", request.audience);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetToken"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/tokens"),
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
     * <p>Obtains the temporary authentication information of a DSW instance.</p>
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
     * <p>获取自定义用户命令</p>
     * 
     * @param request GetUserCommandRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserCommandResponse
     */
    public GetUserCommandResponse getUserCommandWithOptions(String UserCommandId, GetUserCommandRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserCommand"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/usercommands/" + com.aliyun.openapiutil.Client.getEncodeParam(UserCommandId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserCommandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取自定义用户命令</p>
     * 
     * @param request GetUserCommandRequest
     * @return GetUserCommandResponse
     */
    public GetUserCommandResponse getUserCommand(String UserCommandId, GetUserCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserCommandWithOptions(UserCommandId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户配置</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserConfigResponse
     */
    public GetUserConfigResponse getUserConfigWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>获取用户配置</p>
     * @return GetUserConfigResponse
     */
    public GetUserConfigResponse getUserConfig() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserConfigWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of specifications of ECS instances.</p>
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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of specifications of ECS instances.</p>
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
     * <p>查询实例快照列表</p>
     * 
     * @param request ListInstanceSnapshotRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceSnapshotResponse
     */
    public ListInstanceSnapshotResponse listInstanceSnapshotWithOptions(String InstanceId, ListInstanceSnapshotRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceSnapshot"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/snapshots"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceSnapshotResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例快照列表</p>
     * 
     * @param request ListInstanceSnapshotRequest
     * @return ListInstanceSnapshotResponse
     */
    public ListInstanceSnapshotResponse listInstanceSnapshot(String InstanceId, ListInstanceSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceSnapshotWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例统计信息</p>
     * 
     * @param request ListInstanceStatisticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceStatisticsResponse
     */
    public ListInstanceStatisticsResponse listInstanceStatisticsWithOptions(ListInstanceStatisticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("WorkspaceIds", request.workspaceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>获取实例统计信息</p>
     * 
     * @param request ListInstanceStatisticsRequest
     * @return ListInstanceStatisticsResponse
     */
    public ListInstanceStatisticsResponse listInstanceStatistics(ListInstanceStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceStatisticsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Data Science Workshop (DSW) instances.</p>
     * 
     * @param tmpReq ListInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListInstancesShrinkRequest request = new ListInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labels)) {
            request.labelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labels, "Labels", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorType)) {
            query.put("AcceleratorType", request.acceleratorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            query.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeAfter)) {
            query.put("CreateTimeAfter", request.createTimeAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeBefore)) {
            query.put("CreateTimeBefore", request.createTimeBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createUserId)) {
            query.put("CreateUserId", request.createUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuType)) {
            query.put("GpuType", request.gpuType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelsShrink)) {
            query.put("Labels", request.labelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCpu)) {
            query.put("MaxCpu", request.maxCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxGpu)) {
            query.put("MaxGpu", request.maxGpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxGpuMemory)) {
            query.put("MaxGpuMemory", request.maxGpuMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxMemory)) {
            query.put("MaxMemory", request.maxMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minCpu)) {
            query.put("MinCpu", request.minCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minGpu)) {
            query.put("MinGpu", request.minGpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minGpuMemory)) {
            query.put("MinGpuMemory", request.minGpuMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minMemory)) {
            query.put("MinMemory", request.minMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldInfo)) {
            query.put("OversoldInfo", request.oversoldInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldType)) {
            query.put("OversoldType", request.oversoldType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Data Science Workshop (DSW) instances.</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstancesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取系统日志</p>
     * 
     * @param request ListSystemLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSystemLogsResponse
     */
    public ListSystemLogsResponse listSystemLogsWithOptions(ListSystemLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gmtEndTime)) {
            query.put("GmtEndTime", request.gmtEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtStartTime)) {
            query.put("GmtStartTime", request.gmtStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleId)) {
            query.put("LifecycleId", request.lifecycleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logLevel)) {
            query.put("LogLevel", request.logLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRepository)) {
            query.put("LogRepository", request.logRepository);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("Offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemCategory)) {
            query.put("ProblemCategory", request.problemCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRequestId)) {
            query.put("SourceRequestId", request.sourceRequestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSystemLogs"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/systemlogs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSystemLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取系统日志</p>
     * 
     * @param request ListSystemLogsRequest
     * @return ListSystemLogsResponse
     */
    public ListSystemLogsResponse listSystemLogs(ListSystemLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSystemLogsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动实例</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstanceWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartInstance"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/start"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动实例</p>
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstance(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startInstanceWithOptions(InstanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止实例</p>
     * 
     * @param request StopInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstanceWithOptions(String InstanceId, StopInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.saveImage)) {
            query.put("SaveImage", request.saveImage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInstance"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止实例</p>
     * 
     * @param request StopInstanceRequest
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstance(String InstanceId, StopInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量停止实例</p>
     * 
     * @param request StopInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopInstancesResponse
     */
    public StopInstancesResponse stopInstancesWithOptions(StopInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            body.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInstances"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/batch/instances/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量停止实例</p>
     * 
     * @param request StopInstancesRequest
     * @return StopInstancesResponse
     */
    public StopInstancesResponse stopInstances(StopInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopInstancesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the properties of a DSW instance.</p>
     * 
     * @param request UpdateInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstanceWithOptions(String InstanceId, UpdateInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.affinity)) {
            body.put("Affinity", request.affinity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assignNodeSpec)) {
            body.put("AssignNodeSpec", request.assignNodeSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudDisks)) {
            body.put("CloudDisks", request.cloudDisks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfig)) {
            body.put("CredentialConfig", request.credentialConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasets)) {
            body.put("Datasets", request.datasets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disassociateAssignNode)) {
            body.put("DisassociateAssignNode", request.disassociateAssignNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disassociateCredential)) {
            body.put("DisassociateCredential", request.disassociateCredential);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disassociateDatasets)) {
            body.put("DisassociateDatasets", request.disassociateDatasets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disassociateDriver)) {
            body.put("DisassociateDriver", request.disassociateDriver);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disassociateEnvironmentVariables)) {
            body.put("DisassociateEnvironmentVariables", request.disassociateEnvironmentVariables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disassociateForwardInfos)) {
            body.put("DisassociateForwardInfos", request.disassociateForwardInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disassociateMigrationOptions)) {
            body.put("DisassociateMigrationOptions", request.disassociateMigrationOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disassociateSpot)) {
            body.put("DisassociateSpot", request.disassociateSpot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disassociateUserCommand)) {
            body.put("DisassociateUserCommand", request.disassociateUserCommand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disassociateVpc)) {
            body.put("DisassociateVpc", request.disassociateVpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driver)) {
            body.put("Driver", request.driver);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicMount)) {
            body.put("DynamicMount", request.dynamicMount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsSpec)) {
            body.put("EcsSpec", request.ecsSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentVariables)) {
            body.put("EnvironmentVariables", request.environmentVariables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageAuth)) {
            body.put("ImageAuth", request.imageAuth);
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

        if (!com.aliyun.teautil.Common.isUnset(request.migrationOptions)) {
            body.put("MigrationOptions", request.migrationOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldType)) {
            body.put("OversoldType", request.oversoldType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestedResource)) {
            body.put("RequestedResource", request.requestedResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotSpec)) {
            body.put("SpotSpec", request.spotSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startInstance)) {
            body.put("StartInstance", request.startInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCommand)) {
            body.put("UserCommand", request.userCommand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVpc)) {
            body.put("UserVpc", request.userVpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceSource)) {
            body.put("WorkspaceSource", request.workspaceSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the properties of a DSW instance.</p>
     * 
     * @param request UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(String InstanceId, UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the tags of a Data Science Workshop (DSW) instance. If the tags do not exist, the system adds tags.</p>
     * 
     * @param request UpdateInstanceLabelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceLabelsResponse
     */
    public UpdateInstanceLabelsResponse updateInstanceLabelsWithOptions(String InstanceId, UpdateInstanceLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceLabels"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/labels"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the tags of a Data Science Workshop (DSW) instance. If the tags do not exist, the system adds tags.</p>
     * 
     * @param request UpdateInstanceLabelsRequest
     * @return UpdateInstanceLabelsResponse
     */
    public UpdateInstanceLabelsResponse updateInstanceLabels(String InstanceId, UpdateInstanceLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceLabelsWithOptions(InstanceId, request, headers, runtime);
    }
}

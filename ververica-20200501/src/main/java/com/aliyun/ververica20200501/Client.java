// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501;

import com.aliyun.tea.*;
import com.aliyun.ververica20200501.models.*;

public class Client extends com.aliyun.tearoa.Client {

    public Client(com.aliyun.tearoa.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpointHost = this.getEndpoint("ververica", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpointHost);
    }


    public ListNamespacesResponse listNamespacesWithOptions(ListNamespacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ListNamespaces", "2020-05-01", "HTTPS", "GET", "AK", "/pop/namespaces/v1/namespaces", null, request.headers, null, runtime), new ListNamespacesResponse());
    }

    public ListNamespacesResponse listNamespaces(ListNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNamespacesWithOptions(request, runtime);
    }

    public ListJobsResponse listJobsWithOptions(String namespace, String workspace, ListJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ListJobs", "2020-05-01", "HTTPS", "GET", "AK", "/pop/workspaces/" + workspace + "/api/v1/namespaces/" + namespace + "/jobs", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new ListJobsResponse());
    }

    public ListJobsResponse listJobs(String namespace, String workspace, ListJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobsWithOptions(namespace, workspace, request, runtime);
    }

    public DeleteArtifactResponse deleteArtifactWithOptions(String namespace, String workspace, DeleteArtifactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DeleteArtifact", "2020-05-01", "HTTPS", "DELETE", "AK", "/pop/workspaces/" + workspace + "/artifacts/v1/namespaces/" + namespace + "/artifacts:delete", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DeleteArtifactResponse());
    }

    public DeleteArtifactResponse deleteArtifact(String namespace, String workspace, DeleteArtifactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteArtifactWithOptions(namespace, workspace, request, runtime);
    }

    public GetArtifactMetadataResponse getArtifactMetadataWithOptions(String namespace, String workspace, GetArtifactMetadataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("GetArtifactMetadata", "2020-05-01", "HTTPS", "GET", "AK", "/pop/workspaces/" + workspace + "/artifacts/v1/namespaces/" + namespace + "/artifacts:getMetadata", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new GetArtifactMetadataResponse());
    }

    public GetArtifactMetadataResponse getArtifactMetadata(String namespace, String workspace, GetArtifactMetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getArtifactMetadataWithOptions(namespace, workspace, request, runtime);
    }

    public ListDeploymentsResponse listDeploymentsWithOptions(String namespace, String workspace, ListDeploymentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ListDeployments", "2020-05-01", "HTTPS", "GET", "AK", "/pop/workspaces/" + workspace + "/api/v1/namespaces/" + namespace + "/deployments", null, request.headers, null, runtime), new ListDeploymentsResponse());
    }

    public ListDeploymentsResponse listDeployments(String namespace, String workspace, ListDeploymentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeploymentsWithOptions(namespace, workspace, request, runtime);
    }

    public GetDeploymentResponse getDeploymentWithOptions(String namespace, String deploymentId, String workspace, GetDeploymentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("GetDeployment", "2020-05-01", "HTTPS", "GET", "AK", "/pop/workspaces/" + workspace + "/api/v1/namespaces/" + namespace + "/deployments/" + deploymentId + "", null, request.headers, null, runtime), new GetDeploymentResponse());
    }

    public GetDeploymentResponse getDeployment(String namespace, String deploymentId, String workspace, GetDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeploymentWithOptions(namespace, deploymentId, workspace, request, runtime);
    }

    public DeleteDeploymentResponse deleteDeploymentWithOptions(String namespace, String deploymentId, String workspace, DeleteDeploymentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DeleteDeployment", "2020-05-01", "HTTPS", "DELETE", "AK", "/pop/workspaces/" + workspace + "/api/v1/namespaces/" + namespace + "/deployments/" + deploymentId + "", null, request.headers, null, runtime), new DeleteDeploymentResponse());
    }

    public DeleteDeploymentResponse deleteDeployment(String namespace, String deploymentId, String workspace, DeleteDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeploymentWithOptions(namespace, deploymentId, workspace, request, runtime);
    }

    public GetGlobalDeploymentDefaultsResponse getGlobalDeploymentDefaultsWithOptions(String workspace, GetGlobalDeploymentDefaultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("GetGlobalDeploymentDefaults", "2020-05-01", "HTTPS", "GET", "AK", "/pop/workspaces/" + workspace + "/api/v1/global-deployment-defaults", null, request.headers, null, runtime), new GetGlobalDeploymentDefaultsResponse());
    }

    public GetGlobalDeploymentDefaultsResponse getGlobalDeploymentDefaults(String workspace, GetGlobalDeploymentDefaultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGlobalDeploymentDefaultsWithOptions(workspace, request, runtime);
    }

    public ListDeploymentTargetsResponse listDeploymentTargetsWithOptions(String namespace, String workspace, ListDeploymentTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ListDeploymentTargets", "2020-05-01", "HTTPS", "GET", "AK", "/pop/workspaces/" + workspace + "/api/v1/namespaces/" + namespace + "/deployment-targets", null, request.headers, null, runtime), new ListDeploymentTargetsResponse());
    }

    public ListDeploymentTargetsResponse listDeploymentTargets(String namespace, String workspace, ListDeploymentTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeploymentTargetsWithOptions(namespace, workspace, request, runtime);
    }

    public ListArtifactsResponse listArtifactsWithOptions(String namespace, String workspace, ListArtifactsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ListArtifacts", "2020-05-01", "HTTPS", "GET", "AK", "/pop/workspaces/" + workspace + "/artifacts/v1/namespaces/" + namespace + "/artifacts:list", null, request.headers, null, runtime), new ListArtifactsResponse());
    }

    public ListArtifactsResponse listArtifacts(String namespace, String workspace, ListArtifactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listArtifactsWithOptions(namespace, workspace, request, runtime);
    }

    public UpdateDeploymentResponse updateDeploymentWithOptions(String namespace, String deploymentId, String workspace, UpdateDeploymentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("UpdateDeployment", "2020-05-01", "HTTPS", "PUT", "AK", "/pop/workspaces/" + workspace + "/api/v1/namespaces/" + namespace + "/deployments/" + deploymentId + "/patch", null, request.headers, TeaModel.buildMap(request.body), runtime), new UpdateDeploymentResponse());
    }

    public UpdateDeploymentResponse updateDeployment(String namespace, String deploymentId, String workspace, UpdateDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDeploymentWithOptions(namespace, deploymentId, workspace, request, runtime);
    }

    public ValidateSqlScriptResponse validateSqlScriptWithOptions(String namespace, String workspace, ValidateSqlScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ValidateSqlScript", "2020-05-01", "HTTPS", "POST", "AK", "/pop/workspaces/" + workspace + "/sql/v1beta1/namespaces/" + namespace + "/sqlscripts:validate", null, request.headers, TeaModel.buildMap(request.body), runtime), new ValidateSqlScriptResponse());
    }

    public ValidateSqlScriptResponse validateSqlScript(String namespace, String workspace, ValidateSqlScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateSqlScriptWithOptions(namespace, workspace, request, runtime);
    }

    public UpdateDeploymentDesiredStateResponse updateDeploymentDesiredStateWithOptions(String namespace, String deploymentId, String workspace, UpdateDeploymentDesiredStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("UpdateDeploymentDesiredState", "2020-05-01", "HTTPS", "PUT", "AK", "/pop/workspaces/" + workspace + "/api/v1/namespaces/" + namespace + "/deployments/" + deploymentId + "/state", null, request.headers, TeaModel.buildMap(request.body), runtime), new UpdateDeploymentDesiredStateResponse());
    }

    public UpdateDeploymentDesiredStateResponse updateDeploymentDesiredState(String namespace, String deploymentId, String workspace, UpdateDeploymentDesiredStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDeploymentDesiredStateWithOptions(namespace, deploymentId, workspace, request, runtime);
    }

    public CreateDeploymentResponse createDeploymentWithOptions(String namespace, String workspace, CreateDeploymentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("CreateDeployment", "2020-05-01", "HTTPS", "POST", "AK", "/pop/workspaces/" + workspace + "/api/v1/namespaces/" + namespace + "/deployments", null, request.headers, TeaModel.buildMap(request.body), runtime), new CreateDeploymentResponse());
    }

    public CreateDeploymentResponse createDeployment(String namespace, String workspace, CreateDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDeploymentWithOptions(namespace, workspace, request, runtime);
    }

    public ExecuteSqlScriptResponse executeSqlScriptWithOptions(String namespace, String workspace, ExecuteSqlScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ExecuteSqlScript", "2020-05-01", "HTTPS", "POST", "AK", "/pop/workspaces/" + workspace + "/sql/v1beta1/namespaces/" + namespace + "/sqlscripts:execute", null, request.headers, TeaModel.buildMap(request.body), runtime), new ExecuteSqlScriptResponse());
    }

    public ExecuteSqlScriptResponse executeSqlScript(String namespace, String workspace, ExecuteSqlScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeSqlScriptWithOptions(namespace, workspace, request, runtime);
    }

    public GetDeploymentDefaultsResponse getDeploymentDefaultsWithOptions(String namespace, String workspace, GetDeploymentDefaultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("GetDeploymentDefaults", "2020-05-01", "HTTPS", "GET", "AK", "/pop/workspaces/" + workspace + "/api/v1/namespaces/" + namespace + "/deployment-defaults", null, request.headers, null, runtime), new GetDeploymentDefaultsResponse());
    }

    public GetDeploymentDefaultsResponse getDeploymentDefaults(String namespace, String workspace, GetDeploymentDefaultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeploymentDefaultsWithOptions(namespace, workspace, request, runtime);
    }

    public ListSavepointsResponse listSavepointsWithOptions(String namespace, String workspace, ListSavepointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("ListSavepoints", "2020-05-01", "HTTPS", "GET", "AK", "/pop/workspaces/" + workspace + "/api/v1/namespaces/" + namespace + "/savepoints", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new ListSavepointsResponse());
    }

    public ListSavepointsResponse listSavepoints(String namespace, String workspace, ListSavepointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSavepointsWithOptions(namespace, workspace, request, runtime);
    }

    public CreateSavepointResponse createSavepointWithOptions(String namespace, String workspace, CreateSavepointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("CreateSavepoint", "2020-05-01", "HTTPS", "POST", "AK", "/pop/workspaces/" + workspace + "/api/v1/namespaces/" + namespace + "/savepoints", null, request.headers, TeaModel.buildMap(request.body), runtime), new CreateSavepointResponse());
    }

    public CreateSavepointResponse createSavepoint(String namespace, String workspace, CreateSavepointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSavepointWithOptions(namespace, workspace, request, runtime);
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
}

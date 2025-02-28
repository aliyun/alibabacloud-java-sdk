// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718;

import com.aliyun.tea.*;
import com.aliyun.ververica20220718.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ververica", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>执行定时计划</p>
     * 
     * @param headers ApplyScheduledPlanHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyScheduledPlanResponse
     */
    public ApplyScheduledPlanResponse applyScheduledPlanWithOptions(String namespace, String scheduledPlanId, ApplyScheduledPlanHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyScheduledPlan"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/scheduled-plans/" + com.aliyun.openapiutil.Client.getEncodeParam(scheduledPlanId) + "%3Aapply"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyScheduledPlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ApplyScheduledPlanResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>执行定时计划</p>
     * @return ApplyScheduledPlanResponse
     */
    public ApplyScheduledPlanResponse applyScheduledPlan(String namespace, String scheduledPlanId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyScheduledPlanHeaders headers = new ApplyScheduledPlanHeaders();
        return this.applyScheduledPlanWithOptions(namespace, scheduledPlanId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a deployment.</p>
     * 
     * @param request CreateDeploymentRequest
     * @param headers CreateDeploymentHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDeploymentResponse
     */
    public CreateDeploymentResponse createDeploymentWithOptions(String namespace, CreateDeploymentRequest request, CreateDeploymentHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeployment"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployments"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeploymentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateDeploymentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates a deployment.</p>
     * 
     * @param request CreateDeploymentRequest
     * @return CreateDeploymentResponse
     */
    public CreateDeploymentResponse createDeployment(String namespace, CreateDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateDeploymentHeaders headers = new CreateDeploymentHeaders();
        return this.createDeploymentWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>create a deploymentDraft</p>
     * 
     * @param request CreateDeploymentDraftRequest
     * @param headers CreateDeploymentDraftHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDeploymentDraftResponse
     */
    public CreateDeploymentDraftResponse createDeploymentDraftWithOptions(String namespace, CreateDeploymentDraftRequest request, CreateDeploymentDraftHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeploymentDraft"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployment-drafts"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeploymentDraftResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateDeploymentDraftResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>create a deploymentDraft</p>
     * 
     * @param request CreateDeploymentDraftRequest
     * @return CreateDeploymentDraftResponse
     */
    public CreateDeploymentDraftResponse createDeploymentDraft(String namespace, CreateDeploymentDraftRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateDeploymentDraftHeaders headers = new CreateDeploymentDraftHeaders();
        return this.createDeploymentDraftWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建deploymentTarget</p>
     * 
     * @param request CreateDeploymentTargetRequest
     * @param headers CreateDeploymentTargetHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDeploymentTargetResponse
     */
    public CreateDeploymentTargetResponse createDeploymentTargetWithOptions(String namespace, CreateDeploymentTargetRequest request, CreateDeploymentTargetHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deploymentTargetName)) {
            query.put("deploymentTargetName", request.deploymentTargetName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeploymentTarget"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployment-targets"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeploymentTargetResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateDeploymentTargetResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建deploymentTarget</p>
     * 
     * @param request CreateDeploymentTargetRequest
     * @return CreateDeploymentTargetResponse
     */
    public CreateDeploymentTargetResponse createDeploymentTarget(String namespace, CreateDeploymentTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateDeploymentTargetHeaders headers = new CreateDeploymentTargetHeaders();
        return this.createDeploymentTargetWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>create a folder</p>
     * 
     * @param request CreateFolderRequest
     * @param headers CreateFolderHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFolderResponse
     */
    public CreateFolderResponse createFolderWithOptions(String namespace, CreateFolderRequest request, CreateFolderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFolder"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/folder"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFolderResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateFolderResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>create a folder</p>
     * 
     * @param request CreateFolderRequest
     * @return CreateFolderResponse
     */
    public CreateFolderResponse createFolder(String namespace, CreateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateFolderHeaders headers = new CreateFolderHeaders();
        return this.createFolderWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a user to a namespace as a member and grants permissions to the user.</p>
     * 
     * @param request CreateMemberRequest
     * @param headers CreateMemberHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMemberResponse
     */
    public CreateMemberResponse createMemberWithOptions(String namespace, CreateMemberRequest request, CreateMemberHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMember"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gateway/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/members"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Adds a user to a namespace as a member and grants permissions to the user.</p>
     * 
     * @param request CreateMemberRequest
     * @return CreateMemberResponse
     */
    public CreateMemberResponse createMember(String namespace, CreateMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateMemberHeaders headers = new CreateMemberHeaders();
        return this.createMemberWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a savepoint.</p>
     * 
     * @param request CreateSavepointRequest
     * @param headers CreateSavepointHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSavepointResponse
     */
    public CreateSavepointResponse createSavepointWithOptions(String namespace, CreateSavepointRequest request, CreateSavepointHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deploymentId)) {
            body.put("deploymentId", request.deploymentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nativeFormat)) {
            body.put("nativeFormat", request.nativeFormat);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSavepoint"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/savepoints"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSavepointResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateSavepointResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates a savepoint.</p>
     * 
     * @param request CreateSavepointRequest
     * @return CreateSavepointResponse
     */
    public CreateSavepointResponse createSavepoint(String namespace, CreateSavepointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateSavepointHeaders headers = new CreateSavepointHeaders();
        return this.createSavepointWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建定时执行计划</p>
     * 
     * @param request CreateScheduledPlanRequest
     * @param headers CreateScheduledPlanHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScheduledPlanResponse
     */
    public CreateScheduledPlanResponse createScheduledPlanWithOptions(String namespace, CreateScheduledPlanRequest request, CreateScheduledPlanHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScheduledPlan"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/scheduled-plans"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScheduledPlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateScheduledPlanResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建定时执行计划</p>
     * 
     * @param request CreateScheduledPlanRequest
     * @return CreateScheduledPlanResponse
     */
    public CreateScheduledPlanResponse createScheduledPlan(String namespace, CreateScheduledPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateScheduledPlanHeaders headers = new CreateScheduledPlanHeaders();
        return this.createScheduledPlanWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建session集群</p>
     * 
     * @param request CreateSessionClusterRequest
     * @param headers CreateSessionClusterHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSessionClusterResponse
     */
    public CreateSessionClusterResponse createSessionClusterWithOptions(String namespace, CreateSessionClusterRequest request, CreateSessionClusterHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSessionCluster"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/sessionclusters"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSessionClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateSessionClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建session集群</p>
     * 
     * @param request CreateSessionClusterRequest
     * @return CreateSessionClusterResponse
     */
    public CreateSessionClusterResponse createSessionCluster(String namespace, CreateSessionClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateSessionClusterHeaders headers = new CreateSessionClusterHeaders();
        return this.createSessionClusterWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Parses all user-defined function (UDF) methods in your JAR or Python file and creates an artifact configuration for a UDF.</p>
     * 
     * @param request CreateUdfArtifactRequest
     * @param headers CreateUdfArtifactHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUdfArtifactResponse
     */
    public CreateUdfArtifactResponse createUdfArtifactWithOptions(String namespace, CreateUdfArtifactRequest request, CreateUdfArtifactHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUdfArtifact"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/udfartifacts"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUdfArtifactResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateUdfArtifactResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Parses all user-defined function (UDF) methods in your JAR or Python file and creates an artifact configuration for a UDF.</p>
     * 
     * @param request CreateUdfArtifactRequest
     * @return CreateUdfArtifactResponse
     */
    public CreateUdfArtifactResponse createUdfArtifact(String namespace, CreateUdfArtifactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateUdfArtifactHeaders headers = new CreateUdfArtifactHeaders();
        return this.createUdfArtifactWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a variable.</p>
     * 
     * @param request CreateVariableRequest
     * @param headers CreateVariableHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVariableResponse
     */
    public CreateVariableResponse createVariableWithOptions(String namespace, CreateVariableRequest request, CreateVariableHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVariable"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/variables"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVariableResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateVariableResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates a variable.</p>
     * 
     * @param request CreateVariableRequest
     * @return CreateVariableResponse
     */
    public CreateVariableResponse createVariable(String namespace, CreateVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateVariableHeaders headers = new CreateVariableHeaders();
        return this.createVariableWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a registered custom connector from a workspace.</p>
     * 
     * @param headers DeleteCustomConnectorHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomConnectorResponse
     */
    public DeleteCustomConnectorResponse deleteCustomConnectorWithOptions(String namespace, String connectorName, DeleteCustomConnectorHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomConnector"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/connectors/" + com.aliyun.openapiutil.Client.getEncodeParam(connectorName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomConnectorResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteCustomConnectorResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a registered custom connector from a workspace.</p>
     * @return DeleteCustomConnectorResponse
     */
    public DeleteCustomConnectorResponse deleteCustomConnector(String namespace, String connectorName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteCustomConnectorHeaders headers = new DeleteCustomConnectorHeaders();
        return this.deleteCustomConnectorWithOptions(namespace, connectorName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a deployment based on the deployment ID.</p>
     * 
     * @param headers DeleteDeploymentHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDeploymentResponse
     */
    public DeleteDeploymentResponse deleteDeploymentWithOptions(String namespace, String deploymentId, DeleteDeploymentHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeployment"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployments/" + com.aliyun.openapiutil.Client.getEncodeParam(deploymentId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeploymentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteDeploymentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a deployment based on the deployment ID.</p>
     * @return DeleteDeploymentResponse
     */
    public DeleteDeploymentResponse deleteDeployment(String namespace, String deploymentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteDeploymentHeaders headers = new DeleteDeploymentHeaders();
        return this.deleteDeploymentWithOptions(namespace, deploymentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>delete a deploymentDraft</p>
     * 
     * @param headers DeleteDeploymentDraftHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDeploymentDraftResponse
     */
    public DeleteDeploymentDraftResponse deleteDeploymentDraftWithOptions(String namespace, String deploymentDraftId, DeleteDeploymentDraftHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeploymentDraft"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployment-drafts/" + com.aliyun.openapiutil.Client.getEncodeParam(deploymentDraftId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeploymentDraftResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteDeploymentDraftResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>delete a deploymentDraft</p>
     * @return DeleteDeploymentDraftResponse
     */
    public DeleteDeploymentDraftResponse deleteDeploymentDraft(String namespace, String deploymentDraftId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteDeploymentDraftHeaders headers = new DeleteDeploymentDraftHeaders();
        return this.deleteDeploymentDraftWithOptions(namespace, deploymentDraftId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除deploymentTarget</p>
     * 
     * @param headers DeleteDeploymentTargetHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDeploymentTargetResponse
     */
    public DeleteDeploymentTargetResponse deleteDeploymentTargetWithOptions(String namespace, String deploymentTargetName, DeleteDeploymentTargetHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeploymentTarget"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployment-targets/" + com.aliyun.openapiutil.Client.getEncodeParam(deploymentTargetName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeploymentTargetResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteDeploymentTargetResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除deploymentTarget</p>
     * @return DeleteDeploymentTargetResponse
     */
    public DeleteDeploymentTargetResponse deleteDeploymentTarget(String namespace, String deploymentTargetName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteDeploymentTargetHeaders headers = new DeleteDeploymentTargetHeaders();
        return this.deleteDeploymentTargetWithOptions(namespace, deploymentTargetName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>delete a folder</p>
     * 
     * @param headers DeleteFolderHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFolderResponse
     */
    public DeleteFolderResponse deleteFolderWithOptions(String namespace, String folderId, DeleteFolderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFolder"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/folder/" + com.aliyun.openapiutil.Client.getEncodeParam(folderId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFolderResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteFolderResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>delete a folder</p>
     * @return DeleteFolderResponse
     */
    public DeleteFolderResponse deleteFolder(String namespace, String folderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteFolderHeaders headers = new DeleteFolderHeaders();
        return this.deleteFolderWithOptions(namespace, folderId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the information about a job that is not in the running state in a deployment.</p>
     * 
     * @param headers DeleteJobHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJobWithOptions(String namespace, String jobId, DeleteJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteJob"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteJobResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteJobResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the information about a job that is not in the running state in a deployment.</p>
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJob(String namespace, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteJobHeaders headers = new DeleteJobHeaders();
        return this.deleteJobWithOptions(namespace, jobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the permissions from a member.</p>
     * 
     * @param headers DeleteMemberHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMemberResponse
     */
    public DeleteMemberResponse deleteMemberWithOptions(String namespace, String member, DeleteMemberHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMember"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gateway/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(member) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the permissions from a member.</p>
     * @return DeleteMemberResponse
     */
    public DeleteMemberResponse deleteMember(String namespace, String member) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteMemberHeaders headers = new DeleteMemberHeaders();
        return this.deleteMemberWithOptions(namespace, member, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a savepoint.</p>
     * 
     * @param headers DeleteSavepointHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSavepointResponse
     */
    public DeleteSavepointResponse deleteSavepointWithOptions(String namespace, String savepointId, DeleteSavepointHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSavepoint"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/savepoints/" + com.aliyun.openapiutil.Client.getEncodeParam(savepointId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSavepointResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteSavepointResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a savepoint.</p>
     * @return DeleteSavepointResponse
     */
    public DeleteSavepointResponse deleteSavepoint(String namespace, String savepointId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteSavepointHeaders headers = new DeleteSavepointHeaders();
        return this.deleteSavepointWithOptions(namespace, savepointId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除定时执行计划</p>
     * 
     * @param headers DeleteScheduledPlanHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScheduledPlanResponse
     */
    public DeleteScheduledPlanResponse deleteScheduledPlanWithOptions(String namespace, String scheduledPlanId, DeleteScheduledPlanHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScheduledPlan"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/scheduled-plans/" + com.aliyun.openapiutil.Client.getEncodeParam(scheduledPlanId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScheduledPlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteScheduledPlanResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除定时执行计划</p>
     * @return DeleteScheduledPlanResponse
     */
    public DeleteScheduledPlanResponse deleteScheduledPlan(String namespace, String scheduledPlanId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteScheduledPlanHeaders headers = new DeleteScheduledPlanHeaders();
        return this.deleteScheduledPlanWithOptions(namespace, scheduledPlanId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除session集群</p>
     * 
     * @param headers DeleteSessionClusterHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSessionClusterResponse
     */
    public DeleteSessionClusterResponse deleteSessionClusterWithOptions(String namespace, String sessionClusterName, DeleteSessionClusterHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSessionCluster"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/sessionclusters/" + com.aliyun.openapiutil.Client.getEncodeParam(sessionClusterName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSessionClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteSessionClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除session集群</p>
     * @return DeleteSessionClusterResponse
     */
    public DeleteSessionClusterResponse deleteSessionCluster(String namespace, String sessionClusterName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteSessionClusterHeaders headers = new DeleteSessionClusterHeaders();
        return this.deleteSessionClusterWithOptions(namespace, sessionClusterName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除UdfArtifact</p>
     * 
     * @param headers DeleteUdfArtifactHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUdfArtifactResponse
     */
    public DeleteUdfArtifactResponse deleteUdfArtifactWithOptions(String namespace, String udfArtifactName, DeleteUdfArtifactHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUdfArtifact"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/udfartifacts/" + com.aliyun.openapiutil.Client.getEncodeParam(udfArtifactName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUdfArtifactResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteUdfArtifactResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除UdfArtifact</p>
     * @return DeleteUdfArtifactResponse
     */
    public DeleteUdfArtifactResponse deleteUdfArtifact(String namespace, String udfArtifactName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteUdfArtifactHeaders headers = new DeleteUdfArtifactHeaders();
        return this.deleteUdfArtifactWithOptions(namespace, udfArtifactName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an existing user-defined function (UDF) from a Realtime Compute for Apache Flink workspace.</p>
     * 
     * @param request DeleteUdfFunctionRequest
     * @param headers DeleteUdfFunctionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUdfFunctionResponse
     */
    public DeleteUdfFunctionResponse deleteUdfFunctionWithOptions(String namespace, String functionName, DeleteUdfFunctionRequest request, DeleteUdfFunctionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.className)) {
            query.put("className", request.className);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udfArtifactName)) {
            query.put("udfArtifactName", request.udfArtifactName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUdfFunction"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/udfartifacts/function/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUdfFunctionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteUdfFunctionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an existing user-defined function (UDF) from a Realtime Compute for Apache Flink workspace.</p>
     * 
     * @param request DeleteUdfFunctionRequest
     * @return DeleteUdfFunctionResponse
     */
    public DeleteUdfFunctionResponse deleteUdfFunction(String namespace, String functionName, DeleteUdfFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteUdfFunctionHeaders headers = new DeleteUdfFunctionHeaders();
        return this.deleteUdfFunctionWithOptions(namespace, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a variable.</p>
     * 
     * @param headers DeleteVariableHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVariableResponse
     */
    public DeleteVariableResponse deleteVariableWithOptions(String namespace, String name, DeleteVariableHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVariable"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/variables/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVariableResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteVariableResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a variable.</p>
     * @return DeleteVariableResponse
     */
    public DeleteVariableResponse deleteVariable(String namespace, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteVariableHeaders headers = new DeleteVariableHeaders();
        return this.deleteVariableWithOptions(namespace, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>deploy deploymentDraft async</p>
     * 
     * @param request DeployDeploymentDraftAsyncRequest
     * @param headers DeployDeploymentDraftAsyncHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployDeploymentDraftAsyncResponse
     */
    public DeployDeploymentDraftAsyncResponse deployDeploymentDraftAsyncWithOptions(String namespace, DeployDeploymentDraftAsyncRequest request, DeployDeploymentDraftAsyncHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployDeploymentDraftAsync"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployment-drafts/async-deploy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeployDeploymentDraftAsyncResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeployDeploymentDraftAsyncResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>deploy deploymentDraft async</p>
     * 
     * @param request DeployDeploymentDraftAsyncRequest
     * @return DeployDeploymentDraftAsyncResponse
     */
    public DeployDeploymentDraftAsyncResponse deployDeploymentDraftAsync(String namespace, DeployDeploymentDraftAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeployDeploymentDraftAsyncHeaders headers = new DeployDeploymentDraftAsyncHeaders();
        return this.deployDeploymentDraftAsyncWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>执行sql语句</p>
     * 
     * @param request ExecuteSqlStatementRequest
     * @param headers ExecuteSqlStatementHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteSqlStatementResponse
     */
    public ExecuteSqlStatementResponse executeSqlStatementWithOptions(String namespace, ExecuteSqlStatementRequest request, ExecuteSqlStatementHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteSqlStatement"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/sql-statement/execute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteSqlStatementResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ExecuteSqlStatementResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>执行sql语句</p>
     * 
     * @param request ExecuteSqlStatementRequest
     * @return ExecuteSqlStatementResponse
     */
    public ExecuteSqlStatementResponse executeSqlStatement(String namespace, ExecuteSqlStatementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ExecuteSqlStatementHeaders headers = new ExecuteSqlStatementHeaders();
        return this.executeSqlStatementWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Provides a Flink request proxy.</p>
     * 
     * @param request FlinkApiProxyRequest
     * @param headers FlinkApiProxyHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlinkApiProxyResponse
     */
    public FlinkApiProxyResponse flinkApiProxyWithOptions(FlinkApiProxyRequest request, FlinkApiProxyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flinkApiPath)) {
            query.put("flinkApiPath", request.flinkApiPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlinkApiProxy"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/flink-ui/v2/proxy"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new FlinkApiProxyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new FlinkApiProxyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Provides a Flink request proxy.</p>
     * 
     * @param request FlinkApiProxyRequest
     * @return FlinkApiProxyResponse
     */
    public FlinkApiProxyResponse flinkApiProxy(FlinkApiProxyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlinkApiProxyHeaders headers = new FlinkApiProxyHeaders();
        return this.flinkApiProxyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a ticket that applies for asynchronous generation of the fine-grained resources. This operation returns the ID of the ticket for you to query the asynchronous generation result.</p>
     * 
     * @param request GenerateResourcePlanWithFlinkConfAsyncRequest
     * @param headers GenerateResourcePlanWithFlinkConfAsyncHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateResourcePlanWithFlinkConfAsyncResponse
     */
    public GenerateResourcePlanWithFlinkConfAsyncResponse generateResourcePlanWithFlinkConfAsyncWithOptions(String namespace, String deploymentId, GenerateResourcePlanWithFlinkConfAsyncRequest request, GenerateResourcePlanWithFlinkConfAsyncHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateResourcePlanWithFlinkConfAsync"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployments/" + com.aliyun.openapiutil.Client.getEncodeParam(deploymentId) + "/resource-plan%3AasyncGenerate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateResourcePlanWithFlinkConfAsyncResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GenerateResourcePlanWithFlinkConfAsyncResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Submits a ticket that applies for asynchronous generation of the fine-grained resources. This operation returns the ID of the ticket for you to query the asynchronous generation result.</p>
     * 
     * @param request GenerateResourcePlanWithFlinkConfAsyncRequest
     * @return GenerateResourcePlanWithFlinkConfAsyncResponse
     */
    public GenerateResourcePlanWithFlinkConfAsyncResponse generateResourcePlanWithFlinkConfAsync(String namespace, String deploymentId, GenerateResourcePlanWithFlinkConfAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GenerateResourcePlanWithFlinkConfAsyncHeaders headers = new GenerateResourcePlanWithFlinkConfAsyncHeaders();
        return this.generateResourcePlanWithFlinkConfAsyncWithOptions(namespace, deploymentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用中的执行定时计划</p>
     * 
     * @param request GetAppliedScheduledPlanRequest
     * @param headers GetAppliedScheduledPlanHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppliedScheduledPlanResponse
     */
    public GetAppliedScheduledPlanResponse getAppliedScheduledPlanWithOptions(String namespace, GetAppliedScheduledPlanRequest request, GetAppliedScheduledPlanHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deploymentId)) {
            query.put("deploymentId", request.deploymentId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppliedScheduledPlan"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/scheduled-plans%3AgetExecutedScheduledPlan"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppliedScheduledPlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetAppliedScheduledPlanResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取应用中的执行定时计划</p>
     * 
     * @param request GetAppliedScheduledPlanRequest
     * @return GetAppliedScheduledPlanResponse
     */
    public GetAppliedScheduledPlanResponse getAppliedScheduledPlan(String namespace, GetAppliedScheduledPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetAppliedScheduledPlanHeaders headers = new GetAppliedScheduledPlanHeaders();
        return this.getAppliedScheduledPlanWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取catalog</p>
     * 
     * @param request GetCatalogsRequest
     * @param headers GetCatalogsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCatalogsResponse
     */
    public GetCatalogsResponse getCatalogsWithOptions(String namespace, GetCatalogsRequest request, GetCatalogsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("catalogName", request.catalogName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCatalogs"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/catalogs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetCatalogsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetCatalogsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取catalog</p>
     * 
     * @param request GetCatalogsRequest
     * @return GetCatalogsResponse
     */
    public GetCatalogsResponse getCatalogs(String namespace, GetCatalogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetCatalogsHeaders headers = new GetCatalogsHeaders();
        return this.getCatalogsWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取database</p>
     * 
     * @param request GetDatabasesRequest
     * @param headers GetDatabasesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatabasesResponse
     */
    public GetDatabasesResponse getDatabasesWithOptions(String namespace, String catalogName, GetDatabasesRequest request, GetDatabasesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("databaseName", request.databaseName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatabases"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/catalogs/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogName) + "/databases"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatabasesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetDatabasesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取database</p>
     * 
     * @param request GetDatabasesRequest
     * @return GetDatabasesResponse
     */
    public GetDatabasesResponse getDatabases(String namespace, String catalogName, GetDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetDatabasesHeaders headers = new GetDatabasesHeaders();
        return this.getDatabasesWithOptions(namespace, catalogName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>get deploy deploymentDraft result</p>
     * 
     * @param headers GetDeployDeploymentDraftResultHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeployDeploymentDraftResultResponse
     */
    public GetDeployDeploymentDraftResultResponse getDeployDeploymentDraftResultWithOptions(String namespace, String ticketId, GetDeployDeploymentDraftResultHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeployDeploymentDraftResult"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployment-drafts/tickets/" + com.aliyun.openapiutil.Client.getEncodeParam(ticketId) + "/async-deploy"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeployDeploymentDraftResultResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetDeployDeploymentDraftResultResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>get deploy deploymentDraft result</p>
     * @return GetDeployDeploymentDraftResultResponse
     */
    public GetDeployDeploymentDraftResultResponse getDeployDeploymentDraftResult(String namespace, String ticketId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetDeployDeploymentDraftResultHeaders headers = new GetDeployDeploymentDraftResultHeaders();
        return this.getDeployDeploymentDraftResultWithOptions(namespace, ticketId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a deployment.</p>
     * 
     * @param headers GetDeploymentHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeploymentResponse
     */
    public GetDeploymentResponse getDeploymentWithOptions(String namespace, String deploymentId, GetDeploymentHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeployment"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployments/" + com.aliyun.openapiutil.Client.getEncodeParam(deploymentId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeploymentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetDeploymentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a deployment.</p>
     * @return GetDeploymentResponse
     */
    public GetDeploymentResponse getDeployment(String namespace, String deploymentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetDeploymentHeaders headers = new GetDeploymentHeaders();
        return this.getDeploymentWithOptions(namespace, deploymentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>get a deploymentDraft</p>
     * 
     * @param headers GetDeploymentDraftHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeploymentDraftResponse
     */
    public GetDeploymentDraftResponse getDeploymentDraftWithOptions(String namespace, String deploymentDraftId, GetDeploymentDraftHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeploymentDraft"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployment-drafts/" + com.aliyun.openapiutil.Client.getEncodeParam(deploymentDraftId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeploymentDraftResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetDeploymentDraftResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>get a deploymentDraft</p>
     * @return GetDeploymentDraftResponse
     */
    public GetDeploymentDraftResponse getDeploymentDraft(String namespace, String deploymentDraftId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetDeploymentDraftHeaders headers = new GetDeploymentDraftHeaders();
        return this.getDeploymentDraftWithOptions(namespace, deploymentDraftId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>get deploymentDraft lock</p>
     * 
     * @param request GetDeploymentDraftLockRequest
     * @param headers GetDeploymentDraftLockHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeploymentDraftLockResponse
     */
    public GetDeploymentDraftLockResponse getDeploymentDraftLockWithOptions(String namespace, GetDeploymentDraftLockRequest request, GetDeploymentDraftLockHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deploymentDraftId)) {
            query.put("deploymentDraftId", request.deploymentDraftId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeploymentDraftLock"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployment-drafts/getLock"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeploymentDraftLockResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetDeploymentDraftLockResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>get deploymentDraft lock</p>
     * 
     * @param request GetDeploymentDraftLockRequest
     * @return GetDeploymentDraftLockResponse
     */
    public GetDeploymentDraftLockResponse getDeploymentDraftLock(String namespace, GetDeploymentDraftLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetDeploymentDraftLockHeaders headers = new GetDeploymentDraftLockHeaders();
        return this.getDeploymentDraftLockWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取运行事件</p>
     * 
     * @param request GetEventsRequest
     * @param headers GetEventsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEventsResponse
     */
    public GetEventsResponse getEventsWithOptions(String namespace, GetEventsRequest request, GetEventsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deploymentId)) {
            query.put("deploymentId", request.deploymentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEvents"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/events"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetEventsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetEventsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取运行事件</p>
     * 
     * @param request GetEventsRequest
     * @return GetEventsResponse
     */
    public GetEventsResponse getEvents(String namespace, GetEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetEventsHeaders headers = new GetEventsHeaders();
        return this.getEventsWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>get a folder</p>
     * 
     * @param request GetFolderRequest
     * @param headers GetFolderHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFolderResponse
     */
    public GetFolderResponse getFolderWithOptions(String namespace, GetFolderRequest request, GetFolderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("folderId", request.folderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFolder"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/folder"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetFolderResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetFolderResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>get a folder</p>
     * 
     * @param request GetFolderRequest
     * @return GetFolderResponse
     */
    public GetFolderResponse getFolder(String namespace, GetFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFolderHeaders headers = new GetFolderHeaders();
        return this.getFolderWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the asynchronous generation result of fine-grained resources based on the ID of the ticket that applies for an asynchronous generation.</p>
     * 
     * @param headers GetGenerateResourcePlanResultHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGenerateResourcePlanResultResponse
     */
    public GetGenerateResourcePlanResultResponse getGenerateResourcePlanResultWithOptions(String namespace, String ticketId, GetGenerateResourcePlanResultHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGenerateResourcePlanResult"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployments/tickets/" + com.aliyun.openapiutil.Client.getEncodeParam(ticketId) + "/resource-plan%3AasyncGenerate"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetGenerateResourcePlanResultResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetGenerateResourcePlanResultResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the asynchronous generation result of fine-grained resources based on the ID of the ticket that applies for an asynchronous generation.</p>
     * @return GetGenerateResourcePlanResultResponse
     */
    public GetGenerateResourcePlanResultResponse getGenerateResourcePlanResult(String namespace, String ticketId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetGenerateResourcePlanResultHeaders headers = new GetGenerateResourcePlanResultHeaders();
        return this.getGenerateResourcePlanResultWithOptions(namespace, ticketId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询动态更新结果</p>
     * 
     * @param headers GetHotUpdateJobResultHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotUpdateJobResultResponse
     */
    public GetHotUpdateJobResultResponse getHotUpdateJobResultWithOptions(String namespace, String jobHotUpdateId, GetHotUpdateJobResultHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotUpdateJobResult"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/jobs/hot-updates/" + com.aliyun.openapiutil.Client.getEncodeParam(jobHotUpdateId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotUpdateJobResultResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetHotUpdateJobResultResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询动态更新结果</p>
     * @return GetHotUpdateJobResultResponse
     */
    public GetHotUpdateJobResultResponse getHotUpdateJobResult(String namespace, String jobHotUpdateId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotUpdateJobResultHeaders headers = new GetHotUpdateJobResultHeaders();
        return this.getHotUpdateJobResultWithOptions(namespace, jobHotUpdateId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a job.</p>
     * 
     * @param headers GetJobHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobResponse
     */
    public GetJobResponse getJobWithOptions(String namespace, String jobId, GetJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJob"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetJobResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a job.</p>
     * @return GetJobResponse
     */
    public GetJobResponse getJob(String namespace, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetJobHeaders headers = new GetJobHeaders();
        return this.getJobWithOptions(namespace, jobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取作业诊断信息</p>
     * 
     * @param headers GetJobDiagnosisHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobDiagnosisResponse
     */
    public GetJobDiagnosisResponse getJobDiagnosisWithOptions(String namespace, String deploymentId, String jobId, GetJobDiagnosisHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobDiagnosis"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployments/" + com.aliyun.openapiutil.Client.getEncodeParam(deploymentId) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + "/job-diagnoses/lite"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobDiagnosisResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetJobDiagnosisResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取作业诊断信息</p>
     * @return GetJobDiagnosisResponse
     */
    public GetJobDiagnosisResponse getJobDiagnosis(String namespace, String deploymentId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetJobDiagnosisHeaders headers = new GetJobDiagnosisHeaders();
        return this.getJobDiagnosisWithOptions(namespace, deploymentId, jobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the latest startup logs of a job.</p>
     * 
     * @param headers GetLatestJobStartLogHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLatestJobStartLogResponse
     */
    public GetLatestJobStartLogResponse getLatestJobStartLogWithOptions(String namespace, String deploymentId, GetLatestJobStartLogHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLatestJobStartLog"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployments/" + com.aliyun.openapiutil.Client.getEncodeParam(deploymentId) + "/latest_jobmanager_start_log"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetLatestJobStartLogResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetLatestJobStartLogResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the latest startup logs of a job.</p>
     * @return GetLatestJobStartLogResponse
     */
    public GetLatestJobStartLogResponse getLatestJobStartLog(String namespace, String deploymentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetLatestJobStartLogHeaders headers = new GetLatestJobStartLogHeaders();
        return this.getLatestJobStartLogWithOptions(namespace, deploymentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the lineage information of a deployment.</p>
     * 
     * @param request GetLineageInfoRequest
     * @param headers GetLineageInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLineageInfoResponse
     */
    public GetLineageInfoResponse getLineageInfoWithOptions(GetLineageInfoRequest request, GetLineageInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLineageInfo"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/meta/v2/lineage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetLineageInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetLineageInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the lineage information of a deployment.</p>
     * 
     * @param request GetLineageInfoRequest
     * @return GetLineageInfoResponse
     */
    public GetLineageInfoResponse getLineageInfo(GetLineageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetLineageInfoHeaders headers = new GetLineageInfoHeaders();
        return this.getLineageInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the permissions of a member.</p>
     * 
     * @param headers GetMemberHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMemberResponse
     */
    public GetMemberResponse getMemberWithOptions(String namespace, String member, GetMemberHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMember"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gateway/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(member) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the permissions of a member.</p>
     * @return GetMemberResponse
     */
    public GetMemberResponse getMember(String namespace, String member) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetMemberHeaders headers = new GetMemberHeaders();
        return this.getMemberWithOptions(namespace, member, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries details of a savepoint and checkpoint.</p>
     * 
     * @param headers GetSavepointHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSavepointResponse
     */
    public GetSavepointResponse getSavepointWithOptions(String namespace, String savepointId, GetSavepointHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSavepoint"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/savepoints/" + com.aliyun.openapiutil.Client.getEncodeParam(savepointId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetSavepointResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetSavepointResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries details of a savepoint and checkpoint.</p>
     * @return GetSavepointResponse
     */
    public GetSavepointResponse getSavepoint(String namespace, String savepointId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetSavepointHeaders headers = new GetSavepointHeaders();
        return this.getSavepointWithOptions(namespace, savepointId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取session集群</p>
     * 
     * @param headers GetSessionClusterHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSessionClusterResponse
     */
    public GetSessionClusterResponse getSessionClusterWithOptions(String namespace, String sessionClusterName, GetSessionClusterHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSessionCluster"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/sessionclusters/" + com.aliyun.openapiutil.Client.getEncodeParam(sessionClusterName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetSessionClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetSessionClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取session集群</p>
     * @return GetSessionClusterResponse
     */
    public GetSessionClusterResponse getSessionCluster(String namespace, String sessionClusterName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetSessionClusterHeaders headers = new GetSessionClusterHeaders();
        return this.getSessionClusterWithOptions(namespace, sessionClusterName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取table</p>
     * 
     * @param request GetTablesRequest
     * @param headers GetTablesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTablesResponse
     */
    public GetTablesResponse getTablesWithOptions(String namespace, String catalogName, String databaseName, GetTablesRequest request, GetTablesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("tableName", request.tableName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTables"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/catalogs/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogName) + "/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(databaseName) + "/tables"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetTablesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetTablesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取table</p>
     * 
     * @param request GetTablesRequest
     * @return GetTablesResponse
     */
    public GetTablesResponse getTables(String namespace, String catalogName, String databaseName, GetTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetTablesHeaders headers = new GetTablesHeaders();
        return this.getTablesWithOptions(namespace, catalogName, databaseName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of the JAR or Python file that corresponds to the user-defined function (UDF) that you upload and create.</p>
     * 
     * @param request GetUdfArtifactsRequest
     * @param headers GetUdfArtifactsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUdfArtifactsResponse
     */
    public GetUdfArtifactsResponse getUdfArtifactsWithOptions(String namespace, GetUdfArtifactsRequest request, GetUdfArtifactsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.udfArtifactName)) {
            query.put("udfArtifactName", request.udfArtifactName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUdfArtifacts"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/udfartifacts"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetUdfArtifactsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetUdfArtifactsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of the JAR or Python file that corresponds to the user-defined function (UDF) that you upload and create.</p>
     * 
     * @param request GetUdfArtifactsRequest
     * @return GetUdfArtifactsResponse
     */
    public GetUdfArtifactsResponse getUdfArtifacts(String namespace, GetUdfArtifactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUdfArtifactsHeaders headers = new GetUdfArtifactsHeaders();
        return this.getUdfArtifactsWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Dynamically updates parameters or resources of a deployment that is running.</p>
     * 
     * @param headers HotUpdateJobHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotUpdateJobResponse
     */
    public HotUpdateJobResponse hotUpdateJobWithOptions(String namespace, String jobId, HotUpdateJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotUpdateJob"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + "%3AhotUpdate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new HotUpdateJobResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new HotUpdateJobResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Dynamically updates parameters or resources of a deployment that is running.</p>
     * @return HotUpdateJobResponse
     */
    public HotUpdateJobResponse hotUpdateJob(String namespace, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotUpdateJobHeaders headers = new HotUpdateJobHeaders();
        return this.hotUpdateJobWithOptions(namespace, jobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of existing custom connectors.</p>
     * 
     * @param headers ListCustomConnectorsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomConnectorsResponse
     */
    public ListCustomConnectorsResponse listCustomConnectorsWithOptions(String namespace, ListCustomConnectorsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomConnectors"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/connectors"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomConnectorsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListCustomConnectorsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of existing custom connectors.</p>
     * @return ListCustomConnectorsResponse
     */
    public ListCustomConnectorsResponse listCustomConnectors(String namespace) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListCustomConnectorsHeaders headers = new ListCustomConnectorsHeaders();
        return this.listCustomConnectorsWithOptions(namespace, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>list deploymentDrafts</p>
     * 
     * @param request ListDeploymentDraftsRequest
     * @param headers ListDeploymentDraftsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeploymentDraftsResponse
     */
    public ListDeploymentDraftsResponse listDeploymentDraftsWithOptions(String namespace, ListDeploymentDraftsRequest request, ListDeploymentDraftsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeploymentDrafts"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployment-drafts"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeploymentDraftsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListDeploymentDraftsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>list deploymentDrafts</p>
     * 
     * @param request ListDeploymentDraftsRequest
     * @return ListDeploymentDraftsResponse
     */
    public ListDeploymentDraftsResponse listDeploymentDrafts(String namespace, ListDeploymentDraftsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListDeploymentDraftsHeaders headers = new ListDeploymentDraftsHeaders();
        return this.listDeploymentDraftsWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of clusters in which deployments can be deployed. The cluster can be a session cluster or a per-job cluster.</p>
     * 
     * @param request ListDeploymentTargetsRequest
     * @param headers ListDeploymentTargetsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeploymentTargetsResponse
     */
    public ListDeploymentTargetsResponse listDeploymentTargetsWithOptions(String namespace, ListDeploymentTargetsRequest request, ListDeploymentTargetsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeploymentTargets"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployment-targets"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeploymentTargetsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListDeploymentTargetsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of clusters in which deployments can be deployed. The cluster can be a session cluster or a per-job cluster.</p>
     * 
     * @param request ListDeploymentTargetsRequest
     * @return ListDeploymentTargetsResponse
     */
    public ListDeploymentTargetsResponse listDeploymentTargets(String namespace, ListDeploymentTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListDeploymentTargetsHeaders headers = new ListDeploymentTargetsHeaders();
        return this.listDeploymentTargetsWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains information about all deployments.</p>
     * 
     * @param request ListDeploymentsRequest
     * @param headers ListDeploymentsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeploymentsResponse
     */
    public ListDeploymentsResponse listDeploymentsWithOptions(String namespace, ListDeploymentsRequest request, ListDeploymentsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionMode)) {
            query.put("executionMode", request.executionMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelKey)) {
            query.put("labelKey", request.labelKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelValueArray)) {
            query.put("labelValueArray", request.labelValueArray);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifier)) {
            query.put("modifier", request.modifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortName)) {
            query.put("sortName", request.sortName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeployments"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeploymentsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListDeploymentsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains information about all deployments.</p>
     * 
     * @param request ListDeploymentsRequest
     * @return ListDeploymentsResponse
     */
    public ListDeploymentsResponse listDeployments(String namespace, ListDeploymentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListDeploymentsHeaders headers = new ListDeploymentsHeaders();
        return this.listDeploymentsWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出有编辑权限的项目空间。</p>
     * 
     * @param request ListEditableNamespaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEditableNamespaceResponse
     */
    public ListEditableNamespaceResponse listEditableNamespaceWithOptions(ListEditableNamespaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEditableNamespace"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gateway/v2/namespaces/editable"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListEditableNamespaceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListEditableNamespaceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>列出有编辑权限的项目空间。</p>
     * 
     * @param request ListEditableNamespaceRequest
     * @return ListEditableNamespaceResponse
     */
    public ListEditableNamespaceResponse listEditableNamespace(ListEditableNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEditableNamespaceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of engine versions that are supported by Realtime Compute for Apache Flink.</p>
     * 
     * @param headers ListEngineVersionMetadataHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEngineVersionMetadataResponse
     */
    public ListEngineVersionMetadataResponse listEngineVersionMetadataWithOptions(ListEngineVersionMetadataHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEngineVersionMetadata"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/engine-version-meta.json"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListEngineVersionMetadataResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListEngineVersionMetadataResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of engine versions that are supported by Realtime Compute for Apache Flink.</p>
     * @return ListEngineVersionMetadataResponse
     */
    public ListEngineVersionMetadataResponse listEngineVersionMetadata() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListEngineVersionMetadataHeaders headers = new ListEngineVersionMetadataHeaders();
        return this.listEngineVersionMetadataWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all jobs in a deployment.</p>
     * 
     * @param request ListJobsRequest
     * @param headers ListJobsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobsWithOptions(String namespace, ListJobsRequest request, ListJobsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deploymentId)) {
            query.put("deploymentId", request.deploymentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortName)) {
            query.put("sortName", request.sortName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobs"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/jobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListJobsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all jobs in a deployment.</p>
     * 
     * @param request ListJobsRequest
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(String namespace, ListJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListJobsHeaders headers = new ListJobsHeaders();
        return this.listJobsWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the mappings between the ID and permissions of a member in a specific namespace.</p>
     * 
     * @param request ListMembersRequest
     * @param headers ListMembersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMembersResponse
     */
    public ListMembersResponse listMembersWithOptions(String namespace, ListMembersRequest request, ListMembersHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMembers"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gateway/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/members"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListMembersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListMembersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the mappings between the ID and permissions of a member in a specific namespace.</p>
     * 
     * @param request ListMembersRequest
     * @return ListMembersResponse
     */
    public ListMembersResponse listMembers(String namespace, ListMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListMembersHeaders headers = new ListMembersHeaders();
        return this.listMembersWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of savepoints or checkpoints.</p>
     * 
     * @param request ListSavepointsRequest
     * @param headers ListSavepointsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSavepointsResponse
     */
    public ListSavepointsResponse listSavepointsWithOptions(String namespace, ListSavepointsRequest request, ListSavepointsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deploymentId)) {
            query.put("deploymentId", request.deploymentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("jobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSavepoints"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/savepoints"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListSavepointsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListSavepointsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of savepoints or checkpoints.</p>
     * 
     * @param request ListSavepointsRequest
     * @return ListSavepointsResponse
     */
    public ListSavepointsResponse listSavepoints(String namespace, ListSavepointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListSavepointsHeaders headers = new ListSavepointsHeaders();
        return this.listSavepointsWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列表定时执行计划</p>
     * 
     * @param request ListScheduledPlanRequest
     * @param headers ListScheduledPlanHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScheduledPlanResponse
     */
    public ListScheduledPlanResponse listScheduledPlanWithOptions(String namespace, ListScheduledPlanRequest request, ListScheduledPlanHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deploymentId)) {
            query.put("deploymentId", request.deploymentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScheduledPlan"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/scheduled-plans"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListScheduledPlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListScheduledPlanResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>列表定时执行计划</p>
     * 
     * @param request ListScheduledPlanRequest
     * @return ListScheduledPlanResponse
     */
    public ListScheduledPlanResponse listScheduledPlan(String namespace, ListScheduledPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListScheduledPlanHeaders headers = new ListScheduledPlanHeaders();
        return this.listScheduledPlanWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取作业资源变更历史</p>
     * 
     * @param request ListScheduledPlanExecutedHistoryRequest
     * @param headers ListScheduledPlanExecutedHistoryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScheduledPlanExecutedHistoryResponse
     */
    public ListScheduledPlanExecutedHistoryResponse listScheduledPlanExecutedHistoryWithOptions(String namespace, ListScheduledPlanExecutedHistoryRequest request, ListScheduledPlanExecutedHistoryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deploymentId)) {
            query.put("deploymentId", request.deploymentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("origin", request.origin);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScheduledPlanExecutedHistory"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/job-resource-upgradings"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListScheduledPlanExecutedHistoryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListScheduledPlanExecutedHistoryResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取作业资源变更历史</p>
     * 
     * @param request ListScheduledPlanExecutedHistoryRequest
     * @return ListScheduledPlanExecutedHistoryResponse
     */
    public ListScheduledPlanExecutedHistoryResponse listScheduledPlanExecutedHistory(String namespace, ListScheduledPlanExecutedHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListScheduledPlanExecutedHistoryHeaders headers = new ListScheduledPlanExecutedHistoryHeaders();
        return this.listScheduledPlanExecutedHistoryWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举session集群</p>
     * 
     * @param headers ListSessionClustersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSessionClustersResponse
     */
    public ListSessionClustersResponse listSessionClustersWithOptions(String namespace, ListSessionClustersHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSessionClusters"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/sessionclusters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListSessionClustersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListSessionClustersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>列举session集群</p>
     * @return ListSessionClustersResponse
     */
    public ListSessionClustersResponse listSessionClusters(String namespace) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListSessionClustersHeaders headers = new ListSessionClustersHeaders();
        return this.listSessionClustersWithOptions(namespace, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of variables.</p>
     * 
     * @param request ListVariablesRequest
     * @param headers ListVariablesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVariablesResponse
     */
    public ListVariablesResponse listVariablesWithOptions(String namespace, ListVariablesRequest request, ListVariablesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVariables"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/variables"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListVariablesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListVariablesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of variables.</p>
     * 
     * @param request ListVariablesRequest
     * @return ListVariablesResponse
     */
    public ListVariablesResponse listVariables(String namespace, ListVariablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListVariablesHeaders headers = new ListVariablesHeaders();
        return this.listVariablesWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Registers a custom connector in a namespace. The registered custom connector can be used in SQL statements.</p>
     * 
     * @param request RegisterCustomConnectorRequest
     * @param headers RegisterCustomConnectorHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterCustomConnectorResponse
     */
    public RegisterCustomConnectorResponse registerCustomConnectorWithOptions(String namespace, RegisterCustomConnectorRequest request, RegisterCustomConnectorHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jarUrl)) {
            query.put("jarUrl", request.jarUrl);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterCustomConnector"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/connectors%3Aregister"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterCustomConnectorResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RegisterCustomConnectorResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Registers a custom connector in a namespace. The registered custom connector can be used in SQL statements.</p>
     * 
     * @param request RegisterCustomConnectorRequest
     * @return RegisterCustomConnectorResponse
     */
    public RegisterCustomConnectorResponse registerCustomConnector(String namespace, RegisterCustomConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RegisterCustomConnectorHeaders headers = new RegisterCustomConnectorHeaders();
        return this.registerCustomConnectorWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Registers specific or all of the user-defined functions (UDFs) that are parsed from the JAR files. The registered functions can be used in SQL statements.</p>
     * 
     * @param request RegisterUdfFunctionRequest
     * @param headers RegisterUdfFunctionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterUdfFunctionResponse
     */
    public RegisterUdfFunctionResponse registerUdfFunctionWithOptions(String namespace, RegisterUdfFunctionRequest request, RegisterUdfFunctionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.className)) {
            query.put("className", request.className);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            query.put("functionName", request.functionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udfArtifactName)) {
            query.put("udfArtifactName", request.udfArtifactName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterUdfFunction"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/udfartifacts/function%3AregisterUdfFunction"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterUdfFunctionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RegisterUdfFunctionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Registers specific or all of the user-defined functions (UDFs) that are parsed from the JAR files. The registered functions can be used in SQL statements.</p>
     * 
     * @param request RegisterUdfFunctionRequest
     * @return RegisterUdfFunctionResponse
     */
    public RegisterUdfFunctionResponse registerUdfFunction(String namespace, RegisterUdfFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RegisterUdfFunctionHeaders headers = new RegisterUdfFunctionHeaders();
        return this.registerUdfFunctionWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and starts a job.</p>
     * 
     * @deprecated OpenAPI StartJob is deprecated
     * 
     * @param request StartJobRequest
     * @param headers StartJobHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartJobResponse
     */
    @Deprecated
    // Deprecated
    public StartJobResponse startJobWithOptions(String namespace, StartJobRequest request, StartJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartJob"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/jobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartJobResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartJobResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates and starts a job.</p>
     * 
     * @deprecated OpenAPI StartJob is deprecated
     * 
     * @param request StartJobRequest
     * @return StartJobResponse
     */
    @Deprecated
    // Deprecated
    public StartJobResponse startJob(String namespace, StartJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StartJobHeaders headers = new StartJobHeaders();
        return this.startJobWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a job.</p>
     * 
     * @param request StartJobWithParamsRequest
     * @param headers StartJobWithParamsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartJobWithParamsResponse
     */
    public StartJobWithParamsResponse startJobWithParamsWithOptions(String namespace, StartJobWithParamsRequest request, StartJobWithParamsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartJobWithParams"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/jobs%3Astart"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartJobWithParamsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartJobWithParamsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Starts a job.</p>
     * 
     * @param request StartJobWithParamsRequest
     * @return StartJobWithParamsResponse
     */
    public StartJobWithParamsResponse startJobWithParams(String namespace, StartJobWithParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StartJobWithParamsHeaders headers = new StartJobWithParamsHeaders();
        return this.startJobWithParamsWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动session集群</p>
     * 
     * @param headers StartSessionClusterHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartSessionClusterResponse
     */
    public StartSessionClusterResponse startSessionClusterWithOptions(String namespace, String sessionClusterName, StartSessionClusterHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSessionCluster"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/sessionclusters/" + com.aliyun.openapiutil.Client.getEncodeParam(sessionClusterName) + "%3Astart"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartSessionClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartSessionClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>启动session集群</p>
     * @return StartSessionClusterResponse
     */
    public StartSessionClusterResponse startSessionCluster(String namespace, String sessionClusterName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StartSessionClusterHeaders headers = new StartSessionClusterHeaders();
        return this.startSessionClusterWithOptions(namespace, sessionClusterName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止应用执行定时计划</p>
     * 
     * @param headers StopApplyScheduledPlanHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopApplyScheduledPlanResponse
     */
    public StopApplyScheduledPlanResponse stopApplyScheduledPlanWithOptions(String namespace, String scheduledPlanId, StopApplyScheduledPlanHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopApplyScheduledPlan"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/scheduled-plans/" + com.aliyun.openapiutil.Client.getEncodeParam(scheduledPlanId) + "%3Astop"),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StopApplyScheduledPlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StopApplyScheduledPlanResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>停止应用执行定时计划</p>
     * @return StopApplyScheduledPlanResponse
     */
    public StopApplyScheduledPlanResponse stopApplyScheduledPlan(String namespace, String scheduledPlanId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StopApplyScheduledPlanHeaders headers = new StopApplyScheduledPlanHeaders();
        return this.stopApplyScheduledPlanWithOptions(namespace, scheduledPlanId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a job.</p>
     * 
     * @param request StopJobRequest
     * @param headers StopJobHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopJobResponse
     */
    public StopJobResponse stopJobWithOptions(String namespace, String jobId, StopJobRequest request, StopJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopJob"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + "%3Astop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StopJobResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StopJobResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Stops a job.</p>
     * 
     * @param request StopJobRequest
     * @return StopJobResponse
     */
    public StopJobResponse stopJob(String namespace, String jobId, StopJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StopJobHeaders headers = new StopJobHeaders();
        return this.stopJobWithOptions(namespace, jobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止session集群</p>
     * 
     * @param headers StopSessionClusterHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopSessionClusterResponse
     */
    public StopSessionClusterResponse stopSessionClusterWithOptions(String namespace, String sessionClusterName, StopSessionClusterHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopSessionCluster"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/sessionclusters/" + com.aliyun.openapiutil.Client.getEncodeParam(sessionClusterName) + "%3Astop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StopSessionClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StopSessionClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>停止session集群</p>
     * @return StopSessionClusterResponse
     */
    public StopSessionClusterResponse stopSessionCluster(String namespace, String sessionClusterName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StopSessionClusterHeaders headers = new StopSessionClusterHeaders();
        return this.stopSessionClusterWithOptions(namespace, sessionClusterName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates information about a deployment.</p>
     * 
     * @param request UpdateDeploymentRequest
     * @param headers UpdateDeploymentHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDeploymentResponse
     */
    public UpdateDeploymentResponse updateDeploymentWithOptions(String namespace, String deploymentId, UpdateDeploymentRequest request, UpdateDeploymentHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeployment"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployments/" + com.aliyun.openapiutil.Client.getEncodeParam(deploymentId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeploymentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateDeploymentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Updates information about a deployment.</p>
     * 
     * @param request UpdateDeploymentRequest
     * @return UpdateDeploymentResponse
     */
    public UpdateDeploymentResponse updateDeployment(String namespace, String deploymentId, UpdateDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateDeploymentHeaders headers = new UpdateDeploymentHeaders();
        return this.updateDeploymentWithOptions(namespace, deploymentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>update a deploymentDraft</p>
     * 
     * @param request UpdateDeploymentDraftRequest
     * @param headers UpdateDeploymentDraftHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDeploymentDraftResponse
     */
    public UpdateDeploymentDraftResponse updateDeploymentDraftWithOptions(String namespace, String deploymentDraftId, UpdateDeploymentDraftRequest request, UpdateDeploymentDraftHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeploymentDraft"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployment-drafts/" + com.aliyun.openapiutil.Client.getEncodeParam(deploymentDraftId) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeploymentDraftResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateDeploymentDraftResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>update a deploymentDraft</p>
     * 
     * @param request UpdateDeploymentDraftRequest
     * @return UpdateDeploymentDraftResponse
     */
    public UpdateDeploymentDraftResponse updateDeploymentDraft(String namespace, String deploymentDraftId, UpdateDeploymentDraftRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateDeploymentDraftHeaders headers = new UpdateDeploymentDraftHeaders();
        return this.updateDeploymentDraftWithOptions(namespace, deploymentDraftId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改deploymentTarget</p>
     * 
     * @param request UpdateDeploymentTargetRequest
     * @param headers UpdateDeploymentTargetHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDeploymentTargetResponse
     */
    public UpdateDeploymentTargetResponse updateDeploymentTargetWithOptions(String namespace, String deploymentTargetName, UpdateDeploymentTargetRequest request, UpdateDeploymentTargetHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeploymentTarget"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/deployment-targets/" + com.aliyun.openapiutil.Client.getEncodeParam(deploymentTargetName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeploymentTargetResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateDeploymentTargetResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>修改deploymentTarget</p>
     * 
     * @param request UpdateDeploymentTargetRequest
     * @return UpdateDeploymentTargetResponse
     */
    public UpdateDeploymentTargetResponse updateDeploymentTarget(String namespace, String deploymentTargetName, UpdateDeploymentTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateDeploymentTargetHeaders headers = new UpdateDeploymentTargetHeaders();
        return this.updateDeploymentTargetWithOptions(namespace, deploymentTargetName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>update a folder</p>
     * 
     * @param request UpdateFolderRequest
     * @param headers UpdateFolderHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFolderResponse
     */
    public UpdateFolderResponse updateFolderWithOptions(String namespace, String folderId, UpdateFolderRequest request, UpdateFolderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFolder"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/folder/" + com.aliyun.openapiutil.Client.getEncodeParam(folderId) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFolderResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateFolderResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>update a folder</p>
     * 
     * @param request UpdateFolderRequest
     * @return UpdateFolderResponse
     */
    public UpdateFolderResponse updateFolder(String namespace, String folderId, UpdateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateFolderHeaders headers = new UpdateFolderHeaders();
        return this.updateFolderWithOptions(namespace, folderId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the permissions of one or more members in a specific namespace.</p>
     * 
     * @param request UpdateMemberRequest
     * @param headers UpdateMemberHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMemberResponse
     */
    public UpdateMemberResponse updateMemberWithOptions(String namespace, UpdateMemberRequest request, UpdateMemberHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMember"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gateway/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/members"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Updates the permissions of one or more members in a specific namespace.</p>
     * 
     * @param request UpdateMemberRequest
     * @return UpdateMemberResponse
     */
    public UpdateMemberResponse updateMember(String namespace, UpdateMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateMemberHeaders headers = new UpdateMemberHeaders();
        return this.updateMemberWithOptions(namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新定时执行计划</p>
     * 
     * @param request UpdateScheduledPlanRequest
     * @param headers UpdateScheduledPlanHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateScheduledPlanResponse
     */
    public UpdateScheduledPlanResponse updateScheduledPlanWithOptions(String namespace, String scheduledPlanId, UpdateScheduledPlanRequest request, UpdateScheduledPlanHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateScheduledPlan"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/scheduled-plans/" + com.aliyun.openapiutil.Client.getEncodeParam(scheduledPlanId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateScheduledPlanResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateScheduledPlanResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新定时执行计划</p>
     * 
     * @param request UpdateScheduledPlanRequest
     * @return UpdateScheduledPlanResponse
     */
    public UpdateScheduledPlanResponse updateScheduledPlan(String namespace, String scheduledPlanId, UpdateScheduledPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateScheduledPlanHeaders headers = new UpdateScheduledPlanHeaders();
        return this.updateScheduledPlanWithOptions(namespace, scheduledPlanId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新session集群</p>
     * 
     * @param request UpdateSessionClusterRequest
     * @param headers UpdateSessionClusterHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSessionClusterResponse
     */
    public UpdateSessionClusterResponse updateSessionClusterWithOptions(String namespace, String sessionClusterName, UpdateSessionClusterRequest request, UpdateSessionClusterHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSessionCluster"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/sessionclusters/" + com.aliyun.openapiutil.Client.getEncodeParam(sessionClusterName) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSessionClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateSessionClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新session集群</p>
     * 
     * @param request UpdateSessionClusterRequest
     * @return UpdateSessionClusterResponse
     */
    public UpdateSessionClusterResponse updateSessionCluster(String namespace, String sessionClusterName, UpdateSessionClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateSessionClusterHeaders headers = new UpdateSessionClusterHeaders();
        return this.updateSessionClusterWithOptions(namespace, sessionClusterName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the JAR file of the user-defined function (UDF) that you create.</p>
     * 
     * @param request UpdateUdfArtifactRequest
     * @param headers UpdateUdfArtifactHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUdfArtifactResponse
     */
    public UpdateUdfArtifactResponse updateUdfArtifactWithOptions(String namespace, String udfArtifactName, UpdateUdfArtifactRequest request, UpdateUdfArtifactHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUdfArtifact"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/udfartifacts/" + com.aliyun.openapiutil.Client.getEncodeParam(udfArtifactName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUdfArtifactResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateUdfArtifactResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Updates the JAR file of the user-defined function (UDF) that you create.</p>
     * 
     * @param request UpdateUdfArtifactRequest
     * @return UpdateUdfArtifactResponse
     */
    public UpdateUdfArtifactResponse updateUdfArtifact(String namespace, String udfArtifactName, UpdateUdfArtifactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateUdfArtifactHeaders headers = new UpdateUdfArtifactHeaders();
        return this.updateUdfArtifactWithOptions(namespace, udfArtifactName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新秘钥</p>
     * 
     * @param request UpdateVariableRequest
     * @param headers UpdateVariableHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVariableResponse
     */
    public UpdateVariableResponse updateVariableWithOptions(String namespace, String name, UpdateVariableRequest request, UpdateVariableHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVariable"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/variables/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVariableResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateVariableResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新秘钥</p>
     * 
     * @param request UpdateVariableRequest
     * @return UpdateVariableResponse
     */
    public UpdateVariableResponse updateVariable(String namespace, String name, UpdateVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateVariableHeaders headers = new UpdateVariableHeaders();
        return this.updateVariableWithOptions(namespace, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies the code of an SQL deployment.</p>
     * 
     * @param request ValidateSqlStatementRequest
     * @param headers ValidateSqlStatementHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateSqlStatementResponse
     */
    public ValidateSqlStatementResponse validateSqlStatementWithOptions(String namespace, ValidateSqlStatementRequest request, ValidateSqlStatementHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.workspace)) {
            realHeaders.put("workspace", com.aliyun.teautil.Common.toJSONString(headers.workspace));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateSqlStatement"),
            new TeaPair("version", "2022-07-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/sql-statement/validate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateSqlStatementResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ValidateSqlStatementResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Verifies the code of an SQL deployment.</p>
     * 
     * @param request ValidateSqlStatementRequest
     * @return ValidateSqlStatementResponse
     */
    public ValidateSqlStatementResponse validateSqlStatement(String namespace, ValidateSqlStatementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ValidateSqlStatementHeaders headers = new ValidateSqlStatementHeaders();
        return this.validateSqlStatementWithOptions(namespace, request, headers, runtime);
    }
}

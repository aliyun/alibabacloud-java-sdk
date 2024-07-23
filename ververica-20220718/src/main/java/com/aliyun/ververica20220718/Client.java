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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeploymentResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMemberResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSavepointResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVariableResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeploymentResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteJobResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMemberResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSavepointResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVariableResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlinkApiProxyResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateResourcePlanWithFlinkConfAsyncResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeploymentResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGenerateResourcePlanResultResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLatestJobStartLogResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMemberResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSavepointResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeploymentTargetsResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeploymentsResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEditableNamespaceResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEngineVersionMetadataResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobsResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMembersResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSavepointsResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVariablesResponse());
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
     * <p>start job</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>start job</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartJobWithParamsResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopJobResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeploymentResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMemberResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateSqlStatementResponse());
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

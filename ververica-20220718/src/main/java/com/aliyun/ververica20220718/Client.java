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
     * @summary create a deployment
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
     * @summary create a deployment
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
     * @summary 调用CreateMember创建成员。
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
     * @summary 调用CreateMember创建成员。
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
     * @summary 调用CreateSavepoint触发一次savepoint。
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
     * @summary 调用CreateSavepoint触发一次savepoint。
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
     * @summary 调用CreateVariable创建变量。
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
     * @summary 调用CreateVariable创建变量。
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
     * @summary delete deployment
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
     * @summary delete deployment
     *
     * @return DeleteDeploymentResponse
     */
    public DeleteDeploymentResponse deleteDeployment(String namespace, String deploymentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteDeploymentHeaders headers = new DeleteDeploymentHeaders();
        return this.deleteDeploymentWithOptions(namespace, deploymentId, headers, runtime);
    }

    /**
     * @summary delete job
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
     * @summary delete job
     *
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJob(String namespace, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteJobHeaders headers = new DeleteJobHeaders();
        return this.deleteJobWithOptions(namespace, jobId, headers, runtime);
    }

    /**
     * @summary 调用DeleteMember删除成员。
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
     * @summary 调用DeleteMember删除成员。
     *
     * @return DeleteMemberResponse
     */
    public DeleteMemberResponse deleteMember(String namespace, String member) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteMemberHeaders headers = new DeleteMemberHeaders();
        return this.deleteMemberWithOptions(namespace, member, headers, runtime);
    }

    /**
     * @summary 调用DeleteSavepoint删除savepoint。
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
     * @summary 调用DeleteSavepoint删除savepoint。
     *
     * @return DeleteSavepointResponse
     */
    public DeleteSavepointResponse deleteSavepoint(String namespace, String savepointId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteSavepointHeaders headers = new DeleteSavepointHeaders();
        return this.deleteSavepointWithOptions(namespace, savepointId, headers, runtime);
    }

    /**
     * @summary deleta variable
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
     * @summary deleta variable
     *
     * @return DeleteVariableResponse
     */
    public DeleteVariableResponse deleteVariable(String namespace, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteVariableHeaders headers = new DeleteVariableHeaders();
        return this.deleteVariableWithOptions(namespace, name, headers, runtime);
    }

    /**
     * @summary 调用FlinkApiProxy代理Flink请求。
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
     * @summary 调用FlinkApiProxy代理Flink请求。
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
     * @summary generate resource plan with flink conf async.
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
     * @summary generate resource plan with flink conf async.
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
     * @summary get a deployment
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
     * @summary get a deployment
     *
     * @return GetDeploymentResponse
     */
    public GetDeploymentResponse getDeployment(String namespace, String deploymentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetDeploymentHeaders headers = new GetDeploymentHeaders();
        return this.getDeploymentWithOptions(namespace, deploymentId, headers, runtime);
    }

    /**
     * @summary 获取生成ResourcePlan异步操作的结果。
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
     * @summary 获取生成ResourcePlan异步操作的结果。
     *
     * @return GetGenerateResourcePlanResultResponse
     */
    public GetGenerateResourcePlanResultResponse getGenerateResourcePlanResult(String namespace, String ticketId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetGenerateResourcePlanResultHeaders headers = new GetGenerateResourcePlanResultHeaders();
        return this.getGenerateResourcePlanResultWithOptions(namespace, ticketId, headers, runtime);
    }

    /**
     * @summary get job
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
     * @summary get job
     *
     * @return GetJobResponse
     */
    public GetJobResponse getJob(String namespace, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetJobHeaders headers = new GetJobHeaders();
        return this.getJobWithOptions(namespace, jobId, headers, runtime);
    }

    /**
     * @summary 调用GetMember获取成员。
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
     * @summary 调用GetMember获取成员。
     *
     * @return GetMemberResponse
     */
    public GetMemberResponse getMember(String namespace, String member) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetMemberHeaders headers = new GetMemberHeaders();
        return this.getMemberWithOptions(namespace, member, headers, runtime);
    }

    /**
     * @summary 调用GetSavepoint获取savepoint信息。
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
     * @summary 调用GetSavepoint获取savepoint信息。
     *
     * @return GetSavepointResponse
     */
    public GetSavepointResponse getSavepoint(String namespace, String savepointId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetSavepointHeaders headers = new GetSavepointHeaders();
        return this.getSavepointWithOptions(namespace, savepointId, headers, runtime);
    }

    /**
     * @summary list deployment targets
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
     * @summary list deployment targets
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
     * @summary list deployments
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
     * @summary list deployments
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
     * @summary 列出有编辑权限的项目空间。
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
     * @summary 列出有编辑权限的项目空间。
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
     * @summary 获取系统支持的引擎版本信息。
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
     * @summary 获取系统支持的引擎版本信息。
     *
     * @return ListEngineVersionMetadataResponse
     */
    public ListEngineVersionMetadataResponse listEngineVersionMetadata() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListEngineVersionMetadataHeaders headers = new ListEngineVersionMetadataHeaders();
        return this.listEngineVersionMetadataWithOptions(headers, runtime);
    }

    /**
     * @summary list jobs
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
     * @summary list jobs
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
     * @summary 调用ListMembers接口获取成员列表。
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
     * @summary 调用ListMembers接口获取成员列表。
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
     * @summary 调用ListSavepoints获取满足查询条件的savepoint列表。
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
     * @summary 调用ListSavepoints获取满足查询条件的savepoint列表。
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
     * @summary list variables
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
     * @summary list variables
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
     * @deprecated OpenAPI StartJob is deprecated
     *
     * @summary start job
     *
     * @param request StartJobRequest
     * @param headers StartJobHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartJobResponse
     */
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
     * @deprecated OpenAPI StartJob is deprecated
     *
     * @summary start job
     *
     * @param request StartJobRequest
     * @return StartJobResponse
     */
    // Deprecated
    public StartJobResponse startJob(String namespace, StartJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StartJobHeaders headers = new StartJobHeaders();
        return this.startJobWithOptions(namespace, request, headers, runtime);
    }

    /**
     * @summary 启动作业实例。
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
     * @summary 启动作业实例。
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
     * @summary 调用StopJob停止实例。
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
     * @summary 调用StopJob停止实例。
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
     * @summary update a deployment using patch
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
     * @summary update a deployment using patch
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
     * @summary 调用UpdateMember更新成员。
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
     * @summary 调用UpdateMember更新成员。
     *
     * @param request UpdateMemberRequest
     * @return UpdateMemberResponse
     */
    public UpdateMemberResponse updateMember(String namespace, UpdateMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateMemberHeaders headers = new UpdateMemberHeaders();
        return this.updateMemberWithOptions(namespace, request, headers, runtime);
    }
}

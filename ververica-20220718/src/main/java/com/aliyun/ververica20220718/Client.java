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

    public CreateDeploymentResponse createDeployment(String namespace, CreateDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateDeploymentHeaders headers = new CreateDeploymentHeaders();
        return this.createDeploymentWithOptions(namespace, request, headers, runtime);
    }

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

    public CreateSavepointResponse createSavepoint(String namespace, CreateSavepointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateSavepointHeaders headers = new CreateSavepointHeaders();
        return this.createSavepointWithOptions(namespace, request, headers, runtime);
    }

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

    public CreateVariableResponse createVariable(String namespace, CreateVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateVariableHeaders headers = new CreateVariableHeaders();
        return this.createVariableWithOptions(namespace, request, headers, runtime);
    }

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

    public DeleteDeploymentResponse deleteDeployment(String namespace, String deploymentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteDeploymentHeaders headers = new DeleteDeploymentHeaders();
        return this.deleteDeploymentWithOptions(namespace, deploymentId, headers, runtime);
    }

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

    public DeleteJobResponse deleteJob(String namespace, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteJobHeaders headers = new DeleteJobHeaders();
        return this.deleteJobWithOptions(namespace, jobId, headers, runtime);
    }

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

    public DeleteSavepointResponse deleteSavepoint(String namespace, String savepointId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteSavepointHeaders headers = new DeleteSavepointHeaders();
        return this.deleteSavepointWithOptions(namespace, savepointId, headers, runtime);
    }

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

    public DeleteVariableResponse deleteVariable(String namespace, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteVariableHeaders headers = new DeleteVariableHeaders();
        return this.deleteVariableWithOptions(namespace, name, headers, runtime);
    }

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

    public FlinkApiProxyResponse flinkApiProxy(FlinkApiProxyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlinkApiProxyHeaders headers = new FlinkApiProxyHeaders();
        return this.flinkApiProxyWithOptions(request, headers, runtime);
    }

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

    public GenerateResourcePlanWithFlinkConfAsyncResponse generateResourcePlanWithFlinkConfAsync(String namespace, String deploymentId, GenerateResourcePlanWithFlinkConfAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GenerateResourcePlanWithFlinkConfAsyncHeaders headers = new GenerateResourcePlanWithFlinkConfAsyncHeaders();
        return this.generateResourcePlanWithFlinkConfAsyncWithOptions(namespace, deploymentId, request, headers, runtime);
    }

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

    public GetDeploymentResponse getDeployment(String namespace, String deploymentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetDeploymentHeaders headers = new GetDeploymentHeaders();
        return this.getDeploymentWithOptions(namespace, deploymentId, headers, runtime);
    }

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

    public GetGenerateResourcePlanResultResponse getGenerateResourcePlanResult(String namespace, String ticketId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetGenerateResourcePlanResultHeaders headers = new GetGenerateResourcePlanResultHeaders();
        return this.getGenerateResourcePlanResultWithOptions(namespace, ticketId, headers, runtime);
    }

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

    public GetJobResponse getJob(String namespace, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetJobHeaders headers = new GetJobHeaders();
        return this.getJobWithOptions(namespace, jobId, headers, runtime);
    }

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

    public GetSavepointResponse getSavepoint(String namespace, String savepointId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetSavepointHeaders headers = new GetSavepointHeaders();
        return this.getSavepointWithOptions(namespace, savepointId, headers, runtime);
    }

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

    public ListDeploymentTargetsResponse listDeploymentTargets(String namespace, ListDeploymentTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListDeploymentTargetsHeaders headers = new ListDeploymentTargetsHeaders();
        return this.listDeploymentTargetsWithOptions(namespace, request, headers, runtime);
    }

    public ListDeploymentsResponse listDeploymentsWithOptions(String namespace, ListDeploymentsRequest request, ListDeploymentsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executionMode)) {
            query.put("executionMode", request.executionMode);
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

    public ListDeploymentsResponse listDeployments(String namespace, ListDeploymentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListDeploymentsHeaders headers = new ListDeploymentsHeaders();
        return this.listDeploymentsWithOptions(namespace, request, headers, runtime);
    }

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

    public ListEngineVersionMetadataResponse listEngineVersionMetadata() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListEngineVersionMetadataHeaders headers = new ListEngineVersionMetadataHeaders();
        return this.listEngineVersionMetadataWithOptions(headers, runtime);
    }

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

    public ListJobsResponse listJobs(String namespace, ListJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListJobsHeaders headers = new ListJobsHeaders();
        return this.listJobsWithOptions(namespace, request, headers, runtime);
    }

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

    public ListSavepointsResponse listSavepoints(String namespace, ListSavepointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListSavepointsHeaders headers = new ListSavepointsHeaders();
        return this.listSavepointsWithOptions(namespace, request, headers, runtime);
    }

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

    public ListVariablesResponse listVariables(String namespace, ListVariablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListVariablesHeaders headers = new ListVariablesHeaders();
        return this.listVariablesWithOptions(namespace, request, headers, runtime);
    }

    /**
      * @deprecated
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
      * @deprecated
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

    public StartJobWithParamsResponse startJobWithParams(String namespace, StartJobWithParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StartJobWithParamsHeaders headers = new StartJobWithParamsHeaders();
        return this.startJobWithParamsWithOptions(namespace, request, headers, runtime);
    }

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

    public StopJobResponse stopJob(String namespace, String jobId, StopJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StopJobHeaders headers = new StopJobHeaders();
        return this.stopJobWithOptions(namespace, jobId, request, headers, runtime);
    }

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

    public UpdateDeploymentResponse updateDeployment(String namespace, String deploymentId, UpdateDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateDeploymentHeaders headers = new UpdateDeploymentHeaders();
        return this.updateDeploymentWithOptions(namespace, deploymentId, request, headers, runtime);
    }
}

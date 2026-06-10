// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230;

import com.aliyun.tea.*;
import com.aliyun.sysom20231230.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("sysom", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The diagnosis feature requires a service-linked role to be created under a Resource Access Management (RAM) user. When you call this API, it automatically checks whether the service-linked role exists. If the role does not exist, the API automatically creates it. This requires the RAM user invoking this API to have the ram:CreateServiceLinkedRole permission.</notice>
     * When calling this API to authorize SysOM to diagnose ECS instances, note the following:</p>
     * </blockquote>
     * <ul>
     * <li>Each authorization is valid for 7 days. After 7 days, the authorization expires, and you must call this API again to re-authorize.</li>
     * <li>If the SysOM service-linked role (AliyunServiceRoleForSysom) does not exist when you call this API, it will be automatically created. This requires the RAM user invoking this API to have the <code>ram:CreateServiceLinkedRole</code> permission.</li>
     * <li>When you authorize a specific instance through this API, the system automatically adds the label <code>sysom:diagnosis</code> to the target ECS instance. SysOM can only diagnose instances that have this label.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This API is used to authorize SysOM to diagnose ECS instances under your account. You can only invoke the InvokeDiagnosis API to initiate diagnosis on a specific ECS instance after authorizing it through this API.</p>
     * 
     * @param request AuthDiagnosisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthDiagnosisResponse
     */
    public AuthDiagnosisResponse authDiagnosisWithOptions(AuthDiagnosisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateRole)) {
            body.put("autoCreateRole", request.autoCreateRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoInstallAgent)) {
            body.put("autoInstallAgent", request.autoInstallAgent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthDiagnosis"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/diagnosis/auth"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthDiagnosisResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The diagnosis feature requires a service-linked role to be created under a Resource Access Management (RAM) user. When you call this API, it automatically checks whether the service-linked role exists. If the role does not exist, the API automatically creates it. This requires the RAM user invoking this API to have the ram:CreateServiceLinkedRole permission.</notice>
     * When calling this API to authorize SysOM to diagnose ECS instances, note the following:</p>
     * </blockquote>
     * <ul>
     * <li>Each authorization is valid for 7 days. After 7 days, the authorization expires, and you must call this API again to re-authorize.</li>
     * <li>If the SysOM service-linked role (AliyunServiceRoleForSysom) does not exist when you call this API, it will be automatically created. This requires the RAM user invoking this API to have the <code>ram:CreateServiceLinkedRole</code> permission.</li>
     * <li>When you authorize a specific instance through this API, the system automatically adds the label <code>sysom:diagnosis</code> to the target ECS instance. SysOM can only diagnose instances that have this label.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This API is used to authorize SysOM to diagnose ECS instances under your account. You can only invoke the InvokeDiagnosis API to initiate diagnosis on a specific ECS instance after authorizing it through this API.</p>
     * 
     * @param request AuthDiagnosisRequest
     * @return AuthDiagnosisResponse
     */
    public AuthDiagnosisResponse authDiagnosis(AuthDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authDiagnosisWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The instance list returned by this API includes only machines that are already managed by SysOM. If an ECS instance exists but is not managed by SysOM, it will not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Check whether the target instance is supported by SysOM</p>
     * 
     * @param request CheckInstanceSupportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckInstanceSupportResponse
     */
    public CheckInstanceSupportResponse checkInstanceSupportWithOptions(CheckInstanceSupportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckInstanceSupport"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/supportInstanceList/checkInstanceSupport"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckInstanceSupportResponse());
    }

    /**
     * <b>description</b> :
     * <p>The instance list returned by this API includes only machines that are already managed by SysOM. If an ECS instance exists but is not managed by SysOM, it will not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Check whether the target instance is supported by SysOM</p>
     * 
     * @param request CheckInstanceSupportRequest
     * @return CheckInstanceSupportResponse
     */
    public CheckInstanceSupportResponse checkInstanceSupport(CheckInstanceSupportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkInstanceSupportWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>High-CPU agent streaming API</p>
     * 
     * @param request CpuHighAgentStreamResponseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CpuHighAgentStreamResponseResponse
     */
    public CpuHighAgentStreamResponseResponse cpuHighAgentStreamResponseWithOptions(CpuHighAgentStreamResponseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.llmParamString)) {
            body.put("llmParamString", request.llmParamString);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CpuHighAgentStreamResponse"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/highCpuAgent/streamResponse"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CpuHighAgentStreamResponseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>High-CPU agent streaming API</p>
     * 
     * @param request CpuHighAgentStreamResponseRequest
     * @return CpuHighAgentStreamResponseResponse
     */
    public CpuHighAgentStreamResponseResponse cpuHighAgentStreamResponse(CpuHighAgentStreamResponseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cpuHighAgentStreamResponseWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This API is used to create an alert contact for push notifications.</p>
     * 
     * @param request CreateAlertDestinationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAlertDestinationResponse
     */
    public CreateAlertDestinationResponse createAlertDestinationWithOptions(CreateAlertDestinationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            body.put("target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlertDestination"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/alertPusher/alert/createDestination"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAlertDestinationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This API is used to create an alert contact for push notifications.</p>
     * 
     * @param request CreateAlertDestinationRequest
     * @return CreateAlertDestinationResponse
     */
    public CreateAlertDestinationResponse createAlertDestination(CreateAlertDestinationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAlertDestinationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create an alert policy for push notifications</p>
     * 
     * @param request CreateAlertStrategyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAlertStrategyResponse
     */
    public CreateAlertStrategyResponse createAlertStrategyWithOptions(CreateAlertStrategyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.k8sLabel)) {
            body.put("k8sLabel", request.k8sLabel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategy)) {
            body.put("strategy", request.strategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlertStrategy"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/alertPusher/alert/createStrategy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAlertStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create an alert policy for push notifications</p>
     * 
     * @param request CreateAlertStrategyRequest
     * @return CreateAlertStrategyResponse
     */
    public CreateAlertStrategyResponse createAlertStrategy(CreateAlertStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAlertStrategyWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>需配合aliyun-tea-openapi-inner包的call_sseapi接口使用</li>
     * <li>需要按通用LLM服务输入参数填充参数，转为string后赋给llmParamString</li>
     * <li>返回数据需将string转为dict后使用，参考通用LLM服务返回格式</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建集群Vpc端点连接</p>
     * 
     * @param request CreateClusterVpcEndpointConnectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClusterVpcEndpointConnectionResponse
     */
    public CreateClusterVpcEndpointConnectionResponse createClusterVpcEndpointConnectionWithOptions(CreateClusterVpcEndpointConnectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("clusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("dryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClusterVpcEndpointConnection"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/k8sProxy/access/createClusterVpcEndpointConnection"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterVpcEndpointConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>需配合aliyun-tea-openapi-inner包的call_sseapi接口使用</li>
     * <li>需要按通用LLM服务输入参数填充参数，转为string后赋给llmParamString</li>
     * <li>返回数据需将string转为dict后使用，参考通用LLM服务返回格式</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建集群Vpc端点连接</p>
     * 
     * @param request CreateClusterVpcEndpointConnectionRequest
     * @return CreateClusterVpcEndpointConnectionResponse
     */
    public CreateClusterVpcEndpointConnectionResponse createClusterVpcEndpointConnection(CreateClusterVpcEndpointConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createClusterVpcEndpointConnectionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例巡检</p>
     * 
     * @param request CreateInstanceInspectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceInspectionResponse
     */
    public CreateInstanceInspectionResponse createInstanceInspectionWithOptions(CreateInstanceInspectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            body.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            body.put("items", request.items);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricSource)) {
            body.put("metricSource", request.metricSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceInspection"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/inspection/createInstanceInspection"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceInspectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例巡检</p>
     * 
     * @param request CreateInstanceInspectionRequest
     * @return CreateInstanceInspectionResponse
     */
    public CreateInstanceInspectionResponse createInstanceInspection(CreateInstanceInspectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceInspectionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This API creates an intelligent breakdown diagnosis task to diagnose the vmcore or dmesg log file provided in the parameters.</p>
     * 
     * @param request CreateVmcoreDiagnosisTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVmcoreDiagnosisTaskResponse
     */
    public CreateVmcoreDiagnosisTaskResponse createVmcoreDiagnosisTaskWithOptions(CreateVmcoreDiagnosisTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.debuginfoCommonUrl)) {
            body.put("debuginfoCommonUrl", request.debuginfoCommonUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debuginfoUrl)) {
            body.put("debuginfoUrl", request.debuginfoUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dmesgUrl)) {
            body.put("dmesgUrl", request.dmesgUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("taskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vmcoreUrl)) {
            body.put("vmcoreUrl", request.vmcoreUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVmcoreDiagnosisTask"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/crashAgent/diagnosis/createDiagnosisTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVmcoreDiagnosisTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This API creates an intelligent breakdown diagnosis task to diagnose the vmcore or dmesg log file provided in the parameters.</p>
     * 
     * @param request CreateVmcoreDiagnosisTaskRequest
     * @return CreateVmcoreDiagnosisTaskResponse
     */
    public CreateVmcoreDiagnosisTaskResponse createVmcoreDiagnosisTask(CreateVmcoreDiagnosisTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVmcoreDiagnosisTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This API is used to delete an alert contact.</p>
     * 
     * @param request DeleteAlertDestinationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAlertDestinationResponse
     */
    public DeleteAlertDestinationResponse deleteAlertDestinationWithOptions(DeleteAlertDestinationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlertDestination"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/alertPusher/alert/deleteDestination"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAlertDestinationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This API is used to delete an alert contact.</p>
     * 
     * @param request DeleteAlertDestinationRequest
     * @return DeleteAlertDestinationResponse
     */
    public DeleteAlertDestinationResponse deleteAlertDestination(DeleteAlertDestinationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAlertDestinationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>User deletes the alert policy for push notifications.</p>
     * 
     * @param request DeleteAlertStrategyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAlertStrategyResponse
     */
    public DeleteAlertStrategyResponse deleteAlertStrategyWithOptions(DeleteAlertStrategyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlertStrategy"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/alertPusher/alert/deleteStrategy"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAlertStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>User deletes the alert policy for push notifications.</p>
     * 
     * @param request DeleteAlertStrategyRequest
     * @return DeleteAlertStrategyResponse
     */
    public DeleteAlertStrategyResponse deleteAlertStrategy(DeleteAlertStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAlertStrategyWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The instance list obtained by this API includes only the machines that are already managed by SysOM. If an ECS instance exists but is not managed by SysOM, it will not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Query metrics</p>
     * 
     * @param request DescribeMetricListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetricListResponse
     */
    public DescribeMetricListResponse describeMetricListWithOptions(DescribeMetricListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("metricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetricList"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/proxy/get/describeMetricList"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetricListResponse());
    }

    /**
     * <b>description</b> :
     * <p>The instance list obtained by this API includes only the machines that are already managed by SysOM. If an ECS instance exists but is not managed by SysOM, it will not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Query metrics</p>
     * 
     * @param request DescribeMetricListRequest
     * @return DescribeMetricListResponse
     */
    public DescribeMetricListResponse describeMetricList(DescribeMetricListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeMetricListWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You must fill in the input parameters according to the standard LLM service input parameters, convert them into a string, and assign the result to llmParamString.  </li>
     * <li>The returned data must be converted from a string to a dict before use. Refer to the standard LLM service return format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the Return Result of the copilot service</p>
     * 
     * @param request GenerateCopilotResponseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateCopilotResponseResponse
     */
    public GenerateCopilotResponseResponse generateCopilotResponseWithOptions(GenerateCopilotResponseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.llmParamString)) {
            body.put("llmParamString", request.llmParamString);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateCopilotResponse"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/copilot/generate_copilot_response"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateCopilotResponseResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You must fill in the input parameters according to the standard LLM service input parameters, convert them into a string, and assign the result to llmParamString.  </li>
     * <li>The returned data must be converted from a string to a dict before use. Refer to the standard LLM service return format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the Return Result of the copilot service</p>
     * 
     * @param request GenerateCopilotResponseRequest
     * @return GenerateCopilotResponseResponse
     */
    public GenerateCopilotResponseResponse generateCopilotResponse(GenerateCopilotResponseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateCopilotResponseWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Must be used together with the call_sseapi API of the aliyun-tea-openapi-inner package.  </li>
     * <li>You must populate the input parameters according to the standard LLM service input parameters, convert them into a string, and assign the result to llmParamString.  </li>
     * <li>The returned data is a string that you must convert into a dictionary for use, following the standard LLM service response format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stream Copilot service API</p>
     * 
     * @param request GenerateCopilotStreamResponseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateCopilotStreamResponseResponse
     */
    public GenerateCopilotStreamResponseResponse generateCopilotStreamResponseWithOptions(GenerateCopilotStreamResponseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.llmParamString)) {
            body.put("llmParamString", request.llmParamString);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateCopilotStreamResponse"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/copilot/generate_copilot_stream_response"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateCopilotStreamResponseResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Must be used together with the call_sseapi API of the aliyun-tea-openapi-inner package.  </li>
     * <li>You must populate the input parameters according to the standard LLM service input parameters, convert them into a string, and assign the result to llmParamString.  </li>
     * <li>The returned data is a string that you must convert into a dictionary for use, following the standard LLM service response format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stream Copilot service API</p>
     * 
     * @param request GenerateCopilotStreamResponseRequest
     * @return GenerateCopilotStreamResponseResponse
     */
    public GenerateCopilotStreamResponseResponse generateCopilotStreamResponse(GenerateCopilotStreamResponseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateCopilotStreamResponseWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>View AI Infra Analysis Result</p>
     * 
     * @param request GetAIQueryResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAIQueryResultResponse
     */
    public GetAIQueryResultResponse getAIQueryResultWithOptions(GetAIQueryResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysisId)) {
            body.put("analysisId", request.analysisId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAIQueryResult"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/app_observ/aiAnalysis/query_result"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAIQueryResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>View AI Infra Analysis Result</p>
     * 
     * @param request GetAIQueryResultRequest
     * @return GetAIQueryResultResponse
     */
    public GetAIQueryResultResponse getAIQueryResult(GetAIQueryResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAIQueryResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the quantity of unprocessed (undiagnosed) anomalous activity at different Levels for edge zones/pods.</p>
     * 
     * @param request GetAbnormalEventsCountRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAbnormalEventsCountResponse
     */
    public GetAbnormalEventsCountResponse getAbnormalEventsCountWithOptions(GetAbnormalEventsCountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            query.put("cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("end", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pod)) {
            query.put("pod", request.pod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showPod)) {
            query.put("showPod", request.showPod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAbnormalEventsCount"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/range/abnormaly_events_count"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAbnormalEventsCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the quantity of unprocessed (undiagnosed) anomalous activity at different Levels for edge zones/pods.</p>
     * 
     * @param request GetAbnormalEventsCountRequest
     * @return GetAbnormalEventsCountResponse
     */
    public GetAbnormalEventsCountResponse getAbnormalEventsCount(GetAbnormalEventsCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAbnormalEventsCountWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the details of a widget</p>
     * 
     * @param request GetAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgentWithOptions(GetAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("agent_id", request.agentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgent"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/get_agent"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the details of a widget</p>
     * 
     * @param request GetAgentRequest
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgent(GetAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the task execution status of Agent installation</p>
     * 
     * @param request GetAgentTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentTaskResponse
     */
    public GetAgentTaskResponse getAgentTaskWithOptions(GetAgentTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("task_id", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentTask"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/get_agent_task"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the task execution status of Agent installation</p>
     * 
     * @param request GetAgentTaskRequest
     * @return GetAgentTaskResponse
     */
    public GetAgentTaskResponse getAgentTask(GetAgentTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This API is used to obtain the specified alert contact information.</p>
     * 
     * @param request GetAlertDestinationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlertDestinationResponse
     */
    public GetAlertDestinationResponse getAlertDestinationWithOptions(GetAlertDestinationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlertDestination"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/alertPusher/alert/getDestination"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlertDestinationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This API is used to obtain the specified alert contact information.</p>
     * 
     * @param request GetAlertDestinationRequest
     * @return GetAlertDestinationResponse
     */
    public GetAlertDestinationResponse getAlertDestination(GetAlertDestinationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlertDestinationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain an alert for a user by policy ID.</p>
     * 
     * @param request GetAlertStrategyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlertStrategyResponse
     */
    public GetAlertStrategyResponse getAlertStrategyWithOptions(GetAlertStrategyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlertStrategy"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/alertPusher/alert/getStrategy"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlertStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain an alert for a user by policy ID.</p>
     * 
     * @param request GetAlertStrategyRequest
     * @return GetAlertStrategyResponse
     */
    public GetAlertStrategyResponse getAlertStrategy(GetAlertStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlertStrategyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve copilot chat history</p>
     * 
     * @param request GetCopilotHistoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCopilotHistoryResponse
     */
    public GetCopilotHistoryResponse getCopilotHistoryWithOptions(GetCopilotHistoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            body.put("count", request.count);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCopilotHistory"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/copilot/get_copilot_history"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCopilotHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve copilot chat history</p>
     * 
     * @param request GetCopilotHistoryRequest
     * @return GetCopilotHistoryResponse
     */
    public GetCopilotHistoryResponse getCopilotHistory(GetCopilotHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCopilotHistoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The diagnosis flow is asynchronous. Therefore, when you invoke this API, the diagnosis may still be executing and not yet ended. You can check the <code>data.status</code> field in the returned data to determine the status. When <code>data.status == &quot;Success&quot;</code>, it indicates that the diagnosis succeeded, and you can read the diagnosis result from <code>data.result</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the diagnosis result.</p>
     * 
     * @param request GetDiagnosisResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDiagnosisResultResponse
     */
    public GetDiagnosisResultResponse getDiagnosisResultWithOptions(GetDiagnosisResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("task_id", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDiagnosisResult"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/diagnosis/get_diagnosis_results"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDiagnosisResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>The diagnosis flow is asynchronous. Therefore, when you invoke this API, the diagnosis may still be executing and not yet ended. You can check the <code>data.status</code> field in the returned data to determine the status. When <code>data.status == &quot;Success&quot;</code>, it indicates that the diagnosis succeeded, and you can read the diagnosis result from <code>data.result</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the diagnosis result.</p>
     * 
     * @param request GetDiagnosisResultRequest
     * @return GetDiagnosisResultResponse
     */
    public GetDiagnosisResultResponse getDiagnosisResult(GetDiagnosisResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDiagnosisResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the proportion of edge zone/pod health statuses over a period of time</p>
     * 
     * @param request GetHealthPercentageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHealthPercentageResponse
     */
    public GetHealthPercentageResponse getHealthPercentageWithOptions(GetHealthPercentageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            query.put("cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("end", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHealthPercentage"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/range/health_percentage"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHealthPercentageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the proportion of edge zone/pod health statuses over a period of time</p>
     * 
     * @param request GetHealthPercentageRequest
     * @return GetHealthPercentageResponse
     */
    public GetHealthPercentageResponse getHealthPercentage(GetHealthPercentageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHealthPercentageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the number of edge zones in a cluster or the number of pods in an edge zone</p>
     * 
     * @param request GetHostCountRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHostCountResponse
     */
    public GetHostCountResponse getHostCountWithOptions(GetHostCountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            query.put("cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("end", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHostCount"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/range/host_count"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHostCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the number of edge zones in a cluster or the number of pods in an edge zone</p>
     * 
     * @param request GetHostCountRequest
     * @return GetHostCountResponse
     */
    public GetHostCountResponse getHostCount(GetHostCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHostCountWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the list of a specific field under an instance.</p>
     * 
     * @param request GetHotSpotUniqListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotSpotUniqListResponse
     */
    public GetHotSpotUniqListResponse getHotSpotUniqListWithOptions(GetHotSpotUniqListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.begEnd)) {
            body.put("beg_end", request.begEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.begStart)) {
            body.put("beg_start", request.begStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            body.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            body.put("pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            body.put("table", request.table);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniq)) {
            body.put("uniq", request.uniq);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotSpotUniqList"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/livetrace_proxy/hotspot_uniq_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotSpotUniqListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the list of a specific field under an instance.</p>
     * 
     * @param request GetHotSpotUniqListRequest
     * @return GetHotSpotUniqListResponse
     */
    public GetHotSpotUniqListResponse getHotSpotUniqList(GetHotSpotUniqListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHotSpotUniqListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain hot spot analysis results</p>
     * 
     * @param request GetHotspotAnalysisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotspotAnalysisResponse
     */
    public GetHotspotAnalysisResponse getHotspotAnalysisWithOptions(GetHotspotAnalysisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("appType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.begEnd)) {
            body.put("beg_end", request.begEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.begStart)) {
            body.put("beg_start", request.begStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            body.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            body.put("pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            body.put("table", request.table);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotspotAnalysis"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/proxy/post/livetrace_hotspot_analysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotspotAnalysisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain hot spot analysis results</p>
     * 
     * @param request GetHotspotAnalysisRequest
     * @return GetHotspotAnalysisResponse
     */
    public GetHotspotAnalysisResponse getHotspotAnalysis(GetHotspotAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHotspotAnalysisWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain hot spot comparison tracing results</p>
     * 
     * @param request GetHotspotCompareRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotspotCompareResponse
     */
    public GetHotspotCompareResponse getHotspotCompareWithOptions(GetHotspotCompareRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beg1End)) {
            body.put("beg1_end", request.beg1End);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beg1Start)) {
            body.put("beg1_start", request.beg1Start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beg2End)) {
            body.put("beg2_end", request.beg2End);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beg2Start)) {
            body.put("beg2_start", request.beg2Start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotType)) {
            body.put("hot_type", request.hotType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance1)) {
            body.put("instance1", request.instance1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance2)) {
            body.put("instance2", request.instance2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid1)) {
            body.put("pid1", request.pid1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid2)) {
            body.put("pid2", request.pid2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            body.put("table", request.table);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotspotCompare"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/proxy/post/livetrace_hotspot_compare"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotspotCompareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain hot spot comparison tracing results</p>
     * 
     * @param request GetHotspotCompareRequest
     * @return GetHotspotCompareResponse
     */
    public GetHotspotCompareResponse getHotspotCompare(GetHotspotCompareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHotspotCompareWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the hot spot instance list</p>
     * 
     * @param request GetHotspotInstanceListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotspotInstanceListResponse
     */
    public GetHotspotInstanceListResponse getHotspotInstanceListWithOptions(GetHotspotInstanceListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.begEnd)) {
            body.put("beg_end", request.begEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.begStart)) {
            body.put("beg_start", request.begStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            body.put("table", request.table);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotspotInstanceList"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/proxy/post/livetrace_hotspot_instance_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotspotInstanceListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the hot spot instance list</p>
     * 
     * @param request GetHotspotInstanceListRequest
     * @return GetHotspotInstanceListResponse
     */
    public GetHotspotInstanceListResponse getHotspotInstanceList(GetHotspotInstanceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHotspotInstanceListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the PID list of a specific instance</p>
     * 
     * @param request GetHotspotPidListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotspotPidListResponse
     */
    public GetHotspotPidListResponse getHotspotPidListWithOptions(GetHotspotPidListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.begEnd)) {
            body.put("beg_end", request.begEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.begStart)) {
            body.put("beg_start", request.begStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            body.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            body.put("table", request.table);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotspotPidList"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/proxy/post/livetrace_hotspot_pid_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotspotPidListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the PID list of a specific instance</p>
     * 
     * @param request GetHotspotPidListRequest
     * @return GetHotspotPidListResponse
     */
    public GetHotspotPidListResponse getHotspotPidList(GetHotspotPidListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHotspotPidListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain hot spot tracing results</p>
     * 
     * @param request GetHotspotTrackingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotspotTrackingResponse
     */
    public GetHotspotTrackingResponse getHotspotTrackingWithOptions(GetHotspotTrackingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.begEnd)) {
            body.put("beg_end", request.begEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.begStart)) {
            body.put("beg_start", request.begStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotType)) {
            body.put("hot_type", request.hotType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            body.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            body.put("pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            body.put("table", request.table);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotspotTracking"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/proxy/post/livetrace_hotspot_tracking"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotspotTrackingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain hot spot tracing results</p>
     * 
     * @param request GetHotspotTrackingRequest
     * @return GetHotspotTrackingResponse
     */
    public GetHotspotTrackingResponse getHotspotTracking(GetHotspotTrackingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHotspotTrackingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取巡检报告</p>
     * 
     * @param request GetInspectionReportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInspectionReportResponse
     */
    public GetInspectionReportResponse getInspectionReportWithOptions(GetInspectionReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("reportId", request.reportId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInspectionReport"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/inspection/getInspectionReport"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInspectionReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取巡检报告</p>
     * 
     * @param request GetInspectionReportRequest
     * @return GetInspectionReportResponse
     */
    public GetInspectionReportResponse getInspectionReport(GetInspectionReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInspectionReportWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain real-time cluster/edge zone health degree score</p>
     * 
     * @param request GetInstantScoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstantScoreResponse
     */
    public GetInstantScoreResponse getInstantScoreWithOptions(GetInstantScoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            query.put("cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstantScore"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/instant/score"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstantScoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain real-time cluster/edge zone health degree score</p>
     * 
     * @param request GetInstantScoreRequest
     * @return GetInstantScoreResponse
     */
    public GetInstantScoreResponse getInstantScore(GetInstantScoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstantScoreWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>AI Infra retrieves the list of analysis records</p>
     * 
     * @param request GetListRecordRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetListRecordResponse
     */
    public GetListRecordResponse getListRecordWithOptions(GetListRecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetListRecord"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/app_observ/aiAnalysis/list_record"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetListRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>AI Infra retrieves the list of analysis records</p>
     * 
     * @param request GetListRecordRequest
     * @return GetListRecordResponse
     */
    public GetListRecordResponse getListRecord(GetListRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getListRecordWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the proportion of abnormal issues in pods within edge zones or in an edge zone within a cluster over a specified period of time.</p>
     * 
     * @param request GetProblemPercentageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProblemPercentageResponse
     */
    public GetProblemPercentageResponse getProblemPercentageWithOptions(GetProblemPercentageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            query.put("cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("end", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProblemPercentage"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/range/problem_percentage"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProblemPercentageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the proportion of abnormal issues in pods within edge zones or in an edge zone within a cluster over a specified period of time.</p>
     * 
     * @param request GetProblemPercentageRequest
     * @return GetProblemPercentageResponse
     */
    public GetProblemPercentageResponse getProblemPercentage(GetProblemPercentageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProblemPercentageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the health score trend</p>
     * 
     * @param request GetRangeScoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRangeScoreResponse
     */
    public GetRangeScoreResponse getRangeScoreWithOptions(GetRangeScoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            query.put("cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("end", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRangeScore"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/range/score"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRangeScoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the health score trend</p>
     * 
     * @param request GetRangeScoreRequest
     * @return GetRangeScoreResponse
     */
    public GetRangeScoreResponse getRangeScore(GetRangeScoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRangeScoreWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain real-time resource usage of clusters or edge zones</p>
     * 
     * @param request GetResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourcesResponse
     */
    public GetResourcesResponse getResourcesWithOptions(GetResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            query.put("cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResources"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/instant/resource"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain real-time resource usage of clusters or edge zones</p>
     * 
     * @param request GetResourcesRequest
     * @return GetResourcesResponse
     */
    public GetResourcesResponse getResources(GetResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is used to retrieve the service configuration status.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain Function Modules Configuration</p>
     * 
     * @param tmpReq GetServiceFuncStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceFuncStatusResponse
     */
    public GetServiceFuncStatusResponse getServiceFuncStatusWithOptions(GetServiceFuncStatusRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetServiceFuncStatusShrinkRequest request = new GetServiceFuncStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "params", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            query.put("params", request.paramsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("service_name", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceFuncStatus"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/func-switch/get-service-func-status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceFuncStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is used to retrieve the service configuration status.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain Function Modules Configuration</p>
     * 
     * @param request GetServiceFuncStatusRequest
     * @return GetServiceFuncStatusResponse
     */
    public GetServiceFuncStatusResponse getServiceFuncStatus(GetServiceFuncStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceFuncStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This API queries the task execution status and diagnosis result based on the job ID.</p>
     * 
     * @param request GetVmcoreDiagnosisTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVmcoreDiagnosisTaskResponse
     */
    public GetVmcoreDiagnosisTaskResponse getVmcoreDiagnosisTaskWithOptions(GetVmcoreDiagnosisTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVmcoreDiagnosisTask"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/crashAgent/diagnosis/queryTask"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVmcoreDiagnosisTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This API queries the task execution status and diagnosis result based on the job ID.</p>
     * 
     * @param request GetVmcoreDiagnosisTaskRequest
     * @return GetVmcoreDiagnosisTaskResponse
     */
    public GetVmcoreDiagnosisTaskResponse getVmcoreDiagnosisTask(GetVmcoreDiagnosisTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVmcoreDiagnosisTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Some SysOM APIs require role assumption based on the <code>AliyunServiceRoleForSysom</code> service role. Therefore, before using SysOM features, you must invoke this API to perform initialization and ensure that the service role has been created.  </p>
     * <ul>
     * <li><code>check_only</code>: If this parameter is set to True, the API only checks whether the service role exists and does not create it. If this parameter is set to False or omitted, the API automatically creates the service role if it does not exist.<blockquote>
     * <p>Note: When you invoke this API to initialize the role, you are deemed to have accepted the User Agreement of the operating system console by default. For more information, see <a href="https://help.aliyun.com/zh/alinux/product-overview/os-console-overview?spm=a2c4g.11186623.help-menu-2632541.d_0_7.35a829ffLjQtgg">Overview of the Operating System Console</a> and <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202001091714_51956.html">Alibaba Cloud Service Trial Terms</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initialize SysOM and ensure that the service role exists.</p>
     * 
     * @param request InitialSysomRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitialSysomResponse
     */
    public InitialSysomResponse initialSysomWithOptions(InitialSysomRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkOnly)) {
            body.put("check_only", request.checkOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitialSysom"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/initial"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitialSysomResponse());
    }

    /**
     * <b>description</b> :
     * <p>Some SysOM APIs require role assumption based on the <code>AliyunServiceRoleForSysom</code> service role. Therefore, before using SysOM features, you must invoke this API to perform initialization and ensure that the service role has been created.  </p>
     * <ul>
     * <li><code>check_only</code>: If this parameter is set to True, the API only checks whether the service role exists and does not create it. If this parameter is set to False or omitted, the API automatically creates the service role if it does not exist.<blockquote>
     * <p>Note: When you invoke this API to initialize the role, you are deemed to have accepted the User Agreement of the operating system console by default. For more information, see <a href="https://help.aliyun.com/zh/alinux/product-overview/os-console-overview?spm=a2c4g.11186623.help-menu-2632541.d_0_7.35a829ffLjQtgg">Overview of the Operating System Console</a> and <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202001091714_51956.html">Alibaba Cloud Service Trial Terms</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initialize SysOM and ensure that the service role exists.</p>
     * 
     * @param request InitialSysomRequest
     * @return InitialSysomResponse
     */
    public InitialSysomResponse initialSysom(InitialSysomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initialSysomWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The API call to install an agent is asynchronous. After invoking this API, a task_id is returned. You can use this ID to invoke the GetAgentTask API to retrieve the job execution status.</p>
     * 
     * <b>summary</b> : 
     * <p>Install an agent on the specified instance</p>
     * 
     * @param request InstallAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallAgentResponse
     */
    public InstallAgentResponse installAgentWithOptions(InstallAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agent_id", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            body.put("agent_version", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.installType)) {
            body.put("install_type", request.installType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallAgent"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/install_agent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>The API call to install an agent is asynchronous. After invoking this API, a task_id is returned. You can use this ID to invoke the GetAgentTask API to retrieve the job execution status.</p>
     * 
     * <b>summary</b> : 
     * <p>Install an agent on the specified instance</p>
     * 
     * @param request InstallAgentRequest
     * @return InstallAgentResponse
     */
    public InstallAgentResponse installAgent(InstallAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installAgentWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you install widgets on the specified ACK cluster:  </p>
     * <ol>
     * <li>When the cluster is first enrolled, widgets are installed on all ECS instances in the cluster (if the cluster contains more than 50 nodes, widgets are installed on only 50 nodes in the first batch).  </li>
     * <li>The operating system console periodically checks for scale-in or scale-out events in the enrolled cluster. Whenever new ECS instances are added to the cluster, the operating system console automatically installs widgets on them without requiring user intervention.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Install widgets on a cluster</p>
     * 
     * @param request InstallAgentForClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallAgentForClusterResponse
     */
    public InstallAgentForClusterResponse installAgentForClusterWithOptions(InstallAgentForClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agent_id", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            body.put("agent_version", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            body.put("config_id", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grayscaleConfig)) {
            body.put("grayscale_config", request.grayscaleConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallAgentForCluster"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/install_agent_by_cluster"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallAgentForClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you install widgets on the specified ACK cluster:  </p>
     * <ol>
     * <li>When the cluster is first enrolled, widgets are installed on all ECS instances in the cluster (if the cluster contains more than 50 nodes, widgets are installed on only 50 nodes in the first batch).  </li>
     * <li>The operating system console periodically checks for scale-in or scale-out events in the enrolled cluster. Whenever new ECS instances are added to the cluster, the operating system console automatically installs widgets on them without requiring user intervention.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Install widgets on a cluster</p>
     * 
     * @param request InstallAgentForClusterRequest
     * @return InstallAgentForClusterResponse
     */
    public InstallAgentForClusterResponse installAgentForCluster(InstallAgentForClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installAgentForClusterWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Initiate diagnosis for anomalous activity</p>
     * 
     * @param request InvokeAnomalyDiagnosisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvokeAnomalyDiagnosisResponse
     */
    public InvokeAnomalyDiagnosisResponse invokeAnomalyDiagnosisWithOptions(InvokeAnomalyDiagnosisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeAnomalyDiagnosis"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/diagnosis/invoke_anomaly_diagnose"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeAnomalyDiagnosisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Initiate diagnosis for anomalous activity</p>
     * 
     * @param request InvokeAnomalyDiagnosisRequest
     * @return InvokeAnomalyDiagnosisResponse
     */
    public InvokeAnomalyDiagnosisResponse invokeAnomalyDiagnosis(InvokeAnomalyDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.invokeAnomalyDiagnosisWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Diagnosing the target ECS instance has the following requirements:  </p>
     * <ul>
     * <li>The instance status of the target ECS instance must be running.  </li>
     * <li>The Cloud Assistant Agent must already be installed on the target ECS instance. If it is not installed, install it by referring to <a href="https://help.aliyun.com/zh/ecs/user-guide/install-the-cloud-assistant-agent">Install the Cloud Assistant Agent</a>.  </li>
     * <li>You must invoke the AuthDiagnosis API to authorize SysOM to diagnose the target ECS instance. If this authorization is not granted, the API call will fail immediately.  </li>
     * <li>This API depends on the existence of the SysOM service-linked role (AliyunServiceRoleForSysom). This API does not create the service-linked role automatically. If the service-linked role does not exist, you must first call AuthDiagnosis to perform authorization, which will create the aforementioned service-linked role.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiate a diagnosis.</p>
     * 
     * @param request InvokeDiagnosisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvokeDiagnosisResponse
     */
    public InvokeDiagnosisResponse invokeDiagnosisWithOptions(InvokeDiagnosisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("service_name", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeDiagnosis"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/diagnosis/invoke_diagnosis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeDiagnosisResponse());
    }

    /**
     * <b>description</b> :
     * <p>Diagnosing the target ECS instance has the following requirements:  </p>
     * <ul>
     * <li>The instance status of the target ECS instance must be running.  </li>
     * <li>The Cloud Assistant Agent must already be installed on the target ECS instance. If it is not installed, install it by referring to <a href="https://help.aliyun.com/zh/ecs/user-guide/install-the-cloud-assistant-agent">Install the Cloud Assistant Agent</a>.  </li>
     * <li>You must invoke the AuthDiagnosis API to authorize SysOM to diagnose the target ECS instance. If this authorization is not granted, the API call will fail immediately.  </li>
     * <li>This API depends on the existence of the SysOM service-linked role (AliyunServiceRoleForSysom). This API does not create the service-linked role automatically. If the service-linked role does not exist, you must first call AuthDiagnosis to perform authorization, which will create the aforementioned service-linked role.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiate a diagnosis.</p>
     * 
     * @param request InvokeDiagnosisRequest
     * @return InvokeDiagnosisResponse
     */
    public InvokeDiagnosisResponse invokeDiagnosis(InvokeDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.invokeDiagnosisWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain anomalous activity information for clusters, edge zones, or pods within a specified time period.</p>
     * 
     * @param request ListAbnormalyEventsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAbnormalyEventsResponse
     */
    public ListAbnormalyEventsResponse listAbnormalyEventsWithOptions(ListAbnormalyEventsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            query.put("cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("end", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.event)) {
            query.put("event", request.event);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pod)) {
            query.put("pod", request.pod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showPod)) {
            query.put("showPod", request.showPod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAbnormalyEvents"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/range/abnormaly_events"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAbnormalyEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain anomalous activity information for clusters, edge zones, or pods within a specified time period.</p>
     * 
     * @param request ListAbnormalyEventsRequest
     * @return ListAbnormalyEventsResponse
     */
    public ListAbnormalyEventsResponse listAbnormalyEvents(ListAbnormalyEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAbnormalyEventsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List installation records of the agent</p>
     * 
     * @param request ListAgentInstallRecordsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentInstallRecordsResponse
     */
    public ListAgentInstallRecordsResponse listAgentInstallRecordsWithOptions(ListAgentInstallRecordsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instance_id", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("plugin_id", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginVersion)) {
            query.put("plugin_version", request.pluginVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentInstallRecords"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/list_agent_install_list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentInstallRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List installation records of the agent</p>
     * 
     * @param request ListAgentInstallRecordsRequest
     * @return ListAgentInstallRecordsResponse
     */
    public ListAgentInstallRecordsResponse listAgentInstallRecords(ListAgentInstallRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentInstallRecordsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the Agent List</p>
     * 
     * @param request ListAgentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentsResponse
     */
    public ListAgentsResponse listAgentsWithOptions(ListAgentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgents"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/list_agents"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the Agent List</p>
     * 
     * @param request ListAgentsRequest
     * @return ListAgentsResponse
     */
    public ListAgentsResponse listAgents(ListAgentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This API is used to obtain the alert contact list.</p>
     * 
     * @param request ListAlertDestinationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlertDestinationsResponse
     */
    public ListAlertDestinationsResponse listAlertDestinationsWithOptions(ListAlertDestinationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlertDestinations"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/alertPusher/alert/listDestinations"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertDestinationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This API is used to obtain the alert contact list.</p>
     * 
     * @param request ListAlertDestinationsRequest
     * @return ListAlertDestinationsResponse
     */
    public ListAlertDestinationsResponse listAlertDestinations(ListAlertDestinationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlertDestinationsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve all alerting items</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlertItemsResponse
     */
    public ListAlertItemsResponse listAlertItemsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlertItems"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/alertPusher/alert/listItems"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve all alerting items</p>
     * @return ListAlertItemsResponse
     */
    public ListAlertItemsResponse listAlertItems() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlertItemsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Used to obtain all alert policies for push notifications of a user</p>
     * 
     * @param request ListAlertStrategiesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlertStrategiesResponse
     */
    public ListAlertStrategiesResponse listAlertStrategiesWithOptions(ListAlertStrategiesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlertStrategies"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/alertPusher/alert/listStrategies"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertStrategiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Used to obtain all alert policies for push notifications of a user</p>
     * 
     * @param request ListAlertStrategiesRequest
     * @return ListAlertStrategiesResponse
     */
    public ListAlertStrategiesResponse listAlertStrategies(ListAlertStrategiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlertStrategiesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This API is used to obtain a list of managed or unmanaged instances along with instance information.</p>
     * 
     * @param request ListAllInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllInstancesResponse
     */
    public ListAllInstancesResponse listAllInstancesWithOptions(ListAllInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("instanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managedType)) {
            query.put("managedType", request.managedType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("pluginId", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllInstances"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/instance/listAllInstances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This API is used to obtain a list of managed or unmanaged instances along with instance information.</p>
     * 
     * @param request ListAllInstancesRequest
     * @return ListAllInstancesResponse
     */
    public ListAllInstancesResponse listAllInstances(ListAllInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAllInstancesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain cluster widget installation records</p>
     * 
     * @param request ListClusterAgentInstallRecordsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterAgentInstallRecordsResponse
     */
    public ListClusterAgentInstallRecordsResponse listClusterAgentInstallRecordsWithOptions(ListClusterAgentInstallRecordsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentConfigId)) {
            query.put("agent_config_id", request.agentConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("plugin_id", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginVersion)) {
            query.put("plugin_version", request.pluginVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterAgentInstallRecords"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/list_cluster_agent_install_list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterAgentInstallRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain cluster widget installation records</p>
     * 
     * @param request ListClusterAgentInstallRecordsRequest
     * @return ListClusterAgentInstallRecordsResponse
     */
    public ListClusterAgentInstallRecordsResponse listClusterAgentInstallRecords(ListClusterAgentInstallRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterAgentInstallRecordsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve all clusters managed by the current user</p>
     * 
     * @param request ListClustersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClustersResponse
     */
    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterStatus)) {
            query.put("cluster_status", request.clusterStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("cluster_type", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/cluster/list_clusters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClustersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve all clusters managed by the current user</p>
     * 
     * @param request ListClustersRequest
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClustersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the diagnosis history list.</p>
     * 
     * @param request ListDiagnosisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDiagnosisResponse
     */
    public ListDiagnosisResponse listDiagnosisWithOptions(ListDiagnosisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("service_name", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDiagnosis"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/diagnosis/list_diagnosis"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDiagnosisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the diagnosis history list.</p>
     * 
     * @param request ListDiagnosisRequest
     * @return ListDiagnosisResponse
     */
    public ListDiagnosisResponse listDiagnosis(ListDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDiagnosisWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain a list of cluster node or pod health scores within a specified time period.</p>
     * 
     * @param request ListInstanceHealthRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceHealthResponse
     */
    public ListInstanceHealthResponse listInstanceHealthWithOptions(ListInstanceHealthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            query.put("cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("end", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceHealth"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/range/instance_health_list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceHealthResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain a list of cluster node or pod health scores within a specified time period.</p>
     * 
     * @param request ListInstanceHealthRequest
     * @return ListInstanceHealthResponse
     */
    public ListInstanceHealthResponse listInstanceHealth(ListInstanceHealthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceHealthWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is used to obtain the list of machines managed by SysOM.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain instance status</p>
     * 
     * @param request ListInstanceStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceStatusResponse
     */
    public ListInstanceStatusResponse listInstanceStatusWithOptions(ListInstanceStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceStatus"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/instance/list_instance_status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is used to obtain the list of machines managed by SysOM.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain instance status</p>
     * 
     * @param request ListInstanceStatusRequest
     * @return ListInstanceStatusResponse
     */
    public ListInstanceStatusResponse listInstanceStatus(ListInstanceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The instance list returned by this API includes only the machines that have been managed by SysOM. If an ECS instance exists but has not been managed by SysOM, it will not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the instance list</p>
     * 
     * @param request ListInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/instance/list_instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>The instance list returned by this API includes only the machines that have been managed by SysOM. If an ECS instance exists but has not been managed by SysOM, it will not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the instance list</p>
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
     * <b>description</b> :
     * <p>The instance list returned by this API includes only machines that are already managed by SysOM. If an ECS instance exists but is not managed by SysOM, it will not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain a list of ECS information, such as the tag list, public IP address list, and so on.</p>
     * 
     * @param request ListInstancesEcsInfoListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesEcsInfoListResponse
     */
    public ListInstancesEcsInfoListResponse listInstancesEcsInfoListWithOptions(ListInstancesEcsInfoListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.infoType)) {
            query.put("info_type", request.infoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instance_id", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managedType)) {
            query.put("managed_type", request.managedType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("plugin_id", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstancesEcsInfoList"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/instance/listInstancesEcsInfoList"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesEcsInfoListResponse());
    }

    /**
     * <b>description</b> :
     * <p>The instance list returned by this API includes only machines that are already managed by SysOM. If an ECS instance exists but is not managed by SysOM, it will not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain a list of ECS information, such as the tag list, public IP address list, and so on.</p>
     * 
     * @param request ListInstancesEcsInfoListRequest
     * @return ListInstancesEcsInfoListResponse
     */
    public ListInstancesEcsInfoListResponse listInstancesEcsInfoList(ListInstancesEcsInfoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstancesEcsInfoListWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The current API returns a list of instances that have already been managed by SysOM. If an ECS instance exists but has not been managed by SysOM, it will not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain information about managed or unmanaged instances, including ECS information.</p>
     * 
     * @param tmpReq ListInstancesWithEcsInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesWithEcsInfoResponse
     */
    public ListInstancesWithEcsInfoResponse listInstancesWithEcsInfoWithOptions(ListInstancesWithEcsInfoRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListInstancesWithEcsInfoShrinkRequest request = new ListInstancesWithEcsInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceTag)) {
            request.instanceTagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceTag, "instance_tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthStatus)) {
            query.put("health_status", request.healthStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instance_id", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdName)) {
            query.put("instance_id_name", request.instanceIdName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("instance_name", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTagShrink)) {
            query.put("instance_tag", request.instanceTagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isManaged)) {
            query.put("is_managed", request.isManaged);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osName)) {
            query.put("os_name", request.osName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIp)) {
            query.put("private_ip", request.privateIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIp)) {
            query.put("public_ip", request.publicIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resource_group_id", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdName)) {
            query.put("resource_group_id_name", request.resourceGroupIdName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("resource_group_name", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstancesWithEcsInfo"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/instance/listInstancesWithEcsInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesWithEcsInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>The current API returns a list of instances that have already been managed by SysOM. If an ECS instance exists but has not been managed by SysOM, it will not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain information about managed or unmanaged instances, including ECS information.</p>
     * 
     * @param request ListInstancesWithEcsInfoRequest
     * @return ListInstancesWithEcsInfoResponse
     */
    public ListInstancesWithEcsInfoResponse listInstancesWithEcsInfo(ListInstancesWithEcsInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstancesWithEcsInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The instance list returned by this API consists of machines that are already managed by SysOM. If an ECS instance exists but is not managed by SysOM, it will not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the list of instances for plugin installation, update, or uninstallation</p>
     * 
     * @param request ListPluginsInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPluginsInstancesResponse
     */
    public ListPluginsInstancesResponse listPluginsInstancesWithOptions(ListPluginsInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdName)) {
            query.put("instance_id_name", request.instanceIdName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTag)) {
            query.put("instance_tag", request.instanceTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("operation_type", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("plugin_id", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPluginsInstances"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/listPluginsInstances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPluginsInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>The instance list returned by this API consists of machines that are already managed by SysOM. If an ECS instance exists but is not managed by SysOM, it will not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the list of instances for plugin installation, update, or uninstallation</p>
     * 
     * @param request ListPluginsInstancesRequest
     * @return ListPluginsInstancesResponse
     */
    public ListPluginsInstancesResponse listPluginsInstances(ListPluginsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPluginsInstancesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the list of pods in a cluster or instance</p>
     * 
     * @param request ListPodsOfInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPodsOfInstanceResponse
     */
    public ListPodsOfInstanceResponse listPodsOfInstanceWithOptions(ListPodsOfInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPodsOfInstance"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/instance/list_pod_of_instance"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPodsOfInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the list of pods in a cluster or instance</p>
     * 
     * @param request ListPodsOfInstanceRequest
     * @return ListPodsOfInstanceResponse
     */
    public ListPodsOfInstanceResponse listPodsOfInstance(ListPodsOfInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPodsOfInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API retrieves the list of areas where the current user has machines managed by SysOM. If the user has ECS instances in an area but those instances are not managed by SysOM, that area will not appear in the API response.</p>
     * 
     * <b>summary</b> : 
     * <p>List all areas where machines are managed</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegionsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/instance/list_regions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API retrieves the list of areas where the current user has machines managed by SysOM. If the user has ECS instances in an area but those instances are not managed by SysOM, that area will not appear in the API response.</p>
     * 
     * <b>summary</b> : 
     * <p>List all areas where machines are managed</p>
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegionsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the history list of breakdown diagnosis jobs.</p>
     * 
     * @param request ListVmcoreDiagnosisTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVmcoreDiagnosisTaskResponse
     */
    public ListVmcoreDiagnosisTaskResponse listVmcoreDiagnosisTaskWithOptions(ListVmcoreDiagnosisTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.days)) {
            query.put("days", request.days);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVmcoreDiagnosisTask"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/crashAgent/diagnosis/queryTaskList"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVmcoreDiagnosisTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the history list of breakdown diagnosis jobs.</p>
     * 
     * @param request ListVmcoreDiagnosisTaskRequest
     * @return ListVmcoreDiagnosisTaskResponse
     */
    public ListVmcoreDiagnosisTaskResponse listVmcoreDiagnosisTask(ListVmcoreDiagnosisTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVmcoreDiagnosisTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Start an AI job analysis.</p>
     * 
     * @param request StartAIAnalysisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartAIAnalysisResponse
     */
    public StartAIAnalysisResponse startAIAnalysisWithOptions(StartAIAnalysisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysisTool)) {
            body.put("analysisTool", request.analysisTool);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.analysisParams)) {
            body.put("analysis_params", request.analysisParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comms)) {
            body.put("comms", request.comms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdBy)) {
            body.put("created_by", request.createdBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            body.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("instance_type", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iterationFunc)) {
            body.put("iteration_func", request.iterationFunc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iterationMod)) {
            body.put("iteration_mod", request.iterationMod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iterationRange)) {
            body.put("iteration_range", request.iterationRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pids)) {
            body.put("pids", request.pids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            body.put("uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAIAnalysis"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/proxy/post/start_ai_analysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartAIAnalysisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Start an AI job analysis.</p>
     * 
     * @param request StartAIAnalysisRequest
     * @return StartAIAnalysisResponse
     */
    public StartAIAnalysisResponse startAIAnalysis(StartAIAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAIAnalysisWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Currently, only comparative analysis between different steps under the same AI Infra analysis record and the same pid is supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Start AI Infra differential analysis.</p>
     * 
     * @param request StartAIDiffAnalysisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartAIDiffAnalysisResponse
     */
    public StartAIDiffAnalysisResponse startAIDiffAnalysisWithOptions(StartAIDiffAnalysisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.task1)) {
            body.put("task1", request.task1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.task2)) {
            body.put("task2", request.task2);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAIDiffAnalysis"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/appObserv/aiAnalysis/diffAnalysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartAIDiffAnalysisResponse());
    }

    /**
     * <b>description</b> :
     * <p>Currently, only comparative analysis between different steps under the same AI Infra analysis record and the same pid is supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Start AI Infra differential analysis.</p>
     * 
     * @param request StartAIDiffAnalysisRequest
     * @return StartAIDiffAnalysisResponse
     */
    public StartAIDiffAnalysisResponse startAIDiffAnalysis(StartAIDiffAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAIDiffAnalysisWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The API call to uninstall an Agent is asynchronous. After invoking this API, a task_id is returned. You can use this ID to invoke the GetAgentTask API to retrieve the execution status of the job.</p>
     * 
     * <b>summary</b> : 
     * <p>Uninstall a specified version of the widget</p>
     * 
     * @param request UninstallAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallAgentResponse
     */
    public UninstallAgentResponse uninstallAgentWithOptions(UninstallAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agent_id", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            body.put("agent_version", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallAgent"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/uninstall_agent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>The API call to uninstall an Agent is asynchronous. After invoking this API, a task_id is returned. You can use this ID to invoke the GetAgentTask API to retrieve the execution status of the job.</p>
     * 
     * <b>summary</b> : 
     * <p>Uninstall a specified version of the widget</p>
     * 
     * @param request UninstallAgentRequest
     * @return UninstallAgentResponse
     */
    public UninstallAgentResponse uninstallAgent(UninstallAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallAgentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uninstall a widget from a cluster</p>
     * 
     * @param request UninstallAgentForClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallAgentForClusterResponse
     */
    public UninstallAgentForClusterResponse uninstallAgentForClusterWithOptions(UninstallAgentForClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agent_id", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            body.put("agent_version", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("cluster_id", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallAgentForCluster"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/uninstall_agent_by_cluster"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallAgentForClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uninstall a widget from a cluster</p>
     * 
     * @param request UninstallAgentForClusterRequest
     * @return UninstallAgentForClusterResponse
     */
    public UninstallAgentForClusterResponse uninstallAgentForCluster(UninstallAgentForClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallAgentForClusterWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>、</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to update an alert contact.</p>
     * 
     * @param request UpdateAlertDestinationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAlertDestinationResponse
     */
    public UpdateAlertDestinationResponse updateAlertDestinationWithOptions(UpdateAlertDestinationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            body.put("target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAlertDestination"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/alertPusher/alert/updateDestination"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAlertDestinationResponse());
    }

    /**
     * <b>description</b> :
     * <p>、</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to update an alert contact.</p>
     * 
     * @param request UpdateAlertDestinationRequest
     * @return UpdateAlertDestinationResponse
     */
    public UpdateAlertDestinationResponse updateAlertDestination(UpdateAlertDestinationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAlertDestinationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>User updates the status of a push alert policy</p>
     * 
     * @param request UpdateAlertEnabledRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAlertEnabledResponse
     */
    public UpdateAlertEnabledResponse updateAlertEnabledWithOptions(UpdateAlertEnabledRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAlertEnabled"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/alertPusher/alert/updateEnabled"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAlertEnabledResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>User updates the status of a push alert policy</p>
     * 
     * @param request UpdateAlertEnabledRequest
     * @return UpdateAlertEnabledResponse
     */
    public UpdateAlertEnabledResponse updateAlertEnabled(UpdateAlertEnabledRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAlertEnabledWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update push alert policy</p>
     * 
     * @param request UpdateAlertStrategyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAlertStrategyResponse
     */
    public UpdateAlertStrategyResponse updateAlertStrategyWithOptions(UpdateAlertStrategyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.k8sLabel)) {
            body.put("k8sLabel", request.k8sLabel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategy)) {
            body.put("strategy", request.strategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAlertStrategy"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/alertPusher/alert/updateStrategy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAlertStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update push alert policy</p>
     * 
     * @param request UpdateAlertStrategyRequest
     * @return UpdateAlertStrategyResponse
     */
    public UpdateAlertStrategyResponse updateAlertStrategy(UpdateAlertStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAlertStrategyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update the follow level of an anomalous activity to adjust the sensitivity of the anomaly detection algorithm by modifying the follow level.</p>
     * 
     * @param request UpdateEventsAttentionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEventsAttentionResponse
     */
    public UpdateEventsAttentionResponse updateEventsAttentionWithOptions(UpdateEventsAttentionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.range)) {
            body.put("range", request.range);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEventsAttention"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/proxy/post/cluster_update_events_attention"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEventsAttentionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update the follow level of an anomalous activity to adjust the sensitivity of the anomaly detection algorithm by modifying the follow level.</p>
     * 
     * @param request UpdateEventsAttentionRequest
     * @return UpdateEventsAttentionResponse
     */
    public UpdateEventsAttentionResponse updateEventsAttention(UpdateEventsAttentionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEventsAttentionWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You must fill in the parameters according to the input parameters of the general LLM service, convert them to a string, and assign the result to <code>llmParamString</code>.  </li>
     * <li>To use the returned data, convert the string back to a dictionary, following the response format of the general LLM service.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Update the service function module configuration.</p>
     * 
     * @param tmpReq UpdateFuncSwitchRecordRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFuncSwitchRecordResponse
     */
    public UpdateFuncSwitchRecordResponse updateFuncSwitchRecordWithOptions(UpdateFuncSwitchRecordRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateFuncSwitchRecordShrinkRequest request = new UpdateFuncSwitchRecordShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "params", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            query.put("params", request.paramsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("service_name", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFuncSwitchRecord"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/func-switch/update-service-func-switch"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFuncSwitchRecordResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You must fill in the parameters according to the input parameters of the general LLM service, convert them to a string, and assign the result to <code>llmParamString</code>.  </li>
     * <li>To use the returned data, convert the string back to a dictionary, following the response format of the general LLM service.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Update the service function module configuration.</p>
     * 
     * @param request UpdateFuncSwitchRecordRequest
     * @return UpdateFuncSwitchRecordResponse
     */
    public UpdateFuncSwitchRecordResponse updateFuncSwitchRecord(UpdateFuncSwitchRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFuncSwitchRecordWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The API call to update the Agent is asynchronous. After invoking this API, a task_id is returned. You can use this ID to invoke the GetAgentTask API to retrieve the execution status of the job.</p>
     * 
     * <b>summary</b> : 
     * <p>Update the version of the installed widget to the specified version.</p>
     * 
     * @param request UpgradeAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeAgentResponse
     */
    public UpgradeAgentResponse upgradeAgentWithOptions(UpgradeAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agent_id", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            body.put("agent_version", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeAgent"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/upgrade_agent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>The API call to update the Agent is asynchronous. After invoking this API, a task_id is returned. You can use this ID to invoke the GetAgentTask API to retrieve the execution status of the job.</p>
     * 
     * <b>summary</b> : 
     * <p>Update the version of the installed widget to the specified version.</p>
     * 
     * @param request UpgradeAgentRequest
     * @return UpgradeAgentResponse
     */
    public UpgradeAgentResponse upgradeAgent(UpgradeAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeAgentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update widget for cluster</p>
     * 
     * @param request UpgradeAgentForClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeAgentForClusterResponse
     */
    public UpgradeAgentForClusterResponse upgradeAgentForClusterWithOptions(UpgradeAgentForClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agent_id", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            body.put("agent_version", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("cluster_id", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeAgentForCluster"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/upgrade_agent_by_cluster"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeAgentForClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update widget for cluster</p>
     * 
     * @param request UpgradeAgentForClusterRequest
     * @return UpgradeAgentForClusterResponse
     */
    public UpgradeAgentForClusterResponse upgradeAgentForCluster(UpgradeAgentForClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeAgentForClusterWithOptions(request, headers, runtime);
    }
}

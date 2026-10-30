// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230;

import com.aliyun.tea.*;
import com.aliyun.sysom20231230.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
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
     * <p>Notice: The diagnostics feature requires a service-linked role to be created under the Resource Access Management (RAM) user. Invoking this operation automatically checks whether the service-linked role exists and creates it if it does not. The RAM user that invokes this operation must have the ram:CreateServiceLinkedRole permission.</notice>
     * Note the following when you invoke this operation to authorize SysOM to diagnose ECS instances:</p>
     * </blockquote>
     * <ul>
     * <li>Each authorization is valid for 7 days. After 7 days, the authorization expires and you must invoke this operation again to re-authorize.</li>
     * <li>If the SysOM service-linked role (AliyunServiceRoleForSysom) does not exist when you invoke this operation, automatic creation is performed. The Resource Access Management (RAM) user that invokes this operation must have the <code>ram:CreateServiceLinkedRole</code> permission.</li>
     * <li>When you invoke this operation to authorize diagnostics on a specific instance, the label <code>sysom:diagnosis</code> is automatically associated with the target ECS instance. SysOM only allows diagnostics on instances that have this label.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Authorizes SysOM to diagnose ECS instances under the current account. You must call this operation to authorize diagnostics on a specific ECS instance before you can call the InvokeDiagnosis operation to initiate diagnostics on it.</p>
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
     * <p>Notice: The diagnostics feature requires a service-linked role to be created under the Resource Access Management (RAM) user. Invoking this operation automatically checks whether the service-linked role exists and creates it if it does not. The RAM user that invokes this operation must have the ram:CreateServiceLinkedRole permission.</notice>
     * Note the following when you invoke this operation to authorize SysOM to diagnose ECS instances:</p>
     * </blockquote>
     * <ul>
     * <li>Each authorization is valid for 7 days. After 7 days, the authorization expires and you must invoke this operation again to re-authorize.</li>
     * <li>If the SysOM service-linked role (AliyunServiceRoleForSysom) does not exist when you invoke this operation, automatic creation is performed. The Resource Access Management (RAM) user that invokes this operation must have the <code>ram:CreateServiceLinkedRole</code> permission.</li>
     * <li>When you invoke this operation to authorize diagnostics on a specific instance, the label <code>sysom:diagnosis</code> is automatically associated with the target ECS instance. SysOM only allows diagnostics on instances that have this label.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Authorizes SysOM to diagnose ECS instances under the current account. You must call this operation to authorize diagnostics on a specific ECS instance before you can call the InvokeDiagnosis operation to initiate diagnostics on it.</p>
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
     * <p>The instance list retrieved by this operation contains only machines managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether resources such as clusters and nodes support the current configuration.</p>
     * 
     * @param request CheckAgentConfigSupportedRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckAgentConfigSupportedResponse
     */
    public CheckAgentConfigSupportedResponse checkAgentConfigSupportedWithOptions(CheckAgentConfigSupportedRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkType)) {
            query.put("checkType", request.checkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusters)) {
            query.put("clusters", request.clusters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("configId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            query.put("instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckAgentConfigSupported"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/checkAgentConfigSupported"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckAgentConfigSupportedResponse());
    }

    /**
     * <b>description</b> :
     * <p>The instance list retrieved by this operation contains only machines managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether resources such as clusters and nodes support the current configuration.</p>
     * 
     * @param request CheckAgentConfigSupportedRequest
     * @return CheckAgentConfigSupportedResponse
     */
    public CheckAgentConfigSupportedResponse checkAgentConfigSupported(CheckAgentConfigSupportedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkAgentConfigSupportedWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The instance list returned by this operation contains only instances that are already managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether target instances are supported by SysOM.</p>
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
     * <p>The instance list returned by this operation contains only instances that are already managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether target instances are supported by SysOM.</p>
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
     * <p>Invokes the CPU high agent streaming SSE interface.</p>
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
     * <p>Invokes the CPU high agent streaming SSE interface.</p>
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
     * <p>Creates a component configuration.</p>
     * 
     * @param request CreateAgentConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentConfigResponse
     */
    public CreateAgentConfigResponse createAgentConfigWithOptions(CreateAgentConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configName)) {
            body.put("configName", request.configName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgentConfig"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/createAgentConfig"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a component configuration.</p>
     * 
     * @param request CreateAgentConfigRequest
     * @return CreateAgentConfigResponse
     */
    public CreateAgentConfigResponse createAgentConfig(CreateAgentConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAgentConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a contact for alert notifications.</p>
     * 
     * @param request CreateAlertDestinationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAlertDestinationResponse
     */
    public CreateAlertDestinationResponse createAlertDestinationWithOptions(CreateAlertDestinationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("app_id", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSecret)) {
            body.put("app_secret", request.appSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("group_id", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imbot)) {
            body.put("imbot", request.imbot);
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
     * <p>Creates a contact for alert notifications.</p>
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
     * <p>Creates an alert push policy.</p>
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
     * <p>Creates an alert push policy.</p>
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
     * <li>Use this operation together with the call_sseapi operation in the aliyun-tea-openapi-inner package.</li>
     * <li>Populate the parameters based on the input parameters of the general LLM service, convert them to a string, and assign the string to llmParamString.</li>
     * <li>Convert the returned string to a dictionary before use. Refer to the response format of the general LLM service.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a VPC endpoint connection for a cluster.</p>
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
     * <li>Use this operation together with the call_sseapi operation in the aliyun-tea-openapi-inner package.</li>
     * <li>Populate the parameters based on the input parameters of the general LLM service, convert them to a string, and assign the string to llmParamString.</li>
     * <li>Convert the returned string to a dictionary before use. Refer to the response format of the general LLM service.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a VPC endpoint connection for a cluster.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>本接口仅创建会话，不发送消息，也不触发 Agent 执行。</li>
     * <li>创建成功后，使用返回的 sessionId 调用 GenerateCopilotStreamResponse 发送消息。</li>
     * <li>会话 ID 由服务端生成，不支持调用方指定。</li>
     * <li>每次成功调用均创建一个独立会话。本接口不提供客户端幂等参数，重复调用可能创建多个会话。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建 Copilot 会话</p>
     * 
     * @param request CreateCopilotSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCopilotSessionResponse
     */
    public CreateCopilotSessionResponse createCopilotSessionWithOptions(CreateCopilotSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCopilotSession"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/copilot/sessions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCopilotSessionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>本接口仅创建会话，不发送消息，也不触发 Agent 执行。</li>
     * <li>创建成功后，使用返回的 sessionId 调用 GenerateCopilotStreamResponse 发送消息。</li>
     * <li>会话 ID 由服务端生成，不支持调用方指定。</li>
     * <li>每次成功调用均创建一个独立会话。本接口不提供客户端幂等参数，重复调用可能创建多个会话。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建 Copilot 会话</p>
     * 
     * @param request CreateCopilotSessionRequest
     * @return CreateCopilotSessionResponse
     */
    public CreateCopilotSessionResponse createCopilotSession(CreateCopilotSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCopilotSessionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a SysOM instance inspection.</p>
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
     * <p>Creates a SysOM instance inspection.</p>
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
     * <p>Creates an intelligent breakdown diagnostic node to diagnose the vmcore or dmesg log file specified in the input parameters.</p>
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
     * <p>Creates an intelligent breakdown diagnostic node to diagnose the vmcore or dmesg log file specified in the input parameters.</p>
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
     * <p>Deletes a component configuration.</p>
     * 
     * @param request DeleteAgentConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentConfigResponse
     */
    public DeleteAgentConfigResponse deleteAgentConfigWithOptions(DeleteAgentConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("configId", request.configId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgentConfig"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/deleteAgentConfig"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a component configuration.</p>
     * 
     * @param request DeleteAgentConfigRequest
     * @return DeleteAgentConfigResponse
     */
    public DeleteAgentConfigResponse deleteAgentConfig(DeleteAgentConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert contact.</p>
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
     * <p>Deletes an alert contact.</p>
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
     * <p>Deletes an alert policy for push alerting.</p>
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
     * <p>Deletes an alert policy for push alerting.</p>
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
     * <ul>
     * <li>仅支持删除当前用户的会话。</li>
     * <li>会话存在尚未结束的执行时，不允许删除。请先通过 GenerateCopilotStreamResponse 接口发送 action=stop，确认执行结束后再删除。</li>
     * <li>删除后，无法再通过会话查询接口获取该会话及其历史记录。</li>
     * <li>会话不存在或不属于当前用户时返回错误。重复删除同一个会话不保证成功。</li>
     * <li>删除会话不会撤销已经执行的操作，也不会删除产生该会话的定时任务。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除指定的 Copilot 会话</p>
     * 
     * @param request DeleteCopilotSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCopilotSessionResponse
     */
    public DeleteCopilotSessionResponse deleteCopilotSessionWithOptions(DeleteCopilotSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCopilotSession"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/copilot/delete-session"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCopilotSessionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>仅支持删除当前用户的会话。</li>
     * <li>会话存在尚未结束的执行时，不允许删除。请先通过 GenerateCopilotStreamResponse 接口发送 action=stop，确认执行结束后再删除。</li>
     * <li>删除后，无法再通过会话查询接口获取该会话及其历史记录。</li>
     * <li>会话不存在或不属于当前用户时返回错误。重复删除同一个会话不保证成功。</li>
     * <li>删除会话不会撤销已经执行的操作，也不会删除产生该会话的定时任务。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除指定的 Copilot 会话</p>
     * 
     * @param request DeleteCopilotSessionRequest
     * @return DeleteCopilotSessionResponse
     */
    public DeleteCopilotSessionResponse deleteCopilotSession(DeleteCopilotSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCopilotSessionWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The instance list returned by this operation contains only machines that are managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries metric data.</p>
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
     * <p>The instance list returned by this operation contains only machines that are managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries metric data.</p>
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
     * <li>Populate parameters according to the standard LLM service input parameters, convert them to a string, and assign the string to llmParamString.</li>
     * <li>Convert the returned data from a string to a dict before use. Refer to the standard LLM service response format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the response result from the Copilot service.</p>
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
     * <li>Populate parameters according to the standard LLM service input parameters, convert them to a string, and assign the string to llmParamString.</li>
     * <li>Convert the returned data from a string to a dict before use. Refer to the standard LLM service response format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the response result from the Copilot service.</p>
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
     * <li>Use this operation together with the call_sseapi interface in the aliyun-tea-openapi-inner package.</li>
     * <li>Populate the parameters based on the standard LLM service input parameters, convert them to a string, and assign the string to llmParamString.</li>
     * <li>Convert the returned string data to a dict before use. Refer to the standard LLM service response format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Provides a streaming SSE interface for the OS Copilot service.</p>
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
     * <li>Use this operation together with the call_sseapi interface in the aliyun-tea-openapi-inner package.</li>
     * <li>Populate the parameters based on the standard LLM service input parameters, convert them to a string, and assign the string to llmParamString.</li>
     * <li>Convert the returned string data to a dict before use. Refer to the standard LLM service response format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Provides a streaming SSE interface for the OS Copilot service.</p>
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
     * <p>Queries AI Infra analysis results.</p>
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
     * <p>Queries AI Infra analysis results.</p>
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
     * <p>Retrieves the number of unprocessed (undiagnosed) abnormal events at different severity levels for a node or pod.</p>
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
     * <p>Retrieves the number of unprocessed (undiagnosed) abnormal events at different severity levels for a node or pod.</p>
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
     * <p>Retrieves the details of a specific component.</p>
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
     * <p>Retrieves the details of a specific component.</p>
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
     * <p>Retrieves the component configuration.</p>
     * 
     * @param request GetAgentConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentConfigResponse
     */
    public GetAgentConfigResponse getAgentConfigWithOptions(GetAgentConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("configId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configName)) {
            query.put("configName", request.configName);
        }

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
            new TeaPair("action", "GetAgentConfig"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/getAgentConfig"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the component configuration.</p>
     * 
     * @param request GetAgentConfigRequest
     * @return GetAgentConfigResponse
     */
    public GetAgentConfigResponse getAgentConfig(GetAgentConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the execution status of an agent installation task.</p>
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
     * <p>Retrieves the execution status of an agent installation task.</p>
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
     * <b>description</b> :
     * <p>The diagnostic process is asynchronous. Therefore, when you call this operation, the diagnosis may still be in progress. You can check the <code>data.status</code> field in the response to determine the status. If <code>data.status</code> is <code>Success</code>, the diagnosis is successful, and you can read the diagnostic results from <code>data.result</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the diagnostic results.</p>
     * 
     * @param request GetAifgResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAifgResultResponse
     */
    public GetAifgResultResponse getAifgResultWithOptions(GetAifgResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetAifgResult"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aifg/getAifgResult"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAifgResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>The diagnostic process is asynchronous. Therefore, when you call this operation, the diagnosis may still be in progress. You can check the <code>data.status</code> field in the response to determine the status. If <code>data.status</code> is <code>Success</code>, the diagnosis is successful, and you can read the diagnostic results from <code>data.result</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the diagnostic results.</p>
     * 
     * @param request GetAifgResultRequest
     * @return GetAifgResultResponse
     */
    public GetAifgResultResponse getAifgResult(GetAifgResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAifgResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The diagnostic process is asynchronous. Therefore, when you call this operation, the diagnosis may still be in progress. You can check the <code>data.status</code> field in the response to determine the status. If <code>data.status</code> is <code>Success</code>, the diagnosis is successful, and you can read the diagnostic results from <code>data.result</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the URL for diagnostic results.</p>
     * 
     * @param request GetAifgUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAifgUrlResponse
     */
    public GetAifgUrlResponse getAifgUrlWithOptions(GetAifgUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetAifgUrl"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aifg/getAifgUrl"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAifgUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>The diagnostic process is asynchronous. Therefore, when you call this operation, the diagnosis may still be in progress. You can check the <code>data.status</code> field in the response to determine the status. If <code>data.status</code> is <code>Success</code>, the diagnosis is successful, and you can read the diagnostic results from <code>data.result</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the URL for diagnostic results.</p>
     * 
     * @param request GetAifgUrlRequest
     * @return GetAifgUrlResponse
     */
    public GetAifgUrlResponse getAifgUrl(GetAifgUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAifgUrlWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the information of a specified alert contact.</p>
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
     * <p>Retrieves the information of a specified alert contact.</p>
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
     * <p>Retrieves an alert policy for a user based on the policy ID.</p>
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
     * <p>Retrieves an alert policy for a user based on the policy ID.</p>
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
     * <p>Retrieves configuration information by configuration name.</p>
     * 
     * @param request GetConfigByNameRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConfigByNameResponse
     */
    public GetConfigByNameResponse getConfigByNameWithOptions(GetConfigByNameRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configName)) {
            query.put("configName", request.configName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configType)) {
            query.put("configType", request.configType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("entityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useGlobalUid)) {
            query.put("useGlobalUid", request.useGlobalUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConfigByName"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/configManage/config/getConfigByName"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConfigByNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves configuration information by configuration name.</p>
     * 
     * @param request GetConfigByNameRequest
     * @return GetConfigByNameResponse
     */
    public GetConfigByNameResponse getConfigByName(GetConfigByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConfigByNameWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the historical chat records of Copilot.</p>
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
     * <p>Retrieves the historical chat records of Copilot.</p>
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
     * <ul>
     * <li>仅支持查询当前用户的会话，一次查询一个会话。</li>
     * <li>返回会话详情及执行摘要，不返回聊天内容。查询历史消息和事件，请调用 ListCopilotSessionMessages。</li>
     * <li>会话的 status 表示是否归档。判断是否正在执行，应读取 activeTurn。</li>
     * <li>lastTurn 表示最近一次执行，不一定已经结束；执行过程中，activeTurn 和 lastTurn 可以指向同一轮执行。</li>
     * <li>会话不存在、已删除或不属于当前用户时返回错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>获取 Copilot 会话与执行状态</p>
     * 
     * @param request GetCopilotSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCopilotSessionResponse
     */
    public GetCopilotSessionResponse getCopilotSessionWithOptions(String sessionId, GetCopilotSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCopilotSession"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/copilot/sessions/" + com.aliyun.openapiutil.Client.getEncodeParam(sessionId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCopilotSessionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>仅支持查询当前用户的会话，一次查询一个会话。</li>
     * <li>返回会话详情及执行摘要，不返回聊天内容。查询历史消息和事件，请调用 ListCopilotSessionMessages。</li>
     * <li>会话的 status 表示是否归档。判断是否正在执行，应读取 activeTurn。</li>
     * <li>lastTurn 表示最近一次执行，不一定已经结束；执行过程中，activeTurn 和 lastTurn 可以指向同一轮执行。</li>
     * <li>会话不存在、已删除或不属于当前用户时返回错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>获取 Copilot 会话与执行状态</p>
     * 
     * @param request GetCopilotSessionRequest
     * @return GetCopilotSessionResponse
     */
    public GetCopilotSessionResponse getCopilotSession(String sessionId, GetCopilotSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCopilotSessionWithOptions(sessionId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries published hotfixes in batches by CVE ID. You can filter the results by full kernel version.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the hotfixes and compatible packages for a CVE.</p>
     * 
     * @param request GetCveHotfixRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCveHotfixResponse
     */
    public GetCveHotfixResponse getCveHotfixWithOptions(GetCveHotfixRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cveIds)) {
            body.put("cveIds", request.cveIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kernelVersions)) {
            body.put("kernelVersions", request.kernelVersions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCveHotfix"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/hotfixManager/hotfixes/cve"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCveHotfixResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries published hotfixes in batches by CVE ID. You can filter the results by full kernel version.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the hotfixes and compatible packages for a CVE.</p>
     * 
     * @param request GetCveHotfixRequest
     * @return GetCveHotfixResponse
     */
    public GetCveHotfixResponse getCveHotfix(GetCveHotfixRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCveHotfixWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The diagnostic process is asynchronous. When you call this operation, the diagnosis may still be running. You can check the <code>data.status</code> field in the response to determine the status. When <code>data.status == Success</code>, the diagnosis is complete and you can read the diagnostic results from <code>data.result</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves diagnostic results.</p>
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
     * <p>The diagnostic process is asynchronous. When you call this operation, the diagnosis may still be running. You can check the <code>data.status</code> field in the response to determine the status. When <code>data.status == Success</code>, the diagnosis is complete and you can read the diagnostic results from <code>data.result</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves diagnostic results.</p>
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
     * <b>description</b> :
     * <p>After you install the component for the target ACK cluster:</p>
     * <ol>
     * <li>When the cluster is managed for the first time, the component is installed on all ECS instances currently in the cluster. If the cluster has more than 50 nodes, only 50 nodes are installed in the first batch.</li>
     * <li>The operating system console periodically checks the scaling status of the managed cluster. When a new ECS instance is added to the cluster, the operating system console automatically installs the component on the instance without user intervention.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of parameters for a GPU cluster.</p>
     * 
     * @param request GetGpuClusterArgsOptionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGpuClusterArgsOptionsResponse
     */
    public GetGpuClusterArgsOptionsResponse getGpuClusterArgsOptionsWithOptions(GetGpuClusterArgsOptionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterType)) {
            query.put("filterType", request.filterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterValues)) {
            query.put("filterValues", request.filterValues);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGpuClusterArgsOptions"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiTopology/topology/listClusterTopologyOptions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGpuClusterArgsOptionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you install the component for the target ACK cluster:</p>
     * <ol>
     * <li>When the cluster is managed for the first time, the component is installed on all ECS instances currently in the cluster. If the cluster has more than 50 nodes, only 50 nodes are installed in the first batch.</li>
     * <li>The operating system console periodically checks the scaling status of the managed cluster. When a new ECS instance is added to the cluster, the operating system console automatically installs the component on the instance without user intervention.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of parameters for a GPU cluster.</p>
     * 
     * @param request GetGpuClusterArgsOptionsRequest
     * @return GetGpuClusterArgsOptionsResponse
     */
    public GetGpuClusterArgsOptionsResponse getGpuClusterArgsOptions(GetGpuClusterArgsOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGpuClusterArgsOptionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you install the component for the target ACK cluster:</p>
     * <ol>
     * <li>When the cluster is managed for the first time, the component is installed on all ECS instances currently in the cluster. If the cluster has more than 50 nodes, only 50 nodes are installed in the first batch.</li>
     * <li>The operating system console periodically checks the scaling status of the managed cluster. When a new ECS instance is added to the cluster, the operating system console automatically installs the component on it without user intervention.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of GPU cluster alerts.</p>
     * 
     * @param request GetGpuClusterListAlarmRecordRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGpuClusterListAlarmRecordResponse
     */
    public GetGpuClusterListAlarmRecordResponse getGpuClusterListAlarmRecordWithOptions(GetGpuClusterListAlarmRecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmCluster)) {
            query.put("alarmCluster", request.alarmCluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmExtInfo)) {
            query.put("alarmExtInfo", request.alarmExtInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmTask)) {
            query.put("alarmTask", request.alarmTask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmTime)) {
            query.put("alarmTime", request.alarmTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmType)) {
            query.put("alarmType", request.alarmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGpuClusterListAlarmRecord"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiTopology/topology/listAlarmRecord"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGpuClusterListAlarmRecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you install the component for the target ACK cluster:</p>
     * <ol>
     * <li>When the cluster is managed for the first time, the component is installed on all ECS instances currently in the cluster. If the cluster has more than 50 nodes, only 50 nodes are installed in the first batch.</li>
     * <li>The operating system console periodically checks the scaling status of the managed cluster. When a new ECS instance is added to the cluster, the operating system console automatically installs the component on it without user intervention.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of GPU cluster alerts.</p>
     * 
     * @param request GetGpuClusterListAlarmRecordRequest
     * @return GetGpuClusterListAlarmRecordResponse
     */
    public GetGpuClusterListAlarmRecordResponse getGpuClusterListAlarmRecord(GetGpuClusterListAlarmRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGpuClusterListAlarmRecordWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you install the component for the target ACK cluster:</p>
     * <ol>
     * <li>When the cluster is initially managed, the component is installed on all ECS instances currently in the cluster. If the cluster has more than 50 nodes, only 50 nodes are installed in the first batch.</li>
     * <li>The operating system console periodically checks the scaling status of the managed cluster. When a new ECS instance is added to the cluster, the operating system console automatically installs the component on the instance without user intervention.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the topology of a GPU cluster.</p>
     * 
     * @param request GetGpuClusterTopologyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGpuClusterTopologyResponse
     */
    public GetGpuClusterTopologyResponse getGpuClusterTopologyWithOptions(GetGpuClusterTopologyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("channelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("clusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.communicationId)) {
            query.put("communicationId", request.communicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdList)) {
            query.put("instanceIdList", request.instanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.podList)) {
            query.put("podList", request.podList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIdList)) {
            query.put("taskIdList", request.taskIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topoType)) {
            query.put("topoType", request.topoType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGpuClusterTopology"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiTopology/topology/clusterTopology"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGpuClusterTopologyResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you install the component for the target ACK cluster:</p>
     * <ol>
     * <li>When the cluster is initially managed, the component is installed on all ECS instances currently in the cluster. If the cluster has more than 50 nodes, only 50 nodes are installed in the first batch.</li>
     * <li>The operating system console periodically checks the scaling status of the managed cluster. When a new ECS instance is added to the cluster, the operating system console automatically installs the component on the instance without user intervention.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the topology of a GPU cluster.</p>
     * 
     * @param request GetGpuClusterTopologyRequest
     * @return GetGpuClusterTopologyResponse
     */
    public GetGpuClusterTopologyResponse getGpuClusterTopology(GetGpuClusterTopologyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGpuClusterTopologyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the health status distribution of nodes or pods over a specified time period.</p>
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
     * <p>Retrieves the health status distribution of nodes or pods over a specified time period.</p>
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
     * <p>Retrieves the number of nodes or node Pods in a cluster.</p>
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
     * <p>Retrieves the number of nodes or node Pods in a cluster.</p>
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
     * <p>Retrieves the list of a specific field under an instance.</p>
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
     * <p>Retrieves the list of a specific field under an instance.</p>
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
     * <b>description</b> :
     * <p>The hotfix task process is asynchronous. When you call this operation, the task may still be running. You can check the <code>data.status</code> field in the response to determine the task status. If <code>data.status</code> is <code>Success</code>, the task succeeded, and you can obtain the task result from the <code>data.result</code> field.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of an asynchronous CVE hotfix task.</p>
     * 
     * @param request GetHotfixTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotfixTaskResponse
     */
    public GetHotfixTaskResponse getHotfixTaskWithOptions(GetHotfixTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetHotfixTask"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/hotfix_manager/task/get"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotfixTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>The hotfix task process is asynchronous. When you call this operation, the task may still be running. You can check the <code>data.status</code> field in the response to determine the task status. If <code>data.status</code> is <code>Success</code>, the task succeeded, and you can obtain the task result from the <code>data.result</code> field.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of an asynchronous CVE hotfix task.</p>
     * 
     * @param request GetHotfixTaskRequest
     * @return GetHotfixTaskResponse
     */
    public GetHotfixTaskResponse getHotfixTask(GetHotfixTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHotfixTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves hot spot analysis results.</p>
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
     * <p>Retrieves hot spot analysis results.</p>
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
     * <p>Retrieves the results of a hot spot comparison trace.</p>
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
     * <p>Retrieves the results of a hot spot comparison trace.</p>
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
     * <p>Retrieves the list of hot spot instances.</p>
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
     * <p>Retrieves the list of hot spot instances.</p>
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
     * <p>Retrieves the PID list of a specified instance.</p>
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
     * <p>Retrieves the PID list of a specified instance.</p>
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
     * <p>Retrieves hot spot tracking results.</p>
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
     * <p>Retrieves hot spot tracking results.</p>
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
     * <p>Retrieves a SysOM inspection report.</p>
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
     * <p>Retrieves a SysOM inspection report.</p>
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
     * <p>Retrieves the real-time health score of a cluster or node.</p>
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
     * <p>Retrieves the real-time health score of a cluster or node.</p>
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
     * <b>description</b> :
     * <p>After you install components for the target ACK cluster:</p>
     * <ol>
     * <li>When the cluster is managed for the first time, the system installs components on all Elastic Compute Service (ECS) instances in the cluster. If the cluster has more than 50 nodes, only 50 nodes are installed in the first batch.</li>
     * <li>The Operating System console periodically checks the scaling status of the managed cluster. When a new ECS instance is added to the cluster, the Operating System console automatically installs components without user intervention.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of GPU clusters.</p>
     * 
     * @param request GetListGpuClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetListGpuClusterResponse
     */
    public GetListGpuClusterResponse getListGpuClusterWithOptions(GetListGpuClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRegion)) {
            query.put("timeRegion", request.timeRegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetListGpuCluster"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiTopology/topology/listCluster"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetListGpuClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you install components for the target ACK cluster:</p>
     * <ol>
     * <li>When the cluster is managed for the first time, the system installs components on all Elastic Compute Service (ECS) instances in the cluster. If the cluster has more than 50 nodes, only 50 nodes are installed in the first batch.</li>
     * <li>The Operating System console periodically checks the scaling status of the managed cluster. When a new ECS instance is added to the cluster, the Operating System console automatically installs components without user intervention.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of GPU clusters.</p>
     * 
     * @param request GetListGpuClusterRequest
     * @return GetListGpuClusterResponse
     */
    public GetListGpuClusterResponse getListGpuCluster(GetListGpuClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getListGpuClusterWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of AI Infra analysis records.</p>
     * 
     * @param request GetListRecordRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetListRecordResponse
     */
    public GetListRecordResponse getListRecordWithOptions(GetListRecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysisId)) {
            query.put("analysisId", request.analysisId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customId)) {
            query.put("customId", request.customId);
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
     * <p>Retrieves a list of AI Infra analysis records.</p>
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
     * <p>Retrieves the proportion of anomaly issues for nodes in a cluster or pods in a node within a specified time range.</p>
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
     * <p>Retrieves the proportion of anomaly issues for nodes in a cluster or pods in a node within a specified time range.</p>
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
     * <p>Retrieves the health score trend.</p>
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
     * <p>Retrieves the health score trend.</p>
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
     * <p>Retrieves the real-time resource usage of a cluster or node.</p>
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
     * <p>Retrieves the real-time resource usage of a cluster or node.</p>
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
     * <p>Retrieves the service configuration status.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the configuration of a feature module.</p>
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
     * <p>Retrieves the service configuration status.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the configuration of a feature module.</p>
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
     * <p>Queries the execution status and diagnostic result of a diagnostic task by task ID.</p>
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
     * <p>Queries the execution status and diagnostic result of a diagnostic task by task ID.</p>
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
     * <p>Some SysOM API operations require role assumption based on the <code>AliyunServiceRoleForSysom</code> service-linked role. Before using SysOM features, invoke this operation to perform initialization and ensure that the service-linked role has been created.</p>
     * <ul>
     * <li><code>check_only</code>: If this parameter is set to True, only a check is performed to determine whether the service-linked role exists. The service-linked role is not created. If this parameter is set to False or left empty, automatic creation of the service-linked role is performed if it does not exist.<blockquote>
     * <p>Note: When you call this operation to initialize the role, you agree to the user agreement of the operating system console by default. For more information, see <a href="https://www.alibabacloud.com/help/en/alinux/product-overview/os-console-overview">Operating system console overview</a> and <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202001091714_51956.html">Alibaba Cloud Service Trial Terms</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initializes SysOM to ensure that the service-linked role exists.</p>
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
     * <p>Some SysOM API operations require role assumption based on the <code>AliyunServiceRoleForSysom</code> service-linked role. Before using SysOM features, invoke this operation to perform initialization and ensure that the service-linked role has been created.</p>
     * <ul>
     * <li><code>check_only</code>: If this parameter is set to True, only a check is performed to determine whether the service-linked role exists. The service-linked role is not created. If this parameter is set to False or left empty, automatic creation of the service-linked role is performed if it does not exist.<blockquote>
     * <p>Note: When you call this operation to initialize the role, you agree to the user agreement of the operating system console by default. For more information, see <a href="https://www.alibabacloud.com/help/en/alinux/product-overview/os-console-overview">Operating system console overview</a> and <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202001091714_51956.html">Alibaba Cloud Service Trial Terms</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initializes SysOM to ensure that the service-linked role exists.</p>
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
     * <p>Calling this operation to install an agent is asynchronous. After you call this operation, a task_id is returned. You can use this ID to call the GetAgentTask operation to query the task execution status.</p>
     * 
     * <b>summary</b> : 
     * <p>Installs an agent on a specified instance.</p>
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
     * <p>Calling this operation to install an agent is asynchronous. After you call this operation, a task_id is returned. You can use this ID to call the GetAgentTask operation to query the task execution status.</p>
     * 
     * <b>summary</b> : 
     * <p>Installs an agent on a specified instance.</p>
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
     * <p>After you install a component on the target ACK cluster:</p>
     * <ol>
     * <li>First, when the cluster is managed for the first time, the component is installed on all existing ECS instances in the cluster. If the cluster contains more than 50 nodes, only 50 instances are included in the first batch.</li>
     * <li>Then, the operating system console periodically checks the scaling status of the managed cluster. When a new ECS instance is added to the cluster, the operating system console automatically installs the component on the instance without user intervention.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Installs a component on an ACK cluster.</p>
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
     * <p>After you install a component on the target ACK cluster:</p>
     * <ol>
     * <li>First, when the cluster is managed for the first time, the component is installed on all existing ECS instances in the cluster. If the cluster contains more than 50 nodes, only 50 instances are included in the first batch.</li>
     * <li>Then, the operating system console periodically checks the scaling status of the managed cluster. When a new ECS instance is added to the cluster, the operating system console automatically installs the component on the instance without user intervention.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Installs a component on an ACK cluster.</p>
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
     * <b>description</b> :
     * <p>Calling this operation to install an Agent is asynchronous. After the call, a task_id is returned. You can use this ID to call the GetAgentTask operation to check the task execution status.</p>
     * 
     * <b>summary</b> : 
     * <p>Installs an Agent on a specified instance.</p>
     * 
     * @param request InstallAgentWithTypeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallAgentWithTypeResponse
     */
    public InstallAgentWithTypeResponse installAgentWithTypeWithOptions(InstallAgentWithTypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            body.put("agentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            body.put("configId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("instanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallAgentWithType"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/installAgent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallAgentWithTypeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation to install an Agent is asynchronous. After the call, a task_id is returned. You can use this ID to call the GetAgentTask operation to check the task execution status.</p>
     * 
     * <b>summary</b> : 
     * <p>Installs an Agent on a specified instance.</p>
     * 
     * @param request InstallAgentWithTypeRequest
     * @return InstallAgentWithTypeResponse
     */
    public InstallAgentWithTypeResponse installAgentWithType(InstallAgentWithTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installAgentWithTypeWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation to install hotfixes is asynchronous. After the operation is called, a task_id is returned. You can use this ID to call the GetHotfixTask operation to query the execution status of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Installs CVE hotfixes asynchronously on the specified instances.</p>
     * 
     * @param request InstallHotfixRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallHotfixResponse
     */
    public InstallHotfixResponse installHotfixWithOptions(InstallHotfixRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cveId)) {
            body.put("cveId", request.cveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallHotfix"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/hotfix_manager/hotfix/install"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallHotfixResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation to install hotfixes is asynchronous. After the operation is called, a task_id is returned. You can use this ID to call the GetHotfixTask operation to query the execution status of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Installs CVE hotfixes asynchronously on the specified instances.</p>
     * 
     * @param request InstallHotfixRequest
     * @return InstallHotfixResponse
     */
    public InstallHotfixResponse installHotfix(InstallHotfixRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installHotfixWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Initiates an anomaly diagnosis.</p>
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
     * <p>Initiates an anomaly diagnosis.</p>
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
     * <p>The following requirements must be met to diagnose a target ECS instance:</p>
     * <ul>
     * <li>The target ECS instance status must be Running.</li>
     * <li>Cloud Assistant must be installed on the target ECS instance. If it is not installed, refer to <a href="https://www.alibabacloud.com/help/en/ecs/user-guide/install-the-cloud-assistant-agent">Install the Cloud Assistant Agent</a> for installation.</li>
     * <li>You must invoke the AuthDiagnosis operation to authorize SysOM to diagnose the target ECS instance. If authorization is not granted, this operation directly fails.</li>
     * <li>This operation depends on the SysOM service-linked role (AliyunServiceRoleForSysom) being created. This operation does not automatically create the service-linked role. If the service-linked role does not exist, first invoke AuthDiagnosis to associate the authorization. That operation creates the aforementioned service-linked role.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates a diagnostic task.</p>
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
     * <p>The following requirements must be met to diagnose a target ECS instance:</p>
     * <ul>
     * <li>The target ECS instance status must be Running.</li>
     * <li>Cloud Assistant must be installed on the target ECS instance. If it is not installed, refer to <a href="https://www.alibabacloud.com/help/en/ecs/user-guide/install-the-cloud-assistant-agent">Install the Cloud Assistant Agent</a> for installation.</li>
     * <li>You must invoke the AuthDiagnosis operation to authorize SysOM to diagnose the target ECS instance. If authorization is not granted, this operation directly fails.</li>
     * <li>This operation depends on the SysOM service-linked role (AliyunServiceRoleForSysom) being created. This operation does not automatically create the service-linked role. If the service-linked role does not exist, first invoke AuthDiagnosis to associate the authorization. That operation creates the aforementioned service-linked role.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates a diagnostic task.</p>
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
     * <p>Retrieves anomaly event information for a cluster, node, or pod within a specified time range.</p>
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
     * <p>Retrieves anomaly event information for a cluster, node, or pod within a specified time range.</p>
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
     * <p>Lists the installation records of an Agent.</p>
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
     * <p>Lists the installation records of an Agent.</p>
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
     * <p>Retrieves a list of Agents.</p>
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
     * <p>Retrieves a list of Agents.</p>
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
     * <b>description</b> :
     * <p>This operation retrieves the list of regions where the current user has machines managed by SysOM. If a user has ECS instances in a region but they are not managed by SysOM, the region will not appear in the API response.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of diagnostic tasks.</p>
     * 
     * @param request ListAifgJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAifgJobsResponse
     */
    public ListAifgJobsResponse listAifgJobsWithOptions(ListAifgJobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
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

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAifgJobs"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aifg/listAifgJobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAifgJobsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation retrieves the list of regions where the current user has machines managed by SysOM. If a user has ECS instances in a region but they are not managed by SysOM, the region will not appear in the API response.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of diagnostic tasks.</p>
     * 
     * @param request ListAifgJobsRequest
     * @return ListAifgJobsResponse
     */
    public ListAifgJobsResponse listAifgJobs(ListAifgJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAifgJobsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of alert contacts.</p>
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
     * <p>Retrieves a list of alert contacts.</p>
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
     * <p>Retrieves all alert metrics.</p>
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
     * <p>Retrieves all alert metrics.</p>
     * @return ListAlertItemsResponse
     */
    public ListAlertItemsResponse listAlertItems() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlertItemsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves all alert notification policies for the user.</p>
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
     * <p>Retrieves all alert notification policies for the user.</p>
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
     * <p>Queries a list of managed and unmanaged instances along with their details.</p>
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
     * <p>Queries a list of managed and unmanaged instances along with their details.</p>
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
     * <p>Retrieves the installation records of cluster components.</p>
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
     * <p>Retrieves the installation records of cluster components.</p>
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
     * <p>Retrieves all managed clusters for the current user.</p>
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
     * <p>Retrieves all managed clusters for the current user.</p>
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
     * <p>Retrieves a list of diagnostic history records.</p>
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
     * <p>Retrieves a list of diagnostic history records.</p>
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
     * <p>Retrieves the health status list of cluster nodes or pods within a specified time range.</p>
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
     * <p>Retrieves the health status list of cluster nodes or pods within a specified time range.</p>
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
     * <b>summary</b> : 
     * <p>Retrieves all values of a specific type of instance information.</p>
     * 
     * @param request ListInstanceInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceInfoResponse
     */
    public ListInstanceInfoResponse listInstanceInfoWithOptions(ListInstanceInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.infoType)) {
            query.put("infoType", request.infoType);
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
            new TeaPair("action", "ListInstanceInfo"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/instance/listInstanceInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves all values of a specific type of instance information.</p>
     * 
     * @param request ListInstanceInfoRequest
     * @return ListInstanceInfoResponse
     */
    public ListInstanceInfoResponse listInstanceInfo(ListInstanceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the list of machines managed by SysOM.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the instance status.</p>
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
     * <p>Retrieves the list of machines managed by SysOM.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the instance status.</p>
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
     * <p>This operation retrieves the list of instances that are already managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of managed instances.</p>
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
     * <p>This operation retrieves the list of instances that are already managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of managed instances.</p>
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
     * <p>The instance list retrieved by this operation contains only machines that are managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves ECS information lists for instances, such as tag lists and public IP address lists.</p>
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
     * <p>The instance list retrieved by this operation contains only machines that are managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves ECS information lists for instances, such as tag lists and public IP address lists.</p>
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
     * <p>The instance list returned by this operation contains only machines that are managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information about managed and unmanaged instances, including ECS information.</p>
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
     * <p>The instance list returned by this operation contains only machines that are managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information about managed and unmanaged instances, including ECS information.</p>
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
     * <p>The instance list retrieved by this operation contains only machines that are managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of instances for plug-in installation, update, or uninstallation.</p>
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
     * <p>The instance list retrieved by this operation contains only machines that are managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of instances for plug-in installation, update, or uninstallation.</p>
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
     * <p>Retrieves the list of pods in a cluster or instance.</p>
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
     * <p>Retrieves the list of pods in a cluster or instance.</p>
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
     * <p>This operation retrieves the list of regions where the current user has instances managed by SysOM. If you have ECS instances in a region but they are not managed by SysOM, the region is not included in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists all regions with managed instances.</p>
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
     * <p>This operation retrieves the list of regions where the current user has instances managed by SysOM. If you have ECS instances in a region but they are not managed by SysOM, the region is not included in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists all regions with managed instances.</p>
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegionsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of historical down diagnosis tasks.</p>
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
     * <p>Queries the list of historical down diagnosis tasks.</p>
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
     * <b>description</b> :
     * <p>Calling this API operation to install the agent is asynchronous. After the call, a task_id is returned. You can use this ID to call the GetHotfixTask operation to query the execution status of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously queries the CVE hotfix status on the specified instances.</p>
     * 
     * @param request QueryHotfixStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryHotfixStatusResponse
     */
    public QueryHotfixStatusResponse queryHotfixStatusWithOptions(QueryHotfixStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cveId)) {
            body.put("cveId", request.cveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryHotfixStatus"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/hotfix_manager/hotfix/query_status"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHotfixStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calling this API operation to install the agent is asynchronous. After the call, a task_id is returned. You can use this ID to call the GetHotfixTask operation to query the execution status of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously queries the CVE hotfix status on the specified instances.</p>
     * 
     * @param request QueryHotfixStatusRequest
     * @return QueryHotfixStatusResponse
     */
    public QueryHotfixStatusResponse queryHotfixStatus(QueryHotfixStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryHotfixStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts AI job analysis.</p>
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
     * <p>Starts AI job analysis.</p>
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
     * <p>Currently, only comparative analysis of the same PID across different steps within the same AI Infra analysis record is supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts an AI Infra differential analysis.</p>
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
     * <p>Currently, only comparative analysis of the same PID across different steps within the same AI Infra analysis record is supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts an AI Infra differential analysis.</p>
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
     * <p>Currently, only comparative analysis of the same PID across different steps under the same AI Infra analysis record is supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Triggers AI application diagnostics.</p>
     * 
     * @param request StartAifgAnalysisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartAifgAnalysisResponse
     */
    public StartAifgAnalysisResponse startAifgAnalysisWithOptions(StartAifgAnalysisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("serviceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAifgAnalysis"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aifg/startAifgAnalysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartAifgAnalysisResponse());
    }

    /**
     * <b>description</b> :
     * <p>Currently, only comparative analysis of the same PID across different steps under the same AI Infra analysis record is supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Triggers AI application diagnostics.</p>
     * 
     * @param request StartAifgAnalysisRequest
     * @return StartAifgAnalysisResponse
     */
    public StartAifgAnalysisResponse startAifgAnalysis(StartAifgAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAifgAnalysisWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation to uninstall an Agent is asynchronous. After the call, a task_id is returned. You can use this ID to call the GetAgentTask operation to retrieve the execution status of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Uninstalls a specified version of a component.</p>
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
     * <p>Calling this operation to uninstall an Agent is asynchronous. After the call, a task_id is returned. You can use this ID to call the GetAgentTask operation to retrieve the execution status of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Uninstalls a specified version of a component.</p>
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
     * <p>Uninstalls a component from a cluster.</p>
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
     * <p>Uninstalls a component from a cluster.</p>
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
     * <p>Calling this operation to uninstall an Agent is asynchronous. After the call, a task_id is returned. Use this ID to call the GetAgentTask operation to retrieve the execution status of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Uninstalls a specified version of a component.</p>
     * 
     * @param request UninstallAgentWithTypeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallAgentWithTypeResponse
     */
    public UninstallAgentWithTypeResponse uninstallAgentWithTypeWithOptions(UninstallAgentWithTypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            body.put("agentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("instanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallAgentWithType"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/uninstallAgent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallAgentWithTypeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation to uninstall an Agent is asynchronous. After the call, a task_id is returned. Use this ID to call the GetAgentTask operation to retrieve the execution status of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Uninstalls a specified version of a component.</p>
     * 
     * @param request UninstallAgentWithTypeRequest
     * @return UninstallAgentWithTypeResponse
     */
    public UninstallAgentWithTypeResponse uninstallAgentWithType(UninstallAgentWithTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallAgentWithTypeWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calling this API to install the agent is asynchronous. After you call this API, a task_id is returned. You can use this ID to call the GetHotfixTask API to obtain the execution status of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously uninstalls a CVE hotfix from a specified instance.</p>
     * 
     * @param request UninstallHotfixRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallHotfixResponse
     */
    public UninstallHotfixResponse uninstallHotfixWithOptions(UninstallHotfixRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cveId)) {
            body.put("cveId", request.cveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallHotfix"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/hotfix_manager/hotfix/uninstall"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallHotfixResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calling this API to install the agent is asynchronous. After you call this API, a task_id is returned. You can use this ID to call the GetHotfixTask API to obtain the execution status of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously uninstalls a CVE hotfix from a specified instance.</p>
     * 
     * @param request UninstallHotfixRequest
     * @return UninstallHotfixResponse
     */
    public UninstallHotfixResponse uninstallHotfix(UninstallHotfixRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallHotfixWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After the configuration is updated, the new configuration is delivered to all resources to which the configuration is applied.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a component.</p>
     * 
     * @param request UpdateAgentConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgentConfigResponse
     */
    public UpdateAgentConfigResponse updateAgentConfigWithOptions(UpdateAgentConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            body.put("configId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgentConfig"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/updateAgentConfig"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgentConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>After the configuration is updated, the new configuration is delivered to all resources to which the configuration is applied.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a component.</p>
     * 
     * @param request UpdateAgentConfigRequest
     * @return UpdateAgentConfigResponse
     */
    public UpdateAgentConfigResponse updateAgentConfig(UpdateAgentConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAgentConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>、</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an alert contact.</p>
     * 
     * @param request UpdateAlertDestinationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAlertDestinationResponse
     */
    public UpdateAlertDestinationResponse updateAlertDestinationWithOptions(UpdateAlertDestinationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("app_id", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSecret)) {
            body.put("app_secret", request.appSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("group_id", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imbot)) {
            body.put("imbot", request.imbot);
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
     * <p>Updates an alert contact.</p>
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
     * <p>Updates the status of a push alert policy.</p>
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
     * <p>Updates the status of a push alert policy.</p>
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
     * <p>Updates the alert push policy.</p>
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
     * <p>Updates the alert push policy.</p>
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
     * <p>Updates the component configuration of a cluster.</p>
     * 
     * @param request UpdateClusterAgentConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateClusterAgentConfigResponse
     */
    public UpdateClusterAgentConfigResponse updateClusterAgentConfigWithOptions(UpdateClusterAgentConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("clusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            body.put("configId", request.configId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClusterAgentConfig"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/updateClusterAgentConfig"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClusterAgentConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the component configuration of a cluster.</p>
     * 
     * @param request UpdateClusterAgentConfigRequest
     * @return UpdateClusterAgentConfigResponse
     */
    public UpdateClusterAgentConfigResponse updateClusterAgentConfig(UpdateClusterAgentConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateClusterAgentConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the attention level of an anomaly item. Adjusting the attention level affects the sensitivity of the anomaly detection algorithm.</p>
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
     * <p>Updates the attention level of an anomaly item. Adjusting the attention level affects the sensitivity of the anomaly detection algorithm.</p>
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
     * <li>Populate parameters according to the general LLM service input parameters, convert them to a string, and assign the string to llmParamString.</li>
     * <li>Convert the returned data from a string to a dict before use. Refer to the general LLM service response format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a service feature module.</p>
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
     * <li>Populate parameters according to the general LLM service input parameters, convert them to a string, and assign the string to llmParamString.</li>
     * <li>Convert the returned data from a string to a dict before use. Refer to the general LLM service response format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a service feature module.</p>
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
     * <b>summary</b> : 
     * <p>Updates the component configurations of an instance.</p>
     * 
     * @param request UpdateInstanceAgentConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceAgentConfigResponse
     */
    public UpdateInstanceAgentConfigResponse updateInstanceAgentConfigWithOptions(UpdateInstanceAgentConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            body.put("configId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceAgentConfig"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/updateInstanceAgentConfig"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceAgentConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the component configurations of an instance.</p>
     * 
     * @param request UpdateInstanceAgentConfigRequest
     * @return UpdateInstanceAgentConfigResponse
     */
    public UpdateInstanceAgentConfigResponse updateInstanceAgentConfig(UpdateInstanceAgentConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceAgentConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation to update an Agent is asynchronous. After the call, a task_id is returned. Use this ID to call the GetAgentTask operation to retrieve the execution status of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an installed component to a specified version.</p>
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
     * <p>Calling this operation to update an Agent is asynchronous. After the call, a task_id is returned. Use this ID to call the GetAgentTask operation to retrieve the execution status of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an installed component to a specified version.</p>
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
     * <p>Updates a component for a cluster.</p>
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
     * <p>Updates a component for a cluster.</p>
     * 
     * @param request UpgradeAgentForClusterRequest
     * @return UpgradeAgentForClusterResponse
     */
    public UpgradeAgentForClusterResponse upgradeAgentForCluster(UpgradeAgentForClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeAgentForClusterWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation to update an Agent is asynchronous. After the call, a task_id is returned. Use this ID to call the GetAgentTask operation to retrieve the execution status of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the version of an installed component to a specified version.</p>
     * 
     * @param request UpgradeAgentWithTypeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeAgentWithTypeResponse
     */
    public UpgradeAgentWithTypeResponse upgradeAgentWithTypeWithOptions(UpgradeAgentWithTypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            body.put("agentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("instanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeAgentWithType"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/upgradeAgent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeAgentWithTypeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation to update an Agent is asynchronous. After the call, a task_id is returned. Use this ID to call the GetAgentTask operation to retrieve the execution status of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the version of an installed component to a specified version.</p>
     * 
     * @param request UpgradeAgentWithTypeRequest
     * @return UpgradeAgentWithTypeResponse
     */
    public UpgradeAgentWithTypeResponse upgradeAgentWithType(UpgradeAgentWithTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeAgentWithTypeWithOptions(request, headers, runtime);
    }
}

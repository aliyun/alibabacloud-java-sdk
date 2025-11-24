// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111;

import com.aliyun.tea.*;
import com.aliyun.servicemesh20200111.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("servicemesh", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Adds a cluster to an ASM instance.</p>
     * 
     * @param request AddClusterIntoServiceMeshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddClusterIntoServiceMeshResponse
     */
    public AddClusterIntoServiceMeshResponse addClusterIntoServiceMeshWithOptions(AddClusterIntoServiceMeshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discoveryOnly)) {
            body.put("DiscoveryOnly", request.discoveryOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreNamespaceCheck)) {
            body.put("IgnoreNamespaceCheck", request.ignoreNamespaceCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kubeconfig)) {
            body.put("Kubeconfig", request.kubeconfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddClusterIntoServiceMesh"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddClusterIntoServiceMeshResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a cluster to an ASM instance.</p>
     * 
     * @param request AddClusterIntoServiceMeshRequest
     * @return AddClusterIntoServiceMeshResponse
     */
    public AddClusterIntoServiceMeshResponse addClusterIntoServiceMesh(AddClusterIntoServiceMeshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addClusterIntoServiceMeshWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a virtual machine (VM) to a Service Mesh (ASM) instance.</p>
     * 
     * @deprecated OpenAPI AddVMIntoServiceMesh is deprecated
     * 
     * @param request AddVMIntoServiceMeshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddVMIntoServiceMeshResponse
     */
    @Deprecated
    // Deprecated
    public AddVMIntoServiceMeshResponse addVMIntoServiceMeshWithOptions(AddVMIntoServiceMeshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecsId)) {
            query.put("EcsId", request.ecsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddVMIntoServiceMesh"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddVMIntoServiceMeshResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a virtual machine (VM) to a Service Mesh (ASM) instance.</p>
     * 
     * @deprecated OpenAPI AddVMIntoServiceMesh is deprecated
     * 
     * @param request AddVMIntoServiceMeshRequest
     * @return AddVMIntoServiceMeshResponse
     */
    @Deprecated
    // Deprecated
    public AddVMIntoServiceMeshResponse addVMIntoServiceMesh(AddVMIntoServiceMeshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addVMIntoServiceMeshWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Service Mesh (ASM) gateway.</p>
     * 
     * @param request CreateASMGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateASMGatewayResponse
     */
    public CreateASMGatewayResponse createASMGatewayWithOptions(CreateASMGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.istioGatewayName)) {
            body.put("IstioGatewayName", request.istioGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateASMGateway"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateASMGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Service Mesh (ASM) gateway.</p>
     * 
     * @param request CreateASMGatewayRequest
     * @return CreateASMGatewayResponse
     */
    public CreateASMGatewayResponse createASMGateway(CreateASMGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createASMGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a secret for a Service Mesh (ASM) gateway.</p>
     * 
     * @param request CreateGatewaySecretRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGatewaySecretResponse
     */
    public CreateGatewaySecretResponse createGatewaySecretWithOptions(CreateGatewaySecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cert)) {
            body.put("Cert", request.cert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.istioGatewayName)) {
            body.put("IstioGatewayName", request.istioGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            body.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            body.put("SecretName", request.secretName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGatewaySecret"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewaySecretResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a secret for a Service Mesh (ASM) gateway.</p>
     * 
     * @param request CreateGatewaySecretRequest
     * @return CreateGatewaySecretResponse
     */
    public CreateGatewaySecretResponse createGatewaySecret(CreateGatewaySecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGatewaySecretWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds domain names for a Service Mesh (ASM) gateway.</p>
     * 
     * @param request CreateIstioGatewayDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIstioGatewayDomainsResponse
     */
    public CreateIstioGatewayDomainsResponse createIstioGatewayDomainsWithOptions(CreateIstioGatewayDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credential)) {
            body.put("Credential", request.credential);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceHttps)) {
            body.put("ForceHttps", request.forceHttps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hosts)) {
            body.put("Hosts", request.hosts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.istioGatewayName)) {
            body.put("IstioGatewayName", request.istioGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            body.put("Number", request.number);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portName)) {
            body.put("PortName", request.portName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIstioGatewayDomains"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIstioGatewayDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds domain names for a Service Mesh (ASM) gateway.</p>
     * 
     * @param request CreateIstioGatewayDomainsRequest
     * @return CreateIstioGatewayDomainsResponse
     */
    public CreateIstioGatewayDomainsResponse createIstioGatewayDomains(CreateIstioGatewayDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIstioGatewayDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a routing rule for a Service Mesh (ASM) gateway.</p>
     * 
     * @param tmpReq CreateIstioGatewayRoutesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIstioGatewayRoutesResponse
     */
    public CreateIstioGatewayRoutesResponse createIstioGatewayRoutesWithOptions(CreateIstioGatewayRoutesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateIstioGatewayRoutesShrinkRequest request = new CreateIstioGatewayRoutesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.gatewayRoute)) {
            request.gatewayRouteShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.gatewayRoute, "GatewayRoute", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayRouteShrink)) {
            body.put("GatewayRoute", request.gatewayRouteShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.istioGatewayName)) {
            body.put("IstioGatewayName", request.istioGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIstioGatewayRoutes"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIstioGatewayRoutesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a routing rule for a Service Mesh (ASM) gateway.</p>
     * 
     * @param request CreateIstioGatewayRoutesRequest
     * @return CreateIstioGatewayRoutesResponse
     */
    public CreateIstioGatewayRoutesResponse createIstioGatewayRoutes(CreateIstioGatewayRoutesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIstioGatewayRoutesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Service Mesh (ASM) instance.</p>
     * 
     * @param request CreateServiceMeshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceMeshResponse
     */
    public CreateServiceMeshResponse createServiceMeshWithOptions(CreateServiceMeshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessLogEnabled)) {
            body.put("AccessLogEnabled", request.accessLogEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogFile)) {
            body.put("AccessLogFile", request.accessLogFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogFormat)) {
            body.put("AccessLogFormat", request.accessLogFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogProject)) {
            body.put("AccessLogProject", request.accessLogProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogServiceEnabled)) {
            body.put("AccessLogServiceEnabled", request.accessLogServiceEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogServiceHost)) {
            body.put("AccessLogServiceHost", request.accessLogServiceHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogServicePort)) {
            body.put("AccessLogServicePort", request.accessLogServicePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiServerLoadBalancerSpec)) {
            body.put("ApiServerLoadBalancerSpec", request.apiServerLoadBalancerSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiServerPublicEip)) {
            body.put("ApiServerPublicEip", request.apiServerPublicEip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditProject)) {
            body.put("AuditProject", request.auditProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewPeriod)) {
            body.put("AutoRenewPeriod", request.autoRenewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CRAggregationEnabled)) {
            body.put("CRAggregationEnabled", request.CRAggregationEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certChain)) {
            body.put("CertChain", request.certChain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterDomain)) {
            body.put("ClusterDomain", request.clusterDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSpec)) {
            body.put("ClusterSpec", request.clusterSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configSourceEnabled)) {
            body.put("ConfigSourceEnabled", request.configSourceEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configSourceNacosID)) {
            body.put("ConfigSourceNacosID", request.configSourceNacosID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlPlaneLogEnabled)) {
            body.put("ControlPlaneLogEnabled", request.controlPlaneLogEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlPlaneLogProject)) {
            body.put("ControlPlaneLogProject", request.controlPlaneLogProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customizedPrometheus)) {
            body.put("CustomizedPrometheus", request.customizedPrometheus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customizedZipkin)) {
            body.put("CustomizedZipkin", request.customizedZipkin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSProxyingEnabled)) {
            body.put("DNSProxyingEnabled", request.DNSProxyingEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dubboFilterEnabled)) {
            body.put("DubboFilterEnabled", request.dubboFilterEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            body.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableACMG)) {
            body.put("EnableACMG", request.enableACMG);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAmbient)) {
            body.put("EnableAmbient", request.enableAmbient);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAudit)) {
            body.put("EnableAudit", request.enableAudit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableCRHistory)) {
            body.put("EnableCRHistory", request.enableCRHistory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSDSServer)) {
            body.put("EnableSDSServer", request.enableSDSServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeIPRanges)) {
            body.put("ExcludeIPRanges", request.excludeIPRanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeInboundPorts)) {
            body.put("ExcludeInboundPorts", request.excludeInboundPorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeOutboundPorts)) {
            body.put("ExcludeOutboundPorts", request.excludeOutboundPorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.existingCaCert)) {
            body.put("ExistingCaCert", request.existingCaCert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.existingCaKey)) {
            body.put("ExistingCaKey", request.existingCaKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.existingCaType)) {
            body.put("ExistingCaType", request.existingCaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.existingRootCaCert)) {
            body.put("ExistingRootCaCert", request.existingRootCaCert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.existingRootCaKey)) {
            body.put("ExistingRootCaKey", request.existingRootCaKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterGatewayClusterConfig)) {
            body.put("FilterGatewayClusterConfig", request.filterGatewayClusterConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayAPIEnabled)) {
            body.put("GatewayAPIEnabled", request.gatewayAPIEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.guestCluster)) {
            body.put("GuestCluster", request.guestCluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeIPRanges)) {
            body.put("IncludeIPRanges", request.includeIPRanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.istioVersion)) {
            body.put("IstioVersion", request.istioVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kialiEnabled)) {
            body.put("KialiEnabled", request.kialiEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localityLBConf)) {
            body.put("LocalityLBConf", request.localityLBConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localityLoadBalancing)) {
            body.put("LocalityLoadBalancing", request.localityLoadBalancing);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.MSEEnabled)) {
            body.put("MSEEnabled", request.MSEEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiBufferEnabled)) {
            body.put("MultiBufferEnabled", request.multiBufferEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiBufferPollDelay)) {
            body.put("MultiBufferPollDelay", request.multiBufferPollDelay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mysqlFilterEnabled)) {
            body.put("MysqlFilterEnabled", request.mysqlFilterEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OPALimitCPU)) {
            body.put("OPALimitCPU", request.OPALimitCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OPALimitMemory)) {
            body.put("OPALimitMemory", request.OPALimitMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OPALogLevel)) {
            body.put("OPALogLevel", request.OPALogLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OPARequestCPU)) {
            body.put("OPARequestCPU", request.OPARequestCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OPARequestMemory)) {
            body.put("OPARequestMemory", request.OPARequestMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opaEnabled)) {
            body.put("OpaEnabled", request.opaEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openAgentPolicy)) {
            body.put("OpenAgentPolicy", request.openAgentPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pilotLoadBalancerSpec)) {
            body.put("PilotLoadBalancerSpec", request.pilotLoadBalancerSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playgroundScene)) {
            body.put("PlaygroundScene", request.playgroundScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prometheusUrl)) {
            body.put("PrometheusUrl", request.prometheusUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyLimitCPU)) {
            body.put("ProxyLimitCPU", request.proxyLimitCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyLimitMemory)) {
            body.put("ProxyLimitMemory", request.proxyLimitMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyRequestCPU)) {
            body.put("ProxyRequestCPU", request.proxyRequestCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyRequestMemory)) {
            body.put("ProxyRequestMemory", request.proxyRequestMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redisFilterEnabled)) {
            body.put("RedisFilterEnabled", request.redisFilterEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telemetry)) {
            body.put("Telemetry", request.telemetry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thriftFilterEnabled)) {
            body.put("ThriftFilterEnabled", request.thriftFilterEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceSampling)) {
            body.put("TraceSampling", request.traceSampling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracing)) {
            body.put("Tracing", request.tracing);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useExistingCA)) {
            body.put("UseExistingCA", request.useExistingCA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitches)) {
            body.put("VSwitches", request.vSwitches);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webAssemblyFilterEnabled)) {
            body.put("WebAssemblyFilterEnabled", request.webAssemblyFilterEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceMesh"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceMeshResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Service Mesh (ASM) instance.</p>
     * 
     * @param request CreateServiceMeshRequest
     * @return CreateServiceMeshResponse
     */
    public CreateServiceMeshResponse createServiceMesh(CreateServiceMeshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceMeshWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a lane.</p>
     * 
     * @param request CreateSwimLaneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSwimLaneResponse
     */
    public CreateSwimLaneResponse createSwimLaneWithOptions(CreateSwimLaneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelSelectorKey)) {
            body.put("LabelSelectorKey", request.labelSelectorKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelSelectorValue)) {
            body.put("LabelSelectorValue", request.labelSelectorValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicesList)) {
            body.put("ServicesList", request.servicesList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.swimLaneName)) {
            body.put("SwimLaneName", request.swimLaneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSwimLane"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSwimLaneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a lane.</p>
     * 
     * @param request CreateSwimLaneRequest
     * @return CreateSwimLaneResponse
     */
    public CreateSwimLaneResponse createSwimLane(CreateSwimLaneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSwimLaneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a lane group.</p>
     * 
     * @param request CreateSwimLaneGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSwimLaneGroupResponse
     */
    public CreateSwimLaneGroupResponse createSwimLaneGroupWithOptions(CreateSwimLaneGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressGatewayName)) {
            body.put("IngressGatewayName", request.ingressGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressGatewayNamespace)) {
            body.put("IngressGatewayNamespace", request.ingressGatewayNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressType)) {
            body.put("IngressType", request.ingressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isPermissive)) {
            body.put("IsPermissive", request.isPermissive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeHeader)) {
            body.put("RouteHeader", request.routeHeader);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicesList)) {
            body.put("ServicesList", request.servicesList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceHeader)) {
            body.put("TraceHeader", request.traceHeader);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSwimLaneGroup"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSwimLaneGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a lane group.</p>
     * 
     * @param request CreateSwimLaneGroupRequest
     * @return CreateSwimLaneGroupResponse
     */
    public CreateSwimLaneGroupResponse createSwimLaneGroup(CreateSwimLaneGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSwimLaneGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Waypoint</p>
     * 
     * @param request CreateWaypointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWaypointResponse
     */
    public CreateWaypointResponse createWaypointWithOptions(CreateWaypointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.HPAEnabled)) {
            body.put("HPAEnabled", request.HPAEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.HPAMaxReplicas)) {
            body.put("HPAMaxReplicas", request.HPAMaxReplicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.HPAMinReplicas)) {
            body.put("HPAMinReplicas", request.HPAMinReplicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.HPATargetCPU)) {
            body.put("HPATargetCPU", request.HPATargetCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.HPATargetMemory)) {
            body.put("HPATargetMemory", request.HPATargetMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitCPU)) {
            body.put("LimitCPU", request.limitCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitMemory)) {
            body.put("LimitMemory", request.limitMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferECI)) {
            body.put("PreferECI", request.preferECI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            body.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestCPU)) {
            body.put("RequestCPU", request.requestCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestMemory)) {
            body.put("RequestMemory", request.requestMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceAccount)) {
            body.put("ServiceAccount", request.serviceAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWaypoint"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWaypointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Waypoint</p>
     * 
     * @param request CreateWaypointRequest
     * @return CreateWaypointResponse
     */
    public CreateWaypointResponse createWaypoint(CreateWaypointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWaypointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a routing rule for a Service Mesh (ASM) gateway.</p>
     * 
     * @param request DeleteGatewayRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayRouteResponse
     */
    public DeleteGatewayRouteResponse deleteGatewayRouteWithOptions(DeleteGatewayRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.istioGatewayName)) {
            body.put("IstioGatewayName", request.istioGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeName)) {
            body.put("RouteName", request.routeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayRoute"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a routing rule for a Service Mesh (ASM) gateway.</p>
     * 
     * @param request DeleteGatewayRouteRequest
     * @return DeleteGatewayRouteResponse
     */
    public DeleteGatewayRouteResponse deleteGatewayRoute(DeleteGatewayRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGatewayRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a secret for a Service Mesh (ASM) gateway.</p>
     * 
     * @param request DeleteGatewaySecretRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewaySecretResponse
     */
    public DeleteGatewaySecretResponse deleteGatewaySecretWithOptions(DeleteGatewaySecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.istioGatewayName)) {
            body.put("IstioGatewayName", request.istioGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            body.put("SecretName", request.secretName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewaySecret"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewaySecretResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a secret for a Service Mesh (ASM) gateway.</p>
     * 
     * @param request DeleteGatewaySecretRequest
     * @return DeleteGatewaySecretResponse
     */
    public DeleteGatewaySecretResponse deleteGatewaySecret(DeleteGatewaySecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGatewaySecretWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more domain names for a Service Mesh (ASM) gateway.</p>
     * 
     * @param request DeleteIstioGatewayDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIstioGatewayDomainsResponse
     */
    public DeleteIstioGatewayDomainsResponse deleteIstioGatewayDomainsWithOptions(DeleteIstioGatewayDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hosts)) {
            body.put("Hosts", request.hosts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.istioGatewayName)) {
            body.put("IstioGatewayName", request.istioGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portName)) {
            body.put("PortName", request.portName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIstioGatewayDomains"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIstioGatewayDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more domain names for a Service Mesh (ASM) gateway.</p>
     * 
     * @param request DeleteIstioGatewayDomainsRequest
     * @return DeleteIstioGatewayDomainsResponse
     */
    public DeleteIstioGatewayDomainsResponse deleteIstioGatewayDomains(DeleteIstioGatewayDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIstioGatewayDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Service Mesh (ASM) instance.</p>
     * 
     * @param request DeleteServiceMeshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceMeshResponse
     */
    public DeleteServiceMeshResponse deleteServiceMeshWithOptions(DeleteServiceMeshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            body.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retainResources)) {
            body.put("RetainResources", request.retainResources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceMesh"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceMeshResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Service Mesh (ASM) instance.</p>
     * 
     * @param request DeleteServiceMeshRequest
     * @return DeleteServiceMeshResponse
     */
    public DeleteServiceMeshResponse deleteServiceMesh(DeleteServiceMeshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteServiceMeshWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a lane.</p>
     * 
     * @param request DeleteSwimLaneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSwimLaneResponse
     */
    public DeleteSwimLaneResponse deleteSwimLaneWithOptions(DeleteSwimLaneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.swimLaneName)) {
            body.put("SwimLaneName", request.swimLaneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSwimLane"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSwimLaneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a lane.</p>
     * 
     * @param request DeleteSwimLaneRequest
     * @return DeleteSwimLaneResponse
     */
    public DeleteSwimLaneResponse deleteSwimLane(DeleteSwimLaneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSwimLaneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a lane group. If a lane group is deleted, the lanes in the group and the traffic routing rules attached to the lanes are deleted.</p>
     * 
     * @param request DeleteSwimLaneGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSwimLaneGroupResponse
     */
    public DeleteSwimLaneGroupResponse deleteSwimLaneGroupWithOptions(DeleteSwimLaneGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSwimLaneGroup"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSwimLaneGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a lane group. If a lane group is deleted, the lanes in the group and the traffic routing rules attached to the lanes are deleted.</p>
     * 
     * @param request DeleteSwimLaneGroupRequest
     * @return DeleteSwimLaneGroupResponse
     */
    public DeleteSwimLaneGroupResponse deleteSwimLaneGroup(DeleteSwimLaneGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSwimLaneGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Waypoint资源</p>
     * 
     * @param request DeleteWaypointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWaypointResponse
     */
    public DeleteWaypointResponse deleteWaypointWithOptions(DeleteWaypointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWaypoint"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWaypointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除Waypoint资源</p>
     * 
     * @param request DeleteWaypointRequest
     * @return DeleteWaypointResponse
     */
    public DeleteWaypointResponse deleteWaypoint(DeleteWaypointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWaypointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about imported services on a Service Mesh (ASM) gateway.</p>
     * 
     * @param request DescribeASMGatewayImportedServicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeASMGatewayImportedServicesResponse
     */
    public DescribeASMGatewayImportedServicesResponse describeASMGatewayImportedServicesWithOptions(DescribeASMGatewayImportedServicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ASMGatewayName)) {
            body.put("ASMGatewayName", request.ASMGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceNamespace)) {
            body.put("ServiceNamespace", request.serviceNamespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeASMGatewayImportedServices"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeASMGatewayImportedServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about imported services on a Service Mesh (ASM) gateway.</p>
     * 
     * @param request DescribeASMGatewayImportedServicesRequest
     * @return DescribeASMGatewayImportedServicesResponse
     */
    public DescribeASMGatewayImportedServicesResponse describeASMGatewayImportedServices(DescribeASMGatewayImportedServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeASMGatewayImportedServicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the versions of the Cloud Controller Manager (CCM) component.</p>
     * 
     * @param request DescribeCCMVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCCMVersionResponse
     */
    public DescribeCCMVersionResponse describeCCMVersionWithOptions(DescribeCCMVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCCMVersion"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCCMVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the versions of the Cloud Controller Manager (CCM) component.</p>
     * 
     * @param request DescribeCCMVersionRequest
     * @return DescribeCCMVersionResponse
     */
    public DescribeCCMVersionResponse describeCCMVersion(DescribeCCMVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCCMVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the network connectivity between clusters that are deployed across virtual private clouds (VPCs) in a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeCensRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCensResponse
     */
    public DescribeCensResponse describeCensWithOptions(DescribeCensRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCens"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCensResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the network connectivity between clusters that are deployed across virtual private clouds (VPCs) in a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeCensRequest
     * @return DescribeCensResponse
     */
    public DescribeCensResponse describeCens(DescribeCensRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCensWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about Grafana dashboards of a cluster in a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeClusterGrafanaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterGrafanaResponse
     */
    public DescribeClusterGrafanaResponse describeClusterGrafanaWithOptions(DescribeClusterGrafanaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.k8sClusterId)) {
            query.put("K8sClusterId", request.k8sClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reAddPrometheusIntegration)) {
            query.put("ReAddPrometheusIntegration", request.reAddPrometheusIntegration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterGrafana"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterGrafanaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about Grafana dashboards of a cluster in a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeClusterGrafanaRequest
     * @return DescribeClusterGrafanaResponse
     */
    public DescribeClusterGrafanaResponse describeClusterGrafana(DescribeClusterGrafanaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterGrafanaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the public endpoint of the Prometheus service that is used to monitor a cluster in an Alibaba Cloud Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeClusterPrometheusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterPrometheusResponse
     */
    public DescribeClusterPrometheusResponse describeClusterPrometheusWithOptions(DescribeClusterPrometheusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.k8sClusterId)) {
            query.put("K8sClusterId", request.k8sClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.k8sClusterRegionId)) {
            query.put("K8sClusterRegionId", request.k8sClusterRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterPrometheus"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterPrometheusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the public endpoint of the Prometheus service that is used to monitor a cluster in an Alibaba Cloud Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeClusterPrometheusRequest
     * @return DescribeClusterPrometheusResponse
     */
    public DescribeClusterPrometheusResponse describeClusterPrometheus(DescribeClusterPrometheusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterPrometheusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about clusters in a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeClustersInServiceMeshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClustersInServiceMeshResponse
     */
    public DescribeClustersInServiceMeshResponse describeClustersInServiceMeshWithOptions(DescribeClustersInServiceMeshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClustersInServiceMesh"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClustersInServiceMeshResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about clusters in a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeClustersInServiceMeshRequest
     * @return DescribeClustersInServiceMeshResponse
     */
    public DescribeClustersInServiceMeshResponse describeClustersInServiceMesh(DescribeClustersInServiceMeshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClustersInServiceMeshWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the common YAML templates of Istio resources used by Service Mesh (ASM) instances.</p>
     * 
     * @param request DescribeCrTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCrTemplatesResponse
     */
    public DescribeCrTemplatesResponse describeCrTemplatesWithOptions(DescribeCrTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.istioVersion)) {
            body.put("IstioVersion", request.istioVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kind)) {
            body.put("Kind", request.kind);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCrTemplates"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCrTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the common YAML templates of Istio resources used by Service Mesh (ASM) instances.</p>
     * 
     * @param request DescribeCrTemplatesRequest
     * @return DescribeCrTemplatesResponse
     */
    public DescribeCrTemplatesResponse describeCrTemplates(DescribeCrTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCrTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeEipResources</p>
     * 
     * @param request DescribeEipResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEipResourcesResponse
     */
    public DescribeEipResourcesResponse describeEipResourcesWithOptions(DescribeEipResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEipResources"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEipResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeEipResources</p>
     * 
     * @param request DescribeEipResourcesRequest
     * @return DescribeEipResourcesResponse
     */
    public DescribeEipResourcesResponse describeEipResources(DescribeEipResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEipResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about a secret of a Service Mesh (ASM) gateway.</p>
     * 
     * @param request DescribeGatewaySecretDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGatewaySecretDetailsResponse
     */
    public DescribeGatewaySecretDetailsResponse describeGatewaySecretDetailsWithOptions(DescribeGatewaySecretDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.istioGatewayName)) {
            body.put("IstioGatewayName", request.istioGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewaySecretDetails"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewaySecretDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about a secret of a Service Mesh (ASM) gateway.</p>
     * 
     * @param request DescribeGatewaySecretDetailsRequest
     * @return DescribeGatewaySecretDetailsResponse
     */
    public DescribeGatewaySecretDetailsResponse describeGatewaySecretDetails(DescribeGatewaySecretDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGatewaySecretDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the access log dashboards of a cluster on the data plane.</p>
     * 
     * @param request DescribeGuestClusterAccessLogDashboardsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGuestClusterAccessLogDashboardsResponse
     */
    public DescribeGuestClusterAccessLogDashboardsResponse describeGuestClusterAccessLogDashboardsWithOptions(DescribeGuestClusterAccessLogDashboardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.k8sClusterId)) {
            body.put("K8sClusterId", request.k8sClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGuestClusterAccessLogDashboards"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGuestClusterAccessLogDashboardsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the access log dashboards of a cluster on the data plane.</p>
     * 
     * @param request DescribeGuestClusterAccessLogDashboardsRequest
     * @return DescribeGuestClusterAccessLogDashboardsResponse
     */
    public DescribeGuestClusterAccessLogDashboardsResponse describeGuestClusterAccessLogDashboards(DescribeGuestClusterAccessLogDashboardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGuestClusterAccessLogDashboardsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of the namespaces of a Kubernetes cluster that is added to a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeGuestClusterNamespacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGuestClusterNamespacesResponse
     */
    public DescribeGuestClusterNamespacesResponse describeGuestClusterNamespacesWithOptions(DescribeGuestClusterNamespacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.guestClusterID)) {
            body.put("GuestClusterID", request.guestClusterID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showNsLabels)) {
            body.put("ShowNsLabels", request.showNsLabels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGuestClusterNamespaces"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGuestClusterNamespacesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of the namespaces of a Kubernetes cluster that is added to a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeGuestClusterNamespacesRequest
     * @return DescribeGuestClusterNamespacesResponse
     */
    public DescribeGuestClusterNamespacesResponse describeGuestClusterNamespaces(DescribeGuestClusterNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGuestClusterNamespacesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of the pods in a specified namespace of a Kubernetes cluster that is added to a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeGuestClusterPodsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGuestClusterPodsResponse
     */
    public DescribeGuestClusterPodsResponse describeGuestClusterPodsWithOptions(DescribeGuestClusterPodsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.guestClusterID)) {
            body.put("GuestClusterID", request.guestClusterID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGuestClusterPods"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGuestClusterPodsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of the pods in a specified namespace of a Kubernetes cluster that is added to a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeGuestClusterPodsRequest
     * @return DescribeGuestClusterPodsResponse
     */
    public DescribeGuestClusterPodsResponse describeGuestClusterPods(DescribeGuestClusterPodsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGuestClusterPodsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of the imported services on a Service Mesh (ASM) gateway.</p>
     * 
     * @param request DescribeImportedServicesDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeImportedServicesDetailResponse
     */
    public DescribeImportedServicesDetailResponse describeImportedServicesDetailWithOptions(DescribeImportedServicesDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ASMGatewayName)) {
            body.put("ASMGatewayName", request.ASMGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceNamespace)) {
            body.put("ServiceNamespace", request.serviceNamespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImportedServicesDetail"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImportedServicesDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of the imported services on a Service Mesh (ASM) gateway.</p>
     * 
     * @param request DescribeImportedServicesDetailRequest
     * @return DescribeImportedServicesDetailResponse
     */
    public DescribeImportedServicesDetailResponse describeImportedServicesDetail(DescribeImportedServicesDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImportedServicesDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of the domain names that are exposed by a Service Mesh (ASM) gateway.</p>
     * 
     * @param request DescribeIstioGatewayDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIstioGatewayDomainsResponse
     */
    public DescribeIstioGatewayDomainsResponse describeIstioGatewayDomainsWithOptions(DescribeIstioGatewayDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.istioGatewayName)) {
            body.put("IstioGatewayName", request.istioGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIstioGatewayDomains"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIstioGatewayDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of the domain names that are exposed by a Service Mesh (ASM) gateway.</p>
     * 
     * @param request DescribeIstioGatewayDomainsRequest
     * @return DescribeIstioGatewayDomainsResponse
     */
    public DescribeIstioGatewayDomainsResponse describeIstioGatewayDomains(DescribeIstioGatewayDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIstioGatewayDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about a routing rule of an Alibaba Cloud Service Mesh (ASM) gateway.</p>
     * 
     * @param request DescribeIstioGatewayRouteDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIstioGatewayRouteDetailResponse
     */
    public DescribeIstioGatewayRouteDetailResponse describeIstioGatewayRouteDetailWithOptions(DescribeIstioGatewayRouteDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.istioGatewayName)) {
            body.put("IstioGatewayName", request.istioGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeName)) {
            body.put("RouteName", request.routeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIstioGatewayRouteDetail"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIstioGatewayRouteDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about a routing rule of an Alibaba Cloud Service Mesh (ASM) gateway.</p>
     * 
     * @param request DescribeIstioGatewayRouteDetailRequest
     * @return DescribeIstioGatewayRouteDetailResponse
     */
    public DescribeIstioGatewayRouteDetailResponse describeIstioGatewayRouteDetail(DescribeIstioGatewayRouteDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIstioGatewayRouteDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the routing rules for a Service Mesh (ASM) gateway.</p>
     * 
     * @param request DescribeIstioGatewayRoutesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIstioGatewayRoutesResponse
     */
    public DescribeIstioGatewayRoutesResponse describeIstioGatewayRoutesWithOptions(DescribeIstioGatewayRoutesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.istioGatewayName)) {
            body.put("IstioGatewayName", request.istioGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIstioGatewayRoutes"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIstioGatewayRoutesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the routing rules for a Service Mesh (ASM) gateway.</p>
     * 
     * @param request DescribeIstioGatewayRoutesRequest
     * @return DescribeIstioGatewayRoutesResponse
     */
    public DescribeIstioGatewayRoutesResponse describeIstioGatewayRoutes(DescribeIstioGatewayRoutesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIstioGatewayRoutesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取ASM网格网络分区设置</p>
     * 
     * @param request DescribeMeshMultiClusterNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMeshMultiClusterNetworkResponse
     */
    public DescribeMeshMultiClusterNetworkResponse describeMeshMultiClusterNetworkWithOptions(DescribeMeshMultiClusterNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeshMultiClusterNetwork"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeshMultiClusterNetworkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取ASM网格网络分区设置</p>
     * 
     * @param request DescribeMeshMultiClusterNetworkRequest
     * @return DescribeMeshMultiClusterNetworkResponse
     */
    public DescribeMeshMultiClusterNetworkResponse describeMeshMultiClusterNetwork(DescribeMeshMultiClusterNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMeshMultiClusterNetworkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries basic information about a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeMetadataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetadataResponse
     */
    public DescribeMetadataResponse describeMetadataWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetadata"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetadataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries basic information about a Service Mesh (ASM) instance.</p>
     * @return DescribeMetadataResponse
     */
    public DescribeMetadataResponse describeMetadata() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetadataWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of sidecar proxies at the namespace level.</p>
     * 
     * @param request DescribeNamespaceScopeSidecarConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNamespaceScopeSidecarConfigResponse
     */
    public DescribeNamespaceScopeSidecarConfigResponse describeNamespaceScopeSidecarConfigWithOptions(DescribeNamespaceScopeSidecarConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNamespaceScopeSidecarConfig"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNamespaceScopeSidecarConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of sidecar proxies at the namespace level.</p>
     * 
     * @param request DescribeNamespaceScopeSidecarConfigRequest
     * @return DescribeNamespaceScopeSidecarConfigResponse
     */
    public DescribeNamespaceScopeSidecarConfigResponse describeNamespaceScopeSidecarConfig(DescribeNamespaceScopeSidecarConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNamespaceScopeSidecarConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the instance types of nodes on the data plane and whether the instance types support Multi-Buffer acceleration.</p>
     * 
     * @param request DescribeNodesInstanceTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNodesInstanceTypeResponse
     */
    public DescribeNodesInstanceTypeResponse describeNodesInstanceTypeWithOptions(DescribeNodesInstanceTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNodesInstanceType"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNodesInstanceTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the instance types of nodes on the data plane and whether the instance types support Multi-Buffer acceleration.</p>
     * 
     * @param request DescribeNodesInstanceTypeRequest
     * @return DescribeNodesInstanceTypeResponse
     */
    public DescribeNodesInstanceTypeResponse describeNodesInstanceType(DescribeNodesInstanceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNodesInstanceTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Server Load Balancer (SLB) instances that can be reused.</p>
     * 
     * @param request DescribeReusableSlbRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeReusableSlbResponse
     */
    public DescribeReusableSlbResponse describeReusableSlbWithOptions(DescribeReusableSlbRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.k8sClusterId)) {
            body.put("K8sClusterId", request.k8sClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lbType)) {
            body.put("LbType", request.lbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            body.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeReusableSlb"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeReusableSlbResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Server Load Balancer (SLB) instances that can be reused.</p>
     * 
     * @param request DescribeReusableSlbRequest
     * @return DescribeReusableSlbResponse
     */
    public DescribeReusableSlbResponse describeReusableSlb(DescribeReusableSlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeReusableSlbWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the check results of a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeServiceMeshAdditionalStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceMeshAdditionalStatusResponse
     */
    public DescribeServiceMeshAdditionalStatusResponse describeServiceMeshAdditionalStatusWithOptions(DescribeServiceMeshAdditionalStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkMode)) {
            body.put("CheckMode", request.checkMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceMeshAdditionalStatus"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceMeshAdditionalStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the check results of a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeServiceMeshAdditionalStatusRequest
     * @return DescribeServiceMeshAdditionalStatusResponse
     */
    public DescribeServiceMeshAdditionalStatusResponse describeServiceMeshAdditionalStatus(DescribeServiceMeshAdditionalStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceMeshAdditionalStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the clusters that can be added to a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeServiceMeshClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceMeshClustersResponse
     */
    public DescribeServiceMeshClustersResponse describeServiceMeshClustersWithOptions(DescribeServiceMeshClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            body.put("Offset", request.offset);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceMeshClusters"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceMeshClustersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the clusters that can be added to a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeServiceMeshClustersRequest
     * @return DescribeServiceMeshClustersResponse
     */
    public DescribeServiceMeshClustersResponse describeServiceMeshClusters(DescribeServiceMeshClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceMeshClustersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeServiceMeshDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceMeshDetailResponse
     */
    public DescribeServiceMeshDetailResponse describeServiceMeshDetailWithOptions(DescribeServiceMeshDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceMeshDetail"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceMeshDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeServiceMeshDetailRequest
     * @return DescribeServiceMeshDetailResponse
     */
    public DescribeServiceMeshDetailResponse describeServiceMeshDetail(DescribeServiceMeshDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceMeshDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the content of the kubeconfig file of a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeServiceMeshKubeconfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceMeshKubeconfigResponse
     */
    public DescribeServiceMeshKubeconfigResponse describeServiceMeshKubeconfigWithOptions(DescribeServiceMeshKubeconfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            query.put("PrivateIpAddress", request.privateIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceMeshKubeconfig"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceMeshKubeconfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the content of the kubeconfig file of a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeServiceMeshKubeconfigRequest
     * @return DescribeServiceMeshKubeconfigResponse
     */
    public DescribeServiceMeshKubeconfigResponse describeServiceMeshKubeconfig(DescribeServiceMeshKubeconfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceMeshKubeconfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the logs of a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeServiceMeshLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceMeshLogsResponse
     */
    public DescribeServiceMeshLogsResponse describeServiceMeshLogsWithOptions(DescribeServiceMeshLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceMeshLogs"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceMeshLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the logs of a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeServiceMeshLogsRequest
     * @return DescribeServiceMeshLogsResponse
     */
    public DescribeServiceMeshLogsResponse describeServiceMeshLogs(DescribeServiceMeshLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceMeshLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of proxies on the data plane of a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeServiceMeshProxyStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceMeshProxyStatusResponse
     */
    public DescribeServiceMeshProxyStatusResponse describeServiceMeshProxyStatusWithOptions(DescribeServiceMeshProxyStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceMeshProxyStatus"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceMeshProxyStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of proxies on the data plane of a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeServiceMeshProxyStatusRequest
     * @return DescribeServiceMeshProxyStatusResponse
     */
    public DescribeServiceMeshProxyStatusResponse describeServiceMeshProxyStatus(DescribeServiceMeshProxyStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceMeshProxyStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the upgrade details of a Service Mesh (ASM) instance and its ingress gateways.</p>
     * 
     * @param request DescribeServiceMeshUpgradeStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceMeshUpgradeStatusResponse
     */
    public DescribeServiceMeshUpgradeStatusResponse describeServiceMeshUpgradeStatusWithOptions(DescribeServiceMeshUpgradeStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allIstioGatewayFullNames)) {
            body.put("AllIstioGatewayFullNames", request.allIstioGatewayFullNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.guestClusterIds)) {
            body.put("GuestClusterIds", request.guestClusterIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceMeshUpgradeStatus"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceMeshUpgradeStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the upgrade details of a Service Mesh (ASM) instance and its ingress gateways.</p>
     * 
     * @param request DescribeServiceMeshUpgradeStatusRequest
     * @return DescribeServiceMeshUpgradeStatusResponse
     */
    public DescribeServiceMeshUpgradeStatusResponse describeServiceMeshUpgradeStatus(DescribeServiceMeshUpgradeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceMeshUpgradeStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Elastic Compute Service (ECS) instances that reside in the same virtual private cloud (VPC) as a Service Mesh (ASM) instance.</p>
     * 
     * @deprecated OpenAPI DescribeServiceMeshVMs is deprecated
     * 
     * @param request DescribeServiceMeshVMsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceMeshVMsResponse
     */
    @Deprecated
    // Deprecated
    public DescribeServiceMeshVMsResponse describeServiceMeshVMsWithOptions(DescribeServiceMeshVMsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceMeshVMs"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceMeshVMsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Elastic Compute Service (ECS) instances that reside in the same virtual private cloud (VPC) as a Service Mesh (ASM) instance.</p>
     * 
     * @deprecated OpenAPI DescribeServiceMeshVMs is deprecated
     * 
     * @param request DescribeServiceMeshVMsRequest
     * @return DescribeServiceMeshVMsResponse
     */
    @Deprecated
    // Deprecated
    public DescribeServiceMeshVMsResponse describeServiceMeshVMs(DescribeServiceMeshVMsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceMeshVMsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries ASM instances.</p>
     * 
     * @param request DescribeServiceMeshesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceMeshesResponse
     */
    public DescribeServiceMeshesResponse describeServiceMeshesWithOptions(DescribeServiceMeshesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceMeshes"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceMeshesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries ASM instances.</p>
     * 
     * @param request DescribeServiceMeshesRequest
     * @return DescribeServiceMeshesResponse
     */
    public DescribeServiceMeshesResponse describeServiceMeshes(DescribeServiceMeshesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceMeshesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the update status of a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeUpgradeVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUpgradeVersionResponse
     */
    public DescribeUpgradeVersionResponse describeUpgradeVersionWithOptions(DescribeUpgradeVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUpgradeVersion"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUpgradeVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the update status of a Service Mesh (ASM) instance.</p>
     * 
     * @param request DescribeUpgradeVersionRequest
     * @return DescribeUpgradeVersionResponse
     */
    public DescribeUpgradeVersionResponse describeUpgradeVersion(DescribeUpgradeVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUpgradeVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains role-based access control (RBAC) permissions.</p>
     * 
     * @param request DescribeUserPermissionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserPermissionsResponse
     */
    public DescribeUserPermissionsResponse describeUserPermissionsWithOptions(DescribeUserPermissionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subAccountUserId)) {
            body.put("SubAccountUserId", request.subAccountUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserPermissions"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserPermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains role-based access control (RBAC) permissions.</p>
     * 
     * @param request DescribeUserPermissionsRequest
     * @return DescribeUserPermissionsResponse
     */
    public DescribeUserPermissionsResponse describeUserPermissions(DescribeUserPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserPermissionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IDs of all RAM users or RAM roles to which a Role-based Access Control (RBAC) role is assigned.</p>
     * 
     * @param request DescribeUsersWithPermissionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUsersWithPermissionsResponse
     */
    public DescribeUsersWithPermissionsResponse describeUsersWithPermissionsWithOptions(DescribeUsersWithPermissionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            body.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUsersWithPermissions"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUsersWithPermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IDs of all RAM users or RAM roles to which a Role-based Access Control (RBAC) role is assigned.</p>
     * 
     * @param request DescribeUsersWithPermissionsRequest
     * @return DescribeUsersWithPermissionsResponse
     */
    public DescribeUsersWithPermissionsResponse describeUsersWithPermissions(DescribeUsersWithPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUsersWithPermissionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the virtual machines (VMs) that are added to a Service Mesh (ASM) instance.</p>
     * 
     * @deprecated OpenAPI DescribeVMsInServiceMesh is deprecated
     * 
     * @param request DescribeVMsInServiceMeshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVMsInServiceMeshResponse
     */
    @Deprecated
    // Deprecated
    public DescribeVMsInServiceMeshResponse describeVMsInServiceMeshWithOptions(DescribeVMsInServiceMeshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVMsInServiceMesh"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVMsInServiceMeshResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the virtual machines (VMs) that are added to a Service Mesh (ASM) instance.</p>
     * 
     * @deprecated OpenAPI DescribeVMsInServiceMesh is deprecated
     * 
     * @param request DescribeVMsInServiceMeshRequest
     * @return DescribeVMsInServiceMeshResponse
     */
    @Deprecated
    // Deprecated
    public DescribeVMsInServiceMeshResponse describeVMsInServiceMesh(DescribeVMsInServiceMeshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVMsInServiceMeshWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of vSwitches that are deployed in a specified virtual private cloud (VPC) in a region.</p>
     * 
     * @param request DescribeVSwitchesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVSwitchesResponse
     */
    public DescribeVSwitchesResponse describeVSwitchesWithOptions(DescribeVSwitchesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVSwitches"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVSwitchesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of vSwitches that are deployed in a specified virtual private cloud (VPC) in a region.</p>
     * 
     * @param request DescribeVSwitchesRequest
     * @return DescribeVSwitchesResponse
     */
    public DescribeVSwitchesResponse describeVSwitches(DescribeVSwitchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVSwitchesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available Service Mesh (ASM) versions when you create an ASM instance.</p>
     * 
     * @param request DescribeVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVersionsResponse
     */
    public DescribeVersionsResponse describeVersionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVersions"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available Service Mesh (ASM) versions when you create an ASM instance.</p>
     * @return DescribeVersionsResponse
     */
    public DescribeVersionsResponse describeVersions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVersionsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the virtual private clouds (VPCs) that are available in a specified region.</p>
     * 
     * @param request DescribeVpcsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcsResponse
     */
    public DescribeVpcsResponse describeVpcsWithOptions(DescribeVpcsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcs"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the virtual private clouds (VPCs) that are available in a specified region.</p>
     * 
     * @param request DescribeVpcsRequest
     * @return DescribeVpcsResponse
     */
    public DescribeVpcsResponse describeVpcs(DescribeVpcsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a certificate issued by a certificate authority (CA).</p>
     * 
     * @param request GetCaCertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCaCertResponse
     */
    public GetCaCertResponse getCaCertWithOptions(GetCaCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCaCert"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCaCertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a certificate issued by a certificate authority (CA).</p>
     * 
     * @param request GetCaCertRequest
     * @return GetCaCertResponse
     */
    public GetCaCertResponse getCaCert(GetCaCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCaCertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of workloads specified by a label selector.</p>
     * 
     * @param tmpReq GetDeploymentBySelectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeploymentBySelectorResponse
     */
    public GetDeploymentBySelectorResponse getDeploymentBySelectorWithOptions(GetDeploymentBySelectorRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDeploymentBySelectorShrinkRequest request = new GetDeploymentBySelectorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labelSelector)) {
            request.labelSelectorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labelSelector, "LabelSelector", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.guestCluster)) {
            body.put("GuestCluster", request.guestCluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelSelectorShrink)) {
            body.put("LabelSelector", request.labelSelectorShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mark)) {
            body.put("Mark", request.mark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameSpace)) {
            body.put("NameSpace", request.nameSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeploymentBySelector"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeploymentBySelectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of workloads specified by a label selector.</p>
     * 
     * @param request GetDeploymentBySelectorRequest
     * @return GetDeploymentBySelectorResponse
     */
    public GetDeploymentBySelectorResponse getDeploymentBySelector(GetDeploymentBySelectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeploymentBySelectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Grafana dashboard URL from Application Real-Time Monitoring Service (ARMS).</p>
     * 
     * @param request GetGrafanaDashboardUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGrafanaDashboardUrlResponse
     */
    public GetGrafanaDashboardUrlResponse getGrafanaDashboardUrlWithOptions(GetGrafanaDashboardUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.k8sClusterId)) {
            body.put("K8sClusterId", request.k8sClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGrafanaDashboardUrl"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGrafanaDashboardUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Grafana dashboard URL from Application Real-Time Monitoring Service (ARMS).</p>
     * 
     * @param request GetGrafanaDashboardUrlRequest
     * @return GetGrafanaDashboardUrlResponse
     */
    public GetGrafanaDashboardUrlResponse getGrafanaDashboardUrl(GetGrafanaDashboardUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGrafanaDashboardUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>描述ServiceEndpoints信息</p>
     * 
     * @param request GetRegisteredServiceEndpointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRegisteredServiceEndpointsResponse
     */
    public GetRegisteredServiceEndpointsResponse getRegisteredServiceEndpointsWithOptions(GetRegisteredServiceEndpointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterIds)) {
            body.put("ClusterIds", request.clusterIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            body.put("ServiceType", request.serviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegisteredServiceEndpoints"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegisteredServiceEndpointsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>描述ServiceEndpoints信息</p>
     * 
     * @param request GetRegisteredServiceEndpointsRequest
     * @return GetRegisteredServiceEndpointsResponse
     */
    public GetRegisteredServiceEndpointsResponse getRegisteredServiceEndpoints(GetRegisteredServiceEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRegisteredServiceEndpointsWithOptions(request, runtime);
    }

    /**
     * @param request GetRegisteredServiceNamespacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRegisteredServiceNamespacesResponse
     */
    public GetRegisteredServiceNamespacesResponse getRegisteredServiceNamespacesWithOptions(GetRegisteredServiceNamespacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegisteredServiceNamespaces"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegisteredServiceNamespacesResponse());
    }

    /**
     * @param request GetRegisteredServiceNamespacesRequest
     * @return GetRegisteredServiceNamespacesResponse
     */
    public GetRegisteredServiceNamespacesResponse getRegisteredServiceNamespaces(GetRegisteredServiceNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRegisteredServiceNamespacesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries detailed information about a lane.</p>
     * 
     * @param request GetSwimLaneDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSwimLaneDetailResponse
     */
    public GetSwimLaneDetailResponse getSwimLaneDetailWithOptions(GetSwimLaneDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.swimLaneName)) {
            body.put("SwimLaneName", request.swimLaneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSwimLaneDetail"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSwimLaneDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries detailed information about a lane.</p>
     * 
     * @param request GetSwimLaneDetailRequest
     * @return GetSwimLaneDetailResponse
     */
    public GetSwimLaneDetailResponse getSwimLaneDetail(GetSwimLaneDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSwimLaneDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of all lane groups in an Alibaba Cloud Service Mesh (ASM) instance.</p>
     * 
     * @param request GetSwimLaneGroupListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSwimLaneGroupListResponse
     */
    public GetSwimLaneGroupListResponse getSwimLaneGroupListWithOptions(GetSwimLaneGroupListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSwimLaneGroupList"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSwimLaneGroupListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of all lane groups in an Alibaba Cloud Service Mesh (ASM) instance.</p>
     * 
     * @param request GetSwimLaneGroupListRequest
     * @return GetSwimLaneGroupListResponse
     */
    public GetSwimLaneGroupListResponse getSwimLaneGroupList(GetSwimLaneGroupListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSwimLaneGroupListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of all the lanes in a lane group.</p>
     * 
     * @param request GetSwimLaneListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSwimLaneListResponse
     */
    public GetSwimLaneListResponse getSwimLaneListWithOptions(GetSwimLaneListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSwimLaneList"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSwimLaneListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of all the lanes in a lane group.</p>
     * 
     * @param request GetSwimLaneListRequest
     * @return GetSwimLaneListResponse
     */
    public GetSwimLaneListResponse getSwimLaneList(GetSwimLaneListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSwimLaneListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about VMs that are added to a Service Mesh (ASM) instance.</p>
     * 
     * @deprecated OpenAPI GetVmAppMeshInfo is deprecated
     * 
     * @param request GetVmAppMeshInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVmAppMeshInfoResponse
     */
    @Deprecated
    // Deprecated
    public GetVmAppMeshInfoResponse getVmAppMeshInfoWithOptions(GetVmAppMeshInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVmAppMeshInfo"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVmAppMeshInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about VMs that are added to a Service Mesh (ASM) instance.</p>
     * 
     * @deprecated OpenAPI GetVmAppMeshInfo is deprecated
     * 
     * @param request GetVmAppMeshInfoRequest
     * @return GetVmAppMeshInfoResponse
     */
    @Deprecated
    // Deprecated
    public GetVmAppMeshInfoResponse getVmAppMeshInfo(GetVmAppMeshInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVmAppMeshInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metadata that is required to add a non-containerized application to a Service Mesh (ASM) instance.</p>
     * 
     * @deprecated OpenAPI GetVmMeta is deprecated
     * 
     * @param request GetVmMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVmMetaResponse
     */
    @Deprecated
    // Deprecated
    public GetVmMetaResponse getVmMetaWithOptions(GetVmMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVmMeta"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVmMetaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metadata that is required to add a non-containerized application to a Service Mesh (ASM) instance.</p>
     * 
     * @deprecated OpenAPI GetVmMeta is deprecated
     * 
     * @param request GetVmMetaRequest
     * @return GetVmMetaResponse
     */
    @Deprecated
    // Deprecated
    public GetVmMetaResponse getVmMeta(GetVmMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVmMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Grants permissions to a Resource Access Management (RAM) user.</p>
     * 
     * @param tmpReq GrantUserPermissionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantUserPermissionsResponse
     */
    public GrantUserPermissionsResponse grantUserPermissionsWithOptions(GrantUserPermissionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GrantUserPermissionsShrinkRequest request = new GrantUserPermissionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subAccountUserIds)) {
            request.subAccountUserIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subAccountUserIds, "SubAccountUserIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.permissions)) {
            body.put("Permissions", request.permissions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subAccountUserId)) {
            body.put("SubAccountUserId", request.subAccountUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subAccountUserIdsShrink)) {
            body.put("SubAccountUserIds", request.subAccountUserIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantUserPermissions"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantUserPermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Grants permissions to a Resource Access Management (RAM) user.</p>
     * 
     * @param request GrantUserPermissionsRequest
     * @return GrantUserPermissionsResponse
     */
    public GrantUserPermissionsResponse grantUserPermissions(GrantUserPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantUserPermissionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举所有服务账号</p>
     * 
     * @param request ListServiceAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceAccountsResponse
     */
    public ListServiceAccountsResponse listServiceAccountsWithOptions(ListServiceAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceAccounts"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举所有服务账号</p>
     * 
     * @param request ListServiceAccountsRequest
     * @return ListServiceAccountsResponse
     */
    public ListServiceAccountsResponse listServiceAccounts(ListServiceAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries user tags on a Service Mesh (ASM) instance.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries user tags on a Service Mesh (ASM) instance.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of all waypoint proxies in a namespace of a cluster on the data plane.</p>
     * 
     * @param request ListWaypointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWaypointsResponse
     */
    public ListWaypointsResponse listWaypointsWithOptions(ListWaypointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request._continue)) {
            body.put("Continue", request._continue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWaypoints"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWaypointsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of all waypoint proxies in a namespace of a cluster on the data plane.</p>
     * 
     * @param request ListWaypointsRequest
     * @return ListWaypointsResponse
     */
    public ListWaypointsResponse listWaypoints(ListWaypointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWaypointsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyApiServerEipResource</p>
     * 
     * @param request ModifyApiServerEipResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApiServerEipResourceResponse
     */
    public ModifyApiServerEipResourceResponse modifyApiServerEipResourceWithOptions(ModifyApiServerEipResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiServerEipId)) {
            body.put("ApiServerEipId", request.apiServerEipId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            body.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApiServerEipResource"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApiServerEipResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyApiServerEipResource</p>
     * 
     * @param request ModifyApiServerEipResourceRequest
     * @return ModifyApiServerEipResourceResponse
     */
    public ModifyApiServerEipResourceResponse modifyApiServerEipResource(ModifyApiServerEipResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApiServerEipResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyPilotEipResource</p>
     * 
     * @param request ModifyPilotEipResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPilotEipResourceResponse
     */
    public ModifyPilotEipResourceResponse modifyPilotEipResourceWithOptions(ModifyPilotEipResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eipId)) {
            body.put("EipId", request.eipId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isCanary)) {
            body.put("IsCanary", request.isCanary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            body.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPilotEipResource"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPilotEipResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyPilotEipResource</p>
     * 
     * @param request ModifyPilotEipResourceRequest
     * @return ModifyPilotEipResourceResponse
     */
    public ModifyPilotEipResourceResponse modifyPilotEipResource(ModifyPilotEipResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPilotEipResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of a Service Mesh (ASM) instance.</p>
     * 
     * @param request ModifyServiceMeshNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyServiceMeshNameResponse
     */
    public ModifyServiceMeshNameResponse modifyServiceMeshNameWithOptions(ModifyServiceMeshNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyServiceMeshName"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyServiceMeshNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of a Service Mesh (ASM) instance.</p>
     * 
     * @param request ModifyServiceMeshNameRequest
     * @return ModifyServiceMeshNameResponse
     */
    public ModifyServiceMeshNameResponse modifyServiceMeshName(ModifyServiceMeshNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyServiceMeshNameWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods of Simple Log Service. For more information, visit the <a href="https://www.alibabacloud.com/zh/pricing-calculator?_p_lc=1%5C&spm=a2796.7960336.3034855210.1.44e6b91aaSp2M7#/commodity/vm_intl">pricing page</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Recreates a project that is used to store audit logs. After mesh audit is enabled, if you delete the log project that stores audit logs by mistake, you can recreate a project for storing audit logs.</p>
     * 
     * @param request ReActivateAuditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReActivateAuditResponse
     */
    public ReActivateAuditResponse reActivateAuditWithOptions(ReActivateAuditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableAudit)) {
            body.put("EnableAudit", request.enableAudit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReActivateAudit"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReActivateAuditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods of Simple Log Service. For more information, visit the <a href="https://www.alibabacloud.com/zh/pricing-calculator?_p_lc=1%5C&spm=a2796.7960336.3034855210.1.44e6b91aaSp2M7#/commodity/vm_intl">pricing page</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Recreates a project that is used to store audit logs. After mesh audit is enabled, if you delete the log project that stores audit logs by mistake, you can recreate a project for storing audit logs.</p>
     * 
     * @param request ReActivateAuditRequest
     * @return ReActivateAuditResponse
     */
    public ReActivateAuditResponse reActivateAudit(ReActivateAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reActivateAuditWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a cluster from a Service Mesh (ASM) instance.</p>
     * 
     * @param request RemoveClusterFromServiceMeshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveClusterFromServiceMeshResponse
     */
    public RemoveClusterFromServiceMeshResponse removeClusterFromServiceMeshWithOptions(RemoveClusterFromServiceMeshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reserveNamespace)) {
            body.put("ReserveNamespace", request.reserveNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveClusterFromServiceMesh"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveClusterFromServiceMeshResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a cluster from a Service Mesh (ASM) instance.</p>
     * 
     * @param request RemoveClusterFromServiceMeshRequest
     * @return RemoveClusterFromServiceMeshResponse
     */
    public RemoveClusterFromServiceMeshResponse removeClusterFromServiceMesh(RemoveClusterFromServiceMeshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeClusterFromServiceMeshWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a virtual machine (VM) from a Service Mesh (ASM) instance.</p>
     * 
     * @deprecated OpenAPI RemoveVMFromServiceMesh is deprecated
     * 
     * @param request RemoveVMFromServiceMeshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveVMFromServiceMeshResponse
     */
    @Deprecated
    // Deprecated
    public RemoveVMFromServiceMeshResponse removeVMFromServiceMeshWithOptions(RemoveVMFromServiceMeshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecsId)) {
            query.put("EcsId", request.ecsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveVMFromServiceMesh"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveVMFromServiceMeshResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a virtual machine (VM) from a Service Mesh (ASM) instance.</p>
     * 
     * @deprecated OpenAPI RemoveVMFromServiceMesh is deprecated
     * 
     * @param request RemoveVMFromServiceMeshRequest
     * @return RemoveVMFromServiceMeshResponse
     */
    @Deprecated
    // Deprecated
    public RemoveVMFromServiceMeshResponse removeVMFromServiceMesh(RemoveVMFromServiceMeshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeVMFromServiceMeshWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the kubeconfig file of a Service Mesh (ASM) instance and generates a new kubeconfig file.</p>
     * 
     * @param request RevokeKubeconfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeKubeconfigResponse
     */
    public RevokeKubeconfigResponse revokeKubeconfigWithOptions(RevokeKubeconfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            body.put("PrivateIpAddress", request.privateIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeKubeconfig"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeKubeconfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the kubeconfig file of a Service Mesh (ASM) instance and generates a new kubeconfig file.</p>
     * 
     * @param request RevokeKubeconfigRequest
     * @return RevokeKubeconfigResponse
     */
    public RevokeKubeconfigResponse revokeKubeconfig(RevokeKubeconfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeKubeconfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or modifies user tags on a resource.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or modifies user tags on a resource.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes user tags on a Service Mesh (ASM) instance.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes user tags on a Service Mesh (ASM) instance.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a Service Mesh (ASM) gateway.</p>
     * 
     * @param request UpdateASMGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateASMGatewayResponse
     */
    public UpdateASMGatewayResponse updateASMGatewayWithOptions(UpdateASMGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.istioGatewayName)) {
            body.put("IstioGatewayName", request.istioGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateASMGateway"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateASMGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a Service Mesh (ASM) gateway.</p>
     * 
     * @param request UpdateASMGatewayRequest
     * @return UpdateASMGatewayResponse
     */
    public UpdateASMGatewayResponse updateASMGateway(UpdateASMGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateASMGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates imported services on a Service Mesh (ASM) gateway to import or delete upstream services associated with the gateway.</p>
     * 
     * @param request UpdateASMGatewayImportedServicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateASMGatewayImportedServicesResponse
     */
    public UpdateASMGatewayImportedServicesResponse updateASMGatewayImportedServicesWithOptions(UpdateASMGatewayImportedServicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ASMGatewayName)) {
            body.put("ASMGatewayName", request.ASMGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceNames)) {
            body.put("ServiceNames", request.serviceNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceNamespace)) {
            body.put("ServiceNamespace", request.serviceNamespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateASMGatewayImportedServices"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateASMGatewayImportedServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates imported services on a Service Mesh (ASM) gateway to import or delete upstream services associated with the gateway.</p>
     * 
     * @param request UpdateASMGatewayImportedServicesRequest
     * @return UpdateASMGatewayImportedServicesResponse
     */
    public UpdateASMGatewayImportedServicesResponse updateASMGatewayImportedServices(UpdateASMGatewayImportedServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateASMGatewayImportedServicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronizes namespaces of a Kubernetes cluster that is added to a Service Mesh (ASM) instance.</p>
     * 
     * @param request UpdateASMNamespaceFromGuestClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateASMNamespaceFromGuestClusterResponse
     */
    public UpdateASMNamespaceFromGuestClusterResponse updateASMNamespaceFromGuestClusterWithOptions(UpdateASMNamespaceFromGuestClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.k8sClusterId)) {
            body.put("K8sClusterId", request.k8sClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateASMNamespaceFromGuestCluster"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateASMNamespaceFromGuestClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronizes namespaces of a Kubernetes cluster that is added to a Service Mesh (ASM) instance.</p>
     * 
     * @param request UpdateASMNamespaceFromGuestClusterRequest
     * @return UpdateASMNamespaceFromGuestClusterResponse
     */
    public UpdateASMNamespaceFromGuestClusterResponse updateASMNamespaceFromGuestCluster(UpdateASMNamespaceFromGuestClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateASMNamespaceFromGuestClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration for collecting control plane logs.</p>
     * 
     * @param request UpdateControlPlaneLogConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateControlPlaneLogConfigResponse
     */
    public UpdateControlPlaneLogConfigResponse updateControlPlaneLogConfigWithOptions(UpdateControlPlaneLogConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logTTLInDay)) {
            body.put("LogTTLInDay", request.logTTLInDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            body.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateControlPlaneLogConfig"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateControlPlaneLogConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration for collecting control plane logs.</p>
     * 
     * @param request UpdateControlPlaneLogConfigRequest
     * @return UpdateControlPlaneLogConfigResponse
     */
    public UpdateControlPlaneLogConfigResponse updateControlPlaneLogConfig(UpdateControlPlaneLogConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateControlPlaneLogConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新Guest Cluster配置</p>
     * 
     * @param request UpdateGuestClusterConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGuestClusterConfigResponse
     */
    public UpdateGuestClusterConfigResponse updateGuestClusterConfigWithOptions(UpdateGuestClusterConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.guestClusterId)) {
            body.put("GuestClusterId", request.guestClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SMCEnabled)) {
            body.put("SMCEnabled", request.SMCEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGuestClusterConfig"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGuestClusterConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新Guest Cluster配置</p>
     * 
     * @param request UpdateGuestClusterConfigRequest
     * @return UpdateGuestClusterConfigResponse
     */
    public UpdateGuestClusterConfigResponse updateGuestClusterConfig(UpdateGuestClusterConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGuestClusterConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a routing rule for a Service Mesh (ASM) gateway.</p>
     * 
     * @param tmpReq UpdateIstioGatewayRoutesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIstioGatewayRoutesResponse
     */
    public UpdateIstioGatewayRoutesResponse updateIstioGatewayRoutesWithOptions(UpdateIstioGatewayRoutesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateIstioGatewayRoutesShrinkRequest request = new UpdateIstioGatewayRoutesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.gatewayRoute)) {
            request.gatewayRouteShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.gatewayRoute, "GatewayRoute", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayRouteShrink)) {
            body.put("GatewayRoute", request.gatewayRouteShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.istioGatewayName)) {
            body.put("IstioGatewayName", request.istioGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIstioGatewayRoutes"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIstioGatewayRoutesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a routing rule for a Service Mesh (ASM) gateway.</p>
     * 
     * @param request UpdateIstioGatewayRoutesRequest
     * @return UpdateIstioGatewayRoutesResponse
     */
    public UpdateIstioGatewayRoutesResponse updateIstioGatewayRoutes(UpdateIstioGatewayRoutesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIstioGatewayRoutesWithOptions(request, runtime);
    }

    /**
     * @param request UpdateIstioInjectionConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIstioInjectionConfigResponse
     */
    public UpdateIstioInjectionConfigResponse updateIstioInjectionConfigWithOptions(UpdateIstioInjectionConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataPlaneMode)) {
            body.put("DataPlaneMode", request.dataPlaneMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableIstioInjection)) {
            body.put("EnableIstioInjection", request.enableIstioInjection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSidecarSetInjection)) {
            body.put("EnableSidecarSetInjection", request.enableSidecarSetInjection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.istioRev)) {
            body.put("IstioRev", request.istioRev);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIstioInjectionConfig"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIstioInjectionConfigResponse());
    }

    /**
     * @param request UpdateIstioInjectionConfigRequest
     * @return UpdateIstioInjectionConfigResponse
     */
    public UpdateIstioInjectionConfigResponse updateIstioInjectionConfig(UpdateIstioInjectionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIstioInjectionConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a routing rule for a Service Mesh (ASM) gateway.</p>
     * 
     * @param request UpdateIstioRouteAdditionalStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIstioRouteAdditionalStatusResponse
     */
    public UpdateIstioRouteAdditionalStatusResponse updateIstioRouteAdditionalStatusWithOptions(UpdateIstioRouteAdditionalStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeName)) {
            query.put("RouteName", request.routeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.istioGatewayName)) {
            body.put("IstioGatewayName", request.istioGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIstioRouteAdditionalStatus"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIstioRouteAdditionalStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a routing rule for a Service Mesh (ASM) gateway.</p>
     * 
     * @param request UpdateIstioRouteAdditionalStatusRequest
     * @return UpdateIstioRouteAdditionalStatusResponse
     */
    public UpdateIstioRouteAdditionalStatusResponse updateIstioRouteAdditionalStatus(UpdateIstioRouteAdditionalStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIstioRouteAdditionalStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the settings of whether to enable the Kubernetes API on the data plane to access Istio resources.</p>
     * 
     * @param request UpdateMeshCRAggregationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMeshCRAggregationResponse
     */
    public UpdateMeshCRAggregationResponse updateMeshCRAggregationWithOptions(UpdateMeshCRAggregationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.CPULimit)) {
            body.put("CPULimit", request.CPULimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CPURequirement)) {
            body.put("CPURequirement", request.CPURequirement);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memoryLimit)) {
            body.put("MemoryLimit", request.memoryLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memoryRequirement)) {
            body.put("MemoryRequirement", request.memoryRequirement);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePublicApiServer)) {
            body.put("UsePublicApiServer", request.usePublicApiServer);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMeshCRAggregation"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMeshCRAggregationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the settings of whether to enable the Kubernetes API on the data plane to access Istio resources.</p>
     * 
     * @param request UpdateMeshCRAggregationRequest
     * @return UpdateMeshCRAggregationResponse
     */
    public UpdateMeshCRAggregationResponse updateMeshCRAggregation(UpdateMeshCRAggregationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMeshCRAggregationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of a Service Mesh (ASM) instance.</p>
     * 
     * @param request UpdateMeshFeatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMeshFeatureResponse
     */
    public UpdateMeshFeatureResponse updateMeshFeatureWithOptions(UpdateMeshFeatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessLogGatewayEnabled)) {
            query.put("AccessLogGatewayEnabled", request.accessLogGatewayEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogSidecarEnabled)) {
            query.put("AccessLogSidecarEnabled", request.accessLogSidecarEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelsForOffloadedWorkloads)) {
            query.put("LabelsForOffloadedWorkloads", request.labelsForOffloadedWorkloads);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessLogEnabled)) {
            body.put("AccessLogEnabled", request.accessLogEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogFile)) {
            body.put("AccessLogFile", request.accessLogFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogFormat)) {
            body.put("AccessLogFormat", request.accessLogFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogGatewayLifecycle)) {
            body.put("AccessLogGatewayLifecycle", request.accessLogGatewayLifecycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogProject)) {
            body.put("AccessLogProject", request.accessLogProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogServiceEnabled)) {
            body.put("AccessLogServiceEnabled", request.accessLogServiceEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogServiceHost)) {
            body.put("AccessLogServiceHost", request.accessLogServiceHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogServicePort)) {
            body.put("AccessLogServicePort", request.accessLogServicePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogSidecarLifecycle)) {
            body.put("AccessLogSidecarLifecycle", request.accessLogSidecarLifecycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditProject)) {
            body.put("AuditProject", request.auditProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoInjectionPolicyEnabled)) {
            body.put("AutoInjectionPolicyEnabled", request.autoInjectionPolicyEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CRAggregationEnabled)) {
            body.put("CRAggregationEnabled", request.CRAggregationEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certChain)) {
            body.put("CertChain", request.certChain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSpec)) {
            body.put("ClusterSpec", request.clusterSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cniEnabled)) {
            body.put("CniEnabled", request.cniEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cniExcludeNamespaces)) {
            body.put("CniExcludeNamespaces", request.cniExcludeNamespaces);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.concurrency)) {
            body.put("Concurrency", request.concurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configSourceEnabled)) {
            body.put("ConfigSourceEnabled", request.configSourceEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configSourceNacosID)) {
            body.put("ConfigSourceNacosID", request.configSourceNacosID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customizedPrometheus)) {
            body.put("CustomizedPrometheus", request.customizedPrometheus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customizedZipkin)) {
            body.put("CustomizedZipkin", request.customizedZipkin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSProxyingEnabled)) {
            body.put("DNSProxyingEnabled", request.DNSProxyingEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultComponentsScheduleConfig)) {
            body.put("DefaultComponentsScheduleConfig", request.defaultComponentsScheduleConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discoverySelectors)) {
            body.put("DiscoverySelectors", request.discoverySelectors);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dubboFilterEnabled)) {
            body.put("DubboFilterEnabled", request.dubboFilterEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAudit)) {
            body.put("EnableAudit", request.enableAudit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAutoDiagnosis)) {
            body.put("EnableAutoDiagnosis", request.enableAutoDiagnosis);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableBootstrapXdsAgent)) {
            body.put("EnableBootstrapXdsAgent", request.enableBootstrapXdsAgent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableCRHistory)) {
            body.put("EnableCRHistory", request.enableCRHistory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableNamespacesByDefault)) {
            body.put("EnableNamespacesByDefault", request.enableNamespacesByDefault);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSDSServer)) {
            body.put("EnableSDSServer", request.enableSDSServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeIPRanges)) {
            body.put("ExcludeIPRanges", request.excludeIPRanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeInboundPorts)) {
            body.put("ExcludeInboundPorts", request.excludeInboundPorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeOutboundPorts)) {
            body.put("ExcludeOutboundPorts", request.excludeOutboundPorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.existingCaCert)) {
            body.put("ExistingCaCert", request.existingCaCert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.existingCaKey)) {
            body.put("ExistingCaKey", request.existingCaKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.existingRootCaCert)) {
            body.put("ExistingRootCaCert", request.existingRootCaCert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterGatewayClusterConfig)) {
            body.put("FilterGatewayClusterConfig", request.filterGatewayClusterConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayAPIEnabled)) {
            body.put("GatewayAPIEnabled", request.gatewayAPIEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.holdApplicationUntilProxyStarts)) {
            body.put("HoldApplicationUntilProxyStarts", request.holdApplicationUntilProxyStarts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.http10Enabled)) {
            body.put("Http10Enabled", request.http10Enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeIPRanges)) {
            body.put("IncludeIPRanges", request.includeIPRanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeInboundPorts)) {
            body.put("IncludeInboundPorts", request.includeInboundPorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeOutboundPorts)) {
            body.put("IncludeOutboundPorts", request.includeOutboundPorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrateKiali)) {
            body.put("IntegrateKiali", request.integrateKiali);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interceptionMode)) {
            body.put("InterceptionMode", request.interceptionMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kialiArmsAuthTokens)) {
            body.put("KialiArmsAuthTokens", request.kialiArmsAuthTokens);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kialiEnabled)) {
            body.put("KialiEnabled", request.kialiEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kialiServiceAnnotations)) {
            body.put("KialiServiceAnnotations", request.kialiServiceAnnotations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycle)) {
            body.put("Lifecycle", request.lifecycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localityLBConf)) {
            body.put("LocalityLBConf", request.localityLBConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localityLoadBalancing)) {
            body.put("LocalityLoadBalancing", request.localityLoadBalancing);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logLevel)) {
            body.put("LogLevel", request.logLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.MSEEnabled)) {
            body.put("MSEEnabled", request.MSEEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiBufferEnabled)) {
            body.put("MultiBufferEnabled", request.multiBufferEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiBufferPollDelay)) {
            body.put("MultiBufferPollDelay", request.multiBufferPollDelay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mysqlFilterEnabled)) {
            body.put("MysqlFilterEnabled", request.mysqlFilterEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.NFDEnabled)) {
            body.put("NFDEnabled", request.NFDEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.NFDLabelPruned)) {
            body.put("NFDLabelPruned", request.NFDLabelPruned);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OPAInjectorCPULimit)) {
            body.put("OPAInjectorCPULimit", request.OPAInjectorCPULimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OPAInjectorCPURequirement)) {
            body.put("OPAInjectorCPURequirement", request.OPAInjectorCPURequirement);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OPAInjectorMemoryLimit)) {
            body.put("OPAInjectorMemoryLimit", request.OPAInjectorMemoryLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OPAInjectorMemoryRequirement)) {
            body.put("OPAInjectorMemoryRequirement", request.OPAInjectorMemoryRequirement);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OPALimitCPU)) {
            body.put("OPALimitCPU", request.OPALimitCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OPALimitMemory)) {
            body.put("OPALimitMemory", request.OPALimitMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OPALogLevel)) {
            body.put("OPALogLevel", request.OPALogLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OPARequestCPU)) {
            body.put("OPARequestCPU", request.OPARequestCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OPARequestMemory)) {
            body.put("OPARequestMemory", request.OPARequestMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OPAScopeInjected)) {
            body.put("OPAScopeInjected", request.OPAScopeInjected);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opaEnabled)) {
            body.put("OpaEnabled", request.opaEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openAgentPolicy)) {
            body.put("OpenAgentPolicy", request.openAgentPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundTrafficPolicy)) {
            body.put("OutboundTrafficPolicy", request.outboundTrafficPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pilotEnableQuicListeners)) {
            body.put("PilotEnableQuicListeners", request.pilotEnableQuicListeners);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prometheusUrl)) {
            body.put("PrometheusUrl", request.prometheusUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyInitCPUResourceLimit)) {
            body.put("ProxyInitCPUResourceLimit", request.proxyInitCPUResourceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyInitCPUResourceRequest)) {
            body.put("ProxyInitCPUResourceRequest", request.proxyInitCPUResourceRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyInitMemoryResourceLimit)) {
            body.put("ProxyInitMemoryResourceLimit", request.proxyInitMemoryResourceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyInitMemoryResourceRequest)) {
            body.put("ProxyInitMemoryResourceRequest", request.proxyInitMemoryResourceRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyLimitCPU)) {
            body.put("ProxyLimitCPU", request.proxyLimitCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyLimitMemory)) {
            body.put("ProxyLimitMemory", request.proxyLimitMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyRequestCPU)) {
            body.put("ProxyRequestCPU", request.proxyRequestCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyRequestMemory)) {
            body.put("ProxyRequestMemory", request.proxyRequestMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyStatsMatcher)) {
            body.put("ProxyStatsMatcher", request.proxyStatsMatcher);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redisFilterEnabled)) {
            body.put("RedisFilterEnabled", request.redisFilterEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SMCEnabled)) {
            body.put("SMCEnabled", request.SMCEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidecarInjectorLimitCPU)) {
            body.put("SidecarInjectorLimitCPU", request.sidecarInjectorLimitCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidecarInjectorLimitMemory)) {
            body.put("SidecarInjectorLimitMemory", request.sidecarInjectorLimitMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidecarInjectorRequestCPU)) {
            body.put("SidecarInjectorRequestCPU", request.sidecarInjectorRequestCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidecarInjectorRequestMemory)) {
            body.put("SidecarInjectorRequestMemory", request.sidecarInjectorRequestMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidecarInjectorWebhookAsYaml)) {
            body.put("SidecarInjectorWebhookAsYaml", request.sidecarInjectorWebhookAsYaml);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telemetry)) {
            body.put("Telemetry", request.telemetry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminationDrainDuration)) {
            body.put("TerminationDrainDuration", request.terminationDrainDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thriftFilterEnabled)) {
            body.put("ThriftFilterEnabled", request.thriftFilterEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceCustomTags)) {
            body.put("TraceCustomTags", request.traceCustomTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceMaxPathTagLength)) {
            body.put("TraceMaxPathTagLength", request.traceMaxPathTagLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceSampling)) {
            body.put("TraceSampling", request.traceSampling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracing)) {
            body.put("Tracing", request.tracing);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracingOnExtZipkinLimitCPU)) {
            body.put("TracingOnExtZipkinLimitCPU", request.tracingOnExtZipkinLimitCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracingOnExtZipkinLimitMemory)) {
            body.put("TracingOnExtZipkinLimitMemory", request.tracingOnExtZipkinLimitMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracingOnExtZipkinReplicaCount)) {
            body.put("TracingOnExtZipkinReplicaCount", request.tracingOnExtZipkinReplicaCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracingOnExtZipkinRequestCPU)) {
            body.put("TracingOnExtZipkinRequestCPU", request.tracingOnExtZipkinRequestCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracingOnExtZipkinRequestMemory)) {
            body.put("TracingOnExtZipkinRequestMemory", request.tracingOnExtZipkinRequestMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webAssemblyFilterEnabled)) {
            body.put("WebAssemblyFilterEnabled", request.webAssemblyFilterEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMeshFeature"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMeshFeatureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of a Service Mesh (ASM) instance.</p>
     * 
     * @param request UpdateMeshFeatureRequest
     * @return UpdateMeshFeatureResponse
     */
    public UpdateMeshFeatureResponse updateMeshFeature(UpdateMeshFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMeshFeatureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the network configurations of multiple Kubernetes clusters in a Service Mesh (ASM) instance.</p>
     * 
     * @param tmpReq UpdateMeshMultiClusterNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMeshMultiClusterNetworkResponse
     */
    public UpdateMeshMultiClusterNetworkResponse updateMeshMultiClusterNetworkWithOptions(UpdateMeshMultiClusterNetworkRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateMeshMultiClusterNetworkShrinkRequest request = new UpdateMeshMultiClusterNetworkShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.multiClusterNetworks)) {
            request.multiClusterNetworksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.multiClusterNetworks, "MultiClusterNetworks", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.multiClusterNetworksShrink)) {
            body.put("MultiClusterNetworks", request.multiClusterNetworksShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMeshMultiClusterNetwork"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMeshMultiClusterNetworkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the network configurations of multiple Kubernetes clusters in a Service Mesh (ASM) instance.</p>
     * 
     * @param request UpdateMeshMultiClusterNetworkRequest
     * @return UpdateMeshMultiClusterNetworkResponse
     */
    public UpdateMeshMultiClusterNetworkResponse updateMeshMultiClusterNetwork(UpdateMeshMultiClusterNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMeshMultiClusterNetworkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configurations of sidecar proxies at the namespace level.</p>
     * 
     * @param tmpReq UpdateNamespaceScopeSidecarConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNamespaceScopeSidecarConfigResponse
     */
    public UpdateNamespaceScopeSidecarConfigResponse updateNamespaceScopeSidecarConfigWithOptions(UpdateNamespaceScopeSidecarConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateNamespaceScopeSidecarConfigShrinkRequest request = new UpdateNamespaceScopeSidecarConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scaledSidecarResource)) {
            request.scaledSidecarResourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scaledSidecarResource, "ScaledSidecarResource", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrency)) {
            body.put("Concurrency", request.concurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableCoreDump)) {
            body.put("EnableCoreDump", request.enableCoreDump);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeIPRanges)) {
            body.put("ExcludeIPRanges", request.excludeIPRanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeInboundPorts)) {
            body.put("ExcludeInboundPorts", request.excludeInboundPorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeOutboundPorts)) {
            body.put("ExcludeOutboundPorts", request.excludeOutboundPorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.holdApplicationUntilProxyStarts)) {
            body.put("HoldApplicationUntilProxyStarts", request.holdApplicationUntilProxyStarts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeIPRanges)) {
            body.put("IncludeIPRanges", request.includeIPRanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeInboundPorts)) {
            body.put("IncludeInboundPorts", request.includeInboundPorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeOutboundPorts)) {
            body.put("IncludeOutboundPorts", request.includeOutboundPorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interceptionMode)) {
            body.put("InterceptionMode", request.interceptionMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.istioDNSProxyEnabled)) {
            body.put("IstioDNSProxyEnabled", request.istioDNSProxyEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycle)) {
            body.put("Lifecycle", request.lifecycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logLevel)) {
            body.put("LogLevel", request.logLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postStart)) {
            body.put("PostStart", request.postStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preStop)) {
            body.put("PreStop", request.preStop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privileged)) {
            body.put("Privileged", request.privileged);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyInitAckSloCPUResourceLimit)) {
            body.put("ProxyInitAckSloCPUResourceLimit", request.proxyInitAckSloCPUResourceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyInitAckSloCPUResourceRequest)) {
            body.put("ProxyInitAckSloCPUResourceRequest", request.proxyInitAckSloCPUResourceRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyInitAckSloMemoryResourceLimit)) {
            body.put("ProxyInitAckSloMemoryResourceLimit", request.proxyInitAckSloMemoryResourceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyInitAckSloMemoryResourceRequest)) {
            body.put("ProxyInitAckSloMemoryResourceRequest", request.proxyInitAckSloMemoryResourceRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyInitCPUResourceLimit)) {
            body.put("ProxyInitCPUResourceLimit", request.proxyInitCPUResourceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyInitCPUResourceRequest)) {
            body.put("ProxyInitCPUResourceRequest", request.proxyInitCPUResourceRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyInitMemoryResourceLimit)) {
            body.put("ProxyInitMemoryResourceLimit", request.proxyInitMemoryResourceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyInitMemoryResourceRequest)) {
            body.put("ProxyInitMemoryResourceRequest", request.proxyInitMemoryResourceRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyMetadata)) {
            body.put("ProxyMetadata", request.proxyMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyStatsMatcher)) {
            body.put("ProxyStatsMatcher", request.proxyStatsMatcher);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readinessFailureThreshold)) {
            body.put("ReadinessFailureThreshold", request.readinessFailureThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readinessInitialDelaySeconds)) {
            body.put("ReadinessInitialDelaySeconds", request.readinessInitialDelaySeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readinessPeriodSeconds)) {
            body.put("ReadinessPeriodSeconds", request.readinessPeriodSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeValues)) {
            body.put("RuntimeValues", request.runtimeValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SMCEnabled)) {
            body.put("SMCEnabled", request.SMCEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaledSidecarResourceShrink)) {
            body.put("ScaledSidecarResource", request.scaledSidecarResourceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidecarProxyAckSloCPUResourceLimit)) {
            body.put("SidecarProxyAckSloCPUResourceLimit", request.sidecarProxyAckSloCPUResourceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidecarProxyAckSloCPUResourceRequest)) {
            body.put("SidecarProxyAckSloCPUResourceRequest", request.sidecarProxyAckSloCPUResourceRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidecarProxyAckSloMemoryResourceLimit)) {
            body.put("SidecarProxyAckSloMemoryResourceLimit", request.sidecarProxyAckSloMemoryResourceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidecarProxyAckSloMemoryResourceRequest)) {
            body.put("SidecarProxyAckSloMemoryResourceRequest", request.sidecarProxyAckSloMemoryResourceRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidecarProxyCPUResourceLimit)) {
            body.put("SidecarProxyCPUResourceLimit", request.sidecarProxyCPUResourceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidecarProxyCPUResourceRequest)) {
            body.put("SidecarProxyCPUResourceRequest", request.sidecarProxyCPUResourceRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidecarProxyMemoryResourceLimit)) {
            body.put("SidecarProxyMemoryResourceLimit", request.sidecarProxyMemoryResourceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidecarProxyMemoryResourceRequest)) {
            body.put("SidecarProxyMemoryResourceRequest", request.sidecarProxyMemoryResourceRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminationDrainDuration)) {
            body.put("TerminationDrainDuration", request.terminationDrainDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracing)) {
            body.put("Tracing", request.tracing);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNamespaceScopeSidecarConfig"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNamespaceScopeSidecarConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configurations of sidecar proxies at the namespace level.</p>
     * 
     * @param request UpdateNamespaceScopeSidecarConfigRequest
     * @return UpdateNamespaceScopeSidecarConfigResponse
     */
    public UpdateNamespaceScopeSidecarConfigResponse updateNamespaceScopeSidecarConfig(UpdateNamespaceScopeSidecarConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNamespaceScopeSidecarConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a lane.</p>
     * 
     * @param request UpdateSwimLaneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSwimLaneResponse
     */
    public UpdateSwimLaneResponse updateSwimLaneWithOptions(UpdateSwimLaneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelSelectorKey)) {
            body.put("LabelSelectorKey", request.labelSelectorKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelSelectorValue)) {
            body.put("LabelSelectorValue", request.labelSelectorValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicesList)) {
            body.put("ServicesList", request.servicesList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.swimLaneName)) {
            body.put("SwimLaneName", request.swimLaneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSwimLane"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSwimLaneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a lane.</p>
     * 
     * @param request UpdateSwimLaneRequest
     * @return UpdateSwimLaneResponse
     */
    public UpdateSwimLaneResponse updateSwimLane(UpdateSwimLaneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSwimLaneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information of a lane group.</p>
     * 
     * @param request UpdateSwimLaneGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSwimLaneGroupResponse
     */
    public UpdateSwimLaneGroupResponse updateSwimLaneGroupWithOptions(UpdateSwimLaneGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fallbackTarget)) {
            body.put("FallbackTarget", request.fallbackTarget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressRoutingStrategy)) {
            body.put("IngressRoutingStrategy", request.ingressRoutingStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceLevelFallbackTarget)) {
            body.put("ServiceLevelFallbackTarget", request.serviceLevelFallbackTarget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicesList)) {
            body.put("ServicesList", request.servicesList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weightedIngressRule)) {
            body.put("WeightedIngressRule", request.weightedIngressRule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSwimLaneGroup"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSwimLaneGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information of a lane group.</p>
     * 
     * @param request UpdateSwimLaneGroupRequest
     * @return UpdateSwimLaneGroupResponse
     */
    public UpdateSwimLaneGroupResponse updateSwimLaneGroup(UpdateSwimLaneGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSwimLaneGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新Waypoint</p>
     * 
     * @param request UpdateWaypointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWaypointResponse
     */
    public UpdateWaypointResponse updateWaypointWithOptions(UpdateWaypointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.HPAEnabled)) {
            body.put("HPAEnabled", request.HPAEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.HPAMaxReplicas)) {
            body.put("HPAMaxReplicas", request.HPAMaxReplicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.HPAMinReplicas)) {
            body.put("HPAMinReplicas", request.HPAMinReplicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.HPATargetCPU)) {
            body.put("HPATargetCPU", request.HPATargetCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.HPATargetMemory)) {
            body.put("HPATargetMemory", request.HPATargetMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitCPU)) {
            body.put("LimitCPU", request.limitCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitMemory)) {
            body.put("LimitMemory", request.limitMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferECI)) {
            body.put("PreferECI", request.preferECI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            body.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestCPU)) {
            body.put("RequestCPU", request.requestCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestMemory)) {
            body.put("RequestMemory", request.requestMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWaypoint"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWaypointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新Waypoint</p>
     * 
     * @param request UpdateWaypointRequest
     * @return UpdateWaypointResponse
     */
    public UpdateWaypointResponse updateWaypoint(UpdateWaypointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWaypointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades a Service Mesh (ASM) instance to Professional Edition that is commercially released.</p>
     * 
     * @param request UpgradeMeshEditionPartiallyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeMeshEditionPartiallyResponse
     */
    public UpgradeMeshEditionPartiallyResponse upgradeMeshEditionPartiallyWithOptions(UpgradeMeshEditionPartiallyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ASMGatewayContinue)) {
            body.put("ASMGatewayContinue", request.ASMGatewayContinue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectedVersion)) {
            body.put("ExpectedVersion", request.expectedVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preCheck)) {
            body.put("PreCheck", request.preCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchToPro)) {
            body.put("SwitchToPro", request.switchToPro);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeGatewayRecords)) {
            body.put("UpgradeGatewayRecords", request.upgradeGatewayRecords);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeMeshEditionPartially"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeMeshEditionPartiallyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades a Service Mesh (ASM) instance to Professional Edition that is commercially released.</p>
     * 
     * @param request UpgradeMeshEditionPartiallyRequest
     * @return UpgradeMeshEditionPartiallyResponse
     */
    public UpgradeMeshEditionPartiallyResponse upgradeMeshEditionPartially(UpgradeMeshEditionPartiallyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeMeshEditionPartiallyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the version of a Service Mesh (ASM) instance.</p>
     * 
     * @param request UpgradeMeshVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeMeshVersionResponse
     */
    public UpgradeMeshVersionResponse upgradeMeshVersionWithOptions(UpgradeMeshVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.preCheck)) {
            query.put("PreCheck", request.preCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeMeshVersion"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeMeshVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the version of a Service Mesh (ASM) instance.</p>
     * 
     * @param request UpgradeMeshVersionRequest
     * @return UpgradeMeshVersionResponse
     */
    public UpgradeMeshVersionResponse upgradeMeshVersion(UpgradeMeshVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeMeshVersionWithOptions(request, runtime);
    }
}

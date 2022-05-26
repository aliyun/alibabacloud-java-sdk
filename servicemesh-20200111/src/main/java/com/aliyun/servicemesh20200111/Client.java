// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111;

import com.aliyun.tea.*;
import com.aliyun.servicemesh20200111.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
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

    public AddClusterIntoServiceMeshResponse addClusterIntoServiceMeshWithOptions(AddClusterIntoServiceMeshRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddClusterIntoServiceMeshResponse addClusterIntoServiceMesh(AddClusterIntoServiceMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addClusterIntoServiceMeshWithOptions(request, runtime);
    }

    public AddVMIntoServiceMeshResponse addVMIntoServiceMeshWithOptions(AddVMIntoServiceMeshRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecsId)) {
            query.put("EcsId", request.ecsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddVMIntoServiceMeshResponse addVMIntoServiceMesh(AddVMIntoServiceMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addVMIntoServiceMeshWithOptions(request, runtime);
    }

    public CreateASMGatewayResponse createASMGatewayWithOptions(CreateASMGatewayRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateASMGatewayResponse createASMGateway(CreateASMGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createASMGatewayWithOptions(request, runtime);
    }

    public CreateGatewaySecretResponse createGatewaySecretWithOptions(CreateGatewaySecretRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateGatewaySecretResponse createGatewaySecret(CreateGatewaySecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGatewaySecretWithOptions(request, runtime);
    }

    public CreateIstioGatewayDomainsResponse createIstioGatewayDomainsWithOptions(CreateIstioGatewayDomainsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateIstioGatewayDomainsResponse createIstioGatewayDomains(CreateIstioGatewayDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIstioGatewayDomainsWithOptions(request, runtime);
    }

    public CreateIstioGatewayRoutesResponse createIstioGatewayRoutesWithOptions(CreateIstioGatewayRoutesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateIstioGatewayRoutesShrinkRequest request = new CreateIstioGatewayRoutesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.gatewayRoute))) {
            request.gatewayRouteShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.gatewayRoute), "GatewayRoute", "json");
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateIstioGatewayRoutesResponse createIstioGatewayRoutes(CreateIstioGatewayRoutesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIstioGatewayRoutesWithOptions(request, runtime);
    }

    public CreateServiceMeshResponse createServiceMeshWithOptions(CreateServiceMeshRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("ChargeType", request.chargeType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.filterGatewayClusterConfig)) {
            body.put("FilterGatewayClusterConfig", request.filterGatewayClusterConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayAPIEnabled)) {
            body.put("GatewayAPIEnabled", request.gatewayAPIEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalRateLimitEnabled)) {
            body.put("GlobalRateLimitEnabled", request.globalRateLimitEnabled);
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

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitches)) {
            body.put("VSwitches", request.vSwitches);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webAssemblyFilterEnabled)) {
            body.put("WebAssemblyFilterEnabled", request.webAssemblyFilterEnabled);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateServiceMeshResponse createServiceMesh(CreateServiceMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceMeshWithOptions(request, runtime);
    }

    public DeleteGatewayRouteResponse deleteGatewayRouteWithOptions(DeleteGatewayRouteRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteGatewayRouteResponse deleteGatewayRoute(DeleteGatewayRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGatewayRouteWithOptions(request, runtime);
    }

    public DeleteGatewaySecretResponse deleteGatewaySecretWithOptions(DeleteGatewaySecretRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteGatewaySecretResponse deleteGatewaySecret(DeleteGatewaySecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGatewaySecretWithOptions(request, runtime);
    }

    public DeleteIstioGatewayDomainsResponse deleteIstioGatewayDomainsWithOptions(DeleteIstioGatewayDomainsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteIstioGatewayDomainsResponse deleteIstioGatewayDomains(DeleteIstioGatewayDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIstioGatewayDomainsWithOptions(request, runtime);
    }

    public DeleteServiceMeshResponse deleteServiceMeshWithOptions(DeleteServiceMeshRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteServiceMeshResponse deleteServiceMesh(DeleteServiceMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteServiceMeshWithOptions(request, runtime);
    }

    public DescribeASMGatewayImportedServicesResponse describeASMGatewayImportedServicesWithOptions(DescribeASMGatewayImportedServicesRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeASMGatewayImportedServicesResponse describeASMGatewayImportedServices(DescribeASMGatewayImportedServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeASMGatewayImportedServicesWithOptions(request, runtime);
    }

    public DescribeAhasProResponse describeAhasProWithOptions(DescribeAhasProRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAhasPro"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAhasProResponse());
    }

    public DescribeAhasProResponse describeAhasPro(DescribeAhasProRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAhasProWithOptions(request, runtime);
    }

    public DescribeCCMVersionResponse describeCCMVersionWithOptions(DescribeCCMVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeCCMVersionResponse describeCCMVersion(DescribeCCMVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCCMVersionWithOptions(request, runtime);
    }

    public DescribeCensResponse describeCensWithOptions(DescribeCensRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeCensResponse describeCens(DescribeCensRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCensWithOptions(request, runtime);
    }

    public DescribeClusterGrafanaResponse describeClusterGrafanaWithOptions(DescribeClusterGrafanaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.k8sClusterId)) {
            query.put("K8sClusterId", request.k8sClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeClusterGrafanaResponse describeClusterGrafana(DescribeClusterGrafanaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterGrafanaWithOptions(request, runtime);
    }

    public DescribeClusterPrometheusResponse describeClusterPrometheusWithOptions(DescribeClusterPrometheusRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeClusterPrometheusResponse describeClusterPrometheus(DescribeClusterPrometheusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterPrometheusWithOptions(request, runtime);
    }

    public DescribeClustersInServiceMeshResponse describeClustersInServiceMeshWithOptions(DescribeClustersInServiceMeshRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeClustersInServiceMeshResponse describeClustersInServiceMesh(DescribeClustersInServiceMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClustersInServiceMeshWithOptions(request, runtime);
    }

    public DescribeCrTemplatesResponse describeCrTemplatesWithOptions(DescribeCrTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.istioVersion)) {
            body.put("IstioVersion", request.istioVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kind)) {
            body.put("Kind", request.kind);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeCrTemplatesResponse describeCrTemplates(DescribeCrTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCrTemplatesWithOptions(request, runtime);
    }

    public DescribeEipResourcesResponse describeEipResourcesWithOptions(DescribeEipResourcesRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeEipResourcesResponse describeEipResources(DescribeEipResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEipResourcesWithOptions(request, runtime);
    }

    public DescribeGatewaySecretDetailsResponse describeGatewaySecretDetailsWithOptions(DescribeGatewaySecretDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.istioGatewayName)) {
            body.put("IstioGatewayName", request.istioGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeGatewaySecretDetailsResponse describeGatewaySecretDetails(DescribeGatewaySecretDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewaySecretDetailsWithOptions(request, runtime);
    }

    public DescribeGuestClusterAccessLogDashboardsResponse describeGuestClusterAccessLogDashboardsWithOptions(DescribeGuestClusterAccessLogDashboardsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.k8sClusterId)) {
            body.put("K8sClusterId", request.k8sClusterId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeGuestClusterAccessLogDashboardsResponse describeGuestClusterAccessLogDashboards(DescribeGuestClusterAccessLogDashboardsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGuestClusterAccessLogDashboardsWithOptions(request, runtime);
    }

    public DescribeGuestClusterNamespacesResponse describeGuestClusterNamespacesWithOptions(DescribeGuestClusterNamespacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.guestClusterID)) {
            body.put("GuestClusterID", request.guestClusterID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeGuestClusterNamespacesResponse describeGuestClusterNamespaces(DescribeGuestClusterNamespacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGuestClusterNamespacesWithOptions(request, runtime);
    }

    public DescribeGuestClusterPodsResponse describeGuestClusterPodsWithOptions(DescribeGuestClusterPodsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeGuestClusterPodsResponse describeGuestClusterPods(DescribeGuestClusterPodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGuestClusterPodsWithOptions(request, runtime);
    }

    public DescribeImportedServicesDetailResponse describeImportedServicesDetailWithOptions(DescribeImportedServicesDetailRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeImportedServicesDetailResponse describeImportedServicesDetail(DescribeImportedServicesDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImportedServicesDetailWithOptions(request, runtime);
    }

    public DescribeIngressGatewaysResponse describeIngressGatewaysWithOptions(DescribeIngressGatewaysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIngressGateways"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIngressGatewaysResponse());
    }

    public DescribeIngressGatewaysResponse describeIngressGateways(DescribeIngressGatewaysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIngressGatewaysWithOptions(request, runtime);
    }

    public DescribeIstioGatewayDomainsResponse describeIstioGatewayDomainsWithOptions(DescribeIstioGatewayDomainsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeIstioGatewayDomainsResponse describeIstioGatewayDomains(DescribeIstioGatewayDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIstioGatewayDomainsWithOptions(request, runtime);
    }

    public DescribeIstioGatewayRouteDetailResponse describeIstioGatewayRouteDetailWithOptions(DescribeIstioGatewayRouteDetailRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeIstioGatewayRouteDetailResponse describeIstioGatewayRouteDetail(DescribeIstioGatewayRouteDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIstioGatewayRouteDetailWithOptions(request, runtime);
    }

    public DescribeIstioGatewayRoutesResponse describeIstioGatewayRoutesWithOptions(DescribeIstioGatewayRoutesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.istioGatewayName)) {
            body.put("IstioGatewayName", request.istioGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeIstioGatewayRoutesResponse describeIstioGatewayRoutes(DescribeIstioGatewayRoutesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIstioGatewayRoutesWithOptions(request, runtime);
    }

    public DescribeMeshWorkloadVersionStatusResponse describeMeshWorkloadVersionStatusWithOptions(DescribeMeshWorkloadVersionStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeshWorkloadVersionStatus"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeshWorkloadVersionStatusResponse());
    }

    public DescribeMeshWorkloadVersionStatusResponse describeMeshWorkloadVersionStatus(DescribeMeshWorkloadVersionStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeshWorkloadVersionStatusWithOptions(request, runtime);
    }

    public DescribeNamespaceScopeSidecarConfigResponse describeNamespaceScopeSidecarConfigWithOptions(DescribeNamespaceScopeSidecarConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeNamespaceScopeSidecarConfigResponse describeNamespaceScopeSidecarConfig(DescribeNamespaceScopeSidecarConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNamespaceScopeSidecarConfigWithOptions(request, runtime);
    }

    public DescribeNodesInstanceTypeResponse describeNodesInstanceTypeWithOptions(DescribeNodesInstanceTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeNodesInstanceTypeResponse describeNodesInstanceType(DescribeNodesInstanceTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNodesInstanceTypeWithOptions(request, runtime);
    }

    public DescribeReusableSlbResponse describeReusableSlbWithOptions(DescribeReusableSlbRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.k8sClusterId)) {
            body.put("K8sClusterId", request.k8sClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            body.put("NetworkType", request.networkType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeReusableSlbResponse describeReusableSlb(DescribeReusableSlbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeReusableSlbWithOptions(request, runtime);
    }

    public DescribeServiceMeshAdditionalStatusResponse describeServiceMeshAdditionalStatusWithOptions(DescribeServiceMeshAdditionalStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkMode)) {
            body.put("CheckMode", request.checkMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeServiceMeshAdditionalStatusResponse describeServiceMeshAdditionalStatus(DescribeServiceMeshAdditionalStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshAdditionalStatusWithOptions(request, runtime);
    }

    public DescribeServiceMeshClustersResponse describeServiceMeshClustersWithOptions(DescribeServiceMeshClustersRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeServiceMeshClustersResponse describeServiceMeshClusters(DescribeServiceMeshClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshClustersWithOptions(request, runtime);
    }

    public DescribeServiceMeshDetailResponse describeServiceMeshDetailWithOptions(DescribeServiceMeshDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeServiceMeshDetailResponse describeServiceMeshDetail(DescribeServiceMeshDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshDetailWithOptions(request, runtime);
    }

    public DescribeServiceMeshKubeconfigResponse describeServiceMeshKubeconfigWithOptions(DescribeServiceMeshKubeconfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            query.put("PrivateIpAddress", request.privateIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeServiceMeshKubeconfigResponse describeServiceMeshKubeconfig(DescribeServiceMeshKubeconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshKubeconfigWithOptions(request, runtime);
    }

    public DescribeServiceMeshLogsResponse describeServiceMeshLogsWithOptions(DescribeServiceMeshLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeServiceMeshLogsResponse describeServiceMeshLogs(DescribeServiceMeshLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshLogsWithOptions(request, runtime);
    }

    public DescribeServiceMeshProxyStatusResponse describeServiceMeshProxyStatusWithOptions(DescribeServiceMeshProxyStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeServiceMeshProxyStatusResponse describeServiceMeshProxyStatus(DescribeServiceMeshProxyStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshProxyStatusWithOptions(request, runtime);
    }

    public DescribeServiceMeshServiceLabelResponse describeServiceMeshServiceLabelWithOptions(DescribeServiceMeshServiceLabelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceNames)) {
            body.put("ServiceNames", request.serviceNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceNamespaces)) {
            body.put("ServiceNamespaces", request.serviceNamespaces);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceMeshServiceLabel"),
            new TeaPair("version", "2020-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceMeshServiceLabelResponse());
    }

    public DescribeServiceMeshServiceLabelResponse describeServiceMeshServiceLabel(DescribeServiceMeshServiceLabelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshServiceLabelWithOptions(request, runtime);
    }

    public DescribeServiceMeshUpgradeStatusResponse describeServiceMeshUpgradeStatusWithOptions(DescribeServiceMeshUpgradeStatusRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeServiceMeshUpgradeStatusResponse describeServiceMeshUpgradeStatus(DescribeServiceMeshUpgradeStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshUpgradeStatusWithOptions(request, runtime);
    }

    public DescribeServiceMeshVMsResponse describeServiceMeshVMsWithOptions(DescribeServiceMeshVMsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeServiceMeshVMsResponse describeServiceMeshVMs(DescribeServiceMeshVMsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshVMsWithOptions(request, runtime);
    }

    public DescribeServiceMeshesResponse describeServiceMeshesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeServiceMeshesResponse describeServiceMeshes() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshesWithOptions(runtime);
    }

    public DescribeUpgradeVersionResponse describeUpgradeVersionWithOptions(DescribeUpgradeVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeUpgradeVersionResponse describeUpgradeVersion(DescribeUpgradeVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUpgradeVersionWithOptions(request, runtime);
    }

    public DescribeUserPermissionsResponse describeUserPermissionsWithOptions(DescribeUserPermissionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subAccountUserId)) {
            body.put("SubAccountUserId", request.subAccountUserId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeUserPermissionsResponse describeUserPermissions(DescribeUserPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserPermissionsWithOptions(request, runtime);
    }

    public DescribeUsersWithPermissionsResponse describeUsersWithPermissionsWithOptions(DescribeUsersWithPermissionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            body.put("UserType", request.userType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeUsersWithPermissionsResponse describeUsersWithPermissions(DescribeUsersWithPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUsersWithPermissionsWithOptions(request, runtime);
    }

    public DescribeVMsInServiceMeshResponse describeVMsInServiceMeshWithOptions(DescribeVMsInServiceMeshRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeVMsInServiceMeshResponse describeVMsInServiceMesh(DescribeVMsInServiceMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVMsInServiceMeshWithOptions(request, runtime);
    }

    public DescribeVSwitchesResponse describeVSwitchesWithOptions(DescribeVSwitchesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeVSwitchesResponse describeVSwitches(DescribeVSwitchesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVSwitchesWithOptions(request, runtime);
    }

    public DescribeVersionsResponse describeVersionsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeVersionsResponse describeVersions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVersionsWithOptions(runtime);
    }

    public DescribeVpcsResponse describeVpcsWithOptions(DescribeVpcsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeVpcsResponse describeVpcs(DescribeVpcsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcsWithOptions(request, runtime);
    }

    public GetCaCertResponse getCaCertWithOptions(GetCaCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetCaCertResponse getCaCert(GetCaCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCaCertWithOptions(request, runtime);
    }

    public GetRegisteredServiceEndpointsResponse getRegisteredServiceEndpointsWithOptions(GetRegisteredServiceEndpointsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetRegisteredServiceEndpointsResponse getRegisteredServiceEndpoints(GetRegisteredServiceEndpointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRegisteredServiceEndpointsWithOptions(request, runtime);
    }

    public GetRegisteredServiceNamespacesResponse getRegisteredServiceNamespacesWithOptions(GetRegisteredServiceNamespacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetRegisteredServiceNamespacesResponse getRegisteredServiceNamespaces(GetRegisteredServiceNamespacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRegisteredServiceNamespacesWithOptions(request, runtime);
    }

    public GetVmAppMeshInfoResponse getVmAppMeshInfoWithOptions(GetVmAppMeshInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetVmAppMeshInfoResponse getVmAppMeshInfo(GetVmAppMeshInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVmAppMeshInfoWithOptions(request, runtime);
    }

    public GetVmMetaResponse getVmMetaWithOptions(GetVmMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetVmMetaResponse getVmMeta(GetVmMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVmMetaWithOptions(request, runtime);
    }

    public GrantUserPermissionsResponse grantUserPermissionsWithOptions(GrantUserPermissionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.permissions)) {
            body.put("Permissions", request.permissions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subAccountUserId)) {
            body.put("SubAccountUserId", request.subAccountUserId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GrantUserPermissionsResponse grantUserPermissions(GrantUserPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantUserPermissionsWithOptions(request, runtime);
    }

    public ModifyApiServerEipResourceResponse modifyApiServerEipResourceWithOptions(ModifyApiServerEipResourceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ModifyApiServerEipResourceResponse modifyApiServerEipResource(ModifyApiServerEipResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyApiServerEipResourceWithOptions(request, runtime);
    }

    public ModifyServiceMeshNameResponse modifyServiceMeshNameWithOptions(ModifyServiceMeshNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ModifyServiceMeshNameResponse modifyServiceMeshName(ModifyServiceMeshNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyServiceMeshNameWithOptions(request, runtime);
    }

    public ReActivateAuditResponse reActivateAuditWithOptions(ReActivateAuditRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableAudit)) {
            body.put("EnableAudit", request.enableAudit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ReActivateAuditResponse reActivateAudit(ReActivateAuditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reActivateAuditWithOptions(request, runtime);
    }

    public RemoveClusterFromServiceMeshResponse removeClusterFromServiceMeshWithOptions(RemoveClusterFromServiceMeshRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RemoveClusterFromServiceMeshResponse removeClusterFromServiceMesh(RemoveClusterFromServiceMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeClusterFromServiceMeshWithOptions(request, runtime);
    }

    public RemoveVMFromServiceMeshResponse removeVMFromServiceMeshWithOptions(RemoveVMFromServiceMeshRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecsId)) {
            query.put("EcsId", request.ecsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RemoveVMFromServiceMeshResponse removeVMFromServiceMesh(RemoveVMFromServiceMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeVMFromServiceMeshWithOptions(request, runtime);
    }

    public RevokeKubeconfigResponse revokeKubeconfigWithOptions(RevokeKubeconfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            body.put("PrivateIpAddress", request.privateIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RevokeKubeconfigResponse revokeKubeconfig(RevokeKubeconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeKubeconfigWithOptions(request, runtime);
    }

    public UpdateASMGatewayResponse updateASMGatewayWithOptions(UpdateASMGatewayRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateASMGatewayResponse updateASMGateway(UpdateASMGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateASMGatewayWithOptions(request, runtime);
    }

    public UpdateASMGatewayImportedServicesResponse updateASMGatewayImportedServicesWithOptions(UpdateASMGatewayImportedServicesRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateASMGatewayImportedServicesResponse updateASMGatewayImportedServices(UpdateASMGatewayImportedServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateASMGatewayImportedServicesWithOptions(request, runtime);
    }

    public UpdateIstioGatewayRoutesResponse updateIstioGatewayRoutesWithOptions(UpdateIstioGatewayRoutesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateIstioGatewayRoutesShrinkRequest request = new UpdateIstioGatewayRoutesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.gatewayRoute))) {
            request.gatewayRouteShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.gatewayRoute), "GatewayRoute", "json");
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateIstioGatewayRoutesResponse updateIstioGatewayRoutes(UpdateIstioGatewayRoutesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIstioGatewayRoutesWithOptions(request, runtime);
    }

    public UpdateIstioRouteAdditionalStatusResponse updateIstioRouteAdditionalStatusWithOptions(UpdateIstioRouteAdditionalStatusRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateIstioRouteAdditionalStatusResponse updateIstioRouteAdditionalStatus(UpdateIstioRouteAdditionalStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIstioRouteAdditionalStatusWithOptions(request, runtime);
    }

    public UpdateMeshCRAggregationResponse updateMeshCRAggregationWithOptions(UpdateMeshCRAggregationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateMeshCRAggregationResponse updateMeshCRAggregation(UpdateMeshCRAggregationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMeshCRAggregationWithOptions(request, runtime);
    }

    public UpdateMeshFeatureResponse updateMeshFeatureWithOptions(UpdateMeshFeatureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(request.auditProject)) {
            body.put("AuditProject", request.auditProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoInjectionPolicyEnabled)) {
            body.put("AutoInjectionPolicyEnabled", request.autoInjectionPolicyEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CRAggregationEnabled)) {
            body.put("CRAggregationEnabled", request.CRAggregationEnabled);
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

        if (!com.aliyun.teautil.Common.isUnset(request.discoverySelectors)) {
            body.put("DiscoverySelectors", request.discoverySelectors);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dubboFilterEnabled)) {
            body.put("DubboFilterEnabled", request.dubboFilterEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAudit)) {
            body.put("EnableAudit", request.enableAudit);
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

        if (!com.aliyun.teautil.Common.isUnset(request.filterGatewayClusterConfig)) {
            body.put("FilterGatewayClusterConfig", request.filterGatewayClusterConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayAPIEnabled)) {
            body.put("GatewayAPIEnabled", request.gatewayAPIEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalRateLimitEnabled)) {
            body.put("GlobalRateLimitEnabled", request.globalRateLimitEnabled);
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

        if (!com.aliyun.teautil.Common.isUnset(request.integrateKiali)) {
            body.put("IntegrateKiali", request.integrateKiali);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kialiEnabled)) {
            body.put("KialiEnabled", request.kialiEnabled);
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

        if (!com.aliyun.teautil.Common.isUnset(request.redisFilterEnabled)) {
            body.put("RedisFilterEnabled", request.redisFilterEnabled);
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

        if (!com.aliyun.teautil.Common.isUnset(request.traceSampling)) {
            body.put("TraceSampling", request.traceSampling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracing)) {
            body.put("Tracing", request.tracing);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webAssemblyFilterEnabled)) {
            body.put("WebAssemblyFilterEnabled", request.webAssemblyFilterEnabled);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateMeshFeatureResponse updateMeshFeature(UpdateMeshFeatureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMeshFeatureWithOptions(request, runtime);
    }

    public UpdateNamespaceScopeSidecarConfigResponse updateNamespaceScopeSidecarConfigWithOptions(UpdateNamespaceScopeSidecarConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrency)) {
            body.put("Concurrency", request.concurrency);
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

        if (!com.aliyun.teautil.Common.isUnset(request.proxyStatsMatcher)) {
            body.put("ProxyStatsMatcher", request.proxyStatsMatcher);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            body.put("ServiceMeshId", request.serviceMeshId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateNamespaceScopeSidecarConfigResponse updateNamespaceScopeSidecarConfig(UpdateNamespaceScopeSidecarConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNamespaceScopeSidecarConfigWithOptions(request, runtime);
    }

    public UpgradeMeshEditionPartiallyResponse upgradeMeshEditionPartiallyWithOptions(UpgradeMeshEditionPartiallyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ASMGatewayContinue)) {
            body.put("ASMGatewayContinue", request.ASMGatewayContinue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectedVersion)) {
            body.put("ExpectedVersion", request.expectedVersion);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpgradeMeshEditionPartiallyResponse upgradeMeshEditionPartially(UpgradeMeshEditionPartiallyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeMeshEditionPartiallyWithOptions(request, runtime);
    }

    public UpgradeMeshVersionResponse upgradeMeshVersionWithOptions(UpgradeMeshVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceMeshId)) {
            query.put("ServiceMeshId", request.serviceMeshId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpgradeMeshVersionResponse upgradeMeshVersion(UpgradeMeshVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeMeshVersionWithOptions(request, runtime);
    }
}

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

    public RunDiagnosisResponse runDiagnosisWithOptions(RunDiagnosisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunDiagnosis", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new RunDiagnosisResponse());
    }

    public RunDiagnosisResponse runDiagnosis(RunDiagnosisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runDiagnosisWithOptions(request, runtime);
    }

    public DescribeGuestClusterAccessLogDashboardsResponse describeGuestClusterAccessLogDashboardsWithOptions(DescribeGuestClusterAccessLogDashboardsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGuestClusterAccessLogDashboards", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGuestClusterAccessLogDashboardsResponse());
    }

    public DescribeGuestClusterAccessLogDashboardsResponse describeGuestClusterAccessLogDashboards(DescribeGuestClusterAccessLogDashboardsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGuestClusterAccessLogDashboardsWithOptions(request, runtime);
    }

    public ListBuiltinEnvoyFilterResponse listBuiltinEnvoyFilterWithOptions(ListBuiltinEnvoyFilterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBuiltinEnvoyFilter", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListBuiltinEnvoyFilterResponse());
    }

    public ListBuiltinEnvoyFilterResponse listBuiltinEnvoyFilter(ListBuiltinEnvoyFilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBuiltinEnvoyFilterWithOptions(request, runtime);
    }

    public DescribeServiceMeshesResponse describeServiceMeshesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeServiceMeshes", "2020-01-11", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeServiceMeshesResponse());
    }

    public DescribeServiceMeshesResponse describeServiceMeshes() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshesWithOptions(runtime);
    }

    public ModifyBuiltinEnvoyFilterResponse modifyBuiltinEnvoyFilterWithOptions(ModifyBuiltinEnvoyFilterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBuiltinEnvoyFilter", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBuiltinEnvoyFilterResponse());
    }

    public ModifyBuiltinEnvoyFilterResponse modifyBuiltinEnvoyFilter(ModifyBuiltinEnvoyFilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBuiltinEnvoyFilterWithOptions(request, runtime);
    }

    public DescribeAvailableNacosInstancesResponse describeAvailableNacosInstancesWithOptions(DescribeAvailableNacosInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableNacosInstances", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableNacosInstancesResponse());
    }

    public DescribeAvailableNacosInstancesResponse describeAvailableNacosInstances(DescribeAvailableNacosInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableNacosInstancesWithOptions(request, runtime);
    }

    public DescribeIngressGatewaysResponse describeIngressGatewaysWithOptions(DescribeIngressGatewaysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIngressGateways", "2020-01-11", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeIngressGatewaysResponse());
    }

    public DescribeIngressGatewaysResponse describeIngressGateways(DescribeIngressGatewaysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIngressGatewaysWithOptions(request, runtime);
    }

    public DescribeServiceMeshDetailResponse describeServiceMeshDetailWithOptions(DescribeServiceMeshDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeServiceMeshDetail", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeServiceMeshDetailResponse());
    }

    public DescribeServiceMeshDetailResponse describeServiceMeshDetail(DescribeServiceMeshDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshDetailWithOptions(request, runtime);
    }

    public UpgradeMeshVersionResponse upgradeMeshVersionWithOptions(UpgradeMeshVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeMeshVersion", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeMeshVersionResponse());
    }

    public UpgradeMeshVersionResponse upgradeMeshVersion(UpgradeMeshVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeMeshVersionWithOptions(request, runtime);
    }

    public DescribeServiceMeshKubeconfigResponse describeServiceMeshKubeconfigWithOptions(DescribeServiceMeshKubeconfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeServiceMeshKubeconfig", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeServiceMeshKubeconfigResponse());
    }

    public DescribeServiceMeshKubeconfigResponse describeServiceMeshKubeconfig(DescribeServiceMeshKubeconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshKubeconfigWithOptions(request, runtime);
    }

    public GetCaCertResponse getCaCertWithOptions(GetCaCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCaCert", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetCaCertResponse());
    }

    public GetCaCertResponse getCaCert(GetCaCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCaCertWithOptions(request, runtime);
    }

    public GetServiceMeshSlbResponse getServiceMeshSlbWithOptions(GetServiceMeshSlbRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetServiceMeshSlb", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetServiceMeshSlbResponse());
    }

    public GetServiceMeshSlbResponse getServiceMeshSlb(GetServiceMeshSlbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getServiceMeshSlbWithOptions(request, runtime);
    }

    public GetRegisteredServiceEndpointsResponse getRegisteredServiceEndpointsWithOptions(GetRegisteredServiceEndpointsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRegisteredServiceEndpoints", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetRegisteredServiceEndpointsResponse());
    }

    public GetRegisteredServiceEndpointsResponse getRegisteredServiceEndpoints(GetRegisteredServiceEndpointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRegisteredServiceEndpointsWithOptions(request, runtime);
    }

    public GetAutoInjectionLabelSyncStatusResponse getAutoInjectionLabelSyncStatusWithOptions(GetAutoInjectionLabelSyncStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAutoInjectionLabelSyncStatus", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetAutoInjectionLabelSyncStatusResponse());
    }

    public GetAutoInjectionLabelSyncStatusResponse getAutoInjectionLabelSyncStatus(GetAutoInjectionLabelSyncStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAutoInjectionLabelSyncStatusWithOptions(request, runtime);
    }

    public GetRegisteredServiceNamespacesResponse getRegisteredServiceNamespacesWithOptions(GetRegisteredServiceNamespacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRegisteredServiceNamespaces", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetRegisteredServiceNamespacesResponse());
    }

    public GetRegisteredServiceNamespacesResponse getRegisteredServiceNamespaces(GetRegisteredServiceNamespacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRegisteredServiceNamespacesWithOptions(request, runtime);
    }

    public DescribeVSwitchesResponse describeVSwitchesWithOptions(DescribeVSwitchesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVSwitches", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVSwitchesResponse());
    }

    public DescribeVSwitchesResponse describeVSwitches(DescribeVSwitchesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVSwitchesWithOptions(request, runtime);
    }

    public DescribeVpcsResponse describeVpcsWithOptions(DescribeVpcsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVpcs", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVpcsResponse());
    }

    public DescribeVpcsResponse describeVpcs(DescribeVpcsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcsWithOptions(request, runtime);
    }

    public RemoveVmAppFromMeshResponse removeVmAppFromMeshWithOptions(RemoveVmAppFromMeshRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveVmAppFromMesh", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveVmAppFromMeshResponse());
    }

    public RemoveVmAppFromMeshResponse removeVmAppFromMesh(RemoveVmAppFromMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeVmAppFromMeshWithOptions(request, runtime);
    }

    public DescribeClusterPrometheusResponse describeClusterPrometheusWithOptions(DescribeClusterPrometheusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterPrometheus", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterPrometheusResponse());
    }

    public DescribeClusterPrometheusResponse describeClusterPrometheus(DescribeClusterPrometheusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterPrometheusWithOptions(request, runtime);
    }

    public UpdateIstioInjectionConfigResponse updateIstioInjectionConfigWithOptions(UpdateIstioInjectionConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateIstioInjectionConfig", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateIstioInjectionConfigResponse());
    }

    public UpdateIstioInjectionConfigResponse updateIstioInjectionConfig(UpdateIstioInjectionConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIstioInjectionConfigWithOptions(request, runtime);
    }

    public GetVmMetaResponse getVmMetaWithOptions(GetVmMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVmMeta", "2020-01-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetVmMetaResponse());
    }

    public GetVmMetaResponse getVmMeta(GetVmMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVmMetaWithOptions(request, runtime);
    }

    public DescribeUpgradeVersionResponse describeUpgradeVersionWithOptions(DescribeUpgradeVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUpgradeVersion", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUpgradeVersionResponse());
    }

    public DescribeUpgradeVersionResponse describeUpgradeVersion(DescribeUpgradeVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUpgradeVersionWithOptions(request, runtime);
    }

    public DescribeClustersInServiceMeshResponse describeClustersInServiceMeshWithOptions(DescribeClustersInServiceMeshRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClustersInServiceMesh", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClustersInServiceMeshResponse());
    }

    public DescribeClustersInServiceMeshResponse describeClustersInServiceMesh(DescribeClustersInServiceMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClustersInServiceMeshWithOptions(request, runtime);
    }

    public GetBuiltinEnvoyFilterCatalogResponse getBuiltinEnvoyFilterCatalogWithOptions(GetBuiltinEnvoyFilterCatalogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBuiltinEnvoyFilterCatalog", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetBuiltinEnvoyFilterCatalogResponse());
    }

    public GetBuiltinEnvoyFilterCatalogResponse getBuiltinEnvoyFilterCatalog(GetBuiltinEnvoyFilterCatalogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBuiltinEnvoyFilterCatalogWithOptions(request, runtime);
    }

    public DescribeClusterGrafanaResponse describeClusterGrafanaWithOptions(DescribeClusterGrafanaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterGrafana", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterGrafanaResponse());
    }

    public DescribeClusterGrafanaResponse describeClusterGrafana(DescribeClusterGrafanaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterGrafanaWithOptions(request, runtime);
    }

    public GetDiagnosisResponse getDiagnosisWithOptions(GetDiagnosisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDiagnosis", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetDiagnosisResponse());
    }

    public GetDiagnosisResponse getDiagnosis(GetDiagnosisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDiagnosisWithOptions(request, runtime);
    }

    public GetRegisteredServicesResponse getRegisteredServicesWithOptions(GetRegisteredServicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRegisteredServices", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetRegisteredServicesResponse());
    }

    public GetRegisteredServicesResponse getRegisteredServices(GetRegisteredServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRegisteredServicesWithOptions(request, runtime);
    }

    public DescribeCensResponse describeCensWithOptions(DescribeCensRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCens", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCensResponse());
    }

    public DescribeCensResponse describeCens(DescribeCensRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCensWithOptions(request, runtime);
    }

    public DeleteServiceMeshResponse deleteServiceMeshWithOptions(DeleteServiceMeshRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteServiceMesh", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteServiceMeshResponse());
    }

    public DeleteServiceMeshResponse deleteServiceMesh(DeleteServiceMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteServiceMeshWithOptions(request, runtime);
    }

    public GetSaTokenResponse getSaTokenWithOptions(GetSaTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSaToken", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetSaTokenResponse());
    }

    public GetSaTokenResponse getSaToken(GetSaTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSaTokenWithOptions(request, runtime);
    }

    public GetVmAppMeshInfoResponse getVmAppMeshInfoWithOptions(GetVmAppMeshInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVmAppMeshInfo", "2020-01-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetVmAppMeshInfoResponse());
    }

    public GetVmAppMeshInfoResponse getVmAppMeshInfo(GetVmAppMeshInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVmAppMeshInfoWithOptions(request, runtime);
    }

    public RemoveClusterFromServiceMeshResponse removeClusterFromServiceMeshWithOptions(RemoveClusterFromServiceMeshRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveClusterFromServiceMesh", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveClusterFromServiceMeshResponse());
    }

    public RemoveClusterFromServiceMeshResponse removeClusterFromServiceMesh(RemoveClusterFromServiceMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeClusterFromServiceMeshWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2020-01-11", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public SetServiceRegistrySourceResponse setServiceRegistrySourceWithOptions(SetServiceRegistrySourceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetServiceRegistrySourceShrinkRequest request = new SetServiceRegistrySourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.config)) {
            request.configShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.config, "Config", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetServiceRegistrySource", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new SetServiceRegistrySourceResponse());
    }

    public SetServiceRegistrySourceResponse setServiceRegistrySource(SetServiceRegistrySourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setServiceRegistrySourceWithOptions(request, runtime);
    }

    public AddClusterIntoServiceMeshResponse addClusterIntoServiceMeshWithOptions(AddClusterIntoServiceMeshRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddClusterIntoServiceMesh", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new AddClusterIntoServiceMeshResponse());
    }

    public AddClusterIntoServiceMeshResponse addClusterIntoServiceMesh(AddClusterIntoServiceMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addClusterIntoServiceMeshWithOptions(request, runtime);
    }

    public AddBuiltinEnvoyFilterResponse addBuiltinEnvoyFilterWithOptions(AddBuiltinEnvoyFilterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddBuiltinEnvoyFilter", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new AddBuiltinEnvoyFilterResponse());
    }

    public AddBuiltinEnvoyFilterResponse addBuiltinEnvoyFilter(AddBuiltinEnvoyFilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addBuiltinEnvoyFilterWithOptions(request, runtime);
    }

    public GetEcsListResponse getEcsListWithOptions(GetEcsListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEcsList", "2020-01-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetEcsListResponse());
    }

    public GetEcsListResponse getEcsList(GetEcsListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEcsListWithOptions(request, runtime);
    }

    public UpdateMeshFeatureResponse updateMeshFeatureWithOptions(UpdateMeshFeatureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMeshFeature", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMeshFeatureResponse());
    }

    public UpdateMeshFeatureResponse updateMeshFeature(UpdateMeshFeatureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMeshFeatureWithOptions(request, runtime);
    }

    public AddVmAppToMeshResponse addVmAppToMeshWithOptions(AddVmAppToMeshRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddVmAppToMesh", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new AddVmAppToMeshResponse());
    }

    public AddVmAppToMeshResponse addVmAppToMesh(AddVmAppToMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addVmAppToMeshWithOptions(request, runtime);
    }

    public CreateServiceMeshResponse createServiceMeshWithOptions(CreateServiceMeshRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateServiceMesh", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateServiceMeshResponse());
    }

    public CreateServiceMeshResponse createServiceMesh(CreateServiceMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceMeshWithOptions(request, runtime);
    }

    public GetServiceRegistrySourceResponse getServiceRegistrySourceWithOptions(GetServiceRegistrySourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetServiceRegistrySource", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetServiceRegistrySourceResponse());
    }

    public GetServiceRegistrySourceResponse getServiceRegistrySource(GetServiceRegistrySourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getServiceRegistrySourceWithOptions(request, runtime);
    }

    public RemoveBuiltinEnvoyFilterResponse removeBuiltinEnvoyFilterWithOptions(RemoveBuiltinEnvoyFilterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveBuiltinEnvoyFilter", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveBuiltinEnvoyFilterResponse());
    }

    public RemoveBuiltinEnvoyFilterResponse removeBuiltinEnvoyFilter(RemoveBuiltinEnvoyFilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeBuiltinEnvoyFilterWithOptions(request, runtime);
    }

    public GetBuiltinEnvoyFilterResponse getBuiltinEnvoyFilterWithOptions(GetBuiltinEnvoyFilterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBuiltinEnvoyFilter", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetBuiltinEnvoyFilterResponse());
    }

    public GetBuiltinEnvoyFilterResponse getBuiltinEnvoyFilter(GetBuiltinEnvoyFilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBuiltinEnvoyFilterWithOptions(request, runtime);
    }

    public InitializeASMRoleResponse initializeASMRoleWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("InitializeASMRole", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new InitializeASMRoleResponse());
    }

    public InitializeASMRoleResponse initializeASMRole() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initializeASMRoleWithOptions(runtime);
    }

    public AddMeshTagToEcsResponse addMeshTagToEcsWithOptions(AddMeshTagToEcsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddMeshTagToEcs", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new AddMeshTagToEcsResponse());
    }

    public AddMeshTagToEcsResponse addMeshTagToEcs(AddMeshTagToEcsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addMeshTagToEcsWithOptions(request, runtime);
    }
}

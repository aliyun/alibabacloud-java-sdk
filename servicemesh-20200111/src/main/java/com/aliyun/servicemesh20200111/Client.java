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

    public AddVMIntoServiceMeshResponse addVMIntoServiceMeshWithOptions(AddVMIntoServiceMeshRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddVMIntoServiceMesh", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new AddVMIntoServiceMeshResponse());
    }

    public AddVMIntoServiceMeshResponse addVMIntoServiceMesh(AddVMIntoServiceMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addVMIntoServiceMeshWithOptions(request, runtime);
    }

    public CreateExtensionProviderResponse createExtensionProviderWithOptions(CreateExtensionProviderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateExtensionProvider", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateExtensionProviderResponse());
    }

    public CreateExtensionProviderResponse createExtensionProvider(CreateExtensionProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createExtensionProviderWithOptions(request, runtime);
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

    public DeleteExtensionProviderResponse deleteExtensionProviderWithOptions(DeleteExtensionProviderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteExtensionProvider", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteExtensionProviderResponse());
    }

    public DeleteExtensionProviderResponse deleteExtensionProvider(DeleteExtensionProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteExtensionProviderWithOptions(request, runtime);
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

    public DescribeAlertActionPoliciesResponse describeAlertActionPoliciesWithOptions(DescribeAlertActionPoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlertActionPolicies", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlertActionPoliciesResponse());
    }

    public DescribeAlertActionPoliciesResponse describeAlertActionPolicies(DescribeAlertActionPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlertActionPoliciesWithOptions(request, runtime);
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

    public DescribeControlPlaneLogAlertRulesResponse describeControlPlaneLogAlertRulesWithOptions(DescribeControlPlaneLogAlertRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeControlPlaneLogAlertRules", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeControlPlaneLogAlertRulesResponse());
    }

    public DescribeControlPlaneLogAlertRulesResponse describeControlPlaneLogAlertRules(DescribeControlPlaneLogAlertRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeControlPlaneLogAlertRulesWithOptions(request, runtime);
    }

    public DescribeCrTemplatesResponse describeCrTemplatesWithOptions(DescribeCrTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCrTemplates", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCrTemplatesResponse());
    }

    public DescribeCrTemplatesResponse describeCrTemplates(DescribeCrTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCrTemplatesWithOptions(request, runtime);
    }

    public DescribeExtensionProviderResponse describeExtensionProviderWithOptions(DescribeExtensionProviderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeExtensionProvider", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeExtensionProviderResponse());
    }

    public DescribeExtensionProviderResponse describeExtensionProvider(DescribeExtensionProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExtensionProviderWithOptions(request, runtime);
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

    public DescribeGuestClusterNamespacesResponse describeGuestClusterNamespacesWithOptions(DescribeGuestClusterNamespacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGuestClusterNamespaces", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGuestClusterNamespacesResponse());
    }

    public DescribeGuestClusterNamespacesResponse describeGuestClusterNamespaces(DescribeGuestClusterNamespacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGuestClusterNamespacesWithOptions(request, runtime);
    }

    public DescribeGuestClusterPodsResponse describeGuestClusterPodsWithOptions(DescribeGuestClusterPodsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGuestClusterPods", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGuestClusterPodsResponse());
    }

    public DescribeGuestClusterPodsResponse describeGuestClusterPods(DescribeGuestClusterPodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGuestClusterPodsWithOptions(request, runtime);
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

    public DescribeNamespaceScopeSidecarConfigResponse describeNamespaceScopeSidecarConfigWithOptions(DescribeNamespaceScopeSidecarConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNamespaceScopeSidecarConfig", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNamespaceScopeSidecarConfigResponse());
    }

    public DescribeNamespaceScopeSidecarConfigResponse describeNamespaceScopeSidecarConfig(DescribeNamespaceScopeSidecarConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNamespaceScopeSidecarConfigWithOptions(request, runtime);
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

    public DescribeServiceMeshGatewayPodStatusResponse describeServiceMeshGatewayPodStatusWithOptions(DescribeServiceMeshGatewayPodStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeServiceMeshGatewayPodStatus", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeServiceMeshGatewayPodStatusResponse());
    }

    public DescribeServiceMeshGatewayPodStatusResponse describeServiceMeshGatewayPodStatus(DescribeServiceMeshGatewayPodStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshGatewayPodStatusWithOptions(request, runtime);
    }

    public DescribeServiceMeshGatewaySLBStatusResponse describeServiceMeshGatewaySLBStatusWithOptions(DescribeServiceMeshGatewaySLBStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeServiceMeshGatewaySLBStatus", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeServiceMeshGatewaySLBStatusResponse());
    }

    public DescribeServiceMeshGatewaySLBStatusResponse describeServiceMeshGatewaySLBStatus(DescribeServiceMeshGatewaySLBStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshGatewaySLBStatusWithOptions(request, runtime);
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

    public DescribeServiceMeshUpgradeStatusResponse describeServiceMeshUpgradeStatusWithOptions(DescribeServiceMeshUpgradeStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeServiceMeshUpgradeStatus", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeServiceMeshUpgradeStatusResponse());
    }

    public DescribeServiceMeshUpgradeStatusResponse describeServiceMeshUpgradeStatus(DescribeServiceMeshUpgradeStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshUpgradeStatusWithOptions(request, runtime);
    }

    public DescribeServiceMeshVMsResponse describeServiceMeshVMsWithOptions(DescribeServiceMeshVMsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeServiceMeshVMs", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeServiceMeshVMsResponse());
    }

    public DescribeServiceMeshVMsResponse describeServiceMeshVMs(DescribeServiceMeshVMsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshVMsWithOptions(request, runtime);
    }

    public DescribeServiceMeshesResponse describeServiceMeshesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeServiceMeshes", "2020-01-11", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeServiceMeshesResponse());
    }

    public DescribeServiceMeshesResponse describeServiceMeshes() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceMeshesWithOptions(runtime);
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

    public DescribeVMsInServiceMeshResponse describeVMsInServiceMeshWithOptions(DescribeVMsInServiceMeshRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVMsInServiceMesh", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVMsInServiceMeshResponse());
    }

    public DescribeVMsInServiceMeshResponse describeVMsInServiceMesh(DescribeVMsInServiceMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVMsInServiceMeshWithOptions(request, runtime);
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

    public DisableControlPlaneLogAlertResponse disableControlPlaneLogAlertWithOptions(DisableControlPlaneLogAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableControlPlaneLogAlert", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DisableControlPlaneLogAlertResponse());
    }

    public DisableControlPlaneLogAlertResponse disableControlPlaneLogAlert(DisableControlPlaneLogAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableControlPlaneLogAlertWithOptions(request, runtime);
    }

    public EnableControlPlaneLogAlertResponse enableControlPlaneLogAlertWithOptions(EnableControlPlaneLogAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableControlPlaneLogAlert", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new EnableControlPlaneLogAlertResponse());
    }

    public EnableControlPlaneLogAlertResponse enableControlPlaneLogAlert(EnableControlPlaneLogAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableControlPlaneLogAlertWithOptions(request, runtime);
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

    public InitializeASMRoleResponse initializeASMRoleWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("InitializeASMRole", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new InitializeASMRoleResponse());
    }

    public InitializeASMRoleResponse initializeASMRole() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initializeASMRoleWithOptions(runtime);
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

    public ModifyServiceMeshNameResponse modifyServiceMeshNameWithOptions(ModifyServiceMeshNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyServiceMeshName", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyServiceMeshNameResponse());
    }

    public ModifyServiceMeshNameResponse modifyServiceMeshName(ModifyServiceMeshNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyServiceMeshNameWithOptions(request, runtime);
    }

    public ReActivateAuditResponse reActivateAuditWithOptions(ReActivateAuditRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReActivateAudit", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new ReActivateAuditResponse());
    }

    public ReActivateAuditResponse reActivateAudit(ReActivateAuditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reActivateAuditWithOptions(request, runtime);
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

    public RemoveVMFromServiceMeshResponse removeVMFromServiceMeshWithOptions(RemoveVMFromServiceMeshRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveVMFromServiceMesh", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveVMFromServiceMeshResponse());
    }

    public RemoveVMFromServiceMeshResponse removeVMFromServiceMesh(RemoveVMFromServiceMeshRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeVMFromServiceMeshWithOptions(request, runtime);
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

    public UpdateControlPlaneLogAlertActionPolicyResponse updateControlPlaneLogAlertActionPolicyWithOptions(UpdateControlPlaneLogAlertActionPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateControlPlaneLogAlertActionPolicy", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateControlPlaneLogAlertActionPolicyResponse());
    }

    public UpdateControlPlaneLogAlertActionPolicyResponse updateControlPlaneLogAlertActionPolicy(UpdateControlPlaneLogAlertActionPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateControlPlaneLogAlertActionPolicyWithOptions(request, runtime);
    }

    public UpdateControlPlaneLogConfigResponse updateControlPlaneLogConfigWithOptions(UpdateControlPlaneLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateControlPlaneLogConfig", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateControlPlaneLogConfigResponse());
    }

    public UpdateControlPlaneLogConfigResponse updateControlPlaneLogConfig(UpdateControlPlaneLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateControlPlaneLogConfigWithOptions(request, runtime);
    }

    public UpdateExtensionProviderResponse updateExtensionProviderWithOptions(UpdateExtensionProviderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateExtensionProvider", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateExtensionProviderResponse());
    }

    public UpdateExtensionProviderResponse updateExtensionProvider(UpdateExtensionProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateExtensionProviderWithOptions(request, runtime);
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

    public UpdateNamespaceScopeSidecarConfigResponse updateNamespaceScopeSidecarConfigWithOptions(UpdateNamespaceScopeSidecarConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateNamespaceScopeSidecarConfig", "2020-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateNamespaceScopeSidecarConfigResponse());
    }

    public UpdateNamespaceScopeSidecarConfigResponse updateNamespaceScopeSidecarConfig(UpdateNamespaceScopeSidecarConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNamespaceScopeSidecarConfigWithOptions(request, runtime);
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
}

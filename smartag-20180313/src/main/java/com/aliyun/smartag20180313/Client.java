// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313;

import com.aliyun.tea.*;
import com.aliyun.smartag20180313.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("smartag", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GrantSagInstanceToVbrResponse grantSagInstanceToVbrWithOptions(GrantSagInstanceToVbrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GrantSagInstanceToVbr", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new GrantSagInstanceToVbrResponse());
    }

    public GrantSagInstanceToVbrResponse grantSagInstanceToVbr(GrantSagInstanceToVbrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantSagInstanceToVbrWithOptions(request, runtime);
    }

    public DescribeSagTrafficTopNResponse describeSagTrafficTopNWithOptions(DescribeSagTrafficTopNRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagTrafficTopN", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagTrafficTopNResponse());
    }

    public DescribeSagTrafficTopNResponse describeSagTrafficTopN(DescribeSagTrafficTopNRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagTrafficTopNWithOptions(request, runtime);
    }

    public DescribeGrantSagVbrRulesResponse describeGrantSagVbrRulesWithOptions(DescribeGrantSagVbrRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGrantSagVbrRules", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGrantSagVbrRulesResponse());
    }

    public DescribeGrantSagVbrRulesResponse describeGrantSagVbrRules(DescribeGrantSagVbrRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGrantSagVbrRulesWithOptions(request, runtime);
    }

    public DescribeSagStaticRouteListResponse describeSagStaticRouteListWithOptions(DescribeSagStaticRouteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagStaticRouteList", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagStaticRouteListResponse());
    }

    public DescribeSagStaticRouteListResponse describeSagStaticRouteList(DescribeSagStaticRouteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagStaticRouteListWithOptions(request, runtime);
    }

    public DescribeSagRouteListResponse describeSagRouteListWithOptions(DescribeSagRouteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagRouteList", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagRouteListResponse());
    }

    public DescribeSagRouteListResponse describeSagRouteList(DescribeSagRouteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagRouteListWithOptions(request, runtime);
    }

    public ProbeAccessPointNetworkQualityResponse probeAccessPointNetworkQualityWithOptions(ProbeAccessPointNetworkQualityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ProbeAccessPointNetworkQuality", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ProbeAccessPointNetworkQualityResponse());
    }

    public ProbeAccessPointNetworkQualityResponse probeAccessPointNetworkQuality(ProbeAccessPointNetworkQualityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.probeAccessPointNetworkQualityWithOptions(request, runtime);
    }

    public ModifySagGlobalRouteProtocolResponse modifySagGlobalRouteProtocolWithOptions(ModifySagGlobalRouteProtocolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySagGlobalRouteProtocol", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySagGlobalRouteProtocolResponse());
    }

    public ModifySagGlobalRouteProtocolResponse modifySagGlobalRouteProtocol(ModifySagGlobalRouteProtocolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySagGlobalRouteProtocolWithOptions(request, runtime);
    }

    public DeleteRouteDistributionStrategyResponse deleteRouteDistributionStrategyWithOptions(DeleteRouteDistributionStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRouteDistributionStrategy", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRouteDistributionStrategyResponse());
    }

    public DeleteRouteDistributionStrategyResponse deleteRouteDistributionStrategy(DeleteRouteDistributionStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRouteDistributionStrategyWithOptions(request, runtime);
    }

    public CreateQosCarResponse createQosCarWithOptions(CreateQosCarRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateQosCar", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateQosCarResponse());
    }

    public CreateQosCarResponse createQosCar(CreateQosCarRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createQosCarWithOptions(request, runtime);
    }

    public UpdateSmartAGDpiAttributeResponse updateSmartAGDpiAttributeWithOptions(UpdateSmartAGDpiAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSmartAGDpiAttribute", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSmartAGDpiAttributeResponse());
    }

    public UpdateSmartAGDpiAttributeResponse updateSmartAGDpiAttribute(UpdateSmartAGDpiAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSmartAGDpiAttributeWithOptions(request, runtime);
    }

    public ClearSagRouteableAddressResponse clearSagRouteableAddressWithOptions(ClearSagRouteableAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ClearSagRouteableAddress", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ClearSagRouteableAddressResponse());
    }

    public ClearSagRouteableAddressResponse clearSagRouteableAddress(ClearSagRouteableAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clearSagRouteableAddressWithOptions(request, runtime);
    }

    public AssociateQosResponse associateQosWithOptions(AssociateQosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateQos", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateQosResponse());
    }

    public AssociateQosResponse associateQos(AssociateQosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateQosWithOptions(request, runtime);
    }

    public ModifySAGAdminPasswordResponse modifySAGAdminPasswordWithOptions(ModifySAGAdminPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySAGAdminPassword", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySAGAdminPasswordResponse());
    }

    public ModifySAGAdminPasswordResponse modifySAGAdminPassword(ModifySAGAdminPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySAGAdminPasswordWithOptions(request, runtime);
    }

    public DowngradeSmartAccessGatewayResponse downgradeSmartAccessGatewayWithOptions(DowngradeSmartAccessGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DowngradeSmartAccessGateway", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DowngradeSmartAccessGatewayResponse());
    }

    public DowngradeSmartAccessGatewayResponse downgradeSmartAccessGateway(DowngradeSmartAccessGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downgradeSmartAccessGatewayWithOptions(request, runtime);
    }

    public DescribeSagPortRouteProtocolListResponse describeSagPortRouteProtocolListWithOptions(DescribeSagPortRouteProtocolListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagPortRouteProtocolList", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagPortRouteProtocolListResponse());
    }

    public DescribeSagPortRouteProtocolListResponse describeSagPortRouteProtocolList(DescribeSagPortRouteProtocolListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagPortRouteProtocolListWithOptions(request, runtime);
    }

    public DescribeSagWanSnatResponse describeSagWanSnatWithOptions(DescribeSagWanSnatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagWanSnat", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagWanSnatResponse());
    }

    public DescribeSagWanSnatResponse describeSagWanSnat(DescribeSagWanSnatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagWanSnatWithOptions(request, runtime);
    }

    public DescribeSagUserDnsResponse describeSagUserDnsWithOptions(DescribeSagUserDnsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagUserDns", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagUserDnsResponse());
    }

    public DescribeSagUserDnsResponse describeSagUserDns(DescribeSagUserDnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagUserDnsWithOptions(request, runtime);
    }

    public ListAccessPointNetworkQualitiesResponse listAccessPointNetworkQualitiesWithOptions(ListAccessPointNetworkQualitiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAccessPointNetworkQualities", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListAccessPointNetworkQualitiesResponse());
    }

    public ListAccessPointNetworkQualitiesResponse listAccessPointNetworkQualities(ListAccessPointNetworkQualitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAccessPointNetworkQualitiesWithOptions(request, runtime);
    }

    public ModifyFlowLogAttributeResponse modifyFlowLogAttributeWithOptions(ModifyFlowLogAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFlowLogAttribute", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFlowLogAttributeResponse());
    }

    public ModifyFlowLogAttributeResponse modifyFlowLogAttribute(ModifyFlowLogAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowLogAttributeWithOptions(request, runtime);
    }

    public DescribeQosPoliciesResponse describeQosPoliciesWithOptions(DescribeQosPoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeQosPolicies", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeQosPoliciesResponse());
    }

    public DescribeQosPoliciesResponse describeQosPolicies(DescribeQosPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeQosPoliciesWithOptions(request, runtime);
    }

    public CreateQosResponse createQosWithOptions(CreateQosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateQos", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateQosResponse());
    }

    public CreateQosResponse createQos(CreateQosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createQosWithOptions(request, runtime);
    }

    public DiscribeSmartAccessGatewayDiagnosisReportResponse discribeSmartAccessGatewayDiagnosisReportWithOptions(DiscribeSmartAccessGatewayDiagnosisReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DiscribeSmartAccessGatewayDiagnosisReport", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DiscribeSmartAccessGatewayDiagnosisReportResponse());
    }

    public DiscribeSmartAccessGatewayDiagnosisReportResponse discribeSmartAccessGatewayDiagnosisReport(DiscribeSmartAccessGatewayDiagnosisReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.discribeSmartAccessGatewayDiagnosisReportWithOptions(request, runtime);
    }

    public RoamClientUserResponse roamClientUserWithOptions(RoamClientUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RoamClientUser", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new RoamClientUserResponse());
    }

    public RoamClientUserResponse roamClientUser(RoamClientUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.roamClientUserWithOptions(request, runtime);
    }

    public CreateSagStaticRouteResponse createSagStaticRouteWithOptions(CreateSagStaticRouteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSagStaticRoute", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSagStaticRouteResponse());
    }

    public CreateSagStaticRouteResponse createSagStaticRoute(CreateSagStaticRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSagStaticRouteWithOptions(request, runtime);
    }

    public DescribeSmartAccessGatewayAttributeResponse describeSmartAccessGatewayAttributeWithOptions(DescribeSmartAccessGatewayAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSmartAccessGatewayAttribute", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSmartAccessGatewayAttributeResponse());
    }

    public DescribeSmartAccessGatewayAttributeResponse describeSmartAccessGatewayAttribute(DescribeSmartAccessGatewayAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSmartAccessGatewayAttributeWithOptions(request, runtime);
    }

    public CreateCloudConnectNetworkResponse createCloudConnectNetworkWithOptions(CreateCloudConnectNetworkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCloudConnectNetwork", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCloudConnectNetworkResponse());
    }

    public CreateCloudConnectNetworkResponse createCloudConnectNetwork(CreateCloudConnectNetworkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCloudConnectNetworkWithOptions(request, runtime);
    }

    public DeleteQosPolicyResponse deleteQosPolicyWithOptions(DeleteQosPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteQosPolicy", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteQosPolicyResponse());
    }

    public DeleteQosPolicyResponse deleteQosPolicy(DeleteQosPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteQosPolicyWithOptions(request, runtime);
    }

    public ModifySagHaResponse modifySagHaWithOptions(ModifySagHaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySagHa", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySagHaResponse());
    }

    public ModifySagHaResponse modifySagHa(ModifySagHaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySagHaWithOptions(request, runtime);
    }

    public DeleteHealthCheckResponse deleteHealthCheckWithOptions(DeleteHealthCheckRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteHealthCheck", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteHealthCheckResponse());
    }

    public DeleteHealthCheckResponse deleteHealthCheck(DeleteHealthCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHealthCheckWithOptions(request, runtime);
    }

    public SynchronizeSmartAGWebConfigResponse synchronizeSmartAGWebConfigWithOptions(SynchronizeSmartAGWebConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SynchronizeSmartAGWebConfig", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new SynchronizeSmartAGWebConfigResponse());
    }

    public SynchronizeSmartAGWebConfigResponse synchronizeSmartAGWebConfig(SynchronizeSmartAGWebConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.synchronizeSmartAGWebConfigWithOptions(request, runtime);
    }

    public DeleteSnatEntryResponse deleteSnatEntryWithOptions(DeleteSnatEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSnatEntry", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSnatEntryResponse());
    }

    public DeleteSnatEntryResponse deleteSnatEntry(DeleteSnatEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSnatEntryWithOptions(request, runtime);
    }

    public DeleteQosResponse deleteQosWithOptions(DeleteQosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteQos", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteQosResponse());
    }

    public DeleteQosResponse deleteQos(DeleteQosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteQosWithOptions(request, runtime);
    }

    public DeleteSagStaticRouteResponse deleteSagStaticRouteWithOptions(DeleteSagStaticRouteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSagStaticRoute", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSagStaticRouteResponse());
    }

    public DeleteSagStaticRouteResponse deleteSagStaticRoute(DeleteSagStaticRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSagStaticRouteWithOptions(request, runtime);
    }

    public DescribeGrantSagRulesResponse describeGrantSagRulesWithOptions(DescribeGrantSagRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGrantSagRules", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGrantSagRulesResponse());
    }

    public DescribeGrantSagRulesResponse describeGrantSagRules(DescribeGrantSagRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGrantSagRulesWithOptions(request, runtime);
    }

    public DescribeUserOnlineClientsResponse describeUserOnlineClientsWithOptions(DescribeUserOnlineClientsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserOnlineClients", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserOnlineClientsResponse());
    }

    public DescribeUserOnlineClientsResponse describeUserOnlineClients(DescribeUserOnlineClientsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserOnlineClientsWithOptions(request, runtime);
    }

    public DiagnoseSmartAccessGatewayResponse diagnoseSmartAccessGatewayWithOptions(DiagnoseSmartAccessGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DiagnoseSmartAccessGateway", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DiagnoseSmartAccessGatewayResponse());
    }

    public DiagnoseSmartAccessGatewayResponse diagnoseSmartAccessGateway(DiagnoseSmartAccessGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.diagnoseSmartAccessGatewayWithOptions(request, runtime);
    }

    public DescribeSagWifiResponse describeSagWifiWithOptions(DescribeSagWifiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagWifi", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagWifiResponse());
    }

    public DescribeSagWifiResponse describeSagWifi(DescribeSagWifiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagWifiWithOptions(request, runtime);
    }

    public UnbindSerialNumberResponse unbindSerialNumberWithOptions(UnbindSerialNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindSerialNumber", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindSerialNumberResponse());
    }

    public UnbindSerialNumberResponse unbindSerialNumber(UnbindSerialNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindSerialNumberWithOptions(request, runtime);
    }

    public DescribeSAGDeviceInfoResponse describeSAGDeviceInfoWithOptions(DescribeSAGDeviceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSAGDeviceInfo", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSAGDeviceInfoResponse());
    }

    public DescribeSAGDeviceInfoResponse describeSAGDeviceInfo(DescribeSAGDeviceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSAGDeviceInfoWithOptions(request, runtime);
    }

    public DescribeUserFlowStatisticsResponse describeUserFlowStatisticsWithOptions(DescribeUserFlowStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserFlowStatistics", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserFlowStatisticsResponse());
    }

    public DescribeUserFlowStatisticsResponse describeUserFlowStatistics(DescribeUserFlowStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserFlowStatisticsWithOptions(request, runtime);
    }

    public ModifySagLanResponse modifySagLanWithOptions(ModifySagLanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySagLan", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySagLanResponse());
    }

    public ModifySagLanResponse modifySagLan(ModifySagLanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySagLanWithOptions(request, runtime);
    }

    public DescribeFlowLogsResponse describeFlowLogsWithOptions(DescribeFlowLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowLogs", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowLogsResponse());
    }

    public DescribeFlowLogsResponse describeFlowLogs(DescribeFlowLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowLogsWithOptions(request, runtime);
    }

    public DescribeSmartAccessGatewayClientUsersResponse describeSmartAccessGatewayClientUsersWithOptions(DescribeSmartAccessGatewayClientUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSmartAccessGatewayClientUsers", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSmartAccessGatewayClientUsersResponse());
    }

    public DescribeSmartAccessGatewayClientUsersResponse describeSmartAccessGatewayClientUsers(DescribeSmartAccessGatewayClientUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSmartAccessGatewayClientUsersWithOptions(request, runtime);
    }

    public DescribeHealthCheckAttributeResponse describeHealthCheckAttributeWithOptions(DescribeHealthCheckAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHealthCheckAttribute", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHealthCheckAttributeResponse());
    }

    public DescribeHealthCheckAttributeResponse describeHealthCheckAttribute(DescribeHealthCheckAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHealthCheckAttributeWithOptions(request, runtime);
    }

    public ModifyQosPolicyResponse modifyQosPolicyWithOptions(ModifyQosPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyQosPolicy", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyQosPolicyResponse());
    }

    public ModifyQosPolicyResponse modifyQosPolicy(ModifyQosPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyQosPolicyWithOptions(request, runtime);
    }

    public ModifySagExpressConnectInterfaceResponse modifySagExpressConnectInterfaceWithOptions(ModifySagExpressConnectInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySagExpressConnectInterface", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySagExpressConnectInterfaceResponse());
    }

    public ModifySagExpressConnectInterfaceResponse modifySagExpressConnectInterface(ModifySagExpressConnectInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySagExpressConnectInterfaceWithOptions(request, runtime);
    }

    public UpdateSmartAGAccessPointResponse updateSmartAGAccessPointWithOptions(UpdateSmartAGAccessPointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSmartAGAccessPoint", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSmartAGAccessPointResponse());
    }

    public UpdateSmartAGAccessPointResponse updateSmartAGAccessPoint(UpdateSmartAGAccessPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSmartAGAccessPointWithOptions(request, runtime);
    }

    public BindSerialNumberResponse bindSerialNumberWithOptions(BindSerialNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindSerialNumber", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new BindSerialNumberResponse());
    }

    public BindSerialNumberResponse bindSerialNumber(BindSerialNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindSerialNumberWithOptions(request, runtime);
    }

    public ModifySagRouteProtocolOspfResponse modifySagRouteProtocolOspfWithOptions(ModifySagRouteProtocolOspfRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySagRouteProtocolOspf", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySagRouteProtocolOspfResponse());
    }

    public ModifySagRouteProtocolOspfResponse modifySagRouteProtocolOspf(ModifySagRouteProtocolOspfRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySagRouteProtocolOspfWithOptions(request, runtime);
    }

    public AddDnatEntryResponse addDnatEntryWithOptions(AddDnatEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDnatEntry", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new AddDnatEntryResponse());
    }

    public AddDnatEntryResponse addDnatEntry(AddDnatEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDnatEntryWithOptions(request, runtime);
    }

    public DescribeSagRouteProtocolOspfResponse describeSagRouteProtocolOspfWithOptions(DescribeSagRouteProtocolOspfRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagRouteProtocolOspf", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagRouteProtocolOspfResponse());
    }

    public DescribeSagRouteProtocolOspfResponse describeSagRouteProtocolOspf(DescribeSagRouteProtocolOspfRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagRouteProtocolOspfWithOptions(request, runtime);
    }

    public DescribeRouteDistributionStrategiesResponse describeRouteDistributionStrategiesWithOptions(DescribeRouteDistributionStrategiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRouteDistributionStrategies", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRouteDistributionStrategiesResponse());
    }

    public DescribeRouteDistributionStrategiesResponse describeRouteDistributionStrategies(DescribeRouteDistributionStrategiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRouteDistributionStrategiesWithOptions(request, runtime);
    }

    public DescribeSagHaResponse describeSagHaWithOptions(DescribeSagHaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagHa", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagHaResponse());
    }

    public DescribeSagHaResponse describeSagHa(DescribeSagHaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagHaWithOptions(request, runtime);
    }

    public AddACLRuleResponse addACLRuleWithOptions(AddACLRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddACLRule", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new AddACLRuleResponse());
    }

    public AddACLRuleResponse addACLRule(AddACLRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addACLRuleWithOptions(request, runtime);
    }

    public AssociateFlowLogResponse associateFlowLogWithOptions(AssociateFlowLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateFlowLog", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateFlowLogResponse());
    }

    public AssociateFlowLogResponse associateFlowLog(AssociateFlowLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateFlowLogWithOptions(request, runtime);
    }

    public BindSmartAccessGatewayResponse bindSmartAccessGatewayWithOptions(BindSmartAccessGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindSmartAccessGateway", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new BindSmartAccessGatewayResponse());
    }

    public BindSmartAccessGatewayResponse bindSmartAccessGateway(BindSmartAccessGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindSmartAccessGatewayWithOptions(request, runtime);
    }

    public DisassociateACLResponse disassociateACLWithOptions(DisassociateACLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisassociateACL", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DisassociateACLResponse());
    }

    public DisassociateACLResponse disassociateACL(DisassociateACLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disassociateACLWithOptions(request, runtime);
    }

    public DeactiveFlowLogResponse deactiveFlowLogWithOptions(DeactiveFlowLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeactiveFlowLog", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeactiveFlowLogResponse());
    }

    public DeactiveFlowLogResponse deactiveFlowLog(DeactiveFlowLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deactiveFlowLogWithOptions(request, runtime);
    }

    public ActiveFlowLogResponse activeFlowLogWithOptions(ActiveFlowLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ActiveFlowLog", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ActiveFlowLogResponse());
    }

    public ActiveFlowLogResponse activeFlowLog(ActiveFlowLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activeFlowLogWithOptions(request, runtime);
    }

    public KickOutClientsResponse kickOutClientsWithOptions(KickOutClientsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("KickOutClients", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new KickOutClientsResponse());
    }

    public KickOutClientsResponse kickOutClients(KickOutClientsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.kickOutClientsWithOptions(request, runtime);
    }

    public ModifySagPortRoleResponse modifySagPortRoleWithOptions(ModifySagPortRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySagPortRole", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySagPortRoleResponse());
    }

    public ModifySagPortRoleResponse modifySagPortRole(ModifySagPortRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySagPortRoleWithOptions(request, runtime);
    }

    public ModifySagWanSnatResponse modifySagWanSnatWithOptions(ModifySagWanSnatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySagWanSnat", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySagWanSnatResponse());
    }

    public ModifySagWanSnatResponse modifySagWanSnat(ModifySagWanSnatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySagWanSnatWithOptions(request, runtime);
    }

    public ListDpiConfigErrorResponse listDpiConfigErrorWithOptions(ListDpiConfigErrorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDpiConfigError", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListDpiConfigErrorResponse());
    }

    public ListDpiConfigErrorResponse listDpiConfigError(ListDpiConfigErrorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDpiConfigErrorWithOptions(request, runtime);
    }

    public DeleteACLResponse deleteACLWithOptions(DeleteACLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteACL", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteACLResponse());
    }

    public DeleteACLResponse deleteACL(DeleteACLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteACLWithOptions(request, runtime);
    }

    public UpdateSmartAGEnterpriseCodeResponse updateSmartAGEnterpriseCodeWithOptions(UpdateSmartAGEnterpriseCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSmartAGEnterpriseCode", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSmartAGEnterpriseCodeResponse());
    }

    public UpdateSmartAGEnterpriseCodeResponse updateSmartAGEnterpriseCode(UpdateSmartAGEnterpriseCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSmartAGEnterpriseCodeWithOptions(request, runtime);
    }

    public AssociateACLResponse associateACLWithOptions(AssociateACLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateACL", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateACLResponse());
    }

    public AssociateACLResponse associateACL(AssociateACLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateACLWithOptions(request, runtime);
    }

    public ModifyHealthCheckResponse modifyHealthCheckWithOptions(ModifyHealthCheckRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHealthCheck", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHealthCheckResponse());
    }

    public ModifyHealthCheckResponse modifyHealthCheck(ModifyHealthCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHealthCheckWithOptions(request, runtime);
    }

    public CreateEnterpriseCodeResponse createEnterpriseCodeWithOptions(CreateEnterpriseCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEnterpriseCode", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEnterpriseCodeResponse());
    }

    public CreateEnterpriseCodeResponse createEnterpriseCode(CreateEnterpriseCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEnterpriseCodeWithOptions(request, runtime);
    }

    public DescribeACLsResponse describeACLsWithOptions(DescribeACLsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeACLs", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeACLsResponse());
    }

    public DescribeACLsResponse describeACLs(DescribeACLsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeACLsWithOptions(request, runtime);
    }

    public ResetSmartAccessGatewayClientUserPasswordResponse resetSmartAccessGatewayClientUserPasswordWithOptions(ResetSmartAccessGatewayClientUserPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetSmartAccessGatewayClientUserPassword", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ResetSmartAccessGatewayClientUserPasswordResponse());
    }

    public ResetSmartAccessGatewayClientUserPasswordResponse resetSmartAccessGatewayClientUserPassword(ResetSmartAccessGatewayClientUserPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetSmartAccessGatewayClientUserPasswordWithOptions(request, runtime);
    }

    public UnlockSmartAccessGatewayResponse unlockSmartAccessGatewayWithOptions(UnlockSmartAccessGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnlockSmartAccessGateway", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new UnlockSmartAccessGatewayResponse());
    }

    public UnlockSmartAccessGatewayResponse unlockSmartAccessGateway(UnlockSmartAccessGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unlockSmartAccessGatewayWithOptions(request, runtime);
    }

    public DescribeUnbindFlowLogSagsResponse describeUnbindFlowLogSagsWithOptions(DescribeUnbindFlowLogSagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUnbindFlowLogSags", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUnbindFlowLogSagsResponse());
    }

    public DescribeUnbindFlowLogSagsResponse describeUnbindFlowLogSags(DescribeUnbindFlowLogSagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUnbindFlowLogSagsWithOptions(request, runtime);
    }

    public DisassociateFlowLogResponse disassociateFlowLogWithOptions(DisassociateFlowLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisassociateFlowLog", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DisassociateFlowLogResponse());
    }

    public DisassociateFlowLogResponse disassociateFlowLog(DisassociateFlowLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disassociateFlowLogWithOptions(request, runtime);
    }

    public DescribeSagGlobalRouteProtocolResponse describeSagGlobalRouteProtocolWithOptions(DescribeSagGlobalRouteProtocolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagGlobalRouteProtocol", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagGlobalRouteProtocolResponse());
    }

    public DescribeSagGlobalRouteProtocolResponse describeSagGlobalRouteProtocol(DescribeSagGlobalRouteProtocolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagGlobalRouteProtocolWithOptions(request, runtime);
    }

    public DescribeSagExpressConnectInterfaceListResponse describeSagExpressConnectInterfaceListWithOptions(DescribeSagExpressConnectInterfaceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagExpressConnectInterfaceList", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagExpressConnectInterfaceListResponse());
    }

    public DescribeSagExpressConnectInterfaceListResponse describeSagExpressConnectInterfaceList(DescribeSagExpressConnectInterfaceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagExpressConnectInterfaceListWithOptions(request, runtime);
    }

    public CreateACLResponse createACLWithOptions(CreateACLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateACL", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateACLResponse());
    }

    public CreateACLResponse createACL(CreateACLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createACLWithOptions(request, runtime);
    }

    public RebootSmartAccessGatewayResponse rebootSmartAccessGatewayWithOptions(RebootSmartAccessGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RebootSmartAccessGateway", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new RebootSmartAccessGatewayResponse());
    }

    public RebootSmartAccessGatewayResponse rebootSmartAccessGateway(RebootSmartAccessGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebootSmartAccessGatewayWithOptions(request, runtime);
    }

    public ModifySagStaticRouteResponse modifySagStaticRouteWithOptions(ModifySagStaticRouteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySagStaticRoute", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySagStaticRouteResponse());
    }

    public ModifySagStaticRouteResponse modifySagStaticRoute(ModifySagStaticRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySagStaticRouteWithOptions(request, runtime);
    }

    public RevokeInstanceFromVbrResponse revokeInstanceFromVbrWithOptions(RevokeInstanceFromVbrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RevokeInstanceFromVbr", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new RevokeInstanceFromVbrResponse());
    }

    public RevokeInstanceFromVbrResponse revokeInstanceFromVbr(RevokeInstanceFromVbrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeInstanceFromVbrWithOptions(request, runtime);
    }

    public DescribeCloudConnectNetworksResponse describeCloudConnectNetworksWithOptions(DescribeCloudConnectNetworksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCloudConnectNetworks", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCloudConnectNetworksResponse());
    }

    public DescribeCloudConnectNetworksResponse describeCloudConnectNetworks(DescribeCloudConnectNetworksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCloudConnectNetworksWithOptions(request, runtime);
    }

    public ModifyACLRuleResponse modifyACLRuleWithOptions(ModifyACLRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyACLRule", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyACLRuleResponse());
    }

    public ModifyACLRuleResponse modifyACLRule(ModifyACLRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyACLRuleWithOptions(request, runtime);
    }

    public ModifySmartAccessGatewayClientUserResponse modifySmartAccessGatewayClientUserWithOptions(ModifySmartAccessGatewayClientUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySmartAccessGatewayClientUser", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySmartAccessGatewayClientUserResponse());
    }

    public ModifySmartAccessGatewayClientUserResponse modifySmartAccessGatewayClientUser(ModifySmartAccessGatewayClientUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySmartAccessGatewayClientUserWithOptions(request, runtime);
    }

    public DescribeSagManagementPortResponse describeSagManagementPortWithOptions(DescribeSagManagementPortRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagManagementPort", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagManagementPortResponse());
    }

    public DescribeSagManagementPortResponse describeSagManagementPort(DescribeSagManagementPortRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagManagementPortWithOptions(request, runtime);
    }

    public UpgradeSmartAccessGatewayResponse upgradeSmartAccessGatewayWithOptions(UpgradeSmartAccessGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeSmartAccessGateway", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeSmartAccessGatewayResponse());
    }

    public UpgradeSmartAccessGatewayResponse upgradeSmartAccessGateway(UpgradeSmartAccessGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeSmartAccessGatewayWithOptions(request, runtime);
    }

    public GetSmartAGDpiAttributeResponse getSmartAGDpiAttributeWithOptions(GetSmartAGDpiAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSmartAGDpiAttribute", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetSmartAGDpiAttributeResponse());
    }

    public GetSmartAGDpiAttributeResponse getSmartAGDpiAttribute(GetSmartAGDpiAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSmartAGDpiAttributeWithOptions(request, runtime);
    }

    public DisassociateQosResponse disassociateQosWithOptions(DisassociateQosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisassociateQos", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DisassociateQosResponse());
    }

    public DisassociateQosResponse disassociateQos(DisassociateQosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disassociateQosWithOptions(request, runtime);
    }

    public ModifyRouteDistributionStrategyResponse modifyRouteDistributionStrategyWithOptions(ModifyRouteDistributionStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyRouteDistributionStrategy", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyRouteDistributionStrategyResponse());
    }

    public ModifyRouteDistributionStrategyResponse modifyRouteDistributionStrategy(ModifyRouteDistributionStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRouteDistributionStrategyWithOptions(request, runtime);
    }

    public ModifySagPortRouteProtocolResponse modifySagPortRouteProtocolWithOptions(ModifySagPortRouteProtocolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySagPortRouteProtocol", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySagPortRouteProtocolResponse());
    }

    public ModifySagPortRouteProtocolResponse modifySagPortRouteProtocol(ModifySagPortRouteProtocolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySagPortRouteProtocolWithOptions(request, runtime);
    }

    public EnableSmartAccessGatewayUserResponse enableSmartAccessGatewayUserWithOptions(EnableSmartAccessGatewayUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableSmartAccessGatewayUser", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new EnableSmartAccessGatewayUserResponse());
    }

    public EnableSmartAccessGatewayUserResponse enableSmartAccessGatewayUser(EnableSmartAccessGatewayUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableSmartAccessGatewayUserWithOptions(request, runtime);
    }

    public ModifyQosResponse modifyQosWithOptions(ModifyQosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyQos", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyQosResponse());
    }

    public ModifyQosResponse modifyQos(ModifyQosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyQosWithOptions(request, runtime);
    }

    public GetAclAttributeResponse getAclAttributeWithOptions(GetAclAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAclAttribute", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetAclAttributeResponse());
    }

    public GetAclAttributeResponse getAclAttribute(GetAclAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAclAttributeWithOptions(request, runtime);
    }

    public DescribeSagWanListResponse describeSagWanListWithOptions(DescribeSagWanListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagWanList", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagWanListResponse());
    }

    public DescribeSagWanListResponse describeSagWanList(DescribeSagWanListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagWanListWithOptions(request, runtime);
    }

    public ListSmartAGApiUnsupportedFeatureResponse listSmartAGApiUnsupportedFeatureWithOptions(ListSmartAGApiUnsupportedFeatureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSmartAGApiUnsupportedFeature", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListSmartAGApiUnsupportedFeatureResponse());
    }

    public ListSmartAGApiUnsupportedFeatureResponse listSmartAGApiUnsupportedFeature(ListSmartAGApiUnsupportedFeatureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSmartAGApiUnsupportedFeatureWithOptions(request, runtime);
    }

    public EnableSmartAGDpiMonitorResponse enableSmartAGDpiMonitorWithOptions(EnableSmartAGDpiMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableSmartAGDpiMonitor", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new EnableSmartAGDpiMonitorResponse());
    }

    public EnableSmartAGDpiMonitorResponse enableSmartAGDpiMonitor(EnableSmartAGDpiMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableSmartAGDpiMonitorWithOptions(request, runtime);
    }

    public ActivateSmartAccessGatewayResponse activateSmartAccessGatewayWithOptions(ActivateSmartAccessGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ActivateSmartAccessGateway", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ActivateSmartAccessGatewayResponse());
    }

    public ActivateSmartAccessGatewayResponse activateSmartAccessGateway(ActivateSmartAccessGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activateSmartAccessGatewayWithOptions(request, runtime);
    }

    public DeleteACLRuleResponse deleteACLRuleWithOptions(DeleteACLRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteACLRule", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteACLRuleResponse());
    }

    public DeleteACLRuleResponse deleteACLRule(DeleteACLRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteACLRuleWithOptions(request, runtime);
    }

    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MoveResourceGroup", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new MoveResourceGroupResponse());
    }

    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    public DescribeSagVbrRelationsResponse describeSagVbrRelationsWithOptions(DescribeSagVbrRelationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagVbrRelations", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagVbrRelationsResponse());
    }

    public DescribeSagVbrRelationsResponse describeSagVbrRelations(DescribeSagVbrRelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagVbrRelationsWithOptions(request, runtime);
    }

    public CreateSmartAccessGatewayClientUserResponse createSmartAccessGatewayClientUserWithOptions(CreateSmartAccessGatewayClientUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSmartAccessGatewayClientUser", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSmartAccessGatewayClientUserResponse());
    }

    public CreateSmartAccessGatewayClientUserResponse createSmartAccessGatewayClientUser(CreateSmartAccessGatewayClientUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSmartAccessGatewayClientUserWithOptions(request, runtime);
    }

    public GetQosAttributeResponse getQosAttributeWithOptions(GetQosAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetQosAttribute", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetQosAttributeResponse());
    }

    public GetQosAttributeResponse getQosAttribute(GetQosAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQosAttributeWithOptions(request, runtime);
    }

    public CreateHealthCheckResponse createHealthCheckWithOptions(CreateHealthCheckRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateHealthCheck", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateHealthCheckResponse());
    }

    public CreateHealthCheckResponse createHealthCheck(CreateHealthCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHealthCheckWithOptions(request, runtime);
    }

    public ModifySagRemoteAccessResponse modifySagRemoteAccessWithOptions(ModifySagRemoteAccessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySagRemoteAccess", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySagRemoteAccessResponse());
    }

    public ModifySagRemoteAccessResponse modifySagRemoteAccess(ModifySagRemoteAccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySagRemoteAccessWithOptions(request, runtime);
    }

    public RevokeSagInstanceFromCcnResponse revokeSagInstanceFromCcnWithOptions(RevokeSagInstanceFromCcnRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RevokeSagInstanceFromCcn", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new RevokeSagInstanceFromCcnResponse());
    }

    public RevokeSagInstanceFromCcnResponse revokeSagInstanceFromCcn(RevokeSagInstanceFromCcnRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeSagInstanceFromCcnWithOptions(request, runtime);
    }

    public DeleteEnterpriseCodeResponse deleteEnterpriseCodeWithOptions(DeleteEnterpriseCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEnterpriseCode", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEnterpriseCodeResponse());
    }

    public DeleteEnterpriseCodeResponse deleteEnterpriseCode(DeleteEnterpriseCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEnterpriseCodeWithOptions(request, runtime);
    }

    public DeleteSmartAccessGatewayClientUserResponse deleteSmartAccessGatewayClientUserWithOptions(DeleteSmartAccessGatewayClientUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSmartAccessGatewayClientUser", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSmartAccessGatewayClientUserResponse());
    }

    public DeleteSmartAccessGatewayClientUserResponse deleteSmartAccessGatewayClientUser(DeleteSmartAccessGatewayClientUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSmartAccessGatewayClientUserWithOptions(request, runtime);
    }

    public ListSmartAGByAccessPointResponse listSmartAGByAccessPointWithOptions(ListSmartAGByAccessPointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSmartAGByAccessPoint", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListSmartAGByAccessPointResponse());
    }

    public ListSmartAGByAccessPointResponse listSmartAGByAccessPoint(ListSmartAGByAccessPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSmartAGByAccessPointWithOptions(request, runtime);
    }

    public DescribeGrantRulesResponse describeGrantRulesWithOptions(DescribeGrantRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGrantRules", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGrantRulesResponse());
    }

    public DescribeGrantRulesResponse describeGrantRules(DescribeGrantRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGrantRulesWithOptions(request, runtime);
    }

    public CreateSagExpressConnectInterfaceResponse createSagExpressConnectInterfaceWithOptions(CreateSagExpressConnectInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSagExpressConnectInterface", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSagExpressConnectInterfaceResponse());
    }

    public CreateSagExpressConnectInterfaceResponse createSagExpressConnectInterface(CreateSagExpressConnectInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSagExpressConnectInterfaceWithOptions(request, runtime);
    }

    public UnbindSmartAccessGatewayResponse unbindSmartAccessGatewayWithOptions(UnbindSmartAccessGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindSmartAccessGateway", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindSmartAccessGatewayResponse());
    }

    public UnbindSmartAccessGatewayResponse unbindSmartAccessGateway(UnbindSmartAccessGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindSmartAccessGatewayWithOptions(request, runtime);
    }

    public CreateSmartAccessGatewayResponse createSmartAccessGatewayWithOptions(CreateSmartAccessGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSmartAccessGateway", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSmartAccessGatewayResponse());
    }

    public CreateSmartAccessGatewayResponse createSmartAccessGateway(CreateSmartAccessGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSmartAccessGatewayWithOptions(request, runtime);
    }

    public DeleteFlowLogResponse deleteFlowLogWithOptions(DeleteFlowLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlowLog", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowLogResponse());
    }

    public DeleteFlowLogResponse deleteFlowLog(DeleteFlowLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowLogWithOptions(request, runtime);
    }

    public DescribeSagOnlineClientStatisticsResponse describeSagOnlineClientStatisticsWithOptions(DescribeSagOnlineClientStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagOnlineClientStatistics", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagOnlineClientStatisticsResponse());
    }

    public DescribeSagOnlineClientStatisticsResponse describeSagOnlineClientStatistics(DescribeSagOnlineClientStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagOnlineClientStatisticsWithOptions(request, runtime);
    }

    public ModifyCloudConnectNetworkResponse modifyCloudConnectNetworkWithOptions(ModifyCloudConnectNetworkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCloudConnectNetwork", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCloudConnectNetworkResponse());
    }

    public ModifyCloudConnectNetworkResponse modifyCloudConnectNetwork(ModifyCloudConnectNetworkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCloudConnectNetworkWithOptions(request, runtime);
    }

    public ModifySmartAccessGatewayUpBandwidthResponse modifySmartAccessGatewayUpBandwidthWithOptions(ModifySmartAccessGatewayUpBandwidthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySmartAccessGatewayUpBandwidth", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySmartAccessGatewayUpBandwidthResponse());
    }

    public ModifySmartAccessGatewayUpBandwidthResponse modifySmartAccessGatewayUpBandwidth(ModifySmartAccessGatewayUpBandwidthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySmartAccessGatewayUpBandwidthWithOptions(request, runtime);
    }

    public GrantSagInstanceToCcnResponse grantSagInstanceToCcnWithOptions(GrantSagInstanceToCcnRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GrantSagInstanceToCcn", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new GrantSagInstanceToCcnResponse());
    }

    public GrantSagInstanceToCcnResponse grantSagInstanceToCcn(GrantSagInstanceToCcnRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantSagInstanceToCcnWithOptions(request, runtime);
    }

    public ModifySmartAccessGatewayResponse modifySmartAccessGatewayWithOptions(ModifySmartAccessGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySmartAccessGateway", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySmartAccessGatewayResponse());
    }

    public ModifySmartAccessGatewayResponse modifySmartAccessGateway(ModifySmartAccessGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySmartAccessGatewayWithOptions(request, runtime);
    }

    public UpdateSmartAccessGatewayVersionResponse updateSmartAccessGatewayVersionWithOptions(UpdateSmartAccessGatewayVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSmartAccessGatewayVersion", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSmartAccessGatewayVersionResponse());
    }

    public UpdateSmartAccessGatewayVersionResponse updateSmartAccessGatewayVersion(UpdateSmartAccessGatewayVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSmartAccessGatewayVersionWithOptions(request, runtime);
    }

    public DescribeSagDropTopNResponse describeSagDropTopNWithOptions(DescribeSagDropTopNRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagDropTopN", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagDropTopNResponse());
    }

    public DescribeSagDropTopNResponse describeSagDropTopN(DescribeSagDropTopNRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagDropTopNWithOptions(request, runtime);
    }

    public DescribeSagLanListResponse describeSagLanListWithOptions(DescribeSagLanListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagLanList", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagLanListResponse());
    }

    public DescribeSagLanListResponse describeSagLanList(DescribeSagLanListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagLanListWithOptions(request, runtime);
    }

    public DescribeACLAttributeResponse describeACLAttributeWithOptions(DescribeACLAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeACLAttribute", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeACLAttributeResponse());
    }

    public DescribeACLAttributeResponse describeACLAttribute(DescribeACLAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeACLAttributeWithOptions(request, runtime);
    }

    public DeleteSagExpressConnectInterfaceResponse deleteSagExpressConnectInterfaceWithOptions(DeleteSagExpressConnectInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSagExpressConnectInterface", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSagExpressConnectInterfaceResponse());
    }

    public DeleteSagExpressConnectInterfaceResponse deleteSagExpressConnectInterface(DeleteSagExpressConnectInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSagExpressConnectInterfaceWithOptions(request, runtime);
    }

    public ListEnterpriseCodeResponse listEnterpriseCodeWithOptions(ListEnterpriseCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEnterpriseCode", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListEnterpriseCodeResponse());
    }

    public ListEnterpriseCodeResponse listEnterpriseCode(ListEnterpriseCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEnterpriseCodeWithOptions(request, runtime);
    }

    public CreateSmartAccessGatewaySoftwareResponse createSmartAccessGatewaySoftwareWithOptions(CreateSmartAccessGatewaySoftwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSmartAccessGatewaySoftware", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSmartAccessGatewaySoftwareResponse());
    }

    public CreateSmartAccessGatewaySoftwareResponse createSmartAccessGatewaySoftware(CreateSmartAccessGatewaySoftwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSmartAccessGatewaySoftwareWithOptions(request, runtime);
    }

    public DescribeQosesResponse describeQosesWithOptions(DescribeQosesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeQoses", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeQosesResponse());
    }

    public DescribeQosesResponse describeQoses(DescribeQosesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeQosesWithOptions(request, runtime);
    }

    public UpgradeSmartAccessGatewaySoftwareResponse upgradeSmartAccessGatewaySoftwareWithOptions(UpgradeSmartAccessGatewaySoftwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeSmartAccessGatewaySoftware", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeSmartAccessGatewaySoftwareResponse());
    }

    public UpgradeSmartAccessGatewaySoftwareResponse upgradeSmartAccessGatewaySoftware(UpgradeSmartAccessGatewaySoftwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeSmartAccessGatewaySoftwareWithOptions(request, runtime);
    }

    public DescribeSagCurrentDnsResponse describeSagCurrentDnsWithOptions(DescribeSagCurrentDnsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagCurrentDns", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagCurrentDnsResponse());
    }

    public DescribeSagCurrentDnsResponse describeSagCurrentDns(DescribeSagCurrentDnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagCurrentDnsWithOptions(request, runtime);
    }

    public DescribeSmartAccessGatewaysResponse describeSmartAccessGatewaysWithOptions(DescribeSmartAccessGatewaysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSmartAccessGateways", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSmartAccessGatewaysResponse());
    }

    public DescribeSmartAccessGatewaysResponse describeSmartAccessGateways(DescribeSmartAccessGatewaysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSmartAccessGatewaysWithOptions(request, runtime);
    }

    public DescribeQosCarsResponse describeQosCarsWithOptions(DescribeQosCarsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeQosCars", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeQosCarsResponse());
    }

    public DescribeQosCarsResponse describeQosCars(DescribeQosCarsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeQosCarsWithOptions(request, runtime);
    }

    public DescribeUserOnlineClientStatisticsResponse describeUserOnlineClientStatisticsWithOptions(DescribeUserOnlineClientStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserOnlineClientStatistics", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserOnlineClientStatisticsResponse());
    }

    public DescribeUserOnlineClientStatisticsResponse describeUserOnlineClientStatistics(DescribeUserOnlineClientStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserOnlineClientStatisticsWithOptions(request, runtime);
    }

    public UpdateEnterpriseCodeResponse updateEnterpriseCodeWithOptions(UpdateEnterpriseCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateEnterpriseCode", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateEnterpriseCodeResponse());
    }

    public UpdateEnterpriseCodeResponse updateEnterpriseCode(UpdateEnterpriseCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEnterpriseCodeWithOptions(request, runtime);
    }

    public BindVbrResponse bindVbrWithOptions(BindVbrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindVbr", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new BindVbrResponse());
    }

    public BindVbrResponse bindVbr(BindVbrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindVbrWithOptions(request, runtime);
    }

    public DescribeSagRouteProtocolBgpResponse describeSagRouteProtocolBgpWithOptions(DescribeSagRouteProtocolBgpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagRouteProtocolBgp", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagRouteProtocolBgpResponse());
    }

    public DescribeSagRouteProtocolBgpResponse describeSagRouteProtocolBgp(DescribeSagRouteProtocolBgpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagRouteProtocolBgpWithOptions(request, runtime);
    }

    public DisableSmartAccessGatewayUserResponse disableSmartAccessGatewayUserWithOptions(DisableSmartAccessGatewayUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableSmartAccessGatewayUser", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DisableSmartAccessGatewayUserResponse());
    }

    public DisableSmartAccessGatewayUserResponse disableSmartAccessGatewayUser(DisableSmartAccessGatewayUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableSmartAccessGatewayUserWithOptions(request, runtime);
    }

    public DeleteDnatEntryResponse deleteDnatEntryWithOptions(DeleteDnatEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDnatEntry", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDnatEntryResponse());
    }

    public DeleteDnatEntryResponse deleteDnatEntry(DeleteDnatEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDnatEntryWithOptions(request, runtime);
    }

    public ModifyACLResponse modifyACLWithOptions(ModifyACLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyACL", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyACLResponse());
    }

    public ModifyACLResponse modifyACL(ModifyACLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyACLWithOptions(request, runtime);
    }

    public GetSmartAccessGatewayUseLimitResponse getSmartAccessGatewayUseLimitWithOptions(GetSmartAccessGatewayUseLimitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSmartAccessGatewayUseLimit", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetSmartAccessGatewayUseLimitResponse());
    }

    public GetSmartAccessGatewayUseLimitResponse getSmartAccessGatewayUseLimit(GetSmartAccessGatewayUseLimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSmartAccessGatewayUseLimitWithOptions(request, runtime);
    }

    public DeleteSmartAccessGatewayResponse deleteSmartAccessGatewayWithOptions(DeleteSmartAccessGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSmartAccessGateway", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSmartAccessGatewayResponse());
    }

    public DeleteSmartAccessGatewayResponse deleteSmartAccessGateway(DeleteSmartAccessGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSmartAccessGatewayWithOptions(request, runtime);
    }

    public GrantInstanceToCbnResponse grantInstanceToCbnWithOptions(GrantInstanceToCbnRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GrantInstanceToCbn", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new GrantInstanceToCbnResponse());
    }

    public GrantInstanceToCbnResponse grantInstanceToCbn(GrantInstanceToCbnRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantInstanceToCbnWithOptions(request, runtime);
    }

    public AddSnatEntryResponse addSnatEntryWithOptions(AddSnatEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddSnatEntry", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new AddSnatEntryResponse());
    }

    public AddSnatEntryResponse addSnatEntry(AddSnatEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSnatEntryWithOptions(request, runtime);
    }

    public DisableSmartAGDpiMonitorResponse disableSmartAGDpiMonitorWithOptions(DisableSmartAGDpiMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableSmartAGDpiMonitor", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DisableSmartAGDpiMonitorResponse());
    }

    public DisableSmartAGDpiMonitorResponse disableSmartAGDpiMonitor(DisableSmartAGDpiMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableSmartAGDpiMonitorWithOptions(request, runtime);
    }

    public DescribeSnatEntriesResponse describeSnatEntriesWithOptions(DescribeSnatEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSnatEntries", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSnatEntriesResponse());
    }

    public DescribeSnatEntriesResponse describeSnatEntries(DescribeSnatEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnatEntriesWithOptions(request, runtime);
    }

    public ModifyClientUserDNSResponse modifyClientUserDNSWithOptions(ModifyClientUserDNSRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyClientUserDNS", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyClientUserDNSResponse());
    }

    public ModifyClientUserDNSResponse modifyClientUserDNS(ModifyClientUserDNSRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyClientUserDNSWithOptions(request, runtime);
    }

    public ModifySagRouteProtocolBgpResponse modifySagRouteProtocolBgpWithOptions(ModifySagRouteProtocolBgpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySagRouteProtocolBgp", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySagRouteProtocolBgpResponse());
    }

    public ModifySagRouteProtocolBgpResponse modifySagRouteProtocolBgp(ModifySagRouteProtocolBgpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySagRouteProtocolBgpWithOptions(request, runtime);
    }

    public ModifyQosCarResponse modifyQosCarWithOptions(ModifyQosCarRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyQosCar", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyQosCarResponse());
    }

    public ModifyQosCarResponse modifyQosCar(ModifyQosCarRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyQosCarWithOptions(request, runtime);
    }

    public CreateFlowLogResponse createFlowLogWithOptions(CreateFlowLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlowLog", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowLogResponse());
    }

    public CreateFlowLogResponse createFlowLog(CreateFlowLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowLogWithOptions(request, runtime);
    }

    public ModifyDeviceAutoUpgradePolicyResponse modifyDeviceAutoUpgradePolicyWithOptions(ModifyDeviceAutoUpgradePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDeviceAutoUpgradePolicy", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDeviceAutoUpgradePolicyResponse());
    }

    public ModifyDeviceAutoUpgradePolicyResponse modifyDeviceAutoUpgradePolicy(ModifyDeviceAutoUpgradePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDeviceAutoUpgradePolicyWithOptions(request, runtime);
    }

    public DescribeClientUserDNSResponse describeClientUserDNSWithOptions(DescribeClientUserDNSRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClientUserDNS", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClientUserDNSResponse());
    }

    public DescribeClientUserDNSResponse describeClientUserDNS(DescribeClientUserDNSRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClientUserDNSWithOptions(request, runtime);
    }

    public ClearSagCipherResponse clearSagCipherWithOptions(ClearSagCipherRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ClearSagCipher", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ClearSagCipherResponse());
    }

    public ClearSagCipherResponse clearSagCipher(ClearSagCipherRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clearSagCipherWithOptions(request, runtime);
    }

    public DescribeSagWan4GResponse describeSagWan4GWithOptions(DescribeSagWan4GRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagWan4G", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagWan4GResponse());
    }

    public DescribeSagWan4GResponse describeSagWan4G(DescribeSagWan4GRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagWan4GWithOptions(request, runtime);
    }

    public ModifySagUserDnsResponse modifySagUserDnsWithOptions(ModifySagUserDnsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySagUserDns", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySagUserDnsResponse());
    }

    public ModifySagUserDnsResponse modifySagUserDns(ModifySagUserDnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySagUserDnsWithOptions(request, runtime);
    }

    public ModifySagManagementPortResponse modifySagManagementPortWithOptions(ModifySagManagementPortRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySagManagementPort", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySagManagementPortResponse());
    }

    public ModifySagManagementPortResponse modifySagManagementPort(ModifySagManagementPortRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySagManagementPortWithOptions(request, runtime);
    }

    public DescribeDnatEntriesResponse describeDnatEntriesWithOptions(DescribeDnatEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnatEntries", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnatEntriesResponse());
    }

    public DescribeDnatEntriesResponse describeDnatEntries(DescribeDnatEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnatEntriesWithOptions(request, runtime);
    }

    public DescribeSmartAccessGatewayVersionsResponse describeSmartAccessGatewayVersionsWithOptions(DescribeSmartAccessGatewayVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSmartAccessGatewayVersions", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSmartAccessGatewayVersionsResponse());
    }

    public DescribeSmartAccessGatewayVersionsResponse describeSmartAccessGatewayVersions(DescribeSmartAccessGatewayVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSmartAccessGatewayVersionsWithOptions(request, runtime);
    }

    public RevokeInstanceFromCbnResponse revokeInstanceFromCbnWithOptions(RevokeInstanceFromCbnRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RevokeInstanceFromCbn", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new RevokeInstanceFromCbnResponse());
    }

    public RevokeInstanceFromCbnResponse revokeInstanceFromCbn(RevokeInstanceFromCbnRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeInstanceFromCbnWithOptions(request, runtime);
    }

    public DescribeSagRemoteAccessResponse describeSagRemoteAccessWithOptions(DescribeSagRemoteAccessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagRemoteAccess", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagRemoteAccessResponse());
    }

    public DescribeSagRemoteAccessResponse describeSagRemoteAccess(DescribeSagRemoteAccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagRemoteAccessWithOptions(request, runtime);
    }

    public CreateQosPolicyResponse createQosPolicyWithOptions(CreateQosPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateQosPolicy", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateQosPolicyResponse());
    }

    public CreateQosPolicyResponse createQosPolicy(CreateQosPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createQosPolicyWithOptions(request, runtime);
    }

    public DescribeFlowLogSagsResponse describeFlowLogSagsWithOptions(DescribeFlowLogSagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowLogSags", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowLogSagsResponse());
    }

    public DescribeFlowLogSagsResponse describeFlowLogSags(DescribeFlowLogSagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowLogSagsWithOptions(request, runtime);
    }

    public ModifySagWifiResponse modifySagWifiWithOptions(ModifySagWifiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySagWifi", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySagWifiResponse());
    }

    public ModifySagWifiResponse modifySagWifi(ModifySagWifiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySagWifiWithOptions(request, runtime);
    }

    public ModifySagWanResponse modifySagWanWithOptions(ModifySagWanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySagWan", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySagWanResponse());
    }

    public ModifySagWanResponse modifySagWan(ModifySagWanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySagWanWithOptions(request, runtime);
    }

    public DescribeSmartAccessGatewayHaResponse describeSmartAccessGatewayHaWithOptions(DescribeSmartAccessGatewayHaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSmartAccessGatewayHa", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSmartAccessGatewayHaResponse());
    }

    public DescribeSmartAccessGatewayHaResponse describeSmartAccessGatewayHa(DescribeSmartAccessGatewayHaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSmartAccessGatewayHaWithOptions(request, runtime);
    }

    public DeleteCloudConnectNetworkResponse deleteCloudConnectNetworkWithOptions(DeleteCloudConnectNetworkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCloudConnectNetwork", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCloudConnectNetworkResponse());
    }

    public DeleteCloudConnectNetworkResponse deleteCloudConnectNetwork(DeleteCloudConnectNetworkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCloudConnectNetworkWithOptions(request, runtime);
    }

    public DowngradeSmartAccessGatewaySoftwareResponse downgradeSmartAccessGatewaySoftwareWithOptions(DowngradeSmartAccessGatewaySoftwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DowngradeSmartAccessGatewaySoftware", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DowngradeSmartAccessGatewaySoftwareResponse());
    }

    public DowngradeSmartAccessGatewaySoftwareResponse downgradeSmartAccessGatewaySoftware(DowngradeSmartAccessGatewaySoftwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downgradeSmartAccessGatewaySoftwareWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeHealthChecksResponse describeHealthChecksWithOptions(DescribeHealthChecksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHealthChecks", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHealthChecksResponse());
    }

    public DescribeHealthChecksResponse describeHealthChecks(DescribeHealthChecksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHealthChecksWithOptions(request, runtime);
    }

    public GetCloudConnectNetworkUseLimitResponse getCloudConnectNetworkUseLimitWithOptions(GetCloudConnectNetworkUseLimitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCloudConnectNetworkUseLimit", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetCloudConnectNetworkUseLimitResponse());
    }

    public GetCloudConnectNetworkUseLimitResponse getCloudConnectNetworkUseLimit(GetCloudConnectNetworkUseLimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCloudConnectNetworkUseLimitWithOptions(request, runtime);
    }

    public ListAccessPointsResponse listAccessPointsWithOptions(ListAccessPointsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAccessPoints", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListAccessPointsResponse());
    }

    public ListAccessPointsResponse listAccessPoints(ListAccessPointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAccessPointsWithOptions(request, runtime);
    }

    public DeleteQosCarResponse deleteQosCarWithOptions(DeleteQosCarRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteQosCar", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteQosCarResponse());
    }

    public DeleteQosCarResponse deleteQosCar(DeleteQosCarRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteQosCarWithOptions(request, runtime);
    }

    public DescribeDeviceAutoUpgradePolicyResponse describeDeviceAutoUpgradePolicyWithOptions(DescribeDeviceAutoUpgradePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeviceAutoUpgradePolicy", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDeviceAutoUpgradePolicyResponse());
    }

    public DescribeDeviceAutoUpgradePolicyResponse describeDeviceAutoUpgradePolicy(DescribeDeviceAutoUpgradePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeviceAutoUpgradePolicyWithOptions(request, runtime);
    }

    public ListDpiSignaturesResponse listDpiSignaturesWithOptions(ListDpiSignaturesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDpiSignatures", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListDpiSignaturesResponse());
    }

    public ListDpiSignaturesResponse listDpiSignatures(ListDpiSignaturesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDpiSignaturesWithOptions(request, runtime);
    }

    public UnbindVbrResponse unbindVbrWithOptions(UnbindVbrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindVbr", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindVbrResponse());
    }

    public UnbindVbrResponse unbindVbr(UnbindVbrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindVbrWithOptions(request, runtime);
    }

    public DescribeBindableSmartAccessGatewaysResponse describeBindableSmartAccessGatewaysWithOptions(DescribeBindableSmartAccessGatewaysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBindableSmartAccessGateways", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBindableSmartAccessGatewaysResponse());
    }

    public DescribeBindableSmartAccessGatewaysResponse describeBindableSmartAccessGateways(DescribeBindableSmartAccessGatewaysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBindableSmartAccessGatewaysWithOptions(request, runtime);
    }

    public DescribeSagPortListResponse describeSagPortListWithOptions(DescribeSagPortListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSagPortList", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSagPortListResponse());
    }

    public DescribeSagPortListResponse describeSagPortList(DescribeSagPortListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSagPortListWithOptions(request, runtime);
    }

    public ListDpiGroupsResponse listDpiGroupsWithOptions(ListDpiGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDpiGroups", "2018-03-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListDpiGroupsResponse());
    }

    public ListDpiGroupsResponse listDpiGroups(ListDpiGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDpiGroupsWithOptions(request, runtime);
    }
}

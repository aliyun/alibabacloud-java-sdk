// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428;

import com.aliyun.tea.*;
import com.aliyun.vpc20160428.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "vpc.aliyuncs.com"),
            new TeaPair("cn-beijing", "vpc.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "vpc.aliyuncs.com"),
            new TeaPair("cn-shanghai", "vpc.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "vpc.aliyuncs.com"),
            new TeaPair("cn-hongkong", "vpc.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "vpc.aliyuncs.com"),
            new TeaPair("us-west-1", "vpc.aliyuncs.com"),
            new TeaPair("us-east-1", "vpc.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "vpc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "vpc.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "vpc.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "vpc.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "vpc.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "vpc.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "vpc.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "vpc.aliyuncs.com"),
            new TeaPair("cn-edge-1", "vpc-nebula.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("cn-fujian", "vpc.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "vpc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "vpc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "vpc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "vpc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "vpc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "vpc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "vpc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "vpc.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "vpc.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "vpc-nebula.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "vpc.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "vpc.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "vpc.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "vpc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "vpc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "vpc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "vpc.aliyuncs.com"),
            new TeaPair("cn-wuhan", "vpc.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "vpc.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "vpc.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "vpc.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "vpc-nebula.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "vpc-nebula.cn-shenzhen-cloudstone.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "vpc.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("vpc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ActivateRouterInterfaceResponse activateRouterInterfaceWithOptions(ActivateRouterInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ActivateRouterInterface", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ActivateRouterInterfaceResponse());
    }

    public ActivateRouterInterfaceResponse activateRouterInterface(ActivateRouterInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activateRouterInterfaceWithOptions(request, runtime);
    }

    public ActiveFlowLogResponse activeFlowLogWithOptions(ActiveFlowLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ActiveFlowLog", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ActiveFlowLogResponse());
    }

    public ActiveFlowLogResponse activeFlowLog(ActiveFlowLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activeFlowLogWithOptions(request, runtime);
    }

    public AddBgpNetworkResponse addBgpNetworkWithOptions(AddBgpNetworkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddBgpNetwork", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AddBgpNetworkResponse());
    }

    public AddBgpNetworkResponse addBgpNetwork(AddBgpNetworkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addBgpNetworkWithOptions(request, runtime);
    }

    public AddCommonBandwidthPackageIpResponse addCommonBandwidthPackageIpWithOptions(AddCommonBandwidthPackageIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCommonBandwidthPackageIp", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AddCommonBandwidthPackageIpResponse());
    }

    public AddCommonBandwidthPackageIpResponse addCommonBandwidthPackageIp(AddCommonBandwidthPackageIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCommonBandwidthPackageIpWithOptions(request, runtime);
    }

    public AddCommonBandwidthPackageIpsResponse addCommonBandwidthPackageIpsWithOptions(AddCommonBandwidthPackageIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCommonBandwidthPackageIps", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AddCommonBandwidthPackageIpsResponse());
    }

    public AddCommonBandwidthPackageIpsResponse addCommonBandwidthPackageIps(AddCommonBandwidthPackageIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCommonBandwidthPackageIpsWithOptions(request, runtime);
    }

    public AddGlobalAccelerationInstanceIpResponse addGlobalAccelerationInstanceIpWithOptions(AddGlobalAccelerationInstanceIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddGlobalAccelerationInstanceIp", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AddGlobalAccelerationInstanceIpResponse());
    }

    public AddGlobalAccelerationInstanceIpResponse addGlobalAccelerationInstanceIp(AddGlobalAccelerationInstanceIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGlobalAccelerationInstanceIpWithOptions(request, runtime);
    }

    public AddIPv6TranslatorAclListEntryResponse addIPv6TranslatorAclListEntryWithOptions(AddIPv6TranslatorAclListEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddIPv6TranslatorAclListEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AddIPv6TranslatorAclListEntryResponse());
    }

    public AddIPv6TranslatorAclListEntryResponse addIPv6TranslatorAclListEntry(AddIPv6TranslatorAclListEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addIPv6TranslatorAclListEntryWithOptions(request, runtime);
    }

    public AllocateEipAddressResponse allocateEipAddressWithOptions(AllocateEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateEipAddress", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateEipAddressResponse());
    }

    public AllocateEipAddressResponse allocateEipAddress(AllocateEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateEipAddressWithOptions(request, runtime);
    }

    public AllocateEipAddressProResponse allocateEipAddressProWithOptions(AllocateEipAddressProRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateEipAddressPro", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateEipAddressProResponse());
    }

    public AllocateEipAddressProResponse allocateEipAddressPro(AllocateEipAddressProRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateEipAddressProWithOptions(request, runtime);
    }

    public AllocateEipSegmentAddressResponse allocateEipSegmentAddressWithOptions(AllocateEipSegmentAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateEipSegmentAddress", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateEipSegmentAddressResponse());
    }

    public AllocateEipSegmentAddressResponse allocateEipSegmentAddress(AllocateEipSegmentAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateEipSegmentAddressWithOptions(request, runtime);
    }

    public AllocateIpv6InternetBandwidthResponse allocateIpv6InternetBandwidthWithOptions(AllocateIpv6InternetBandwidthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateIpv6InternetBandwidth", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateIpv6InternetBandwidthResponse());
    }

    public AllocateIpv6InternetBandwidthResponse allocateIpv6InternetBandwidth(AllocateIpv6InternetBandwidthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateIpv6InternetBandwidthWithOptions(request, runtime);
    }

    public AssociateEipAddressResponse associateEipAddressWithOptions(AssociateEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateEipAddress", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateEipAddressResponse());
    }

    public AssociateEipAddressResponse associateEipAddress(AssociateEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateEipAddressWithOptions(request, runtime);
    }

    public AssociateGlobalAccelerationInstanceResponse associateGlobalAccelerationInstanceWithOptions(AssociateGlobalAccelerationInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateGlobalAccelerationInstance", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateGlobalAccelerationInstanceResponse());
    }

    public AssociateGlobalAccelerationInstanceResponse associateGlobalAccelerationInstance(AssociateGlobalAccelerationInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateGlobalAccelerationInstanceWithOptions(request, runtime);
    }

    public AssociateHaVipResponse associateHaVipWithOptions(AssociateHaVipRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateHaVip", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateHaVipResponse());
    }

    public AssociateHaVipResponse associateHaVip(AssociateHaVipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateHaVipWithOptions(request, runtime);
    }

    public AssociateNetworkAclResponse associateNetworkAclWithOptions(AssociateNetworkAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateNetworkAcl", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateNetworkAclResponse());
    }

    public AssociateNetworkAclResponse associateNetworkAcl(AssociateNetworkAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateNetworkAclWithOptions(request, runtime);
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterResponse associatePhysicalConnectionToVirtualBorderRouterWithOptions(AssociatePhysicalConnectionToVirtualBorderRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociatePhysicalConnectionToVirtualBorderRouter", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AssociatePhysicalConnectionToVirtualBorderRouterResponse());
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterResponse associatePhysicalConnectionToVirtualBorderRouter(AssociatePhysicalConnectionToVirtualBorderRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associatePhysicalConnectionToVirtualBorderRouterWithOptions(request, runtime);
    }

    public AssociateRouteTableResponse associateRouteTableWithOptions(AssociateRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateRouteTable", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateRouteTableResponse());
    }

    public AssociateRouteTableResponse associateRouteTable(AssociateRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateRouteTableWithOptions(request, runtime);
    }

    public AssociateVpcCidrBlockResponse associateVpcCidrBlockWithOptions(AssociateVpcCidrBlockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateVpcCidrBlock", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateVpcCidrBlockResponse());
    }

    public AssociateVpcCidrBlockResponse associateVpcCidrBlock(AssociateVpcCidrBlockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateVpcCidrBlockWithOptions(request, runtime);
    }

    public AssociateVpnGatewayWithCertificateResponse associateVpnGatewayWithCertificateWithOptions(AssociateVpnGatewayWithCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateVpnGatewayWithCertificate", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateVpnGatewayWithCertificateResponse());
    }

    public AssociateVpnGatewayWithCertificateResponse associateVpnGatewayWithCertificate(AssociateVpnGatewayWithCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateVpnGatewayWithCertificateWithOptions(request, runtime);
    }

    public AttachDhcpOptionsSetToVpcResponse attachDhcpOptionsSetToVpcWithOptions(AttachDhcpOptionsSetToVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachDhcpOptionsSetToVpc", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new AttachDhcpOptionsSetToVpcResponse());
    }

    public AttachDhcpOptionsSetToVpcResponse attachDhcpOptionsSetToVpc(AttachDhcpOptionsSetToVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachDhcpOptionsSetToVpcWithOptions(request, runtime);
    }

    public CancelCommonBandwidthPackageIpBandwidthResponse cancelCommonBandwidthPackageIpBandwidthWithOptions(CancelCommonBandwidthPackageIpBandwidthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelCommonBandwidthPackageIpBandwidth", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CancelCommonBandwidthPackageIpBandwidthResponse());
    }

    public CancelCommonBandwidthPackageIpBandwidthResponse cancelCommonBandwidthPackageIpBandwidth(CancelCommonBandwidthPackageIpBandwidthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelCommonBandwidthPackageIpBandwidthWithOptions(request, runtime);
    }

    public CancelExpressCloudConnectionResponse cancelExpressCloudConnectionWithOptions(CancelExpressCloudConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelExpressCloudConnection", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CancelExpressCloudConnectionResponse());
    }

    public CancelExpressCloudConnectionResponse cancelExpressCloudConnection(CancelExpressCloudConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelExpressCloudConnectionWithOptions(request, runtime);
    }

    public CancelPhysicalConnectionResponse cancelPhysicalConnectionWithOptions(CancelPhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelPhysicalConnection", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CancelPhysicalConnectionResponse());
    }

    public CancelPhysicalConnectionResponse cancelPhysicalConnection(CancelPhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelPhysicalConnectionWithOptions(request, runtime);
    }

    public ConfirmPhysicalConnectionResponse confirmPhysicalConnectionWithOptions(ConfirmPhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfirmPhysicalConnection", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ConfirmPhysicalConnectionResponse());
    }

    public ConfirmPhysicalConnectionResponse confirmPhysicalConnection(ConfirmPhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmPhysicalConnectionWithOptions(request, runtime);
    }

    public ConnectRouterInterfaceResponse connectRouterInterfaceWithOptions(ConnectRouterInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConnectRouterInterface", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ConnectRouterInterfaceResponse());
    }

    public ConnectRouterInterfaceResponse connectRouterInterface(ConnectRouterInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.connectRouterInterfaceWithOptions(request, runtime);
    }

    public ConvertBandwidthPackageResponse convertBandwidthPackageWithOptions(ConvertBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConvertBandwidthPackage", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ConvertBandwidthPackageResponse());
    }

    public ConvertBandwidthPackageResponse convertBandwidthPackage(ConvertBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.convertBandwidthPackageWithOptions(request, runtime);
    }

    public CopyNetworkAclEntriesResponse copyNetworkAclEntriesWithOptions(CopyNetworkAclEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CopyNetworkAclEntries", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CopyNetworkAclEntriesResponse());
    }

    public CopyNetworkAclEntriesResponse copyNetworkAclEntries(CopyNetworkAclEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copyNetworkAclEntriesWithOptions(request, runtime);
    }

    public CreateBgpGroupResponse createBgpGroupWithOptions(CreateBgpGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBgpGroup", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBgpGroupResponse());
    }

    public CreateBgpGroupResponse createBgpGroup(CreateBgpGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBgpGroupWithOptions(request, runtime);
    }

    public CreateBgpPeerResponse createBgpPeerWithOptions(CreateBgpPeerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBgpPeer", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBgpPeerResponse());
    }

    public CreateBgpPeerResponse createBgpPeer(CreateBgpPeerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBgpPeerWithOptions(request, runtime);
    }

    public CreateCommonBandwidthPackageResponse createCommonBandwidthPackageWithOptions(CreateCommonBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCommonBandwidthPackage", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCommonBandwidthPackageResponse());
    }

    public CreateCommonBandwidthPackageResponse createCommonBandwidthPackage(CreateCommonBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCommonBandwidthPackageWithOptions(request, runtime);
    }

    public CreateCustomerGatewayResponse createCustomerGatewayWithOptions(CreateCustomerGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCustomerGateway", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCustomerGatewayResponse());
    }

    public CreateCustomerGatewayResponse createCustomerGateway(CreateCustomerGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCustomerGatewayWithOptions(request, runtime);
    }

    public CreateDhcpOptionsSetResponse createDhcpOptionsSetWithOptions(CreateDhcpOptionsSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDhcpOptionsSet", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDhcpOptionsSetResponse());
    }

    public CreateDhcpOptionsSetResponse createDhcpOptionsSet(CreateDhcpOptionsSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDhcpOptionsSetWithOptions(request, runtime);
    }

    public CreateExpressCloudConnectionResponse createExpressCloudConnectionWithOptions(CreateExpressCloudConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateExpressCloudConnection", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateExpressCloudConnectionResponse());
    }

    public CreateExpressCloudConnectionResponse createExpressCloudConnection(CreateExpressCloudConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createExpressCloudConnectionWithOptions(request, runtime);
    }

    public CreateFlowLogResponse createFlowLogWithOptions(CreateFlowLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlowLog", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowLogResponse());
    }

    public CreateFlowLogResponse createFlowLog(CreateFlowLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowLogWithOptions(request, runtime);
    }

    public CreateForwardEntryResponse createForwardEntryWithOptions(CreateForwardEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateForwardEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateForwardEntryResponse());
    }

    public CreateForwardEntryResponse createForwardEntry(CreateForwardEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createForwardEntryWithOptions(request, runtime);
    }

    public CreateGlobalAccelerationInstanceResponse createGlobalAccelerationInstanceWithOptions(CreateGlobalAccelerationInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGlobalAccelerationInstance", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGlobalAccelerationInstanceResponse());
    }

    public CreateGlobalAccelerationInstanceResponse createGlobalAccelerationInstance(CreateGlobalAccelerationInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGlobalAccelerationInstanceWithOptions(request, runtime);
    }

    public CreateHaVipResponse createHaVipWithOptions(CreateHaVipRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateHaVip", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateHaVipResponse());
    }

    public CreateHaVipResponse createHaVip(CreateHaVipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHaVipWithOptions(request, runtime);
    }

    public CreateIpsecServerResponse createIpsecServerWithOptions(CreateIpsecServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIpsecServer", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIpsecServerResponse());
    }

    public CreateIpsecServerResponse createIpsecServer(CreateIpsecServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIpsecServerWithOptions(request, runtime);
    }

    public CreateIpv6EgressOnlyRuleResponse createIpv6EgressOnlyRuleWithOptions(CreateIpv6EgressOnlyRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIpv6EgressOnlyRule", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIpv6EgressOnlyRuleResponse());
    }

    public CreateIpv6EgressOnlyRuleResponse createIpv6EgressOnlyRule(CreateIpv6EgressOnlyRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIpv6EgressOnlyRuleWithOptions(request, runtime);
    }

    public CreateIpv6GatewayResponse createIpv6GatewayWithOptions(CreateIpv6GatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIpv6Gateway", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIpv6GatewayResponse());
    }

    public CreateIpv6GatewayResponse createIpv6Gateway(CreateIpv6GatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIpv6GatewayWithOptions(request, runtime);
    }

    public CreateIPv6TranslatorResponse createIPv6TranslatorWithOptions(CreateIPv6TranslatorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIPv6Translator", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIPv6TranslatorResponse());
    }

    public CreateIPv6TranslatorResponse createIPv6Translator(CreateIPv6TranslatorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIPv6TranslatorWithOptions(request, runtime);
    }

    public CreateIPv6TranslatorAclListResponse createIPv6TranslatorAclListWithOptions(CreateIPv6TranslatorAclListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIPv6TranslatorAclList", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIPv6TranslatorAclListResponse());
    }

    public CreateIPv6TranslatorAclListResponse createIPv6TranslatorAclList(CreateIPv6TranslatorAclListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIPv6TranslatorAclListWithOptions(request, runtime);
    }

    public CreateIPv6TranslatorEntryResponse createIPv6TranslatorEntryWithOptions(CreateIPv6TranslatorEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIPv6TranslatorEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIPv6TranslatorEntryResponse());
    }

    public CreateIPv6TranslatorEntryResponse createIPv6TranslatorEntry(CreateIPv6TranslatorEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIPv6TranslatorEntryWithOptions(request, runtime);
    }

    public CreateNatGatewayResponse createNatGatewayWithOptions(CreateNatGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateNatGateway", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateNatGatewayResponse());
    }

    public CreateNatGatewayResponse createNatGateway(CreateNatGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNatGatewayWithOptions(request, runtime);
    }

    public CreateNetworkAclResponse createNetworkAclWithOptions(CreateNetworkAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateNetworkAcl", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateNetworkAclResponse());
    }

    public CreateNetworkAclResponse createNetworkAcl(CreateNetworkAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNetworkAclWithOptions(request, runtime);
    }

    public CreatePhysicalConnectionOccupancyOrderResponse createPhysicalConnectionOccupancyOrderWithOptions(CreatePhysicalConnectionOccupancyOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePhysicalConnectionOccupancyOrder", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePhysicalConnectionOccupancyOrderResponse());
    }

    public CreatePhysicalConnectionOccupancyOrderResponse createPhysicalConnectionOccupancyOrder(CreatePhysicalConnectionOccupancyOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPhysicalConnectionOccupancyOrderWithOptions(request, runtime);
    }

    public CreateRouteEntryResponse createRouteEntryWithOptions(CreateRouteEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRouteEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRouteEntryResponse());
    }

    public CreateRouteEntryResponse createRouteEntry(CreateRouteEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRouteEntryWithOptions(request, runtime);
    }

    public CreateRouteTableResponse createRouteTableWithOptions(CreateRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRouteTable", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRouteTableResponse());
    }

    public CreateRouteTableResponse createRouteTable(CreateRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRouteTableWithOptions(request, runtime);
    }

    public CreateSnatEntryResponse createSnatEntryWithOptions(CreateSnatEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSnatEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSnatEntryResponse());
    }

    public CreateSnatEntryResponse createSnatEntry(CreateSnatEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSnatEntryWithOptions(request, runtime);
    }

    public CreateSslVpnClientCertResponse createSslVpnClientCertWithOptions(CreateSslVpnClientCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSslVpnClientCert", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSslVpnClientCertResponse());
    }

    public CreateSslVpnClientCertResponse createSslVpnClientCert(CreateSslVpnClientCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSslVpnClientCertWithOptions(request, runtime);
    }

    public CreateSslVpnServerResponse createSslVpnServerWithOptions(CreateSslVpnServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSslVpnServer", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSslVpnServerResponse());
    }

    public CreateSslVpnServerResponse createSslVpnServer(CreateSslVpnServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSslVpnServerWithOptions(request, runtime);
    }

    public CreateVpcResponse createVpcWithOptions(CreateVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVpc", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVpcResponse());
    }

    public CreateVpcResponse createVpc(CreateVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVpcWithOptions(request, runtime);
    }

    public CreateVpnConnectionResponse createVpnConnectionWithOptions(CreateVpnConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVpnConnection", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVpnConnectionResponse());
    }

    public CreateVpnConnectionResponse createVpnConnection(CreateVpnConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVpnConnectionWithOptions(request, runtime);
    }

    public CreateVpnGatewayResponse createVpnGatewayWithOptions(CreateVpnGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVpnGateway", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVpnGatewayResponse());
    }

    public CreateVpnGatewayResponse createVpnGateway(CreateVpnGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVpnGatewayWithOptions(request, runtime);
    }

    public CreateVpnPbrRouteEntryResponse createVpnPbrRouteEntryWithOptions(CreateVpnPbrRouteEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVpnPbrRouteEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVpnPbrRouteEntryResponse());
    }

    public CreateVpnPbrRouteEntryResponse createVpnPbrRouteEntry(CreateVpnPbrRouteEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVpnPbrRouteEntryWithOptions(request, runtime);
    }

    public CreateVpnRouteEntryResponse createVpnRouteEntryWithOptions(CreateVpnRouteEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVpnRouteEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVpnRouteEntryResponse());
    }

    public CreateVpnRouteEntryResponse createVpnRouteEntry(CreateVpnRouteEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVpnRouteEntryWithOptions(request, runtime);
    }

    public CreateVSwitchResponse createVSwitchWithOptions(CreateVSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVSwitch", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVSwitchResponse());
    }

    public CreateVSwitchResponse createVSwitch(CreateVSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVSwitchWithOptions(request, runtime);
    }

    public DeactivateRouterInterfaceResponse deactivateRouterInterfaceWithOptions(DeactivateRouterInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeactivateRouterInterface", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeactivateRouterInterfaceResponse());
    }

    public DeactivateRouterInterfaceResponse deactivateRouterInterface(DeactivateRouterInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deactivateRouterInterfaceWithOptions(request, runtime);
    }

    public DeactiveFlowLogResponse deactiveFlowLogWithOptions(DeactiveFlowLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeactiveFlowLog", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeactiveFlowLogResponse());
    }

    public DeactiveFlowLogResponse deactiveFlowLog(DeactiveFlowLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deactiveFlowLogWithOptions(request, runtime);
    }

    public DeleteBgpGroupResponse deleteBgpGroupWithOptions(DeleteBgpGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBgpGroup", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBgpGroupResponse());
    }

    public DeleteBgpGroupResponse deleteBgpGroup(DeleteBgpGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBgpGroupWithOptions(request, runtime);
    }

    public DeleteBgpNetworkResponse deleteBgpNetworkWithOptions(DeleteBgpNetworkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBgpNetwork", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBgpNetworkResponse());
    }

    public DeleteBgpNetworkResponse deleteBgpNetwork(DeleteBgpNetworkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBgpNetworkWithOptions(request, runtime);
    }

    public DeleteBgpPeerResponse deleteBgpPeerWithOptions(DeleteBgpPeerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBgpPeer", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBgpPeerResponse());
    }

    public DeleteBgpPeerResponse deleteBgpPeer(DeleteBgpPeerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBgpPeerWithOptions(request, runtime);
    }

    public DeleteCommonBandwidthPackageResponse deleteCommonBandwidthPackageWithOptions(DeleteCommonBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCommonBandwidthPackage", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCommonBandwidthPackageResponse());
    }

    public DeleteCommonBandwidthPackageResponse deleteCommonBandwidthPackage(DeleteCommonBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCommonBandwidthPackageWithOptions(request, runtime);
    }

    public DeleteCustomerGatewayResponse deleteCustomerGatewayWithOptions(DeleteCustomerGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCustomerGateway", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCustomerGatewayResponse());
    }

    public DeleteCustomerGatewayResponse deleteCustomerGateway(DeleteCustomerGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCustomerGatewayWithOptions(request, runtime);
    }

    public DeleteDhcpOptionsSetResponse deleteDhcpOptionsSetWithOptions(DeleteDhcpOptionsSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDhcpOptionsSet", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDhcpOptionsSetResponse());
    }

    public DeleteDhcpOptionsSetResponse deleteDhcpOptionsSet(DeleteDhcpOptionsSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDhcpOptionsSetWithOptions(request, runtime);
    }

    public DeleteExpressCloudConnectionResponse deleteExpressCloudConnectionWithOptions(DeleteExpressCloudConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteExpressCloudConnection", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteExpressCloudConnectionResponse());
    }

    public DeleteExpressCloudConnectionResponse deleteExpressCloudConnection(DeleteExpressCloudConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteExpressCloudConnectionWithOptions(request, runtime);
    }

    public DeleteExpressConnectResponse deleteExpressConnectWithOptions(DeleteExpressConnectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteExpressConnect", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteExpressConnectResponse());
    }

    public DeleteExpressConnectResponse deleteExpressConnect(DeleteExpressConnectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteExpressConnectWithOptions(request, runtime);
    }

    public DeleteFlowLogResponse deleteFlowLogWithOptions(DeleteFlowLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlowLog", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowLogResponse());
    }

    public DeleteFlowLogResponse deleteFlowLog(DeleteFlowLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowLogWithOptions(request, runtime);
    }

    public DeleteForwardEntryResponse deleteForwardEntryWithOptions(DeleteForwardEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteForwardEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteForwardEntryResponse());
    }

    public DeleteForwardEntryResponse deleteForwardEntry(DeleteForwardEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteForwardEntryWithOptions(request, runtime);
    }

    public DeleteGlobalAccelerationInstanceResponse deleteGlobalAccelerationInstanceWithOptions(DeleteGlobalAccelerationInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteGlobalAccelerationInstance", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteGlobalAccelerationInstanceResponse());
    }

    public DeleteGlobalAccelerationInstanceResponse deleteGlobalAccelerationInstance(DeleteGlobalAccelerationInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGlobalAccelerationInstanceWithOptions(request, runtime);
    }

    public DeleteHaVipResponse deleteHaVipWithOptions(DeleteHaVipRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteHaVip", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteHaVipResponse());
    }

    public DeleteHaVipResponse deleteHaVip(DeleteHaVipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHaVipWithOptions(request, runtime);
    }

    public DeleteIpsecServerResponse deleteIpsecServerWithOptions(DeleteIpsecServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIpsecServer", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIpsecServerResponse());
    }

    public DeleteIpsecServerResponse deleteIpsecServer(DeleteIpsecServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIpsecServerWithOptions(request, runtime);
    }

    public DeleteIpv6EgressOnlyRuleResponse deleteIpv6EgressOnlyRuleWithOptions(DeleteIpv6EgressOnlyRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIpv6EgressOnlyRule", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIpv6EgressOnlyRuleResponse());
    }

    public DeleteIpv6EgressOnlyRuleResponse deleteIpv6EgressOnlyRule(DeleteIpv6EgressOnlyRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIpv6EgressOnlyRuleWithOptions(request, runtime);
    }

    public DeleteIpv6GatewayResponse deleteIpv6GatewayWithOptions(DeleteIpv6GatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIpv6Gateway", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIpv6GatewayResponse());
    }

    public DeleteIpv6GatewayResponse deleteIpv6Gateway(DeleteIpv6GatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIpv6GatewayWithOptions(request, runtime);
    }

    public DeleteIpv6InternetBandwidthResponse deleteIpv6InternetBandwidthWithOptions(DeleteIpv6InternetBandwidthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIpv6InternetBandwidth", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIpv6InternetBandwidthResponse());
    }

    public DeleteIpv6InternetBandwidthResponse deleteIpv6InternetBandwidth(DeleteIpv6InternetBandwidthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIpv6InternetBandwidthWithOptions(request, runtime);
    }

    public DeleteIPv6TranslatorResponse deleteIPv6TranslatorWithOptions(DeleteIPv6TranslatorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIPv6Translator", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIPv6TranslatorResponse());
    }

    public DeleteIPv6TranslatorResponse deleteIPv6Translator(DeleteIPv6TranslatorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIPv6TranslatorWithOptions(request, runtime);
    }

    public DeleteIPv6TranslatorAclListResponse deleteIPv6TranslatorAclListWithOptions(DeleteIPv6TranslatorAclListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIPv6TranslatorAclList", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIPv6TranslatorAclListResponse());
    }

    public DeleteIPv6TranslatorAclListResponse deleteIPv6TranslatorAclList(DeleteIPv6TranslatorAclListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIPv6TranslatorAclListWithOptions(request, runtime);
    }

    public DeleteIPv6TranslatorEntryResponse deleteIPv6TranslatorEntryWithOptions(DeleteIPv6TranslatorEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIPv6TranslatorEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIPv6TranslatorEntryResponse());
    }

    public DeleteIPv6TranslatorEntryResponse deleteIPv6TranslatorEntry(DeleteIPv6TranslatorEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIPv6TranslatorEntryWithOptions(request, runtime);
    }

    public DeleteNatGatewayResponse deleteNatGatewayWithOptions(DeleteNatGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNatGateway", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNatGatewayResponse());
    }

    public DeleteNatGatewayResponse deleteNatGateway(DeleteNatGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNatGatewayWithOptions(request, runtime);
    }

    public DeleteNetworkAclResponse deleteNetworkAclWithOptions(DeleteNetworkAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNetworkAcl", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNetworkAclResponse());
    }

    public DeleteNetworkAclResponse deleteNetworkAcl(DeleteNetworkAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNetworkAclWithOptions(request, runtime);
    }

    public DeletePhysicalConnectionResponse deletePhysicalConnectionWithOptions(DeletePhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePhysicalConnection", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePhysicalConnectionResponse());
    }

    public DeletePhysicalConnectionResponse deletePhysicalConnection(DeletePhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePhysicalConnectionWithOptions(request, runtime);
    }

    public DeleteRouteEntryResponse deleteRouteEntryWithOptions(DeleteRouteEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRouteEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRouteEntryResponse());
    }

    public DeleteRouteEntryResponse deleteRouteEntry(DeleteRouteEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRouteEntryWithOptions(request, runtime);
    }

    public DeleteRouterInterfaceResponse deleteRouterInterfaceWithOptions(DeleteRouterInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRouterInterface", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRouterInterfaceResponse());
    }

    public DeleteRouterInterfaceResponse deleteRouterInterface(DeleteRouterInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRouterInterfaceWithOptions(request, runtime);
    }

    public DeleteRouteTableResponse deleteRouteTableWithOptions(DeleteRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRouteTable", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRouteTableResponse());
    }

    public DeleteRouteTableResponse deleteRouteTable(DeleteRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRouteTableWithOptions(request, runtime);
    }

    public DeleteSnatEntryResponse deleteSnatEntryWithOptions(DeleteSnatEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSnatEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSnatEntryResponse());
    }

    public DeleteSnatEntryResponse deleteSnatEntry(DeleteSnatEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSnatEntryWithOptions(request, runtime);
    }

    public DeleteSslVpnClientCertResponse deleteSslVpnClientCertWithOptions(DeleteSslVpnClientCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSslVpnClientCert", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSslVpnClientCertResponse());
    }

    public DeleteSslVpnClientCertResponse deleteSslVpnClientCert(DeleteSslVpnClientCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSslVpnClientCertWithOptions(request, runtime);
    }

    public DeleteSslVpnServerResponse deleteSslVpnServerWithOptions(DeleteSslVpnServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSslVpnServer", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSslVpnServerResponse());
    }

    public DeleteSslVpnServerResponse deleteSslVpnServer(DeleteSslVpnServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSslVpnServerWithOptions(request, runtime);
    }

    public DeleteVirtualBorderRouterResponse deleteVirtualBorderRouterWithOptions(DeleteVirtualBorderRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVirtualBorderRouter", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVirtualBorderRouterResponse());
    }

    public DeleteVirtualBorderRouterResponse deleteVirtualBorderRouter(DeleteVirtualBorderRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVirtualBorderRouterWithOptions(request, runtime);
    }

    public DeleteVpcResponse deleteVpcWithOptions(DeleteVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVpc", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVpcResponse());
    }

    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVpcWithOptions(request, runtime);
    }

    public DeleteVpnConnectionResponse deleteVpnConnectionWithOptions(DeleteVpnConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVpnConnection", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVpnConnectionResponse());
    }

    public DeleteVpnConnectionResponse deleteVpnConnection(DeleteVpnConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVpnConnectionWithOptions(request, runtime);
    }

    public DeleteVpnGatewayResponse deleteVpnGatewayWithOptions(DeleteVpnGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVpnGateway", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVpnGatewayResponse());
    }

    public DeleteVpnGatewayResponse deleteVpnGateway(DeleteVpnGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVpnGatewayWithOptions(request, runtime);
    }

    public DeleteVpnPbrRouteEntryResponse deleteVpnPbrRouteEntryWithOptions(DeleteVpnPbrRouteEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVpnPbrRouteEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVpnPbrRouteEntryResponse());
    }

    public DeleteVpnPbrRouteEntryResponse deleteVpnPbrRouteEntry(DeleteVpnPbrRouteEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVpnPbrRouteEntryWithOptions(request, runtime);
    }

    public DeleteVpnRouteEntryResponse deleteVpnRouteEntryWithOptions(DeleteVpnRouteEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVpnRouteEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVpnRouteEntryResponse());
    }

    public DeleteVpnRouteEntryResponse deleteVpnRouteEntry(DeleteVpnRouteEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVpnRouteEntryWithOptions(request, runtime);
    }

    public DeleteVSwitchResponse deleteVSwitchWithOptions(DeleteVSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVSwitch", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVSwitchResponse());
    }

    public DeleteVSwitchResponse deleteVSwitch(DeleteVSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVSwitchWithOptions(request, runtime);
    }

    public DeletionProtectionResponse deletionProtectionWithOptions(DeletionProtectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletionProtection", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeletionProtectionResponse());
    }

    public DeletionProtectionResponse deletionProtection(DeletionProtectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletionProtectionWithOptions(request, runtime);
    }

    public DescribeAccessPointsResponse describeAccessPointsWithOptions(DescribeAccessPointsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccessPoints", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccessPointsResponse());
    }

    public DescribeAccessPointsResponse describeAccessPoints(DescribeAccessPointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccessPointsWithOptions(request, runtime);
    }

    public DescribeBgpGroupsResponse describeBgpGroupsWithOptions(DescribeBgpGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBgpGroups", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBgpGroupsResponse());
    }

    public DescribeBgpGroupsResponse describeBgpGroups(DescribeBgpGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBgpGroupsWithOptions(request, runtime);
    }

    public DescribeBgpNetworksResponse describeBgpNetworksWithOptions(DescribeBgpNetworksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBgpNetworks", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBgpNetworksResponse());
    }

    public DescribeBgpNetworksResponse describeBgpNetworks(DescribeBgpNetworksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBgpNetworksWithOptions(request, runtime);
    }

    public DescribeBgpPeersResponse describeBgpPeersWithOptions(DescribeBgpPeersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBgpPeers", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBgpPeersResponse());
    }

    public DescribeBgpPeersResponse describeBgpPeers(DescribeBgpPeersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBgpPeersWithOptions(request, runtime);
    }

    public DescribeCommonBandwidthPackagesResponse describeCommonBandwidthPackagesWithOptions(DescribeCommonBandwidthPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCommonBandwidthPackages", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCommonBandwidthPackagesResponse());
    }

    public DescribeCommonBandwidthPackagesResponse describeCommonBandwidthPackages(DescribeCommonBandwidthPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCommonBandwidthPackagesWithOptions(request, runtime);
    }

    public DescribeCustomerGatewayResponse describeCustomerGatewayWithOptions(DescribeCustomerGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCustomerGateway", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCustomerGatewayResponse());
    }

    public DescribeCustomerGatewayResponse describeCustomerGateway(DescribeCustomerGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCustomerGatewayWithOptions(request, runtime);
    }

    public DescribeCustomerGatewaysResponse describeCustomerGatewaysWithOptions(DescribeCustomerGatewaysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCustomerGateways", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCustomerGatewaysResponse());
    }

    public DescribeCustomerGatewaysResponse describeCustomerGateways(DescribeCustomerGatewaysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCustomerGatewaysWithOptions(request, runtime);
    }

    public DescribeEipAddressesResponse describeEipAddressesWithOptions(DescribeEipAddressesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEipAddresses", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEipAddressesResponse());
    }

    public DescribeEipAddressesResponse describeEipAddresses(DescribeEipAddressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEipAddressesWithOptions(request, runtime);
    }

    public DescribeEipGatewayInfoResponse describeEipGatewayInfoWithOptions(DescribeEipGatewayInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEipGatewayInfo", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEipGatewayInfoResponse());
    }

    public DescribeEipGatewayInfoResponse describeEipGatewayInfo(DescribeEipGatewayInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEipGatewayInfoWithOptions(request, runtime);
    }

    public DescribeEipMonitorDataResponse describeEipMonitorDataWithOptions(DescribeEipMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEipMonitorData", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEipMonitorDataResponse());
    }

    public DescribeEipMonitorDataResponse describeEipMonitorData(DescribeEipMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEipMonitorDataWithOptions(request, runtime);
    }

    public DescribeEipSegmentResponse describeEipSegmentWithOptions(DescribeEipSegmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEipSegment", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEipSegmentResponse());
    }

    public DescribeEipSegmentResponse describeEipSegment(DescribeEipSegmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEipSegmentWithOptions(request, runtime);
    }

    public DescribeExpressCloudConnectionsResponse describeExpressCloudConnectionsWithOptions(DescribeExpressCloudConnectionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeExpressCloudConnections", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeExpressCloudConnectionsResponse());
    }

    public DescribeExpressCloudConnectionsResponse describeExpressCloudConnections(DescribeExpressCloudConnectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExpressCloudConnectionsWithOptions(request, runtime);
    }

    public DescribeFlowLogsResponse describeFlowLogsWithOptions(DescribeFlowLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowLogs", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowLogsResponse());
    }

    public DescribeFlowLogsResponse describeFlowLogs(DescribeFlowLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowLogsWithOptions(request, runtime);
    }

    public DescribeForwardTableEntriesResponse describeForwardTableEntriesWithOptions(DescribeForwardTableEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeForwardTableEntries", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeForwardTableEntriesResponse());
    }

    public DescribeForwardTableEntriesResponse describeForwardTableEntries(DescribeForwardTableEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeForwardTableEntriesWithOptions(request, runtime);
    }

    public DescribeGlobalAccelerationInstancesResponse describeGlobalAccelerationInstancesWithOptions(DescribeGlobalAccelerationInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGlobalAccelerationInstances", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGlobalAccelerationInstancesResponse());
    }

    public DescribeGlobalAccelerationInstancesResponse describeGlobalAccelerationInstances(DescribeGlobalAccelerationInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGlobalAccelerationInstancesWithOptions(request, runtime);
    }

    public DescribeGrantRulesToCenResponse describeGrantRulesToCenWithOptions(DescribeGrantRulesToCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGrantRulesToCen", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGrantRulesToCenResponse());
    }

    public DescribeGrantRulesToCenResponse describeGrantRulesToCen(DescribeGrantRulesToCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGrantRulesToCenWithOptions(request, runtime);
    }

    public DescribeHaVipsResponse describeHaVipsWithOptions(DescribeHaVipsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHaVips", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHaVipsResponse());
    }

    public DescribeHaVipsResponse describeHaVips(DescribeHaVipsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHaVipsWithOptions(request, runtime);
    }

    public DescribeHighDefinitionMonitorLogAttributeResponse describeHighDefinitionMonitorLogAttributeWithOptions(DescribeHighDefinitionMonitorLogAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHighDefinitionMonitorLogAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHighDefinitionMonitorLogAttributeResponse());
    }

    public DescribeHighDefinitionMonitorLogAttributeResponse describeHighDefinitionMonitorLogAttribute(DescribeHighDefinitionMonitorLogAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHighDefinitionMonitorLogAttributeWithOptions(request, runtime);
    }

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttributeWithOptions(DescribeInstanceAutoRenewAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceAutoRenewAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceAutoRenewAttributeResponse());
    }

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceAutoRenewAttributeWithOptions(request, runtime);
    }

    public DescribeIpv6AddressesResponse describeIpv6AddressesWithOptions(DescribeIpv6AddressesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIpv6Addresses", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIpv6AddressesResponse());
    }

    public DescribeIpv6AddressesResponse describeIpv6Addresses(DescribeIpv6AddressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpv6AddressesWithOptions(request, runtime);
    }

    public DescribeIpv6EgressOnlyRulesResponse describeIpv6EgressOnlyRulesWithOptions(DescribeIpv6EgressOnlyRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIpv6EgressOnlyRules", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIpv6EgressOnlyRulesResponse());
    }

    public DescribeIpv6EgressOnlyRulesResponse describeIpv6EgressOnlyRules(DescribeIpv6EgressOnlyRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpv6EgressOnlyRulesWithOptions(request, runtime);
    }

    public DescribeIpv6GatewayAttributeResponse describeIpv6GatewayAttributeWithOptions(DescribeIpv6GatewayAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIpv6GatewayAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIpv6GatewayAttributeResponse());
    }

    public DescribeIpv6GatewayAttributeResponse describeIpv6GatewayAttribute(DescribeIpv6GatewayAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpv6GatewayAttributeWithOptions(request, runtime);
    }

    public DescribeIpv6GatewaysResponse describeIpv6GatewaysWithOptions(DescribeIpv6GatewaysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIpv6Gateways", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIpv6GatewaysResponse());
    }

    public DescribeIpv6GatewaysResponse describeIpv6Gateways(DescribeIpv6GatewaysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpv6GatewaysWithOptions(request, runtime);
    }

    public DescribeIPv6TranslatorAclListAttributesResponse describeIPv6TranslatorAclListAttributesWithOptions(DescribeIPv6TranslatorAclListAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIPv6TranslatorAclListAttributes", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIPv6TranslatorAclListAttributesResponse());
    }

    public DescribeIPv6TranslatorAclListAttributesResponse describeIPv6TranslatorAclListAttributes(DescribeIPv6TranslatorAclListAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIPv6TranslatorAclListAttributesWithOptions(request, runtime);
    }

    public DescribeIPv6TranslatorAclListsResponse describeIPv6TranslatorAclListsWithOptions(DescribeIPv6TranslatorAclListsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIPv6TranslatorAclLists", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIPv6TranslatorAclListsResponse());
    }

    public DescribeIPv6TranslatorAclListsResponse describeIPv6TranslatorAclLists(DescribeIPv6TranslatorAclListsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIPv6TranslatorAclListsWithOptions(request, runtime);
    }

    public DescribeIPv6TranslatorEntriesResponse describeIPv6TranslatorEntriesWithOptions(DescribeIPv6TranslatorEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIPv6TranslatorEntries", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIPv6TranslatorEntriesResponse());
    }

    public DescribeIPv6TranslatorEntriesResponse describeIPv6TranslatorEntries(DescribeIPv6TranslatorEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIPv6TranslatorEntriesWithOptions(request, runtime);
    }

    public DescribeIPv6TranslatorsResponse describeIPv6TranslatorsWithOptions(DescribeIPv6TranslatorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIPv6Translators", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIPv6TranslatorsResponse());
    }

    public DescribeIPv6TranslatorsResponse describeIPv6Translators(DescribeIPv6TranslatorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIPv6TranslatorsWithOptions(request, runtime);
    }

    public DescribeNatGatewaysResponse describeNatGatewaysWithOptions(DescribeNatGatewaysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNatGateways", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNatGatewaysResponse());
    }

    public DescribeNatGatewaysResponse describeNatGateways(DescribeNatGatewaysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNatGatewaysWithOptions(request, runtime);
    }

    public DescribeNetworkAclAttributesResponse describeNetworkAclAttributesWithOptions(DescribeNetworkAclAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNetworkAclAttributes", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNetworkAclAttributesResponse());
    }

    public DescribeNetworkAclAttributesResponse describeNetworkAclAttributes(DescribeNetworkAclAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkAclAttributesWithOptions(request, runtime);
    }

    public DescribeNetworkAclsResponse describeNetworkAclsWithOptions(DescribeNetworkAclsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNetworkAcls", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNetworkAclsResponse());
    }

    public DescribeNetworkAclsResponse describeNetworkAcls(DescribeNetworkAclsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkAclsWithOptions(request, runtime);
    }

    public DescribeNewProjectEipMonitorDataResponse describeNewProjectEipMonitorDataWithOptions(DescribeNewProjectEipMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNewProjectEipMonitorData", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNewProjectEipMonitorDataResponse());
    }

    public DescribeNewProjectEipMonitorDataResponse describeNewProjectEipMonitorData(DescribeNewProjectEipMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNewProjectEipMonitorDataWithOptions(request, runtime);
    }

    public DescribePhysicalConnectionLOAResponse describePhysicalConnectionLOAWithOptions(DescribePhysicalConnectionLOARequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePhysicalConnectionLOA", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePhysicalConnectionLOAResponse());
    }

    public DescribePhysicalConnectionLOAResponse describePhysicalConnectionLOA(DescribePhysicalConnectionLOARequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePhysicalConnectionLOAWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeRouteEntryListResponse describeRouteEntryListWithOptions(DescribeRouteEntryListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRouteEntryList", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRouteEntryListResponse());
    }

    public DescribeRouteEntryListResponse describeRouteEntryList(DescribeRouteEntryListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRouteEntryListWithOptions(request, runtime);
    }

    public DescribeRouterInterfaceAttributeResponse describeRouterInterfaceAttributeWithOptions(DescribeRouterInterfaceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRouterInterfaceAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRouterInterfaceAttributeResponse());
    }

    public DescribeRouterInterfaceAttributeResponse describeRouterInterfaceAttribute(DescribeRouterInterfaceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRouterInterfaceAttributeWithOptions(request, runtime);
    }

    public DescribeRouterInterfacesResponse describeRouterInterfacesWithOptions(DescribeRouterInterfacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRouterInterfaces", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRouterInterfacesResponse());
    }

    public DescribeRouterInterfacesResponse describeRouterInterfaces(DescribeRouterInterfacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRouterInterfacesWithOptions(request, runtime);
    }

    public DescribeRouteTableListResponse describeRouteTableListWithOptions(DescribeRouteTableListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRouteTableList", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRouteTableListResponse());
    }

    public DescribeRouteTableListResponse describeRouteTableList(DescribeRouteTableListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRouteTableListWithOptions(request, runtime);
    }

    public DescribeRouteTablesResponse describeRouteTablesWithOptions(DescribeRouteTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRouteTables", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRouteTablesResponse());
    }

    public DescribeRouteTablesResponse describeRouteTables(DescribeRouteTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRouteTablesWithOptions(request, runtime);
    }

    public DescribeServerRelatedGlobalAccelerationInstancesResponse describeServerRelatedGlobalAccelerationInstancesWithOptions(DescribeServerRelatedGlobalAccelerationInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeServerRelatedGlobalAccelerationInstances", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeServerRelatedGlobalAccelerationInstancesResponse());
    }

    public DescribeServerRelatedGlobalAccelerationInstancesResponse describeServerRelatedGlobalAccelerationInstances(DescribeServerRelatedGlobalAccelerationInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServerRelatedGlobalAccelerationInstancesWithOptions(request, runtime);
    }

    public DescribeSnatTableEntriesResponse describeSnatTableEntriesWithOptions(DescribeSnatTableEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSnatTableEntries", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSnatTableEntriesResponse());
    }

    public DescribeSnatTableEntriesResponse describeSnatTableEntries(DescribeSnatTableEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnatTableEntriesWithOptions(request, runtime);
    }

    public DescribeSslVpnClientCertResponse describeSslVpnClientCertWithOptions(DescribeSslVpnClientCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSslVpnClientCert", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSslVpnClientCertResponse());
    }

    public DescribeSslVpnClientCertResponse describeSslVpnClientCert(DescribeSslVpnClientCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSslVpnClientCertWithOptions(request, runtime);
    }

    public DescribeSslVpnClientCertsResponse describeSslVpnClientCertsWithOptions(DescribeSslVpnClientCertsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSslVpnClientCerts", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSslVpnClientCertsResponse());
    }

    public DescribeSslVpnClientCertsResponse describeSslVpnClientCerts(DescribeSslVpnClientCertsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSslVpnClientCertsWithOptions(request, runtime);
    }

    public DescribeSslVpnServersResponse describeSslVpnServersWithOptions(DescribeSslVpnServersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSslVpnServers", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSslVpnServersResponse());
    }

    public DescribeSslVpnServersResponse describeSslVpnServers(DescribeSslVpnServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSslVpnServersWithOptions(request, runtime);
    }

    public DescribeVirtualBorderRoutersResponse describeVirtualBorderRoutersWithOptions(DescribeVirtualBorderRoutersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVirtualBorderRouters", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVirtualBorderRoutersResponse());
    }

    public DescribeVirtualBorderRoutersResponse describeVirtualBorderRouters(DescribeVirtualBorderRoutersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVirtualBorderRoutersWithOptions(request, runtime);
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse describeVirtualBorderRoutersForPhysicalConnectionWithOptions(DescribeVirtualBorderRoutersForPhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVirtualBorderRoutersForPhysicalConnection", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVirtualBorderRoutersForPhysicalConnectionResponse());
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse describeVirtualBorderRoutersForPhysicalConnection(DescribeVirtualBorderRoutersForPhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVirtualBorderRoutersForPhysicalConnectionWithOptions(request, runtime);
    }

    public DescribeVpcAttributeResponse describeVpcAttributeWithOptions(DescribeVpcAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVpcAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVpcAttributeResponse());
    }

    public DescribeVpcAttributeResponse describeVpcAttribute(DescribeVpcAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcAttributeWithOptions(request, runtime);
    }

    public DescribeVpcsResponse describeVpcsWithOptions(DescribeVpcsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVpcs", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVpcsResponse());
    }

    public DescribeVpcsResponse describeVpcs(DescribeVpcsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcsWithOptions(request, runtime);
    }

    public DescribeVpnConnectionResponse describeVpnConnectionWithOptions(DescribeVpnConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVpnConnection", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVpnConnectionResponse());
    }

    public DescribeVpnConnectionResponse describeVpnConnection(DescribeVpnConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpnConnectionWithOptions(request, runtime);
    }

    public DescribeVpnConnectionsResponse describeVpnConnectionsWithOptions(DescribeVpnConnectionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVpnConnections", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVpnConnectionsResponse());
    }

    public DescribeVpnConnectionsResponse describeVpnConnections(DescribeVpnConnectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpnConnectionsWithOptions(request, runtime);
    }

    public DescribeVpnGatewayResponse describeVpnGatewayWithOptions(DescribeVpnGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVpnGateway", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVpnGatewayResponse());
    }

    public DescribeVpnGatewayResponse describeVpnGateway(DescribeVpnGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpnGatewayWithOptions(request, runtime);
    }

    public DescribeVpnGatewaysResponse describeVpnGatewaysWithOptions(DescribeVpnGatewaysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVpnGateways", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVpnGatewaysResponse());
    }

    public DescribeVpnGatewaysResponse describeVpnGateways(DescribeVpnGatewaysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpnGatewaysWithOptions(request, runtime);
    }

    public DescribeVpnPbrRouteEntriesResponse describeVpnPbrRouteEntriesWithOptions(DescribeVpnPbrRouteEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVpnPbrRouteEntries", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVpnPbrRouteEntriesResponse());
    }

    public DescribeVpnPbrRouteEntriesResponse describeVpnPbrRouteEntries(DescribeVpnPbrRouteEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpnPbrRouteEntriesWithOptions(request, runtime);
    }

    public DescribeVpnRouteEntriesResponse describeVpnRouteEntriesWithOptions(DescribeVpnRouteEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVpnRouteEntries", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVpnRouteEntriesResponse());
    }

    public DescribeVpnRouteEntriesResponse describeVpnRouteEntries(DescribeVpnRouteEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpnRouteEntriesWithOptions(request, runtime);
    }

    public DescribeVpnSslServerLogsResponse describeVpnSslServerLogsWithOptions(DescribeVpnSslServerLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVpnSslServerLogs", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVpnSslServerLogsResponse());
    }

    public DescribeVpnSslServerLogsResponse describeVpnSslServerLogs(DescribeVpnSslServerLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpnSslServerLogsWithOptions(request, runtime);
    }

    public DescribeVRoutersResponse describeVRoutersWithOptions(DescribeVRoutersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVRouters", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVRoutersResponse());
    }

    public DescribeVRoutersResponse describeVRouters(DescribeVRoutersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVRoutersWithOptions(request, runtime);
    }

    public DescribeVSwitchAttributesResponse describeVSwitchAttributesWithOptions(DescribeVSwitchAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVSwitchAttributes", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVSwitchAttributesResponse());
    }

    public DescribeVSwitchAttributesResponse describeVSwitchAttributes(DescribeVSwitchAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVSwitchAttributesWithOptions(request, runtime);
    }

    public DescribeVSwitchesResponse describeVSwitchesWithOptions(DescribeVSwitchesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVSwitches", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVSwitchesResponse());
    }

    public DescribeVSwitchesResponse describeVSwitches(DescribeVSwitchesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVSwitchesWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeZones", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    public DetachDhcpOptionsSetFromVpcResponse detachDhcpOptionsSetFromVpcWithOptions(DetachDhcpOptionsSetFromVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachDhcpOptionsSetFromVpc", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DetachDhcpOptionsSetFromVpcResponse());
    }

    public DetachDhcpOptionsSetFromVpcResponse detachDhcpOptionsSetFromVpc(DetachDhcpOptionsSetFromVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachDhcpOptionsSetFromVpcWithOptions(request, runtime);
    }

    public DisableNatGatewayEcsMetricResponse disableNatGatewayEcsMetricWithOptions(DisableNatGatewayEcsMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableNatGatewayEcsMetric", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DisableNatGatewayEcsMetricResponse());
    }

    public DisableNatGatewayEcsMetricResponse disableNatGatewayEcsMetric(DisableNatGatewayEcsMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableNatGatewayEcsMetricWithOptions(request, runtime);
    }

    public DisableVpcClassicLinkResponse disableVpcClassicLinkWithOptions(DisableVpcClassicLinkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableVpcClassicLink", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DisableVpcClassicLinkResponse());
    }

    public DisableVpcClassicLinkResponse disableVpcClassicLink(DisableVpcClassicLinkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableVpcClassicLinkWithOptions(request, runtime);
    }

    public DissociateVpnGatewayWithCertificateResponse dissociateVpnGatewayWithCertificateWithOptions(DissociateVpnGatewayWithCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DissociateVpnGatewayWithCertificate", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DissociateVpnGatewayWithCertificateResponse());
    }

    public DissociateVpnGatewayWithCertificateResponse dissociateVpnGatewayWithCertificate(DissociateVpnGatewayWithCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dissociateVpnGatewayWithCertificateWithOptions(request, runtime);
    }

    public DownloadVpnConnectionConfigResponse downloadVpnConnectionConfigWithOptions(DownloadVpnConnectionConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DownloadVpnConnectionConfig", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new DownloadVpnConnectionConfigResponse());
    }

    public DownloadVpnConnectionConfigResponse downloadVpnConnectionConfig(DownloadVpnConnectionConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadVpnConnectionConfigWithOptions(request, runtime);
    }

    public EnableNatGatewayEcsMetricResponse enableNatGatewayEcsMetricWithOptions(EnableNatGatewayEcsMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableNatGatewayEcsMetric", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new EnableNatGatewayEcsMetricResponse());
    }

    public EnableNatGatewayEcsMetricResponse enableNatGatewayEcsMetric(EnableNatGatewayEcsMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableNatGatewayEcsMetricWithOptions(request, runtime);
    }

    public EnablePhysicalConnectionResponse enablePhysicalConnectionWithOptions(EnablePhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnablePhysicalConnection", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new EnablePhysicalConnectionResponse());
    }

    public EnablePhysicalConnectionResponse enablePhysicalConnection(EnablePhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enablePhysicalConnectionWithOptions(request, runtime);
    }

    public EnableVpcClassicLinkResponse enableVpcClassicLinkWithOptions(EnableVpcClassicLinkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableVpcClassicLink", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new EnableVpcClassicLinkResponse());
    }

    public EnableVpcClassicLinkResponse enableVpcClassicLink(EnableVpcClassicLinkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableVpcClassicLinkWithOptions(request, runtime);
    }

    public GetDhcpOptionsSetResponse getDhcpOptionsSetWithOptions(GetDhcpOptionsSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDhcpOptionsSet", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetDhcpOptionsSetResponse());
    }

    public GetDhcpOptionsSetResponse getDhcpOptionsSet(GetDhcpOptionsSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDhcpOptionsSetWithOptions(request, runtime);
    }

    public GetNatGatewayAttributeResponse getNatGatewayAttributeWithOptions(GetNatGatewayAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetNatGatewayAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetNatGatewayAttributeResponse());
    }

    public GetNatGatewayAttributeResponse getNatGatewayAttribute(GetNatGatewayAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNatGatewayAttributeWithOptions(request, runtime);
    }

    public GetNatGatewayConvertStatusResponse getNatGatewayConvertStatusWithOptions(GetNatGatewayConvertStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetNatGatewayConvertStatus", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetNatGatewayConvertStatusResponse());
    }

    public GetNatGatewayConvertStatusResponse getNatGatewayConvertStatus(GetNatGatewayConvertStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNatGatewayConvertStatusWithOptions(request, runtime);
    }

    public GrantInstanceToCenResponse grantInstanceToCenWithOptions(GrantInstanceToCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GrantInstanceToCen", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new GrantInstanceToCenResponse());
    }

    public GrantInstanceToCenResponse grantInstanceToCen(GrantInstanceToCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantInstanceToCenWithOptions(request, runtime);
    }

    public ListDhcpOptionsSetsResponse listDhcpOptionsSetsWithOptions(ListDhcpOptionsSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDhcpOptionsSets", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListDhcpOptionsSetsResponse());
    }

    public ListDhcpOptionsSetsResponse listDhcpOptionsSets(ListDhcpOptionsSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDhcpOptionsSetsWithOptions(request, runtime);
    }

    public ListEnhanhcedNatGatewayAvailableZonesResponse listEnhanhcedNatGatewayAvailableZonesWithOptions(ListEnhanhcedNatGatewayAvailableZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEnhanhcedNatGatewayAvailableZones", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListEnhanhcedNatGatewayAvailableZonesResponse());
    }

    public ListEnhanhcedNatGatewayAvailableZonesResponse listEnhanhcedNatGatewayAvailableZones(ListEnhanhcedNatGatewayAvailableZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEnhanhcedNatGatewayAvailableZonesWithOptions(request, runtime);
    }

    public ListIpsecServersResponse listIpsecServersWithOptions(ListIpsecServersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIpsecServers", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListIpsecServersResponse());
    }

    public ListIpsecServersResponse listIpsecServers(ListIpsecServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIpsecServersWithOptions(request, runtime);
    }

    public ListNatGatewayEcsMetricResponse listNatGatewayEcsMetricWithOptions(ListNatGatewayEcsMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListNatGatewayEcsMetric", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListNatGatewayEcsMetricResponse());
    }

    public ListNatGatewayEcsMetricResponse listNatGatewayEcsMetric(ListNatGatewayEcsMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNatGatewayEcsMetricWithOptions(request, runtime);
    }

    public ListPhysicalConnectionFeaturesResponse listPhysicalConnectionFeaturesWithOptions(ListPhysicalConnectionFeaturesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPhysicalConnectionFeatures", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListPhysicalConnectionFeaturesResponse());
    }

    public ListPhysicalConnectionFeaturesResponse listPhysicalConnectionFeatures(ListPhysicalConnectionFeaturesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPhysicalConnectionFeaturesWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListVpnCertificateAssociationsResponse listVpnCertificateAssociationsWithOptions(ListVpnCertificateAssociationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListVpnCertificateAssociations", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListVpnCertificateAssociationsResponse());
    }

    public ListVpnCertificateAssociationsResponse listVpnCertificateAssociations(ListVpnCertificateAssociationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVpnCertificateAssociationsWithOptions(request, runtime);
    }

    public ModifyBgpGroupAttributeResponse modifyBgpGroupAttributeWithOptions(ModifyBgpGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBgpGroupAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBgpGroupAttributeResponse());
    }

    public ModifyBgpGroupAttributeResponse modifyBgpGroupAttribute(ModifyBgpGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBgpGroupAttributeWithOptions(request, runtime);
    }

    public ModifyBgpPeerAttributeResponse modifyBgpPeerAttributeWithOptions(ModifyBgpPeerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBgpPeerAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBgpPeerAttributeResponse());
    }

    public ModifyBgpPeerAttributeResponse modifyBgpPeerAttribute(ModifyBgpPeerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBgpPeerAttributeWithOptions(request, runtime);
    }

    public ModifyCommonBandwidthPackageAttributeResponse modifyCommonBandwidthPackageAttributeWithOptions(ModifyCommonBandwidthPackageAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCommonBandwidthPackageAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCommonBandwidthPackageAttributeResponse());
    }

    public ModifyCommonBandwidthPackageAttributeResponse modifyCommonBandwidthPackageAttribute(ModifyCommonBandwidthPackageAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCommonBandwidthPackageAttributeWithOptions(request, runtime);
    }

    public ModifyCommonBandwidthPackageInternetChargeTypeResponse modifyCommonBandwidthPackageInternetChargeTypeWithOptions(ModifyCommonBandwidthPackageInternetChargeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCommonBandwidthPackageInternetChargeType", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCommonBandwidthPackageInternetChargeTypeResponse());
    }

    public ModifyCommonBandwidthPackageInternetChargeTypeResponse modifyCommonBandwidthPackageInternetChargeType(ModifyCommonBandwidthPackageInternetChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCommonBandwidthPackageInternetChargeTypeWithOptions(request, runtime);
    }

    public ModifyCommonBandwidthPackageIpBandwidthResponse modifyCommonBandwidthPackageIpBandwidthWithOptions(ModifyCommonBandwidthPackageIpBandwidthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCommonBandwidthPackageIpBandwidth", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCommonBandwidthPackageIpBandwidthResponse());
    }

    public ModifyCommonBandwidthPackageIpBandwidthResponse modifyCommonBandwidthPackageIpBandwidth(ModifyCommonBandwidthPackageIpBandwidthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCommonBandwidthPackageIpBandwidthWithOptions(request, runtime);
    }

    public ModifyCommonBandwidthPackagePayTypeResponse modifyCommonBandwidthPackagePayTypeWithOptions(ModifyCommonBandwidthPackagePayTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCommonBandwidthPackagePayType", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCommonBandwidthPackagePayTypeResponse());
    }

    public ModifyCommonBandwidthPackagePayTypeResponse modifyCommonBandwidthPackagePayType(ModifyCommonBandwidthPackagePayTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCommonBandwidthPackagePayTypeWithOptions(request, runtime);
    }

    public ModifyCommonBandwidthPackageSpecResponse modifyCommonBandwidthPackageSpecWithOptions(ModifyCommonBandwidthPackageSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCommonBandwidthPackageSpec", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCommonBandwidthPackageSpecResponse());
    }

    public ModifyCommonBandwidthPackageSpecResponse modifyCommonBandwidthPackageSpec(ModifyCommonBandwidthPackageSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCommonBandwidthPackageSpecWithOptions(request, runtime);
    }

    public ModifyCustomerGatewayAttributeResponse modifyCustomerGatewayAttributeWithOptions(ModifyCustomerGatewayAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCustomerGatewayAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCustomerGatewayAttributeResponse());
    }

    public ModifyCustomerGatewayAttributeResponse modifyCustomerGatewayAttribute(ModifyCustomerGatewayAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCustomerGatewayAttributeWithOptions(request, runtime);
    }

    public ModifyEipAddressAttributeResponse modifyEipAddressAttributeWithOptions(ModifyEipAddressAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyEipAddressAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyEipAddressAttributeResponse());
    }

    public ModifyEipAddressAttributeResponse modifyEipAddressAttribute(ModifyEipAddressAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyEipAddressAttributeWithOptions(request, runtime);
    }

    public ModifyExpressCloudConnectionAttributeResponse modifyExpressCloudConnectionAttributeWithOptions(ModifyExpressCloudConnectionAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyExpressCloudConnectionAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyExpressCloudConnectionAttributeResponse());
    }

    public ModifyExpressCloudConnectionAttributeResponse modifyExpressCloudConnectionAttribute(ModifyExpressCloudConnectionAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyExpressCloudConnectionAttributeWithOptions(request, runtime);
    }

    public ModifyExpressCloudConnectionBandwidthResponse modifyExpressCloudConnectionBandwidthWithOptions(ModifyExpressCloudConnectionBandwidthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyExpressCloudConnectionBandwidth", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyExpressCloudConnectionBandwidthResponse());
    }

    public ModifyExpressCloudConnectionBandwidthResponse modifyExpressCloudConnectionBandwidth(ModifyExpressCloudConnectionBandwidthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyExpressCloudConnectionBandwidthWithOptions(request, runtime);
    }

    public ModifyFlowLogAttributeResponse modifyFlowLogAttributeWithOptions(ModifyFlowLogAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFlowLogAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFlowLogAttributeResponse());
    }

    public ModifyFlowLogAttributeResponse modifyFlowLogAttribute(ModifyFlowLogAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowLogAttributeWithOptions(request, runtime);
    }

    public ModifyForwardEntryResponse modifyForwardEntryWithOptions(ModifyForwardEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyForwardEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyForwardEntryResponse());
    }

    public ModifyForwardEntryResponse modifyForwardEntry(ModifyForwardEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyForwardEntryWithOptions(request, runtime);
    }

    public ModifyGlobalAccelerationInstanceAttributesResponse modifyGlobalAccelerationInstanceAttributesWithOptions(ModifyGlobalAccelerationInstanceAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyGlobalAccelerationInstanceAttributes", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyGlobalAccelerationInstanceAttributesResponse());
    }

    public ModifyGlobalAccelerationInstanceAttributesResponse modifyGlobalAccelerationInstanceAttributes(ModifyGlobalAccelerationInstanceAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyGlobalAccelerationInstanceAttributesWithOptions(request, runtime);
    }

    public ModifyGlobalAccelerationInstanceSpecResponse modifyGlobalAccelerationInstanceSpecWithOptions(ModifyGlobalAccelerationInstanceSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyGlobalAccelerationInstanceSpec", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyGlobalAccelerationInstanceSpecResponse());
    }

    public ModifyGlobalAccelerationInstanceSpecResponse modifyGlobalAccelerationInstanceSpec(ModifyGlobalAccelerationInstanceSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyGlobalAccelerationInstanceSpecWithOptions(request, runtime);
    }

    public ModifyHaVipAttributeResponse modifyHaVipAttributeWithOptions(ModifyHaVipAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHaVipAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHaVipAttributeResponse());
    }

    public ModifyHaVipAttributeResponse modifyHaVipAttribute(ModifyHaVipAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHaVipAttributeWithOptions(request, runtime);
    }

    public ModifyInstanceAutoRenewalAttributeResponse modifyInstanceAutoRenewalAttributeWithOptions(ModifyInstanceAutoRenewalAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceAutoRenewalAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceAutoRenewalAttributeResponse());
    }

    public ModifyInstanceAutoRenewalAttributeResponse modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAutoRenewalAttributeWithOptions(request, runtime);
    }

    public ModifyIpv6AddressAttributeResponse modifyIpv6AddressAttributeWithOptions(ModifyIpv6AddressAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyIpv6AddressAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyIpv6AddressAttributeResponse());
    }

    public ModifyIpv6AddressAttributeResponse modifyIpv6AddressAttribute(ModifyIpv6AddressAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIpv6AddressAttributeWithOptions(request, runtime);
    }

    public ModifyIpv6GatewayAttributeResponse modifyIpv6GatewayAttributeWithOptions(ModifyIpv6GatewayAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyIpv6GatewayAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyIpv6GatewayAttributeResponse());
    }

    public ModifyIpv6GatewayAttributeResponse modifyIpv6GatewayAttribute(ModifyIpv6GatewayAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIpv6GatewayAttributeWithOptions(request, runtime);
    }

    public ModifyIpv6GatewaySpecResponse modifyIpv6GatewaySpecWithOptions(ModifyIpv6GatewaySpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyIpv6GatewaySpec", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyIpv6GatewaySpecResponse());
    }

    public ModifyIpv6GatewaySpecResponse modifyIpv6GatewaySpec(ModifyIpv6GatewaySpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIpv6GatewaySpecWithOptions(request, runtime);
    }

    public ModifyIpv6InternetBandwidthResponse modifyIpv6InternetBandwidthWithOptions(ModifyIpv6InternetBandwidthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyIpv6InternetBandwidth", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyIpv6InternetBandwidthResponse());
    }

    public ModifyIpv6InternetBandwidthResponse modifyIpv6InternetBandwidth(ModifyIpv6InternetBandwidthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIpv6InternetBandwidthWithOptions(request, runtime);
    }

    public ModifyIPv6TranslatorAclAttributeResponse modifyIPv6TranslatorAclAttributeWithOptions(ModifyIPv6TranslatorAclAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyIPv6TranslatorAclAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyIPv6TranslatorAclAttributeResponse());
    }

    public ModifyIPv6TranslatorAclAttributeResponse modifyIPv6TranslatorAclAttribute(ModifyIPv6TranslatorAclAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIPv6TranslatorAclAttributeWithOptions(request, runtime);
    }

    public ModifyIPv6TranslatorAclListEntryResponse modifyIPv6TranslatorAclListEntryWithOptions(ModifyIPv6TranslatorAclListEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyIPv6TranslatorAclListEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyIPv6TranslatorAclListEntryResponse());
    }

    public ModifyIPv6TranslatorAclListEntryResponse modifyIPv6TranslatorAclListEntry(ModifyIPv6TranslatorAclListEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIPv6TranslatorAclListEntryWithOptions(request, runtime);
    }

    public ModifyIPv6TranslatorAttributeResponse modifyIPv6TranslatorAttributeWithOptions(ModifyIPv6TranslatorAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyIPv6TranslatorAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyIPv6TranslatorAttributeResponse());
    }

    public ModifyIPv6TranslatorAttributeResponse modifyIPv6TranslatorAttribute(ModifyIPv6TranslatorAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIPv6TranslatorAttributeWithOptions(request, runtime);
    }

    public ModifyIPv6TranslatorBandwidthResponse modifyIPv6TranslatorBandwidthWithOptions(ModifyIPv6TranslatorBandwidthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyIPv6TranslatorBandwidth", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyIPv6TranslatorBandwidthResponse());
    }

    public ModifyIPv6TranslatorBandwidthResponse modifyIPv6TranslatorBandwidth(ModifyIPv6TranslatorBandwidthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIPv6TranslatorBandwidthWithOptions(request, runtime);
    }

    public ModifyIPv6TranslatorEntryResponse modifyIPv6TranslatorEntryWithOptions(ModifyIPv6TranslatorEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyIPv6TranslatorEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyIPv6TranslatorEntryResponse());
    }

    public ModifyIPv6TranslatorEntryResponse modifyIPv6TranslatorEntry(ModifyIPv6TranslatorEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIPv6TranslatorEntryWithOptions(request, runtime);
    }

    public ModifyNatGatewayAttributeResponse modifyNatGatewayAttributeWithOptions(ModifyNatGatewayAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyNatGatewayAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyNatGatewayAttributeResponse());
    }

    public ModifyNatGatewayAttributeResponse modifyNatGatewayAttribute(ModifyNatGatewayAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNatGatewayAttributeWithOptions(request, runtime);
    }

    public ModifyNatGatewaySpecResponse modifyNatGatewaySpecWithOptions(ModifyNatGatewaySpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyNatGatewaySpec", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyNatGatewaySpecResponse());
    }

    public ModifyNatGatewaySpecResponse modifyNatGatewaySpec(ModifyNatGatewaySpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNatGatewaySpecWithOptions(request, runtime);
    }

    public ModifyNetworkAclAttributesResponse modifyNetworkAclAttributesWithOptions(ModifyNetworkAclAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyNetworkAclAttributes", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyNetworkAclAttributesResponse());
    }

    public ModifyNetworkAclAttributesResponse modifyNetworkAclAttributes(ModifyNetworkAclAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNetworkAclAttributesWithOptions(request, runtime);
    }

    public ModifyRouteEntryResponse modifyRouteEntryWithOptions(ModifyRouteEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyRouteEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyRouteEntryResponse());
    }

    public ModifyRouteEntryResponse modifyRouteEntry(ModifyRouteEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRouteEntryWithOptions(request, runtime);
    }

    public ModifyRouterInterfaceAttributeResponse modifyRouterInterfaceAttributeWithOptions(ModifyRouterInterfaceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyRouterInterfaceAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyRouterInterfaceAttributeResponse());
    }

    public ModifyRouterInterfaceAttributeResponse modifyRouterInterfaceAttribute(ModifyRouterInterfaceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRouterInterfaceAttributeWithOptions(request, runtime);
    }

    public ModifyRouterInterfaceSpecResponse modifyRouterInterfaceSpecWithOptions(ModifyRouterInterfaceSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyRouterInterfaceSpec", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyRouterInterfaceSpecResponse());
    }

    public ModifyRouterInterfaceSpecResponse modifyRouterInterfaceSpec(ModifyRouterInterfaceSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRouterInterfaceSpecWithOptions(request, runtime);
    }

    public ModifyRouteTableAttributesResponse modifyRouteTableAttributesWithOptions(ModifyRouteTableAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyRouteTableAttributes", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyRouteTableAttributesResponse());
    }

    public ModifyRouteTableAttributesResponse modifyRouteTableAttributes(ModifyRouteTableAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRouteTableAttributesWithOptions(request, runtime);
    }

    public ModifySnatEntryResponse modifySnatEntryWithOptions(ModifySnatEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySnatEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySnatEntryResponse());
    }

    public ModifySnatEntryResponse modifySnatEntry(ModifySnatEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySnatEntryWithOptions(request, runtime);
    }

    public ModifySslVpnClientCertResponse modifySslVpnClientCertWithOptions(ModifySslVpnClientCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySslVpnClientCert", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySslVpnClientCertResponse());
    }

    public ModifySslVpnClientCertResponse modifySslVpnClientCert(ModifySslVpnClientCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySslVpnClientCertWithOptions(request, runtime);
    }

    public ModifySslVpnServerResponse modifySslVpnServerWithOptions(ModifySslVpnServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySslVpnServer", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySslVpnServerResponse());
    }

    public ModifySslVpnServerResponse modifySslVpnServer(ModifySslVpnServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySslVpnServerWithOptions(request, runtime);
    }

    public ModifyVirtualBorderRouterAttributeResponse modifyVirtualBorderRouterAttributeWithOptions(ModifyVirtualBorderRouterAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVirtualBorderRouterAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVirtualBorderRouterAttributeResponse());
    }

    public ModifyVirtualBorderRouterAttributeResponse modifyVirtualBorderRouterAttribute(ModifyVirtualBorderRouterAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVirtualBorderRouterAttributeWithOptions(request, runtime);
    }

    public ModifyVpcAttributeResponse modifyVpcAttributeWithOptions(ModifyVpcAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVpcAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVpcAttributeResponse());
    }

    public ModifyVpcAttributeResponse modifyVpcAttribute(ModifyVpcAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpcAttributeWithOptions(request, runtime);
    }

    public ModifyVpnConnectionAttributeResponse modifyVpnConnectionAttributeWithOptions(ModifyVpnConnectionAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVpnConnectionAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVpnConnectionAttributeResponse());
    }

    public ModifyVpnConnectionAttributeResponse modifyVpnConnectionAttribute(ModifyVpnConnectionAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpnConnectionAttributeWithOptions(request, runtime);
    }

    public ModifyVpnGatewayAttributeResponse modifyVpnGatewayAttributeWithOptions(ModifyVpnGatewayAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVpnGatewayAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVpnGatewayAttributeResponse());
    }

    public ModifyVpnGatewayAttributeResponse modifyVpnGatewayAttribute(ModifyVpnGatewayAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpnGatewayAttributeWithOptions(request, runtime);
    }

    public ModifyVpnPbrRouteEntryWeightResponse modifyVpnPbrRouteEntryWeightWithOptions(ModifyVpnPbrRouteEntryWeightRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVpnPbrRouteEntryWeight", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVpnPbrRouteEntryWeightResponse());
    }

    public ModifyVpnPbrRouteEntryWeightResponse modifyVpnPbrRouteEntryWeight(ModifyVpnPbrRouteEntryWeightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpnPbrRouteEntryWeightWithOptions(request, runtime);
    }

    public ModifyVpnRouteEntryWeightResponse modifyVpnRouteEntryWeightWithOptions(ModifyVpnRouteEntryWeightRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVpnRouteEntryWeight", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVpnRouteEntryWeightResponse());
    }

    public ModifyVpnRouteEntryWeightResponse modifyVpnRouteEntryWeight(ModifyVpnRouteEntryWeightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpnRouteEntryWeightWithOptions(request, runtime);
    }

    public ModifyVRouterAttributeResponse modifyVRouterAttributeWithOptions(ModifyVRouterAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVRouterAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVRouterAttributeResponse());
    }

    public ModifyVRouterAttributeResponse modifyVRouterAttribute(ModifyVRouterAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVRouterAttributeWithOptions(request, runtime);
    }

    public ModifyVSwitchAttributeResponse modifyVSwitchAttributeWithOptions(ModifyVSwitchAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVSwitchAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVSwitchAttributeResponse());
    }

    public ModifyVSwitchAttributeResponse modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVSwitchAttributeWithOptions(request, runtime);
    }

    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MoveResourceGroup", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new MoveResourceGroupResponse());
    }

    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    public PublishVpnRouteEntryResponse publishVpnRouteEntryWithOptions(PublishVpnRouteEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishVpnRouteEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new PublishVpnRouteEntryResponse());
    }

    public PublishVpnRouteEntryResponse publishVpnRouteEntry(PublishVpnRouteEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishVpnRouteEntryWithOptions(request, runtime);
    }

    public RecoverVirtualBorderRouterResponse recoverVirtualBorderRouterWithOptions(RecoverVirtualBorderRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RecoverVirtualBorderRouter", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new RecoverVirtualBorderRouterResponse());
    }

    public RecoverVirtualBorderRouterResponse recoverVirtualBorderRouter(RecoverVirtualBorderRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recoverVirtualBorderRouterWithOptions(request, runtime);
    }

    public ReleaseEipAddressResponse releaseEipAddressWithOptions(ReleaseEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseEipAddress", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseEipAddressResponse());
    }

    public ReleaseEipAddressResponse releaseEipAddress(ReleaseEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseEipAddressWithOptions(request, runtime);
    }

    public ReleaseEipSegmentAddressResponse releaseEipSegmentAddressWithOptions(ReleaseEipSegmentAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseEipSegmentAddress", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseEipSegmentAddressResponse());
    }

    public ReleaseEipSegmentAddressResponse releaseEipSegmentAddress(ReleaseEipSegmentAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseEipSegmentAddressWithOptions(request, runtime);
    }

    public RemoveCommonBandwidthPackageIpResponse removeCommonBandwidthPackageIpWithOptions(RemoveCommonBandwidthPackageIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveCommonBandwidthPackageIp", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveCommonBandwidthPackageIpResponse());
    }

    public RemoveCommonBandwidthPackageIpResponse removeCommonBandwidthPackageIp(RemoveCommonBandwidthPackageIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeCommonBandwidthPackageIpWithOptions(request, runtime);
    }

    public RemoveGlobalAccelerationInstanceIpResponse removeGlobalAccelerationInstanceIpWithOptions(RemoveGlobalAccelerationInstanceIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveGlobalAccelerationInstanceIp", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveGlobalAccelerationInstanceIpResponse());
    }

    public RemoveGlobalAccelerationInstanceIpResponse removeGlobalAccelerationInstanceIp(RemoveGlobalAccelerationInstanceIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeGlobalAccelerationInstanceIpWithOptions(request, runtime);
    }

    public RemoveIPv6TranslatorAclListEntryResponse removeIPv6TranslatorAclListEntryWithOptions(RemoveIPv6TranslatorAclListEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveIPv6TranslatorAclListEntry", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveIPv6TranslatorAclListEntryResponse());
    }

    public RemoveIPv6TranslatorAclListEntryResponse removeIPv6TranslatorAclListEntry(RemoveIPv6TranslatorAclListEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeIPv6TranslatorAclListEntryWithOptions(request, runtime);
    }

    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewInstance", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new RenewInstanceResponse());
    }

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    public ReplaceVpcDhcpOptionsSetResponse replaceVpcDhcpOptionsSetWithOptions(ReplaceVpcDhcpOptionsSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReplaceVpcDhcpOptionsSet", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new ReplaceVpcDhcpOptionsSetResponse());
    }

    public ReplaceVpcDhcpOptionsSetResponse replaceVpcDhcpOptionsSet(ReplaceVpcDhcpOptionsSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.replaceVpcDhcpOptionsSetWithOptions(request, runtime);
    }

    public RevokeInstanceFromCenResponse revokeInstanceFromCenWithOptions(RevokeInstanceFromCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RevokeInstanceFromCen", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new RevokeInstanceFromCenResponse());
    }

    public RevokeInstanceFromCenResponse revokeInstanceFromCen(RevokeInstanceFromCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeInstanceFromCenWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public TerminatePhysicalConnectionResponse terminatePhysicalConnectionWithOptions(TerminatePhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TerminatePhysicalConnection", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new TerminatePhysicalConnectionResponse());
    }

    public TerminatePhysicalConnectionResponse terminatePhysicalConnection(TerminatePhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.terminatePhysicalConnectionWithOptions(request, runtime);
    }

    public TerminateVirtualBorderRouterResponse terminateVirtualBorderRouterWithOptions(TerminateVirtualBorderRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TerminateVirtualBorderRouter", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new TerminateVirtualBorderRouterResponse());
    }

    public TerminateVirtualBorderRouterResponse terminateVirtualBorderRouter(TerminateVirtualBorderRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.terminateVirtualBorderRouterWithOptions(request, runtime);
    }

    public UnassociateEipAddressResponse unassociateEipAddressWithOptions(UnassociateEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnassociateEipAddress", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new UnassociateEipAddressResponse());
    }

    public UnassociateEipAddressResponse unassociateEipAddress(UnassociateEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassociateEipAddressWithOptions(request, runtime);
    }

    public UnassociateGlobalAccelerationInstanceResponse unassociateGlobalAccelerationInstanceWithOptions(UnassociateGlobalAccelerationInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnassociateGlobalAccelerationInstance", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new UnassociateGlobalAccelerationInstanceResponse());
    }

    public UnassociateGlobalAccelerationInstanceResponse unassociateGlobalAccelerationInstance(UnassociateGlobalAccelerationInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassociateGlobalAccelerationInstanceWithOptions(request, runtime);
    }

    public UnassociateHaVipResponse unassociateHaVipWithOptions(UnassociateHaVipRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnassociateHaVip", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new UnassociateHaVipResponse());
    }

    public UnassociateHaVipResponse unassociateHaVip(UnassociateHaVipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassociateHaVipWithOptions(request, runtime);
    }

    public UnassociateNetworkAclResponse unassociateNetworkAclWithOptions(UnassociateNetworkAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnassociateNetworkAcl", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new UnassociateNetworkAclResponse());
    }

    public UnassociateNetworkAclResponse unassociateNetworkAcl(UnassociateNetworkAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassociateNetworkAclWithOptions(request, runtime);
    }

    public UnassociatePhysicalConnectionFromVirtualBorderRouterResponse unassociatePhysicalConnectionFromVirtualBorderRouterWithOptions(UnassociatePhysicalConnectionFromVirtualBorderRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnassociatePhysicalConnectionFromVirtualBorderRouter", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new UnassociatePhysicalConnectionFromVirtualBorderRouterResponse());
    }

    public UnassociatePhysicalConnectionFromVirtualBorderRouterResponse unassociatePhysicalConnectionFromVirtualBorderRouter(UnassociatePhysicalConnectionFromVirtualBorderRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassociatePhysicalConnectionFromVirtualBorderRouterWithOptions(request, runtime);
    }

    public UnassociateRouteTableResponse unassociateRouteTableWithOptions(UnassociateRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnassociateRouteTable", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new UnassociateRouteTableResponse());
    }

    public UnassociateRouteTableResponse unassociateRouteTable(UnassociateRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassociateRouteTableWithOptions(request, runtime);
    }

    public UnassociateVpcCidrBlockResponse unassociateVpcCidrBlockWithOptions(UnassociateVpcCidrBlockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnassociateVpcCidrBlock", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new UnassociateVpcCidrBlockResponse());
    }

    public UnassociateVpcCidrBlockResponse unassociateVpcCidrBlock(UnassociateVpcCidrBlockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassociateVpcCidrBlockWithOptions(request, runtime);
    }

    public UnTagResourcesResponse unTagResourcesWithOptions(UnTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnTagResources", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new UnTagResourcesResponse());
    }

    public UnTagResourcesResponse unTagResources(UnTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unTagResourcesWithOptions(request, runtime);
    }

    public UpdateDhcpOptionsSetAttributeResponse updateDhcpOptionsSetAttributeWithOptions(UpdateDhcpOptionsSetAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDhcpOptionsSetAttribute", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDhcpOptionsSetAttributeResponse());
    }

    public UpdateDhcpOptionsSetAttributeResponse updateDhcpOptionsSetAttribute(UpdateDhcpOptionsSetAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDhcpOptionsSetAttributeWithOptions(request, runtime);
    }

    public UpdateIpsecServerResponse updateIpsecServerWithOptions(UpdateIpsecServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateIpsecServer", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateIpsecServerResponse());
    }

    public UpdateIpsecServerResponse updateIpsecServer(UpdateIpsecServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIpsecServerWithOptions(request, runtime);
    }

    public UpdateNatGatewayNatTypeResponse updateNatGatewayNatTypeWithOptions(UpdateNatGatewayNatTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateNatGatewayNatType", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateNatGatewayNatTypeResponse());
    }

    public UpdateNatGatewayNatTypeResponse updateNatGatewayNatType(UpdateNatGatewayNatTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNatGatewayNatTypeWithOptions(request, runtime);
    }

    public UpdateNetworkAclEntriesResponse updateNetworkAclEntriesWithOptions(UpdateNetworkAclEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateNetworkAclEntries", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateNetworkAclEntriesResponse());
    }

    public UpdateNetworkAclEntriesResponse updateNetworkAclEntries(UpdateNetworkAclEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNetworkAclEntriesWithOptions(request, runtime);
    }

    public UpdateVirtualBorderBandwidthResponse updateVirtualBorderBandwidthWithOptions(UpdateVirtualBorderBandwidthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateVirtualBorderBandwidth", "2016-04-28", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateVirtualBorderBandwidthResponse());
    }

    public UpdateVirtualBorderBandwidthResponse updateVirtualBorderBandwidth(UpdateVirtualBorderBandwidthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateVirtualBorderBandwidthWithOptions(request, runtime);
    }
}

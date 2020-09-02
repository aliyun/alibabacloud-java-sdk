// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428;

import com.aliyun.tea.*;
import com.aliyun.vpc20160428.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
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


    public ListPhysicalConnectionFeaturesResponse listPhysicalConnectionFeaturesWithOptions(ListPhysicalConnectionFeaturesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPhysicalConnectionFeatures", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ListPhysicalConnectionFeaturesResponse());
    }

    public ListPhysicalConnectionFeaturesResponse listPhysicalConnectionFeatures(ListPhysicalConnectionFeaturesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPhysicalConnectionFeaturesWithOptions(request, runtime);
    }

    public ListNatGatewayEcsMetricResponse listNatGatewayEcsMetricWithOptions(ListNatGatewayEcsMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListNatGatewayEcsMetric", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ListNatGatewayEcsMetricResponse());
    }

    public ListNatGatewayEcsMetricResponse listNatGatewayEcsMetric(ListNatGatewayEcsMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNatGatewayEcsMetricWithOptions(request, runtime);
    }

    public DisableNatGatewayEcsMetricResponse disableNatGatewayEcsMetricWithOptions(DisableNatGatewayEcsMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisableNatGatewayEcsMetric", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DisableNatGatewayEcsMetricResponse());
    }

    public DisableNatGatewayEcsMetricResponse disableNatGatewayEcsMetric(DisableNatGatewayEcsMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableNatGatewayEcsMetricWithOptions(request, runtime);
    }

    public EnableNatGatewayEcsMetricResponse enableNatGatewayEcsMetricWithOptions(EnableNatGatewayEcsMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableNatGatewayEcsMetric", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new EnableNatGatewayEcsMetricResponse());
    }

    public EnableNatGatewayEcsMetricResponse enableNatGatewayEcsMetric(EnableNatGatewayEcsMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableNatGatewayEcsMetricWithOptions(request, runtime);
    }

    public CreateDhcpOptionsSetResponse createDhcpOptionsSetWithOptions(CreateDhcpOptionsSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDhcpOptionsSet", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateDhcpOptionsSetResponse());
    }

    public CreateDhcpOptionsSetResponse createDhcpOptionsSet(CreateDhcpOptionsSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDhcpOptionsSetWithOptions(request, runtime);
    }

    public ReplaceVpcDhcpOptionsSetResponse replaceVpcDhcpOptionsSetWithOptions(ReplaceVpcDhcpOptionsSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReplaceVpcDhcpOptionsSet", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ReplaceVpcDhcpOptionsSetResponse());
    }

    public ReplaceVpcDhcpOptionsSetResponse replaceVpcDhcpOptionsSet(ReplaceVpcDhcpOptionsSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.replaceVpcDhcpOptionsSetWithOptions(request, runtime);
    }

    public UpdateDhcpOptionsSetAttributeResponse updateDhcpOptionsSetAttributeWithOptions(UpdateDhcpOptionsSetAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDhcpOptionsSetAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDhcpOptionsSetAttributeResponse());
    }

    public UpdateDhcpOptionsSetAttributeResponse updateDhcpOptionsSetAttribute(UpdateDhcpOptionsSetAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDhcpOptionsSetAttributeWithOptions(request, runtime);
    }

    public GetDhcpOptionsSetResponse getDhcpOptionsSetWithOptions(GetDhcpOptionsSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDhcpOptionsSet", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new GetDhcpOptionsSetResponse());
    }

    public GetDhcpOptionsSetResponse getDhcpOptionsSet(GetDhcpOptionsSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDhcpOptionsSetWithOptions(request, runtime);
    }

    public ListDhcpOptionsSetsResponse listDhcpOptionsSetsWithOptions(ListDhcpOptionsSetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDhcpOptionsSets", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ListDhcpOptionsSetsResponse());
    }

    public ListDhcpOptionsSetsResponse listDhcpOptionsSets(ListDhcpOptionsSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDhcpOptionsSetsWithOptions(request, runtime);
    }

    public DetachDhcpOptionsSetFromVpcResponse detachDhcpOptionsSetFromVpcWithOptions(DetachDhcpOptionsSetFromVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetachDhcpOptionsSetFromVpc", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DetachDhcpOptionsSetFromVpcResponse());
    }

    public DetachDhcpOptionsSetFromVpcResponse detachDhcpOptionsSetFromVpc(DetachDhcpOptionsSetFromVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachDhcpOptionsSetFromVpcWithOptions(request, runtime);
    }

    public AttachDhcpOptionsSetToVpcResponse attachDhcpOptionsSetToVpcWithOptions(AttachDhcpOptionsSetToVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AttachDhcpOptionsSetToVpc", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new AttachDhcpOptionsSetToVpcResponse());
    }

    public AttachDhcpOptionsSetToVpcResponse attachDhcpOptionsSetToVpc(AttachDhcpOptionsSetToVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachDhcpOptionsSetToVpcWithOptions(request, runtime);
    }

    public DeleteDhcpOptionsSetResponse deleteDhcpOptionsSetWithOptions(DeleteDhcpOptionsSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDhcpOptionsSet", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDhcpOptionsSetResponse());
    }

    public DeleteDhcpOptionsSetResponse deleteDhcpOptionsSet(DeleteDhcpOptionsSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDhcpOptionsSetWithOptions(request, runtime);
    }

    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RenewInstance", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new RenewInstanceResponse());
    }

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttributeWithOptions(DescribeInstanceAutoRenewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceAutoRenewAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceAutoRenewAttributeResponse());
    }

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceAutoRenewAttributeWithOptions(request, runtime);
    }

    public ModifyInstanceAutoRenewalAttributeResponse modifyInstanceAutoRenewalAttributeWithOptions(ModifyInstanceAutoRenewalAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstanceAutoRenewalAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyInstanceAutoRenewalAttributeResponse());
    }

    public ModifyInstanceAutoRenewalAttributeResponse modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAutoRenewalAttributeWithOptions(request, runtime);
    }

    public ReleaseEipSegmentAddressResponse releaseEipSegmentAddressWithOptions(ReleaseEipSegmentAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleaseEipSegmentAddress", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ReleaseEipSegmentAddressResponse());
    }

    public ReleaseEipSegmentAddressResponse releaseEipSegmentAddress(ReleaseEipSegmentAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseEipSegmentAddressWithOptions(request, runtime);
    }

    public DescribeEipSegmentResponse describeEipSegmentWithOptions(DescribeEipSegmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEipSegment", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEipSegmentResponse());
    }

    public DescribeEipSegmentResponse describeEipSegment(DescribeEipSegmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEipSegmentWithOptions(request, runtime);
    }

    public AllocateEipSegmentAddressResponse allocateEipSegmentAddressWithOptions(AllocateEipSegmentAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AllocateEipSegmentAddress", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new AllocateEipSegmentAddressResponse());
    }

    public AllocateEipSegmentAddressResponse allocateEipSegmentAddress(AllocateEipSegmentAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateEipSegmentAddressWithOptions(request, runtime);
    }

    public UnassociateVpcCidrBlockResponse unassociateVpcCidrBlockWithOptions(UnassociateVpcCidrBlockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnassociateVpcCidrBlock", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new UnassociateVpcCidrBlockResponse());
    }

    public UnassociateVpcCidrBlockResponse unassociateVpcCidrBlock(UnassociateVpcCidrBlockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassociateVpcCidrBlockWithOptions(request, runtime);
    }

    public AssociateVpcCidrBlockResponse associateVpcCidrBlockWithOptions(AssociateVpcCidrBlockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AssociateVpcCidrBlock", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new AssociateVpcCidrBlockResponse());
    }

    public AssociateVpcCidrBlockResponse associateVpcCidrBlock(AssociateVpcCidrBlockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateVpcCidrBlockWithOptions(request, runtime);
    }

    public DescribeRouterInterfaceAttributeResponse describeRouterInterfaceAttributeWithOptions(DescribeRouterInterfaceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRouterInterfaceAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRouterInterfaceAttributeResponse());
    }

    public DescribeRouterInterfaceAttributeResponse describeRouterInterfaceAttribute(DescribeRouterInterfaceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRouterInterfaceAttributeWithOptions(request, runtime);
    }

    public DeleteExpressCloudConnectionResponse deleteExpressCloudConnectionWithOptions(DeleteExpressCloudConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteExpressCloudConnection", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteExpressCloudConnectionResponse());
    }

    public DeleteExpressCloudConnectionResponse deleteExpressCloudConnection(DeleteExpressCloudConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExpressCloudConnectionWithOptions(request, runtime);
    }

    public CancelExpressCloudConnectionResponse cancelExpressCloudConnectionWithOptions(CancelExpressCloudConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelExpressCloudConnection", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CancelExpressCloudConnectionResponse());
    }

    public CancelExpressCloudConnectionResponse cancelExpressCloudConnection(CancelExpressCloudConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelExpressCloudConnectionWithOptions(request, runtime);
    }

    public DeletionProtectionResponse deletionProtectionWithOptions(DeletionProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeletionProtection", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeletionProtectionResponse());
    }

    public DeletionProtectionResponse deletionProtection(DeletionProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletionProtectionWithOptions(request, runtime);
    }

    public DescribeEipGatewayInfoResponse describeEipGatewayInfoWithOptions(DescribeEipGatewayInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEipGatewayInfo", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEipGatewayInfoResponse());
    }

    public DescribeEipGatewayInfoResponse describeEipGatewayInfo(DescribeEipGatewayInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEipGatewayInfoWithOptions(request, runtime);
    }

    public ModifyBgpPeerAttributeResponse modifyBgpPeerAttributeWithOptions(ModifyBgpPeerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyBgpPeerAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyBgpPeerAttributeResponse());
    }

    public ModifyBgpPeerAttributeResponse modifyBgpPeerAttribute(ModifyBgpPeerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBgpPeerAttributeWithOptions(request, runtime);
    }

    public DescribeVpnSslServerLogsResponse describeVpnSslServerLogsWithOptions(DescribeVpnSslServerLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVpnSslServerLogs", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVpnSslServerLogsResponse());
    }

    public DescribeVpnSslServerLogsResponse describeVpnSslServerLogs(DescribeVpnSslServerLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpnSslServerLogsWithOptions(request, runtime);
    }

    public ModifyExpressCloudConnectionBandwidthResponse modifyExpressCloudConnectionBandwidthWithOptions(ModifyExpressCloudConnectionBandwidthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyExpressCloudConnectionBandwidth", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyExpressCloudConnectionBandwidthResponse());
    }

    public ModifyExpressCloudConnectionBandwidthResponse modifyExpressCloudConnectionBandwidth(ModifyExpressCloudConnectionBandwidthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyExpressCloudConnectionBandwidthWithOptions(request, runtime);
    }

    public ModifyExpressCloudConnectionAttributeResponse modifyExpressCloudConnectionAttributeWithOptions(ModifyExpressCloudConnectionAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyExpressCloudConnectionAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyExpressCloudConnectionAttributeResponse());
    }

    public ModifyExpressCloudConnectionAttributeResponse modifyExpressCloudConnectionAttribute(ModifyExpressCloudConnectionAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyExpressCloudConnectionAttributeWithOptions(request, runtime);
    }

    public DescribeExpressCloudConnectionsResponse describeExpressCloudConnectionsWithOptions(DescribeExpressCloudConnectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeExpressCloudConnections", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeExpressCloudConnectionsResponse());
    }

    public DescribeExpressCloudConnectionsResponse describeExpressCloudConnections(DescribeExpressCloudConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressCloudConnectionsWithOptions(request, runtime);
    }

    public CreateExpressCloudConnectionResponse createExpressCloudConnectionWithOptions(CreateExpressCloudConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateExpressCloudConnection", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateExpressCloudConnectionResponse());
    }

    public CreateExpressCloudConnectionResponse createExpressCloudConnection(CreateExpressCloudConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExpressCloudConnectionWithOptions(request, runtime);
    }

    public UpdateNetworkAclEntriesResponse updateNetworkAclEntriesWithOptions(UpdateNetworkAclEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateNetworkAclEntries", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new UpdateNetworkAclEntriesResponse());
    }

    public UpdateNetworkAclEntriesResponse updateNetworkAclEntries(UpdateNetworkAclEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNetworkAclEntriesWithOptions(request, runtime);
    }

    public UnassociateNetworkAclResponse unassociateNetworkAclWithOptions(UnassociateNetworkAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnassociateNetworkAcl", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new UnassociateNetworkAclResponse());
    }

    public UnassociateNetworkAclResponse unassociateNetworkAcl(UnassociateNetworkAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassociateNetworkAclWithOptions(request, runtime);
    }

    public ModifyNetworkAclAttributesResponse modifyNetworkAclAttributesWithOptions(ModifyNetworkAclAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyNetworkAclAttributes", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyNetworkAclAttributesResponse());
    }

    public ModifyNetworkAclAttributesResponse modifyNetworkAclAttributes(ModifyNetworkAclAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNetworkAclAttributesWithOptions(request, runtime);
    }

    public DescribeNetworkAclsResponse describeNetworkAclsWithOptions(DescribeNetworkAclsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeNetworkAcls", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeNetworkAclsResponse());
    }

    public DescribeNetworkAclsResponse describeNetworkAcls(DescribeNetworkAclsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkAclsWithOptions(request, runtime);
    }

    public DescribeNetworkAclAttributesResponse describeNetworkAclAttributesWithOptions(DescribeNetworkAclAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeNetworkAclAttributes", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeNetworkAclAttributesResponse());
    }

    public DescribeNetworkAclAttributesResponse describeNetworkAclAttributes(DescribeNetworkAclAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkAclAttributesWithOptions(request, runtime);
    }

    public DeleteNetworkAclResponse deleteNetworkAclWithOptions(DeleteNetworkAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteNetworkAcl", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteNetworkAclResponse());
    }

    public DeleteNetworkAclResponse deleteNetworkAcl(DeleteNetworkAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkAclWithOptions(request, runtime);
    }

    public CreateNetworkAclResponse createNetworkAclWithOptions(CreateNetworkAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateNetworkAcl", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateNetworkAclResponse());
    }

    public CreateNetworkAclResponse createNetworkAcl(CreateNetworkAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkAclWithOptions(request, runtime);
    }

    public CopyNetworkAclEntriesResponse copyNetworkAclEntriesWithOptions(CopyNetworkAclEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CopyNetworkAclEntries", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CopyNetworkAclEntriesResponse());
    }

    public CopyNetworkAclEntriesResponse copyNetworkAclEntries(CopyNetworkAclEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyNetworkAclEntriesWithOptions(request, runtime);
    }

    public AssociateNetworkAclResponse associateNetworkAclWithOptions(AssociateNetworkAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AssociateNetworkAcl", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new AssociateNetworkAclResponse());
    }

    public AssociateNetworkAclResponse associateNetworkAcl(AssociateNetworkAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateNetworkAclWithOptions(request, runtime);
    }

    public ModifyCommonBandwidthPackageIpBandwidthResponse modifyCommonBandwidthPackageIpBandwidthWithOptions(ModifyCommonBandwidthPackageIpBandwidthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyCommonBandwidthPackageIpBandwidth", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyCommonBandwidthPackageIpBandwidthResponse());
    }

    public ModifyCommonBandwidthPackageIpBandwidthResponse modifyCommonBandwidthPackageIpBandwidth(ModifyCommonBandwidthPackageIpBandwidthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCommonBandwidthPackageIpBandwidthWithOptions(request, runtime);
    }

    public CancelCommonBandwidthPackageIpBandwidthResponse cancelCommonBandwidthPackageIpBandwidthWithOptions(CancelCommonBandwidthPackageIpBandwidthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelCommonBandwidthPackageIpBandwidth", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CancelCommonBandwidthPackageIpBandwidthResponse());
    }

    public CancelCommonBandwidthPackageIpBandwidthResponse cancelCommonBandwidthPackageIpBandwidth(CancelCommonBandwidthPackageIpBandwidthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelCommonBandwidthPackageIpBandwidthWithOptions(request, runtime);
    }

    public CreateVpnPbrRouteEntryResponse createVpnPbrRouteEntryWithOptions(CreateVpnPbrRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateVpnPbrRouteEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateVpnPbrRouteEntryResponse());
    }

    public CreateVpnPbrRouteEntryResponse createVpnPbrRouteEntry(CreateVpnPbrRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpnPbrRouteEntryWithOptions(request, runtime);
    }

    public CreateVpnRouteEntryResponse createVpnRouteEntryWithOptions(CreateVpnRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateVpnRouteEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateVpnRouteEntryResponse());
    }

    public CreateVpnRouteEntryResponse createVpnRouteEntry(CreateVpnRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpnRouteEntryWithOptions(request, runtime);
    }

    public DeleteVpnPbrRouteEntryResponse deleteVpnPbrRouteEntryWithOptions(DeleteVpnPbrRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVpnPbrRouteEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteVpnPbrRouteEntryResponse());
    }

    public DeleteVpnPbrRouteEntryResponse deleteVpnPbrRouteEntry(DeleteVpnPbrRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVpnPbrRouteEntryWithOptions(request, runtime);
    }

    public DeleteVpnRouteEntryResponse deleteVpnRouteEntryWithOptions(DeleteVpnRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVpnRouteEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteVpnRouteEntryResponse());
    }

    public DeleteVpnRouteEntryResponse deleteVpnRouteEntry(DeleteVpnRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVpnRouteEntryWithOptions(request, runtime);
    }

    public DescribeVpnRouteEntriesResponse describeVpnRouteEntriesWithOptions(DescribeVpnRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVpnRouteEntries", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVpnRouteEntriesResponse());
    }

    public DescribeVpnRouteEntriesResponse describeVpnRouteEntries(DescribeVpnRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpnRouteEntriesWithOptions(request, runtime);
    }

    public DescribeVpnPbrRouteEntriesResponse describeVpnPbrRouteEntriesWithOptions(DescribeVpnPbrRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVpnPbrRouteEntries", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVpnPbrRouteEntriesResponse());
    }

    public DescribeVpnPbrRouteEntriesResponse describeVpnPbrRouteEntries(DescribeVpnPbrRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpnPbrRouteEntriesWithOptions(request, runtime);
    }

    public PublishVpnRouteEntryResponse publishVpnRouteEntryWithOptions(PublishVpnRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PublishVpnRouteEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new PublishVpnRouteEntryResponse());
    }

    public PublishVpnRouteEntryResponse publishVpnRouteEntry(PublishVpnRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishVpnRouteEntryWithOptions(request, runtime);
    }

    public ModifyVpnRouteEntryWeightResponse modifyVpnRouteEntryWeightWithOptions(ModifyVpnRouteEntryWeightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyVpnRouteEntryWeight", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyVpnRouteEntryWeightResponse());
    }

    public ModifyVpnRouteEntryWeightResponse modifyVpnRouteEntryWeight(ModifyVpnRouteEntryWeightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpnRouteEntryWeightWithOptions(request, runtime);
    }

    public ModifyVpnPbrRouteEntryWeightResponse modifyVpnPbrRouteEntryWeightWithOptions(ModifyVpnPbrRouteEntryWeightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyVpnPbrRouteEntryWeight", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyVpnPbrRouteEntryWeightResponse());
    }

    public ModifyVpnPbrRouteEntryWeightResponse modifyVpnPbrRouteEntryWeight(ModifyVpnPbrRouteEntryWeightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpnPbrRouteEntryWeightWithOptions(request, runtime);
    }

    /**
     * DescribePhysicalConnectionLOA Query LOA information about the physical connection.
      * request demo:   * http(s)://[Endpoint]/?InstanceId=pc-bp1ca4wca27exxxxxxxx
      * &RegionId=cn-hangzhou
      * &<CommonParameters>
      * description: 
     */
    public DescribePhysicalConnectionLOAResponse describePhysicalConnectionLOAWithOptions(DescribePhysicalConnectionLOARequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePhysicalConnectionLOA", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribePhysicalConnectionLOAResponse());
    }

    /**
     * DescribePhysicalConnectionLOA Query LOA information about the physical connection.
      * request demo:   * http(s)://[Endpoint]/?InstanceId=pc-bp1ca4wca27exxxxxxxx
      * &RegionId=cn-hangzhou
      * &<CommonParameters>
      * description: 
     */
    public DescribePhysicalConnectionLOAResponse describePhysicalConnectionLOA(DescribePhysicalConnectionLOARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePhysicalConnectionLOAWithOptions(request, runtime);
    }

    /**
     * CreatePhysicalConnectionSetupOrder Create an order for the resource fee.
      * request demo:   * http(s)://[Endpoint]/?AccessPointId=ap-cn-beijing-ft-A
      * &LineOperator=CT
      * &RegionId=cn-shanghai
      * &<CommonParameters>
      * description: 
     */
    public CreatePhysicalConnectionSetupOrderResponse createPhysicalConnectionSetupOrderWithOptions(CreatePhysicalConnectionSetupOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreatePhysicalConnectionSetupOrder", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreatePhysicalConnectionSetupOrderResponse());
    }

    /**
     * CreatePhysicalConnectionSetupOrder Create an order for the resource fee.
      * request demo:   * http(s)://[Endpoint]/?AccessPointId=ap-cn-beijing-ft-A
      * &LineOperator=CT
      * &RegionId=cn-shanghai
      * &<CommonParameters>
      * description: 
     */
    public CreatePhysicalConnectionSetupOrderResponse createPhysicalConnectionSetupOrder(CreatePhysicalConnectionSetupOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPhysicalConnectionSetupOrderWithOptions(request, runtime);
    }

    /**
     * CreatePhysicalConnectionOccupancyOrder Create an order for the initial installation fee.
      * request demo:   * http(s)://[Endpoint]/?PhysicalConnectionId=pc-bp1hp0wr072f6ambni141
      * &RegionId=cn-hangzhou
      * &<CommonParameters>
      * description: 
     */
    public CreatePhysicalConnectionOccupancyOrderResponse createPhysicalConnectionOccupancyOrderWithOptions(CreatePhysicalConnectionOccupancyOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreatePhysicalConnectionOccupancyOrder", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreatePhysicalConnectionOccupancyOrderResponse());
    }

    /**
     * CreatePhysicalConnectionOccupancyOrder Create an order for the initial installation fee.
      * request demo:   * http(s)://[Endpoint]/?PhysicalConnectionId=pc-bp1hp0wr072f6ambni141
      * &RegionId=cn-hangzhou
      * &<CommonParameters>
      * description: 
     */
    public CreatePhysicalConnectionOccupancyOrderResponse createPhysicalConnectionOccupancyOrder(CreatePhysicalConnectionOccupancyOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPhysicalConnectionOccupancyOrderWithOptions(request, runtime);
    }

    /**
     * CompletePhysicalConnectionLOA Report information about the completed installation of the leased line.
      * request demo:   * http(s)://[Endpoint]/?InstanceId=pc-bp10tvlhnwkwxxxxxxxxxx
      * &LineCode=aaa111
      * &LineLabel=bbb222
      * &RegionId=cn-hangzhou
      * &<CommonParameters>
      * description: 
     */
    public CompletePhysicalConnectionLOAResponse completePhysicalConnectionLOAWithOptions(CompletePhysicalConnectionLOARequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CompletePhysicalConnectionLOA", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CompletePhysicalConnectionLOAResponse());
    }

    /**
     * CompletePhysicalConnectionLOA Report information about the completed installation of the leased line.
      * request demo:   * http(s)://[Endpoint]/?InstanceId=pc-bp10tvlhnwkwxxxxxxxxxx
      * &LineCode=aaa111
      * &LineLabel=bbb222
      * &RegionId=cn-hangzhou
      * &<CommonParameters>
      * description: 
     */
    public CompletePhysicalConnectionLOAResponse completePhysicalConnectionLOA(CompletePhysicalConnectionLOARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.completePhysicalConnectionLOAWithOptions(request, runtime);
    }

    /**
     * ApplyPhysicalConnectionLOA Apply for the LOA.
      * request demo:   * http(s)://[Endpoint]/?CompanyName=company
      * &ConstructionTime=2019-02-28T16:00:00.000Z
      * &InstanceId=pc-bp1qrb3044eqixxxxxxxx
      * &LineType=SDH
      * &PeerLocation=Hangzhou
      * &RegionId=cn-hangzhou
      * &Si=Alibaba Cloud
      * &<CommonParameters>
      * description: 
     */
    public ApplyPhysicalConnectionLOAResponse applyPhysicalConnectionLOAWithOptions(ApplyPhysicalConnectionLOARequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ApplyPhysicalConnectionLOA", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ApplyPhysicalConnectionLOAResponse());
    }

    /**
     * ApplyPhysicalConnectionLOA Apply for the LOA.
      * request demo:   * http(s)://[Endpoint]/?CompanyName=company
      * &ConstructionTime=2019-02-28T16:00:00.000Z
      * &InstanceId=pc-bp1qrb3044eqixxxxxxxx
      * &LineType=SDH
      * &PeerLocation=Hangzhou
      * &RegionId=cn-hangzhou
      * &Si=Alibaba Cloud
      * &<CommonParameters>
      * description: 
     */
    public ApplyPhysicalConnectionLOAResponse applyPhysicalConnectionLOA(ApplyPhysicalConnectionLOARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyPhysicalConnectionLOAWithOptions(request, runtime);
    }

    public ConvertBandwidthPackageResponse convertBandwidthPackageWithOptions(ConvertBandwidthPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ConvertBandwidthPackage", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ConvertBandwidthPackageResponse());
    }

    public ConvertBandwidthPackageResponse convertBandwidthPackage(ConvertBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.convertBandwidthPackageWithOptions(request, runtime);
    }

    public ModifyRouteEntryResponse modifyRouteEntryWithOptions(ModifyRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyRouteEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyRouteEntryResponse());
    }

    public ModifyRouteEntryResponse modifyRouteEntry(ModifyRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRouteEntryWithOptions(request, runtime);
    }

    public DescribeRouteEntryListResponse describeRouteEntryListWithOptions(DescribeRouteEntryListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRouteEntryList", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRouteEntryListResponse());
    }

    public DescribeRouteEntryListResponse describeRouteEntryList(DescribeRouteEntryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRouteEntryListWithOptions(request, runtime);
    }

    public CreateIPv6TranslatorAclListResponse createIPv6TranslatorAclListWithOptions(CreateIPv6TranslatorAclListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateIPv6TranslatorAclList", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateIPv6TranslatorAclListResponse());
    }

    public CreateIPv6TranslatorAclListResponse createIPv6TranslatorAclList(CreateIPv6TranslatorAclListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIPv6TranslatorAclListWithOptions(request, runtime);
    }

    public DeleteIPv6TranslatorAclListResponse deleteIPv6TranslatorAclListWithOptions(DeleteIPv6TranslatorAclListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteIPv6TranslatorAclList", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteIPv6TranslatorAclListResponse());
    }

    public DeleteIPv6TranslatorAclListResponse deleteIPv6TranslatorAclList(DeleteIPv6TranslatorAclListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIPv6TranslatorAclListWithOptions(request, runtime);
    }

    public AddIPv6TranslatorAclListEntryResponse addIPv6TranslatorAclListEntryWithOptions(AddIPv6TranslatorAclListEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddIPv6TranslatorAclListEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new AddIPv6TranslatorAclListEntryResponse());
    }

    public AddIPv6TranslatorAclListEntryResponse addIPv6TranslatorAclListEntry(AddIPv6TranslatorAclListEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addIPv6TranslatorAclListEntryWithOptions(request, runtime);
    }

    public DescribeIPv6TranslatorAclListsResponse describeIPv6TranslatorAclListsWithOptions(DescribeIPv6TranslatorAclListsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeIPv6TranslatorAclLists", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeIPv6TranslatorAclListsResponse());
    }

    public DescribeIPv6TranslatorAclListsResponse describeIPv6TranslatorAclLists(DescribeIPv6TranslatorAclListsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIPv6TranslatorAclListsWithOptions(request, runtime);
    }

    public ModifyIPv6TranslatorAclAttributeResponse modifyIPv6TranslatorAclAttributeWithOptions(ModifyIPv6TranslatorAclAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyIPv6TranslatorAclAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyIPv6TranslatorAclAttributeResponse());
    }

    public ModifyIPv6TranslatorAclAttributeResponse modifyIPv6TranslatorAclAttribute(ModifyIPv6TranslatorAclAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyIPv6TranslatorAclAttributeWithOptions(request, runtime);
    }

    public RemoveIPv6TranslatorAclListEntryResponse removeIPv6TranslatorAclListEntryWithOptions(RemoveIPv6TranslatorAclListEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveIPv6TranslatorAclListEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new RemoveIPv6TranslatorAclListEntryResponse());
    }

    public RemoveIPv6TranslatorAclListEntryResponse removeIPv6TranslatorAclListEntry(RemoveIPv6TranslatorAclListEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeIPv6TranslatorAclListEntryWithOptions(request, runtime);
    }

    public DescribeIPv6TranslatorAclListAttributesResponse describeIPv6TranslatorAclListAttributesWithOptions(DescribeIPv6TranslatorAclListAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeIPv6TranslatorAclListAttributes", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeIPv6TranslatorAclListAttributesResponse());
    }

    public DescribeIPv6TranslatorAclListAttributesResponse describeIPv6TranslatorAclListAttributes(DescribeIPv6TranslatorAclListAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIPv6TranslatorAclListAttributesWithOptions(request, runtime);
    }

    public ModifyIPv6TranslatorAclListEntryResponse modifyIPv6TranslatorAclListEntryWithOptions(ModifyIPv6TranslatorAclListEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyIPv6TranslatorAclListEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyIPv6TranslatorAclListEntryResponse());
    }

    public ModifyIPv6TranslatorAclListEntryResponse modifyIPv6TranslatorAclListEntry(ModifyIPv6TranslatorAclListEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyIPv6TranslatorAclListEntryWithOptions(request, runtime);
    }

    public UnTagResourcesResponse unTagResourcesWithOptions(UnTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnTagResources", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new UnTagResourcesResponse());
    }

    public UnTagResourcesResponse unTagResources(UnTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unTagResourcesWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TagResources", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTagResources", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ModifyIpv6InternetBandwidthResponse modifyIpv6InternetBandwidthWithOptions(ModifyIpv6InternetBandwidthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyIpv6InternetBandwidth", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyIpv6InternetBandwidthResponse());
    }

    public ModifyIpv6InternetBandwidthResponse modifyIpv6InternetBandwidth(ModifyIpv6InternetBandwidthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyIpv6InternetBandwidthWithOptions(request, runtime);
    }

    public ModifyIpv6GatewaySpecResponse modifyIpv6GatewaySpecWithOptions(ModifyIpv6GatewaySpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyIpv6GatewaySpec", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyIpv6GatewaySpecResponse());
    }

    public ModifyIpv6GatewaySpecResponse modifyIpv6GatewaySpec(ModifyIpv6GatewaySpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyIpv6GatewaySpecWithOptions(request, runtime);
    }

    public ModifyIpv6GatewayAttributeResponse modifyIpv6GatewayAttributeWithOptions(ModifyIpv6GatewayAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyIpv6GatewayAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyIpv6GatewayAttributeResponse());
    }

    public ModifyIpv6GatewayAttributeResponse modifyIpv6GatewayAttribute(ModifyIpv6GatewayAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyIpv6GatewayAttributeWithOptions(request, runtime);
    }

    public ModifyIpv6AddressAttributeResponse modifyIpv6AddressAttributeWithOptions(ModifyIpv6AddressAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyIpv6AddressAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyIpv6AddressAttributeResponse());
    }

    public ModifyIpv6AddressAttributeResponse modifyIpv6AddressAttribute(ModifyIpv6AddressAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyIpv6AddressAttributeWithOptions(request, runtime);
    }

    public DescribeIpv6GatewaysResponse describeIpv6GatewaysWithOptions(DescribeIpv6GatewaysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeIpv6Gateways", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeIpv6GatewaysResponse());
    }

    public DescribeIpv6GatewaysResponse describeIpv6Gateways(DescribeIpv6GatewaysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIpv6GatewaysWithOptions(request, runtime);
    }

    public DescribeIpv6GatewayAttributeResponse describeIpv6GatewayAttributeWithOptions(DescribeIpv6GatewayAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeIpv6GatewayAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeIpv6GatewayAttributeResponse());
    }

    public DescribeIpv6GatewayAttributeResponse describeIpv6GatewayAttribute(DescribeIpv6GatewayAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIpv6GatewayAttributeWithOptions(request, runtime);
    }

    public DescribeIpv6EgressOnlyRulesResponse describeIpv6EgressOnlyRulesWithOptions(DescribeIpv6EgressOnlyRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeIpv6EgressOnlyRules", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeIpv6EgressOnlyRulesResponse());
    }

    public DescribeIpv6EgressOnlyRulesResponse describeIpv6EgressOnlyRules(DescribeIpv6EgressOnlyRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIpv6EgressOnlyRulesWithOptions(request, runtime);
    }

    public DescribeIpv6AddressesResponse describeIpv6AddressesWithOptions(DescribeIpv6AddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeIpv6Addresses", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeIpv6AddressesResponse());
    }

    public DescribeIpv6AddressesResponse describeIpv6Addresses(DescribeIpv6AddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIpv6AddressesWithOptions(request, runtime);
    }

    public DeleteIpv6InternetBandwidthResponse deleteIpv6InternetBandwidthWithOptions(DeleteIpv6InternetBandwidthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteIpv6InternetBandwidth", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteIpv6InternetBandwidthResponse());
    }

    public DeleteIpv6InternetBandwidthResponse deleteIpv6InternetBandwidth(DeleteIpv6InternetBandwidthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIpv6InternetBandwidthWithOptions(request, runtime);
    }

    public DeleteIpv6GatewayResponse deleteIpv6GatewayWithOptions(DeleteIpv6GatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteIpv6Gateway", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteIpv6GatewayResponse());
    }

    public DeleteIpv6GatewayResponse deleteIpv6Gateway(DeleteIpv6GatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIpv6GatewayWithOptions(request, runtime);
    }

    public DeleteIpv6EgressOnlyRuleResponse deleteIpv6EgressOnlyRuleWithOptions(DeleteIpv6EgressOnlyRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteIpv6EgressOnlyRule", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteIpv6EgressOnlyRuleResponse());
    }

    public DeleteIpv6EgressOnlyRuleResponse deleteIpv6EgressOnlyRule(DeleteIpv6EgressOnlyRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIpv6EgressOnlyRuleWithOptions(request, runtime);
    }

    public CreateIpv6GatewayResponse createIpv6GatewayWithOptions(CreateIpv6GatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateIpv6Gateway", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateIpv6GatewayResponse());
    }

    public CreateIpv6GatewayResponse createIpv6Gateway(CreateIpv6GatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIpv6GatewayWithOptions(request, runtime);
    }

    public CreateIpv6EgressOnlyRuleResponse createIpv6EgressOnlyRuleWithOptions(CreateIpv6EgressOnlyRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateIpv6EgressOnlyRule", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateIpv6EgressOnlyRuleResponse());
    }

    public CreateIpv6EgressOnlyRuleResponse createIpv6EgressOnlyRule(CreateIpv6EgressOnlyRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIpv6EgressOnlyRuleWithOptions(request, runtime);
    }

    public AllocateIpv6InternetBandwidthResponse allocateIpv6InternetBandwidthWithOptions(AllocateIpv6InternetBandwidthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AllocateIpv6InternetBandwidth", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new AllocateIpv6InternetBandwidthResponse());
    }

    public AllocateIpv6InternetBandwidthResponse allocateIpv6InternetBandwidth(AllocateIpv6InternetBandwidthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateIpv6InternetBandwidthWithOptions(request, runtime);
    }

    public DeleteExpressConnectResponse deleteExpressConnectWithOptions(DeleteExpressConnectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteExpressConnect", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteExpressConnectResponse());
    }

    public DeleteExpressConnectResponse deleteExpressConnect(DeleteExpressConnectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExpressConnectWithOptions(request, runtime);
    }

    public CreateIPv6TranslatorResponse createIPv6TranslatorWithOptions(CreateIPv6TranslatorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateIPv6Translator", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateIPv6TranslatorResponse());
    }

    public CreateIPv6TranslatorResponse createIPv6Translator(CreateIPv6TranslatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIPv6TranslatorWithOptions(request, runtime);
    }

    public DescribeIPv6TranslatorsResponse describeIPv6TranslatorsWithOptions(DescribeIPv6TranslatorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeIPv6Translators", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeIPv6TranslatorsResponse());
    }

    public DescribeIPv6TranslatorsResponse describeIPv6Translators(DescribeIPv6TranslatorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIPv6TranslatorsWithOptions(request, runtime);
    }

    public ModifyIPv6TranslatorAttributeResponse modifyIPv6TranslatorAttributeWithOptions(ModifyIPv6TranslatorAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyIPv6TranslatorAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyIPv6TranslatorAttributeResponse());
    }

    public ModifyIPv6TranslatorAttributeResponse modifyIPv6TranslatorAttribute(ModifyIPv6TranslatorAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyIPv6TranslatorAttributeWithOptions(request, runtime);
    }

    public ModifyIPv6TranslatorBandwidthResponse modifyIPv6TranslatorBandwidthWithOptions(ModifyIPv6TranslatorBandwidthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyIPv6TranslatorBandwidth", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyIPv6TranslatorBandwidthResponse());
    }

    public ModifyIPv6TranslatorBandwidthResponse modifyIPv6TranslatorBandwidth(ModifyIPv6TranslatorBandwidthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyIPv6TranslatorBandwidthWithOptions(request, runtime);
    }

    public CreateIPv6TranslatorEntryResponse createIPv6TranslatorEntryWithOptions(CreateIPv6TranslatorEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateIPv6TranslatorEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateIPv6TranslatorEntryResponse());
    }

    public CreateIPv6TranslatorEntryResponse createIPv6TranslatorEntry(CreateIPv6TranslatorEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIPv6TranslatorEntryWithOptions(request, runtime);
    }

    public DeleteIPv6TranslatorEntryResponse deleteIPv6TranslatorEntryWithOptions(DeleteIPv6TranslatorEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteIPv6TranslatorEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteIPv6TranslatorEntryResponse());
    }

    public DeleteIPv6TranslatorEntryResponse deleteIPv6TranslatorEntry(DeleteIPv6TranslatorEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIPv6TranslatorEntryWithOptions(request, runtime);
    }

    public ModifyIPv6TranslatorEntryResponse modifyIPv6TranslatorEntryWithOptions(ModifyIPv6TranslatorEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyIPv6TranslatorEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyIPv6TranslatorEntryResponse());
    }

    public ModifyIPv6TranslatorEntryResponse modifyIPv6TranslatorEntry(ModifyIPv6TranslatorEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyIPv6TranslatorEntryWithOptions(request, runtime);
    }

    public DescribeIPv6TranslatorEntriesResponse describeIPv6TranslatorEntriesWithOptions(DescribeIPv6TranslatorEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeIPv6TranslatorEntries", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeIPv6TranslatorEntriesResponse());
    }

    public DescribeIPv6TranslatorEntriesResponse describeIPv6TranslatorEntries(DescribeIPv6TranslatorEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIPv6TranslatorEntriesWithOptions(request, runtime);
    }

    public DeleteIPv6TranslatorResponse deleteIPv6TranslatorWithOptions(DeleteIPv6TranslatorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteIPv6Translator", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteIPv6TranslatorResponse());
    }

    public DeleteIPv6TranslatorResponse deleteIPv6Translator(DeleteIPv6TranslatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIPv6TranslatorWithOptions(request, runtime);
    }

    public AllocateEipAddressProResponse allocateEipAddressProWithOptions(AllocateEipAddressProRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AllocateEipAddressPro", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new AllocateEipAddressProResponse());
    }

    public AllocateEipAddressProResponse allocateEipAddressPro(AllocateEipAddressProRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateEipAddressProWithOptions(request, runtime);
    }

    public DescribeHighDefinitionMonitorLogAttributeResponse describeHighDefinitionMonitorLogAttributeWithOptions(DescribeHighDefinitionMonitorLogAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeHighDefinitionMonitorLogAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeHighDefinitionMonitorLogAttributeResponse());
    }

    public DescribeHighDefinitionMonitorLogAttributeResponse describeHighDefinitionMonitorLogAttribute(DescribeHighDefinitionMonitorLogAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHighDefinitionMonitorLogAttributeWithOptions(request, runtime);
    }

    public ModifyFlowLogAttributeResponse modifyFlowLogAttributeWithOptions(ModifyFlowLogAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyFlowLogAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyFlowLogAttributeResponse());
    }

    public ModifyFlowLogAttributeResponse modifyFlowLogAttribute(ModifyFlowLogAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFlowLogAttributeWithOptions(request, runtime);
    }

    public DescribeFlowLogsResponse describeFlowLogsWithOptions(DescribeFlowLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeFlowLogs", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeFlowLogsResponse());
    }

    public DescribeFlowLogsResponse describeFlowLogs(DescribeFlowLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFlowLogsWithOptions(request, runtime);
    }

    public DeleteFlowLogResponse deleteFlowLogWithOptions(DeleteFlowLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteFlowLog", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteFlowLogResponse());
    }

    public DeleteFlowLogResponse deleteFlowLog(DeleteFlowLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFlowLogWithOptions(request, runtime);
    }

    public DeactiveFlowLogResponse deactiveFlowLogWithOptions(DeactiveFlowLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeactiveFlowLog", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeactiveFlowLogResponse());
    }

    public DeactiveFlowLogResponse deactiveFlowLog(DeactiveFlowLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deactiveFlowLogWithOptions(request, runtime);
    }

    public CreateFlowLogResponse createFlowLogWithOptions(CreateFlowLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateFlowLog", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateFlowLogResponse());
    }

    public CreateFlowLogResponse createFlowLog(CreateFlowLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFlowLogWithOptions(request, runtime);
    }

    public ActiveFlowLogResponse activeFlowLogWithOptions(ActiveFlowLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ActiveFlowLog", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ActiveFlowLogResponse());
    }

    public ActiveFlowLogResponse activeFlowLog(ActiveFlowLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activeFlowLogWithOptions(request, runtime);
    }

    public UnassociateRouteTableResponse unassociateRouteTableWithOptions(UnassociateRouteTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnassociateRouteTable", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new UnassociateRouteTableResponse());
    }

    public UnassociateRouteTableResponse unassociateRouteTable(UnassociateRouteTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassociateRouteTableWithOptions(request, runtime);
    }

    public DeleteRouteTableResponse deleteRouteTableWithOptions(DeleteRouteTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRouteTable", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRouteTableResponse());
    }

    public DeleteRouteTableResponse deleteRouteTable(DeleteRouteTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRouteTableWithOptions(request, runtime);
    }

    public CreateRouteTableResponse createRouteTableWithOptions(CreateRouteTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRouteTable", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateRouteTableResponse());
    }

    public CreateRouteTableResponse createRouteTable(CreateRouteTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRouteTableWithOptions(request, runtime);
    }

    public AssociateRouteTableResponse associateRouteTableWithOptions(AssociateRouteTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AssociateRouteTable", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new AssociateRouteTableResponse());
    }

    public AssociateRouteTableResponse associateRouteTable(AssociateRouteTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateRouteTableWithOptions(request, runtime);
    }

    public CreateVpnGatewayResponse createVpnGatewayWithOptions(CreateVpnGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateVpnGateway", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateVpnGatewayResponse());
    }

    public CreateVpnGatewayResponse createVpnGateway(CreateVpnGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpnGatewayWithOptions(request, runtime);
    }

    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("MoveResourceGroup", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new MoveResourceGroupResponse());
    }

    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    public RevokeInstanceFromCenResponse revokeInstanceFromCenWithOptions(RevokeInstanceFromCenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RevokeInstanceFromCen", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new RevokeInstanceFromCenResponse());
    }

    public RevokeInstanceFromCenResponse revokeInstanceFromCen(RevokeInstanceFromCenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeInstanceFromCenWithOptions(request, runtime);
    }

    public GrantInstanceToCenResponse grantInstanceToCenWithOptions(GrantInstanceToCenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GrantInstanceToCen", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new GrantInstanceToCenResponse());
    }

    public GrantInstanceToCenResponse grantInstanceToCen(GrantInstanceToCenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantInstanceToCenWithOptions(request, runtime);
    }

    public DescribeGrantRulesToCenResponse describeGrantRulesToCenWithOptions(DescribeGrantRulesToCenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGrantRulesToCen", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGrantRulesToCenResponse());
    }

    public DescribeGrantRulesToCenResponse describeGrantRulesToCen(DescribeGrantRulesToCenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGrantRulesToCenWithOptions(request, runtime);
    }

    public ModifySslVpnServerResponse modifySslVpnServerWithOptions(ModifySslVpnServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifySslVpnServer", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifySslVpnServerResponse());
    }

    public ModifySslVpnServerResponse modifySslVpnServer(ModifySslVpnServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySslVpnServerWithOptions(request, runtime);
    }

    public ModifySslVpnClientCertResponse modifySslVpnClientCertWithOptions(ModifySslVpnClientCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifySslVpnClientCert", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifySslVpnClientCertResponse());
    }

    public ModifySslVpnClientCertResponse modifySslVpnClientCert(ModifySslVpnClientCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySslVpnClientCertWithOptions(request, runtime);
    }

    public DescribeSslVpnServersResponse describeSslVpnServersWithOptions(DescribeSslVpnServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSslVpnServers", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSslVpnServersResponse());
    }

    public DescribeSslVpnServersResponse describeSslVpnServers(DescribeSslVpnServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSslVpnServersWithOptions(request, runtime);
    }

    public DescribeSslVpnClientCertsResponse describeSslVpnClientCertsWithOptions(DescribeSslVpnClientCertsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSslVpnClientCerts", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSslVpnClientCertsResponse());
    }

    public DescribeSslVpnClientCertsResponse describeSslVpnClientCerts(DescribeSslVpnClientCertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSslVpnClientCertsWithOptions(request, runtime);
    }

    public DescribeSslVpnClientCertResponse describeSslVpnClientCertWithOptions(DescribeSslVpnClientCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSslVpnClientCert", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSslVpnClientCertResponse());
    }

    public DescribeSslVpnClientCertResponse describeSslVpnClientCert(DescribeSslVpnClientCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSslVpnClientCertWithOptions(request, runtime);
    }

    public DeleteSslVpnServerResponse deleteSslVpnServerWithOptions(DeleteSslVpnServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSslVpnServer", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteSslVpnServerResponse());
    }

    public DeleteSslVpnServerResponse deleteSslVpnServer(DeleteSslVpnServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSslVpnServerWithOptions(request, runtime);
    }

    public DeleteSslVpnClientCertResponse deleteSslVpnClientCertWithOptions(DeleteSslVpnClientCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSslVpnClientCert", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteSslVpnClientCertResponse());
    }

    public DeleteSslVpnClientCertResponse deleteSslVpnClientCert(DeleteSslVpnClientCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSslVpnClientCertWithOptions(request, runtime);
    }

    public CreateSslVpnServerResponse createSslVpnServerWithOptions(CreateSslVpnServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateSslVpnServer", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateSslVpnServerResponse());
    }

    public CreateSslVpnServerResponse createSslVpnServer(CreateSslVpnServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSslVpnServerWithOptions(request, runtime);
    }

    public CreateSslVpnClientCertResponse createSslVpnClientCertWithOptions(CreateSslVpnClientCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateSslVpnClientCert", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateSslVpnClientCertResponse());
    }

    public CreateSslVpnClientCertResponse createSslVpnClientCert(CreateSslVpnClientCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSslVpnClientCertWithOptions(request, runtime);
    }

    public RemoveGlobalAccelerationInstanceIpResponse removeGlobalAccelerationInstanceIpWithOptions(RemoveGlobalAccelerationInstanceIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveGlobalAccelerationInstanceIp", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new RemoveGlobalAccelerationInstanceIpResponse());
    }

    public RemoveGlobalAccelerationInstanceIpResponse removeGlobalAccelerationInstanceIp(RemoveGlobalAccelerationInstanceIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeGlobalAccelerationInstanceIpWithOptions(request, runtime);
    }

    public AddGlobalAccelerationInstanceIpResponse addGlobalAccelerationInstanceIpWithOptions(AddGlobalAccelerationInstanceIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddGlobalAccelerationInstanceIp", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new AddGlobalAccelerationInstanceIpResponse());
    }

    public AddGlobalAccelerationInstanceIpResponse addGlobalAccelerationInstanceIp(AddGlobalAccelerationInstanceIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGlobalAccelerationInstanceIpWithOptions(request, runtime);
    }

    public DescribeRouteTableListResponse describeRouteTableListWithOptions(DescribeRouteTableListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRouteTableList", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRouteTableListResponse());
    }

    public DescribeRouteTableListResponse describeRouteTableList(DescribeRouteTableListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRouteTableListWithOptions(request, runtime);
    }

    public ModifyRouteTableAttributesResponse modifyRouteTableAttributesWithOptions(ModifyRouteTableAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyRouteTableAttributes", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyRouteTableAttributesResponse());
    }

    public ModifyRouteTableAttributesResponse modifyRouteTableAttributes(ModifyRouteTableAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRouteTableAttributesWithOptions(request, runtime);
    }

    public DescribeBgpNetworksResponse describeBgpNetworksWithOptions(DescribeBgpNetworksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBgpNetworks", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBgpNetworksResponse());
    }

    public DescribeBgpNetworksResponse describeBgpNetworks(DescribeBgpNetworksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBgpNetworksWithOptions(request, runtime);
    }

    public ModifyCommonBandwidthPackagePayTypeResponse modifyCommonBandwidthPackagePayTypeWithOptions(ModifyCommonBandwidthPackagePayTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyCommonBandwidthPackagePayType", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyCommonBandwidthPackagePayTypeResponse());
    }

    public ModifyCommonBandwidthPackagePayTypeResponse modifyCommonBandwidthPackagePayType(ModifyCommonBandwidthPackagePayTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCommonBandwidthPackagePayTypeWithOptions(request, runtime);
    }

    public UnassociateGlobalAccelerationInstanceResponse unassociateGlobalAccelerationInstanceWithOptions(UnassociateGlobalAccelerationInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnassociateGlobalAccelerationInstance", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new UnassociateGlobalAccelerationInstanceResponse());
    }

    public UnassociateGlobalAccelerationInstanceResponse unassociateGlobalAccelerationInstance(UnassociateGlobalAccelerationInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassociateGlobalAccelerationInstanceWithOptions(request, runtime);
    }

    public ModifyGlobalAccelerationInstanceSpecResponse modifyGlobalAccelerationInstanceSpecWithOptions(ModifyGlobalAccelerationInstanceSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyGlobalAccelerationInstanceSpec", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyGlobalAccelerationInstanceSpecResponse());
    }

    public ModifyGlobalAccelerationInstanceSpecResponse modifyGlobalAccelerationInstanceSpec(ModifyGlobalAccelerationInstanceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGlobalAccelerationInstanceSpecWithOptions(request, runtime);
    }

    public ModifyGlobalAccelerationInstanceAttributesResponse modifyGlobalAccelerationInstanceAttributesWithOptions(ModifyGlobalAccelerationInstanceAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyGlobalAccelerationInstanceAttributes", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyGlobalAccelerationInstanceAttributesResponse());
    }

    public ModifyGlobalAccelerationInstanceAttributesResponse modifyGlobalAccelerationInstanceAttributes(ModifyGlobalAccelerationInstanceAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGlobalAccelerationInstanceAttributesWithOptions(request, runtime);
    }

    public DescribeServerRelatedGlobalAccelerationInstancesResponse describeServerRelatedGlobalAccelerationInstancesWithOptions(DescribeServerRelatedGlobalAccelerationInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeServerRelatedGlobalAccelerationInstances", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeServerRelatedGlobalAccelerationInstancesResponse());
    }

    public DescribeServerRelatedGlobalAccelerationInstancesResponse describeServerRelatedGlobalAccelerationInstances(DescribeServerRelatedGlobalAccelerationInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServerRelatedGlobalAccelerationInstancesWithOptions(request, runtime);
    }

    public DescribeGlobalAccelerationInstancesResponse describeGlobalAccelerationInstancesWithOptions(DescribeGlobalAccelerationInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGlobalAccelerationInstances", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGlobalAccelerationInstancesResponse());
    }

    public DescribeGlobalAccelerationInstancesResponse describeGlobalAccelerationInstances(DescribeGlobalAccelerationInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGlobalAccelerationInstancesWithOptions(request, runtime);
    }

    public DeleteGlobalAccelerationInstanceResponse deleteGlobalAccelerationInstanceWithOptions(DeleteGlobalAccelerationInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteGlobalAccelerationInstance", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteGlobalAccelerationInstanceResponse());
    }

    public DeleteGlobalAccelerationInstanceResponse deleteGlobalAccelerationInstance(DeleteGlobalAccelerationInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGlobalAccelerationInstanceWithOptions(request, runtime);
    }

    public CreateGlobalAccelerationInstanceResponse createGlobalAccelerationInstanceWithOptions(CreateGlobalAccelerationInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateGlobalAccelerationInstance", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateGlobalAccelerationInstanceResponse());
    }

    public CreateGlobalAccelerationInstanceResponse createGlobalAccelerationInstance(CreateGlobalAccelerationInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGlobalAccelerationInstanceWithOptions(request, runtime);
    }

    public AssociateGlobalAccelerationInstanceResponse associateGlobalAccelerationInstanceWithOptions(AssociateGlobalAccelerationInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AssociateGlobalAccelerationInstance", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new AssociateGlobalAccelerationInstanceResponse());
    }

    public AssociateGlobalAccelerationInstanceResponse associateGlobalAccelerationInstance(AssociateGlobalAccelerationInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateGlobalAccelerationInstanceWithOptions(request, runtime);
    }

    public DescribeVSwitchAttributesResponse describeVSwitchAttributesWithOptions(DescribeVSwitchAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVSwitchAttributes", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVSwitchAttributesResponse());
    }

    public DescribeVSwitchAttributesResponse describeVSwitchAttributes(DescribeVSwitchAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVSwitchAttributesWithOptions(request, runtime);
    }

    public RemoveCommonBandwidthPackageIpResponse removeCommonBandwidthPackageIpWithOptions(RemoveCommonBandwidthPackageIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveCommonBandwidthPackageIp", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new RemoveCommonBandwidthPackageIpResponse());
    }

    public RemoveCommonBandwidthPackageIpResponse removeCommonBandwidthPackageIp(RemoveCommonBandwidthPackageIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeCommonBandwidthPackageIpWithOptions(request, runtime);
    }

    public ModifyCommonBandwidthPackageSpecResponse modifyCommonBandwidthPackageSpecWithOptions(ModifyCommonBandwidthPackageSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyCommonBandwidthPackageSpec", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyCommonBandwidthPackageSpecResponse());
    }

    public ModifyCommonBandwidthPackageSpecResponse modifyCommonBandwidthPackageSpec(ModifyCommonBandwidthPackageSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCommonBandwidthPackageSpecWithOptions(request, runtime);
    }

    public ModifyCommonBandwidthPackageAttributeResponse modifyCommonBandwidthPackageAttributeWithOptions(ModifyCommonBandwidthPackageAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyCommonBandwidthPackageAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyCommonBandwidthPackageAttributeResponse());
    }

    public ModifyCommonBandwidthPackageAttributeResponse modifyCommonBandwidthPackageAttribute(ModifyCommonBandwidthPackageAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCommonBandwidthPackageAttributeWithOptions(request, runtime);
    }

    public DescribeCommonBandwidthPackagesResponse describeCommonBandwidthPackagesWithOptions(DescribeCommonBandwidthPackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCommonBandwidthPackages", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCommonBandwidthPackagesResponse());
    }

    public DescribeCommonBandwidthPackagesResponse describeCommonBandwidthPackages(DescribeCommonBandwidthPackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCommonBandwidthPackagesWithOptions(request, runtime);
    }

    public DeleteCommonBandwidthPackageResponse deleteCommonBandwidthPackageWithOptions(DeleteCommonBandwidthPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCommonBandwidthPackage", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteCommonBandwidthPackageResponse());
    }

    public DeleteCommonBandwidthPackageResponse deleteCommonBandwidthPackage(DeleteCommonBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCommonBandwidthPackageWithOptions(request, runtime);
    }

    public CreateCommonBandwidthPackageResponse createCommonBandwidthPackageWithOptions(CreateCommonBandwidthPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateCommonBandwidthPackage", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateCommonBandwidthPackageResponse());
    }

    public CreateCommonBandwidthPackageResponse createCommonBandwidthPackage(CreateCommonBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCommonBandwidthPackageWithOptions(request, runtime);
    }

    public AddCommonBandwidthPackageIpResponse addCommonBandwidthPackageIpWithOptions(AddCommonBandwidthPackageIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddCommonBandwidthPackageIp", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new AddCommonBandwidthPackageIpResponse());
    }

    public AddCommonBandwidthPackageIpResponse addCommonBandwidthPackageIp(AddCommonBandwidthPackageIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCommonBandwidthPackageIpWithOptions(request, runtime);
    }

    public ModifyVpnGatewayAttributeResponse modifyVpnGatewayAttributeWithOptions(ModifyVpnGatewayAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyVpnGatewayAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyVpnGatewayAttributeResponse());
    }

    public ModifyVpnGatewayAttributeResponse modifyVpnGatewayAttribute(ModifyVpnGatewayAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpnGatewayAttributeWithOptions(request, runtime);
    }

    public ModifyVpnConnectionAttributeResponse modifyVpnConnectionAttributeWithOptions(ModifyVpnConnectionAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyVpnConnectionAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyVpnConnectionAttributeResponse());
    }

    public ModifyVpnConnectionAttributeResponse modifyVpnConnectionAttribute(ModifyVpnConnectionAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpnConnectionAttributeWithOptions(request, runtime);
    }

    public ModifyCustomerGatewayAttributeResponse modifyCustomerGatewayAttributeWithOptions(ModifyCustomerGatewayAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyCustomerGatewayAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyCustomerGatewayAttributeResponse());
    }

    public ModifyCustomerGatewayAttributeResponse modifyCustomerGatewayAttribute(ModifyCustomerGatewayAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCustomerGatewayAttributeWithOptions(request, runtime);
    }

    public DownloadVpnConnectionConfigResponse downloadVpnConnectionConfigWithOptions(DownloadVpnConnectionConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DownloadVpnConnectionConfig", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DownloadVpnConnectionConfigResponse());
    }

    public DownloadVpnConnectionConfigResponse downloadVpnConnectionConfig(DownloadVpnConnectionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadVpnConnectionConfigWithOptions(request, runtime);
    }

    public DescribeVpnGatewaysResponse describeVpnGatewaysWithOptions(DescribeVpnGatewaysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVpnGateways", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVpnGatewaysResponse());
    }

    public DescribeVpnGatewaysResponse describeVpnGateways(DescribeVpnGatewaysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpnGatewaysWithOptions(request, runtime);
    }

    public DescribeVpnGatewayResponse describeVpnGatewayWithOptions(DescribeVpnGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVpnGateway", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVpnGatewayResponse());
    }

    public DescribeVpnGatewayResponse describeVpnGateway(DescribeVpnGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpnGatewayWithOptions(request, runtime);
    }

    public DescribeVpnConnectionsResponse describeVpnConnectionsWithOptions(DescribeVpnConnectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVpnConnections", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVpnConnectionsResponse());
    }

    public DescribeVpnConnectionsResponse describeVpnConnections(DescribeVpnConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpnConnectionsWithOptions(request, runtime);
    }

    public DescribeVpnConnectionResponse describeVpnConnectionWithOptions(DescribeVpnConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVpnConnection", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVpnConnectionResponse());
    }

    public DescribeVpnConnectionResponse describeVpnConnection(DescribeVpnConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpnConnectionWithOptions(request, runtime);
    }

    public DescribeCustomerGatewaysResponse describeCustomerGatewaysWithOptions(DescribeCustomerGatewaysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCustomerGateways", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCustomerGatewaysResponse());
    }

    public DescribeCustomerGatewaysResponse describeCustomerGateways(DescribeCustomerGatewaysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomerGatewaysWithOptions(request, runtime);
    }

    public DescribeCustomerGatewayResponse describeCustomerGatewayWithOptions(DescribeCustomerGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCustomerGateway", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCustomerGatewayResponse());
    }

    public DescribeCustomerGatewayResponse describeCustomerGateway(DescribeCustomerGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomerGatewayWithOptions(request, runtime);
    }

    public DeleteVpnGatewayResponse deleteVpnGatewayWithOptions(DeleteVpnGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVpnGateway", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteVpnGatewayResponse());
    }

    public DeleteVpnGatewayResponse deleteVpnGateway(DeleteVpnGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVpnGatewayWithOptions(request, runtime);
    }

    public DeleteVpnConnectionResponse deleteVpnConnectionWithOptions(DeleteVpnConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVpnConnection", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteVpnConnectionResponse());
    }

    public DeleteVpnConnectionResponse deleteVpnConnection(DeleteVpnConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVpnConnectionWithOptions(request, runtime);
    }

    public DeleteCustomerGatewayResponse deleteCustomerGatewayWithOptions(DeleteCustomerGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCustomerGateway", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteCustomerGatewayResponse());
    }

    public DeleteCustomerGatewayResponse deleteCustomerGateway(DeleteCustomerGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomerGatewayWithOptions(request, runtime);
    }

    public CreateVpnConnectionResponse createVpnConnectionWithOptions(CreateVpnConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateVpnConnection", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateVpnConnectionResponse());
    }

    public CreateVpnConnectionResponse createVpnConnection(CreateVpnConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpnConnectionWithOptions(request, runtime);
    }

    public CreateCustomerGatewayResponse createCustomerGatewayWithOptions(CreateCustomerGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateCustomerGateway", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateCustomerGatewayResponse());
    }

    public CreateCustomerGatewayResponse createCustomerGateway(CreateCustomerGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomerGatewayWithOptions(request, runtime);
    }

    public ModifyBgpGroupAttributeResponse modifyBgpGroupAttributeWithOptions(ModifyBgpGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyBgpGroupAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyBgpGroupAttributeResponse());
    }

    public ModifyBgpGroupAttributeResponse modifyBgpGroupAttribute(ModifyBgpGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBgpGroupAttributeWithOptions(request, runtime);
    }

    public DescribeBgpPeersResponse describeBgpPeersWithOptions(DescribeBgpPeersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBgpPeers", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBgpPeersResponse());
    }

    public DescribeBgpPeersResponse describeBgpPeers(DescribeBgpPeersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBgpPeersWithOptions(request, runtime);
    }

    public DescribeBgpGroupsResponse describeBgpGroupsWithOptions(DescribeBgpGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBgpGroups", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBgpGroupsResponse());
    }

    public DescribeBgpGroupsResponse describeBgpGroups(DescribeBgpGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBgpGroupsWithOptions(request, runtime);
    }

    public DeleteBgpPeerResponse deleteBgpPeerWithOptions(DeleteBgpPeerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteBgpPeer", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteBgpPeerResponse());
    }

    public DeleteBgpPeerResponse deleteBgpPeer(DeleteBgpPeerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBgpPeerWithOptions(request, runtime);
    }

    public DeleteBgpNetworkResponse deleteBgpNetworkWithOptions(DeleteBgpNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteBgpNetwork", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteBgpNetworkResponse());
    }

    public DeleteBgpNetworkResponse deleteBgpNetwork(DeleteBgpNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBgpNetworkWithOptions(request, runtime);
    }

    public DeleteBgpGroupResponse deleteBgpGroupWithOptions(DeleteBgpGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteBgpGroup", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteBgpGroupResponse());
    }

    public DeleteBgpGroupResponse deleteBgpGroup(DeleteBgpGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBgpGroupWithOptions(request, runtime);
    }

    public CreateBgpPeerResponse createBgpPeerWithOptions(CreateBgpPeerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateBgpPeer", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateBgpPeerResponse());
    }

    public CreateBgpPeerResponse createBgpPeer(CreateBgpPeerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBgpPeerWithOptions(request, runtime);
    }

    public CreateBgpGroupResponse createBgpGroupWithOptions(CreateBgpGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateBgpGroup", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateBgpGroupResponse());
    }

    public CreateBgpGroupResponse createBgpGroup(CreateBgpGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBgpGroupWithOptions(request, runtime);
    }

    public AddBgpNetworkResponse addBgpNetworkWithOptions(AddBgpNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddBgpNetwork", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new AddBgpNetworkResponse());
    }

    public AddBgpNetworkResponse addBgpNetwork(AddBgpNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBgpNetworkWithOptions(request, runtime);
    }

    public EnableVpcClassicLinkResponse enableVpcClassicLinkWithOptions(EnableVpcClassicLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableVpcClassicLink", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new EnableVpcClassicLinkResponse());
    }

    public EnableVpcClassicLinkResponse enableVpcClassicLink(EnableVpcClassicLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableVpcClassicLinkWithOptions(request, runtime);
    }

    public DisableVpcClassicLinkResponse disableVpcClassicLinkWithOptions(DisableVpcClassicLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisableVpcClassicLink", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DisableVpcClassicLinkResponse());
    }

    public DisableVpcClassicLinkResponse disableVpcClassicLink(DisableVpcClassicLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableVpcClassicLinkWithOptions(request, runtime);
    }

    public DescribeVpcAttributeResponse describeVpcAttributeWithOptions(DescribeVpcAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVpcAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVpcAttributeResponse());
    }

    public DescribeVpcAttributeResponse describeVpcAttribute(DescribeVpcAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcAttributeWithOptions(request, runtime);
    }

    public UnassociatePhysicalConnectionFromVirtualBorderRouterResponse unassociatePhysicalConnectionFromVirtualBorderRouterWithOptions(UnassociatePhysicalConnectionFromVirtualBorderRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnassociatePhysicalConnectionFromVirtualBorderRouter", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new UnassociatePhysicalConnectionFromVirtualBorderRouterResponse());
    }

    public UnassociatePhysicalConnectionFromVirtualBorderRouterResponse unassociatePhysicalConnectionFromVirtualBorderRouter(UnassociatePhysicalConnectionFromVirtualBorderRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassociatePhysicalConnectionFromVirtualBorderRouterWithOptions(request, runtime);
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterResponse associatePhysicalConnectionToVirtualBorderRouterWithOptions(AssociatePhysicalConnectionToVirtualBorderRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AssociatePhysicalConnectionToVirtualBorderRouter", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new AssociatePhysicalConnectionToVirtualBorderRouterResponse());
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterResponse associatePhysicalConnectionToVirtualBorderRouter(AssociatePhysicalConnectionToVirtualBorderRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associatePhysicalConnectionToVirtualBorderRouterWithOptions(request, runtime);
    }

    public ModifySnatEntryResponse modifySnatEntryWithOptions(ModifySnatEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifySnatEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifySnatEntryResponse());
    }

    public ModifySnatEntryResponse modifySnatEntry(ModifySnatEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySnatEntryWithOptions(request, runtime);
    }

    public ModifyNatGatewaySpecResponse modifyNatGatewaySpecWithOptions(ModifyNatGatewaySpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyNatGatewaySpec", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyNatGatewaySpecResponse());
    }

    public ModifyNatGatewaySpecResponse modifyNatGatewaySpec(ModifyNatGatewaySpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNatGatewaySpecWithOptions(request, runtime);
    }

    public ModifyNatGatewayAttributeResponse modifyNatGatewayAttributeWithOptions(ModifyNatGatewayAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyNatGatewayAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyNatGatewayAttributeResponse());
    }

    public ModifyNatGatewayAttributeResponse modifyNatGatewayAttribute(ModifyNatGatewayAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNatGatewayAttributeWithOptions(request, runtime);
    }

    public ModifyBandwidthPackageAttributeResponse modifyBandwidthPackageAttributeWithOptions(ModifyBandwidthPackageAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyBandwidthPackageAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyBandwidthPackageAttributeResponse());
    }

    public ModifyBandwidthPackageAttributeResponse modifyBandwidthPackageAttribute(ModifyBandwidthPackageAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBandwidthPackageAttributeWithOptions(request, runtime);
    }

    public DescribeSnatTableEntriesResponse describeSnatTableEntriesWithOptions(DescribeSnatTableEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSnatTableEntries", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSnatTableEntriesResponse());
    }

    public DescribeSnatTableEntriesResponse describeSnatTableEntries(DescribeSnatTableEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSnatTableEntriesWithOptions(request, runtime);
    }

    public DeleteSnatEntryResponse deleteSnatEntryWithOptions(DeleteSnatEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSnatEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteSnatEntryResponse());
    }

    public DeleteSnatEntryResponse deleteSnatEntry(DeleteSnatEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSnatEntryWithOptions(request, runtime);
    }

    public CreateSnatEntryResponse createSnatEntryWithOptions(CreateSnatEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateSnatEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateSnatEntryResponse());
    }

    public CreateSnatEntryResponse createSnatEntry(CreateSnatEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSnatEntryWithOptions(request, runtime);
    }

    public CreateBandwidthPackageResponse createBandwidthPackageWithOptions(CreateBandwidthPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateBandwidthPackage", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateBandwidthPackageResponse());
    }

    public CreateBandwidthPackageResponse createBandwidthPackage(CreateBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBandwidthPackageWithOptions(request, runtime);
    }

    public UnassociateHaVipResponse unassociateHaVipWithOptions(UnassociateHaVipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnassociateHaVip", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new UnassociateHaVipResponse());
    }

    public UnassociateHaVipResponse unassociateHaVip(UnassociateHaVipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassociateHaVipWithOptions(request, runtime);
    }

    public UnassociateEipAddressResponse unassociateEipAddressWithOptions(UnassociateEipAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnassociateEipAddress", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new UnassociateEipAddressResponse());
    }

    public UnassociateEipAddressResponse unassociateEipAddress(UnassociateEipAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassociateEipAddressWithOptions(request, runtime);
    }

    public TerminateVirtualBorderRouterResponse terminateVirtualBorderRouterWithOptions(TerminateVirtualBorderRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TerminateVirtualBorderRouter", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new TerminateVirtualBorderRouterResponse());
    }

    public TerminateVirtualBorderRouterResponse terminateVirtualBorderRouter(TerminateVirtualBorderRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.terminateVirtualBorderRouterWithOptions(request, runtime);
    }

    public TerminatePhysicalConnectionResponse terminatePhysicalConnectionWithOptions(TerminatePhysicalConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TerminatePhysicalConnection", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new TerminatePhysicalConnectionResponse());
    }

    public TerminatePhysicalConnectionResponse terminatePhysicalConnection(TerminatePhysicalConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.terminatePhysicalConnectionWithOptions(request, runtime);
    }

    public RemoveBandwidthPackageIpsResponse removeBandwidthPackageIpsWithOptions(RemoveBandwidthPackageIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveBandwidthPackageIps", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new RemoveBandwidthPackageIpsResponse());
    }

    public RemoveBandwidthPackageIpsResponse removeBandwidthPackageIps(RemoveBandwidthPackageIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeBandwidthPackageIpsWithOptions(request, runtime);
    }

    public ReleaseEipAddressResponse releaseEipAddressWithOptions(ReleaseEipAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleaseEipAddress", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ReleaseEipAddressResponse());
    }

    public ReleaseEipAddressResponse releaseEipAddress(ReleaseEipAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseEipAddressWithOptions(request, runtime);
    }

    public RecoverVirtualBorderRouterResponse recoverVirtualBorderRouterWithOptions(RecoverVirtualBorderRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RecoverVirtualBorderRouter", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new RecoverVirtualBorderRouterResponse());
    }

    public RecoverVirtualBorderRouterResponse recoverVirtualBorderRouter(RecoverVirtualBorderRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recoverVirtualBorderRouterWithOptions(request, runtime);
    }

    public ModifyVSwitchAttributeResponse modifyVSwitchAttributeWithOptions(ModifyVSwitchAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyVSwitchAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyVSwitchAttributeResponse());
    }

    public ModifyVSwitchAttributeResponse modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVSwitchAttributeWithOptions(request, runtime);
    }

    public ModifyVRouterAttributeResponse modifyVRouterAttributeWithOptions(ModifyVRouterAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyVRouterAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyVRouterAttributeResponse());
    }

    public ModifyVRouterAttributeResponse modifyVRouterAttribute(ModifyVRouterAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVRouterAttributeWithOptions(request, runtime);
    }

    public ModifyVpcAttributeResponse modifyVpcAttributeWithOptions(ModifyVpcAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyVpcAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyVpcAttributeResponse());
    }

    public ModifyVpcAttributeResponse modifyVpcAttribute(ModifyVpcAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpcAttributeWithOptions(request, runtime);
    }

    public ModifyVirtualBorderRouterAttributeResponse modifyVirtualBorderRouterAttributeWithOptions(ModifyVirtualBorderRouterAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyVirtualBorderRouterAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyVirtualBorderRouterAttributeResponse());
    }

    public ModifyVirtualBorderRouterAttributeResponse modifyVirtualBorderRouterAttribute(ModifyVirtualBorderRouterAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVirtualBorderRouterAttributeWithOptions(request, runtime);
    }

    public ModifyRouterInterfaceSpecResponse modifyRouterInterfaceSpecWithOptions(ModifyRouterInterfaceSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyRouterInterfaceSpec", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyRouterInterfaceSpecResponse());
    }

    public ModifyRouterInterfaceSpecResponse modifyRouterInterfaceSpec(ModifyRouterInterfaceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRouterInterfaceSpecWithOptions(request, runtime);
    }

    public ModifyRouterInterfaceAttributeResponse modifyRouterInterfaceAttributeWithOptions(ModifyRouterInterfaceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyRouterInterfaceAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyRouterInterfaceAttributeResponse());
    }

    public ModifyRouterInterfaceAttributeResponse modifyRouterInterfaceAttribute(ModifyRouterInterfaceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRouterInterfaceAttributeWithOptions(request, runtime);
    }

    public ModifyPhysicalConnectionAttributeResponse modifyPhysicalConnectionAttributeWithOptions(ModifyPhysicalConnectionAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyPhysicalConnectionAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyPhysicalConnectionAttributeResponse());
    }

    public ModifyPhysicalConnectionAttributeResponse modifyPhysicalConnectionAttribute(ModifyPhysicalConnectionAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPhysicalConnectionAttributeWithOptions(request, runtime);
    }

    public ModifyHaVipAttributeResponse modifyHaVipAttributeWithOptions(ModifyHaVipAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyHaVipAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyHaVipAttributeResponse());
    }

    public ModifyHaVipAttributeResponse modifyHaVipAttribute(ModifyHaVipAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHaVipAttributeWithOptions(request, runtime);
    }

    public ModifyForwardEntryResponse modifyForwardEntryWithOptions(ModifyForwardEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyForwardEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyForwardEntryResponse());
    }

    public ModifyForwardEntryResponse modifyForwardEntry(ModifyForwardEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyForwardEntryWithOptions(request, runtime);
    }

    public ModifyEipAddressAttributeResponse modifyEipAddressAttributeWithOptions(ModifyEipAddressAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyEipAddressAttribute", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyEipAddressAttributeResponse());
    }

    public ModifyEipAddressAttributeResponse modifyEipAddressAttribute(ModifyEipAddressAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEipAddressAttributeWithOptions(request, runtime);
    }

    public ModifyBandwidthPackageSpecResponse modifyBandwidthPackageSpecWithOptions(ModifyBandwidthPackageSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyBandwidthPackageSpec", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ModifyBandwidthPackageSpecResponse());
    }

    public ModifyBandwidthPackageSpecResponse modifyBandwidthPackageSpec(ModifyBandwidthPackageSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBandwidthPackageSpecWithOptions(request, runtime);
    }

    public EnablePhysicalConnectionResponse enablePhysicalConnectionWithOptions(EnablePhysicalConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnablePhysicalConnection", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new EnablePhysicalConnectionResponse());
    }

    public EnablePhysicalConnectionResponse enablePhysicalConnection(EnablePhysicalConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enablePhysicalConnectionWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeZones", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    public DescribeVSwitchesResponse describeVSwitchesWithOptions(DescribeVSwitchesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVSwitches", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVSwitchesResponse());
    }

    public DescribeVSwitchesResponse describeVSwitches(DescribeVSwitchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVSwitchesWithOptions(request, runtime);
    }

    public DescribeVRoutersResponse describeVRoutersWithOptions(DescribeVRoutersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVRouters", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVRoutersResponse());
    }

    public DescribeVRoutersResponse describeVRouters(DescribeVRoutersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVRoutersWithOptions(request, runtime);
    }

    public DescribeVpcsResponse describeVpcsWithOptions(DescribeVpcsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVpcs", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVpcsResponse());
    }

    public DescribeVpcsResponse describeVpcs(DescribeVpcsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcsWithOptions(request, runtime);
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse describeVirtualBorderRoutersForPhysicalConnectionWithOptions(DescribeVirtualBorderRoutersForPhysicalConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVirtualBorderRoutersForPhysicalConnection", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVirtualBorderRoutersForPhysicalConnectionResponse());
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse describeVirtualBorderRoutersForPhysicalConnection(DescribeVirtualBorderRoutersForPhysicalConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVirtualBorderRoutersForPhysicalConnectionWithOptions(request, runtime);
    }

    public DescribeVirtualBorderRoutersResponse describeVirtualBorderRoutersWithOptions(DescribeVirtualBorderRoutersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVirtualBorderRouters", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVirtualBorderRoutersResponse());
    }

    public DescribeVirtualBorderRoutersResponse describeVirtualBorderRouters(DescribeVirtualBorderRoutersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVirtualBorderRoutersWithOptions(request, runtime);
    }

    public DescribeRouteTablesResponse describeRouteTablesWithOptions(DescribeRouteTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRouteTables", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRouteTablesResponse());
    }

    public DescribeRouteTablesResponse describeRouteTables(DescribeRouteTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRouteTablesWithOptions(request, runtime);
    }

    public DescribeRouterInterfacesResponse describeRouterInterfacesWithOptions(DescribeRouterInterfacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRouterInterfaces", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRouterInterfacesResponse());
    }

    public DescribeRouterInterfacesResponse describeRouterInterfaces(DescribeRouterInterfacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRouterInterfacesWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRegions", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * DescribePhysicalConnections Query physical connections in a region.
      * request demo:   * https://vpc.aliyuncs.com/?Action=DescribePhysicalConnections
      * &RegionId=cn-hangzhou
      * &<CommonParameters>
      * description: 
     */
    public DescribePhysicalConnectionsResponse describePhysicalConnectionsWithOptions(DescribePhysicalConnectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePhysicalConnections", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribePhysicalConnectionsResponse());
    }

    /**
     * DescribePhysicalConnections Query physical connections in a region.
      * request demo:   * https://vpc.aliyuncs.com/?Action=DescribePhysicalConnections
      * &RegionId=cn-hangzhou
      * &<CommonParameters>
      * description: 
     */
    public DescribePhysicalConnectionsResponse describePhysicalConnections(DescribePhysicalConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePhysicalConnectionsWithOptions(request, runtime);
    }

    public DescribeNewProjectEipMonitorDataResponse describeNewProjectEipMonitorDataWithOptions(DescribeNewProjectEipMonitorDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeNewProjectEipMonitorData", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeNewProjectEipMonitorDataResponse());
    }

    public DescribeNewProjectEipMonitorDataResponse describeNewProjectEipMonitorData(DescribeNewProjectEipMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNewProjectEipMonitorDataWithOptions(request, runtime);
    }

    public DescribeNatGatewaysResponse describeNatGatewaysWithOptions(DescribeNatGatewaysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeNatGateways", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeNatGatewaysResponse());
    }

    public DescribeNatGatewaysResponse describeNatGateways(DescribeNatGatewaysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNatGatewaysWithOptions(request, runtime);
    }

    public DescribeHaVipsResponse describeHaVipsWithOptions(DescribeHaVipsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeHaVips", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeHaVipsResponse());
    }

    public DescribeHaVipsResponse describeHaVips(DescribeHaVipsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHaVipsWithOptions(request, runtime);
    }

    public DescribeForwardTableEntriesResponse describeForwardTableEntriesWithOptions(DescribeForwardTableEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeForwardTableEntries", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeForwardTableEntriesResponse());
    }

    public DescribeForwardTableEntriesResponse describeForwardTableEntries(DescribeForwardTableEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeForwardTableEntriesWithOptions(request, runtime);
    }

    public DescribeEipMonitorDataResponse describeEipMonitorDataWithOptions(DescribeEipMonitorDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEipMonitorData", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEipMonitorDataResponse());
    }

    public DescribeEipMonitorDataResponse describeEipMonitorData(DescribeEipMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEipMonitorDataWithOptions(request, runtime);
    }

    public DescribeEipAddressesResponse describeEipAddressesWithOptions(DescribeEipAddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEipAddresses", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEipAddressesResponse());
    }

    public DescribeEipAddressesResponse describeEipAddresses(DescribeEipAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEipAddressesWithOptions(request, runtime);
    }

    public DescribeBandwidthPackagesResponse describeBandwidthPackagesWithOptions(DescribeBandwidthPackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBandwidthPackages", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBandwidthPackagesResponse());
    }

    public DescribeBandwidthPackagesResponse describeBandwidthPackages(DescribeBandwidthPackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBandwidthPackagesWithOptions(request, runtime);
    }

    public DescribeAccessPointsResponse describeAccessPointsWithOptions(DescribeAccessPointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAccessPoints", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAccessPointsResponse());
    }

    public DescribeAccessPointsResponse describeAccessPoints(DescribeAccessPointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessPointsWithOptions(request, runtime);
    }

    public DeleteVSwitchResponse deleteVSwitchWithOptions(DeleteVSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVSwitch", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteVSwitchResponse());
    }

    public DeleteVSwitchResponse deleteVSwitch(DeleteVSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVSwitchWithOptions(request, runtime);
    }

    public DeleteVpcResponse deleteVpcWithOptions(DeleteVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVpc", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteVpcResponse());
    }

    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVpcWithOptions(request, runtime);
    }

    public DeleteVirtualBorderRouterResponse deleteVirtualBorderRouterWithOptions(DeleteVirtualBorderRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVirtualBorderRouter", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteVirtualBorderRouterResponse());
    }

    public DeleteVirtualBorderRouterResponse deleteVirtualBorderRouter(DeleteVirtualBorderRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVirtualBorderRouterWithOptions(request, runtime);
    }

    public DeleteRouterInterfaceResponse deleteRouterInterfaceWithOptions(DeleteRouterInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRouterInterface", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRouterInterfaceResponse());
    }

    public DeleteRouterInterfaceResponse deleteRouterInterface(DeleteRouterInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRouterInterfaceWithOptions(request, runtime);
    }

    public DeleteRouteEntryResponse deleteRouteEntryWithOptions(DeleteRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRouteEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRouteEntryResponse());
    }

    public DeleteRouteEntryResponse deleteRouteEntry(DeleteRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRouteEntryWithOptions(request, runtime);
    }

    public DeletePhysicalConnectionResponse deletePhysicalConnectionWithOptions(DeletePhysicalConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeletePhysicalConnection", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeletePhysicalConnectionResponse());
    }

    public DeletePhysicalConnectionResponse deletePhysicalConnection(DeletePhysicalConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePhysicalConnectionWithOptions(request, runtime);
    }

    public DeleteNatGatewayResponse deleteNatGatewayWithOptions(DeleteNatGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteNatGateway", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteNatGatewayResponse());
    }

    public DeleteNatGatewayResponse deleteNatGateway(DeleteNatGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNatGatewayWithOptions(request, runtime);
    }

    public DeleteHaVipResponse deleteHaVipWithOptions(DeleteHaVipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteHaVip", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteHaVipResponse());
    }

    public DeleteHaVipResponse deleteHaVip(DeleteHaVipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHaVipWithOptions(request, runtime);
    }

    public DeleteForwardEntryResponse deleteForwardEntryWithOptions(DeleteForwardEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteForwardEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteForwardEntryResponse());
    }

    public DeleteForwardEntryResponse deleteForwardEntry(DeleteForwardEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteForwardEntryWithOptions(request, runtime);
    }

    public DeleteBandwidthPackageResponse deleteBandwidthPackageWithOptions(DeleteBandwidthPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteBandwidthPackage", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteBandwidthPackageResponse());
    }

    public DeleteBandwidthPackageResponse deleteBandwidthPackage(DeleteBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBandwidthPackageWithOptions(request, runtime);
    }

    public DeactivateRouterInterfaceResponse deactivateRouterInterfaceWithOptions(DeactivateRouterInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeactivateRouterInterface", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new DeactivateRouterInterfaceResponse());
    }

    public DeactivateRouterInterfaceResponse deactivateRouterInterface(DeactivateRouterInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deactivateRouterInterfaceWithOptions(request, runtime);
    }

    public CreateVSwitchResponse createVSwitchWithOptions(CreateVSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateVSwitch", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateVSwitchResponse());
    }

    public CreateVSwitchResponse createVSwitch(CreateVSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVSwitchWithOptions(request, runtime);
    }

    public CreateVpcResponse createVpcWithOptions(CreateVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateVpc", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateVpcResponse());
    }

    public CreateVpcResponse createVpc(CreateVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpcWithOptions(request, runtime);
    }

    public CreateVirtualBorderRouterResponse createVirtualBorderRouterWithOptions(CreateVirtualBorderRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateVirtualBorderRouter", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateVirtualBorderRouterResponse());
    }

    public CreateVirtualBorderRouterResponse createVirtualBorderRouter(CreateVirtualBorderRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVirtualBorderRouterWithOptions(request, runtime);
    }

    public CreateRouterInterfaceResponse createRouterInterfaceWithOptions(CreateRouterInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRouterInterface", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateRouterInterfaceResponse());
    }

    public CreateRouterInterfaceResponse createRouterInterface(CreateRouterInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRouterInterfaceWithOptions(request, runtime);
    }

    public CreateRouteEntryResponse createRouteEntryWithOptions(CreateRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRouteEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateRouteEntryResponse());
    }

    public CreateRouteEntryResponse createRouteEntry(CreateRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRouteEntryWithOptions(request, runtime);
    }

    public CreatePhysicalConnectionResponse createPhysicalConnectionWithOptions(CreatePhysicalConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreatePhysicalConnection", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreatePhysicalConnectionResponse());
    }

    public CreatePhysicalConnectionResponse createPhysicalConnection(CreatePhysicalConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPhysicalConnectionWithOptions(request, runtime);
    }

    public CreateNatGatewayResponse createNatGatewayWithOptions(CreateNatGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateNatGateway", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateNatGatewayResponse());
    }

    public CreateNatGatewayResponse createNatGateway(CreateNatGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNatGatewayWithOptions(request, runtime);
    }

    public CreateHaVipResponse createHaVipWithOptions(CreateHaVipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateHaVip", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateHaVipResponse());
    }

    public CreateHaVipResponse createHaVip(CreateHaVipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHaVipWithOptions(request, runtime);
    }

    public CreateForwardEntryResponse createForwardEntryWithOptions(CreateForwardEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateForwardEntry", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateForwardEntryResponse());
    }

    public CreateForwardEntryResponse createForwardEntry(CreateForwardEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createForwardEntryWithOptions(request, runtime);
    }

    public ConnectRouterInterfaceResponse connectRouterInterfaceWithOptions(ConnectRouterInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ConnectRouterInterface", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ConnectRouterInterfaceResponse());
    }

    public ConnectRouterInterfaceResponse connectRouterInterface(ConnectRouterInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.connectRouterInterfaceWithOptions(request, runtime);
    }

    public CancelPhysicalConnectionResponse cancelPhysicalConnectionWithOptions(CancelPhysicalConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelPhysicalConnection", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new CancelPhysicalConnectionResponse());
    }

    public CancelPhysicalConnectionResponse cancelPhysicalConnection(CancelPhysicalConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelPhysicalConnectionWithOptions(request, runtime);
    }

    public AssociateHaVipResponse associateHaVipWithOptions(AssociateHaVipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AssociateHaVip", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new AssociateHaVipResponse());
    }

    public AssociateHaVipResponse associateHaVip(AssociateHaVipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateHaVipWithOptions(request, runtime);
    }

    public AssociateEipAddressResponse associateEipAddressWithOptions(AssociateEipAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AssociateEipAddress", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new AssociateEipAddressResponse());
    }

    public AssociateEipAddressResponse associateEipAddress(AssociateEipAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateEipAddressWithOptions(request, runtime);
    }

    public AllocateEipAddressResponse allocateEipAddressWithOptions(AllocateEipAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AllocateEipAddress", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new AllocateEipAddressResponse());
    }

    public AllocateEipAddressResponse allocateEipAddress(AllocateEipAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateEipAddressWithOptions(request, runtime);
    }

    public AddBandwidthPackageIpsResponse addBandwidthPackageIpsWithOptions(AddBandwidthPackageIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddBandwidthPackageIps", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new AddBandwidthPackageIpsResponse());
    }

    public AddBandwidthPackageIpsResponse addBandwidthPackageIps(AddBandwidthPackageIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBandwidthPackageIpsWithOptions(request, runtime);
    }

    public ActivateRouterInterfaceResponse activateRouterInterfaceWithOptions(ActivateRouterInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ActivateRouterInterface", "HTTPS", "POST", "2016-04-28", "AK", null, TeaModel.buildMap(request), runtime), new ActivateRouterInterfaceResponse());
    }

    public ActivateRouterInterfaceResponse activateRouterInterface(ActivateRouterInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activateRouterInterfaceWithOptions(request, runtime);
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
}

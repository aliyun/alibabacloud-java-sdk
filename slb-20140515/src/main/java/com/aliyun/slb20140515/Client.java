// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515;

import com.aliyun.tea.*;
import com.aliyun.slb20140515.models.*;
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
            new TeaPair("cn-qingdao", "slb.aliyuncs.com"),
            new TeaPair("cn-beijing", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "slb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "slb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "slb.aliyuncs.com"),
            new TeaPair("cn-hongkong", "slb.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "slb.aliyuncs.com"),
            new TeaPair("us-west-1", "slb.aliyuncs.com"),
            new TeaPair("us-east-1", "slb.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "slb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "slb.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "slb.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "slb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "slb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "slb.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "slb.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-edge-1", "slb.aliyuncs.com"),
            new TeaPair("cn-fujian", "slb.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "slb.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "slb.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "slb-api.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "slb.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "slb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "slb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "slb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-wuhan", "slb.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "slb.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "slb.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "slb.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "slb.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "slb.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("slb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddAccessControlListEntryResponse addAccessControlListEntryWithOptions(AddAccessControlListEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddAccessControlListEntry", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddAccessControlListEntryResponse());
    }

    public AddAccessControlListEntryResponse addAccessControlListEntry(AddAccessControlListEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAccessControlListEntryWithOptions(request, runtime);
    }

    public AddBackendServersResponse addBackendServersWithOptions(AddBackendServersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddBackendServers", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddBackendServersResponse());
    }

    public AddBackendServersResponse addBackendServers(AddBackendServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addBackendServersWithOptions(request, runtime);
    }

    public AddListenerWhiteListItemResponse addListenerWhiteListItemWithOptions(AddListenerWhiteListItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddListenerWhiteListItem", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddListenerWhiteListItemResponse());
    }

    public AddListenerWhiteListItemResponse addListenerWhiteListItem(AddListenerWhiteListItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addListenerWhiteListItemWithOptions(request, runtime);
    }

    public AddTagsResponse addTagsWithOptions(AddTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddTags", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddTagsResponse());
    }

    public AddTagsResponse addTags(AddTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTagsWithOptions(request, runtime);
    }

    public AddVServerGroupBackendServersResponse addVServerGroupBackendServersWithOptions(AddVServerGroupBackendServersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddVServerGroupBackendServers", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddVServerGroupBackendServersResponse());
    }

    public AddVServerGroupBackendServersResponse addVServerGroupBackendServers(AddVServerGroupBackendServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addVServerGroupBackendServersWithOptions(request, runtime);
    }

    public CreateAccessControlListResponse createAccessControlListWithOptions(CreateAccessControlListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAccessControlList", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAccessControlListResponse());
    }

    public CreateAccessControlListResponse createAccessControlList(CreateAccessControlListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAccessControlListWithOptions(request, runtime);
    }

    public CreateDomainExtensionResponse createDomainExtensionWithOptions(CreateDomainExtensionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDomainExtension", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDomainExtensionResponse());
    }

    public CreateDomainExtensionResponse createDomainExtension(CreateDomainExtensionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDomainExtensionWithOptions(request, runtime);
    }

    public CreateLoadBalancerResponse createLoadBalancerWithOptions(CreateLoadBalancerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLoadBalancer", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLoadBalancerResponse());
    }

    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoadBalancerWithOptions(request, runtime);
    }

    public CreateLoadBalancerHTTPListenerResponse createLoadBalancerHTTPListenerWithOptions(CreateLoadBalancerHTTPListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLoadBalancerHTTPListener", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLoadBalancerHTTPListenerResponse());
    }

    public CreateLoadBalancerHTTPListenerResponse createLoadBalancerHTTPListener(CreateLoadBalancerHTTPListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoadBalancerHTTPListenerWithOptions(request, runtime);
    }

    public CreateLoadBalancerHTTPSListenerResponse createLoadBalancerHTTPSListenerWithOptions(CreateLoadBalancerHTTPSListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLoadBalancerHTTPSListener", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLoadBalancerHTTPSListenerResponse());
    }

    public CreateLoadBalancerHTTPSListenerResponse createLoadBalancerHTTPSListener(CreateLoadBalancerHTTPSListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoadBalancerHTTPSListenerWithOptions(request, runtime);
    }

    public CreateLoadBalancerTCPListenerResponse createLoadBalancerTCPListenerWithOptions(CreateLoadBalancerTCPListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLoadBalancerTCPListener", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLoadBalancerTCPListenerResponse());
    }

    public CreateLoadBalancerTCPListenerResponse createLoadBalancerTCPListener(CreateLoadBalancerTCPListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoadBalancerTCPListenerWithOptions(request, runtime);
    }

    public CreateLoadBalancerUDPListenerResponse createLoadBalancerUDPListenerWithOptions(CreateLoadBalancerUDPListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLoadBalancerUDPListener", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLoadBalancerUDPListenerResponse());
    }

    public CreateLoadBalancerUDPListenerResponse createLoadBalancerUDPListener(CreateLoadBalancerUDPListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoadBalancerUDPListenerWithOptions(request, runtime);
    }

    public CreateMasterSlaveServerGroupResponse createMasterSlaveServerGroupWithOptions(CreateMasterSlaveServerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMasterSlaveServerGroup", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMasterSlaveServerGroupResponse());
    }

    public CreateMasterSlaveServerGroupResponse createMasterSlaveServerGroup(CreateMasterSlaveServerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMasterSlaveServerGroupWithOptions(request, runtime);
    }

    public CreateRulesResponse createRulesWithOptions(CreateRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRules", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRulesResponse());
    }

    public CreateRulesResponse createRules(CreateRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRulesWithOptions(request, runtime);
    }

    public CreateTLSCipherPolicyResponse createTLSCipherPolicyWithOptions(CreateTLSCipherPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTLSCipherPolicy", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTLSCipherPolicyResponse());
    }

    public CreateTLSCipherPolicyResponse createTLSCipherPolicy(CreateTLSCipherPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTLSCipherPolicyWithOptions(request, runtime);
    }

    public CreateVServerGroupResponse createVServerGroupWithOptions(CreateVServerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVServerGroup", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVServerGroupResponse());
    }

    public CreateVServerGroupResponse createVServerGroup(CreateVServerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVServerGroupWithOptions(request, runtime);
    }

    public DeleteAccessControlListResponse deleteAccessControlListWithOptions(DeleteAccessControlListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAccessControlList", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAccessControlListResponse());
    }

    public DeleteAccessControlListResponse deleteAccessControlList(DeleteAccessControlListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAccessControlListWithOptions(request, runtime);
    }

    public DeleteCACertificateResponse deleteCACertificateWithOptions(DeleteCACertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCACertificate", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCACertificateResponse());
    }

    public DeleteCACertificateResponse deleteCACertificate(DeleteCACertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCACertificateWithOptions(request, runtime);
    }

    public DeleteDomainExtensionResponse deleteDomainExtensionWithOptions(DeleteDomainExtensionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDomainExtension", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDomainExtensionResponse());
    }

    public DeleteDomainExtensionResponse deleteDomainExtension(DeleteDomainExtensionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainExtensionWithOptions(request, runtime);
    }

    public DeleteLoadBalancerResponse deleteLoadBalancerWithOptions(DeleteLoadBalancerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLoadBalancer", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLoadBalancerResponse());
    }

    public DeleteLoadBalancerResponse deleteLoadBalancer(DeleteLoadBalancerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLoadBalancerWithOptions(request, runtime);
    }

    public DeleteLoadBalancerListenerResponse deleteLoadBalancerListenerWithOptions(DeleteLoadBalancerListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLoadBalancerListener", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLoadBalancerListenerResponse());
    }

    public DeleteLoadBalancerListenerResponse deleteLoadBalancerListener(DeleteLoadBalancerListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLoadBalancerListenerWithOptions(request, runtime);
    }

    public DeleteMasterSlaveServerGroupResponse deleteMasterSlaveServerGroupWithOptions(DeleteMasterSlaveServerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMasterSlaveServerGroup", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMasterSlaveServerGroupResponse());
    }

    public DeleteMasterSlaveServerGroupResponse deleteMasterSlaveServerGroup(DeleteMasterSlaveServerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMasterSlaveServerGroupWithOptions(request, runtime);
    }

    public DeleteRulesResponse deleteRulesWithOptions(DeleteRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRules", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRulesResponse());
    }

    public DeleteRulesResponse deleteRules(DeleteRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRulesWithOptions(request, runtime);
    }

    public DeleteServerCertificateResponse deleteServerCertificateWithOptions(DeleteServerCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteServerCertificate", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteServerCertificateResponse());
    }

    public DeleteServerCertificateResponse deleteServerCertificate(DeleteServerCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteServerCertificateWithOptions(request, runtime);
    }

    public DeleteTLSCipherPolicyResponse deleteTLSCipherPolicyWithOptions(DeleteTLSCipherPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTLSCipherPolicy", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTLSCipherPolicyResponse());
    }

    public DeleteTLSCipherPolicyResponse deleteTLSCipherPolicy(DeleteTLSCipherPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTLSCipherPolicyWithOptions(request, runtime);
    }

    public DeleteVServerGroupResponse deleteVServerGroupWithOptions(DeleteVServerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVServerGroup", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVServerGroupResponse());
    }

    public DeleteVServerGroupResponse deleteVServerGroup(DeleteVServerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVServerGroupWithOptions(request, runtime);
    }

    public DescribeAccessControlListAttributeResponse describeAccessControlListAttributeWithOptions(DescribeAccessControlListAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccessControlListAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccessControlListAttributeResponse());
    }

    public DescribeAccessControlListAttributeResponse describeAccessControlListAttribute(DescribeAccessControlListAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccessControlListAttributeWithOptions(request, runtime);
    }

    public DescribeAccessControlListsResponse describeAccessControlListsWithOptions(DescribeAccessControlListsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccessControlLists", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccessControlListsResponse());
    }

    public DescribeAccessControlListsResponse describeAccessControlLists(DescribeAccessControlListsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccessControlListsWithOptions(request, runtime);
    }

    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(DescribeAvailableResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableResource", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableResourceResponse());
    }

    public DescribeAvailableResourceResponse describeAvailableResource(DescribeAvailableResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableResourceWithOptions(request, runtime);
    }

    public DescribeCACertificatesResponse describeCACertificatesWithOptions(DescribeCACertificatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCACertificates", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCACertificatesResponse());
    }

    public DescribeCACertificatesResponse describeCACertificates(DescribeCACertificatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCACertificatesWithOptions(request, runtime);
    }

    public DescribeDomainExtensionAttributeResponse describeDomainExtensionAttributeWithOptions(DescribeDomainExtensionAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainExtensionAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainExtensionAttributeResponse());
    }

    public DescribeDomainExtensionAttributeResponse describeDomainExtensionAttribute(DescribeDomainExtensionAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainExtensionAttributeWithOptions(request, runtime);
    }

    public DescribeDomainExtensionsResponse describeDomainExtensionsWithOptions(DescribeDomainExtensionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainExtensions", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainExtensionsResponse());
    }

    public DescribeDomainExtensionsResponse describeDomainExtensions(DescribeDomainExtensionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainExtensionsWithOptions(request, runtime);
    }

    public DescribeHealthStatusResponse describeHealthStatusWithOptions(DescribeHealthStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHealthStatus", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHealthStatusResponse());
    }

    public DescribeHealthStatusResponse describeHealthStatus(DescribeHealthStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHealthStatusWithOptions(request, runtime);
    }

    public DescribeListenerAccessControlAttributeResponse describeListenerAccessControlAttributeWithOptions(DescribeListenerAccessControlAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeListenerAccessControlAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeListenerAccessControlAttributeResponse());
    }

    public DescribeListenerAccessControlAttributeResponse describeListenerAccessControlAttribute(DescribeListenerAccessControlAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeListenerAccessControlAttributeWithOptions(request, runtime);
    }

    public DescribeLoadBalancerAttributeResponse describeLoadBalancerAttributeWithOptions(DescribeLoadBalancerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLoadBalancerAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLoadBalancerAttributeResponse());
    }

    public DescribeLoadBalancerAttributeResponse describeLoadBalancerAttribute(DescribeLoadBalancerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancerAttributeWithOptions(request, runtime);
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponse describeLoadBalancerHTTPListenerAttributeWithOptions(DescribeLoadBalancerHTTPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLoadBalancerHTTPListenerAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLoadBalancerHTTPListenerAttributeResponse());
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponse describeLoadBalancerHTTPListenerAttribute(DescribeLoadBalancerHTTPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancerHTTPListenerAttributeWithOptions(request, runtime);
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponse describeLoadBalancerHTTPSListenerAttributeWithOptions(DescribeLoadBalancerHTTPSListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLoadBalancerHTTPSListenerAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLoadBalancerHTTPSListenerAttributeResponse());
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponse describeLoadBalancerHTTPSListenerAttribute(DescribeLoadBalancerHTTPSListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancerHTTPSListenerAttributeWithOptions(request, runtime);
    }

    public DescribeLoadBalancersResponse describeLoadBalancersWithOptions(DescribeLoadBalancersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLoadBalancers", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLoadBalancersResponse());
    }

    public DescribeLoadBalancersResponse describeLoadBalancers(DescribeLoadBalancersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancersWithOptions(request, runtime);
    }

    public DescribeLoadBalancerTCPListenerAttributeResponse describeLoadBalancerTCPListenerAttributeWithOptions(DescribeLoadBalancerTCPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLoadBalancerTCPListenerAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLoadBalancerTCPListenerAttributeResponse());
    }

    public DescribeLoadBalancerTCPListenerAttributeResponse describeLoadBalancerTCPListenerAttribute(DescribeLoadBalancerTCPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancerTCPListenerAttributeWithOptions(request, runtime);
    }

    public DescribeLoadBalancerUDPListenerAttributeResponse describeLoadBalancerUDPListenerAttributeWithOptions(DescribeLoadBalancerUDPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLoadBalancerUDPListenerAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLoadBalancerUDPListenerAttributeResponse());
    }

    public DescribeLoadBalancerUDPListenerAttributeResponse describeLoadBalancerUDPListenerAttribute(DescribeLoadBalancerUDPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancerUDPListenerAttributeWithOptions(request, runtime);
    }

    public DescribeMasterSlaveServerGroupAttributeResponse describeMasterSlaveServerGroupAttributeWithOptions(DescribeMasterSlaveServerGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMasterSlaveServerGroupAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMasterSlaveServerGroupAttributeResponse());
    }

    public DescribeMasterSlaveServerGroupAttributeResponse describeMasterSlaveServerGroupAttribute(DescribeMasterSlaveServerGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMasterSlaveServerGroupAttributeWithOptions(request, runtime);
    }

    public DescribeMasterSlaveServerGroupsResponse describeMasterSlaveServerGroupsWithOptions(DescribeMasterSlaveServerGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMasterSlaveServerGroups", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMasterSlaveServerGroupsResponse());
    }

    public DescribeMasterSlaveServerGroupsResponse describeMasterSlaveServerGroups(DescribeMasterSlaveServerGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMasterSlaveServerGroupsWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeRuleAttributeResponse describeRuleAttributeWithOptions(DescribeRuleAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRuleAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRuleAttributeResponse());
    }

    public DescribeRuleAttributeResponse describeRuleAttribute(DescribeRuleAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRuleAttributeWithOptions(request, runtime);
    }

    public DescribeRulesResponse describeRulesWithOptions(DescribeRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRules", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRulesResponse());
    }

    public DescribeRulesResponse describeRules(DescribeRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRulesWithOptions(request, runtime);
    }

    public DescribeServerCertificatesResponse describeServerCertificatesWithOptions(DescribeServerCertificatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeServerCertificates", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeServerCertificatesResponse());
    }

    public DescribeServerCertificatesResponse describeServerCertificates(DescribeServerCertificatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServerCertificatesWithOptions(request, runtime);
    }

    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTags", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTagsResponse());
    }

    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    public DescribeVServerGroupAttributeResponse describeVServerGroupAttributeWithOptions(DescribeVServerGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVServerGroupAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVServerGroupAttributeResponse());
    }

    public DescribeVServerGroupAttributeResponse describeVServerGroupAttribute(DescribeVServerGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVServerGroupAttributeWithOptions(request, runtime);
    }

    public DescribeVServerGroupsResponse describeVServerGroupsWithOptions(DescribeVServerGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVServerGroups", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVServerGroupsResponse());
    }

    public DescribeVServerGroupsResponse describeVServerGroups(DescribeVServerGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVServerGroupsWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeZones", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListTLSCipherPoliciesResponse listTLSCipherPoliciesWithOptions(ListTLSCipherPoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTLSCipherPolicies", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListTLSCipherPoliciesResponse());
    }

    public ListTLSCipherPoliciesResponse listTLSCipherPolicies(ListTLSCipherPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTLSCipherPoliciesWithOptions(request, runtime);
    }

    public ModifyLoadBalancerInstanceSpecResponse modifyLoadBalancerInstanceSpecWithOptions(ModifyLoadBalancerInstanceSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLoadBalancerInstanceSpec", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyLoadBalancerInstanceSpecResponse());
    }

    public ModifyLoadBalancerInstanceSpecResponse modifyLoadBalancerInstanceSpec(ModifyLoadBalancerInstanceSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLoadBalancerInstanceSpecWithOptions(request, runtime);
    }

    public ModifyLoadBalancerInternetSpecResponse modifyLoadBalancerInternetSpecWithOptions(ModifyLoadBalancerInternetSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLoadBalancerInternetSpec", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyLoadBalancerInternetSpecResponse());
    }

    public ModifyLoadBalancerInternetSpecResponse modifyLoadBalancerInternetSpec(ModifyLoadBalancerInternetSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLoadBalancerInternetSpecWithOptions(request, runtime);
    }

    public ModifyLoadBalancerPayTypeResponse modifyLoadBalancerPayTypeWithOptions(ModifyLoadBalancerPayTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLoadBalancerPayType", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyLoadBalancerPayTypeResponse());
    }

    public ModifyLoadBalancerPayTypeResponse modifyLoadBalancerPayType(ModifyLoadBalancerPayTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLoadBalancerPayTypeWithOptions(request, runtime);
    }

    public ModifyVServerGroupBackendServersResponse modifyVServerGroupBackendServersWithOptions(ModifyVServerGroupBackendServersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVServerGroupBackendServers", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVServerGroupBackendServersResponse());
    }

    public ModifyVServerGroupBackendServersResponse modifyVServerGroupBackendServers(ModifyVServerGroupBackendServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVServerGroupBackendServersWithOptions(request, runtime);
    }

    public RemoveAccessControlListEntryResponse removeAccessControlListEntryWithOptions(RemoveAccessControlListEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveAccessControlListEntry", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveAccessControlListEntryResponse());
    }

    public RemoveAccessControlListEntryResponse removeAccessControlListEntry(RemoveAccessControlListEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeAccessControlListEntryWithOptions(request, runtime);
    }

    public RemoveBackendServersResponse removeBackendServersWithOptions(RemoveBackendServersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveBackendServers", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveBackendServersResponse());
    }

    public RemoveBackendServersResponse removeBackendServers(RemoveBackendServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeBackendServersWithOptions(request, runtime);
    }

    public RemoveListenerWhiteListItemResponse removeListenerWhiteListItemWithOptions(RemoveListenerWhiteListItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveListenerWhiteListItem", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveListenerWhiteListItemResponse());
    }

    public RemoveListenerWhiteListItemResponse removeListenerWhiteListItem(RemoveListenerWhiteListItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeListenerWhiteListItemWithOptions(request, runtime);
    }

    public RemoveTagsResponse removeTagsWithOptions(RemoveTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveTags", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveTagsResponse());
    }

    public RemoveTagsResponse removeTags(RemoveTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeTagsWithOptions(request, runtime);
    }

    public RemoveVServerGroupBackendServersResponse removeVServerGroupBackendServersWithOptions(RemoveVServerGroupBackendServersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveVServerGroupBackendServers", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveVServerGroupBackendServersResponse());
    }

    public RemoveVServerGroupBackendServersResponse removeVServerGroupBackendServers(RemoveVServerGroupBackendServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeVServerGroupBackendServersWithOptions(request, runtime);
    }

    public SetAccessControlListAttributeResponse setAccessControlListAttributeWithOptions(SetAccessControlListAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAccessControlListAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetAccessControlListAttributeResponse());
    }

    public SetAccessControlListAttributeResponse setAccessControlListAttribute(SetAccessControlListAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAccessControlListAttributeWithOptions(request, runtime);
    }

    public SetBackendServersResponse setBackendServersWithOptions(SetBackendServersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetBackendServers", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetBackendServersResponse());
    }

    public SetBackendServersResponse setBackendServers(SetBackendServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setBackendServersWithOptions(request, runtime);
    }

    public SetCACertificateNameResponse setCACertificateNameWithOptions(SetCACertificateNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetCACertificateName", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetCACertificateNameResponse());
    }

    public SetCACertificateNameResponse setCACertificateName(SetCACertificateNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setCACertificateNameWithOptions(request, runtime);
    }

    public SetDomainExtensionAttributeResponse setDomainExtensionAttributeWithOptions(SetDomainExtensionAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDomainExtensionAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetDomainExtensionAttributeResponse());
    }

    public SetDomainExtensionAttributeResponse setDomainExtensionAttribute(SetDomainExtensionAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDomainExtensionAttributeWithOptions(request, runtime);
    }

    public SetListenerAccessControlStatusResponse setListenerAccessControlStatusWithOptions(SetListenerAccessControlStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetListenerAccessControlStatus", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetListenerAccessControlStatusResponse());
    }

    public SetListenerAccessControlStatusResponse setListenerAccessControlStatus(SetListenerAccessControlStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setListenerAccessControlStatusWithOptions(request, runtime);
    }

    public SetLoadBalancerDeleteProtectionResponse setLoadBalancerDeleteProtectionWithOptions(SetLoadBalancerDeleteProtectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLoadBalancerDeleteProtection", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetLoadBalancerDeleteProtectionResponse());
    }

    public SetLoadBalancerDeleteProtectionResponse setLoadBalancerDeleteProtection(SetLoadBalancerDeleteProtectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerDeleteProtectionWithOptions(request, runtime);
    }

    public SetLoadBalancerHTTPListenerAttributeResponse setLoadBalancerHTTPListenerAttributeWithOptions(SetLoadBalancerHTTPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLoadBalancerHTTPListenerAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetLoadBalancerHTTPListenerAttributeResponse());
    }

    public SetLoadBalancerHTTPListenerAttributeResponse setLoadBalancerHTTPListenerAttribute(SetLoadBalancerHTTPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerHTTPListenerAttributeWithOptions(request, runtime);
    }

    public SetLoadBalancerHTTPSListenerAttributeResponse setLoadBalancerHTTPSListenerAttributeWithOptions(SetLoadBalancerHTTPSListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLoadBalancerHTTPSListenerAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetLoadBalancerHTTPSListenerAttributeResponse());
    }

    public SetLoadBalancerHTTPSListenerAttributeResponse setLoadBalancerHTTPSListenerAttribute(SetLoadBalancerHTTPSListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerHTTPSListenerAttributeWithOptions(request, runtime);
    }

    public SetLoadBalancerModificationProtectionResponse setLoadBalancerModificationProtectionWithOptions(SetLoadBalancerModificationProtectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLoadBalancerModificationProtection", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetLoadBalancerModificationProtectionResponse());
    }

    public SetLoadBalancerModificationProtectionResponse setLoadBalancerModificationProtection(SetLoadBalancerModificationProtectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerModificationProtectionWithOptions(request, runtime);
    }

    public SetLoadBalancerNameResponse setLoadBalancerNameWithOptions(SetLoadBalancerNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLoadBalancerName", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetLoadBalancerNameResponse());
    }

    public SetLoadBalancerNameResponse setLoadBalancerName(SetLoadBalancerNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerNameWithOptions(request, runtime);
    }

    public SetLoadBalancerStatusResponse setLoadBalancerStatusWithOptions(SetLoadBalancerStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLoadBalancerStatus", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetLoadBalancerStatusResponse());
    }

    public SetLoadBalancerStatusResponse setLoadBalancerStatus(SetLoadBalancerStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerStatusWithOptions(request, runtime);
    }

    public SetLoadBalancerTCPListenerAttributeResponse setLoadBalancerTCPListenerAttributeWithOptions(SetLoadBalancerTCPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLoadBalancerTCPListenerAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetLoadBalancerTCPListenerAttributeResponse());
    }

    public SetLoadBalancerTCPListenerAttributeResponse setLoadBalancerTCPListenerAttribute(SetLoadBalancerTCPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerTCPListenerAttributeWithOptions(request, runtime);
    }

    public SetLoadBalancerUDPListenerAttributeResponse setLoadBalancerUDPListenerAttributeWithOptions(SetLoadBalancerUDPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLoadBalancerUDPListenerAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetLoadBalancerUDPListenerAttributeResponse());
    }

    public SetLoadBalancerUDPListenerAttributeResponse setLoadBalancerUDPListenerAttribute(SetLoadBalancerUDPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerUDPListenerAttributeWithOptions(request, runtime);
    }

    public SetRuleResponse setRuleWithOptions(SetRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetRule", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetRuleResponse());
    }

    public SetRuleResponse setRule(SetRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setRuleWithOptions(request, runtime);
    }

    public SetServerCertificateNameResponse setServerCertificateNameWithOptions(SetServerCertificateNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetServerCertificateName", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetServerCertificateNameResponse());
    }

    public SetServerCertificateNameResponse setServerCertificateName(SetServerCertificateNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setServerCertificateNameWithOptions(request, runtime);
    }

    public SetTLSCipherPolicyAttributeResponse setTLSCipherPolicyAttributeWithOptions(SetTLSCipherPolicyAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetTLSCipherPolicyAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetTLSCipherPolicyAttributeResponse());
    }

    public SetTLSCipherPolicyAttributeResponse setTLSCipherPolicyAttribute(SetTLSCipherPolicyAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setTLSCipherPolicyAttributeWithOptions(request, runtime);
    }

    public SetVServerGroupAttributeResponse setVServerGroupAttributeWithOptions(SetVServerGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetVServerGroupAttribute", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetVServerGroupAttributeResponse());
    }

    public SetVServerGroupAttributeResponse setVServerGroupAttribute(SetVServerGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setVServerGroupAttributeWithOptions(request, runtime);
    }

    public StartLoadBalancerListenerResponse startLoadBalancerListenerWithOptions(StartLoadBalancerListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartLoadBalancerListener", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new StartLoadBalancerListenerResponse());
    }

    public StartLoadBalancerListenerResponse startLoadBalancerListener(StartLoadBalancerListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startLoadBalancerListenerWithOptions(request, runtime);
    }

    public StopLoadBalancerListenerResponse stopLoadBalancerListenerWithOptions(StopLoadBalancerListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopLoadBalancerListener", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new StopLoadBalancerListenerResponse());
    }

    public StopLoadBalancerListenerResponse stopLoadBalancerListener(StopLoadBalancerListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopLoadBalancerListenerWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UploadCACertificateResponse uploadCACertificateWithOptions(UploadCACertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadCACertificate", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UploadCACertificateResponse());
    }

    public UploadCACertificateResponse uploadCACertificate(UploadCACertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadCACertificateWithOptions(request, runtime);
    }

    public UploadServerCertificateResponse uploadServerCertificateWithOptions(UploadServerCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadServerCertificate", "2014-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UploadServerCertificateResponse());
    }

    public UploadServerCertificateResponse uploadServerCertificate(UploadServerCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadServerCertificateWithOptions(request, runtime);
    }
}

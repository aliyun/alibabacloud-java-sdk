// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821;

import com.aliyun.tea.*;
import com.aliyun.uis20180821.models.*;
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
            new TeaPair("cn-north-2-gov-1", "uis.cn-hangzhou.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "uis.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "uis.aliyuncs.com"),
            new TeaPair("ap-south-1", "uis.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "uis.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "uis.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "uis.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "uis.aliyuncs.com"),
            new TeaPair("cn-beijing", "uis.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "uis.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "uis.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "uis.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "uis.aliyuncs.com"),
            new TeaPair("cn-chengdu", "uis.aliyuncs.com"),
            new TeaPair("cn-edge-1", "uis.aliyuncs.com"),
            new TeaPair("cn-fujian", "uis.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "uis.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "uis.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "uis.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "uis.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "uis.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "uis.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "uis.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "uis.aliyuncs.com"),
            new TeaPair("cn-hongkong", "uis.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "uis.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "uis.aliyuncs.com"),
            new TeaPair("cn-qingdao", "uis.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "uis.aliyuncs.com"),
            new TeaPair("cn-shanghai", "uis.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "uis.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "uis.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "uis.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "uis.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "uis.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "uis.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "uis.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "uis.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "uis.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "uis.aliyuncs.com"),
            new TeaPair("cn-wuhan", "uis.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "uis.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "uis.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "uis.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "uis.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "uis.aliyuncs.com"),
            new TeaPair("eu-central-1", "uis.aliyuncs.com"),
            new TeaPair("eu-west-1", "uis.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "uis.aliyuncs.com"),
            new TeaPair("me-east-1", "uis.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "uis.aliyuncs.com"),
            new TeaPair("us-east-1", "uis.aliyuncs.com"),
            new TeaPair("us-west-1", "uis.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("uis", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddHighPriorityIpResponse addHighPriorityIpWithOptions(AddHighPriorityIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddHighPriorityIp", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new AddHighPriorityIpResponse());
    }

    public AddHighPriorityIpResponse addHighPriorityIp(AddHighPriorityIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addHighPriorityIpWithOptions(request, runtime);
    }

    public AddUisNodeIpResponse addUisNodeIpWithOptions(AddUisNodeIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddUisNodeIp", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new AddUisNodeIpResponse());
    }

    public AddUisNodeIpResponse addUisNodeIp(AddUisNodeIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addUisNodeIpWithOptions(request, runtime);
    }

    public CreateDnatEntryResponse createDnatEntryWithOptions(CreateDnatEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDnatEntry", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDnatEntryResponse());
    }

    public CreateDnatEntryResponse createDnatEntry(CreateDnatEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDnatEntryWithOptions(request, runtime);
    }

    public CreateSubConnectionResponse createSubConnectionWithOptions(CreateSubConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSubConnection", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSubConnectionResponse());
    }

    public CreateSubConnectionResponse createSubConnection(CreateSubConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSubConnectionWithOptions(request, runtime);
    }

    public CreateUisResponse createUisWithOptions(CreateUisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUis", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUisResponse());
    }

    public CreateUisResponse createUis(CreateUisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUisWithOptions(request, runtime);
    }

    public CreateUisConnectionResponse createUisConnectionWithOptions(CreateUisConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUisConnection", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUisConnectionResponse());
    }

    public CreateUisConnectionResponse createUisConnection(CreateUisConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUisConnectionWithOptions(request, runtime);
    }

    public CreateUisNetworkInterfaceResponse createUisNetworkInterfaceWithOptions(CreateUisNetworkInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUisNetworkInterface", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUisNetworkInterfaceResponse());
    }

    public CreateUisNetworkInterfaceResponse createUisNetworkInterface(CreateUisNetworkInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUisNetworkInterfaceWithOptions(request, runtime);
    }

    public CreateUisNodeResponse createUisNodeWithOptions(CreateUisNodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUisNode", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUisNodeResponse());
    }

    public CreateUisNodeResponse createUisNode(CreateUisNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUisNodeWithOptions(request, runtime);
    }

    public DeleteDnatEntryResponse deleteDnatEntryWithOptions(DeleteDnatEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDnatEntry", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDnatEntryResponse());
    }

    public DeleteDnatEntryResponse deleteDnatEntry(DeleteDnatEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDnatEntryWithOptions(request, runtime);
    }

    public DeleteHighPriorityIpResponse deleteHighPriorityIpWithOptions(DeleteHighPriorityIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteHighPriorityIp", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteHighPriorityIpResponse());
    }

    public DeleteHighPriorityIpResponse deleteHighPriorityIp(DeleteHighPriorityIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHighPriorityIpWithOptions(request, runtime);
    }

    public DeleteSubConnectionResponse deleteSubConnectionWithOptions(DeleteSubConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSubConnection", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSubConnectionResponse());
    }

    public DeleteSubConnectionResponse deleteSubConnection(DeleteSubConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSubConnectionWithOptions(request, runtime);
    }

    public DeleteUisResponse deleteUisWithOptions(DeleteUisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUis", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUisResponse());
    }

    public DeleteUisResponse deleteUis(DeleteUisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUisWithOptions(request, runtime);
    }

    public DeleteUisConnectionResponse deleteUisConnectionWithOptions(DeleteUisConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUisConnection", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUisConnectionResponse());
    }

    public DeleteUisConnectionResponse deleteUisConnection(DeleteUisConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUisConnectionWithOptions(request, runtime);
    }

    public DeleteUisNetworkInterfaceResponse deleteUisNetworkInterfaceWithOptions(DeleteUisNetworkInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUisNetworkInterface", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUisNetworkInterfaceResponse());
    }

    public DeleteUisNetworkInterfaceResponse deleteUisNetworkInterface(DeleteUisNetworkInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUisNetworkInterfaceWithOptions(request, runtime);
    }

    public DeleteUisNodeResponse deleteUisNodeWithOptions(DeleteUisNodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUisNode", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUisNodeResponse());
    }

    public DeleteUisNodeResponse deleteUisNode(DeleteUisNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUisNodeWithOptions(request, runtime);
    }

    public DeleteUisNodeIpResponse deleteUisNodeIpWithOptions(DeleteUisNodeIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUisNodeIp", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUisNodeIpResponse());
    }

    public DeleteUisNodeIpResponse deleteUisNodeIp(DeleteUisNodeIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUisNodeIpWithOptions(request, runtime);
    }

    public DescribeAreasResponse describeAreasWithOptions(DescribeAreasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAreas", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAreasResponse());
    }

    public DescribeAreasResponse describeAreas(DescribeAreasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAreasWithOptions(request, runtime);
    }

    public DescribeDnatEntriesResponse describeDnatEntriesWithOptions(DescribeDnatEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnatEntries", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnatEntriesResponse());
    }

    public DescribeDnatEntriesResponse describeDnatEntries(DescribeDnatEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnatEntriesWithOptions(request, runtime);
    }

    public DescribeHighPriorityIpResponse describeHighPriorityIpWithOptions(DescribeHighPriorityIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHighPriorityIp", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHighPriorityIpResponse());
    }

    public DescribeHighPriorityIpResponse describeHighPriorityIp(DescribeHighPriorityIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHighPriorityIpWithOptions(request, runtime);
    }

    public DescribeHighPriorityIpsResponse describeHighPriorityIpsWithOptions(DescribeHighPriorityIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHighPriorityIps", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHighPriorityIpsResponse());
    }

    public DescribeHighPriorityIpsResponse describeHighPriorityIps(DescribeHighPriorityIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHighPriorityIpsWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeSubConnectionResponse describeSubConnectionWithOptions(DescribeSubConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSubConnection", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSubConnectionResponse());
    }

    public DescribeSubConnectionResponse describeSubConnection(DescribeSubConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSubConnectionWithOptions(request, runtime);
    }

    public DescribeSubConnectionsResponse describeSubConnectionsWithOptions(DescribeSubConnectionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSubConnections", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSubConnectionsResponse());
    }

    public DescribeSubConnectionsResponse describeSubConnections(DescribeSubConnectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSubConnectionsWithOptions(request, runtime);
    }

    public DescribeUisConnectionsResponse describeUisConnectionsWithOptions(DescribeUisConnectionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUisConnections", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUisConnectionsResponse());
    }

    public DescribeUisConnectionsResponse describeUisConnections(DescribeUisConnectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUisConnectionsWithOptions(request, runtime);
    }

    public DescribeUiseNodeStatusResponse describeUiseNodeStatusWithOptions(DescribeUiseNodeStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUiseNodeStatus", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUiseNodeStatusResponse());
    }

    public DescribeUiseNodeStatusResponse describeUiseNodeStatus(DescribeUiseNodeStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUiseNodeStatusWithOptions(request, runtime);
    }

    public DescribeUisesResponse describeUisesWithOptions(DescribeUisesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUises", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUisesResponse());
    }

    public DescribeUisesResponse describeUises(DescribeUisesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUisesWithOptions(request, runtime);
    }

    public DescribeUisNetworkInterfacesResponse describeUisNetworkInterfacesWithOptions(DescribeUisNetworkInterfacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUisNetworkInterfaces", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUisNetworkInterfacesResponse());
    }

    public DescribeUisNetworkInterfacesResponse describeUisNetworkInterfaces(DescribeUisNetworkInterfacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUisNetworkInterfacesWithOptions(request, runtime);
    }

    public DescribeUisNodesResponse describeUisNodesWithOptions(DescribeUisNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUisNodes", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUisNodesResponse());
    }

    public DescribeUisNodesResponse describeUisNodes(DescribeUisNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUisNodesWithOptions(request, runtime);
    }

    public DescribeWhiteListResponse describeWhiteListWithOptions(DescribeWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWhiteList", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWhiteListResponse());
    }

    public DescribeWhiteListResponse describeWhiteList(DescribeWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWhiteListWithOptions(request, runtime);
    }

    public GetDroppedIpListResponse getDroppedIpListWithOptions(GetDroppedIpListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDroppedIpList", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetDroppedIpListResponse());
    }

    public GetDroppedIpListResponse getDroppedIpList(GetDroppedIpListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDroppedIpListWithOptions(request, runtime);
    }

    public ModifyDnatEntryResponse modifyDnatEntryWithOptions(ModifyDnatEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDnatEntry", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDnatEntryResponse());
    }

    public ModifyDnatEntryResponse modifyDnatEntry(ModifyDnatEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDnatEntryWithOptions(request, runtime);
    }

    public ModifyHighPriorityIpResponse modifyHighPriorityIpWithOptions(ModifyHighPriorityIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHighPriorityIp", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHighPriorityIpResponse());
    }

    public ModifyHighPriorityIpResponse modifyHighPriorityIp(ModifyHighPriorityIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHighPriorityIpWithOptions(request, runtime);
    }

    public ModifySubConnectionResponse modifySubConnectionWithOptions(ModifySubConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySubConnection", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySubConnectionResponse());
    }

    public ModifySubConnectionResponse modifySubConnection(ModifySubConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySubConnectionWithOptions(request, runtime);
    }

    public ModifyUisAttributeResponse modifyUisAttributeWithOptions(ModifyUisAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUisAttribute", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyUisAttributeResponse());
    }

    public ModifyUisAttributeResponse modifyUisAttribute(ModifyUisAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUisAttributeWithOptions(request, runtime);
    }

    public ModifyUisConnectionAttributeResponse modifyUisConnectionAttributeWithOptions(ModifyUisConnectionAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUisConnectionAttribute", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyUisConnectionAttributeResponse());
    }

    public ModifyUisConnectionAttributeResponse modifyUisConnectionAttribute(ModifyUisConnectionAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUisConnectionAttributeWithOptions(request, runtime);
    }

    public ModifyUisNodeAttributeResponse modifyUisNodeAttributeWithOptions(ModifyUisNodeAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUisNodeAttribute", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyUisNodeAttributeResponse());
    }

    public ModifyUisNodeAttributeResponse modifyUisNodeAttribute(ModifyUisNodeAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUisNodeAttributeWithOptions(request, runtime);
    }

    public ModifyWhiteListResponse modifyWhiteListWithOptions(ModifyWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWhiteList", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWhiteListResponse());
    }

    public ModifyWhiteListResponse modifyWhiteList(ModifyWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWhiteListWithOptions(request, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707;

import com.aliyun.tea.*;
import com.aliyun.uisplus20200707.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("uisplus", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public DescribeUisResponse describeUisWithOptions(DescribeUisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUis", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new DescribeUisResponse());
    }

    public DescribeUisResponse describeUis(DescribeUisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUisWithOptions(request, runtime);
    }

    public ModifyVnetResponse modifyVnetWithOptions(ModifyVnetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyVnet", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new ModifyVnetResponse());
    }

    public ModifyVnetResponse modifyVnet(ModifyVnetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVnetWithOptions(request, runtime);
    }

    public DescribeGreConnectionsResponse describeGreConnectionsWithOptions(DescribeGreConnectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGreConnections", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new DescribeGreConnectionsResponse());
    }

    public DescribeGreConnectionsResponse describeGreConnections(DescribeGreConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGreConnectionsWithOptions(request, runtime);
    }

    public DescribeUissResponse describeUissWithOptions(DescribeUissRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUiss", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new DescribeUissResponse());
    }

    public DescribeUissResponse describeUiss(DescribeUissRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUissWithOptions(request, runtime);
    }

    public DescribeVnetRouteEntryListResponse describeVnetRouteEntryListWithOptions(DescribeVnetRouteEntryListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVnetRouteEntryList", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVnetRouteEntryListResponse());
    }

    public DescribeVnetRouteEntryListResponse describeVnetRouteEntryList(DescribeVnetRouteEntryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVnetRouteEntryListWithOptions(request, runtime);
    }

    public CreateVnetResponse createVnetWithOptions(CreateVnetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateVnet", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new CreateVnetResponse());
    }

    public CreateVnetResponse createVnet(CreateVnetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVnetWithOptions(request, runtime);
    }

    public DeleteVnetResponse deleteVnetWithOptions(DeleteVnetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVnet", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new DeleteVnetResponse());
    }

    public DeleteVnetResponse deleteVnet(DeleteVnetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVnetWithOptions(request, runtime);
    }

    public DescribeVnetsResponse describeVnetsWithOptions(DescribeVnetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVnets", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVnetsResponse());
    }

    public DescribeVnetsResponse describeVnets(DescribeVnetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVnetsWithOptions(request, runtime);
    }

    public DeleteVnetRouteEntryResponse deleteVnetRouteEntryWithOptions(DeleteVnetRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVnetRouteEntry", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new DeleteVnetRouteEntryResponse());
    }

    public DeleteVnetRouteEntryResponse deleteVnetRouteEntry(DeleteVnetRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVnetRouteEntryWithOptions(request, runtime);
    }

    public AssociateEipResponse associateEipWithOptions(AssociateEipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AssociateEip", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new AssociateEipResponse());
    }

    public AssociateEipResponse associateEip(AssociateEipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateEipWithOptions(request, runtime);
    }

    public ModifyGreConnectionResponse modifyGreConnectionWithOptions(ModifyGreConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyGreConnection", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new ModifyGreConnectionResponse());
    }

    public ModifyGreConnectionResponse modifyGreConnection(ModifyGreConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGreConnectionWithOptions(request, runtime);
    }

    public DescribeVnetResponse describeVnetWithOptions(DescribeVnetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVnet", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVnetResponse());
    }

    public DescribeVnetResponse describeVnet(DescribeVnetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVnetWithOptions(request, runtime);
    }

    public UnAssociateEipResponse unAssociateEipWithOptions(UnAssociateEipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnAssociateEip", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new UnAssociateEipResponse());
    }

    public UnAssociateEipResponse unAssociateEip(UnAssociateEipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unAssociateEipWithOptions(request, runtime);
    }

    public DeleteGreConnectionResponse deleteGreConnectionWithOptions(DeleteGreConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteGreConnection", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new DeleteGreConnectionResponse());
    }

    public DeleteGreConnectionResponse deleteGreConnection(DeleteGreConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGreConnectionWithOptions(request, runtime);
    }

    public CreateGreConnectionResponse createGreConnectionWithOptions(CreateGreConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateGreConnection", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new CreateGreConnectionResponse());
    }

    public CreateGreConnectionResponse createGreConnection(CreateGreConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGreConnectionWithOptions(request, runtime);
    }

    public CreateUisResponse createUisWithOptions(CreateUisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateUis", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new CreateUisResponse());
    }

    public CreateUisResponse createUis(CreateUisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUisWithOptions(request, runtime);
    }

    public CreateVnetRouteEntryResponse createVnetRouteEntryWithOptions(CreateVnetRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateVnetRouteEntry", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new CreateVnetRouteEntryResponse());
    }

    public CreateVnetRouteEntryResponse createVnetRouteEntry(CreateVnetRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVnetRouteEntryWithOptions(request, runtime);
    }

    public DeleteUisResponse deleteUisWithOptions(DeleteUisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteUis", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new DeleteUisResponse());
    }

    public DeleteUisResponse deleteUis(DeleteUisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUisWithOptions(request, runtime);
    }

    public DescribeGreConnectionResponse describeGreConnectionWithOptions(DescribeGreConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGreConnection", "HTTPS", "GET", "2020-07-07", "AK", TeaModel.buildMap(request), null, runtime), new DescribeGreConnectionResponse());
    }

    public DescribeGreConnectionResponse describeGreConnection(DescribeGreConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGreConnectionWithOptions(request, runtime);
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110;

import com.aliyun.tea.*;
import com.aliyun.resourcesharing20200110.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("resourcesharing", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRegions", "HTTPS", "POST", "2020-01-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public ListResourceSharesResponse listResourceSharesWithOptions(ListResourceSharesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListResourceShares", "HTTPS", "POST", "2020-01-10", "AK", null, TeaModel.buildMap(request), runtime), new ListResourceSharesResponse());
    }

    public ListResourceSharesResponse listResourceShares(ListResourceSharesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceSharesWithOptions(request, runtime);
    }

    public ListSharedResourcesResponse listSharedResourcesWithOptions(ListSharedResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListSharedResources", "HTTPS", "POST", "2020-01-10", "AK", null, TeaModel.buildMap(request), runtime), new ListSharedResourcesResponse());
    }

    public ListSharedResourcesResponse listSharedResources(ListSharedResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSharedResourcesWithOptions(request, runtime);
    }

    public ListSharedTargetsResponse listSharedTargetsWithOptions(ListSharedTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListSharedTargets", "HTTPS", "POST", "2020-01-10", "AK", null, TeaModel.buildMap(request), runtime), new ListSharedTargetsResponse());
    }

    public ListSharedTargetsResponse listSharedTargets(ListSharedTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSharedTargetsWithOptions(request, runtime);
    }

    public AssociateResourceShareResponse associateResourceShareWithOptions(AssociateResourceShareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AssociateResourceShare", "HTTPS", "POST", "2020-01-10", "AK", null, TeaModel.buildMap(request), runtime), new AssociateResourceShareResponse());
    }

    public AssociateResourceShareResponse associateResourceShare(AssociateResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateResourceShareWithOptions(request, runtime);
    }

    public UpdateResourceShareResponse updateResourceShareWithOptions(UpdateResourceShareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateResourceShare", "HTTPS", "POST", "2020-01-10", "AK", null, TeaModel.buildMap(request), runtime), new UpdateResourceShareResponse());
    }

    public UpdateResourceShareResponse updateResourceShare(UpdateResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResourceShareWithOptions(request, runtime);
    }

    public DeleteResourceShareResponse deleteResourceShareWithOptions(DeleteResourceShareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteResourceShare", "HTTPS", "POST", "2020-01-10", "AK", null, TeaModel.buildMap(request), runtime), new DeleteResourceShareResponse());
    }

    public DeleteResourceShareResponse deleteResourceShare(DeleteResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteResourceShareWithOptions(request, runtime);
    }

    public DisassociateResourceShareResponse disassociateResourceShareWithOptions(DisassociateResourceShareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisassociateResourceShare", "HTTPS", "POST", "2020-01-10", "AK", null, TeaModel.buildMap(request), runtime), new DisassociateResourceShareResponse());
    }

    public DisassociateResourceShareResponse disassociateResourceShare(DisassociateResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disassociateResourceShareWithOptions(request, runtime);
    }

    public ListResourceShareAssociationsResponse listResourceShareAssociationsWithOptions(ListResourceShareAssociationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListResourceShareAssociations", "HTTPS", "POST", "2020-01-10", "AK", null, TeaModel.buildMap(request), runtime), new ListResourceShareAssociationsResponse());
    }

    public ListResourceShareAssociationsResponse listResourceShareAssociations(ListResourceShareAssociationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceShareAssociationsWithOptions(request, runtime);
    }

    public CreateResourceShareResponse createResourceShareWithOptions(CreateResourceShareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateResourceShare", "HTTPS", "POST", "2020-01-10", "AK", null, TeaModel.buildMap(request), runtime), new CreateResourceShareResponse());
    }

    public CreateResourceShareResponse createResourceShare(CreateResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourceShareWithOptions(request, runtime);
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

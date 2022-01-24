// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110;

import com.aliyun.tea.*;
import com.aliyun.resourcesharing20200110.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("resourcesharing", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AssociateResourceShareResponse associateResourceShareWithOptions(AssociateResourceShareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareId)) {
            query.put("ResourceShareId", request.resourceShareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targets)) {
            query.put("Targets", request.targets);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateResourceShare"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateResourceShareResponse());
    }

    public AssociateResourceShareResponse associateResourceShare(AssociateResourceShareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateResourceShareWithOptions(request, runtime);
    }

    public CreateResourceShareResponse createResourceShareWithOptions(CreateResourceShareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareName)) {
            query.put("ResourceShareName", request.resourceShareName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targets)) {
            query.put("Targets", request.targets);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceShare"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceShareResponse());
    }

    public CreateResourceShareResponse createResourceShare(CreateResourceShareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createResourceShareWithOptions(request, runtime);
    }

    public DeleteResourceShareResponse deleteResourceShareWithOptions(DeleteResourceShareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareId)) {
            query.put("ResourceShareId", request.resourceShareId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceShare"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceShareResponse());
    }

    public DeleteResourceShareResponse deleteResourceShare(DeleteResourceShareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteResourceShareWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DisassociateResourceShareResponse disassociateResourceShareWithOptions(DisassociateResourceShareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareId)) {
            query.put("ResourceShareId", request.resourceShareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targets)) {
            query.put("Targets", request.targets);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisassociateResourceShare"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisassociateResourceShareResponse());
    }

    public DisassociateResourceShareResponse disassociateResourceShare(DisassociateResourceShareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disassociateResourceShareWithOptions(request, runtime);
    }

    public EnableSharingWithResourceDirectoryResponse enableSharingWithResourceDirectoryWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSharingWithResourceDirectory"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSharingWithResourceDirectoryResponse());
    }

    public EnableSharingWithResourceDirectoryResponse enableSharingWithResourceDirectory() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableSharingWithResourceDirectoryWithOptions(runtime);
    }

    public ListResourceShareAssociationsResponse listResourceShareAssociationsWithOptions(ListResourceShareAssociationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.associationStatus)) {
            query.put("AssociationStatus", request.associationStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associationType)) {
            query.put("AssociationType", request.associationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareIds)) {
            query.put("ResourceShareIds", request.resourceShareIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceShareAssociations"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceShareAssociationsResponse());
    }

    public ListResourceShareAssociationsResponse listResourceShareAssociations(ListResourceShareAssociationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceShareAssociationsWithOptions(request, runtime);
    }

    public ListResourceSharesResponse listResourceSharesWithOptions(ListResourceSharesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwner)) {
            query.put("ResourceOwner", request.resourceOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareIds)) {
            query.put("ResourceShareIds", request.resourceShareIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareName)) {
            query.put("ResourceShareName", request.resourceShareName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareStatus)) {
            query.put("ResourceShareStatus", request.resourceShareStatus);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceShares"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceSharesResponse());
    }

    public ListResourceSharesResponse listResourceShares(ListResourceSharesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceSharesWithOptions(request, runtime);
    }

    public ListSharedResourcesResponse listSharedResourcesWithOptions(ListSharedResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwner)) {
            query.put("ResourceOwner", request.resourceOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareIds)) {
            query.put("ResourceShareIds", request.resourceShareIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSharedResources"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSharedResourcesResponse());
    }

    public ListSharedResourcesResponse listSharedResources(ListSharedResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSharedResourcesWithOptions(request, runtime);
    }

    public ListSharedTargetsResponse listSharedTargetsWithOptions(ListSharedTargetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwner)) {
            query.put("ResourceOwner", request.resourceOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareIds)) {
            query.put("ResourceShareIds", request.resourceShareIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targets)) {
            query.put("Targets", request.targets);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSharedTargets"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSharedTargetsResponse());
    }

    public ListSharedTargetsResponse listSharedTargets(ListSharedTargetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSharedTargetsWithOptions(request, runtime);
    }

    public UpdateResourceShareResponse updateResourceShareWithOptions(UpdateResourceShareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareId)) {
            query.put("ResourceShareId", request.resourceShareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareName)) {
            query.put("ResourceShareName", request.resourceShareName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceShare"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceShareResponse());
    }

    public UpdateResourceShareResponse updateResourceShare(UpdateResourceShareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateResourceShareWithOptions(request, runtime);
    }
}

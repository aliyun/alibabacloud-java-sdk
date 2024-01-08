// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110;

import com.aliyun.tea.*;
import com.aliyun.resourcesharing20200110.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
      * ### [](#)
      * *   A principal needs to accept or reject a resource sharing invitation only if the principal is not the management account or a member of a resource directory. If you share resources with an object in a resource directory, the system automatically accepts the resource sharing invitation for the object.
      * *   A resource sharing invitation is valid for seven days. A principal must accept or reject the invitation within the validity period.
      * This topic provides an example on how to call the API operation to accept the resource sharing invitation whose ID is `i-pMnItMX19fBJ****` in the `cn-hangzhou` region.
      *
      * @param request AcceptResourceShareInvitationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AcceptResourceShareInvitationResponse
     */
    public AcceptResourceShareInvitationResponse acceptResourceShareInvitationWithOptions(AcceptResourceShareInvitationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareInvitationId)) {
            query.put("ResourceShareInvitationId", request.resourceShareInvitationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AcceptResourceShareInvitation"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AcceptResourceShareInvitationResponse());
    }

    /**
      * ### [](#)
      * *   A principal needs to accept or reject a resource sharing invitation only if the principal is not the management account or a member of a resource directory. If you share resources with an object in a resource directory, the system automatically accepts the resource sharing invitation for the object.
      * *   A resource sharing invitation is valid for seven days. A principal must accept or reject the invitation within the validity period.
      * This topic provides an example on how to call the API operation to accept the resource sharing invitation whose ID is `i-pMnItMX19fBJ****` in the `cn-hangzhou` region.
      *
      * @param request AcceptResourceShareInvitationRequest
      * @return AcceptResourceShareInvitationResponse
     */
    public AcceptResourceShareInvitationResponse acceptResourceShareInvitation(AcceptResourceShareInvitationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acceptResourceShareInvitationWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to call the API operation to associate the vSwitch `vsw-bp183p93qs667muql****` and the member `172050525300****` with the resource share `rs-6GRmdD3X****` in the `cn-hangzhou` region. After the association, the vSwitch is shared with the member.
      *
      * @param request AssociateResourceShareRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AssociateResourceShareResponse
     */
    public AssociateResourceShareResponse associateResourceShareWithOptions(AssociateResourceShareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.permissionNames)) {
            query.put("PermissionNames", request.permissionNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareId)) {
            query.put("ResourceShareId", request.resourceShareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targets)) {
            query.put("Targets", request.targets);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * This topic provides an example on how to call the API operation to associate the vSwitch `vsw-bp183p93qs667muql****` and the member `172050525300****` with the resource share `rs-6GRmdD3X****` in the `cn-hangzhou` region. After the association, the vSwitch is shared with the member.
      *
      * @param request AssociateResourceShareRequest
      * @return AssociateResourceShareResponse
     */
    public AssociateResourceShareResponse associateResourceShare(AssociateResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateResourceShareWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to call the API operation to associate the `AliyunRSDefaultPermissionVSwitch` permission with the `rs-6GRmdD3X****` resource share in the `cn-hangzhou` region.
      *
      * @param request AssociateResourceSharePermissionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AssociateResourceSharePermissionResponse
     */
    public AssociateResourceSharePermissionResponse associateResourceSharePermissionWithOptions(AssociateResourceSharePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.permissionName)) {
            query.put("PermissionName", request.permissionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replace)) {
            query.put("Replace", request.replace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareId)) {
            query.put("ResourceShareId", request.resourceShareId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateResourceSharePermission"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateResourceSharePermissionResponse());
    }

    /**
      * This topic provides an example on how to call the API operation to associate the `AliyunRSDefaultPermissionVSwitch` permission with the `rs-6GRmdD3X****` resource share in the `cn-hangzhou` region.
      *
      * @param request AssociateResourceSharePermissionRequest
      * @return AssociateResourceSharePermissionResponse
     */
    public AssociateResourceSharePermissionResponse associateResourceSharePermission(AssociateResourceSharePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateResourceSharePermissionWithOptions(request, runtime);
    }

    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    public CheckSharingWithResourceDirectoryStatusResponse checkSharingWithResourceDirectoryStatusWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckSharingWithResourceDirectoryStatus"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckSharingWithResourceDirectoryStatusResponse());
    }

    public CheckSharingWithResourceDirectoryStatusResponse checkSharingWithResourceDirectoryStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkSharingWithResourceDirectoryStatusWithOptions(runtime);
    }

    /**
      * Resource Sharing allows you to share your resources with one or more accounts and access the resources shared by other accounts. For more information, see [Resource Sharing overview](~~160622~~).
      * This topic provides an example on how to call the API operation to create a resource share named `test` in the `cn-hangzhou` region to share the vSwitch `vsw-bp183p93qs667muql****` with the member `172050525300****`. In this example, the management account of a resource directory is used to call this API operation.
      *
      * @param request CreateResourceShareRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateResourceShareResponse
     */
    public CreateResourceShareResponse createResourceShareWithOptions(CreateResourceShareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowExternalTargets)) {
            query.put("AllowExternalTargets", request.allowExternalTargets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionNames)) {
            query.put("PermissionNames", request.permissionNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareName)) {
            query.put("ResourceShareName", request.resourceShareName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targets)) {
            query.put("Targets", request.targets);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * Resource Sharing allows you to share your resources with one or more accounts and access the resources shared by other accounts. For more information, see [Resource Sharing overview](~~160622~~).
      * This topic provides an example on how to call the API operation to create a resource share named `test` in the `cn-hangzhou` region to share the vSwitch `vsw-bp183p93qs667muql****` with the member `172050525300****`. In this example, the management account of a resource directory is used to call this API operation.
      *
      * @param request CreateResourceShareRequest
      * @return CreateResourceShareResponse
     */
    public CreateResourceShareResponse createResourceShare(CreateResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourceShareWithOptions(request, runtime);
    }

    /**
      * After a resource share is deleted, all principals in the resource share can no longer access the resources in the resource share. However, the resources are not deleted with the resource share.
      * A resource share that is deleted is in the `Deleted` state. The system deletes the record of the resource share within 48 hours to 96 hours.
      * This topic provides an example on how to call the API operation to delete the resource share `rs-qSkW1HBY****` in the `cn-hangzhou` region.
      *
      * @param request DeleteResourceShareRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteResourceShareResponse
     */
    public DeleteResourceShareResponse deleteResourceShareWithOptions(DeleteResourceShareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareId)) {
            query.put("ResourceShareId", request.resourceShareId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * After a resource share is deleted, all principals in the resource share can no longer access the resources in the resource share. However, the resources are not deleted with the resource share.
      * A resource share that is deleted is in the `Deleted` state. The system deletes the record of the resource share within 48 hours to 96 hours.
      * This topic provides an example on how to call the API operation to delete the resource share `rs-qSkW1HBY****` in the `cn-hangzhou` region.
      *
      * @param request DeleteResourceShareRequest
      * @return DeleteResourceShareResponse
     */
    public DeleteResourceShareResponse deleteResourceShare(DeleteResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteResourceShareWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
      * *   A resource owner can call this API operation to remove shared resources or principals from a resource share.
      * *   If an Alibaba Cloud account that is not the management account or a member of a resource directory is added to a resource share as a principal, you can use the Alibaba Cloud account to call this API operation to exit the resource share. For more information, see [Exit a resource share](~~440614~~).
      * This topic provides an example on how to use the management account of a resource directory to call the API operation to remove the member `172050525300****` from the resource share `rs-6GRmdD3X****` in the `cn-hangzhou` region. After the member is removed from the resource share, the member cannot share the resources in the resource share.
      *
      * @param request DisassociateResourceShareRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DisassociateResourceShareResponse
     */
    public DisassociateResourceShareResponse disassociateResourceShareWithOptions(DisassociateResourceShareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwner)) {
            query.put("ResourceOwner", request.resourceOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareId)) {
            query.put("ResourceShareId", request.resourceShareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targets)) {
            query.put("Targets", request.targets);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * *   A resource owner can call this API operation to remove shared resources or principals from a resource share.
      * *   If an Alibaba Cloud account that is not the management account or a member of a resource directory is added to a resource share as a principal, you can use the Alibaba Cloud account to call this API operation to exit the resource share. For more information, see [Exit a resource share](~~440614~~).
      * This topic provides an example on how to use the management account of a resource directory to call the API operation to remove the member `172050525300****` from the resource share `rs-6GRmdD3X****` in the `cn-hangzhou` region. After the member is removed from the resource share, the member cannot share the resources in the resource share.
      *
      * @param request DisassociateResourceShareRequest
      * @return DisassociateResourceShareResponse
     */
    public DisassociateResourceShareResponse disassociateResourceShare(DisassociateResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disassociateResourceShareWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to call the API operation to disassociate the `AliyunRSDefaultPermissionVSwitch` permission from the `rs-6GRmdD3X****` resource share in the `cn-hangzhou` region.
      *
      * @param request DisassociateResourceSharePermissionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DisassociateResourceSharePermissionResponse
     */
    public DisassociateResourceSharePermissionResponse disassociateResourceSharePermissionWithOptions(DisassociateResourceSharePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.permissionName)) {
            query.put("PermissionName", request.permissionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareId)) {
            query.put("ResourceShareId", request.resourceShareId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisassociateResourceSharePermission"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisassociateResourceSharePermissionResponse());
    }

    /**
      * This topic provides an example on how to call the API operation to disassociate the `AliyunRSDefaultPermissionVSwitch` permission from the `rs-6GRmdD3X****` resource share in the `cn-hangzhou` region.
      *
      * @param request DisassociateResourceSharePermissionRequest
      * @return DisassociateResourceSharePermissionResponse
     */
    public DisassociateResourceSharePermissionResponse disassociateResourceSharePermission(DisassociateResourceSharePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disassociateResourceSharePermissionWithOptions(request, runtime);
    }

    /**
      * You can share your resources with all members in your resource directory, all members in a specific folder in your resource directory, or a specific member in your resource directory as a resource owner only after you enable resource sharing for your resource directory.
      * You can call this API operation only by using the management account of your resource directory or a RAM user or RAM role to which the required permissions are granted within the management account.
      *
      * @param request EnableSharingWithResourceDirectoryRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return EnableSharingWithResourceDirectoryResponse
     */
    public EnableSharingWithResourceDirectoryResponse enableSharingWithResourceDirectoryWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * You can share your resources with all members in your resource directory, all members in a specific folder in your resource directory, or a specific member in your resource directory as a resource owner only after you enable resource sharing for your resource directory.
      * You can call this API operation only by using the management account of your resource directory or a RAM user or RAM role to which the required permissions are granted within the management account.
      *
      * @return EnableSharingWithResourceDirectoryResponse
     */
    public EnableSharingWithResourceDirectoryResponse enableSharingWithResourceDirectory() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSharingWithResourceDirectoryWithOptions(runtime);
    }

    /**
      * This topic provides an example on how to call the API operation to query the information about the `AliyunRSDefaultPermissionVSwitch` permission whose version is `v1` in the `cn-hangzhou` region.
      *
      * @param request GetPermissionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetPermissionResponse
     */
    public GetPermissionResponse getPermissionWithOptions(GetPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.permissionName)) {
            query.put("PermissionName", request.permissionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionVersion)) {
            query.put("PermissionVersion", request.permissionVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPermission"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPermissionResponse());
    }

    /**
      * This topic provides an example on how to call the API operation to query the information about the `AliyunRSDefaultPermissionVSwitch` permission whose version is `v1` in the `cn-hangzhou` region.
      *
      * @param request GetPermissionRequest
      * @return GetPermissionResponse
     */
    public GetPermissionResponse getPermission(GetPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPermissionWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to call the API operation to query the versions of the `AliyunRSDefaultPermissionVSwitch` permission in the `cn-hangzhou` region.
      *
      * @param request ListPermissionVersionsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListPermissionVersionsResponse
     */
    public ListPermissionVersionsResponse listPermissionVersionsWithOptions(ListPermissionVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionName)) {
            query.put("PermissionName", request.permissionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPermissionVersions"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPermissionVersionsResponse());
    }

    /**
      * This topic provides an example on how to call the API operation to query the versions of the `AliyunRSDefaultPermissionVSwitch` permission in the `cn-hangzhou` region.
      *
      * @param request ListPermissionVersionsRequest
      * @return ListPermissionVersionsResponse
     */
    public ListPermissionVersionsResponse listPermissionVersions(ListPermissionVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPermissionVersionsWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to call the API operation to query the information about the default permission for the `VSwitch` resource type in the `cn-hangzhou` region.
      *
      * @param request ListPermissionsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListPermissionsResponse
     */
    public ListPermissionsResponse listPermissionsWithOptions(ListPermissionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPermissions"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPermissionsResponse());
    }

    /**
      * This topic provides an example on how to call the API operation to query the information about the default permission for the `VSwitch` resource type in the `cn-hangzhou` region.
      *
      * @param request ListPermissionsRequest
      * @return ListPermissionsResponse
     */
    public ListPermissionsResponse listPermissions(ListPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPermissionsWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to call the API operation to query the association records of the resource shares that are created by using the current Alibaba Cloud account in the `cn-hangzhou` region. The response shows the following records:
      * *   The resource `vsw-bp1upw03qyz8n7us9****` of the `VSwitch` type has been associated with the resource share `rs-6GRmdD3X****`. The resource is in the `Associated` state. This indicates that the resource is being shared.
      * *   The resource `vsw-bp183p93qs667muql****` of the `VSwitch` type has been disassociated from the resource share `rs-6GRmdD3X****`. The resource is in the `Disassociated` state. This indicates that the sharing of the resource is stopped.
      *
      * @param request ListResourceShareAssociationsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListResourceShareAssociationsResponse
     */
    public ListResourceShareAssociationsResponse listResourceShareAssociationsWithOptions(ListResourceShareAssociationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * This topic provides an example on how to call the API operation to query the association records of the resource shares that are created by using the current Alibaba Cloud account in the `cn-hangzhou` region. The response shows the following records:
      * *   The resource `vsw-bp1upw03qyz8n7us9****` of the `VSwitch` type has been associated with the resource share `rs-6GRmdD3X****`. The resource is in the `Associated` state. This indicates that the resource is being shared.
      * *   The resource `vsw-bp183p93qs667muql****` of the `VSwitch` type has been disassociated from the resource share `rs-6GRmdD3X****`. The resource is in the `Disassociated` state. This indicates that the sharing of the resource is stopped.
      *
      * @param request ListResourceShareAssociationsRequest
      * @return ListResourceShareAssociationsResponse
     */
    public ListResourceShareAssociationsResponse listResourceShareAssociations(ListResourceShareAssociationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceShareAssociationsWithOptions(request, runtime);
    }

    /**
      * ### [](#)
      * This topic provides an example on how to call the API operation to query the resource sharing invitations that are received by the current account in the `cn-hangzhou` region. The response shows that one invitation is received by the current account and is waiting for confirmation.
      *
      * @param request ListResourceShareInvitationsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListResourceShareInvitationsResponse
     */
    public ListResourceShareInvitationsResponse listResourceShareInvitationsWithOptions(ListResourceShareInvitationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareIds)) {
            query.put("ResourceShareIds", request.resourceShareIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareInvitationIds)) {
            query.put("ResourceShareInvitationIds", request.resourceShareInvitationIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceShareInvitations"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceShareInvitationsResponse());
    }

    /**
      * ### [](#)
      * This topic provides an example on how to call the API operation to query the resource sharing invitations that are received by the current account in the `cn-hangzhou` region. The response shows that one invitation is received by the current account and is waiting for confirmation.
      *
      * @param request ListResourceShareInvitationsRequest
      * @return ListResourceShareInvitationsResponse
     */
    public ListResourceShareInvitationsResponse listResourceShareInvitations(ListResourceShareInvitationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceShareInvitationsWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to call the API operation to query the permissions that are associated with the resource share created by using the current Alibaba Cloud account in the `cn-hangzhou` region.
      *
      * @param request ListResourceSharePermissionsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListResourceSharePermissionsResponse
     */
    public ListResourceSharePermissionsResponse listResourceSharePermissionsWithOptions(ListResourceSharePermissionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareId)) {
            query.put("ResourceShareId", request.resourceShareId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceSharePermissions"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceSharePermissionsResponse());
    }

    /**
      * This topic provides an example on how to call the API operation to query the permissions that are associated with the resource share created by using the current Alibaba Cloud account in the `cn-hangzhou` region.
      *
      * @param request ListResourceSharePermissionsRequest
      * @return ListResourceSharePermissionsResponse
     */
    public ListResourceSharePermissionsResponse listResourceSharePermissions(ListResourceSharePermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceSharePermissionsWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to call the API operation to query the resource shares that are created by using the current Alibaba Cloud account in the `cn-hangzhou` region. The response shows that the following resource shares are created by using the account whose ID is `151266687691****`:
      * *   `rs-hX9wC5jO****`, which is in the `Deleted` state
      * *   `rs-PqysnzIj****`, which is in the `Active` state
      *
      * @param request ListResourceSharesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListResourceSharesResponse
     */
    public ListResourceSharesResponse listResourceSharesWithOptions(ListResourceSharesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionName)) {
            query.put("PermissionName", request.permissionName);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * This topic provides an example on how to call the API operation to query the resource shares that are created by using the current Alibaba Cloud account in the `cn-hangzhou` region. The response shows that the following resource shares are created by using the account whose ID is `151266687691****`:
      * *   `rs-hX9wC5jO****`, which is in the `Deleted` state
      * *   `rs-PqysnzIj****`, which is in the `Active` state
      *
      * @param request ListResourceSharesRequest
      * @return ListResourceSharesResponse
     */
    public ListResourceSharesResponse listResourceShares(ListResourceSharesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceSharesWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to call the API operation to query the resources that you share with other accounts in the `cn-hangzhou` region. The response shows that in the resource share `rs-6GRmdD3X****`, you share the `vsw-bp1upw03qyz8n7us9****` resource of the `VSwitch` type with other accounts.
      *
      * @param request ListSharedResourcesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListSharedResourcesResponse
     */
    public ListSharedResourcesResponse listSharedResourcesWithOptions(ListSharedResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * This topic provides an example on how to call the API operation to query the resources that you share with other accounts in the `cn-hangzhou` region. The response shows that in the resource share `rs-6GRmdD3X****`, you share the `vsw-bp1upw03qyz8n7us9****` resource of the `VSwitch` type with other accounts.
      *
      * @param request ListSharedResourcesRequest
      * @return ListSharedResourcesResponse
     */
    public ListSharedResourcesResponse listSharedResources(ListSharedResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSharedResourcesWithOptions(request, runtime);
    }

    /**
      * If you are a resource owner, you can query the principals with which you share your resources.
      * If you are a principal, you can query the resources that are shared with you.
      * This topic provides an example on how to call the API operation to query the principals with which you share your resources in the `cn-hangzhou` region. The response shows that you share your resources with the principals `114240524784****` and `172050525300****`.
      *
      * @param request ListSharedTargetsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListSharedTargetsResponse
     */
    public ListSharedTargetsResponse listSharedTargetsWithOptions(ListSharedTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * If you are a resource owner, you can query the principals with which you share your resources.
      * If you are a principal, you can query the resources that are shared with you.
      * This topic provides an example on how to call the API operation to query the principals with which you share your resources in the `cn-hangzhou` region. The response shows that you share your resources with the principals `114240524784****` and `172050525300****`.
      *
      * @param request ListSharedTargetsRequest
      * @return ListSharedTargetsResponse
     */
    public ListSharedTargetsResponse listSharedTargets(ListSharedTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSharedTargetsWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to call the API operation to reject the resource sharing invitation `i-yyTWbkjHArYh****` in the `cn-hangzhou` region.
      *
      * @param request RejectResourceShareInvitationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RejectResourceShareInvitationResponse
     */
    public RejectResourceShareInvitationResponse rejectResourceShareInvitationWithOptions(RejectResourceShareInvitationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareInvitationId)) {
            query.put("ResourceShareInvitationId", request.resourceShareInvitationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RejectResourceShareInvitation"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RejectResourceShareInvitationResponse());
    }

    /**
      * This topic provides an example on how to call the API operation to reject the resource sharing invitation `i-yyTWbkjHArYh****` in the `cn-hangzhou` region.
      *
      * @param request RejectResourceShareInvitationRequest
      * @return RejectResourceShareInvitationResponse
     */
    public RejectResourceShareInvitationResponse rejectResourceShareInvitation(RejectResourceShareInvitationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rejectResourceShareInvitationWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to change the name or resource sharing scope of a resource share.
      * This topic provides an example on how to call the API operation to change the name of the resource share `rs-qSkW1HBY****` in the `cn-hangzhou` region from `test` to `new`.
      *
      * @param request UpdateResourceShareRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateResourceShareResponse
     */
    public UpdateResourceShareResponse updateResourceShareWithOptions(UpdateResourceShareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowExternalTargets)) {
            query.put("AllowExternalTargets", request.allowExternalTargets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareId)) {
            query.put("ResourceShareId", request.resourceShareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareName)) {
            query.put("ResourceShareName", request.resourceShareName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
      * You can call this API operation to change the name or resource sharing scope of a resource share.
      * This topic provides an example on how to call the API operation to change the name of the resource share `rs-qSkW1HBY****` in the `cn-hangzhou` region from `test` to `new`.
      *
      * @param request UpdateResourceShareRequest
      * @return UpdateResourceShareResponse
     */
    public UpdateResourceShareResponse updateResourceShare(UpdateResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResourceShareWithOptions(request, runtime);
    }
}

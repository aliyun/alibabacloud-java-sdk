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
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <ul>
     * <li>A principal needs to accept or reject a resource sharing invitation only if the principal is not the management account or a member of a resource directory. If you share resources with an object in a resource directory, the system automatically accepts the resource sharing invitation for the object.</li>
     * <li>A resource sharing invitation is valid for seven days. A principal must accept or reject the invitation within the validity period.
     * This topic provides an example on how to call the API operation to accept the resource sharing invitation whose ID is <code>i-pMnItMX19fBJ****</code> in the <code>cn-hangzhou</code> region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Accepts a resource sharing invitation.</p>
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
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <ul>
     * <li>A principal needs to accept or reject a resource sharing invitation only if the principal is not the management account or a member of a resource directory. If you share resources with an object in a resource directory, the system automatically accepts the resource sharing invitation for the object.</li>
     * <li>A resource sharing invitation is valid for seven days. A principal must accept or reject the invitation within the validity period.
     * This topic provides an example on how to call the API operation to accept the resource sharing invitation whose ID is <code>i-pMnItMX19fBJ****</code> in the <code>cn-hangzhou</code> region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Accepts a resource sharing invitation.</p>
     * 
     * @param request AcceptResourceShareInvitationRequest
     * @return AcceptResourceShareInvitationResponse
     */
    public AcceptResourceShareInvitationResponse acceptResourceShareInvitation(AcceptResourceShareInvitationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acceptResourceShareInvitationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to associate the vSwitch <code>vsw-bp183p93qs667muql****</code> and the member <code>172050525300****</code> with the resource share <code>rs-6GRmdD3X****</code> in the <code>cn-hangzhou</code> region. After the association, the vSwitch is shared with the member.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates resources or principals with a resource share.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceArns)) {
            query.put("ResourceArns", request.resourceArns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceProperties)) {
            query.put("ResourceProperties", request.resourceProperties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareId)) {
            query.put("ResourceShareId", request.resourceShareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetProperties)) {
            query.put("TargetProperties", request.targetProperties);
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to associate the vSwitch <code>vsw-bp183p93qs667muql****</code> and the member <code>172050525300****</code> with the resource share <code>rs-6GRmdD3X****</code> in the <code>cn-hangzhou</code> region. After the association, the vSwitch is shared with the member.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates resources or principals with a resource share.</p>
     * 
     * @param request AssociateResourceShareRequest
     * @return AssociateResourceShareResponse
     */
    public AssociateResourceShareResponse associateResourceShare(AssociateResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateResourceShareWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to associate the <code>AliyunRSDefaultPermissionVSwitch</code> permission with the <code>rs-6GRmdD3X****</code> resource share in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates permissions with a resource share.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to associate the <code>AliyunRSDefaultPermissionVSwitch</code> permission with the <code>rs-6GRmdD3X****</code> resource share in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates permissions with a resource share.</p>
     * 
     * @param request AssociateResourceSharePermissionRequest
     * @return AssociateResourceSharePermissionResponse
     */
    public AssociateResourceSharePermissionResponse associateResourceSharePermission(AssociateResourceSharePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateResourceSharePermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Transfers a resource share from one resource group to another.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Transfers a resource share from one resource group to another.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the status of resource sharing within a resource directory.</p>
     * 
     * @param request CheckSharingWithResourceDirectoryStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckSharingWithResourceDirectoryStatusResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Checks the status of resource sharing within a resource directory.</p>
     * @return CheckSharingWithResourceDirectoryStatusResponse
     */
    public CheckSharingWithResourceDirectoryStatusResponse checkSharingWithResourceDirectoryStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkSharingWithResourceDirectoryStatusWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>Resource Sharing allows you to share your resources with one or more accounts and access the resources shared by other accounts. For more information, see <a href="https://help.aliyun.com/document_detail/160622.html">Resource Sharing overview</a>.
     * This topic provides an example on how to call the API operation to create a resource share named <code>test</code> in the <code>cn-hangzhou</code> region to share the vSwitch <code>vsw-bp183p93qs667muql****</code> with the member <code>172050525300****</code> in a resource directory. In this example, the management account of the resource directory is used to call this API operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a resource share.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceArns)) {
            query.put("ResourceArns", request.resourceArns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceProperties)) {
            query.put("ResourceProperties", request.resourceProperties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShareName)) {
            query.put("ResourceShareName", request.resourceShareName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetProperties)) {
            query.put("TargetProperties", request.targetProperties);
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
     * <b>description</b> :
     * <p>Resource Sharing allows you to share your resources with one or more accounts and access the resources shared by other accounts. For more information, see <a href="https://help.aliyun.com/document_detail/160622.html">Resource Sharing overview</a>.
     * This topic provides an example on how to call the API operation to create a resource share named <code>test</code> in the <code>cn-hangzhou</code> region to share the vSwitch <code>vsw-bp183p93qs667muql****</code> with the member <code>172050525300****</code> in a resource directory. In this example, the management account of the resource directory is used to call this API operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a resource share.</p>
     * 
     * @param request CreateResourceShareRequest
     * @return CreateResourceShareResponse
     */
    public CreateResourceShareResponse createResourceShare(CreateResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourceShareWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After a resource share is deleted, all principals in the resource share can no longer access the resources in the resource share. However, the resources are not deleted with the resource share.
     * A resource share that is deleted is in the <code>Deleted</code> state. The system deletes the record of the resource share within 48 hours to 96 hours.
     * This topic provides an example on how to call the API operation to delete the resource share <code>rs-qSkW1HBY****</code> in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a resource share.</p>
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
     * <b>description</b> :
     * <p>After a resource share is deleted, all principals in the resource share can no longer access the resources in the resource share. However, the resources are not deleted with the resource share.
     * A resource share that is deleted is in the <code>Deleted</code> state. The system deletes the record of the resource share within 48 hours to 96 hours.
     * This topic provides an example on how to call the API operation to delete the resource share <code>rs-qSkW1HBY****</code> in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a resource share.</p>
     * 
     * @param request DeleteResourceShareRequest
     * @return DeleteResourceShareResponse
     */
    public DeleteResourceShareResponse deleteResourceShare(DeleteResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteResourceShareWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the regions where the Resource Sharing service is available.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the regions where the Resource Sharing service is available.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  A resource owner can call this API operation to disassociate shared resources or principals from a resource share.</p>
     * <ul>
     * <li>If a principal does not belong to a resource directory, the principal can call this API operation to exit the resource share. For more information, see <a href="https://help.aliyun.com/document_detail/440614.html">Exit a resource share</a>.
     * This topic provides an example on how to use the management account of a resource directory to call the API operation to disassociate the member <code>172050525300****</code> from the resource share <code>rs-6GRmdD3X****</code> in the <code>cn-hangzhou</code> region. After the member is disassociated from the resource share, the member cannot share the resources in the resource share.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates resources or principals from a resource share.</p>
     * 
     * @param request DisassociateResourceShareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisassociateResourceShareResponse
     */
    public DisassociateResourceShareResponse disassociateResourceShareWithOptions(DisassociateResourceShareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceArns)) {
            query.put("ResourceArns", request.resourceArns);
        }

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
     * <b>description</b> :
     * <p>  A resource owner can call this API operation to disassociate shared resources or principals from a resource share.</p>
     * <ul>
     * <li>If a principal does not belong to a resource directory, the principal can call this API operation to exit the resource share. For more information, see <a href="https://help.aliyun.com/document_detail/440614.html">Exit a resource share</a>.
     * This topic provides an example on how to use the management account of a resource directory to call the API operation to disassociate the member <code>172050525300****</code> from the resource share <code>rs-6GRmdD3X****</code> in the <code>cn-hangzhou</code> region. After the member is disassociated from the resource share, the member cannot share the resources in the resource share.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates resources or principals from a resource share.</p>
     * 
     * @param request DisassociateResourceShareRequest
     * @return DisassociateResourceShareResponse
     */
    public DisassociateResourceShareResponse disassociateResourceShare(DisassociateResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disassociateResourceShareWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to disassociate the <code>AliyunRSDefaultPermissionVSwitch</code> permission from the <code>rs-6GRmdD3X****</code> resource share in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a permission from a resource share. You can disassociate a permission from a resource share only if the resource share does not contain resources of the type indicated by the permission.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to disassociate the <code>AliyunRSDefaultPermissionVSwitch</code> permission from the <code>rs-6GRmdD3X****</code> resource share in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a permission from a resource share. You can disassociate a permission from a resource share only if the resource share does not contain resources of the type indicated by the permission.</p>
     * 
     * @param request DisassociateResourceSharePermissionRequest
     * @return DisassociateResourceSharePermissionResponse
     */
    public DisassociateResourceSharePermissionResponse disassociateResourceSharePermission(DisassociateResourceSharePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disassociateResourceSharePermissionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can share your resources with all members in your resource directory, all members in a specific folder in your resource directory, or a specific member in your resource directory as a resource owner only after you enable resource sharing for your resource directory.
     * You can call this API operation only by using the management account of your resource directory or a RAM user or RAM role to which the required permissions are granted within the management account.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables resource sharing for a resource directory.</p>
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
     * <b>description</b> :
     * <p>You can share your resources with all members in your resource directory, all members in a specific folder in your resource directory, or a specific member in your resource directory as a resource owner only after you enable resource sharing for your resource directory.
     * You can call this API operation only by using the management account of your resource directory or a RAM user or RAM role to which the required permissions are granted within the management account.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables resource sharing for a resource directory.</p>
     * @return EnableSharingWithResourceDirectoryResponse
     */
    public EnableSharingWithResourceDirectoryResponse enableSharingWithResourceDirectory() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSharingWithResourceDirectoryWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the information about the <code>AliyunRSDefaultPermissionVSwitch</code> permission whose version is <code>v1</code> in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a permission.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the information about the <code>AliyunRSDefaultPermissionVSwitch</code> permission whose version is <code>v1</code> in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a permission.</p>
     * 
     * @param request GetPermissionRequest
     * @return GetPermissionResponse
     */
    public GetPermissionResponse getPermission(GetPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPermissionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the versions of the <code>AliyunRSDefaultPermissionVSwitch</code> permission in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the versions of a permission.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the versions of the <code>AliyunRSDefaultPermissionVSwitch</code> permission in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the versions of a permission.</p>
     * 
     * @param request ListPermissionVersionsRequest
     * @return ListPermissionVersionsResponse
     */
    public ListPermissionVersionsResponse listPermissionVersions(ListPermissionVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPermissionVersionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the information about the default permission for the <code>VSwitch</code> resource type in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the default permission.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the information about the default permission for the <code>VSwitch</code> resource type in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the default permission.</p>
     * 
     * @param request ListPermissionsRequest
     * @return ListPermissionsResponse
     */
    public ListPermissionsResponse listPermissions(ListPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPermissionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the association records of the resource shares that are created by using the current Alibaba Cloud account in the <code>cn-hangzhou</code> region. The response shows the following records:</p>
     * <ul>
     * <li>The resource <code>vsw-bp1upw03qyz8n7us9****</code> of the <code>VSwitch</code> type has been associated with the resource share <code>rs-6GRmdD3X****</code>. The resource is in the <code>Associated</code> state. This indicates that the resource is being shared.</li>
     * <li>The resource <code>vsw-bp183p93qs667muql****</code> of the <code>VSwitch</code> type has been disassociated from the resource share <code>rs-6GRmdD3X****</code>. The resource is in the <code>Disassociated</code> state. This indicates that the sharing of the resource is stopped.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the association records of resource shares.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceArn)) {
            query.put("ResourceArn", request.resourceArn);
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the association records of the resource shares that are created by using the current Alibaba Cloud account in the <code>cn-hangzhou</code> region. The response shows the following records:</p>
     * <ul>
     * <li>The resource <code>vsw-bp1upw03qyz8n7us9****</code> of the <code>VSwitch</code> type has been associated with the resource share <code>rs-6GRmdD3X****</code>. The resource is in the <code>Associated</code> state. This indicates that the resource is being shared.</li>
     * <li>The resource <code>vsw-bp183p93qs667muql****</code> of the <code>VSwitch</code> type has been disassociated from the resource share <code>rs-6GRmdD3X****</code>. The resource is in the <code>Disassociated</code> state. This indicates that the sharing of the resource is stopped.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the association records of resource shares.</p>
     * 
     * @param request ListResourceShareAssociationsRequest
     * @return ListResourceShareAssociationsResponse
     */
    public ListResourceShareAssociationsResponse listResourceShareAssociations(ListResourceShareAssociationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceShareAssociationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <p>This topic provides an example on how to call the API operation to query the resource sharing invitations that are received by the current account in the <code>cn-hangzhou</code> region. The response shows that one invitation is received by the current account and is waiting for confirmation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource sharing invitations that are received.</p>
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
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <p>This topic provides an example on how to call the API operation to query the resource sharing invitations that are received by the current account in the <code>cn-hangzhou</code> region. The response shows that one invitation is received by the current account and is waiting for confirmation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource sharing invitations that are received.</p>
     * 
     * @param request ListResourceShareInvitationsRequest
     * @return ListResourceShareInvitationsResponse
     */
    public ListResourceShareInvitationsResponse listResourceShareInvitations(ListResourceShareInvitationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceShareInvitationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the permissions that are associated with the resource share created by using the current Alibaba Cloud account in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the permissions that are associated with a resource share.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the permissions that are associated with the resource share created by using the current Alibaba Cloud account in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the permissions that are associated with a resource share.</p>
     * 
     * @param request ListResourceSharePermissionsRequest
     * @return ListResourceSharePermissionsResponse
     */
    public ListResourceSharePermissionsResponse listResourceSharePermissions(ListResourceSharePermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceSharePermissionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the resource shares that are created by using the current Alibaba Cloud account in the <code>cn-hangzhou</code> region. The response shows that the following resource shares are created within the account <code>151266687691****</code>:</p>
     * <ul>
     * <li><code>rs-hX9wC5jO****</code>, which is in the <code>Deleted</code> state</li>
     * <li><code>rs-PqysnzIj****</code>, which is in the <code>Active</code> state</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries resource shares.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the resource shares that are created by using the current Alibaba Cloud account in the <code>cn-hangzhou</code> region. The response shows that the following resource shares are created within the account <code>151266687691****</code>:</p>
     * <ul>
     * <li><code>rs-hX9wC5jO****</code>, which is in the <code>Deleted</code> state</li>
     * <li><code>rs-PqysnzIj****</code>, which is in the <code>Active</code> state</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries resource shares.</p>
     * 
     * @param request ListResourceSharesRequest
     * @return ListResourceSharesResponse
     */
    public ListResourceSharesResponse listResourceShares(ListResourceSharesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceSharesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the resources that you share with other accounts in the <code>cn-hangzhou</code> region. The response shows that in the resource share <code>rs-6GRmdD3X****</code>, you share the <code>vsw-bp1upw03qyz8n7us9****</code> resource of the <code>VSwitch</code> type with other accounts.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resources you share with other accounts or the resources other accounts share with you.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceArns)) {
            query.put("ResourceArns", request.resourceArns);
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the resources that you share with other accounts in the <code>cn-hangzhou</code> region. The response shows that in the resource share <code>rs-6GRmdD3X****</code>, you share the <code>vsw-bp1upw03qyz8n7us9****</code> resource of the <code>VSwitch</code> type with other accounts.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resources you share with other accounts or the resources other accounts share with you.</p>
     * 
     * @param request ListSharedResourcesRequest
     * @return ListSharedResourcesResponse
     */
    public ListSharedResourcesResponse listSharedResources(ListSharedResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSharedResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you are a resource owner, you can query the principals with which you share your resources. If you are a principal, you can query the resources that are shared with you.
     * This topic provides an example on how to call the API operation to query the principals with which you share your resources in the <code>cn-hangzhou</code> region. The response shows that you share your resources with the principals <code>114240524784****</code> and <code>172050525300****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries principals.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceArn)) {
            query.put("ResourceArn", request.resourceArn);
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
     * <b>description</b> :
     * <p>If you are a resource owner, you can query the principals with which you share your resources. If you are a principal, you can query the resources that are shared with you.
     * This topic provides an example on how to call the API operation to query the principals with which you share your resources in the <code>cn-hangzhou</code> region. The response shows that you share your resources with the principals <code>114240524784****</code> and <code>172050525300****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries principals.</p>
     * 
     * @param request ListSharedTargetsRequest
     * @return ListSharedTargetsResponse
     */
    public ListSharedTargetsResponse listSharedTargets(ListSharedTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSharedTargetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are added to resource shares.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are added to resource shares.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to reject the resource sharing invitation <code>i-yyTWbkjHArYh****</code> in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>拒绝组织外共享邀请</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to reject the resource sharing invitation <code>i-yyTWbkjHArYh****</code> in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>拒绝组织外共享邀请</p>
     * 
     * @param request RejectResourceShareInvitationRequest
     * @return RejectResourceShareInvitationResponse
     */
    public RejectResourceShareInvitationResponse rejectResourceShareInvitation(RejectResourceShareInvitationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rejectResourceShareInvitationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to a resource share.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to a resource share.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from resource shares.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2020-01-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from resource shares.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to change the name or resource sharing scope of a resource share.
     * This topic provides an example on how to call the API operation to change the name of the resource share <code>rs-qSkW1HBY****</code> in the <code>cn-hangzhou</code> region from <code>test</code> to <code>new</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>调用UpdateResourceShare修改共享单元基本信息。</p>
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
     * <b>description</b> :
     * <p>You can call this API operation to change the name or resource sharing scope of a resource share.
     * This topic provides an example on how to call the API operation to change the name of the resource share <code>rs-qSkW1HBY****</code> in the <code>cn-hangzhou</code> region from <code>test</code> to <code>new</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>调用UpdateResourceShare修改共享单元基本信息。</p>
     * 
     * @param request UpdateResourceShareRequest
     * @return UpdateResourceShareResponse
     */
    public UpdateResourceShareResponse updateResourceShare(UpdateResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResourceShareWithOptions(request, runtime);
    }
}

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
      * The ID of the resource sharing invitation.
      * You can call the [ListResourceShareInvitations](~~450564~~) operation to obtain the ID of a resource sharing invitation.
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
      * The ID of the resource sharing invitation.
      * You can call the [ListResourceShareInvitations](~~450564~~) operation to obtain the ID of a resource sharing invitation.
      *
      * @param request AcceptResourceShareInvitationRequest
      * @return AcceptResourceShareInvitationResponse
     */
    public AcceptResourceShareInvitationResponse acceptResourceShareInvitation(AcceptResourceShareInvitationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acceptResourceShareInvitationWithOptions(request, runtime);
    }

    /**
      * The operation that you want to perform. Set the value to AssociateResourceShare.
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
      * The operation that you want to perform. Set the value to AssociateResourceShare.
      *
      * @param request AssociateResourceShareRequest
      * @return AssociateResourceShareResponse
     */
    public AssociateResourceShareResponse associateResourceShare(AssociateResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateResourceShareWithOptions(request, runtime);
    }

    /**
      * The name of the permission.
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
      * The name of the permission.
      *
      * @param request AssociateResourceSharePermissionRequest
      * @return AssociateResourceSharePermissionResponse
     */
    public AssociateResourceSharePermissionResponse associateResourceSharePermission(AssociateResourceSharePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateResourceSharePermissionWithOptions(request, runtime);
    }

    /**
      * The operation that you want to perform. Set the value to CreateResourceShare.
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
      * The operation that you want to perform. Set the value to CreateResourceShare.
      *
      * @param request CreateResourceShareRequest
      * @return CreateResourceShareResponse
     */
    public CreateResourceShareResponse createResourceShare(CreateResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourceShareWithOptions(request, runtime);
    }

    /**
      * The operation that you want to perform. Set the value to DeleteResourceShare.
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
      * The operation that you want to perform. Set the value to DeleteResourceShare.
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
      * The operation that you want to perform. Set the value to DisassociateResourceShare.
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
      * The operation that you want to perform. Set the value to DisassociateResourceShare.
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
      * ## Limits
      * You can call this operation up to 20 times per second per account. This operation is globally limited to 500 times per second across all accounts. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
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
      * ## Limits
      * You can call this operation up to 20 times per second per account. This operation is globally limited to 500 times per second across all accounts. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
      *
      * @param request DisassociateResourceSharePermissionRequest
      * @return DisassociateResourceSharePermissionResponse
     */
    public DisassociateResourceSharePermissionResponse disassociateResourceSharePermission(DisassociateResourceSharePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disassociateResourceSharePermissionWithOptions(request, runtime);
    }

    /**
      * The operation that you want to perform. Set the value to EnableSharingWithResourceDirectory.
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
      * The operation that you want to perform. Set the value to EnableSharingWithResourceDirectory.
      *
      * @return EnableSharingWithResourceDirectoryResponse
     */
    public EnableSharingWithResourceDirectoryResponse enableSharingWithResourceDirectory() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSharingWithResourceDirectoryWithOptions(runtime);
    }

    /**
      * The version of the permission.
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
      * The version of the permission.
      *
      * @param request GetPermissionRequest
      * @return GetPermissionResponse
     */
    public GetPermissionResponse getPermission(GetPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPermissionWithOptions(request, runtime);
    }

    /**
      * The maximum number of entries to return for a single request.
      * Valid values: 1 to 100. Default value: 20.
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
      * The maximum number of entries to return for a single request.
      * Valid values: 1 to 100. Default value: 20.
      *
      * @param request ListPermissionVersionsRequest
      * @return ListPermissionVersionsResponse
     */
    public ListPermissionVersionsResponse listPermissionVersions(ListPermissionVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPermissionVersionsWithOptions(request, runtime);
    }

    /**
      * The maximum number of entries to return for a single request.
      * Valid values: 1 to 100. Default value: 20.
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
      * The maximum number of entries to return for a single request.
      * Valid values: 1 to 100. Default value: 20.
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
      * ## Limits
      * You can call this operation up to 20 times per second per account. This operation is globally limited to 500 times per second across all accounts. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
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
      * ## Limits
      * You can call this operation up to 20 times per second per account. This operation is globally limited to 500 times per second across all accounts. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
      *
      * @param request ListResourceShareAssociationsRequest
      * @return ListResourceShareAssociationsResponse
     */
    public ListResourceShareAssociationsResponse listResourceShareAssociations(ListResourceShareAssociationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceShareAssociationsWithOptions(request, runtime);
    }

    /**
      * The maximum number of entries to return for a single request.
      * Valid values: 1 to 100. Default value: 20.
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
      * The maximum number of entries to return for a single request.
      * Valid values: 1 to 100. Default value: 20.
      *
      * @param request ListResourceShareInvitationsRequest
      * @return ListResourceShareInvitationsResponse
     */
    public ListResourceShareInvitationsResponse listResourceShareInvitations(ListResourceShareInvitationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceShareInvitationsWithOptions(request, runtime);
    }

    /**
      * The maximum number of entries to return for a single request.
      * Valid values: 1 to 100. Default value: 20.
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
      * The maximum number of entries to return for a single request.
      * Valid values: 1 to 100. Default value: 20.
      *
      * @param request ListResourceSharePermissionsRequest
      * @return ListResourceSharePermissionsResponse
     */
    public ListResourceSharePermissionsResponse listResourceSharePermissions(ListResourceSharePermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceSharePermissionsWithOptions(request, runtime);
    }

    /**
      * The operation that you want to perform. Set the value to ListResourceShares.
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
      * The operation that you want to perform. Set the value to ListResourceShares.
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
      * ## Limits
      * You can call this operation up to 20 times per second per account. This operation is globally limited to 500 times per second across all accounts. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
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
      * ## Limits
      * You can call this operation up to 20 times per second per account. This operation is globally limited to 500 times per second across all accounts. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
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
      * ## Limits
      * You can call this operation up to 20 times per second per account. This operation is globally limited to 500 times per second across all accounts. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
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
      * ## Limits
      * You can call this operation up to 20 times per second per account. This operation is globally limited to 500 times per second across all accounts. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
      *
      * @param request ListSharedTargetsRequest
      * @return ListSharedTargetsResponse
     */
    public ListSharedTargetsResponse listSharedTargets(ListSharedTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSharedTargetsWithOptions(request, runtime);
    }

    /**
      * The ID of the resource sharing invitation.
      * You can call the [ListResourceShareInvitations](~~450564~~) operation to obtain the ID of a resource sharing invitation.
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
      * The ID of the resource sharing invitation.
      * You can call the [ListResourceShareInvitations](~~450564~~) operation to obtain the ID of a resource sharing invitation.
      *
      * @param request RejectResourceShareInvitationRequest
      * @return RejectResourceShareInvitationResponse
     */
    public RejectResourceShareInvitationResponse rejectResourceShareInvitation(RejectResourceShareInvitationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rejectResourceShareInvitationWithOptions(request, runtime);
    }

    /**
      * The operation that you want to perform. Set the value to UpdateResourceShare.
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
      * The operation that you want to perform. Set the value to UpdateResourceShare.
      *
      * @param request UpdateResourceShareRequest
      * @return UpdateResourceShareResponse
     */
    public UpdateResourceShareResponse updateResourceShare(UpdateResourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResourceShareWithOptions(request, runtime);
    }
}

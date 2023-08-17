// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101;

import com.aliyun.tea.*;
import com.aliyun.vpcpeer20220101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("vpcpeer", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
      * *   For a cross-account VPC peering connection, the connection is activated only after the accepter VPC accepts the connection request.
      * *   **AcceptVpcPeerConnection** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the operation in the background. You can call the [GetVpcPeerConnectionAttribute](~~426100~~) operation to query the status of the task.
      *     *   If a VPC peering connection is in the **Updating** state, the VPC peering connection is being activated.
      *     *   If a VPC peering connection is in the **Activated** state, the VPC peering connection is activated.
      * *   You cannot repeatedly call the **AcceptVpcPeerConnection** operation within a specific period of time.
      *
      * @param request AcceptVpcPeerConnectionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AcceptVpcPeerConnectionResponse
     */
    public AcceptVpcPeerConnectionResponse acceptVpcPeerConnectionWithOptions(AcceptVpcPeerConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            body.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AcceptVpcPeerConnection"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AcceptVpcPeerConnectionResponse());
    }

    /**
      * *   For a cross-account VPC peering connection, the connection is activated only after the accepter VPC accepts the connection request.
      * *   **AcceptVpcPeerConnection** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the operation in the background. You can call the [GetVpcPeerConnectionAttribute](~~426100~~) operation to query the status of the task.
      *     *   If a VPC peering connection is in the **Updating** state, the VPC peering connection is being activated.
      *     *   If a VPC peering connection is in the **Activated** state, the VPC peering connection is activated.
      * *   You cannot repeatedly call the **AcceptVpcPeerConnection** operation within a specific period of time.
      *
      * @param request AcceptVpcPeerConnectionRequest
      * @return AcceptVpcPeerConnectionResponse
     */
    public AcceptVpcPeerConnectionResponse acceptVpcPeerConnection(AcceptVpcPeerConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acceptVpcPeerConnectionWithOptions(request, runtime);
    }

    /**
      * Before you create a VPC peering connection, make sure that the following requirements are met:
      * *   Cloud Data Transfer (CDT) is activated to manage the billing of intra-border data transfers. To activate CDT, call the [OpenCdtService](~~337842~~) operation.
      * *   **CreateVpcPeerConnection** is an asynchronous operation. After a request is sent, the system returns **a request ID and a VPC ID** and runs the task in the background. You can call the [GetVpcPeerConnectionAttribute](~~426095~~) operation to query the status of a the task.
      *     *   If a VPC peering connection is in the **Creating** state, the VPC peering connection is being created.
      *     *   If a VPC peering connection is in the **Activated** state, the VPC peering connection is created.
      *     *   If a VPC peering connection is in the **Accepting** state, the VPC peering connection is created across accounts and the accepter is accepting the VPC peering connection.
      * *   You cannot repeatedly call the **CreateVpcPeerConnection** operation within a specific period of time.
      *
      * @param request CreateVpcPeerConnectionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateVpcPeerConnectionResponse
     */
    public CreateVpcPeerConnectionResponse createVpcPeerConnectionWithOptions(CreateVpcPeerConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptingAliUid)) {
            body.put("AcceptingAliUid", request.acceptingAliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acceptingRegionId)) {
            body.put("AcceptingRegionId", request.acceptingRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acceptingVpcId)) {
            body.put("AcceptingVpcId", request.acceptingVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpcPeerConnection"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpcPeerConnectionResponse());
    }

    /**
      * Before you create a VPC peering connection, make sure that the following requirements are met:
      * *   Cloud Data Transfer (CDT) is activated to manage the billing of intra-border data transfers. To activate CDT, call the [OpenCdtService](~~337842~~) operation.
      * *   **CreateVpcPeerConnection** is an asynchronous operation. After a request is sent, the system returns **a request ID and a VPC ID** and runs the task in the background. You can call the [GetVpcPeerConnectionAttribute](~~426095~~) operation to query the status of a the task.
      *     *   If a VPC peering connection is in the **Creating** state, the VPC peering connection is being created.
      *     *   If a VPC peering connection is in the **Activated** state, the VPC peering connection is created.
      *     *   If a VPC peering connection is in the **Accepting** state, the VPC peering connection is created across accounts and the accepter is accepting the VPC peering connection.
      * *   You cannot repeatedly call the **CreateVpcPeerConnection** operation within a specific period of time.
      *
      * @param request CreateVpcPeerConnectionRequest
      * @return CreateVpcPeerConnectionResponse
     */
    public CreateVpcPeerConnectionResponse createVpcPeerConnection(CreateVpcPeerConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpcPeerConnectionWithOptions(request, runtime);
    }

    /**
      * *   You can delete VPC peering connections. After you delete a VPC peering connection, your service is affected. Proceed with caution.
      *     *   If you forcefully delete a VPC peering connection, the system deletes the routes that point to the VPC peering connection from the VPC route table.
      *     *   If you do not forcefully delete a VPC peering connection, the system does not delete these routes. You must manually delete them.
      * *   The **DeleteVpcPeerConnection** operation is asynchronous. After you send a request, the system returns **RequestId**, but the operation is still being performed in the background. You can call the [GetVpcPeerConnectionAttribute](~~426100~~) operation to query the status of a VPC peering connection.
      *     *   If a VPC peering connection is in the **Deleting** state, it is being deleted.
      *     *   If a VPC peering connection is in the **Deleted** state, it is deleted.
      * *   You cannot repeatedly call the **DeleteVpcPeerConnection** operation for the same VPC peering connection within the specified period of time.
      *
      * @param request DeleteVpcPeerConnectionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteVpcPeerConnectionResponse
     */
    public DeleteVpcPeerConnectionResponse deleteVpcPeerConnectionWithOptions(DeleteVpcPeerConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            body.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVpcPeerConnection"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVpcPeerConnectionResponse());
    }

    /**
      * *   You can delete VPC peering connections. After you delete a VPC peering connection, your service is affected. Proceed with caution.
      *     *   If you forcefully delete a VPC peering connection, the system deletes the routes that point to the VPC peering connection from the VPC route table.
      *     *   If you do not forcefully delete a VPC peering connection, the system does not delete these routes. You must manually delete them.
      * *   The **DeleteVpcPeerConnection** operation is asynchronous. After you send a request, the system returns **RequestId**, but the operation is still being performed in the background. You can call the [GetVpcPeerConnectionAttribute](~~426100~~) operation to query the status of a VPC peering connection.
      *     *   If a VPC peering connection is in the **Deleting** state, it is being deleted.
      *     *   If a VPC peering connection is in the **Deleted** state, it is deleted.
      * *   You cannot repeatedly call the **DeleteVpcPeerConnection** operation for the same VPC peering connection within the specified period of time.
      *
      * @param request DeleteVpcPeerConnectionRequest
      * @return DeleteVpcPeerConnectionResponse
     */
    public DeleteVpcPeerConnectionResponse deleteVpcPeerConnection(DeleteVpcPeerConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVpcPeerConnectionWithOptions(request, runtime);
    }

    public GetVpcPeerConnectionAttributeResponse getVpcPeerConnectionAttributeWithOptions(GetVpcPeerConnectionAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            body.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVpcPeerConnectionAttribute"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVpcPeerConnectionAttributeResponse());
    }

    public GetVpcPeerConnectionAttributeResponse getVpcPeerConnectionAttribute(GetVpcPeerConnectionAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVpcPeerConnectionAttributeWithOptions(request, runtime);
    }

    /**
      * *   Set **ResourceId.N** or **Tag.N** that consists of **Tag.N.Key** and **Tag.N.Value** in the request to specify the object to be queried.
      * *   **Tag.N** is a resource tag that consists of a key-value pair. If you set only **Tag.N.Key**, all tag values that are associated with the specified key are returned. If you set only **Tag.N.Value**, an error message is returned.
      * *   If you set **Tag.N** and **ResourceId.N** to filter tags, **ResourceId.N** must match all specified key-value pairs.
      * *   If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.
      *
      * @param request ListTagResourcesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

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
            new TeaPair("version", "2022-01-01"),
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
      * *   Set **ResourceId.N** or **Tag.N** that consists of **Tag.N.Key** and **Tag.N.Value** in the request to specify the object to be queried.
      * *   **Tag.N** is a resource tag that consists of a key-value pair. If you set only **Tag.N.Key**, all tag values that are associated with the specified key are returned. If you set only **Tag.N.Value**, an error message is returned.
      * *   If you set **Tag.N** and **ResourceId.N** to filter tags, **ResourceId.N** must match all specified key-value pairs.
      * *   If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.
      *
      * @param request ListTagResourcesRequest
      * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListVpcPeerConnectionsResponse listVpcPeerConnectionsWithOptions(ListVpcPeerConnectionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListVpcPeerConnectionsShrinkRequest request = new ListVpcPeerConnectionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vpcId)) {
            request.vpcIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vpcId, "VpcId", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcIdShrink)) {
            body.put("VpcId", request.vpcIdShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpcPeerConnections"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpcPeerConnectionsResponse());
    }

    public ListVpcPeerConnectionsResponse listVpcPeerConnections(ListVpcPeerConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVpcPeerConnectionsWithOptions(request, runtime);
    }

    /**
      * *   The **ModifyVpcPeerConnection** operation is asynchronous. After you send a request, the system returns **RequestId**, but the operation is still being performed in the background. You can call the [GetVpcPeerConnectionAttribute](~~426100~~) operation to query the status of a VPC peering connection.
      *     *   If a VPC peering connection is in the **Updating** state, the VPC peering connection is being modified.
      *     *   If a VPC peering connection is in the **Activated** state, the VPC peering connection is modified.
      * *   You cannot repeatedly call the **ModifyVpcPeerConnection** operation for the same VPC peering connection within the specified period of time.
      *
      * @param request ModifyVpcPeerConnectionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyVpcPeerConnectionResponse
     */
    public ModifyVpcPeerConnectionResponse modifyVpcPeerConnectionWithOptions(ModifyVpcPeerConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            body.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcPeerConnection"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcPeerConnectionResponse());
    }

    /**
      * *   The **ModifyVpcPeerConnection** operation is asynchronous. After you send a request, the system returns **RequestId**, but the operation is still being performed in the background. You can call the [GetVpcPeerConnectionAttribute](~~426100~~) operation to query the status of a VPC peering connection.
      *     *   If a VPC peering connection is in the **Updating** state, the VPC peering connection is being modified.
      *     *   If a VPC peering connection is in the **Activated** state, the VPC peering connection is modified.
      * *   You cannot repeatedly call the **ModifyVpcPeerConnection** operation for the same VPC peering connection within the specified period of time.
      *
      * @param request ModifyVpcPeerConnectionRequest
      * @return ModifyVpcPeerConnectionResponse
     */
    public ModifyVpcPeerConnectionResponse modifyVpcPeerConnection(ModifyVpcPeerConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpcPeerConnectionWithOptions(request, runtime);
    }

    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceGroupResponse());
    }

    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    /**
      * *   An acceptor VPC can reject a connection request from the requester VPC of a cross-account VPC peering connection. After the connection request is rejected, the VPC peering connection enters the **Rejected** state.
      * *   You cannot repeatedly call the **RejectVpcPeerConnection** operation for the same VPC peering connection within the specified period of time.
      *
      * @param request RejectVpcPeerConnectionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RejectVpcPeerConnectionResponse
     */
    public RejectVpcPeerConnectionResponse rejectVpcPeerConnectionWithOptions(RejectVpcPeerConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            body.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RejectVpcPeerConnection"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RejectVpcPeerConnectionResponse());
    }

    /**
      * *   An acceptor VPC can reject a connection request from the requester VPC of a cross-account VPC peering connection. After the connection request is rejected, the VPC peering connection enters the **Rejected** state.
      * *   You cannot repeatedly call the **RejectVpcPeerConnection** operation for the same VPC peering connection within the specified period of time.
      *
      * @param request RejectVpcPeerConnectionRequest
      * @return RejectVpcPeerConnectionResponse
     */
    public RejectVpcPeerConnectionResponse rejectVpcPeerConnection(RejectVpcPeerConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rejectVpcPeerConnectionWithOptions(request, runtime);
    }

    /**
      * Tags are used to classify instances. Each tag consists of a key-value pair. Before you use tags, take note of the following limits:
      * *   The keys of tags that are added to the same instance must be unique.
      * *   You cannot create tags without adding them to instances. All tags must be added to instances.
      * *   Tag information is not shared across regions.
      *     For example, you cannot view the tags that are created in the China (Hangzhou) region from the China (Shanghai) region.
      * *   For the same account and region, tags added to different VPC peering connections are shared.
      *     For example, if a tag is added to a VPC peering connection, the tag can also be added to other VPC peering connections within the same account and region. You can modify the key and the value of a tag or remove a tag from an instance. After you delete an instance, all tags that are added to the instance are deleted.
      * *   You can add up to 20 tags to each instance. Before you add a tag to an instance, the system automatically checks the number of existing tags. An error message is returned if the maximum number of tags is reached.
      *
      * @param request TagResourcesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
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
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2022-01-01"),
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
      * Tags are used to classify instances. Each tag consists of a key-value pair. Before you use tags, take note of the following limits:
      * *   The keys of tags that are added to the same instance must be unique.
      * *   You cannot create tags without adding them to instances. All tags must be added to instances.
      * *   Tag information is not shared across regions.
      *     For example, you cannot view the tags that are created in the China (Hangzhou) region from the China (Shanghai) region.
      * *   For the same account and region, tags added to different VPC peering connections are shared.
      *     For example, if a tag is added to a VPC peering connection, the tag can also be added to other VPC peering connections within the same account and region. You can modify the key and the value of a tag or remove a tag from an instance. After you delete an instance, all tags that are added to the instance are deleted.
      * *   You can add up to 20 tags to each instance. Before you add a tag to an instance, the system automatically checks the number of existing tags. An error message is returned if the maximum number of tags is reached.
      *
      * @param request TagResourcesRequest
      * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UnTagResourcesResponse unTagResourcesWithOptions(UnTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
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
            new TeaPair("action", "UnTagResources"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnTagResourcesResponse());
    }

    public UnTagResourcesResponse unTagResources(UnTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unTagResourcesWithOptions(request, runtime);
    }
}

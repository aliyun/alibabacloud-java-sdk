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
     * <b>description</b> :
     * <p>  For a cross-account VPC peering connection, the connection is activated only after the accepter VPC accepts the connection request.</p>
     * <ul>
     * <li><strong>AcceptVpcPeerConnection</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the operation in the background. You can call the <a href="https://help.aliyun.com/document_detail/426100.html">GetVpcPeerConnectionAttribute</a> operation to query the status of the task.<ul>
     * <li>If a VPC peering connection is in the <strong>Updating</strong> state, the VPC peering connection is being activated.</li>
     * <li>If a VPC peering connection is in the <strong>Activated</strong> state, the VPC peering connection is activated.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>AcceptVpcPeerConnection</strong> operation within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>接收VPC对等连接</p>
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
     * <b>description</b> :
     * <p>  For a cross-account VPC peering connection, the connection is activated only after the accepter VPC accepts the connection request.</p>
     * <ul>
     * <li><strong>AcceptVpcPeerConnection</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the operation in the background. You can call the <a href="https://help.aliyun.com/document_detail/426100.html">GetVpcPeerConnectionAttribute</a> operation to query the status of the task.<ul>
     * <li>If a VPC peering connection is in the <strong>Updating</strong> state, the VPC peering connection is being activated.</li>
     * <li>If a VPC peering connection is in the <strong>Activated</strong> state, the VPC peering connection is activated.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>AcceptVpcPeerConnection</strong> operation within a specific period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>接收VPC对等连接</p>
     * 
     * @param request AcceptVpcPeerConnectionRequest
     * @return AcceptVpcPeerConnectionResponse
     */
    public AcceptVpcPeerConnectionResponse acceptVpcPeerConnection(AcceptVpcPeerConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acceptVpcPeerConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you create a VPC peering connection, take note of the following items:</p>
     * <ul>
     * <li><strong>CreateVpcPeerConnection</strong> is an asynchronous operation. After a request is sent, the system returns an <strong>instance ID</strong> and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/426095.html">GetVpcPeerConnectionAttribute</a> to query the status of the task.<ul>
     * <li>If the VPC peering connection is in the <strong>Creating</strong> state, the VPC peering connection is being created.</li>
     * <li>If the VPC peering connection is in the <strong>Activated</strong> state, the VPC peering connection is created.</li>
     * <li>If the VPC peering connection is in the <strong>Accepting</strong> state, it is a cross-account connection. The connection needs to be accepted on the accepter side.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call <strong>CreateVpcPeerConnection</strong> within the specified period of time.
     * When you create a VPC peering connection, the system automatically activates Cloud Data Transfer (CDT) for you.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a VPC peering connection</p>
     * 
     * @param request CreateVpcPeerConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVpcPeerConnectionResponse
     */
    public CreateVpcPeerConnectionResponse createVpcPeerConnectionWithOptions(CreateVpcPeerConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.linkType)) {
            query.put("LinkType", request.linkType);
        }

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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
     * <b>description</b> :
     * <p>Before you create a VPC peering connection, take note of the following items:</p>
     * <ul>
     * <li><strong>CreateVpcPeerConnection</strong> is an asynchronous operation. After a request is sent, the system returns an <strong>instance ID</strong> and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/426095.html">GetVpcPeerConnectionAttribute</a> to query the status of the task.<ul>
     * <li>If the VPC peering connection is in the <strong>Creating</strong> state, the VPC peering connection is being created.</li>
     * <li>If the VPC peering connection is in the <strong>Activated</strong> state, the VPC peering connection is created.</li>
     * <li>If the VPC peering connection is in the <strong>Accepting</strong> state, it is a cross-account connection. The connection needs to be accepted on the accepter side.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call <strong>CreateVpcPeerConnection</strong> within the specified period of time.
     * When you create a VPC peering connection, the system automatically activates Cloud Data Transfer (CDT) for you.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a VPC peering connection</p>
     * 
     * @param request CreateVpcPeerConnectionRequest
     * @return CreateVpcPeerConnectionResponse
     */
    public CreateVpcPeerConnectionResponse createVpcPeerConnection(CreateVpcPeerConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpcPeerConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can delete VPC peering connections. After you delete a VPC peering connection, your service is affected. Proceed with caution.
     *     *   If you forcefully delete a VPC peering connection, the system deletes the routes that point to the VPC peering connection from the VPC route table.
     *     *   If you do not forcefully delete a VPC peering connection, the system does not delete these routes. You must manually delete them.</p>
     * <ul>
     * <li>The <strong>DeleteVpcPeerConnection</strong> operation is asynchronous. After you send a request, the system returns <strong>RequestId</strong>, but the operation is still being performed in the background. You can call the <a href="https://help.aliyun.com/document_detail/426100.html">GetVpcPeerConnectionAttribute</a> operation to query the status of a VPC peering connection.<ul>
     * <li>If a VPC peering connection is in the <strong>Deleting</strong> state, it is being deleted.</li>
     * <li>If a VPC peering connection is in the <strong>Deleted</strong> state, it is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteVpcPeerConnection</strong> operation for the same VPC peering connection within the specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除VPC对等连接</p>
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
     * <b>description</b> :
     * <p>  You can delete VPC peering connections. After you delete a VPC peering connection, your service is affected. Proceed with caution.
     *     *   If you forcefully delete a VPC peering connection, the system deletes the routes that point to the VPC peering connection from the VPC route table.
     *     *   If you do not forcefully delete a VPC peering connection, the system does not delete these routes. You must manually delete them.</p>
     * <ul>
     * <li>The <strong>DeleteVpcPeerConnection</strong> operation is asynchronous. After you send a request, the system returns <strong>RequestId</strong>, but the operation is still being performed in the background. You can call the <a href="https://help.aliyun.com/document_detail/426100.html">GetVpcPeerConnectionAttribute</a> operation to query the status of a VPC peering connection.<ul>
     * <li>If a VPC peering connection is in the <strong>Deleting</strong> state, it is being deleted.</li>
     * <li>If a VPC peering connection is in the <strong>Deleted</strong> state, it is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteVpcPeerConnection</strong> operation for the same VPC peering connection within the specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除VPC对等连接</p>
     * 
     * @param request DeleteVpcPeerConnectionRequest
     * @return DeleteVpcPeerConnectionResponse
     */
    public DeleteVpcPeerConnectionResponse deleteVpcPeerConnection(DeleteVpcPeerConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVpcPeerConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a virtual private cloud (VPC) peering connection.</p>
     * 
     * @param request GetVpcPeerConnectionAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVpcPeerConnectionAttributeResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a virtual private cloud (VPC) peering connection.</p>
     * 
     * @param request GetVpcPeerConnectionAttributeRequest
     * @return GetVpcPeerConnectionAttributeResponse
     */
    public GetVpcPeerConnectionAttributeResponse getVpcPeerConnectionAttribute(GetVpcPeerConnectionAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVpcPeerConnectionAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Set <strong>ResourceId.N</strong> or <strong>Tag.N</strong> that consists of <strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong> in the request to specify the object to be queried.</p>
     * <ul>
     * <li><strong>Tag.N</strong> is a resource tag that consists of a key-value pair. If you set only <strong>Tag.N.Key</strong>, all tag values that are associated with the specified key are returned. If you set only <strong>Tag.N.Value</strong>, an error message is returned.</li>
     * <li>If you set <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, <strong>ResourceId.N</strong> must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries tags that are added to Virtual Private Cloud (VPC) peering connections.</p>
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
     * <b>description</b> :
     * <p>  Set <strong>ResourceId.N</strong> or <strong>Tag.N</strong> that consists of <strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong> in the request to specify the object to be queried.</p>
     * <ul>
     * <li><strong>Tag.N</strong> is a resource tag that consists of a key-value pair. If you set only <strong>Tag.N.Key</strong>, all tag values that are associated with the specified key are returned. If you set only <strong>Tag.N.Value</strong>, an error message is returned.</li>
     * <li>If you set <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, <strong>ResourceId.N</strong> must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries tags that are added to Virtual Private Cloud (VPC) peering connections.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询VPC对等连接列表</p>
     * 
     * @param tmpReq ListVpcPeerConnectionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVpcPeerConnectionsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>查询VPC对等连接列表</p>
     * 
     * @param request ListVpcPeerConnectionsRequest
     * @return ListVpcPeerConnectionsResponse
     */
    public ListVpcPeerConnectionsResponse listVpcPeerConnections(ListVpcPeerConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVpcPeerConnectionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The <strong>ModifyVpcPeerConnection</strong> operation is asynchronous. After you send a request, the system returns <strong>RequestId</strong>, but the operation is still being performed in the background. You can call the <a href="https://help.aliyun.com/document_detail/426100.html">GetVpcPeerConnectionAttribute</a> operation to query the status of a VPC peering connection.
     *     *   If a VPC peering connection is in the <strong>Updating</strong> state, the VPC peering connection is being modified.
     *     *   If a VPC peering connection is in the <strong>Activated</strong> state, the VPC peering connection is modified.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>ModifyVpcPeerConnection</strong> operation for the same VPC peering connection within the specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>修改VPC对等连接</p>
     * 
     * @param request ModifyVpcPeerConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVpcPeerConnectionResponse
     */
    public ModifyVpcPeerConnectionResponse modifyVpcPeerConnectionWithOptions(ModifyVpcPeerConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.linkType)) {
            query.put("LinkType", request.linkType);
        }

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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
     * <b>description</b> :
     * <p>  The <strong>ModifyVpcPeerConnection</strong> operation is asynchronous. After you send a request, the system returns <strong>RequestId</strong>, but the operation is still being performed in the background. You can call the <a href="https://help.aliyun.com/document_detail/426100.html">GetVpcPeerConnectionAttribute</a> operation to query the status of a VPC peering connection.
     *     *   If a VPC peering connection is in the <strong>Updating</strong> state, the VPC peering connection is being modified.
     *     *   If a VPC peering connection is in the <strong>Activated</strong> state, the VPC peering connection is modified.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>ModifyVpcPeerConnection</strong> operation for the same VPC peering connection within the specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>修改VPC对等连接</p>
     * 
     * @param request ModifyVpcPeerConnectionRequest
     * @return ModifyVpcPeerConnectionResponse
     */
    public ModifyVpcPeerConnectionResponse modifyVpcPeerConnection(ModifyVpcPeerConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpcPeerConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a Virtual Private Cloud (VPC) peering connection from one resource group to another.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveResourceGroupResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Moves a Virtual Private Cloud (VPC) peering connection from one resource group to another.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  An acceptor VPC can reject a connection request from the requester VPC of a cross-account VPC peering connection. After the connection request is rejected, the VPC peering connection enters the <strong>Rejected</strong> state.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>RejectVpcPeerConnection</strong> operation for the same VPC peering connection within the specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>拒绝VPC对等连接</p>
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
     * <b>description</b> :
     * <p>  An acceptor VPC can reject a connection request from the requester VPC of a cross-account VPC peering connection. After the connection request is rejected, the VPC peering connection enters the <strong>Rejected</strong> state.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>RejectVpcPeerConnection</strong> operation for the same VPC peering connection within the specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>拒绝VPC对等连接</p>
     * 
     * @param request RejectVpcPeerConnectionRequest
     * @return RejectVpcPeerConnectionResponse
     */
    public RejectVpcPeerConnectionResponse rejectVpcPeerConnection(RejectVpcPeerConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rejectVpcPeerConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Tags are used to classify instances. Each tag consists of a key-value pair. Before you use tags, take note of the following limits:</p>
     * <ul>
     * <li>The keys of tags that are added to the same instance must be unique.</li>
     * <li>You cannot create tags without adding them to instances. All tags must be added to instances.</li>
     * <li>Tag information is not shared across regions.
     * For example, you cannot view the tags that are created in the China (Hangzhou) region from the China (Shanghai) region.</li>
     * <li>For the same account and region, tags added to different VPC peering connections are shared.
     * For example, if a tag is added to a VPC peering connection, the tag can also be added to other VPC peering connections within the same account and region. You can modify the key and the value of a tag or remove a tag from an instance. After you delete an instance, all tags that are added to the instance are deleted.</li>
     * <li>You can add up to 20 tags to each instance. Before you add a tag to an instance, the system automatically checks the number of existing tags. An error message is returned if the maximum number of tags is reached.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates tags and adds them to a virtual private cloud (VPC) peering connection.</p>
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
     * <b>description</b> :
     * <p>Tags are used to classify instances. Each tag consists of a key-value pair. Before you use tags, take note of the following limits:</p>
     * <ul>
     * <li>The keys of tags that are added to the same instance must be unique.</li>
     * <li>You cannot create tags without adding them to instances. All tags must be added to instances.</li>
     * <li>Tag information is not shared across regions.
     * For example, you cannot view the tags that are created in the China (Hangzhou) region from the China (Shanghai) region.</li>
     * <li>For the same account and region, tags added to different VPC peering connections are shared.
     * For example, if a tag is added to a VPC peering connection, the tag can also be added to other VPC peering connections within the same account and region. You can modify the key and the value of a tag or remove a tag from an instance. After you delete an instance, all tags that are added to the instance are deleted.</li>
     * <li>You can add up to 20 tags to each instance. Before you add a tag to an instance, the system automatically checks the number of existing tags. An error message is returned if the maximum number of tags is reached.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates tags and adds them to a virtual private cloud (VPC) peering connection.</p>
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
     * <p>Removes tags from specified Virtual Private Cloud (VPC) peering connections.</p>
     * 
     * @param request UnTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnTagResourcesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Removes tags from specified Virtual Private Cloud (VPC) peering connections.</p>
     * 
     * @param request UnTagResourcesRequest
     * @return UnTagResourcesResponse
     */
    public UnTagResourcesResponse unTagResources(UnTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unTagResourcesWithOptions(request, runtime);
    }
}

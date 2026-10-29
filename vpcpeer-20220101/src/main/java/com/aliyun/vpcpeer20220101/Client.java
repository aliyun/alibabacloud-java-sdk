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
     * <ul>
     * <li>For a cross-account VPC peering connection, the VPC peering connection instance is activated only after the acceptor accepts the connection request.</li>
     * <li>The <strong>AcceptVpcPeerConnection</strong> operation is asynchronous. After you call this operation, the system returns a <strong>RequestId</strong>, but the VPC peering connection instance is not immediately activated. The activation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/426100.html">GetVpcPeerConnectionAttribute</a> to query the status of the VPC peering connection instance.<ul>
     * <li>If the VPC peering connection instance is in the <strong>Updating</strong> state, the instance is being activated.</li>
     * <li>If the VPC peering connection instance is in the <strong>Activated</strong> state, the instance is activated.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>AcceptVpcPeerConnection</strong> operation to concurrently accept requests for the same VPC peering connection instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Accepts a VPC peering connection request.</p>
     * 
     * @param request AcceptVpcPeerConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AcceptVpcPeerConnectionResponse
     */
    public AcceptVpcPeerConnectionResponse acceptVpcPeerConnectionWithOptions(AcceptVpcPeerConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
     * <ul>
     * <li>For a cross-account VPC peering connection, the VPC peering connection instance is activated only after the acceptor accepts the connection request.</li>
     * <li>The <strong>AcceptVpcPeerConnection</strong> operation is asynchronous. After you call this operation, the system returns a <strong>RequestId</strong>, but the VPC peering connection instance is not immediately activated. The activation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/426100.html">GetVpcPeerConnectionAttribute</a> to query the status of the VPC peering connection instance.<ul>
     * <li>If the VPC peering connection instance is in the <strong>Updating</strong> state, the instance is being activated.</li>
     * <li>If the VPC peering connection instance is in the <strong>Activated</strong> state, the instance is activated.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>AcceptVpcPeerConnection</strong> operation to concurrently accept requests for the same VPC peering connection instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Accepts a VPC peering connection request.</p>
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
     * <li><strong>CreateVpcPeerConnection</strong> is an asynchronous operation. After you call this operation, the system returns an <strong>InstanceId</strong>, but the VPC peering connection is not created yet and the creation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/426095.html">GetVpcPeerConnectionAttribute</a> to query the status of the VPC peering connection.<ul>
     * <li>If the VPC peering connection is in the <strong>Creating</strong> state, the VPC peering connection is being created.    </li>
     * <li>If the VPC peering connection is in the <strong>Activated</strong> state, the VPC peering connection is created.</li>
     * <li>If the VPC peering connection is in the <strong>Accepting</strong> state, the VPC peering connection is created across accounts and must be accepted by the acceptor.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>CreateVpcPeerConnection</strong> operation to concurrently create VPC peering connections in the same VPC.
     * &lt;props=&quot;china&quot;&gt;When you create a VPC peering connection, the system automatically activates Cloud Data Transfer (CDT) for non-cross-border data transfer and cross-border data transfer.
     * &lt;props=&quot;intl&quot;&gt;When you create a VPC peering connection, the system automatically activates Cloud Data Transfer (CDT) for non-cross-border data transfer.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes the CreateVpcPeerConnection operation to create a VPC peering connection.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
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

        if (!com.aliyun.teautil.Common.isUnset(request.enableJumboFrame)) {
            body.put("EnableJumboFrame", request.enableJumboFrame);
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
     * <li><strong>CreateVpcPeerConnection</strong> is an asynchronous operation. After you call this operation, the system returns an <strong>InstanceId</strong>, but the VPC peering connection is not created yet and the creation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/426095.html">GetVpcPeerConnectionAttribute</a> to query the status of the VPC peering connection.<ul>
     * <li>If the VPC peering connection is in the <strong>Creating</strong> state, the VPC peering connection is being created.    </li>
     * <li>If the VPC peering connection is in the <strong>Activated</strong> state, the VPC peering connection is created.</li>
     * <li>If the VPC peering connection is in the <strong>Accepting</strong> state, the VPC peering connection is created across accounts and must be accepted by the acceptor.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>CreateVpcPeerConnection</strong> operation to concurrently create VPC peering connections in the same VPC.
     * &lt;props=&quot;china&quot;&gt;When you create a VPC peering connection, the system automatically activates Cloud Data Transfer (CDT) for non-cross-border data transfer and cross-border data transfer.
     * &lt;props=&quot;intl&quot;&gt;When you create a VPC peering connection, the system automatically activates Cloud Data Transfer (CDT) for non-cross-border data transfer.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes the CreateVpcPeerConnection operation to create a VPC peering connection.</p>
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
     * <ul>
     * <li>You can delete a VPC peering connection instance. After the instance is deleted, your services will be interrupted. Perform this operation only when it does not affect your services.<ul>
     * <li>If you choose to force delete the instance, the system deletes the route entry that points to the VPC peering connection instance from the VPC routing table.</li>
     * <li>If you do not choose to force delete the instance, the system does not delete the route entry that points to the VPC peering connection instance from the VPC routing table. You must manually delete the route entry.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeleteVpcPeerConnection</strong> operation is asynchronous. After you call the operation, the system returns a <strong>RequestId</strong>, but the VPC peering connection instance is not immediately deleted. The deletion task is still running in the background. You can call the <a href="https://help.aliyun.com/document_detail/2523294.html">GetVpcPeerConnectionAttribute</a> operation to query the status of the VPC peering connection instance.<ul>
     * <li>If the VPC peering connection instance is in the <strong>Deleting</strong> state, the instance is being deleted.</li>
     * <li>If the VPC peering connection instance is in the <strong>Deleted</strong> state, the instance is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>DeleteVpcPeerConnection</strong> operation to concurrently delete the same VPC peering connection instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a VPC peering connection instance.</p>
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
     * <ul>
     * <li>You can delete a VPC peering connection instance. After the instance is deleted, your services will be interrupted. Perform this operation only when it does not affect your services.<ul>
     * <li>If you choose to force delete the instance, the system deletes the route entry that points to the VPC peering connection instance from the VPC routing table.</li>
     * <li>If you do not choose to force delete the instance, the system does not delete the route entry that points to the VPC peering connection instance from the VPC routing table. You must manually delete the route entry.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeleteVpcPeerConnection</strong> operation is asynchronous. After you call the operation, the system returns a <strong>RequestId</strong>, but the VPC peering connection instance is not immediately deleted. The deletion task is still running in the background. You can call the <a href="https://help.aliyun.com/document_detail/2523294.html">GetVpcPeerConnectionAttribute</a> operation to query the status of the VPC peering connection instance.<ul>
     * <li>If the VPC peering connection instance is in the <strong>Deleting</strong> state, the instance is being deleted.</li>
     * <li>If the VPC peering connection instance is in the <strong>Deleted</strong> state, the instance is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>DeleteVpcPeerConnection</strong> operation to concurrently delete the same VPC peering connection instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a VPC peering connection instance.</p>
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
     * <p>Queries the details of a specified VPC peering connection.</p>
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
     * <p>Queries the details of a specified VPC peering connection.</p>
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
     * <ul>
     * <li>Specify at least one of the <strong>ResourceId.N</strong> and <strong>Tag.N</strong> (<strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong>) parameters in the request to determine the resources to query.</li>
     * <li><strong>Tag.N</strong> is the tag of the resource and consists of a key-value pair. If you specify only <strong>Tag.N.Key</strong>, all tag values associated with the tag key are returned. If you specify only <strong>Tag.N.Value</strong>, an error is reported.</li>
     * <li>If you specify both <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, the <strong>ResourceId.N</strong> parameter must match all the specified tag key-value pairs.</li>
     * <li>If you specify multiple tag key-value pairs, the returned resources contain all the specified key-value pairs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags bound to VPC peering connections.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

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
     * <ul>
     * <li>Specify at least one of the <strong>ResourceId.N</strong> and <strong>Tag.N</strong> (<strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong>) parameters in the request to determine the resources to query.</li>
     * <li><strong>Tag.N</strong> is the tag of the resource and consists of a key-value pair. If you specify only <strong>Tag.N.Key</strong>, all tag values associated with the tag key are returned. If you specify only <strong>Tag.N.Value</strong>, an error is reported.</li>
     * <li>If you specify both <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, the <strong>ResourceId.N</strong> parameter must match all the specified tag key-value pairs.</li>
     * <li>If you specify multiple tag key-value pairs, the returned resources contain all the specified key-value pairs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags bound to VPC peering connections.</p>
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
     * <p>Queries the details of VPC peering connections.</p>
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
     * <p>Queries the details of VPC peering connections.</p>
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
     * <ul>
     * <li><strong>ModifyVpcPeerConnection</strong> is an asynchronous operation. The system returns a <strong>RequestId</strong>, but the VPC peering connection is not immediately modified. The modification task continues in the background. You can call <a href="https://help.aliyun.com/document_detail/426100.html">GetVpcPeerConnectionAttribute</a> to query the status of the VPC peering connection.<ul>
     * <li>If the VPC peering connection is in the <strong>Updating</strong> state, it is being modified.</li>
     * <li>If the VPC peering connection is in the <strong>Activated</strong> state, the modification is complete.</li>
     * </ul>
     * </li>
     * <li><strong>ModifyVpcPeerConnection</strong> does not support concurrent modifications to the name and description of the same VPC peering connection.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name or description of a VPC peering connection.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.enableJumboFrame)) {
            body.put("EnableJumboFrame", request.enableJumboFrame);
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
     * <ul>
     * <li><strong>ModifyVpcPeerConnection</strong> is an asynchronous operation. The system returns a <strong>RequestId</strong>, but the VPC peering connection is not immediately modified. The modification task continues in the background. You can call <a href="https://help.aliyun.com/document_detail/426100.html">GetVpcPeerConnectionAttribute</a> to query the status of the VPC peering connection.<ul>
     * <li>If the VPC peering connection is in the <strong>Updating</strong> state, it is being modified.</li>
     * <li>If the VPC peering connection is in the <strong>Activated</strong> state, the modification is complete.</li>
     * </ul>
     * </li>
     * <li><strong>ModifyVpcPeerConnection</strong> does not support concurrent modifications to the name and description of the same VPC peering connection.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name or description of a VPC peering connection.</p>
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
     * <p>Modifies the resource group of a VPC peering connection.</p>
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
     * <p>Modifies the resource group of a VPC peering connection.</p>
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
     * <ul>
     * <li>For a cross-account VPC peering connection instance, the acceptor can reject the connection request. A VPC peering connection instance whose connection request is rejected enters the <strong>Rejected</strong> state.</li>
     * <li><strong>RejectVpcPeerConnection</strong> does not support concurrent requests to reject the same peering connection instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Rejects a request for a VPC peering connection.</p>
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
     * <ul>
     * <li>For a cross-account VPC peering connection instance, the acceptor can reject the connection request. A VPC peering connection instance whose connection request is rejected enters the <strong>Rejected</strong> state.</li>
     * <li><strong>RejectVpcPeerConnection</strong> does not support concurrent requests to reject the same peering connection instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Rejects a request for a VPC peering connection.</p>
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
     * <p>Tags are labels that you assign to instances. Instance tag consists of a key-value pair. Take note of the following limits on tags: </p>
     * <ul>
     * <li>The key of instance tag on an instance must be unique.</li>
     * <li>Tags must be attached to instances. Unattached tags are not supported.</li>
     * <li>Tag information is not shared across regions. 
     *   For example, tags created in the China (Hangzhou) region are not visible in the China (Shanghai) region.</li>
     * <li>Within the same account and region, tag information is shared across different VPC peering connections. 
     *  For example, if a tag is attached to a VPC peering connection within the same account and region, you can directly select and attach this tag to other VPC peering connections on the Edit Tags page without manually entering the key-value pair. You can modify the key and value of a tag, or delete the tag from an instance at any time. If an instance is deleted, all tags attached to the instance are also deleted.</li>
     * <li>You can attach up to 20 tags to a single instance. Before attaching tags, Alibaba Cloud verifies the number of existing tags on the resource. If the limit is exceeded, an error message is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates and attaches tags to one or more specified VPC peering connections.</p>
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
     * <p>Tags are labels that you assign to instances. Instance tag consists of a key-value pair. Take note of the following limits on tags: </p>
     * <ul>
     * <li>The key of instance tag on an instance must be unique.</li>
     * <li>Tags must be attached to instances. Unattached tags are not supported.</li>
     * <li>Tag information is not shared across regions. 
     *   For example, tags created in the China (Hangzhou) region are not visible in the China (Shanghai) region.</li>
     * <li>Within the same account and region, tag information is shared across different VPC peering connections. 
     *  For example, if a tag is attached to a VPC peering connection within the same account and region, you can directly select and attach this tag to other VPC peering connections on the Edit Tags page without manually entering the key-value pair. You can modify the key and value of a tag, or delete the tag from an instance at any time. If an instance is deleted, all tags attached to the instance are also deleted.</li>
     * <li>You can attach up to 20 tags to a single instance. Before attaching tags, Alibaba Cloud verifies the number of existing tags on the resource. If the limit is exceeded, an error message is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates and attaches tags to one or more specified VPC peering connections.</p>
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
     * <p>Removes tags from specified VPC peering connections.</p>
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
     * <p>Removes tags from specified VPC peering connections.</p>
     * 
     * @param request UnTagResourcesRequest
     * @return UnTagResourcesResponse
     */
    public UnTagResourcesResponse unTagResources(UnTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unTagResourcesWithOptions(request, runtime);
    }
}

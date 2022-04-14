// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101;

import com.aliyun.tea.*;
import com.aliyun.vpcpeer20220101.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
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

    public AcceptVpcPeerConnectionResponse acceptVpcPeerConnectionWithOptions(AcceptVpcPeerConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callerBidLoginEmail)) {
            body.put("CallerBidLoginEmail", request.callerBidLoginEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerUidLoginEmail)) {
            body.put("CallerUidLoginEmail", request.callerUidLoginEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            body.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerIdLoginEmail)) {
            body.put("OwnerIdLoginEmail", request.ownerIdLoginEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestContent)) {
            body.put("RequestContent", request.requestContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            body.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AcceptVpcPeerConnectionResponse acceptVpcPeerConnection(AcceptVpcPeerConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.acceptVpcPeerConnectionWithOptions(request, runtime);
    }

    public CreateVpcPeerConnectionResponse createVpcPeerConnectionWithOptions(CreateVpcPeerConnectionRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("Channel", request.channel);
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

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateVpcPeerConnectionResponse createVpcPeerConnection(CreateVpcPeerConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVpcPeerConnectionWithOptions(request, runtime);
    }

    public DeleteVpcPeerConnectionResponse deleteVpcPeerConnectionWithOptions(DeleteVpcPeerConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteVpcPeerConnectionResponse deleteVpcPeerConnection(DeleteVpcPeerConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVpcPeerConnectionWithOptions(request, runtime);
    }

    public GetVpcPeerConnectionAttributeResponse getVpcPeerConnectionAttributeWithOptions(GetVpcPeerConnectionAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callerBidLoginEmail)) {
            body.put("CallerBidLoginEmail", request.callerBidLoginEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerUidLoginEmail)) {
            body.put("CallerUidLoginEmail", request.callerUidLoginEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            body.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerIdLoginEmail)) {
            body.put("OwnerIdLoginEmail", request.ownerIdLoginEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestContent)) {
            body.put("RequestContent", request.requestContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            body.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVpcPeerConnectionAttributeWithOptions(request, runtime);
    }

    public ListVpcPeerConnectionsResponse listVpcPeerConnectionsWithOptions(ListVpcPeerConnectionsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListVpcPeerConnectionsShrinkRequest request = new ListVpcPeerConnectionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vpcId)) {
            request.vpcIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vpcId, "VpcId", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVpcPeerConnectionsWithOptions(request, runtime);
    }

    public ModifyVpcPeerConnectionResponse modifyVpcPeerConnectionWithOptions(ModifyVpcPeerConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("Channel", request.channel);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ModifyVpcPeerConnectionResponse modifyVpcPeerConnection(ModifyVpcPeerConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpcPeerConnectionWithOptions(request, runtime);
    }

    public RejectVpcPeerConnectionResponse rejectVpcPeerConnectionWithOptions(RejectVpcPeerConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callerBidLoginEmail)) {
            body.put("CallerBidLoginEmail", request.callerBidLoginEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerUidLoginEmail)) {
            body.put("CallerUidLoginEmail", request.callerUidLoginEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            body.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerIdLoginEmail)) {
            body.put("OwnerIdLoginEmail", request.ownerIdLoginEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestContent)) {
            body.put("RequestContent", request.requestContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            body.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RejectVpcPeerConnectionResponse rejectVpcPeerConnection(RejectVpcPeerConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rejectVpcPeerConnectionWithOptions(request, runtime);
    }
}

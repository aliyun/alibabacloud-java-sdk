// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415;

import com.aliyun.tea.*;
import com.aliyun.privatelink20200415.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("privatelink", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>  Before you add an account ID to the whitelist of an endpoint service, make sure that the endpoint service is in the <strong>Active</strong> state. You can call the <a href="https://help.aliyun.com/document_detail/469330.html">GetVpcEndpointServiceAttribute</a> operation to query the status of the endpoint service.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>AddUserToVpcEndpointService</strong> operation to add the ID of an Alibaba Cloud account to the whitelist of an endpoint service within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds an account ID to the whitelist of an endpoint service.</p>
     * 
     * @param request AddUserToVpcEndpointServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserToVpcEndpointServiceResponse
     */
    public AddUserToVpcEndpointServiceResponse addUserToVpcEndpointServiceWithOptions(AddUserToVpcEndpointServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userARN)) {
            query.put("UserARN", request.userARN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserToVpcEndpointService"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserToVpcEndpointServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you add an account ID to the whitelist of an endpoint service, make sure that the endpoint service is in the <strong>Active</strong> state. You can call the <a href="https://help.aliyun.com/document_detail/469330.html">GetVpcEndpointServiceAttribute</a> operation to query the status of the endpoint service.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>AddUserToVpcEndpointService</strong> operation to add the ID of an Alibaba Cloud account to the whitelist of an endpoint service within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds an account ID to the whitelist of an endpoint service.</p>
     * 
     * @param request AddUserToVpcEndpointServiceRequest
     * @return AddUserToVpcEndpointServiceResponse
     */
    public AddUserToVpcEndpointServiceResponse addUserToVpcEndpointService(AddUserToVpcEndpointServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserToVpcEndpointServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>AddZoneToVpcEndpoint</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183560.html">ListVpcEndpointZones</a> operation to query the state of the zone.
     *     *   If the zone is in the <strong>Creating</strong> state, the zone is being added.
     *     *   If the zone is in the Wait state, the zone is added.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>AddZoneToVpcEndpoint</strong> operation to add a zone to an endpoint within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a zone to an endpoint.</p>
     * 
     * @param request AddZoneToVpcEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddZoneToVpcEndpointResponse
     */
    public AddZoneToVpcEndpointResponse addZoneToVpcEndpointWithOptions(AddZoneToVpcEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("ip", request.ip);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddZoneToVpcEndpoint"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddZoneToVpcEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>  <strong>AddZoneToVpcEndpoint</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183560.html">ListVpcEndpointZones</a> operation to query the state of the zone.
     *     *   If the zone is in the <strong>Creating</strong> state, the zone is being added.
     *     *   If the zone is in the Wait state, the zone is added.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>AddZoneToVpcEndpoint</strong> operation to add a zone to an endpoint within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a zone to an endpoint.</p>
     * 
     * @param request AddZoneToVpcEndpointRequest
     * @return AddZoneToVpcEndpointResponse
     */
    public AddZoneToVpcEndpointResponse addZoneToVpcEndpoint(AddZoneToVpcEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addZoneToVpcEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you add a service resource to an endpoint service, make sure that the endpoint service is in the <strong>Active</strong> state. You can call the <a href="https://help.aliyun.com/document_detail/469330.html">GetVpcEndpointServiceAttribute</a> operation to query the status of the endpoint service.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>AttachResourceToVpcEndpointService</strong> operation to add a service resource to an endpoint service within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a service resource to an endpoint service.</p>
     * 
     * @param request AttachResourceToVpcEndpointServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachResourceToVpcEndpointServiceResponse
     */
    public AttachResourceToVpcEndpointServiceResponse attachResourceToVpcEndpointServiceWithOptions(AttachResourceToVpcEndpointServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachResourceToVpcEndpointService"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachResourceToVpcEndpointServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you add a service resource to an endpoint service, make sure that the endpoint service is in the <strong>Active</strong> state. You can call the <a href="https://help.aliyun.com/document_detail/469330.html">GetVpcEndpointServiceAttribute</a> operation to query the status of the endpoint service.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>AttachResourceToVpcEndpointService</strong> operation to add a service resource to an endpoint service within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a service resource to an endpoint service.</p>
     * 
     * @param request AttachResourceToVpcEndpointServiceRequest
     * @return AttachResourceToVpcEndpointServiceResponse
     */
    public AttachResourceToVpcEndpointServiceResponse attachResourceToVpcEndpointService(AttachResourceToVpcEndpointServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachResourceToVpcEndpointServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>AttachSecurityGroupToVpcEndpoint</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183558.html">ListVpcEndpoints</a> operation to query the state of the endpoint.
     *     *   If the endpoint is in the <strong>Pending</strong> state, the endpoint is being associated with the security group.
     *     *   If the endpoint is in the <strong>Active</strong> state, the endpoint is associated with the security group.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>AttachSecurityGroupToVpcEndpoint</strong> operation to associate an endpoint with a security group within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates an endpoint with a security group.</p>
     * 
     * @param request AttachSecurityGroupToVpcEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachSecurityGroupToVpcEndpointResponse
     */
    public AttachSecurityGroupToVpcEndpointResponse attachSecurityGroupToVpcEndpointWithOptions(AttachSecurityGroupToVpcEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachSecurityGroupToVpcEndpoint"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachSecurityGroupToVpcEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>  <strong>AttachSecurityGroupToVpcEndpoint</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183558.html">ListVpcEndpoints</a> operation to query the state of the endpoint.
     *     *   If the endpoint is in the <strong>Pending</strong> state, the endpoint is being associated with the security group.
     *     *   If the endpoint is in the <strong>Active</strong> state, the endpoint is associated with the security group.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>AttachSecurityGroupToVpcEndpoint</strong> operation to associate an endpoint with a security group within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates an endpoint with a security group.</p>
     * 
     * @param request AttachSecurityGroupToVpcEndpointRequest
     * @return AttachSecurityGroupToVpcEndpointResponse
     */
    public AttachSecurityGroupToVpcEndpointResponse attachSecurityGroupToVpcEndpoint(AttachSecurityGroupToVpcEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachSecurityGroupToVpcEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a resource group.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2020-04-15"),
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
     * <p>Modifies a resource group.</p>
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
     * <p>Queries whether PrivateLink is activated.</p>
     * 
     * @param request CheckProductOpenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckProductOpenResponse
     */
    public CheckProductOpenResponse checkProductOpenWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckProductOpen"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckProductOpenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether PrivateLink is activated.</p>
     * @return CheckProductOpenResponse
     */
    public CheckProductOpenResponse checkProductOpen() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkProductOpenWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>CreateVpcEndpoint</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183568.html">GetVpcEndpointAttribute</a> operation to check whether the endpoint is created.</p>
     * <ul>
     * <li>If the endpoint is in the <strong>Creating</strong> state, the endpoint is being created.</li>
     * <li>If the endpoint is in the <strong>Active</strong> state, the endpoint is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an endpoint.</p>
     * 
     * @param request CreateVpcEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVpcEndpointResponse
     */
    public CreateVpcEndpointResponse createVpcEndpointWithOptions(CreateVpcEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointDescription)) {
            query.put("EndpointDescription", request.endpointDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointName)) {
            query.put("EndpointName", request.endpointName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyDocument)) {
            query.put("PolicyDocument", request.policyDocument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectedEnabled)) {
            query.put("ProtectedEnabled", request.protectedEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zone)) {
            query.put("Zone", request.zone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zonePrivateIpAddressCount)) {
            query.put("ZonePrivateIpAddressCount", request.zonePrivateIpAddressCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpcEndpoint"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpcEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>CreateVpcEndpoint</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183568.html">GetVpcEndpointAttribute</a> operation to check whether the endpoint is created.</p>
     * <ul>
     * <li>If the endpoint is in the <strong>Creating</strong> state, the endpoint is being created.</li>
     * <li>If the endpoint is in the <strong>Active</strong> state, the endpoint is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an endpoint.</p>
     * 
     * @param request CreateVpcEndpointRequest
     * @return CreateVpcEndpointResponse
     */
    public CreateVpcEndpointResponse createVpcEndpoint(CreateVpcEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpcEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you create an endpoint service, make sure that you have created a Server Load Balancer (SLB) instance that supports PrivateLink. For more information, see <a href="https://help.aliyun.com/document_detail/174064.html">CreateLoadBalancer</a>.</p>
     * <ul>
     * <li><strong>CreateVpcEndpointService</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and an instance ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183542.html">GetVpcEndpointServiceAttribute</a> operation to query the status of the endpoint service.<ul>
     * <li>If the endpoint service is in the <strong>Creating</strong> state, the endpoint service is being created.</li>
     * <li>If the endpoint service is in the <strong>Active</strong> state, the endpoint service is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an endpoint service.</p>
     * 
     * @param request CreateVpcEndpointServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVpcEndpointServiceResponse
     */
    public CreateVpcEndpointServiceResponse createVpcEndpointServiceWithOptions(CreateVpcEndpointServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoAcceptEnabled)) {
            query.put("AutoAcceptEnabled", request.autoAcceptEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payer)) {
            query.put("Payer", request.payer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceDescription)) {
            query.put("ServiceDescription", request.serviceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceResourceType)) {
            query.put("ServiceResourceType", request.serviceResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceSupportIPv6)) {
            query.put("ServiceSupportIPv6", request.serviceSupportIPv6);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneAffinityEnabled)) {
            query.put("ZoneAffinityEnabled", request.zoneAffinityEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpcEndpointService"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpcEndpointServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you create an endpoint service, make sure that you have created a Server Load Balancer (SLB) instance that supports PrivateLink. For more information, see <a href="https://help.aliyun.com/document_detail/174064.html">CreateLoadBalancer</a>.</p>
     * <ul>
     * <li><strong>CreateVpcEndpointService</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and an instance ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183542.html">GetVpcEndpointServiceAttribute</a> operation to query the status of the endpoint service.<ul>
     * <li>If the endpoint service is in the <strong>Creating</strong> state, the endpoint service is being created.</li>
     * <li>If the endpoint service is in the <strong>Active</strong> state, the endpoint service is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an endpoint service.</p>
     * 
     * @param request CreateVpcEndpointServiceRequest
     * @return CreateVpcEndpointServiceResponse
     */
    public CreateVpcEndpointServiceResponse createVpcEndpointService(CreateVpcEndpointServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpcEndpointServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete an endpoint, you must delete the zones that are added to the endpoint.</p>
     * <ul>
     * <li><strong>DeleteVpcEndpoint</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183568.html">GetVpcEndpointAttribute</a> operation to check whether the endpoint is deleted.<ul>
     * <li>If the endpoint is in the <strong>Deleting</strong> state, the endpoint is being deleted.</li>
     * <li>If the endpoint cannot be queried, the endpoint is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an endpoint.</p>
     * 
     * @param request DeleteVpcEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVpcEndpointResponse
     */
    public DeleteVpcEndpointResponse deleteVpcEndpointWithOptions(DeleteVpcEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVpcEndpoint"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVpcEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete an endpoint, you must delete the zones that are added to the endpoint.</p>
     * <ul>
     * <li><strong>DeleteVpcEndpoint</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183568.html">GetVpcEndpointAttribute</a> operation to check whether the endpoint is deleted.<ul>
     * <li>If the endpoint is in the <strong>Deleting</strong> state, the endpoint is being deleted.</li>
     * <li>If the endpoint cannot be queried, the endpoint is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an endpoint.</p>
     * 
     * @param request DeleteVpcEndpointRequest
     * @return DeleteVpcEndpointResponse
     */
    public DeleteVpcEndpointResponse deleteVpcEndpoint(DeleteVpcEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVpcEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete an endpoint service, you must disconnect the endpoint from the endpoint service and remove the service resources.</p>
     * <ul>
     * <li><strong>DeleteVpcEndpointService</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183542.html">GetVpcEndpointServiceAttribute</a> operation to check whether the endpoint service is deleted.<ul>
     * <li>If the endpoint service is in the <strong>Deleting</strong> state, the endpoint service is being deleted.</li>
     * <li>If the endpoint service cannot be queried, the endpoint service is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteVpcEndpointService</strong> operation to delete an endpoint service that belongs to an Alibaba Cloud account within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an endpoint service.</p>
     * 
     * @param request DeleteVpcEndpointServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVpcEndpointServiceResponse
     */
    public DeleteVpcEndpointServiceResponse deleteVpcEndpointServiceWithOptions(DeleteVpcEndpointServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVpcEndpointService"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVpcEndpointServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete an endpoint service, you must disconnect the endpoint from the endpoint service and remove the service resources.</p>
     * <ul>
     * <li><strong>DeleteVpcEndpointService</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183542.html">GetVpcEndpointServiceAttribute</a> operation to check whether the endpoint service is deleted.<ul>
     * <li>If the endpoint service is in the <strong>Deleting</strong> state, the endpoint service is being deleted.</li>
     * <li>If the endpoint service cannot be queried, the endpoint service is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteVpcEndpointService</strong> operation to delete an endpoint service that belongs to an Alibaba Cloud account within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an endpoint service.</p>
     * 
     * @param request DeleteVpcEndpointServiceRequest
     * @return DeleteVpcEndpointServiceResponse
     */
    public DeleteVpcEndpointServiceResponse deleteVpcEndpointService(DeleteVpcEndpointServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVpcEndpointServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available regions and zones.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2020-04-15"),
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
     * <p>Queries available regions and zones.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of zones in a specified region.</p>
     * 
     * @param request DescribeZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZones"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of zones in a specified region.</p>
     * 
     * @param request DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you remove a service resource from an endpoint service, make sure that the endpoint service is in the <strong>Active</strong> state. You can call the <a href="https://help.aliyun.com/document_detail/469330.html">GetVpcEndpointServiceAttribute</a> operation to query the status of the endpoint service.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DetachResourceFromVpcEndpointService</strong> operation to remove a service resource from an endpoint service within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes a service resource from an endpoint service.</p>
     * 
     * @param request DetachResourceFromVpcEndpointServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachResourceFromVpcEndpointServiceResponse
     */
    public DetachResourceFromVpcEndpointServiceResponse detachResourceFromVpcEndpointServiceWithOptions(DetachResourceFromVpcEndpointServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachResourceFromVpcEndpointService"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachResourceFromVpcEndpointServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you remove a service resource from an endpoint service, make sure that the endpoint service is in the <strong>Active</strong> state. You can call the <a href="https://help.aliyun.com/document_detail/469330.html">GetVpcEndpointServiceAttribute</a> operation to query the status of the endpoint service.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DetachResourceFromVpcEndpointService</strong> operation to remove a service resource from an endpoint service within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes a service resource from an endpoint service.</p>
     * 
     * @param request DetachResourceFromVpcEndpointServiceRequest
     * @return DetachResourceFromVpcEndpointServiceResponse
     */
    public DetachResourceFromVpcEndpointServiceResponse detachResourceFromVpcEndpointService(DetachResourceFromVpcEndpointServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachResourceFromVpcEndpointServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DetachSecurityGroupFromVpcEndpoint</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183558.html">ListVpcEndpoints</a> to check whether the endpoint is disassociated from the security group.
     *     *   If the endpoint is in the <strong>Pending</strong> state, the endpoint is being disassociated from the security group.
     *     *   If you cannot query the endpoint in the security group, the endpoint is disassociated from the security group.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DetachSecurityGroupFromVpcEndpoint</strong> operation to disassociate an endpoint from a security group within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates an endpoint from a security group.</p>
     * 
     * @param request DetachSecurityGroupFromVpcEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachSecurityGroupFromVpcEndpointResponse
     */
    public DetachSecurityGroupFromVpcEndpointResponse detachSecurityGroupFromVpcEndpointWithOptions(DetachSecurityGroupFromVpcEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachSecurityGroupFromVpcEndpoint"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachSecurityGroupFromVpcEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DetachSecurityGroupFromVpcEndpoint</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183558.html">ListVpcEndpoints</a> to check whether the endpoint is disassociated from the security group.
     *     *   If the endpoint is in the <strong>Pending</strong> state, the endpoint is being disassociated from the security group.
     *     *   If you cannot query the endpoint in the security group, the endpoint is disassociated from the security group.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DetachSecurityGroupFromVpcEndpoint</strong> operation to disassociate an endpoint from a security group within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates an endpoint from a security group.</p>
     * 
     * @param request DetachSecurityGroupFromVpcEndpointRequest
     * @return DetachSecurityGroupFromVpcEndpointResponse
     */
    public DetachSecurityGroupFromVpcEndpointResponse detachSecurityGroupFromVpcEndpoint(DetachSecurityGroupFromVpcEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachSecurityGroupFromVpcEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DisableVpcEndpointConnection</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183568.html">GetVpcEndpointAttribute</a> operation to query the state of the endpoint connection.
     *     *   If the endpoint connection is in the <strong>Disconnecting</strong> state, the endpoint is being disconnected from the endpoint service.
     *     *   If the endpoint connection is in the <strong>Disconnected</strong> state, the endpoint is disconnected from the endpoint service.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DisableVpcEndpointConnection</strong> operation to allow an endpoint service to reject a connection request from an endpoint within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Rejects a connection request from an endpoint.</p>
     * 
     * @param request DisableVpcEndpointConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableVpcEndpointConnectionResponse
     */
    public DisableVpcEndpointConnectionResponse disableVpcEndpointConnectionWithOptions(DisableVpcEndpointConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableVpcEndpointConnection"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableVpcEndpointConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DisableVpcEndpointConnection</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183568.html">GetVpcEndpointAttribute</a> operation to query the state of the endpoint connection.
     *     *   If the endpoint connection is in the <strong>Disconnecting</strong> state, the endpoint is being disconnected from the endpoint service.
     *     *   If the endpoint connection is in the <strong>Disconnected</strong> state, the endpoint is disconnected from the endpoint service.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DisableVpcEndpointConnection</strong> operation to allow an endpoint service to reject a connection request from an endpoint within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Rejects a connection request from an endpoint.</p>
     * 
     * @param request DisableVpcEndpointConnectionRequest
     * @return DisableVpcEndpointConnectionResponse
     */
    public DisableVpcEndpointConnectionResponse disableVpcEndpointConnection(DisableVpcEndpointConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableVpcEndpointConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation only when the state of the endpoint is <strong>Connected</strong> and the state of the zone associated with the endpoint is <strong>Connected</strong> or <strong>Migrated</strong>.</p>
     * <ul>
     * <li><strong>DisableVpcEndpointZoneConnection</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183560.html">ListVpcEndpointZones</a> operation to query the status of the task.<ul>
     * <li>If the zone is in the <strong>Disconnecting</strong> state, the task is running.</li>
     * <li>If the zone is in the <strong>Disconnected</strong> state, the task is successful.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DisableVpcEndpointZoneConnection</strong> operation to allow an endpoint service to reject a connection request from the endpoint in the zone within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disconnects an endpoint from a connection in the specified zone.</p>
     * 
     * @param request DisableVpcEndpointZoneConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableVpcEndpointZoneConnectionResponse
     */
    public DisableVpcEndpointZoneConnectionResponse disableVpcEndpointZoneConnectionWithOptions(DisableVpcEndpointZoneConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replacedResource)) {
            query.put("ReplacedResource", request.replacedResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableVpcEndpointZoneConnection"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableVpcEndpointZoneConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation only when the state of the endpoint is <strong>Connected</strong> and the state of the zone associated with the endpoint is <strong>Connected</strong> or <strong>Migrated</strong>.</p>
     * <ul>
     * <li><strong>DisableVpcEndpointZoneConnection</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183560.html">ListVpcEndpointZones</a> operation to query the status of the task.<ul>
     * <li>If the zone is in the <strong>Disconnecting</strong> state, the task is running.</li>
     * <li>If the zone is in the <strong>Disconnected</strong> state, the task is successful.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DisableVpcEndpointZoneConnection</strong> operation to allow an endpoint service to reject a connection request from the endpoint in the zone within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disconnects an endpoint from a connection in the specified zone.</p>
     * 
     * @param request DisableVpcEndpointZoneConnectionRequest
     * @return DisableVpcEndpointZoneConnectionResponse
     */
    public DisableVpcEndpointZoneConnectionResponse disableVpcEndpointZoneConnection(DisableVpcEndpointZoneConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableVpcEndpointZoneConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>EnableVpcEndpointConnection</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183568.html">GetVpcEndpointAttribute</a> operation to query the state of the endpoint connection.
     *     *   If the state is <strong>Connecting</strong>, the endpoint connection is being established.
     *     *   If the state is <strong>Connected</strong>, the endpoint connection is established.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>EnableVpcEndpointConnection</strong> operation to allow an endpoint service of an Alibaba Cloud account to accept a connection request from an endpoint within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Accepts connection requests from an endpoint.</p>
     * 
     * @param request EnableVpcEndpointConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableVpcEndpointConnectionResponse
     */
    public EnableVpcEndpointConnectionResponse enableVpcEndpointConnectionWithOptions(EnableVpcEndpointConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableVpcEndpointConnection"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableVpcEndpointConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>  <strong>EnableVpcEndpointConnection</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183568.html">GetVpcEndpointAttribute</a> operation to query the state of the endpoint connection.
     *     *   If the state is <strong>Connecting</strong>, the endpoint connection is being established.
     *     *   If the state is <strong>Connected</strong>, the endpoint connection is established.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>EnableVpcEndpointConnection</strong> operation to allow an endpoint service of an Alibaba Cloud account to accept a connection request from an endpoint within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Accepts connection requests from an endpoint.</p>
     * 
     * @param request EnableVpcEndpointConnectionRequest
     * @return EnableVpcEndpointConnectionResponse
     */
    public EnableVpcEndpointConnectionResponse enableVpcEndpointConnection(EnableVpcEndpointConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableVpcEndpointConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation only when the state of the endpoint is <strong>Connected</strong> and the state of the associated zone is <strong>Disconnected</strong>.</p>
     * <ul>
     * <li><strong>EnableVpcEndpointZoneConnection</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183560.html">ListVpcEndpointZones</a> operation to check whether the endpoint service accepts a connection request from the endpoint in the associated zone.<ul>
     * <li>If the zone is in the <strong>Connecting</strong> state, the endpoint service is accepting the connection request from the endpoint.</li>
     * <li>If the zone is in the <strong>Connected</strong> state, the endpoint service has accepted the connection request from the endpoint.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>EnableVpcEndpointZoneConnection</strong> operation to allow an endpoint service to accept a connection request from an endpoint in the associated zone within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Accepts a connection request from an endpoint in the specified zone.</p>
     * 
     * @param request EnableVpcEndpointZoneConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableVpcEndpointZoneConnectionResponse
     */
    public EnableVpcEndpointZoneConnectionResponse enableVpcEndpointZoneConnectionWithOptions(EnableVpcEndpointZoneConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableVpcEndpointZoneConnection"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableVpcEndpointZoneConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation only when the state of the endpoint is <strong>Connected</strong> and the state of the associated zone is <strong>Disconnected</strong>.</p>
     * <ul>
     * <li><strong>EnableVpcEndpointZoneConnection</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183560.html">ListVpcEndpointZones</a> operation to check whether the endpoint service accepts a connection request from the endpoint in the associated zone.<ul>
     * <li>If the zone is in the <strong>Connecting</strong> state, the endpoint service is accepting the connection request from the endpoint.</li>
     * <li>If the zone is in the <strong>Connected</strong> state, the endpoint service has accepted the connection request from the endpoint.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>EnableVpcEndpointZoneConnection</strong> operation to allow an endpoint service to accept a connection request from an endpoint in the associated zone within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Accepts a connection request from an endpoint in the specified zone.</p>
     * 
     * @param request EnableVpcEndpointZoneConnectionRequest
     * @return EnableVpcEndpointZoneConnectionResponse
     */
    public EnableVpcEndpointZoneConnectionResponse enableVpcEndpointZoneConnection(EnableVpcEndpointZoneConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableVpcEndpointZoneConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the attributes of an endpoint.</p>
     * 
     * @param request GetVpcEndpointAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVpcEndpointAttributeResponse
     */
    public GetVpcEndpointAttributeResponse getVpcEndpointAttributeWithOptions(GetVpcEndpointAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVpcEndpointAttribute"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVpcEndpointAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the attributes of an endpoint.</p>
     * 
     * @param request GetVpcEndpointAttributeRequest
     * @return GetVpcEndpointAttributeResponse
     */
    public GetVpcEndpointAttributeResponse getVpcEndpointAttribute(GetVpcEndpointAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVpcEndpointAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the attributes of an endpoint service.</p>
     * 
     * @param request GetVpcEndpointServiceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVpcEndpointServiceAttributeResponse
     */
    public GetVpcEndpointServiceAttributeResponse getVpcEndpointServiceAttributeWithOptions(GetVpcEndpointServiceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVpcEndpointServiceAttribute"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVpcEndpointServiceAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the attributes of an endpoint service.</p>
     * 
     * @param request GetVpcEndpointServiceAttributeRequest
     * @return GetVpcEndpointServiceAttributeResponse
     */
    public GetVpcEndpointServiceAttributeResponse getVpcEndpointServiceAttribute(GetVpcEndpointServiceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVpcEndpointServiceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You must specify <strong>ResourceId.N</strong> or <strong>Tag.N</strong> in the request to specify the object that you want to query.</p>
     * <ul>
     * <li><strong>Tag.N</strong> is a resource tag that consists of a key-value pair (Tag.N.Key and Tag.N.Value). If you specify only <strong>Tag.N.Key</strong>, all tag values that are associated with the specified key are returned. If you specify only <strong>Tag.N.Value</strong>, an error message is returned.</li>
     * <li>If you specify <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, <strong>ResourceId.N</strong> must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are added to resources.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
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
            new TeaPair("version", "2020-04-15"),
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
     * <p>  You must specify <strong>ResourceId.N</strong> or <strong>Tag.N</strong> in the request to specify the object that you want to query.</p>
     * <ul>
     * <li><strong>Tag.N</strong> is a resource tag that consists of a key-value pair (Tag.N.Key and Tag.N.Value). If you specify only <strong>Tag.N.Key</strong>, all tag values that are associated with the specified key are returned. If you specify only <strong>Tag.N.Value</strong>, an error message is returned.</li>
     * <li>If you specify <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, <strong>ResourceId.N</strong> must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are added to resources.</p>
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
     * <p>Queries endpoint connections.</p>
     * 
     * @param request ListVpcEndpointConnectionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVpcEndpointConnectionsResponse
     */
    public ListVpcEndpointConnectionsResponse listVpcEndpointConnectionsWithOptions(ListVpcEndpointConnectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionStatus)) {
            query.put("ConnectionStatus", request.connectionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointOwnerId)) {
            query.put("EndpointOwnerId", request.endpointOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eniId)) {
            query.put("EniId", request.eniId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replacedResourceId)) {
            query.put("ReplacedResourceId", request.replacedResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpcEndpointConnections"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpcEndpointConnectionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries endpoint connections.</p>
     * 
     * @param request ListVpcEndpointConnectionsRequest
     * @return ListVpcEndpointConnectionsResponse
     */
    public ListVpcEndpointConnectionsResponse listVpcEndpointConnections(ListVpcEndpointConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVpcEndpointConnectionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the security groups that are associated with an endpoint.</p>
     * 
     * @param request ListVpcEndpointSecurityGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVpcEndpointSecurityGroupsResponse
     */
    public ListVpcEndpointSecurityGroupsResponse listVpcEndpointSecurityGroupsWithOptions(ListVpcEndpointSecurityGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpcEndpointSecurityGroups"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpcEndpointSecurityGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the security groups that are associated with an endpoint.</p>
     * 
     * @param request ListVpcEndpointSecurityGroupsRequest
     * @return ListVpcEndpointSecurityGroupsResponse
     */
    public ListVpcEndpointSecurityGroupsResponse listVpcEndpointSecurityGroups(ListVpcEndpointSecurityGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVpcEndpointSecurityGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the service resources that are added to an endpoint service.</p>
     * 
     * @param request ListVpcEndpointServiceResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVpcEndpointServiceResourcesResponse
     */
    public ListVpcEndpointServiceResourcesResponse listVpcEndpointServiceResourcesWithOptions(ListVpcEndpointServiceResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpcEndpointServiceResources"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpcEndpointServiceResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the service resources that are added to an endpoint service.</p>
     * 
     * @param request ListVpcEndpointServiceResourcesRequest
     * @return ListVpcEndpointServiceResourcesResponse
     */
    public ListVpcEndpointServiceResourcesResponse listVpcEndpointServiceResources(ListVpcEndpointServiceResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVpcEndpointServiceResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the whitelist of an endpoint service.</p>
     * 
     * @param request ListVpcEndpointServiceUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVpcEndpointServiceUsersResponse
     */
    public ListVpcEndpointServiceUsersResponse listVpcEndpointServiceUsersWithOptions(ListVpcEndpointServiceUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userListType)) {
            query.put("UserListType", request.userListType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpcEndpointServiceUsers"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpcEndpointServiceUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the whitelist of an endpoint service.</p>
     * 
     * @param request ListVpcEndpointServiceUsersRequest
     * @return ListVpcEndpointServiceUsersResponse
     */
    public ListVpcEndpointServiceUsersResponse listVpcEndpointServiceUsers(ListVpcEndpointServiceUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVpcEndpointServiceUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of endpoint services.</p>
     * 
     * @param request ListVpcEndpointServicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVpcEndpointServicesResponse
     */
    public ListVpcEndpointServicesResponse listVpcEndpointServicesWithOptions(ListVpcEndpointServicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoAcceptEnabled)) {
            query.put("AutoAcceptEnabled", request.autoAcceptEnabled);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceBusinessStatus)) {
            query.put("ServiceBusinessStatus", request.serviceBusinessStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceResourceType)) {
            query.put("ServiceResourceType", request.serviceResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceStatus)) {
            query.put("ServiceStatus", request.serviceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneAffinityEnabled)) {
            query.put("ZoneAffinityEnabled", request.zoneAffinityEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpcEndpointServices"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpcEndpointServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of endpoint services.</p>
     * 
     * @param request ListVpcEndpointServicesRequest
     * @return ListVpcEndpointServicesResponse
     */
    public ListVpcEndpointServicesResponse listVpcEndpointServices(ListVpcEndpointServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVpcEndpointServicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of endpoint services that can be associated with the endpoint created within the current account.</p>
     * 
     * @param request ListVpcEndpointServicesByEndUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVpcEndpointServicesByEndUserResponse
     */
    public ListVpcEndpointServicesByEndUserResponse listVpcEndpointServicesByEndUserWithOptions(ListVpcEndpointServicesByEndUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpcEndpointServicesByEndUser"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpcEndpointServicesByEndUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of endpoint services that can be associated with the endpoint created within the current account.</p>
     * 
     * @param request ListVpcEndpointServicesByEndUserRequest
     * @return ListVpcEndpointServicesByEndUserResponse
     */
    public ListVpcEndpointServicesByEndUserResponse listVpcEndpointServicesByEndUser(ListVpcEndpointServicesByEndUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVpcEndpointServicesByEndUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the zones of an endpoint.</p>
     * 
     * @param request ListVpcEndpointZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVpcEndpointZonesResponse
     */
    public ListVpcEndpointZonesResponse listVpcEndpointZonesWithOptions(ListVpcEndpointZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpcEndpointZones"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpcEndpointZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the zones of an endpoint.</p>
     * 
     * @param request ListVpcEndpointZonesRequest
     * @return ListVpcEndpointZonesResponse
     */
    public ListVpcEndpointZonesResponse listVpcEndpointZones(ListVpcEndpointZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVpcEndpointZonesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of endpoints.</p>
     * 
     * @param request ListVpcEndpointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVpcEndpointsResponse
     */
    public ListVpcEndpointsResponse listVpcEndpointsWithOptions(ListVpcEndpointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionStatus)) {
            query.put("ConnectionStatus", request.connectionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointName)) {
            query.put("EndpointName", request.endpointName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointStatus)) {
            query.put("EndpointStatus", request.endpointStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpcEndpoints"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpcEndpointsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of endpoints.</p>
     * 
     * @param request ListVpcEndpointsRequest
     * @return ListVpcEndpointsResponse
     */
    public ListVpcEndpointsResponse listVpcEndpoints(ListVpcEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVpcEndpointsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Activates PrivateLink.</p>
     * 
     * @param request OpenPrivateLinkServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenPrivateLinkServiceResponse
     */
    public OpenPrivateLinkServiceResponse openPrivateLinkServiceWithOptions(OpenPrivateLinkServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenPrivateLinkService"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenPrivateLinkServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Activates PrivateLink.</p>
     * 
     * @param request OpenPrivateLinkServiceRequest
     * @return OpenPrivateLinkServiceResponse
     */
    public OpenPrivateLinkServiceResponse openPrivateLinkService(OpenPrivateLinkServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openPrivateLinkServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you remove an account ID from the whitelist of an endpoint service, make sure that the endpoint service is in the <strong>Active</strong> state. You can call the <a href="https://help.aliyun.com/document_detail/469330.html">GetVpcEndpointServiceAttribute</a> operation to query the status of the endpoint service.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>RemoveUserFromVpcEndpointService</strong> operation to remove the ID of an Alibaba Cloud account from the whitelist of an endpoint service within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes an account ID from the whitelist of an endpoint service.</p>
     * 
     * @param request RemoveUserFromVpcEndpointServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUserFromVpcEndpointServiceResponse
     */
    public RemoveUserFromVpcEndpointServiceResponse removeUserFromVpcEndpointServiceWithOptions(RemoveUserFromVpcEndpointServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userARN)) {
            query.put("UserARN", request.userARN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUserFromVpcEndpointService"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUserFromVpcEndpointServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you remove an account ID from the whitelist of an endpoint service, make sure that the endpoint service is in the <strong>Active</strong> state. You can call the <a href="https://help.aliyun.com/document_detail/469330.html">GetVpcEndpointServiceAttribute</a> operation to query the status of the endpoint service.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>RemoveUserFromVpcEndpointService</strong> operation to remove the ID of an Alibaba Cloud account from the whitelist of an endpoint service within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes an account ID from the whitelist of an endpoint service.</p>
     * 
     * @param request RemoveUserFromVpcEndpointServiceRequest
     * @return RemoveUserFromVpcEndpointServiceResponse
     */
    public RemoveUserFromVpcEndpointServiceResponse removeUserFromVpcEndpointService(RemoveUserFromVpcEndpointServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUserFromVpcEndpointServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>RemoveZoneFromVpcEndpoint</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183560.html">ListVpcEndpointZones</a> operation to check whether the zone of the endpoint is deleted.
     *     *   If the zone of the endpoint is in the <strong>Deleting</strong> state, the zone is being deleted.
     *     *   If the zone cannot be queried, the zone is deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>RemoveZoneFromVpcEndpoint</strong> operation to delete a zone of an endpoint within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a zone of an endpoint.</p>
     * 
     * @param request RemoveZoneFromVpcEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveZoneFromVpcEndpointResponse
     */
    public RemoveZoneFromVpcEndpointResponse removeZoneFromVpcEndpointWithOptions(RemoveZoneFromVpcEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveZoneFromVpcEndpoint"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveZoneFromVpcEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>  <strong>RemoveZoneFromVpcEndpoint</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183560.html">ListVpcEndpointZones</a> operation to check whether the zone of the endpoint is deleted.
     *     *   If the zone of the endpoint is in the <strong>Deleting</strong> state, the zone is being deleted.
     *     *   If the zone cannot be queried, the zone is deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>RemoveZoneFromVpcEndpoint</strong> operation to delete a zone of an endpoint within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a zone of an endpoint.</p>
     * 
     * @param request RemoveZoneFromVpcEndpointRequest
     * @return RemoveZoneFromVpcEndpointResponse
     */
    public RemoveZoneFromVpcEndpointResponse removeZoneFromVpcEndpoint(RemoveZoneFromVpcEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeZoneFromVpcEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can add up to 20 tags to an instance. Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number is reached, an error message is returned.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to resources. You can call this API operation to add tags to one or more endpoints or endpoint services.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            bodyFlat.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-04-15"),
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
     * <blockquote>
     * <p>You can add up to 20 tags to an instance. Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number is reached, an error message is returned.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to resources. You can call this API operation to add tags to one or more endpoints or endpoint services.</p>
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
     * <p>Removes tags from resources. You can call the UntagResources operation to remove tags from one or more endpoints or endpoint services.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            body.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            bodyFlat.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            bodyFlat.put("TagKey", request.tagKey);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2020-04-15"),
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
     * <p>Removes tags from resources. You can call the UntagResources operation to remove tags from one or more endpoints or endpoint services.</p>
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
     * <p>You cannot repeatedly call the <strong>UpdateVpcEndpointAttribute</strong> operation to modify the attributes of an endpoint that belongs to an Alibaba Cloud account within a specified period of time.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of an endpoint.</p>
     * 
     * @param request UpdateVpcEndpointAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVpcEndpointAttributeResponse
     */
    public UpdateVpcEndpointAttributeResponse updateVpcEndpointAttributeWithOptions(UpdateVpcEndpointAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointDescription)) {
            query.put("EndpointDescription", request.endpointDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointName)) {
            query.put("EndpointName", request.endpointName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyDocument)) {
            query.put("PolicyDocument", request.policyDocument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVpcEndpointAttribute"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVpcEndpointAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateVpcEndpointAttribute</strong> operation to modify the attributes of an endpoint that belongs to an Alibaba Cloud account within a specified period of time.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of an endpoint.</p>
     * 
     * @param request UpdateVpcEndpointAttributeRequest
     * @return UpdateVpcEndpointAttributeResponse
     */
    public UpdateVpcEndpointAttributeResponse updateVpcEndpointAttribute(UpdateVpcEndpointAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVpcEndpointAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateVpcEndpointConnectionAttribute</strong> operation to modify the bandwidth of an endpoint connection that belongs to an Alibaba Cloud account within a specified period of time.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of an endpoint connection.</p>
     * 
     * @param request UpdateVpcEndpointConnectionAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVpcEndpointConnectionAttributeResponse
     */
    public UpdateVpcEndpointConnectionAttributeResponse updateVpcEndpointConnectionAttributeWithOptions(UpdateVpcEndpointConnectionAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVpcEndpointConnectionAttribute"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVpcEndpointConnectionAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateVpcEndpointConnectionAttribute</strong> operation to modify the bandwidth of an endpoint connection that belongs to an Alibaba Cloud account within a specified period of time.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of an endpoint connection.</p>
     * 
     * @param request UpdateVpcEndpointConnectionAttributeRequest
     * @return UpdateVpcEndpointConnectionAttributeResponse
     */
    public UpdateVpcEndpointConnectionAttributeResponse updateVpcEndpointConnectionAttribute(UpdateVpcEndpointConnectionAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVpcEndpointConnectionAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateVpcEndpointServiceAttribute</strong> operation to modify the attributes of an endpoint service that belongs to an Alibaba Cloud account within a specified period of time.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of an endpoint service.</p>
     * 
     * @param request UpdateVpcEndpointServiceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVpcEndpointServiceAttributeResponse
     */
    public UpdateVpcEndpointServiceAttributeResponse updateVpcEndpointServiceAttributeWithOptions(UpdateVpcEndpointServiceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoAcceptEnabled)) {
            query.put("AutoAcceptEnabled", request.autoAcceptEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectBandwidth)) {
            query.put("ConnectBandwidth", request.connectBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceDescription)) {
            query.put("ServiceDescription", request.serviceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceSupportIPv6)) {
            query.put("ServiceSupportIPv6", request.serviceSupportIPv6);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneAffinityEnabled)) {
            query.put("ZoneAffinityEnabled", request.zoneAffinityEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVpcEndpointServiceAttribute"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVpcEndpointServiceAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateVpcEndpointServiceAttribute</strong> operation to modify the attributes of an endpoint service that belongs to an Alibaba Cloud account within a specified period of time.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of an endpoint service.</p>
     * 
     * @param request UpdateVpcEndpointServiceAttributeRequest
     * @return UpdateVpcEndpointServiceAttributeResponse
     */
    public UpdateVpcEndpointServiceAttributeResponse updateVpcEndpointServiceAttribute(UpdateVpcEndpointServiceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVpcEndpointServiceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateVpcEndpointServiceResourceAttribute</strong> operation to modify the attributes of a service resource that is added to an endpoint service within a specified period of time.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of a service resource that is added to an endpoint service.</p>
     * 
     * @param request UpdateVpcEndpointServiceResourceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVpcEndpointServiceResourceAttributeResponse
     */
    public UpdateVpcEndpointServiceResourceAttributeResponse updateVpcEndpointServiceResourceAttributeWithOptions(UpdateVpcEndpointServiceResourceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoAllocatedEnabled)) {
            query.put("AutoAllocatedEnabled", request.autoAllocatedEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVpcEndpointServiceResourceAttribute"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVpcEndpointServiceResourceAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateVpcEndpointServiceResourceAttribute</strong> operation to modify the attributes of a service resource that is added to an endpoint service within a specified period of time.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of a service resource that is added to an endpoint service.</p>
     * 
     * @param request UpdateVpcEndpointServiceResourceAttributeRequest
     * @return UpdateVpcEndpointServiceResourceAttributeResponse
     */
    public UpdateVpcEndpointServiceResourceAttributeResponse updateVpcEndpointServiceResourceAttribute(UpdateVpcEndpointServiceResourceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVpcEndpointServiceResourceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>By default, the feature of modifying a service resource of a zone to which an endpoint connection belongs is unavailable. To use this feature, log on to the <a href="https://quotas.console.aliyun.com/white-list-products/privatelink/quotas">Quota Center console</a>. Click Whitelist Quotas in the left-side navigation pane and click PrivateLink in the Networking section. On the page that appears, search for <code>privatelink_whitelist/svc_res_mgt_uat</code> and click Apply in the Actions column.</p>
     * <h3>Usage notes</h3>
     * <ul>
     * <li>If the endpoint connection is in the <strong>Disconnected</strong> state, you can manually allocate the service resource in the zone.</li>
     * <li>If the endpoint connection is in the <strong>Connected</strong> state, you can manually migrate the service resource in the zone. In this case, the connection might be interrupted.</li>
     * <li><strong>UpdateVpcEndpointZoneConnectionResourceAttribute</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/469330.html">GetVpcEndpointServiceAttribute</a> operation to check whether the service resource is modified.<ul>
     * <li>If the endpoint service is in the <strong>Pending</strong> state, the service resource is being modified.</li>
     * <li>If the endpoint service is in the <strong>Active</strong> state, the service resource is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>UpdateVpcEndpointZoneConnectionResourceAttribute</strong> operation to modify a service resource in the zone to which an endpoint connection belongs within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a service resource of a zone to which an endpoint connection belongs.</p>
     * 
     * @param request UpdateVpcEndpointZoneConnectionResourceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVpcEndpointZoneConnectionResourceAttributeResponse
     */
    public UpdateVpcEndpointZoneConnectionResourceAttributeResponse updateVpcEndpointZoneConnectionResourceAttributeWithOptions(UpdateVpcEndpointZoneConnectionResourceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceAllocateMode)) {
            query.put("ResourceAllocateMode", request.resourceAllocateMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceReplaceMode)) {
            query.put("ResourceReplaceMode", request.resourceReplaceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVpcEndpointZoneConnectionResourceAttribute"),
            new TeaPair("version", "2020-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVpcEndpointZoneConnectionResourceAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>By default, the feature of modifying a service resource of a zone to which an endpoint connection belongs is unavailable. To use this feature, log on to the <a href="https://quotas.console.aliyun.com/white-list-products/privatelink/quotas">Quota Center console</a>. Click Whitelist Quotas in the left-side navigation pane and click PrivateLink in the Networking section. On the page that appears, search for <code>privatelink_whitelist/svc_res_mgt_uat</code> and click Apply in the Actions column.</p>
     * <h3>Usage notes</h3>
     * <ul>
     * <li>If the endpoint connection is in the <strong>Disconnected</strong> state, you can manually allocate the service resource in the zone.</li>
     * <li>If the endpoint connection is in the <strong>Connected</strong> state, you can manually migrate the service resource in the zone. In this case, the connection might be interrupted.</li>
     * <li><strong>UpdateVpcEndpointZoneConnectionResourceAttribute</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/469330.html">GetVpcEndpointServiceAttribute</a> operation to check whether the service resource is modified.<ul>
     * <li>If the endpoint service is in the <strong>Pending</strong> state, the service resource is being modified.</li>
     * <li>If the endpoint service is in the <strong>Active</strong> state, the service resource is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>UpdateVpcEndpointZoneConnectionResourceAttribute</strong> operation to modify a service resource in the zone to which an endpoint connection belongs within a specified period of time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a service resource of a zone to which an endpoint connection belongs.</p>
     * 
     * @param request UpdateVpcEndpointZoneConnectionResourceAttributeRequest
     * @return UpdateVpcEndpointZoneConnectionResourceAttributeResponse
     */
    public UpdateVpcEndpointZoneConnectionResourceAttributeResponse updateVpcEndpointZoneConnectionResourceAttribute(UpdateVpcEndpointZoneConnectionResourceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVpcEndpointZoneConnectionResourceAttributeWithOptions(request, runtime);
    }
}

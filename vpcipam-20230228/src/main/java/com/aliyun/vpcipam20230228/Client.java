// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228;

import com.aliyun.tea.*;
import com.aliyun.vpcipam20230228.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("vpcipam", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>summary</b> : 
     * <p>添加ipam可信服务纳管成员</p>
     * 
     * @param request AddIpamMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddIpamMembersResponse
     */
    public AddIpamMembersResponse addIpamMembersWithOptions(AddIpamMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.members)) {
            query.put("Members", request.members);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddIpamMembers"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddIpamMembersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加ipam可信服务纳管成员</p>
     * 
     * @param request AddIpamMembersRequest
     * @return AddIpamMembersResponse
     */
    public AddIpamMembersResponse addIpamMembers(AddIpamMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addIpamMembersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you provision a CIDR block, make sure that an IPAM pool is created. You can call the <strong>CreateIpamPool</strong> operation to create an IPAM pool.</p>
     * <ul>
     * <li>If no CIDR block is provisioned to a parent pool, you cannot provision CIDR blocks to its subpools.</li>
     * <li>If a CIDR block is provisioned to a parent pool, you can provision CIDR blocks to its subpools and the CIDR blocks must be subsets of the CIDR block provisioned to the parent pool.</li>
     * <li>If a CIDR block is provisioned to a parent pool and allocations are created, CIDR blocks provisioned to its subpools cannot overlap with existing allocated CIDR blocks.</li>
     * <li>You can provision CIDR blocks to a pool only in the region where the IPAM is hosted.</li>
     * <li>CIDR blocks provisioned to an IPAM pool cannot overlap with the CIDR blocks provisioned to other pools in the same scope.</li>
     * <li>A maximum of 1 CIDR block can be provisioned to a public IPv6 top-level pool, while up to 50 CIDR blocks can be provisioned to other types of address pools.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Provisions a CIDR block to an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request AddIpamPoolCidrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddIpamPoolCidrResponse
     */
    public AddIpamPoolCidrResponse addIpamPoolCidrWithOptions(AddIpamPoolCidrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cidr)) {
            query.put("Cidr", request.cidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolId)) {
            query.put("IpamPoolId", request.ipamPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netmaskLength)) {
            query.put("NetmaskLength", request.netmaskLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddIpamPoolCidr"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddIpamPoolCidrResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you provision a CIDR block, make sure that an IPAM pool is created. You can call the <strong>CreateIpamPool</strong> operation to create an IPAM pool.</p>
     * <ul>
     * <li>If no CIDR block is provisioned to a parent pool, you cannot provision CIDR blocks to its subpools.</li>
     * <li>If a CIDR block is provisioned to a parent pool, you can provision CIDR blocks to its subpools and the CIDR blocks must be subsets of the CIDR block provisioned to the parent pool.</li>
     * <li>If a CIDR block is provisioned to a parent pool and allocations are created, CIDR blocks provisioned to its subpools cannot overlap with existing allocated CIDR blocks.</li>
     * <li>You can provision CIDR blocks to a pool only in the region where the IPAM is hosted.</li>
     * <li>CIDR blocks provisioned to an IPAM pool cannot overlap with the CIDR blocks provisioned to other pools in the same scope.</li>
     * <li>A maximum of 1 CIDR block can be provisioned to a public IPv6 top-level pool, while up to 50 CIDR blocks can be provisioned to other types of address pools.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Provisions a CIDR block to an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request AddIpamPoolCidrRequest
     * @return AddIpamPoolCidrResponse
     */
    public AddIpamPoolCidrResponse addIpamPoolCidr(AddIpamPoolCidrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addIpamPoolCidrWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The specified resource discovery instance can only be associated with one IPAM instance and associations cannot be duplicated.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates resource discovery with an IPAM instance.</p>
     * 
     * @param request AssociateIpamResourceDiscoveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateIpamResourceDiscoveryResponse
     */
    public AssociateIpamResourceDiscoveryResponse associateIpamResourceDiscoveryWithOptions(AssociateIpamResourceDiscoveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamId)) {
            query.put("IpamId", request.ipamId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamResourceDiscoveryId)) {
            query.put("IpamResourceDiscoveryId", request.ipamResourceDiscoveryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateIpamResourceDiscovery"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateIpamResourceDiscoveryResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The specified resource discovery instance can only be associated with one IPAM instance and associations cannot be duplicated.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates resource discovery with an IPAM instance.</p>
     * 
     * @param request AssociateIpamResourceDiscoveryRequest
     * @return AssociateIpamResourceDiscoveryResponse
     */
    public AssociateIpamResourceDiscoveryResponse associateIpamResourceDiscovery(AssociateIpamResourceDiscoveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateIpamResourceDiscoveryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group of an IPAM resource.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2023-02-28"),
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
     * <p>Changes the resource group of an IPAM resource.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can create only one IPAM with each Alibaba Cloud account in each region.</li>
     * <li>Only IPv4 IP addresses can be allocated.</li>
     * <li>When you create an IPAM instance:<ul>
     * <li>If there is no custom resource discovery in the region, the system creates a default resource discovery associated with the IPAM instance.</li>
     * <li>If there is a custom resource discovery in the region, the system converts it to a default resource discovery and associates it with the IPAM instance.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an IP Address Manager (IPAM).</p>
     * 
     * @param request CreateIpamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIpamResponse
     */
    public CreateIpamResponse createIpamWithOptions(CreateIpamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamDescription)) {
            query.put("IpamDescription", request.ipamDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamName)) {
            query.put("IpamName", request.ipamName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingRegionList)) {
            query.put("OperatingRegionList", request.operatingRegionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIpam"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIpamResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can create only one IPAM with each Alibaba Cloud account in each region.</li>
     * <li>Only IPv4 IP addresses can be allocated.</li>
     * <li>When you create an IPAM instance:<ul>
     * <li>If there is no custom resource discovery in the region, the system creates a default resource discovery associated with the IPAM instance.</li>
     * <li>If there is a custom resource discovery in the region, the system converts it to a default resource discovery and associates it with the IPAM instance.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an IP Address Manager (IPAM).</p>
     * 
     * @param request CreateIpamRequest
     * @return CreateIpamResponse
     */
    public CreateIpamResponse createIpam(CreateIpamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIpamWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The number of public IPv6 IPAM top pool for a specific ISP that a user is allowed to create per region is limited to 1.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request CreateIpamPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIpamPoolResponse
     */
    public CreateIpamPoolResponse createIpamPoolWithOptions(CreateIpamPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allocationDefaultCidrMask)) {
            query.put("AllocationDefaultCidrMask", request.allocationDefaultCidrMask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allocationMaxCidrMask)) {
            query.put("AllocationMaxCidrMask", request.allocationMaxCidrMask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allocationMinCidrMask)) {
            query.put("AllocationMinCidrMask", request.allocationMinCidrMask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoImport)) {
            query.put("AutoImport", request.autoImport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolDescription)) {
            query.put("IpamPoolDescription", request.ipamPoolDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolName)) {
            query.put("IpamPoolName", request.ipamPoolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamScopeId)) {
            query.put("IpamScopeId", request.ipamScopeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6Isp)) {
            query.put("Ipv6Isp", request.ipv6Isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolRegionId)) {
            query.put("PoolRegionId", request.poolRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIpamPoolId)) {
            query.put("SourceIpamPoolId", request.sourceIpamPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIpamPool"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIpamPoolResponse());
    }

    /**
     * <b>description</b> :
     * <p>The number of public IPv6 IPAM top pool for a specific ISP that a user is allowed to create per region is limited to 1.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request CreateIpamPoolRequest
     * @return CreateIpamPoolResponse
     */
    public CreateIpamPoolResponse createIpamPool(CreateIpamPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIpamPoolWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you reserve a custom CIDR block, make sure that an IPAM pool is created and CIDR blocks are added to the pool. You can call <strong>CreateIpamPool</strong> to create an IPAM pool and call <strong>AddIpamPoolCidr</strong> to add CIDR blocks to the pool.</p>
     * <ul>
     * <li>When you specify Cidr or CidrMask to reserve a custom CIDR block, the mask must fall within the range specified by the IPAM pool.</li>
     * <li>If the IPAM pool has the region attribute, you must reserve a custom CIDR block in the region to which the IPAM pool belongs.</li>
     * <li>The custom CIDR block that you want to reserve cannot overlap with existing CIDR blocks created from the IPAM pool.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Reserves a custom CIDR block from an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request CreateIpamPoolAllocationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIpamPoolAllocationResponse
     */
    public CreateIpamPoolAllocationResponse createIpamPoolAllocationWithOptions(CreateIpamPoolAllocationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cidr)) {
            query.put("Cidr", request.cidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cidrMask)) {
            query.put("CidrMask", request.cidrMask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolAllocationDescription)) {
            query.put("IpamPoolAllocationDescription", request.ipamPoolAllocationDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolAllocationName)) {
            query.put("IpamPoolAllocationName", request.ipamPoolAllocationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolId)) {
            query.put("IpamPoolId", request.ipamPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIpamPoolAllocation"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIpamPoolAllocationResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you reserve a custom CIDR block, make sure that an IPAM pool is created and CIDR blocks are added to the pool. You can call <strong>CreateIpamPool</strong> to create an IPAM pool and call <strong>AddIpamPoolCidr</strong> to add CIDR blocks to the pool.</p>
     * <ul>
     * <li>When you specify Cidr or CidrMask to reserve a custom CIDR block, the mask must fall within the range specified by the IPAM pool.</li>
     * <li>If the IPAM pool has the region attribute, you must reserve a custom CIDR block in the region to which the IPAM pool belongs.</li>
     * <li>The custom CIDR block that you want to reserve cannot overlap with existing CIDR blocks created from the IPAM pool.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Reserves a custom CIDR block from an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request CreateIpamPoolAllocationRequest
     * @return CreateIpamPoolAllocationResponse
     */
    public CreateIpamPoolAllocationResponse createIpamPoolAllocation(CreateIpamPoolAllocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIpamPoolAllocationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Each Alibaba Cloud account can create only one resource discovery instance in each region.</p>
     * <ul>
     * <li>You can create only custom resource discovery instances.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom resource discovery instance.</p>
     * 
     * @param request CreateIpamResourceDiscoveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIpamResourceDiscoveryResponse
     */
    public CreateIpamResourceDiscoveryResponse createIpamResourceDiscoveryWithOptions(CreateIpamResourceDiscoveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamResourceDiscoveryDescription)) {
            query.put("IpamResourceDiscoveryDescription", request.ipamResourceDiscoveryDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamResourceDiscoveryName)) {
            query.put("IpamResourceDiscoveryName", request.ipamResourceDiscoveryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingRegionList)) {
            query.put("OperatingRegionList", request.operatingRegionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIpamResourceDiscovery"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIpamResourceDiscoveryResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Each Alibaba Cloud account can create only one resource discovery instance in each region.</p>
     * <ul>
     * <li>You can create only custom resource discovery instances.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom resource discovery instance.</p>
     * 
     * @param request CreateIpamResourceDiscoveryRequest
     * @return CreateIpamResourceDiscoveryResponse
     */
    public CreateIpamResourceDiscoveryResponse createIpamResourceDiscovery(CreateIpamResourceDiscoveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIpamResourceDiscoveryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a public scope and private scope to respectively manage public and private IP addresses.</p>
     * 
     * @param request CreateIpamScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIpamScopeResponse
     */
    public CreateIpamScopeResponse createIpamScopeWithOptions(CreateIpamScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamId)) {
            query.put("IpamId", request.ipamId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamScopeDescription)) {
            query.put("IpamScopeDescription", request.ipamScopeDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamScopeName)) {
            query.put("IpamScopeName", request.ipamScopeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamScopeType)) {
            query.put("IpamScopeType", request.ipamScopeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIpamScope"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIpamScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a public scope and private scope to respectively manage public and private IP addresses.</p>
     * 
     * @param request CreateIpamScopeRequest
     * @return CreateIpamScopeResponse
     */
    public CreateIpamScopeResponse createIpamScope(CreateIpamScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIpamScopeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Prerequisites</h2>
     * <ul>
     * <li>Before you delete an IPAM, make sure that all IPAM pools of the IPAM are deleted. You can call <strong>DeleteIpamPool</strong> to delete IPAM pools.</li>
     * <li>Before you delete an IPAM, make sure that all IPAM scopes of the IPAM are deleted. You can call <strong>DeleteIpamScope</strong> to delete IPAM scopes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an IP Address Manager (IPAM).</p>
     * 
     * @param request DeleteIpamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIpamResponse
     */
    public DeleteIpamResponse deleteIpamWithOptions(DeleteIpamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamId)) {
            query.put("IpamId", request.ipamId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIpam"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIpamResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Prerequisites</h2>
     * <ul>
     * <li>Before you delete an IPAM, make sure that all IPAM pools of the IPAM are deleted. You can call <strong>DeleteIpamPool</strong> to delete IPAM pools.</li>
     * <li>Before you delete an IPAM, make sure that all IPAM scopes of the IPAM are deleted. You can call <strong>DeleteIpamScope</strong> to delete IPAM scopes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an IP Address Manager (IPAM).</p>
     * 
     * @param request DeleteIpamRequest
     * @return DeleteIpamResponse
     */
    public DeleteIpamResponse deleteIpam(DeleteIpamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIpamWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Before you delete a parent pool, make sure that all subpools of the parent pool are deleted.</li>
     * <li>If an effective region is specified for a parent pool and IP addresses are allocated from the parent pool, you cannot delete the parent pool.</li>
     * <li>If an effective region is specified for a subpool and IP addresses are allocated from the subpool, you cannot delete the subpool.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an IP Address Manager (IPAM) scope.</p>
     * 
     * @param request DeleteIpamPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIpamPoolResponse
     */
    public DeleteIpamPoolResponse deleteIpamPoolWithOptions(DeleteIpamPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolId)) {
            query.put("IpamPoolId", request.ipamPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIpamPool"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIpamPoolResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Before you delete a parent pool, make sure that all subpools of the parent pool are deleted.</li>
     * <li>If an effective region is specified for a parent pool and IP addresses are allocated from the parent pool, you cannot delete the parent pool.</li>
     * <li>If an effective region is specified for a subpool and IP addresses are allocated from the subpool, you cannot delete the subpool.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an IP Address Manager (IPAM) scope.</p>
     * 
     * @param request DeleteIpamPoolRequest
     * @return DeleteIpamPoolResponse
     */
    public DeleteIpamPoolResponse deleteIpamPool(DeleteIpamPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIpamPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom reserved CIDR block from an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request DeleteIpamPoolAllocationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIpamPoolAllocationResponse
     */
    public DeleteIpamPoolAllocationResponse deleteIpamPoolAllocationWithOptions(DeleteIpamPoolAllocationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolAllocationId)) {
            query.put("IpamPoolAllocationId", request.ipamPoolAllocationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIpamPoolAllocation"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIpamPoolAllocationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom reserved CIDR block from an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request DeleteIpamPoolAllocationRequest
     * @return DeleteIpamPoolAllocationResponse
     */
    public DeleteIpamPoolAllocationResponse deleteIpamPoolAllocation(DeleteIpamPoolAllocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIpamPoolAllocationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If CIDR blocks are provisioned to a parent pool and its subpools, you must first delete the CIDR blocks provisioned to the subpools before you delete the ones provisioned to the parent pool.</p>
     * <ul>
     * <li>If CIDR blocks are provisioned only to the parent pool, directly delete them.</li>
     * <li>If CIDR blocks are allocated from provisioned ones, you must first delete the allocated CIDR blocks before you delete the provisioned ones.</li>
     * <li>You can delete CIDR blocks provisioned to an IPAM pool only in the region where the IPAM is hosted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a CIDR block provisioned to an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request DeleteIpamPoolCidrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIpamPoolCidrResponse
     */
    public DeleteIpamPoolCidrResponse deleteIpamPoolCidrWithOptions(DeleteIpamPoolCidrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cidr)) {
            query.put("Cidr", request.cidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolId)) {
            query.put("IpamPoolId", request.ipamPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIpamPoolCidr"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIpamPoolCidrResponse());
    }

    /**
     * <b>description</b> :
     * <p>  If CIDR blocks are provisioned to a parent pool and its subpools, you must first delete the CIDR blocks provisioned to the subpools before you delete the ones provisioned to the parent pool.</p>
     * <ul>
     * <li>If CIDR blocks are provisioned only to the parent pool, directly delete them.</li>
     * <li>If CIDR blocks are allocated from provisioned ones, you must first delete the allocated CIDR blocks before you delete the provisioned ones.</li>
     * <li>You can delete CIDR blocks provisioned to an IPAM pool only in the region where the IPAM is hosted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a CIDR block provisioned to an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request DeleteIpamPoolCidrRequest
     * @return DeleteIpamPoolCidrResponse
     */
    public DeleteIpamPoolCidrResponse deleteIpamPoolCidr(DeleteIpamPoolCidrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIpamPoolCidrWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If a resource discovery instance is shared, it cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom resource discovery instance.</p>
     * 
     * @param request DeleteIpamResourceDiscoveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIpamResourceDiscoveryResponse
     */
    public DeleteIpamResourceDiscoveryResponse deleteIpamResourceDiscoveryWithOptions(DeleteIpamResourceDiscoveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamResourceDiscoveryId)) {
            query.put("IpamResourceDiscoveryId", request.ipamResourceDiscoveryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIpamResourceDiscovery"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIpamResourceDiscoveryResponse());
    }

    /**
     * <b>description</b> :
     * <p>  If a resource discovery instance is shared, it cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom resource discovery instance.</p>
     * 
     * @param request DeleteIpamResourceDiscoveryRequest
     * @return DeleteIpamResourceDiscoveryResponse
     */
    public DeleteIpamResourceDiscoveryResponse deleteIpamResourceDiscovery(DeleteIpamResourceDiscoveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIpamResourceDiscoveryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>You cannot delete the private scope and public scope created by the system.</li>
     * <li>Before you delete an IPAM scope, make sure that all pools within the scope are deleted. You can call <strong>DeleteIpamPool</strong> to delete IPAM pools.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an IP Address Manager (IPAM) scope.</p>
     * 
     * @param request DeleteIpamScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIpamScopeResponse
     */
    public DeleteIpamScopeResponse deleteIpamScopeWithOptions(DeleteIpamScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamScopeId)) {
            query.put("IpamScopeId", request.ipamScopeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIpamScope"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIpamScopeResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>You cannot delete the private scope and public scope created by the system.</li>
     * <li>Before you delete an IPAM scope, make sure that all pools within the scope are deleted. You can call <strong>DeleteIpamPool</strong> to delete IPAM pools.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an IP Address Manager (IPAM) scope.</p>
     * 
     * @param request DeleteIpamScopeRequest
     * @return DeleteIpamScopeResponse
     */
    public DeleteIpamScopeResponse deleteIpamScope(DeleteIpamScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIpamScopeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates resource discovery and IPAM instances.</p>
     * 
     * @param request DissociateIpamResourceDiscoveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DissociateIpamResourceDiscoveryResponse
     */
    public DissociateIpamResourceDiscoveryResponse dissociateIpamResourceDiscoveryWithOptions(DissociateIpamResourceDiscoveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamId)) {
            query.put("IpamId", request.ipamId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamResourceDiscoveryId)) {
            query.put("IpamResourceDiscoveryId", request.ipamResourceDiscoveryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateIpamResourceDiscovery"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateIpamResourceDiscoveryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates resource discovery and IPAM instances.</p>
     * 
     * @param request DissociateIpamResourceDiscoveryRequest
     * @return DissociateIpamResourceDiscoveryResponse
     */
    public DissociateIpamResourceDiscoveryResponse dissociateIpamResourceDiscovery(DissociateIpamResourceDiscoveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dissociateIpamResourceDiscoveryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries CIDR block allocations of an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request GetIpamPoolAllocationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIpamPoolAllocationResponse
     */
    public GetIpamPoolAllocationResponse getIpamPoolAllocationWithOptions(GetIpamPoolAllocationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIpamPoolAllocation"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIpamPoolAllocationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries CIDR block allocations of an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request GetIpamPoolAllocationRequest
     * @return GetIpamPoolAllocationResponse
     */
    public GetIpamPoolAllocationResponse getIpamPoolAllocation(GetIpamPoolAllocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIpamPoolAllocationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the available CIDR blocks of the IPAM pool.</p>
     * 
     * @param request GetIpamPoolNextAvailableCidrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIpamPoolNextAvailableCidrResponse
     */
    public GetIpamPoolNextAvailableCidrResponse getIpamPoolNextAvailableCidrWithOptions(GetIpamPoolNextAvailableCidrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIpamPoolNextAvailableCidr"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIpamPoolNextAvailableCidrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the available CIDR blocks of the IPAM pool.</p>
     * 
     * @param request GetIpamPoolNextAvailableCidrRequest
     * @return GetIpamPoolNextAvailableCidrResponse
     */
    public GetIpamPoolNextAvailableCidrResponse getIpamPoolNextAvailableCidr(GetIpamPoolNextAvailableCidrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIpamPoolNextAvailableCidrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether IP Address Manager (IPAM) is activated.</p>
     * 
     * @param request GetVpcIpamServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVpcIpamServiceStatusResponse
     */
    public GetVpcIpamServiceStatusResponse getVpcIpamServiceStatusWithOptions(GetVpcIpamServiceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVpcIpamServiceStatus"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVpcIpamServiceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether IP Address Manager (IPAM) is activated.</p>
     * 
     * @param request GetVpcIpamServiceStatusRequest
     * @return GetVpcIpamServiceStatusResponse
     */
    public GetVpcIpamServiceStatusResponse getVpcIpamServiceStatus(GetVpcIpamServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVpcIpamServiceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries discovered resources.</p>
     * 
     * @param request ListIpamDiscoveredResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIpamDiscoveredResourceResponse
     */
    public ListIpamDiscoveredResourceResponse listIpamDiscoveredResourceWithOptions(ListIpamDiscoveredResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipamResourceDiscoveryId)) {
            query.put("IpamResourceDiscoveryId", request.ipamResourceDiscoveryId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIpamDiscoveredResource"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIpamDiscoveredResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries discovered resources.</p>
     * 
     * @param request ListIpamDiscoveredResourceRequest
     * @return ListIpamDiscoveredResourceResponse
     */
    public ListIpamDiscoveredResourceResponse listIpamDiscoveredResource(ListIpamDiscoveredResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIpamDiscoveredResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询ipam可信服务纳管成员</p>
     * 
     * @param request ListIpamMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIpamMembersResponse
     */
    public ListIpamMembersResponse listIpamMembersWithOptions(ListIpamMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberIds)) {
            query.put("MemberIds", request.memberIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIpamMembers"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIpamMembersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询ipam可信服务纳管成员</p>
     * 
     * @param request ListIpamMembersRequest
     * @return ListIpamMembersResponse
     */
    public ListIpamMembersResponse listIpamMembers(ListIpamMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIpamMembersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries CIDR block allocations of an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request ListIpamPoolAllocationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIpamPoolAllocationsResponse
     */
    public ListIpamPoolAllocationsResponse listIpamPoolAllocationsWithOptions(ListIpamPoolAllocationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cidr)) {
            query.put("Cidr", request.cidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolAllocationIds)) {
            query.put("IpamPoolAllocationIds", request.ipamPoolAllocationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolAllocationName)) {
            query.put("IpamPoolAllocationName", request.ipamPoolAllocationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolId)) {
            query.put("IpamPoolId", request.ipamPoolId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIpamPoolAllocations"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIpamPoolAllocationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries CIDR block allocations of an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request ListIpamPoolAllocationsRequest
     * @return ListIpamPoolAllocationsResponse
     */
    public ListIpamPoolAllocationsResponse listIpamPoolAllocations(ListIpamPoolAllocationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIpamPoolAllocationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries CIDR blocks provisioned to an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request ListIpamPoolCidrsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIpamPoolCidrsResponse
     */
    public ListIpamPoolCidrsResponse listIpamPoolCidrsWithOptions(ListIpamPoolCidrsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cidr)) {
            query.put("Cidr", request.cidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolId)) {
            query.put("IpamPoolId", request.ipamPoolId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIpamPoolCidrs"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIpamPoolCidrsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries CIDR blocks provisioned to an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request ListIpamPoolCidrsRequest
     * @return ListIpamPoolCidrsResponse
     */
    public ListIpamPoolCidrsResponse listIpamPoolCidrs(ListIpamPoolCidrsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIpamPoolCidrsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries IP Address Manager (IPAM) pools.</p>
     * 
     * @param request ListIpamPoolsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIpamPoolsResponse
     */
    public ListIpamPoolsResponse listIpamPoolsWithOptions(ListIpamPoolsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolIds)) {
            query.put("IpamPoolIds", request.ipamPoolIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolName)) {
            query.put("IpamPoolName", request.ipamPoolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamScopeId)) {
            query.put("IpamScopeId", request.ipamScopeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6Isp)) {
            query.put("Ipv6Isp", request.ipv6Isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isShared)) {
            query.put("IsShared", request.isShared);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolRegionId)) {
            query.put("PoolRegionId", request.poolRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIpamPoolId)) {
            query.put("SourceIpamPoolId", request.sourceIpamPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIpamPools"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIpamPoolsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries IP Address Manager (IPAM) pools.</p>
     * 
     * @param request ListIpamPoolsRequest
     * @return ListIpamPoolsResponse
     */
    public ListIpamPoolsResponse listIpamPools(ListIpamPoolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIpamPoolsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries resources in an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request ListIpamResourceCidrsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIpamResourceCidrsResponse
     */
    public ListIpamResourceCidrsResponse listIpamResourceCidrsWithOptions(ListIpamResourceCidrsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolId)) {
            query.put("IpamPoolId", request.ipamPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamScopeId)) {
            query.put("IpamScopeId", request.ipamScopeId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIpamResourceCidrs"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIpamResourceCidrsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries resources in an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request ListIpamResourceCidrsRequest
     * @return ListIpamResourceCidrsResponse
     */
    public ListIpamResourceCidrsResponse listIpamResourceCidrs(ListIpamResourceCidrsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIpamResourceCidrsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries IPAM resource discovery instances.</p>
     * 
     * @param request ListIpamResourceDiscoveriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIpamResourceDiscoveriesResponse
     */
    public ListIpamResourceDiscoveriesResponse listIpamResourceDiscoveriesWithOptions(ListIpamResourceDiscoveriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipamResourceDiscoveryIds)) {
            query.put("IpamResourceDiscoveryIds", request.ipamResourceDiscoveryIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamResourceDiscoveryName)) {
            query.put("IpamResourceDiscoveryName", request.ipamResourceDiscoveryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isShared)) {
            query.put("IsShared", request.isShared);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIpamResourceDiscoveries"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIpamResourceDiscoveriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries IPAM resource discovery instances.</p>
     * 
     * @param request ListIpamResourceDiscoveriesRequest
     * @return ListIpamResourceDiscoveriesResponse
     */
    public ListIpamResourceDiscoveriesResponse listIpamResourceDiscoveries(ListIpamResourceDiscoveriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIpamResourceDiscoveriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the association between resource discovery and IPAM.</p>
     * 
     * @param request ListIpamResourceDiscoveryAssociationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIpamResourceDiscoveryAssociationsResponse
     */
    public ListIpamResourceDiscoveryAssociationsResponse listIpamResourceDiscoveryAssociationsWithOptions(ListIpamResourceDiscoveryAssociationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipamId)) {
            query.put("IpamId", request.ipamId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamResourceDiscoveryId)) {
            query.put("IpamResourceDiscoveryId", request.ipamResourceDiscoveryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIpamResourceDiscoveryAssociations"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIpamResourceDiscoveryAssociationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the association between resource discovery and IPAM.</p>
     * 
     * @param request ListIpamResourceDiscoveryAssociationsRequest
     * @return ListIpamResourceDiscoveryAssociationsResponse
     */
    public ListIpamResourceDiscoveryAssociationsResponse listIpamResourceDiscoveryAssociations(ListIpamResourceDiscoveryAssociationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIpamResourceDiscoveryAssociationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries IP Address Manager (IPAM) scopes.</p>
     * 
     * @param request ListIpamScopesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIpamScopesResponse
     */
    public ListIpamScopesResponse listIpamScopesWithOptions(ListIpamScopesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipamId)) {
            query.put("IpamId", request.ipamId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamScopeIds)) {
            query.put("IpamScopeIds", request.ipamScopeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamScopeName)) {
            query.put("IpamScopeName", request.ipamScopeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamScopeType)) {
            query.put("IpamScopeType", request.ipamScopeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIpamScopes"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIpamScopesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries IP Address Manager (IPAM) scopes.</p>
     * 
     * @param request ListIpamScopesRequest
     * @return ListIpamScopesResponse
     */
    public ListIpamScopesResponse listIpamScopes(ListIpamScopesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIpamScopesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries IP Address Managers (IPAMs).</p>
     * 
     * @param request ListIpamsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIpamsResponse
     */
    public ListIpamsResponse listIpamsWithOptions(ListIpamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipamIds)) {
            query.put("IpamIds", request.ipamIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamName)) {
            query.put("IpamName", request.ipamName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIpams"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIpamsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries IP Address Managers (IPAMs).</p>
     * 
     * @param request ListIpamsRequest
     * @return ListIpamsResponse
     */
    public ListIpamsResponse listIpams(ListIpamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIpamsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>You must specify <strong>ResourceId.N</strong> or <strong>Tag.N</strong> that consists of <strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong> in the request to specify the object that you want to query.</li>
     * <li><strong>Tag.N</strong> is a resource tag that consists of a key-value pair. If you specify only <strong>Tag.N.Key</strong>, all tag values that are associated with the specified key are returned. If you specify only <strong>Tag.N.Value</strong>, an error message is returned.</li>
     * <li>If you specify <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, <strong>ResourceId.N</strong> must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of resource tags.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
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
            new TeaPair("version", "2023-02-28"),
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
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>You must specify <strong>ResourceId.N</strong> or <strong>Tag.N</strong> that consists of <strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong> in the request to specify the object that you want to query.</li>
     * <li><strong>Tag.N</strong> is a resource tag that consists of a key-value pair. If you specify only <strong>Tag.N.Key</strong>, all tag values that are associated with the specified key are returned. If you specify only <strong>Tag.N.Value</strong>, an error message is returned.</li>
     * <li>If you specify <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, <strong>ResourceId.N</strong> must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of resource tags.</p>
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
     * <p>Activates IP Address Manager (IPAM).</p>
     * 
     * @param request OpenVpcIpamServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenVpcIpamServiceResponse
     */
    public OpenVpcIpamServiceResponse openVpcIpamServiceWithOptions(OpenVpcIpamServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenVpcIpamService"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenVpcIpamServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Activates IP Address Manager (IPAM).</p>
     * 
     * @param request OpenVpcIpamServiceRequest
     * @return OpenVpcIpamServiceResponse
     */
    public OpenVpcIpamServiceResponse openVpcIpamService(OpenVpcIpamServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openVpcIpamServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>移除ipam可信服务纳管成员</p>
     * 
     * @param request RemoveIpamMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveIpamMembersResponse
     */
    public RemoveIpamMembersResponse removeIpamMembersWithOptions(RemoveIpamMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.members)) {
            query.put("Members", request.members);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveIpamMembers"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveIpamMembersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>移除ipam可信服务纳管成员</p>
     * 
     * @param request RemoveIpamMembersRequest
     * @return RemoveIpamMembersResponse
     */
    public RemoveIpamMembersResponse removeIpamMembers(RemoveIpamMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeIpamMembersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Tags are used to classify instances. Each tag consists of a key-value pair. Before you use tags, take note of the following items:</p>
     * <ul>
     * <li>Each tag key that is added to an instance must be unique.</li>
     * <li>You cannot create tags without adding them to instances. All tags must be added to instances.</li>
     * <li>You can add at most 20 tags to each instance. Before you add a tag to an instance, the system automatically checks the number of existing tags. An error message is returned if the maximum number of tags is reached.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a tag to a resource.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
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
            new TeaPair("version", "2023-02-28"),
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
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Tags are used to classify instances. Each tag consists of a key-value pair. Before you use tags, take note of the following items:</p>
     * <ul>
     * <li>Each tag key that is added to an instance must be unique.</li>
     * <li>You cannot create tags without adding them to instances. All tags must be added to instances.</li>
     * <li>You can add at most 20 tags to each instance. Before you add a tag to an instance, the system automatically checks the number of existing tags. An error message is returned if the maximum number of tags is reached.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a tag to a resource.</p>
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
     * <p>Removes a tag from a resource.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
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
            new TeaPair("version", "2023-02-28"),
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
     * <p>Removes a tag from a resource.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an IP Address Manager (IPAM).</p>
     * 
     * @param request UpdateIpamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIpamResponse
     */
    public UpdateIpamResponse updateIpamWithOptions(UpdateIpamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addOperatingRegion)) {
            query.put("AddOperatingRegion", request.addOperatingRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamDescription)) {
            query.put("IpamDescription", request.ipamDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamId)) {
            query.put("IpamId", request.ipamId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamName)) {
            query.put("IpamName", request.ipamName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeOperatingRegion)) {
            query.put("RemoveOperatingRegion", request.removeOperatingRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIpam"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIpamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an IP Address Manager (IPAM).</p>
     * 
     * @param request UpdateIpamRequest
     * @return UpdateIpamResponse
     */
    public UpdateIpamResponse updateIpam(UpdateIpamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIpamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic information about an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request UpdateIpamPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIpamPoolResponse
     */
    public UpdateIpamPoolResponse updateIpamPoolWithOptions(UpdateIpamPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allocationDefaultCidrMask)) {
            query.put("AllocationDefaultCidrMask", request.allocationDefaultCidrMask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allocationMaxCidrMask)) {
            query.put("AllocationMaxCidrMask", request.allocationMaxCidrMask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allocationMinCidrMask)) {
            query.put("AllocationMinCidrMask", request.allocationMinCidrMask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoImport)) {
            query.put("AutoImport", request.autoImport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clearAllocationDefaultCidrMask)) {
            query.put("ClearAllocationDefaultCidrMask", request.clearAllocationDefaultCidrMask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolDescription)) {
            query.put("IpamPoolDescription", request.ipamPoolDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolId)) {
            query.put("IpamPoolId", request.ipamPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolName)) {
            query.put("IpamPoolName", request.ipamPoolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIpamPool"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIpamPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic information about an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request UpdateIpamPoolRequest
     * @return UpdateIpamPoolResponse
     */
    public UpdateIpamPoolResponse updateIpamPool(UpdateIpamPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIpamPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies CIDR block allocations of an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request UpdateIpamPoolAllocationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIpamPoolAllocationResponse
     */
    public UpdateIpamPoolAllocationResponse updateIpamPoolAllocationWithOptions(UpdateIpamPoolAllocationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolAllocationDescription)) {
            query.put("IpamPoolAllocationDescription", request.ipamPoolAllocationDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolAllocationId)) {
            query.put("IpamPoolAllocationId", request.ipamPoolAllocationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamPoolAllocationName)) {
            query.put("IpamPoolAllocationName", request.ipamPoolAllocationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIpamPoolAllocation"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIpamPoolAllocationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies CIDR block allocations of an IP Address Manager (IPAM) pool.</p>
     * 
     * @param request UpdateIpamPoolAllocationRequest
     * @return UpdateIpamPoolAllocationResponse
     */
    public UpdateIpamPoolAllocationResponse updateIpamPoolAllocation(UpdateIpamPoolAllocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIpamPoolAllocationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can add or remove effective regions only for custom resource discovery instances.</p>
     * <ul>
     * <li>When removing effective regions from a resource discovery instance, the hosted region cannot be included.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a resource discovery instance.</p>
     * 
     * @param request UpdateIpamResourceDiscoveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIpamResourceDiscoveryResponse
     */
    public UpdateIpamResourceDiscoveryResponse updateIpamResourceDiscoveryWithOptions(UpdateIpamResourceDiscoveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addOperatingRegion)) {
            query.put("AddOperatingRegion", request.addOperatingRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamResourceDiscoveryDescription)) {
            query.put("IpamResourceDiscoveryDescription", request.ipamResourceDiscoveryDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamResourceDiscoveryId)) {
            query.put("IpamResourceDiscoveryId", request.ipamResourceDiscoveryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamResourceDiscoveryName)) {
            query.put("IpamResourceDiscoveryName", request.ipamResourceDiscoveryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeOperatingRegion)) {
            query.put("RemoveOperatingRegion", request.removeOperatingRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIpamResourceDiscovery"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIpamResourceDiscoveryResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can add or remove effective regions only for custom resource discovery instances.</p>
     * <ul>
     * <li>When removing effective regions from a resource discovery instance, the hosted region cannot be included.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a resource discovery instance.</p>
     * 
     * @param request UpdateIpamResourceDiscoveryRequest
     * @return UpdateIpamResourceDiscoveryResponse
     */
    public UpdateIpamResourceDiscoveryResponse updateIpamResourceDiscovery(UpdateIpamResourceDiscoveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIpamResourceDiscoveryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic information about an IP Address Manager (IPAM) scope.</p>
     * 
     * @param request UpdateIpamScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIpamScopeResponse
     */
    public UpdateIpamScopeResponse updateIpamScopeWithOptions(UpdateIpamScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamScopeDescription)) {
            query.put("IpamScopeDescription", request.ipamScopeDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamScopeId)) {
            query.put("IpamScopeId", request.ipamScopeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipamScopeName)) {
            query.put("IpamScopeName", request.ipamScopeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIpamScope"),
            new TeaPair("version", "2023-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIpamScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic information about an IP Address Manager (IPAM) scope.</p>
     * 
     * @param request UpdateIpamScopeRequest
     * @return UpdateIpamScopeResponse
     */
    public UpdateIpamScopeResponse updateIpamScope(UpdateIpamScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIpamScopeWithOptions(request, runtime);
    }
}

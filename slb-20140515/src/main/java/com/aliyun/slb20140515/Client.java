// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515;

import com.aliyun.tea.*;
import com.aliyun.slb20140515.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "slb.aliyuncs.com"),
            new TeaPair("cn-beijing", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "slb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "slb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "slb.aliyuncs.com"),
            new TeaPair("cn-hongkong", "slb.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "slb.aliyuncs.com"),
            new TeaPair("us-east-1", "slb.aliyuncs.com"),
            new TeaPair("us-west-1", "slb.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "slb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "slb.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "slb.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "slb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "slb.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "slb.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-edge-1", "slb.aliyuncs.com"),
            new TeaPair("cn-fujian", "slb.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "slb.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "slb.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "slb-api.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "slb.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "slb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "slb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "slb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-wuhan", "slb.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "slb.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "slb.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "slb.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "slb.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "slb.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "slb.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("slb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @summary Adds IP entries to a network access control list (ACL).
     *
     * @description Each network ACL can contain one or more IP addresses or CIDR blocks. Take note of the following limits on network ACLs:
     * *   The number of IP entries that can be added to a network ACL with each Alibaba Cloud account at a time: 50
     * *   The maximum number of IP entries that each network ACL can contain: 300
     *
     * @param request AddAccessControlListEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAccessControlListEntryResponse
     */
    public AddAccessControlListEntryResponse addAccessControlListEntryWithOptions(AddAccessControlListEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclEntrys)) {
            query.put("AclEntrys", request.aclEntrys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
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
            new TeaPair("action", "AddAccessControlListEntry"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAccessControlListEntryResponse());
    }

    /**
     * @summary Adds IP entries to a network access control list (ACL).
     *
     * @description Each network ACL can contain one or more IP addresses or CIDR blocks. Take note of the following limits on network ACLs:
     * *   The number of IP entries that can be added to a network ACL with each Alibaba Cloud account at a time: 50
     * *   The maximum number of IP entries that each network ACL can contain: 300
     *
     * @param request AddAccessControlListEntryRequest
     * @return AddAccessControlListEntryResponse
     */
    public AddAccessControlListEntryResponse addAccessControlListEntry(AddAccessControlListEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAccessControlListEntryWithOptions(request, runtime);
    }

    /**
     * @summary Adds backend servers.
     *
     * @description >  If multiple identical Elastic Compute Service (ECS) instances are specified in a request, only the first ECS instance is added. The other ECS instances are ignored. If the backend server that you add is the same as one of the existing backend servers that are already associated with the listener, an error message is returned.
     *
     * @param request AddBackendServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddBackendServersResponse
     */
    public AddBackendServersResponse addBackendServersWithOptions(AddBackendServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendServers)) {
            query.put("BackendServers", request.backendServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "AddBackendServers"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddBackendServersResponse());
    }

    /**
     * @summary Adds backend servers.
     *
     * @description >  If multiple identical Elastic Compute Service (ECS) instances are specified in a request, only the first ECS instance is added. The other ECS instances are ignored. If the backend server that you add is the same as one of the existing backend servers that are already associated with the listener, an error message is returned.
     *
     * @param request AddBackendServersRequest
     * @return AddBackendServersResponse
     */
    public AddBackendServersResponse addBackendServers(AddBackendServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBackendServersWithOptions(request, runtime);
    }

    /**
     * @summary Adds IP addresses to the whitelist of a listener.
     *
     * @param request AddListenerWhiteListItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddListenerWhiteListItemResponse
     */
    public AddListenerWhiteListItemResponse addListenerWhiteListItemWithOptions(AddListenerWhiteListItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sourceItems)) {
            query.put("SourceItems", request.sourceItems);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddListenerWhiteListItem"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddListenerWhiteListItemResponse());
    }

    /**
     * @summary Adds IP addresses to the whitelist of a listener.
     *
     * @param request AddListenerWhiteListItemRequest
     * @return AddListenerWhiteListItemResponse
     */
    public AddListenerWhiteListItemResponse addListenerWhiteListItem(AddListenerWhiteListItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addListenerWhiteListItemWithOptions(request, runtime);
    }

    /**
     * @description # Limits
     * Before you call this API, note the following limits:
     * *   You can add up to 10 tags to each SLB instance.
     * *   You can add up to five pairs of tags at a time.
     * *   All the tags and keys added to an SLB instance must be unique.
     * *   If you add a tag of which the key is the same as that of an existing tag, but the value is different, the new tag overwrites the existing one.
     *
     * @param request AddTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTagsResponse
     */
    public AddTagsResponse addTagsWithOptions(AddTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTags"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTagsResponse());
    }

    /**
     * @description # Limits
     * Before you call this API, note the following limits:
     * *   You can add up to 10 tags to each SLB instance.
     * *   You can add up to five pairs of tags at a time.
     * *   All the tags and keys added to an SLB instance must be unique.
     * *   If you add a tag of which the key is the same as that of an existing tag, but the value is different, the new tag overwrites the existing one.
     *
     * @param request AddTagsRequest
     * @return AddTagsResponse
     */
    public AddTagsResponse addTags(AddTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTagsWithOptions(request, runtime);
    }

    /**
     * @summary Adds backend servers to a specified server group.
     *
     * @param request AddVServerGroupBackendServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddVServerGroupBackendServersResponse
     */
    public AddVServerGroupBackendServersResponse addVServerGroupBackendServersWithOptions(AddVServerGroupBackendServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendServers)) {
            query.put("BackendServers", request.backendServers);
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

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddVServerGroupBackendServers"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddVServerGroupBackendServersResponse());
    }

    /**
     * @summary Adds backend servers to a specified server group.
     *
     * @param request AddVServerGroupBackendServersRequest
     * @return AddVServerGroupBackendServersResponse
     */
    public AddVServerGroupBackendServersResponse addVServerGroupBackendServers(AddVServerGroupBackendServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addVServerGroupBackendServersWithOptions(request, runtime);
    }

    /**
     * @summary Creates an access control list (ACL).
     *
     * @description You can create multiple ACLs. Each ACL can contain one or more IP addresses or CIDR blocks. Before you create an ACL, take note of the following limits:
     * *   An account can have a maximum of 50 ACLs in each region.
     * *   You can add a maximum of 50 IP addresses or CIDR blocks at a time within an account.
     * *   Each ACL can contain a maximum of 300 IP addresses or CIDR blocks.
     *
     * @param request CreateAccessControlListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccessControlListResponse
     */
    public CreateAccessControlListResponse createAccessControlListWithOptions(CreateAccessControlListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclName)) {
            query.put("AclName", request.aclName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressIPVersion)) {
            query.put("AddressIPVersion", request.addressIPVersion);
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
            new TeaPair("action", "CreateAccessControlList"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccessControlListResponse());
    }

    /**
     * @summary Creates an access control list (ACL).
     *
     * @description You can create multiple ACLs. Each ACL can contain one or more IP addresses or CIDR blocks. Before you create an ACL, take note of the following limits:
     * *   An account can have a maximum of 50 ACLs in each region.
     * *   You can add a maximum of 50 IP addresses or CIDR blocks at a time within an account.
     * *   Each ACL can contain a maximum of 300 IP addresses or CIDR blocks.
     *
     * @param request CreateAccessControlListRequest
     * @return CreateAccessControlListResponse
     */
    public CreateAccessControlListResponse createAccessControlList(CreateAccessControlListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessControlListWithOptions(request, runtime);
    }

    /**
     * @summary Creates a domain name extension.
     *
     * @param request CreateDomainExtensionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDomainExtensionResponse
     */
    public CreateDomainExtensionResponse createDomainExtensionWithOptions(CreateDomainExtensionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.serverCertificateId)) {
            query.put("ServerCertificateId", request.serverCertificateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDomainExtension"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDomainExtensionResponse());
    }

    /**
     * @summary Creates a domain name extension.
     *
     * @param request CreateDomainExtensionRequest
     * @return CreateDomainExtensionResponse
     */
    public CreateDomainExtensionResponse createDomainExtension(CreateDomainExtensionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDomainExtensionWithOptions(request, runtime);
    }

    /**
     * @summary Creates a Classic Load Balancer (CLB) instance.
     *
     * @description *   Before you create a CLB instance, call the [DescribeAvailableResource](~~DescribeAvailableResource~~) operation to query the resources available for purchase in the region where you want to create the CLB instance.
     * *   After a CLB instance is created, you are charged for using the CLB instance.
     * *   The pay-as-you-go billing method supports the pay-by-specification and pay-by-LCU metering methods.
     *
     * @param request CreateLoadBalancerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLoadBalancerResponse
     */
    public CreateLoadBalancerResponse createLoadBalancerWithOptions(CreateLoadBalancerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressIPVersion)) {
            query.put("AddressIPVersion", request.addressIPVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteProtection)) {
            query.put("DeleteProtection", request.deleteProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargeType)) {
            query.put("InstanceChargeType", request.instanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerName)) {
            query.put("LoadBalancerName", request.loadBalancerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerSpec)) {
            query.put("LoadBalancerSpec", request.loadBalancerSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterZoneId)) {
            query.put("MasterZoneId", request.masterZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modificationProtectionReason)) {
            query.put("ModificationProtectionReason", request.modificationProtectionReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modificationProtectionStatus)) {
            query.put("ModificationProtectionStatus", request.modificationProtectionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
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

        if (!com.aliyun.teautil.Common.isUnset(request.slaveZoneId)) {
            query.put("SlaveZoneId", request.slaveZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancer"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerResponse());
    }

    /**
     * @summary Creates a Classic Load Balancer (CLB) instance.
     *
     * @description *   Before you create a CLB instance, call the [DescribeAvailableResource](~~DescribeAvailableResource~~) operation to query the resources available for purchase in the region where you want to create the CLB instance.
     * *   After a CLB instance is created, you are charged for using the CLB instance.
     * *   The pay-as-you-go billing method supports the pay-by-specification and pay-by-LCU metering methods.
     *
     * @param request CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     */
    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadBalancerWithOptions(request, runtime);
    }

    /**
     * @summary Creates an HTTP listener for a Classic Load Balancer (CLB) instance.
     *
     * @description A newly created listener is in the **stopped** state. After a listener is created, you can call the [StartLoadBalancerListener](~~StartLoadBalancerListener~~) operation to start the listener. After the listener is started, the listener can forward traffic to backend servers.
     * ## Prerequisites
     * A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](~~StartLoadBalancerListener~~).
     *
     * @param request CreateLoadBalancerHTTPListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLoadBalancerHTTPListenerResponse
     */
    public CreateLoadBalancerHTTPListenerResponse createLoadBalancerHTTPListenerWithOptions(CreateLoadBalancerHTTPListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclStatus)) {
            query.put("AclStatus", request.aclStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclType)) {
            query.put("AclType", request.aclType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendServerPort)) {
            query.put("BackendServerPort", request.backendServerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookie)) {
            query.put("Cookie", request.cookie);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookieTimeout)) {
            query.put("CookieTimeout", request.cookieTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forwardPort)) {
            query.put("ForwardPort", request.forwardPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gzip)) {
            query.put("Gzip", request.gzip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheck)) {
            query.put("HealthCheck", request.healthCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckDomain)) {
            query.put("HealthCheckDomain", request.healthCheckDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHttpCode)) {
            query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckMethod)) {
            query.put("HealthCheckMethod", request.healthCheckMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTimeout)) {
            query.put("HealthCheckTimeout", request.healthCheckTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckURI)) {
            query.put("HealthCheckURI", request.healthCheckURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTimeout)) {
            query.put("IdleTimeout", request.idleTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerForward)) {
            query.put("ListenerForward", request.listenerForward);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.requestTimeout)) {
            query.put("RequestTimeout", request.requestTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stickySession)) {
            query.put("StickySession", request.stickySession);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stickySessionType)) {
            query.put("StickySessionType", request.stickySessionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor)) {
            query.put("XForwardedFor", request.XForwardedFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_ClientSrcPort)) {
            query.put("XForwardedFor_ClientSrcPort", request.XForwardedFor_ClientSrcPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_SLBID)) {
            query.put("XForwardedFor_SLBID", request.XForwardedFor_SLBID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_SLBIP)) {
            query.put("XForwardedFor_SLBIP", request.XForwardedFor_SLBIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_SLBPORT)) {
            query.put("XForwardedFor_SLBPORT", request.XForwardedFor_SLBPORT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_proto)) {
            query.put("XForwardedFor_proto", request.XForwardedFor_proto);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancerHTTPListener"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerHTTPListenerResponse());
    }

    /**
     * @summary Creates an HTTP listener for a Classic Load Balancer (CLB) instance.
     *
     * @description A newly created listener is in the **stopped** state. After a listener is created, you can call the [StartLoadBalancerListener](~~StartLoadBalancerListener~~) operation to start the listener. After the listener is started, the listener can forward traffic to backend servers.
     * ## Prerequisites
     * A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](~~StartLoadBalancerListener~~).
     *
     * @param request CreateLoadBalancerHTTPListenerRequest
     * @return CreateLoadBalancerHTTPListenerResponse
     */
    public CreateLoadBalancerHTTPListenerResponse createLoadBalancerHTTPListener(CreateLoadBalancerHTTPListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadBalancerHTTPListenerWithOptions(request, runtime);
    }

    /**
     * @summary Creates an HTTPS listener.
     *
     * @description A newly created listener is in the **stopped** state. After a listener is created, you can call the [StartLoadBalancerListener](https://help.aliyun.com/document_detail/27597.html) operation to start the listener. After the listener is started, the listener can forward traffic to backend servers.
     * ## Prerequisites
     * A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](https://www.alibabacloud.com/help/en/server-load-balancer/latest/createloadbalancer-2).
     *
     * @param request CreateLoadBalancerHTTPSListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLoadBalancerHTTPSListenerResponse
     */
    public CreateLoadBalancerHTTPSListenerResponse createLoadBalancerHTTPSListenerWithOptions(CreateLoadBalancerHTTPSListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclStatus)) {
            query.put("AclStatus", request.aclStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclType)) {
            query.put("AclType", request.aclType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendServerPort)) {
            query.put("BackendServerPort", request.backendServerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CACertificateId)) {
            query.put("CACertificateId", request.CACertificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookie)) {
            query.put("Cookie", request.cookie);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookieTimeout)) {
            query.put("CookieTimeout", request.cookieTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableHttp2)) {
            query.put("EnableHttp2", request.enableHttp2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gzip)) {
            query.put("Gzip", request.gzip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheck)) {
            query.put("HealthCheck", request.healthCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckDomain)) {
            query.put("HealthCheckDomain", request.healthCheckDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHttpCode)) {
            query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckMethod)) {
            query.put("HealthCheckMethod", request.healthCheckMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTimeout)) {
            query.put("HealthCheckTimeout", request.healthCheckTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckURI)) {
            query.put("HealthCheckURI", request.healthCheckURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTimeout)) {
            query.put("IdleTimeout", request.idleTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.requestTimeout)) {
            query.put("RequestTimeout", request.requestTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverCertificateId)) {
            query.put("ServerCertificateId", request.serverCertificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stickySession)) {
            query.put("StickySession", request.stickySession);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stickySessionType)) {
            query.put("StickySessionType", request.stickySessionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TLSCipherPolicy)) {
            query.put("TLSCipherPolicy", request.TLSCipherPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor)) {
            query.put("XForwardedFor", request.XForwardedFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_ClientSrcPort)) {
            query.put("XForwardedFor_ClientSrcPort", request.XForwardedFor_ClientSrcPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_SLBID)) {
            query.put("XForwardedFor_SLBID", request.XForwardedFor_SLBID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_SLBIP)) {
            query.put("XForwardedFor_SLBIP", request.XForwardedFor_SLBIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_SLBPORT)) {
            query.put("XForwardedFor_SLBPORT", request.XForwardedFor_SLBPORT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_proto)) {
            query.put("XForwardedFor_proto", request.XForwardedFor_proto);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancerHTTPSListener"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerHTTPSListenerResponse());
    }

    /**
     * @summary Creates an HTTPS listener.
     *
     * @description A newly created listener is in the **stopped** state. After a listener is created, you can call the [StartLoadBalancerListener](https://help.aliyun.com/document_detail/27597.html) operation to start the listener. After the listener is started, the listener can forward traffic to backend servers.
     * ## Prerequisites
     * A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](https://www.alibabacloud.com/help/en/server-load-balancer/latest/createloadbalancer-2).
     *
     * @param request CreateLoadBalancerHTTPSListenerRequest
     * @return CreateLoadBalancerHTTPSListenerResponse
     */
    public CreateLoadBalancerHTTPSListenerResponse createLoadBalancerHTTPSListener(CreateLoadBalancerHTTPSListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadBalancerHTTPSListenerWithOptions(request, runtime);
    }

    /**
     * @summary Creates a TCP listener.
     *
     * @description >  A newly created listener is in the **stopped** state. After a listener is created, you can call the [StartLoadBalancerListener](https://help.aliyun.com/document_detail/27597.html) operation to enable the listener to forward traffic to backend servers.
     *
     * @param request CreateLoadBalancerTCPListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLoadBalancerTCPListenerResponse
     */
    public CreateLoadBalancerTCPListenerResponse createLoadBalancerTCPListenerWithOptions(CreateLoadBalancerTCPListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclStatus)) {
            query.put("AclStatus", request.aclStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclType)) {
            query.put("AclType", request.aclType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendServerPort)) {
            query.put("BackendServerPort", request.backendServerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionDrain)) {
            query.put("ConnectionDrain", request.connectionDrain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionDrainTimeout)) {
            query.put("ConnectionDrainTimeout", request.connectionDrainTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.establishedTimeout)) {
            query.put("EstablishedTimeout", request.establishedTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectTimeout)) {
            query.put("HealthCheckConnectTimeout", request.healthCheckConnectTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckDomain)) {
            query.put("HealthCheckDomain", request.healthCheckDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHttpCode)) {
            query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckSwitch)) {
            query.put("HealthCheckSwitch", request.healthCheckSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckType)) {
            query.put("HealthCheckType", request.healthCheckType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckURI)) {
            query.put("HealthCheckURI", request.healthCheckURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterSlaveServerGroupId)) {
            query.put("MasterSlaveServerGroupId", request.masterSlaveServerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.persistenceTimeout)) {
            query.put("PersistenceTimeout", request.persistenceTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyProtocolV2Enabled)) {
            query.put("ProxyProtocolV2Enabled", request.proxyProtocolV2Enabled);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("healthCheckInterval", request.healthCheckInterval);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancerTCPListener"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerTCPListenerResponse());
    }

    /**
     * @summary Creates a TCP listener.
     *
     * @description >  A newly created listener is in the **stopped** state. After a listener is created, you can call the [StartLoadBalancerListener](https://help.aliyun.com/document_detail/27597.html) operation to enable the listener to forward traffic to backend servers.
     *
     * @param request CreateLoadBalancerTCPListenerRequest
     * @return CreateLoadBalancerTCPListenerResponse
     */
    public CreateLoadBalancerTCPListenerResponse createLoadBalancerTCPListener(CreateLoadBalancerTCPListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadBalancerTCPListenerWithOptions(request, runtime);
    }

    /**
     * @summary Creates a UDP listener.
     *
     * @description UDP listeners of Classic Load Balancer (CLB) instances in a classic network cannot pass client IP addresses to backend servers.
     * >  A newly created listener is in the **stopped** state. After a listener is created, you can call the [StartLoadBalancerListener](https://help.aliyun.com/document_detail/27597.html) operation to enable the listener to forward traffic to backend servers.
     *
     * @param request CreateLoadBalancerUDPListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLoadBalancerUDPListenerResponse
     */
    public CreateLoadBalancerUDPListenerResponse createLoadBalancerUDPListenerWithOptions(CreateLoadBalancerUDPListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclStatus)) {
            query.put("AclStatus", request.aclStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclType)) {
            query.put("AclType", request.aclType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendServerPort)) {
            query.put("BackendServerPort", request.backendServerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectTimeout)) {
            query.put("HealthCheckConnectTimeout", request.healthCheckConnectTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckSwitch)) {
            query.put("HealthCheckSwitch", request.healthCheckSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterSlaveServerGroupId)) {
            query.put("MasterSlaveServerGroupId", request.masterSlaveServerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyProtocolV2Enabled)) {
            query.put("ProxyProtocolV2Enabled", request.proxyProtocolV2Enabled);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckExp)) {
            query.put("healthCheckExp", request.healthCheckExp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("healthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckReq)) {
            query.put("healthCheckReq", request.healthCheckReq);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancerUDPListener"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerUDPListenerResponse());
    }

    /**
     * @summary Creates a UDP listener.
     *
     * @description UDP listeners of Classic Load Balancer (CLB) instances in a classic network cannot pass client IP addresses to backend servers.
     * >  A newly created listener is in the **stopped** state. After a listener is created, you can call the [StartLoadBalancerListener](https://help.aliyun.com/document_detail/27597.html) operation to enable the listener to forward traffic to backend servers.
     *
     * @param request CreateLoadBalancerUDPListenerRequest
     * @return CreateLoadBalancerUDPListenerResponse
     */
    public CreateLoadBalancerUDPListenerResponse createLoadBalancerUDPListener(CreateLoadBalancerUDPListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadBalancerUDPListenerWithOptions(request, runtime);
    }

    /**
     * @summary Creates a primary/secondary server group. A primary/secondary server group can contain only two Elastic Compute Service (ECS) instances. One of the ECS instances functions as the primary server and the other functions as the secondary server.
     *
     * @param request CreateMasterSlaveServerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMasterSlaveServerGroupResponse
     */
    public CreateMasterSlaveServerGroupResponse createMasterSlaveServerGroupWithOptions(CreateMasterSlaveServerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterSlaveBackendServers)) {
            query.put("MasterSlaveBackendServers", request.masterSlaveBackendServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterSlaveServerGroupName)) {
            query.put("MasterSlaveServerGroupName", request.masterSlaveServerGroupName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMasterSlaveServerGroup"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMasterSlaveServerGroupResponse());
    }

    /**
     * @summary Creates a primary/secondary server group. A primary/secondary server group can contain only two Elastic Compute Service (ECS) instances. One of the ECS instances functions as the primary server and the other functions as the secondary server.
     *
     * @param request CreateMasterSlaveServerGroupRequest
     * @return CreateMasterSlaveServerGroupResponse
     */
    public CreateMasterSlaveServerGroupResponse createMasterSlaveServerGroup(CreateMasterSlaveServerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMasterSlaveServerGroupWithOptions(request, runtime);
    }

    /**
     * @summary Creates forwarding rules for an HTTP or HTTPS listener.
     *
     * @param request CreateRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRulesResponse
     */
    public CreateRulesResponse createRulesWithOptions(CreateRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ruleList)) {
            query.put("RuleList", request.ruleList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRules"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRulesResponse());
    }

    /**
     * @summary Creates forwarding rules for an HTTP or HTTPS listener.
     *
     * @param request CreateRulesRequest
     * @return CreateRulesResponse
     */
    public CreateRulesResponse createRules(CreateRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRulesWithOptions(request, runtime);
    }

    /**
     * @summary Creates a Transport Layer Security (TLS) policy.
     *
     * @param request CreateTLSCipherPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTLSCipherPolicyResponse
     */
    public CreateTLSCipherPolicyResponse createTLSCipherPolicyWithOptions(CreateTLSCipherPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ciphers)) {
            query.put("Ciphers", request.ciphers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.TLSVersions)) {
            query.put("TLSVersions", request.TLSVersions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTLSCipherPolicy"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTLSCipherPolicyResponse());
    }

    /**
     * @summary Creates a Transport Layer Security (TLS) policy.
     *
     * @param request CreateTLSCipherPolicyRequest
     * @return CreateTLSCipherPolicyResponse
     */
    public CreateTLSCipherPolicyResponse createTLSCipherPolicy(CreateTLSCipherPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTLSCipherPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Creates a vServer group and adds backend servers to the vServer group.
     *
     * @param request CreateVServerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVServerGroupResponse
     */
    public CreateVServerGroupResponse createVServerGroupWithOptions(CreateVServerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendServers)) {
            query.put("BackendServers", request.backendServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupName)) {
            query.put("VServerGroupName", request.VServerGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVServerGroup"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVServerGroupResponse());
    }

    /**
     * @summary Creates a vServer group and adds backend servers to the vServer group.
     *
     * @param request CreateVServerGroupRequest
     * @return CreateVServerGroupResponse
     */
    public CreateVServerGroupResponse createVServerGroup(CreateVServerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVServerGroupWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an access control list (ACL).
     *
     * @description You can delete an ACL only if it is not associated with a listener.
     *
     * @param request DeleteAccessControlListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccessControlListResponse
     */
    public DeleteAccessControlListResponse deleteAccessControlListWithOptions(DeleteAccessControlListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
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
            new TeaPair("action", "DeleteAccessControlList"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccessControlListResponse());
    }

    /**
     * @summary Deletes an access control list (ACL).
     *
     * @description You can delete an ACL only if it is not associated with a listener.
     *
     * @param request DeleteAccessControlListRequest
     * @return DeleteAccessControlListResponse
     */
    public DeleteAccessControlListResponse deleteAccessControlList(DeleteAccessControlListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessControlListWithOptions(request, runtime);
    }

    /**
     * @summary Deletes the access log of a Classic Load Balancer (CLB) instance.
     *
     * @param request DeleteAccessLogsDownloadAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccessLogsDownloadAttributeResponse
     */
    public DeleteAccessLogsDownloadAttributeResponse deleteAccessLogsDownloadAttributeWithOptions(DeleteAccessLogsDownloadAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logsDownloadAttributes)) {
            query.put("LogsDownloadAttributes", request.logsDownloadAttributes);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccessLogsDownloadAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccessLogsDownloadAttributeResponse());
    }

    /**
     * @summary Deletes the access log of a Classic Load Balancer (CLB) instance.
     *
     * @param request DeleteAccessLogsDownloadAttributeRequest
     * @return DeleteAccessLogsDownloadAttributeResponse
     */
    public DeleteAccessLogsDownloadAttributeResponse deleteAccessLogsDownloadAttribute(DeleteAccessLogsDownloadAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessLogsDownloadAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a certificate authority (CA) certificate.
     *
     * @description You cannot delete a CA certificate that is in use.
     *
     * @param request DeleteCACertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCACertificateResponse
     */
    public DeleteCACertificateResponse deleteCACertificateWithOptions(DeleteCACertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.CACertificateId)) {
            query.put("CACertificateId", request.CACertificateId);
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
            new TeaPair("action", "DeleteCACertificate"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCACertificateResponse());
    }

    /**
     * @summary Deletes a certificate authority (CA) certificate.
     *
     * @description You cannot delete a CA certificate that is in use.
     *
     * @param request DeleteCACertificateRequest
     * @return DeleteCACertificateResponse
     */
    public DeleteCACertificateResponse deleteCACertificate(DeleteCACertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCACertificateWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an additional domain name.
     *
     * @param request DeleteDomainExtensionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainExtensionResponse
     */
    public DeleteDomainExtensionResponse deleteDomainExtensionWithOptions(DeleteDomainExtensionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainExtensionId)) {
            query.put("DomainExtensionId", request.domainExtensionId);
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
            new TeaPair("action", "DeleteDomainExtension"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainExtensionResponse());
    }

    /**
     * @summary Deletes an additional domain name.
     *
     * @param request DeleteDomainExtensionRequest
     * @return DeleteDomainExtensionResponse
     */
    public DeleteDomainExtensionResponse deleteDomainExtension(DeleteDomainExtensionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainExtensionWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a pay-as-you-go Server Load Balancer (SLB) instance.
     *
     * @description > The listeners and tags of the SLB instance are deleted along with the SLB instance.
     *
     * @param request DeleteLoadBalancerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLoadBalancerResponse
     */
    public DeleteLoadBalancerResponse deleteLoadBalancerWithOptions(DeleteLoadBalancerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "DeleteLoadBalancer"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLoadBalancerResponse());
    }

    /**
     * @summary Deletes a pay-as-you-go Server Load Balancer (SLB) instance.
     *
     * @description > The listeners and tags of the SLB instance are deleted along with the SLB instance.
     *
     * @param request DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     */
    public DeleteLoadBalancerResponse deleteLoadBalancer(DeleteLoadBalancerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLoadBalancerWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a listener.
     *
     * @description >  You can delete only listeners that are in the **stopped** or **running** state.
     *
     * @param request DeleteLoadBalancerListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLoadBalancerListenerResponse
     */
    public DeleteLoadBalancerListenerResponse deleteLoadBalancerListenerWithOptions(DeleteLoadBalancerListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "DeleteLoadBalancerListener"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLoadBalancerListenerResponse());
    }

    /**
     * @summary Deletes a listener.
     *
     * @description >  You can delete only listeners that are in the **stopped** or **running** state.
     *
     * @param request DeleteLoadBalancerListenerRequest
     * @return DeleteLoadBalancerListenerResponse
     */
    public DeleteLoadBalancerListenerResponse deleteLoadBalancerListener(DeleteLoadBalancerListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLoadBalancerListenerWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an active/standby server group.
     *
     * @param request DeleteMasterSlaveServerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMasterSlaveServerGroupResponse
     */
    public DeleteMasterSlaveServerGroupResponse deleteMasterSlaveServerGroupWithOptions(DeleteMasterSlaveServerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.masterSlaveServerGroupId)) {
            query.put("MasterSlaveServerGroupId", request.masterSlaveServerGroupId);
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
            new TeaPair("action", "DeleteMasterSlaveServerGroup"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMasterSlaveServerGroupResponse());
    }

    /**
     * @summary Deletes an active/standby server group.
     *
     * @param request DeleteMasterSlaveServerGroupRequest
     * @return DeleteMasterSlaveServerGroupResponse
     */
    public DeleteMasterSlaveServerGroupResponse deleteMasterSlaveServerGroup(DeleteMasterSlaveServerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMasterSlaveServerGroupWithOptions(request, runtime);
    }

    /**
     * @summary Deletes forwarding rules.
     *
     * @description ## Limits
     * The RuleIds parameter is required. You can specify up to 10 forwarding rules in each request.
     *
     * @param request DeleteRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRulesResponse
     */
    public DeleteRulesResponse deleteRulesWithOptions(DeleteRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleIds)) {
            query.put("RuleIds", request.ruleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRules"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRulesResponse());
    }

    /**
     * @summary Deletes forwarding rules.
     *
     * @description ## Limits
     * The RuleIds parameter is required. You can specify up to 10 forwarding rules in each request.
     *
     * @param request DeleteRulesRequest
     * @return DeleteRulesResponse
     */
    public DeleteRulesResponse deleteRules(DeleteRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRulesWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a server certificate.
     *
     * @description >  You cannot delete server certificates that are in use.
     *
     * @param request DeleteServerCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServerCertificateResponse
     */
    public DeleteServerCertificateResponse deleteServerCertificateWithOptions(DeleteServerCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverCertificateId)) {
            query.put("ServerCertificateId", request.serverCertificateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServerCertificate"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServerCertificateResponse());
    }

    /**
     * @summary Deletes a server certificate.
     *
     * @description >  You cannot delete server certificates that are in use.
     *
     * @param request DeleteServerCertificateRequest
     * @return DeleteServerCertificateResponse
     */
    public DeleteServerCertificateResponse deleteServerCertificate(DeleteServerCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteServerCertificateWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a TLS policy.
     *
     * @description ## Debugging
     * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=Slb\\&api=DeleteTLSCipherPolicy\\&type=RPC\\&version=2014-05-15)
     *
     * @param request DeleteTLSCipherPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTLSCipherPolicyResponse
     */
    public DeleteTLSCipherPolicyResponse deleteTLSCipherPolicyWithOptions(DeleteTLSCipherPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TLSCipherPolicyId)) {
            query.put("TLSCipherPolicyId", request.TLSCipherPolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTLSCipherPolicy"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTLSCipherPolicyResponse());
    }

    /**
     * @summary Deletes a TLS policy.
     *
     * @description ## Debugging
     * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=Slb\\&api=DeleteTLSCipherPolicy\\&type=RPC\\&version=2014-05-15)
     *
     * @param request DeleteTLSCipherPolicyRequest
     * @return DeleteTLSCipherPolicyResponse
     */
    public DeleteTLSCipherPolicyResponse deleteTLSCipherPolicy(DeleteTLSCipherPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTLSCipherPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a VServer group.
     *
     * @param request DeleteVServerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVServerGroupResponse
     */
    public DeleteVServerGroupResponse deleteVServerGroupWithOptions(DeleteVServerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVServerGroup"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVServerGroupResponse());
    }

    /**
     * @summary Deletes a VServer group.
     *
     * @param request DeleteVServerGroupRequest
     * @return DeleteVServerGroupResponse
     */
    public DeleteVServerGroupResponse deleteVServerGroup(DeleteVServerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVServerGroupWithOptions(request, runtime);
    }

    /**
     * @summary Queries the configuration of an access control list (ACL).
     *
     * @param request DescribeAccessControlListAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessControlListAttributeResponse
     */
    public DescribeAccessControlListAttributeResponse describeAccessControlListAttributeWithOptions(DescribeAccessControlListAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclEntryComment)) {
            query.put("AclEntryComment", request.aclEntryComment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
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
            new TeaPair("action", "DescribeAccessControlListAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessControlListAttributeResponse());
    }

    /**
     * @summary Queries the configuration of an access control list (ACL).
     *
     * @param request DescribeAccessControlListAttributeRequest
     * @return DescribeAccessControlListAttributeResponse
     */
    public DescribeAccessControlListAttributeResponse describeAccessControlListAttribute(DescribeAccessControlListAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessControlListAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Queries access control lists (ACLs).
     *
     * @param request DescribeAccessControlListsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessControlListsResponse
     */
    public DescribeAccessControlListsResponse describeAccessControlListsWithOptions(DescribeAccessControlListsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclName)) {
            query.put("AclName", request.aclName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressIPVersion)) {
            query.put("AddressIPVersion", request.addressIPVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
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
            new TeaPair("action", "DescribeAccessControlLists"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessControlListsResponse());
    }

    /**
     * @summary Queries access control lists (ACLs).
     *
     * @param request DescribeAccessControlListsRequest
     * @return DescribeAccessControlListsResponse
     */
    public DescribeAccessControlListsResponse describeAccessControlLists(DescribeAccessControlListsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessControlListsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the access log of a Classic Load Balancer (CLB) instance.
     *
     * @param request DescribeAccessLogsDownloadAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessLogsDownloadAttributeResponse
     */
    public DescribeAccessLogsDownloadAttributeResponse describeAccessLogsDownloadAttributeWithOptions(DescribeAccessLogsDownloadAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logType)) {
            query.put("LogType", request.logType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccessLogsDownloadAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessLogsDownloadAttributeResponse());
    }

    /**
     * @summary Queries the access log of a Classic Load Balancer (CLB) instance.
     *
     * @param request DescribeAccessLogsDownloadAttributeRequest
     * @return DescribeAccessLogsDownloadAttributeResponse
     */
    public DescribeAccessLogsDownloadAttributeResponse describeAccessLogsDownloadAttribute(DescribeAccessLogsDownloadAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessLogsDownloadAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the available resources and resources that are available for purchase in the zones of a region.
     *
     * @description > Only the available resources and zones are returned.
     *
     * @param request DescribeAvailableResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAvailableResourceResponse
     */
    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(DescribeAvailableResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressIPVersion)) {
            query.put("AddressIPVersion", request.addressIPVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
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
            new TeaPair("action", "DescribeAvailableResource"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableResourceResponse());
    }

    /**
     * @summary Queries the available resources and resources that are available for purchase in the zones of a region.
     *
     * @description > Only the available resources and zones are returned.
     *
     * @param request DescribeAvailableResourceRequest
     * @return DescribeAvailableResourceResponse
     */
    public DescribeAvailableResourceResponse describeAvailableResource(DescribeAvailableResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableResourceWithOptions(request, runtime);
    }

    /**
     * @summary Queries certificate authority (CA) certificates.
     *
     * @description > To ensure data confidentiality, only the certificate fingerprint and name are returned. The certificate content is not returned.
     *
     * @param request DescribeCACertificatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCACertificatesResponse
     */
    public DescribeCACertificatesResponse describeCACertificatesWithOptions(DescribeCACertificatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.CACertificateId)) {
            query.put("CACertificateId", request.CACertificateId);
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
            new TeaPair("action", "DescribeCACertificates"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCACertificatesResponse());
    }

    /**
     * @summary Queries certificate authority (CA) certificates.
     *
     * @description > To ensure data confidentiality, only the certificate fingerprint and name are returned. The certificate content is not returned.
     *
     * @param request DescribeCACertificatesRequest
     * @return DescribeCACertificatesResponse
     */
    public DescribeCACertificatesResponse describeCACertificates(DescribeCACertificatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCACertificatesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the attributes of an additional certificate.
     *
     * @param request DescribeDomainExtensionAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainExtensionAttributeResponse
     */
    public DescribeDomainExtensionAttributeResponse describeDomainExtensionAttributeWithOptions(DescribeDomainExtensionAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainExtensionId)) {
            query.put("DomainExtensionId", request.domainExtensionId);
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
            new TeaPair("action", "DescribeDomainExtensionAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainExtensionAttributeResponse());
    }

    /**
     * @summary Queries the attributes of an additional certificate.
     *
     * @param request DescribeDomainExtensionAttributeRequest
     * @return DescribeDomainExtensionAttributeResponse
     */
    public DescribeDomainExtensionAttributeResponse describeDomainExtensionAttribute(DescribeDomainExtensionAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainExtensionAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Queries additional certificates.
     *
     * @param request DescribeDomainExtensionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainExtensionsResponse
     */
    public DescribeDomainExtensionsResponse describeDomainExtensionsWithOptions(DescribeDomainExtensionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainExtensionId)) {
            query.put("DomainExtensionId", request.domainExtensionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "DescribeDomainExtensions"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainExtensionsResponse());
    }

    /**
     * @summary Queries additional certificates.
     *
     * @param request DescribeDomainExtensionsRequest
     * @return DescribeDomainExtensionsResponse
     */
    public DescribeDomainExtensionsResponse describeDomainExtensions(DescribeDomainExtensionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainExtensionsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the health status of backend servers.
     *
     * @param request DescribeHealthStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHealthStatusResponse
     */
    public DescribeHealthStatusResponse describeHealthStatusWithOptions(DescribeHealthStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "DescribeHealthStatus"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHealthStatusResponse());
    }

    /**
     * @summary Queries the health status of backend servers.
     *
     * @param request DescribeHealthStatusRequest
     * @return DescribeHealthStatusResponse
     */
    public DescribeHealthStatusResponse describeHealthStatus(DescribeHealthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHealthStatusWithOptions(request, runtime);
    }

    /**
     * @summary Queries the configurations of fine-grained monitoring in a region.
     *
     * @param request DescribeHighDefinationMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHighDefinationMonitorResponse
     */
    public DescribeHighDefinationMonitorResponse describeHighDefinationMonitorWithOptions(DescribeHighDefinationMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeHighDefinationMonitor"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHighDefinationMonitorResponse());
    }

    /**
     * @summary Queries the configurations of fine-grained monitoring in a region.
     *
     * @param request DescribeHighDefinationMonitorRequest
     * @return DescribeHighDefinationMonitorResponse
     */
    public DescribeHighDefinationMonitorResponse describeHighDefinationMonitor(DescribeHighDefinationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHighDefinationMonitorWithOptions(request, runtime);
    }

    /**
     * @summary Queries the whitelist configurations of a listener.
     *
     * @param request DescribeListenerAccessControlAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeListenerAccessControlAttributeResponse
     */
    public DescribeListenerAccessControlAttributeResponse describeListenerAccessControlAttributeWithOptions(DescribeListenerAccessControlAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "DescribeListenerAccessControlAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeListenerAccessControlAttributeResponse());
    }

    /**
     * @summary Queries the whitelist configurations of a listener.
     *
     * @param request DescribeListenerAccessControlAttributeRequest
     * @return DescribeListenerAccessControlAttributeResponse
     */
    public DescribeListenerAccessControlAttributeResponse describeListenerAccessControlAttribute(DescribeListenerAccessControlAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeListenerAccessControlAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the detail of a Classic Load Balancer (CLB) instance.
     *
     * @description >  If backend servers are deployed in a vServer group, you can call the [DescribeVServerGroupAttribute](https://help.aliyun.com/document_detail/35224.html) operation to query the backend servers.
     *
     * @param request DescribeLoadBalancerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLoadBalancerAttributeResponse
     */
    public DescribeLoadBalancerAttributeResponse describeLoadBalancerAttributeWithOptions(DescribeLoadBalancerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "DescribeLoadBalancerAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancerAttributeResponse());
    }

    /**
     * @summary Queries the detail of a Classic Load Balancer (CLB) instance.
     *
     * @description >  If backend servers are deployed in a vServer group, you can call the [DescribeVServerGroupAttribute](https://help.aliyun.com/document_detail/35224.html) operation to query the backend servers.
     *
     * @param request DescribeLoadBalancerAttributeRequest
     * @return DescribeLoadBalancerAttributeResponse
     */
    public DescribeLoadBalancerAttributeResponse describeLoadBalancerAttribute(DescribeLoadBalancerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the configurations of an HTTP listener.
     *
     * @description *   A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/27577.html).
     * *   An HTTP listener is created. For more information about how to create an HTTP listener, see [CreateLoadBalancerHTTPListener](https://help.aliyun.com/document_detail/27592.html).
     *
     * @param request DescribeLoadBalancerHTTPListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLoadBalancerHTTPListenerAttributeResponse
     */
    public DescribeLoadBalancerHTTPListenerAttributeResponse describeLoadBalancerHTTPListenerAttributeWithOptions(DescribeLoadBalancerHTTPListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "DescribeLoadBalancerHTTPListenerAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancerHTTPListenerAttributeResponse());
    }

    /**
     * @summary Queries the configurations of an HTTP listener.
     *
     * @description *   A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/27577.html).
     * *   An HTTP listener is created. For more information about how to create an HTTP listener, see [CreateLoadBalancerHTTPListener](https://help.aliyun.com/document_detail/27592.html).
     *
     * @param request DescribeLoadBalancerHTTPListenerAttributeRequest
     * @return DescribeLoadBalancerHTTPListenerAttributeResponse
     */
    public DescribeLoadBalancerHTTPListenerAttributeResponse describeLoadBalancerHTTPListenerAttribute(DescribeLoadBalancerHTTPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerHTTPListenerAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the configurations of an HTTPS listener.
     *
     * @description *   A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/27577.html).
     * *   An HTTPS listener is created. For more information about how to create an HTTPS listener, see [CreateLoadBalancerHTTPSListener](https://help.aliyun.com/document_detail/27593.html).
     *
     * @param request DescribeLoadBalancerHTTPSListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLoadBalancerHTTPSListenerAttributeResponse
     */
    public DescribeLoadBalancerHTTPSListenerAttributeResponse describeLoadBalancerHTTPSListenerAttributeWithOptions(DescribeLoadBalancerHTTPSListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "DescribeLoadBalancerHTTPSListenerAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancerHTTPSListenerAttributeResponse());
    }

    /**
     * @summary Queries the configurations of an HTTPS listener.
     *
     * @description *   A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/27577.html).
     * *   An HTTPS listener is created. For more information about how to create an HTTPS listener, see [CreateLoadBalancerHTTPSListener](https://help.aliyun.com/document_detail/27593.html).
     *
     * @param request DescribeLoadBalancerHTTPSListenerAttributeRequest
     * @return DescribeLoadBalancerHTTPSListenerAttributeResponse
     */
    public DescribeLoadBalancerHTTPSListenerAttributeResponse describeLoadBalancerHTTPSListenerAttribute(DescribeLoadBalancerHTTPSListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerHTTPSListenerAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the listeners of a Classic Load Balancer (CLB) instance.
     *
     * @description *   A CLB instance is created. For more information, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/2401685.html).
     * *   One or more listeners are added to the CLB instance. For more information, see the following topics:
     *     *   [CreateLoadBalancerUDPListener](~~CreateLoadBalancerUDPListener~~)
     *     *   [CreateLoadBalancerTCPListener](~~CreateLoadBalancerTCPListener~~)
     *     *   [CreateLoadBalancerHTTPListener](~~CreateLoadBalancerHTTPListener~~)
     *     *   [CreateLoadBalancerHTTPSListener](~~CreateLoadBalancerHTTPSListener~~)
     *
     * @param request DescribeLoadBalancerListenersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLoadBalancerListenersResponse
     */
    public DescribeLoadBalancerListenersResponse describeLoadBalancerListenersWithOptions(DescribeLoadBalancerListenersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLoadBalancerListeners"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancerListenersResponse());
    }

    /**
     * @summary Queries the listeners of a Classic Load Balancer (CLB) instance.
     *
     * @description *   A CLB instance is created. For more information, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/2401685.html).
     * *   One or more listeners are added to the CLB instance. For more information, see the following topics:
     *     *   [CreateLoadBalancerUDPListener](~~CreateLoadBalancerUDPListener~~)
     *     *   [CreateLoadBalancerTCPListener](~~CreateLoadBalancerTCPListener~~)
     *     *   [CreateLoadBalancerHTTPListener](~~CreateLoadBalancerHTTPListener~~)
     *     *   [CreateLoadBalancerHTTPSListener](~~CreateLoadBalancerHTTPSListener~~)
     *
     * @param request DescribeLoadBalancerListenersRequest
     * @return DescribeLoadBalancerListenersResponse
     */
    public DescribeLoadBalancerListenersResponse describeLoadBalancerListeners(DescribeLoadBalancerListenersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerListenersWithOptions(request, runtime);
    }

    /**
     * @summary Queries the configurations of a TCP listener of Classic Load Balancer (CLB).
     *
     * @param request DescribeLoadBalancerTCPListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLoadBalancerTCPListenerAttributeResponse
     */
    public DescribeLoadBalancerTCPListenerAttributeResponse describeLoadBalancerTCPListenerAttributeWithOptions(DescribeLoadBalancerTCPListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "DescribeLoadBalancerTCPListenerAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancerTCPListenerAttributeResponse());
    }

    /**
     * @summary Queries the configurations of a TCP listener of Classic Load Balancer (CLB).
     *
     * @param request DescribeLoadBalancerTCPListenerAttributeRequest
     * @return DescribeLoadBalancerTCPListenerAttributeResponse
     */
    public DescribeLoadBalancerTCPListenerAttributeResponse describeLoadBalancerTCPListenerAttribute(DescribeLoadBalancerTCPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerTCPListenerAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the configurations of a UDP listener.
     *
     * @param request DescribeLoadBalancerUDPListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLoadBalancerUDPListenerAttributeResponse
     */
    public DescribeLoadBalancerUDPListenerAttributeResponse describeLoadBalancerUDPListenerAttributeWithOptions(DescribeLoadBalancerUDPListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "DescribeLoadBalancerUDPListenerAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancerUDPListenerAttributeResponse());
    }

    /**
     * @summary Queries the configurations of a UDP listener.
     *
     * @param request DescribeLoadBalancerUDPListenerAttributeRequest
     * @return DescribeLoadBalancerUDPListenerAttributeResponse
     */
    public DescribeLoadBalancerUDPListenerAttributeResponse describeLoadBalancerUDPListenerAttribute(DescribeLoadBalancerUDPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerUDPListenerAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Queries Classic Load Balancer (CLB) instances.
     *
     * @param request DescribeLoadBalancersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLoadBalancersResponse
     */
    public DescribeLoadBalancersResponse describeLoadBalancersWithOptions(DescribeLoadBalancersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressIPVersion)) {
            query.put("AddressIPVersion", request.addressIPVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerName)) {
            query.put("LoadBalancerName", request.loadBalancerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerStatus)) {
            query.put("LoadBalancerStatus", request.loadBalancerStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterZoneId)) {
            query.put("MasterZoneId", request.masterZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverIntranetAddress)) {
            query.put("ServerIntranetAddress", request.serverIntranetAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveZoneId)) {
            query.put("SlaveZoneId", request.slaveZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLoadBalancers"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancersResponse());
    }

    /**
     * @summary Queries Classic Load Balancer (CLB) instances.
     *
     * @param request DescribeLoadBalancersRequest
     * @return DescribeLoadBalancersResponse
     */
    public DescribeLoadBalancersResponse describeLoadBalancers(DescribeLoadBalancersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancersWithOptions(request, runtime);
    }

    /**
     * @summary Queries the detailed information about a primary/secondary server group.
     *
     * @param request DescribeMasterSlaveServerGroupAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMasterSlaveServerGroupAttributeResponse
     */
    public DescribeMasterSlaveServerGroupAttributeResponse describeMasterSlaveServerGroupAttributeWithOptions(DescribeMasterSlaveServerGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.masterSlaveServerGroupId)) {
            query.put("MasterSlaveServerGroupId", request.masterSlaveServerGroupId);
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
            new TeaPair("action", "DescribeMasterSlaveServerGroupAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMasterSlaveServerGroupAttributeResponse());
    }

    /**
     * @summary Queries the detailed information about a primary/secondary server group.
     *
     * @param request DescribeMasterSlaveServerGroupAttributeRequest
     * @return DescribeMasterSlaveServerGroupAttributeResponse
     */
    public DescribeMasterSlaveServerGroupAttributeResponse describeMasterSlaveServerGroupAttribute(DescribeMasterSlaveServerGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMasterSlaveServerGroupAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Queries primary/secondary server groups.
     *
     * @param request DescribeMasterSlaveServerGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMasterSlaveServerGroupsResponse
     */
    public DescribeMasterSlaveServerGroupsResponse describeMasterSlaveServerGroupsWithOptions(DescribeMasterSlaveServerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeListener)) {
            query.put("IncludeListener", request.includeListener);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMasterSlaveServerGroups"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMasterSlaveServerGroupsResponse());
    }

    /**
     * @summary Queries primary/secondary server groups.
     *
     * @param request DescribeMasterSlaveServerGroupsRequest
     * @return DescribeMasterSlaveServerGroupsResponse
     */
    public DescribeMasterSlaveServerGroupsResponse describeMasterSlaveServerGroups(DescribeMasterSlaveServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMasterSlaveServerGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Queries regions.
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
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2014-05-15"),
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
     * @summary Queries regions.
     *
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the configurations of a specified forwarding rule.
     *
     * @param request DescribeRuleAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRuleAttributeResponse
     */
    public DescribeRuleAttributeResponse describeRuleAttributeWithOptions(DescribeRuleAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRuleAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRuleAttributeResponse());
    }

    /**
     * @summary Queries the configurations of a specified forwarding rule.
     *
     * @param request DescribeRuleAttributeRequest
     * @return DescribeRuleAttributeResponse
     */
    public DescribeRuleAttributeResponse describeRuleAttribute(DescribeRuleAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRuleAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the forwarding rules that are configured for a specified listener.
     *
     * @param request DescribeRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRulesResponse
     */
    public DescribeRulesResponse describeRulesWithOptions(DescribeRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "DescribeRules"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRulesResponse());
    }

    /**
     * @summary Queries the forwarding rules that are configured for a specified listener.
     *
     * @param request DescribeRulesRequest
     * @return DescribeRulesResponse
     */
    public DescribeRulesResponse describeRules(DescribeRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRulesWithOptions(request, runtime);
    }

    /**
     * @summary Queries server certificates of Classic Load Balancer (CLB) instances in a specified region.
     *
     * @description >  For security reasons, only fingerprints and names of the server certificates are returned. The content of the server certificates and private keys is not returned.
     *
     * @param request DescribeServerCertificatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServerCertificatesResponse
     */
    public DescribeServerCertificatesResponse describeServerCertificatesWithOptions(DescribeServerCertificatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverCertificateId)) {
            query.put("ServerCertificateId", request.serverCertificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServerCertificates"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServerCertificatesResponse());
    }

    /**
     * @summary Queries server certificates of Classic Load Balancer (CLB) instances in a specified region.
     *
     * @description >  For security reasons, only fingerprints and names of the server certificates are returned. The content of the server certificates and private keys is not returned.
     *
     * @param request DescribeServerCertificatesRequest
     * @return DescribeServerCertificatesResponse
     */
    public DescribeServerCertificatesResponse describeServerCertificates(DescribeServerCertificatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServerCertificatesWithOptions(request, runtime);
    }

    /**
     * @summary Queries tags.
     *
     * @description When you call this operation, take note of the following items:
     * *   You can query tags by instance ID, tag key, and tag value. If the operation is successful, the system returns all tags that match the specified conditions.
     * *   The logical relationship among the specified conditions is AND. Only tags that match all the specified conditions are returned.
     * *   If the Tagkey parameter is set and the Tagvalue parameter is not set, all tags that contain the specified tag key are returned.
     * *   If you set the Tagvalue parameter in a request, you must also set the Tagkey parameter in the request.
     * *   If you set both the Tagkey and Tagvalue parameters, only tags that contain the specified keys and values are returned.
     *
     * @param request DescribeTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagsResponse
     */
    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.distinctKey)) {
            query.put("DistinctKey", request.distinctKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTags"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagsResponse());
    }

    /**
     * @summary Queries tags.
     *
     * @description When you call this operation, take note of the following items:
     * *   You can query tags by instance ID, tag key, and tag value. If the operation is successful, the system returns all tags that match the specified conditions.
     * *   The logical relationship among the specified conditions is AND. Only tags that match all the specified conditions are returned.
     * *   If the Tagkey parameter is set and the Tagvalue parameter is not set, all tags that contain the specified tag key are returned.
     * *   If you set the Tagvalue parameter in a request, you must also set the Tagkey parameter in the request.
     * *   If you set both the Tagkey and Tagvalue parameters, only tags that contain the specified keys and values are returned.
     *
     * @param request DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    /**
     * @summary Queries detailed information about a vServer group.
     *
     * @param request DescribeVServerGroupAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVServerGroupAttributeResponse
     */
    public DescribeVServerGroupAttributeResponse describeVServerGroupAttributeWithOptions(DescribeVServerGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVServerGroupAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVServerGroupAttributeResponse());
    }

    /**
     * @summary Queries detailed information about a vServer group.
     *
     * @param request DescribeVServerGroupAttributeRequest
     * @return DescribeVServerGroupAttributeResponse
     */
    public DescribeVServerGroupAttributeResponse describeVServerGroupAttribute(DescribeVServerGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVServerGroupAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Queries server groups.
     *
     * @param request DescribeVServerGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVServerGroupsResponse
     */
    public DescribeVServerGroupsResponse describeVServerGroupsWithOptions(DescribeVServerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeListener)) {
            query.put("IncludeListener", request.includeListener);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeRule)) {
            query.put("IncludeRule", request.includeRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVServerGroups"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVServerGroupsResponse());
    }

    /**
     * @summary Queries server groups.
     *
     * @param request DescribeVServerGroupsRequest
     * @return DescribeVServerGroupsResponse
     */
    public DescribeVServerGroupsResponse describeVServerGroups(DescribeVServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVServerGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the zones in a region.
     *
     * @param request DescribeZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeZones"),
            new TeaPair("version", "2014-05-15"),
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
     * @summary Queries the zones in a region.
     *
     * @param request DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    /**
     * @summary Enables fine-grained monitoring for the current region.
     *
     * @param request EnableHighDefinationMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableHighDefinationMonitorResponse
     */
    public EnableHighDefinationMonitorResponse enableHighDefinationMonitorWithOptions(EnableHighDefinationMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logProject)) {
            query.put("LogProject", request.logProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStore)) {
            query.put("LogStore", request.logStore);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableHighDefinationMonitor"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableHighDefinationMonitorResponse());
    }

    /**
     * @summary Enables fine-grained monitoring for the current region.
     *
     * @param request EnableHighDefinationMonitorRequest
     * @return EnableHighDefinationMonitorResponse
     */
    public EnableHighDefinationMonitorResponse enableHighDefinationMonitor(EnableHighDefinationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableHighDefinationMonitorWithOptions(request, runtime);
    }

    /**
     * @summary Queries Transport Layer Security (TLS) policies.
     *
     * @param request ListTLSCipherPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTLSCipherPoliciesResponse
     */
    public ListTLSCipherPoliciesResponse listTLSCipherPoliciesWithOptions(ListTLSCipherPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.includeListener)) {
            query.put("IncludeListener", request.includeListener);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItems)) {
            query.put("MaxItems", request.maxItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.TLSCipherPolicyId)) {
            query.put("TLSCipherPolicyId", request.TLSCipherPolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTLSCipherPolicies"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTLSCipherPoliciesResponse());
    }

    /**
     * @summary Queries Transport Layer Security (TLS) policies.
     *
     * @param request ListTLSCipherPoliciesRequest
     * @return ListTLSCipherPoliciesResponse
     */
    public ListTLSCipherPoliciesResponse listTLSCipherPolicies(ListTLSCipherPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTLSCipherPoliciesWithOptions(request, runtime);
    }

    /**
     * @summary Queries tags that are added to one or more instances.
     *
     * @description *   Set **ResourceId.N** or **Tag.N** that consists of **Tag.N.Key** and **Tag.N.Value** in the request to specify the object to be queried.
     * *   **Tag.N** is a resource tag that consists of a key-value pair. If you set only **Tag.N.Key**, all tag values that are associated with the specified tag key are returned. If you set only **Tag.N.Value**, an error message is returned.
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
            new TeaPair("version", "2014-05-15"),
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
     * @summary Queries tags that are added to one or more instances.
     *
     * @description *   Set **ResourceId.N** or **Tag.N** that consists of **Tag.N.Key** and **Tag.N.Value** in the request to specify the object to be queried.
     * *   **Tag.N** is a resource tag that consists of a key-value pair. If you set only **Tag.N.Key**, all tag values that are associated with the specified tag key are returned. If you set only **Tag.N.Value**, an error message is returned.
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

    /**
     * @summary Modifies the configuration of fine-grained monitoring in a specified region.
     *
     * @param request ModifyHighDefinationMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHighDefinationMonitorResponse
     */
    public ModifyHighDefinationMonitorResponse modifyHighDefinationMonitorWithOptions(ModifyHighDefinationMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logProject)) {
            query.put("LogProject", request.logProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStore)) {
            query.put("LogStore", request.logStore);
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
            new TeaPair("action", "ModifyHighDefinationMonitor"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHighDefinationMonitorResponse());
    }

    /**
     * @summary Modifies the configuration of fine-grained monitoring in a specified region.
     *
     * @param request ModifyHighDefinationMonitorRequest
     * @return ModifyHighDefinationMonitorResponse
     */
    public ModifyHighDefinationMonitorResponse modifyHighDefinationMonitor(ModifyHighDefinationMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHighDefinationMonitorWithOptions(request, runtime);
    }

    /**
     * @summary Changes the metering method of a pay-as-you-go Classic Load Balancer (CLB) instance.
     *
     * @description > *   For pay-as-you-go CLB instances, you can only change the metering method from pay-by-specification to pay-by-LCU. You cannot change the metering method from pay-by-LCU to pay-by-specification.
     * >*   This operation can change the metering method of only one instance at a time.
     *
     * @param request ModifyLoadBalancerInstanceChargeTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLoadBalancerInstanceChargeTypeResponse
     */
    public ModifyLoadBalancerInstanceChargeTypeResponse modifyLoadBalancerInstanceChargeTypeWithOptions(ModifyLoadBalancerInstanceChargeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargeType)) {
            query.put("InstanceChargeType", request.instanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerSpec)) {
            query.put("LoadBalancerSpec", request.loadBalancerSpec);
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
            new TeaPair("action", "ModifyLoadBalancerInstanceChargeType"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLoadBalancerInstanceChargeTypeResponse());
    }

    /**
     * @summary Changes the metering method of a pay-as-you-go Classic Load Balancer (CLB) instance.
     *
     * @description > *   For pay-as-you-go CLB instances, you can only change the metering method from pay-by-specification to pay-by-LCU. You cannot change the metering method from pay-by-LCU to pay-by-specification.
     * >*   This operation can change the metering method of only one instance at a time.
     *
     * @param request ModifyLoadBalancerInstanceChargeTypeRequest
     * @return ModifyLoadBalancerInstanceChargeTypeResponse
     */
    public ModifyLoadBalancerInstanceChargeTypeResponse modifyLoadBalancerInstanceChargeType(ModifyLoadBalancerInstanceChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLoadBalancerInstanceChargeTypeWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the specification of a Classic Load Balancer (CLB) instance.
     *
     * @param request ModifyLoadBalancerInstanceSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLoadBalancerInstanceSpecResponse
     */
    public ModifyLoadBalancerInstanceSpecResponse modifyLoadBalancerInstanceSpecWithOptions(ModifyLoadBalancerInstanceSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerSpec)) {
            query.put("LoadBalancerSpec", request.loadBalancerSpec);
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
            new TeaPair("action", "ModifyLoadBalancerInstanceSpec"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLoadBalancerInstanceSpecResponse());
    }

    /**
     * @summary Modifies the specification of a Classic Load Balancer (CLB) instance.
     *
     * @param request ModifyLoadBalancerInstanceSpecRequest
     * @return ModifyLoadBalancerInstanceSpecResponse
     */
    public ModifyLoadBalancerInstanceSpecResponse modifyLoadBalancerInstanceSpec(ModifyLoadBalancerInstanceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLoadBalancerInstanceSpecWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the metering method of an Internet-facing Classic Load Balancer (CLB) instance.
     *
     * @description ## Description
     * *   If you modify only the maximum bandwidth of a pay-by-bandwidth CLB instance, the new bandwidth immediately takes effect.
     * *   If you modify the metering method (for example, switch from pay-by-bandwidth to pay-by-data-transfer), the new metering method and the other changes specified in the operation take effect at 00:00:00 the next day.
     *
     * @param request ModifyLoadBalancerInternetSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLoadBalancerInternetSpecResponse
     */
    public ModifyLoadBalancerInternetSpecResponse modifyLoadBalancerInternetSpecWithOptions(ModifyLoadBalancerInternetSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "ModifyLoadBalancerInternetSpec"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLoadBalancerInternetSpecResponse());
    }

    /**
     * @summary Modifies the metering method of an Internet-facing Classic Load Balancer (CLB) instance.
     *
     * @description ## Description
     * *   If you modify only the maximum bandwidth of a pay-by-bandwidth CLB instance, the new bandwidth immediately takes effect.
     * *   If you modify the metering method (for example, switch from pay-by-bandwidth to pay-by-data-transfer), the new metering method and the other changes specified in the operation take effect at 00:00:00 the next day.
     *
     * @param request ModifyLoadBalancerInternetSpecRequest
     * @return ModifyLoadBalancerInternetSpecResponse
     */
    public ModifyLoadBalancerInternetSpecResponse modifyLoadBalancerInternetSpec(ModifyLoadBalancerInternetSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLoadBalancerInternetSpecWithOptions(request, runtime);
    }

    /**
     * @summary Changes the billing method of a Classic Load Balancer (CLB) instance from pay-as-you-go to subscription.
     *
     * @param request ModifyLoadBalancerPayTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLoadBalancerPayTypeResponse
     */
    public ModifyLoadBalancerPayTypeResponse modifyLoadBalancerPayTypeWithOptions(ModifyLoadBalancerPayTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
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
            new TeaPair("action", "ModifyLoadBalancerPayType"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLoadBalancerPayTypeResponse());
    }

    /**
     * @summary Changes the billing method of a Classic Load Balancer (CLB) instance from pay-as-you-go to subscription.
     *
     * @param request ModifyLoadBalancerPayTypeRequest
     * @return ModifyLoadBalancerPayTypeResponse
     */
    public ModifyLoadBalancerPayTypeResponse modifyLoadBalancerPayType(ModifyLoadBalancerPayTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLoadBalancerPayTypeWithOptions(request, runtime);
    }

    /**
     * @summary Replaces backend servers in a specified vServer group.
     *
     * @description You can call this operation to replace the backend servers in a specified vServer group. To modify the configurations of the backend servers, such as their weights, you can call the [SetVServerGroupAttribute](https://help.aliyun.com/document_detail/35217.html) operation.
     *
     * @param request ModifyVServerGroupBackendServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVServerGroupBackendServersResponse
     */
    public ModifyVServerGroupBackendServersResponse modifyVServerGroupBackendServersWithOptions(ModifyVServerGroupBackendServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newBackendServers)) {
            query.put("NewBackendServers", request.newBackendServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldBackendServers)) {
            query.put("OldBackendServers", request.oldBackendServers);
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

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVServerGroupBackendServers"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVServerGroupBackendServersResponse());
    }

    /**
     * @summary Replaces backend servers in a specified vServer group.
     *
     * @description You can call this operation to replace the backend servers in a specified vServer group. To modify the configurations of the backend servers, such as their weights, you can call the [SetVServerGroupAttribute](https://help.aliyun.com/document_detail/35217.html) operation.
     *
     * @param request ModifyVServerGroupBackendServersRequest
     * @return ModifyVServerGroupBackendServersResponse
     */
    public ModifyVServerGroupBackendServersResponse modifyVServerGroupBackendServers(ModifyVServerGroupBackendServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVServerGroupBackendServersWithOptions(request, runtime);
    }

    /**
     * @summary Moves a resource to another resource group.
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

        if (!com.aliyun.teautil.Common.isUnset(request.accessKeyId)) {
            query.put("access_key_id", request.accessKeyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2014-05-15"),
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
     * @summary Moves a resource to another resource group.
     *
     * @param request MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    /**
     * @summary Removes IP entries from the network access control list (ACL) of a Classic Load Balancer (CLB) instance.
     *
     * @param request RemoveAccessControlListEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveAccessControlListEntryResponse
     */
    public RemoveAccessControlListEntryResponse removeAccessControlListEntryWithOptions(RemoveAccessControlListEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclEntrys)) {
            query.put("AclEntrys", request.aclEntrys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
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
            new TeaPair("action", "RemoveAccessControlListEntry"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAccessControlListEntryResponse());
    }

    /**
     * @summary Removes IP entries from the network access control list (ACL) of a Classic Load Balancer (CLB) instance.
     *
     * @param request RemoveAccessControlListEntryRequest
     * @return RemoveAccessControlListEntryResponse
     */
    public RemoveAccessControlListEntryResponse removeAccessControlListEntry(RemoveAccessControlListEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeAccessControlListEntryWithOptions(request, runtime);
    }

    /**
     * @summary Removes backend servers.
     *
     * @description >  If the backend servers that you want to remove are not in the server list of the Classic Load Balancer (CLB) instance, the request fails. However, the system does not report an error.
     *
     * @param request RemoveBackendServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveBackendServersResponse
     */
    public RemoveBackendServersResponse removeBackendServersWithOptions(RemoveBackendServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendServers)) {
            query.put("BackendServers", request.backendServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "RemoveBackendServers"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveBackendServersResponse());
    }

    /**
     * @summary Removes backend servers.
     *
     * @description >  If the backend servers that you want to remove are not in the server list of the Classic Load Balancer (CLB) instance, the request fails. However, the system does not report an error.
     *
     * @param request RemoveBackendServersRequest
     * @return RemoveBackendServersResponse
     */
    public RemoveBackendServersResponse removeBackendServers(RemoveBackendServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeBackendServersWithOptions(request, runtime);
    }

    /**
     * @summary Removes IP addresses or CIDR blocks from the whitelist of a listener.
     *
     * @param request RemoveListenerWhiteListItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveListenerWhiteListItemResponse
     */
    public RemoveListenerWhiteListItemResponse removeListenerWhiteListItemWithOptions(RemoveListenerWhiteListItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sourceItems)) {
            query.put("SourceItems", request.sourceItems);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveListenerWhiteListItem"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveListenerWhiteListItemResponse());
    }

    /**
     * @summary Removes IP addresses or CIDR blocks from the whitelist of a listener.
     *
     * @param request RemoveListenerWhiteListItemRequest
     * @return RemoveListenerWhiteListItemResponse
     */
    public RemoveListenerWhiteListItemResponse removeListenerWhiteListItem(RemoveListenerWhiteListItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeListenerWhiteListItemWithOptions(request, runtime);
    }

    /**
     * @param request RemoveTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveTagsResponse
     */
    public RemoveTagsResponse removeTagsWithOptions(RemoveTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveTags"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTagsResponse());
    }

    /**
     * @param request RemoveTagsRequest
     * @return RemoveTagsResponse
     */
    public RemoveTagsResponse removeTags(RemoveTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTagsWithOptions(request, runtime);
    }

    /**
     * @summary Removes one or more backend servers from a specified vServer group.
     *
     * @description >  If one or more backend servers specified by the **BackendServers** parameter do not exist in the specified vServer group, these backend servers are ignored and no error message is returned.
     *
     * @param request RemoveVServerGroupBackendServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveVServerGroupBackendServersResponse
     */
    public RemoveVServerGroupBackendServersResponse removeVServerGroupBackendServersWithOptions(RemoveVServerGroupBackendServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendServers)) {
            query.put("BackendServers", request.backendServers);
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

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveVServerGroupBackendServers"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveVServerGroupBackendServersResponse());
    }

    /**
     * @summary Removes one or more backend servers from a specified vServer group.
     *
     * @description >  If one or more backend servers specified by the **BackendServers** parameter do not exist in the specified vServer group, these backend servers are ignored and no error message is returned.
     *
     * @param request RemoveVServerGroupBackendServersRequest
     * @return RemoveVServerGroupBackendServersResponse
     */
    public RemoveVServerGroupBackendServersResponse removeVServerGroupBackendServers(RemoveVServerGroupBackendServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeVServerGroupBackendServersWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the name of a network access control list (ACL).
     *
     * @param request SetAccessControlListAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetAccessControlListAttributeResponse
     */
    public SetAccessControlListAttributeResponse setAccessControlListAttributeWithOptions(SetAccessControlListAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclName)) {
            query.put("AclName", request.aclName);
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
            new TeaPair("action", "SetAccessControlListAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAccessControlListAttributeResponse());
    }

    /**
     * @summary Modifies the name of a network access control list (ACL).
     *
     * @param request SetAccessControlListAttributeRequest
     * @return SetAccessControlListAttributeResponse
     */
    public SetAccessControlListAttributeResponse setAccessControlListAttribute(SetAccessControlListAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAccessControlListAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Adds an access log forwarding rule for a Classic Load Balancer (CLB) instance.
     *
     * @param request SetAccessLogsDownloadAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetAccessLogsDownloadAttributeResponse
     */
    public SetAccessLogsDownloadAttributeResponse setAccessLogsDownloadAttributeWithOptions(SetAccessLogsDownloadAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logsDownloadAttributes)) {
            query.put("LogsDownloadAttributes", request.logsDownloadAttributes);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAccessLogsDownloadAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAccessLogsDownloadAttributeResponse());
    }

    /**
     * @summary Adds an access log forwarding rule for a Classic Load Balancer (CLB) instance.
     *
     * @param request SetAccessLogsDownloadAttributeRequest
     * @return SetAccessLogsDownloadAttributeResponse
     */
    public SetAccessLogsDownloadAttributeResponse setAccessLogsDownloadAttribute(SetAccessLogsDownloadAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAccessLogsDownloadAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Sets the weights of backend servers.
     *
     * @param request SetBackendServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetBackendServersResponse
     */
    public SetBackendServersResponse setBackendServersWithOptions(SetBackendServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendServers)) {
            query.put("BackendServers", request.backendServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "SetBackendServers"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetBackendServersResponse());
    }

    /**
     * @summary Sets the weights of backend servers.
     *
     * @param request SetBackendServersRequest
     * @return SetBackendServersResponse
     */
    public SetBackendServersResponse setBackendServers(SetBackendServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setBackendServersWithOptions(request, runtime);
    }

    /**
     * @summary Sets the name of a CA Certificate.
     *
     * @param request SetCACertificateNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetCACertificateNameResponse
     */
    public SetCACertificateNameResponse setCACertificateNameWithOptions(SetCACertificateNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.CACertificateId)) {
            query.put("CACertificateId", request.CACertificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CACertificateName)) {
            query.put("CACertificateName", request.CACertificateName);
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
            new TeaPair("action", "SetCACertificateName"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCACertificateNameResponse());
    }

    /**
     * @summary Sets the name of a CA Certificate.
     *
     * @param request SetCACertificateNameRequest
     * @return SetCACertificateNameResponse
     */
    public SetCACertificateNameResponse setCACertificateName(SetCACertificateNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCACertificateNameWithOptions(request, runtime);
    }

    /**
     * @summary Replaces an additional certificate.
     *
     * @description >  You cannot replace an additional certificate for a listener that is added to a shared-resource Server Load Balancer (SLB) instance.
     *
     * @param request SetDomainExtensionAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDomainExtensionAttributeResponse
     */
    public SetDomainExtensionAttributeResponse setDomainExtensionAttributeWithOptions(SetDomainExtensionAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainExtensionId)) {
            query.put("DomainExtensionId", request.domainExtensionId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.serverCertificateId)) {
            query.put("ServerCertificateId", request.serverCertificateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDomainExtensionAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDomainExtensionAttributeResponse());
    }

    /**
     * @summary Replaces an additional certificate.
     *
     * @description >  You cannot replace an additional certificate for a listener that is added to a shared-resource Server Load Balancer (SLB) instance.
     *
     * @param request SetDomainExtensionAttributeRequest
     * @return SetDomainExtensionAttributeResponse
     */
    public SetDomainExtensionAttributeResponse setDomainExtensionAttribute(SetDomainExtensionAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDomainExtensionAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Enables or disables the whitelist of a specified listener.
     *
     * @param request SetListenerAccessControlStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetListenerAccessControlStatusResponse
     */
    public SetListenerAccessControlStatusResponse setListenerAccessControlStatusWithOptions(SetListenerAccessControlStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessControlStatus)) {
            query.put("AccessControlStatus", request.accessControlStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "SetListenerAccessControlStatus"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetListenerAccessControlStatusResponse());
    }

    /**
     * @summary Enables or disables the whitelist of a specified listener.
     *
     * @param request SetListenerAccessControlStatusRequest
     * @return SetListenerAccessControlStatusResponse
     */
    public SetListenerAccessControlStatusResponse setListenerAccessControlStatus(SetListenerAccessControlStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setListenerAccessControlStatusWithOptions(request, runtime);
    }

    /**
     * @summary Enables or disables deletion protection for an SLB instance.
     *
     * @param request SetLoadBalancerDeleteProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetLoadBalancerDeleteProtectionResponse
     */
    public SetLoadBalancerDeleteProtectionResponse setLoadBalancerDeleteProtectionWithOptions(SetLoadBalancerDeleteProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteProtection)) {
            query.put("DeleteProtection", request.deleteProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "SetLoadBalancerDeleteProtection"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerDeleteProtectionResponse());
    }

    /**
     * @summary Enables or disables deletion protection for an SLB instance.
     *
     * @param request SetLoadBalancerDeleteProtectionRequest
     * @return SetLoadBalancerDeleteProtectionResponse
     */
    public SetLoadBalancerDeleteProtectionResponse setLoadBalancerDeleteProtection(SetLoadBalancerDeleteProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerDeleteProtectionWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the configurations of an HTTP listener.
     *
     * @description ### Prerequisites
     * *   A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/27577.html).
     * *   An HTTP listener is created. For more information about how to create an HTTP listener, see [CreateLoadBalancerHTTPListener](https://help.aliyun.com/document_detail/27592.html).
     *
     * @param request SetLoadBalancerHTTPListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetLoadBalancerHTTPListenerAttributeResponse
     */
    public SetLoadBalancerHTTPListenerAttributeResponse setLoadBalancerHTTPListenerAttributeWithOptions(SetLoadBalancerHTTPListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclStatus)) {
            query.put("AclStatus", request.aclStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclType)) {
            query.put("AclType", request.aclType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookie)) {
            query.put("Cookie", request.cookie);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookieTimeout)) {
            query.put("CookieTimeout", request.cookieTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gzip)) {
            query.put("Gzip", request.gzip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheck)) {
            query.put("HealthCheck", request.healthCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckDomain)) {
            query.put("HealthCheckDomain", request.healthCheckDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHttpCode)) {
            query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckMethod)) {
            query.put("HealthCheckMethod", request.healthCheckMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTimeout)) {
            query.put("HealthCheckTimeout", request.healthCheckTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckURI)) {
            query.put("HealthCheckURI", request.healthCheckURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTimeout)) {
            query.put("IdleTimeout", request.idleTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.requestTimeout)) {
            query.put("RequestTimeout", request.requestTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stickySession)) {
            query.put("StickySession", request.stickySession);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stickySessionType)) {
            query.put("StickySessionType", request.stickySessionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroup)) {
            query.put("VServerGroup", request.VServerGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor)) {
            query.put("XForwardedFor", request.XForwardedFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_ClientSrcPort)) {
            query.put("XForwardedFor_ClientSrcPort", request.XForwardedFor_ClientSrcPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_SLBID)) {
            query.put("XForwardedFor_SLBID", request.XForwardedFor_SLBID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_SLBIP)) {
            query.put("XForwardedFor_SLBIP", request.XForwardedFor_SLBIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_SLBPORT)) {
            query.put("XForwardedFor_SLBPORT", request.XForwardedFor_SLBPORT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_proto)) {
            query.put("XForwardedFor_proto", request.XForwardedFor_proto);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetLoadBalancerHTTPListenerAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerHTTPListenerAttributeResponse());
    }

    /**
     * @summary Modifies the configurations of an HTTP listener.
     *
     * @description ### Prerequisites
     * *   A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/27577.html).
     * *   An HTTP listener is created. For more information about how to create an HTTP listener, see [CreateLoadBalancerHTTPListener](https://help.aliyun.com/document_detail/27592.html).
     *
     * @param request SetLoadBalancerHTTPListenerAttributeRequest
     * @return SetLoadBalancerHTTPListenerAttributeResponse
     */
    public SetLoadBalancerHTTPListenerAttributeResponse setLoadBalancerHTTPListenerAttribute(SetLoadBalancerHTTPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerHTTPListenerAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the configurations of an HTTPS listener.
     *
     * @description *   A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/27577.html).
     * *   An HTTPS listener is created. For more information about how to create an HTTPS listener, see [CreateLoadBalancerHTTPSListener](https://help.aliyun.com/document_detail/27593.html).
     *
     * @param request SetLoadBalancerHTTPSListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetLoadBalancerHTTPSListenerAttributeResponse
     */
    public SetLoadBalancerHTTPSListenerAttributeResponse setLoadBalancerHTTPSListenerAttributeWithOptions(SetLoadBalancerHTTPSListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclStatus)) {
            query.put("AclStatus", request.aclStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclType)) {
            query.put("AclType", request.aclType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CACertificateId)) {
            query.put("CACertificateId", request.CACertificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookie)) {
            query.put("Cookie", request.cookie);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookieTimeout)) {
            query.put("CookieTimeout", request.cookieTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableHttp2)) {
            query.put("EnableHttp2", request.enableHttp2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gzip)) {
            query.put("Gzip", request.gzip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheck)) {
            query.put("HealthCheck", request.healthCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckDomain)) {
            query.put("HealthCheckDomain", request.healthCheckDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHttpCode)) {
            query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckMethod)) {
            query.put("HealthCheckMethod", request.healthCheckMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTimeout)) {
            query.put("HealthCheckTimeout", request.healthCheckTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckURI)) {
            query.put("HealthCheckURI", request.healthCheckURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTimeout)) {
            query.put("IdleTimeout", request.idleTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.requestTimeout)) {
            query.put("RequestTimeout", request.requestTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverCertificateId)) {
            query.put("ServerCertificateId", request.serverCertificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stickySession)) {
            query.put("StickySession", request.stickySession);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stickySessionType)) {
            query.put("StickySessionType", request.stickySessionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TLSCipherPolicy)) {
            query.put("TLSCipherPolicy", request.TLSCipherPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroup)) {
            query.put("VServerGroup", request.VServerGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor)) {
            query.put("XForwardedFor", request.XForwardedFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_ClientSrcPort)) {
            query.put("XForwardedFor_ClientSrcPort", request.XForwardedFor_ClientSrcPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_SLBID)) {
            query.put("XForwardedFor_SLBID", request.XForwardedFor_SLBID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_SLBIP)) {
            query.put("XForwardedFor_SLBIP", request.XForwardedFor_SLBIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_SLBPORT)) {
            query.put("XForwardedFor_SLBPORT", request.XForwardedFor_SLBPORT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor_proto)) {
            query.put("XForwardedFor_proto", request.XForwardedFor_proto);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetLoadBalancerHTTPSListenerAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerHTTPSListenerAttributeResponse());
    }

    /**
     * @summary Modifies the configurations of an HTTPS listener.
     *
     * @description *   A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/27577.html).
     * *   An HTTPS listener is created. For more information about how to create an HTTPS listener, see [CreateLoadBalancerHTTPSListener](https://help.aliyun.com/document_detail/27593.html).
     *
     * @param request SetLoadBalancerHTTPSListenerAttributeRequest
     * @return SetLoadBalancerHTTPSListenerAttributeResponse
     */
    public SetLoadBalancerHTTPSListenerAttributeResponse setLoadBalancerHTTPSListenerAttribute(SetLoadBalancerHTTPSListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerHTTPSListenerAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the configuration of the configuration read-only mode for a Classic Load Balancer (CLB) instance.
     *
     * @param request SetLoadBalancerModificationProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetLoadBalancerModificationProtectionResponse
     */
    public SetLoadBalancerModificationProtectionResponse setLoadBalancerModificationProtectionWithOptions(SetLoadBalancerModificationProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modificationProtectionReason)) {
            query.put("ModificationProtectionReason", request.modificationProtectionReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modificationProtectionStatus)) {
            query.put("ModificationProtectionStatus", request.modificationProtectionStatus);
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
            new TeaPair("action", "SetLoadBalancerModificationProtection"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerModificationProtectionResponse());
    }

    /**
     * @summary Modifies the configuration of the configuration read-only mode for a Classic Load Balancer (CLB) instance.
     *
     * @param request SetLoadBalancerModificationProtectionRequest
     * @return SetLoadBalancerModificationProtectionResponse
     */
    public SetLoadBalancerModificationProtectionResponse setLoadBalancerModificationProtection(SetLoadBalancerModificationProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerModificationProtectionWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the name of a Classic Load Balancer (CLB) instance.
     *
     * @param request SetLoadBalancerNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetLoadBalancerNameResponse
     */
    public SetLoadBalancerNameResponse setLoadBalancerNameWithOptions(SetLoadBalancerNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerName)) {
            query.put("LoadBalancerName", request.loadBalancerName);
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
            new TeaPair("action", "SetLoadBalancerName"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerNameResponse());
    }

    /**
     * @summary Modifies the name of a Classic Load Balancer (CLB) instance.
     *
     * @param request SetLoadBalancerNameRequest
     * @return SetLoadBalancerNameResponse
     */
    public SetLoadBalancerNameResponse setLoadBalancerName(SetLoadBalancerNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerNameWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the state of a Classic Load Balancer (CLB) instance.
     *
     * @param request SetLoadBalancerStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetLoadBalancerStatusResponse
     */
    public SetLoadBalancerStatusResponse setLoadBalancerStatusWithOptions(SetLoadBalancerStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerStatus)) {
            query.put("LoadBalancerStatus", request.loadBalancerStatus);
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
            new TeaPair("action", "SetLoadBalancerStatus"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerStatusResponse());
    }

    /**
     * @summary Modifies the state of a Classic Load Balancer (CLB) instance.
     *
     * @param request SetLoadBalancerStatusRequest
     * @return SetLoadBalancerStatusResponse
     */
    public SetLoadBalancerStatusResponse setLoadBalancerStatus(SetLoadBalancerStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerStatusWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the configurations of a TCP listener of Classic Load Balancer (CLB).
     *
     * @description *   A CLB instance is created. For more information, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/2401685.html).
     * *   A TCP listener is created. For more information, see [CreateLoadBalancerTCPListener](~~CreateLoadBalancerTCPListener~~).
     *
     * @param request SetLoadBalancerTCPListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetLoadBalancerTCPListenerAttributeResponse
     */
    public SetLoadBalancerTCPListenerAttributeResponse setLoadBalancerTCPListenerAttributeWithOptions(SetLoadBalancerTCPListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclStatus)) {
            query.put("AclStatus", request.aclStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclType)) {
            query.put("AclType", request.aclType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionDrain)) {
            query.put("ConnectionDrain", request.connectionDrain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionDrainTimeout)) {
            query.put("ConnectionDrainTimeout", request.connectionDrainTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.establishedTimeout)) {
            query.put("EstablishedTimeout", request.establishedTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectTimeout)) {
            query.put("HealthCheckConnectTimeout", request.healthCheckConnectTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckDomain)) {
            query.put("HealthCheckDomain", request.healthCheckDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHttpCode)) {
            query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckSwitch)) {
            query.put("HealthCheckSwitch", request.healthCheckSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckType)) {
            query.put("HealthCheckType", request.healthCheckType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckURI)) {
            query.put("HealthCheckURI", request.healthCheckURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterSlaveServerGroup)) {
            query.put("MasterSlaveServerGroup", request.masterSlaveServerGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterSlaveServerGroupId)) {
            query.put("MasterSlaveServerGroupId", request.masterSlaveServerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.persistenceTimeout)) {
            query.put("PersistenceTimeout", request.persistenceTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyProtocolV2Enabled)) {
            query.put("ProxyProtocolV2Enabled", request.proxyProtocolV2Enabled);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synProxy)) {
            query.put("SynProxy", request.synProxy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroup)) {
            query.put("VServerGroup", request.VServerGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetLoadBalancerTCPListenerAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerTCPListenerAttributeResponse());
    }

    /**
     * @summary Modifies the configurations of a TCP listener of Classic Load Balancer (CLB).
     *
     * @description *   A CLB instance is created. For more information, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/2401685.html).
     * *   A TCP listener is created. For more information, see [CreateLoadBalancerTCPListener](~~CreateLoadBalancerTCPListener~~).
     *
     * @param request SetLoadBalancerTCPListenerAttributeRequest
     * @return SetLoadBalancerTCPListenerAttributeResponse
     */
    public SetLoadBalancerTCPListenerAttributeResponse setLoadBalancerTCPListenerAttribute(SetLoadBalancerTCPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerTCPListenerAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the configurations of a UDP listener.
     *
     * @description *   A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/27577.html).
     * *   A UDP listener is created. For more information, see [CreateLoadBalancerUDPListener](https://help.aliyun.com/document_detail/27595.html).
     *
     * @param request SetLoadBalancerUDPListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetLoadBalancerUDPListenerAttributeResponse
     */
    public SetLoadBalancerUDPListenerAttributeResponse setLoadBalancerUDPListenerAttributeWithOptions(SetLoadBalancerUDPListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclStatus)) {
            query.put("AclStatus", request.aclStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclType)) {
            query.put("AclType", request.aclType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectTimeout)) {
            query.put("HealthCheckConnectTimeout", request.healthCheckConnectTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckSwitch)) {
            query.put("HealthCheckSwitch", request.healthCheckSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterSlaveServerGroup)) {
            query.put("MasterSlaveServerGroup", request.masterSlaveServerGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterSlaveServerGroupId)) {
            query.put("MasterSlaveServerGroupId", request.masterSlaveServerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyProtocolV2Enabled)) {
            query.put("ProxyProtocolV2Enabled", request.proxyProtocolV2Enabled);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroup)) {
            query.put("VServerGroup", request.VServerGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckExp)) {
            query.put("healthCheckExp", request.healthCheckExp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckReq)) {
            query.put("healthCheckReq", request.healthCheckReq);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetLoadBalancerUDPListenerAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerUDPListenerAttributeResponse());
    }

    /**
     * @summary Modifies the configurations of a UDP listener.
     *
     * @description *   A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](https://help.aliyun.com/document_detail/27577.html).
     * *   A UDP listener is created. For more information, see [CreateLoadBalancerUDPListener](https://help.aliyun.com/document_detail/27595.html).
     *
     * @param request SetLoadBalancerUDPListenerAttributeRequest
     * @return SetLoadBalancerUDPListenerAttributeResponse
     */
    public SetLoadBalancerUDPListenerAttributeResponse setLoadBalancerUDPListenerAttribute(SetLoadBalancerUDPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerUDPListenerAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a forwarding rule that is associated with a vServer group.
     *
     * @param request SetRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetRuleResponse
     */
    public SetRuleResponse setRuleWithOptions(SetRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cookie)) {
            query.put("Cookie", request.cookie);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookieTimeout)) {
            query.put("CookieTimeout", request.cookieTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheck)) {
            query.put("HealthCheck", request.healthCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckDomain)) {
            query.put("HealthCheckDomain", request.healthCheckDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHttpCode)) {
            query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTimeout)) {
            query.put("HealthCheckTimeout", request.healthCheckTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckURI)) {
            query.put("HealthCheckURI", request.healthCheckURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerSync)) {
            query.put("ListenerSync", request.listenerSync);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stickySession)) {
            query.put("StickySession", request.stickySession);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stickySessionType)) {
            query.put("StickySessionType", request.stickySessionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetRule"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetRuleResponse());
    }

    /**
     * @summary Modifies a forwarding rule that is associated with a vServer group.
     *
     * @param request SetRuleRequest
     * @return SetRuleResponse
     */
    public SetRuleResponse setRule(SetRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setRuleWithOptions(request, runtime);
    }

    /**
     * @summary Sets a name for a server certificate.
     *
     * @param request SetServerCertificateNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetServerCertificateNameResponse
     */
    public SetServerCertificateNameResponse setServerCertificateNameWithOptions(SetServerCertificateNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverCertificateId)) {
            query.put("ServerCertificateId", request.serverCertificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverCertificateName)) {
            query.put("ServerCertificateName", request.serverCertificateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetServerCertificateName"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetServerCertificateNameResponse());
    }

    /**
     * @summary Sets a name for a server certificate.
     *
     * @param request SetServerCertificateNameRequest
     * @return SetServerCertificateNameResponse
     */
    public SetServerCertificateNameResponse setServerCertificateName(SetServerCertificateNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setServerCertificateNameWithOptions(request, runtime);
    }

    /**
     * @summary Configures a Transport Layer Security (TLS) policy.
     *
     * @param request SetTLSCipherPolicyAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetTLSCipherPolicyAttributeResponse
     */
    public SetTLSCipherPolicyAttributeResponse setTLSCipherPolicyAttributeWithOptions(SetTLSCipherPolicyAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ciphers)) {
            query.put("Ciphers", request.ciphers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.TLSCipherPolicyId)) {
            query.put("TLSCipherPolicyId", request.TLSCipherPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TLSVersions)) {
            query.put("TLSVersions", request.TLSVersions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetTLSCipherPolicyAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetTLSCipherPolicyAttributeResponse());
    }

    /**
     * @summary Configures a Transport Layer Security (TLS) policy.
     *
     * @param request SetTLSCipherPolicyAttributeRequest
     * @return SetTLSCipherPolicyAttributeResponse
     */
    public SetTLSCipherPolicyAttributeResponse setTLSCipherPolicyAttribute(SetTLSCipherPolicyAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setTLSCipherPolicyAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the configurations of a vServer group.
     *
     * @description This operation allows you to modify only the name of a vServer group and the weights of the backend servers in the vServer group.
     * *   If you want to modify backend servers in a specified vServer group, call the [ModifyVServerGroupBackendServers](https://help.aliyun.com/document_detail/35220.html) operation.
     * *   If you want to add backend servers to a specified vServer group, call the [AddVServerGroupBackendServers](https://help.aliyun.com/document_detail/35218.html) operation.
     *
     * @param request SetVServerGroupAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetVServerGroupAttributeResponse
     */
    public SetVServerGroupAttributeResponse setVServerGroupAttributeWithOptions(SetVServerGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendServers)) {
            query.put("BackendServers", request.backendServers);
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

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupName)) {
            query.put("VServerGroupName", request.VServerGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetVServerGroupAttribute"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetVServerGroupAttributeResponse());
    }

    /**
     * @summary Modifies the configurations of a vServer group.
     *
     * @description This operation allows you to modify only the name of a vServer group and the weights of the backend servers in the vServer group.
     * *   If you want to modify backend servers in a specified vServer group, call the [ModifyVServerGroupBackendServers](https://help.aliyun.com/document_detail/35220.html) operation.
     * *   If you want to add backend servers to a specified vServer group, call the [AddVServerGroupBackendServers](https://help.aliyun.com/document_detail/35218.html) operation.
     *
     * @param request SetVServerGroupAttributeRequest
     * @return SetVServerGroupAttributeResponse
     */
    public SetVServerGroupAttributeResponse setVServerGroupAttribute(SetVServerGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setVServerGroupAttributeWithOptions(request, runtime);
    }

    /**
     * @summary You can call this operation to start a listener.
     *
     * @description When you call this operation, note the following items:
     * *   You can call the operation only when the listener is in the Stopped state.
     * *   After the operation is called, the status of the listener changes to Starting.
     * *   You cannot call this operation when the SLB instance to which the listener is bound is in the Locked state.
     *
     * @param request StartLoadBalancerListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartLoadBalancerListenerResponse
     */
    public StartLoadBalancerListenerResponse startLoadBalancerListenerWithOptions(StartLoadBalancerListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "StartLoadBalancerListener"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartLoadBalancerListenerResponse());
    }

    /**
     * @summary You can call this operation to start a listener.
     *
     * @description When you call this operation, note the following items:
     * *   You can call the operation only when the listener is in the Stopped state.
     * *   After the operation is called, the status of the listener changes to Starting.
     * *   You cannot call this operation when the SLB instance to which the listener is bound is in the Locked state.
     *
     * @param request StartLoadBalancerListenerRequest
     * @return StartLoadBalancerListenerResponse
     */
    public StartLoadBalancerListenerResponse startLoadBalancerListener(StartLoadBalancerListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startLoadBalancerListenerWithOptions(request, runtime);
    }

    /**
     * @summary Stops a listener.
     *
     * @description Before you make this API call, note the following:
     * *   After the API call is successfully made, the listener enters the stopped state.
     * *   If the Server Load Balancer (SLB) instance to which the listener to be stopped belongs is in the locked state, this API call cannot be made.
     * >  If you stop the listener, your services will be disrupted. Exercise caution when you perform this action.
     *
     * @param request StopLoadBalancerListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopLoadBalancerListenerResponse
     */
    public StopLoadBalancerListenerResponse stopLoadBalancerListenerWithOptions(StopLoadBalancerListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
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
            new TeaPair("action", "StopLoadBalancerListener"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopLoadBalancerListenerResponse());
    }

    /**
     * @summary Stops a listener.
     *
     * @description Before you make this API call, note the following:
     * *   After the API call is successfully made, the listener enters the stopped state.
     * *   If the Server Load Balancer (SLB) instance to which the listener to be stopped belongs is in the locked state, this API call cannot be made.
     * >  If you stop the listener, your services will be disrupted. Exercise caution when you perform this action.
     *
     * @param request StopLoadBalancerListenerRequest
     * @return StopLoadBalancerListenerResponse
     */
    public StopLoadBalancerListenerResponse stopLoadBalancerListener(StopLoadBalancerListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopLoadBalancerListenerWithOptions(request, runtime);
    }

    /**
     * @summary Creates tags and adds the tags to resources.
     *
     * @description >  You can add at most 20 tags to each instance. Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number is reached, an error message is returned.
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
            new TeaPair("version", "2014-05-15"),
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
     * @summary Creates tags and adds the tags to resources.
     *
     * @description >  You can add at most 20 tags to each instance. Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number is reached, an error message is returned.
     *
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Removes tags from specified resources.
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
            new TeaPair("version", "2014-05-15"),
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
     * @summary Removes tags from specified resources.
     *
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Uploads a CA certificate.
     *
     * @description You can upload only one CA certificate at a time. After a CA certificate is uploaded, the certificate ID, name, and fingerprint are returned.
     *
     * @param request UploadCACertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadCACertificateResponse
     */
    public UploadCACertificateResponse uploadCACertificateWithOptions(UploadCACertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.CACertificate)) {
            query.put("CACertificate", request.CACertificate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CACertificateName)) {
            query.put("CACertificateName", request.CACertificateName);
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
            new TeaPair("action", "UploadCACertificate"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadCACertificateResponse());
    }

    /**
     * @summary Uploads a CA certificate.
     *
     * @description You can upload only one CA certificate at a time. After a CA certificate is uploaded, the certificate ID, name, and fingerprint are returned.
     *
     * @param request UploadCACertificateRequest
     * @return UploadCACertificateResponse
     */
    public UploadCACertificateResponse uploadCACertificate(UploadCACertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadCACertificateWithOptions(request, runtime);
    }

    /**
     * @summary Uploads a server certificate.
     *
     * @description *   You can upload only one server certificate and its private key in each call.
     * *   After a server certificate and its private key are uploaded, the fingerprints of all server certificates that belong to your Alibaba Cloud account are returned.
     *
     * @param request UploadServerCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadServerCertificateResponse
     */
    public UploadServerCertificateResponse uploadServerCertificateWithOptions(UploadServerCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliCloudCertificateId)) {
            query.put("AliCloudCertificateId", request.aliCloudCertificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliCloudCertificateName)) {
            query.put("AliCloudCertificateName", request.aliCloudCertificateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliCloudCertificateRegionId)) {
            query.put("AliCloudCertificateRegionId", request.aliCloudCertificateRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateKey)) {
            query.put("PrivateKey", request.privateKey);
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

        if (!com.aliyun.teautil.Common.isUnset(request.serverCertificate)) {
            query.put("ServerCertificate", request.serverCertificate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverCertificateName)) {
            query.put("ServerCertificateName", request.serverCertificateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadServerCertificate"),
            new TeaPair("version", "2014-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadServerCertificateResponse());
    }

    /**
     * @summary Uploads a server certificate.
     *
     * @description *   You can upload only one server certificate and its private key in each call.
     * *   After a server certificate and its private key are uploaded, the fingerprints of all server certificates that belong to your Alibaba Cloud account are returned.
     *
     * @param request UploadServerCertificateRequest
     * @return UploadServerCertificateResponse
     */
    public UploadServerCertificateResponse uploadServerCertificate(UploadServerCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadServerCertificateWithOptions(request, runtime);
    }
}

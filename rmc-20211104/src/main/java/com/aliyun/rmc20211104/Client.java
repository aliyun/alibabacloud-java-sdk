// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmc20211104;

import com.aliyun.tea.*;
import com.aliyun.rmc20211104.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("rmc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
      * This section provides the types of resources that can be queried. Two-way queries are supported. For example, you can query the disks (ACS::ECS::Disk) that are associated with a specific Elastic Compute Service (ECS) instance (ACS::ECS::Instance) or query the ECS instance that is associated with a specific disk.  
      * - For ECS instances, the following types of resources can be queried:    - ACS::ECS::Disk
      *   - ACS::EIP::EipAddress
      *   - ACS::VPC::VPC
      *   - ACS::ECS::KeyPair
      *   - ACS::ECS::SecurityGroup
      *   - ACS::ECS::NetworkInterface
      *   - ACS::ECS::Image
      * - For virtual private clouds (VPCs), which are indicated by ACS::VPC::VPC, the following types of resources can be queried:    - ACS::ECS::Instance
      *   - ACS::RDS::DBInstance
      *   - ACS::SLB::LoadBalancer
      *   - ACS::ALB::LoadBalancer
      *   - ACS::Elasticsearch::Instance
      *   - ACS::Redis::DBInstance
      *   - ACS::PolarDB::DBCluster
      *   - ACS::MongoDB::DBInstance
      *   - ACS::DRDS::PolarDBXInstance
      *   - ACS::EDAS::Cluster
      *   - ACS::ECI::ContainerGroup
      *   - ACS::ADB::DBCluster
      *   - ACS::DRDS::DBInstance
      *   - ACS::HBase::Cluster
      *   - ACS::EMR::Cluster
      * This topic provides an example on how to call the API operation to query the resources that are associated with the ECS instance `i-uf6imlgyr1nudhud****` in the China (Shanghai) region.
      * ## Prerequisites
      * Resource Meta Center (RMC) is enabled. For more information, see [Query resources that belong to different resource groups](~~310198~~).
      * ## QPS limits
      * You can call this API operation up to 20 times per second per account. Requests that exceed this limit will fail, and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.
      *
      * @param request ListResourceRelationshipsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListResourceRelationshipsResponse
     */
    public ListResourceRelationshipsResponse listResourceRelationshipsWithOptions(ListResourceRelationshipsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRegionId)) {
            query.put("SourceRegionId", request.sourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceResourceId)) {
            query.put("SourceResourceId", request.sourceResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceResourceType)) {
            query.put("SourceResourceType", request.sourceResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetResourceType)) {
            query.put("TargetResourceType", request.targetResourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceRelationships"),
            new TeaPair("version", "2021-11-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceRelationshipsResponse());
    }

    /**
      * This section provides the types of resources that can be queried. Two-way queries are supported. For example, you can query the disks (ACS::ECS::Disk) that are associated with a specific Elastic Compute Service (ECS) instance (ACS::ECS::Instance) or query the ECS instance that is associated with a specific disk.  
      * - For ECS instances, the following types of resources can be queried:    - ACS::ECS::Disk
      *   - ACS::EIP::EipAddress
      *   - ACS::VPC::VPC
      *   - ACS::ECS::KeyPair
      *   - ACS::ECS::SecurityGroup
      *   - ACS::ECS::NetworkInterface
      *   - ACS::ECS::Image
      * - For virtual private clouds (VPCs), which are indicated by ACS::VPC::VPC, the following types of resources can be queried:    - ACS::ECS::Instance
      *   - ACS::RDS::DBInstance
      *   - ACS::SLB::LoadBalancer
      *   - ACS::ALB::LoadBalancer
      *   - ACS::Elasticsearch::Instance
      *   - ACS::Redis::DBInstance
      *   - ACS::PolarDB::DBCluster
      *   - ACS::MongoDB::DBInstance
      *   - ACS::DRDS::PolarDBXInstance
      *   - ACS::EDAS::Cluster
      *   - ACS::ECI::ContainerGroup
      *   - ACS::ADB::DBCluster
      *   - ACS::DRDS::DBInstance
      *   - ACS::HBase::Cluster
      *   - ACS::EMR::Cluster
      * This topic provides an example on how to call the API operation to query the resources that are associated with the ECS instance `i-uf6imlgyr1nudhud****` in the China (Shanghai) region.
      * ## Prerequisites
      * Resource Meta Center (RMC) is enabled. For more information, see [Query resources that belong to different resource groups](~~310198~~).
      * ## QPS limits
      * You can call this API operation up to 20 times per second per account. Requests that exceed this limit will fail, and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.
      *
      * @param request ListResourceRelationshipsRequest
      * @return ListResourceRelationshipsResponse
     */
    public ListResourceRelationshipsResponse listResourceRelationships(ListResourceRelationshipsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceRelationshipsWithOptions(request, runtime);
    }

    /**
      * For more information about resource types that support RMC, see [Resource types that support RMC](https://www.alibabacloud.com/help/en/resource-management/latest/resource-types-that-support-rmc).  
      * This topic provides an example on how to call the API operation to query the resources that can be accessed within the current account in the China (Hangzhou) region.
      * ## Prerequisites
      * Resource Meta Center (RMC) is enabled. For more information, see [Query resources that belong to different resource groups](~~310198~~).
      * ## QPS limits
      * You can call this API operation up to 20 times per second per account. Requests that exceed this limit will fail, and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.
      *
      * @param request SearchResourcesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SearchResourcesResponse
     */
    public SearchResourcesResponse searchResourcesWithOptions(SearchResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortCriterion)) {
            query.put("SortCriterion", request.sortCriterion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchResources"),
            new TeaPair("version", "2021-11-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchResourcesResponse());
    }

    /**
      * For more information about resource types that support RMC, see [Resource types that support RMC](https://www.alibabacloud.com/help/en/resource-management/latest/resource-types-that-support-rmc).  
      * This topic provides an example on how to call the API operation to query the resources that can be accessed within the current account in the China (Hangzhou) region.
      * ## Prerequisites
      * Resource Meta Center (RMC) is enabled. For more information, see [Query resources that belong to different resource groups](~~310198~~).
      * ## QPS limits
      * You can call this API operation up to 20 times per second per account. Requests that exceed this limit will fail, and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.
      *
      * @param request SearchResourcesRequest
      * @return SearchResourcesResponse
     */
    public SearchResourcesResponse searchResources(SearchResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchResourcesWithOptions(request, runtime);
    }
}

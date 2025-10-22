// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019;

import com.aliyun.tea.*;
import com.aliyun.starrocks20221019.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("starrocks", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>资源转组</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceGroup/change"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>资源转组</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.changeResourceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建StarRocks集群</p>
     * 
     * @param request CreateInstanceV1Request
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceV1Response
     */
    public CreateInstanceV1Response createInstanceV1WithOptions(CreateInstanceV1Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adminPassword)) {
            body.put("AdminPassword", request.adminPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentNodeGroup)) {
            body.put("AgentNodeGroup", request.agentNodeGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            body.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendNodeGroups)) {
            body.put("BackendNodeGroups", request.backendNodeGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encrypted)) {
            body.put("Encrypted", request.encrypted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frontendNodeGroups)) {
            body.put("FrontendNodeGroups", request.frontendNodeGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            body.put("GatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsKeyId)) {
            body.put("KmsKeyId", request.kmsKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.observerNodeGroups)) {
            body.put("ObserverNodeGroups", request.observerNodeGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossAccessingRoleName)) {
            body.put("OssAccessingRoleName", request.ossAccessingRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            body.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            body.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            body.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            body.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runMode)) {
            body.put("RunMode", request.runMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitches)) {
            body.put("VSwitches", request.vSwitches);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("Version", request.version);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceV1"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/cluster/createV1"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceV1Response());
    }

    /**
     * <b>summary</b> : 
     * <p>创建StarRocks集群</p>
     * 
     * @param request CreateInstanceV1Request
     * @return CreateInstanceV1Response
     */
    public CreateInstanceV1Response createInstanceV1(CreateInstanceV1Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceV1WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>为用户创建AliyunServiceRoleForEMRStarRocks</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceLinkedRoleResponse
     */
    public CreateServiceLinkedRoleResponse createServiceLinkedRoleWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceLinkedRole"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/user/create_default_role"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceLinkedRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>为用户创建AliyunServiceRoleForEMRStarRocks</p>
     * @return CreateServiceLinkedRoleResponse
     */
    public CreateServiceLinkedRoleResponse createServiceLinkedRole() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceLinkedRoleWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据集群ID或者名称等信息过滤集群</p>
     * 
     * @param tmpReq DescribeInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeInstancesShrinkRequest request = new DescribeInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceStatus)) {
            query.put("InstanceStatus", request.instanceStatus);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstances"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/starrocks/describeInstances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据集群ID或者名称等信息过滤集群</p>
     * 
     * @param request DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInstancesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取节点组信息</p>
     * 
     * @param request DescribeNodeGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNodeGroupsResponse
     */
    public DescribeNodeGroupsResponse describeNodeGroupsWithOptions(DescribeNodeGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentType)) {
            body.put("componentType", request.componentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupIds)) {
            body.put("nodeGroupIds", request.nodeGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupName)) {
            body.put("nodeGroupName", request.nodeGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNodeGroups"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/nodegroup/describeNodeGroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNodeGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取节点组信息</p>
     * 
     * @param request DescribeNodeGroupsRequest
     * @return DescribeNodeGroupsResponse
     */
    public DescribeNodeGroupsResponse describeNodeGroups(DescribeNodeGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeNodeGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the number of CUs for a warehouse of only StarRocks instances of Standard Edition.</li>
     * <li>You can increase the number of disks only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you modify the number of CUs for a warehouse, the billing of CUs has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged based on the number of CUs.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of CUs before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the number of CUs for a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyCuRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCuResponse
     */
    public ModifyCuResponse modifyCuWithOptions(ModifyCuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fastMode)) {
            query.put("FastMode", request.fastMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCu"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceChange/modifyCu"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCuResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the number of CUs for a warehouse of only StarRocks instances of Standard Edition.</li>
     * <li>You can increase the number of disks only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you modify the number of CUs for a warehouse, the billing of CUs has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged based on the number of CUs.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of CUs before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the number of CUs for a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyCuRequest
     * @return ModifyCuResponse
     */
    public ModifyCuResponse modifyCu(ModifyCuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyCuWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a precheck before you modify the number of CUs for a warehouse.</p>
     * 
     * @param request ModifyCuPreCheckRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCuPreCheckResponse
     */
    public ModifyCuPreCheckResponse modifyCuPreCheckWithOptions(ModifyCuPreCheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCuPreCheck"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceChange/modifyCuPreCheck"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCuPreCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a precheck before you modify the number of CUs for a warehouse.</p>
     * 
     * @param request ModifyCuPreCheckRequest
     * @return ModifyCuPreCheckResponse
     */
    public ModifyCuPreCheckResponse modifyCuPreCheck(ModifyCuPreCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyCuPreCheckWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances. Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can increase the number of disks only for StarRocks instances of Standard Edition.</li>
     * <li>You can increase the number of disks only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you increase the number of disks for a warehouse, the billing of disks has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk type.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of disks before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Increases the number of disks for a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyDiskNumberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDiskNumberResponse
     */
    public ModifyDiskNumberResponse modifyDiskNumberWithOptions(ModifyDiskNumberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fastMode)) {
            query.put("FastMode", request.fastMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDiskNumber"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceChange/modifyDiskNumber"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDiskNumberResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances. Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can increase the number of disks only for StarRocks instances of Standard Edition.</li>
     * <li>You can increase the number of disks only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you increase the number of disks for a warehouse, the billing of disks has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk type.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of disks before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Increases the number of disks for a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyDiskNumberRequest
     * @return ModifyDiskNumberResponse
     */
    public ModifyDiskNumberResponse modifyDiskNumber(ModifyDiskNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyDiskNumberWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/en/product/ecs?_p_lc=1&spm=openapi-amp.newDocPublishment.0.0.47c9281fkIZGiB#pricing">pricing</a> of EMR Serverless StarRocks instances.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the disk performance level only for StarRocks instances of Standard Edition.</li>
     * <li>You can modify the disk performance level only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>You cannot downgrade the performance level to PL0.</li>
     * <li>The performance level of an Enterprise SSD (ESSD) is limited by the ESSD disk size. If you cannot upgrade the performance level of an ESSD, expand the ESSD and try again. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">Enterprise SSDs</a>.
     * After the disk performance level is changed, the billing of the disk has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk type.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the disk performance level before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the disk performance level for a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyDiskPerformanceLevelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDiskPerformanceLevelResponse
     */
    public ModifyDiskPerformanceLevelResponse modifyDiskPerformanceLevelWithOptions(ModifyDiskPerformanceLevelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDiskPerformanceLevel"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceChange/modifyDiskPerformanceLevel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDiskPerformanceLevelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/en/product/ecs?_p_lc=1&spm=openapi-amp.newDocPublishment.0.0.47c9281fkIZGiB#pricing">pricing</a> of EMR Serverless StarRocks instances.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the disk performance level only for StarRocks instances of Standard Edition.</li>
     * <li>You can modify the disk performance level only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>You cannot downgrade the performance level to PL0.</li>
     * <li>The performance level of an Enterprise SSD (ESSD) is limited by the ESSD disk size. If you cannot upgrade the performance level of an ESSD, expand the ESSD and try again. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">Enterprise SSDs</a>.
     * After the disk performance level is changed, the billing of the disk has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk type.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the disk performance level before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the disk performance level for a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyDiskPerformanceLevelRequest
     * @return ModifyDiskPerformanceLevelResponse
     */
    public ModifyDiskPerformanceLevelResponse modifyDiskPerformanceLevel(ModifyDiskPerformanceLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyDiskPerformanceLevelWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances. Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can expand the disk size only for StarRocks instances of Standard Edition.</li>
     * <li>You can expand the disk size only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you expand the disk size, the billing of disks has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk size.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the disk size before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Expands the disk size for a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyDiskSizeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDiskSizeResponse
     */
    public ModifyDiskSizeResponse modifyDiskSizeWithOptions(ModifyDiskSizeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fastMode)) {
            query.put("FastMode", request.fastMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDiskSize"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceChange/modifyDiskSize"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDiskSizeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances. Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can expand the disk size only for StarRocks instances of Standard Edition.</li>
     * <li>You can expand the disk size only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you expand the disk size, the billing of disks has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk size.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the disk size before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Expands the disk size for a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyDiskSizeRequest
     * @return ModifyDiskSizeResponse
     */
    public ModifyDiskSizeResponse modifyDiskSize(ModifyDiskSizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyDiskSizeWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances. Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the number of nodes in a warehouse of only StarRocks instances of Standard Edition.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>The number of frontend nodes (FEs) cannot be an even number, and you cannot reduce the number of FE nodes.
     * After you modify the number of nodes in a warehouse, the billing of nodes has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged based on the number of nodes.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of nodes before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the number of nodes in a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyNodeNumberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNodeNumberResponse
     */
    public ModifyNodeNumberResponse modifyNodeNumberWithOptions(ModifyNodeNumberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNodeNumber"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceChange/modifyNodeNumber"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNodeNumberResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances. Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the number of nodes in a warehouse of only StarRocks instances of Standard Edition.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>The number of frontend nodes (FEs) cannot be an even number, and you cannot reduce the number of FE nodes.
     * After you modify the number of nodes in a warehouse, the billing of nodes has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged based on the number of nodes.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of nodes before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the number of nodes in a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyNodeNumberRequest
     * @return ModifyNodeNumberResponse
     */
    public ModifyNodeNumberResponse modifyNodeNumber(ModifyNodeNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyNodeNumberWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a precheck before you modify the number of nodes in a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyNodeNumberPreCheckRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNodeNumberPreCheckResponse
     */
    public ModifyNodeNumberPreCheckResponse modifyNodeNumberPreCheckWithOptions(ModifyNodeNumberPreCheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNodeNumberPreCheck"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceChange/modifyNodeNumberPreCheck"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNodeNumberPreCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a precheck before you modify the number of nodes in a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyNodeNumberPreCheckRequest
     * @return ModifyNodeNumberPreCheckResponse
     */
    public ModifyNodeNumberPreCheckResponse modifyNodeNumberPreCheck(ModifyNodeNumberPreCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyNodeNumberPreCheckWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the versions of an E-MapReduce (EMR) Serverless StarRocks instance that the versions that you can upgrade to. The versions of a StarRocks instance include the major version and minor version. You can view the major version and minor version of a StarRocks instance in the Version Information section of the Instance Details tab in the EMR console. You can call this operation to query the minor versions or major versions that the versions that you can upgrade to.</p>
     * 
     * @param request QueryUpgradableVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUpgradableVersionsResponse
     */
    public QueryUpgradableVersionsResponse queryUpgradableVersionsWithOptions(QueryUpgradableVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minor)) {
            query.put("Minor", request.minor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUpgradableVersions"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/starrocks/queryUpgradableVersions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUpgradableVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the versions of an E-MapReduce (EMR) Serverless StarRocks instance that the versions that you can upgrade to. The versions of a StarRocks instance include the major version and minor version. You can view the major version and minor version of a StarRocks instance in the Version Information section of the Instance Details tab in the EMR console. You can call this operation to query the minor versions or major versions that the versions that you can upgrade to.</p>
     * 
     * @param request QueryUpgradableVersionsRequest
     * @return QueryUpgradableVersionsResponse
     */
    public QueryUpgradableVersionsResponse queryUpgradableVersions(QueryUpgradableVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUpgradableVersionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Warning:</strong> After an instance is released, all physical resources used by the instance are recycled. Relevant data is erased and cannot be restored.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Releases a pay-as-you-go E-MapReduce (EMR) Serverless StarRocks instance. To unsubscribe from a subscription instance, go to the Unsubscribe page of the Expenses and Costs console.</p>
     * 
     * @param request ReleaseInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstanceWithOptions(ReleaseInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseInstance"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/cluster/release"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Warning:</strong> After an instance is released, all physical resources used by the instance are recycled. Relevant data is erased and cannot be restored.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Releases a pay-as-you-go E-MapReduce (EMR) Serverless StarRocks instance. To unsubscribe from a subscription instance, go to the Unsubscribe page of the Expenses and Costs console.</p>
     * 
     * @param request ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is an asynchronous operation. After you call this operation to restart a StarRocks instance, the operation sets the status of the instance to Restarting and begins the restart process. When the status of the instance changes to Running, the instance is restarted.</p>
     * 
     * <b>summary</b> : 
     * <p>Restarts an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request RestartInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstanceWithOptions(RestartInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fastMode)) {
            query.put("FastMode", request.fastMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartInstance"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/starrocks/restartCluster"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is an asynchronous operation. After you call this operation to restart a StarRocks instance, the operation sets the status of the instance to Restarting and begins the restart process. When the status of the instance changes to Running, the instance is restarted.</p>
     * 
     * <b>summary</b> : 
     * <p>Restarts an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>打标</p>
     * 
     * @param request TagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/tags"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>打标</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除标签</p>
     * 
     * @param tmpReq UnTagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnTagResourcesResponse
     */
    public UnTagResourcesResponse unTagResourcesWithOptions(UnTagResourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UnTagResourcesShrinkRequest request = new UnTagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceId)) {
            request.resourceIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceId, "ResourceId", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagKey)) {
            request.tagKeyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagKey, "TagKey", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdShrink)) {
            query.put("ResourceId", request.resourceIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyShrink)) {
            query.put("TagKey", request.tagKeyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnTagResources"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/tags"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除标签</p>
     * 
     * @param request UnTagResourcesRequest
     * @return UnTagResourcesResponse
     */
    public UnTagResourcesResponse unTagResources(UnTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unTagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request UpdateInstanceNameRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceNameWithOptions(UpdateInstanceNameRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceName"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/cluster/update_name"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request UpdateInstanceNameRequest
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceName(UpdateInstanceNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceNameWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The instance must be in the Running state when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the version of an E-MapReduce (EMR) Serverless StarRocks instance. The versions of a StarRocks instance include the major version and minor version. You can view the major version and minor version of a StarRocks instance in the Version Information section of the Instance Details tab in the EMR console. This operation can be used to upgrade the minor version or major version of a StarRocks instance. You can call the QueryUpgradableVersions operation to query the versions that you can upgrade to.</p>
     * 
     * @param request UpgradeVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeVersionResponse
     */
    public UpgradeVersionResponse upgradeVersionWithOptions(UpgradeVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fastMode)) {
            query.put("FastMode", request.fastMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minor)) {
            query.put("Minor", request.minor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetVersion)) {
            query.put("TargetVersion", request.targetVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeVersion"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/starrocks/upgradeVersion"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>The instance must be in the Running state when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the version of an E-MapReduce (EMR) Serverless StarRocks instance. The versions of a StarRocks instance include the major version and minor version. You can view the major version and minor version of a StarRocks instance in the Version Information section of the Instance Details tab in the EMR console. This operation can be used to upgrade the minor version or major version of a StarRocks instance. You can call the QueryUpgradableVersions operation to query the versions that you can upgrade to.</p>
     * 
     * @param request UpgradeVersionRequest
     * @return UpgradeVersionResponse
     */
    public UpgradeVersionResponse upgradeVersion(UpgradeVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeVersionWithOptions(request, headers, runtime);
    }
}

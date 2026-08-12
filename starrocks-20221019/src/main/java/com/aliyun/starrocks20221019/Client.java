// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019;

import com.aliyun.tea.*;
import com.aliyun.starrocks20221019.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-southeast-1", "starrocks.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "starrocks.ap-southeast-5.aliyuncs.com"),
            new TeaPair("cn-beijing", "starrocks.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "starrocks.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong", "starrocks.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-qingdao", "starrocks.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-shanghai", "starrocks.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "starrocks.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "starrocks.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "starrocks.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("us-west-1", "starrocks.us-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "starrocks.us-east-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "starrocks.eu-central-1.aliyuncs.com")
        );
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
     * <p>Adds a backup policy.</p>
     * 
     * @param request AddBackupPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddBackupPolicyResponse
     */
    public AddBackupPolicyResponse addBackupPolicyWithOptions(AddBackupPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireDays)) {
            body.put("ExpireDays", request.expireDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hour)) {
            body.put("Hour", request.hour);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minute)) {
            body.put("Minute", request.minute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrenceType)) {
            body.put("RecurrenceType", request.recurrenceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrenceValues)) {
            body.put("RecurrenceValues", request.recurrenceValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutSeconds)) {
            body.put("TimeoutSeconds", request.timeoutSeconds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddBackupPolicy"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/backupRestore/policy/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddBackupPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a backup policy.</p>
     * 
     * @param request AddBackupPolicyRequest
     * @return AddBackupPolicyResponse
     */
    public AddBackupPolicyResponse addBackupPolicy(AddBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addBackupPolicyWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The AddGateway operation requires software stack version 1.7.6 or later and at least three front-end (FE) nodes.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a gateway.</p>
     * 
     * @param request AddGatewayRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGatewayResponse
     */
    public AddGatewayResponse addGatewayWithOptions(AddGatewayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.feNodeNumber)) {
            query.put("FeNodeNumber", request.feNodeNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayName)) {
            query.put("GatewayName", request.gatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGateway"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/gateway/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGatewayResponse());
    }

    /**
     * <b>description</b> :
     * <p>The AddGateway operation requires software stack version 1.7.6 or later and at least three front-end (FE) nodes.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a gateway.</p>
     * 
     * @param request AddGatewayRequest
     * @return AddGatewayResponse
     */
    public AddGatewayResponse addGateway(AddGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addGatewayWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation changes the resource group of a Serverless StarRocks instance.</p>
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
     * <p>This operation changes the resource group of a Serverless StarRocks instance.</p>
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
     * <p>Check the inventory of resources.</p>
     * 
     * @param request CheckInventoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckInventoryResponse
     */
    public CheckInventoryResponse checkInventoryWithOptions(CheckInventoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterInfo)) {
            query.put("ClusterInfo", request.clusterInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckInventory"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/check/inventory"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckInventoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Check the inventory of resources.</p>
     * 
     * @param request CheckInventoryRequest
     * @return CheckInventoryResponse
     */
    public CheckInventoryResponse checkInventory(CheckInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkInventoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an Agent compute group.</p>
     * 
     * @param request CreateAgentResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentResourceResponse
     */
    public CreateAgentResourceResponse createAgentResourceWithOptions(CreateAgentResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cu)) {
            query.put("Cu", request.cu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("SpecType", request.specType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgentResource"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/lifecycle/createAgentNodeGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an Agent compute group.</p>
     * 
     * @param request CreateAgentResourceRequest
     * @return CreateAgentResourceResponse
     */
    public CreateAgentResourceResponse createAgentResource(CreateAgentResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAgentResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing method and &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Serverless StarRocks instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.dlfCatalogName)) {
            body.put("DlfCatalogName", request.dlfCatalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dlfCatalogType)) {
            body.put("DlfCatalogType", request.dlfCatalogType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAiFunction)) {
            body.put("EnableAiFunction", request.enableAiFunction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableMultiAz)) {
            body.put("EnableMultiAz", request.enableMultiAz);
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

        if (!com.aliyun.teautil.Common.isUnset(request.linkedRamUserName)) {
            body.put("LinkedRamUserName", request.linkedRamUserName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.principalType)) {
            body.put("PrincipalType", request.principalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            body.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramUserId)) {
            body.put("RamUserId", request.ramUserId);
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
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing method and &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Serverless StarRocks instance.</p>
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
     * <p>Create a scaling rule.</p>
     * 
     * @param request CreateScalingRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScalingRuleResponse
     */
    public CreateScalingRuleResponse createScalingRuleWithOptions(CreateScalingRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            query.put("TriggerType", request.triggerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScalingRule"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/scalingRule/createScalingRule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScalingRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a scaling rule.</p>
     * 
     * @param request CreateScalingRuleRequest
     * @return CreateScalingRuleResponse
     */
    public CreateScalingRuleResponse createScalingRule(CreateScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createScalingRuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation creates the AliyunServiceRoleForEMRStarRocks role.</p>
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
     * <p>This operation creates the AliyunServiceRoleForEMRStarRocks role.</p>
     * @return CreateServiceLinkedRoleResponse
     */
    public CreateServiceLinkedRoleResponse createServiceLinkedRole() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceLinkedRoleWithOptions(headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a data backup.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a data backup.</p>
     * 
     * @param request DeleteBackupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBackupResponse
     */
    public DeleteBackupResponse deleteBackupWithOptions(DeleteBackupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupTaskId)) {
            query.put("BackupTaskId", request.backupTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBackup"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/backup/manage/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBackupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a data backup.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a data backup.</p>
     * 
     * @param request DeleteBackupRequest
     * @return DeleteBackupResponse
     */
    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBackupWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a backup policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a backup policy.</p>
     * 
     * @param request DeleteBackupPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBackupPolicyResponse
     */
    public DeleteBackupPolicyResponse deleteBackupPolicyWithOptions(DeleteBackupPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBackupPolicy"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/backupRestore/policy/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBackupPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a backup policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a backup policy.</p>
     * 
     * @param request DeleteBackupPolicyRequest
     * @return DeleteBackupPolicyResponse
     */
    public DeleteBackupPolicyResponse deleteBackupPolicy(DeleteBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBackupPolicyWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a gateway group. After the gateway group is deleted, its FE nodes are automatically assigned to the default gateway group.</p>
     * 
     * <b>summary</b> : 
     * <p>Deleting a gateway</p>
     * 
     * @param request DeleteGatewayRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayResponse
     */
    public DeleteGatewayResponse deleteGatewayWithOptions(DeleteGatewayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGateway"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/gateway/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a gateway group. After the gateway group is deleted, its FE nodes are automatically assigned to the default gateway group.</p>
     * 
     * <b>summary</b> : 
     * <p>Deleting a gateway</p>
     * 
     * @param request DeleteGatewayRequest
     * @return DeleteGatewayResponse
     */
    public DeleteGatewayResponse deleteGateway(DeleteGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGatewayWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an internal network whitelist group.</p>
     * 
     * @param request DeleteInnerIpWhitelistGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInnerIpWhitelistGroupResponse
     */
    public DeleteInnerIpWhitelistGroupResponse deleteInnerIpWhitelistGroupWithOptions(DeleteInnerIpWhitelistGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.innerIpWhitelistGroupId)) {
            body.put("InnerIpWhitelistGroupId", request.innerIpWhitelistGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInnerIpWhitelistGroup"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/securityGroup/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInnerIpWhitelistGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an internal network whitelist group.</p>
     * 
     * @param request DeleteInnerIpWhitelistGroupRequest
     * @return DeleteInnerIpWhitelistGroupResponse
     */
    public DeleteInnerIpWhitelistGroupResponse deleteInnerIpWhitelistGroup(DeleteInnerIpWhitelistGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInnerIpWhitelistGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a scaling rule.</p>
     * 
     * @param request DeleteScalingRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScalingRuleResponse
     */
    public DeleteScalingRuleResponse deleteScalingRuleWithOptions(DeleteScalingRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleId)) {
            query.put("ScalingRuleId", request.scalingRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            query.put("TriggerType", request.triggerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScalingRule"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/scalingRule/deleteScalingRule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScalingRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a scaling rule.</p>
     * 
     * @param request DeleteScalingRuleRequest
     * @return DeleteScalingRuleResponse
     */
    public DeleteScalingRuleResponse deleteScalingRule(DeleteScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteScalingRuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available zones in a region.</p>
     * 
     * @param request DescribeAvailableZonesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAvailableZonesResponse
     */
    public DescribeAvailableZonesResponse describeAvailableZonesWithOptions(DescribeAvailableZonesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableZones"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/zone/describeZones"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available zones in a region.</p>
     * 
     * @param request DescribeAvailableZonesRequest
     * @return DescribeAvailableZonesResponse
     */
    public DescribeAvailableZonesResponse describeAvailableZones(DescribeAvailableZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAvailableZonesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieve details of backup policies.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieve details of backup policies.</p>
     * 
     * @param request DescribeBackupPoliciesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupPoliciesResponse
     */
    public DescribeBackupPoliciesResponse describeBackupPoliciesWithOptions(DescribeBackupPoliciesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupPolicies"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/backupRestore/policy/describe"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupPoliciesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieve details of backup policies.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieve details of backup policies.</p>
     * 
     * @param request DescribeBackupPoliciesRequest
     * @return DescribeBackupPoliciesResponse
     */
    public DescribeBackupPoliciesResponse describeBackupPolicies(DescribeBackupPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeBackupPoliciesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous interface. Instance restarts are not immediate. After a successful call, the instance first enters the restarting state. The instance is successfully restarted when its status returns to running.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain backup details</p>
     * 
     * @param request DescribeBackupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupsResponse
     */
    public DescribeBackupsResponse describeBackupsWithOptions(DescribeBackupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupTaskId)) {
            query.put("BackupTaskId", request.backupTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.statuses)) {
            query.put("Statuses", request.statuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePeriodEndTime)) {
            query.put("TimePeriodEndTime", request.timePeriodEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePeriodStartTime)) {
            query.put("TimePeriodStartTime", request.timePeriodStartTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackups"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/backup/manage/describe"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous interface. Instance restarts are not immediate. After a successful call, the instance first enters the restarting state. The instance is successfully restarted when its status returns to running.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain backup details</p>
     * 
     * @param request DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    public DescribeBackupsResponse describeBackups(DescribeBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeBackupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous API, meaning the instance restart is not immediate. After a successful call, the instance enters the <code>restarting</code> state, and the process completes when its state changes to <code>running</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Querying instance configuration history</p>
     * 
     * @param request DescribeConfigHistoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConfigHistoryResponse
     */
    public DescribeConfigHistoryResponse describeConfigHistoryWithOptions(DescribeConfigHistoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.effectStatuses)) {
            query.put("EffectStatuses", request.effectStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needTotal)) {
            query.put("NeedTotal", request.needTotal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConfigHistory"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/config/describeConfigHistory"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConfigHistoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous API, meaning the instance restart is not immediate. After a successful call, the instance enters the <code>restarting</code> state, and the process completes when its state changes to <code>running</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Querying instance configuration history</p>
     * 
     * @param request DescribeConfigHistoryRequest
     * @return DescribeConfigHistoryResponse
     */
    public DescribeConfigHistoryResponse describeConfigHistory(DescribeConfigHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeConfigHistoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the cluster event name.</p>
     * 
     * @param request DescribeEventNamesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventNamesResponse
     */
    public DescribeEventNamesResponse describeEventNamesWithOptions(DescribeEventNamesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeEventNames"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/event/describeEventNames"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventNamesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the cluster event name.</p>
     * 
     * @param request DescribeEventNamesRequest
     * @return DescribeEventNamesResponse
     */
    public DescribeEventNamesResponse describeEventNames(DescribeEventNamesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEventNamesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the whitelist groups for a private network.</p>
     * 
     * @param request DescribeInnerIpWhitelistGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInnerIpWhitelistGroupsResponse
     */
    public DescribeInnerIpWhitelistGroupsResponse describeInnerIpWhitelistGroupsWithOptions(DescribeInnerIpWhitelistGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeInnerIpWhitelistGroups"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/securityGroup/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInnerIpWhitelistGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the whitelist groups for a private network.</p>
     * 
     * @param request DescribeInnerIpWhitelistGroupsRequest
     * @return DescribeInnerIpWhitelistGroupsResponse
     */
    public DescribeInnerIpWhitelistGroupsResponse describeInnerIpWhitelistGroups(DescribeInnerIpWhitelistGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInnerIpWhitelistGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries instance configurations.</p>
     * 
     * @param request DescribeInstanceConfigsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceConfigsResponse
     */
    public DescribeInstanceConfigsResponse describeInstanceConfigsWithOptions(DescribeInstanceConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowModify)) {
            query.put("AllowModify", request.allowModify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configKey)) {
            query.put("ConfigKey", request.configKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configType)) {
            query.put("ConfigType", request.configType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needTotal)) {
            query.put("NeedTotal", request.needTotal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceConfigs"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/config/describeInstanceConfigs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries instance configurations.</p>
     * 
     * @param request DescribeInstanceConfigsRequest
     * @return DescribeInstanceConfigsResponse
     */
    public DescribeInstanceConfigsResponse describeInstanceConfigs(DescribeInstanceConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInstanceConfigsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve instance health diagnosis results.</p>
     * 
     * @param request DescribeInstanceDiagnosisResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceDiagnosisResultResponse
     */
    public DescribeInstanceDiagnosisResultResponse describeInstanceDiagnosisResultWithOptions(DescribeInstanceDiagnosisResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dimension)) {
            query.put("Dimension", request.dimension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportDate)) {
            query.put("ReportDate", request.reportDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statuses)) {
            query.put("Statuses", request.statuses);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceDiagnosisResult"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/diagnosis/describe"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceDiagnosisResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve instance health diagnosis results.</p>
     * 
     * @param request DescribeInstanceDiagnosisResultRequest
     * @return DescribeInstanceDiagnosisResultResponse
     */
    public DescribeInstanceDiagnosisResultResponse describeInstanceDiagnosisResult(DescribeInstanceDiagnosisResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInstanceDiagnosisResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the meta token for a StarRocks instance.</p>
     * 
     * @param request DescribeInstanceMetaTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceMetaTokenResponse
     */
    public DescribeInstanceMetaTokenResponse describeInstanceMetaTokenWithOptions(DescribeInstanceMetaTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeInstanceMetaToken"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/migration/getMetaToken"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceMetaTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the meta token for a StarRocks instance.</p>
     * 
     * @param request DescribeInstanceMetaTokenRequest
     * @return DescribeInstanceMetaTokenResponse
     */
    public DescribeInstanceMetaTokenResponse describeInstanceMetaToken(DescribeInstanceMetaTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInstanceMetaTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation queries Serverless StarRocks instances. You can filter the instances by criteria such as instance name and tags.</p>
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
     * <p>This operation queries Serverless StarRocks instances. You can filter the instances by criteria such as instance name and tags.</p>
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
     * <p>Retrieves node group information.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
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
     * <p>Retrieves node group information.</p>
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
     * <p>This operation is asynchronous. After you call this operation, the instance enters a restarting state but does not restart immediately. The restart is complete when the instance status changes to running.</p>
     * 
     * <b>summary</b> : 
     * <p>You can view the list of available regions.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/region/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is asynchronous. After you call this operation, the instance enters a restarting state but does not restart immediately. The restart is complete when the instance status changes to running.</p>
     * 
     * <b>summary</b> : 
     * <p>You can view the list of available regions.</p>
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get resource constraint configurations.</p>
     * 
     * @param request DescribeResourceConstraintsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceConstraintsResponse
     */
    public DescribeResourceConstraintsResponse describeResourceConstraintsWithOptions(DescribeResourceConstraintsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.architecture)) {
            query.put("Architecture", request.architecture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            query.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runMode)) {
            query.put("RunMode", request.runMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceConstraints"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/starrocks/describeResourceConstraints"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceConstraintsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get resource constraint configurations.</p>
     * 
     * @param request DescribeResourceConstraintsRequest
     * @return DescribeResourceConstraintsResponse
     */
    public DescribeResourceConstraintsResponse describeResourceConstraints(DescribeResourceConstraintsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourceConstraintsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the system time zone of a StarRocks instance</p>
     * 
     * @param request DescribeSystemTimezoneRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSystemTimezoneResponse
     */
    public DescribeSystemTimezoneResponse describeSystemTimezoneWithOptions(DescribeSystemTimezoneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeSystemTimezone"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/timezone/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSystemTimezoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the system time zone of a StarRocks instance</p>
     * 
     * @param request DescribeSystemTimezoneRequest
     * @return DescribeSystemTimezoneResponse
     */
    public DescribeSystemTimezoneResponse describeSystemTimezone(DescribeSystemTimezoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSystemTimezoneWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of time-triggered scaling rules.</p>
     * 
     * @param request DescribeTimeTriggerScalingRulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTimeTriggerScalingRulesResponse
     */
    public DescribeTimeTriggerScalingRulesResponse describeTimeTriggerScalingRulesWithOptions(DescribeTimeTriggerScalingRulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTimeTriggerScalingRules"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/scalingRule/describeTimeTriggerScalingRules"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTimeTriggerScalingRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of time-triggered scaling rules.</p>
     * 
     * @param request DescribeTimeTriggerScalingRulesRequest
     * @return DescribeTimeTriggerScalingRulesResponse
     */
    public DescribeTimeTriggerScalingRulesResponse describeTimeTriggerScalingRules(DescribeTimeTriggerScalingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTimeTriggerScalingRulesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables SSL for a StarRocks connection.</p>
     * 
     * @param request DisableSSLConnectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableSSLConnectionResponse
     */
    public DisableSSLConnectionResponse disableSSLConnectionWithOptions(DisableSSLConnectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DisableSSLConnection"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/starrocks/disableSSLConnection"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSSLConnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables SSL for a StarRocks connection.</p>
     * 
     * @param request DisableSSLConnectionRequest
     * @return DisableSSLConnectionResponse
     */
    public DisableSSLConnectionResponse disableSSLConnection(DisableSSLConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableSSLConnectionWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The instance must be in the Running state when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the internal Server Load Balancer (SLB) for the default gateway of an EMR Serverless StarRocks instance.</p>
     * 
     * @param request EnableInternalSlbRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableInternalSlbResponse
     */
    public EnableInternalSlbResponse enableInternalSlbWithOptions(EnableInternalSlbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "EnableInternalSlb"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/gateway/enableInternalSlb"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableInternalSlbResponse());
    }

    /**
     * <b>description</b> :
     * <p>The instance must be in the Running state when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the internal Server Load Balancer (SLB) for the default gateway of an EMR Serverless StarRocks instance.</p>
     * 
     * @param request EnableInternalSlbRequest
     * @return EnableInternalSlbResponse
     */
    public EnableInternalSlbResponse enableInternalSlb(EnableInternalSlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableInternalSlbWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables Multi-AZ deployment.</p>
     * 
     * @param request EnableMultiAzRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableMultiAzResponse
     */
    public EnableMultiAzResponse enableMultiAzWithOptions(EnableMultiAzRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.observers)) {
            body.put("observers", request.observers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            body.put("promotionOptionNo", request.promotionOptionNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableMultiAz"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/lifecycle/enableMultiAz"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableMultiAzResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables Multi-AZ deployment.</p>
     * 
     * @param request EnableMultiAzRequest
     * @return EnableMultiAzResponse
     */
    public EnableMultiAzResponse enableMultiAz(EnableMultiAzRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableMultiAzWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only when the instance is in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables SSL for a StarRocks connection.</p>
     * 
     * @param request EnableSSLConnectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableSSLConnectionResponse
     */
    public EnableSSLConnectionResponse enableSSLConnectionWithOptions(EnableSSLConnectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customSSLCertificate)) {
            body.put("CustomSSLCertificate", request.customSSLCertificate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableCustom)) {
            body.put("EnableCustom", request.enableCustom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewal)) {
            body.put("Renewal", request.renewal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sslKeyPassword)) {
            body.put("SslKeyPassword", request.sslKeyPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sslKeystorePassword)) {
            body.put("SslKeystorePassword", request.sslKeystorePassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSSLConnection"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/starrocks/enableSSLConnection"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSSLConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only when the instance is in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables SSL for a StarRocks connection.</p>
     * 
     * @param request EnableSSLConnectionRequest
     * @return EnableSSLConnectionResponse
     */
    public EnableSSLConnectionResponse enableSSLConnection(EnableSSLConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSSLConnectionWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the feature gates for a StarRocks cluster instance.</p>
     * 
     * @param request GetInstanceFeatureGateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceFeatureGateResponse
     */
    public GetInstanceFeatureGateResponse getInstanceFeatureGateWithOptions(GetInstanceFeatureGateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetInstanceFeatureGate"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/features/featureGate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceFeatureGateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the feature gates for a StarRocks cluster instance.</p>
     * 
     * @param request GetInstanceFeatureGateRequest
     * @return GetInstanceFeatureGateResponse
     */
    public GetInstanceFeatureGateResponse getInstanceFeatureGate(GetInstanceFeatureGateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceFeatureGateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the feature gate for a StarRocks compute group instance.</p>
     * 
     * @param request GetNodeGroupFeatureGateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeGroupFeatureGateResponse
     */
    public GetNodeGroupFeatureGateResponse getNodeGroupFeatureGateWithOptions(GetNodeGroupFeatureGateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeGroupFeatureGate"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/features/nodeGroupFeatureGate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeGroupFeatureGateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the feature gate for a StarRocks compute group instance.</p>
     * 
     * @param request GetNodeGroupFeatureGateRequest
     * @return GetNodeGroupFeatureGateResponse
     */
    public GetNodeGroupFeatureGateResponse getNodeGroupFeatureGate(GetNodeGroupFeatureGateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNodeGroupFeatureGateWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The instance must be in the running state when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enable read/write splitting. The Leader FE node handles write requests, and other nodes handle read requests.</p>
     * 
     * @param request IsolateLeaderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return IsolateLeaderResponse
     */
    public IsolateLeaderResponse isolateLeaderWithOptions(IsolateLeaderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolateLeader)) {
            query.put("IsolateLeader", request.isolateLeader);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IsolateLeader"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/gateway/isolateLeader"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IsolateLeaderResponse());
    }

    /**
     * <b>description</b> :
     * <p>The instance must be in the running state when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enable read/write splitting. The Leader FE node handles write requests, and other nodes handle read requests.</p>
     * 
     * @param request IsolateLeaderRequest
     * @return IsolateLeaderResponse
     */
    public IsolateLeaderResponse isolateLeader(IsolateLeaderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.isolateLeaderWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Lists the gateways of a cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists gateways.</p>
     * 
     * @param request ListGatewayRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayResponse
     */
    public ListGatewayResponse listGatewayWithOptions(ListGatewayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListGateway"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/gateway/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Lists the gateways of a cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists gateways.</p>
     * 
     * @param request ListGatewayRequest
     * @return ListGatewayResponse
     */
    public ListGatewayResponse listGateway(ListGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGatewayWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an operation.</p>
     * 
     * @param request ListOperationActivityRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOperationActivityResponse
     */
    public ListOperationActivityResponse listOperationActivityWithOptions(ListOperationActivityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationId)) {
            query.put("OperationId", request.operationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOperationActivity"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/operation/listOperationActivity"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOperationActivityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an operation.</p>
     * 
     * @param request ListOperationActivityRequest
     * @return ListOperationActivityResponse
     */
    public ListOperationActivityResponse listOperationActivity(ListOperationActivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOperationActivityWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the operation history of a cluster.</p>
     * 
     * @param request ListOperationHistoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOperationHistoryResponse
     */
    public ListOperationHistoryResponse listOperationHistoryWithOptions(ListOperationHistoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationId)) {
            query.put("OperationId", request.operationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationStatus)) {
            query.put("OperationStatus", request.operationStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOperationHistory"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/operation/listOperationHistory"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOperationHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the operation history of a cluster.</p>
     * 
     * @param request ListOperationHistoryRequest
     * @return ListOperationHistoryResponse
     */
    public ListOperationHistoryResponse listOperationHistory(ListOperationHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOperationHistoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the ssl certificate details for a cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the ssl certificate details for a cluster.</p>
     * 
     * @param request ListSSLDetailsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSSLDetailsResponse
     */
    public ListSSLDetailsResponse listSSLDetailsWithOptions(ListSSLDetailsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListSSLDetails"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/starrocks/listSSLDetails"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSSLDetailsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the ssl certificate details for a cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the ssl certificate details for a cluster.</p>
     * 
     * @param request ListSSLDetailsRequest
     * @return ListSSLDetailsResponse
     */
    public ListSSLDetailsResponse listSSLDetails(ListSSLDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSSLDetailsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, review the billing methods for Serverless StarRocks and the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a>.
     * When you call this operation, note the following:</p>
     * <ul>
     * <li>Only standard instances support changing the number of compute group Compute Units (CUs). Entry-level instances do not support this change.</li>
     * <li>Only instances of the standard compute group specification type support increasing the number of disks.</li>
     * <li>The instance must be in the Running state.
     * After you change the CU count, billing changes as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new CU count.</li>
     * <li>Subscription: During the current billing cycle, you pay the difference between the old and new configurations. This amount is calculated based on the number of days remaining in the subscription period, starting from 00:00 of the following day.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Change the billing method for an instance</p>
     * 
     * @param request ModifyChargeTypeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyChargeTypeResponse
     */
    public ModifyChargeTypeResponse modifyChargeTypeWithOptions(ModifyChargeTypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingInstanceIds)) {
            query.put("BillingInstanceIds", request.billingInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyChargeType"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/cluster/modifyChargeType"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyChargeTypeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, review the billing methods for Serverless StarRocks and the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a>.
     * When you call this operation, note the following:</p>
     * <ul>
     * <li>Only standard instances support changing the number of compute group Compute Units (CUs). Entry-level instances do not support this change.</li>
     * <li>Only instances of the standard compute group specification type support increasing the number of disks.</li>
     * <li>The instance must be in the Running state.
     * After you change the CU count, billing changes as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new CU count.</li>
     * <li>Subscription: During the current billing cycle, you pay the difference between the old and new configurations. This amount is calculated based on the number of days remaining in the subscription period, starting from 00:00 of the following day.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Change the billing method for an instance</p>
     * 
     * @param request ModifyChargeTypeRequest
     * @return ModifyChargeTypeResponse
     */
    public ModifyChargeTypeResponse modifyChargeType(ModifyChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyChargeTypeWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this API, make sure that you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * When you call this API, note the following:</p>
     * <ul>
     * <li>This operation is supported only for Standard Edition instances. It is not supported for Starter Edition instances.</li>
     * <li>You can increase the number of disks only for instances with a standard compute group specification.</li>
     * <li>The instance must be in the Running state.
     * After you change the number of CUs, the billing for the instance is updated as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new number of CUs.</li>
     * <li>Subscription: A supplementary fee is charged. This fee is calculated based on the price difference between the old and new configurations and the remaining subscription period. The remaining period starts at 00:00 on the following day and ends when the subscription expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can use this API to change the number of Compute Units (CUs) in a compute group of a Serverless StarRocks instance.</p>
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
     * <p>Before you call this API, make sure that you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * When you call this API, note the following:</p>
     * <ul>
     * <li>This operation is supported only for Standard Edition instances. It is not supported for Starter Edition instances.</li>
     * <li>You can increase the number of disks only for instances with a standard compute group specification.</li>
     * <li>The instance must be in the Running state.
     * After you change the number of CUs, the billing for the instance is updated as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new number of CUs.</li>
     * <li>Subscription: A supplementary fee is charged. This fee is calculated based on the price difference between the old and new configurations and the remaining subscription period. The remaining period starts at 00:00 on the following day and ends when the subscription expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can use this API to change the number of Compute Units (CUs) in a compute group of a Serverless StarRocks instance.</p>
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
     * <p>Before you call this operation, make sure you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * Note the following:</p>
     * <ul>
     * <li>The number of disks can be increased only for standard instances. This operation is not supported for entry-level instances.</li>
     * <li>The number of disks can be increased only for instances whose compute group is the Standard Edition (standard).</li>
     * <li>The instance must be in the Running state.
     * After you increase the number of disks, billing changes as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new disk type.</li>
     * <li>Subscription: A supplemental fee is calculated. This fee is based on the price difference between the old and new configurations and the remaining days in the billing cycle. The remaining period starts from 00:00 on the following day and ends when the subscription expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Increases the number of disks for the nodes in a compute group of a Serverless StarRocks instance.</p>
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
     * <p>Before you call this operation, make sure you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * Note the following:</p>
     * <ul>
     * <li>The number of disks can be increased only for standard instances. This operation is not supported for entry-level instances.</li>
     * <li>The number of disks can be increased only for instances whose compute group is the Standard Edition (standard).</li>
     * <li>The instance must be in the Running state.
     * After you increase the number of disks, billing changes as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new disk type.</li>
     * <li>Subscription: A supplemental fee is calculated. This fee is based on the price difference between the old and new configurations and the remaining days in the billing cycle. The remaining period starts from 00:00 on the following day and ends when the subscription expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Increases the number of disks for the nodes in a compute group of a Serverless StarRocks instance.</p>
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
     * <p>Before you call this operation, understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product?spm=openapi-amp.newDocPublishment.0.0.1837281f3hbi2d#/ecs/detail/vm">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/ecs?_p_lc=1#pricing">pricing</a> of Serverless StarRocks.
     * Note the following when you call this operation:</p>
     * <ul>
     * <li>You can upgrade or downgrade disks only for standard instances. This operation is not supported for Starter Edition instances.</li>
     * <li>Disk upgrades and downgrades are supported only for instances that have a Standard Edition (standard) compute group.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>You cannot downgrade the disk performance level (PL) to PL0.</li>
     * <li>The performance level of an Enhanced SSD (ESSD) is limited by its capacity. If you cannot upgrade the performance level, increase the disk capacity and try again. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/ecs/user-guide/essds">ESSDs</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/ecs/user-guide/essds">ESSDs</a>.
     * After you change the disk configuration, the billing is adjusted as follows:</li>
     * <li>Pay-as-you-go: You are charged based on the new disk type.</li>
     * <li>Subscription: A supplemental fee is calculated based on the price difference between the new and old configurations for the remainder of the billing cycle. The remaining period starts at 00:00 on the next day and ends when the subscription expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This operation modifies the disk performance level of the nodes in a compute group of a Serverless StarRocks instance.</p>
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
     * <p>Before you call this operation, understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product?spm=openapi-amp.newDocPublishment.0.0.1837281f3hbi2d#/ecs/detail/vm">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/ecs?_p_lc=1#pricing">pricing</a> of Serverless StarRocks.
     * Note the following when you call this operation:</p>
     * <ul>
     * <li>You can upgrade or downgrade disks only for standard instances. This operation is not supported for Starter Edition instances.</li>
     * <li>Disk upgrades and downgrades are supported only for instances that have a Standard Edition (standard) compute group.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>You cannot downgrade the disk performance level (PL) to PL0.</li>
     * <li>The performance level of an Enhanced SSD (ESSD) is limited by its capacity. If you cannot upgrade the performance level, increase the disk capacity and try again. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/ecs/user-guide/essds">ESSDs</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/ecs/user-guide/essds">ESSDs</a>.
     * After you change the disk configuration, the billing is adjusted as follows:</li>
     * <li>Pay-as-you-go: You are charged based on the new disk type.</li>
     * <li>Subscription: A supplemental fee is calculated based on the price difference between the new and old configurations for the remainder of the billing cycle. The remaining period starts at 00:00 on the next day and ends when the subscription expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This operation modifies the disk performance level of the nodes in a compute group of a Serverless StarRocks instance.</p>
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
     * <p>Before you call this operation, ensure that you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * Note the following:</p>
     * <ul>
     * <li>Only standard instances support disk scale-out. Entry-level instances do not.</li>
     * <li>Only instances that have a compute group of the standard specification type support disk scale-out.</li>
     * <li>The instance must be in the Running state.
     * After you scale out the disk, your billing changes as follows:</li>
     * <li>Pay-as-you-go: You are charged based on the new disk size.</li>
     * <li>Subscription: You must pay an upgrade fee. The fee is calculated based on the price difference between the old and new configurations and the remaining subscription period. The remaining subscription period is calculated starting from 00:00 on the next day.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Scales out the disk of a compute group node for a Serverless StarRocks instance.</p>
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
     * <p>Before you call this operation, ensure that you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * Note the following:</p>
     * <ul>
     * <li>Only standard instances support disk scale-out. Entry-level instances do not.</li>
     * <li>Only instances that have a compute group of the standard specification type support disk scale-out.</li>
     * <li>The instance must be in the Running state.
     * After you scale out the disk, your billing changes as follows:</li>
     * <li>Pay-as-you-go: You are charged based on the new disk size.</li>
     * <li>Subscription: You must pay an upgrade fee. The fee is calculated based on the price difference between the old and new configurations and the remaining subscription period. The remaining subscription period is calculated starting from 00:00 on the next day.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Scales out the disk of a compute group node for a Serverless StarRocks instance.</p>
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
     * <p>Before you call this operation, review the Serverless StarRocks billing model and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a>.</p>
     * <ul>
     * <li>Only standard instances support disk scaling. Starter instances do not support disk scaling.</li>
     * <li>Only instances with a compute group specification type of Standard Edition support disk scaling.</li>
     * <li>The instance must be in the Running state.
     * After disk scaling, billing changes as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new disk size.</li>
     * <li>Subscription: During the billing cycle, the additional fee is calculated based on the price difference between the old and new configurations and the remaining days, from 00:00 the next day to the end of the validity period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Change the disk type for nodes in a compute group</p>
     * 
     * @param request ModifyDiskTypeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDiskTypeResponse
     */
    public ModifyDiskTypeResponse modifyDiskTypeWithOptions(ModifyDiskTypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.targetDiskType)) {
            query.put("TargetDiskType", request.targetDiskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPerformanceLevel)) {
            query.put("TargetPerformanceLevel", request.targetPerformanceLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDiskType"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceChange/modifyDiskType"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDiskTypeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, review the Serverless StarRocks billing model and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a>.</p>
     * <ul>
     * <li>Only standard instances support disk scaling. Starter instances do not support disk scaling.</li>
     * <li>Only instances with a compute group specification type of Standard Edition support disk scaling.</li>
     * <li>The instance must be in the Running state.
     * After disk scaling, billing changes as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new disk size.</li>
     * <li>Subscription: During the billing cycle, the additional fee is calculated based on the price difference between the old and new configurations and the remaining days, from 00:00 the next day to the end of the validity period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Change the disk type for nodes in a compute group</p>
     * 
     * @param request ModifyDiskTypeRequest
     * @return ModifyDiskTypeResponse
     */
    public ModifyDiskTypeResponse modifyDiskType(ModifyDiskTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyDiskTypeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the /etc/hosts file.</p>
     * 
     * @param request ModifyHostAliasRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHostAliasResponse
     */
    public ModifyHostAliasResponse modifyHostAliasWithOptions(ModifyHostAliasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostAliases)) {
            body.put("hostAliases", request.hostAliases);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHostAlias"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/network/modifyHostAlias"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHostAliasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the /etc/hosts file.</p>
     * 
     * @param request ModifyHostAliasRequest
     * @return ModifyHostAliasResponse
     */
    public ModifyHostAliasResponse modifyHostAlias(ModifyHostAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyHostAliasWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This API modifies the configuration of a Serverless StarRocks instance.</p>
     * 
     * @param request ModifyInstanceConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceConfigResponse
     */
    public ModifyInstanceConfigResponse modifyInstanceConfigWithOptions(ModifyInstanceConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addConfigList)) {
            query.put("AddConfigList", request.addConfigList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configList)) {
            query.put("ConfigList", request.configList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteConfigList)) {
            query.put("DeleteConfigList", request.deleteConfigList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configsToAdd)) {
            body.put("configsToAdd", request.configsToAdd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configsToDelete)) {
            body.put("configsToDelete", request.configsToDelete);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configsToUpdate)) {
            body.put("configsToUpdate", request.configsToUpdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fastMode)) {
            body.put("fastMode", request.fastMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restart)) {
            body.put("restart", request.restart);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceConfig"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/config/modifyInstanceConfig"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This API modifies the configuration of a Serverless StarRocks instance.</p>
     * 
     * @param request ModifyInstanceConfigRequest
     * @return ModifyInstanceConfigResponse
     */
    public ModifyInstanceConfigResponse modifyInstanceConfig(ModifyInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyInstanceConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation pre-checks modifications to the instance configuration of a Serverless StarRocks instance.</p>
     * 
     * @param request ModifyInstanceConfigPreCheckRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceConfigPreCheckResponse
     */
    public ModifyInstanceConfigPreCheckResponse modifyInstanceConfigPreCheckWithOptions(ModifyInstanceConfigPreCheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configsToAdd)) {
            body.put("configsToAdd", request.configsToAdd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configsToDelete)) {
            body.put("configsToDelete", request.configsToDelete);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configsToUpdate)) {
            body.put("configsToUpdate", request.configsToUpdate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceConfigPreCheck"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/config/modifyInstanceConfigPreCheck"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceConfigPreCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This operation pre-checks modifications to the instance configuration of a Serverless StarRocks instance.</p>
     * 
     * @param request ModifyInstanceConfigPreCheckRequest
     * @return ModifyInstanceConfigPreCheckResponse
     */
    public ModifyInstanceConfigPreCheckResponse modifyInstanceConfigPreCheck(ModifyInstanceConfigPreCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyInstanceConfigPreCheckWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the maintenance window for a StarRocks instance.</p>
     * 
     * @param request ModifyMaintainableTimeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMaintainableTimeResponse
     */
    public ModifyMaintainableTimeResponse modifyMaintainableTimeWithOptions(ModifyMaintainableTimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maintainableTimePeriod)) {
            query.put("MaintainableTimePeriod", request.maintainableTimePeriod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMaintainableTime"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/starrocks/modifyMaintainableTime"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMaintainableTimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the maintenance window for a StarRocks instance.</p>
     * 
     * @param request ModifyMaintainableTimeRequest
     * @return ModifyMaintainableTimeResponse
     */
    public ModifyMaintainableTimeResponse modifyMaintainableTime(ModifyMaintainableTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyMaintainableTimeWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before using this operation, make sure that you fully understand the billing method and &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * When calling this operation, note the following:</p>
     * <ul>
     * <li>Only Standard Standard instances support modifying the number of compute group nodes. Basic Standard instances do not support this operation.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>The number of FE nodes cannot be an even number, and FE nodes do not support scale-in.
     * After modifying the node count, billing changes are as follows:</li>
     * <li>Pay-as-you-go: Billed based on the new node count.</li>
     * <li>Subscription: Within the billing cycle, the additional fee is calculated based on the price difference between the old and new configurations and the remaining days (from 00:00 of the next day to the end of the validity period).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the number of nodes in a compute group of a Serverless StarRocks instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.parallelism)) {
            query.put("Parallelism", request.parallelism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminationGracePeriodSeconds)) {
            query.put("TerminationGracePeriodSeconds", request.terminationGracePeriodSeconds);
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
     * <p>Before using this operation, make sure that you fully understand the billing method and &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * When calling this operation, note the following:</p>
     * <ul>
     * <li>Only Standard Standard instances support modifying the number of compute group nodes. Basic Standard instances do not support this operation.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>The number of FE nodes cannot be an even number, and FE nodes do not support scale-in.
     * After modifying the node count, billing changes are as follows:</li>
     * <li>Pay-as-you-go: Billed based on the new node count.</li>
     * <li>Subscription: Within the billing cycle, the additional fee is calculated based on the price difference between the old and new configurations and the remaining days (from 00:00 of the next day to the end of the validity period).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the number of nodes in a compute group of a Serverless StarRocks instance.</p>
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
     * <p>Modifies an Auto Scaling rule.</p>
     * 
     * @param request ModifyScalingRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyScalingRuleResponse
     */
    public ModifyScalingRuleResponse modifyScalingRuleWithOptions(ModifyScalingRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newTriggerType)) {
            query.put("NewTriggerType", request.newTriggerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldTriggerType)) {
            query.put("OldTriggerType", request.oldTriggerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleId)) {
            query.put("ScalingRuleId", request.scalingRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyScalingRule"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/scalingRule/modifyScalingRule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyScalingRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an Auto Scaling rule.</p>
     * 
     * @param request ModifyScalingRuleRequest
     * @return ModifyScalingRuleResponse
     */
    public ModifyScalingRuleResponse modifyScalingRule(ModifyScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyScalingRuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the node specifications type of the compute group.</p>
     * 
     * @param request ModifySpecTypeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySpecTypeResponse
     */
    public ModifySpecTypeResponse modifySpecTypeWithOptions(ModifySpecTypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.targetSpecType)) {
            query.put("TargetSpecType", request.targetSpecType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySpecType"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceChange/modifySpecType"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySpecTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the node specifications type of the compute group.</p>
     * 
     * @param request ModifySpecTypeRequest
     * @return ModifySpecTypeResponse
     */
    public ModifySpecTypeResponse modifySpecType(ModifySpecTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifySpecTypeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Runs a precheck to modify the node specification type for a compute group.</p>
     * 
     * @param request ModifySpecTypePreCheckRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySpecTypePreCheckResponse
     */
    public ModifySpecTypePreCheckResponse modifySpecTypePreCheckWithOptions(ModifySpecTypePreCheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetSpecType)) {
            query.put("TargetSpecType", request.targetSpecType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySpecTypePreCheck"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceChange/modifySpecTypePreCheck"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySpecTypePreCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Runs a precheck to modify the node specification type for a compute group.</p>
     * 
     * @param request ModifySpecTypePreCheckRequest
     * @return ModifySpecTypePreCheckResponse
     */
    public ModifySpecTypePreCheckResponse modifySpecTypePreCheck(ModifySpecTypePreCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifySpecTypePreCheckWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the password for a StarRocks user.</p>
     * 
     * @param request ModifyUserPasswordRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserPasswordResponse
     */
    public ModifyUserPasswordResponse modifyUserPasswordWithOptions(ModifyUserPasswordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserPassword"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/password/modify"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the password for a StarRocks user.</p>
     * 
     * @param request ModifyUserPasswordRequest
     * @return ModifyUserPasswordResponse
     */
    public ModifyUserPasswordResponse modifyUserPassword(ModifyUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyUserPasswordWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the price for enabling multi-zone deployment.</p>
     * 
     * @param request QueryEnableMultiAzPriceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryEnableMultiAzPriceResponse
     */
    public QueryEnableMultiAzPriceResponse queryEnableMultiAzPriceWithOptions(QueryEnableMultiAzPriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.observers)) {
            body.put("observers", request.observers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            body.put("promotionOptionNo", request.promotionOptionNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEnableMultiAzPrice"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/priceInquiry/enableMultiAz"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEnableMultiAzPriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the price for enabling multi-zone deployment.</p>
     * 
     * @param request QueryEnableMultiAzPriceRequest
     * @return QueryEnableMultiAzPriceResponse
     */
    public QueryEnableMultiAzPriceResponse queryEnableMultiAzPrice(QueryEnableMultiAzPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEnableMultiAzPriceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the latest minor version for the current major version.</p>
     * 
     * @param request QueryMinorVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMinorVersionResponse
     */
    public QueryMinorVersionResponse queryMinorVersionWithOptions(QueryMinorVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMinorVersion"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/starrocks/queryAppDefineVersion"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMinorVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the latest minor version for the current major version.</p>
     * 
     * @param request QueryMinorVersionRequest
     * @return QueryMinorVersionResponse
     */
    public QueryMinorVersionResponse queryMinorVersion(QueryMinorVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMinorVersionWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * Note the following when you call this operation:</p>
     * <ul>
     * <li>You can change the number of compute units (CUs) in a compute group only for Standard Edition instances. This feature is not supported for Starter Edition instances.</li>
     * <li>You can increase the disk size only for instances that have a standard compute group specification.</li>
     * <li>The instance must be in the Running state.
     * After you change the number of CUs, the billing changes as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new number of CUs.</li>
     * <li>Subscription: The system calculates the supplementary fee based on the price difference between the old and new configurations and the remaining days in the billing cycle. The calculation starts from 00:00 on the following day.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price for changing the billing method of a StarRocks instance.</p>
     * 
     * @param request QueryModifyChargeTypePriceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryModifyChargeTypePriceResponse
     */
    public QueryModifyChargeTypePriceResponse queryModifyChargeTypePriceWithOptions(QueryModifyChargeTypePriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingInstanceIds)) {
            query.put("BillingInstanceIds", request.billingInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryModifyChargeTypePrice"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/buy/query_modify_charge_type_price"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryModifyChargeTypePriceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * Note the following when you call this operation:</p>
     * <ul>
     * <li>You can change the number of compute units (CUs) in a compute group only for Standard Edition instances. This feature is not supported for Starter Edition instances.</li>
     * <li>You can increase the disk size only for instances that have a standard compute group specification.</li>
     * <li>The instance must be in the Running state.
     * After you change the number of CUs, the billing changes as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new number of CUs.</li>
     * <li>Subscription: The system calculates the supplementary fee based on the price difference between the old and new configurations and the remaining days in the billing cycle. The calculation starts from 00:00 on the following day.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price for changing the billing method of a StarRocks instance.</p>
     * 
     * @param request QueryModifyChargeTypePriceRequest
     * @return QueryModifyChargeTypePriceResponse
     */
    public QueryModifyChargeTypePriceResponse queryModifyChargeTypePrice(QueryModifyChargeTypePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModifyChargeTypePriceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a> &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> for Serverless StarRocks.
     * When you call this API, note the following:</p>
     * <ul>
     * <li>Only standard instances allow you to modify the number of CUs for compute groups. Entry-level instances do not.</li>
     * <li>You can increase the disk size only for instances with a Standard Edition (standard) compute group.</li>
     * <li>The instance must be in the Running state.
     * After you modify the number of CUs, billing changes as follows:</li>
     * <li>Pay-as-you-go: Billing is based on the new number of CUs.</li>
     * <li>Subscription: The amount to pay is calculated based on the price difference between the old and new configurations for the remainder of the subscription period. This period starts at 00:00 on the following day.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price for modifying the CU of compute group nodes.</p>
     * 
     * @param request QueryModifyCuPriceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryModifyCuPriceResponse
     */
    public QueryModifyCuPriceResponse queryModifyCuPriceWithOptions(QueryModifyCuPriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "QueryModifyCuPrice"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/priceInquiry/modifyCu"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryModifyCuPriceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a> &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> for Serverless StarRocks.
     * When you call this API, note the following:</p>
     * <ul>
     * <li>Only standard instances allow you to modify the number of CUs for compute groups. Entry-level instances do not.</li>
     * <li>You can increase the disk size only for instances with a Standard Edition (standard) compute group.</li>
     * <li>The instance must be in the Running state.
     * After you modify the number of CUs, billing changes as follows:</li>
     * <li>Pay-as-you-go: Billing is based on the new number of CUs.</li>
     * <li>Subscription: The amount to pay is calculated based on the price difference between the old and new configurations for the remainder of the subscription period. This period starts at 00:00 on the following day.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price for modifying the CU of compute group nodes.</p>
     * 
     * @param request QueryModifyCuPriceRequest
     * @return QueryModifyCuPriceResponse
     */
    public QueryModifyCuPriceResponse queryModifyCuPrice(QueryModifyCuPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModifyCuPriceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, review the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> for Serverless StarRocks.</p>
     * <ul>
     * <li>You can increase the disk count only for Standard Edition instances. You cannot increase the disk count for Starter Edition instances.</li>
     * <li>You can increase the disk count only for instances with a compute group specification type of Standard Edition (standard).</li>
     * <li>The instance must be in the Running state.
     * After you increase the disk count, billing changes as follows:</li>
     * <li>Pay-as-you-go: Billing is based on the new disk type.</li>
     * <li>Subscription: During the billing cycle, the additional fee is calculated based on the price difference between the new and original configurations and the remaining days—from 00:00 the next day to the end of the validity period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve the price for changing the number of disks in a compute group node</p>
     * 
     * @param request QueryModifyDiskNumberPriceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryModifyDiskNumberPriceResponse
     */
    public QueryModifyDiskNumberPriceResponse queryModifyDiskNumberPriceWithOptions(QueryModifyDiskNumberPriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "QueryModifyDiskNumberPrice"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/priceInquiry/modifyDiskNumber"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryModifyDiskNumberPriceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, review the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> for Serverless StarRocks.</p>
     * <ul>
     * <li>You can increase the disk count only for Standard Edition instances. You cannot increase the disk count for Starter Edition instances.</li>
     * <li>You can increase the disk count only for instances with a compute group specification type of Standard Edition (standard).</li>
     * <li>The instance must be in the Running state.
     * After you increase the disk count, billing changes as follows:</li>
     * <li>Pay-as-you-go: Billing is based on the new disk type.</li>
     * <li>Subscription: During the billing cycle, the additional fee is calculated based on the price difference between the new and original configurations and the remaining days—from 00:00 the next day to the end of the validity period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve the price for changing the number of disks in a compute group node</p>
     * 
     * @param request QueryModifyDiskNumberPriceRequest
     * @return QueryModifyDiskNumberPriceResponse
     */
    public QueryModifyDiskNumberPriceResponse queryModifyDiskNumberPrice(QueryModifyDiskNumberPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModifyDiskNumberPriceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/product/ecs?_p_lc=1#pricing">pricing</a> of Serverless StarRocks.
     * Note the following when you call this operation:</p>
     * <ul>
     * <li>Only standard instances support disk upgrade or downgrade. Entry-level instances do not.</li>
     * <li>Only instances with a standard compute group specification support disk upgrade or downgrade.</li>
     * <li>The instance must be in the running state.</li>
     * <li>You cannot downgrade the disk to performance level (PL) 0.</li>
     * <li>The performance level of an Enhanced SSD (ESSD) is limited by its capacity. If you cannot upgrade the performance level, scale out the disk and try again. For more information, see &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/ecs/user-guide/essds">ESSDs</a>.
     * After you upgrade or downgrade a disk, the billing changes as follows:</li>
     * <li>Pay-as-you-go: You are charged based on the new disk type.</li>
     * <li>Subscription: A supplementary fee is calculated based on the price difference between the new and old configurations and the remaining days in the subscription period, starting from 00:00 on the following day.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price of changing the disk performance level for a compute group node.</p>
     * 
     * @param request QueryModifyDiskPerformanceLevelPriceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryModifyDiskPerformanceLevelPriceResponse
     */
    public QueryModifyDiskPerformanceLevelPriceResponse queryModifyDiskPerformanceLevelPriceWithOptions(QueryModifyDiskPerformanceLevelPriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "QueryModifyDiskPerformanceLevelPrice"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/priceInquiry/modifyDiskPerformanceLevel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryModifyDiskPerformanceLevelPriceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/product/ecs?_p_lc=1#pricing">pricing</a> of Serverless StarRocks.
     * Note the following when you call this operation:</p>
     * <ul>
     * <li>Only standard instances support disk upgrade or downgrade. Entry-level instances do not.</li>
     * <li>Only instances with a standard compute group specification support disk upgrade or downgrade.</li>
     * <li>The instance must be in the running state.</li>
     * <li>You cannot downgrade the disk to performance level (PL) 0.</li>
     * <li>The performance level of an Enhanced SSD (ESSD) is limited by its capacity. If you cannot upgrade the performance level, scale out the disk and try again. For more information, see &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/ecs/user-guide/essds">ESSDs</a>.
     * After you upgrade or downgrade a disk, the billing changes as follows:</li>
     * <li>Pay-as-you-go: You are charged based on the new disk type.</li>
     * <li>Subscription: A supplementary fee is calculated based on the price difference between the new and old configurations and the remaining days in the subscription period, starting from 00:00 on the following day.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price of changing the disk performance level for a compute group node.</p>
     * 
     * @param request QueryModifyDiskPerformanceLevelPriceRequest
     * @return QueryModifyDiskPerformanceLevelPriceResponse
     */
    public QueryModifyDiskPerformanceLevelPriceResponse queryModifyDiskPerformanceLevelPrice(QueryModifyDiskPerformanceLevelPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModifyDiskPerformanceLevelPriceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a> &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks. When you call this operation, note the following:</p>
     * <ul>
     * <li>Disk scale-out is supported only for standard instances. It is not supported for entry-level instances.</li>
     * <li>Disk scale-out is supported only for instances that use the standard compute group specification.</li>
     * <li>The instance must be in the Running state.
     * After you scale out the disk, the billing changes are as follows:</li>
     * <li>Pay-as-you-go: You are billed for the new disk size.</li>
     * <li>Subscription: A supplementary fee is calculated based on the price difference between the old and new configurations and the remaining days in your subscription. The remaining days are calculated from 00:00 on the next day until the subscription expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price for modifying the disk size of a single node in a compute group.</p>
     * 
     * @param request QueryModifyDiskSizePriceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryModifyDiskSizePriceResponse
     */
    public QueryModifyDiskSizePriceResponse queryModifyDiskSizePriceWithOptions(QueryModifyDiskSizePriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "QueryModifyDiskSizePrice"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/priceInquiry/modifyDiskSize"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryModifyDiskSizePriceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a> &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks. When you call this operation, note the following:</p>
     * <ul>
     * <li>Disk scale-out is supported only for standard instances. It is not supported for entry-level instances.</li>
     * <li>Disk scale-out is supported only for instances that use the standard compute group specification.</li>
     * <li>The instance must be in the Running state.
     * After you scale out the disk, the billing changes are as follows:</li>
     * <li>Pay-as-you-go: You are billed for the new disk size.</li>
     * <li>Subscription: A supplementary fee is calculated based on the price difference between the old and new configurations and the remaining days in your subscription. The remaining days are calculated from 00:00 on the next day until the subscription expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price for modifying the disk size of a single node in a compute group.</p>
     * 
     * @param request QueryModifyDiskSizePriceRequest
     * @return QueryModifyDiskSizePriceResponse
     */
    public QueryModifyDiskSizePriceResponse queryModifyDiskSizePrice(QueryModifyDiskSizePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModifyDiskSizePriceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this API, make sure that you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a> &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of the Serverless StarRocks product. Take note of the following:</p>
     * <ul>
     * <li>Only standard instances support disk scale-out. Entry-level instances do not.</li>
     * <li>Only instances that have a compute group of the Standard Edition (standard) specification type support disk scale-out.</li>
     * <li>Instances must be in the running (Running) state.
     * After a disk scale-out, the billing changes as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new disk size.</li>
     * <li>Subscription: A supplemental fee is calculated based on the price difference between the new and old configurations for the remaining duration of the subscription. The remaining duration is calculated from 00:00 on the next day until the subscription expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price for modifying the disk type of nodes in a compute group.</p>
     * 
     * @param request QueryModifyDiskTypePriceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryModifyDiskTypePriceResponse
     */
    public QueryModifyDiskTypePriceResponse queryModifyDiskTypePriceWithOptions(QueryModifyDiskTypePriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.targetDiskType)) {
            query.put("TargetDiskType", request.targetDiskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPerformanceLevel)) {
            query.put("TargetPerformanceLevel", request.targetPerformanceLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryModifyDiskTypePrice"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/priceInquiry/modifyDiskType"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryModifyDiskTypePriceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this API, make sure that you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a> &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of the Serverless StarRocks product. Take note of the following:</p>
     * <ul>
     * <li>Only standard instances support disk scale-out. Entry-level instances do not.</li>
     * <li>Only instances that have a compute group of the Standard Edition (standard) specification type support disk scale-out.</li>
     * <li>Instances must be in the running (Running) state.
     * After a disk scale-out, the billing changes as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new disk size.</li>
     * <li>Subscription: A supplemental fee is calculated based on the price difference between the new and old configurations for the remaining duration of the subscription. The remaining duration is calculated from 00:00 on the next day until the subscription expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price for modifying the disk type of nodes in a compute group.</p>
     * 
     * @param request QueryModifyDiskTypePriceRequest
     * @return QueryModifyDiskTypePriceResponse
     */
    public QueryModifyDiskTypePriceResponse queryModifyDiskTypePrice(QueryModifyDiskTypePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModifyDiskTypePriceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this API, make sure you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a> &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * When you call this API, note the following:</p>
     * <ul>
     * <li>You can change the number of nodes in a compute group only for standard instances. This operation is not supported for entry-level instances.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>The number of frontend (FE) nodes cannot be an even number. You cannot scale in FE nodes.
     * After you change the number of nodes, billing is affected as follows:</li>
     * <li>Pay-as-you-go: You are charged based on the new number of nodes.</li>
     * <li>Subscription: A supplemental fee is calculated based on the price difference between the old and new configurations and the number of remaining days in the subscription period. The remaining period is calculated from 00:00 of the next day until the subscription expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price for changing the number of nodes in a compute group.</p>
     * 
     * @param request QueryModifyNodeNumberPriceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryModifyNodeNumberPriceResponse
     */
    public QueryModifyNodeNumberPriceResponse queryModifyNodeNumberPriceWithOptions(QueryModifyNodeNumberPriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "QueryModifyNodeNumberPrice"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/priceInquiry/modifyNodeNumber"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryModifyNodeNumberPriceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this API, make sure you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a> &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * When you call this API, note the following:</p>
     * <ul>
     * <li>You can change the number of nodes in a compute group only for standard instances. This operation is not supported for entry-level instances.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>The number of frontend (FE) nodes cannot be an even number. You cannot scale in FE nodes.
     * After you change the number of nodes, billing is affected as follows:</li>
     * <li>Pay-as-you-go: You are charged based on the new number of nodes.</li>
     * <li>Subscription: A supplemental fee is calculated based on the price difference between the old and new configurations and the number of remaining days in the subscription period. The remaining period is calculated from 00:00 of the next day until the subscription expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price for changing the number of nodes in a compute group.</p>
     * 
     * @param request QueryModifyNodeNumberPriceRequest
     * @return QueryModifyNodeNumberPriceResponse
     */
    public QueryModifyNodeNumberPriceResponse queryModifyNodeNumberPrice(QueryModifyNodeNumberPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModifyNodeNumberPriceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, ensure that you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks. Note the following:</p>
     * <ul>
     * <li>Only standard instances support disk scale-out. Basic instances do not.</li>
     * <li>Only instances with the Standard (standard) compute group specification type support disk scale-out.</li>
     * <li>The instance must be in the Running state.
     * After a disk scale-out, the billing changes are as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new disk size.</li>
     * <li>Subscription: A supplementary fee is calculated based on the price difference between the old and new configurations and the number of remaining days in the subscription period (from 00:00 on the next day to the end of the validity period).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price to change the specification type of a compute group.</p>
     * 
     * @param request QueryModifySpecTypePriceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryModifySpecTypePriceResponse
     */
    public QueryModifySpecTypePriceResponse queryModifySpecTypePriceWithOptions(QueryModifySpecTypePriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.targetSpecType)) {
            query.put("TargetSpecType", request.targetSpecType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryModifySpecTypePrice"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/priceInquiry/modifySpecType"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryModifySpecTypePriceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, ensure that you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks. Note the following:</p>
     * <ul>
     * <li>Only standard instances support disk scale-out. Basic instances do not.</li>
     * <li>Only instances with the Standard (standard) compute group specification type support disk scale-out.</li>
     * <li>The instance must be in the Running state.
     * After a disk scale-out, the billing changes are as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new disk size.</li>
     * <li>Subscription: A supplementary fee is calculated based on the price difference between the old and new configurations and the number of remaining days in the subscription period (from 00:00 on the next day to the end of the validity period).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price to change the specification type of a compute group.</p>
     * 
     * @param request QueryModifySpecTypePriceRequest
     * @return QueryModifySpecTypePriceResponse
     */
    public QueryModifySpecTypePriceResponse queryModifySpecTypePrice(QueryModifySpecTypePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModifySpecTypePriceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, review the billing model and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> for Serverless StarRocks.</p>
     * 
     * <b>summary</b> : 
     * <p>An API for querying the price of new StarRocks purchases.</p>
     * 
     * @param request QueryPriceV1Request
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPriceV1Response
     */
    public QueryPriceV1Response queryPriceV1WithOptions(QueryPriceV1Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentNodeGroup)) {
            body.put("AgentNodeGroup", request.agentNodeGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendNodeGroups)) {
            body.put("BackendNodeGroups", request.backendNodeGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frontendNodeGroups)) {
            body.put("FrontendNodeGroups", request.frontendNodeGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.observerNodeGroups)) {
            body.put("ObserverNodeGroups", request.observerNodeGroups);
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

        if (!com.aliyun.teautil.Common.isUnset(request.runMode)) {
            body.put("RunMode", request.runMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPriceV1"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/price/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPriceV1Response());
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, review the billing model and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> for Serverless StarRocks.</p>
     * 
     * <b>summary</b> : 
     * <p>An API for querying the price of new StarRocks purchases.</p>
     * 
     * @param request QueryPriceV1Request
     * @return QueryPriceV1Response
     */
    public QueryPriceV1Response queryPriceV1(QueryPriceV1Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPriceV1WithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Danger: 
     * After you release an instance, Alibaba Cloud reclaims all physical resources used by the instance. All associated data is permanently lost and cannot be recovered.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Pricing information for unsubscribing from StarRocks subscription instances</p>
     * 
     * @param request QueryRefundPriceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRefundPriceResponse
     */
    public QueryRefundPriceResponse queryRefundPriceWithOptions(QueryRefundPriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billingInstanceIds)) {
            query.put("billingInstanceIds", request.billingInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRefundPrice"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/buy/queryRefundPrice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRefundPriceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Danger: 
     * After you release an instance, Alibaba Cloud reclaims all physical resources used by the instance. All associated data is permanently lost and cannot be recovered.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Pricing information for unsubscribing from StarRocks subscription instances</p>
     * 
     * @param request QueryRefundPriceRequest
     * @return QueryRefundPriceResponse
     */
    public QueryRefundPriceResponse queryRefundPrice(QueryRefundPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRefundPriceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the renewal price for a StarRocks billing instance.</p>
     * 
     * @param request QueryRenewPriceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRenewPriceResponse
     */
    public QueryRenewPriceResponse queryRenewPriceWithOptions(QueryRenewPriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billingInstanceIds)) {
            query.put("BillingInstanceIds", request.billingInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRenewPrice"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/price/renew"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRenewPriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the renewal price for a StarRocks billing instance.</p>
     * 
     * @param request QueryRenewPriceRequest
     * @return QueryRenewPriceResponse
     */
    public QueryRenewPriceResponse queryRenewPrice(QueryRenewPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRenewPriceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the unpaid orders of a compute group or cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the unpaid orders of a compute group or cluster.</p>
     * 
     * @param request QueryUnpaidOrderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUnpaidOrderResponse
     */
    public QueryUnpaidOrderResponse queryUnpaidOrderWithOptions(QueryUnpaidOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billingInstanceId)) {
            query.put("BillingInstanceId", request.billingInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUnpaidOrder"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/order/queryUnpaidOrder"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUnpaidOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the unpaid orders of a compute group or cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the unpaid orders of a compute group or cluster.</p>
     * 
     * @param request QueryUnpaidOrderRequest
     * @return QueryUnpaidOrderResponse
     */
    public QueryUnpaidOrderResponse queryUnpaidOrder(QueryUnpaidOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnpaidOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available upgrade versions for an EMR Serverless StarRocks instance. StarRocks instances have two version layers: a major version and a minor version. You can view both versions in the Version Information section on the Instance Details page in the EMR console. Use the Minor parameter to specify whether to query upgradable minor versions or major versions.</p>
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
     * <p>Queries the available upgrade versions for an EMR Serverless StarRocks instance. StarRocks instances have two version layers: a major version and a minor version. You can view both versions in the Version Information section on the Instance Details page in the EMR console. Use the Minor parameter to specify whether to query upgradable minor versions or major versions.</p>
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
     * <p>This operation is asynchronous. The instance does not reboot immediately. After a successful call, the instance enters the Rebooting state. The reboot is complete when the instance status changes to Running.</p>
     * 
     * <b>summary</b> : 
     * <p>Reboot ECS instances in a cluster.</p>
     * 
     * @param request RebootECSRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebootECSResponse
     */
    public RebootECSResponse rebootECSWithOptions(RebootECSRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rebootTime)) {
            query.put("RebootTime", request.rebootTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootECS"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/event/rebootEcs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebootECSResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is asynchronous. The instance does not reboot immediately. After a successful call, the instance enters the Rebooting state. The reboot is complete when the instance status changes to Running.</p>
     * 
     * <b>summary</b> : 
     * <p>Reboot ECS instances in a cluster.</p>
     * 
     * @param request RebootECSRequest
     * @return RebootECSResponse
     */
    public RebootECSResponse rebootECS(RebootECSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rebootECSWithOptions(request, headers, runtime);
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
     * <p>Before you call this API, make sure that you fully understand the billing model and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a> &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * When you call this API, note that only subscription instances can be renewed.</p>
     * 
     * <b>summary</b> : 
     * <p>Renews an instance.</p>
     * 
     * @param request RenewInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billingInstanceIds)) {
            query.put("BillingInstanceIds", request.billingInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewInstance"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/order/renew_instance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this API, make sure that you fully understand the billing model and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a> &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * When you call this API, note that only subscription instances can be renewed.</p>
     * 
     * <b>summary</b> : 
     * <p>Renews an instance.</p>
     * 
     * @param request RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renewInstanceWithOptions(request, headers, runtime);
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
     * <b>description</b> :
     * <p>This operation is asynchronous. The instance does not restart immediately. After you call the operation successfully, the instance enters the restarting state. When the instance status changes to running, the restart is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Restarts a specified node group.</p>
     * 
     * @param request RestartNodeGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartNodeGroupResponse
     */
    public RestartNodeGroupResponse restartNodeGroupWithOptions(RestartNodeGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartNodeGroup"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/nodegroup/restart"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartNodeGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is asynchronous. The instance does not restart immediately. After you call the operation successfully, the instance enters the restarting state. When the instance status changes to running, the restart is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Restarts a specified node group.</p>
     * 
     * @param request RestartNodeGroupRequest
     * @return RestartNodeGroupResponse
     */
    public RestartNodeGroupResponse restartNodeGroup(RestartNodeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartNodeGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is asynchronous. The instance restart is not immediate. After a successful call, the instance enters the restarting state. The restart is complete when the returned status is running.</p>
     * 
     * <b>summary</b> : 
     * <p>Restart nodes in a cluster.</p>
     * 
     * @param request RestartNodesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartNodesResponse
     */
    public RestartNodesResponse restartNodesWithOptions(RestartNodesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.restartNodeGroups)) {
            body.put("RestartNodeGroups", request.restartNodeGroups);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartNodes"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/restart/restart"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartNodesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is asynchronous. The instance restart is not immediate. After a successful call, the instance enters the restarting state. The restart is complete when the returned status is running.</p>
     * 
     * <b>summary</b> : 
     * <p>Restart nodes in a cluster.</p>
     * 
     * @param request RestartNodesRequest
     * @return RestartNodesResponse
     */
    public RestartNodesResponse restartNodes(RestartNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartNodesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous API. The instance does not restart immediately. After you call this API successfully, the instance enters the restarting state. When the instance status changes to running, the restore is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Restore an instance from a backup</p>
     * 
     * @param request RestoreInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestoreInstanceResponse
     */
    public RestoreInstanceResponse restoreInstanceWithOptions(RestoreInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adminPassword)) {
            body.put("AdminPassword", request.adminPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupTaskId)) {
            body.put("BackupTaskId", request.backupTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            body.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            body.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitches)) {
            body.put("VSwitches", request.vSwitches);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestoreInstance"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/restore/restoreInstance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestoreInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous API. The instance does not restart immediately. After you call this API successfully, the instance enters the restarting state. When the instance status changes to running, the restore is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Restore an instance from a backup</p>
     * 
     * @param request RestoreInstanceRequest
     * @return RestoreInstanceResponse
     */
    public RestoreInstanceResponse restoreInstance(RestoreInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restoreInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Danger: 
     * When you release an instance, its physical resources are reclaimed. All data on the instance is lost and cannot be recovered.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Resumes an instance automatically stopped by openlake.</p>
     * 
     * @param request ResumeInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeInstanceResponse
     */
    public ResumeInstanceResponse resumeInstanceWithOptions(ResumeInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ResumeInstance"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/lifecycle/resumeInstance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Danger: 
     * When you release an instance, its physical resources are reclaimed. All data on the instance is lost and cannot be recovered.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Resumes an instance automatically stopped by openlake.</p>
     * 
     * @param request ResumeInstanceRequest
     * @return ResumeInstanceResponse
     */
    public ResumeInstanceResponse resumeInstance(ResumeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Rolls back a configuration modification that is currently in progress.</p>
     * 
     * @param request RollbackConfigModificationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackConfigModificationResponse
     */
    public RollbackConfigModificationResponse rollbackConfigModificationWithOptions(RollbackConfigModificationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configHistoryId)) {
            query.put("ConfigHistoryId", request.configHistoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restart)) {
            query.put("Restart", request.restart);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackConfigModification"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/config/rollbackConfigModification"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackConfigModificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Rolls back a configuration modification that is currently in progress.</p>
     * 
     * @param request RollbackConfigModificationRequest
     * @return RollbackConfigModificationResponse
     */
    public RollbackConfigModificationResponse rollbackConfigModification(RollbackConfigModificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackConfigModificationWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Switches the active and standby zones.</p>
     * 
     * <b>summary</b> : 
     * <p>Switches the active and standby zones.</p>
     * 
     * @param request SwitchActiveStandbyZonesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchActiveStandbyZonesResponse
     */
    public SwitchActiveStandbyZonesResponse switchActiveStandbyZonesWithOptions(SwitchActiveStandbyZonesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetZoneId)) {
            query.put("TargetZoneId", request.targetZoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchActiveStandbyZones"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/recovery/switchZones"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchActiveStandbyZonesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Switches the active and standby zones.</p>
     * 
     * <b>summary</b> : 
     * <p>Switches the active and standby zones.</p>
     * 
     * @param request SwitchActiveStandbyZonesRequest
     * @return SwitchActiveStandbyZonesResponse
     */
    public SwitchActiveStandbyZonesResponse switchActiveStandbyZones(SwitchActiveStandbyZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.switchActiveStandbyZonesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Attaches tags to specified resources.</p>
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
     * <p>Attaches tags to specified resources.</p>
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
     * <p>Enables or disables automatic minor version upgrades for a StarRocks instance.</p>
     * 
     * @param request ToggleAutoMinorVersionUpgradeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ToggleAutoMinorVersionUpgradeResponse
     */
    public ToggleAutoMinorVersionUpgradeResponse toggleAutoMinorVersionUpgradeWithOptions(ToggleAutoMinorVersionUpgradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoUpgrade)) {
            query.put("AutoUpgrade", request.autoUpgrade);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ToggleAutoMinorVersionUpgrade"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/starrocks/toggleAutoMinorVersionUpgrade"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ToggleAutoMinorVersionUpgradeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables automatic minor version upgrades for a StarRocks instance.</p>
     * 
     * @param request ToggleAutoMinorVersionUpgradeRequest
     * @return ToggleAutoMinorVersionUpgradeResponse
     */
    public ToggleAutoMinorVersionUpgradeResponse toggleAutoMinorVersionUpgrade(ToggleAutoMinorVersionUpgradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.toggleAutoMinorVersionUpgradeWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Danger: 
     * After you release an instance, Alibaba Cloud reclaims all physical resources used by the instance. All associated data is permanently lost and cannot be recovered.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Switches an Internet-facing SLB instance on or off.</p>
     * 
     * @param request TogglePublicSlbRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TogglePublicSlbResponse
     */
    public TogglePublicSlbResponse togglePublicSlbWithOptions(TogglePublicSlbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enablePublicSlb)) {
            query.put("EnablePublicSlb", request.enablePublicSlb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TogglePublicSlb"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/gateway/togglePublicSlb"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TogglePublicSlbResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Danger: 
     * After you release an instance, Alibaba Cloud reclaims all physical resources used by the instance. All associated data is permanently lost and cannot be recovered.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Switches an Internet-facing SLB instance on or off.</p>
     * 
     * @param request TogglePublicSlbRequest
     * @return TogglePublicSlbResponse
     */
    public TogglePublicSlbResponse togglePublicSlb(TogglePublicSlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.togglePublicSlbWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detaches tags from multiple resources.</p>
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
     * <p>Detaches tags from multiple resources.</p>
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
     * <p>Updates the description of a backup job.</p>
     * 
     * @param request UpdateBackupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBackupResponse
     */
    public UpdateBackupResponse updateBackupWithOptions(UpdateBackupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupTaskId)) {
            body.put("backupTaskId", request.backupTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBackup"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/backup/manage/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBackupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the description of a backup job.</p>
     * 
     * @param request UpdateBackupRequest
     * @return UpdateBackupResponse
     */
    public UpdateBackupResponse updateBackup(UpdateBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBackupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a backup policy.</p>
     * 
     * @param request UpdateBackupPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBackupPolicyResponse
     */
    public UpdateBackupPolicyResponse updateBackupPolicyWithOptions(UpdateBackupPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireDays)) {
            body.put("ExpireDays", request.expireDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hour)) {
            body.put("Hour", request.hour);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minute)) {
            body.put("Minute", request.minute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrenceValues)) {
            body.put("RecurrenceValues", request.recurrenceValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutSeconds)) {
            body.put("TimeoutSeconds", request.timeoutSeconds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBackupPolicy"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/backupRestore/policy/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBackupPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a backup policy.</p>
     * 
     * @param request UpdateBackupPolicyRequest
     * @return UpdateBackupPolicyResponse
     */
    public UpdateBackupPolicyResponse updateBackupPolicy(UpdateBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBackupPolicyWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the number of gateway nodes.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the number of gateway nodes.</p>
     * 
     * @param request UpdateGatewayRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayResponse
     */
    public UpdateGatewayResponse updateGatewayWithOptions(UpdateGatewayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.feNodeNumber)) {
            query.put("FeNodeNumber", request.feNodeNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayName)) {
            query.put("GatewayName", request.gatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGateway"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/gateway/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the number of gateway nodes.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the number of gateway nodes.</p>
     * 
     * @param request UpdateGatewayRequest
     * @return UpdateGatewayResponse
     */
    public UpdateGatewayResponse updateGateway(UpdateGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGatewayWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the CIDR blocks in a whitelist group.</p>
     * 
     * @param request UpdateInnerIpWhitelistGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInnerIpWhitelistGroupResponse
     */
    public UpdateInnerIpWhitelistGroupResponse updateInnerIpWhitelistGroupWithOptions(UpdateInnerIpWhitelistGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cidrIpList)) {
            body.put("CidrIpList", request.cidrIpList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.innerIpWhitelistGroupId)) {
            body.put("InnerIpWhitelistGroupId", request.innerIpWhitelistGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInnerIpWhitelistGroup"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/securityGroup/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInnerIpWhitelistGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the CIDR blocks in a whitelist group.</p>
     * 
     * @param request UpdateInnerIpWhitelistGroupRequest
     * @return UpdateInnerIpWhitelistGroupResponse
     */
    public UpdateInnerIpWhitelistGroupResponse updateInnerIpWhitelistGroup(UpdateInnerIpWhitelistGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInnerIpWhitelistGroupWithOptions(request, headers, runtime);
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
     * <b>summary</b> : 
     * <p>Updates the description of a compute group.</p>
     * 
     * @param request UpdateNodeGroupDescriptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNodeGroupDescriptionResponse
     */
    public UpdateNodeGroupDescriptionResponse updateNodeGroupDescriptionWithOptions(UpdateNodeGroupDescriptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.xAcsRamAuthContext)) {
            query.put("X-Acs-Ram-Auth-Context", request.xAcsRamAuthContext);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNodeGroupDescription"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/nodegroup/updateDescription"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNodeGroupDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the description of a compute group.</p>
     * 
     * @param request UpdateNodeGroupDescriptionRequest
     * @return UpdateNodeGroupDescriptionResponse
     */
    public UpdateNodeGroupDescriptionResponse updateNodeGroupDescription(UpdateNodeGroupDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateNodeGroupDescriptionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enable or disable the Internet-facing SLB for the FE or BE component.</p>
     * 
     * @param request UpdatePublicNetworkStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePublicNetworkStatusResponse
     */
    public UpdatePublicNetworkStatusResponse updatePublicNetworkStatusWithOptions(UpdatePublicNetworkStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentType)) {
            query.put("ComponentType", request.componentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicNetworkEnabled)) {
            query.put("PublicNetworkEnabled", request.publicNetworkEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePublicNetworkStatus"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/network/updatePublicNetworkStatus"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePublicNetworkStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enable or disable the Internet-facing SLB for the FE or BE component.</p>
     * 
     * @param request UpdatePublicNetworkStatusRequest
     * @return UpdatePublicNetworkStatusResponse
     */
    public UpdatePublicNetworkStatusResponse updatePublicNetworkStatus(UpdatePublicNetworkStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePublicNetworkStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The instance must be in the Running state when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the version of a Serverless StarRocks instance. Serverless StarRocks has two levels of version definition: the major version displayed in the &quot;Version&quot; field on the cluster details page, and the minor version displayed in the &quot;Minor Version&quot; field on the cluster details page. This operation can be used to upgrade either the minor version or the major version. You can call the QueryUpgradableVersions operation to query the versions to which a cluster can be upgraded.</p>
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
     * <p>Upgrades the version of a Serverless StarRocks instance. Serverless StarRocks has two levels of version definition: the major version displayed in the &quot;Version&quot; field on the cluster details page, and the minor version displayed in the &quot;Minor Version&quot; field on the cluster details page. This operation can be used to upgrade either the minor version or the major version. You can call the QueryUpgradableVersions operation to query the versions to which a cluster can be upgraded.</p>
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

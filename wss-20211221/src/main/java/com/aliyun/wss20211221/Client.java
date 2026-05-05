// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221;

import com.aliyun.tea.*;
import com.aliyun.wss20211221.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("wss", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>多商品组合下单</p>
     * 
     * @param tmpReq CreateMultiOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMultiOrderResponse
     */
    public CreateMultiOrderResponse createMultiOrderWithOptions(CreateMultiOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMultiOrderShrinkRequest request = new CreateMultiOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.properties)) {
            request.propertiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.properties, "Properties", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderItems)) {
            query.put("OrderItems", request.orderItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertiesShrink)) {
            query.put("Properties", request.propertiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resellerOwnerUid)) {
            query.put("ResellerOwnerUid", request.resellerOwnerUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMultiOrder"),
            new TeaPair("version", "2021-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMultiOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>多商品组合下单</p>
     * 
     * @param request CreateMultiOrderRequest
     * @return CreateMultiOrderResponse
     */
    public CreateMultiOrderResponse createMultiOrder(CreateMultiOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMultiOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询积分包Agent列表</p>
     * 
     * @param request DescribeCreditPackageAgentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCreditPackageAgentsResponse
     */
    public DescribeCreditPackageAgentsResponse describeCreditPackageAgentsWithOptions(DescribeCreditPackageAgentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentIds)) {
            query.put("AgentIds", request.agentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentType)) {
            query.put("AgentType", request.agentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCreditPackageAgents"),
            new TeaPair("version", "2021-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCreditPackageAgentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询积分包Agent列表</p>
     * 
     * @param request DescribeCreditPackageAgentsRequest
     * @return DescribeCreditPackageAgentsResponse
     */
    public DescribeCreditPackageAgentsResponse describeCreditPackageAgents(DescribeCreditPackageAgentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCreditPackageAgentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询积分包用量信息</p>
     * 
     * @param request DescribeCreditUsageInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCreditUsageInfoResponse
     */
    public DescribeCreditUsageInfoResponse describeCreditUsageInfoWithOptions(DescribeCreditUsageInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usageType)) {
            query.put("UsageType", request.usageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCreditUsageInfo"),
            new TeaPair("version", "2021-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCreditUsageInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询积分包用量信息</p>
     * 
     * @param request DescribeCreditUsageInfoRequest
     * @return DescribeCreditUsageInfoResponse
     */
    public DescribeCreditUsageInfoResponse describeCreditUsageInfo(DescribeCreditUsageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCreditUsageInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询计量消耗信息</p>
     * 
     * @param request DescribeDeductionStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeductionStatisticResponse
     */
    public DescribeDeductionStatisticResponse describeDeductionStatisticWithOptions(DescribeDeductionStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periods)) {
            query.put("Periods", request.periods);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeductionStatistic"),
            new TeaPair("version", "2021-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeductionStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询计量消耗信息</p>
     * 
     * @param request DescribeDeductionStatisticRequest
     * @return DescribeDeductionStatisticResponse
     */
    public DescribeDeductionStatisticResponse describeDeductionStatistic(DescribeDeductionStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeductionStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询物流地址</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeliveryAddressResponse
     */
    public DescribeDeliveryAddressResponse describeDeliveryAddressWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeliveryAddress"),
            new TeaPair("version", "2021-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeliveryAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询物流地址</p>
     * @return DescribeDeliveryAddressResponse
     */
    public DescribeDeliveryAddressResponse describeDeliveryAddress() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeliveryAddressWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量询价</p>
     * 
     * @param request DescribeMultiPriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMultiPriceResponse
     */
    public DescribeMultiPriceResponse describeMultiPriceWithOptions(DescribeMultiPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderItems)) {
            query.put("OrderItems", request.orderItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageCode)) {
            query.put("PackageCode", request.packageCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resellerOwnerUid)) {
            query.put("ResellerOwnerUid", request.resellerOwnerUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMultiPrice"),
            new TeaPair("version", "2021-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMultiPriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量询价</p>
     * 
     * @param request DescribeMultiPriceRequest
     * @return DescribeMultiPriceResponse
     */
    public DescribeMultiPriceResponse describeMultiPrice(DescribeMultiPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMultiPriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询核时包抵扣明细</p>
     * 
     * @param request DescribePackageDeductionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePackageDeductionsResponse
     */
    public DescribePackageDeductionsResponse describePackageDeductionsWithOptions(DescribePackageDeductionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageIds)) {
            query.put("PackageIds", request.packageIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePackageDeductions"),
            new TeaPair("version", "2021-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePackageDeductionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询核时包抵扣明细</p>
     * 
     * @param request DescribePackageDeductionsRequest
     * @return DescribePackageDeductionsResponse
     */
    public DescribePackageDeductionsResponse describePackageDeductions(DescribePackageDeductionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePackageDeductionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例属性</p>
     * 
     * @param request ModifyInstancePropertiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstancePropertiesResponse
     */
    public ModifyInstancePropertiesResponse modifyInstancePropertiesWithOptions(ModifyInstancePropertiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceProperties"),
            new TeaPair("version", "2021-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstancePropertiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例属性</p>
     * 
     * @param request ModifyInstancePropertiesRequest
     * @return ModifyInstancePropertiesResponse
     */
    public ModifyInstancePropertiesResponse modifyInstanceProperties(ModifyInstancePropertiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstancePropertiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量设置Agent积分配额</p>
     * 
     * @param request SetAgentCreditQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetAgentCreditQuotaResponse
     */
    public SetAgentCreditQuotaResponse setAgentCreditQuotaWithOptions(SetAgentCreditQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentIds)) {
            query.put("AgentIds", request.agentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentType)) {
            query.put("AgentType", request.agentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creditQuota)) {
            query.put("CreditQuota", request.creditQuota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAgentCreditQuota"),
            new TeaPair("version", "2021-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAgentCreditQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量设置Agent积分配额</p>
     * 
     * @param request SetAgentCreditQuotaRequest
     * @return SetAgentCreditQuotaResponse
     */
    public SetAgentCreditQuotaResponse setAgentCreditQuota(SetAgentCreditQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAgentCreditQuotaWithOptions(request, runtime);
    }
}

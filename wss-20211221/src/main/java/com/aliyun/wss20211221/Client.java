// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221;

import com.aliyun.tea.*;
import com.aliyun.wss20211221.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "wss.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "wss.ap-southeast-1.aliyuncs.com")
        );
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
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;Before you use this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product?#/gws/detail/gws">pricing</a> of EDS.
     * &lt;props=&quot;intl&quot;&gt;Before you use this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/cloud-desktop?#J_8623712560">pricing</a> of EDS.
     * If automatic payment is not specified, this operation does not process the payment. You must use the order ID returned by this operation to construct a payment redirect URL and complete the payment before the order takes effect and the resources are provisioned.</p>
     * 
     * <b>summary</b> : 
     * <p>Places, renews, or modifies orders for specific products of Elastic Desktop Service (EDS) Enterprise Edition, such as monthly duration packages.</p>
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
        if (!com.aliyun.teautil.Common.isUnset(request.channelCookie)) {
            query.put("ChannelCookie", request.channelCookie);
        }

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
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;Before you use this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product?#/gws/detail/gws">pricing</a> of EDS.
     * &lt;props=&quot;intl&quot;&gt;Before you use this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/cloud-desktop?#J_8623712560">pricing</a> of EDS.
     * If automatic payment is not specified, this operation does not process the payment. You must use the order ID returned by this operation to construct a payment redirect URL and complete the payment before the order takes effect and the resources are provisioned.</p>
     * 
     * <b>summary</b> : 
     * <p>Places, renews, or modifies orders for specific products of Elastic Desktop Service (EDS) Enterprise Edition, such as monthly duration packages.</p>
     * 
     * @param request CreateMultiOrderRequest
     * @return CreateMultiOrderResponse
     */
    public CreateMultiOrderResponse createMultiOrder(CreateMultiOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMultiOrderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>Paging support</strong>: Use the <code>NextToken</code> and <code>MaxResults</code> parameters for paging. Set <code>NextToken</code> to an empty character string for the first request.</li>
     * <li><strong>Filtering</strong>: Use the <code>AgentType</code> and <code>AgentIds</code> parameters to filter the returned Agent list.</li>
     * <li><strong>Status filtering</strong>: Use the <code>Status</code> parameter to filter Agents by status (0: deleted, 1: active).</li>
     * <li><strong>Sorting</strong>: Results are sorted by <code>id</code> in ascending order by default.</li>
     * <li><strong>Additional parameter for anonymous edition</strong>: The <code>FillInstance</code> parameter automatically populates the bound JVS_COPILOT AgentId of the currently logged-on user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of Agents and usage summary information under the current username.</p>
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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>Paging support</strong>: Use the <code>NextToken</code> and <code>MaxResults</code> parameters for paging. Set <code>NextToken</code> to an empty character string for the first request.</li>
     * <li><strong>Filtering</strong>: Use the <code>AgentType</code> and <code>AgentIds</code> parameters to filter the returned Agent list.</li>
     * <li><strong>Status filtering</strong>: Use the <code>Status</code> parameter to filter Agents by status (0: deleted, 1: active).</li>
     * <li><strong>Sorting</strong>: Results are sorted by <code>id</code> in ascending order by default.</li>
     * <li><strong>Additional parameter for anonymous edition</strong>: The <code>FillInstance</code> parameter automatically populates the bound JVS_COPILOT AgentId of the currently logged-on user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of Agents and usage summary information under the current username.</p>
     * 
     * @param request DescribeCreditPackageAgentsRequest
     * @return DescribeCreditPackageAgentsResponse
     */
    public DescribeCreditPackageAgentsResponse describeCreditPackageAgents(DescribeCreditPackageAgentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCreditPackageAgentsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API queries credit usage details based on the dimension specified by <code>UsageType</code> (User / CreditPackage / Agent). The response includes the total credits, remaining credits, used credits of the current credit package, hourly consumption samples, alert thresholds, and period quotas.</p>
     * <ul>
     * <li><strong>User</strong>: User dimension. Returns the aggregated usage and remaining credits across all active credit packages for the current user.</li>
     * <li><strong>CreditPackage</strong>: Credit package dimension. Returns the total credits, remaining credits, and consumption samples for the specified credit package instance.</li>
     * <li><strong>Agent</strong>: Agent dimension. Returns the cumulative usage, current period usage, quota, and alert information for the specified agent.
     * <strong>Notes</strong>:</li>
     * <li>The <code>InstanceIds</code> parameter can be omitted when <code>UsageType=User</code>. Pass the credit package instance ID when <code>UsageType=CreditPackage</code>, or pass the AgentId when <code>UsageType=Agent</code>.</li>
     * <li>Anonymous requests support the <code>FillInstance</code> parameter. When <code>InstanceIds</code> is not explicitly provided and <code>FillInstance=true</code>, the server automatically populates the bound <code>JVS_COPILOT</code> AgentId based on the current logged-in <code>wyId</code>.</li>
     * <li>Time window constants: The <code>dayUsedCredit</code> statistics window is <code>now - ONE_DAY_MILLIS</code>, and the <code>weekUsedCredit</code> statistics window is <code>now - ONE_WEEK_MILLIS</code>.</li>
     * <li>The consumption samples in <code>currentCreditConsumeList</code> are aggregated by hour and may have an asynchronous synchronization delay of up to 5 minutes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries credit usage details by a specified dimension such as user, credit package, or agent.</p>
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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API queries credit usage details based on the dimension specified by <code>UsageType</code> (User / CreditPackage / Agent). The response includes the total credits, remaining credits, used credits of the current credit package, hourly consumption samples, alert thresholds, and period quotas.</p>
     * <ul>
     * <li><strong>User</strong>: User dimension. Returns the aggregated usage and remaining credits across all active credit packages for the current user.</li>
     * <li><strong>CreditPackage</strong>: Credit package dimension. Returns the total credits, remaining credits, and consumption samples for the specified credit package instance.</li>
     * <li><strong>Agent</strong>: Agent dimension. Returns the cumulative usage, current period usage, quota, and alert information for the specified agent.
     * <strong>Notes</strong>:</li>
     * <li>The <code>InstanceIds</code> parameter can be omitted when <code>UsageType=User</code>. Pass the credit package instance ID when <code>UsageType=CreditPackage</code>, or pass the AgentId when <code>UsageType=Agent</code>.</li>
     * <li>Anonymous requests support the <code>FillInstance</code> parameter. When <code>InstanceIds</code> is not explicitly provided and <code>FillInstance=true</code>, the server automatically populates the bound <code>JVS_COPILOT</code> AgentId based on the current logged-in <code>wyId</code>.</li>
     * <li>Time window constants: The <code>dayUsedCredit</code> statistics window is <code>now - ONE_DAY_MILLIS</code>, and the <code>weekUsedCredit</code> statistics window is <code>now - ONE_WEEK_MILLIS</code>.</li>
     * <li>The consumption samples in <code>currentCreditConsumeList</code> are aggregated by hour and may have an asynchronous synchronization delay of up to 5 minutes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries credit usage details by a specified dimension such as user, credit package, or agent.</p>
     * 
     * @param request DescribeCreditUsageInfoRequest
     * @return DescribeCreditUsageInfoResponse
     */
    public DescribeCreditUsageInfoResponse describeCreditUsageInfo(DescribeCreditUsageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCreditUsageInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation supports GET and POST methods.</li>
     * <li>The <code>periods</code> parameter is in JSON array format. Each element is a <code>PeriodParam</code> object that contains the <code>periodUnit</code> and <code>baseTime</code> fields.</li>
     * <li>The <code>resourceTypes</code> parameter is in JSON array format and contains multiple resource type strings.</li>
     * <li>The <code>startTime</code> and <code>endTime</code> parameters are in timestamp format and specify the time range for the query.</li>
     * <li>Pagination parameters include <code>nextToken</code>, <code>maxResults</code>, <code>pageNo</code>, and <code>pageSize</code>, which control the number and pagination of returned results.</li>
     * <li>When the <code>resourceTypes</code> parameter contains invalid values or the <code>periods</code> parameter fails JSON parsing, a <code>SalesClientException</code> exception is thrown.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves resource deduction and usage statistics based on specified conditions.</p>
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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation supports GET and POST methods.</li>
     * <li>The <code>periods</code> parameter is in JSON array format. Each element is a <code>PeriodParam</code> object that contains the <code>periodUnit</code> and <code>baseTime</code> fields.</li>
     * <li>The <code>resourceTypes</code> parameter is in JSON array format and contains multiple resource type strings.</li>
     * <li>The <code>startTime</code> and <code>endTime</code> parameters are in timestamp format and specify the time range for the query.</li>
     * <li>Pagination parameters include <code>nextToken</code>, <code>maxResults</code>, <code>pageNo</code>, and <code>pageSize</code>, which control the number and pagination of returned results.</li>
     * <li>When the <code>resourceTypes</code> parameter contains invalid values or the <code>periods</code> parameter fails JSON parsing, a <code>SalesClientException</code> exception is thrown.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves resource deduction and usage statistics based on specified conditions.</p>
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
     * <p>Retrieves information about delivery addresses.</p>
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
     * <p>Retrieves information about delivery addresses.</p>
     * @return DescribeDeliveryAddressResponse
     */
    public DescribeDeliveryAddressResponse describeDeliveryAddress() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeliveryAddressWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;Before you call this operation, make sure that you fully understand the billing of Elastic Desktop Service and its <a href="https://www.aliyun.com/price/product?#/gws/detail/gws">pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the prices of Elastic Desktop Service products, including prices for new purchases, renewals, specification changes, and unsubscriptions.</p>
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
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;Before you call this operation, make sure that you fully understand the billing of Elastic Desktop Service and its <a href="https://www.aliyun.com/price/product?#/gws/detail/gws">pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the prices of Elastic Desktop Service products, including prices for new purchases, renewals, specification changes, and unsubscriptions.</p>
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
     * <p>Queries the deduction details of a core-hour package.</p>
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
     * <p>Queries the deduction details of a core-hour package.</p>
     * 
     * @param request DescribePackageDeductionsRequest
     * @return DescribePackageDeductionsResponse
     */
    public DescribePackageDeductionsResponse describePackageDeductions(DescribePackageDeductionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePackageDeductionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation supports GET and POST methods.</li>
     * <li>The <code>periods</code> parameter is in JSON array format. Each element is a <code>PeriodParam</code> object that contains the <code>periodUnit</code> and <code>baseTime</code> fields.</li>
     * <li>The <code>resourceTypes</code> parameter is in JSON array format and contains multiple resource type strings.</li>
     * <li>The <code>startTime</code> and <code>endTime</code> parameters are in timestamp format and specify the time range for the query.</li>
     * <li>Pagination parameters include <code>nextToken</code>, <code>maxResults</code>, <code>pageNo</code>, and <code>pageSize</code>, which control the number and pagination of returned results.</li>
     * <li>A <code>SalesClientException</code> exception is thrown when the <code>resourceTypes</code> parameter contains invalid values or the <code>periods</code> parameter fails JSON parsing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries AI credit deductions.</p>
     * 
     * @param request DescribeRunIdDeductionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRunIdDeductionsResponse
     */
    public DescribeRunIdDeductionsResponse describeRunIdDeductionsWithOptions(DescribeRunIdDeductionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentType)) {
            query.put("AgentType", request.agentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deductionTypes)) {
            query.put("DeductionTypes", request.deductionTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupSeparator)) {
            query.put("GroupSeparator", request.groupSeparator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdType)) {
            query.put("InstanceIdType", request.instanceIdType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
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
            new TeaPair("action", "DescribeRunIdDeductions"),
            new TeaPair("version", "2021-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRunIdDeductionsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation supports GET and POST methods.</li>
     * <li>The <code>periods</code> parameter is in JSON array format. Each element is a <code>PeriodParam</code> object that contains the <code>periodUnit</code> and <code>baseTime</code> fields.</li>
     * <li>The <code>resourceTypes</code> parameter is in JSON array format and contains multiple resource type strings.</li>
     * <li>The <code>startTime</code> and <code>endTime</code> parameters are in timestamp format and specify the time range for the query.</li>
     * <li>Pagination parameters include <code>nextToken</code>, <code>maxResults</code>, <code>pageNo</code>, and <code>pageSize</code>, which control the number and pagination of returned results.</li>
     * <li>A <code>SalesClientException</code> exception is thrown when the <code>resourceTypes</code> parameter contains invalid values or the <code>periods</code> parameter fails JSON parsing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries AI credit deductions.</p>
     * 
     * @param request DescribeRunIdDeductionsRequest
     * @return DescribeRunIdDeductionsResponse
     */
    public DescribeRunIdDeductionsResponse describeRunIdDeductions(DescribeRunIdDeductionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRunIdDeductionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the attributes of an instance.</p>
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
     * <p>Modifies the attributes of an instance.</p>
     * 
     * @param request ModifyInstancePropertiesRequest
     * @return ModifyInstancePropertiesResponse
     */
    public ModifyInstancePropertiesResponse modifyInstanceProperties(ModifyInstancePropertiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstancePropertiesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This operation sets the credit quota for one or more Agents of a specific type.</p>
     * <h3>Usage notes</h3>
     * <ul>
     * <li>The <code>AgentType</code> parameter specifies the type of Agent to which the quota applies, such as <code>JVSClaw</code> or <code>OpenClaw</code>.</li>
     * <li>The <code>AgentIds</code> parameter is an array of up to 100 Agent IDs.</li>
     * <li>The <code>CreditQuota</code> parameter specifies the credit quota for each Agent.</li>
     * </ul>
     * <h3>Examples</h3>
     * 
     * <b>summary</b> : 
     * <p>Sets the credit quota for specified Agents.</p>
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
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This operation sets the credit quota for one or more Agents of a specific type.</p>
     * <h3>Usage notes</h3>
     * <ul>
     * <li>The <code>AgentType</code> parameter specifies the type of Agent to which the quota applies, such as <code>JVSClaw</code> or <code>OpenClaw</code>.</li>
     * <li>The <code>AgentIds</code> parameter is an array of up to 100 Agent IDs.</li>
     * <li>The <code>CreditQuota</code> parameter specifies the credit quota for each Agent.</li>
     * </ul>
     * <h3>Examples</h3>
     * 
     * <b>summary</b> : 
     * <p>Sets the credit quota for specified Agents.</p>
     * 
     * @param request SetAgentCreditQuotaRequest
     * @return SetAgentCreditQuotaResponse
     */
    public SetAgentCreditQuotaResponse setAgentCreditQuota(SetAgentCreditQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAgentCreditQuotaWithOptions(request, runtime);
    }
}

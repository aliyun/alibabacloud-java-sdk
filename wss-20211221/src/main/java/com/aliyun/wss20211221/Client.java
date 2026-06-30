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
     * <p>&lt;props=&quot;china&quot;&gt;
     * Before calling this API, make sure you understand how Wuying Workspace is billed and its <a href="https://www.aliyun.com/price/product?#/gws/detail/gws">pricing</a>.
     * &lt;props=&quot;intl&quot;&gt;
     * Before calling this API, make sure you understand how Wuying Workspace is billed and its <a href="https://www.alibabacloud.com/zh/product/cloud-desktop?#J_8623712560">pricing</a>.
     * If you do not specify automatic payment, this API does not handle the payment. You must use the returned order ID to construct a payment URL. The order becomes active and the resource is provisioned only after the payment is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Use this API to order, renew, and modify specific products, such as monthly resource plans for Elastic Desktop Service (EDS) Enterprise Edition.</p>
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
     * <p>&lt;props=&quot;china&quot;&gt;
     * Before calling this API, make sure you understand how Wuying Workspace is billed and its <a href="https://www.aliyun.com/price/product?#/gws/detail/gws">pricing</a>.
     * &lt;props=&quot;intl&quot;&gt;
     * Before calling this API, make sure you understand how Wuying Workspace is billed and its <a href="https://www.alibabacloud.com/zh/product/cloud-desktop?#J_8623712560">pricing</a>.
     * If you do not specify automatic payment, this API does not handle the payment. You must use the returned order ID to construct a payment URL. The order becomes active and the resource is provisioned only after the payment is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Use this API to order, renew, and modify specific products, such as monthly resource plans for Elastic Desktop Service (EDS) Enterprise Edition.</p>
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
     * <h2>Usage notes</h2>
     * <ul>
     * <li><strong>Pagination</strong>: This operation supports pagination by using the <code>NextToken</code> and <code>MaxResults</code> parameters. For the first request, set <code>NextToken</code> to an empty string.</li>
     * <li><strong>Filtering</strong>: Use the <code>AgentType</code> and <code>AgentIds</code> parameters to filter the results.</li>
     * <li><strong>Status filtering</strong>: Use the <code>Status</code> parameter to filter agents by status. Valid values are 0 (deleted) and 1 (active).</li>
     * <li><strong>Sorting</strong>: By default, the results are sorted by <code>id</code> in ascending order.</li>
     * <li><strong>Additional parameter for anonymous edition</strong>: The <code>FillInstance</code> parameter automatically populates the ID of the JVS_COPILOT agent that is associated with the current user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of agents and their usage information.</p>
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
     * <h2>Usage notes</h2>
     * <ul>
     * <li><strong>Pagination</strong>: This operation supports pagination by using the <code>NextToken</code> and <code>MaxResults</code> parameters. For the first request, set <code>NextToken</code> to an empty string.</li>
     * <li><strong>Filtering</strong>: Use the <code>AgentType</code> and <code>AgentIds</code> parameters to filter the results.</li>
     * <li><strong>Status filtering</strong>: Use the <code>Status</code> parameter to filter agents by status. Valid values are 0 (deleted) and 1 (active).</li>
     * <li><strong>Sorting</strong>: By default, the results are sorted by <code>id</code> in ascending order.</li>
     * <li><strong>Additional parameter for anonymous edition</strong>: The <code>FillInstance</code> parameter automatically populates the ID of the JVS_COPILOT agent that is associated with the current user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of agents and their usage information.</p>
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
     * <h2>Operation description</h2>
     * <p>This API operation queries credit usage details based on the dimension specified by <code>UsageType</code> (User, CreditPackage, or Agent). The response includes the total, remaining, and used credits of the current credit package, hourly consumption samples, alert thresholds, period quotas, and other information.</p>
     * <ul>
     * <li><strong>User</strong>: User dimension. Returns the aggregated usage and remaining credits across all active credit packages for the current user.</li>
     * <li><strong>CreditPackage</strong>: Credit package dimension. Returns the total, remaining, and consumption samples for a specified credit package instance.</li>
     * <li><strong>Agent</strong>: Agent dimension. Returns the cumulative usage, current period usage, quota, alert, and other information for a specified agent.
     * <strong>Notes</strong>:</li>
     * <li>The <code>InstanceIds</code> parameter can be omitted when <code>UsageType=User</code>. Set this parameter to the credit package instance ID when <code>UsageType=CreditPackage</code>, or to the AgentId when <code>UsageType=Agent</code>.</li>
     * <li>Anonymous requests support the <code>FillInstance</code> parameter. If <code>InstanceIds</code> is not explicitly specified and <code>FillInstance=true</code>, the server automatically populates the bound <code>JVS_COPILOT</code> AgentId based on the current logon <code>wyId</code>.</li>
     * <li>Time window constants: The <code>dayUsedCredit</code> statistics window is <code>now - ONE_DAY_MILLIS</code>, and the <code>weekUsedCredit</code> statistics window is <code>now - ONE_WEEK_MILLIS</code>.</li>
     * <li>The consumption samples in <code>currentCreditConsumeList</code> are aggregated by hour and may have an asynchronous synchronization delay of up to 5 minutes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries credit usage by a specified dimension such as user, credit package, or agent.</p>
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
     * <h2>Operation description</h2>
     * <p>This API operation queries credit usage details based on the dimension specified by <code>UsageType</code> (User, CreditPackage, or Agent). The response includes the total, remaining, and used credits of the current credit package, hourly consumption samples, alert thresholds, period quotas, and other information.</p>
     * <ul>
     * <li><strong>User</strong>: User dimension. Returns the aggregated usage and remaining credits across all active credit packages for the current user.</li>
     * <li><strong>CreditPackage</strong>: Credit package dimension. Returns the total, remaining, and consumption samples for a specified credit package instance.</li>
     * <li><strong>Agent</strong>: Agent dimension. Returns the cumulative usage, current period usage, quota, alert, and other information for a specified agent.
     * <strong>Notes</strong>:</li>
     * <li>The <code>InstanceIds</code> parameter can be omitted when <code>UsageType=User</code>. Set this parameter to the credit package instance ID when <code>UsageType=CreditPackage</code>, or to the AgentId when <code>UsageType=Agent</code>.</li>
     * <li>Anonymous requests support the <code>FillInstance</code> parameter. If <code>InstanceIds</code> is not explicitly specified and <code>FillInstance=true</code>, the server automatically populates the bound <code>JVS_COPILOT</code> AgentId based on the current logon <code>wyId</code>.</li>
     * <li>Time window constants: The <code>dayUsedCredit</code> statistics window is <code>now - ONE_DAY_MILLIS</code>, and the <code>weekUsedCredit</code> statistics window is <code>now - ONE_WEEK_MILLIS</code>.</li>
     * <li>The consumption samples in <code>currentCreditConsumeList</code> are aggregated by hour and may have an asynchronous synchronization delay of up to 5 minutes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries credit usage by a specified dimension such as user, credit package, or agent.</p>
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
     * <h2>Request</h2>
     * <ul>
     * <li>This API supports GET and POST methods.</li>
     * <li>The <code>periods</code> parameter is a JSON array of <code>PeriodParam</code> objects, each containing the <code>periodUnit</code> and <code>baseTime</code> fields.</li>
     * <li>The <code>resourceTypes</code> parameter is a JSON array of resource type strings.</li>
     * <li>The <code>startTime</code> and <code>endTime</code> parameters are timestamps that define the query\&quot;s time range.</li>
     * <li>The <code>nextToken</code>, <code>maxResults</code>, <code>pageNo</code>, and <code>pageSize</code> parameters control pagination and the number of results to return.</li>
     * <li>The API throws a <code>SalesClientException</code> if the <code>resourceTypes</code> parameter contains an invalid value or if the <code>periods</code> parameter fails JSON parsing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves resource deduction and usage statistics based on specified criteria.</p>
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
     * <h2>Request</h2>
     * <ul>
     * <li>This API supports GET and POST methods.</li>
     * <li>The <code>periods</code> parameter is a JSON array of <code>PeriodParam</code> objects, each containing the <code>periodUnit</code> and <code>baseTime</code> fields.</li>
     * <li>The <code>resourceTypes</code> parameter is a JSON array of resource type strings.</li>
     * <li>The <code>startTime</code> and <code>endTime</code> parameters are timestamps that define the query\&quot;s time range.</li>
     * <li>The <code>nextToken</code>, <code>maxResults</code>, <code>pageNo</code>, and <code>pageSize</code> parameters control pagination and the number of results to return.</li>
     * <li>The API throws a <code>SalesClientException</code> if the <code>resourceTypes</code> parameter contains an invalid value or if the <code>periods</code> parameter fails JSON parsing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves resource deduction and usage statistics based on specified criteria.</p>
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
     * <p>&lt;props=&quot;china&quot;&gt;
     * Before using this interface, ensure you understand the billing methods and <a href="https://www.aliyun.com/price/product?#/gws/detail/gws">pricing</a> for Wuying Workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries prices for Elastic Desktop Service products, covering order types such as purchase, renewal, configuration change, and cancellation.</p>
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
     * <p>&lt;props=&quot;china&quot;&gt;
     * Before using this interface, ensure you understand the billing methods and <a href="https://www.aliyun.com/price/product?#/gws/detail/gws">pricing</a> for Wuying Workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries prices for Elastic Desktop Service products, covering order types such as purchase, renewal, configuration change, and cancellation.</p>
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
     * <p>Query deduction details for time-based packages.</p>
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
     * <p>Query deduction details for time-based packages.</p>
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

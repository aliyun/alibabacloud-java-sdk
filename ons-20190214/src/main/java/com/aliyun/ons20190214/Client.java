// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214;

import com.aliyun.tea.*;
import com.aliyun.ons20190214.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "ons.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "ons.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "ons.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "ons.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-edge-1", "ons.aliyuncs.com"),
            new TeaPair("cn-fujian", "ons.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "ons.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "ons.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "ons.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "ons.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "ons.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "ons.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "ons.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-wuhan", "ons.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "ons.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "ons.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "ons.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "ons.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "ons.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ons", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * When you call the <strong>ListTagResources</strong> operation, specify at least one of the following parameters in the request: <strong>Key</strong> and <strong>ResourceId</strong>. You can specify a resource ID to query all tags that are attached to the specified resource. You can also specify a tag key to query the tag value and resource to which the tag is attached.</p>
     * </blockquote>
     * <ul>
     * <li>If you include the <strong>Key</strong> parameter in a request, you can obtain the tag value and the ID of the resource to which the tag is attached.</li>
     * <li>If you include the <strong>ResourceId</strong> parameter in a request, you can obtain the keys and values of all tags that are attached to the specified resource.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are attached to a specified resource.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
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
            new TeaPair("version", "2019-02-14"),
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
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * When you call the <strong>ListTagResources</strong> operation, specify at least one of the following parameters in the request: <strong>Key</strong> and <strong>ResourceId</strong>. You can specify a resource ID to query all tags that are attached to the specified resource. You can also specify a tag key to query the tag value and resource to which the tag is attached.</p>
     * </blockquote>
     * <ul>
     * <li>If you include the <strong>Key</strong> parameter in a request, you can obtain the tag value and the ID of the resource to which the tag is attached.</li>
     * <li>If you include the <strong>ResourceId</strong> parameter in a request, you can obtain the keys and values of all tags that are attached to the specified resource.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are attached to a specified resource.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation in scenarios in which you want to know the message consumption progress of a specified consumer group in production environments. You can obtain the information about message consumption and consumption latency based on the returned information. This operation returns the total number of accumulated messages in all topics to which the specified consumer group subscribes and the number of accumulated messages in each topic.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about message accumulation in topics to which a specified consumer group subscribes. The returned information includes the number of accumulated messages and the consumption latency.</p>
     * 
     * @param request OnsConsumerAccumulateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsConsumerAccumulateResponse
     */
    public OnsConsumerAccumulateResponse onsConsumerAccumulateWithOptions(OnsConsumerAccumulateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.detail)) {
            query.put("Detail", request.detail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsConsumerAccumulate"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsConsumerAccumulateResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation in scenarios in which you want to know the message consumption progress of a specified consumer group in production environments. You can obtain the information about message consumption and consumption latency based on the returned information. This operation returns the total number of accumulated messages in all topics to which the specified consumer group subscribes and the number of accumulated messages in each topic.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about message accumulation in topics to which a specified consumer group subscribes. The returned information includes the number of accumulated messages and the consumption latency.</p>
     * 
     * @param request OnsConsumerAccumulateRequest
     * @return OnsConsumerAccumulateResponse
     */
    public OnsConsumerAccumulateResponse onsConsumerAccumulate(OnsConsumerAccumulateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsConsumerAccumulateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * When messages are accumulated in a topic, you can call this operation to check whether a consumer is online.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the client connection status of a specified consumer group.</p>
     * 
     * @param request OnsConsumerGetConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsConsumerGetConnectionResponse
     */
    public OnsConsumerGetConnectionResponse onsConsumerGetConnectionWithOptions(OnsConsumerGetConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsConsumerGetConnection"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsConsumerGetConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * When messages are accumulated in a topic, you can call this operation to check whether a consumer is online.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the client connection status of a specified consumer group.</p>
     * 
     * @param request OnsConsumerGetConnectionRequest
     * @return OnsConsumerGetConnectionResponse
     */
    public OnsConsumerGetConnectionResponse onsConsumerGetConnection(OnsConsumerGetConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsConsumerGetConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to clear accumulated messages or reset a consumer offset to a specified timestamp. You can use one of the following methods to clear accumulated messages:</p>
     * </blockquote>
     * <ul>
     * <li>Clear all accumulated messages in a specified topic.</li>
     * <li>Clear the messages that were published to the specified topic before a specified point in time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Resets a consumer offset to a specified timestamp for a consumer group.</p>
     * 
     * @param request OnsConsumerResetOffsetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsConsumerResetOffsetResponse
     */
    public OnsConsumerResetOffsetResponse onsConsumerResetOffsetWithOptions(OnsConsumerResetOffsetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resetTimestamp)) {
            query.put("ResetTimestamp", request.resetTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsConsumerResetOffset"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsConsumerResetOffsetResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to clear accumulated messages or reset a consumer offset to a specified timestamp. You can use one of the following methods to clear accumulated messages:</p>
     * </blockquote>
     * <ul>
     * <li>Clear all accumulated messages in a specified topic.</li>
     * <li>Clear the messages that were published to the specified topic before a specified point in time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Resets a consumer offset to a specified timestamp for a consumer group.</p>
     * 
     * @param request OnsConsumerResetOffsetRequest
     * @return OnsConsumerResetOffsetResponse
     */
    public OnsConsumerResetOffsetResponse onsConsumerResetOffset(OnsConsumerResetOffsetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsConsumerResetOffsetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>You can call this operation in scenarios in which consumers are online and messages are accumulated. You can troubleshoot errors based on the information that is returned by this operation. You can check whether all consumers in the consumer group subscribe to the same topics and tags, and whether load balancing is performed as expected. You can also obtain the information about thread stack traces of online consumers.</li>
     * <li>This operation uses multiple backend operations to query and aggregate data. The system requires a long period of time to process a request. We recommend that you do not frequently call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed information about the status of a specified consumer group. This operation returns the transactions per second (TPS) for message consumption, load balancing status, consumer connection status, and whether all consumers in the consumer group subscribe to the same topics and tags.</p>
     * 
     * @param request OnsConsumerStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsConsumerStatusResponse
     */
    public OnsConsumerStatusResponse onsConsumerStatusWithOptions(OnsConsumerStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.detail)) {
            query.put("Detail", request.detail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needJstack)) {
            query.put("NeedJstack", request.needJstack);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsConsumerStatus"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsConsumerStatusResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>You can call this operation in scenarios in which consumers are online and messages are accumulated. You can troubleshoot errors based on the information that is returned by this operation. You can check whether all consumers in the consumer group subscribe to the same topics and tags, and whether load balancing is performed as expected. You can also obtain the information about thread stack traces of online consumers.</li>
     * <li>This operation uses multiple backend operations to query and aggregate data. The system requires a long period of time to process a request. We recommend that you do not frequently call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed information about the status of a specified consumer group. This operation returns the transactions per second (TPS) for message consumption, load balancing status, consumer connection status, and whether all consumers in the consumer group subscribe to the same topics and tags.</p>
     * 
     * @param request OnsConsumerStatusRequest
     * @return OnsConsumerStatusResponse
     */
    public OnsConsumerStatusResponse onsConsumerStatus(OnsConsumerStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsConsumerStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to query the point in time when the earliest stored message was published to a specified topic and the point in time when the most recently stored message was published to the specified topic. You can also call this operation to query the most recent point in time when a message in the topic was consumed. This operation is usually used with the \<em>\<em>OnsConsumerAccumulate\</em>\</em> operation to display the overview of the consumption progress.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the time range within which you can specify a point in time to reset the consumer offset for a specified topic. The time range is from the point in time when the earliest stored message was published to the topic to the point in time when the most recently stored message was published to the topic.</p>
     * 
     * @param request OnsConsumerTimeSpanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsConsumerTimeSpanResponse
     */
    public OnsConsumerTimeSpanResponse onsConsumerTimeSpanWithOptions(OnsConsumerTimeSpanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsConsumerTimeSpan"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsConsumerTimeSpanResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to query the point in time when the earliest stored message was published to a specified topic and the point in time when the most recently stored message was published to the specified topic. You can also call this operation to query the most recent point in time when a message in the topic was consumed. This operation is usually used with the \<em>\<em>OnsConsumerAccumulate\</em>\</em> operation to display the overview of the consumption progress.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the time range within which you can specify a point in time to reset the consumer offset for a specified topic. The time range is from the point in time when the earliest stored message was published to the topic to the point in time when the most recently stored message was published to the topic.</p>
     * 
     * @param request OnsConsumerTimeSpanRequest
     * @return OnsConsumerTimeSpanResponse
     */
    public OnsConsumerTimeSpanResponse onsConsumerTimeSpan(OnsConsumerTimeSpanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsConsumerTimeSpanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * This operation uses the exact match method to query a dead-letter message based on the message ID. You can obtain the message ID that is required to query the information about a dead-letter message from the SendResult parameter that is returned after the message is sent. You can also obtain the message ID by calling the OnsDLQMessagePageQueryByGroupId operation to query multiple messages at a time. The queried information about the dead-letter message includes the point in time when the message is stored, the message body, and attributes such as the message tag and the message key.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries a dead-letter message based on the message ID. The queried information about the dead-letter message includes the point in time when the message is stored, the message body, and attributes such as the message tag and the message key.</p>
     * 
     * @param request OnsDLQMessageGetByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsDLQMessageGetByIdResponse
     */
    public OnsDLQMessageGetByIdResponse onsDLQMessageGetByIdWithOptions(OnsDLQMessageGetByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            query.put("MsgId", request.msgId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsDLQMessageGetById"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsDLQMessageGetByIdResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * This operation uses the exact match method to query a dead-letter message based on the message ID. You can obtain the message ID that is required to query the information about a dead-letter message from the SendResult parameter that is returned after the message is sent. You can also obtain the message ID by calling the OnsDLQMessagePageQueryByGroupId operation to query multiple messages at a time. The queried information about the dead-letter message includes the point in time when the message is stored, the message body, and attributes such as the message tag and the message key.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries a dead-letter message based on the message ID. The queried information about the dead-letter message includes the point in time when the message is stored, the message body, and attributes such as the message tag and the message key.</p>
     * 
     * @param request OnsDLQMessageGetByIdRequest
     * @return OnsDLQMessageGetByIdResponse
     */
    public OnsDLQMessageGetByIdResponse onsDLQMessageGetById(OnsDLQMessageGetByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsDLQMessageGetByIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>If you do not know the ID of the dead-letter message that you want to query, you can call this operation to query all dead-letter messages that are sent to a specified consumer group within a specified time range. The results are returned by page.</li>
     * <li>We recommend that you specify a short time range to query dead-letter messages in this method. If you specify a long time range, a large number of dead-letter messages are returned. In this case, you cannot find the dead-letter message that you want to query in an efficient manner. You can perform the following steps to query dead-letter messages:<ol>
     * <li>Perform a paged query by specifying the group ID, start time, end time, and number of entries to return on each page. If matched messages are found, the information about the dead-letter messages on the first page, total number of pages, and task ID are returned by default.</li>
     * <li>Specify the task ID and a page number to call this operation again to query the dead-letter messages on the specified page. In this query, the BeginTime, EndTime, and PageSize parameters do not take effect. By default, the system uses the values of these parameters that you specified in the request when you created the specified query task.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all dead-letter messages in a group within a period of time by page.</p>
     * 
     * @param request OnsDLQMessagePageQueryByGroupIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsDLQMessagePageQueryByGroupIdResponse
     */
    public OnsDLQMessagePageQueryByGroupIdResponse onsDLQMessagePageQueryByGroupIdWithOptions(OnsDLQMessagePageQueryByGroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsDLQMessagePageQueryByGroupId"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsDLQMessagePageQueryByGroupIdResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>If you do not know the ID of the dead-letter message that you want to query, you can call this operation to query all dead-letter messages that are sent to a specified consumer group within a specified time range. The results are returned by page.</li>
     * <li>We recommend that you specify a short time range to query dead-letter messages in this method. If you specify a long time range, a large number of dead-letter messages are returned. In this case, you cannot find the dead-letter message that you want to query in an efficient manner. You can perform the following steps to query dead-letter messages:<ol>
     * <li>Perform a paged query by specifying the group ID, start time, end time, and number of entries to return on each page. If matched messages are found, the information about the dead-letter messages on the first page, total number of pages, and task ID are returned by default.</li>
     * <li>Specify the task ID and a page number to call this operation again to query the dead-letter messages on the specified page. In this query, the BeginTime, EndTime, and PageSize parameters do not take effect. By default, the system uses the values of these parameters that you specified in the request when you created the specified query task.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all dead-letter messages in a group within a period of time by page.</p>
     * 
     * @param request OnsDLQMessagePageQueryByGroupIdRequest
     * @return OnsDLQMessagePageQueryByGroupIdResponse
     */
    public OnsDLQMessagePageQueryByGroupIdResponse onsDLQMessagePageQueryByGroupId(OnsDLQMessagePageQueryByGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsDLQMessagePageQueryByGroupIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>A dead-letter message is a message that still fails to be consumed after the number of consumption retries reaches the upper limit. If the message still cannot be consumed after you re-send it, a message with the same message ID is added to the corresponding dead-letter queue. You can query the message ID on the Dead-letter Queues page in the ApsaraMQ for RocketMQ console or by calling API operations. You can obtain the number of consumption failures for a message based on the number of dead-letter messages with the same message ID in the dead-letter queue.</li>
     * <li>A dead-letter message is a message that fails to be consumed after the number of consumption retries reaches the upper limit. Generally, dead-letter messages are produced because of incorrect consumption logic. We recommend that you troubleshoot the consumption failures and then call this operation to send the message to the consumer group for consumption again.</li>
     * <li>ApsaraMQ for RocketMQ does not manage the status of dead-letter messages based on the consumption status of the dead-letter messages. After you call this operation to send a dead-letter message to a consumer group and the message is consumed, ApsaraMQ for RocketMQ does not remove the dead-letter message from the dead-letter queue. You must manage dead-letter messages and determine whether to send a dead-letter message to a consumer group for consumption. This way, you do not resend or reconsume the messages that are consumed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Resends a dead-letter message based on a specified message ID so that the dead-letter message can be consumed by consumers.</p>
     * 
     * @param request OnsDLQMessageResendByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsDLQMessageResendByIdResponse
     */
    public OnsDLQMessageResendByIdResponse onsDLQMessageResendByIdWithOptions(OnsDLQMessageResendByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            query.put("MsgId", request.msgId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsDLQMessageResendById"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsDLQMessageResendByIdResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>A dead-letter message is a message that still fails to be consumed after the number of consumption retries reaches the upper limit. If the message still cannot be consumed after you re-send it, a message with the same message ID is added to the corresponding dead-letter queue. You can query the message ID on the Dead-letter Queues page in the ApsaraMQ for RocketMQ console or by calling API operations. You can obtain the number of consumption failures for a message based on the number of dead-letter messages with the same message ID in the dead-letter queue.</li>
     * <li>A dead-letter message is a message that fails to be consumed after the number of consumption retries reaches the upper limit. Generally, dead-letter messages are produced because of incorrect consumption logic. We recommend that you troubleshoot the consumption failures and then call this operation to send the message to the consumer group for consumption again.</li>
     * <li>ApsaraMQ for RocketMQ does not manage the status of dead-letter messages based on the consumption status of the dead-letter messages. After you call this operation to send a dead-letter message to a consumer group and the message is consumed, ApsaraMQ for RocketMQ does not remove the dead-letter message from the dead-letter queue. You must manage dead-letter messages and determine whether to send a dead-letter message to a consumer group for consumption. This way, you do not resend or reconsume the messages that are consumed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Resends a dead-letter message based on a specified message ID so that the dead-letter message can be consumed by consumers.</p>
     * 
     * @param request OnsDLQMessageResendByIdRequest
     * @return OnsDLQMessageResendByIdResponse
     */
    public OnsDLQMessageResendByIdResponse onsDLQMessageResendById(OnsDLQMessageResendByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsDLQMessageResendByIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to configure the permissions for a consumer group to read messages based on a specified region of ApsaraMQ for RocketMQ and a specified group ID. You can call this operation in scenarios in which you want to forbid consumers in a specific group from reading messages.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures read permissions on messages for a consumer group that is identified by a group ID.</p>
     * 
     * @param request OnsGroupConsumerUpdateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsGroupConsumerUpdateResponse
     */
    public OnsGroupConsumerUpdateResponse onsGroupConsumerUpdateWithOptions(OnsGroupConsumerUpdateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readEnable)) {
            query.put("ReadEnable", request.readEnable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsGroupConsumerUpdate"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsGroupConsumerUpdateResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to configure the permissions for a consumer group to read messages based on a specified region of ApsaraMQ for RocketMQ and a specified group ID. You can call this operation in scenarios in which you want to forbid consumers in a specific group from reading messages.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures read permissions on messages for a consumer group that is identified by a group ID.</p>
     * 
     * @param request OnsGroupConsumerUpdateRequest
     * @return OnsGroupConsumerUpdateResponse
     */
    public OnsGroupConsumerUpdateResponse onsGroupConsumerUpdate(OnsGroupConsumerUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsGroupConsumerUpdateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * When you release a new application or implement new business logic, you need new consumer groups. You can call this operation to create a consumer group.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a consumer group.</p>
     * 
     * @param request OnsGroupCreateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsGroupCreateResponse
     */
    public OnsGroupCreateResponse onsGroupCreateWithOptions(OnsGroupCreateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsGroupCreate"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsGroupCreateResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * When you release a new application or implement new business logic, you need new consumer groups. You can call this operation to create a consumer group.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a consumer group.</p>
     * 
     * @param request OnsGroupCreateRequest
     * @return OnsGroupCreateResponse
     */
    public OnsGroupCreateResponse onsGroupCreate(OnsGroupCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsGroupCreateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</li>
     * <li>After you delete a group, the consumers in the group immediately stop receiving messages. Exercise caution when you call this operation.
     * You can call this operation to delete a group when you need to reclaim the resources of the group. For example, after an application is brought offline, you can delete the groups that are used for the application. After you delete a group, the backend of ApsaraMQ for RocketMQ reclaims the resources of the group. The system requires a long period of time to reclaim the resources. We recommend that you do not create a group that uses the same name as a deleted group immediately after you delete the group. If the system fails to delete the specified group, troubleshoot the issue based on the error code.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a consumer group.</p>
     * 
     * @param request OnsGroupDeleteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsGroupDeleteResponse
     */
    public OnsGroupDeleteResponse onsGroupDeleteWithOptions(OnsGroupDeleteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsGroupDelete"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsGroupDeleteResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</li>
     * <li>After you delete a group, the consumers in the group immediately stop receiving messages. Exercise caution when you call this operation.
     * You can call this operation to delete a group when you need to reclaim the resources of the group. For example, after an application is brought offline, you can delete the groups that are used for the application. After you delete a group, the backend of ApsaraMQ for RocketMQ reclaims the resources of the group. The system requires a long period of time to reclaim the resources. We recommend that you do not create a group that uses the same name as a deleted group immediately after you delete the group. If the system fails to delete the specified group, troubleshoot the issue based on the error code.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a consumer group.</p>
     * 
     * @param request OnsGroupDeleteRequest
     * @return OnsGroupDeleteResponse
     */
    public OnsGroupDeleteResponse onsGroupDelete(OnsGroupDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsGroupDeleteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries one or more group IDs.</p>
     * 
     * @param request OnsGroupListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsGroupListResponse
     */
    public OnsGroupListResponse onsGroupListWithOptions(OnsGroupListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsGroupList"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsGroupListResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries one or more group IDs.</p>
     * 
     * @param request OnsGroupListRequest
     * @return OnsGroupListResponse
     */
    public OnsGroupListResponse onsGroupList(OnsGroupListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsGroupListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries all topics to which a specified consumer group subscribes. If no consumer instance in the consumer group is online, no data is returned.</p>
     * 
     * @param request OnsGroupSubDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsGroupSubDetailResponse
     */
    public OnsGroupSubDetailResponse onsGroupSubDetailWithOptions(OnsGroupSubDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsGroupSubDetail"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsGroupSubDetailResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries all topics to which a specified consumer group subscribes. If no consumer instance in the consumer group is online, no data is returned.</p>
     * 
     * @param request OnsGroupSubDetailRequest
     * @return OnsGroupSubDetailResponse
     */
    public OnsGroupSubDetailResponse onsGroupSubDetail(OnsGroupSubDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsGroupSubDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * To send and receive messages, a client must be connected to a ApsaraMQ for RocketMQ instance by using an endpoint. You can call this operation to query the endpoints of the instance.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information of a Message Queue for Apache RocketMQ instance and the endpoint that a client uses to connect to the Message Queue for Apache RocketMQ instance to send and receive messages.</p>
     * 
     * @param request OnsInstanceBaseInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsInstanceBaseInfoResponse
     */
    public OnsInstanceBaseInfoResponse onsInstanceBaseInfoWithOptions(OnsInstanceBaseInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsInstanceBaseInfo"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsInstanceBaseInfoResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * To send and receive messages, a client must be connected to a ApsaraMQ for RocketMQ instance by using an endpoint. You can call this operation to query the endpoints of the instance.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information of a Message Queue for Apache RocketMQ instance and the endpoint that a client uses to connect to the Message Queue for Apache RocketMQ instance to send and receive messages.</p>
     * 
     * @param request OnsInstanceBaseInfoRequest
     * @return OnsInstanceBaseInfoResponse
     */
    public OnsInstanceBaseInfoResponse onsInstanceBaseInfo(OnsInstanceBaseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsInstanceBaseInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * An instance is a virtual machine (VM) that can be used to store information about the topics and groups of ApsaraMQ for RocketMQ. You can call this operation when you need to create service resources for the business that you want to launch. Before you call this operation, take note of the following limits:</p>
     * </blockquote>
     * <ul>
     * <li>A maximum of eight ApsaraMQ for RocketMQ instances can be deployed in each region.</li>
     * <li>This operation can be called to create only a Standard Edition instance. You can use the ApsaraMQ for RocketMQ console to create Standard Edition instances and Enterprise Platinum Edition instances. For information about how to create ApsaraMQ for RocketMQ instances, see <a href="https://help.aliyun.com/document_detail/200153.html">Manage instances</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Message Queue for Apache RocketMQ instance.</p>
     * 
     * @param request OnsInstanceCreateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsInstanceCreateResponse
     */
    public OnsInstanceCreateResponse onsInstanceCreateWithOptions(OnsInstanceCreateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsInstanceCreate"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsInstanceCreateResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * An instance is a virtual machine (VM) that can be used to store information about the topics and groups of ApsaraMQ for RocketMQ. You can call this operation when you need to create service resources for the business that you want to launch. Before you call this operation, take note of the following limits:</p>
     * </blockquote>
     * <ul>
     * <li>A maximum of eight ApsaraMQ for RocketMQ instances can be deployed in each region.</li>
     * <li>This operation can be called to create only a Standard Edition instance. You can use the ApsaraMQ for RocketMQ console to create Standard Edition instances and Enterprise Platinum Edition instances. For information about how to create ApsaraMQ for RocketMQ instances, see <a href="https://help.aliyun.com/document_detail/200153.html">Manage instances</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Message Queue for Apache RocketMQ instance.</p>
     * 
     * @param request OnsInstanceCreateRequest
     * @return OnsInstanceCreateResponse
     */
    public OnsInstanceCreateResponse onsInstanceCreate(OnsInstanceCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsInstanceCreateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>You can call this operation when you need to reclaim resources. For example, after you unpublish an application, you can reclaim the resources that were used for the application. An instance can be deleted only when the instance does not contain topics and groups.</li>
     * <li>After an instance is deleted, the instance cannot be restored. Exercise caution when you call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Message Queue for Apache RocketMQ instance.</p>
     * 
     * @param request OnsInstanceDeleteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsInstanceDeleteResponse
     */
    public OnsInstanceDeleteResponse onsInstanceDeleteWithOptions(OnsInstanceDeleteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsInstanceDelete"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsInstanceDeleteResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>You can call this operation when you need to reclaim resources. For example, after you unpublish an application, you can reclaim the resources that were used for the application. An instance can be deleted only when the instance does not contain topics and groups.</li>
     * <li>After an instance is deleted, the instance cannot be restored. Exercise caution when you call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Message Queue for Apache RocketMQ instance.</p>
     * 
     * @param request OnsInstanceDeleteRequest
     * @return OnsInstanceDeleteResponse
     */
    public OnsInstanceDeleteResponse onsInstanceDelete(OnsInstanceDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsInstanceDeleteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries all Message Queue for Apache RocketMQ instances in a specified region within the current account.</p>
     * 
     * @param request OnsInstanceInServiceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsInstanceInServiceListResponse
     */
    public OnsInstanceInServiceListResponse onsInstanceInServiceListWithOptions(OnsInstanceInServiceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.needResourceInfo)) {
            query.put("NeedResourceInfo", request.needResourceInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsInstanceInServiceList"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsInstanceInServiceListResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries all Message Queue for Apache RocketMQ instances in a specified region within the current account.</p>
     * 
     * @param request OnsInstanceInServiceListRequest
     * @return OnsInstanceInServiceListResponse
     */
    public OnsInstanceInServiceListResponse onsInstanceInServiceList(OnsInstanceInServiceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsInstanceInServiceListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * A maximum of eight ApsaraMQ for RocketMQ instances can be deployed in each region.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the name and description of a Message Queue for Apache RocketMQ instance.</p>
     * 
     * @param request OnsInstanceUpdateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsInstanceUpdateResponse
     */
    public OnsInstanceUpdateResponse onsInstanceUpdateWithOptions(OnsInstanceUpdateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsInstanceUpdate"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsInstanceUpdateResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * A maximum of eight ApsaraMQ for RocketMQ instances can be deployed in each region.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the name and description of a Message Queue for Apache RocketMQ instance.</p>
     * 
     * @param request OnsInstanceUpdateRequest
     * @return OnsInstanceUpdateResponse
     */
    public OnsInstanceUpdateResponse onsInstanceUpdate(OnsInstanceUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsInstanceUpdateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a message.</p>
     * 
     * @param request OnsMessageDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsMessageDetailResponse
     */
    public OnsMessageDetailResponse onsMessageDetailWithOptions(OnsMessageDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsMessageDetail"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsMessageDetailResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a message.</p>
     * 
     * @param request OnsMessageDetailRequest
     * @return OnsMessageDetailResponse
     */
    public OnsMessageDetailResponse onsMessageDetail(OnsMessageDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsMessageDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>This operation uses the fuzzy match method to query messages based on a specified message key. The same message key may be used by multiple messages. Therefore, the returned result may contain information about multiple messages.</li>
     * <li>This operation can be used in scenarios in which you cannot obtain the IDs of the messages that you want to query. You can perform the following steps to query the information about messages:<ol>
     * <li>Call this operation to query message IDs.</li>
     * <li>Call the <strong>OnsMessageGetByMsgId</strong> operation that uses the exact match method to query the details of a specified message. For more information about the <strong>OnsMessageGetByMsgId</strong> operation, see <a href="https://help.aliyun.com/document_detail/29607.html">OnsMessageGetByMsgId</a>.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries messages by using a specified topic and message key.</p>
     * 
     * @param request OnsMessageGetByKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsMessageGetByKeyResponse
     */
    public OnsMessageGetByKeyResponse onsMessageGetByKeyWithOptions(OnsMessageGetByKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsMessageGetByKey"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsMessageGetByKeyResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>This operation uses the fuzzy match method to query messages based on a specified message key. The same message key may be used by multiple messages. Therefore, the returned result may contain information about multiple messages.</li>
     * <li>This operation can be used in scenarios in which you cannot obtain the IDs of the messages that you want to query. You can perform the following steps to query the information about messages:<ol>
     * <li>Call this operation to query message IDs.</li>
     * <li>Call the <strong>OnsMessageGetByMsgId</strong> operation that uses the exact match method to query the details of a specified message. For more information about the <strong>OnsMessageGetByMsgId</strong> operation, see <a href="https://help.aliyun.com/document_detail/29607.html">OnsMessageGetByMsgId</a>.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries messages by using a specified topic and message key.</p>
     * 
     * @param request OnsMessageGetByKeyRequest
     * @return OnsMessageGetByKeyResponse
     */
    public OnsMessageGetByKeyResponse onsMessageGetByKey(OnsMessageGetByKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsMessageGetByKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>If a message is not consumed as expected, you can call this operation to query the information about the message for troubleshooting.</li>
     * <li>This operation uses the exact match method to query a message based on the message ID. You can obtain the message ID from the SendResult parameter that is returned after the message is sent. You must store the returned information after each message is sent. The queried information about a message includes the point in time when the message was sent, the broker on which the message is stored, and the attributes of the message such as the message key and tag.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a message by specifying the message ID and determines whether the message has been consumed.</p>
     * 
     * @param request OnsMessageGetByMsgIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsMessageGetByMsgIdResponse
     */
    public OnsMessageGetByMsgIdResponse onsMessageGetByMsgIdWithOptions(OnsMessageGetByMsgIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            query.put("MsgId", request.msgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsMessageGetByMsgId"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsMessageGetByMsgIdResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>If a message is not consumed as expected, you can call this operation to query the information about the message for troubleshooting.</li>
     * <li>This operation uses the exact match method to query a message based on the message ID. You can obtain the message ID from the SendResult parameter that is returned after the message is sent. You must store the returned information after each message is sent. The queried information about a message includes the point in time when the message was sent, the broker on which the message is stored, and the attributes of the message such as the message key and tag.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a message by specifying the message ID and determines whether the message has been consumed.</p>
     * 
     * @param request OnsMessageGetByMsgIdRequest
     * @return OnsMessageGetByMsgIdResponse
     */
    public OnsMessageGetByMsgIdResponse onsMessageGetByMsgId(OnsMessageGetByMsgIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsMessageGetByMsgIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>If you do not know the ID or key of a message that you want to query, you can call this operation to query all messages that are stored in the topic within a specified time range. The results are displayed by page.</li>
     * <li>We recommend that you specify a short time range to query messages. If you specify a long time range, a large number of messages are returned. In this case, you cannot find the message that you want to query in an efficient manner. You can perform the following steps to query messages:<ol>
     * <li>Perform a paged query by specifying the topic, start time, end time, and number of entries to return on each page. If the topic contains messages, the information about the messages on the first page, total number of pages, and task ID are returned by default.</li>
     * <li>Specify the task ID and a page number to call this operation again to query the messages on the specified page. The BeginTime, EndTime, and PageSize parameters do not take effect. By default, the system uses the values of these parameters that you specified in the request when you created the specified query task.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all messages that are stored in a specified topic within a specified time range by page.</p>
     * 
     * @param request OnsMessagePageQueryByTopicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsMessagePageQueryByTopicResponse
     */
    public OnsMessagePageQueryByTopicResponse onsMessagePageQueryByTopicWithOptions(OnsMessagePageQueryByTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsMessagePageQueryByTopic"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsMessagePageQueryByTopicResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>If you do not know the ID or key of a message that you want to query, you can call this operation to query all messages that are stored in the topic within a specified time range. The results are displayed by page.</li>
     * <li>We recommend that you specify a short time range to query messages. If you specify a long time range, a large number of messages are returned. In this case, you cannot find the message that you want to query in an efficient manner. You can perform the following steps to query messages:<ol>
     * <li>Perform a paged query by specifying the topic, start time, end time, and number of entries to return on each page. If the topic contains messages, the information about the messages on the first page, total number of pages, and task ID are returned by default.</li>
     * <li>Specify the task ID and a page number to call this operation again to query the messages on the specified page. The BeginTime, EndTime, and PageSize parameters do not take effect. By default, the system uses the values of these parameters that you specified in the request when you created the specified query task.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all messages that are stored in a specified topic within a specified time range by page.</p>
     * 
     * @param request OnsMessagePageQueryByTopicRequest
     * @return OnsMessagePageQueryByTopicResponse
     */
    public OnsMessagePageQueryByTopicResponse onsMessagePageQueryByTopic(OnsMessagePageQueryByTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsMessagePageQueryByTopicWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * This operation can be used to check whether messages in a specified topic can be consumed by consumers in a specified consumer group. This operation obtains the body of the message that is specified by the MsgId parameter, re-encapsulates the message body to produce a new message, and then pushes the new message to a specified consumer. The content of the message that is sent to the consumer is the same as the content of the original message. They are not the same message because they use different message IDs.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Pushes a message to a specified consumer.</p>
     * 
     * @param request OnsMessagePushRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsMessagePushResponse
     */
    public OnsMessagePushResponse onsMessagePushWithOptions(OnsMessagePushRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            query.put("MsgId", request.msgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsMessagePush"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsMessagePushResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * This operation can be used to check whether messages in a specified topic can be consumed by consumers in a specified consumer group. This operation obtains the body of the message that is specified by the MsgId parameter, re-encapsulates the message body to produce a new message, and then pushes the new message to a specified consumer. The content of the message that is sent to the consumer is the same as the content of the original message. They are not the same message because they use different message IDs.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Pushes a message to a specified consumer.</p>
     * 
     * @param request OnsMessagePushRequest
     * @return OnsMessagePushResponse
     */
    public OnsMessagePushResponse onsMessagePush(OnsMessagePushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsMessagePushWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>You can call this operation to check whether a specified message is consumed. If the message is not consumed, you can troubleshoot the issue based on the returned information.</li>
     * <li>This operation queries information based on the built-in offset mechanism of ApsaraMQ for RocketMQ. In most cases, the results are correct. If you have reset the consumer offset or cleared accumulated messages, the results may not be correct.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the consumption status of a message by using the message ID.</p>
     * 
     * @param request OnsMessageTraceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsMessageTraceResponse
     */
    public OnsMessageTraceResponse onsMessageTraceWithOptions(OnsMessageTraceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            query.put("MsgId", request.msgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsMessageTrace"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsMessageTraceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>You can call this operation to check whether a specified message is consumed. If the message is not consumed, you can troubleshoot the issue based on the returned information.</li>
     * <li>This operation queries information based on the built-in offset mechanism of ApsaraMQ for RocketMQ. In most cases, the results are correct. If you have reset the consumer offset or cleared accumulated messages, the results may not be correct.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the consumption status of a message by using the message ID.</p>
     * 
     * @param request OnsMessageTraceRequest
     * @return OnsMessageTraceResponse
     */
    public OnsMessageTraceResponse onsMessageTrace(OnsMessageTraceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsMessageTraceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * When you use an SDK to access and manage a ApsaraMQ for RocketMQ instance, you must sequentially specify the information about two regions. You can query the information about the second region by calling the OnsRegionList operation. You must apply for a public endpoint in the following scenarios:</p>
     * </blockquote>
     * <ul>
     * <li>Connect your application to ApsaraMQ for RocketMQ: Select the nearest API gateway endpoint based on the region where your application is deployed, and enter the corresponding <strong>region ID</strong>. The <strong>regionId</strong> is used to access Alibaba Cloud API Gateway because ApsaraMQ for RocketMQ instances provide API services by using the OpenAPI Explorer platform, which is also called POP.</li>
     * <li>Access a region to manage its resources: Specify a region where you want to manage ApsaraMQ for RocketMQ resources and enter the region ID. You can call the <strong>OnsRegionList</strong> operation to query a region ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries regions where Message Queue for Apache RocketMQ is available.</p>
     * 
     * @param request OnsRegionListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsRegionListResponse
     */
    public OnsRegionListResponse onsRegionListWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsRegionList"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsRegionListResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * When you use an SDK to access and manage a ApsaraMQ for RocketMQ instance, you must sequentially specify the information about two regions. You can query the information about the second region by calling the OnsRegionList operation. You must apply for a public endpoint in the following scenarios:</p>
     * </blockquote>
     * <ul>
     * <li>Connect your application to ApsaraMQ for RocketMQ: Select the nearest API gateway endpoint based on the region where your application is deployed, and enter the corresponding <strong>region ID</strong>. The <strong>regionId</strong> is used to access Alibaba Cloud API Gateway because ApsaraMQ for RocketMQ instances provide API services by using the OpenAPI Explorer platform, which is also called POP.</li>
     * <li>Access a region to manage its resources: Specify a region where you want to manage ApsaraMQ for RocketMQ resources and enter the region ID. You can call the <strong>OnsRegionList</strong> operation to query a region ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries regions where Message Queue for Apache RocketMQ is available.</p>
     * @return OnsRegionListResponse
     */
    public OnsRegionListResponse onsRegionList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsRegionListWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * When you want to release a new application or expand your business, you can call this operation to create a topic based on your business requirements.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a topic.</p>
     * 
     * @param request OnsTopicCreateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsTopicCreateResponse
     */
    public OnsTopicCreateResponse onsTopicCreateWithOptions(OnsTopicCreateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            query.put("MessageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsTopicCreate"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsTopicCreateResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * When you want to release a new application or expand your business, you can call this operation to create a topic based on your business requirements.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a topic.</p>
     * 
     * @param request OnsTopicCreateRequest
     * @return OnsTopicCreateResponse
     */
    public OnsTopicCreateResponse onsTopicCreate(OnsTopicCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTopicCreateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur. - After you delete the topic, the publishing and subscription relationships that are constructed based on the topic are cleared. Exercise caution when you call this operation.
     * You can call this operation to delete a topic when you need to reclaim the resources from the topic. For example, after an application is brought offline, you can delete the topics that are used for the application. After you delete a topic, the backend of ApsaraMQ for RocketMQ reclaims the resources from the topic. The system requires a long period of time to reclaim the resources. After you delete a topic, we recommend that you do not create a topic that uses the same name as the deleted topic within a short period of time. If the system fails to delete the specified topic, troubleshoot the issue based on the error code.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a topic.</p>
     * 
     * @param request OnsTopicDeleteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsTopicDeleteResponse
     */
    public OnsTopicDeleteResponse onsTopicDeleteWithOptions(OnsTopicDeleteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsTopicDelete"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsTopicDeleteResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur. - After you delete the topic, the publishing and subscription relationships that are constructed based on the topic are cleared. Exercise caution when you call this operation.
     * You can call this operation to delete a topic when you need to reclaim the resources from the topic. For example, after an application is brought offline, you can delete the topics that are used for the application. After you delete a topic, the backend of ApsaraMQ for RocketMQ reclaims the resources from the topic. The system requires a long period of time to reclaim the resources. After you delete a topic, we recommend that you do not create a topic that uses the same name as the deleted topic within a short period of time. If the system fails to delete the specified topic, troubleshoot the issue based on the error code.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a topic.</p>
     * 
     * @param request OnsTopicDeleteRequest
     * @return OnsTopicDeleteResponse
     */
    public OnsTopicDeleteResponse onsTopicDelete(OnsTopicDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTopicDeleteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * This operation returns the basic information about topics and does not return the details of topics.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about topics that belong to the current account.</p>
     * 
     * @param request OnsTopicListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsTopicListResponse
     */
    public OnsTopicListResponse onsTopicListWithOptions(OnsTopicListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsTopicList"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsTopicListResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * This operation returns the basic information about topics and does not return the details of topics.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about topics that belong to the current account.</p>
     * 
     * @param request OnsTopicListRequest
     * @return OnsTopicListResponse
     */
    public OnsTopicListResponse onsTopicList(OnsTopicListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTopicListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can determine the resource usage of a topic based on the information that is returned by this operation. The returned information includes the total number of messages in the topic and the most recent point in time when a message was published to the topic.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number of messages in a topic and the status of the topic.</p>
     * 
     * @param request OnsTopicStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsTopicStatusResponse
     */
    public OnsTopicStatusResponse onsTopicStatusWithOptions(OnsTopicStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsTopicStatus"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsTopicStatusResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can determine the resource usage of a topic based on the information that is returned by this operation. The returned information includes the total number of messages in the topic and the most recent point in time when a message was published to the topic.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number of messages in a topic and the status of the topic.</p>
     * 
     * @param request OnsTopicStatusRequest
     * @return OnsTopicStatusResponse
     */
    public OnsTopicStatusResponse onsTopicStatus(OnsTopicStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTopicStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to query the online consumer groups that subscribe to a specified topic. If all consumers in a group are offline, the information about the group is not returned.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the online consumer groups that subscribe to a specified topic.</p>
     * 
     * @param request OnsTopicSubDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsTopicSubDetailResponse
     */
    public OnsTopicSubDetailResponse onsTopicSubDetailWithOptions(OnsTopicSubDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsTopicSubDetail"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsTopicSubDetailResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to query the online consumer groups that subscribe to a specified topic. If all consumers in a group are offline, the information about the group is not returned.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the online consumer groups that subscribe to a specified topic.</p>
     * 
     * @param request OnsTopicSubDetailRequest
     * @return OnsTopicSubDetailResponse
     */
    public OnsTopicSubDetailResponse onsTopicSubDetail(OnsTopicSubDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTopicSubDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to forbid read or write operations on a specific topic.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures the read/write mode for a specified topic.</p>
     * 
     * @deprecated OpenAPI OnsTopicUpdate is deprecated
     * 
     * @param request OnsTopicUpdateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsTopicUpdateResponse
     */
    @Deprecated
    // Deprecated
    public OnsTopicUpdateResponse onsTopicUpdateWithOptions(OnsTopicUpdateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.perm)) {
            query.put("Perm", request.perm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsTopicUpdate"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsTopicUpdateResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to forbid read or write operations on a specific topic.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures the read/write mode for a specified topic.</p>
     * 
     * @deprecated OpenAPI OnsTopicUpdate is deprecated
     * 
     * @param request OnsTopicUpdateRequest
     * @return OnsTopicUpdateResponse
     */
    @Deprecated
    // Deprecated
    public OnsTopicUpdateResponse onsTopicUpdate(OnsTopicUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTopicUpdateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>Before you call this operation to query the details of the trace of a message, you must create a task to query the trace of the message based on the message ID or message key and obtain the task ID. Then, you can call this operation to query the details of the message trace based on the task ID. You can call the <a href="https://help.aliyun.com/document_detail/445322.html">OnsTraceQueryByMsgId</a> operation or the <a href="https://help.aliyun.com/document_detail/445324.html">OnsTraceQueryByMsgKey</a> operation to create a task to query the trace of the message and obtain the task ID from the <strong>QueryId</strong> response parameter.</li>
     * <li>A trace query task is time-consuming. If you call this operation to query the details immediately after you create a trace query task, the results may be empty. In this case, we recommend that you try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The tracing results are queried by specifying the ID of a trace query task.</p>
     * 
     * @param request OnsTraceGetResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsTraceGetResultResponse
     */
    public OnsTraceGetResultResponse onsTraceGetResultWithOptions(OnsTraceGetResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryId)) {
            query.put("QueryId", request.queryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsTraceGetResult"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsTraceGetResultResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>Before you call this operation to query the details of the trace of a message, you must create a task to query the trace of the message based on the message ID or message key and obtain the task ID. Then, you can call this operation to query the details of the message trace based on the task ID. You can call the <a href="https://help.aliyun.com/document_detail/445322.html">OnsTraceQueryByMsgId</a> operation or the <a href="https://help.aliyun.com/document_detail/445324.html">OnsTraceQueryByMsgKey</a> operation to create a task to query the trace of the message and obtain the task ID from the <strong>QueryId</strong> response parameter.</li>
     * <li>A trace query task is time-consuming. If you call this operation to query the details immediately after you create a trace query task, the results may be empty. In this case, we recommend that you try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The tracing results are queried by specifying the ID of a trace query task.</p>
     * 
     * @param request OnsTraceGetResultRequest
     * @return OnsTraceGetResultResponse
     */
    public OnsTraceGetResultResponse onsTraceGetResult(OnsTraceGetResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTraceGetResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * If you want to query the trace of a message based on the message ID, you can call this operation to create a query task. After you obtain the task ID, you can call the <a href="https://help.aliyun.com/document_detail/59832.html">OnsTraceGetResult</a> operation to query the details of the message trace based on the task ID.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a task to query the trace of a message based on the message ID and the name of the topic in which the message is stored. The task ID is returned.</p>
     * 
     * @param request OnsTraceQueryByMsgIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsTraceQueryByMsgIdResponse
     */
    public OnsTraceQueryByMsgIdResponse onsTraceQueryByMsgIdWithOptions(OnsTraceQueryByMsgIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            query.put("MsgId", request.msgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsTraceQueryByMsgId"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsTraceQueryByMsgIdResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * If you want to query the trace of a message based on the message ID, you can call this operation to create a query task. After you obtain the task ID, you can call the <a href="https://help.aliyun.com/document_detail/59832.html">OnsTraceGetResult</a> operation to query the details of the message trace based on the task ID.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a task to query the trace of a message based on the message ID and the name of the topic in which the message is stored. The task ID is returned.</p>
     * 
     * @param request OnsTraceQueryByMsgIdRequest
     * @return OnsTraceQueryByMsgIdResponse
     */
    public OnsTraceQueryByMsgIdResponse onsTraceQueryByMsgId(OnsTraceQueryByMsgIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTraceQueryByMsgIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * If you want to query the trace of a message based on the message key that you obtained, you can call this operation to create a query task. After you obtain the task ID, you can call the OnsTraceGetResult operation to query the details of the message trace based on the task ID.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a trace query task based on the topic name and message key and obtains the ID of the query task.</p>
     * 
     * @param request OnsTraceQueryByMsgKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsTraceQueryByMsgKeyResponse
     */
    public OnsTraceQueryByMsgKeyResponse onsTraceQueryByMsgKeyWithOptions(OnsTraceQueryByMsgKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgKey)) {
            query.put("MsgKey", request.msgKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsTraceQueryByMsgKey"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsTraceQueryByMsgKeyResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * If you want to query the trace of a message based on the message key that you obtained, you can call this operation to create a query task. After you obtain the task ID, you can call the OnsTraceGetResult operation to query the details of the message trace based on the task ID.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a trace query task based on the topic name and message key and obtains the ID of the query task.</p>
     * 
     * @param request OnsTraceQueryByMsgKeyRequest
     * @return OnsTraceQueryByMsgKeyResponse
     */
    public OnsTraceQueryByMsgKeyResponse onsTraceQueryByMsgKey(OnsTraceQueryByMsgKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTraceQueryByMsgKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to query the following statistics that are collected in a production environment:</p>
     * </blockquote>
     * <ul>
     * <li>The number of messages that are consumed during each sampling period</li>
     * <li>The transactions per second (TPS) for message consumption during each sampling period
     * If your application consumes a small number of messages and does not consume messages at specific intervals, we recommend that you query the number of messages that are consumed during each sampling period because the statistics of TPS may not show a clear change trend.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics about messages that are consumed by a consumer group within a specific period of time.</p>
     * 
     * @param request OnsTrendGroupOutputTpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsTrendGroupOutputTpsResponse
     */
    public OnsTrendGroupOutputTpsResponse onsTrendGroupOutputTpsWithOptions(OnsTrendGroupOutputTpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsTrendGroupOutputTps"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsTrendGroupOutputTpsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to query the following statistics that are collected in a production environment:</p>
     * </blockquote>
     * <ul>
     * <li>The number of messages that are consumed during each sampling period</li>
     * <li>The transactions per second (TPS) for message consumption during each sampling period
     * If your application consumes a small number of messages and does not consume messages at specific intervals, we recommend that you query the number of messages that are consumed during each sampling period because the statistics of TPS may not show a clear change trend.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics about messages that are consumed by a consumer group within a specific period of time.</p>
     * 
     * @param request OnsTrendGroupOutputTpsRequest
     * @return OnsTrendGroupOutputTpsResponse
     */
    public OnsTrendGroupOutputTpsResponse onsTrendGroupOutputTps(OnsTrendGroupOutputTpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTrendGroupOutputTpsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to query the statistics of messages that are published to a specific topic in a production environment. You can query the number of messages that are published to the topic or the transactions per second (TPS) for message publishing within a specified time range based on your business requirements.
     * If your application publishes a small number of messages and does not publish messages at specific intervals, we recommend that you query the number of messages that are published to the topic during each sampling period because the statistics of TPS may not show a clear change trend.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics about messages that are published to a topic within a period of time.</p>
     * 
     * @param request OnsTrendTopicInputTpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnsTrendTopicInputTpsResponse
     */
    public OnsTrendTopicInputTpsResponse onsTrendTopicInputTpsWithOptions(OnsTrendTopicInputTpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnsTrendTopicInputTps"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnsTrendTopicInputTpsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to query the statistics of messages that are published to a specific topic in a production environment. You can query the number of messages that are published to the topic or the transactions per second (TPS) for message publishing within a specified time range based on your business requirements.
     * If your application publishes a small number of messages and does not publish messages at specific intervals, we recommend that you query the number of messages that are published to the topic during each sampling period because the statistics of TPS may not show a clear change trend.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics about messages that are published to a topic within a period of time.</p>
     * 
     * @param request OnsTrendTopicInputTpsRequest
     * @return OnsTrendTopicInputTpsResponse
     */
    public OnsTrendTopicInputTpsResponse onsTrendTopicInputTps(OnsTrendTopicInputTpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTrendTopicInputTpsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation the first time you use ApsaraMQ for RocketMQ. You can use ApsaraMQ for RocketMQ only after the service is activated.
     * The ApsaraMQ for RocketMQ service can be activated only in the China (Hangzhou) region. Service activation is not billed.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Activates Message Queue for Apache RocketMQ.</p>
     * 
     * @param request OpenOnsServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenOnsServiceResponse
     */
    public OpenOnsServiceResponse openOnsServiceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenOnsService"),
            new TeaPair("version", "2019-02-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenOnsServiceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation the first time you use ApsaraMQ for RocketMQ. You can use ApsaraMQ for RocketMQ only after the service is activated.
     * The ApsaraMQ for RocketMQ service can be activated only in the China (Hangzhou) region. Service activation is not billed.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Activates Message Queue for Apache RocketMQ.</p>
     * @return OpenOnsServiceResponse
     */
    public OpenOnsServiceResponse openOnsService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openOnsServiceWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to attach tags to a source. You can use tags to classify resources in ApsaraMQ for RocketMQ. This can help you aggregate and search resources in an efficient manner.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to a resource.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2019-02-14"),
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
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to attach tags to a source. You can use tags to classify resources in ApsaraMQ for RocketMQ. This can help you aggregate and search resources in an efficient manner.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to a resource.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Detaches tags from a specified resource and deletes the tags.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
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
            new TeaPair("version", "2019-02-14"),
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
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Detaches tags from a specified resource and deletes the tags.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}

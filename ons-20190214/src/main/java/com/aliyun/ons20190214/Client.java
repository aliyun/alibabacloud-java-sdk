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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * When you call the **ListTagResources** operation, specify at least one of the following parameters in the request: **Tag.N.Key** and **ResourceId.N**. You can specify a resource ID to query all tags that are attached to the specified resource. You can also specify a tag key to query the tag value and the resource to which the tag is attached.
      * *   If you include the **Tag.N.Key** parameter in a request, you can obtain the tag value and the ID of the resource to which the tag is attached.********
      * *   If you include the **ResourceId.N** parameter in a request, you can obtain the keys and values of all tags that are attached to the specified resource.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * When you call the **ListTagResources** operation, specify at least one of the following parameters in the request: **Tag.N.Key** and **ResourceId.N**. You can specify a resource ID to query all tags that are attached to the specified resource. You can also specify a tag key to query the tag value and the resource to which the tag is attached.
      * *   If you include the **Tag.N.Key** parameter in a request, you can obtain the tag value and the ID of the resource to which the tag is attached.********
      * *   If you include the **ResourceId.N** parameter in a request, you can obtain the keys and values of all tags that are attached to the specified resource.
      *
      * @param request ListTagResourcesRequest
      * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation in scenarios in which you want to know the message consumption progress of a specified consumer group in production environments. You can obtain the information about message consumption and consumption latency based on the returned information. This operation returns the total number of accumulated messages in all topics to which the specified consumer group subscribes and the number of accumulated messages in each topic.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation in scenarios in which you want to know the message consumption progress of a specified consumer group in production environments. You can obtain the information about message consumption and consumption latency based on the returned information. This operation returns the total number of accumulated messages in all topics to which the specified consumer group subscribes and the number of accumulated messages in each topic.
      *
      * @param request OnsConsumerAccumulateRequest
      * @return OnsConsumerAccumulateResponse
     */
    public OnsConsumerAccumulateResponse onsConsumerAccumulate(OnsConsumerAccumulateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsConsumerAccumulateWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * When messages are accumulated in a topic, you can call this operation to check whether a consumer is online.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * When messages are accumulated in a topic, you can call this operation to check whether a consumer is online.
      *
      * @param request OnsConsumerGetConnectionRequest
      * @return OnsConsumerGetConnectionResponse
     */
    public OnsConsumerGetConnectionResponse onsConsumerGetConnection(OnsConsumerGetConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsConsumerGetConnectionWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation to clear accumulated messages or reset the consumption progress. You can use one of the following methods to clear accumulated messages:
      * *   Clear all accumulated messages in a specified topic.
      * *   Clear the messages that were published to the specified topic before a specified point in time.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation to clear accumulated messages or reset the consumption progress. You can use one of the following methods to clear accumulated messages:
      * *   Clear all accumulated messages in a specified topic.
      * *   Clear the messages that were published to the specified topic before a specified point in time.
      *
      * @param request OnsConsumerResetOffsetRequest
      * @return OnsConsumerResetOffsetResponse
     */
    public OnsConsumerResetOffsetResponse onsConsumerResetOffset(OnsConsumerResetOffsetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsConsumerResetOffsetWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   You can call this operation in scenarios in which consumers are online and messages are accumulated. You can troubleshoot errors based on the information that is returned by this operation. You can check whether all consumers in the consumer group subscribe to the same topics and tags, and whether load balancing is performed as expected. You can also obtain the information about thread stack traces of online consumers.
      * *   This operation uses multiple backend operations to query and aggregate data. The system requires a long period of time to process a request. We recommend that you do not frequently call this operation.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   You can call this operation in scenarios in which consumers are online and messages are accumulated. You can troubleshoot errors based on the information that is returned by this operation. You can check whether all consumers in the consumer group subscribe to the same topics and tags, and whether load balancing is performed as expected. You can also obtain the information about thread stack traces of online consumers.
      * *   This operation uses multiple backend operations to query and aggregate data. The system requires a long period of time to process a request. We recommend that you do not frequently call this operation.
      *
      * @param request OnsConsumerStatusRequest
      * @return OnsConsumerStatusResponse
     */
    public OnsConsumerStatusResponse onsConsumerStatus(OnsConsumerStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsConsumerStatusWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation to query the earliest point in time when a message was published to a specified topic and the most recent point in time when a message was published to the specified topic. You can also obtain the most recent point in time when a message in the topic was consumed. This operation is usually used with the \\*\\*OnsConsumerAccumulate\\*\\* operation to display the overview of the consumption progress.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation to query the earliest point in time when a message was published to a specified topic and the most recent point in time when a message was published to the specified topic. You can also obtain the most recent point in time when a message in the topic was consumed. This operation is usually used with the \\*\\*OnsConsumerAccumulate\\*\\* operation to display the overview of the consumption progress.
      *
      * @param request OnsConsumerTimeSpanRequest
      * @return OnsConsumerTimeSpanResponse
     */
    public OnsConsumerTimeSpanResponse onsConsumerTimeSpan(OnsConsumerTimeSpanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsConsumerTimeSpanWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * This operation uses the exact match method to query a dead-letter message based on the message ID. You can obtain the message ID that is required to query the information about a dead-letter message from the SendResult parameter that is returned after the message is sent. You can also obtain the message ID by calling the OnsDLQMessagePageQueryByGroupId operation to query multiple messages at a time. The queried information about the dead-letter message includes the point in time when the message is stored, the message body, and attributes such as the message tag and the message key.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * This operation uses the exact match method to query a dead-letter message based on the message ID. You can obtain the message ID that is required to query the information about a dead-letter message from the SendResult parameter that is returned after the message is sent. You can also obtain the message ID by calling the OnsDLQMessagePageQueryByGroupId operation to query multiple messages at a time. The queried information about the dead-letter message includes the point in time when the message is stored, the message body, and attributes such as the message tag and the message key.
      *
      * @param request OnsDLQMessageGetByIdRequest
      * @return OnsDLQMessageGetByIdResponse
     */
    public OnsDLQMessageGetByIdResponse onsDLQMessageGetById(OnsDLQMessageGetByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsDLQMessageGetByIdWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   If you do not know the ID of the dead-letter message that you want to query, you can call this operation to query all dead-letter messages that are sent to a specified consumer group within a specified time range. The results are returned by page.
      * *   We recommend that you specify a short time range to query dead-letter messages in this method. If you specify a long time range, a large number of dead-letter messages are returned. In this case, you cannot find the dead-letter message that you want to query in an efficient manner. You can perform the following steps to query dead-letter messages:
      *     1.  Perform a paged query by specifying the group ID, start time, end time, and number of entries to return on each page. If matched messages are found, the information about the dead-letter messages on the first page, total number of pages, and task ID are returned by default.
      *     2.  Specify the task ID and a page number to call this operation again to query the dead-letter messages on the specified page. In this query, the BeginTime, EndTime, and PageSize parameters do not take effect. By default, the system uses the values of these parameters that you specified in the request when you created the specified query task.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   If you do not know the ID of the dead-letter message that you want to query, you can call this operation to query all dead-letter messages that are sent to a specified consumer group within a specified time range. The results are returned by page.
      * *   We recommend that you specify a short time range to query dead-letter messages in this method. If you specify a long time range, a large number of dead-letter messages are returned. In this case, you cannot find the dead-letter message that you want to query in an efficient manner. You can perform the following steps to query dead-letter messages:
      *     1.  Perform a paged query by specifying the group ID, start time, end time, and number of entries to return on each page. If matched messages are found, the information about the dead-letter messages on the first page, total number of pages, and task ID are returned by default.
      *     2.  Specify the task ID and a page number to call this operation again to query the dead-letter messages on the specified page. In this query, the BeginTime, EndTime, and PageSize parameters do not take effect. By default, the system uses the values of these parameters that you specified in the request when you created the specified query task.
      *
      * @param request OnsDLQMessagePageQueryByGroupIdRequest
      * @return OnsDLQMessagePageQueryByGroupIdResponse
     */
    public OnsDLQMessagePageQueryByGroupIdResponse onsDLQMessagePageQueryByGroupId(OnsDLQMessagePageQueryByGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsDLQMessagePageQueryByGroupIdWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   After the number of retries to send a message to a consumer group for consumption reaches the upper limit and the message is not consumed by a consumer in the group, the message is added to the dead-letter queue of the consumer group. The message is a dead-letter message. After you resend the dead-letter message to the consumer group for consumption and the message fails to be consumed again after the maximum number of retries, a dead-letter message with the same message ID is added to the dead-letter queue. You can view the details of the dead-letter message on the Dead-letter Queues page in the Message Queue for Apache RocketMQ console or by calling the API operations that are used to query dead-letter messages. You can obtain the number of consumption failures for a message based on the number of dead-letter messages with the same message ID in the dead-letter queue.
      * *   A dead-letter message is a message that fails to be consumed after the number of consumption retries reaches the upper limit. Generally, dead-letter messages are produced because of incorrect consumption logic. We recommend that you troubleshoot the consumption failures and then call this operation to send the message to the consumer group for consumption again.
      * *   Message Queue for Apache RocketMQ does not manage the status of dead-letter messages based on the consumption status of the dead-letter messages. After you call this operation to send a dead-letter message to a consumer group and the message is consumed, Message Queue for Apache RocketMQ does not remove the dead-letter message from the dead-letter queue. You must manage dead-letter messages and determine whether to send a dead-letter message to a consumer group for consumption. This way, you do not resend and reconsume the messages that are consumed.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   After the number of retries to send a message to a consumer group for consumption reaches the upper limit and the message is not consumed by a consumer in the group, the message is added to the dead-letter queue of the consumer group. The message is a dead-letter message. After you resend the dead-letter message to the consumer group for consumption and the message fails to be consumed again after the maximum number of retries, a dead-letter message with the same message ID is added to the dead-letter queue. You can view the details of the dead-letter message on the Dead-letter Queues page in the Message Queue for Apache RocketMQ console or by calling the API operations that are used to query dead-letter messages. You can obtain the number of consumption failures for a message based on the number of dead-letter messages with the same message ID in the dead-letter queue.
      * *   A dead-letter message is a message that fails to be consumed after the number of consumption retries reaches the upper limit. Generally, dead-letter messages are produced because of incorrect consumption logic. We recommend that you troubleshoot the consumption failures and then call this operation to send the message to the consumer group for consumption again.
      * *   Message Queue for Apache RocketMQ does not manage the status of dead-letter messages based on the consumption status of the dead-letter messages. After you call this operation to send a dead-letter message to a consumer group and the message is consumed, Message Queue for Apache RocketMQ does not remove the dead-letter message from the dead-letter queue. You must manage dead-letter messages and determine whether to send a dead-letter message to a consumer group for consumption. This way, you do not resend and reconsume the messages that are consumed.
      *
      * @param request OnsDLQMessageResendByIdRequest
      * @return OnsDLQMessageResendByIdResponse
     */
    public OnsDLQMessageResendByIdResponse onsDLQMessageResendById(OnsDLQMessageResendByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsDLQMessageResendByIdWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation to configure the permissions for a consumer group to read messages based on a specified region of Message Queue for Apache RocketMQ and a specified group ID. You can call this operation in scenarios in which you want to forbid consumers in a specific group from reading messages.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation to configure the permissions for a consumer group to read messages based on a specified region of Message Queue for Apache RocketMQ and a specified group ID. You can call this operation in scenarios in which you want to forbid consumers in a specific group from reading messages.
      *
      * @param request OnsGroupConsumerUpdateRequest
      * @return OnsGroupConsumerUpdateResponse
     */
    public OnsGroupConsumerUpdateResponse onsGroupConsumerUpdate(OnsGroupConsumerUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsGroupConsumerUpdateWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * When you release a new application or implement new business logic, you need new consumer groups. You can call this operation to create a consumer group.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * When you release a new application or implement new business logic, you need new consumer groups. You can call this operation to create a consumer group.
      *
      * @param request OnsGroupCreateRequest
      * @return OnsGroupCreateResponse
     */
    public OnsGroupCreateResponse onsGroupCreate(OnsGroupCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsGroupCreateWithOptions(request, runtime);
    }

    /**
      * > 
      * *   The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   After you delete a group, the consumers in the group immediately stop receiving messages. Exercise caution when you call this operation.
      * You can call this operation to delete a group when you need to deallocate the resources of the group. For example, after an application is brought offline, you can delete the groups that are used for the application. After you delete a group, the backend of Message Queue for Apache RocketMQ deallocates the resources of the group. The system requires a long period of time to deallocate the resources. We recommend that you do not create a group that uses the same name as a deleted group immediately after you delete the group. If the system fails to delete the specified group, troubleshoot the issue based on the error code.
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
      * > 
      * *   The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   After you delete a group, the consumers in the group immediately stop receiving messages. Exercise caution when you call this operation.
      * You can call this operation to delete a group when you need to deallocate the resources of the group. For example, after an application is brought offline, you can delete the groups that are used for the application. After you delete a group, the backend of Message Queue for Apache RocketMQ deallocates the resources of the group. The system requires a long period of time to deallocate the resources. We recommend that you do not create a group that uses the same name as a deleted group immediately after you delete the group. If the system fails to delete the specified group, troubleshoot the issue based on the error code.
      *
      * @param request OnsGroupDeleteRequest
      * @return OnsGroupDeleteResponse
     */
    public OnsGroupDeleteResponse onsGroupDelete(OnsGroupDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsGroupDeleteWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      *
      * @param request OnsGroupListRequest
      * @return OnsGroupListResponse
     */
    public OnsGroupListResponse onsGroupList(OnsGroupListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsGroupListWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      *
      * @param request OnsGroupSubDetailRequest
      * @return OnsGroupSubDetailResponse
     */
    public OnsGroupSubDetailResponse onsGroupSubDetail(OnsGroupSubDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsGroupSubDetailWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * To send and receive messages, a client must be connected to a Message Queue for Apache RocketMQ instance by using an endpoint. You can call this operation to query the endpoints of the instance.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * To send and receive messages, a client must be connected to a Message Queue for Apache RocketMQ instance by using an endpoint. You can call this operation to query the endpoints of the instance.
      *
      * @param request OnsInstanceBaseInfoRequest
      * @return OnsInstanceBaseInfoResponse
     */
    public OnsInstanceBaseInfoResponse onsInstanceBaseInfo(OnsInstanceBaseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsInstanceBaseInfoWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * An instance is a virtual machine (VM) that can be used to store information about the topics and groups of Message Queue for Apache RocketMQ. You can call this operation when you need to create service resources for the business that you want to launch. Take note of the following points when you call this operation:
      * *   A maximum of eight Message Queue for Apache RocketMQ instances can be deployed in each region.
      * *   This operation can be called to create only a Standard Edition instance. You can use the Message Queue for Apache RocketMQ console to create Standard Edition instances and Enterprise Platinum Edition instances. For information about how to create Message Queue for Apache RocketMQ instances, see [Manage instances](~~200153~~).
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * An instance is a virtual machine (VM) that can be used to store information about the topics and groups of Message Queue for Apache RocketMQ. You can call this operation when you need to create service resources for the business that you want to launch. Take note of the following points when you call this operation:
      * *   A maximum of eight Message Queue for Apache RocketMQ instances can be deployed in each region.
      * *   This operation can be called to create only a Standard Edition instance. You can use the Message Queue for Apache RocketMQ console to create Standard Edition instances and Enterprise Platinum Edition instances. For information about how to create Message Queue for Apache RocketMQ instances, see [Manage instances](~~200153~~).
      *
      * @param request OnsInstanceCreateRequest
      * @return OnsInstanceCreateResponse
     */
    public OnsInstanceCreateResponse onsInstanceCreate(OnsInstanceCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsInstanceCreateWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   You can call this operation when you need to reclaim resources. For example, after you unpublish an application, you can reclaim the resources that were used for the application. An instance can be deleted only when the instance does not contain topics and groups.
      * *   After an instance is deleted, the instance cannot be recovered. Exercise caution when you call this operation.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   You can call this operation when you need to reclaim resources. For example, after you unpublish an application, you can reclaim the resources that were used for the application. An instance can be deleted only when the instance does not contain topics and groups.
      * *   After an instance is deleted, the instance cannot be recovered. Exercise caution when you call this operation.
      *
      * @param request OnsInstanceDeleteRequest
      * @return OnsInstanceDeleteResponse
     */
    public OnsInstanceDeleteResponse onsInstanceDelete(OnsInstanceDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsInstanceDeleteWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      *
      * @param request OnsInstanceInServiceListRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return OnsInstanceInServiceListResponse
     */
    public OnsInstanceInServiceListResponse onsInstanceInServiceListWithOptions(OnsInstanceInServiceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      *
      * @param request OnsInstanceInServiceListRequest
      * @return OnsInstanceInServiceListResponse
     */
    public OnsInstanceInServiceListResponse onsInstanceInServiceList(OnsInstanceInServiceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsInstanceInServiceListWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * A maximum of eight Message Queue for Apache RocketMQ instances can be deployed in each region.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * A maximum of eight Message Queue for Apache RocketMQ instances can be deployed in each region.
      *
      * @param request OnsInstanceUpdateRequest
      * @return OnsInstanceUpdateResponse
     */
    public OnsInstanceUpdateResponse onsInstanceUpdate(OnsInstanceUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsInstanceUpdateWithOptions(request, runtime);
    }

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

    public OnsMessageDetailResponse onsMessageDetail(OnsMessageDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsMessageDetailWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   This operation uses the fuzzy match method to query messages based on a specified message key. The same message key may be used by multiple messages. Therefore, the returned result may contain the information about multiple messages.
      * *   This operation can be used in scenarios in which you cannot obtain the IDs of the messages that you want to query. You can perform the following steps to query the information about messages:
      *     1.  Call this operation to query message IDs.
      *     2.  Call the **OnsMessageGetByMsgId** operation to query the details of a specified message. The OnsMessageGetByMsgId operation uses the exact match method. For more information about the **OnsMessageGetByMsgId** operation, see [OnsMessageGetByMsgId](~~29607~~).
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   This operation uses the fuzzy match method to query messages based on a specified message key. The same message key may be used by multiple messages. Therefore, the returned result may contain the information about multiple messages.
      * *   This operation can be used in scenarios in which you cannot obtain the IDs of the messages that you want to query. You can perform the following steps to query the information about messages:
      *     1.  Call this operation to query message IDs.
      *     2.  Call the **OnsMessageGetByMsgId** operation to query the details of a specified message. The OnsMessageGetByMsgId operation uses the exact match method. For more information about the **OnsMessageGetByMsgId** operation, see [OnsMessageGetByMsgId](~~29607~~).
      *
      * @param request OnsMessageGetByKeyRequest
      * @return OnsMessageGetByKeyResponse
     */
    public OnsMessageGetByKeyResponse onsMessageGetByKey(OnsMessageGetByKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsMessageGetByKeyWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   If a message is not consumed as expected, you can call this operation to query the information about the message for troubleshooting.
      * *   This operation uses the exact match method to query a message based on the message ID. You can obtain the message ID from the SendResult parameter that is returned after the message is sent. You must store the returned information after each message is sent. The queried information about a message includes the point in time when the message was sent, the broker on which the message is stored, and the attributes of the message such as the message key and tag.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   If a message is not consumed as expected, you can call this operation to query the information about the message for troubleshooting.
      * *   This operation uses the exact match method to query a message based on the message ID. You can obtain the message ID from the SendResult parameter that is returned after the message is sent. You must store the returned information after each message is sent. The queried information about a message includes the point in time when the message was sent, the broker on which the message is stored, and the attributes of the message such as the message key and tag.
      *
      * @param request OnsMessageGetByMsgIdRequest
      * @return OnsMessageGetByMsgIdResponse
     */
    public OnsMessageGetByMsgIdResponse onsMessageGetByMsgId(OnsMessageGetByMsgIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsMessageGetByMsgIdWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   If you do not know the message ID or message key of a message that you want to query, you can call this operation to query all messages that are stored in a topic within a specified time range. The results are displayed by page.
      * *   We recommend that you specify a short time range to query messages. If you specify a long time range, a large number of messages are returned. In this case, you cannot find the message that you want to query in an efficient manner. You can perform the following steps to query messages:
      *     1.  Perform a paged query by specifying the topic, start time, end time, and number of entries to return on each page. If the topic contains messages, the information about the messages on the first page, total number of pages, and task ID are returned by default.
      *     2.  Specify the task ID and a page number to call this operation again to query the messages on the specified page. In this query, the BeginTime, EndTime, and PageSize parameters do not take effect. By default, the system uses the values of these parameters that you specified in the request when you created the specified query task.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   If you do not know the message ID or message key of a message that you want to query, you can call this operation to query all messages that are stored in a topic within a specified time range. The results are displayed by page.
      * *   We recommend that you specify a short time range to query messages. If you specify a long time range, a large number of messages are returned. In this case, you cannot find the message that you want to query in an efficient manner. You can perform the following steps to query messages:
      *     1.  Perform a paged query by specifying the topic, start time, end time, and number of entries to return on each page. If the topic contains messages, the information about the messages on the first page, total number of pages, and task ID are returned by default.
      *     2.  Specify the task ID and a page number to call this operation again to query the messages on the specified page. In this query, the BeginTime, EndTime, and PageSize parameters do not take effect. By default, the system uses the values of these parameters that you specified in the request when you created the specified query task.
      *
      * @param request OnsMessagePageQueryByTopicRequest
      * @return OnsMessagePageQueryByTopicResponse
     */
    public OnsMessagePageQueryByTopicResponse onsMessagePageQueryByTopic(OnsMessagePageQueryByTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsMessagePageQueryByTopicWithOptions(request, runtime);
    }

    /**
      * ## Note
      * This operation can be used to check whether messages in a specified topic can be consumed by consumers in a specified consumer group. This operation obtains the body of the message that is specified by the MsgId parameter, re-encapsulates the message body to produce a new message, and then pushes the new message to a specified consumer. The content of the message that is sent to the consumer is the same as the content of the original message. They are not the same message because they use different message IDs.
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
      * ## Note
      * This operation can be used to check whether messages in a specified topic can be consumed by consumers in a specified consumer group. This operation obtains the body of the message that is specified by the MsgId parameter, re-encapsulates the message body to produce a new message, and then pushes the new message to a specified consumer. The content of the message that is sent to the consumer is the same as the content of the original message. They are not the same message because they use different message IDs.
      *
      * @param request OnsMessagePushRequest
      * @return OnsMessagePushResponse
     */
    public OnsMessagePushResponse onsMessagePush(OnsMessagePushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsMessagePushWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   You can call this operation to check whether a specified message is consumed. If the message is not consumed, you can troubleshoot the issue based on the returned information.
      * *   This operation queries information based on the built-in offset mechanism of Message Queue for Apache RocketMQ. In most cases, the results are correct. If you have reset the consumer offset or cleared accumulated messages, the results may not be correct.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   You can call this operation to check whether a specified message is consumed. If the message is not consumed, you can troubleshoot the issue based on the returned information.
      * *   This operation queries information based on the built-in offset mechanism of Message Queue for Apache RocketMQ. In most cases, the results are correct. If you have reset the consumer offset or cleared accumulated messages, the results may not be correct.
      *
      * @param request OnsMessageTraceRequest
      * @return OnsMessageTraceResponse
     */
    public OnsMessageTraceResponse onsMessageTrace(OnsMessageTraceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsMessageTraceWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * When you use an SDK to access and manage a Message Queue for Apache RocketMQ instance, you must sequentially specify the information about two regions. You can query the information about the second region by calling the \\*\\*OnsRegionList\\*\\* operation. You must apply for a public endpoint in the following scenarios:
      * *   Connect your application to Message Queue for Apache RocketMQ: Select the nearest API gateway endpoint based on the region where your application is deployed, and enter the corresponding **region ID**. The **regionId** is used to access Alibaba Cloud API Gateway because Message Queue for Apache RocketMQ instances provide API services by using the OpenAPI Explorer platform, which is also called POP.
      * *   Access a region to manage its resources: Specify a region where you want to manage Message Queue for Apache RocketMQ resources and enter the region ID. You can query the region ID by calling the **OnsRegionList** operation.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * When you use an SDK to access and manage a Message Queue for Apache RocketMQ instance, you must sequentially specify the information about two regions. You can query the information about the second region by calling the \\*\\*OnsRegionList\\*\\* operation. You must apply for a public endpoint in the following scenarios:
      * *   Connect your application to Message Queue for Apache RocketMQ: Select the nearest API gateway endpoint based on the region where your application is deployed, and enter the corresponding **region ID**. The **regionId** is used to access Alibaba Cloud API Gateway because Message Queue for Apache RocketMQ instances provide API services by using the OpenAPI Explorer platform, which is also called POP.
      * *   Access a region to manage its resources: Specify a region where you want to manage Message Queue for Apache RocketMQ resources and enter the region ID. You can query the region ID by calling the **OnsRegionList** operation.
      *
      * @return OnsRegionListResponse
     */
    public OnsRegionListResponse onsRegionList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsRegionListWithOptions(runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * When you want to release a new application or expand your business, you can call this operation to create a topic based on your business requirements.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * When you want to release a new application or expand your business, you can call this operation to create a topic based on your business requirements.
      *
      * @param request OnsTopicCreateRequest
      * @return OnsTopicCreateResponse
     */
    public OnsTopicCreateResponse onsTopicCreate(OnsTopicCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTopicCreateWithOptions(request, runtime);
    }

    /**
      * >  The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur. - After you delete the topic, the publishing and subscription relationships that are constructed based on the topic are cleared. Exercise caution when you call this operation.
      * You can call this operation to delete a topic when you need to reclaim the resources from the topic. For example, after an application is brought offline, you can delete the topics that are used for the application. After you delete a topic, the backend of Message Queue for Apache RocketMQ reclaims the resources from the topic. The system requires a long period of time to reclaim the resources. After you delete a topic, we recommend that you do not create a topic that uses the same name as the deleted topic within a short period of time. If the system fails to delete the specified topic, troubleshoot the issue based on the error code.
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
      * >  The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur. - After you delete the topic, the publishing and subscription relationships that are constructed based on the topic are cleared. Exercise caution when you call this operation.
      * You can call this operation to delete a topic when you need to reclaim the resources from the topic. For example, after an application is brought offline, you can delete the topics that are used for the application. After you delete a topic, the backend of Message Queue for Apache RocketMQ reclaims the resources from the topic. The system requires a long period of time to reclaim the resources. After you delete a topic, we recommend that you do not create a topic that uses the same name as the deleted topic within a short period of time. If the system fails to delete the specified topic, troubleshoot the issue based on the error code.
      *
      * @param request OnsTopicDeleteRequest
      * @return OnsTopicDeleteResponse
     */
    public OnsTopicDeleteResponse onsTopicDelete(OnsTopicDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTopicDeleteWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * This operation returns the basic information about topics and does not return the details of topics.
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

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * This operation returns the basic information about topics and does not return the details of topics.
      *
      * @param request OnsTopicListRequest
      * @return OnsTopicListResponse
     */
    public OnsTopicListResponse onsTopicList(OnsTopicListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTopicListWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can determine the resource usage of a topic based on the information that is returned by this operation. The returned information includes the total number of messages in the topic and the most recent point in time when a message was published to the topic.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can determine the resource usage of a topic based on the information that is returned by this operation. The returned information includes the total number of messages in the topic and the most recent point in time when a message was published to the topic.
      *
      * @param request OnsTopicStatusRequest
      * @return OnsTopicStatusResponse
     */
    public OnsTopicStatusResponse onsTopicStatus(OnsTopicStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTopicStatusWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation to query the online consumer groups that subscribe to a specified topic. If all consumers in a group are offline, the information about the group is not returned.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation to query the online consumer groups that subscribe to a specified topic. If all consumers in a group are offline, the information about the group is not returned.
      *
      * @param request OnsTopicSubDetailRequest
      * @return OnsTopicSubDetailResponse
     */
    public OnsTopicSubDetailResponse onsTopicSubDetail(OnsTopicSubDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTopicSubDetailWithOptions(request, runtime);
    }

    /**
      * @deprecated
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise system risks may occur.
      * You can call this operation to forbid read or write operations on a specific topic.
      *
      * @param request OnsTopicUpdateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return OnsTopicUpdateResponse
     */
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
      * @deprecated
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise system risks may occur.
      * You can call this operation to forbid read or write operations on a specific topic.
      *
      * @param request OnsTopicUpdateRequest
      * @return OnsTopicUpdateResponse
     */
    // Deprecated
    public OnsTopicUpdateResponse onsTopicUpdate(OnsTopicUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTopicUpdateWithOptions(request, runtime);
    }

    /**
      * ## Usage notes
      * *   Before you call this operation to query the details of the trace of a message, you must create a task to query the trace of the message based on the message ID or message key and obtains the task ID. Then, you can call this operation to query the details of the message trace based on the task ID. You can call the [OnsTraceQueryByMsgId](~~59830~~) operation or the [OnsTraceQueryByMsgKey](~~59831~~) operation to create a task to query the trace of the message and obtain the task ID from the **QueryId** response parameter.
      * *   A trace query task is time-consuming. If you call this operation to query the details immediately after you create a trace query task, the results may be empty. In this case, we recommend that you try again later.
      *
      * @param request OnsTraceGetResultRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return OnsTraceGetResultResponse
     */
    public OnsTraceGetResultResponse onsTraceGetResultWithOptions(OnsTraceGetResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queryId)) {
            query.put("QueryId", request.queryId);
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
      * ## Usage notes
      * *   Before you call this operation to query the details of the trace of a message, you must create a task to query the trace of the message based on the message ID or message key and obtains the task ID. Then, you can call this operation to query the details of the message trace based on the task ID. You can call the [OnsTraceQueryByMsgId](~~59830~~) operation or the [OnsTraceQueryByMsgKey](~~59831~~) operation to create a task to query the trace of the message and obtain the task ID from the **QueryId** response parameter.
      * *   A trace query task is time-consuming. If you call this operation to query the details immediately after you create a trace query task, the results may be empty. In this case, we recommend that you try again later.
      *
      * @param request OnsTraceGetResultRequest
      * @return OnsTraceGetResultResponse
     */
    public OnsTraceGetResultResponse onsTraceGetResult(OnsTraceGetResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTraceGetResultWithOptions(request, runtime);
    }

    /**
      * ## Note
      * If you want to query the trace of a message based on the message ID, you can call this operation to create a query task. After you obtain the task ID, you can call the [OnsTraceGetResult](~~59832~~) operation to query the details of the message trace based on the task ID.
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
      * ## Note
      * If you want to query the trace of a message based on the message ID, you can call this operation to create a query task. After you obtain the task ID, you can call the [OnsTraceGetResult](~~59832~~) operation to query the details of the message trace based on the task ID.
      *
      * @param request OnsTraceQueryByMsgIdRequest
      * @return OnsTraceQueryByMsgIdResponse
     */
    public OnsTraceQueryByMsgIdResponse onsTraceQueryByMsgId(OnsTraceQueryByMsgIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTraceQueryByMsgIdWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * If you obtain the key of a message and want to query the trace of the message, you can call this operation to create a query task. After you obtain the task ID, you can call the OnsTraceGetResult operation to query the details of the message trace based on the task ID.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * If you obtain the key of a message and want to query the trace of the message, you can call this operation to create a query task. After you obtain the task ID, you can call the OnsTraceGetResult operation to query the details of the message trace based on the task ID.
      *
      * @param request OnsTraceQueryByMsgKeyRequest
      * @return OnsTraceQueryByMsgKeyResponse
     */
    public OnsTraceQueryByMsgKeyResponse onsTraceQueryByMsgKey(OnsTraceQueryByMsgKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTraceQueryByMsgKeyWithOptions(request, runtime);
    }

    /**
      * ## Note
      * You can call this operation to query the following statistics that are collected in the production environment:
      * *   The number of messages that are consumed during each sampling period
      * *   The transactions per second (TPS) for message consumption during each sampling period
      * >  If your application publishes a small number of messages and does not publish messages at a specific interval, we recommend that you query the number of messages that are consumed during each sampling period because the statistics of TPS may not show a clear change trend.
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
      * ## Note
      * You can call this operation to query the following statistics that are collected in the production environment:
      * *   The number of messages that are consumed during each sampling period
      * *   The transactions per second (TPS) for message consumption during each sampling period
      * >  If your application publishes a small number of messages and does not publish messages at a specific interval, we recommend that you query the number of messages that are consumed during each sampling period because the statistics of TPS may not show a clear change trend.
      *
      * @param request OnsTrendGroupOutputTpsRequest
      * @return OnsTrendGroupOutputTpsResponse
     */
    public OnsTrendGroupOutputTpsResponse onsTrendGroupOutputTps(OnsTrendGroupOutputTpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTrendGroupOutputTpsWithOptions(request, runtime);
    }

    /**
      * ## Note
      * You can call this operation to query the statistics of messages that are published to a specified topic in the production environment. You can obtain the number of messages that are published to the topic or the transactions per second (TPS) for message publishing during each sampling period within a specified time range.
      * >  If your application publishes a small number of messages and does not publish messages at a specific interval, we recommend that you query the number of messages that are published to the topic during each sampling period because the statistics of TPS may not show a clear change trend.
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
      * ## Note
      * You can call this operation to query the statistics of messages that are published to a specified topic in the production environment. You can obtain the number of messages that are published to the topic or the transactions per second (TPS) for message publishing during each sampling period within a specified time range.
      * >  If your application publishes a small number of messages and does not publish messages at a specific interval, we recommend that you query the number of messages that are published to the topic during each sampling period because the statistics of TPS may not show a clear change trend.
      *
      * @param request OnsTrendTopicInputTpsRequest
      * @return OnsTrendTopicInputTpsResponse
     */
    public OnsTrendTopicInputTpsResponse onsTrendTopicInputTps(OnsTrendTopicInputTpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onsTrendTopicInputTpsWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation when you use Message Queue for Apache RocketMQ for the first time. You can use Message Queue for Apache RocketMQ only after this service is activated.
      * The Message Queue for Apache RocketMQ service can be activated only in the China (Hangzhou) region. Service activation is not billed.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation when you use Message Queue for Apache RocketMQ for the first time. You can use Message Queue for Apache RocketMQ only after this service is activated.
      * The Message Queue for Apache RocketMQ service can be activated only in the China (Hangzhou) region. Service activation is not billed.
      *
      * @return OpenOnsServiceResponse
     */
    public OpenOnsServiceResponse openOnsService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openOnsServiceWithOptions(runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation to attach tags to a source. You can use tags to classify resources in Message Queue for Apache RocketMQ. This can help you aggregate and search resources in an efficient manner.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation to attach tags to a source. You can use tags to classify resources in Message Queue for Apache RocketMQ. This can help you aggregate and search resources in an efficient manner.
      *
      * @param request TagResourcesRequest
      * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      *
      * @param request UntagResourcesRequest
      * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}

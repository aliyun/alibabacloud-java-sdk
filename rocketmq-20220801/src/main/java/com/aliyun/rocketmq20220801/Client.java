// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801;

import com.aliyun.tea.*;
import com.aliyun.rocketmq20220801.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("rocketmq", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateConsumerGroupResponse createConsumerGroup(String instanceId, String consumerGroupId, CreateConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConsumerGroupWithOptions(instanceId, consumerGroupId, request, headers, runtime);
    }

    public CreateConsumerGroupResponse createConsumerGroupWithOptions(String instanceId, String consumerGroupId, CreateConsumerGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        consumerGroupId = com.aliyun.openapiutil.Client.getEncodeParam(consumerGroupId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.consumeRetryPolicy))) {
            body.put("consumeRetryPolicy", request.consumeRetryPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryOrderType)) {
            body.put("deliveryOrderType", request.deliveryOrderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConsumerGroup"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + instanceId + "/consumerGroups/" + consumerGroupId + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConsumerGroupResponse());
    }

    public CreateTopicResponse createTopic(String instanceId, String topicName, CreateTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTopicWithOptions(instanceId, topicName, request, headers, runtime);
    }

    public CreateTopicResponse createTopicWithOptions(String instanceId, String topicName, CreateTopicRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        topicName = com.aliyun.openapiutil.Client.getEncodeParam(topicName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            body.put("messageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTopic"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + instanceId + "/topics/" + topicName + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTopicResponse());
    }

    public DeleteConsumerGroupResponse deleteConsumerGroup(String instanceId, String consumerGroupId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConsumerGroupWithOptions(instanceId, consumerGroupId, headers, runtime);
    }

    public DeleteConsumerGroupResponse deleteConsumerGroupWithOptions(String instanceId, String consumerGroupId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        consumerGroupId = com.aliyun.openapiutil.Client.getEncodeParam(consumerGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConsumerGroup"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + instanceId + "/consumerGroups/" + consumerGroupId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConsumerGroupResponse());
    }

    public DeleteInstanceResponse deleteInstance(String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceWithOptions(instanceId, headers, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + instanceId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    public DeleteTopicResponse deleteTopic(String instanceId, String topicName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTopicWithOptions(instanceId, topicName, headers, runtime);
    }

    public DeleteTopicResponse deleteTopicWithOptions(String instanceId, String topicName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        topicName = com.aliyun.openapiutil.Client.getEncodeParam(topicName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTopic"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + instanceId + "/topics/" + topicName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTopicResponse());
    }

    public GetConsumerGroupResponse getConsumerGroup(String instanceId, String consumerGroupId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConsumerGroupWithOptions(instanceId, consumerGroupId, headers, runtime);
    }

    public GetConsumerGroupResponse getConsumerGroupWithOptions(String instanceId, String consumerGroupId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        consumerGroupId = com.aliyun.openapiutil.Client.getEncodeParam(consumerGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConsumerGroup"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + instanceId + "/consumerGroups/" + consumerGroupId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConsumerGroupResponse());
    }

    public GetInstanceResponse getInstance(String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceWithOptions(instanceId, headers, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + instanceId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    public GetTopicResponse getTopic(String instanceId, String topicName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTopicWithOptions(instanceId, topicName, headers, runtime);
    }

    public GetTopicResponse getTopicWithOptions(String instanceId, String topicName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        topicName = com.aliyun.openapiutil.Client.getEncodeParam(topicName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTopic"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + instanceId + "/topics/" + topicName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTopicResponse());
    }

    public ListConsumerGroupsResponse listConsumerGroups(String instanceId, ListConsumerGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConsumerGroupsWithOptions(instanceId, request, headers, runtime);
    }

    public ListConsumerGroupsResponse listConsumerGroupsWithOptions(String instanceId, ListConsumerGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConsumerGroups"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + instanceId + "/consumerGroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConsumerGroupsResponse());
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstancesWithOptions(request, headers, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    public ListTopicsResponse listTopics(String instanceId, ListTopicsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTopicsWithOptions(instanceId, request, headers, runtime);
    }

    public ListTopicsResponse listTopicsWithOptions(String instanceId, ListTopicsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTopics"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + instanceId + "/topics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTopicsResponse());
    }

    public UpdateConsumerGroupResponse updateConsumerGroup(String instanceId, String consumerGroupId, UpdateConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConsumerGroupWithOptions(instanceId, consumerGroupId, request, headers, runtime);
    }

    public UpdateConsumerGroupResponse updateConsumerGroupWithOptions(String instanceId, String consumerGroupId, UpdateConsumerGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        consumerGroupId = com.aliyun.openapiutil.Client.getEncodeParam(consumerGroupId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.consumeRetryPolicy))) {
            body.put("consumeRetryPolicy", request.consumeRetryPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryOrderType)) {
            body.put("deliveryOrderType", request.deliveryOrderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConsumerGroup"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + instanceId + "/consumerGroups/" + consumerGroupId + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConsumerGroupResponse());
    }

    public UpdateInstanceResponse updateInstance(String instanceId, UpdateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceWithOptions(instanceId, request, headers, runtime);
    }

    public UpdateInstanceResponse updateInstanceWithOptions(String instanceId, UpdateInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.extConfig))) {
            body.put("extConfig", request.extConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("instanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.networkInfo))) {
            body.put("networkInfo", request.networkInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + instanceId + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }

    public UpdateTopicResponse updateTopic(String instanceId, String topicName, UpdateTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTopicWithOptions(instanceId, topicName, request, headers, runtime);
    }

    public UpdateTopicResponse updateTopicWithOptions(String instanceId, String topicName, UpdateTopicRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        topicName = com.aliyun.openapiutil.Client.getEncodeParam(topicName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTopic"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + instanceId + "/topics/" + topicName + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTopicResponse());
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801;

import com.aliyun.tea.*;
import com.aliyun.rocketmq20220801.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * <b>summary</b> : 
     * <p>添加容灾计划条目</p>
     * 
     * @param request AddDisasterRecoveryItemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDisasterRecoveryItemResponse
     */
    public AddDisasterRecoveryItemResponse addDisasterRecoveryItemWithOptions(String planId, AddDisasterRecoveryItemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.topics)) {
            body.put("topics", request.topics);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDisasterRecoveryItem"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/disaster_recovery/" + com.aliyun.openapiutil.Client.getEncodeParam(planId) + "/items"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDisasterRecoveryItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加容灾计划条目</p>
     * 
     * @param request AddDisasterRecoveryItemRequest
     * @return AddDisasterRecoveryItemResponse
     */
    public AddDisasterRecoveryItemResponse addDisasterRecoveryItem(String planId, AddDisasterRecoveryItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDisasterRecoveryItemWithOptions(planId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which a ApsaraMQ for RocketMQ instance belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/resourceGroup/change"),
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
     * <p>Changes the resource group to which a ApsaraMQ for RocketMQ instance belongs.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a consumer group.</p>
     * 
     * @param request CreateConsumerGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConsumerGroupResponse
     */
    public CreateConsumerGroupResponse createConsumerGroupWithOptions(String instanceId, String consumerGroupId, CreateConsumerGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumeRetryPolicy)) {
            body.put("consumeRetryPolicy", request.consumeRetryPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryOrderType)) {
            body.put("deliveryOrderType", request.deliveryOrderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxReceiveTps)) {
            body.put("maxReceiveTps", request.maxReceiveTps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConsumerGroup"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/consumerGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerGroupId) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConsumerGroupResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a consumer group.</p>
     * 
     * @param request CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     */
    public CreateConsumerGroupResponse createConsumerGroup(String instanceId, String consumerGroupId, CreateConsumerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConsumerGroupWithOptions(instanceId, consumerGroupId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an ApsaraMQ for RocketMQ 5.x instance.</p>
     * 
     * @param request CreateInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("autoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewPeriod)) {
            body.put("autoRenewPeriod", request.autoRenewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            body.put("commodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("instanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInfo)) {
            body.put("networkInfo", request.networkInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            body.put("paymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            body.put("periodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productInfo)) {
            body.put("productInfo", request.productInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seriesCode)) {
            body.put("seriesCode", request.seriesCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("serviceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSeriesCode)) {
            body.put("subSeriesCode", request.subSeriesCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an ApsaraMQ for RocketMQ 5.x instance.</p>
     * 
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an account that is used to access an instance.</p>
     * 
     * @param request CreateInstanceAccountRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceAccountResponse
     */
    public CreateInstanceAccountResponse createInstanceAccountWithOptions(String instanceId, CreateInstanceAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceAccount"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/accounts"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an account that is used to access an instance.</p>
     * 
     * @param request CreateInstanceAccountRequest
     * @return CreateInstanceAccountResponse
     */
    public CreateInstanceAccountResponse createInstanceAccount(String instanceId, CreateInstanceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceAccountWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access control list (ACL) in a specific instance.</p>
     * 
     * @param request CreateInstanceAclRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceAclResponse
     */
    public CreateInstanceAclResponse createInstanceAclWithOptions(String instanceId, String username, CreateInstanceAclRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actions)) {
            body.put("actions", request.actions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decision)) {
            body.put("decision", request.decision);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipWhitelists)) {
            body.put("ipWhitelists", request.ipWhitelists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            body.put("resourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceAcl"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/acl/account/" + com.aliyun.openapiutil.Client.getEncodeParam(username) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access control list (ACL) in a specific instance.</p>
     * 
     * @param request CreateInstanceAclRequest
     * @return CreateInstanceAclResponse
     */
    public CreateInstanceAclResponse createInstanceAcl(String instanceId, String username, CreateInstanceAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceAclWithOptions(instanceId, username, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an IP address whitelist.</p>
     * 
     * @param request CreateInstanceIpWhitelistRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceIpWhitelistResponse
     */
    public CreateInstanceIpWhitelistResponse createInstanceIpWhitelistWithOptions(String instanceId, CreateInstanceIpWhitelistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipWhitelists)) {
            body.put("ipWhitelists", request.ipWhitelists);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceIpWhitelist"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ip/whitelist"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceIpWhitelistResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an IP address whitelist.</p>
     * 
     * @param request CreateInstanceIpWhitelistRequest
     * @return CreateInstanceIpWhitelistResponse
     */
    public CreateInstanceIpWhitelistResponse createInstanceIpWhitelist(String instanceId, CreateInstanceIpWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceIpWhitelistWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a topic.</p>
     * 
     * @param request CreateTopicRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTopicResponse
     */
    public CreateTopicResponse createTopicWithOptions(String instanceId, String topicName, CreateTopicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxSendTps)) {
            body.put("maxSendTps", request.maxSendTps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            body.put("messageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTopic"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/topics/" + com.aliyun.openapiutil.Client.getEncodeParam(topicName) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTopicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a topic.</p>
     * 
     * @param request CreateTopicRequest
     * @return CreateTopicResponse
     */
    public CreateTopicResponse createTopic(String instanceId, String topicName, CreateTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTopicWithOptions(instanceId, topicName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * After you delete a consumer group, the consumer client associated with the consumer group cannot consume messages. Exercise caution when you call this operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified consumer group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConsumerGroupResponse
     */
    public DeleteConsumerGroupResponse deleteConsumerGroupWithOptions(String instanceId, String consumerGroupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConsumerGroup"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/consumerGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerGroupId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConsumerGroupResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * After you delete a consumer group, the consumer client associated with the consumer group cannot consume messages. Exercise caution when you call this operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified consumer group.</p>
     * @return DeleteConsumerGroupResponse
     */
    public DeleteConsumerGroupResponse deleteConsumerGroup(String instanceId, String consumerGroupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConsumerGroupWithOptions(instanceId, consumerGroupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the subscriptions of a consumer group.</p>
     * 
     * @param request DeleteConsumerGroupSubscriptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConsumerGroupSubscriptionResponse
     */
    public DeleteConsumerGroupSubscriptionResponse deleteConsumerGroupSubscriptionWithOptions(String instanceId, String consumerGroupId, DeleteConsumerGroupSubscriptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterExpression)) {
            query.put("filterExpression", request.filterExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterType)) {
            query.put("filterType", request.filterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicName)) {
            query.put("topicName", request.topicName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConsumerGroupSubscription"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/consumerGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerGroupId) + "/subscriptions"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConsumerGroupSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the subscriptions of a consumer group.</p>
     * 
     * @param request DeleteConsumerGroupSubscriptionRequest
     * @return DeleteConsumerGroupSubscriptionResponse
     */
    public DeleteConsumerGroupSubscriptionResponse deleteConsumerGroupSubscription(String instanceId, String consumerGroupId, DeleteConsumerGroupSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConsumerGroupSubscriptionWithOptions(instanceId, consumerGroupId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>After an instance is deleted, the instance cannot be restored. Exercise caution when you call this operation.</li>
     * <li>This operation is used to delete a pay-as-you-go instance. A subscription instance is automatically released after it expires. You do not need to manually delete a subscription instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a ApsaraMQ for RocketMQ instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>After an instance is deleted, the instance cannot be restored. Exercise caution when you call this operation.</li>
     * <li>This operation is used to delete a pay-as-you-go instance. A subscription instance is automatically released after it expires. You do not need to manually delete a subscription instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a ApsaraMQ for RocketMQ instance.</p>
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete access control ACL user</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceAccountResponse
     */
    public DeleteInstanceAccountResponse deleteInstanceAccountWithOptions(String instanceId, String username, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstanceAccount"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/accounts/" + com.aliyun.openapiutil.Client.getEncodeParam(username) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete access control ACL user</p>
     * @return DeleteInstanceAccountResponse
     */
    public DeleteInstanceAccountResponse deleteInstanceAccount(String instanceId, String username) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceAccountWithOptions(instanceId, username, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the permissions of a specific account of an instance.</p>
     * 
     * @param request DeleteInstanceAclRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceAclResponse
     */
    public DeleteInstanceAclResponse deleteInstanceAclWithOptions(String instanceId, String username, DeleteInstanceAclRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("resourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstanceAcl"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/acl/account/" + com.aliyun.openapiutil.Client.getEncodeParam(username) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the permissions of a specific account of an instance.</p>
     * 
     * @param request DeleteInstanceAclRequest
     * @return DeleteInstanceAclResponse
     */
    public DeleteInstanceAclResponse deleteInstanceAcl(String instanceId, String username, DeleteInstanceAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceAclWithOptions(instanceId, username, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specific IP address whitelist from an instance.</p>
     * 
     * @param request DeleteInstanceIpWhitelistRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceIpWhitelistResponse
     */
    public DeleteInstanceIpWhitelistResponse deleteInstanceIpWhitelistWithOptions(String instanceId, DeleteInstanceIpWhitelistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipWhitelist)) {
            query.put("ipWhitelist", request.ipWhitelist);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstanceIpWhitelist"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ip/whitelist"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceIpWhitelistResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specific IP address whitelist from an instance.</p>
     * 
     * @param request DeleteInstanceIpWhitelistRequest
     * @return DeleteInstanceIpWhitelistResponse
     */
    public DeleteInstanceIpWhitelistResponse deleteInstanceIpWhitelist(String instanceId, DeleteInstanceIpWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceIpWhitelistWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you delete the topic, the publishing and subscription relationships that are established based on the topic are cleared. Exercise caution when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified topic.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTopicResponse
     */
    public DeleteTopicResponse deleteTopicWithOptions(String instanceId, String topicName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTopic"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/topics/" + com.aliyun.openapiutil.Client.getEncodeParam(topicName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTopicResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you delete the topic, the publishing and subscription relationships that are established based on the topic are cleared. Exercise caution when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified topic.</p>
     * @return DeleteTopicResponse
     */
    public DeleteTopicResponse deleteTopic(String instanceId, String topicName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTopicWithOptions(instanceId, topicName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified consumer group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConsumerGroupResponse
     */
    public GetConsumerGroupResponse getConsumerGroupWithOptions(String instanceId, String consumerGroupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConsumerGroup"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/consumerGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerGroupId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConsumerGroupResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified consumer group.</p>
     * @return GetConsumerGroupResponse
     */
    public GetConsumerGroupResponse getConsumerGroup(String instanceId, String consumerGroupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConsumerGroupWithOptions(instanceId, consumerGroupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Consumer Group Backlog Information</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConsumerGroupLagResponse
     */
    public GetConsumerGroupLagResponse getConsumerGroupLagWithOptions(String instanceId, String consumerGroupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConsumerGroupLag"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/consumerGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerGroupId) + "/lag"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConsumerGroupLagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Consumer Group Backlog Information</p>
     * @return GetConsumerGroupLagResponse
     */
    public GetConsumerGroupLagResponse getConsumerGroupLag(String instanceId, String consumerGroupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConsumerGroupLagWithOptions(instanceId, consumerGroupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the subscriptions of a consumer group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConsumerGroupSubscriptionResponse
     */
    public GetConsumerGroupSubscriptionResponse getConsumerGroupSubscriptionWithOptions(String instanceId, String consumerGroupId, String topicName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConsumerGroupSubscription"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/consumerGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerGroupId) + "/subscriptions/" + com.aliyun.openapiutil.Client.getEncodeParam(topicName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConsumerGroupSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the subscriptions of a consumer group.</p>
     * @return GetConsumerGroupSubscriptionResponse
     */
    public GetConsumerGroupSubscriptionResponse getConsumerGroupSubscription(String instanceId, String consumerGroupId, String topicName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConsumerGroupSubscriptionWithOptions(instanceId, consumerGroupId, topicName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the stack information about a consumer.</p>
     * 
     * @param request GetConsumerStackRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConsumerStackResponse
     */
    public GetConsumerStackResponse getConsumerStackWithOptions(String instanceId, String consumerGroupId, GetConsumerStackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("clientId", request.clientId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConsumerStack"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/consumerGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerGroupId) + "/stack"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConsumerStackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the stack information about a consumer.</p>
     * 
     * @param request GetConsumerStackRequest
     * @return GetConsumerStackResponse
     */
    public GetConsumerStackResponse getConsumerStack(String instanceId, String consumerGroupId, GetConsumerStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConsumerStackWithOptions(instanceId, consumerGroupId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed information about an instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed information about an instance.</p>
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the account used to access a specific instance.</p>
     * 
     * @param request GetInstanceAccountRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceAccountResponse
     */
    public GetInstanceAccountResponse getInstanceAccountWithOptions(String instanceId, GetInstanceAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceAccount"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/account"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the account used to access a specific instance.</p>
     * 
     * @param request GetInstanceAccountRequest
     * @return GetInstanceAccountResponse
     */
    public GetInstanceAccountResponse getInstanceAccount(String instanceId, GetInstanceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceAccountWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a specific message.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMessageDetailResponse
     */
    public GetMessageDetailResponse getMessageDetailWithOptions(String instanceId, String topicName, String messageId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMessageDetail"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/topics/" + com.aliyun.openapiutil.Client.getEncodeParam(topicName) + "/messages/" + com.aliyun.openapiutil.Client.getEncodeParam(messageId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMessageDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a specific message.</p>
     * @return GetMessageDetailResponse
     */
    public GetMessageDetailResponse getMessageDetail(String instanceId, String topicName, String messageId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMessageDetailWithOptions(instanceId, topicName, messageId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified topic.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTopicResponse
     */
    public GetTopicResponse getTopicWithOptions(String instanceId, String topicName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTopic"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/topics/" + com.aliyun.openapiutil.Client.getEncodeParam(topicName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTopicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified topic.</p>
     * @return GetTopicResponse
     */
    public GetTopicResponse getTopic(String instanceId, String topicName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTopicWithOptions(instanceId, topicName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the trace of a specific message in a specific topic.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTraceResponse
     */
    public GetTraceResponse getTraceWithOptions(String instanceId, String topicName, String messageId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrace"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/topics/" + com.aliyun.openapiutil.Client.getEncodeParam(topicName) + "/traces/" + com.aliyun.openapiutil.Client.getEncodeParam(messageId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTraceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the trace of a specific message in a specific topic.</p>
     * @return GetTraceResponse
     */
    public GetTraceResponse getTrace(String instanceId, String topicName, String messageId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTraceWithOptions(instanceId, topicName, messageId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询支持的可用区</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAvailableZonesResponse
     */
    public ListAvailableZonesResponse listAvailableZonesWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAvailableZones"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/zones"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvailableZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询支持的可用区</p>
     * @return ListAvailableZonesResponse
     */
    public ListAvailableZonesResponse listAvailableZones() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAvailableZonesWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询消费者客户端连接信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConsumerConnectionsResponse
     */
    public ListConsumerConnectionsResponse listConsumerConnectionsWithOptions(String instanceId, String consumerGroupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConsumerConnections"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/consumerGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerGroupId) + "/connections"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConsumerConnectionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询消费者客户端连接信息</p>
     * @return ListConsumerConnectionsResponse
     */
    public ListConsumerConnectionsResponse listConsumerConnections(String instanceId, String consumerGroupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConsumerConnectionsWithOptions(instanceId, consumerGroupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the subscriptions of a specific consumer group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConsumerGroupSubscriptionsResponse
     */
    public ListConsumerGroupSubscriptionsResponse listConsumerGroupSubscriptionsWithOptions(String instanceId, String consumerGroupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConsumerGroupSubscriptions"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/consumerGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerGroupId) + "/subscriptions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConsumerGroupSubscriptionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the subscriptions of a specific consumer group.</p>
     * @return ListConsumerGroupSubscriptionsResponse
     */
    public ListConsumerGroupSubscriptionsResponse listConsumerGroupSubscriptions(String instanceId, String consumerGroupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConsumerGroupSubscriptionsWithOptions(instanceId, consumerGroupId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the consumer groups in a specified instance.</p>
     * 
     * @param request ListConsumerGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConsumerGroupsResponse
     */
    public ListConsumerGroupsResponse listConsumerGroupsWithOptions(String instanceId, ListConsumerGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConsumerGroups"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/consumerGroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConsumerGroupsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the consumer groups in a specified instance.</p>
     * 
     * @param request ListConsumerGroupsRequest
     * @return ListConsumerGroupsResponse
     */
    public ListConsumerGroupsResponse listConsumerGroups(String instanceId, ListConsumerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConsumerGroupsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the accounts that are used to access a specific instance.</p>
     * 
     * @param request ListInstanceAccountRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceAccountResponse
     */
    public ListInstanceAccountResponse listInstanceAccountWithOptions(String instanceId, ListInstanceAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountStatus)) {
            query.put("accountStatus", request.accountStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("accountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceAccount"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/accounts"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the accounts that are used to access a specific instance.</p>
     * 
     * @param request ListInstanceAccountRequest
     * @return ListInstanceAccountResponse
     */
    public ListInstanceAccountResponse listInstanceAccount(String instanceId, ListInstanceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceAccountWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the access control lists (ACLs) of an instance.</p>
     * 
     * @param request ListInstanceAclRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceAclResponse
     */
    public ListInstanceAclResponse listInstanceAclWithOptions(String instanceId, ListInstanceAclRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceAcl"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/acl"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the access control lists (ACLs) of an instance.</p>
     * 
     * @param request ListInstanceAclRequest
     * @return ListInstanceAclResponse
     */
    public ListInstanceAclResponse listInstanceAcl(String instanceId, ListInstanceAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceAclWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IP address whitelists of an instance.</p>
     * 
     * @param request ListInstanceIpWhitelistRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceIpWhitelistResponse
     */
    public ListInstanceIpWhitelistResponse listInstanceIpWhitelistWithOptions(String instanceId, ListInstanceIpWhitelistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipWhitelist)) {
            query.put("ipWhitelist", request.ipWhitelist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceIpWhitelist"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ip/whitelist"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceIpWhitelistResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IP address whitelists of an instance.</p>
     * 
     * @param request ListInstanceIpWhitelistRequest
     * @return ListInstanceIpWhitelistResponse
     */
    public ListInstanceIpWhitelistResponse listInstanceIpWhitelist(String instanceId, ListInstanceIpWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceIpWhitelistWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries all ApsaraMQ for RocketMQ instances in a specific region.</p>
     * 
     * @param tmpReq ListInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListInstancesShrinkRequest request = new ListInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.seriesCodes)) {
            request.seriesCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.seriesCodes, "seriesCodes", "simple");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.seriesCodesShrink)) {
            query.put("seriesCodes", request.seriesCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSecretKey)) {
            query.put("storageSecretKey", request.storageSecretKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries all ApsaraMQ for RocketMQ instances in a specific region.</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstancesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of messages.</p>
     * 
     * @param request ListMessagesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMessagesResponse
     */
    public ListMessagesResponse listMessagesWithOptions(String instanceId, String topicName, ListMessagesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("messageId", request.messageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageKey)) {
            query.put("messageKey", request.messageKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scrollId)) {
            query.put("scrollId", request.scrollId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMessages"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/topics/" + com.aliyun.openapiutil.Client.getEncodeParam(topicName) + "/messages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMessagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of messages.</p>
     * 
     * @param request ListMessagesRequest
     * @return ListMessagesResponse
     */
    public ListMessagesResponse listMessages(String instanceId, String topicName, ListMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMessagesWithOptions(instanceId, topicName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries regions in which ApsaraMQ for RocketMQ is available.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegionsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/regions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries regions in which ApsaraMQ for RocketMQ is available.</p>
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegionsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query visible resource tag relationships</p>
     * 
     * @param request ListTagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/resourceTag/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query visible resource tag relationships</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the subscriptions of a specific topic.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTopicSubscriptionsResponse
     */
    public ListTopicSubscriptionsResponse listTopicSubscriptionsWithOptions(String instanceId, String topicName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTopicSubscriptions"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/topics/" + com.aliyun.openapiutil.Client.getEncodeParam(topicName) + "/subscriptions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTopicSubscriptionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the subscriptions of a specific topic.</p>
     * @return ListTopicSubscriptionsResponse
     */
    public ListTopicSubscriptionsResponse listTopicSubscriptions(String instanceId, String topicName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTopicSubscriptionsWithOptions(instanceId, topicName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the topics in a specified instance.</p>
     * 
     * @param tmpReq ListTopicsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTopicsResponse
     */
    public ListTopicsResponse listTopicsWithOptions(String instanceId, ListTopicsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTopicsShrinkRequest request = new ListTopicsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.messageTypes)) {
            request.messageTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.messageTypes, "messageTypes", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageTypesShrink)) {
            query.put("messageTypes", request.messageTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTopics"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/topics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTopicsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the topics in a specified instance.</p>
     * 
     * @param request ListTopicsRequest
     * @return ListTopicsResponse
     */
    public ListTopicsResponse listTopics(String instanceId, ListTopicsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTopicsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the message traces of a specific topic.</p>
     * 
     * @param request ListTracesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTracesResponse
     */
    public ListTracesResponse listTracesWithOptions(String instanceId, String topicName, ListTracesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("messageId", request.messageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageKey)) {
            query.put("messageKey", request.messageKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("queryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTraces"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/topics/" + com.aliyun.openapiutil.Client.getEncodeParam(topicName) + "/traces"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTracesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the message traces of a specific topic.</p>
     * 
     * @param request ListTracesRequest
     * @return ListTracesResponse
     */
    public ListTracesResponse listTraces(String instanceId, String topicName, ListTracesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTracesWithOptions(instanceId, topicName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the consumer offset of a consumer group.</p>
     * 
     * @param request ResetConsumeOffsetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetConsumeOffsetResponse
     */
    public ResetConsumeOffsetResponse resetConsumeOffsetWithOptions(String instanceId, String consumerGroupId, String topicName, ResetConsumeOffsetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resetTime)) {
            body.put("resetTime", request.resetTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resetType)) {
            body.put("resetType", request.resetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetConsumeOffset"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/consumerGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerGroupId) + "/consumeOffsets/" + com.aliyun.openapiutil.Client.getEncodeParam(topicName) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetConsumeOffsetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the consumer offset of a consumer group.</p>
     * 
     * @param request ResetConsumeOffsetRequest
     * @return ResetConsumeOffsetResponse
     */
    public ResetConsumeOffsetResponse resetConsumeOffset(String instanceId, String consumerGroupId, String topicName, ResetConsumeOffsetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetConsumeOffsetWithOptions(instanceId, consumerGroupId, topicName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates resource tags.</p>
     * 
     * @param request TagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/resourceTag/create"),
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
     * <p>Creates resource tags.</p>
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
     * <p>Removes tags from resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("all", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("tagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/resourceTag/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the basic information about and the consumption retry policy of a consumer group.</p>
     * 
     * @param request UpdateConsumerGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConsumerGroupResponse
     */
    public UpdateConsumerGroupResponse updateConsumerGroupWithOptions(String instanceId, String consumerGroupId, UpdateConsumerGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumeRetryPolicy)) {
            body.put("consumeRetryPolicy", request.consumeRetryPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryOrderType)) {
            body.put("deliveryOrderType", request.deliveryOrderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxReceiveTps)) {
            body.put("maxReceiveTps", request.maxReceiveTps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConsumerGroup"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/consumerGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerGroupId) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConsumerGroupResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the basic information about and the consumption retry policy of a consumer group.</p>
     * 
     * @param request UpdateConsumerGroupRequest
     * @return UpdateConsumerGroupResponse
     */
    public UpdateConsumerGroupResponse updateConsumerGroup(String instanceId, String consumerGroupId, UpdateConsumerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConsumerGroupWithOptions(instanceId, consumerGroupId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the basic information and specifications of an ApsaraMQ for RocketMQ instance.</p>
     * 
     * @param request UpdateInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstanceWithOptions(String instanceId, UpdateInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclInfo)) {
            body.put("aclInfo", request.aclInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("instanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInfo)) {
            body.put("networkInfo", request.networkInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productInfo)) {
            body.put("productInfo", request.productInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the basic information and specifications of an ApsaraMQ for RocketMQ instance.</p>
     * 
     * @param request UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(String instanceId, UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a specific account in a specific instance.</p>
     * 
     * @param request UpdateInstanceAccountRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceAccountResponse
     */
    public UpdateInstanceAccountResponse updateInstanceAccountWithOptions(String instanceId, String username, UpdateInstanceAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountStatus)) {
            query.put("accountStatus", request.accountStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("password", request.password);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceAccount"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/accounts/" + com.aliyun.openapiutil.Client.getEncodeParam(username) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a specific account in a specific instance.</p>
     * 
     * @param request UpdateInstanceAccountRequest
     * @return UpdateInstanceAccountResponse
     */
    public UpdateInstanceAccountResponse updateInstanceAccount(String instanceId, String username, UpdateInstanceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceAccountWithOptions(instanceId, username, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the permissions on the resources of a specific instance for a specific user.</p>
     * 
     * @param request UpdateInstanceAclRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceAclResponse
     */
    public UpdateInstanceAclResponse updateInstanceAclWithOptions(String instanceId, String username, UpdateInstanceAclRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actions)) {
            body.put("actions", request.actions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decision)) {
            body.put("decision", request.decision);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipWhitelists)) {
            body.put("ipWhitelists", request.ipWhitelists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            body.put("resourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceAcl"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/acl/account/" + com.aliyun.openapiutil.Client.getEncodeParam(username) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the permissions on the resources of a specific instance for a specific user.</p>
     * 
     * @param request UpdateInstanceAclRequest
     * @return UpdateInstanceAclResponse
     */
    public UpdateInstanceAclResponse updateInstanceAcl(String instanceId, String username, UpdateInstanceAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceAclWithOptions(instanceId, username, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about a topic.</p>
     * 
     * @param request UpdateTopicRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTopicResponse
     */
    public UpdateTopicResponse updateTopicWithOptions(String instanceId, String topicName, UpdateTopicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxSendTps)) {
            body.put("maxSendTps", request.maxSendTps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTopic"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/topics/" + com.aliyun.openapiutil.Client.getEncodeParam(topicName) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTopicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about a topic.</p>
     * 
     * @param request UpdateTopicRequest
     * @return UpdateTopicResponse
     */
    public UpdateTopicResponse updateTopic(String instanceId, String topicName, UpdateTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTopicWithOptions(instanceId, topicName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies the consumption status of a message in a specific topic on a specific instance.</p>
     * 
     * @param request VerifyConsumeMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyConsumeMessageResponse
     */
    public VerifyConsumeMessageResponse verifyConsumeMessageWithOptions(String instanceId, String topicName, String messageId, VerifyConsumeMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupId)) {
            query.put("consumerGroupId", request.consumerGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyConsumeMessage"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/topics/" + com.aliyun.openapiutil.Client.getEncodeParam(topicName) + "/messages/" + com.aliyun.openapiutil.Client.getEncodeParam(messageId) + "/action/verifyConsume"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyConsumeMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies the consumption status of a message in a specific topic on a specific instance.</p>
     * 
     * @param request VerifyConsumeMessageRequest
     * @return VerifyConsumeMessageResponse
     */
    public VerifyConsumeMessageResponse verifyConsumeMessage(String instanceId, String topicName, String messageId, VerifyConsumeMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyConsumeMessageWithOptions(instanceId, topicName, messageId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies the message sending feature of a specific topic on a specific instance.</p>
     * 
     * @param request VerifySendMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifySendMessageResponse
     */
    public VerifySendMessageResponse verifySendMessageWithOptions(String instanceId, String topicName, VerifySendMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            body.put("message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageKey)) {
            body.put("messageKey", request.messageKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageTag)) {
            body.put("messageTag", request.messageTag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifySendMessage"),
            new TeaPair("version", "2022-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/topics/" + com.aliyun.openapiutil.Client.getEncodeParam(topicName) + "/messages"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifySendMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies the message sending feature of a specific topic on a specific instance.</p>
     * 
     * @param request VerifySendMessageRequest
     * @return VerifySendMessageResponse
     */
    public VerifySendMessageResponse verifySendMessage(String instanceId, String topicName, VerifySendMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifySendMessageWithOptions(instanceId, topicName, request, headers, runtime);
    }
}
